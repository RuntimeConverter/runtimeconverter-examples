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

 google-api-php-client/src/contrib/Google_AdsensehostService.php

*/

public class Google_AdStyleColors extends Google_Model implements RuntimeFileContextInterface {

    public Object url = null;

    public Object text = null;

    public Object border = null;

    public Object background = null;

    public Object title = null;

    public Google_AdStyleColors(RuntimeEnv env, Object... args) {
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
            case "setText":
                return this.setText(env, args);
            case "getText":
                return this.getText(env, args);
            case "setBorder":
                return this.setBorder(env, args);
            case "getBorder":
                return this.getBorder(env, args);
            case "setBackground":
                return this.setBackground(env, args);
            case "getBackground":
                return this.getBackground(env, args);
            case "setTitle":
                return this.setTitle(env, args);
            case "getTitle":
                return this.getTitle(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "url":
                return this.url;
            case "text":
                return this.text;
            case "border":
                return this.border;
            case "background":
                return this.background;
            case "title":
                return this.title;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "url":
                return ZVal.isNull(this.url);
            case "text":
                return ZVal.isNull(this.text);
            case "border":
                return ZVal.isNull(this.border);
            case "background":
                return ZVal.isNull(this.background);
            case "title":
                return ZVal.isNull(this.title);
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
            case "text":
                this.text = value;
                break;
            case "border":
                this.border = value;
                break;
            case "background":
                this.background = value;
                break;
            case "title":
                this.title = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setUrl(RuntimeEnv env, Object... args) {
        Object url = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AdStyleColors.class, "url", url);

        return null;
    }

    public Object getUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AdStyleColors.class, "url"));
    }

    public Object setText(RuntimeEnv env, Object... args) {
        Object text = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AdStyleColors.class, "text", text);

        return null;
    }

    public Object getText(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AdStyleColors.class, "text"));
    }

    public Object setBorder(RuntimeEnv env, Object... args) {
        Object border = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AdStyleColors.class, "border", border);

        return null;
    }

    public Object getBorder(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AdStyleColors.class, "border"));
    }

    public Object setBackground(RuntimeEnv env, Object... args) {
        Object background = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AdStyleColors.class, "background", background);

        return null;
    }

    public Object getBackground(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AdStyleColors.class, "background"));
    }

    public Object setTitle(RuntimeEnv env, Object... args) {
        Object title = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AdStyleColors.class, "title", title);

        return null;
    }

    public Object getTitle(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AdStyleColors.class, "title"));
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
