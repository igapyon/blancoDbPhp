/*
 * blanco Framework
 * Copyright (C) 2004-2006 IGA Tosiki
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.db.expander.exception;

import java.util.List;

import blanco.cg.BlancoCgObjectFactory;
import blanco.cg.valueobject.BlancoCgClass;
import blanco.cg.valueobject.BlancoCgField;
import blanco.cg.valueobject.BlancoCgMethod;
import blanco.cg.valueobject.BlancoCgSourceFile;

/**
 * データベースタイムアウトに関する例外クラス
 * 
 * このクラスが生成するクラスはblancoDbが生成したソースコードで利用されます
 * 
 * @author IGA Tosiki
 */
public class TimeoutExceptionClassPhp {
    /**
     * 例外クラスのクラス名
     */
    public static final String CLASS_NAME = "TimeoutException";

    /**
     * コンストラクタに示すJavaDoc説明。
     */
    private static final String CONSTRUCTOR_JAVADOC = "データベースのタイムアウトが発生したことを示す例外オブジェクト のインスタンスを作成します。";

    /**
     * blancoCg オブジェクトファクトリ。
     */
    private BlancoCgObjectFactory fCgFactory = null;

    /**
     * このクラスが含まれるソースコード。
     */
    private BlancoCgSourceFile fCgSourceFile = null;

    public TimeoutExceptionClassPhp(final BlancoCgObjectFactory cgFactory,
            final String argPackage) {
        fCgFactory = cgFactory;
        fCgSourceFile = fCgFactory.createSourceFile(argPackage,
                "This code is generated by blanco Framework.");
    }

    public BlancoCgSourceFile expand() {
        final BlancoCgClass cgClass = fCgFactory.createClass(CLASS_NAME, null);
        fCgSourceFile.getClassList().add(cgClass);

        cgClass.getExtendClassList().add(
                fCgFactory.createType("pdo.PDOException"));

        {
            final List listDesc = cgClass.getLangDoc().getDescriptionList();

            listDesc.add("データベースタイムアウトに関する例外クラス。");
            listDesc.add("このクラスはblancoDbが生成したソースコードで利用されます。");
            listDesc.add("※このクラスは、ソースコード自動生成後のファイルとして利用されます。");
            listDesc.add("");
            listDesc.add("@author blanco Framework");
        }

        {
            final BlancoCgField cgField = fCgFactory.createField(
                    "SQLSTATE_TIMEOUT", "string", "このクラスを表現するSQLStateコード。");
            cgClass.getFieldList().add(cgField);
            cgField.setAccess("protected");
            cgField.setStatic(true);
            cgField.setFinal(true);
            cgField.setDefault("\"HYT00\"");

            cgField.getLangDoc().getDescriptionList().add(
                    "※プログラムは SQLStateに頼らずに 例外クラスによって判断するようにしてください。");
        }

        {
            final BlancoCgMethod cgMethod = fCgFactory.createMethod(CLASS_NAME,
                    CONSTRUCTOR_JAVADOC);
            cgClass.getMethodList().add(cgMethod);

            cgMethod.setConstructor(true);
            cgMethod.getParameterList().add(
                    fCgFactory.createParameter("reason", "string", "例外の説明"));

            cgMethod
                    .setSuperclassInvocation("parent::__construct($reason . self::SQLSTATE_TIMEOUT)");
        }

        return fCgSourceFile;
    }
}