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
import blanco.db.common.expander.BlancoDbAbstractMethod;
import blanco.db.common.valueobject.BlancoDbSetting;
import blanco.db.common.valueobject.BlancoDbSqlInfoStructure;

/**
 * 個別のメソッドを展開するためのクラス。
 */
public class ExecuteQueryMethodPhp extends BlancoDbAbstractMethod {
    public ExecuteQueryMethodPhp(final BlancoDbSetting argDbSetting,
            final BlancoDbSqlInfoStructure argSqlInfo,
            final BlancoCgObjectFactory argCgFactory,
            final BlancoCgSourceFile argCgSourceFile,
            final BlancoCgClass argCgClass) {
        super(argDbSetting, argSqlInfo, argCgFactory, argCgSourceFile,
                argCgClass);
    }

    public void expand() {
        final BlancoCgMethod cgMethod = fCgFactory.createMethod("executeQuery",
                null);
        fCgClass.getMethodList().add(cgMethod);

        cgMethod.getLangDoc().getDescriptionList().add("検索型クエリを実行します。");

        final List listLine = cgMethod.getLineList();

        // statementが未確保であるばあい、強制的にprepareStatementを呼び出します。
        listLine.add("if ($this->fStatement == NULL) {");
        listLine.add("$this->prepareStatement();");
        listLine.add("}");

        listLine.add("// TODO 例外処理が実装されていません。");
        listLine.add("$result = $this->fStatement->execute();");
    }
}