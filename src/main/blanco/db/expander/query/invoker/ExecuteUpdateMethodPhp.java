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
import blanco.commons.util.BlancoNameAdjuster;
import blanco.db.common.expander.BlancoDbAbstractMethod;
import blanco.db.common.valueobject.BlancoDbSetting;
import blanco.db.common.valueobject.BlancoDbSqlInfoStructure;
import blanco.dbmetadata.valueobject.BlancoDbMetaDataColumnStructure;

/**
 * �ʂ̃��\�b�h��W�J���邽�߂̃N���X�B
 */
public class ExecuteUpdateMethodPhp extends BlancoDbAbstractMethod {
    public ExecuteUpdateMethodPhp(final BlancoDbSetting argDbSetting,
            final BlancoDbSqlInfoStructure argSqlInfo,
            final BlancoCgObjectFactory argCgFactory,
            final BlancoCgSourceFile argCgSourceFile,
            final BlancoCgClass argCgClass) {
        super(argDbSetting, argSqlInfo, argCgFactory, argCgSourceFile,
                argCgClass);
    }

    public void expand() {
        final BlancoCgMethod cgMethod = fCgFactory.createMethod(
                "executeUpdate", "���s�^�N�G�������s���܂��B");
        fCgClass.getMethodList().add(cgMethod);

        cgMethod.setReturn(fCgFactory.createReturn("integer", "�������ꂽ�s��"));

        /*
         * �V���O���������L���ł���ꍇ�ɂ� protected�Ƃ��܂��B
         */
        if (fSqlInfo.getSingle()) {
            cgMethod.setAccess("protected");
        } else {
            // public�̂܂܂ł��B
        }

        cgMethod.getLangDoc().getDescriptionList().add(
                "�f�[�^�x�[�X�̐���ᔽ�����������ꍇ�ɂ� IntegrityConstraintException ��O���������܂��B");

        if (fSqlInfo.getSingle()) {
            cgMethod.getLangDoc().getDescriptionList().add("");
            cgMethod.getLangDoc().getDescriptionList().add(
                    "�V���O���������L���Ȃ̂ŃX�R�[�v��protected�Ƃ��܂��B");
            cgMethod.getLangDoc().getDescriptionList().add(
                    "���̃��\�b�h�̑���� ExecuteSingleUpdate���\�b�h�𗘗p���Ă��������B");
        }

        final List listLine = cgMethod.getLineList();

        // statement�����m�ۂł���΂����A�����I��prepareStatement���Ăяo���܂��B
        listLine.add("if ($this->fStatement == NULL) {");
        listLine
                .add("// PreparedStatement�����擾�̏�ԂȂ̂ŁAExecuteNonQuery()���s�ɐ旧��PrepareStatement()���\�b�h���Ăяo���Ď擾���܂��B");
        listLine.add("$this->prepareStatement();");
        listLine.add("}");

        listLine.add("");

        String parameteres = "";
        for (int index = 0; index < fSqlInfo.getInParameterList().size(); index++) {
            final BlancoDbMetaDataColumnStructure columnStructure = (BlancoDbMetaDataColumnStructure) fSqlInfo
                    .getInParameterList().get(index);

            if (index != 0) {
                parameteres += ", ";
            }
            parameteres += "$this->f"
                    + BlancoNameAdjuster.toClassName(columnStructure.getName());
        }

        // ��O�������܂߂ēW�J���܂��B
        listLine.add("// TODO ��O�����������Ă��܂���B");
        listLine.add("$result = $this->fStatement->execute();");
        listLine.add("return $this->fStatement->rowCount();");
    }
}