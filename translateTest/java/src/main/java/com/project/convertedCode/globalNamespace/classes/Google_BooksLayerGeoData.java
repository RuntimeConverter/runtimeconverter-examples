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

 google-api-php-client/src/contrib/Google_BooksService.php

*/

public class Google_BooksLayerGeoData extends Google_Model implements RuntimeFileContextInterface {

    public Object __geoType = "Google_BooksLayerGeoDataGeo";

    public Object __geoDataType = "";

    public Object geo = null;

    public Object __commonType = "Google_BooksLayerGeoDataCommon";

    public Object __commonDataType = "";

    public Object common = null;

    public Google_BooksLayerGeoData(RuntimeEnv env, Object... args) {
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
            case "setGeo":
                return this.setGeo(env, args);
            case "getGeo":
                return this.getGeo(env, args);
            case "setCommon":
                return this.setCommon(env, args);
            case "getCommon":
                return this.getCommon(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__geoType":
                if (Google_BooksLayerGeoData.class.isAssignableFrom(caller)) {

                    return this.__geoType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__geoDataType":
                if (Google_BooksLayerGeoData.class.isAssignableFrom(caller)) {

                    return this.__geoDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "geo":
                return this.geo;
            case "__commonType":
                if (Google_BooksLayerGeoData.class.isAssignableFrom(caller)) {

                    return this.__commonType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__commonDataType":
                if (Google_BooksLayerGeoData.class.isAssignableFrom(caller)) {

                    return this.__commonDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "common":
                return this.common;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__geoType":
                if (Google_BooksLayerGeoData.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__geoType);
                }
                break;
            case "__geoDataType":
                if (Google_BooksLayerGeoData.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__geoDataType);
                }
                break;
            case "geo":
                return ZVal.isNull(this.geo);
            case "__commonType":
                if (Google_BooksLayerGeoData.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__commonType);
                }
                break;
            case "__commonDataType":
                if (Google_BooksLayerGeoData.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__commonDataType);
                }
                break;
            case "common":
                return ZVal.isNull(this.common);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__geoType":
                if (Google_BooksLayerGeoData.class.isAssignableFrom(caller)) {

                    this.__geoType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__geoDataType":
                if (Google_BooksLayerGeoData.class.isAssignableFrom(caller)) {

                    this.__geoDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "geo":
                this.geo = value;
                break;
            case "__commonType":
                if (Google_BooksLayerGeoData.class.isAssignableFrom(caller)) {

                    this.__commonType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__commonDataType":
                if (Google_BooksLayerGeoData.class.isAssignableFrom(caller)) {

                    this.__commonDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "common":
                this.common = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setGeo(RuntimeEnv env, Object... args) {
        Object geo = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_BooksLayerGeoData.class, "geo", geo);

        return null;
    }

    public Object getGeo(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_BooksLayerGeoData.class, "geo"));
    }

    public Object setCommon(RuntimeEnv env, Object... args) {
        Object common = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_BooksLayerGeoData.class, "common", common);

        return null;
    }

    public Object getCommon(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_BooksLayerGeoData.class, "common"));
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
