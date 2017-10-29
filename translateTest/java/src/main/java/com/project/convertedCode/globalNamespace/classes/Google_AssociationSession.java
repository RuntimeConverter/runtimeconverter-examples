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

public class Google_AssociationSession extends Google_Model implements RuntimeFileContextInterface {

    public Object status = null;

    public Object productCodes = null;

    public Object kind = null;

    public Object userLocale = null;

    public Object websiteLocale = null;

    public Object redirectUrl = null;

    public Object websiteUrl = null;

    public Object id = null;

    public Object accountId = null;

    public Google_AssociationSession(RuntimeEnv env, Object... args) {
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
            case "setStatus":
                return this.setStatus(env, args);
            case "getStatus":
                return this.getStatus(env, args);
            case "setProductCodes":
                return this.setProductCodes(env, args);
            case "getProductCodes":
                return this.getProductCodes(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setUserLocale":
                return this.setUserLocale(env, args);
            case "getUserLocale":
                return this.getUserLocale(env, args);
            case "setWebsiteLocale":
                return this.setWebsiteLocale(env, args);
            case "getWebsiteLocale":
                return this.getWebsiteLocale(env, args);
            case "setRedirectUrl":
                return this.setRedirectUrl(env, args);
            case "getRedirectUrl":
                return this.getRedirectUrl(env, args);
            case "setWebsiteUrl":
                return this.setWebsiteUrl(env, args);
            case "getWebsiteUrl":
                return this.getWebsiteUrl(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setAccountId":
                return this.setAccountId(env, args);
            case "getAccountId":
                return this.getAccountId(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "status":
                return this.status;
            case "productCodes":
                return this.productCodes;
            case "kind":
                return this.kind;
            case "userLocale":
                return this.userLocale;
            case "websiteLocale":
                return this.websiteLocale;
            case "redirectUrl":
                return this.redirectUrl;
            case "websiteUrl":
                return this.websiteUrl;
            case "id":
                return this.id;
            case "accountId":
                return this.accountId;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "status":
                return ZVal.isNull(this.status);
            case "productCodes":
                return ZVal.isNull(this.productCodes);
            case "kind":
                return ZVal.isNull(this.kind);
            case "userLocale":
                return ZVal.isNull(this.userLocale);
            case "websiteLocale":
                return ZVal.isNull(this.websiteLocale);
            case "redirectUrl":
                return ZVal.isNull(this.redirectUrl);
            case "websiteUrl":
                return ZVal.isNull(this.websiteUrl);
            case "id":
                return ZVal.isNull(this.id);
            case "accountId":
                return ZVal.isNull(this.accountId);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "status":
                this.status = value;
                break;
            case "productCodes":
                this.productCodes = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "userLocale":
                this.userLocale = value;
                break;
            case "websiteLocale":
                this.websiteLocale = value;
                break;
            case "redirectUrl":
                this.redirectUrl = value;
                break;
            case "websiteUrl":
                this.websiteUrl = value;
                break;
            case "id":
                this.id = value;
                break;
            case "accountId":
                this.accountId = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setStatus(RuntimeEnv env, Object... args) {
        Object status = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AssociationSession.class, "status", status);

        return null;
    }

    public Object getStatus(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AssociationSession.class, "status"));
    }

    public Object setProductCodes(RuntimeEnv env, Object... args) {
        Object productCodes = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AssociationSession.class, "productCodes", productCodes);

        return null;
    }

    public Object getProductCodes(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AssociationSession.class, "productCodes"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AssociationSession.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AssociationSession.class, "kind"));
    }

    public Object setUserLocale(RuntimeEnv env, Object... args) {
        Object userLocale = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AssociationSession.class, "userLocale", userLocale);

        return null;
    }

    public Object getUserLocale(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AssociationSession.class, "userLocale"));
    }

    public Object setWebsiteLocale(RuntimeEnv env, Object... args) {
        Object websiteLocale = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AssociationSession.class, "websiteLocale", websiteLocale);

        return null;
    }

    public Object getWebsiteLocale(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_AssociationSession.class, "websiteLocale"));
    }

    public Object setRedirectUrl(RuntimeEnv env, Object... args) {
        Object redirectUrl = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AssociationSession.class, "redirectUrl", redirectUrl);

        return null;
    }

    public Object getRedirectUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AssociationSession.class, "redirectUrl"));
    }

    public Object setWebsiteUrl(RuntimeEnv env, Object... args) {
        Object websiteUrl = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AssociationSession.class, "websiteUrl", websiteUrl);

        return null;
    }

    public Object getWebsiteUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AssociationSession.class, "websiteUrl"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AssociationSession.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AssociationSession.class, "id"));
    }

    public Object setAccountId(RuntimeEnv env, Object... args) {
        Object accountId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AssociationSession.class, "accountId", accountId);

        return null;
    }

    public Object getAccountId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AssociationSession.class, "accountId"));
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
