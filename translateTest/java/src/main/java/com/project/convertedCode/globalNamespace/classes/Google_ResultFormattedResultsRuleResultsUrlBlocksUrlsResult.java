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

public class Google_ResultFormattedResultsRuleResultsUrlBlocksUrlsResult extends Google_Model
        implements RuntimeFileContextInterface {

    public Object __argsType = "Google_ResultFormattedResultsRuleResultsUrlBlocksUrlsResultArgs";

    public Object __argsDataType = "array";

    public Object ___args = null;

    public Object format = null;

    public Google_ResultFormattedResultsRuleResultsUrlBlocksUrlsResult(
            RuntimeEnv env, Object... args) {
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
            case "setArgs":
                return this.setArgs(env, args);
            case "getArgs":
                return this.getArgs(env, args);
            case "setFormat":
                return this.setFormat(env, args);
            case "getFormat":
                return this.getFormat(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__argsType":
                if (Google_ResultFormattedResultsRuleResultsUrlBlocksUrlsResult.class
                        .isAssignableFrom(caller)) {

                    return this.__argsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__argsDataType":
                if (Google_ResultFormattedResultsRuleResultsUrlBlocksUrlsResult.class
                        .isAssignableFrom(caller)) {

                    return this.__argsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "args":
                return this.___args;
            case "format":
                return this.format;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__argsType":
                if (Google_ResultFormattedResultsRuleResultsUrlBlocksUrlsResult.class
                        .isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__argsType);
                }
                break;
            case "__argsDataType":
                if (Google_ResultFormattedResultsRuleResultsUrlBlocksUrlsResult.class
                        .isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__argsDataType);
                }
                break;
            case "args":
                return ZVal.isNull(this.___args);
            case "format":
                return ZVal.isNull(this.format);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__argsType":
                if (Google_ResultFormattedResultsRuleResultsUrlBlocksUrlsResult.class
                        .isAssignableFrom(caller)) {

                    this.__argsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__argsDataType":
                if (Google_ResultFormattedResultsRuleResultsUrlBlocksUrlsResult.class
                        .isAssignableFrom(caller)) {

                    this.__argsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "args":
                this.___args = value;
                break;
            case "format":
                this.format = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setArgs(RuntimeEnv env, Object... args) {
        Object ___args = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_ResultFormattedResultsRuleResultsUrlBlocksUrlsResult.class,
                ___args,
                "Google_ResultFormattedResultsRuleResultsUrlBlocksUrlsResultArgs",
                "setArgs");
        ZVal.setProperty(
                this,
                Google_ResultFormattedResultsRuleResultsUrlBlocksUrlsResult.class,
                "args",
                ___args);

        return null;
    }

    public Object getArgs(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this,
                        Google_ResultFormattedResultsRuleResultsUrlBlocksUrlsResult.class,
                        "args"));
    }

    public Object setFormat(RuntimeEnv env, Object... args) {
        Object format = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_ResultFormattedResultsRuleResultsUrlBlocksUrlsResult.class,
                "format",
                format);

        return null;
    }

    public Object getFormat(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this,
                        Google_ResultFormattedResultsRuleResultsUrlBlocksUrlsResult.class,
                        "format"));
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
