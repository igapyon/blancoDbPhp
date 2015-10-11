/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ�莩����������܂����B
 */
package blanco.db.resourcebundle;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * blancoDbPhp�����p���郊�\�[�X�o���h���ł��B
 *
 * ���\�[�X�o���h����`: [blancoDbPhp]�B<BR>
 * ���̃N���X�̓��\�[�X�o���h����`�����玩���������ꂽ���\�[�X�o���h���N���X�ł��B<BR>
 * ���m�̃��P�[��<BR>
 * <UL>
 * <LI>ja
 * </UL>
 */
public class BlancoDbPhpResourceBundle {
    /**
     * ���\�[�X�o���h���I�u�W�F�N�g�B
     *
     * �����I�Ɏ��ۂɓ��͂��s�����\�[�X�o���h�����L�����܂��B
     */
    private ResourceBundle fResourceBundle;

    /**
     * BlancoDbPhpResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[blancoDbPhp]�A�f�t�H���g�̃��P�[���A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     */
    public BlancoDbPhpResourceBundle() {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/db/resourcebundle/blancoDbPhp");
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoDbPhpResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[blancoDbPhp]�A�w�肳�ꂽ���P�[���A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     *
     * @param locale ���P�[���̎w��
     */
    public BlancoDbPhpResourceBundle(final Locale locale) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/db/resourcebundle/blancoDbPhp", locale);
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoDbPhpResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[blancoDbPhp]�A�w�肳�ꂽ���P�[���A�w�肳�ꂽ�N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     *
     * @param locale ���P�[���̎w��
     * @param loader �N���X���[�_�̎w��
     */
    public BlancoDbPhpResourceBundle(final Locale locale, final ClassLoader loader) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/db/resourcebundle/blancoDbPhp", locale, loader);
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * �����I�ɕێ����Ă��郊�\�[�X�o���h���I�u�W�F�N�g���擾���܂��B
     *
     * @return �����I�ɕێ����Ă��郊�\�[�X�o���h���I�u�W�F�N�g�B
     */
    public ResourceBundle getResourceBundle() {
        return fResourceBundle;
    }

    /**
     * bundle[blancoDbPhp], key[METAFILE_DISPLAYNAME]
     *
     * [SQL��`��] (ja)<br>
     *
     * @return key[METAFILE_DISPLAYNAME]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMetafileDisplayname() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "SQL��`��";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("METAFILE_DISPLAYNAME");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[blancoDbPhp], key[META2XML.ELEMENT_COMMON]
     *
     * [blancodb-common] (ja)<br>
     *
     * @return key[META2XML.ELEMENT_COMMON]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMeta2xmlElementCommon() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "blancodb-common";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("META2XML.ELEMENT_COMMON");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[blancoDbPhp], key[TYPE_MAPPING.ERR001]
     *
     * [�^�}�b�s���O�Ƃ��ăT�|�[�g���Ȃ�JDBC�^({0,number}/{1})��������܂����B�������f���܂��B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.math.BigDecimal�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[TYPE_MAPPING.ERR001]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getTypeMappingErr001(final BigDecimal arg0, final String arg1) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�^�}�b�s���O�Ƃ��ăT�|�[�g���Ȃ�JDBC�^({0,number}/{1})��������܂����B�������f���܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("TYPE_MAPPING.ERR001");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[blancoDbPhp], key[XML2JAVACLASS.ERR001]
     *
     * [SQL��`ID[{0}]�́uSQL���v���擾�ł��܂���ł����BSQL�����K�؂ɋL�ڂ���Ă��邱�Ƃ��m�F���Ă��������B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[XML2JAVACLASS.ERR001]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getXml2javaclassErr001(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "SQL��`ID[{0}]�́uSQL���v���擾�ł��܂���ł����BSQL�����K�؂ɋL�ڂ���Ă��邱�Ƃ��m�F���Ă��������B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.ERR001");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[blancoDbPhp], key[XML2JAVACLASS.ERR002]
     *
     * [SQL��`ID[{0}]�ɂ�����SQL��O���������܂����BSQL��`ID[{0}]��SQL����SQL���̓p�����[�^�Ɍ�肪�܂܂�Ă��Ȃ������ׂĂ��������BSQLState[{1}] �G���[�R�[�h[{2,number}] ���b�Z�[�W[{3}]] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg2 �u��������{2}��u������l�Bjava.math.BigDecimal�^��^���Ă��������B
     * @param arg3 �u��������{3}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[XML2JAVACLASS.ERR002]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getXml2javaclassErr002(final String arg0, final String arg1, final BigDecimal arg2, final String arg3) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "SQL��`ID[{0}]�ɂ�����SQL��O���������܂����BSQL��`ID[{0}]��SQL����SQL���̓p�����[�^�Ɍ�肪�܂܂�Ă��Ȃ������ׂĂ��������BSQLState[{1}] �G���[�R�[�h[{2,number}] ���b�Z�[�W[{3}]";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.ERR002");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1, arg2, arg3}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[blancoDbPhp], key[XML2JAVACLASS.ERR003]
     *
     * [SQL��`ID[{0}]�ɂ����āB�����Ă��Ă͂����Ȃ��o�H�ɓ���܂����B�T�|�[�g���Ȃ��^[{1}]������ɗ^�����܂����B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[XML2JAVACLASS.ERR003]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getXml2javaclassErr003(final String arg0, final String arg1) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "SQL��`ID[{0}]�ɂ����āB�����Ă��Ă͂����Ȃ��o�H�ɓ���܂����B�T�|�[�g���Ȃ��^[{1}]������ɗ^�����܂����B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.ERR003");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[blancoDbPhp], key[XML2JAVACLASS.ERR004]
     *
     * [SQL��`ID[{0}]��SQL���̓p�����[�^{1}�ɂ����āA�p�����[�^ID���w�肳��Ȃ��^[{2}]�����o����܂����B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg2 �u��������{2}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[XML2JAVACLASS.ERR004]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getXml2javaclassErr004(final String arg0, final String arg1, final String arg2) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "SQL��`ID[{0}]��SQL���̓p�����[�^{1}�ɂ����āA�p�����[�^ID���w�肳��Ȃ��^[{2}]�����o����܂����B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.ERR004");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1, arg2}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[blancoDbPhp], key[XML2JAVACLASS.ERR005]
     *
     * [SQL��`ID[{0}]��SQL���̓p�����[�^{1}�ɂ����āA�p�����[�^ID[{2}]�̌^���w�肳��Ă��܂���B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg2 �u��������{2}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[XML2JAVACLASS.ERR005]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getXml2javaclassErr005(final String arg0, final String arg1, final String arg2) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "SQL��`ID[{0}]��SQL���̓p�����[�^{1}�ɂ����āA�p�����[�^ID[{2}]�̌^���w�肳��Ă��܂���B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.ERR005");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1, arg2}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[blancoDbPhp], key[XML2JAVACLASS.ERR006]
     *
     * [SQL��`ID[{0}]��SQL�o�̓p�����[�^{1}�ɂ����āA�p�����[�^ID���w�肳��Ȃ��^[{2}]�����o����܂����B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg2 �u��������{2}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[XML2JAVACLASS.ERR006]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getXml2javaclassErr006(final String arg0, final String arg1, final String arg2) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "SQL��`ID[{0}]��SQL�o�̓p�����[�^{1}�ɂ����āA�p�����[�^ID���w�肳��Ȃ��^[{2}]�����o����܂����B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.ERR006");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1, arg2}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[blancoDbPhp], key[XML2JAVACLASS.ERR007]
     *
     * [SQL��`ID[{0}]��SQL�o�̓p�����[�^{1}�ɂ����āA�p�����[�^ID[{2}]�̌^���w�肳��Ă��܂���B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg2 �u��������{2}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[XML2JAVACLASS.ERR007]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getXml2javaclassErr007(final String arg0, final String arg1, final String arg2) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "SQL��`ID[{0}]��SQL�o�̓p�����[�^{1}�ɂ����āA�p�����[�^ID[{2}]�̌^���w�肳��Ă��܂���B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.ERR007");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1, arg2}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[blancoDbPhp], key[XML2JAVACLASS.ERR008]
     *
     * [SQL��`ID[{0}]�́u�ďo�^�v�łȂ��̂�SQL�o�̓p�����[�^{1}�A�p�����[�^ID[{2}]���w�肳��Ă��܂��B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg2 �u��������{2}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[XML2JAVACLASS.ERR008]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getXml2javaclassErr008(final String arg0, final String arg1, final String arg2) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "SQL��`ID[{0}]�́u�ďo�^�v�łȂ��̂�SQL�o�̓p�����[�^{1}�A�p�����[�^ID[{2}]���w�肳��Ă��܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.ERR008");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1, arg2}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[blancoDbPhp], key[XML2JAVACLASS.ERR009]
     *
     * [SQL��`ID[{0}]�ɂ����� �uSQL���v���т����Ă��Ȃ�SQL���̓p�����[�^[{1}]����������܂����B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[XML2JAVACLASS.ERR009]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getXml2javaclassErr009(final String arg0, final String arg1) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "SQL��`ID[{0}]�ɂ����� �uSQL���v���т����Ă��Ȃ�SQL���̓p�����[�^[{1}]����������܂����B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.ERR009");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[blancoDbPhp], key[TASK.ERR001]
     *
     * [SQL��O���������܂����B�������f���܂��B] (ja)<br>
     *
     * @return key[TASK.ERR001]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getTaskErr001() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "SQL��O���������܂����B�������f���܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("TASK.ERR001");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[blancoDbPhp], key[TASK.ERR002]
     *
     * [�N���X��������܂���B�N���X�p�X�̐ݒ�Ȃǂ��m�F���Ă��������B] (ja)<br>
     *
     * @return key[TASK.ERR002]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getTaskErr002() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�N���X��������܂���B�N���X�p�X�̐ݒ�Ȃǂ��m�F���Ă��������B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("TASK.ERR002");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[blancoDbPhp], key[TASK.ERR003]
     *
     * [�z�肳��Ȃ�SAX��O���������܂����B�������f���܂��B] (ja)<br>
     *
     * @return key[TASK.ERR003]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getTaskErr003() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�z�肳��Ȃ�SAX��O���������܂����B�������f���܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("TASK.ERR003");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[blancoDbPhp], key[TASK.ERR004]
     *
     * [�z�肳��Ȃ����o�͗�O���������܂����B�������f���܂��B] (ja)<br>
     *
     * @return key[TASK.ERR004]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getTaskErr004() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�z�肳��Ȃ����o�͗�O���������܂����B�������f���܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("TASK.ERR004");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[blancoDbPhp], key[TASK.ERR005]
     *
     * [�z�肳��Ȃ�XML�p�[�T��O���������܂����B�������f���܂��B] (ja)<br>
     *
     * @return key[TASK.ERR005]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getTaskErr005() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�z�肳��Ȃ�XML�p�[�T��O���������܂����B�������f���܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("TASK.ERR005");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[blancoDbPhp], key[TASK.ERR006]
     *
     * [�z�肳��Ȃ�XML�g�����X�t�H�[�}�[��O���������܂����B�������f���܂��B] (ja)<br>
     *
     * @return key[TASK.ERR006]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getTaskErr006() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�z�肳��Ȃ�XML�g�����X�t�H�[�}�[��O���������܂����B�������f���܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("TASK.ERR006");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[blancoDbPhp], key[META2XML.PREFIX.INPARAM]
     *
     * [inParam] (ja)<br>
     *
     * @return key[META2XML.PREFIX.INPARAM]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMeta2xmlPrefixInparam() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "inParam";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("META2XML.PREFIX.INPARAM");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[blancoDbPhp], key[META2XML.PREFIX.INPARAMWHERE]
     *
     * [where] (ja)<br>
     *
     * @return key[META2XML.PREFIX.INPARAMWHERE]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMeta2xmlPrefixInparamwhere() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "where";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("META2XML.PREFIX.INPARAMWHERE");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[blancoDbPhp], key[ANTTASK.ERR001]
     *
     * [���^�f�B���N�g��[{0}]�����݂��܂���B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[ANTTASK.ERR001]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getAnttaskErr001(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���^�f�B���N�g��[{0}]�����݂��܂���B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("ANTTASK.ERR001");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }
}
