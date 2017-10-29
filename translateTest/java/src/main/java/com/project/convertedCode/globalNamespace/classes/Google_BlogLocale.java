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

 google-api-php-client/src/contrib/Google_BloggerService.php

*/

public class Google_BlogLocale extends Google_Model implements RuntimeFileContextInterface {

    public Object country = null;

    public Object variant = null;

    public Object language = null;

    public Google_BlogLocale(RuntimeEnv env, Object... args) {
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
            case "setCountry":
                return this.setCountry(env, args);
            case "getCountry":
                return this.getCountry(env, args);
            case "setVariant":
                return this.setVariant(env, args);
            case "getVariant":
                return this.getVariant(env, args);
            case "setLanguage":
                return this.setLanguage(env, args);
            case "getLanguage":
                return this.getLanguage(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "country":
                return this.country;
            case "variant":
                return this.variant;
            case "language":
                return this.language;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "country":
                return ZVal.isNull(this.country);
            case "variant":
                return ZVal.isNull(this.variant);
            case "language":
                return ZVal.isNull(this.language);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "country":
                this.country = value;
                break;
            case "variant":
                this.variant = value;
                break;
            case "language":
                this.language = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setCountry(RuntimeEnv env, Object... args) {
        Object country = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_BlogLocale.class, "country", country);

        return null;
    }

    public Object getCountry(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_BlogLocale.class, "country"));
    }

    public Object setVariant(RuntimeEnv env, Object... args) {
        Object variant = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_BlogLocale.class, "variant", variant);

        return null;
    }

    public Object getVariant(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_BlogLocale.class, "variant"));
    }

    public Object setLanguage(RuntimeEnv env, Object... args) {
        Object language = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_BlogLocale.class, "language", language);

        return null;
    }

    public Object getLanguage(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_BlogLocale.class, "language"));
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
