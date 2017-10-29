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

public class Google_AdUnitContentAdsSettingsBackupOption extends Google_Model
        implements RuntimeFileContextInterface {

    public Object color = null;

    public Object url = null;

    public Object type = null;

    public Google_AdUnitContentAdsSettingsBackupOption(RuntimeEnv env, Object... args) {
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
            case "setColor":
                return this.setColor(env, args);
            case "getColor":
                return this.getColor(env, args);
            case "setUrl":
                return this.setUrl(env, args);
            case "getUrl":
                return this.getUrl(env, args);
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
            case "color":
                return this.color;
            case "url":
                return this.url;
            case "type":
                return this.type;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "color":
                return ZVal.isNull(this.color);
            case "url":
                return ZVal.isNull(this.url);
            case "type":
                return ZVal.isNull(this.type);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "color":
                this.color = value;
                break;
            case "url":
                this.url = value;
                break;
            case "type":
                this.type = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setColor(RuntimeEnv env, Object... args) {
        Object color = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AdUnitContentAdsSettingsBackupOption.class, "color", color);

        return null;
    }

    public Object getColor(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_AdUnitContentAdsSettingsBackupOption.class, "color"));
    }

    public Object setUrl(RuntimeEnv env, Object... args) {
        Object url = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AdUnitContentAdsSettingsBackupOption.class, "url", url);

        return null;
    }

    public Object getUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_AdUnitContentAdsSettingsBackupOption.class, "url"));
    }

    public Object setType(RuntimeEnv env, Object... args) {
        Object type = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AdUnitContentAdsSettingsBackupOption.class, "type", type);

        return null;
    }

    public Object getType(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_AdUnitContentAdsSettingsBackupOption.class, "type"));
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
