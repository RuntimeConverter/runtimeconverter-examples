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

 google-api-php-client/src/contrib/Google_ModeratorService.php

*/

public class Google_SubmissionTranslations extends Google_Model
        implements RuntimeFileContextInterface {

    public Object lang = null;

    public Object text = null;

    public Google_SubmissionTranslations(RuntimeEnv env, Object... args) {
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
            case "setLang":
                return this.setLang(env, args);
            case "getLang":
                return this.getLang(env, args);
            case "setText":
                return this.setText(env, args);
            case "getText":
                return this.getText(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "lang":
                return this.lang;
            case "text":
                return this.text;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "lang":
                return ZVal.isNull(this.lang);
            case "text":
                return ZVal.isNull(this.text);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "lang":
                this.lang = value;
                break;
            case "text":
                this.text = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setLang(RuntimeEnv env, Object... args) {
        Object lang = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_SubmissionTranslations.class, "lang", lang);

        return null;
    }

    public Object getLang(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_SubmissionTranslations.class, "lang"));
    }

    public Object setText(RuntimeEnv env, Object... args) {
        Object text = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_SubmissionTranslations.class, "text", text);

        return null;
    }

    public Object getText(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_SubmissionTranslations.class, "text"));
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
