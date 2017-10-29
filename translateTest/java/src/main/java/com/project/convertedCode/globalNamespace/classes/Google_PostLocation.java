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

 google-api-php-client/src/contrib/Google_BloggerService.php

*/

public class Google_PostLocation extends Google_Model implements RuntimeFileContextInterface {

    public Object lat = null;

    public Object lng = null;

    public Object span = null;

    public Object name = null;

    public Google_PostLocation(RuntimeEnv env, Object... args) {
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
            case "setLat":
                return this.setLat(env, args);
            case "getLat":
                return this.getLat(env, args);
            case "setLng":
                return this.setLng(env, args);
            case "getLng":
                return this.getLng(env, args);
            case "setSpan":
                return this.setSpan(env, args);
            case "getSpan":
                return this.getSpan(env, args);
            case "setName":
                return this.setName(env, args);
            case "getName":
                return this.getName(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "lat":
                return this.lat;
            case "lng":
                return this.lng;
            case "span":
                return this.span;
            case "name":
                return this.name;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "lat":
                return ZVal.isNull(this.lat);
            case "lng":
                return ZVal.isNull(this.lng);
            case "span":
                return ZVal.isNull(this.span);
            case "name":
                return ZVal.isNull(this.name);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "lat":
                this.lat = value;
                break;
            case "lng":
                this.lng = value;
                break;
            case "span":
                this.span = value;
                break;
            case "name":
                this.name = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setLat(RuntimeEnv env, Object... args) {
        Object lat = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PostLocation.class, "lat", lat);

        return null;
    }

    public Object getLat(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PostLocation.class, "lat"));
    }

    public Object setLng(RuntimeEnv env, Object... args) {
        Object lng = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PostLocation.class, "lng", lng);

        return null;
    }

    public Object getLng(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PostLocation.class, "lng"));
    }

    public Object setSpan(RuntimeEnv env, Object... args) {
        Object span = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PostLocation.class, "span", span);

        return null;
    }

    public Object getSpan(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PostLocation.class, "span"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PostLocation.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PostLocation.class, "name"));
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
