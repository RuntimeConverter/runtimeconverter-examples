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

 google-api-php-client/src/contrib/Google_PlusService.php

*/

public class Google_PersonPlacesLived extends Google_Model implements RuntimeFileContextInterface {

    public Object primary = null;

    public Object value = null;

    public Google_PersonPlacesLived(RuntimeEnv env, Object... args) {
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
            case "setPrimary":
                return this.setPrimary(env, args);
            case "getPrimary":
                return this.getPrimary(env, args);
            case "setValue":
                return this.setValue(env, args);
            case "getValue":
                return this.getValue(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "primary":
                return this.primary;
            case "value":
                return this.value;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "primary":
                return ZVal.isNull(this.primary);
            case "value":
                return ZVal.isNull(this.value);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "primary":
                this.primary = value;
                break;
            case "value":
                this.value = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setPrimary(RuntimeEnv env, Object... args) {
        Object primary = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PersonPlacesLived.class, "primary", primary);

        return null;
    }

    public Object getPrimary(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PersonPlacesLived.class, "primary"));
    }

    public Object setValue(RuntimeEnv env, Object... args) {
        Object value = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PersonPlacesLived.class, "value", value);

        return null;
    }

    public Object getValue(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PersonPlacesLived.class, "value"));
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
