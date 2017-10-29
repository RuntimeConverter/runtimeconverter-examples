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

 google-api-php-client/src/contrib/Google_AdsensehostService.php

*/

public class Google_AdUnitMobileContentAdsSettings extends Google_Model
        implements RuntimeFileContextInterface {

    public Object scriptingLanguage = null;

    public Object type = null;

    public Object markupLanguage = null;

    public Object size = null;

    public Google_AdUnitMobileContentAdsSettings(RuntimeEnv env, Object... args) {
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
            case "setScriptingLanguage":
                return this.setScriptingLanguage(env, args);
            case "getScriptingLanguage":
                return this.getScriptingLanguage(env, args);
            case "setType":
                return this.setType(env, args);
            case "getType":
                return this.getType(env, args);
            case "setMarkupLanguage":
                return this.setMarkupLanguage(env, args);
            case "getMarkupLanguage":
                return this.getMarkupLanguage(env, args);
            case "setSize":
                return this.setSize(env, args);
            case "getSize":
                return this.getSize(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "scriptingLanguage":
                return this.scriptingLanguage;
            case "type":
                return this.type;
            case "markupLanguage":
                return this.markupLanguage;
            case "size":
                return this.size;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "scriptingLanguage":
                return ZVal.isNull(this.scriptingLanguage);
            case "type":
                return ZVal.isNull(this.type);
            case "markupLanguage":
                return ZVal.isNull(this.markupLanguage);
            case "size":
                return ZVal.isNull(this.size);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "scriptingLanguage":
                this.scriptingLanguage = value;
                break;
            case "type":
                this.type = value;
                break;
            case "markupLanguage":
                this.markupLanguage = value;
                break;
            case "size":
                this.size = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setScriptingLanguage(RuntimeEnv env, Object... args) {
        Object scriptingLanguage = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_AdUnitMobileContentAdsSettings.class,
                "scriptingLanguage",
                scriptingLanguage);

        return null;
    }

    public Object getScriptingLanguage(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_AdUnitMobileContentAdsSettings.class, "scriptingLanguage"));
    }

    public Object setType(RuntimeEnv env, Object... args) {
        Object type = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AdUnitMobileContentAdsSettings.class, "type", type);

        return null;
    }

    public Object getType(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_AdUnitMobileContentAdsSettings.class, "type"));
    }

    public Object setMarkupLanguage(RuntimeEnv env, Object... args) {
        Object markupLanguage = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_AdUnitMobileContentAdsSettings.class,
                "markupLanguage",
                markupLanguage);

        return null;
    }

    public Object getMarkupLanguage(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_AdUnitMobileContentAdsSettings.class, "markupLanguage"));
    }

    public Object setSize(RuntimeEnv env, Object... args) {
        Object size = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AdUnitMobileContentAdsSettings.class, "size", size);

        return null;
    }

    public Object getSize(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_AdUnitMobileContentAdsSettings.class, "size"));
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
