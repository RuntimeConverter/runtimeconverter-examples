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

 google-api-php-client/src/contrib/Google_PlusService.php

*/

public class Google_ActivityObjectAttachmentsFullImage extends Google_Model
        implements RuntimeFileContextInterface {

    public Object url = null;

    public Object width = null;

    public Object type = null;

    public Object height = null;

    public Google_ActivityObjectAttachmentsFullImage(RuntimeEnv env, Object... args) {
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
            case "setUrl":
                return this.setUrl(env, args);
            case "getUrl":
                return this.getUrl(env, args);
            case "setWidth":
                return this.setWidth(env, args);
            case "getWidth":
                return this.getWidth(env, args);
            case "setType":
                return this.setType(env, args);
            case "getType":
                return this.getType(env, args);
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
            case "url":
                return this.url;
            case "width":
                return this.width;
            case "type":
                return this.type;
            case "height":
                return this.height;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "url":
                return ZVal.isNull(this.url);
            case "width":
                return ZVal.isNull(this.width);
            case "type":
                return ZVal.isNull(this.type);
            case "height":
                return ZVal.isNull(this.height);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "url":
                this.url = value;
                break;
            case "width":
                this.width = value;
                break;
            case "type":
                this.type = value;
                break;
            case "height":
                this.height = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setUrl(RuntimeEnv env, Object... args) {
        Object url = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ActivityObjectAttachmentsFullImage.class, "url", url);

        return null;
    }

    public Object getUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ActivityObjectAttachmentsFullImage.class, "url"));
    }

    public Object setWidth(RuntimeEnv env, Object... args) {
        Object width = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ActivityObjectAttachmentsFullImage.class, "width", width);

        return null;
    }

    public Object getWidth(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ActivityObjectAttachmentsFullImage.class, "width"));
    }

    public Object setType(RuntimeEnv env, Object... args) {
        Object type = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ActivityObjectAttachmentsFullImage.class, "type", type);

        return null;
    }

    public Object getType(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ActivityObjectAttachmentsFullImage.class, "type"));
    }

    public Object setHeight(RuntimeEnv env, Object... args) {
        Object height = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ActivityObjectAttachmentsFullImage.class, "height", height);

        return null;
    }

    public Object getHeight(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ActivityObjectAttachmentsFullImage.class, "height"));
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
