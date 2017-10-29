package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Google_Service;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.classes.Google_UrlServiceResource;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_UrlshortenerService.php

*/

public class Google_UrlshortenerService extends Google_Service
        implements RuntimeFileContextInterface {

    public Object url = null;

    public Google_UrlshortenerService(RuntimeEnv env, Object... args) {
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
            case "url":
                return this.url;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "url":
                return ZVal.isNull(this.url);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "url":
                this.url = value;
                break;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object client = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_UrlshortenerService.class, "servicePath", "urlshortener/v1/");
        ZVal.setProperty(this, Google_UrlshortenerService.class, "version", "v1");
        ZVal.setProperty(this, Google_UrlshortenerService.class, "serviceName", "urlshortener");
        env.callMethod(
                client,
                "addService",
                Google_UrlshortenerService.class,
                ZVal.getProperty(this, Google_UrlshortenerService.class, "serviceName"),
                ZVal.getProperty(this, Google_UrlshortenerService.class, "version"));
        ZVal.setProperty(
                this,
                Google_UrlshortenerService.class,
                "url",
                new Google_UrlServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_UrlshortenerService.class, "serviceName"),
                        "url",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/urlshortener\"], \"request\": {\"$ref\": \"Url\"}, \"response\": {\"$ref\": \"Url\"}, \"httpMethod\": \"POST\", \"path\": \"url\", \"id\": \"urlshortener.url.insert\"}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/urlshortener\"], \"parameters\": {\"start-token\": {\"type\": \"string\", \"location\": \"query\"}, \"projection\": {\"enum\": [\"ANALYTICS_CLICKS\", \"FULL\"], \"type\": \"string\", \"location\": \"query\"}}, \"response\": {\"$ref\": \"UrlHistory\"}, \"httpMethod\": \"GET\", \"path\": \"url/history\", \"id\": \"urlshortener.url.list\"}, \"get\": {\"httpMethod\": \"GET\", \"response\": {\"$ref\": \"Url\"}, \"id\": \"urlshortener.url.get\", \"parameters\": {\"shortUrl\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"projection\": {\"enum\": [\"ANALYTICS_CLICKS\", \"ANALYTICS_TOP_STRINGS\", \"FULL\"], \"type\": \"string\", \"location\": \"query\"}}, \"path\": \"url\"}}}",
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
