/*
 * このソースコードは blanco Frameworkにより自動生成されました。
 */
package blanco.db.resourcebundle;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * blancoDbPhpが利用するリソースバンドルです。
 *
 * リソースバンドル定義: [blancoDbPhp]。<BR>
 * このクラスはリソースバンドル定義書から自動生成されたリソースバンドルクラスです。<BR>
 * 既知のロケール<BR>
 * <UL>
 * <LI>ja
 * </UL>
 */
public class BlancoDbPhpResourceBundle {
    /**
     * リソースバンドルオブジェクト。
     *
     * 内部的に実際に入力を行うリソースバンドルを記憶します。
     */
    private ResourceBundle fResourceBundle;

    /**
     * BlancoDbPhpResourceBundleクラスのコンストラクタ。
     *
     * 基底名[blancoDbPhp]、デフォルトのロケール、呼び出し側のクラスローダを使用して、リソースバンドルを取得します。
     */
    public BlancoDbPhpResourceBundle() {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/db/resourcebundle/blancoDbPhp");
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoDbPhpResourceBundleクラスのコンストラクタ。
     *
     * 基底名[blancoDbPhp]、指定されたロケール、呼び出し側のクラスローダを使用して、リソースバンドルを取得します。
     *
     * @param locale ロケールの指定
     */
    public BlancoDbPhpResourceBundle(final Locale locale) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/db/resourcebundle/blancoDbPhp", locale);
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoDbPhpResourceBundleクラスのコンストラクタ。
     *
     * 基底名[blancoDbPhp]、指定されたロケール、指定されたクラスローダを使用して、リソースバンドルを取得します。
     *
     * @param locale ロケールの指定
     * @param loader クラスローダの指定
     */
    public BlancoDbPhpResourceBundle(final Locale locale, final ClassLoader loader) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/db/resourcebundle/blancoDbPhp", locale, loader);
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * 内部的に保持しているリソースバンドルオブジェクトを取得します。
     *
     * @return 内部的に保持しているリソースバンドルオブジェクト。
     */
    public ResourceBundle getResourceBundle() {
        return fResourceBundle;
    }

    /**
     * bundle[blancoDbPhp], key[METAFILE_DISPLAYNAME]
     *
     * [SQL定義書] (ja)<br>
     *
     * @return key[METAFILE_DISPLAYNAME]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMetafileDisplayname() {
        // 初期値として定義書の値を利用します。
        String strFormat = "SQL定義書";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("METAFILE_DISPLAYNAME");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[blancoDbPhp], key[META2XML.ELEMENT_COMMON]
     *
     * [blancodb-common] (ja)<br>
     *
     * @return key[META2XML.ELEMENT_COMMON]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMeta2xmlElementCommon() {
        // 初期値として定義書の値を利用します。
        String strFormat = "blancodb-common";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("META2XML.ELEMENT_COMMON");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[blancoDbPhp], key[TYPE_MAPPING.ERR001]
     *
     * [型マッピングとしてサポートしないJDBC型({0,number}/{1})が見つかりました。処理中断します。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.math.BigDecimal型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @return key[TYPE_MAPPING.ERR001]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getTypeMappingErr001(final BigDecimal arg0, final String arg1) {
        // 初期値として定義書の値を利用します。
        String strFormat = "型マッピングとしてサポートしないJDBC型({0,number}/{1})が見つかりました。処理中断します。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("TYPE_MAPPING.ERR001");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0, arg1}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[blancoDbPhp], key[XML2JAVACLASS.ERR001]
     *
     * [SQL定義ID[{0}]の「SQL文」が取得できませんでした。SQL文が適切に記載されていることを確認してください。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @return key[XML2JAVACLASS.ERR001]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getXml2javaclassErr001(final String arg0) {
        // 初期値として定義書の値を利用します。
        String strFormat = "SQL定義ID[{0}]の「SQL文」が取得できませんでした。SQL文が適切に記載されていることを確認してください。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.ERR001");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[blancoDbPhp], key[XML2JAVACLASS.ERR002]
     *
     * [SQL定義ID[{0}]においてSQL例外が発生しました。SQL定義ID[{0}]のSQL文やSQL入力パラメータに誤りが含まれていないか調べてください。SQLState[{1}] エラーコード[{2,number}] メッセージ[{3}]] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @param arg2 置換文字列{2}を置換する値。java.math.BigDecimal型を与えてください。
     * @param arg3 置換文字列{3}を置換する値。java.lang.String型を与えてください。
     * @return key[XML2JAVACLASS.ERR002]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getXml2javaclassErr002(final String arg0, final String arg1, final BigDecimal arg2, final String arg3) {
        // 初期値として定義書の値を利用します。
        String strFormat = "SQL定義ID[{0}]においてSQL例外が発生しました。SQL定義ID[{0}]のSQL文やSQL入力パラメータに誤りが含まれていないか調べてください。SQLState[{1}] エラーコード[{2,number}] メッセージ[{3}]";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.ERR002");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0, arg1, arg2, arg3}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[blancoDbPhp], key[XML2JAVACLASS.ERR003]
     *
     * [SQL定義ID[{0}]において。入ってきてはいけない経路に入りました。サポートしない型[{1}]が分岐に与えられました。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @return key[XML2JAVACLASS.ERR003]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getXml2javaclassErr003(final String arg0, final String arg1) {
        // 初期値として定義書の値を利用します。
        String strFormat = "SQL定義ID[{0}]において。入ってきてはいけない経路に入りました。サポートしない型[{1}]が分岐に与えられました。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.ERR003");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0, arg1}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[blancoDbPhp], key[XML2JAVACLASS.ERR004]
     *
     * [SQL定義ID[{0}]のSQL入力パラメータ{1}において、パラメータIDが指定されない型[{2}]が検出されました。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @param arg2 置換文字列{2}を置換する値。java.lang.String型を与えてください。
     * @return key[XML2JAVACLASS.ERR004]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getXml2javaclassErr004(final String arg0, final String arg1, final String arg2) {
        // 初期値として定義書の値を利用します。
        String strFormat = "SQL定義ID[{0}]のSQL入力パラメータ{1}において、パラメータIDが指定されない型[{2}]が検出されました。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.ERR004");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0, arg1, arg2}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[blancoDbPhp], key[XML2JAVACLASS.ERR005]
     *
     * [SQL定義ID[{0}]のSQL入力パラメータ{1}において、パラメータID[{2}]の型が指定されていません。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @param arg2 置換文字列{2}を置換する値。java.lang.String型を与えてください。
     * @return key[XML2JAVACLASS.ERR005]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getXml2javaclassErr005(final String arg0, final String arg1, final String arg2) {
        // 初期値として定義書の値を利用します。
        String strFormat = "SQL定義ID[{0}]のSQL入力パラメータ{1}において、パラメータID[{2}]の型が指定されていません。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.ERR005");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0, arg1, arg2}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[blancoDbPhp], key[XML2JAVACLASS.ERR006]
     *
     * [SQL定義ID[{0}]のSQL出力パラメータ{1}において、パラメータIDが指定されない型[{2}]が検出されました。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @param arg2 置換文字列{2}を置換する値。java.lang.String型を与えてください。
     * @return key[XML2JAVACLASS.ERR006]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getXml2javaclassErr006(final String arg0, final String arg1, final String arg2) {
        // 初期値として定義書の値を利用します。
        String strFormat = "SQL定義ID[{0}]のSQL出力パラメータ{1}において、パラメータIDが指定されない型[{2}]が検出されました。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.ERR006");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0, arg1, arg2}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[blancoDbPhp], key[XML2JAVACLASS.ERR007]
     *
     * [SQL定義ID[{0}]のSQL出力パラメータ{1}において、パラメータID[{2}]の型が指定されていません。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @param arg2 置換文字列{2}を置換する値。java.lang.String型を与えてください。
     * @return key[XML2JAVACLASS.ERR007]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getXml2javaclassErr007(final String arg0, final String arg1, final String arg2) {
        // 初期値として定義書の値を利用します。
        String strFormat = "SQL定義ID[{0}]のSQL出力パラメータ{1}において、パラメータID[{2}]の型が指定されていません。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.ERR007");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0, arg1, arg2}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[blancoDbPhp], key[XML2JAVACLASS.ERR008]
     *
     * [SQL定義ID[{0}]は「呼出型」でないのにSQL出力パラメータ{1}、パラメータID[{2}]が指定されています。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @param arg2 置換文字列{2}を置換する値。java.lang.String型を与えてください。
     * @return key[XML2JAVACLASS.ERR008]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getXml2javaclassErr008(final String arg0, final String arg1, final String arg2) {
        // 初期値として定義書の値を利用します。
        String strFormat = "SQL定義ID[{0}]は「呼出型」でないのにSQL出力パラメータ{1}、パラメータID[{2}]が指定されています。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.ERR008");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0, arg1, arg2}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[blancoDbPhp], key[XML2JAVACLASS.ERR009]
     *
     * [SQL定義ID[{0}]において 「SQL文」結びつけられていないSQL入力パラメータ[{1}]が発見されました。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @param arg1 置換文字列{1}を置換する値。java.lang.String型を与えてください。
     * @return key[XML2JAVACLASS.ERR009]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getXml2javaclassErr009(final String arg0, final String arg1) {
        // 初期値として定義書の値を利用します。
        String strFormat = "SQL定義ID[{0}]において 「SQL文」結びつけられていないSQL入力パラメータ[{1}]が発見されました。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.ERR009");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0, arg1}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[blancoDbPhp], key[TASK.ERR001]
     *
     * [SQL例外が発生しました。処理中断します。] (ja)<br>
     *
     * @return key[TASK.ERR001]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getTaskErr001() {
        // 初期値として定義書の値を利用します。
        String strFormat = "SQL例外が発生しました。処理中断します。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("TASK.ERR001");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[blancoDbPhp], key[TASK.ERR002]
     *
     * [クラスが見つかりません。クラスパスの設定などを確認してください。] (ja)<br>
     *
     * @return key[TASK.ERR002]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getTaskErr002() {
        // 初期値として定義書の値を利用します。
        String strFormat = "クラスが見つかりません。クラスパスの設定などを確認してください。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("TASK.ERR002");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[blancoDbPhp], key[TASK.ERR003]
     *
     * [想定されないSAX例外が発生しました。処理中断します。] (ja)<br>
     *
     * @return key[TASK.ERR003]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getTaskErr003() {
        // 初期値として定義書の値を利用します。
        String strFormat = "想定されないSAX例外が発生しました。処理中断します。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("TASK.ERR003");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[blancoDbPhp], key[TASK.ERR004]
     *
     * [想定されない入出力例外が発生しました。処理中断します。] (ja)<br>
     *
     * @return key[TASK.ERR004]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getTaskErr004() {
        // 初期値として定義書の値を利用します。
        String strFormat = "想定されない入出力例外が発生しました。処理中断します。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("TASK.ERR004");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[blancoDbPhp], key[TASK.ERR005]
     *
     * [想定されないXMLパーサ例外が発生しました。処理中断します。] (ja)<br>
     *
     * @return key[TASK.ERR005]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getTaskErr005() {
        // 初期値として定義書の値を利用します。
        String strFormat = "想定されないXMLパーサ例外が発生しました。処理中断します。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("TASK.ERR005");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[blancoDbPhp], key[TASK.ERR006]
     *
     * [想定されないXMLトランスフォーマー例外が発生しました。処理中断します。] (ja)<br>
     *
     * @return key[TASK.ERR006]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getTaskErr006() {
        // 初期値として定義書の値を利用します。
        String strFormat = "想定されないXMLトランスフォーマー例外が発生しました。処理中断します。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("TASK.ERR006");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[blancoDbPhp], key[META2XML.PREFIX.INPARAM]
     *
     * [inParam] (ja)<br>
     *
     * @return key[META2XML.PREFIX.INPARAM]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMeta2xmlPrefixInparam() {
        // 初期値として定義書の値を利用します。
        String strFormat = "inParam";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("META2XML.PREFIX.INPARAM");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[blancoDbPhp], key[META2XML.PREFIX.INPARAMWHERE]
     *
     * [where] (ja)<br>
     *
     * @return key[META2XML.PREFIX.INPARAMWHERE]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getMeta2xmlPrefixInparamwhere() {
        // 初期値として定義書の値を利用します。
        String strFormat = "where";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("META2XML.PREFIX.INPARAMWHERE");
            }
        } catch (MissingResourceException ex) {
        }
        // 置換文字列はひとつもありません。
        return strFormat;
    }

    /**
     * bundle[blancoDbPhp], key[ANTTASK.ERR001]
     *
     * [メタディレクトリ[{0}]が存在しません。] (ja)<br>
     *
     * @param arg0 置換文字列{0}を置換する値。java.lang.String型を与えてください。
     * @return key[ANTTASK.ERR001]に対応する値。外部から読み込みができない場合には、定義書の値を戻します。必ずnull以外の値が戻ります。
     */
    public String getAnttaskErr001(final String arg0) {
        // 初期値として定義書の値を利用します。
        String strFormat = "メタディレクトリ[{0}]が存在しません。";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("ANTTASK.ERR001");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // 与えられた引数を元に置換文字列を置き換えます。
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }
}
