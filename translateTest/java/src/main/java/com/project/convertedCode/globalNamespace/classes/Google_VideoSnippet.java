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

public class Google_VideoSnippet extends Google_Model implements RuntimeFileContextInterface {

    public Object __thumbnailsType = "Google_Thumbnail";

    public Object __thumbnailsDataType = "map";

    public Object thumbnails = null;

    public Object tags = null;

    public Object channelId = null;

    public Object publishedAt = null;

    public Object title = null;

    public Object categoryId = null;

    public Object description = null;

    public Google_VideoSnippet(RuntimeEnv env, Object... args) {
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
            case "setThumbnails":
                return this.setThumbnails(env, args);
            case "getThumbnails":
                return this.getThumbnails(env, args);
            case "setTags":
                return this.setTags(env, args);
            case "getTags":
                return this.getTags(env, args);
            case "setChannelId":
                return this.setChannelId(env, args);
            case "getChannelId":
                return this.getChannelId(env, args);
            case "setPublishedAt":
                return this.setPublishedAt(env, args);
            case "getPublishedAt":
                return this.getPublishedAt(env, args);
            case "setTitle":
                return this.setTitle(env, args);
            case "getTitle":
                return this.getTitle(env, args);
            case "setCategoryId":
                return this.setCategoryId(env, args);
            case "getCategoryId":
                return this.getCategoryId(env, args);
            case "setDescription":
                return this.setDescription(env, args);
            case "getDescription":
                return this.getDescription(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__thumbnailsType":
                if (Google_VideoSnippet.class.isAssignableFrom(caller)) {

                    return this.__thumbnailsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__thumbnailsDataType":
                if (Google_VideoSnippet.class.isAssignableFrom(caller)) {

                    return this.__thumbnailsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "thumbnails":
                return this.thumbnails;
            case "tags":
                return this.tags;
            case "channelId":
                return this.channelId;
            case "publishedAt":
                return this.publishedAt;
            case "title":
                return this.title;
            case "categoryId":
                return this.categoryId;
            case "description":
                return this.description;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__thumbnailsType":
                if (Google_VideoSnippet.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__thumbnailsType);
                }
                break;
            case "__thumbnailsDataType":
                if (Google_VideoSnippet.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__thumbnailsDataType);
                }
                break;
            case "thumbnails":
                return ZVal.isNull(this.thumbnails);
            case "tags":
                return ZVal.isNull(this.tags);
            case "channelId":
                return ZVal.isNull(this.channelId);
            case "publishedAt":
                return ZVal.isNull(this.publishedAt);
            case "title":
                return ZVal.isNull(this.title);
            case "categoryId":
                return ZVal.isNull(this.categoryId);
            case "description":
                return ZVal.isNull(this.description);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__thumbnailsType":
                if (Google_VideoSnippet.class.isAssignableFrom(caller)) {

                    this.__thumbnailsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__thumbnailsDataType":
                if (Google_VideoSnippet.class.isAssignableFrom(caller)) {

                    this.__thumbnailsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "thumbnails":
                this.thumbnails = value;
                break;
            case "tags":
                this.tags = value;
                break;
            case "channelId":
                this.channelId = value;
                break;
            case "publishedAt":
                this.publishedAt = value;
                break;
            case "title":
                this.title = value;
                break;
            case "categoryId":
                this.categoryId = value;
                break;
            case "description":
                this.description = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setThumbnails(RuntimeEnv env, Object... args) {
        Object thumbnails = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VideoSnippet.class, "thumbnails", thumbnails);

        return null;
    }

    public Object getThumbnails(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VideoSnippet.class, "thumbnails"));
    }

    public Object setTags(RuntimeEnv env, Object... args) {
        Object tags = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this, "assertIsArray", Google_VideoSnippet.class, tags, "Google_string", "setTags");
        ZVal.setProperty(this, Google_VideoSnippet.class, "tags", tags);

        return null;
    }

    public Object getTags(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VideoSnippet.class, "tags"));
    }

    public Object setChannelId(RuntimeEnv env, Object... args) {
        Object channelId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VideoSnippet.class, "channelId", channelId);

        return null;
    }

    public Object getChannelId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VideoSnippet.class, "channelId"));
    }

    public Object setPublishedAt(RuntimeEnv env, Object... args) {
        Object publishedAt = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VideoSnippet.class, "publishedAt", publishedAt);

        return null;
    }

    public Object getPublishedAt(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VideoSnippet.class, "publishedAt"));
    }

    public Object setTitle(RuntimeEnv env, Object... args) {
        Object title = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VideoSnippet.class, "title", title);

        return null;
    }

    public Object getTitle(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VideoSnippet.class, "title"));
    }

    public Object setCategoryId(RuntimeEnv env, Object... args) {
        Object categoryId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VideoSnippet.class, "categoryId", categoryId);

        return null;
    }

    public Object getCategoryId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VideoSnippet.class, "categoryId"));
    }

    public Object setDescription(RuntimeEnv env, Object... args) {
        Object description = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VideoSnippet.class, "description", description);

        return null;
    }

    public Object getDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VideoSnippet.class, "description"));
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
