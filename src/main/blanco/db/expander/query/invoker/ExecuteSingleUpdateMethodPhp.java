/*
 * blanco Framework
 * Copyright (C) 2004-2006 IGA Tosiki
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.db.expander.query.invoker;

import java.util.List;

import blanco.cg.BlancoCgObjectFactory;
import blanco.cg.valueobject.BlancoCgClass;
import blanco.cg.valueobject.BlancoCgMethod;
import blanco.cg.valueobject.BlancoCgSourceFile;
import blanco.db.common.expander.BlancoDbAbstractMethod;
import blanco.db.common.util.BlancoDbUtil;
import blanco.db.common.valueobject.BlancoDbSetting;
import blanco.db.common.valueobject.BlancoDbSqlInfoStructure;
import blanco.db.expander.exception.NoRowModifiedExceptionClassPhp;
import blanco.db.expander.exception.TooManyRowsModifiedExceptionClassPhp;

/**
 * �ʂ̃��\�b�h��W�J���邽�߂̃N���X�B
 * 
 * @author Tosiki Iga
 */
public class ExecuteSingleUpdateMethodPhp extends BlancoDbAbstractMethod {
    public ExecuteSingleUpdateMethodPhp(final BlancoDbSetting argDbSetting,
            final BlancoDbSqlInfoStructure argSqlInfo,
            final BlancoCgObjectFactory argCgFactory,
            final BlancoCgSourceFile argCgSourceFile,
            final BlancoCgClass argCgClass) {
        super(argDbSetting, argSqlInfo, argCgFactory, argCgSourceFile,
                argCgClass);
    }

    public void expand() {
        final BlancoCgMethod cgMethod = fCgFactory.createMethod(
                "executeSingleUpdate", "���s�^�N�G�������s���܂��B");
        fCgClass.getMethodList().add(cgMethod);

        cgMethod.getLangDoc().getDescriptionList().add(
                "�f�[�^�x�[�X�̐���ᔽ�����������ꍇ�ɂ� IntegrityConstraintException ��O���������܂��B");
        cgMethod.getLangDoc().getDescriptionList().add("");

        cgMethod.getLangDoc().getDescriptionList().add("single�������L��");
        cgMethod.getLangDoc().getDescriptionList().add(
                "���s���ʂ�1���ȊO�̏ꍇ�ɂ́ANotSingleRowException�N���X��");
        cgMethod.getLangDoc().getDescriptionList().add("�h�������N���X�̗�O���������܂��B");

        final List listLine = cgMethod.getLineList();

        listLine.add("$result = $this->executeUpdate();");
        listLine.add("");

        fCgSourceFile.getImportList().add(
                BlancoDbUtil.getRuntimePackage(fDbSetting) + ".exception."
                        + NoRowModifiedExceptionClassPhp.CLASS_NAME);
        fCgSourceFile.getImportList().add(
                BlancoDbUtil.getRuntimePackage(fDbSetting) + ".exception."
                        + TooManyRowsModifiedExceptionClassPhp.CLASS_NAME);

        listLine.add("if ($result == 0) {");
        listLine.add("throw new " + NoRowModifiedExceptionClassPhp.CLASS_NAME
                + "(\"�s���ꌏ���ύX����܂���ł����B\");");
        listLine.add("} else if ($result > 1) {");
        listLine.add("$message = \"�ꌏ�𒴂���s���ύX����Ă��܂��܂����B�e���̂���������:\" . $result;");
        listLine.add("throw new "
                + TooManyRowsModifiedExceptionClassPhp.CLASS_NAME
                + "($message);");
        listLine.add("}");
    }
}