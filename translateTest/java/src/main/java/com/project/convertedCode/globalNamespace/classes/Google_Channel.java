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

public class Google_Channel extends Google_Model implements RuntimeFileContextInterface {

    public Object kind = null;

    public Object __statisticsType = "Google_ChannelStatistics";

    public Object __statisticsDataType = "";

    public Object statistics = null;

    public Object __contentDetailsType = "Google_ChannelContentDetails";

    public Object __contentDetailsDataType = "";

    public Object contentDetails = null;

    public Object __snippetType = "Google_ChannelSnippet";

    public Object __snippetDataType = "";

    public Object snippet = null;

    public Object etag = null;

    public Object id = null;

    public Google_Channel(RuntimeEnv env, Object... args) {
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
            case "kind":
                return this.kind;
            case "__statisticsType":
                if (Google_Channel.class.isAssignableFrom(caller)) {

                    return this.__statisticsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__statisticsDataType":
                if (Google_Channel.class.isAssignableFrom(caller)) {

                    return this.__statisticsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "statistics":
                return this.statistics;
            case "__contentDetailsType":
                if (Google_Channel.class.isAssignableFrom(caller)) {

                    return this.__contentDetailsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__contentDetailsDataType":
                if (Google_Channel.class.isAssignableFrom(caller)) {

                    return this.__contentDetailsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "contentDetails":
                return this.contentDetails;
            case "__snippetType":
                if (Google_Channel.class.isAssignableFrom(caller)) {

                    return this.__snippetType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__snippetDataType":
                if (Google_Channel.class.isAssignableFrom(caller)) {

                    return this.__snippetDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "snippet":
                return this.snippet;
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
            case "kind":
                return ZVal.isNull(this.kind);
            case "__statisticsType":
                if (Google_Channel.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__statisticsType);
                }
                break;
            case "__statisticsDataType":
                if (Google_Channel.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__statisticsDataType);
                }
                break;
            case "statistics":
                return ZVal.isNull(this.statistics);
            case "__contentDetailsType":
                if (Google_Channel.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__contentDetailsType);
                }
                break;
            case "__contentDetailsDataType":
                if (Google_Channel.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__contentDetailsDataType);
                }
                break;
            case "contentDetails":
                return ZVal.isNull(this.contentDetails);
            case "__snippetType":
                if (Google_Channel.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__snippetType);
                }
                break;
            case "__snippetDataType":
                if (Google_Channel.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__snippetDataType);
                }
                break;
            case "snippet":
                return ZVal.isNull(this.snippet);
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
            case "kind":
                this.kind = value;
                break;
            case "__statisticsType":
                if (Google_Channel.class.isAssignableFrom(caller)) {

                    this.__statisticsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__statisticsDataType":
                if (Google_Channel.class.isAssignableFrom(caller)) {

                    this.__statisticsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "statistics":
                this.statistics = value;
                break;
            case "__contentDetailsType":
                if (Google_Channel.class.isAssignableFrom(caller)) {

                    this.__contentDetailsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__contentDetailsDataType":
                if (Google_Channel.class.isAssignableFrom(caller)) {

                    this.__contentDetailsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "contentDetails":
                this.contentDetails = value;
                break;
            case "__snippetType":
                if (Google_Channel.class.isAssignableFrom(caller)) {

                    this.__snippetType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__snippetDataType":
                if (Google_Channel.class.isAssignableFrom(caller)) {

                    this.__snippetDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "snippet":
                this.snippet = value;
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

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Channel.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Channel.class, "kind"));
    }

    public Object setStatistics(RuntimeEnv env, Object... args) {
        Object statistics = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Channel.class, "statistics", statistics);

        return null;
    }

    public Object getStatistics(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Channel.class, "statistics"));
    }

    public Object setContentDetails(RuntimeEnv env, Object... args) {
        Object contentDetails = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Channel.class, "contentDetails", contentDetails);

        return null;
    }

    public Object getContentDetails(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Channel.class, "contentDetails"));
    }

    public Object setSnippet(RuntimeEnv env, Object... args) {
        Object snippet = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Channel.class, "snippet", snippet);

        return null;
    }

    public Object getSnippet(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Channel.class, "snippet"));
    }

    public Object setEtag(RuntimeEnv env, Object... args) {
        Object etag = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Channel.class, "etag", etag);

        return null;
    }

    public Object getEtag(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Channel.class, "etag"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Channel.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Channel.class, "id"));
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
