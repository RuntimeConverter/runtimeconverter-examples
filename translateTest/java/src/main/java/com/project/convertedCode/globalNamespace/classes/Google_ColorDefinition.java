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

 google-api-php-client/src/contrib/Google_CalendarService.php

*/

public class Google_ColorDefinition extends Google_Model implements RuntimeFileContextInterface {

    public Object foreground = null;

    public Object background = null;

    public Google_ColorDefinition(RuntimeEnv env, Object... args) {
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
            case "setForeground":
                return this.setForeground(env, args);
            case "getForeground":
                return this.getForeground(env, args);
            case "setBackground":
                return this.setBackground(env, args);
            case "getBackground":
                return this.getBackground(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "foreground":
                return this.foreground;
            case "background":
                return this.background;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "foreground":
                return ZVal.isNull(this.foreground);
            case "background":
                return ZVal.isNull(this.background);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "foreground":
                this.foreground = value;
                break;
            case "background":
                this.background = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setForeground(RuntimeEnv env, Object... args) {
        Object foreground = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ColorDefinition.class, "foreground", foreground);

        return null;
    }

    public Object getForeground(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ColorDefinition.class, "foreground"));
    }

    public Object setBackground(RuntimeEnv env, Object... args) {
        Object background = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ColorDefinition.class, "background", background);

        return null;
    }

    public Object getBackground(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ColorDefinition.class, "background"));
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
