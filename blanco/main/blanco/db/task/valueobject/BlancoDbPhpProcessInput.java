/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ�莩����������܂����B
 */
package blanco.db.task.valueobject;

/**
 * �����N���X [BlancoDbPhpProcess]�̓��̓o�����[�I�u�W�F�N�g�N���X�ł��B
 */
public class BlancoDbPhpProcessInput {
    /**
     * verbose���[�h�œ��삳���邩�ǂ����B
     *
     * �t�B�[���h: [verbose]�B
     * �f�t�H���g: [false]�B
     */
    private boolean fVerbose = false;

    /**
     * JDBC�h���C�o�̃N���X�����w�肵�܂��B
     *
     * �t�B�[���h: [jdbcdriver]�B
     */
    private String fJdbcdriver;

    /**
     * JDBC�ڑ���URL���w�肵�܂��B
     *
     * �t�B�[���h: [jdbcurl]�B
     */
    private String fJdbcurl;

    /**
     * JDBC�f�[�^�x�[�X�ڑ����s���ۂ̃��[�U�����w�肵�܂��B
     *
     * �t�B�[���h: [jdbcuser]�B
     */
    private String fJdbcuser;

    /**
     * JDBC�f�[�^�x�[�X�ڑ����s���ۂ̃p�X���[�h���w�肵�܂��B
     *
     * �t�B�[���h: [jdbcpassword]�B
     */
    private String fJdbcpassword;

    /**
     * JDBC�h���C�o�� jar �t�@�C�������w�肵�܂��B�ʏ�͗��p���܂���B
     *
     * �t�B�[���h: [jdbcdriverfile]�B
     */
    private String fJdbcdriverfile;

    /**
     * SQL��`���^�t�@�C�����i�[����Ă���f�B���N�g�����w�肵�܂��B
     *
     * �t�B�[���h: [metadir]�B
     */
    private String fMetadir;

    /**
     * �e���|�����t�H���_���w�肵�܂��B���w��̏ꍇ�ɂ̓J�����g������tmp�t�H���_�𗘗p���܂��B
     *
     * �t�B�[���h: [tmpdir]�B
     * �f�t�H���g: [tmp]�B
     */
    private String fTmpdir = "tmp";

    /**
     * BlancoDb��PHP�\�[�X�R�[�h���o�͂���f�B���N�g�����w�肵�܂��B
     *
     * �t�B�[���h: [targetdir]�B
     * �f�t�H���g: [blanco.php]�B
     */
    private String fTargetdir = "blanco.php";

    /**
     * BlancoDb��PHP�\�[�X�R�[�h�𐶐�����ۂ̊�ƂȂ�p�b�P�[�W�����w�肵�܂��B
     *
     * �t�B�[���h: [basepackage]�B
     */
    private String fBasepackage;

    /**
     * �����^�C���N���X�𐶐����鐶������w�肵�܂��B���w��̏ꍇ�ɂ� basepackage����ɐ�������܂��B
     *
     * �t�B�[���h: [runtimepackage]�B
     */
    private String fRuntimepackage;

    /**
     * �P��\�����擾����ۂ̃X�L�[�}���B��{�I�ɖ��w��ł��B������Oracle�̏ꍇ�ɂ̂݁A���[�U����啶�����������̂��w�肵�܂��BOracle�̏ꍇ�� ������w�肵�Ȃ��ƁA�V�X�e���\�܂Ō������Ă��܂��s����������邽�߂ł��B�������_�ł̓T�|�[�g����Ȃ��I�v�V�����ł��B
     *
     * �t�B�[���h: [schema]�B
     */
    private String fSchema;

    /**
     * true��ݒ肷��ƒP��\�̂��߂̃A�N�Z�T�E�R�[�h�𐶐����܂��B
     *
     * �t�B�[���h: [table]�B
     * �f�t�H���g: [false]�B
     */
    private String fTable = "false";

    /**
     * true��ݒ肷���SQL��`����R�[�h�𐶐����܂��B
     *
     * �t�B�[���h: [sql]�B
     * �f�t�H���g: [false]�B
     */
    private String fSql = "false";

    /**
     * True��ݒ肷��ƃ��M���O�R�[�h�𐶐����܂��B�������_�ł̓T�|�[�g����Ȃ��I�v�V�����ł��B
     *
     * �t�B�[���h: [log]�B
     * �f�t�H���g: [false]�B
     */
    private String fLog = "false";

    /**
     * �\�[�X�R�[�h������������SQL��`��SQL�������s���邩�ǂ�����ݒ肷��t���O�B�f�t�H���g�� iterator�Biterator:�����^�̂�SQL�������s���Č��؂���Bnone:SQL���͎��s���Ȃ��B
     *
     * �t�B�[���h: [executesql]�B
     * �f�t�H���g: [iterator]�B
     */
    private String fExecutesql = "iterator";

    /**
     * ������������\�[�X�t�@�C���̕����G���R�[�f�B���O���w�肵�܂��B
     *
     * �t�B�[���h: [encoding]�B
     */
    private String fEncoding;

    /**
     * ��`�����^�t�@�C�����璆��XML�t�@�C���ւ̕ϊ����L���b�V���ōς܂����ǂ����̃t���O�B
     *
     * �t�B�[���h: [cache]�B
     * �f�t�H���g: [false]�B
     */
    private String fCache = "false";

    /**
     * �t�B�[���h [verbose] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [verbose���[�h�œ��삳���邩�ǂ����B]�B
     *
     * @param argVerbose �t�B�[���h[verbose]�ɐݒ肷��l�B
     */
    public void setVerbose(final boolean argVerbose) {
        fVerbose = argVerbose;
    }

    /**
     * �t�B�[���h [verbose] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [verbose���[�h�œ��삳���邩�ǂ����B]�B
     * �f�t�H���g: [false]�B
     *
     * @return �t�B�[���h[verbose]����擾�����l�B
     */
    public boolean getVerbose() {
        return fVerbose;
    }

    /**
     * �t�B�[���h [jdbcdriver] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [JDBC�h���C�o�̃N���X�����w�肵�܂��B]�B
     *
     * @param argJdbcdriver �t�B�[���h[jdbcdriver]�ɐݒ肷��l�B
     */
    public void setJdbcdriver(final String argJdbcdriver) {
        fJdbcdriver = argJdbcdriver;
    }

    /**
     * �t�B�[���h [jdbcdriver] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [JDBC�h���C�o�̃N���X�����w�肵�܂��B]�B
     *
     * @return �t�B�[���h[jdbcdriver]����擾�����l�B
     */
    public String getJdbcdriver() {
        return fJdbcdriver;
    }

    /**
     * �t�B�[���h [jdbcurl] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [JDBC�ڑ���URL���w�肵�܂��B]�B
     *
     * @param argJdbcurl �t�B�[���h[jdbcurl]�ɐݒ肷��l�B
     */
    public void setJdbcurl(final String argJdbcurl) {
        fJdbcurl = argJdbcurl;
    }

    /**
     * �t�B�[���h [jdbcurl] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [JDBC�ڑ���URL���w�肵�܂��B]�B
     *
     * @return �t�B�[���h[jdbcurl]����擾�����l�B
     */
    public String getJdbcurl() {
        return fJdbcurl;
    }

    /**
     * �t�B�[���h [jdbcuser] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [JDBC�f�[�^�x�[�X�ڑ����s���ۂ̃��[�U�����w�肵�܂��B]�B
     *
     * @param argJdbcuser �t�B�[���h[jdbcuser]�ɐݒ肷��l�B
     */
    public void setJdbcuser(final String argJdbcuser) {
        fJdbcuser = argJdbcuser;
    }

    /**
     * �t�B�[���h [jdbcuser] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [JDBC�f�[�^�x�[�X�ڑ����s���ۂ̃��[�U�����w�肵�܂��B]�B
     *
     * @return �t�B�[���h[jdbcuser]����擾�����l�B
     */
    public String getJdbcuser() {
        return fJdbcuser;
    }

    /**
     * �t�B�[���h [jdbcpassword] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [JDBC�f�[�^�x�[�X�ڑ����s���ۂ̃p�X���[�h���w�肵�܂��B]�B
     *
     * @param argJdbcpassword �t�B�[���h[jdbcpassword]�ɐݒ肷��l�B
     */
    public void setJdbcpassword(final String argJdbcpassword) {
        fJdbcpassword = argJdbcpassword;
    }

    /**
     * �t�B�[���h [jdbcpassword] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [JDBC�f�[�^�x�[�X�ڑ����s���ۂ̃p�X���[�h���w�肵�܂��B]�B
     *
     * @return �t�B�[���h[jdbcpassword]����擾�����l�B
     */
    public String getJdbcpassword() {
        return fJdbcpassword;
    }

    /**
     * �t�B�[���h [jdbcdriverfile] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [JDBC�h���C�o�� jar �t�@�C�������w�肵�܂��B�ʏ�͗��p���܂���B]�B
     *
     * @param argJdbcdriverfile �t�B�[���h[jdbcdriverfile]�ɐݒ肷��l�B
     */
    public void setJdbcdriverfile(final String argJdbcdriverfile) {
        fJdbcdriverfile = argJdbcdriverfile;
    }

    /**
     * �t�B�[���h [jdbcdriverfile] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [JDBC�h���C�o�� jar �t�@�C�������w�肵�܂��B�ʏ�͗��p���܂���B]�B
     *
     * @return �t�B�[���h[jdbcdriverfile]����擾�����l�B
     */
    public String getJdbcdriverfile() {
        return fJdbcdriverfile;
    }

    /**
     * �t�B�[���h [metadir] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [SQL��`���^�t�@�C�����i�[����Ă���f�B���N�g�����w�肵�܂��B]�B
     *
     * @param argMetadir �t�B�[���h[metadir]�ɐݒ肷��l�B
     */
    public void setMetadir(final String argMetadir) {
        fMetadir = argMetadir;
    }

    /**
     * �t�B�[���h [metadir] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [SQL��`���^�t�@�C�����i�[����Ă���f�B���N�g�����w�肵�܂��B]�B
     *
     * @return �t�B�[���h[metadir]����擾�����l�B
     */
    public String getMetadir() {
        return fMetadir;
    }

    /**
     * �t�B�[���h [tmpdir] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�e���|�����t�H���_���w�肵�܂��B���w��̏ꍇ�ɂ̓J�����g������tmp�t�H���_�𗘗p���܂��B]�B
     *
     * @param argTmpdir �t�B�[���h[tmpdir]�ɐݒ肷��l�B
     */
    public void setTmpdir(final String argTmpdir) {
        fTmpdir = argTmpdir;
    }

    /**
     * �t�B�[���h [tmpdir] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�e���|�����t�H���_���w�肵�܂��B���w��̏ꍇ�ɂ̓J�����g������tmp�t�H���_�𗘗p���܂��B]�B
     * �f�t�H���g: [tmp]�B
     *
     * @return �t�B�[���h[tmpdir]����擾�����l�B
     */
    public String getTmpdir() {
        return fTmpdir;
    }

    /**
     * �t�B�[���h [targetdir] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [BlancoDb��PHP�\�[�X�R�[�h���o�͂���f�B���N�g�����w�肵�܂��B]�B
     *
     * @param argTargetdir �t�B�[���h[targetdir]�ɐݒ肷��l�B
     */
    public void setTargetdir(final String argTargetdir) {
        fTargetdir = argTargetdir;
    }

    /**
     * �t�B�[���h [targetdir] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [BlancoDb��PHP�\�[�X�R�[�h���o�͂���f�B���N�g�����w�肵�܂��B]�B
     * �f�t�H���g: [blanco.php]�B
     *
     * @return �t�B�[���h[targetdir]����擾�����l�B
     */
    public String getTargetdir() {
        return fTargetdir;
    }

    /**
     * �t�B�[���h [basepackage] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [BlancoDb��PHP�\�[�X�R�[�h�𐶐�����ۂ̊�ƂȂ�p�b�P�[�W�����w�肵�܂��B]�B
     *
     * @param argBasepackage �t�B�[���h[basepackage]�ɐݒ肷��l�B
     */
    public void setBasepackage(final String argBasepackage) {
        fBasepackage = argBasepackage;
    }

    /**
     * �t�B�[���h [basepackage] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [BlancoDb��PHP�\�[�X�R�[�h�𐶐�����ۂ̊�ƂȂ�p�b�P�[�W�����w�肵�܂��B]�B
     *
     * @return �t�B�[���h[basepackage]����擾�����l�B
     */
    public String getBasepackage() {
        return fBasepackage;
    }

    /**
     * �t�B�[���h [runtimepackage] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�����^�C���N���X�𐶐����鐶������w�肵�܂��B���w��̏ꍇ�ɂ� basepackage����ɐ�������܂��B]�B
     *
     * @param argRuntimepackage �t�B�[���h[runtimepackage]�ɐݒ肷��l�B
     */
    public void setRuntimepackage(final String argRuntimepackage) {
        fRuntimepackage = argRuntimepackage;
    }

    /**
     * �t�B�[���h [runtimepackage] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�����^�C���N���X�𐶐����鐶������w�肵�܂��B���w��̏ꍇ�ɂ� basepackage����ɐ�������܂��B]�B
     *
     * @return �t�B�[���h[runtimepackage]����擾�����l�B
     */
    public String getRuntimepackage() {
        return fRuntimepackage;
    }

    /**
     * �t�B�[���h [schema] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�P��\�����擾����ۂ̃X�L�[�}���B��{�I�ɖ��w��ł��B������Oracle�̏ꍇ�ɂ̂݁A���[�U����啶�����������̂��w�肵�܂��BOracle�̏ꍇ�� ������w�肵�Ȃ��ƁA�V�X�e���\�܂Ō������Ă��܂��s����������邽�߂ł��B�������_�ł̓T�|�[�g����Ȃ��I�v�V�����ł��B]�B
     *
     * @param argSchema �t�B�[���h[schema]�ɐݒ肷��l�B
     */
    public void setSchema(final String argSchema) {
        fSchema = argSchema;
    }

    /**
     * �t�B�[���h [schema] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�P��\�����擾����ۂ̃X�L�[�}���B��{�I�ɖ��w��ł��B������Oracle�̏ꍇ�ɂ̂݁A���[�U����啶�����������̂��w�肵�܂��BOracle�̏ꍇ�� ������w�肵�Ȃ��ƁA�V�X�e���\�܂Ō������Ă��܂��s����������邽�߂ł��B�������_�ł̓T�|�[�g����Ȃ��I�v�V�����ł��B]�B
     *
     * @return �t�B�[���h[schema]����擾�����l�B
     */
    public String getSchema() {
        return fSchema;
    }

    /**
     * �t�B�[���h [table] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [true��ݒ肷��ƒP��\�̂��߂̃A�N�Z�T�E�R�[�h�𐶐����܂��B]�B
     *
     * @param argTable �t�B�[���h[table]�ɐݒ肷��l�B
     */
    public void setTable(final String argTable) {
        fTable = argTable;
    }

    /**
     * �t�B�[���h [table] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [true��ݒ肷��ƒP��\�̂��߂̃A�N�Z�T�E�R�[�h�𐶐����܂��B]�B
     * �f�t�H���g: [false]�B
     *
     * @return �t�B�[���h[table]����擾�����l�B
     */
    public String getTable() {
        return fTable;
    }

    /**
     * �t�B�[���h [sql] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [true��ݒ肷���SQL��`����R�[�h�𐶐����܂��B]�B
     *
     * @param argSql �t�B�[���h[sql]�ɐݒ肷��l�B
     */
    public void setSql(final String argSql) {
        fSql = argSql;
    }

    /**
     * �t�B�[���h [sql] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [true��ݒ肷���SQL��`����R�[�h�𐶐����܂��B]�B
     * �f�t�H���g: [false]�B
     *
     * @return �t�B�[���h[sql]����擾�����l�B
     */
    public String getSql() {
        return fSql;
    }

    /**
     * �t�B�[���h [log] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [True��ݒ肷��ƃ��M���O�R�[�h�𐶐����܂��B�������_�ł̓T�|�[�g����Ȃ��I�v�V�����ł��B]�B
     *
     * @param argLog �t�B�[���h[log]�ɐݒ肷��l�B
     */
    public void setLog(final String argLog) {
        fLog = argLog;
    }

    /**
     * �t�B�[���h [log] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [True��ݒ肷��ƃ��M���O�R�[�h�𐶐����܂��B�������_�ł̓T�|�[�g����Ȃ��I�v�V�����ł��B]�B
     * �f�t�H���g: [false]�B
     *
     * @return �t�B�[���h[log]����擾�����l�B
     */
    public String getLog() {
        return fLog;
    }

    /**
     * �t�B�[���h [executesql] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�\�[�X�R�[�h������������SQL��`��SQL�������s���邩�ǂ�����ݒ肷��t���O�B�f�t�H���g�� iterator�Biterator:�����^�̂�SQL�������s���Č��؂���Bnone:SQL���͎��s���Ȃ��B]�B
     *
     * @param argExecutesql �t�B�[���h[executesql]�ɐݒ肷��l�B
     */
    public void setExecutesql(final String argExecutesql) {
        fExecutesql = argExecutesql;
    }

    /**
     * �t�B�[���h [executesql] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�\�[�X�R�[�h������������SQL��`��SQL�������s���邩�ǂ�����ݒ肷��t���O�B�f�t�H���g�� iterator�Biterator:�����^�̂�SQL�������s���Č��؂���Bnone:SQL���͎��s���Ȃ��B]�B
     * �f�t�H���g: [iterator]�B
     *
     * @return �t�B�[���h[executesql]����擾�����l�B
     */
    public String getExecutesql() {
        return fExecutesql;
    }

    /**
     * �t�B�[���h [encoding] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [������������\�[�X�t�@�C���̕����G���R�[�f�B���O���w�肵�܂��B]�B
     *
     * @param argEncoding �t�B�[���h[encoding]�ɐݒ肷��l�B
     */
    public void setEncoding(final String argEncoding) {
        fEncoding = argEncoding;
    }

    /**
     * �t�B�[���h [encoding] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [������������\�[�X�t�@�C���̕����G���R�[�f�B���O���w�肵�܂��B]�B
     *
     * @return �t�B�[���h[encoding]����擾�����l�B
     */
    public String getEncoding() {
        return fEncoding;
    }

    /**
     * �t�B�[���h [cache] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [��`�����^�t�@�C�����璆��XML�t�@�C���ւ̕ϊ����L���b�V���ōς܂����ǂ����̃t���O�B]�B
     *
     * @param argCache �t�B�[���h[cache]�ɐݒ肷��l�B
     */
    public void setCache(final String argCache) {
        fCache = argCache;
    }

    /**
     * �t�B�[���h [cache] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [��`�����^�t�@�C�����璆��XML�t�@�C���ւ̕ϊ����L���b�V���ōς܂����ǂ����̃t���O�B]�B
     * �f�t�H���g: [false]�B
     *
     * @return �t�B�[���h[cache]����擾�����l�B
     */
    public String getCache() {
        return fCache;
    }

    /**
     * ���̃o�����[�I�u�W�F�N�g�̕�����\�����擾���܂��B
     *
     * <P>�g�p��̒���</P>
     * <UL>
     * <LI>�I�u�W�F�N�g�̃V�����[�͈͂̂ݕ����񉻂̏����ΏۂƂȂ�܂��B
     * <LI>�I�u�W�F�N�g���z�Q�Ƃ��Ă���ꍇ�ɂ́A���̃��\�b�h�͎g��Ȃ��ł��������B
     * </UL>
     *
     * @return �o�����[�I�u�W�F�N�g�̕�����\���B
     */
    @Override
    public String toString() {
        final StringBuffer buf = new StringBuffer();
        buf.append("blanco.db.task.valueobject.BlancoDbPhpProcessInput[");
        buf.append("verbose=" + fVerbose);
        buf.append(",jdbcdriver=" + fJdbcdriver);
        buf.append(",jdbcurl=" + fJdbcurl);
        buf.append(",jdbcuser=" + fJdbcuser);
        buf.append(",jdbcpassword=" + fJdbcpassword);
        buf.append(",jdbcdriverfile=" + fJdbcdriverfile);
        buf.append(",metadir=" + fMetadir);
        buf.append(",tmpdir=" + fTmpdir);
        buf.append(",targetdir=" + fTargetdir);
        buf.append(",basepackage=" + fBasepackage);
        buf.append(",runtimepackage=" + fRuntimepackage);
        buf.append(",schema=" + fSchema);
        buf.append(",table=" + fTable);
        buf.append(",sql=" + fSql);
        buf.append(",log=" + fLog);
        buf.append(",executesql=" + fExecutesql);
        buf.append(",encoding=" + fEncoding);
        buf.append(",cache=" + fCache);
        buf.append("]");
        return buf.toString();
    }
}
