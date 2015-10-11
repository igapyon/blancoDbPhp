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
import blanco.db.common.expander.BlancoDbAbstractMethod;
import blanco.db.common.valueobject.BlancoDbSetting;
import blanco.db.common.valueobject.BlancoDbSqlInfoStructure;

/**
 * �ʂ̃��\�b�h��W�J���邽�߂̃N���X�B
 */
public class NextMethodPhp extends BlancoDbAbstractMethod {
    public NextMethodPhp(final BlancoDbSetting argDbSetting,
            final BlancoDbSqlInfoStructure argSqlInfo,
            final BlancoCgObjectFactory argCgFactory,
            final BlancoCgSourceFile argCgSourceFile,
            final BlancoCgClass argCgClass) {
        super(argDbSetting, argSqlInfo, argCgFactory, argCgSourceFile,
                argCgClass);
    }

    public void expand() {
        final BlancoCgMethod cgMethod = fCgFactory.createMethod("next",
                "�J�[�\�������݂̈ʒu����1�s���ֈړ����܂��B");
        fCgClass.getMethodList().add(cgMethod);

        /*
         * �V���O���������L���ł���ꍇ�ɂ� protected�Ƃ��܂��B
         */
        if (fSqlInfo.getSingle()) {
            cgMethod.setAccess("protected");
        }

        cgMethod.setReturn(fCgFactory.createReturn("boolean",
                "�V�������݂̍s���L���ȏꍇ��TRUE�A����ȏ�̍s���Ȃ��ꍇ��FALSE�B"));

        cgMethod.getLangDoc().getDescriptionList().add("");
        if (fSqlInfo.getSingle()) {
            cgMethod.getLangDoc().getDescriptionList().add(
                    "�V���O���������L���Ȃ̂ŃX�R�[�v��protected�Ƃ��܂��B");
        }

        final List listLine = cgMethod.getLineList();

        // resultSet�����m�ۂł���΂����A�����I��executeQuery���Ăяo���܂��B
        listLine.add("if ($this->fCurrentRow == NULL) {");
        listLine.add("$this->executeQuery();");
        listLine.add("}");
        listLine.add("");
        listLine.add("$result = $this->fStatement->fetch();");
        listLine.add("if (($result !== FALSE)) {");
        listLine.add("$this->fCurrentRow = $result;");
        listLine.add("return TRUE;");
        listLine.add("}");
        listLine.add("return FALSE;");
    }
}