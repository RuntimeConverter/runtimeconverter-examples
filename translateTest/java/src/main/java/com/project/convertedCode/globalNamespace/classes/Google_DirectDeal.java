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

 google-api-php-client/src/contrib/Google_AdexchangebuyerService.php

*/

public class Google_DirectDeal extends Google_Model implements RuntimeFileContextInterface {

    public Object advertiser = null;

    public Object kind = null;

    public Object currencyCode = null;

    public Object fixedCpm = null;

    public Object startTime = null;

    public Object endTime = null;

    public Object sellerNetwork = null;

    public Object id = null;

    public Object accountId = null;

    public Google_DirectDeal(RuntimeEnv env, Object... args) {
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
            case "setAdvertiser":
                return this.setAdvertiser(env, args);
            case "getAdvertiser":
                return this.getAdvertiser(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setCurrencyCode":
                return this.setCurrencyCode(env, args);
            case "getCurrencyCode":
                return this.getCurrencyCode(env, args);
            case "setFixedCpm":
                return this.setFixedCpm(env, args);
            case "getFixedCpm":
                return this.getFixedCpm(env, args);
            case "setStartTime":
                return this.setStartTime(env, args);
            case "getStartTime":
                return this.getStartTime(env, args);
            case "setEndTime":
                return this.setEndTime(env, args);
            case "getEndTime":
                return this.getEndTime(env, args);
            case "setSellerNetwork":
                return this.setSellerNetwork(env, args);
            case "getSellerNetwork":
                return this.getSellerNetwork(env, args);
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
            case "advertiser":
                return this.advertiser;
            case "kind":
                return this.kind;
            case "currencyCode":
                return this.currencyCode;
            case "fixedCpm":
                return this.fixedCpm;
            case "startTime":
                return this.startTime;
            case "endTime":
                return this.endTime;
            case "sellerNetwork":
                return this.sellerNetwork;
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
            case "advertiser":
                return ZVal.isNull(this.advertiser);
            case "kind":
                return ZVal.isNull(this.kind);
            case "currencyCode":
                return ZVal.isNull(this.currencyCode);
            case "fixedCpm":
                return ZVal.isNull(this.fixedCpm);
            case "startTime":
                return ZVal.isNull(this.startTime);
            case "endTime":
                return ZVal.isNull(this.endTime);
            case "sellerNetwork":
                return ZVal.isNull(this.sellerNetwork);
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
            case "advertiser":
                this.advertiser = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "currencyCode":
                this.currencyCode = value;
                break;
            case "fixedCpm":
                this.fixedCpm = value;
                break;
            case "startTime":
                this.startTime = value;
                break;
            case "endTime":
                this.endTime = value;
                break;
            case "sellerNetwork":
                this.sellerNetwork = value;
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

    public Object setAdvertiser(RuntimeEnv env, Object... args) {
        Object advertiser = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DirectDeal.class, "advertiser", advertiser);

        return null;
    }

    public Object getAdvertiser(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DirectDeal.class, "advertiser"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DirectDeal.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DirectDeal.class, "kind"));
    }

    public Object setCurrencyCode(RuntimeEnv env, Object... args) {
        Object currencyCode = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DirectDeal.class, "currencyCode", currencyCode);

        return null;
    }

    public Object getCurrencyCode(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DirectDeal.class, "currencyCode"));
    }

    public Object setFixedCpm(RuntimeEnv env, Object... args) {
        Object fixedCpm = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DirectDeal.class, "fixedCpm", fixedCpm);

        return null;
    }

    public Object getFixedCpm(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DirectDeal.class, "fixedCpm"));
    }

    public Object setStartTime(RuntimeEnv env, Object... args) {
        Object startTime = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DirectDeal.class, "startTime", startTime);

        return null;
    }

    public Object getStartTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DirectDeal.class, "startTime"));
    }

    public Object setEndTime(RuntimeEnv env, Object... args) {
        Object endTime = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DirectDeal.class, "endTime", endTime);

        return null;
    }

    public Object getEndTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DirectDeal.class, "endTime"));
    }

    public Object setSellerNetwork(RuntimeEnv env, Object... args) {
        Object sellerNetwork = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DirectDeal.class, "sellerNetwork", sellerNetwork);

        return null;
    }

    public Object getSellerNetwork(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DirectDeal.class, "sellerNetwork"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DirectDeal.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DirectDeal.class, "id"));
    }

    public Object setAccountId(RuntimeEnv env, Object... args) {
        Object accountId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DirectDeal.class, "accountId", accountId);

        return null;
    }

    public Object getAccountId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DirectDeal.class, "accountId"));
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
