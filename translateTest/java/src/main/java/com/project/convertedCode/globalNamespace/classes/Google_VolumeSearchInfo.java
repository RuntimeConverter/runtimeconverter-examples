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

 google-api-php-client/src/contrib/Google_BooksService.php

*/

public class Google_VolumeSearchInfo extends Google_Model implements RuntimeFileContextInterface {

    public Object textSnippet = null;

    public Google_VolumeSearchInfo(RuntimeEnv env, Object... args) {
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
            case "setTextSnippet":
                return this.setTextSnippet(env, args);
            case "getTextSnippet":
                return this.getTextSnippet(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "textSnippet":
                return this.textSnippet;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "textSnippet":
                return ZVal.isNull(this.textSnippet);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "textSnippet":
                this.textSnippet = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setTextSnippet(RuntimeEnv env, Object... args) {
        Object textSnippet = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeSearchInfo.class, "textSnippet", textSnippet);

        return null;
    }

    public Object getTextSnippet(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeSearchInfo.class, "textSnippet"));
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
