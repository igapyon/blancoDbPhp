/*
 * blanco Framework
 * Copyright (C) 2004-2006 IGA Tosiki
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.db.expander.query.iterator;

import java.util.List;

import blanco.cg.BlancoCgObjectFactory;
import blanco.cg.valueobject.BlancoCgClass;
import blanco.cg.valueobject.BlancoCgMethod;
import blanco.cg.valueobject.BlancoCgSourceFile;
import blanco.commons.util.BlancoNameAdjuster;
import blanco.db.common.expander.BlancoDbAbstractMethod;
import blanco.db.common.util.BlancoDbUtil;
import blanco.db.common.valueobject.BlancoDbSetting;
import blanco.db.common.valueobject.BlancoDbSqlInfoStructure;
import blanco.db.expander.exception.NoRowFoundExceptionClassPhp;
import blanco.db.expander.exception.TooManyRowsFoundExceptionClassPhp;

/**
 * �ʂ̃��\�b�h��W�J���邽�߂̃N���X�B
 * 
 * �V���O��������true�̏ꍇ�ɂ̂݁A���̃N���X�͗��p����܂�
 * 
 * @author Tosiki Iga
 */
public class GetSingleRowMethodPhp extends BlancoDbAbstractMethod {
    public GetSingleRowMethodPhp(final BlancoDbSetting argDbSetting,
            final BlancoDbSqlInfoStructure argSqlInfo,
            final BlancoCgObjectFactory argCgFactory,
            final BlancoCgSourceFile argCgSourceFile,
            final BlancoCgClass argCgClass) {
        super(argDbSetting, argSqlInfo, argCgFactory, argCgSourceFile,
                argCgClass);
    }

    public void expand() {
        final BlancoCgMethod cgMethod = fCgFactory.createMethod("getSingleRow",
                "���݂̍s�̃f�[�^���I�u�W�F�N�g�Ƃ��Ď擾���܂��B");
        fCgClass.getMethodList().add(cgMethod);

        // �s�I�u�W�F�N�g�̌^�����擾���܂��B
        final String rowObjectType = fDbSetting.getBasePackage() + ".row."
                + BlancoNameAdjuster.toClassName(fSqlInfo.getName()) + "Row";

        cgMethod.setReturn(fCgFactory.createReturn(rowObjectType, "�s�I�u�W�F�N�g"));

        final List listDesc = cgMethod.getLangDoc().getDescriptionList();

        listDesc.add("���̃��\�b�h�𗘗p����ꍇ�ɂ́Anext()�Ȃǂ̃J�[�\���𑀍삷�郁�\�b�h�Ƃ͕��p���Ȃ��ł��������B");
        listDesc.add("");
        listDesc.add("single�������L��");
        listDesc.add("�������ʂ�1���ȊO�̏ꍇ�ɂ́ANotSingleRowException�N���X��");
        listDesc.add("�h�������N���X�̗�O���������܂��B");

        final List listLine = cgMethod.getLineList();

        fCgSourceFile.getImportList().add(
                BlancoDbUtil.getRuntimePackage(fDbSetting) + ".exception."
                        + NoRowFoundExceptionClassPhp.CLASS_NAME);

        listLine.add("if ($this->next() == FALSE) {");
        listLine.add("throw new NoRowFoundException(\"�s�������ł��܂���ł����B\");");
        listLine.add("}");
        listLine.add("");

        listLine.add("$result = $this->getRow();");
        listLine.add("");

        fCgSourceFile.getImportList().add(
                BlancoDbUtil.getRuntimePackage(fDbSetting) + ".exception."
                        + TooManyRowsFoundExceptionClassPhp.CLASS_NAME);

        // 1�s�𒴂��ĕύX�����������ǂ������`�F�b�N�B
        listLine.add("if ($this->next()) {");
        listLine
                .add("throw new TooManyRowsFoundException(\"1���ȏ�̍s����������܂����B\");");
        listLine.add("}");
        listLine.add("");

        listLine.add("return $result;");
    }
}