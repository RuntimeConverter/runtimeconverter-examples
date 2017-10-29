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

public class Google_CcOfferDefaultFees extends Google_Model implements RuntimeFileContextInterface {

    public Object category = null;

    public Object maxRate = null;

    public Object minRate = null;

    public Object rateType = null;

    public Google_CcOfferDefaultFees(RuntimeEnv env, Object... args) {
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
            case "setMaxRate":
                return this.setMaxRate(env, args);
            case "getMaxRate":
                return this.getMaxRate(env, args);
            case "setMinRate":
                return this.setMinRate(env, args);
            case "getMinRate":
                return this.getMinRate(env, args);
            case "setRateType":
                return this.setRateType(env, args);
            case "getRateType":
                return this.getRateType(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "category":
                return this.category;
            case "maxRate":
                return this.maxRate;
            case "minRate":
                return this.minRate;
            case "rateType":
                return this.rateType;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "category":
                return ZVal.isNull(this.category);
            case "maxRate":
                return ZVal.isNull(this.maxRate);
            case "minRate":
                return ZVal.isNull(this.minRate);
            case "rateType":
                return ZVal.isNull(this.rateType);
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
            case "maxRate":
                this.maxRate = value;
                break;
            case "minRate":
                this.minRate = value;
                break;
            case "rateType":
                this.rateType = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setCategory(RuntimeEnv env, Object... args) {
        Object category = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOfferDefaultFees.class, "category", category);

        return null;
    }

    public Object getCategory(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOfferDefaultFees.class, "category"));
    }

    public Object setMaxRate(RuntimeEnv env, Object... args) {
        Object maxRate = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOfferDefaultFees.class, "maxRate", maxRate);

        return null;
    }

    public Object getMaxRate(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOfferDefaultFees.class, "maxRate"));
    }

    public Object setMinRate(RuntimeEnv env, Object... args) {
        Object minRate = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOfferDefaultFees.class, "minRate", minRate);

        return null;
    }

    public Object getMinRate(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOfferDefaultFees.class, "minRate"));
    }

    public Object setRateType(RuntimeEnv env, Object... args) {
        Object rateType = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOfferDefaultFees.class, "rateType", rateType);

        return null;
    }

    public Object getRateType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOfferDefaultFees.class, "rateType"));
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
