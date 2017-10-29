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

public class Google_VolumeUserInfo extends Google_Model implements RuntimeFileContextInterface {

    public Object isInMyBooks = null;

    public Object updated = null;

    public Object __reviewType = "Google_Review";

    public Object __reviewDataType = "";

    public Object review = null;

    public Object isPurchased = null;

    public Object __readingPositionType = "Google_ReadingPosition";

    public Object __readingPositionDataType = "";

    public Object readingPosition = null;

    public Object isPreordered = null;

    public Google_VolumeUserInfo(RuntimeEnv env, Object... args) {
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
            case "setIsInMyBooks":
                return this.setIsInMyBooks(env, args);
            case "getIsInMyBooks":
                return this.getIsInMyBooks(env, args);
            case "setUpdated":
                return this.setUpdated(env, args);
            case "getUpdated":
                return this.getUpdated(env, args);
            case "setReview":
                return this.setReview(env, args);
            case "getReview":
                return this.getReview(env, args);
            case "setIsPurchased":
                return this.setIsPurchased(env, args);
            case "getIsPurchased":
                return this.getIsPurchased(env, args);
            case "setReadingPosition":
                return this.setReadingPosition(env, args);
            case "getReadingPosition":
                return this.getReadingPosition(env, args);
            case "setIsPreordered":
                return this.setIsPreordered(env, args);
            case "getIsPreordered":
                return this.getIsPreordered(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "isInMyBooks":
                return this.isInMyBooks;
            case "updated":
                return this.updated;
            case "__reviewType":
                if (Google_VolumeUserInfo.class.isAssignableFrom(caller)) {

                    return this.__reviewType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__reviewDataType":
                if (Google_VolumeUserInfo.class.isAssignableFrom(caller)) {

                    return this.__reviewDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "review":
                return this.review;
            case "isPurchased":
                return this.isPurchased;
            case "__readingPositionType":
                if (Google_VolumeUserInfo.class.isAssignableFrom(caller)) {

                    return this.__readingPositionType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__readingPositionDataType":
                if (Google_VolumeUserInfo.class.isAssignableFrom(caller)) {

                    return this.__readingPositionDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "readingPosition":
                return this.readingPosition;
            case "isPreordered":
                return this.isPreordered;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "isInMyBooks":
                return ZVal.isNull(this.isInMyBooks);
            case "updated":
                return ZVal.isNull(this.updated);
            case "__reviewType":
                if (Google_VolumeUserInfo.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__reviewType);
                }
                break;
            case "__reviewDataType":
                if (Google_VolumeUserInfo.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__reviewDataType);
                }
                break;
            case "review":
                return ZVal.isNull(this.review);
            case "isPurchased":
                return ZVal.isNull(this.isPurchased);
            case "__readingPositionType":
                if (Google_VolumeUserInfo.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__readingPositionType);
                }
                break;
            case "__readingPositionDataType":
                if (Google_VolumeUserInfo.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__readingPositionDataType);
                }
                break;
            case "readingPosition":
                return ZVal.isNull(this.readingPosition);
            case "isPreordered":
                return ZVal.isNull(this.isPreordered);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "isInMyBooks":
                this.isInMyBooks = value;
                break;
            case "updated":
                this.updated = value;
                break;
            case "__reviewType":
                if (Google_VolumeUserInfo.class.isAssignableFrom(caller)) {

                    this.__reviewType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__reviewDataType":
                if (Google_VolumeUserInfo.class.isAssignableFrom(caller)) {

                    this.__reviewDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "review":
                this.review = value;
                break;
            case "isPurchased":
                this.isPurchased = value;
                break;
            case "__readingPositionType":
                if (Google_VolumeUserInfo.class.isAssignableFrom(caller)) {

                    this.__readingPositionType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__readingPositionDataType":
                if (Google_VolumeUserInfo.class.isAssignableFrom(caller)) {

                    this.__readingPositionDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "readingPosition":
                this.readingPosition = value;
                break;
            case "isPreordered":
                this.isPreordered = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setIsInMyBooks(RuntimeEnv env, Object... args) {
        Object isInMyBooks = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeUserInfo.class, "isInMyBooks", isInMyBooks);

        return null;
    }

    public Object getIsInMyBooks(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeUserInfo.class, "isInMyBooks"));
    }

    public Object setUpdated(RuntimeEnv env, Object... args) {
        Object updated = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeUserInfo.class, "updated", updated);

        return null;
    }

    public Object getUpdated(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeUserInfo.class, "updated"));
    }

    public Object setReview(RuntimeEnv env, Object... args) {
        Object review = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeUserInfo.class, "review", review);

        return null;
    }

    public Object getReview(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeUserInfo.class, "review"));
    }

    public Object setIsPurchased(RuntimeEnv env, Object... args) {
        Object isPurchased = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeUserInfo.class, "isPurchased", isPurchased);

        return null;
    }

    public Object getIsPurchased(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeUserInfo.class, "isPurchased"));
    }

    public Object setReadingPosition(RuntimeEnv env, Object... args) {
        Object readingPosition = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeUserInfo.class, "readingPosition", readingPosition);

        return null;
    }

    public Object getReadingPosition(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeUserInfo.class, "readingPosition"));
    }

    public Object setIsPreordered(RuntimeEnv env, Object... args) {
        Object isPreordered = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeUserInfo.class, "isPreordered", isPreordered);

        return null;
    }

    public Object getIsPreordered(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeUserInfo.class, "isPreordered"));
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
