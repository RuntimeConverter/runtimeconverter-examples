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

public class Google_ShoppingModelDebugJsonV1BackendTimes extends Google_Model
        implements RuntimeFileContextInterface {

    public Object serverMillis = null;

    public Object hostName = null;

    public Object name = null;

    public Object elapsedMillis = null;

    public Google_ShoppingModelDebugJsonV1BackendTimes(RuntimeEnv env, Object... args) {
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
            case "setServerMillis":
                return this.setServerMillis(env, args);
            case "getServerMillis":
                return this.getServerMillis(env, args);
            case "setHostName":
                return this.setHostName(env, args);
            case "getHostName":
                return this.getHostName(env, args);
            case "setName":
                return this.setName(env, args);
            case "getName":
                return this.getName(env, args);
            case "setElapsedMillis":
                return this.setElapsedMillis(env, args);
            case "getElapsedMillis":
                return this.getElapsedMillis(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "serverMillis":
                return this.serverMillis;
            case "hostName":
                return this.hostName;
            case "name":
                return this.name;
            case "elapsedMillis":
                return this.elapsedMillis;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "serverMillis":
                return ZVal.isNull(this.serverMillis);
            case "hostName":
                return ZVal.isNull(this.hostName);
            case "name":
                return ZVal.isNull(this.name);
            case "elapsedMillis":
                return ZVal.isNull(this.elapsedMillis);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "serverMillis":
                this.serverMillis = value;
                break;
            case "hostName":
                this.hostName = value;
                break;
            case "name":
                this.name = value;
                break;
            case "elapsedMillis":
                this.elapsedMillis = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setServerMillis(RuntimeEnv env, Object... args) {
        Object serverMillis = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_ShoppingModelDebugJsonV1BackendTimes.class,
                "serverMillis",
                serverMillis);

        return null;
    }

    public Object getServerMillis(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_ShoppingModelDebugJsonV1BackendTimes.class, "serverMillis"));
    }

    public Object setHostName(RuntimeEnv env, Object... args) {
        Object hostName = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_ShoppingModelDebugJsonV1BackendTimes.class, "hostName", hostName);

        return null;
    }

    public Object getHostName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_ShoppingModelDebugJsonV1BackendTimes.class, "hostName"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ShoppingModelDebugJsonV1BackendTimes.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelDebugJsonV1BackendTimes.class, "name"));
    }

    public Object setElapsedMillis(RuntimeEnv env, Object... args) {
        Object elapsedMillis = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_ShoppingModelDebugJsonV1BackendTimes.class,
                "elapsedMillis",
                elapsedMillis);

        return null;
    }

    public Object getElapsedMillis(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_ShoppingModelDebugJsonV1BackendTimes.class, "elapsedMillis"));
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
