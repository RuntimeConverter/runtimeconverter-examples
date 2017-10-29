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

 google-api-php-client/src/contrib/Google_TranslateService.php

*/

public class Google_LanguagesResource extends Google_Model implements RuntimeFileContextInterface {

    public Object name = null;

    public Object language = null;

    public Google_LanguagesResource(RuntimeEnv env, Object... args) {
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
            case "setName":
                return this.setName(env, args);
            case "getName":
                return this.getName(env, args);
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
            case "name":
                return this.name;
            case "language":
                return this.language;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "name":
                return ZVal.isNull(this.name);
            case "language":
                return ZVal.isNull(this.language);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "name":
                this.name = value;
                break;
            case "language":
                this.language = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_LanguagesResource.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_LanguagesResource.class, "name"));
    }

    public Object setLanguage(RuntimeEnv env, Object... args) {
        Object language = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_LanguagesResource.class, "language", language);

        return null;
    }

    public Object getLanguage(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_LanguagesResource.class, "language"));
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
