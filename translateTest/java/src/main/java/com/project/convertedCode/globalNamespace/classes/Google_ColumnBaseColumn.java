package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Google_Model;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_FusiontablesService.php

*/

public class Google_ColumnBaseColumn extends Google_Model implements RuntimeFileContextInterface {

    public Object tableIndex = null;

    public Object columnId = null;

    public Google_ColumnBaseColumn(RuntimeEnv env, Object... args) {
        super(env, args);
        this.__construct(env, args);
    }

    @Override
    public Object converterRuntimeCallExtended(
            RuntimeEnv env,
            String method,
            Class caller,
            PassByReferenceArgs passByReferenceArgs,
            Object... args) {
        switch (method) {
            case "setTableIndex":
                return this.setTableIndex(env, args);
            case "getTableIndex":
                return this.getTableIndex(env, args);
            case "setColumnId":
                return this.setColumnId(env, args);
            case "getColumnId":
                return this.getColumnId(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "tableIndex":
                return this.tableIndex;
            case "columnId":
                return this.columnId;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "tableIndex":
                return ZVal.isNull(this.tableIndex);
            case "columnId":
                return ZVal.isNull(this.columnId);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "tableIndex":
                this.tableIndex = value;
                break;
            case "columnId":
                this.columnId = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setTableIndex(RuntimeEnv env, Object... args) {
        Object tableIndex = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ColumnBaseColumn.class, "tableIndex", tableIndex);

        return null;
    }

    public Object getTableIndex(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ColumnBaseColumn.class, "tableIndex"));
    }

    public Object setColumnId(RuntimeEnv env, Object... args) {
        Object columnId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ColumnBaseColumn.class, "columnId", columnId);

        return null;
    }

    public Object getColumnId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ColumnBaseColumn.class, "columnId"));
    }

    public String ___getRuntimeFilename() {
        return "";
    }

    public String ___getRuntimeDirname() {
        return "";
    }

    public String ___getRuntimeNamespace() {
        return "";
    }
}
