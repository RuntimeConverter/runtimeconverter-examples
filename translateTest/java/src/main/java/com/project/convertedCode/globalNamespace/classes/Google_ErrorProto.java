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

 google-api-php-client/src/contrib/Google_BigqueryService.php

*/

public class Google_ErrorProto extends Google_Model implements RuntimeFileContextInterface {

    public Object debugInfo = null;

    public Object message = null;

    public Object reason = null;

    public Object location = null;

    public Google_ErrorProto(RuntimeEnv env, Object... args) {
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
            case "setDebugInfo":
                return this.setDebugInfo(env, args);
            case "getDebugInfo":
                return this.getDebugInfo(env, args);
            case "setMessage":
                return this.setMessage(env, args);
            case "getMessage":
                return this.getMessage(env, args);
            case "setReason":
                return this.setReason(env, args);
            case "getReason":
                return this.getReason(env, args);
            case "setLocation":
                return this.setLocation(env, args);
            case "getLocation":
                return this.getLocation(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "debugInfo":
                return this.debugInfo;
            case "message":
                return this.message;
            case "reason":
                return this.reason;
            case "location":
                return this.location;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "debugInfo":
                return ZVal.isNull(this.debugInfo);
            case "message":
                return ZVal.isNull(this.message);
            case "reason":
                return ZVal.isNull(this.reason);
            case "location":
                return ZVal.isNull(this.location);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "debugInfo":
                this.debugInfo = value;
                break;
            case "message":
                this.message = value;
                break;
            case "reason":
                this.reason = value;
                break;
            case "location":
                this.location = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setDebugInfo(RuntimeEnv env, Object... args) {
        Object debugInfo = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ErrorProto.class, "debugInfo", debugInfo);

        return null;
    }

    public Object getDebugInfo(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ErrorProto.class, "debugInfo"));
    }

    public Object setMessage(RuntimeEnv env, Object... args) {
        Object message = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ErrorProto.class, "message", message);

        return null;
    }

    public Object getMessage(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ErrorProto.class, "message"));
    }

    public Object setReason(RuntimeEnv env, Object... args) {
        Object reason = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ErrorProto.class, "reason", reason);

        return null;
    }

    public Object getReason(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ErrorProto.class, "reason"));
    }

    public Object setLocation(RuntimeEnv env, Object... args) {
        Object location = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ErrorProto.class, "location", location);

        return null;
    }

    public Object getLocation(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ErrorProto.class, "location"));
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
