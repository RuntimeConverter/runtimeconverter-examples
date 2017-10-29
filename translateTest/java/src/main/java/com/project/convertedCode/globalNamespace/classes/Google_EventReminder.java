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

public class Google_EventReminder extends Google_Model implements RuntimeFileContextInterface {

    public Object minutes = null;

    public Object method = null;

    public Google_EventReminder(RuntimeEnv env, Object... args) {
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
            case "setMinutes":
                return this.setMinutes(env, args);
            case "getMinutes":
                return this.getMinutes(env, args);
            case "setMethod":
                return this.setMethod(env, args);
            case "getMethod":
                return this.getMethod(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "minutes":
                return this.minutes;
            case "method":
                return this.method;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "minutes":
                return ZVal.isNull(this.minutes);
            case "method":
                return ZVal.isNull(this.method);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "minutes":
                this.minutes = value;
                break;
            case "method":
                this.method = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setMinutes(RuntimeEnv env, Object... args) {
        Object minutes = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_EventReminder.class, "minutes", minutes);

        return null;
    }

    public Object getMinutes(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_EventReminder.class, "minutes"));
    }

    public Object setMethod(RuntimeEnv env, Object... args) {
        Object method = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_EventReminder.class, "method", method);

        return null;
    }

    public Object getMethod(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_EventReminder.class, "method"));
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
