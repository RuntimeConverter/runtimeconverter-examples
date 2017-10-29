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

 google-api-php-client/src/contrib/Google_UrlshortenerService.php

*/

public class Google_Url extends Google_Model implements RuntimeFileContextInterface {

    public Object status = null;

    public Object kind = null;

    public Object created = null;

    public Object __analyticsType = "Google_AnalyticsSummary";

    public Object __analyticsDataType = "";

    public Object analytics = null;

    public Object longUrl = null;

    public Object id = null;

    public Google_Url(RuntimeEnv env, Object... args) {
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
            case "setCreated":
                return this.setCreated(env, args);
            case "getCreated":
                return this.getCreated(env, args);
            case "setAnalytics":
                return this.setAnalytics(env, args);
            case "getAnalytics":
                return this.getAnalytics(env, args);
            case "setLongUrl":
                return this.setLongUrl(env, args);
            case "getLongUrl":
                return this.getLongUrl(env, args);
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
            case "status":
                return this.status;
            case "kind":
                return this.kind;
            case "created":
                return this.created;
            case "__analyticsType":
                if (Google_Url.class.isAssignableFrom(caller)) {

                    return this.__analyticsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__analyticsDataType":
                if (Google_Url.class.isAssignableFrom(caller)) {

                    return this.__analyticsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "analytics":
                return this.analytics;
            case "longUrl":
                return this.longUrl;
            case "id":
                return this.id;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "status":
                return ZVal.isNull(this.status);
            case "kind":
                return ZVal.isNull(this.kind);
            case "created":
                return ZVal.isNull(this.created);
            case "__analyticsType":
                if (Google_Url.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__analyticsType);
                }
                break;
            case "__analyticsDataType":
                if (Google_Url.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__analyticsDataType);
                }
                break;
            case "analytics":
                return ZVal.isNull(this.analytics);
            case "longUrl":
                return ZVal.isNull(this.longUrl);
            case "id":
                return ZVal.isNull(this.id);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "status":
                this.status = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "created":
                this.created = value;
                break;
            case "__analyticsType":
                if (Google_Url.class.isAssignableFrom(caller)) {

                    this.__analyticsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__analyticsDataType":
                if (Google_Url.class.isAssignableFrom(caller)) {

                    this.__analyticsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "analytics":
                this.analytics = value;
                break;
            case "longUrl":
                this.longUrl = value;
                break;
            case "id":
                this.id = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setStatus(RuntimeEnv env, Object... args) {
        Object status = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Url.class, "status", status);

        return null;
    }

    public Object getStatus(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Url.class, "status"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Url.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Url.class, "kind"));
    }

    public Object setCreated(RuntimeEnv env, Object... args) {
        Object created = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Url.class, "created", created);

        return null;
    }

    public Object getCreated(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Url.class, "created"));
    }

    public Object setAnalytics(RuntimeEnv env, Object... args) {
        Object analytics = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Url.class, "analytics", analytics);

        return null;
    }

    public Object getAnalytics(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Url.class, "analytics"));
    }

    public Object setLongUrl(RuntimeEnv env, Object... args) {
        Object longUrl = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Url.class, "longUrl", longUrl);

        return null;
    }

    public Object getLongUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Url.class, "longUrl"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Url.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Url.class, "id"));
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
