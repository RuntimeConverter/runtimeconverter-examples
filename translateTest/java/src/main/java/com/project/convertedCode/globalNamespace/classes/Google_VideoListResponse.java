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

public class Google_VideoListResponse extends Google_Model implements RuntimeFileContextInterface {

    public Object kind = null;

    public Object etag = null;

    public Object __videosType = "Google_Video";

    public Object __videosDataType = "map";

    public Object videos = null;

    public Google_VideoListResponse(RuntimeEnv env, Object... args) {
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
            case "setVideos":
                return this.setVideos(env, args);
            case "getVideos":
                return this.getVideos(env, args);
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
            case "__videosType":
                if (Google_VideoListResponse.class.isAssignableFrom(caller)) {

                    return this.__videosType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__videosDataType":
                if (Google_VideoListResponse.class.isAssignableFrom(caller)) {

                    return this.__videosDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "videos":
                return this.videos;
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
            case "__videosType":
                if (Google_VideoListResponse.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__videosType);
                }
                break;
            case "__videosDataType":
                if (Google_VideoListResponse.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__videosDataType);
                }
                break;
            case "videos":
                return ZVal.isNull(this.videos);
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
            case "__videosType":
                if (Google_VideoListResponse.class.isAssignableFrom(caller)) {

                    this.__videosType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__videosDataType":
                if (Google_VideoListResponse.class.isAssignableFrom(caller)) {

                    this.__videosDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "videos":
                this.videos = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VideoListResponse.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VideoListResponse.class, "kind"));
    }

    public Object setEtag(RuntimeEnv env, Object... args) {
        Object etag = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VideoListResponse.class, "etag", etag);

        return null;
    }

    public Object getEtag(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VideoListResponse.class, "etag"));
    }

    public Object setVideos(RuntimeEnv env, Object... args) {
        Object videos = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VideoListResponse.class, "videos", videos);

        return null;
    }

    public Object getVideos(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VideoListResponse.class, "videos"));
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
