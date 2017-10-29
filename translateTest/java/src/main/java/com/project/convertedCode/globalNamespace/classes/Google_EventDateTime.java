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

public class Google_EventDateTime extends Google_Model implements RuntimeFileContextInterface {

    public Object date = null;

    public Object timeZone = null;

    public Object dateTime = null;

    public Google_EventDateTime(RuntimeEnv env, Object... args) {
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
            case "setDate":
                return this.setDate(env, args);
            case "getDate":
                return this.getDate(env, args);
            case "setTimeZone":
                return this.setTimeZone(env, args);
            case "getTimeZone":
                return this.getTimeZone(env, args);
            case "setDateTime":
                return this.setDateTime(env, args);
            case "getDateTime":
                return this.getDateTime(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "date":
                return this.date;
            case "timeZone":
                return this.timeZone;
            case "dateTime":
                return this.dateTime;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "date":
                return ZVal.isNull(this.date);
            case "timeZone":
                return ZVal.isNull(this.timeZone);
            case "dateTime":
                return ZVal.isNull(this.dateTime);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "date":
                this.date = value;
                break;
            case "timeZone":
                this.timeZone = value;
                break;
            case "dateTime":
                this.dateTime = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setDate(RuntimeEnv env, Object... args) {
        Object date = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_EventDateTime.class, "date", date);

        return null;
    }

    public Object getDate(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_EventDateTime.class, "date"));
    }

    public Object setTimeZone(RuntimeEnv env, Object... args) {
        Object timeZone = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_EventDateTime.class, "timeZone", timeZone);

        return null;
    }

    public Object getTimeZone(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_EventDateTime.class, "timeZone"));
    }

    public Object setDateTime(RuntimeEnv env, Object... args) {
        Object dateTime = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_EventDateTime.class, "dateTime", dateTime);

        return null;
    }

    public Object getDateTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_EventDateTime.class, "dateTime"));
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
