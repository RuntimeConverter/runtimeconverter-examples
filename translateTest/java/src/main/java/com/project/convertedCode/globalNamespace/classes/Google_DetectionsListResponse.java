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

 google-api-php-client/src/contrib/Google_TranslateService.php

*/

public class Google_DetectionsListResponse extends Google_Model
        implements RuntimeFileContextInterface {

    public Object __detectionsType = "Google_DetectionsResourceItems";

    public Object __detectionsDataType = "array";

    public Object detections = null;

    public Google_DetectionsListResponse(RuntimeEnv env, Object... args) {
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
            case "setDetections":
                return this.setDetections(env, args);
            case "getDetections":
                return this.getDetections(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__detectionsType":
                if (Google_DetectionsListResponse.class.isAssignableFrom(caller)) {

                    return this.__detectionsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__detectionsDataType":
                if (Google_DetectionsListResponse.class.isAssignableFrom(caller)) {

                    return this.__detectionsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "detections":
                return this.detections;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__detectionsType":
                if (Google_DetectionsListResponse.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__detectionsType);
                }
                break;
            case "__detectionsDataType":
                if (Google_DetectionsListResponse.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__detectionsDataType);
                }
                break;
            case "detections":
                return ZVal.isNull(this.detections);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__detectionsType":
                if (Google_DetectionsListResponse.class.isAssignableFrom(caller)) {

                    this.__detectionsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__detectionsDataType":
                if (Google_DetectionsListResponse.class.isAssignableFrom(caller)) {

                    this.__detectionsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "detections":
                this.detections = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setDetections(RuntimeEnv env, Object... args) {
        Object detections = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_DetectionsListResponse.class,
                detections,
                "Google_DetectionsResourceItems",
                "setDetections");
        ZVal.setProperty(this, Google_DetectionsListResponse.class, "detections", detections);

        return null;
    }

    public Object getDetections(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_DetectionsListResponse.class, "detections"));
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
