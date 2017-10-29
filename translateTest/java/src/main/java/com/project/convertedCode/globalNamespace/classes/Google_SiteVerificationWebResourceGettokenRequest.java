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

public class Google_SiteVerificationWebResourceGettokenRequest extends Google_Model
        implements RuntimeFileContextInterface {

    public Object verificationMethod = null;

    public Object __siteType = "Google_SiteVerificationWebResourceGettokenRequestSite";

    public Object __siteDataType = "";

    public Object site = null;

    public Google_SiteVerificationWebResourceGettokenRequest(RuntimeEnv env, Object... args) {
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
            case "setVerificationMethod":
                return this.setVerificationMethod(env, args);
            case "getVerificationMethod":
                return this.getVerificationMethod(env, args);
            case "setSite":
                return this.setSite(env, args);
            case "getSite":
                return this.getSite(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "verificationMethod":
                return this.verificationMethod;
            case "__siteType":
                if (Google_SiteVerificationWebResourceGettokenRequest.class.isAssignableFrom(
                        caller)) {

                    return this.__siteType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__siteDataType":
                if (Google_SiteVerificationWebResourceGettokenRequest.class.isAssignableFrom(
                        caller)) {

                    return this.__siteDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "site":
                return this.site;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "verificationMethod":
                return ZVal.isNull(this.verificationMethod);
            case "__siteType":
                if (Google_SiteVerificationWebResourceGettokenRequest.class.isAssignableFrom(
                        caller)) {

                    return ZVal.isNull(this.__siteType);
                }
                break;
            case "__siteDataType":
                if (Google_SiteVerificationWebResourceGettokenRequest.class.isAssignableFrom(
                        caller)) {

                    return ZVal.isNull(this.__siteDataType);
                }
                break;
            case "site":
                return ZVal.isNull(this.site);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "verificationMethod":
                this.verificationMethod = value;
                break;
            case "__siteType":
                if (Google_SiteVerificationWebResourceGettokenRequest.class.isAssignableFrom(
                        caller)) {

                    this.__siteType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__siteDataType":
                if (Google_SiteVerificationWebResourceGettokenRequest.class.isAssignableFrom(
                        caller)) {

                    this.__siteDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "site":
                this.site = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setVerificationMethod(RuntimeEnv env, Object... args) {
        Object verificationMethod = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_SiteVerificationWebResourceGettokenRequest.class,
                "verificationMethod",
                verificationMethod);

        return null;
    }

    public Object getVerificationMethod(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this,
                        Google_SiteVerificationWebResourceGettokenRequest.class,
                        "verificationMethod"));
    }

    public Object setSite(RuntimeEnv env, Object... args) {
        Object site = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_SiteVerificationWebResourceGettokenRequest.class, "site", site);

        return null;
    }

    public Object getSite(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_SiteVerificationWebResourceGettokenRequest.class, "site"));
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
