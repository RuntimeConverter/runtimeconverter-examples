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

public class Google_AnalyticsSummary extends Google_Model implements RuntimeFileContextInterface {

    public Object __weekType = "Google_AnalyticsSnapshot";

    public Object __weekDataType = "";

    public Object week = null;

    public Object __allTimeType = "Google_AnalyticsSnapshot";

    public Object __allTimeDataType = "";

    public Object allTime = null;

    public Object __twoHoursType = "Google_AnalyticsSnapshot";

    public Object __twoHoursDataType = "";

    public Object twoHours = null;

    public Object __dayType = "Google_AnalyticsSnapshot";

    public Object __dayDataType = "";

    public Object day = null;

    public Object __monthType = "Google_AnalyticsSnapshot";

    public Object __monthDataType = "";

    public Object month = null;

    public Google_AnalyticsSummary(RuntimeEnv env, Object... args) {
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
            case "setWeek":
                return this.setWeek(env, args);
            case "getWeek":
                return this.getWeek(env, args);
            case "setAllTime":
                return this.setAllTime(env, args);
            case "getAllTime":
                return this.getAllTime(env, args);
            case "setTwoHours":
                return this.setTwoHours(env, args);
            case "getTwoHours":
                return this.getTwoHours(env, args);
            case "setDay":
                return this.setDay(env, args);
            case "getDay":
                return this.getDay(env, args);
            case "setMonth":
                return this.setMonth(env, args);
            case "getMonth":
                return this.getMonth(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__weekType":
                if (Google_AnalyticsSummary.class.isAssignableFrom(caller)) {

                    return this.__weekType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__weekDataType":
                if (Google_AnalyticsSummary.class.isAssignableFrom(caller)) {

                    return this.__weekDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "week":
                return this.week;
            case "__allTimeType":
                if (Google_AnalyticsSummary.class.isAssignableFrom(caller)) {

                    return this.__allTimeType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__allTimeDataType":
                if (Google_AnalyticsSummary.class.isAssignableFrom(caller)) {

                    return this.__allTimeDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "allTime":
                return this.allTime;
            case "__twoHoursType":
                if (Google_AnalyticsSummary.class.isAssignableFrom(caller)) {

                    return this.__twoHoursType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__twoHoursDataType":
                if (Google_AnalyticsSummary.class.isAssignableFrom(caller)) {

                    return this.__twoHoursDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "twoHours":
                return this.twoHours;
            case "__dayType":
                if (Google_AnalyticsSummary.class.isAssignableFrom(caller)) {

                    return this.__dayType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__dayDataType":
                if (Google_AnalyticsSummary.class.isAssignableFrom(caller)) {

                    return this.__dayDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "day":
                return this.day;
            case "__monthType":
                if (Google_AnalyticsSummary.class.isAssignableFrom(caller)) {

                    return this.__monthType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__monthDataType":
                if (Google_AnalyticsSummary.class.isAssignableFrom(caller)) {

                    return this.__monthDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "month":
                return this.month;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__weekType":
                if (Google_AnalyticsSummary.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__weekType);
                }
                break;
            case "__weekDataType":
                if (Google_AnalyticsSummary.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__weekDataType);
                }
                break;
            case "week":
                return ZVal.isNull(this.week);
            case "__allTimeType":
                if (Google_AnalyticsSummary.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__allTimeType);
                }
                break;
            case "__allTimeDataType":
                if (Google_AnalyticsSummary.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__allTimeDataType);
                }
                break;
            case "allTime":
                return ZVal.isNull(this.allTime);
            case "__twoHoursType":
                if (Google_AnalyticsSummary.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__twoHoursType);
                }
                break;
            case "__twoHoursDataType":
                if (Google_AnalyticsSummary.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__twoHoursDataType);
                }
                break;
            case "twoHours":
                return ZVal.isNull(this.twoHours);
            case "__dayType":
                if (Google_AnalyticsSummary.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__dayType);
                }
                break;
            case "__dayDataType":
                if (Google_AnalyticsSummary.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__dayDataType);
                }
                break;
            case "day":
                return ZVal.isNull(this.day);
            case "__monthType":
                if (Google_AnalyticsSummary.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__monthType);
                }
                break;
            case "__monthDataType":
                if (Google_AnalyticsSummary.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__monthDataType);
                }
                break;
            case "month":
                return ZVal.isNull(this.month);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__weekType":
                if (Google_AnalyticsSummary.class.isAssignableFrom(caller)) {

                    this.__weekType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__weekDataType":
                if (Google_AnalyticsSummary.class.isAssignableFrom(caller)) {

                    this.__weekDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "week":
                this.week = value;
                break;
            case "__allTimeType":
                if (Google_AnalyticsSummary.class.isAssignableFrom(caller)) {

                    this.__allTimeType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__allTimeDataType":
                if (Google_AnalyticsSummary.class.isAssignableFrom(caller)) {

                    this.__allTimeDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "allTime":
                this.allTime = value;
                break;
            case "__twoHoursType":
                if (Google_AnalyticsSummary.class.isAssignableFrom(caller)) {

                    this.__twoHoursType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__twoHoursDataType":
                if (Google_AnalyticsSummary.class.isAssignableFrom(caller)) {

                    this.__twoHoursDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "twoHours":
                this.twoHours = value;
                break;
            case "__dayType":
                if (Google_AnalyticsSummary.class.isAssignableFrom(caller)) {

                    this.__dayType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__dayDataType":
                if (Google_AnalyticsSummary.class.isAssignableFrom(caller)) {

                    this.__dayDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "day":
                this.day = value;
                break;
            case "__monthType":
                if (Google_AnalyticsSummary.class.isAssignableFrom(caller)) {

                    this.__monthType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__monthDataType":
                if (Google_AnalyticsSummary.class.isAssignableFrom(caller)) {

                    this.__monthDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "month":
                this.month = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setWeek(RuntimeEnv env, Object... args) {
        Object week = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AnalyticsSummary.class, "week", week);

        return null;
    }

    public Object getWeek(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AnalyticsSummary.class, "week"));
    }

    public Object setAllTime(RuntimeEnv env, Object... args) {
        Object allTime = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AnalyticsSummary.class, "allTime", allTime);

        return null;
    }

    public Object getAllTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AnalyticsSummary.class, "allTime"));
    }

    public Object setTwoHours(RuntimeEnv env, Object... args) {
        Object twoHours = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AnalyticsSummary.class, "twoHours", twoHours);

        return null;
    }

    public Object getTwoHours(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AnalyticsSummary.class, "twoHours"));
    }

    public Object setDay(RuntimeEnv env, Object... args) {
        Object day = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AnalyticsSummary.class, "day", day);

        return null;
    }

    public Object getDay(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AnalyticsSummary.class, "day"));
    }

    public Object setMonth(RuntimeEnv env, Object... args) {
        Object month = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AnalyticsSummary.class, "month", month);

        return null;
    }

    public Object getMonth(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AnalyticsSummary.class, "month"));
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
