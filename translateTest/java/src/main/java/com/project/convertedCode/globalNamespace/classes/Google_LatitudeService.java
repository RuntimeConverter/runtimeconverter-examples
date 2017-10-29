package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.classes.Google_LocationServiceResource;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Google_Service;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Google_CurrentLocationServiceResource;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_LatitudeService.php

*/

public class Google_LatitudeService extends Google_Service implements RuntimeFileContextInterface {

    public Object currentLocation = null;

    public Object location = null;

    public Google_LatitudeService(RuntimeEnv env, Object... args) {
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
            case "currentLocation":
                return this.currentLocation;
            case "location":
                return this.location;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "currentLocation":
                return ZVal.isNull(this.currentLocation);
            case "location":
                return ZVal.isNull(this.location);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "currentLocation":
                this.currentLocation = value;
                break;
            case "location":
                this.location = value;
                break;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object client = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_LatitudeService.class, "servicePath", "latitude/v1/");
        ZVal.setProperty(this, Google_LatitudeService.class, "version", "v1");
        ZVal.setProperty(this, Google_LatitudeService.class, "serviceName", "latitude");
        env.callMethod(
                client,
                "addService",
                Google_LatitudeService.class,
                ZVal.getProperty(this, Google_LatitudeService.class, "serviceName"),
                ZVal.getProperty(this, Google_LatitudeService.class, "version"));
        ZVal.setProperty(
                this,
                Google_LatitudeService.class,
                "currentLocation",
                new Google_CurrentLocationServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_LatitudeService.class, "serviceName"),
                        "currentLocation",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/latitude.all.best\", \"https://www.googleapis.com/auth/latitude.all.city\", \"https://www.googleapis.com/auth/latitude.current.best\", \"https://www.googleapis.com/auth/latitude.current.city\"], \"request\": {\"$ref\": \"LatitudeCurrentlocationResourceJson\"}, \"response\": {\"$ref\": \"LatitudeCurrentlocationResourceJson\"}, \"httpMethod\": \"POST\", \"path\": \"currentLocation\", \"id\": \"latitude.currentLocation.insert\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/latitude.all.best\", \"https://www.googleapis.com/auth/latitude.all.city\", \"https://www.googleapis.com/auth/latitude.current.best\", \"https://www.googleapis.com/auth/latitude.current.city\"], \"parameters\": {\"granularity\": {\"default\": \"city\", \"enum\": [\"best\", \"city\"], \"type\": \"string\", \"location\": \"query\"}}, \"response\": {\"$ref\": \"LatitudeCurrentlocationResourceJson\"}, \"httpMethod\": \"GET\", \"path\": \"currentLocation\", \"id\": \"latitude.currentLocation.get\"}, \"delete\": {\"path\": \"currentLocation\", \"scopes\": [\"https://www.googleapis.com/auth/latitude.all.best\", \"https://www.googleapis.com/auth/latitude.all.city\", \"https://www.googleapis.com/auth/latitude.current.best\", \"https://www.googleapis.com/auth/latitude.current.city\"], \"id\": \"latitude.currentLocation.delete\", \"httpMethod\": \"DELETE\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_LatitudeService.class,
                "location",
                new Google_LocationServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_LatitudeService.class, "serviceName"),
                        "location",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/latitude.all.best\", \"https://www.googleapis.com/auth/latitude.all.city\"], \"request\": {\"$ref\": \"Location\"}, \"response\": {\"$ref\": \"Location\"}, \"httpMethod\": \"POST\", \"path\": \"location\", \"id\": \"latitude.location.insert\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/latitude.all.best\", \"https://www.googleapis.com/auth/latitude.all.city\"], \"parameters\": {\"locationId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"granularity\": {\"default\": \"city\", \"enum\": [\"best\", \"city\"], \"type\": \"string\", \"location\": \"query\"}}, \"id\": \"latitude.location.get\", \"httpMethod\": \"GET\", \"path\": \"location/{locationId}\", \"response\": {\"$ref\": \"Location\"}}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/latitude.all.best\", \"https://www.googleapis.com/auth/latitude.all.city\"], \"parameters\": {\"max-results\": {\"type\": \"string\", \"location\": \"query\"}, \"max-time\": {\"type\": \"string\", \"location\": \"query\"}, \"min-time\": {\"type\": \"string\", \"location\": \"query\"}, \"granularity\": {\"default\": \"city\", \"enum\": [\"best\", \"city\"], \"type\": \"string\", \"location\": \"query\"}}, \"response\": {\"$ref\": \"LocationFeed\"}, \"httpMethod\": \"GET\", \"path\": \"location\", \"id\": \"latitude.location.list\"}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/latitude.all.best\", \"https://www.googleapis.com/auth/latitude.all.city\"], \"path\": \"location/{locationId}\", \"id\": \"latitude.location.delete\", \"parameters\": {\"locationId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"httpMethod\": \"DELETE\"}}}",
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
