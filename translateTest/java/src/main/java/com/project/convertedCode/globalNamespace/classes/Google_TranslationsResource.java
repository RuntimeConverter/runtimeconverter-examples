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

public class Google_TranslationsResource extends Google_Model
        implements RuntimeFileContextInterface {

    public Object detectedSourceLanguage = null;

    public Object translatedText = null;

    public Google_TranslationsResource(RuntimeEnv env, Object... args) {
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
            case "setDetectedSourceLanguage":
                return this.setDetectedSourceLanguage(env, args);
            case "getDetectedSourceLanguage":
                return this.getDetectedSourceLanguage(env, args);
            case "setTranslatedText":
                return this.setTranslatedText(env, args);
            case "getTranslatedText":
                return this.getTranslatedText(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "detectedSourceLanguage":
                return this.detectedSourceLanguage;
            case "translatedText":
                return this.translatedText;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "detectedSourceLanguage":
                return ZVal.isNull(this.detectedSourceLanguage);
            case "translatedText":
                return ZVal.isNull(this.translatedText);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "detectedSourceLanguage":
                this.detectedSourceLanguage = value;
                break;
            case "translatedText":
                this.translatedText = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setDetectedSourceLanguage(RuntimeEnv env, Object... args) {
        Object detectedSourceLanguage = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_TranslationsResource.class,
                "detectedSourceLanguage",
                detectedSourceLanguage);

        return null;
    }

    public Object getDetectedSourceLanguage(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_TranslationsResource.class, "detectedSourceLanguage"));
    }

    public Object setTranslatedText(RuntimeEnv env, Object... args) {
        Object translatedText = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_TranslationsResource.class, "translatedText", translatedText);

        return null;
    }

    public Object getTranslatedText(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_TranslationsResource.class, "translatedText"));
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
