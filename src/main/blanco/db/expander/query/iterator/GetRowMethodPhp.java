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
import blanco.commons.util.BlancoNameUtil;
import blanco.db.common.expander.BlancoDbAbstractMethod;
import blanco.db.common.valueobject.BlancoDbSetting;
import blanco.db.common.valueobject.BlancoDbSqlInfoStructure;
import blanco.dbmetadata.valueobject.BlancoDbMetaDataColumnStructure;

/**
 * �ʂ̃��\�b�h��W�J���邽�߂̃N���X�B
 * 
 * @author Tosiki Iga
 */
public class GetRowMethodPhp extends BlancoDbAbstractMethod {
    public GetRowMethodPhp(final BlancoDbSetting argDbSetting,
            final BlancoDbSqlInfoStructure argSqlInfo,
            final BlancoCgObjectFactory argCgFactory,
            final BlancoCgSourceFile argCgSourceFile,
            final BlancoCgClass argCgClass) {
        super(argDbSetting, argSqlInfo, argCgFactory, argCgSourceFile,
                argCgClass);
    }

    public void expand() {
        final BlancoCgMethod cgMethod = fCgFactory.createMethod("getRow",
                "���݂̍s�̃f�[�^���I�u�W�F�N�g�Ƃ��Ď擾���܂��B");
        fCgClass.getMethodList().add(cgMethod);

        /*
         * �V���O���������L���ł���ꍇ�ɂ� protected�Ƃ��܂��B
         */
        if (fSqlInfo.getSingle()) {
            cgMethod.setAccess("protected");
        }

        // �s�I�u�W�F�N�g�̌^�����擾���܂��B
        final String rowObjectType = fDbSetting.getBasePackage() + ".row."
                + BlancoNameAdjuster.toClassName(fSqlInfo.getName()) + "Row";

        cgMethod.setReturn(fCgFactory.createReturn(rowObjectType, "�s�I�u�W�F�N�g"));

        final List listDesc = cgMethod.getLangDoc().getDescriptionList();

        if (fSqlInfo.getSingle()) {
            listDesc.add("�V���O���������L���Ȃ̂ŃX�R�[�v��protected�Ƃ��܂��B");
            listDesc.add("���̃��\�b�h�̑���� GetSingleRow���\�b�h�𗘗p���Ă��������B");
        } else {
            listDesc.add("���̃��\�b�h���Ăяo���O�ɁAnext()�Ȃǂ̃J�[�\���𑀍삷�郁�\�b�h���Ăяo���K�v������܂��B");
        }

        final List listLine = cgMethod.getLineList();

        listLine.add("$result = new "
                + BlancoNameUtil.trimJavaPackage(rowObjectType) + "();");

        int indexCol = 0;
        for (int index = 0; index < fSqlInfo.getResultSetColumnList().size(); index++) {
            final BlancoDbMetaDataColumnStructure columnStructure = (BlancoDbMetaDataColumnStructure) fSqlInfo
                    .getResultSetColumnList().get(index);

            listLine.add("$result->set"
                    + BlancoNameAdjuster.toClassName(columnStructure.getName())
                    + "($this->fCurrentRow[" + index + "]);");

            indexCol++;
        }

        listLine.add("");

        listLine.add("return $result;");
    }
}