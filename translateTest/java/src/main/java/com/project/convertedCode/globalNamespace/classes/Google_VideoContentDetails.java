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

 google-api-php-client/src/contrib/Google_YoutubeService.php

*/

public class Google_VideoContentDetails extends Google_Model
        implements RuntimeFileContextInterface {

    public Object duration = null;

    public Object aspectRatio = null;

    public Google_VideoContentDetails(RuntimeEnv env, Object... args) {
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
            case "setDuration":
                return this.setDuration(env, args);
            case "getDuration":
                return this.getDuration(env, args);
            case "setAspectRatio":
                return this.setAspectRatio(env, args);
            case "getAspectRatio":
                return this.getAspectRatio(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "duration":
                return this.duration;
            case "aspectRatio":
                return this.aspectRatio;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "duration":
                return ZVal.isNull(this.duration);
            case "aspectRatio":
                return ZVal.isNull(this.aspectRatio);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "duration":
                this.duration = value;
                break;
            case "aspectRatio":
                this.aspectRatio = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setDuration(RuntimeEnv env, Object... args) {
        Object duration = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VideoContentDetails.class, "duration", duration);

        return null;
    }

    public Object getDuration(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VideoContentDetails.class, "duration"));
    }

    public Object setAspectRatio(RuntimeEnv env, Object... args) {
        Object aspectRatio = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VideoContentDetails.class, "aspectRatio", aspectRatio);

        return null;
    }

    public Object getAspectRatio(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VideoContentDetails.class, "aspectRatio"));
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
