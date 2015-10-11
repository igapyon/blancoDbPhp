/*
 * blanco Framework
 * Copyright (C) 2004-2006 IGA Tosiki
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.db;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.xml.sax.SAXException;

import blanco.cg.BlancoCgObjectFactory;
import blanco.cg.BlancoCgTransformer;
import blanco.cg.transformer.BlancoCgTransformerFactory;
import blanco.cg.valueobject.BlancoCgSourceFile;
import blanco.commons.util.BlancoNameAdjuster;
import blanco.commons.util.BlancoStringUtil;
import blanco.db.common.BlancoDbXml2SqlInfo;
import blanco.db.common.IBlancoDbProgress;
import blanco.db.common.stringgroup.BlancoDbSqlInfoTypeStringGroup;
import blanco.db.common.util.BlancoDbUtil;
import blanco.db.common.valueobject.BlancoDbSetting;
import blanco.db.common.valueobject.BlancoDbSqlInfoStructure;
import blanco.db.expander.exception.DeadlockExceptionClassPhp;
import blanco.db.expander.exception.IntegrityConstraintExceptionClassPhp;
import blanco.db.expander.exception.NoRowFoundExceptionClassPhp;
import blanco.db.expander.exception.NoRowModifiedExceptionClassPhp;
import blanco.db.expander.exception.NotSingleRowExceptionClassPhp;
import blanco.db.expander.exception.TimeoutExceptionClassPhp;
import blanco.db.expander.exception.TooManyRowsFoundExceptionClassPhp;
import blanco.db.expander.exception.TooManyRowsModifiedExceptionClassPhp;
import blanco.db.expander.query.invoker.QueryInvokerClassPhp;
import blanco.db.expander.query.iterator.QueryIteratorClassPhp;
import blanco.db.util.BlancoDbMappingUtilPhp;
import blanco.dbmetadata.valueobject.BlancoDbMetaDataColumnStructure;
import blanco.valueobjectphp.BlancoValueObjectPhpXml2SourceFile;
import blanco.valueobjectphp.valueobject.BlancoValueObjectPhpFieldStructure;
import blanco.valueobjectphp.valueobject.BlancoValueObjectPhpStructure;

/**
 * ����XML�t�@�C������\�[�X�R�[�h�𐶐����܂��B
 */
public abstract class BlancoDbXml2PhpClass implements IBlancoDbProgress {
    private BlancoDbSetting fDbSetting = null;

    /**
     * XML�t�@�C������\�[�X�R�[�h�𐶐����܂��B
     * 
     * @param connDef
     *            �f�[�^�x�[�X�ڑ����B
     * @param blancoSqlDirectory
     *            SQL XML�t�@�C�����i�[����Ă���f�B���N�g���B
     * @param rootPackage
     *            ���[�g�ƂȂ��p�b�P�[�W�B
     * @param runtimePackage
     *            blanco�ɐݒ肷�郉���^�C���p�b�P�[�W�Bnull�Ȃ�f�t�H���g�ɏo�́B
     * @param statementTimeout
     *            �X�e�[�g�����g�^�C���A�E�g�l�B
     * @param blancoTargetSourceDirectory
     *            �o�͐�f�B���N�g���B
     * @throws SQLException
     * @throws SAXException
     * @throws IOException
     * @throws ParserConfigurationException
     * @throws ClassNotFoundException
     * @throws TransformerException
     */
    public void process(final BlancoDbSetting argDbSetting,
            final File blancoSqlDirectory) throws SQLException, SAXException,
            IOException, ParserConfigurationException, ClassNotFoundException,
            TransformerException {
        System.out.println(BlancoDbConstantsPhp.PRODUCT_NAME + " ("
                + BlancoDbConstantsPhp.VERSION + ") �\�[�X�R�[�h����: �J�n.");

        fDbSetting = argDbSetting;

        if (BlancoStringUtil.null2Blank(fDbSetting.getRuntimePackage()).trim()
                .length() == 0) {
            fDbSetting.setRuntimePackage(null);
        }

        Connection conn = null;
        try {
            conn = BlancoDbUtil.connect(fDbSetting);
            BlancoDbUtil.getDatabaseVersionInfo(conn, fDbSetting);

            if (blancoSqlDirectory != null) {
                // �w�肪����ꍇ�ɂ̂� SQL��`���t�@�C���i�[�f�B���N�g�����������܂��B

                // ValueObject�����i�[����f�B���N�g�����쐬���܂��B
                new File(blancoSqlDirectory.getAbsolutePath() + "/valueobject")
                        .mkdirs();

                final File[] fileSettingXml = blancoSqlDirectory.listFiles();
                for (int index = 0; index < fileSettingXml.length; index++) {
                    if (fileSettingXml[index].getName().endsWith(".xml") == false) {
                        // �t�@�C���̊g���q�� xml �ł�����̂̂ݏ������܂��B
                        continue;
                    }
                    if (progress(index + 1, fileSettingXml.length,
                            fileSettingXml[index].getName()) == false) {
                        break;
                    }

                    // �����̓t�@�C�����ɍs���܂��B
                    processEveryFile(conn, fileSettingXml[index], new File(
                            blancoSqlDirectory.getAbsolutePath()
                                    + "/valueobject"));
                }
            }

        } finally {
            BlancoDbUtil.close(conn);
            conn = null;
            System.out.println("�\�[�X�R�[�h����: �I��.");
        }
    }

    /**
     * �ʂ�XML�t�@�C�����������܂��B
     * 
     * @param dbInfoCollector
     * @param rootPackage
     * @param fileSqlForm
     * @param outputDirectory
     * @throws IOException
     * @throws SAXException
     * @throws TransformerException
     * @throws SQLException
     * @throws ParserConfigurationException
     */
    private void processEveryFile(final Connection conn,
            final File fileSqlForm, final File outputDirectory)
            throws IOException, SAXException, TransformerException,
            SQLException, ParserConfigurationException {

        System.out.println("�t�@�C��[" + fileSqlForm.getAbsolutePath() + "]���������܂�");

        final BlancoDbXml2SqlInfo collector = new BlancoDbXml2SqlInfo();
        final List definition = collector
                .process(conn, fDbSetting, fileSqlForm);

        final String packageNameException = BlancoDbUtil
                .getRuntimePackage(fDbSetting)
                + ".exception";

        // �]���ƌ݊������������邽�߁A/main�T�u�t�H���_�ɏo�͂��܂��B
        final File fileBlancoMain = new File(fDbSetting.getTargetDir()
                + "/main");

        final BlancoCgObjectFactory cgFactory = BlancoCgObjectFactory
                .getInstance();

        final BlancoCgTransformer transformer = BlancoCgTransformerFactory
                .getPhpSourceTransformer();

        // exception�n
        transformer.transform(adjust(new DeadlockExceptionClassPhp(cgFactory,
                packageNameException).expand()), fileBlancoMain);
        transformer.transform(adjust(new IntegrityConstraintExceptionClassPhp(
                cgFactory, packageNameException).expand()), fileBlancoMain);
        transformer.transform(adjust(new NoRowFoundExceptionClassPhp(cgFactory,
                packageNameException).expand()), fileBlancoMain);
        transformer.transform(adjust(new NoRowModifiedExceptionClassPhp(
                cgFactory, packageNameException).expand()), fileBlancoMain);
        transformer.transform(adjust(new NotSingleRowExceptionClassPhp(
                cgFactory, packageNameException).expand()), fileBlancoMain);
        transformer.transform(adjust(new TimeoutExceptionClassPhp(cgFactory,
                packageNameException).expand()), fileBlancoMain);
        transformer.transform(adjust(new TooManyRowsFoundExceptionClassPhp(
                cgFactory, packageNameException).expand()), fileBlancoMain);
        transformer.transform(adjust(new TooManyRowsModifiedExceptionClassPhp(
                cgFactory, packageNameException).expand()), fileBlancoMain);

        // util�n
        // �����_�ł� PHP�łɂ�util�n�̃N���X�͂���܂���B

        // iterator, invoker, caller
        for (int index = 0; index < definition.size(); index++) {
            final BlancoDbSqlInfoStructure sqlInfo = (BlancoDbSqlInfoStructure) definition
                    .get(index);
            switch (sqlInfo.getType()) {
            case BlancoDbSqlInfoTypeStringGroup.ITERATOR:
                createRowObjectClass(fDbSetting.getBasePackage(), sqlInfo,
                        outputDirectory);

                transformer.transform(adjust(new QueryIteratorClassPhp(
                        fDbSetting, sqlInfo, cgFactory).expand()),
                        fileBlancoMain);
                break;
            case BlancoDbSqlInfoTypeStringGroup.INVOKER:
                transformer.transform(adjust(new QueryInvokerClassPhp(
                        fDbSetting, sqlInfo, cgFactory).expand()),
                        fileBlancoMain);
                break;
            case BlancoDbSqlInfoTypeStringGroup.CALLER:
                // TODO blancoDbPhp�͌ďo�^�̎����������T�|�[�g���܂���B
                System.out.println("blancoDbPhp�͌ďo�^�̎����������T�|�[�g���܂���B");
                break;
            default:
                throw new IllegalArgumentException(
                        "�z��O�̃G���[�B�s���ȃN�G���I�u�W�F�N�g���^�����܂����B" + sqlInfo.toString());
            }
        }
    }

    /**
     * �s�I�u�W�F�N�g���쐬���܂��B
     * 
     * @param className
     * @param packageName
     * @param sqlInfo
     * @param outputDirectory
     * @throws SAXException
     * @throws IOException
     * @throws TransformerException
     */
    private void createRowObjectClass(final String rootPackage,
            final BlancoDbSqlInfoStructure sqlInfo, final File outputDirectory)
            throws SAXException, IOException, TransformerException {
        final String packageName = rootPackage + ".row";
        final String className = BlancoNameAdjuster.toClassName(sqlInfo
                .getName())
                + "Row";

        final BlancoValueObjectPhpStructure voStructure = new BlancoValueObjectPhpStructure();
        // ���O
        voStructure.setName(className);
        voStructure.setPackage(packageName);
        voStructure
                .setDescription("SQL��`(" + sqlInfo.getName() + ")�ɂ��ƂÂ��s�N���X�B");
        voStructure.setFileDescription("'" + className + "'�s��\������s�N���X�B\n");

        for (int index = 0; index < sqlInfo.getResultSetColumnList().size(); index++) {
            final BlancoDbMetaDataColumnStructure columnStructure = (BlancoDbMetaDataColumnStructure) sqlInfo
                    .getResultSetColumnList().get(index);

            final BlancoValueObjectPhpFieldStructure fieldStructure = new BlancoValueObjectPhpFieldStructure();
            voStructure.getListField().add(fieldStructure);

            fieldStructure.setName(columnStructure.getName());

            // PHP�łƂ��Ă̌^�����肵�܂��B
            fieldStructure.setType(BlancoDbMappingUtilPhp
                    .getPhpType(columnStructure));

            fieldStructure.setDescription("��:[" + fieldStructure.getName()
                    + "]: DB�ɂ�����^:[" + columnStructure.getTypeName() + "]");
        }

        final BlancoValueObjectPhpXml2SourceFile xml2javaclass = new BlancoValueObjectPhpXml2SourceFile();
        xml2javaclass.setEncoding(fDbSetting.getEncoding());
        if (fDbSetting.getTargetDir() == null) {
            throw new IllegalArgumentException(
                    "BlancoDbGenerator: blanco�o�͐�t�H���_�����ݒ�(null)�ł��B");
        }
        xml2javaclass.process(voStructure, new File(fDbSetting.getTargetDir()));
    }

    /**
     * �\�[�X�E�I�u�W�F�N�g�̓��e�𒲐��B
     * 
     * <UL>
     * <LI>�\�[�X�R�[�h�̃G���R�[�f�B���O��ݒ�B
     * </UL>
     * 
     * @param arg
     * @return
     */
    private BlancoCgSourceFile adjust(final BlancoCgSourceFile arg) {
        if (BlancoStringUtil.null2Blank(fDbSetting.getEncoding()).length() > 0) {
            arg.setEncoding(fDbSetting.getEncoding());
        }
        return arg;
    }
}
