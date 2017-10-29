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

 google-api-php-client/src/contrib/Google_DriveService.php

*/

public class Google_AboutFeatures extends Google_Model implements RuntimeFileContextInterface {

    public Object featureName = null;

    public Object featureRate = null;

    public Google_AboutFeatures(RuntimeEnv env, Object... args) {
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
            case "setFeatureName":
                return this.setFeatureName(env, args);
            case "getFeatureName":
                return this.getFeatureName(env, args);
            case "setFeatureRate":
                return this.setFeatureRate(env, args);
            case "getFeatureRate":
                return this.getFeatureRate(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "featureName":
                return this.featureName;
            case "featureRate":
                return this.featureRate;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "featureName":
                return ZVal.isNull(this.featureName);
            case "featureRate":
                return ZVal.isNull(this.featureRate);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "featureName":
                this.featureName = value;
                break;
            case "featureRate":
                this.featureRate = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setFeatureName(RuntimeEnv env, Object... args) {
        Object featureName = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AboutFeatures.class, "featureName", featureName);

        return null;
    }

    public Object getFeatureName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AboutFeatures.class, "featureName"));
    }

    public Object setFeatureRate(RuntimeEnv env, Object... args) {
        Object featureRate = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AboutFeatures.class, "featureRate", featureRate);

        return null;
    }

    public Object getFeatureRate(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AboutFeatures.class, "featureRate"));
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
