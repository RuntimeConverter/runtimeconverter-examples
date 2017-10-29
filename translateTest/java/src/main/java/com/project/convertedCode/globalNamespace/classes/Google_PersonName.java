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

public class Google_PersonName extends Google_Model implements RuntimeFileContextInterface {

    public Object honorificPrefix = null;

    public Object middleName = null;

    public Object familyName = null;

    public Object formatted = null;

    public Object givenName = null;

    public Object honorificSuffix = null;

    public Google_PersonName(RuntimeEnv env, Object... args) {
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
            case "setHonorificPrefix":
                return this.setHonorificPrefix(env, args);
            case "getHonorificPrefix":
                return this.getHonorificPrefix(env, args);
            case "setMiddleName":
                return this.setMiddleName(env, args);
            case "getMiddleName":
                return this.getMiddleName(env, args);
            case "setFamilyName":
                return this.setFamilyName(env, args);
            case "getFamilyName":
                return this.getFamilyName(env, args);
            case "setFormatted":
                return this.setFormatted(env, args);
            case "getFormatted":
                return this.getFormatted(env, args);
            case "setGivenName":
                return this.setGivenName(env, args);
            case "getGivenName":
                return this.getGivenName(env, args);
            case "setHonorificSuffix":
                return this.setHonorificSuffix(env, args);
            case "getHonorificSuffix":
                return this.getHonorificSuffix(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "honorificPrefix":
                return this.honorificPrefix;
            case "middleName":
                return this.middleName;
            case "familyName":
                return this.familyName;
            case "formatted":
                return this.formatted;
            case "givenName":
                return this.givenName;
            case "honorificSuffix":
                return this.honorificSuffix;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "honorificPrefix":
                return ZVal.isNull(this.honorificPrefix);
            case "middleName":
                return ZVal.isNull(this.middleName);
            case "familyName":
                return ZVal.isNull(this.familyName);
            case "formatted":
                return ZVal.isNull(this.formatted);
            case "givenName":
                return ZVal.isNull(this.givenName);
            case "honorificSuffix":
                return ZVal.isNull(this.honorificSuffix);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "honorificPrefix":
                this.honorificPrefix = value;
                break;
            case "middleName":
                this.middleName = value;
                break;
            case "familyName":
                this.familyName = value;
                break;
            case "formatted":
                this.formatted = value;
                break;
            case "givenName":
                this.givenName = value;
                break;
            case "honorificSuffix":
                this.honorificSuffix = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setHonorificPrefix(RuntimeEnv env, Object... args) {
        Object honorificPrefix = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PersonName.class, "honorificPrefix", honorificPrefix);

        return null;
    }

    public Object getHonorificPrefix(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PersonName.class, "honorificPrefix"));
    }

    public Object setMiddleName(RuntimeEnv env, Object... args) {
        Object middleName = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PersonName.class, "middleName", middleName);

        return null;
    }

    public Object getMiddleName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PersonName.class, "middleName"));
    }

    public Object setFamilyName(RuntimeEnv env, Object... args) {
        Object familyName = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PersonName.class, "familyName", familyName);

        return null;
    }

    public Object getFamilyName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PersonName.class, "familyName"));
    }

    public Object setFormatted(RuntimeEnv env, Object... args) {
        Object formatted = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PersonName.class, "formatted", formatted);

        return null;
    }

    public Object getFormatted(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PersonName.class, "formatted"));
    }

    public Object setGivenName(RuntimeEnv env, Object... args) {
        Object givenName = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PersonName.class, "givenName", givenName);

        return null;
    }

    public Object getGivenName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PersonName.class, "givenName"));
    }

    public Object setHonorificSuffix(RuntimeEnv env, Object... args) {
        Object honorificSuffix = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PersonName.class, "honorificSuffix", honorificSuffix);

        return null;
    }

    public Object getHonorificSuffix(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PersonName.class, "honorificSuffix"));
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
