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

 google-api-php-client/src/contrib/Google_ShoppingService.php

*/

public class Google_ShoppingModelDebugJsonV1 extends Google_Model
        implements RuntimeFileContextInterface {

    public Object searchRequest = null;

    public Object rdcResponse = null;

    public Object facetsRequest = null;

    public Object searchResponse = null;

    public Object elapsedMillis = null;

    public Object facetsResponse = null;

    public Object __backendTimesType = "Google_ShoppingModelDebugJsonV1BackendTimes";

    public Object __backendTimesDataType = "array";

    public Object backendTimes = null;

    public Google_ShoppingModelDebugJsonV1(RuntimeEnv env, Object... args) {
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
            case "setSearchRequest":
                return this.setSearchRequest(env, args);
            case "getSearchRequest":
                return this.getSearchRequest(env, args);
            case "setRdcResponse":
                return this.setRdcResponse(env, args);
            case "getRdcResponse":
                return this.getRdcResponse(env, args);
            case "setFacetsRequest":
                return this.setFacetsRequest(env, args);
            case "getFacetsRequest":
                return this.getFacetsRequest(env, args);
            case "setSearchResponse":
                return this.setSearchResponse(env, args);
            case "getSearchResponse":
                return this.getSearchResponse(env, args);
            case "setElapsedMillis":
                return this.setElapsedMillis(env, args);
            case "getElapsedMillis":
                return this.getElapsedMillis(env, args);
            case "setFacetsResponse":
                return this.setFacetsResponse(env, args);
            case "getFacetsResponse":
                return this.getFacetsResponse(env, args);
            case "setBackendTimes":
                return this.setBackendTimes(env, args);
            case "getBackendTimes":
                return this.getBackendTimes(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "searchRequest":
                return this.searchRequest;
            case "rdcResponse":
                return this.rdcResponse;
            case "facetsRequest":
                return this.facetsRequest;
            case "searchResponse":
                return this.searchResponse;
            case "elapsedMillis":
                return this.elapsedMillis;
            case "facetsResponse":
                return this.facetsResponse;
            case "__backendTimesType":
                if (Google_ShoppingModelDebugJsonV1.class.isAssignableFrom(caller)) {

                    return this.__backendTimesType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__backendTimesDataType":
                if (Google_ShoppingModelDebugJsonV1.class.isAssignableFrom(caller)) {

                    return this.__backendTimesDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "backendTimes":
                return this.backendTimes;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "searchRequest":
                return ZVal.isNull(this.searchRequest);
            case "rdcResponse":
                return ZVal.isNull(this.rdcResponse);
            case "facetsRequest":
                return ZVal.isNull(this.facetsRequest);
            case "searchResponse":
                return ZVal.isNull(this.searchResponse);
            case "elapsedMillis":
                return ZVal.isNull(this.elapsedMillis);
            case "facetsResponse":
                return ZVal.isNull(this.facetsResponse);
            case "__backendTimesType":
                if (Google_ShoppingModelDebugJsonV1.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__backendTimesType);
                }
                break;
            case "__backendTimesDataType":
                if (Google_ShoppingModelDebugJsonV1.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__backendTimesDataType);
                }
                break;
            case "backendTimes":
                return ZVal.isNull(this.backendTimes);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "searchRequest":
                this.searchRequest = value;
                break;
            case "rdcResponse":
                this.rdcResponse = value;
                break;
            case "facetsRequest":
                this.facetsRequest = value;
                break;
            case "searchResponse":
                this.searchResponse = value;
                break;
            case "elapsedMillis":
                this.elapsedMillis = value;
                break;
            case "facetsResponse":
                this.facetsResponse = value;
                break;
            case "__backendTimesType":
                if (Google_ShoppingModelDebugJsonV1.class.isAssignableFrom(caller)) {

                    this.__backendTimesType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__backendTimesDataType":
                if (Google_ShoppingModelDebugJsonV1.class.isAssignableFrom(caller)) {

                    this.__backendTimesDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "backendTimes":
                this.backendTimes = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setSearchRequest(RuntimeEnv env, Object... args) {
        Object searchRequest = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_ShoppingModelDebugJsonV1.class, "searchRequest", searchRequest);

        return null;
    }

    public Object getSearchRequest(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelDebugJsonV1.class, "searchRequest"));
    }

    public Object setRdcResponse(RuntimeEnv env, Object... args) {
        Object rdcResponse = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ShoppingModelDebugJsonV1.class, "rdcResponse", rdcResponse);

        return null;
    }

    public Object getRdcResponse(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelDebugJsonV1.class, "rdcResponse"));
    }

    public Object setFacetsRequest(RuntimeEnv env, Object... args) {
        Object facetsRequest = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_ShoppingModelDebugJsonV1.class, "facetsRequest", facetsRequest);

        return null;
    }

    public Object getFacetsRequest(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelDebugJsonV1.class, "facetsRequest"));
    }

    public Object setSearchResponse(RuntimeEnv env, Object... args) {
        Object searchResponse = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_ShoppingModelDebugJsonV1.class, "searchResponse", searchResponse);

        return null;
    }

    public Object getSearchResponse(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelDebugJsonV1.class, "searchResponse"));
    }

    public Object setElapsedMillis(RuntimeEnv env, Object... args) {
        Object elapsedMillis = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_ShoppingModelDebugJsonV1.class, "elapsedMillis", elapsedMillis);

        return null;
    }

    public Object getElapsedMillis(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelDebugJsonV1.class, "elapsedMillis"));
    }

    public Object setFacetsResponse(RuntimeEnv env, Object... args) {
        Object facetsResponse = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_ShoppingModelDebugJsonV1.class, "facetsResponse", facetsResponse);

        return null;
    }

    public Object getFacetsResponse(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelDebugJsonV1.class, "facetsResponse"));
    }

    public Object setBackendTimes(RuntimeEnv env, Object... args) {
        Object backendTimes = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_ShoppingModelDebugJsonV1.class,
                backendTimes,
                "Google_ShoppingModelDebugJsonV1BackendTimes",
                "setBackendTimes");
        ZVal.setProperty(this, Google_ShoppingModelDebugJsonV1.class, "backendTimes", backendTimes);

        return null;
    }

    public Object getBackendTimes(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelDebugJsonV1.class, "backendTimes"));
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
