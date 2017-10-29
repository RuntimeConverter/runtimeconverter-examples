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

 google-api-php-client/src/contrib/Google_ComputeService.php

*/

public class Google_MetadataItems extends Google_Model implements RuntimeFileContextInterface {

    public Object value = null;

    public Object key = null;

    public Google_MetadataItems(RuntimeEnv env, Object... args) {
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
            case "setValue":
                return this.setValue(env, args);
            case "getValue":
                return this.getValue(env, args);
            case "setKey":
                return this.setKey(env, args);
            case "getKey":
                return this.getKey(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "value":
                return this.value;
            case "key":
                return this.key;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "value":
                return ZVal.isNull(this.value);
            case "key":
                return ZVal.isNull(this.key);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "value":
                this.value = value;
                break;
            case "key":
                this.key = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setValue(RuntimeEnv env, Object... args) {
        Object value = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_MetadataItems.class, "value", value);

        return null;
    }

    public Object getValue(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_MetadataItems.class, "value"));
    }

    public Object setKey(RuntimeEnv env, Object... args) {
        Object key = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_MetadataItems.class, "key", key);

        return null;
    }

    public Object getKey(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_MetadataItems.class, "key"));
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
