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

 google-api-php-client/src/contrib/Google_ComputeService.php

*/

public class Google_OperationErrorErrors extends Google_Model
        implements RuntimeFileContextInterface {

    public Object message = null;

    public Object code = null;

    public Object location = null;

    public Google_OperationErrorErrors(RuntimeEnv env, Object... args) {
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
            case "setMessage":
                return this.setMessage(env, args);
            case "getMessage":
                return this.getMessage(env, args);
            case "setCode":
                return this.setCode(env, args);
            case "getCode":
                return this.getCode(env, args);
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
            case "message":
                return this.message;
            case "code":
                return this.code;
            case "location":
                return this.location;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "message":
                return ZVal.isNull(this.message);
            case "code":
                return ZVal.isNull(this.code);
            case "location":
                return ZVal.isNull(this.location);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "message":
                this.message = value;
                break;
            case "code":
                this.code = value;
                break;
            case "location":
                this.location = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setMessage(RuntimeEnv env, Object... args) {
        Object message = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_OperationErrorErrors.class, "message", message);

        return null;
    }

    public Object getMessage(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_OperationErrorErrors.class, "message"));
    }

    public Object setCode(RuntimeEnv env, Object... args) {
        Object code = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_OperationErrorErrors.class, "code", code);

        return null;
    }

    public Object getCode(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_OperationErrorErrors.class, "code"));
    }

    public Object setLocation(RuntimeEnv env, Object... args) {
        Object location = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_OperationErrorErrors.class, "location", location);

        return null;
    }

    public Object getLocation(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_OperationErrorErrors.class, "location"));
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
