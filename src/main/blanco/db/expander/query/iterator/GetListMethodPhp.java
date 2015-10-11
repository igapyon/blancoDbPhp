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
 * 
 * @author Tosiki Iga
 */
public class GetListMethodPhp extends BlancoDbAbstractMethod {
    public GetListMethodPhp(final BlancoDbSetting argDbSetting,
            final BlancoDbSqlInfoStructure argSqlInfo,
            final BlancoCgObjectFactory argCgFactory,
            final BlancoCgSourceFile argCgSourceFile,
            final BlancoCgClass argCgClass) {
        super(argDbSetting, argSqlInfo, argCgFactory, argCgSourceFile,
                argCgClass);
    }

    public void expand() {
        final BlancoCgMethod cgMethod = fCgFactory.createMethod("getList",
                "�������ʂ����X�g�Ŏ擾���܂��B");
        fCgClass.getMethodList().add(cgMethod);

        cgMethod.setReturn(fCgFactory.createReturn("array", fSqlInfo.getName()
                + "�N���X��List�B�������ʂ�0���̏ꍇ�ɂ͋�̃��X�g�B"));

        final List listDesc = cgMethod.getLangDoc().getDescriptionList();
        listDesc.add("���X�g�ɂ� " + fSqlInfo.getName() + "�N���X���i�[����܂��B");

        cgMethod.getParameterList().add(
                fCgFactory.createParameter("size", "integer", "�ǂݏo�����s���s���B"));

        final List listLine = cgMethod.getLineList();

        listLine.add("$result = array();");
        listLine.add("for ($count = 0; $count < $size; $count++) {");
        listLine.add("if ($this->next() == FALSE) {");
        listLine.add("break;");
        listLine.add("}");
        listLine.add("$result[$count] = $this->getRow();");
        listLine.add("}");
        listLine.add("return $result;");
    }
}