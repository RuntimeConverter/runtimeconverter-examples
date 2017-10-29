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

public class Google_PlaylistItemListResponse extends Google_Model
        implements RuntimeFileContextInterface {

    public Object __playlistItemsType = "Google_PlaylistItem";

    public Object __playlistItemsDataType = "map";

    public Object playlistItems = null;

    public Object kind = null;

    public Object etag = null;

    public Google_PlaylistItemListResponse(RuntimeEnv env, Object... args) {
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
            case "setPlaylistItems":
                return this.setPlaylistItems(env, args);
            case "getPlaylistItems":
                return this.getPlaylistItems(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setEtag":
                return this.setEtag(env, args);
            case "getEtag":
                return this.getEtag(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__playlistItemsType":
                if (Google_PlaylistItemListResponse.class.isAssignableFrom(caller)) {

                    return this.__playlistItemsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__playlistItemsDataType":
                if (Google_PlaylistItemListResponse.class.isAssignableFrom(caller)) {

                    return this.__playlistItemsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "playlistItems":
                return this.playlistItems;
            case "kind":
                return this.kind;
            case "etag":
                return this.etag;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__playlistItemsType":
                if (Google_PlaylistItemListResponse.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__playlistItemsType);
                }
                break;
            case "__playlistItemsDataType":
                if (Google_PlaylistItemListResponse.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__playlistItemsDataType);
                }
                break;
            case "playlistItems":
                return ZVal.isNull(this.playlistItems);
            case "kind":
                return ZVal.isNull(this.kind);
            case "etag":
                return ZVal.isNull(this.etag);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__playlistItemsType":
                if (Google_PlaylistItemListResponse.class.isAssignableFrom(caller)) {

                    this.__playlistItemsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__playlistItemsDataType":
                if (Google_PlaylistItemListResponse.class.isAssignableFrom(caller)) {

                    this.__playlistItemsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "playlistItems":
                this.playlistItems = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "etag":
                this.etag = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setPlaylistItems(RuntimeEnv env, Object... args) {
        Object playlistItems = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_PlaylistItemListResponse.class, "playlistItems", playlistItems);

        return null;
    }

    public Object getPlaylistItems(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_PlaylistItemListResponse.class, "playlistItems"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PlaylistItemListResponse.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PlaylistItemListResponse.class, "kind"));
    }

    public Object setEtag(RuntimeEnv env, Object... args) {
        Object etag = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PlaylistItemListResponse.class, "etag", etag);

        return null;
    }

    public Object getEtag(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PlaylistItemListResponse.class, "etag"));
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
