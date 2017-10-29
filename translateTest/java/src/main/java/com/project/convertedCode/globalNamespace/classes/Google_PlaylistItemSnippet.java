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

public class Google_PlaylistItemSnippet extends Google_Model
        implements RuntimeFileContextInterface {

    public Object playlistId = null;

    public Object description = null;

    public Object title = null;

    public Object __resourceIdType = "Google_ResourceId";

    public Object __resourceIdDataType = "";

    public Object resourceId = null;

    public Object channelId = null;

    public Object publishedAt = null;

    public Object position = null;

    public Google_PlaylistItemSnippet(RuntimeEnv env, Object... args) {
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
            case "setPlaylistId":
                return this.setPlaylistId(env, args);
            case "getPlaylistId":
                return this.getPlaylistId(env, args);
            case "setDescription":
                return this.setDescription(env, args);
            case "getDescription":
                return this.getDescription(env, args);
            case "setTitle":
                return this.setTitle(env, args);
            case "getTitle":
                return this.getTitle(env, args);
            case "setResourceId":
                return this.setResourceId(env, args);
            case "getResourceId":
                return this.getResourceId(env, args);
            case "setChannelId":
                return this.setChannelId(env, args);
            case "getChannelId":
                return this.getChannelId(env, args);
            case "setPublishedAt":
                return this.setPublishedAt(env, args);
            case "getPublishedAt":
                return this.getPublishedAt(env, args);
            case "setPosition":
                return this.setPosition(env, args);
            case "getPosition":
                return this.getPosition(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "playlistId":
                return this.playlistId;
            case "description":
                return this.description;
            case "title":
                return this.title;
            case "__resourceIdType":
                if (Google_PlaylistItemSnippet.class.isAssignableFrom(caller)) {

                    return this.__resourceIdType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__resourceIdDataType":
                if (Google_PlaylistItemSnippet.class.isAssignableFrom(caller)) {

                    return this.__resourceIdDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "resourceId":
                return this.resourceId;
            case "channelId":
                return this.channelId;
            case "publishedAt":
                return this.publishedAt;
            case "position":
                return this.position;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "playlistId":
                return ZVal.isNull(this.playlistId);
            case "description":
                return ZVal.isNull(this.description);
            case "title":
                return ZVal.isNull(this.title);
            case "__resourceIdType":
                if (Google_PlaylistItemSnippet.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__resourceIdType);
                }
                break;
            case "__resourceIdDataType":
                if (Google_PlaylistItemSnippet.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__resourceIdDataType);
                }
                break;
            case "resourceId":
                return ZVal.isNull(this.resourceId);
            case "channelId":
                return ZVal.isNull(this.channelId);
            case "publishedAt":
                return ZVal.isNull(this.publishedAt);
            case "position":
                return ZVal.isNull(this.position);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "playlistId":
                this.playlistId = value;
                break;
            case "description":
                this.description = value;
                break;
            case "title":
                this.title = value;
                break;
            case "__resourceIdType":
                if (Google_PlaylistItemSnippet.class.isAssignableFrom(caller)) {

                    this.__resourceIdType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__resourceIdDataType":
                if (Google_PlaylistItemSnippet.class.isAssignableFrom(caller)) {

                    this.__resourceIdDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "resourceId":
                this.resourceId = value;
                break;
            case "channelId":
                this.channelId = value;
                break;
            case "publishedAt":
                this.publishedAt = value;
                break;
            case "position":
                this.position = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setPlaylistId(RuntimeEnv env, Object... args) {
        Object playlistId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PlaylistItemSnippet.class, "playlistId", playlistId);

        return null;
    }

    public Object getPlaylistId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PlaylistItemSnippet.class, "playlistId"));
    }

    public Object setDescription(RuntimeEnv env, Object... args) {
        Object description = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PlaylistItemSnippet.class, "description", description);

        return null;
    }

    public Object getDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PlaylistItemSnippet.class, "description"));
    }

    public Object setTitle(RuntimeEnv env, Object... args) {
        Object title = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PlaylistItemSnippet.class, "title", title);

        return null;
    }

    public Object getTitle(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PlaylistItemSnippet.class, "title"));
    }

    public Object setResourceId(RuntimeEnv env, Object... args) {
        Object resourceId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PlaylistItemSnippet.class, "resourceId", resourceId);

        return null;
    }

    public Object getResourceId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PlaylistItemSnippet.class, "resourceId"));
    }

    public Object setChannelId(RuntimeEnv env, Object... args) {
        Object channelId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PlaylistItemSnippet.class, "channelId", channelId);

        return null;
    }

    public Object getChannelId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PlaylistItemSnippet.class, "channelId"));
    }

    public Object setPublishedAt(RuntimeEnv env, Object... args) {
        Object publishedAt = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PlaylistItemSnippet.class, "publishedAt", publishedAt);

        return null;
    }

    public Object getPublishedAt(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PlaylistItemSnippet.class, "publishedAt"));
    }

    public Object setPosition(RuntimeEnv env, Object... args) {
        Object position = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PlaylistItemSnippet.class, "position", position);

        return null;
    }

    public Object getPosition(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PlaylistItemSnippet.class, "position"));
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
