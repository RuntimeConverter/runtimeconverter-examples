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

 google-api-php-client/src/contrib/Google_ModeratorService.php

*/

public class Google_SubmissionAttribution extends Google_Model
        implements RuntimeFileContextInterface {

    public Object displayName = null;

    public Object location = null;

    public Object avatarUrl = null;

    public Google_SubmissionAttribution(RuntimeEnv env, Object... args) {
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
            case "setDisplayName":
                return this.setDisplayName(env, args);
            case "getDisplayName":
                return this.getDisplayName(env, args);
            case "setLocation":
                return this.setLocation(env, args);
            case "getLocation":
                return this.getLocation(env, args);
            case "setAvatarUrl":
                return this.setAvatarUrl(env, args);
            case "getAvatarUrl":
                return this.getAvatarUrl(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "displayName":
                return this.displayName;
            case "location":
                return this.location;
            case "avatarUrl":
                return this.avatarUrl;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "displayName":
                return ZVal.isNull(this.displayName);
            case "location":
                return ZVal.isNull(this.location);
            case "avatarUrl":
                return ZVal.isNull(this.avatarUrl);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "displayName":
                this.displayName = value;
                break;
            case "location":
                this.location = value;
                break;
            case "avatarUrl":
                this.avatarUrl = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setDisplayName(RuntimeEnv env, Object... args) {
        Object displayName = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_SubmissionAttribution.class, "displayName", displayName);

        return null;
    }

    public Object getDisplayName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_SubmissionAttribution.class, "displayName"));
    }

    public Object setLocation(RuntimeEnv env, Object... args) {
        Object location = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_SubmissionAttribution.class, "location", location);

        return null;
    }

    public Object getLocation(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_SubmissionAttribution.class, "location"));
    }

    public Object setAvatarUrl(RuntimeEnv env, Object... args) {
        Object avatarUrl = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_SubmissionAttribution.class, "avatarUrl", avatarUrl);

        return null;
    }

    public Object getAvatarUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_SubmissionAttribution.class, "avatarUrl"));
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
