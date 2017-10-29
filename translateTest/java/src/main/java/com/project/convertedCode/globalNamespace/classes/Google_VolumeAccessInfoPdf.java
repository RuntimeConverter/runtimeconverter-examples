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

 google-api-php-client/src/contrib/Google_BooksService.php

*/

public class Google_VolumeAccessInfoPdf extends Google_Model
        implements RuntimeFileContextInterface {

    public Object isAvailable = null;

    public Object downloadLink = null;

    public Object acsTokenLink = null;

    public Google_VolumeAccessInfoPdf(RuntimeEnv env, Object... args) {
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
            case "setIsAvailable":
                return this.setIsAvailable(env, args);
            case "getIsAvailable":
                return this.getIsAvailable(env, args);
            case "setDownloadLink":
                return this.setDownloadLink(env, args);
            case "getDownloadLink":
                return this.getDownloadLink(env, args);
            case "setAcsTokenLink":
                return this.setAcsTokenLink(env, args);
            case "getAcsTokenLink":
                return this.getAcsTokenLink(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "isAvailable":
                return this.isAvailable;
            case "downloadLink":
                return this.downloadLink;
            case "acsTokenLink":
                return this.acsTokenLink;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "isAvailable":
                return ZVal.isNull(this.isAvailable);
            case "downloadLink":
                return ZVal.isNull(this.downloadLink);
            case "acsTokenLink":
                return ZVal.isNull(this.acsTokenLink);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "isAvailable":
                this.isAvailable = value;
                break;
            case "downloadLink":
                this.downloadLink = value;
                break;
            case "acsTokenLink":
                this.acsTokenLink = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setIsAvailable(RuntimeEnv env, Object... args) {
        Object isAvailable = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeAccessInfoPdf.class, "isAvailable", isAvailable);

        return null;
    }

    public Object getIsAvailable(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeAccessInfoPdf.class, "isAvailable"));
    }

    public Object setDownloadLink(RuntimeEnv env, Object... args) {
        Object downloadLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeAccessInfoPdf.class, "downloadLink", downloadLink);

        return null;
    }

    public Object getDownloadLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_VolumeAccessInfoPdf.class, "downloadLink"));
    }

    public Object setAcsTokenLink(RuntimeEnv env, Object... args) {
        Object acsTokenLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeAccessInfoPdf.class, "acsTokenLink", acsTokenLink);

        return null;
    }

    public Object getAcsTokenLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_VolumeAccessInfoPdf.class, "acsTokenLink"));
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
