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

public class Google_Error extends Google_Model implements RuntimeFileContextInterface {

    public Object domain = null;

    public Object reason = null;

    public Google_Error(RuntimeEnv env, Object... args) {
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
            case "setDomain":
                return this.setDomain(env, args);
            case "getDomain":
                return this.getDomain(env, args);
            case "setReason":
                return this.setReason(env, args);
            case "getReason":
                return this.getReason(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "domain":
                return this.domain;
            case "reason":
                return this.reason;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "domain":
                return ZVal.isNull(this.domain);
            case "reason":
                return ZVal.isNull(this.reason);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "domain":
                this.domain = value;
                break;
            case "reason":
                this.reason = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setDomain(RuntimeEnv env, Object... args) {
        Object domain = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Error.class, "domain", domain);

        return null;
    }

    public Object getDomain(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Error.class, "domain"));
    }

    public Object setReason(RuntimeEnv env, Object... args) {
        Object reason = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Error.class, "reason", reason);

        return null;
    }

    public Object getReason(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Error.class, "reason"));
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
