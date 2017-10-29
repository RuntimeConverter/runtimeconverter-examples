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

public class Google_Colors extends Google_Model implements RuntimeFileContextInterface {

    public Object __calendarType = "Google_ColorDefinition";

    public Object __calendarDataType = "map";

    public Object calendar = null;

    public Object updated = null;

    public Object __eventType = "Google_ColorDefinition";

    public Object __eventDataType = "map";

    public Object event = null;

    public Object kind = null;

    public Google_Colors(RuntimeEnv env, Object... args) {
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
            case "setCalendar":
                return this.setCalendar(env, args);
            case "getCalendar":
                return this.getCalendar(env, args);
            case "setUpdated":
                return this.setUpdated(env, args);
            case "getUpdated":
                return this.getUpdated(env, args);
            case "setEvent":
                return this.setEvent(env, args);
            case "getEvent":
                return this.getEvent(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__calendarType":
                if (Google_Colors.class.isAssignableFrom(caller)) {

                    return this.__calendarType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__calendarDataType":
                if (Google_Colors.class.isAssignableFrom(caller)) {

                    return this.__calendarDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "calendar":
                return this.calendar;
            case "updated":
                return this.updated;
            case "__eventType":
                if (Google_Colors.class.isAssignableFrom(caller)) {

                    return this.__eventType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__eventDataType":
                if (Google_Colors.class.isAssignableFrom(caller)) {

                    return this.__eventDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "event":
                return this.event;
            case "kind":
                return this.kind;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__calendarType":
                if (Google_Colors.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__calendarType);
                }
                break;
            case "__calendarDataType":
                if (Google_Colors.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__calendarDataType);
                }
                break;
            case "calendar":
                return ZVal.isNull(this.calendar);
            case "updated":
                return ZVal.isNull(this.updated);
            case "__eventType":
                if (Google_Colors.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__eventType);
                }
                break;
            case "__eventDataType":
                if (Google_Colors.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__eventDataType);
                }
                break;
            case "event":
                return ZVal.isNull(this.event);
            case "kind":
                return ZVal.isNull(this.kind);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__calendarType":
                if (Google_Colors.class.isAssignableFrom(caller)) {

                    this.__calendarType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__calendarDataType":
                if (Google_Colors.class.isAssignableFrom(caller)) {

                    this.__calendarDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "calendar":
                this.calendar = value;
                break;
            case "updated":
                this.updated = value;
                break;
            case "__eventType":
                if (Google_Colors.class.isAssignableFrom(caller)) {

                    this.__eventType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__eventDataType":
                if (Google_Colors.class.isAssignableFrom(caller)) {

                    this.__eventDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "event":
                this.event = value;
                break;
            case "kind":
                this.kind = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setCalendar(RuntimeEnv env, Object... args) {
        Object calendar = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Colors.class, "calendar", calendar);

        return null;
    }

    public Object getCalendar(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Colors.class, "calendar"));
    }

    public Object setUpdated(RuntimeEnv env, Object... args) {
        Object updated = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Colors.class, "updated", updated);

        return null;
    }

    public Object getUpdated(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Colors.class, "updated"));
    }

    public Object setEvent(RuntimeEnv env, Object... args) {
        Object event = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Colors.class, "event", event);

        return null;
    }

    public Object getEvent(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Colors.class, "event"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Colors.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Colors.class, "kind"));
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
