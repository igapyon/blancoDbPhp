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
 */
public class QueryConstructorPhp extends BlancoDbAbstractMethod {
    public QueryConstructorPhp(final BlancoDbSetting argDbSetting,
            final BlancoDbSqlInfoStructure argSqlInfo,
            final BlancoCgObjectFactory argCgFactory,
            final BlancoCgSourceFile argCgSourceFile,
            final BlancoCgClass argCgClass) {
        super(argDbSetting, argSqlInfo, argCgFactory, argCgSourceFile,
                argCgClass);
    }

    public void expand() {
        final BlancoCgMethod cgMethod = fCgFactory.createMethod(fCgClass
                .getName(), fCgClass.getName() + "�N���X�̃R���X�g���N�^�ł��B");
        fCgClass.getMethodList().add(cgMethod);

        cgMethod.getParameterList()
                .add(
                        fCgFactory.createParameter("connection", "pdo.PDO",
                                "�f�[�^�x�[�X�ڑ�"));

        cgMethod.getLangDoc().getDescriptionList().add(
                "�����ӁF�N���X�𗘗p��A�Ō�ɕK��close()���\�b�h���Ăяo���K�v������܂��B");

        cgMethod.setConstructor(true);

        final List listLine = cgMethod.getLineList();

        listLine.add("$this->fConnection = $connection;");
    }
}