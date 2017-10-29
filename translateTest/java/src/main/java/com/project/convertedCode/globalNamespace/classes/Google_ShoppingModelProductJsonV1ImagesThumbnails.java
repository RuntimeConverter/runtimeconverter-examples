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

public class Google_ShoppingModelProductJsonV1ImagesThumbnails extends Google_Model
        implements RuntimeFileContextInterface {

    public Object content = null;

    public Object width = null;

    public Object link = null;

    public Object height = null;

    public Google_ShoppingModelProductJsonV1ImagesThumbnails(RuntimeEnv env, Object... args) {
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
            case "setContent":
                return this.setContent(env, args);
            case "getContent":
                return this.getContent(env, args);
            case "setWidth":
                return this.setWidth(env, args);
            case "getWidth":
                return this.getWidth(env, args);
            case "setLink":
                return this.setLink(env, args);
            case "getLink":
                return this.getLink(env, args);
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
            case "content":
                return this.content;
            case "width":
                return this.width;
            case "link":
                return this.link;
            case "height":
                return this.height;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "content":
                return ZVal.isNull(this.content);
            case "width":
                return ZVal.isNull(this.width);
            case "link":
                return ZVal.isNull(this.link);
            case "height":
                return ZVal.isNull(this.height);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "content":
                this.content = value;
                break;
            case "width":
                this.width = value;
                break;
            case "link":
                this.link = value;
                break;
            case "height":
                this.height = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setContent(RuntimeEnv env, Object... args) {
        Object content = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_ShoppingModelProductJsonV1ImagesThumbnails.class, "content", content);

        return null;
    }

    public Object getContent(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_ShoppingModelProductJsonV1ImagesThumbnails.class, "content"));
    }

    public Object setWidth(RuntimeEnv env, Object... args) {
        Object width = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_ShoppingModelProductJsonV1ImagesThumbnails.class, "width", width);

        return null;
    }

    public Object getWidth(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_ShoppingModelProductJsonV1ImagesThumbnails.class, "width"));
    }

    public Object setLink(RuntimeEnv env, Object... args) {
        Object link = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_ShoppingModelProductJsonV1ImagesThumbnails.class, "link", link);

        return null;
    }

    public Object getLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_ShoppingModelProductJsonV1ImagesThumbnails.class, "link"));
    }

    public Object setHeight(RuntimeEnv env, Object... args) {
        Object height = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_ShoppingModelProductJsonV1ImagesThumbnails.class, "height", height);

        return null;
    }

    public Object getHeight(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_ShoppingModelProductJsonV1ImagesThumbnails.class, "height"));
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
