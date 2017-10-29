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

 google-api-php-client/src/contrib/Google_PagespeedonlineService.php

*/

public class Google_ResultVersion extends Google_Model implements RuntimeFileContextInterface {

    public Object major = null;

    public Object minor = null;

    public Google_ResultVersion(RuntimeEnv env, Object... args) {
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
            case "setMajor":
                return this.setMajor(env, args);
            case "getMajor":
                return this.getMajor(env, args);
            case "setMinor":
                return this.setMinor(env, args);
            case "getMinor":
                return this.getMinor(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "major":
                return this.major;
            case "minor":
                return this.minor;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "major":
                return ZVal.isNull(this.major);
            case "minor":
                return ZVal.isNull(this.minor);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "major":
                this.major = value;
                break;
            case "minor":
                this.minor = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setMajor(RuntimeEnv env, Object... args) {
        Object major = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ResultVersion.class, "major", major);

        return null;
    }

    public Object getMajor(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ResultVersion.class, "major"));
    }

    public Object setMinor(RuntimeEnv env, Object... args) {
        Object minor = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ResultVersion.class, "minor", minor);

        return null;
    }

    public Object getMinor(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ResultVersion.class, "minor"));
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
