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

 google-api-php-client/src/contrib/Google_CustomsearchService.php

*/

public class Google_ResultImage extends Google_Model implements RuntimeFileContextInterface {

    public Object thumbnailWidth = null;

    public Object byteSize = null;

    public Object height = null;

    public Object width = null;

    public Object contextLink = null;

    public Object thumbnailLink = null;

    public Object thumbnailHeight = null;

    public Google_ResultImage(RuntimeEnv env, Object... args) {
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
            case "setThumbnailWidth":
                return this.setThumbnailWidth(env, args);
            case "getThumbnailWidth":
                return this.getThumbnailWidth(env, args);
            case "setByteSize":
                return this.setByteSize(env, args);
            case "getByteSize":
                return this.getByteSize(env, args);
            case "setHeight":
                return this.setHeight(env, args);
            case "getHeight":
                return this.getHeight(env, args);
            case "setWidth":
                return this.setWidth(env, args);
            case "getWidth":
                return this.getWidth(env, args);
            case "setContextLink":
                return this.setContextLink(env, args);
            case "getContextLink":
                return this.getContextLink(env, args);
            case "setThumbnailLink":
                return this.setThumbnailLink(env, args);
            case "getThumbnailLink":
                return this.getThumbnailLink(env, args);
            case "setThumbnailHeight":
                return this.setThumbnailHeight(env, args);
            case "getThumbnailHeight":
                return this.getThumbnailHeight(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "thumbnailWidth":
                return this.thumbnailWidth;
            case "byteSize":
                return this.byteSize;
            case "height":
                return this.height;
            case "width":
                return this.width;
            case "contextLink":
                return this.contextLink;
            case "thumbnailLink":
                return this.thumbnailLink;
            case "thumbnailHeight":
                return this.thumbnailHeight;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "thumbnailWidth":
                return ZVal.isNull(this.thumbnailWidth);
            case "byteSize":
                return ZVal.isNull(this.byteSize);
            case "height":
                return ZVal.isNull(this.height);
            case "width":
                return ZVal.isNull(this.width);
            case "contextLink":
                return ZVal.isNull(this.contextLink);
            case "thumbnailLink":
                return ZVal.isNull(this.thumbnailLink);
            case "thumbnailHeight":
                return ZVal.isNull(this.thumbnailHeight);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "thumbnailWidth":
                this.thumbnailWidth = value;
                break;
            case "byteSize":
                this.byteSize = value;
                break;
            case "height":
                this.height = value;
                break;
            case "width":
                this.width = value;
                break;
            case "contextLink":
                this.contextLink = value;
                break;
            case "thumbnailLink":
                this.thumbnailLink = value;
                break;
            case "thumbnailHeight":
                this.thumbnailHeight = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setThumbnailWidth(RuntimeEnv env, Object... args) {
        Object thumbnailWidth = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ResultImage.class, "thumbnailWidth", thumbnailWidth);

        return null;
    }

    public Object getThumbnailWidth(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ResultImage.class, "thumbnailWidth"));
    }

    public Object setByteSize(RuntimeEnv env, Object... args) {
        Object byteSize = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ResultImage.class, "byteSize", byteSize);

        return null;
    }

    public Object getByteSize(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ResultImage.class, "byteSize"));
    }

    public Object setHeight(RuntimeEnv env, Object... args) {
        Object height = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ResultImage.class, "height", height);

        return null;
    }

    public Object getHeight(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ResultImage.class, "height"));
    }

    public Object setWidth(RuntimeEnv env, Object... args) {
        Object width = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ResultImage.class, "width", width);

        return null;
    }

    public Object getWidth(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ResultImage.class, "width"));
    }

    public Object setContextLink(RuntimeEnv env, Object... args) {
        Object contextLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ResultImage.class, "contextLink", contextLink);

        return null;
    }

    public Object getContextLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ResultImage.class, "contextLink"));
    }

    public Object setThumbnailLink(RuntimeEnv env, Object... args) {
        Object thumbnailLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ResultImage.class, "thumbnailLink", thumbnailLink);

        return null;
    }

    public Object getThumbnailLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ResultImage.class, "thumbnailLink"));
    }

    public Object setThumbnailHeight(RuntimeEnv env, Object... args) {
        Object thumbnailHeight = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ResultImage.class, "thumbnailHeight", thumbnailHeight);

        return null;
    }

    public Object getThumbnailHeight(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ResultImage.class, "thumbnailHeight"));
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
