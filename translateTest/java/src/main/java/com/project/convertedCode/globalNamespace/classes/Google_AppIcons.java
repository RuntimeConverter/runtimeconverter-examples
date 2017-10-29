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

public class Google_AppIcons extends Google_Model implements RuntimeFileContextInterface {

    public Object category = null;

    public Object iconUrl = null;

    public Object size = null;

    public Google_AppIcons(RuntimeEnv env, Object... args) {
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
            case "setCategory":
                return this.setCategory(env, args);
            case "getCategory":
                return this.getCategory(env, args);
            case "setIconUrl":
                return this.setIconUrl(env, args);
            case "getIconUrl":
                return this.getIconUrl(env, args);
            case "setSize":
                return this.setSize(env, args);
            case "getSize":
                return this.getSize(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "category":
                return this.category;
            case "iconUrl":
                return this.iconUrl;
            case "size":
                return this.size;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "category":
                return ZVal.isNull(this.category);
            case "iconUrl":
                return ZVal.isNull(this.iconUrl);
            case "size":
                return ZVal.isNull(this.size);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "category":
                this.category = value;
                break;
            case "iconUrl":
                this.iconUrl = value;
                break;
            case "size":
                this.size = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setCategory(RuntimeEnv env, Object... args) {
        Object category = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AppIcons.class, "category", category);

        return null;
    }

    public Object getCategory(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AppIcons.class, "category"));
    }

    public Object setIconUrl(RuntimeEnv env, Object... args) {
        Object iconUrl = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AppIcons.class, "iconUrl", iconUrl);

        return null;
    }

    public Object getIconUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AppIcons.class, "iconUrl"));
    }

    public Object setSize(RuntimeEnv env, Object... args) {
        Object size = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AppIcons.class, "size", size);

        return null;
    }

    public Object getSize(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AppIcons.class, "size"));
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
