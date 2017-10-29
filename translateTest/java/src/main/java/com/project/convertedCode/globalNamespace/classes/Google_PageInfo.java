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

 google-api-php-client/src/contrib/Google_YoutubeService.php

*/

public class Google_PageInfo extends Google_Model implements RuntimeFileContextInterface {

    public Object totalResults = null;

    public Object startIndex = null;

    public Object resultPerPage = null;

    public Google_PageInfo(RuntimeEnv env, Object... args) {
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
            case "setTotalResults":
                return this.setTotalResults(env, args);
            case "getTotalResults":
                return this.getTotalResults(env, args);
            case "setStartIndex":
                return this.setStartIndex(env, args);
            case "getStartIndex":
                return this.getStartIndex(env, args);
            case "setResultPerPage":
                return this.setResultPerPage(env, args);
            case "getResultPerPage":
                return this.getResultPerPage(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "totalResults":
                return this.totalResults;
            case "startIndex":
                return this.startIndex;
            case "resultPerPage":
                return this.resultPerPage;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "totalResults":
                return ZVal.isNull(this.totalResults);
            case "startIndex":
                return ZVal.isNull(this.startIndex);
            case "resultPerPage":
                return ZVal.isNull(this.resultPerPage);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "totalResults":
                this.totalResults = value;
                break;
            case "startIndex":
                this.startIndex = value;
                break;
            case "resultPerPage":
                this.resultPerPage = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setTotalResults(RuntimeEnv env, Object... args) {
        Object totalResults = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PageInfo.class, "totalResults", totalResults);

        return null;
    }

    public Object getTotalResults(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PageInfo.class, "totalResults"));
    }

    public Object setStartIndex(RuntimeEnv env, Object... args) {
        Object startIndex = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PageInfo.class, "startIndex", startIndex);

        return null;
    }

    public Object getStartIndex(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PageInfo.class, "startIndex"));
    }

    public Object setResultPerPage(RuntimeEnv env, Object... args) {
        Object resultPerPage = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PageInfo.class, "resultPerPage", resultPerPage);

        return null;
    }

    public Object getResultPerPage(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PageInfo.class, "resultPerPage"));
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
