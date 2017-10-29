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

public class Google_ResultFormattedResultsRuleResults extends Google_Model
        implements RuntimeFileContextInterface {

    public Object localizedRuleName = null;

    public Object __urlBlocksType = "Google_ResultFormattedResultsRuleResultsUrlBlocks";

    public Object __urlBlocksDataType = "array";

    public Object urlBlocks = null;

    public Object ruleScore = null;

    public Object ruleImpact = null;

    public Google_ResultFormattedResultsRuleResults(RuntimeEnv env, Object... args) {
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
            case "setLocalizedRuleName":
                return this.setLocalizedRuleName(env, args);
            case "getLocalizedRuleName":
                return this.getLocalizedRuleName(env, args);
            case "setUrlBlocks":
                return this.setUrlBlocks(env, args);
            case "getUrlBlocks":
                return this.getUrlBlocks(env, args);
            case "setRuleScore":
                return this.setRuleScore(env, args);
            case "getRuleScore":
                return this.getRuleScore(env, args);
            case "setRuleImpact":
                return this.setRuleImpact(env, args);
            case "getRuleImpact":
                return this.getRuleImpact(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "localizedRuleName":
                return this.localizedRuleName;
            case "__urlBlocksType":
                if (Google_ResultFormattedResultsRuleResults.class.isAssignableFrom(caller)) {

                    return this.__urlBlocksType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__urlBlocksDataType":
                if (Google_ResultFormattedResultsRuleResults.class.isAssignableFrom(caller)) {

                    return this.__urlBlocksDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "urlBlocks":
                return this.urlBlocks;
            case "ruleScore":
                return this.ruleScore;
            case "ruleImpact":
                return this.ruleImpact;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "localizedRuleName":
                return ZVal.isNull(this.localizedRuleName);
            case "__urlBlocksType":
                if (Google_ResultFormattedResultsRuleResults.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__urlBlocksType);
                }
                break;
            case "__urlBlocksDataType":
                if (Google_ResultFormattedResultsRuleResults.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__urlBlocksDataType);
                }
                break;
            case "urlBlocks":
                return ZVal.isNull(this.urlBlocks);
            case "ruleScore":
                return ZVal.isNull(this.ruleScore);
            case "ruleImpact":
                return ZVal.isNull(this.ruleImpact);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "localizedRuleName":
                this.localizedRuleName = value;
                break;
            case "__urlBlocksType":
                if (Google_ResultFormattedResultsRuleResults.class.isAssignableFrom(caller)) {

                    this.__urlBlocksType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__urlBlocksDataType":
                if (Google_ResultFormattedResultsRuleResults.class.isAssignableFrom(caller)) {

                    this.__urlBlocksDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "urlBlocks":
                this.urlBlocks = value;
                break;
            case "ruleScore":
                this.ruleScore = value;
                break;
            case "ruleImpact":
                this.ruleImpact = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setLocalizedRuleName(RuntimeEnv env, Object... args) {
        Object localizedRuleName = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_ResultFormattedResultsRuleResults.class,
                "localizedRuleName",
                localizedRuleName);

        return null;
    }

    public Object getLocalizedRuleName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_ResultFormattedResultsRuleResults.class, "localizedRuleName"));
    }

    public Object setUrlBlocks(RuntimeEnv env, Object... args) {
        Object urlBlocks = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_ResultFormattedResultsRuleResults.class,
                urlBlocks,
                "Google_ResultFormattedResultsRuleResultsUrlBlocks",
                "setUrlBlocks");
        ZVal.setProperty(
                this, Google_ResultFormattedResultsRuleResults.class, "urlBlocks", urlBlocks);

        return null;
    }

    public Object getUrlBlocks(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_ResultFormattedResultsRuleResults.class, "urlBlocks"));
    }

    public Object setRuleScore(RuntimeEnv env, Object... args) {
        Object ruleScore = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_ResultFormattedResultsRuleResults.class, "ruleScore", ruleScore);

        return null;
    }

    public Object getRuleScore(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_ResultFormattedResultsRuleResults.class, "ruleScore"));
    }

    public Object setRuleImpact(RuntimeEnv env, Object... args) {
        Object ruleImpact = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_ResultFormattedResultsRuleResults.class, "ruleImpact", ruleImpact);

        return null;
    }

    public Object getRuleImpact(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_ResultFormattedResultsRuleResults.class, "ruleImpact"));
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
