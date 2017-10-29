package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Google_TextServiceResource;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Google_Service;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_FreebaseService.php

*/

public class Google_FreebaseService extends Google_Service implements RuntimeFileContextInterface {

    public Object text = null;

    public Google_FreebaseService(RuntimeEnv env, Object... args) {
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
            case "text":
                return this.text;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "text":
                return ZVal.isNull(this.text);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "text":
                this.text = value;
                break;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object client = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_FreebaseService.class, "servicePath", "freebase/v1/");
        ZVal.setProperty(this, Google_FreebaseService.class, "version", "v1");
        ZVal.setProperty(this, Google_FreebaseService.class, "serviceName", "freebase");
        env.callMethod(
                client,
                "addService",
                Google_FreebaseService.class,
                ZVal.getProperty(this, Google_FreebaseService.class, "serviceName"),
                ZVal.getProperty(this, Google_FreebaseService.class, "version"));
        ZVal.setProperty(
                this,
                Google_FreebaseService.class,
                "text",
                new Google_TextServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_FreebaseService.class, "serviceName"),
                        "text",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"get\": {\"httpMethod\": \"GET\", \"response\": {\"$ref\": \"ContentserviceGet\"}, \"id\": \"freebase.text.get\", \"parameters\": {\"maxlength\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"id\": {\"repeated\": true, \"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"format\": {\"default\": \"plain\", \"enum\": [\"html\", \"plain\", \"raw\"], \"type\": \"string\", \"location\": \"query\"}}, \"path\": \"text{/id*}\"}}}",
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
