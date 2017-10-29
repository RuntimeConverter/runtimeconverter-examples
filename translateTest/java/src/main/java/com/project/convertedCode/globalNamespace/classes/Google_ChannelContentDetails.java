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

public class Google_ChannelContentDetails extends Google_Model
        implements RuntimeFileContextInterface {

    public Object privacyStatus = null;

    public Object uploads = null;

    public Google_ChannelContentDetails(RuntimeEnv env, Object... args) {
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
            case "setPrivacyStatus":
                return this.setPrivacyStatus(env, args);
            case "getPrivacyStatus":
                return this.getPrivacyStatus(env, args);
            case "setUploads":
                return this.setUploads(env, args);
            case "getUploads":
                return this.getUploads(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "privacyStatus":
                return this.privacyStatus;
            case "uploads":
                return this.uploads;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "privacyStatus":
                return ZVal.isNull(this.privacyStatus);
            case "uploads":
                return ZVal.isNull(this.uploads);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "privacyStatus":
                this.privacyStatus = value;
                break;
            case "uploads":
                this.uploads = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setPrivacyStatus(RuntimeEnv env, Object... args) {
        Object privacyStatus = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ChannelContentDetails.class, "privacyStatus", privacyStatus);

        return null;
    }

    public Object getPrivacyStatus(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ChannelContentDetails.class, "privacyStatus"));
    }

    public Object setUploads(RuntimeEnv env, Object... args) {
        Object uploads = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ChannelContentDetails.class, "uploads", uploads);

        return null;
    }

    public Object getUploads(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ChannelContentDetails.class, "uploads"));
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
