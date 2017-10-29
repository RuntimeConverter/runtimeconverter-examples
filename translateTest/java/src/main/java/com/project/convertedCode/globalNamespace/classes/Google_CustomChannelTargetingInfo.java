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

 google-api-php-client/src/contrib/Google_AdsenseService.php

*/

public class Google_CustomChannelTargetingInfo extends Google_Model
        implements RuntimeFileContextInterface {

    public Object location = null;

    public Object adsAppearOn = null;

    public Object siteLanguage = null;

    public Object description = null;

    public Google_CustomChannelTargetingInfo(RuntimeEnv env, Object... args) {
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
            case "setLocation":
                return this.setLocation(env, args);
            case "getLocation":
                return this.getLocation(env, args);
            case "setAdsAppearOn":
                return this.setAdsAppearOn(env, args);
            case "getAdsAppearOn":
                return this.getAdsAppearOn(env, args);
            case "setSiteLanguage":
                return this.setSiteLanguage(env, args);
            case "getSiteLanguage":
                return this.getSiteLanguage(env, args);
            case "setDescription":
                return this.setDescription(env, args);
            case "getDescription":
                return this.getDescription(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "location":
                return this.location;
            case "adsAppearOn":
                return this.adsAppearOn;
            case "siteLanguage":
                return this.siteLanguage;
            case "description":
                return this.description;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "location":
                return ZVal.isNull(this.location);
            case "adsAppearOn":
                return ZVal.isNull(this.adsAppearOn);
            case "siteLanguage":
                return ZVal.isNull(this.siteLanguage);
            case "description":
                return ZVal.isNull(this.description);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "location":
                this.location = value;
                break;
            case "adsAppearOn":
                this.adsAppearOn = value;
                break;
            case "siteLanguage":
                this.siteLanguage = value;
                break;
            case "description":
                this.description = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setLocation(RuntimeEnv env, Object... args) {
        Object location = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CustomChannelTargetingInfo.class, "location", location);

        return null;
    }

    public Object getLocation(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_CustomChannelTargetingInfo.class, "location"));
    }

    public Object setAdsAppearOn(RuntimeEnv env, Object... args) {
        Object adsAppearOn = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CustomChannelTargetingInfo.class, "adsAppearOn", adsAppearOn);

        return null;
    }

    public Object getAdsAppearOn(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_CustomChannelTargetingInfo.class, "adsAppearOn"));
    }

    public Object setSiteLanguage(RuntimeEnv env, Object... args) {
        Object siteLanguage = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_CustomChannelTargetingInfo.class, "siteLanguage", siteLanguage);

        return null;
    }

    public Object getSiteLanguage(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_CustomChannelTargetingInfo.class, "siteLanguage"));
    }

    public Object setDescription(RuntimeEnv env, Object... args) {
        Object description = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CustomChannelTargetingInfo.class, "description", description);

        return null;
    }

    public Object getDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_CustomChannelTargetingInfo.class, "description"));
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
