package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.classes.Google_WebResourceServiceResource;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Google_Service;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_SiteVerificationService.php

*/

public class Google_SiteVerificationService extends Google_Service
        implements RuntimeFileContextInterface {

    public Object webResource = null;

    public Google_SiteVerificationService(RuntimeEnv env, Object... args) {
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
            case "webResource":
                return this.webResource;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "webResource":
                return ZVal.isNull(this.webResource);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "webResource":
                this.webResource = value;
                break;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object client = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_SiteVerificationService.class, "servicePath", "siteVerification/v1/");
        ZVal.setProperty(this, Google_SiteVerificationService.class, "version", "v1");
        ZVal.setProperty(
                this, Google_SiteVerificationService.class, "serviceName", "siteVerification");
        env.callMethod(
                client,
                "addService",
                Google_SiteVerificationService.class,
                ZVal.getProperty(this, Google_SiteVerificationService.class, "serviceName"),
                ZVal.getProperty(this, Google_SiteVerificationService.class, "version"));
        ZVal.setProperty(
                this,
                Google_SiteVerificationService.class,
                "webResource",
                new Google_WebResourceServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_SiteVerificationService.class, "serviceName"),
                        "webResource",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/siteverification\", \"https://www.googleapis.com/auth/siteverification.verify_only\"], \"parameters\": {\"verificationMethod\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}}, \"request\": {\"$ref\": \"SiteVerificationWebResourceResource\"}, \"response\": {\"$ref\": \"SiteVerificationWebResourceResource\"}, \"httpMethod\": \"POST\", \"path\": \"webResource\", \"id\": \"siteVerification.webResource.insert\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/siteverification\"], \"parameters\": {\"id\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"siteVerification.webResource.get\", \"httpMethod\": \"GET\", \"path\": \"webResource/{id}\", \"response\": {\"$ref\": \"SiteVerificationWebResourceResource\"}}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/siteverification\"], \"path\": \"webResource\", \"response\": {\"$ref\": \"SiteVerificationWebResourceListResponse\"}, \"id\": \"siteVerification.webResource.list\", \"httpMethod\": \"GET\"}, \"update\": {\"scopes\": [\"https://www.googleapis.com/auth/siteverification\"], \"parameters\": {\"id\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"SiteVerificationWebResourceResource\"}, \"response\": {\"$ref\": \"SiteVerificationWebResourceResource\"}, \"httpMethod\": \"PUT\", \"path\": \"webResource/{id}\", \"id\": \"siteVerification.webResource.update\"}, \"patch\": {\"scopes\": [\"https://www.googleapis.com/auth/siteverification\"], \"parameters\": {\"id\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"SiteVerificationWebResourceResource\"}, \"response\": {\"$ref\": \"SiteVerificationWebResourceResource\"}, \"httpMethod\": \"PATCH\", \"path\": \"webResource/{id}\", \"id\": \"siteVerification.webResource.patch\"}, \"getToken\": {\"scopes\": [\"https://www.googleapis.com/auth/siteverification\", \"https://www.googleapis.com/auth/siteverification.verify_only\"], \"request\": {\"$ref\": \"SiteVerificationWebResourceGettokenRequest\"}, \"response\": {\"$ref\": \"SiteVerificationWebResourceGettokenResponse\"}, \"httpMethod\": \"POST\", \"path\": \"token\", \"id\": \"siteVerification.webResource.getToken\"}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/siteverification\"], \"path\": \"webResource/{id}\", \"id\": \"siteVerification.webResource.delete\", \"parameters\": {\"id\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"httpMethod\": \"DELETE\"}}}",
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
