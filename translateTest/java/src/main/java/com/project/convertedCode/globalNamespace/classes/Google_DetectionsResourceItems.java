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

 google-api-php-client/src/contrib/Google_TranslateService.php

*/

public class Google_DetectionsResourceItems extends Google_Model
        implements RuntimeFileContextInterface {

    public Object isReliable = null;

    public Object confidence = null;

    public Object language = null;

    public Google_DetectionsResourceItems(RuntimeEnv env, Object... args) {
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
            case "setIsReliable":
                return this.setIsReliable(env, args);
            case "getIsReliable":
                return this.getIsReliable(env, args);
            case "setConfidence":
                return this.setConfidence(env, args);
            case "getConfidence":
                return this.getConfidence(env, args);
            case "setLanguage":
                return this.setLanguage(env, args);
            case "getLanguage":
                return this.getLanguage(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "isReliable":
                return this.isReliable;
            case "confidence":
                return this.confidence;
            case "language":
                return this.language;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "isReliable":
                return ZVal.isNull(this.isReliable);
            case "confidence":
                return ZVal.isNull(this.confidence);
            case "language":
                return ZVal.isNull(this.language);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "isReliable":
                this.isReliable = value;
                break;
            case "confidence":
                this.confidence = value;
                break;
            case "language":
                this.language = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setIsReliable(RuntimeEnv env, Object... args) {
        Object isReliable = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DetectionsResourceItems.class, "isReliable", isReliable);

        return null;
    }

    public Object getIsReliable(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_DetectionsResourceItems.class, "isReliable"));
    }

    public Object setConfidence(RuntimeEnv env, Object... args) {
        Object confidence = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DetectionsResourceItems.class, "confidence", confidence);

        return null;
    }

    public Object getConfidence(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_DetectionsResourceItems.class, "confidence"));
    }

    public Object setLanguage(RuntimeEnv env, Object... args) {
        Object language = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DetectionsResourceItems.class, "language", language);

        return null;
    }

    public Object getLanguage(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_DetectionsResourceItems.class, "language"));
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
