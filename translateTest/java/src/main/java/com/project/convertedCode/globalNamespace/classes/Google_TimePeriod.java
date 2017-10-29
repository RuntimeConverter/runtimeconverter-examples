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

public class Google_TimePeriod extends Google_Model implements RuntimeFileContextInterface {

    public Object start = null;

    public Object end = null;

    public Google_TimePeriod(RuntimeEnv env, Object... args) {
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
            case "setStart":
                return this.setStart(env, args);
            case "getStart":
                return this.getStart(env, args);
            case "setEnd":
                return this.setEnd(env, args);
            case "getEnd":
                return this.getEnd(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "start":
                return this.start;
            case "end":
                return this.end;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "start":
                return ZVal.isNull(this.start);
            case "end":
                return ZVal.isNull(this.end);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "start":
                this.start = value;
                break;
            case "end":
                this.end = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setStart(RuntimeEnv env, Object... args) {
        Object start = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_TimePeriod.class, "start", start);

        return null;
    }

    public Object getStart(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_TimePeriod.class, "start"));
    }

    public Object setEnd(RuntimeEnv env, Object... args) {
        Object end = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_TimePeriod.class, "end", end);

        return null;
    }

    public Object getEnd(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_TimePeriod.class, "end"));
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
