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

 google-api-php-client/src/contrib/Google_SiteVerificationService.php

*/

public class Google_SiteVerificationWebResourceGettokenResponse extends Google_Model
        implements RuntimeFileContextInterface {

    public Object token = null;

    public Object method = null;

    public Google_SiteVerificationWebResourceGettokenResponse(RuntimeEnv env, Object... args) {
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
            case "setToken":
                return this.setToken(env, args);
            case "getToken":
                return this.getToken(env, args);
            case "setMethod":
                return this.setMethod(env, args);
            case "getMethod":
                return this.getMethod(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "token":
                return this.token;
            case "method":
                return this.method;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "token":
                return ZVal.isNull(this.token);
            case "method":
                return ZVal.isNull(this.method);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "token":
                this.token = value;
                break;
            case "method":
                this.method = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setToken(RuntimeEnv env, Object... args) {
        Object token = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_SiteVerificationWebResourceGettokenResponse.class, "token", token);

        return null;
    }

    public Object getToken(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_SiteVerificationWebResourceGettokenResponse.class, "token"));
    }

    public Object setMethod(RuntimeEnv env, Object... args) {
        Object method = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_SiteVerificationWebResourceGettokenResponse.class, "method", method);

        return null;
    }

    public Object getMethod(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_SiteVerificationWebResourceGettokenResponse.class, "method"));
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
