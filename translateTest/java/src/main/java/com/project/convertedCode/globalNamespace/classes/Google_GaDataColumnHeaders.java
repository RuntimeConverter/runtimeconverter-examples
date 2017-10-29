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

 google-api-php-client/src/contrib/Google_AnalyticsService.php

*/

public class Google_GaDataColumnHeaders extends Google_Model
        implements RuntimeFileContextInterface {

    public Object dataType = null;

    public Object columnType = null;

    public Object name = null;

    public Google_GaDataColumnHeaders(RuntimeEnv env, Object... args) {
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
            case "setDataType":
                return this.setDataType(env, args);
            case "getDataType":
                return this.getDataType(env, args);
            case "setColumnType":
                return this.setColumnType(env, args);
            case "getColumnType":
                return this.getColumnType(env, args);
            case "setName":
                return this.setName(env, args);
            case "getName":
                return this.getName(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "dataType":
                return this.dataType;
            case "columnType":
                return this.columnType;
            case "name":
                return this.name;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "dataType":
                return ZVal.isNull(this.dataType);
            case "columnType":
                return ZVal.isNull(this.columnType);
            case "name":
                return ZVal.isNull(this.name);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "dataType":
                this.dataType = value;
                break;
            case "columnType":
                this.columnType = value;
                break;
            case "name":
                this.name = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setDataType(RuntimeEnv env, Object... args) {
        Object dataType = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_GaDataColumnHeaders.class, "dataType", dataType);

        return null;
    }

    public Object getDataType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_GaDataColumnHeaders.class, "dataType"));
    }

    public Object setColumnType(RuntimeEnv env, Object... args) {
        Object columnType = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_GaDataColumnHeaders.class, "columnType", columnType);

        return null;
    }

    public Object getColumnType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_GaDataColumnHeaders.class, "columnType"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_GaDataColumnHeaders.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_GaDataColumnHeaders.class, "name"));
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
