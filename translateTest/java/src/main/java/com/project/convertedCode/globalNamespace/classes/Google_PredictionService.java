package com.project.convertedCode.globalNamespace.classes;

import com.project.convertedCode.globalNamespace.classes.Google_HostedmodelsServiceResource;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Google_Service;
import com.project.convertedCode.globalNamespace.classes.Google_TrainedmodelsServiceResource;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_PredictionService.php

*/

public class Google_PredictionService extends Google_Service
        implements RuntimeFileContextInterface {

    public Object trainedmodels = null;

    public Object hostedmodels = null;

    public Google_PredictionService(RuntimeEnv env, Object... args) {
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
            case "trainedmodels":
                return this.trainedmodels;
            case "hostedmodels":
                return this.hostedmodels;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "trainedmodels":
                return ZVal.isNull(this.trainedmodels);
            case "hostedmodels":
                return ZVal.isNull(this.hostedmodels);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "trainedmodels":
                this.trainedmodels = value;
                break;
            case "hostedmodels":
                this.hostedmodels = value;
                break;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object client = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PredictionService.class, "servicePath", "prediction/v1.4/");
        ZVal.setProperty(this, Google_PredictionService.class, "version", "v1.4");
        ZVal.setProperty(this, Google_PredictionService.class, "serviceName", "prediction");
        env.callMethod(
                client,
                "addService",
                Google_PredictionService.class,
                ZVal.getProperty(this, Google_PredictionService.class, "serviceName"),
                ZVal.getProperty(this, Google_PredictionService.class, "version"));
        ZVal.setProperty(
                this,
                Google_PredictionService.class,
                "trainedmodels",
                new Google_TrainedmodelsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_PredictionService.class, "serviceName"),
                        "trainedmodels",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"predict\": {\"scopes\": [\"https://www.googleapis.com/auth/prediction\"], \"parameters\": {\"id\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Input\"}, \"response\": {\"$ref\": \"Output\"}, \"httpMethod\": \"POST\", \"path\": \"trainedmodels/{id}/predict\", \"id\": \"prediction.trainedmodels.predict\"}, \"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/devstorage.read_only\", \"https://www.googleapis.com/auth/prediction\"], \"request\": {\"$ref\": \"Training\"}, \"response\": {\"$ref\": \"Training\"}, \"httpMethod\": \"POST\", \"path\": \"trainedmodels\", \"id\": \"prediction.trainedmodels.insert\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/prediction\"], \"parameters\": {\"id\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"prediction.trainedmodels.get\", \"httpMethod\": \"GET\", \"path\": \"trainedmodels/{id}\", \"response\": {\"$ref\": \"Training\"}}, \"update\": {\"scopes\": [\"https://www.googleapis.com/auth/prediction\"], \"parameters\": {\"id\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Update\"}, \"response\": {\"$ref\": \"Training\"}, \"httpMethod\": \"PUT\", \"path\": \"trainedmodels/{id}\", \"id\": \"prediction.trainedmodels.update\"}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/prediction\"], \"path\": \"trainedmodels/{id}\", \"id\": \"prediction.trainedmodels.delete\", \"parameters\": {\"id\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"httpMethod\": \"DELETE\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_PredictionService.class,
                "hostedmodels",
                new Google_HostedmodelsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_PredictionService.class, "serviceName"),
                        "hostedmodels",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"predict\": {\"scopes\": [\"https://www.googleapis.com/auth/prediction\"], \"parameters\": {\"hostedModelName\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Input\"}, \"response\": {\"$ref\": \"Output\"}, \"httpMethod\": \"POST\", \"path\": \"hostedmodels/{hostedModelName}/predict\", \"id\": \"prediction.hostedmodels.predict\"}}}",
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
