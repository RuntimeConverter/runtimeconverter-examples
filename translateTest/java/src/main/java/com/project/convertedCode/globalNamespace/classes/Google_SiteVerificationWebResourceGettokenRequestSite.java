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

public class Google_SiteVerificationWebResourceGettokenRequestSite extends Google_Model
        implements RuntimeFileContextInterface {

    public Object identifier = null;

    public Object type = null;

    public Google_SiteVerificationWebResourceGettokenRequestSite(RuntimeEnv env, Object... args) {
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
            case "setIdentifier":
                return this.setIdentifier(env, args);
            case "getIdentifier":
                return this.getIdentifier(env, args);
            case "setType":
                return this.setType(env, args);
            case "getType":
                return this.getType(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "identifier":
                return this.identifier;
            case "type":
                return this.type;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "identifier":
                return ZVal.isNull(this.identifier);
            case "type":
                return ZVal.isNull(this.type);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "identifier":
                this.identifier = value;
                break;
            case "type":
                this.type = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setIdentifier(RuntimeEnv env, Object... args) {
        Object identifier = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_SiteVerificationWebResourceGettokenRequestSite.class,
                "identifier",
                identifier);

        return null;
    }

    public Object getIdentifier(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this,
                        Google_SiteVerificationWebResourceGettokenRequestSite.class,
                        "identifier"));
    }

    public Object setType(RuntimeEnv env, Object... args) {
        Object type = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_SiteVerificationWebResourceGettokenRequestSite.class, "type", type);

        return null;
    }

    public Object getType(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_SiteVerificationWebResourceGettokenRequestSite.class, "type"));
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
