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

public class Google_TranslationsListResponse extends Google_Model
        implements RuntimeFileContextInterface {

    public Object __translationsType = "Google_TranslationsResource";

    public Object __translationsDataType = "array";

    public Object translations = null;

    public Google_TranslationsListResponse(RuntimeEnv env, Object... args) {
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
            case "setTranslations":
                return this.setTranslations(env, args);
            case "getTranslations":
                return this.getTranslations(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__translationsType":
                if (Google_TranslationsListResponse.class.isAssignableFrom(caller)) {

                    return this.__translationsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__translationsDataType":
                if (Google_TranslationsListResponse.class.isAssignableFrom(caller)) {

                    return this.__translationsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "translations":
                return this.translations;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__translationsType":
                if (Google_TranslationsListResponse.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__translationsType);
                }
                break;
            case "__translationsDataType":
                if (Google_TranslationsListResponse.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__translationsDataType);
                }
                break;
            case "translations":
                return ZVal.isNull(this.translations);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__translationsType":
                if (Google_TranslationsListResponse.class.isAssignableFrom(caller)) {

                    this.__translationsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__translationsDataType":
                if (Google_TranslationsListResponse.class.isAssignableFrom(caller)) {

                    this.__translationsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "translations":
                this.translations = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setTranslations(RuntimeEnv env, Object... args) {
        Object translations = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_TranslationsListResponse.class,
                translations,
                "Google_TranslationsResource",
                "setTranslations");
        ZVal.setProperty(this, Google_TranslationsListResponse.class, "translations", translations);

        return null;
    }

    public Object getTranslations(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_TranslationsListResponse.class, "translations"));
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
