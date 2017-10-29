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

public class Google_VolumeVolumeInfoImageLinks extends Google_Model
        implements RuntimeFileContextInterface {

    public Object medium = null;

    public Object smallThumbnail = null;

    public Object large = null;

    public Object extraLarge = null;

    public Object small = null;

    public Object thumbnail = null;

    public Google_VolumeVolumeInfoImageLinks(RuntimeEnv env, Object... args) {
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
            case "setMedium":
                return this.setMedium(env, args);
            case "getMedium":
                return this.getMedium(env, args);
            case "setSmallThumbnail":
                return this.setSmallThumbnail(env, args);
            case "getSmallThumbnail":
                return this.getSmallThumbnail(env, args);
            case "setLarge":
                return this.setLarge(env, args);
            case "getLarge":
                return this.getLarge(env, args);
            case "setExtraLarge":
                return this.setExtraLarge(env, args);
            case "getExtraLarge":
                return this.getExtraLarge(env, args);
            case "setSmall":
                return this.setSmall(env, args);
            case "getSmall":
                return this.getSmall(env, args);
            case "setThumbnail":
                return this.setThumbnail(env, args);
            case "getThumbnail":
                return this.getThumbnail(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "medium":
                return this.medium;
            case "smallThumbnail":
                return this.smallThumbnail;
            case "large":
                return this.large;
            case "extraLarge":
                return this.extraLarge;
            case "small":
                return this.small;
            case "thumbnail":
                return this.thumbnail;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "medium":
                return ZVal.isNull(this.medium);
            case "smallThumbnail":
                return ZVal.isNull(this.smallThumbnail);
            case "large":
                return ZVal.isNull(this.large);
            case "extraLarge":
                return ZVal.isNull(this.extraLarge);
            case "small":
                return ZVal.isNull(this.small);
            case "thumbnail":
                return ZVal.isNull(this.thumbnail);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "medium":
                this.medium = value;
                break;
            case "smallThumbnail":
                this.smallThumbnail = value;
                break;
            case "large":
                this.large = value;
                break;
            case "extraLarge":
                this.extraLarge = value;
                break;
            case "small":
                this.small = value;
                break;
            case "thumbnail":
                this.thumbnail = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setMedium(RuntimeEnv env, Object... args) {
        Object medium = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeVolumeInfoImageLinks.class, "medium", medium);

        return null;
    }

    public Object getMedium(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_VolumeVolumeInfoImageLinks.class, "medium"));
    }

    public Object setSmallThumbnail(RuntimeEnv env, Object... args) {
        Object smallThumbnail = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_VolumeVolumeInfoImageLinks.class, "smallThumbnail", smallThumbnail);

        return null;
    }

    public Object getSmallThumbnail(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_VolumeVolumeInfoImageLinks.class, "smallThumbnail"));
    }

    public Object setLarge(RuntimeEnv env, Object... args) {
        Object large = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeVolumeInfoImageLinks.class, "large", large);

        return null;
    }

    public Object getLarge(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_VolumeVolumeInfoImageLinks.class, "large"));
    }

    public Object setExtraLarge(RuntimeEnv env, Object... args) {
        Object extraLarge = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeVolumeInfoImageLinks.class, "extraLarge", extraLarge);

        return null;
    }

    public Object getExtraLarge(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_VolumeVolumeInfoImageLinks.class, "extraLarge"));
    }

    public Object setSmall(RuntimeEnv env, Object... args) {
        Object small = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeVolumeInfoImageLinks.class, "small", small);

        return null;
    }

    public Object getSmall(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_VolumeVolumeInfoImageLinks.class, "small"));
    }

    public Object setThumbnail(RuntimeEnv env, Object... args) {
        Object thumbnail = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeVolumeInfoImageLinks.class, "thumbnail", thumbnail);

        return null;
    }

    public Object getThumbnail(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_VolumeVolumeInfoImageLinks.class, "thumbnail"));
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
