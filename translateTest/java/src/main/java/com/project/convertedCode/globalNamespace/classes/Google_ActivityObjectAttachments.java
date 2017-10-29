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

 google-api-php-client/src/contrib/Google_PlusService.php

*/

public class Google_ActivityObjectAttachments extends Google_Model
        implements RuntimeFileContextInterface {

    public Object displayName = null;

    public Object __fullImageType = "Google_ActivityObjectAttachmentsFullImage";

    public Object __fullImageDataType = "";

    public Object fullImage = null;

    public Object url = null;

    public Object __imageType = "Google_ActivityObjectAttachmentsImage";

    public Object __imageDataType = "";

    public Object image = null;

    public Object content = null;

    public Object __embedType = "Google_ActivityObjectAttachmentsEmbed";

    public Object __embedDataType = "";

    public Object embed = null;

    public Object id = null;

    public Object objectType = null;

    public Google_ActivityObjectAttachments(RuntimeEnv env, Object... args) {
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
            case "setFullImage":
                return this.setFullImage(env, args);
            case "getFullImage":
                return this.getFullImage(env, args);
            case "setUrl":
                return this.setUrl(env, args);
            case "getUrl":
                return this.getUrl(env, args);
            case "setImage":
                return this.setImage(env, args);
            case "getImage":
                return this.getImage(env, args);
            case "setContent":
                return this.setContent(env, args);
            case "getContent":
                return this.getContent(env, args);
            case "setEmbed":
                return this.setEmbed(env, args);
            case "getEmbed":
                return this.getEmbed(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setObjectType":
                return this.setObjectType(env, args);
            case "getObjectType":
                return this.getObjectType(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "displayName":
                return this.displayName;
            case "__fullImageType":
                if (Google_ActivityObjectAttachments.class.isAssignableFrom(caller)) {

                    return this.__fullImageType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__fullImageDataType":
                if (Google_ActivityObjectAttachments.class.isAssignableFrom(caller)) {

                    return this.__fullImageDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "fullImage":
                return this.fullImage;
            case "url":
                return this.url;
            case "__imageType":
                if (Google_ActivityObjectAttachments.class.isAssignableFrom(caller)) {

                    return this.__imageType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__imageDataType":
                if (Google_ActivityObjectAttachments.class.isAssignableFrom(caller)) {

                    return this.__imageDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "image":
                return this.image;
            case "content":
                return this.content;
            case "__embedType":
                if (Google_ActivityObjectAttachments.class.isAssignableFrom(caller)) {

                    return this.__embedType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__embedDataType":
                if (Google_ActivityObjectAttachments.class.isAssignableFrom(caller)) {

                    return this.__embedDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "embed":
                return this.embed;
            case "id":
                return this.id;
            case "objectType":
                return this.objectType;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "displayName":
                return ZVal.isNull(this.displayName);
            case "__fullImageType":
                if (Google_ActivityObjectAttachments.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__fullImageType);
                }
                break;
            case "__fullImageDataType":
                if (Google_ActivityObjectAttachments.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__fullImageDataType);
                }
                break;
            case "fullImage":
                return ZVal.isNull(this.fullImage);
            case "url":
                return ZVal.isNull(this.url);
            case "__imageType":
                if (Google_ActivityObjectAttachments.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__imageType);
                }
                break;
            case "__imageDataType":
                if (Google_ActivityObjectAttachments.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__imageDataType);
                }
                break;
            case "image":
                return ZVal.isNull(this.image);
            case "content":
                return ZVal.isNull(this.content);
            case "__embedType":
                if (Google_ActivityObjectAttachments.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__embedType);
                }
                break;
            case "__embedDataType":
                if (Google_ActivityObjectAttachments.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__embedDataType);
                }
                break;
            case "embed":
                return ZVal.isNull(this.embed);
            case "id":
                return ZVal.isNull(this.id);
            case "objectType":
                return ZVal.isNull(this.objectType);
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
            case "__fullImageType":
                if (Google_ActivityObjectAttachments.class.isAssignableFrom(caller)) {

                    this.__fullImageType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__fullImageDataType":
                if (Google_ActivityObjectAttachments.class.isAssignableFrom(caller)) {

                    this.__fullImageDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "fullImage":
                this.fullImage = value;
                break;
            case "url":
                this.url = value;
                break;
            case "__imageType":
                if (Google_ActivityObjectAttachments.class.isAssignableFrom(caller)) {

                    this.__imageType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__imageDataType":
                if (Google_ActivityObjectAttachments.class.isAssignableFrom(caller)) {

                    this.__imageDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "image":
                this.image = value;
                break;
            case "content":
                this.content = value;
                break;
            case "__embedType":
                if (Google_ActivityObjectAttachments.class.isAssignableFrom(caller)) {

                    this.__embedType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__embedDataType":
                if (Google_ActivityObjectAttachments.class.isAssignableFrom(caller)) {

                    this.__embedDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "embed":
                this.embed = value;
                break;
            case "id":
                this.id = value;
                break;
            case "objectType":
                this.objectType = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setDisplayName(RuntimeEnv env, Object... args) {
        Object displayName = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ActivityObjectAttachments.class, "displayName", displayName);

        return null;
    }

    public Object getDisplayName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ActivityObjectAttachments.class, "displayName"));
    }

    public Object setFullImage(RuntimeEnv env, Object... args) {
        Object fullImage = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ActivityObjectAttachments.class, "fullImage", fullImage);

        return null;
    }

    public Object getFullImage(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ActivityObjectAttachments.class, "fullImage"));
    }

    public Object setUrl(RuntimeEnv env, Object... args) {
        Object url = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ActivityObjectAttachments.class, "url", url);

        return null;
    }

    public Object getUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ActivityObjectAttachments.class, "url"));
    }

    public Object setImage(RuntimeEnv env, Object... args) {
        Object image = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ActivityObjectAttachments.class, "image", image);

        return null;
    }

    public Object getImage(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ActivityObjectAttachments.class, "image"));
    }

    public Object setContent(RuntimeEnv env, Object... args) {
        Object content = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ActivityObjectAttachments.class, "content", content);

        return null;
    }

    public Object getContent(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ActivityObjectAttachments.class, "content"));
    }

    public Object setEmbed(RuntimeEnv env, Object... args) {
        Object embed = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ActivityObjectAttachments.class, "embed", embed);

        return null;
    }

    public Object getEmbed(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ActivityObjectAttachments.class, "embed"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ActivityObjectAttachments.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ActivityObjectAttachments.class, "id"));
    }

    public Object setObjectType(RuntimeEnv env, Object... args) {
        Object objectType = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ActivityObjectAttachments.class, "objectType", objectType);

        return null;
    }

    public Object getObjectType(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ActivityObjectAttachments.class, "objectType"));
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
