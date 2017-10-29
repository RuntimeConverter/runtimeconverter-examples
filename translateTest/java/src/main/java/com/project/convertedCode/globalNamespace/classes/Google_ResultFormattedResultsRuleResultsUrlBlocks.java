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

public class Google_ResultFormattedResultsRuleResultsUrlBlocks extends Google_Model
        implements RuntimeFileContextInterface {

    public Object __headerType = "Google_ResultFormattedResultsRuleResultsUrlBlocksHeader";

    public Object __headerDataType = "";

    public Object header = null;

    public Object __urlsType = "Google_ResultFormattedResultsRuleResultsUrlBlocksUrls";

    public Object __urlsDataType = "array";

    public Object urls = null;

    public Google_ResultFormattedResultsRuleResultsUrlBlocks(RuntimeEnv env, Object... args) {
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
            case "setHeader":
                return this.setHeader(env, args);
            case "getHeader":
                return this.getHeader(env, args);
            case "setUrls":
                return this.setUrls(env, args);
            case "getUrls":
                return this.getUrls(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__headerType":
                if (Google_ResultFormattedResultsRuleResultsUrlBlocks.class.isAssignableFrom(
                        caller)) {

                    return this.__headerType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__headerDataType":
                if (Google_ResultFormattedResultsRuleResultsUrlBlocks.class.isAssignableFrom(
                        caller)) {

                    return this.__headerDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "header":
                return this.header;
            case "__urlsType":
                if (Google_ResultFormattedResultsRuleResultsUrlBlocks.class.isAssignableFrom(
                        caller)) {

                    return this.__urlsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__urlsDataType":
                if (Google_ResultFormattedResultsRuleResultsUrlBlocks.class.isAssignableFrom(
                        caller)) {

                    return this.__urlsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "urls":
                return this.urls;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__headerType":
                if (Google_ResultFormattedResultsRuleResultsUrlBlocks.class.isAssignableFrom(
                        caller)) {

                    return ZVal.isNull(this.__headerType);
                }
                break;
            case "__headerDataType":
                if (Google_ResultFormattedResultsRuleResultsUrlBlocks.class.isAssignableFrom(
                        caller)) {

                    return ZVal.isNull(this.__headerDataType);
                }
                break;
            case "header":
                return ZVal.isNull(this.header);
            case "__urlsType":
                if (Google_ResultFormattedResultsRuleResultsUrlBlocks.class.isAssignableFrom(
                        caller)) {

                    return ZVal.isNull(this.__urlsType);
                }
                break;
            case "__urlsDataType":
                if (Google_ResultFormattedResultsRuleResultsUrlBlocks.class.isAssignableFrom(
                        caller)) {

                    return ZVal.isNull(this.__urlsDataType);
                }
                break;
            case "urls":
                return ZVal.isNull(this.urls);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__headerType":
                if (Google_ResultFormattedResultsRuleResultsUrlBlocks.class.isAssignableFrom(
                        caller)) {

                    this.__headerType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__headerDataType":
                if (Google_ResultFormattedResultsRuleResultsUrlBlocks.class.isAssignableFrom(
                        caller)) {

                    this.__headerDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "header":
                this.header = value;
                break;
            case "__urlsType":
                if (Google_ResultFormattedResultsRuleResultsUrlBlocks.class.isAssignableFrom(
                        caller)) {

                    this.__urlsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__urlsDataType":
                if (Google_ResultFormattedResultsRuleResultsUrlBlocks.class.isAssignableFrom(
                        caller)) {

                    this.__urlsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "urls":
                this.urls = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setHeader(RuntimeEnv env, Object... args) {
        Object header = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_ResultFormattedResultsRuleResultsUrlBlocks.class, "header", header);

        return null;
    }

    public Object getHeader(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_ResultFormattedResultsRuleResultsUrlBlocks.class, "header"));
    }

    public Object setUrls(RuntimeEnv env, Object... args) {
        Object urls = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_ResultFormattedResultsRuleResultsUrlBlocks.class,
                urls,
                "Google_ResultFormattedResultsRuleResultsUrlBlocksUrls",
                "setUrls");
        ZVal.setProperty(
                this, Google_ResultFormattedResultsRuleResultsUrlBlocks.class, "urls", urls);

        return null;
    }

    public Object getUrls(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_ResultFormattedResultsRuleResultsUrlBlocks.class, "urls"));
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
