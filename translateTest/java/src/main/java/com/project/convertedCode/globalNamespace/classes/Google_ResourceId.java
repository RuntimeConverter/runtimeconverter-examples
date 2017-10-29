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

public class Google_ResourceId extends Google_Model implements RuntimeFileContextInterface {

    public Object kind = null;

    public Object channelId = null;

    public Object playlistId = null;

    public Object videoId = null;

    public Google_ResourceId(RuntimeEnv env, Object... args) {
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
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setChannelId":
                return this.setChannelId(env, args);
            case "getChannelId":
                return this.getChannelId(env, args);
            case "setPlaylistId":
                return this.setPlaylistId(env, args);
            case "getPlaylistId":
                return this.getPlaylistId(env, args);
            case "setVideoId":
                return this.setVideoId(env, args);
            case "getVideoId":
                return this.getVideoId(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return this.kind;
            case "channelId":
                return this.channelId;
            case "playlistId":
                return this.playlistId;
            case "videoId":
                return this.videoId;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return ZVal.isNull(this.kind);
            case "channelId":
                return ZVal.isNull(this.channelId);
            case "playlistId":
                return ZVal.isNull(this.playlistId);
            case "videoId":
                return ZVal.isNull(this.videoId);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                this.kind = value;
                break;
            case "channelId":
                this.channelId = value;
                break;
            case "playlistId":
                this.playlistId = value;
                break;
            case "videoId":
                this.videoId = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ResourceId.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ResourceId.class, "kind"));
    }

    public Object setChannelId(RuntimeEnv env, Object... args) {
        Object channelId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ResourceId.class, "channelId", channelId);

        return null;
    }

    public Object getChannelId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ResourceId.class, "channelId"));
    }

    public Object setPlaylistId(RuntimeEnv env, Object... args) {
        Object playlistId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ResourceId.class, "playlistId", playlistId);

        return null;
    }

    public Object getPlaylistId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ResourceId.class, "playlistId"));
    }

    public Object setVideoId(RuntimeEnv env, Object... args) {
        Object videoId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ResourceId.class, "videoId", videoId);

        return null;
    }

    public Object getVideoId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ResourceId.class, "videoId"));
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
