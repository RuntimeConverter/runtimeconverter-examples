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

 google-api-php-client/src/contrib/Google_PagespeedonlineService.php

*/

public class Google_ResultFormattedResultsRuleResultsUrlBlocksUrls extends Google_Model
        implements RuntimeFileContextInterface {

    public Object __detailsType = "Google_ResultFormattedResultsRuleResultsUrlBlocksUrlsDetails";

    public Object __detailsDataType = "array";

    public Object details = null;

    public Object __resultType = "Google_ResultFormattedResultsRuleResultsUrlBlocksUrlsResult";

    public Object __resultDataType = "";

    public Object result = null;

    public Google_ResultFormattedResultsRuleResultsUrlBlocksUrls(RuntimeEnv env, Object... args) {
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
            case "setDetails":
                return this.setDetails(env, args);
            case "getDetails":
                return this.getDetails(env, args);
            case "setResult":
                return this.setResult(env, args);
            case "getResult":
                return this.getResult(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__detailsType":
                if (Google_ResultFormattedResultsRuleResultsUrlBlocksUrls.class.isAssignableFrom(
                        caller)) {

                    return this.__detailsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__detailsDataType":
                if (Google_ResultFormattedResultsRuleResultsUrlBlocksUrls.class.isAssignableFrom(
                        caller)) {

                    return this.__detailsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "details":
                return this.details;
            case "__resultType":
                if (Google_ResultFormattedResultsRuleResultsUrlBlocksUrls.class.isAssignableFrom(
                        caller)) {

                    return this.__resultType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__resultDataType":
                if (Google_ResultFormattedResultsRuleResultsUrlBlocksUrls.class.isAssignableFrom(
                        caller)) {

                    return this.__resultDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "result":
                return this.result;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__detailsType":
                if (Google_ResultFormattedResultsRuleResultsUrlBlocksUrls.class.isAssignableFrom(
                        caller)) {

                    return ZVal.isNull(this.__detailsType);
                }
                break;
            case "__detailsDataType":
                if (Google_ResultFormattedResultsRuleResultsUrlBlocksUrls.class.isAssignableFrom(
                        caller)) {

                    return ZVal.isNull(this.__detailsDataType);
                }
                break;
            case "details":
                return ZVal.isNull(this.details);
            case "__resultType":
                if (Google_ResultFormattedResultsRuleResultsUrlBlocksUrls.class.isAssignableFrom(
                        caller)) {

                    return ZVal.isNull(this.__resultType);
                }
                break;
            case "__resultDataType":
                if (Google_ResultFormattedResultsRuleResultsUrlBlocksUrls.class.isAssignableFrom(
                        caller)) {

                    return ZVal.isNull(this.__resultDataType);
                }
                break;
            case "result":
                return ZVal.isNull(this.result);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__detailsType":
                if (Google_ResultFormattedResultsRuleResultsUrlBlocksUrls.class.isAssignableFrom(
                        caller)) {

                    this.__detailsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__detailsDataType":
                if (Google_ResultFormattedResultsRuleResultsUrlBlocksUrls.class.isAssignableFrom(
                        caller)) {

                    this.__detailsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "details":
                this.details = value;
                break;
            case "__resultType":
                if (Google_ResultFormattedResultsRuleResultsUrlBlocksUrls.class.isAssignableFrom(
                        caller)) {

                    this.__resultType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__resultDataType":
                if (Google_ResultFormattedResultsRuleResultsUrlBlocksUrls.class.isAssignableFrom(
                        caller)) {

                    this.__resultDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "result":
                this.result = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setDetails(RuntimeEnv env, Object... args) {
        Object details = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_ResultFormattedResultsRuleResultsUrlBlocksUrls.class,
                details,
                "Google_ResultFormattedResultsRuleResultsUrlBlocksUrlsDetails",
                "setDetails");
        ZVal.setProperty(
                this,
                Google_ResultFormattedResultsRuleResultsUrlBlocksUrls.class,
                "details",
                details);

        return null;
    }

    public Object getDetails(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this,
                        Google_ResultFormattedResultsRuleResultsUrlBlocksUrls.class,
                        "details"));
    }

    public Object setResult(RuntimeEnv env, Object... args) {
        Object result = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_ResultFormattedResultsRuleResultsUrlBlocksUrls.class,
                "result",
                result);

        return null;
    }

    public Object getResult(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this,
                        Google_ResultFormattedResultsRuleResultsUrlBlocksUrls.class,
                        "result"));
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
