/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ�莩����������܂����B
 */
package blanco.db.task;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

import blanco.db.task.valueobject.BlancoDbPhpProcessInput;

/**
 * Apache Ant�^�X�N [BlancoDbPhp]�̃N���X�B
 *
 * R/O�}�b�s���O�����������s�� BlancoDbPhp ��AntTask�ł��B<br>
 * ���̃N���X�ł́AApache Ant�^�X�N�ň�ʓI�ɕK�v�ȃ`�F�b�N�Ȃǂ̃R�[�f�B���O�������肵�܂��B
 * ���ۂ̏����� �p�b�P�[�W[blanco.db.task]��BlancoDbPhpBatchProcess�N���X���쐬���ċL�q���Ă��������B<br>
 * <br>
 * Ant�^�X�N�ւ̑g�ݍ��ݗ�<br>
 * <pre>
 * &lt;taskdef name=&quot;blancodbphp&quot; classname=&quot;blanco.db.task.BlancoDbPhpTask">
 *     &lt;classpath&gt;
 *         &lt;fileset dir=&quot;lib&quot; includes=&quot;*.jar&quot; /&gt;
 *         &lt;fileset dir=&quot;lib.ant&quot; includes=&quot;*.jar&quot; /&gt;
 *     &lt;/classpath&gt;
 * &lt;/taskdef&gt;
 * </pre>
 */
public class BlancoDbPhpTask extends Task {
    /**
     * R/O�}�b�s���O�����������s�� BlancoDbPhp ��AntTask�ł��B
     */
    protected BlancoDbPhpProcessInput fInput = new BlancoDbPhpProcessInput();

    /**
     * �t�B�[���h [jdbcdriver] �ɒl���Z�b�g���ꂽ���ǂ����B
     */
    protected boolean fIsFieldJdbcdriverProcessed = false;

    /**
     * �t�B�[���h [jdbcurl] �ɒl���Z�b�g���ꂽ���ǂ����B
     */
    protected boolean fIsFieldJdbcurlProcessed = false;

    /**
     * �t�B�[���h [jdbcuser] �ɒl���Z�b�g���ꂽ���ǂ����B
     */
    protected boolean fIsFieldJdbcuserProcessed = false;

    /**
     * �t�B�[���h [jdbcpassword] �ɒl���Z�b�g���ꂽ���ǂ����B
     */
    protected boolean fIsFieldJdbcpasswordProcessed = false;

    /**
     * �t�B�[���h [jdbcdriverfile] �ɒl���Z�b�g���ꂽ���ǂ����B
     */
    protected boolean fIsFieldJdbcdriverfileProcessed = false;

    /**
     * �t�B�[���h [metadir] �ɒl���Z�b�g���ꂽ���ǂ����B
     */
    protected boolean fIsFieldMetadirProcessed = false;

    /**
     * �t�B�[���h [tmpdir] �ɒl���Z�b�g���ꂽ���ǂ����B
     */
    protected boolean fIsFieldTmpdirProcessed = false;

    /**
     * �t�B�[���h [targetdir] �ɒl���Z�b�g���ꂽ���ǂ����B
     */
    protected boolean fIsFieldTargetdirProcessed = false;

    /**
     * �t�B�[���h [basepackage] �ɒl���Z�b�g���ꂽ���ǂ����B
     */
    protected boolean fIsFieldBasepackageProcessed = false;

    /**
     * �t�B�[���h [runtimepackage] �ɒl���Z�b�g���ꂽ���ǂ����B
     */
    protected boolean fIsFieldRuntimepackageProcessed = false;

    /**
     * �t�B�[���h [schema] �ɒl���Z�b�g���ꂽ���ǂ����B
     */
    protected boolean fIsFieldSchemaProcessed = false;

    /**
     * �t�B�[���h [table] �ɒl���Z�b�g���ꂽ���ǂ����B
     */
    protected boolean fIsFieldTableProcessed = false;

    /**
     * �t�B�[���h [sql] �ɒl���Z�b�g���ꂽ���ǂ����B
     */
    protected boolean fIsFieldSqlProcessed = false;

    /**
     * �t�B�[���h [log] �ɒl���Z�b�g���ꂽ���ǂ����B
     */
    protected boolean fIsFieldLogProcessed = false;

    /**
     * �t�B�[���h [executesql] �ɒl���Z�b�g���ꂽ���ǂ����B
     */
    protected boolean fIsFieldExecutesqlProcessed = false;

    /**
     * �t�B�[���h [encoding] �ɒl���Z�b�g���ꂽ���ǂ����B
     */
    protected boolean fIsFieldEncodingProcessed = false;

    /**
     * �t�B�[���h [cache] �ɒl���Z�b�g���ꂽ���ǂ����B
     */
    protected boolean fIsFieldCacheProcessed = false;

    /**
     * verbose���[�h�œ��삳���邩�ǂ����B
     *
     * @param arg verbose���[�h�œ��삳���邩�ǂ����B
     */
    public void setVerbose(final boolean arg) {
        fInput.setVerbose(arg);
    }

    /**
     * verbose���[�h�œ��삳���邩�ǂ����B
     *
     * @return verbose���[�h�œ��삳���邩�ǂ����B
     */
    public boolean getVerbose() {
        return fInput.getVerbose();
    }

    /**
     * Ant�^�X�N��[jdbcdriver]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 1<br>
     * JDBC�h���C�o�̃N���X�����w�肵�܂��B<br>
     *
     * @param arg �Z�b�g�������l
     */
    public void setJdbcdriver(final String arg) {
        fInput.setJdbcdriver(arg);
        fIsFieldJdbcdriverProcessed = true;
    }

    /**
     * Ant�^�X�N��[jdbcdriver]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 1<br>
     * JDBC�h���C�o�̃N���X�����w�肵�܂��B<br>
     * �K�{�A�g���r���[�g�ł��BApache Ant�^�X�N��ŕK���l���w�肳��܂��B<br>
     *
     * @return ���̃t�B�[���h�̒l
     */
    public String getJdbcdriver() {
        return fInput.getJdbcdriver();
    }

    /**
     * Ant�^�X�N��[jdbcurl]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 2<br>
     * JDBC�ڑ���URL���w�肵�܂��B<br>
     *
     * @param arg �Z�b�g�������l
     */
    public void setJdbcurl(final String arg) {
        fInput.setJdbcurl(arg);
        fIsFieldJdbcurlProcessed = true;
    }

    /**
     * Ant�^�X�N��[jdbcurl]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 2<br>
     * JDBC�ڑ���URL���w�肵�܂��B<br>
     * �K�{�A�g���r���[�g�ł��BApache Ant�^�X�N��ŕK���l���w�肳��܂��B<br>
     *
     * @return ���̃t�B�[���h�̒l
     */
    public String getJdbcurl() {
        return fInput.getJdbcurl();
    }

    /**
     * Ant�^�X�N��[jdbcuser]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 3<br>
     * JDBC�f�[�^�x�[�X�ڑ����s���ۂ̃��[�U�����w�肵�܂��B<br>
     *
     * @param arg �Z�b�g�������l
     */
    public void setJdbcuser(final String arg) {
        fInput.setJdbcuser(arg);
        fIsFieldJdbcuserProcessed = true;
    }

    /**
     * Ant�^�X�N��[jdbcuser]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 3<br>
     * JDBC�f�[�^�x�[�X�ڑ����s���ۂ̃��[�U�����w�肵�܂��B<br>
     * �K�{�A�g���r���[�g�ł��BApache Ant�^�X�N��ŕK���l���w�肳��܂��B<br>
     *
     * @return ���̃t�B�[���h�̒l
     */
    public String getJdbcuser() {
        return fInput.getJdbcuser();
    }

    /**
     * Ant�^�X�N��[jdbcpassword]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 4<br>
     * JDBC�f�[�^�x�[�X�ڑ����s���ۂ̃p�X���[�h���w�肵�܂��B<br>
     *
     * @param arg �Z�b�g�������l
     */
    public void setJdbcpassword(final String arg) {
        fInput.setJdbcpassword(arg);
        fIsFieldJdbcpasswordProcessed = true;
    }

    /**
     * Ant�^�X�N��[jdbcpassword]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 4<br>
     * JDBC�f�[�^�x�[�X�ڑ����s���ۂ̃p�X���[�h���w�肵�܂��B<br>
     * �K�{�A�g���r���[�g�ł��BApache Ant�^�X�N��ŕK���l���w�肳��܂��B<br>
     *
     * @return ���̃t�B�[���h�̒l
     */
    public String getJdbcpassword() {
        return fInput.getJdbcpassword();
    }

    /**
     * Ant�^�X�N��[jdbcdriverfile]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 5<br>
     * JDBC�h���C�o�� jar �t�@�C�������w�肵�܂��B�ʏ�͗��p���܂���B<br>
     *
     * @param arg �Z�b�g�������l
     */
    public void setJdbcdriverfile(final String arg) {
        fInput.setJdbcdriverfile(arg);
        fIsFieldJdbcdriverfileProcessed = true;
    }

    /**
     * Ant�^�X�N��[jdbcdriverfile]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 5<br>
     * JDBC�h���C�o�� jar �t�@�C�������w�肵�܂��B�ʏ�͗��p���܂���B<br>
     *
     * @return ���̃t�B�[���h�̒l
     */
    public String getJdbcdriverfile() {
        return fInput.getJdbcdriverfile();
    }

    /**
     * Ant�^�X�N��[metadir]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 6<br>
     * SQL��`���^�t�@�C�����i�[����Ă���f�B���N�g�����w�肵�܂��B<br>
     *
     * @param arg �Z�b�g�������l
     */
    public void setMetadir(final String arg) {
        fInput.setMetadir(arg);
        fIsFieldMetadirProcessed = true;
    }

    /**
     * Ant�^�X�N��[metadir]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 6<br>
     * SQL��`���^�t�@�C�����i�[����Ă���f�B���N�g�����w�肵�܂��B<br>
     * �K�{�A�g���r���[�g�ł��BApache Ant�^�X�N��ŕK���l���w�肳��܂��B<br>
     *
     * @return ���̃t�B�[���h�̒l
     */
    public String getMetadir() {
        return fInput.getMetadir();
    }

    /**
     * Ant�^�X�N��[tmpdir]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 7<br>
     * �e���|�����t�H���_���w�肵�܂��B���w��̏ꍇ�ɂ̓J�����g������tmp�t�H���_�𗘗p���܂��B<br>
     *
     * @param arg �Z�b�g�������l
     */
    public void setTmpdir(final String arg) {
        fInput.setTmpdir(arg);
        fIsFieldTmpdirProcessed = true;
    }

    /**
     * Ant�^�X�N��[tmpdir]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 7<br>
     * �e���|�����t�H���_���w�肵�܂��B���w��̏ꍇ�ɂ̓J�����g������tmp�t�H���_�𗘗p���܂��B<br>
     * �f�t�H���g�l[tmp]���ݒ肳��Ă��܂��BApache Ant�^�X�N��ŃA�g���r���[�g�̎w�肪�����ꍇ�ɂ́A�f�t�H���g�l���ݒ肳��܂��B<br>
     *
     * @return ���̃t�B�[���h�̒l
     */
    public String getTmpdir() {
        return fInput.getTmpdir();
    }

    /**
     * Ant�^�X�N��[targetdir]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 8<br>
     * BlancoDb��PHP�\�[�X�R�[�h���o�͂���f�B���N�g�����w�肵�܂��B<br>
     *
     * @param arg �Z�b�g�������l
     */
    public void setTargetdir(final String arg) {
        fInput.setTargetdir(arg);
        fIsFieldTargetdirProcessed = true;
    }

    /**
     * Ant�^�X�N��[targetdir]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 8<br>
     * BlancoDb��PHP�\�[�X�R�[�h���o�͂���f�B���N�g�����w�肵�܂��B<br>
     * �f�t�H���g�l[blanco.php]���ݒ肳��Ă��܂��BApache Ant�^�X�N��ŃA�g���r���[�g�̎w�肪�����ꍇ�ɂ́A�f�t�H���g�l���ݒ肳��܂��B<br>
     *
     * @return ���̃t�B�[���h�̒l
     */
    public String getTargetdir() {
        return fInput.getTargetdir();
    }

    /**
     * Ant�^�X�N��[basepackage]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 9<br>
     * BlancoDb��PHP�\�[�X�R�[�h�𐶐�����ۂ̊�ƂȂ�p�b�P�[�W�����w�肵�܂��B<br>
     *
     * @param arg �Z�b�g�������l
     */
    public void setBasepackage(final String arg) {
        fInput.setBasepackage(arg);
        fIsFieldBasepackageProcessed = true;
    }

    /**
     * Ant�^�X�N��[basepackage]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 9<br>
     * BlancoDb��PHP�\�[�X�R�[�h�𐶐�����ۂ̊�ƂȂ�p�b�P�[�W�����w�肵�܂��B<br>
     * �K�{�A�g���r���[�g�ł��BApache Ant�^�X�N��ŕK���l���w�肳��܂��B<br>
     *
     * @return ���̃t�B�[���h�̒l
     */
    public String getBasepackage() {
        return fInput.getBasepackage();
    }

    /**
     * Ant�^�X�N��[runtimepackage]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 10<br>
     * �����^�C���N���X�𐶐����鐶������w�肵�܂��B���w��̏ꍇ�ɂ� basepackage����ɐ�������܂��B<br>
     *
     * @param arg �Z�b�g�������l
     */
    public void setRuntimepackage(final String arg) {
        fInput.setRuntimepackage(arg);
        fIsFieldRuntimepackageProcessed = true;
    }

    /**
     * Ant�^�X�N��[runtimepackage]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 10<br>
     * �����^�C���N���X�𐶐����鐶������w�肵�܂��B���w��̏ꍇ�ɂ� basepackage����ɐ�������܂��B<br>
     *
     * @return ���̃t�B�[���h�̒l
     */
    public String getRuntimepackage() {
        return fInput.getRuntimepackage();
    }

    /**
     * Ant�^�X�N��[schema]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 11<br>
     * �P��\�����擾����ۂ̃X�L�[�}���B��{�I�ɖ��w��ł��B������Oracle�̏ꍇ�ɂ̂݁A���[�U����啶�����������̂��w�肵�܂��BOracle�̏ꍇ�� ������w�肵�Ȃ��ƁA�V�X�e���\�܂Ō������Ă��܂��s����������邽�߂ł��B�������_�ł̓T�|�[�g����Ȃ��I�v�V�����ł��B<br>
     *
     * @param arg �Z�b�g�������l
     */
    public void setSchema(final String arg) {
        fInput.setSchema(arg);
        fIsFieldSchemaProcessed = true;
    }

    /**
     * Ant�^�X�N��[schema]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 11<br>
     * �P��\�����擾����ۂ̃X�L�[�}���B��{�I�ɖ��w��ł��B������Oracle�̏ꍇ�ɂ̂݁A���[�U����啶�����������̂��w�肵�܂��BOracle�̏ꍇ�� ������w�肵�Ȃ��ƁA�V�X�e���\�܂Ō������Ă��܂��s����������邽�߂ł��B�������_�ł̓T�|�[�g����Ȃ��I�v�V�����ł��B<br>
     *
     * @return ���̃t�B�[���h�̒l
     */
    public String getSchema() {
        return fInput.getSchema();
    }

    /**
     * Ant�^�X�N��[table]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 12<br>
     * true��ݒ肷��ƒP��\�̂��߂̃A�N�Z�T�E�R�[�h�𐶐����܂��B<br>
     *
     * @param arg �Z�b�g�������l
     */
    public void setTable(final String arg) {
        fInput.setTable(arg);
        fIsFieldTableProcessed = true;
    }

    /**
     * Ant�^�X�N��[table]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 12<br>
     * true��ݒ肷��ƒP��\�̂��߂̃A�N�Z�T�E�R�[�h�𐶐����܂��B<br>
     * �f�t�H���g�l[false]���ݒ肳��Ă��܂��BApache Ant�^�X�N��ŃA�g���r���[�g�̎w�肪�����ꍇ�ɂ́A�f�t�H���g�l���ݒ肳��܂��B<br>
     *
     * @return ���̃t�B�[���h�̒l
     */
    public String getTable() {
        return fInput.getTable();
    }

    /**
     * Ant�^�X�N��[sql]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 13<br>
     * true��ݒ肷���SQL��`����R�[�h�𐶐����܂��B<br>
     *
     * @param arg �Z�b�g�������l
     */
    public void setSql(final String arg) {
        fInput.setSql(arg);
        fIsFieldSqlProcessed = true;
    }

    /**
     * Ant�^�X�N��[sql]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 13<br>
     * true��ݒ肷���SQL��`����R�[�h�𐶐����܂��B<br>
     * �f�t�H���g�l[false]���ݒ肳��Ă��܂��BApache Ant�^�X�N��ŃA�g���r���[�g�̎w�肪�����ꍇ�ɂ́A�f�t�H���g�l���ݒ肳��܂��B<br>
     *
     * @return ���̃t�B�[���h�̒l
     */
    public String getSql() {
        return fInput.getSql();
    }

    /**
     * Ant�^�X�N��[log]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 14<br>
     * True��ݒ肷��ƃ��M���O�R�[�h�𐶐����܂��B�������_�ł̓T�|�[�g����Ȃ��I�v�V�����ł��B<br>
     *
     * @param arg �Z�b�g�������l
     */
    public void setLog(final String arg) {
        fInput.setLog(arg);
        fIsFieldLogProcessed = true;
    }

    /**
     * Ant�^�X�N��[log]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 14<br>
     * True��ݒ肷��ƃ��M���O�R�[�h�𐶐����܂��B�������_�ł̓T�|�[�g����Ȃ��I�v�V�����ł��B<br>
     * �f�t�H���g�l[false]���ݒ肳��Ă��܂��BApache Ant�^�X�N��ŃA�g���r���[�g�̎w�肪�����ꍇ�ɂ́A�f�t�H���g�l���ݒ肳��܂��B<br>
     *
     * @return ���̃t�B�[���h�̒l
     */
    public String getLog() {
        return fInput.getLog();
    }

    /**
     * Ant�^�X�N��[executesql]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 17<br>
     * �\�[�X�R�[�h������������SQL��`��SQL�������s���邩�ǂ�����ݒ肷��t���O�B�f�t�H���g�� iterator�Biterator:�����^�̂�SQL�������s���Č��؂���Bnone:SQL���͎��s���Ȃ��B<br>
     *
     * @param arg �Z�b�g�������l
     */
    public void setExecutesql(final String arg) {
        fInput.setExecutesql(arg);
        fIsFieldExecutesqlProcessed = true;
    }

    /**
     * Ant�^�X�N��[executesql]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 17<br>
     * �\�[�X�R�[�h������������SQL��`��SQL�������s���邩�ǂ�����ݒ肷��t���O�B�f�t�H���g�� iterator�Biterator:�����^�̂�SQL�������s���Č��؂���Bnone:SQL���͎��s���Ȃ��B<br>
     * �f�t�H���g�l[iterator]���ݒ肳��Ă��܂��BApache Ant�^�X�N��ŃA�g���r���[�g�̎w�肪�����ꍇ�ɂ́A�f�t�H���g�l���ݒ肳��܂��B<br>
     *
     * @return ���̃t�B�[���h�̒l
     */
    public String getExecutesql() {
        return fInput.getExecutesql();
    }

    /**
     * Ant�^�X�N��[encoding]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 18<br>
     * ������������\�[�X�t�@�C���̕����G���R�[�f�B���O���w�肵�܂��B<br>
     *
     * @param arg �Z�b�g�������l
     */
    public void setEncoding(final String arg) {
        fInput.setEncoding(arg);
        fIsFieldEncodingProcessed = true;
    }

    /**
     * Ant�^�X�N��[encoding]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 18<br>
     * ������������\�[�X�t�@�C���̕����G���R�[�f�B���O���w�肵�܂��B<br>
     *
     * @return ���̃t�B�[���h�̒l
     */
    public String getEncoding() {
        return fInput.getEncoding();
    }

    /**
     * Ant�^�X�N��[cache]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 19<br>
     * ��`�����^�t�@�C�����璆��XML�t�@�C���ւ̕ϊ����L���b�V���ōς܂����ǂ����̃t���O�B<br>
     *
     * @param arg �Z�b�g�������l
     */
    public void setCache(final String arg) {
        fInput.setCache(arg);
        fIsFieldCacheProcessed = true;
    }

    /**
     * Ant�^�X�N��[cache]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 19<br>
     * ��`�����^�t�@�C�����璆��XML�t�@�C���ւ̕ϊ����L���b�V���ōς܂����ǂ����̃t���O�B<br>
     * �f�t�H���g�l[false]���ݒ肳��Ă��܂��BApache Ant�^�X�N��ŃA�g���r���[�g�̎w�肪�����ꍇ�ɂ́A�f�t�H���g�l���ݒ肳��܂��B<br>
     *
     * @return ���̃t�B�[���h�̒l
     */
    public String getCache() {
        return fInput.getCache();
    }

    /**
     * Ant�^�X�N�̃��C�������BApache Ant���� ���̃��\�b�h���Ăяo����܂��B
     *
     * @throws BuildException �^�X�N�Ƃ��Ă̗�O�����������ꍇ�B
     */
    @Override
    public final void execute() throws BuildException {
        System.out.println("BlancoDbPhpTask begin.");

        // ���ڔԍ�[1]�A�A�g���r���[�g[jdbcdriver]�͕K�{���͂ł��B���̓`�F�b�N���s���܂��B
        if (fIsFieldJdbcdriverProcessed == false) {
            throw new BuildException("�K�{�A�g���r���[�g[jdbcdriver]���ݒ肳��Ă��܂���B�����𒆒f���܂��B");
        }
        // ���ڔԍ�[2]�A�A�g���r���[�g[jdbcurl]�͕K�{���͂ł��B���̓`�F�b�N���s���܂��B
        if (fIsFieldJdbcurlProcessed == false) {
            throw new BuildException("�K�{�A�g���r���[�g[jdbcurl]���ݒ肳��Ă��܂���B�����𒆒f���܂��B");
        }
        // ���ڔԍ�[3]�A�A�g���r���[�g[jdbcuser]�͕K�{���͂ł��B���̓`�F�b�N���s���܂��B
        if (fIsFieldJdbcuserProcessed == false) {
            throw new BuildException("�K�{�A�g���r���[�g[jdbcuser]���ݒ肳��Ă��܂���B�����𒆒f���܂��B");
        }
        // ���ڔԍ�[4]�A�A�g���r���[�g[jdbcpassword]�͕K�{���͂ł��B���̓`�F�b�N���s���܂��B
        if (fIsFieldJdbcpasswordProcessed == false) {
            throw new BuildException("�K�{�A�g���r���[�g[jdbcpassword]���ݒ肳��Ă��܂���B�����𒆒f���܂��B");
        }
        // ���ڔԍ�[6]�A�A�g���r���[�g[metadir]�͕K�{���͂ł��B���̓`�F�b�N���s���܂��B
        if (fIsFieldMetadirProcessed == false) {
            throw new BuildException("�K�{�A�g���r���[�g[metadir]���ݒ肳��Ă��܂���B�����𒆒f���܂��B");
        }
        // ���ڔԍ�[9]�A�A�g���r���[�g[basepackage]�͕K�{���͂ł��B���̓`�F�b�N���s���܂��B
        if (fIsFieldBasepackageProcessed == false) {
            throw new BuildException("�K�{�A�g���r���[�g[basepackage]���ݒ肳��Ă��܂���B�����𒆒f���܂��B");
        }

        if (getVerbose()) {
            System.out.println("- verbose:[true]");
            System.out.println("- jdbcdriver:[" + getJdbcdriver() + "]");
            System.out.println("- jdbcurl:[" + getJdbcurl() + "]");
            System.out.println("- jdbcuser:[" + getJdbcuser() + "]");
            System.out.println("- jdbcpassword:[" + getJdbcpassword() + "]");
            System.out.println("- jdbcdriverfile:[" + getJdbcdriverfile() + "]");
            System.out.println("- metadir:[" + getMetadir() + "]");
            System.out.println("- tmpdir:[" + getTmpdir() + "]");
            System.out.println("- targetdir:[" + getTargetdir() + "]");
            System.out.println("- basepackage:[" + getBasepackage() + "]");
            System.out.println("- runtimepackage:[" + getRuntimepackage() + "]");
            System.out.println("- schema:[" + getSchema() + "]");
            System.out.println("- table:[" + getTable() + "]");
            System.out.println("- sql:[" + getSql() + "]");
            System.out.println("- log:[" + getLog() + "]");
            System.out.println("- executesql:[" + getExecutesql() + "]");
            System.out.println("- encoding:[" + getEncoding() + "]");
            System.out.println("- cache:[" + getCache() + "]");
        }

        try {
            // ���ۂ�Ant�^�X�N�̎又�������s���܂��B
            // ���̉ӏ��ŃR���p�C���G���[����������ꍇ�ABlancoDbPhpProcess�C���^�t�F�[�X���������� blanco.db.task�p�b�P�[�W�� BlancoDbPhpProcessImpl�N���X���쐬���邱�Ƃɂ������ł���ꍇ������܂��B
            final BlancoDbPhpProcess proc = new BlancoDbPhpProcessImpl();
            if (proc.execute(fInput) != BlancoDbPhpBatchProcess.END_SUCCESS) {
                throw new BuildException("�^�X�N�ُ͈�I�����܂����B");
            }
        } catch (IllegalArgumentException e) {
            if (getVerbose()) {
                e.printStackTrace();
            }
            throw new BuildException(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            throw new BuildException("�^�X�N���������ɗ�O���������܂����B�����𒆒f���܂��B" + e.toString());
        } catch (Error e) {
            e.printStackTrace();
            throw new BuildException("�^�X�N���������ɃG���[���������܂����B�����𒆒f���܂��B" + e.toString());
        }
    }
}
