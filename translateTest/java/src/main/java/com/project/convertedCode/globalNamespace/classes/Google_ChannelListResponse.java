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

public class Google_ChannelListResponse extends Google_Model
        implements RuntimeFileContextInterface {

    public Object __channelsType = "Google_Channel";

    public Object __channelsDataType = "map";

    public Object channels = null;

    public Object kind = null;

    public Object etag = null;

    public Google_ChannelListResponse(RuntimeEnv env, Object... args) {
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
            case "setChannels":
                return this.setChannels(env, args);
            case "getChannels":
                return this.getChannels(env, args);
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
            case "__channelsType":
                if (Google_ChannelListResponse.class.isAssignableFrom(caller)) {

                    return this.__channelsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__channelsDataType":
                if (Google_ChannelListResponse.class.isAssignableFrom(caller)) {

                    return this.__channelsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "channels":
                return this.channels;
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
            case "__channelsType":
                if (Google_ChannelListResponse.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__channelsType);
                }
                break;
            case "__channelsDataType":
                if (Google_ChannelListResponse.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__channelsDataType);
                }
                break;
            case "channels":
                return ZVal.isNull(this.channels);
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
            case "__channelsType":
                if (Google_ChannelListResponse.class.isAssignableFrom(caller)) {

                    this.__channelsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__channelsDataType":
                if (Google_ChannelListResponse.class.isAssignableFrom(caller)) {

                    this.__channelsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "channels":
                this.channels = value;
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

    public Object setChannels(RuntimeEnv env, Object... args) {
        Object channels = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ChannelListResponse.class, "channels", channels);

        return null;
    }

    public Object getChannels(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ChannelListResponse.class, "channels"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ChannelListResponse.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ChannelListResponse.class, "kind"));
    }

    public Object setEtag(RuntimeEnv env, Object... args) {
        Object etag = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ChannelListResponse.class, "etag", etag);

        return null;
    }

    public Object getEtag(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ChannelListResponse.class, "etag"));
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
