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

public class Google_Sqlresponse extends Google_Model implements RuntimeFileContextInterface {

    public Object kind = null;

    public Object rows = null;

    public Object columns = null;

    public Google_Sqlresponse(RuntimeEnv env, Object... args) {
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
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setRows":
                return this.setRows(env, args);
            case "getRows":
                return this.getRows(env, args);
            case "setColumns":
                return this.setColumns(env, args);
            case "getColumns":
                return this.getColumns(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return this.kind;
            case "rows":
                return this.rows;
            case "columns":
                return this.columns;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return ZVal.isNull(this.kind);
            case "rows":
                return ZVal.isNull(this.rows);
            case "columns":
                return ZVal.isNull(this.columns);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                this.kind = value;
                break;
            case "rows":
                this.rows = value;
                break;
            case "columns":
                this.columns = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Sqlresponse.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Sqlresponse.class, "kind"));
    }

    public Object setRows(RuntimeEnv env, Object... args) {
        Object rows = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this, "assertIsArray", Google_Sqlresponse.class, rows, "Google_object", "setRows");
        ZVal.setProperty(this, Google_Sqlresponse.class, "rows", rows);

        return null;
    }

    public Object getRows(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Sqlresponse.class, "rows"));
    }

    public Object setColumns(RuntimeEnv env, Object... args) {
        Object columns = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Sqlresponse.class,
                columns,
                "Google_string",
                "setColumns");
        ZVal.setProperty(this, Google_Sqlresponse.class, "columns", columns);

        return null;
    }

    public Object getColumns(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Sqlresponse.class, "columns"));
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
