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

public class Google_ActivityActorName extends Google_Model implements RuntimeFileContextInterface {

    public Object givenName = null;

    public Object familyName = null;

    public Google_ActivityActorName(RuntimeEnv env, Object... args) {
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
            case "setGivenName":
                return this.setGivenName(env, args);
            case "getGivenName":
                return this.getGivenName(env, args);
            case "setFamilyName":
                return this.setFamilyName(env, args);
            case "getFamilyName":
                return this.getFamilyName(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "givenName":
                return this.givenName;
            case "familyName":
                return this.familyName;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "givenName":
                return ZVal.isNull(this.givenName);
            case "familyName":
                return ZVal.isNull(this.familyName);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "givenName":
                this.givenName = value;
                break;
            case "familyName":
                this.familyName = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setGivenName(RuntimeEnv env, Object... args) {
        Object givenName = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ActivityActorName.class, "givenName", givenName);

        return null;
    }

    public Object getGivenName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ActivityActorName.class, "givenName"));
    }

    public Object setFamilyName(RuntimeEnv env, Object... args) {
        Object familyName = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ActivityActorName.class, "familyName", familyName);

        return null;
    }

    public Object getFamilyName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ActivityActorName.class, "familyName"));
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
