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

 google-api-php-client/src/contrib/Google_CalendarService.php

*/

public class Google_EventExtendedProperties extends Google_Model
        implements RuntimeFileContextInterface {

    public Object shared = null;

    public Object _pPrivate = null;

    public Google_EventExtendedProperties(RuntimeEnv env, Object... args) {
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
            case "setShared":
                return this.setShared(env, args);
            case "getShared":
                return this.getShared(env, args);
            case "setPrivate":
                return this.setPrivate(env, args);
            case "getPrivate":
                return this.getPrivate(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "shared":
                return this.shared;
            case "private":
                return this._pPrivate;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "shared":
                return ZVal.isNull(this.shared);
            case "private":
                return ZVal.isNull(this._pPrivate);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "shared":
                this.shared = value;
                break;
            case "private":
                this._pPrivate = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setShared(RuntimeEnv env, Object... args) {
        Object shared = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_EventExtendedProperties.class, "shared", shared);

        return null;
    }

    public Object getShared(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_EventExtendedProperties.class, "shared"));
    }

    public Object setPrivate(RuntimeEnv env, Object... args) {
        Object _pPrivate = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_EventExtendedProperties.class, "private", _pPrivate);

        return null;
    }

    public Object getPrivate(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_EventExtendedProperties.class, "private"));
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
