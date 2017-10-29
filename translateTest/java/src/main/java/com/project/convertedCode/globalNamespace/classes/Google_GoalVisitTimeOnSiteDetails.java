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

public class Google_GoalVisitTimeOnSiteDetails extends Google_Model
        implements RuntimeFileContextInterface {

    public Object comparisonType = null;

    public Object comparisonValue = null;

    public Google_GoalVisitTimeOnSiteDetails(RuntimeEnv env, Object... args) {
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
            case "setComparisonType":
                return this.setComparisonType(env, args);
            case "getComparisonType":
                return this.getComparisonType(env, args);
            case "setComparisonValue":
                return this.setComparisonValue(env, args);
            case "getComparisonValue":
                return this.getComparisonValue(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "comparisonType":
                return this.comparisonType;
            case "comparisonValue":
                return this.comparisonValue;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "comparisonType":
                return ZVal.isNull(this.comparisonType);
            case "comparisonValue":
                return ZVal.isNull(this.comparisonValue);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "comparisonType":
                this.comparisonType = value;
                break;
            case "comparisonValue":
                this.comparisonValue = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setComparisonType(RuntimeEnv env, Object... args) {
        Object comparisonType = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_GoalVisitTimeOnSiteDetails.class, "comparisonType", comparisonType);

        return null;
    }

    public Object getComparisonType(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_GoalVisitTimeOnSiteDetails.class, "comparisonType"));
    }

    public Object setComparisonValue(RuntimeEnv env, Object... args) {
        Object comparisonValue = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_GoalVisitTimeOnSiteDetails.class, "comparisonValue", comparisonValue);

        return null;
    }

    public Object getComparisonValue(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_GoalVisitTimeOnSiteDetails.class, "comparisonValue"));
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
