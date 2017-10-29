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

public class Google_LanguagesListResponse extends Google_Model
        implements RuntimeFileContextInterface {

    public Object __languagesType = "Google_LanguagesResource";

    public Object __languagesDataType = "array";

    public Object languages = null;

    public Google_LanguagesListResponse(RuntimeEnv env, Object... args) {
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
            case "setLanguages":
                return this.setLanguages(env, args);
            case "getLanguages":
                return this.getLanguages(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__languagesType":
                if (Google_LanguagesListResponse.class.isAssignableFrom(caller)) {

                    return this.__languagesType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__languagesDataType":
                if (Google_LanguagesListResponse.class.isAssignableFrom(caller)) {

                    return this.__languagesDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "languages":
                return this.languages;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__languagesType":
                if (Google_LanguagesListResponse.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__languagesType);
                }
                break;
            case "__languagesDataType":
                if (Google_LanguagesListResponse.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__languagesDataType);
                }
                break;
            case "languages":
                return ZVal.isNull(this.languages);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__languagesType":
                if (Google_LanguagesListResponse.class.isAssignableFrom(caller)) {

                    this.__languagesType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__languagesDataType":
                if (Google_LanguagesListResponse.class.isAssignableFrom(caller)) {

                    this.__languagesDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "languages":
                this.languages = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setLanguages(RuntimeEnv env, Object... args) {
        Object languages = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_LanguagesListResponse.class,
                languages,
                "Google_LanguagesResource",
                "setLanguages");
        ZVal.setProperty(this, Google_LanguagesListResponse.class, "languages", languages);

        return null;
    }

    public Object getLanguages(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_LanguagesListResponse.class, "languages"));
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
