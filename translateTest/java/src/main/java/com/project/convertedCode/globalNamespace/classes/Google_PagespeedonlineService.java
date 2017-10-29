package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Google_Service;
import com.project.convertedCode.globalNamespace.classes.Google_PagespeedapiServiceResource;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_PagespeedonlineService.php

*/

public class Google_PagespeedonlineService extends Google_Service
        implements RuntimeFileContextInterface {

    public Object pagespeedapi = null;

    public Google_PagespeedonlineService(RuntimeEnv env, Object... args) {
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
            case "pagespeedapi":
                return this.pagespeedapi;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "pagespeedapi":
                return ZVal.isNull(this.pagespeedapi);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "pagespeedapi":
                this.pagespeedapi = value;
                break;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object client = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_PagespeedonlineService.class, "servicePath", "pagespeedonline/v1/");
        ZVal.setProperty(this, Google_PagespeedonlineService.class, "version", "v1");
        ZVal.setProperty(
                this, Google_PagespeedonlineService.class, "serviceName", "pagespeedonline");
        env.callMethod(
                client,
                "addService",
                Google_PagespeedonlineService.class,
                ZVal.getProperty(this, Google_PagespeedonlineService.class, "serviceName"),
                ZVal.getProperty(this, Google_PagespeedonlineService.class, "version"));
        ZVal.setProperty(
                this,
                Google_PagespeedonlineService.class,
                "pagespeedapi",
                new Google_PagespeedapiServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_PagespeedonlineService.class, "serviceName"),
                        "pagespeedapi",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"runpagespeed\": {\"httpMethod\": \"GET\", \"response\": {\"$ref\": \"Result\"}, \"id\": \"pagespeedonline.pagespeedapi.runpagespeed\", \"parameters\": {\"locale\": {\"type\": \"string\", \"location\": \"query\"}, \"url\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"rule\": {\"repeated\": true, \"type\": \"string\", \"location\": \"query\"}, \"strategy\": {\"enum\": [\"desktop\", \"mobile\"], \"type\": \"string\", \"location\": \"query\"}}, \"path\": \"runPagespeed\"}}}",
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
