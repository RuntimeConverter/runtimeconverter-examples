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

public class Google_DriveFileImageMediaMetadata extends Google_Model
        implements RuntimeFileContextInterface {

    public Object width = null;

    public Object rotation = null;

    public Object __locationType = "Google_DriveFileImageMediaMetadataLocation";

    public Object __locationDataType = "";

    public Object location = null;

    public Object height = null;

    public Google_DriveFileImageMediaMetadata(RuntimeEnv env, Object... args) {
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
            case "setWidth":
                return this.setWidth(env, args);
            case "getWidth":
                return this.getWidth(env, args);
            case "setRotation":
                return this.setRotation(env, args);
            case "getRotation":
                return this.getRotation(env, args);
            case "setLocation":
                return this.setLocation(env, args);
            case "getLocation":
                return this.getLocation(env, args);
            case "setHeight":
                return this.setHeight(env, args);
            case "getHeight":
                return this.getHeight(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "width":
                return this.width;
            case "rotation":
                return this.rotation;
            case "__locationType":
                if (Google_DriveFileImageMediaMetadata.class.isAssignableFrom(caller)) {

                    return this.__locationType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__locationDataType":
                if (Google_DriveFileImageMediaMetadata.class.isAssignableFrom(caller)) {

                    return this.__locationDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "location":
                return this.location;
            case "height":
                return this.height;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "width":
                return ZVal.isNull(this.width);
            case "rotation":
                return ZVal.isNull(this.rotation);
            case "__locationType":
                if (Google_DriveFileImageMediaMetadata.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__locationType);
                }
                break;
            case "__locationDataType":
                if (Google_DriveFileImageMediaMetadata.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__locationDataType);
                }
                break;
            case "location":
                return ZVal.isNull(this.location);
            case "height":
                return ZVal.isNull(this.height);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "width":
                this.width = value;
                break;
            case "rotation":
                this.rotation = value;
                break;
            case "__locationType":
                if (Google_DriveFileImageMediaMetadata.class.isAssignableFrom(caller)) {

                    this.__locationType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__locationDataType":
                if (Google_DriveFileImageMediaMetadata.class.isAssignableFrom(caller)) {

                    this.__locationDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "location":
                this.location = value;
                break;
            case "height":
                this.height = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setWidth(RuntimeEnv env, Object... args) {
        Object width = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DriveFileImageMediaMetadata.class, "width", width);

        return null;
    }

    public Object getWidth(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_DriveFileImageMediaMetadata.class, "width"));
    }

    public Object setRotation(RuntimeEnv env, Object... args) {
        Object rotation = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DriveFileImageMediaMetadata.class, "rotation", rotation);

        return null;
    }

    public Object getRotation(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_DriveFileImageMediaMetadata.class, "rotation"));
    }

    public Object setLocation(RuntimeEnv env, Object... args) {
        Object location = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DriveFileImageMediaMetadata.class, "location", location);

        return null;
    }

    public Object getLocation(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_DriveFileImageMediaMetadata.class, "location"));
    }

    public Object setHeight(RuntimeEnv env, Object... args) {
        Object height = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DriveFileImageMediaMetadata.class, "height", height);

        return null;
    }

    public Object getHeight(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_DriveFileImageMediaMetadata.class, "height"));
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
