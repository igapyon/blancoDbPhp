/*
 * このソースコードは blanco Frameworkにより自動生成されました。
 */
package blanco.db.task.valueobject;

/**
 * 処理クラス [BlancoDbPhpProcess]の入力バリューオブジェクトクラスです。
 */
public class BlancoDbPhpProcessInput {
    /**
     * verboseモードで動作させるかどうか。
     *
     * フィールド: [verbose]。
     * デフォルト: [false]。
     */
    private boolean fVerbose = false;

    /**
     * JDBCドライバのクラス名を指定します。
     *
     * フィールド: [jdbcdriver]。
     */
    private String fJdbcdriver;

    /**
     * JDBC接続先URLを指定します。
     *
     * フィールド: [jdbcurl]。
     */
    private String fJdbcurl;

    /**
     * JDBCデータベース接続を行う際のユーザ名を指定します。
     *
     * フィールド: [jdbcuser]。
     */
    private String fJdbcuser;

    /**
     * JDBCデータベース接続を行う際のパスワードを指定します。
     *
     * フィールド: [jdbcpassword]。
     */
    private String fJdbcpassword;

    /**
     * JDBCドライバの jar ファイル名を指定します。通常は利用しません。
     *
     * フィールド: [jdbcdriverfile]。
     */
    private String fJdbcdriverfile;

    /**
     * SQL定義メタファイルが格納されているディレクトリを指定します。
     *
     * フィールド: [metadir]。
     */
    private String fMetadir;

    /**
     * テンポラリフォルダを指定します。無指定の場合にはカレント直下のtmpフォルダを利用します。
     *
     * フィールド: [tmpdir]。
     * デフォルト: [tmp]。
     */
    private String fTmpdir = "tmp";

    /**
     * BlancoDbがPHPソースコードを出力するディレクトリを指定します。
     *
     * フィールド: [targetdir]。
     * デフォルト: [blanco.php]。
     */
    private String fTargetdir = "blanco.php";

    /**
     * BlancoDbがPHPソースコードを生成する際の基準となるパッケージ名を指定します。
     *
     * フィールド: [basepackage]。
     */
    private String fBasepackage;

    /**
     * ランタイムクラスを生成する生成先を指定します。無指定の場合には basepackageを基準に生成されます。
     *
     * フィールド: [runtimepackage]。
     */
    private String fRuntimepackage;

    /**
     * 単一表情報を取得する際のスキーマ名。基本的に無指定です。ただしOracleの場合にのみ、ユーザ名を大文字化したものを指定します。Oracleの場合に これを指定しないと、システム表まで検索してしまい不具合が発生するためです。※現時点ではサポートされないオプションです。
     *
     * フィールド: [schema]。
     */
    private String fSchema;

    /**
     * trueを設定すると単一表のためのアクセサ・コードを生成します。
     *
     * フィールド: [table]。
     * デフォルト: [false]。
     */
    private String fTable = "false";

    /**
     * trueを設定するとSQL定義からコードを生成します。
     *
     * フィールド: [sql]。
     * デフォルト: [false]。
     */
    private String fSql = "false";

    /**
     * Trueを設定するとロギングコードを生成します。※現時点ではサポートされないオプションです。
     *
     * フィールド: [log]。
     * デフォルト: [false]。
     */
    private String fLog = "false";

    /**
     * ソースコード自動生成時にSQL定義のSQL文を実行するかどうかを設定するフラグ。デフォルトは iterator。iterator:検索型のみSQL文を実行して検証する。none:SQL文は実行しない。
     *
     * フィールド: [executesql]。
     * デフォルト: [iterator]。
     */
    private String fExecutesql = "iterator";

    /**
     * 自動生成するソースファイルの文字エンコーディングを指定します。
     *
     * フィールド: [encoding]。
     */
    private String fEncoding;

    /**
     * 定義書メタファイルから中間XMLファイルへの変換をキャッシュで済ますかどうかのフラグ。
     *
     * フィールド: [cache]。
     * デフォルト: [false]。
     */
    private String fCache = "false";

    /**
     * フィールド [verbose] の値を設定します。
     *
     * フィールドの説明: [verboseモードで動作させるかどうか。]。
     *
     * @param argVerbose フィールド[verbose]に設定する値。
     */
    public void setVerbose(final boolean argVerbose) {
        fVerbose = argVerbose;
    }

    /**
     * フィールド [verbose] の値を取得します。
     *
     * フィールドの説明: [verboseモードで動作させるかどうか。]。
     * デフォルト: [false]。
     *
     * @return フィールド[verbose]から取得した値。
     */
    public boolean getVerbose() {
        return fVerbose;
    }

    /**
     * フィールド [jdbcdriver] の値を設定します。
     *
     * フィールドの説明: [JDBCドライバのクラス名を指定します。]。
     *
     * @param argJdbcdriver フィールド[jdbcdriver]に設定する値。
     */
    public void setJdbcdriver(final String argJdbcdriver) {
        fJdbcdriver = argJdbcdriver;
    }

    /**
     * フィールド [jdbcdriver] の値を取得します。
     *
     * フィールドの説明: [JDBCドライバのクラス名を指定します。]。
     *
     * @return フィールド[jdbcdriver]から取得した値。
     */
    public String getJdbcdriver() {
        return fJdbcdriver;
    }

    /**
     * フィールド [jdbcurl] の値を設定します。
     *
     * フィールドの説明: [JDBC接続先URLを指定します。]。
     *
     * @param argJdbcurl フィールド[jdbcurl]に設定する値。
     */
    public void setJdbcurl(final String argJdbcurl) {
        fJdbcurl = argJdbcurl;
    }

    /**
     * フィールド [jdbcurl] の値を取得します。
     *
     * フィールドの説明: [JDBC接続先URLを指定します。]。
     *
     * @return フィールド[jdbcurl]から取得した値。
     */
    public String getJdbcurl() {
        return fJdbcurl;
    }

    /**
     * フィールド [jdbcuser] の値を設定します。
     *
     * フィールドの説明: [JDBCデータベース接続を行う際のユーザ名を指定します。]。
     *
     * @param argJdbcuser フィールド[jdbcuser]に設定する値。
     */
    public void setJdbcuser(final String argJdbcuser) {
        fJdbcuser = argJdbcuser;
    }

    /**
     * フィールド [jdbcuser] の値を取得します。
     *
     * フィールドの説明: [JDBCデータベース接続を行う際のユーザ名を指定します。]。
     *
     * @return フィールド[jdbcuser]から取得した値。
     */
    public String getJdbcuser() {
        return fJdbcuser;
    }

    /**
     * フィールド [jdbcpassword] の値を設定します。
     *
     * フィールドの説明: [JDBCデータベース接続を行う際のパスワードを指定します。]。
     *
     * @param argJdbcpassword フィールド[jdbcpassword]に設定する値。
     */
    public void setJdbcpassword(final String argJdbcpassword) {
        fJdbcpassword = argJdbcpassword;
    }

    /**
     * フィールド [jdbcpassword] の値を取得します。
     *
     * フィールドの説明: [JDBCデータベース接続を行う際のパスワードを指定します。]。
     *
     * @return フィールド[jdbcpassword]から取得した値。
     */
    public String getJdbcpassword() {
        return fJdbcpassword;
    }

    /**
     * フィールド [jdbcdriverfile] の値を設定します。
     *
     * フィールドの説明: [JDBCドライバの jar ファイル名を指定します。通常は利用しません。]。
     *
     * @param argJdbcdriverfile フィールド[jdbcdriverfile]に設定する値。
     */
    public void setJdbcdriverfile(final String argJdbcdriverfile) {
        fJdbcdriverfile = argJdbcdriverfile;
    }

    /**
     * フィールド [jdbcdriverfile] の値を取得します。
     *
     * フィールドの説明: [JDBCドライバの jar ファイル名を指定します。通常は利用しません。]。
     *
     * @return フィールド[jdbcdriverfile]から取得した値。
     */
    public String getJdbcdriverfile() {
        return fJdbcdriverfile;
    }

    /**
     * フィールド [metadir] の値を設定します。
     *
     * フィールドの説明: [SQL定義メタファイルが格納されているディレクトリを指定します。]。
     *
     * @param argMetadir フィールド[metadir]に設定する値。
     */
    public void setMetadir(final String argMetadir) {
        fMetadir = argMetadir;
    }

    /**
     * フィールド [metadir] の値を取得します。
     *
     * フィールドの説明: [SQL定義メタファイルが格納されているディレクトリを指定します。]。
     *
     * @return フィールド[metadir]から取得した値。
     */
    public String getMetadir() {
        return fMetadir;
    }

    /**
     * フィールド [tmpdir] の値を設定します。
     *
     * フィールドの説明: [テンポラリフォルダを指定します。無指定の場合にはカレント直下のtmpフォルダを利用します。]。
     *
     * @param argTmpdir フィールド[tmpdir]に設定する値。
     */
    public void setTmpdir(final String argTmpdir) {
        fTmpdir = argTmpdir;
    }

    /**
     * フィールド [tmpdir] の値を取得します。
     *
     * フィールドの説明: [テンポラリフォルダを指定します。無指定の場合にはカレント直下のtmpフォルダを利用します。]。
     * デフォルト: [tmp]。
     *
     * @return フィールド[tmpdir]から取得した値。
     */
    public String getTmpdir() {
        return fTmpdir;
    }

    /**
     * フィールド [targetdir] の値を設定します。
     *
     * フィールドの説明: [BlancoDbがPHPソースコードを出力するディレクトリを指定します。]。
     *
     * @param argTargetdir フィールド[targetdir]に設定する値。
     */
    public void setTargetdir(final String argTargetdir) {
        fTargetdir = argTargetdir;
    }

    /**
     * フィールド [targetdir] の値を取得します。
     *
     * フィールドの説明: [BlancoDbがPHPソースコードを出力するディレクトリを指定します。]。
     * デフォルト: [blanco.php]。
     *
     * @return フィールド[targetdir]から取得した値。
     */
    public String getTargetdir() {
        return fTargetdir;
    }

    /**
     * フィールド [basepackage] の値を設定します。
     *
     * フィールドの説明: [BlancoDbがPHPソースコードを生成する際の基準となるパッケージ名を指定します。]。
     *
     * @param argBasepackage フィールド[basepackage]に設定する値。
     */
    public void setBasepackage(final String argBasepackage) {
        fBasepackage = argBasepackage;
    }

    /**
     * フィールド [basepackage] の値を取得します。
     *
     * フィールドの説明: [BlancoDbがPHPソースコードを生成する際の基準となるパッケージ名を指定します。]。
     *
     * @return フィールド[basepackage]から取得した値。
     */
    public String getBasepackage() {
        return fBasepackage;
    }

    /**
     * フィールド [runtimepackage] の値を設定します。
     *
     * フィールドの説明: [ランタイムクラスを生成する生成先を指定します。無指定の場合には basepackageを基準に生成されます。]。
     *
     * @param argRuntimepackage フィールド[runtimepackage]に設定する値。
     */
    public void setRuntimepackage(final String argRuntimepackage) {
        fRuntimepackage = argRuntimepackage;
    }

    /**
     * フィールド [runtimepackage] の値を取得します。
     *
     * フィールドの説明: [ランタイムクラスを生成する生成先を指定します。無指定の場合には basepackageを基準に生成されます。]。
     *
     * @return フィールド[runtimepackage]から取得した値。
     */
    public String getRuntimepackage() {
        return fRuntimepackage;
    }

    /**
     * フィールド [schema] の値を設定します。
     *
     * フィールドの説明: [単一表情報を取得する際のスキーマ名。基本的に無指定です。ただしOracleの場合にのみ、ユーザ名を大文字化したものを指定します。Oracleの場合に これを指定しないと、システム表まで検索してしまい不具合が発生するためです。※現時点ではサポートされないオプションです。]。
     *
     * @param argSchema フィールド[schema]に設定する値。
     */
    public void setSchema(final String argSchema) {
        fSchema = argSchema;
    }

    /**
     * フィールド [schema] の値を取得します。
     *
     * フィールドの説明: [単一表情報を取得する際のスキーマ名。基本的に無指定です。ただしOracleの場合にのみ、ユーザ名を大文字化したものを指定します。Oracleの場合に これを指定しないと、システム表まで検索してしまい不具合が発生するためです。※現時点ではサポートされないオプションです。]。
     *
     * @return フィールド[schema]から取得した値。
     */
    public String getSchema() {
        return fSchema;
    }

    /**
     * フィールド [table] の値を設定します。
     *
     * フィールドの説明: [trueを設定すると単一表のためのアクセサ・コードを生成します。]。
     *
     * @param argTable フィールド[table]に設定する値。
     */
    public void setTable(final String argTable) {
        fTable = argTable;
    }

    /**
     * フィールド [table] の値を取得します。
     *
     * フィールドの説明: [trueを設定すると単一表のためのアクセサ・コードを生成します。]。
     * デフォルト: [false]。
     *
     * @return フィールド[table]から取得した値。
     */
    public String getTable() {
        return fTable;
    }

    /**
     * フィールド [sql] の値を設定します。
     *
     * フィールドの説明: [trueを設定するとSQL定義からコードを生成します。]。
     *
     * @param argSql フィールド[sql]に設定する値。
     */
    public void setSql(final String argSql) {
        fSql = argSql;
    }

    /**
     * フィールド [sql] の値を取得します。
     *
     * フィールドの説明: [trueを設定するとSQL定義からコードを生成します。]。
     * デフォルト: [false]。
     *
     * @return フィールド[sql]から取得した値。
     */
    public String getSql() {
        return fSql;
    }

    /**
     * フィールド [log] の値を設定します。
     *
     * フィールドの説明: [Trueを設定するとロギングコードを生成します。※現時点ではサポートされないオプションです。]。
     *
     * @param argLog フィールド[log]に設定する値。
     */
    public void setLog(final String argLog) {
        fLog = argLog;
    }

    /**
     * フィールド [log] の値を取得します。
     *
     * フィールドの説明: [Trueを設定するとロギングコードを生成します。※現時点ではサポートされないオプションです。]。
     * デフォルト: [false]。
     *
     * @return フィールド[log]から取得した値。
     */
    public String getLog() {
        return fLog;
    }

    /**
     * フィールド [executesql] の値を設定します。
     *
     * フィールドの説明: [ソースコード自動生成時にSQL定義のSQL文を実行するかどうかを設定するフラグ。デフォルトは iterator。iterator:検索型のみSQL文を実行して検証する。none:SQL文は実行しない。]。
     *
     * @param argExecutesql フィールド[executesql]に設定する値。
     */
    public void setExecutesql(final String argExecutesql) {
        fExecutesql = argExecutesql;
    }

    /**
     * フィールド [executesql] の値を取得します。
     *
     * フィールドの説明: [ソースコード自動生成時にSQL定義のSQL文を実行するかどうかを設定するフラグ。デフォルトは iterator。iterator:検索型のみSQL文を実行して検証する。none:SQL文は実行しない。]。
     * デフォルト: [iterator]。
     *
     * @return フィールド[executesql]から取得した値。
     */
    public String getExecutesql() {
        return fExecutesql;
    }

    /**
     * フィールド [encoding] の値を設定します。
     *
     * フィールドの説明: [自動生成するソースファイルの文字エンコーディングを指定します。]。
     *
     * @param argEncoding フィールド[encoding]に設定する値。
     */
    public void setEncoding(final String argEncoding) {
        fEncoding = argEncoding;
    }

    /**
     * フィールド [encoding] の値を取得します。
     *
     * フィールドの説明: [自動生成するソースファイルの文字エンコーディングを指定します。]。
     *
     * @return フィールド[encoding]から取得した値。
     */
    public String getEncoding() {
        return fEncoding;
    }

    /**
     * フィールド [cache] の値を設定します。
     *
     * フィールドの説明: [定義書メタファイルから中間XMLファイルへの変換をキャッシュで済ますかどうかのフラグ。]。
     *
     * @param argCache フィールド[cache]に設定する値。
     */
    public void setCache(final String argCache) {
        fCache = argCache;
    }

    /**
     * フィールド [cache] の値を取得します。
     *
     * フィールドの説明: [定義書メタファイルから中間XMLファイルへの変換をキャッシュで済ますかどうかのフラグ。]。
     * デフォルト: [false]。
     *
     * @return フィールド[cache]から取得した値。
     */
    public String getCache() {
        return fCache;
    }

    /**
     * このバリューオブジェクトの文字列表現を取得します。
     *
     * <P>使用上の注意</P>
     * <UL>
     * <LI>オブジェクトのシャロー範囲のみ文字列化の処理対象となります。
     * <LI>オブジェクトが循環参照している場合には、このメソッドは使わないでください。
     * </UL>
     *
     * @return バリューオブジェクトの文字列表現。
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
