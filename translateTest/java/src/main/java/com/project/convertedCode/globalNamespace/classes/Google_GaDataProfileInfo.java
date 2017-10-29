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

 google-api-php-client/src/contrib/Google_AnalyticsService.php

*/

public class Google_GaDataProfileInfo extends Google_Model implements RuntimeFileContextInterface {

    public Object webPropertyId = null;

    public Object internalWebPropertyId = null;

    public Object tableId = null;

    public Object profileId = null;

    public Object profileName = null;

    public Object accountId = null;

    public Google_GaDataProfileInfo(RuntimeEnv env, Object... args) {
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
            case "setWebPropertyId":
                return this.setWebPropertyId(env, args);
            case "getWebPropertyId":
                return this.getWebPropertyId(env, args);
            case "setInternalWebPropertyId":
                return this.setInternalWebPropertyId(env, args);
            case "getInternalWebPropertyId":
                return this.getInternalWebPropertyId(env, args);
            case "setTableId":
                return this.setTableId(env, args);
            case "getTableId":
                return this.getTableId(env, args);
            case "setProfileId":
                return this.setProfileId(env, args);
            case "getProfileId":
                return this.getProfileId(env, args);
            case "setProfileName":
                return this.setProfileName(env, args);
            case "getProfileName":
                return this.getProfileName(env, args);
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
            case "webPropertyId":
                return this.webPropertyId;
            case "internalWebPropertyId":
                return this.internalWebPropertyId;
            case "tableId":
                return this.tableId;
            case "profileId":
                return this.profileId;
            case "profileName":
                return this.profileName;
            case "accountId":
                return this.accountId;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "webPropertyId":
                return ZVal.isNull(this.webPropertyId);
            case "internalWebPropertyId":
                return ZVal.isNull(this.internalWebPropertyId);
            case "tableId":
                return ZVal.isNull(this.tableId);
            case "profileId":
                return ZVal.isNull(this.profileId);
            case "profileName":
                return ZVal.isNull(this.profileName);
            case "accountId":
                return ZVal.isNull(this.accountId);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "webPropertyId":
                this.webPropertyId = value;
                break;
            case "internalWebPropertyId":
                this.internalWebPropertyId = value;
                break;
            case "tableId":
                this.tableId = value;
                break;
            case "profileId":
                this.profileId = value;
                break;
            case "profileName":
                this.profileName = value;
                break;
            case "accountId":
                this.accountId = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setWebPropertyId(RuntimeEnv env, Object... args) {
        Object webPropertyId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_GaDataProfileInfo.class, "webPropertyId", webPropertyId);

        return null;
    }

    public Object getWebPropertyId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_GaDataProfileInfo.class, "webPropertyId"));
    }

    public Object setInternalWebPropertyId(RuntimeEnv env, Object... args) {
        Object internalWebPropertyId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_GaDataProfileInfo.class,
                "internalWebPropertyId",
                internalWebPropertyId);

        return null;
    }

    public Object getInternalWebPropertyId(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_GaDataProfileInfo.class, "internalWebPropertyId"));
    }

    public Object setTableId(RuntimeEnv env, Object... args) {
        Object tableId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_GaDataProfileInfo.class, "tableId", tableId);

        return null;
    }

    public Object getTableId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_GaDataProfileInfo.class, "tableId"));
    }

    public Object setProfileId(RuntimeEnv env, Object... args) {
        Object profileId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_GaDataProfileInfo.class, "profileId", profileId);

        return null;
    }

    public Object getProfileId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_GaDataProfileInfo.class, "profileId"));
    }

    public Object setProfileName(RuntimeEnv env, Object... args) {
        Object profileName = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_GaDataProfileInfo.class, "profileName", profileName);

        return null;
    }

    public Object getProfileName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_GaDataProfileInfo.class, "profileName"));
    }

    public Object setAccountId(RuntimeEnv env, Object... args) {
        Object accountId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_GaDataProfileInfo.class, "accountId", accountId);

        return null;
    }

    public Object getAccountId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_GaDataProfileInfo.class, "accountId"));
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
