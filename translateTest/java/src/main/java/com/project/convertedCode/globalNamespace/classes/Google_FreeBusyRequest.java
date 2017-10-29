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

public class Google_FreeBusyRequest extends Google_Model implements RuntimeFileContextInterface {

    public Object calendarExpansionMax = null;

    public Object groupExpansionMax = null;

    public Object timeMax = null;

    public Object __itemsType = "Google_FreeBusyRequestItem";

    public Object __itemsDataType = "array";

    public Object items = null;

    public Object timeMin = null;

    public Object timeZone = null;

    public Google_FreeBusyRequest(RuntimeEnv env, Object... args) {
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
            case "setCalendarExpansionMax":
                return this.setCalendarExpansionMax(env, args);
            case "getCalendarExpansionMax":
                return this.getCalendarExpansionMax(env, args);
            case "setGroupExpansionMax":
                return this.setGroupExpansionMax(env, args);
            case "getGroupExpansionMax":
                return this.getGroupExpansionMax(env, args);
            case "setTimeMax":
                return this.setTimeMax(env, args);
            case "getTimeMax":
                return this.getTimeMax(env, args);
            case "setItems":
                return this.setItems(env, args);
            case "getItems":
                return this.getItems(env, args);
            case "setTimeMin":
                return this.setTimeMin(env, args);
            case "getTimeMin":
                return this.getTimeMin(env, args);
            case "setTimeZone":
                return this.setTimeZone(env, args);
            case "getTimeZone":
                return this.getTimeZone(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "calendarExpansionMax":
                return this.calendarExpansionMax;
            case "groupExpansionMax":
                return this.groupExpansionMax;
            case "timeMax":
                return this.timeMax;
            case "__itemsType":
                if (Google_FreeBusyRequest.class.isAssignableFrom(caller)) {

                    return this.__itemsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__itemsDataType":
                if (Google_FreeBusyRequest.class.isAssignableFrom(caller)) {

                    return this.__itemsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "items":
                return this.items;
            case "timeMin":
                return this.timeMin;
            case "timeZone":
                return this.timeZone;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "calendarExpansionMax":
                return ZVal.isNull(this.calendarExpansionMax);
            case "groupExpansionMax":
                return ZVal.isNull(this.groupExpansionMax);
            case "timeMax":
                return ZVal.isNull(this.timeMax);
            case "__itemsType":
                if (Google_FreeBusyRequest.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__itemsType);
                }
                break;
            case "__itemsDataType":
                if (Google_FreeBusyRequest.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__itemsDataType);
                }
                break;
            case "items":
                return ZVal.isNull(this.items);
            case "timeMin":
                return ZVal.isNull(this.timeMin);
            case "timeZone":
                return ZVal.isNull(this.timeZone);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "calendarExpansionMax":
                this.calendarExpansionMax = value;
                break;
            case "groupExpansionMax":
                this.groupExpansionMax = value;
                break;
            case "timeMax":
                this.timeMax = value;
                break;
            case "__itemsType":
                if (Google_FreeBusyRequest.class.isAssignableFrom(caller)) {

                    this.__itemsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__itemsDataType":
                if (Google_FreeBusyRequest.class.isAssignableFrom(caller)) {

                    this.__itemsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "items":
                this.items = value;
                break;
            case "timeMin":
                this.timeMin = value;
                break;
            case "timeZone":
                this.timeZone = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setCalendarExpansionMax(RuntimeEnv env, Object... args) {
        Object calendarExpansionMax = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_FreeBusyRequest.class, "calendarExpansionMax", calendarExpansionMax);

        return null;
    }

    public Object getCalendarExpansionMax(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_FreeBusyRequest.class, "calendarExpansionMax"));
    }

    public Object setGroupExpansionMax(RuntimeEnv env, Object... args) {
        Object groupExpansionMax = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_FreeBusyRequest.class, "groupExpansionMax", groupExpansionMax);

        return null;
    }

    public Object getGroupExpansionMax(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_FreeBusyRequest.class, "groupExpansionMax"));
    }

    public Object setTimeMax(RuntimeEnv env, Object... args) {
        Object timeMax = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_FreeBusyRequest.class, "timeMax", timeMax);

        return null;
    }

    public Object getTimeMax(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_FreeBusyRequest.class, "timeMax"));
    }

    public Object setItems(RuntimeEnv env, Object... args) {
        Object items = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_FreeBusyRequest.class,
                items,
                "Google_FreeBusyRequestItem",
                "setItems");
        ZVal.setProperty(this, Google_FreeBusyRequest.class, "items", items);

        return null;
    }

    public Object getItems(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_FreeBusyRequest.class, "items"));
    }

    public Object setTimeMin(RuntimeEnv env, Object... args) {
        Object timeMin = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_FreeBusyRequest.class, "timeMin", timeMin);

        return null;
    }

    public Object getTimeMin(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_FreeBusyRequest.class, "timeMin"));
    }

    public Object setTimeZone(RuntimeEnv env, Object... args) {
        Object timeZone = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_FreeBusyRequest.class, "timeZone", timeZone);

        return null;
    }

    public Object getTimeZone(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_FreeBusyRequest.class, "timeZone"));
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
