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

 google-api-php-client/src/contrib/Google_DriveService.php

*/

public class Google_DriveFileImageMediaMetadataLocation extends Google_Model
        implements RuntimeFileContextInterface {

    public Object latitude = null;

    public Object altitude = null;

    public Object longitude = null;

    public Google_DriveFileImageMediaMetadataLocation(RuntimeEnv env, Object... args) {
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
            case "setLatitude":
                return this.setLatitude(env, args);
            case "getLatitude":
                return this.getLatitude(env, args);
            case "setAltitude":
                return this.setAltitude(env, args);
            case "getAltitude":
                return this.getAltitude(env, args);
            case "setLongitude":
                return this.setLongitude(env, args);
            case "getLongitude":
                return this.getLongitude(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "latitude":
                return this.latitude;
            case "altitude":
                return this.altitude;
            case "longitude":
                return this.longitude;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "latitude":
                return ZVal.isNull(this.latitude);
            case "altitude":
                return ZVal.isNull(this.altitude);
            case "longitude":
                return ZVal.isNull(this.longitude);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "latitude":
                this.latitude = value;
                break;
            case "altitude":
                this.altitude = value;
                break;
            case "longitude":
                this.longitude = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setLatitude(RuntimeEnv env, Object... args) {
        Object latitude = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_DriveFileImageMediaMetadataLocation.class, "latitude", latitude);

        return null;
    }

    public Object getLatitude(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_DriveFileImageMediaMetadataLocation.class, "latitude"));
    }

    public Object setAltitude(RuntimeEnv env, Object... args) {
        Object altitude = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_DriveFileImageMediaMetadataLocation.class, "altitude", altitude);

        return null;
    }

    public Object getAltitude(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_DriveFileImageMediaMetadataLocation.class, "altitude"));
    }

    public Object setLongitude(RuntimeEnv env, Object... args) {
        Object longitude = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_DriveFileImageMediaMetadataLocation.class, "longitude", longitude);

        return null;
    }

    public Object getLongitude(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_DriveFileImageMediaMetadataLocation.class, "longitude"));
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
