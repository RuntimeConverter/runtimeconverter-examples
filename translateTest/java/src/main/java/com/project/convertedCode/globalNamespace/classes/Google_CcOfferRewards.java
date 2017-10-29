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

 google-api-php-client/src/contrib/Google_GanService.php

*/

public class Google_CcOfferRewards extends Google_Model implements RuntimeFileContextInterface {

    public Object category = null;

    public Object minRewardTier = null;

    public Object maxRewardTier = null;

    public Object expirationMonths = null;

    public Object amount = null;

    public Object additionalDetails = null;

    public Google_CcOfferRewards(RuntimeEnv env, Object... args) {
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
            case "setCategory":
                return this.setCategory(env, args);
            case "getCategory":
                return this.getCategory(env, args);
            case "setMinRewardTier":
                return this.setMinRewardTier(env, args);
            case "getMinRewardTier":
                return this.getMinRewardTier(env, args);
            case "setMaxRewardTier":
                return this.setMaxRewardTier(env, args);
            case "getMaxRewardTier":
                return this.getMaxRewardTier(env, args);
            case "setExpirationMonths":
                return this.setExpirationMonths(env, args);
            case "getExpirationMonths":
                return this.getExpirationMonths(env, args);
            case "setAmount":
                return this.setAmount(env, args);
            case "getAmount":
                return this.getAmount(env, args);
            case "setAdditionalDetails":
                return this.setAdditionalDetails(env, args);
            case "getAdditionalDetails":
                return this.getAdditionalDetails(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "category":
                return this.category;
            case "minRewardTier":
                return this.minRewardTier;
            case "maxRewardTier":
                return this.maxRewardTier;
            case "expirationMonths":
                return this.expirationMonths;
            case "amount":
                return this.amount;
            case "additionalDetails":
                return this.additionalDetails;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "category":
                return ZVal.isNull(this.category);
            case "minRewardTier":
                return ZVal.isNull(this.minRewardTier);
            case "maxRewardTier":
                return ZVal.isNull(this.maxRewardTier);
            case "expirationMonths":
                return ZVal.isNull(this.expirationMonths);
            case "amount":
                return ZVal.isNull(this.amount);
            case "additionalDetails":
                return ZVal.isNull(this.additionalDetails);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "category":
                this.category = value;
                break;
            case "minRewardTier":
                this.minRewardTier = value;
                break;
            case "maxRewardTier":
                this.maxRewardTier = value;
                break;
            case "expirationMonths":
                this.expirationMonths = value;
                break;
            case "amount":
                this.amount = value;
                break;
            case "additionalDetails":
                this.additionalDetails = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setCategory(RuntimeEnv env, Object... args) {
        Object category = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOfferRewards.class, "category", category);

        return null;
    }

    public Object getCategory(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOfferRewards.class, "category"));
    }

    public Object setMinRewardTier(RuntimeEnv env, Object... args) {
        Object minRewardTier = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOfferRewards.class, "minRewardTier", minRewardTier);

        return null;
    }

    public Object getMinRewardTier(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOfferRewards.class, "minRewardTier"));
    }

    public Object setMaxRewardTier(RuntimeEnv env, Object... args) {
        Object maxRewardTier = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOfferRewards.class, "maxRewardTier", maxRewardTier);

        return null;
    }

    public Object getMaxRewardTier(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOfferRewards.class, "maxRewardTier"));
    }

    public Object setExpirationMonths(RuntimeEnv env, Object... args) {
        Object expirationMonths = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOfferRewards.class, "expirationMonths", expirationMonths);

        return null;
    }

    public Object getExpirationMonths(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOfferRewards.class, "expirationMonths"));
    }

    public Object setAmount(RuntimeEnv env, Object... args) {
        Object amount = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOfferRewards.class, "amount", amount);

        return null;
    }

    public Object getAmount(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOfferRewards.class, "amount"));
    }

    public Object setAdditionalDetails(RuntimeEnv env, Object... args) {
        Object additionalDetails = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOfferRewards.class, "additionalDetails", additionalDetails);

        return null;
    }

    public Object getAdditionalDetails(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_CcOfferRewards.class, "additionalDetails"));
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
