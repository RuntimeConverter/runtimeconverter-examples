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

public class Google_FreeBusyResponse extends Google_Model implements RuntimeFileContextInterface {

    public Object timeMax = null;

    public Object kind = null;

    public Object __calendarsType = "Google_FreeBusyCalendar";

    public Object __calendarsDataType = "map";

    public Object calendars = null;

    public Object timeMin = null;

    public Object __groupsType = "Google_FreeBusyGroup";

    public Object __groupsDataType = "map";

    public Object groups = null;

    public Google_FreeBusyResponse(RuntimeEnv env, Object... args) {
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
            case "setTimeMax":
                return this.setTimeMax(env, args);
            case "getTimeMax":
                return this.getTimeMax(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setCalendars":
                return this.setCalendars(env, args);
            case "getCalendars":
                return this.getCalendars(env, args);
            case "setTimeMin":
                return this.setTimeMin(env, args);
            case "getTimeMin":
                return this.getTimeMin(env, args);
            case "setGroups":
                return this.setGroups(env, args);
            case "getGroups":
                return this.getGroups(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "timeMax":
                return this.timeMax;
            case "kind":
                return this.kind;
            case "__calendarsType":
                if (Google_FreeBusyResponse.class.isAssignableFrom(caller)) {

                    return this.__calendarsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__calendarsDataType":
                if (Google_FreeBusyResponse.class.isAssignableFrom(caller)) {

                    return this.__calendarsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "calendars":
                return this.calendars;
            case "timeMin":
                return this.timeMin;
            case "__groupsType":
                if (Google_FreeBusyResponse.class.isAssignableFrom(caller)) {

                    return this.__groupsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__groupsDataType":
                if (Google_FreeBusyResponse.class.isAssignableFrom(caller)) {

                    return this.__groupsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "groups":
                return this.groups;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "timeMax":
                return ZVal.isNull(this.timeMax);
            case "kind":
                return ZVal.isNull(this.kind);
            case "__calendarsType":
                if (Google_FreeBusyResponse.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__calendarsType);
                }
                break;
            case "__calendarsDataType":
                if (Google_FreeBusyResponse.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__calendarsDataType);
                }
                break;
            case "calendars":
                return ZVal.isNull(this.calendars);
            case "timeMin":
                return ZVal.isNull(this.timeMin);
            case "__groupsType":
                if (Google_FreeBusyResponse.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__groupsType);
                }
                break;
            case "__groupsDataType":
                if (Google_FreeBusyResponse.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__groupsDataType);
                }
                break;
            case "groups":
                return ZVal.isNull(this.groups);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "timeMax":
                this.timeMax = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "__calendarsType":
                if (Google_FreeBusyResponse.class.isAssignableFrom(caller)) {

                    this.__calendarsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__calendarsDataType":
                if (Google_FreeBusyResponse.class.isAssignableFrom(caller)) {

                    this.__calendarsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "calendars":
                this.calendars = value;
                break;
            case "timeMin":
                this.timeMin = value;
                break;
            case "__groupsType":
                if (Google_FreeBusyResponse.class.isAssignableFrom(caller)) {

                    this.__groupsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__groupsDataType":
                if (Google_FreeBusyResponse.class.isAssignableFrom(caller)) {

                    this.__groupsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "groups":
                this.groups = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setTimeMax(RuntimeEnv env, Object... args) {
        Object timeMax = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_FreeBusyResponse.class, "timeMax", timeMax);

        return null;
    }

    public Object getTimeMax(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_FreeBusyResponse.class, "timeMax"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_FreeBusyResponse.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_FreeBusyResponse.class, "kind"));
    }

    public Object setCalendars(RuntimeEnv env, Object... args) {
        Object calendars = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_FreeBusyResponse.class, "calendars", calendars);

        return null;
    }

    public Object getCalendars(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_FreeBusyResponse.class, "calendars"));
    }

    public Object setTimeMin(RuntimeEnv env, Object... args) {
        Object timeMin = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_FreeBusyResponse.class, "timeMin", timeMin);

        return null;
    }

    public Object getTimeMin(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_FreeBusyResponse.class, "timeMin"));
    }

    public Object setGroups(RuntimeEnv env, Object... args) {
        Object groups = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_FreeBusyResponse.class, "groups", groups);

        return null;
    }

    public Object getGroups(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_FreeBusyResponse.class, "groups"));
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
