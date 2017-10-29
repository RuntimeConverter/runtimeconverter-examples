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

public class Google_AnalyticsSnapshot extends Google_Model implements RuntimeFileContextInterface {

    public Object shortUrlClicks = null;

    public Object __countriesType = "Google_StringCount";

    public Object __countriesDataType = "array";

    public Object countries = null;

    public Object __platformsType = "Google_StringCount";

    public Object __platformsDataType = "array";

    public Object platforms = null;

    public Object __browsersType = "Google_StringCount";

    public Object __browsersDataType = "array";

    public Object browsers = null;

    public Object __referrersType = "Google_StringCount";

    public Object __referrersDataType = "array";

    public Object referrers = null;

    public Object longUrlClicks = null;

    public Google_AnalyticsSnapshot(RuntimeEnv env, Object... args) {
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
            case "setShortUrlClicks":
                return this.setShortUrlClicks(env, args);
            case "getShortUrlClicks":
                return this.getShortUrlClicks(env, args);
            case "setCountries":
                return this.setCountries(env, args);
            case "getCountries":
                return this.getCountries(env, args);
            case "setPlatforms":
                return this.setPlatforms(env, args);
            case "getPlatforms":
                return this.getPlatforms(env, args);
            case "setBrowsers":
                return this.setBrowsers(env, args);
            case "getBrowsers":
                return this.getBrowsers(env, args);
            case "setReferrers":
                return this.setReferrers(env, args);
            case "getReferrers":
                return this.getReferrers(env, args);
            case "setLongUrlClicks":
                return this.setLongUrlClicks(env, args);
            case "getLongUrlClicks":
                return this.getLongUrlClicks(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "shortUrlClicks":
                return this.shortUrlClicks;
            case "__countriesType":
                if (Google_AnalyticsSnapshot.class.isAssignableFrom(caller)) {

                    return this.__countriesType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__countriesDataType":
                if (Google_AnalyticsSnapshot.class.isAssignableFrom(caller)) {

                    return this.__countriesDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "countries":
                return this.countries;
            case "__platformsType":
                if (Google_AnalyticsSnapshot.class.isAssignableFrom(caller)) {

                    return this.__platformsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__platformsDataType":
                if (Google_AnalyticsSnapshot.class.isAssignableFrom(caller)) {

                    return this.__platformsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "platforms":
                return this.platforms;
            case "__browsersType":
                if (Google_AnalyticsSnapshot.class.isAssignableFrom(caller)) {

                    return this.__browsersType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__browsersDataType":
                if (Google_AnalyticsSnapshot.class.isAssignableFrom(caller)) {

                    return this.__browsersDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "browsers":
                return this.browsers;
            case "__referrersType":
                if (Google_AnalyticsSnapshot.class.isAssignableFrom(caller)) {

                    return this.__referrersType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__referrersDataType":
                if (Google_AnalyticsSnapshot.class.isAssignableFrom(caller)) {

                    return this.__referrersDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "referrers":
                return this.referrers;
            case "longUrlClicks":
                return this.longUrlClicks;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "shortUrlClicks":
                return ZVal.isNull(this.shortUrlClicks);
            case "__countriesType":
                if (Google_AnalyticsSnapshot.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__countriesType);
                }
                break;
            case "__countriesDataType":
                if (Google_AnalyticsSnapshot.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__countriesDataType);
                }
                break;
            case "countries":
                return ZVal.isNull(this.countries);
            case "__platformsType":
                if (Google_AnalyticsSnapshot.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__platformsType);
                }
                break;
            case "__platformsDataType":
                if (Google_AnalyticsSnapshot.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__platformsDataType);
                }
                break;
            case "platforms":
                return ZVal.isNull(this.platforms);
            case "__browsersType":
                if (Google_AnalyticsSnapshot.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__browsersType);
                }
                break;
            case "__browsersDataType":
                if (Google_AnalyticsSnapshot.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__browsersDataType);
                }
                break;
            case "browsers":
                return ZVal.isNull(this.browsers);
            case "__referrersType":
                if (Google_AnalyticsSnapshot.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__referrersType);
                }
                break;
            case "__referrersDataType":
                if (Google_AnalyticsSnapshot.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__referrersDataType);
                }
                break;
            case "referrers":
                return ZVal.isNull(this.referrers);
            case "longUrlClicks":
                return ZVal.isNull(this.longUrlClicks);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "shortUrlClicks":
                this.shortUrlClicks = value;
                break;
            case "__countriesType":
                if (Google_AnalyticsSnapshot.class.isAssignableFrom(caller)) {

                    this.__countriesType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__countriesDataType":
                if (Google_AnalyticsSnapshot.class.isAssignableFrom(caller)) {

                    this.__countriesDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "countries":
                this.countries = value;
                break;
            case "__platformsType":
                if (Google_AnalyticsSnapshot.class.isAssignableFrom(caller)) {

                    this.__platformsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__platformsDataType":
                if (Google_AnalyticsSnapshot.class.isAssignableFrom(caller)) {

                    this.__platformsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "platforms":
                this.platforms = value;
                break;
            case "__browsersType":
                if (Google_AnalyticsSnapshot.class.isAssignableFrom(caller)) {

                    this.__browsersType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__browsersDataType":
                if (Google_AnalyticsSnapshot.class.isAssignableFrom(caller)) {

                    this.__browsersDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "browsers":
                this.browsers = value;
                break;
            case "__referrersType":
                if (Google_AnalyticsSnapshot.class.isAssignableFrom(caller)) {

                    this.__referrersType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__referrersDataType":
                if (Google_AnalyticsSnapshot.class.isAssignableFrom(caller)) {

                    this.__referrersDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "referrers":
                this.referrers = value;
                break;
            case "longUrlClicks":
                this.longUrlClicks = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setShortUrlClicks(RuntimeEnv env, Object... args) {
        Object shortUrlClicks = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AnalyticsSnapshot.class, "shortUrlClicks", shortUrlClicks);

        return null;
    }

    public Object getShortUrlClicks(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_AnalyticsSnapshot.class, "shortUrlClicks"));
    }

    public Object setCountries(RuntimeEnv env, Object... args) {
        Object countries = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_AnalyticsSnapshot.class,
                countries,
                "Google_StringCount",
                "setCountries");
        ZVal.setProperty(this, Google_AnalyticsSnapshot.class, "countries", countries);

        return null;
    }

    public Object getCountries(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AnalyticsSnapshot.class, "countries"));
    }

    public Object setPlatforms(RuntimeEnv env, Object... args) {
        Object platforms = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_AnalyticsSnapshot.class,
                platforms,
                "Google_StringCount",
                "setPlatforms");
        ZVal.setProperty(this, Google_AnalyticsSnapshot.class, "platforms", platforms);

        return null;
    }

    public Object getPlatforms(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AnalyticsSnapshot.class, "platforms"));
    }

    public Object setBrowsers(RuntimeEnv env, Object... args) {
        Object browsers = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_AnalyticsSnapshot.class,
                browsers,
                "Google_StringCount",
                "setBrowsers");
        ZVal.setProperty(this, Google_AnalyticsSnapshot.class, "browsers", browsers);

        return null;
    }

    public Object getBrowsers(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AnalyticsSnapshot.class, "browsers"));
    }

    public Object setReferrers(RuntimeEnv env, Object... args) {
        Object referrers = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_AnalyticsSnapshot.class,
                referrers,
                "Google_StringCount",
                "setReferrers");
        ZVal.setProperty(this, Google_AnalyticsSnapshot.class, "referrers", referrers);

        return null;
    }

    public Object getReferrers(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AnalyticsSnapshot.class, "referrers"));
    }

    public Object setLongUrlClicks(RuntimeEnv env, Object... args) {
        Object longUrlClicks = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AnalyticsSnapshot.class, "longUrlClicks", longUrlClicks);

        return null;
    }

    public Object getLongUrlClicks(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AnalyticsSnapshot.class, "longUrlClicks"));
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
