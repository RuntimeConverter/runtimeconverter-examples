package com.project.convertedCode.globalNamespace.classes;

import com.project.convertedCode.globalNamespace.classes.Google_Exception;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/Google_Client.php

*/

public class Google_ServiceException extends Google_Exception
        implements RuntimeFileContextInterface {

    public Object errors = ZVal.newArray();

    public Google_ServiceException(RuntimeEnv env, Object... args) {
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
            case "getErrors":
                return this.getErrors(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "errors":
                if (Google_ServiceException.class.isAssignableFrom(caller)) {

                    return this.errors;
                }
                return this.__phpMagicMethod__isset(key);
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "errors":
                if (Google_ServiceException.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.errors);
                }
                break;
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "errors":
                if (Google_ServiceException.class.isAssignableFrom(caller)) {

                    this.errors = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object message = ZVal.assignParameter(args, 0, null);
        Object code = ZVal.assignParameter(args, 1, null);
        if (ZVal.isNull(code)) {
            code = 0;
        }
        Object previous = ZVal.assignParameter(args, 2, null);
        if (ZVal.isNull(previous)) {
            previous = ZVal.getNull();
        }
        Object errors = ZVal.assignParameter(args, 3, null);
        if (ZVal.isNull(errors)) {
            errors = ZVal.newArray();
        }
        if (ZVal.isGreaterThanOrEqualTo(
                NamespaceGlobal.version_compare.call(env, "7.1.7", "5.3.0"), ">=", 0)) {
            super.__construct(env, message, code, previous);

        } else {
            super.__construct(env, message, code);
        }

        ZVal.setProperty(this, Google_ServiceException.class, "errors", errors);

        return null;
    }

    public Object getErrors(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ServiceException.class, "errors"));
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
