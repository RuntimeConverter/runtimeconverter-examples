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

 google-api-php-client/src/contrib/Google_StorageService.php

*/

public class Google_StorageObjectMedia extends Google_Model implements RuntimeFileContextInterface {

    public Object contentType = null;

    public Object timeCreated = null;

    public Object algorithm = null;

    public Object length = null;

    public Object link = null;

    public Object hash = null;

    public Object data = null;

    public Google_StorageObjectMedia(RuntimeEnv env, Object... args) {
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
            case "setContentType":
                return this.setContentType(env, args);
            case "getContentType":
                return this.getContentType(env, args);
            case "setTimeCreated":
                return this.setTimeCreated(env, args);
            case "getTimeCreated":
                return this.getTimeCreated(env, args);
            case "setAlgorithm":
                return this.setAlgorithm(env, args);
            case "getAlgorithm":
                return this.getAlgorithm(env, args);
            case "setLength":
                return this.setLength(env, args);
            case "getLength":
                return this.getLength(env, args);
            case "setLink":
                return this.setLink(env, args);
            case "getLink":
                return this.getLink(env, args);
            case "setHash":
                return this.setHash(env, args);
            case "getHash":
                return this.getHash(env, args);
            case "setData":
                return this.setData(env, args);
            case "getData":
                return this.getData(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "contentType":
                return this.contentType;
            case "timeCreated":
                return this.timeCreated;
            case "algorithm":
                return this.algorithm;
            case "length":
                return this.length;
            case "link":
                return this.link;
            case "hash":
                return this.hash;
            case "data":
                return this.data;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "contentType":
                return ZVal.isNull(this.contentType);
            case "timeCreated":
                return ZVal.isNull(this.timeCreated);
            case "algorithm":
                return ZVal.isNull(this.algorithm);
            case "length":
                return ZVal.isNull(this.length);
            case "link":
                return ZVal.isNull(this.link);
            case "hash":
                return ZVal.isNull(this.hash);
            case "data":
                return ZVal.isNull(this.data);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "contentType":
                this.contentType = value;
                break;
            case "timeCreated":
                this.timeCreated = value;
                break;
            case "algorithm":
                this.algorithm = value;
                break;
            case "length":
                this.length = value;
                break;
            case "link":
                this.link = value;
                break;
            case "hash":
                this.hash = value;
                break;
            case "data":
                this.data = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setContentType(RuntimeEnv env, Object... args) {
        Object contentType = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_StorageObjectMedia.class, "contentType", contentType);

        return null;
    }

    public Object getContentType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_StorageObjectMedia.class, "contentType"));
    }

    public Object setTimeCreated(RuntimeEnv env, Object... args) {
        Object timeCreated = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_StorageObjectMedia.class, "timeCreated", timeCreated);

        return null;
    }

    public Object getTimeCreated(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_StorageObjectMedia.class, "timeCreated"));
    }

    public Object setAlgorithm(RuntimeEnv env, Object... args) {
        Object algorithm = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_StorageObjectMedia.class, "algorithm", algorithm);

        return null;
    }

    public Object getAlgorithm(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_StorageObjectMedia.class, "algorithm"));
    }

    public Object setLength(RuntimeEnv env, Object... args) {
        Object length = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_StorageObjectMedia.class, "length", length);

        return null;
    }

    public Object getLength(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_StorageObjectMedia.class, "length"));
    }

    public Object setLink(RuntimeEnv env, Object... args) {
        Object link = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_StorageObjectMedia.class, "link", link);

        return null;
    }

    public Object getLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_StorageObjectMedia.class, "link"));
    }

    public Object setHash(RuntimeEnv env, Object... args) {
        Object hash = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_StorageObjectMedia.class, "hash", hash);

        return null;
    }

    public Object getHash(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_StorageObjectMedia.class, "hash"));
    }

    public Object setData(RuntimeEnv env, Object... args) {
        Object data = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_StorageObjectMedia.class, "data", data);

        return null;
    }

    public Object getData(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_StorageObjectMedia.class, "data"));
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
