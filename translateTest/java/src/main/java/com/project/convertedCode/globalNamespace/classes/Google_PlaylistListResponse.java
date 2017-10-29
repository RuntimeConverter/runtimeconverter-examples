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

public class Google_PlaylistListResponse extends Google_Model
        implements RuntimeFileContextInterface {

    public Object kind = null;

    public Object etag = null;

    public Object __playlistsType = "Google_Playlist";

    public Object __playlistsDataType = "map";

    public Object playlists = null;

    public Google_PlaylistListResponse(RuntimeEnv env, Object... args) {
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
            case "setEtag":
                return this.setEtag(env, args);
            case "getEtag":
                return this.getEtag(env, args);
            case "setPlaylists":
                return this.setPlaylists(env, args);
            case "getPlaylists":
                return this.getPlaylists(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return this.kind;
            case "etag":
                return this.etag;
            case "__playlistsType":
                if (Google_PlaylistListResponse.class.isAssignableFrom(caller)) {

                    return this.__playlistsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__playlistsDataType":
                if (Google_PlaylistListResponse.class.isAssignableFrom(caller)) {

                    return this.__playlistsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "playlists":
                return this.playlists;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return ZVal.isNull(this.kind);
            case "etag":
                return ZVal.isNull(this.etag);
            case "__playlistsType":
                if (Google_PlaylistListResponse.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__playlistsType);
                }
                break;
            case "__playlistsDataType":
                if (Google_PlaylistListResponse.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__playlistsDataType);
                }
                break;
            case "playlists":
                return ZVal.isNull(this.playlists);
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
            case "etag":
                this.etag = value;
                break;
            case "__playlistsType":
                if (Google_PlaylistListResponse.class.isAssignableFrom(caller)) {

                    this.__playlistsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__playlistsDataType":
                if (Google_PlaylistListResponse.class.isAssignableFrom(caller)) {

                    this.__playlistsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "playlists":
                this.playlists = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PlaylistListResponse.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PlaylistListResponse.class, "kind"));
    }

    public Object setEtag(RuntimeEnv env, Object... args) {
        Object etag = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PlaylistListResponse.class, "etag", etag);

        return null;
    }

    public Object getEtag(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PlaylistListResponse.class, "etag"));
    }

    public Object setPlaylists(RuntimeEnv env, Object... args) {
        Object playlists = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PlaylistListResponse.class, "playlists", playlists);

        return null;
    }

    public Object getPlaylists(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PlaylistListResponse.class, "playlists"));
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
