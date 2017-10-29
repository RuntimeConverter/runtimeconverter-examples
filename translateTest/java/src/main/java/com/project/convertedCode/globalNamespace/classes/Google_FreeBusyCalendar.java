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

public class Google_FreeBusyCalendar extends Google_Model implements RuntimeFileContextInterface {

    public Object __busyType = "Google_TimePeriod";

    public Object __busyDataType = "array";

    public Object busy = null;

    public Object __errorsType = "Google_Error";

    public Object __errorsDataType = "array";

    public Object errors = null;

    public Google_FreeBusyCalendar(RuntimeEnv env, Object... args) {
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
            case "setBusy":
                return this.setBusy(env, args);
            case "getBusy":
                return this.getBusy(env, args);
            case "setErrors":
                return this.setErrors(env, args);
            case "getErrors":
                return this.getErrors(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__busyType":
                if (Google_FreeBusyCalendar.class.isAssignableFrom(caller)) {

                    return this.__busyType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__busyDataType":
                if (Google_FreeBusyCalendar.class.isAssignableFrom(caller)) {

                    return this.__busyDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "busy":
                return this.busy;
            case "__errorsType":
                if (Google_FreeBusyCalendar.class.isAssignableFrom(caller)) {

                    return this.__errorsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__errorsDataType":
                if (Google_FreeBusyCalendar.class.isAssignableFrom(caller)) {

                    return this.__errorsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "errors":
                return this.errors;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__busyType":
                if (Google_FreeBusyCalendar.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__busyType);
                }
                break;
            case "__busyDataType":
                if (Google_FreeBusyCalendar.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__busyDataType);
                }
                break;
            case "busy":
                return ZVal.isNull(this.busy);
            case "__errorsType":
                if (Google_FreeBusyCalendar.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__errorsType);
                }
                break;
            case "__errorsDataType":
                if (Google_FreeBusyCalendar.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__errorsDataType);
                }
                break;
            case "errors":
                return ZVal.isNull(this.errors);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__busyType":
                if (Google_FreeBusyCalendar.class.isAssignableFrom(caller)) {

                    this.__busyType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__busyDataType":
                if (Google_FreeBusyCalendar.class.isAssignableFrom(caller)) {

                    this.__busyDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "busy":
                this.busy = value;
                break;
            case "__errorsType":
                if (Google_FreeBusyCalendar.class.isAssignableFrom(caller)) {

                    this.__errorsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__errorsDataType":
                if (Google_FreeBusyCalendar.class.isAssignableFrom(caller)) {

                    this.__errorsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "errors":
                this.errors = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setBusy(RuntimeEnv env, Object... args) {
        Object busy = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_FreeBusyCalendar.class,
                busy,
                "Google_TimePeriod",
                "setBusy");
        ZVal.setProperty(this, Google_FreeBusyCalendar.class, "busy", busy);

        return null;
    }

    public Object getBusy(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_FreeBusyCalendar.class, "busy"));
    }

    public Object setErrors(RuntimeEnv env, Object... args) {
        Object errors = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_FreeBusyCalendar.class,
                errors,
                "Google_Error",
                "setErrors");
        ZVal.setProperty(this, Google_FreeBusyCalendar.class, "errors", errors);

        return null;
    }

    public Object getErrors(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_FreeBusyCalendar.class, "errors"));
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
