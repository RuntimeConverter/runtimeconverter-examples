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

 google-api-php-client/src/contrib/Google_CustomsearchService.php

*/

public class Google_SearchSearchInformation extends Google_Model
        implements RuntimeFileContextInterface {

    public Object formattedSearchTime = null;

    public Object formattedTotalResults = null;

    public Object totalResults = null;

    public Object searchTime = null;

    public Google_SearchSearchInformation(RuntimeEnv env, Object... args) {
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
            case "setFormattedSearchTime":
                return this.setFormattedSearchTime(env, args);
            case "getFormattedSearchTime":
                return this.getFormattedSearchTime(env, args);
            case "setFormattedTotalResults":
                return this.setFormattedTotalResults(env, args);
            case "getFormattedTotalResults":
                return this.getFormattedTotalResults(env, args);
            case "setTotalResults":
                return this.setTotalResults(env, args);
            case "getTotalResults":
                return this.getTotalResults(env, args);
            case "setSearchTime":
                return this.setSearchTime(env, args);
            case "getSearchTime":
                return this.getSearchTime(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "formattedSearchTime":
                return this.formattedSearchTime;
            case "formattedTotalResults":
                return this.formattedTotalResults;
            case "totalResults":
                return this.totalResults;
            case "searchTime":
                return this.searchTime;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "formattedSearchTime":
                return ZVal.isNull(this.formattedSearchTime);
            case "formattedTotalResults":
                return ZVal.isNull(this.formattedTotalResults);
            case "totalResults":
                return ZVal.isNull(this.totalResults);
            case "searchTime":
                return ZVal.isNull(this.searchTime);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "formattedSearchTime":
                this.formattedSearchTime = value;
                break;
            case "formattedTotalResults":
                this.formattedTotalResults = value;
                break;
            case "totalResults":
                this.totalResults = value;
                break;
            case "searchTime":
                this.searchTime = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setFormattedSearchTime(RuntimeEnv env, Object... args) {
        Object formattedSearchTime = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_SearchSearchInformation.class,
                "formattedSearchTime",
                formattedSearchTime);

        return null;
    }

    public Object getFormattedSearchTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_SearchSearchInformation.class, "formattedSearchTime"));
    }

    public Object setFormattedTotalResults(RuntimeEnv env, Object... args) {
        Object formattedTotalResults = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_SearchSearchInformation.class,
                "formattedTotalResults",
                formattedTotalResults);

        return null;
    }

    public Object getFormattedTotalResults(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_SearchSearchInformation.class, "formattedTotalResults"));
    }

    public Object setTotalResults(RuntimeEnv env, Object... args) {
        Object totalResults = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_SearchSearchInformation.class, "totalResults", totalResults);

        return null;
    }

    public Object getTotalResults(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_SearchSearchInformation.class, "totalResults"));
    }

    public Object setSearchTime(RuntimeEnv env, Object... args) {
        Object searchTime = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_SearchSearchInformation.class, "searchTime", searchTime);

        return null;
    }

    public Object getSearchTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_SearchSearchInformation.class, "searchTime"));
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
