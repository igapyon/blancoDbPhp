/*
 * blanco Framework
 * Copyright (C) 2004-2006 IGA Tosiki
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.db.expander.query;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import blanco.cg.BlancoCgObjectFactory;
import blanco.cg.valueobject.BlancoCgClass;
import blanco.cg.valueobject.BlancoCgMethod;
import blanco.cg.valueobject.BlancoCgSourceFile;
import blanco.commons.util.BlancoJavaSourceUtil;
import blanco.commons.util.BlancoStringUtil;
import blanco.db.common.expander.BlancoDbAbstractMethod;
import blanco.db.common.valueobject.BlancoDbSetting;
import blanco.db.common.valueobject.BlancoDbSqlInfoStructure;

/**
 * �ʂ̃��\�b�h��W�J���邽�߂̃N���X�B
 */
public class GetQueryMethodPhp extends BlancoDbAbstractMethod {
    public GetQueryMethodPhp(final BlancoDbSetting argDbSetting,
            final BlancoDbSqlInfoStructure argSqlInfo,
            final BlancoCgObjectFactory argCgFactory,
            final BlancoCgSourceFile argCgSourceFile,
            final BlancoCgClass argCgClass) {
        super(argDbSetting, argSqlInfo, argCgFactory, argCgSourceFile,
                argCgClass);
    }

    public void expand() {
        final BlancoCgMethod cgMethod = fCgFactory.createMethod("getQuery",
                "�N�G���̎擾���\�b�h");
        fCgClass.getMethodList().add(cgMethod);

        cgMethod.setReturn(fCgFactory.createReturn("string", "���ۂɎ��s�����SQL��"));

        cgMethod.getLangDoc().getDescriptionList().add("���ۂɎ��s����SQL����߂��܂��B");

        final List listLine = cgMethod.getLineList();

        final String escapedQuery = BlancoJavaSourceUtil
                .escapeStringAsJavaSource(fSqlInfo.getQuery());

        // �N�G���� #�p�����[�^��:�ւ̕ϊ�
        final String actualSql = getNaturalSqlStringForPhp(escapedQuery);

        // SQL�������s�̕�����ŕ��f���܂��B
        final String[] sqlLines = splitString(actualSql, "\\n");

        for (int index = 0; index < sqlLines.length; index++) {
            String line = sqlLines[index];
            if (line.endsWith("\\n")) {
                line = line.substring(0, line.length() - 2) + " ";
            }

            if (index == 0) {
                listLine.add("$buf = '" + line + "';");
            } else {
                listLine.add("$buf = $buf . '" + line + "';");
            }
        }

        listLine.add("return $buf;");
    }

    /**
     * �^����ꂽ��������w��̕�����������ĕ������܂��B
     * 
     * ����API�ł́A���͕����񂩂�����Ď����镶���͂���܂���B<br>
     * ���ʊ֐����̌��API
     * 
     * @param originalString
     * @param delimiterString
     * @return
     */
    public static String[] splitString(final String originalString,
            final String delimiterString) {
        final ArrayList result = new ArrayList();
        String nextString = originalString;

        for (;;) {
            if (nextString.length() == 0) {
                break;
            }
            final int find = nextString.indexOf(delimiterString);
            if (find >= 0
                    && find + delimiterString.length() <= nextString.length()) {
                final String item = nextString.substring(0, find
                        + delimiterString.length());
                result.add(item);
                nextString = nextString.substring(find
                        + delimiterString.length());
            } else {
                result.add(nextString);
                break;
            }
        }

        final String[] resultStringArray = new String[result.size()];
        result.toArray(resultStringArray);
        return resultStringArray;
    }

    /**
     * Iterator�Ɏ��ۂɒ��荞�܂��i�`��������SQL��
     * 
     * PDO�ł� �u:�u�����́v�ƂȂ�܂��B
     * 
     * @return
     */
    public static String getNaturalSqlStringForPhp(
            final String originalSqlQueryString) {
        final String SZ_PARAMETER_FOR_SQL_INPUT_PARAMETER = "#[a-zA-Z0-9.\\-_\\P{InBasicLatin}]*\\b|#.*$";

        final Matcher matcher = Pattern.compile(
                SZ_PARAMETER_FOR_SQL_INPUT_PARAMETER).matcher(
                originalSqlQueryString);
        String resultSql = originalSqlQueryString;
        for (int index = 1; matcher.find(); index++) {
            String name = matcher.group();
            // �擪��#���������������ŏ������s���܂��B
            name = name.substring(1, name.length());
            resultSql = BlancoStringUtil.replaceAll(resultSql, "#" + name, ":"
                    + name);
        }
        return resultSql;
    }
}