package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Google_Service;
import com.project.convertedCode.globalNamespace.classes.Google_MomentsServiceResource;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_PlusMomentsService.php

*/

public class Google_PlusMomentsService extends Google_Service
        implements RuntimeFileContextInterface {

    public Object moments = null;

    public Google_PlusMomentsService(RuntimeEnv env, Object... args) {
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
            case "moments":
                return this.moments;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "moments":
                return ZVal.isNull(this.moments);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "moments":
                this.moments = value;
                break;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object client = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_PlusMomentsService.class, "servicePath", "plus/v1moments/people/");
        ZVal.setProperty(this, Google_PlusMomentsService.class, "version", "v1moments");
        ZVal.setProperty(this, Google_PlusMomentsService.class, "serviceName", "plus");
        env.callMethod(
                client,
                "addService",
                Google_PlusMomentsService.class,
                ZVal.getProperty(this, Google_PlusMomentsService.class, "serviceName"),
                ZVal.getProperty(this, Google_PlusMomentsService.class, "version"));
        ZVal.setProperty(
                this,
                Google_PlusMomentsService.class,
                "moments",
                new Google_MomentsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_PlusMomentsService.class, "serviceName"),
                        "moments",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"parameters\": {\"debug\": {\"type\": \"boolean\", \"location\": \"query\"}, \"userId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"collection\": {\"required\": true, \"type\": \"string\", \"location\": \"path\", \"enum\": [\"vault\"]}}, \"request\": {\"$ref\": \"Moment\"}, \"response\": {\"$ref\": \"Moment\"}, \"httpMethod\": \"POST\", \"path\": \"{userId}/moments/{collection}\", \"id\": \"plus.moments.insert\"}}}",
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
