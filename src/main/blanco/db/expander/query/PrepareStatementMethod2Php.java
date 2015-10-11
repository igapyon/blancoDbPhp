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
 * 
 * @author tosiki iga
 */
public class PrepareStatementMethod2Php extends BlancoDbAbstractMethod {
    public PrepareStatementMethod2Php(final BlancoDbSetting argDbSetting,
            final BlancoDbSqlInfoStructure argSqlInfo,
            final BlancoCgObjectFactory argCgFactory,
            final BlancoCgSourceFile argCgSourceFile,
            final BlancoCgClass argCgClass) {
        super(argDbSetting, argSqlInfo, argCgFactory, argCgSourceFile,
                argCgClass);
    }

    public void expand() {
        final BlancoCgMethod cgMethod = fCgFactory.createMethod(
                "prepareStatementSql", "�N�G���̃v���R���p�C���ɑ������܂��B");
        fCgClass.getMethodList().add(cgMethod);

        cgMethod.getParameterList()
                .add(
                        fCgFactory.createParameter("query", "string",
                                "���p�������N�G��(SQL��)"));

        final List listDesc = cgMethod.getLangDoc().getDescriptionList();

        listDesc.add("���I�ɓ��e���ω�����悤��SQL�����s����K�v������ꍇ�ɂ̂݁A������̃��\�b�h�𗘗p���܂��B");

        listDesc
                .add("��SQL�����̂��̂��p�����[�^�Ƃ��ė^���邱�Ƃ��ł��Ď��R�x����������ASQL�C���W�F�N�V�����ƌĂ΂��Z�L�����e�B�z�[������������댯������_�ɒ��ӂ�����ŗ��p���Ă��������B");
        listDesc.add("�����I�ɂ� SQL�����t�B�[���h�ϐ��ɋL�����܂��B");

        final List listLine = cgMethod.getLineList();

        listLine.add("$this->close();");
        listLine
                .add("$this->fStatement = $this->fConnection->prepare($query);");
    }
}