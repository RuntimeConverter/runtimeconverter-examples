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

 google-api-php-client/src/contrib/Google_StorageService.php

*/

public class Google_BucketWebsite extends Google_Model implements RuntimeFileContextInterface {

    public Object notFoundPage = null;

    public Object mainPageSuffix = null;

    public Google_BucketWebsite(RuntimeEnv env, Object... args) {
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
            case "setNotFoundPage":
                return this.setNotFoundPage(env, args);
            case "getNotFoundPage":
                return this.getNotFoundPage(env, args);
            case "setMainPageSuffix":
                return this.setMainPageSuffix(env, args);
            case "getMainPageSuffix":
                return this.getMainPageSuffix(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "notFoundPage":
                return this.notFoundPage;
            case "mainPageSuffix":
                return this.mainPageSuffix;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "notFoundPage":
                return ZVal.isNull(this.notFoundPage);
            case "mainPageSuffix":
                return ZVal.isNull(this.mainPageSuffix);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "notFoundPage":
                this.notFoundPage = value;
                break;
            case "mainPageSuffix":
                this.mainPageSuffix = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setNotFoundPage(RuntimeEnv env, Object... args) {
        Object notFoundPage = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_BucketWebsite.class, "notFoundPage", notFoundPage);

        return null;
    }

    public Object getNotFoundPage(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_BucketWebsite.class, "notFoundPage"));
    }

    public Object setMainPageSuffix(RuntimeEnv env, Object... args) {
        Object mainPageSuffix = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_BucketWebsite.class, "mainPageSuffix", mainPageSuffix);

        return null;
    }

    public Object getMainPageSuffix(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_BucketWebsite.class, "mainPageSuffix"));
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
