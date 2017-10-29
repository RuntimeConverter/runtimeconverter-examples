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

public class Google_ResultFormattedResults extends Google_Model
        implements RuntimeFileContextInterface {

    public Object locale = null;

    public Object __ruleResultsType = "Google_ResultFormattedResultsRuleResults";

    public Object __ruleResultsDataType = "map";

    public Object ruleResults = null;

    public Google_ResultFormattedResults(RuntimeEnv env, Object... args) {
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
            case "setLocale":
                return this.setLocale(env, args);
            case "getLocale":
                return this.getLocale(env, args);
            case "setRuleResults":
                return this.setRuleResults(env, args);
            case "getRuleResults":
                return this.getRuleResults(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "locale":
                return this.locale;
            case "__ruleResultsType":
                if (Google_ResultFormattedResults.class.isAssignableFrom(caller)) {

                    return this.__ruleResultsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__ruleResultsDataType":
                if (Google_ResultFormattedResults.class.isAssignableFrom(caller)) {

                    return this.__ruleResultsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "ruleResults":
                return this.ruleResults;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "locale":
                return ZVal.isNull(this.locale);
            case "__ruleResultsType":
                if (Google_ResultFormattedResults.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__ruleResultsType);
                }
                break;
            case "__ruleResultsDataType":
                if (Google_ResultFormattedResults.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__ruleResultsDataType);
                }
                break;
            case "ruleResults":
                return ZVal.isNull(this.ruleResults);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "locale":
                this.locale = value;
                break;
            case "__ruleResultsType":
                if (Google_ResultFormattedResults.class.isAssignableFrom(caller)) {

                    this.__ruleResultsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__ruleResultsDataType":
                if (Google_ResultFormattedResults.class.isAssignableFrom(caller)) {

                    this.__ruleResultsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "ruleResults":
                this.ruleResults = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setLocale(RuntimeEnv env, Object... args) {
        Object locale = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ResultFormattedResults.class, "locale", locale);

        return null;
    }

    public Object getLocale(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ResultFormattedResults.class, "locale"));
    }

    public Object setRuleResults(RuntimeEnv env, Object... args) {
        Object ruleResults = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ResultFormattedResults.class, "ruleResults", ruleResults);

        return null;
    }

    public Object getRuleResults(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ResultFormattedResults.class, "ruleResults"));
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
