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

public class Google_SearchSpelling extends Google_Model implements RuntimeFileContextInterface {

    public Object correctedQuery = null;

    public Object htmlCorrectedQuery = null;

    public Google_SearchSpelling(RuntimeEnv env, Object... args) {
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
            case "setCorrectedQuery":
                return this.setCorrectedQuery(env, args);
            case "getCorrectedQuery":
                return this.getCorrectedQuery(env, args);
            case "setHtmlCorrectedQuery":
                return this.setHtmlCorrectedQuery(env, args);
            case "getHtmlCorrectedQuery":
                return this.getHtmlCorrectedQuery(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "correctedQuery":
                return this.correctedQuery;
            case "htmlCorrectedQuery":
                return this.htmlCorrectedQuery;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "correctedQuery":
                return ZVal.isNull(this.correctedQuery);
            case "htmlCorrectedQuery":
                return ZVal.isNull(this.htmlCorrectedQuery);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "correctedQuery":
                this.correctedQuery = value;
                break;
            case "htmlCorrectedQuery":
                this.htmlCorrectedQuery = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setCorrectedQuery(RuntimeEnv env, Object... args) {
        Object correctedQuery = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_SearchSpelling.class, "correctedQuery", correctedQuery);

        return null;
    }

    public Object getCorrectedQuery(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_SearchSpelling.class, "correctedQuery"));
    }

    public Object setHtmlCorrectedQuery(RuntimeEnv env, Object... args) {
        Object htmlCorrectedQuery = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_SearchSpelling.class, "htmlCorrectedQuery", htmlCorrectedQuery);

        return null;
    }

    public Object getHtmlCorrectedQuery(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_SearchSpelling.class, "htmlCorrectedQuery"));
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
