package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Google_WebfontsServiceResource;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Google_Service;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_WebfontsService.php

*/

public class Google_WebfontsService extends Google_Service implements RuntimeFileContextInterface {

    public Object webfonts = null;

    public Google_WebfontsService(RuntimeEnv env, Object... args) {
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
            case "webfonts":
                return this.webfonts;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "webfonts":
                return ZVal.isNull(this.webfonts);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "webfonts":
                this.webfonts = value;
                break;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object client = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_WebfontsService.class, "servicePath", "webfonts/v1/");
        ZVal.setProperty(this, Google_WebfontsService.class, "version", "v1");
        ZVal.setProperty(this, Google_WebfontsService.class, "serviceName", "webfonts");
        env.callMethod(
                client,
                "addService",
                Google_WebfontsService.class,
                ZVal.getProperty(this, Google_WebfontsService.class, "serviceName"),
                ZVal.getProperty(this, Google_WebfontsService.class, "version"));
        ZVal.setProperty(
                this,
                Google_WebfontsService.class,
                "webfonts",
                new Google_WebfontsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_WebfontsService.class, "serviceName"),
                        "webfonts",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"httpMethod\": \"GET\", \"response\": {\"$ref\": \"WebfontList\"}, \"id\": \"webfonts.webfonts.list\", \"parameters\": {\"sort\": {\"enum\": [\"alpha\", \"date\", \"popularity\", \"style\", \"trending\"], \"type\": \"string\", \"location\": \"query\"}}, \"path\": \"webfonts\"}}}",
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
