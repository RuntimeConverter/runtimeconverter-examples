package com.project.convertedCode.globalNamespace.classes;

import com.project.convertedCode.globalNamespace.classes.Google_DetectionsServiceResource;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.classes.Google_LanguagesServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_TranslationsServiceResource;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Google_Service;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_TranslateService.php

*/

public class Google_TranslateService extends Google_Service implements RuntimeFileContextInterface {

    public Object languages = null;

    public Object detections = null;

    public Object translations = null;

    public Google_TranslateService(RuntimeEnv env, Object... args) {
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
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "languages":
                return this.languages;
            case "detections":
                return this.detections;
            case "translations":
                return this.translations;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "languages":
                return ZVal.isNull(this.languages);
            case "detections":
                return ZVal.isNull(this.detections);
            case "translations":
                return ZVal.isNull(this.translations);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "languages":
                this.languages = value;
                break;
            case "detections":
                this.detections = value;
                break;
            case "translations":
                this.translations = value;
                break;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object client = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_TranslateService.class, "servicePath", "language/translate/");
        ZVal.setProperty(this, Google_TranslateService.class, "version", "v2");
        ZVal.setProperty(this, Google_TranslateService.class, "serviceName", "translate");
        env.callMethod(
                client,
                "addService",
                Google_TranslateService.class,
                ZVal.getProperty(this, Google_TranslateService.class, "serviceName"),
                ZVal.getProperty(this, Google_TranslateService.class, "version"));
        ZVal.setProperty(
                this,
                Google_TranslateService.class,
                "languages",
                new Google_LanguagesServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_TranslateService.class, "serviceName"),
                        "languages",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"httpMethod\": \"GET\", \"response\": {\"$ref\": \"LanguagesListResponse\"}, \"id\": \"language.languages.list\", \"parameters\": {\"target\": {\"type\": \"string\", \"location\": \"query\"}}, \"path\": \"v2/languages\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_TranslateService.class,
                "detections",
                new Google_DetectionsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_TranslateService.class, "serviceName"),
                        "detections",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"httpMethod\": \"GET\", \"response\": {\"$ref\": \"DetectionsListResponse\"}, \"id\": \"language.detections.list\", \"parameters\": {\"q\": {\"repeated\": true, \"required\": true, \"type\": \"string\", \"location\": \"query\"}}, \"path\": \"v2/detect\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_TranslateService.class,
                "translations",
                new Google_TranslationsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_TranslateService.class, "serviceName"),
                        "translations",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"httpMethod\": \"GET\", \"response\": {\"$ref\": \"TranslationsListResponse\"}, \"id\": \"language.translations.list\", \"parameters\": {\"q\": {\"repeated\": true, \"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"source\": {\"type\": \"string\", \"location\": \"query\"}, \"format\": {\"enum\": [\"html\", \"text\"], \"type\": \"string\", \"location\": \"query\"}, \"target\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"cid\": {\"repeated\": true, \"type\": \"string\", \"location\": \"query\"}}, \"path\": \"v2\"}}}",
                                true)));

        return null;
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
