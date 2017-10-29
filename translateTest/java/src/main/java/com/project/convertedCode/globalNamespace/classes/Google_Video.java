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

public class Google_Video extends Google_Model implements RuntimeFileContextInterface {

    public Object __statusType = "Google_VideoStatus";

    public Object __statusDataType = "";

    public Object status = null;

    public Object kind = null;

    public Object __statisticsType = "Google_VideoStatistics";

    public Object __statisticsDataType = "";

    public Object statistics = null;

    public Object __contentDetailsType = "Google_VideoContentDetails";

    public Object __contentDetailsDataType = "";

    public Object contentDetails = null;

    public Object __snippetType = "Google_VideoSnippet";

    public Object __snippetDataType = "";

    public Object snippet = null;

    public Object __playerType = "Google_VideoPlayer";

    public Object __playerDataType = "";

    public Object player = null;

    public Object etag = null;

    public Object id = null;

    public Google_Video(RuntimeEnv env, Object... args) {
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
            case "setStatus":
                return this.setStatus(env, args);
            case "getStatus":
                return this.getStatus(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setStatistics":
                return this.setStatistics(env, args);
            case "getStatistics":
                return this.getStatistics(env, args);
            case "setContentDetails":
                return this.setContentDetails(env, args);
            case "getContentDetails":
                return this.getContentDetails(env, args);
            case "setSnippet":
                return this.setSnippet(env, args);
            case "getSnippet":
                return this.getSnippet(env, args);
            case "setPlayer":
                return this.setPlayer(env, args);
            case "getPlayer":
                return this.getPlayer(env, args);
            case "setEtag":
                return this.setEtag(env, args);
            case "getEtag":
                return this.getEtag(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__statusType":
                if (Google_Video.class.isAssignableFrom(caller)) {

                    return this.__statusType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__statusDataType":
                if (Google_Video.class.isAssignableFrom(caller)) {

                    return this.__statusDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "status":
                return this.status;
            case "kind":
                return this.kind;
            case "__statisticsType":
                if (Google_Video.class.isAssignableFrom(caller)) {

                    return this.__statisticsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__statisticsDataType":
                if (Google_Video.class.isAssignableFrom(caller)) {

                    return this.__statisticsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "statistics":
                return this.statistics;
            case "__contentDetailsType":
                if (Google_Video.class.isAssignableFrom(caller)) {

                    return this.__contentDetailsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__contentDetailsDataType":
                if (Google_Video.class.isAssignableFrom(caller)) {

                    return this.__contentDetailsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "contentDetails":
                return this.contentDetails;
            case "__snippetType":
                if (Google_Video.class.isAssignableFrom(caller)) {

                    return this.__snippetType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__snippetDataType":
                if (Google_Video.class.isAssignableFrom(caller)) {

                    return this.__snippetDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "snippet":
                return this.snippet;
            case "__playerType":
                if (Google_Video.class.isAssignableFrom(caller)) {

                    return this.__playerType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__playerDataType":
                if (Google_Video.class.isAssignableFrom(caller)) {

                    return this.__playerDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "player":
                return this.player;
            case "etag":
                return this.etag;
            case "id":
                return this.id;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__statusType":
                if (Google_Video.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__statusType);
                }
                break;
            case "__statusDataType":
                if (Google_Video.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__statusDataType);
                }
                break;
            case "status":
                return ZVal.isNull(this.status);
            case "kind":
                return ZVal.isNull(this.kind);
            case "__statisticsType":
                if (Google_Video.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__statisticsType);
                }
                break;
            case "__statisticsDataType":
                if (Google_Video.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__statisticsDataType);
                }
                break;
            case "statistics":
                return ZVal.isNull(this.statistics);
            case "__contentDetailsType":
                if (Google_Video.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__contentDetailsType);
                }
                break;
            case "__contentDetailsDataType":
                if (Google_Video.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__contentDetailsDataType);
                }
                break;
            case "contentDetails":
                return ZVal.isNull(this.contentDetails);
            case "__snippetType":
                if (Google_Video.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__snippetType);
                }
                break;
            case "__snippetDataType":
                if (Google_Video.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__snippetDataType);
                }
                break;
            case "snippet":
                return ZVal.isNull(this.snippet);
            case "__playerType":
                if (Google_Video.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__playerType);
                }
                break;
            case "__playerDataType":
                if (Google_Video.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__playerDataType);
                }
                break;
            case "player":
                return ZVal.isNull(this.player);
            case "etag":
                return ZVal.isNull(this.etag);
            case "id":
                return ZVal.isNull(this.id);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__statusType":
                if (Google_Video.class.isAssignableFrom(caller)) {

                    this.__statusType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__statusDataType":
                if (Google_Video.class.isAssignableFrom(caller)) {

                    this.__statusDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "status":
                this.status = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "__statisticsType":
                if (Google_Video.class.isAssignableFrom(caller)) {

                    this.__statisticsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__statisticsDataType":
                if (Google_Video.class.isAssignableFrom(caller)) {

                    this.__statisticsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "statistics":
                this.statistics = value;
                break;
            case "__contentDetailsType":
                if (Google_Video.class.isAssignableFrom(caller)) {

                    this.__contentDetailsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__contentDetailsDataType":
                if (Google_Video.class.isAssignableFrom(caller)) {

                    this.__contentDetailsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "contentDetails":
                this.contentDetails = value;
                break;
            case "__snippetType":
                if (Google_Video.class.isAssignableFrom(caller)) {

                    this.__snippetType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__snippetDataType":
                if (Google_Video.class.isAssignableFrom(caller)) {

                    this.__snippetDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "snippet":
                this.snippet = value;
                break;
            case "__playerType":
                if (Google_Video.class.isAssignableFrom(caller)) {

                    this.__playerType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__playerDataType":
                if (Google_Video.class.isAssignableFrom(caller)) {

                    this.__playerDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "player":
                this.player = value;
                break;
            case "etag":
                this.etag = value;
                break;
            case "id":
                this.id = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setStatus(RuntimeEnv env, Object... args) {
        Object status = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Video.class, "status", status);

        return null;
    }

    public Object getStatus(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Video.class, "status"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Video.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Video.class, "kind"));
    }

    public Object setStatistics(RuntimeEnv env, Object... args) {
        Object statistics = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Video.class, "statistics", statistics);

        return null;
    }

    public Object getStatistics(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Video.class, "statistics"));
    }

    public Object setContentDetails(RuntimeEnv env, Object... args) {
        Object contentDetails = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Video.class, "contentDetails", contentDetails);

        return null;
    }

    public Object getContentDetails(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Video.class, "contentDetails"));
    }

    public Object setSnippet(RuntimeEnv env, Object... args) {
        Object snippet = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Video.class, "snippet", snippet);

        return null;
    }

    public Object getSnippet(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Video.class, "snippet"));
    }

    public Object setPlayer(RuntimeEnv env, Object... args) {
        Object player = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Video.class, "player", player);

        return null;
    }

    public Object getPlayer(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Video.class, "player"));
    }

    public Object setEtag(RuntimeEnv env, Object... args) {
        Object etag = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Video.class, "etag", etag);

        return null;
    }

    public Object getEtag(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Video.class, "etag"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Video.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Video.class, "id"));
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
