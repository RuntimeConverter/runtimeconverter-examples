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

public class Google_EventAttendee extends Google_Model implements RuntimeFileContextInterface {

    public Object comment = null;

    public Object displayName = null;

    public Object responseStatus = null;

    public Object self = null;

    public Object id = null;

    public Object additionalGuests = null;

    public Object resource = null;

    public Object organizer = null;

    public Object optional = null;

    public Object email = null;

    public Google_EventAttendee(RuntimeEnv env, Object... args) {
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
            case "setComment":
                return this.setComment(env, args);
            case "getComment":
                return this.getComment(env, args);
            case "setDisplayName":
                return this.setDisplayName(env, args);
            case "getDisplayName":
                return this.getDisplayName(env, args);
            case "setResponseStatus":
                return this.setResponseStatus(env, args);
            case "getResponseStatus":
                return this.getResponseStatus(env, args);
            case "setSelf":
                return this.setSelf(env, args);
            case "getSelf":
                return this.getSelf(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setAdditionalGuests":
                return this.setAdditionalGuests(env, args);
            case "getAdditionalGuests":
                return this.getAdditionalGuests(env, args);
            case "setResource":
                return this.setResource(env, args);
            case "getResource":
                return this.getResource(env, args);
            case "setOrganizer":
                return this.setOrganizer(env, args);
            case "getOrganizer":
                return this.getOrganizer(env, args);
            case "setOptional":
                return this.setOptional(env, args);
            case "getOptional":
                return this.getOptional(env, args);
            case "setEmail":
                return this.setEmail(env, args);
            case "getEmail":
                return this.getEmail(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "comment":
                return this.comment;
            case "displayName":
                return this.displayName;
            case "responseStatus":
                return this.responseStatus;
            case "self":
                return this.self;
            case "id":
                return this.id;
            case "additionalGuests":
                return this.additionalGuests;
            case "resource":
                return this.resource;
            case "organizer":
                return this.organizer;
            case "optional":
                return this.optional;
            case "email":
                return this.email;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "comment":
                return ZVal.isNull(this.comment);
            case "displayName":
                return ZVal.isNull(this.displayName);
            case "responseStatus":
                return ZVal.isNull(this.responseStatus);
            case "self":
                return ZVal.isNull(this.self);
            case "id":
                return ZVal.isNull(this.id);
            case "additionalGuests":
                return ZVal.isNull(this.additionalGuests);
            case "resource":
                return ZVal.isNull(this.resource);
            case "organizer":
                return ZVal.isNull(this.organizer);
            case "optional":
                return ZVal.isNull(this.optional);
            case "email":
                return ZVal.isNull(this.email);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "comment":
                this.comment = value;
                break;
            case "displayName":
                this.displayName = value;
                break;
            case "responseStatus":
                this.responseStatus = value;
                break;
            case "self":
                this.self = value;
                break;
            case "id":
                this.id = value;
                break;
            case "additionalGuests":
                this.additionalGuests = value;
                break;
            case "resource":
                this.resource = value;
                break;
            case "organizer":
                this.organizer = value;
                break;
            case "optional":
                this.optional = value;
                break;
            case "email":
                this.email = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setComment(RuntimeEnv env, Object... args) {
        Object comment = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_EventAttendee.class, "comment", comment);

        return null;
    }

    public Object getComment(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_EventAttendee.class, "comment"));
    }

    public Object setDisplayName(RuntimeEnv env, Object... args) {
        Object displayName = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_EventAttendee.class, "displayName", displayName);

        return null;
    }

    public Object getDisplayName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_EventAttendee.class, "displayName"));
    }

    public Object setResponseStatus(RuntimeEnv env, Object... args) {
        Object responseStatus = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_EventAttendee.class, "responseStatus", responseStatus);

        return null;
    }

    public Object getResponseStatus(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_EventAttendee.class, "responseStatus"));
    }

    public Object setSelf(RuntimeEnv env, Object... args) {
        Object self = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_EventAttendee.class, "self", self);

        return null;
    }

    public Object getSelf(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_EventAttendee.class, "self"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_EventAttendee.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_EventAttendee.class, "id"));
    }

    public Object setAdditionalGuests(RuntimeEnv env, Object... args) {
        Object additionalGuests = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_EventAttendee.class, "additionalGuests", additionalGuests);

        return null;
    }

    public Object getAdditionalGuests(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_EventAttendee.class, "additionalGuests"));
    }

    public Object setResource(RuntimeEnv env, Object... args) {
        Object resource = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_EventAttendee.class, "resource", resource);

        return null;
    }

    public Object getResource(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_EventAttendee.class, "resource"));
    }

    public Object setOrganizer(RuntimeEnv env, Object... args) {
        Object organizer = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_EventAttendee.class, "organizer", organizer);

        return null;
    }

    public Object getOrganizer(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_EventAttendee.class, "organizer"));
    }

    public Object setOptional(RuntimeEnv env, Object... args) {
        Object optional = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_EventAttendee.class, "optional", optional);

        return null;
    }

    public Object getOptional(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_EventAttendee.class, "optional"));
    }

    public Object setEmail(RuntimeEnv env, Object... args) {
        Object email = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_EventAttendee.class, "email", email);

        return null;
    }

    public Object getEmail(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_EventAttendee.class, "email"));
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
