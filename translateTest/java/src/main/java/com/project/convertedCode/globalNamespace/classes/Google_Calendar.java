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

 google-api-php-client/src/contrib/Google_CalendarService.php

*/

public class Google_Calendar extends Google_Model implements RuntimeFileContextInterface {

    public Object kind = null;

    public Object description = null;

    public Object summary = null;

    public Object etag = null;

    public Object location = null;

    public Object timeZone = null;

    public Object id = null;

    public Google_Calendar(RuntimeEnv env, Object... args) {
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
            case "setDescription":
                return this.setDescription(env, args);
            case "getDescription":
                return this.getDescription(env, args);
            case "setSummary":
                return this.setSummary(env, args);
            case "getSummary":
                return this.getSummary(env, args);
            case "setEtag":
                return this.setEtag(env, args);
            case "getEtag":
                return this.getEtag(env, args);
            case "setLocation":
                return this.setLocation(env, args);
            case "getLocation":
                return this.getLocation(env, args);
            case "setTimeZone":
                return this.setTimeZone(env, args);
            case "getTimeZone":
                return this.getTimeZone(env, args);
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
            case "description":
                return this.description;
            case "summary":
                return this.summary;
            case "etag":
                return this.etag;
            case "location":
                return this.location;
            case "timeZone":
                return this.timeZone;
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
            case "description":
                return ZVal.isNull(this.description);
            case "summary":
                return ZVal.isNull(this.summary);
            case "etag":
                return ZVal.isNull(this.etag);
            case "location":
                return ZVal.isNull(this.location);
            case "timeZone":
                return ZVal.isNull(this.timeZone);
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
            case "description":
                this.description = value;
                break;
            case "summary":
                this.summary = value;
                break;
            case "etag":
                this.etag = value;
                break;
            case "location":
                this.location = value;
                break;
            case "timeZone":
                this.timeZone = value;
                break;
            case "id":
                this.id = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Calendar.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Calendar.class, "kind"));
    }

    public Object setDescription(RuntimeEnv env, Object... args) {
        Object description = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Calendar.class, "description", description);

        return null;
    }

    public Object getDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Calendar.class, "description"));
    }

    public Object setSummary(RuntimeEnv env, Object... args) {
        Object summary = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Calendar.class, "summary", summary);

        return null;
    }

    public Object getSummary(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Calendar.class, "summary"));
    }

    public Object setEtag(RuntimeEnv env, Object... args) {
        Object etag = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Calendar.class, "etag", etag);

        return null;
    }

    public Object getEtag(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Calendar.class, "etag"));
    }

    public Object setLocation(RuntimeEnv env, Object... args) {
        Object location = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Calendar.class, "location", location);

        return null;
    }

    public Object getLocation(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Calendar.class, "location"));
    }

    public Object setTimeZone(RuntimeEnv env, Object... args) {
        Object timeZone = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Calendar.class, "timeZone", timeZone);

        return null;
    }

    public Object getTimeZone(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Calendar.class, "timeZone"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Calendar.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Calendar.class, "id"));
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
