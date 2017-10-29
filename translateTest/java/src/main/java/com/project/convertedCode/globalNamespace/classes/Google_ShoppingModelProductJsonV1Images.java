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

public class Google_ShoppingModelProductJsonV1Images extends Google_Model
        implements RuntimeFileContextInterface {

    public Object status = null;

    public Object link = null;

    public Object __thumbnailsType = "Google_ShoppingModelProductJsonV1ImagesThumbnails";

    public Object __thumbnailsDataType = "array";

    public Object thumbnails = null;

    public Google_ShoppingModelProductJsonV1Images(RuntimeEnv env, Object... args) {
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
            case "setStatus":
                return this.setStatus(env, args);
            case "getStatus":
                return this.getStatus(env, args);
            case "setLink":
                return this.setLink(env, args);
            case "getLink":
                return this.getLink(env, args);
            case "setThumbnails":
                return this.setThumbnails(env, args);
            case "getThumbnails":
                return this.getThumbnails(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "status":
                return this.status;
            case "link":
                return this.link;
            case "__thumbnailsType":
                if (Google_ShoppingModelProductJsonV1Images.class.isAssignableFrom(caller)) {

                    return this.__thumbnailsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__thumbnailsDataType":
                if (Google_ShoppingModelProductJsonV1Images.class.isAssignableFrom(caller)) {

                    return this.__thumbnailsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "thumbnails":
                return this.thumbnails;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "status":
                return ZVal.isNull(this.status);
            case "link":
                return ZVal.isNull(this.link);
            case "__thumbnailsType":
                if (Google_ShoppingModelProductJsonV1Images.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__thumbnailsType);
                }
                break;
            case "__thumbnailsDataType":
                if (Google_ShoppingModelProductJsonV1Images.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__thumbnailsDataType);
                }
                break;
            case "thumbnails":
                return ZVal.isNull(this.thumbnails);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "status":
                this.status = value;
                break;
            case "link":
                this.link = value;
                break;
            case "__thumbnailsType":
                if (Google_ShoppingModelProductJsonV1Images.class.isAssignableFrom(caller)) {

                    this.__thumbnailsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__thumbnailsDataType":
                if (Google_ShoppingModelProductJsonV1Images.class.isAssignableFrom(caller)) {

                    this.__thumbnailsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "thumbnails":
                this.thumbnails = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setStatus(RuntimeEnv env, Object... args) {
        Object status = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ShoppingModelProductJsonV1Images.class, "status", status);

        return null;
    }

    public Object getStatus(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelProductJsonV1Images.class, "status"));
    }

    public Object setLink(RuntimeEnv env, Object... args) {
        Object link = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ShoppingModelProductJsonV1Images.class, "link", link);

        return null;
    }

    public Object getLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelProductJsonV1Images.class, "link"));
    }

    public Object setThumbnails(RuntimeEnv env, Object... args) {
        Object thumbnails = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_ShoppingModelProductJsonV1Images.class,
                thumbnails,
                "Google_ShoppingModelProductJsonV1ImagesThumbnails",
                "setThumbnails");
        ZVal.setProperty(
                this, Google_ShoppingModelProductJsonV1Images.class, "thumbnails", thumbnails);

        return null;
    }

    public Object getThumbnails(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_ShoppingModelProductJsonV1Images.class, "thumbnails"));
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
