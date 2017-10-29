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

public class Google_BooksLayerGeoDataGeo extends Google_Model
        implements RuntimeFileContextInterface {

    public Object countryCode = null;

    public Object title = null;

    public Object zoom = null;

    public Object longitude = null;

    public Object mapType = null;

    public Object latitude = null;

    public Object __boundaryType = "Google_BooksLayerGeoDataGeoBoundary";

    public Object __boundaryDataType = "array";

    public Object boundary = null;

    public Object __viewportType = "Google_BooksLayerGeoDataGeoViewport";

    public Object __viewportDataType = "";

    public Object viewport = null;

    public Object cachePolicy = null;

    public Google_BooksLayerGeoDataGeo(RuntimeEnv env, Object... args) {
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
            case "setCountryCode":
                return this.setCountryCode(env, args);
            case "getCountryCode":
                return this.getCountryCode(env, args);
            case "setTitle":
                return this.setTitle(env, args);
            case "getTitle":
                return this.getTitle(env, args);
            case "setZoom":
                return this.setZoom(env, args);
            case "getZoom":
                return this.getZoom(env, args);
            case "setLongitude":
                return this.setLongitude(env, args);
            case "getLongitude":
                return this.getLongitude(env, args);
            case "setMapType":
                return this.setMapType(env, args);
            case "getMapType":
                return this.getMapType(env, args);
            case "setLatitude":
                return this.setLatitude(env, args);
            case "getLatitude":
                return this.getLatitude(env, args);
            case "setBoundary":
                return this.setBoundary(env, args);
            case "getBoundary":
                return this.getBoundary(env, args);
            case "setViewport":
                return this.setViewport(env, args);
            case "getViewport":
                return this.getViewport(env, args);
            case "setCachePolicy":
                return this.setCachePolicy(env, args);
            case "getCachePolicy":
                return this.getCachePolicy(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "countryCode":
                return this.countryCode;
            case "title":
                return this.title;
            case "zoom":
                return this.zoom;
            case "longitude":
                return this.longitude;
            case "mapType":
                return this.mapType;
            case "latitude":
                return this.latitude;
            case "__boundaryType":
                if (Google_BooksLayerGeoDataGeo.class.isAssignableFrom(caller)) {

                    return this.__boundaryType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__boundaryDataType":
                if (Google_BooksLayerGeoDataGeo.class.isAssignableFrom(caller)) {

                    return this.__boundaryDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "boundary":
                return this.boundary;
            case "__viewportType":
                if (Google_BooksLayerGeoDataGeo.class.isAssignableFrom(caller)) {

                    return this.__viewportType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__viewportDataType":
                if (Google_BooksLayerGeoDataGeo.class.isAssignableFrom(caller)) {

                    return this.__viewportDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "viewport":
                return this.viewport;
            case "cachePolicy":
                return this.cachePolicy;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "countryCode":
                return ZVal.isNull(this.countryCode);
            case "title":
                return ZVal.isNull(this.title);
            case "zoom":
                return ZVal.isNull(this.zoom);
            case "longitude":
                return ZVal.isNull(this.longitude);
            case "mapType":
                return ZVal.isNull(this.mapType);
            case "latitude":
                return ZVal.isNull(this.latitude);
            case "__boundaryType":
                if (Google_BooksLayerGeoDataGeo.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__boundaryType);
                }
                break;
            case "__boundaryDataType":
                if (Google_BooksLayerGeoDataGeo.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__boundaryDataType);
                }
                break;
            case "boundary":
                return ZVal.isNull(this.boundary);
            case "__viewportType":
                if (Google_BooksLayerGeoDataGeo.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__viewportType);
                }
                break;
            case "__viewportDataType":
                if (Google_BooksLayerGeoDataGeo.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__viewportDataType);
                }
                break;
            case "viewport":
                return ZVal.isNull(this.viewport);
            case "cachePolicy":
                return ZVal.isNull(this.cachePolicy);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "countryCode":
                this.countryCode = value;
                break;
            case "title":
                this.title = value;
                break;
            case "zoom":
                this.zoom = value;
                break;
            case "longitude":
                this.longitude = value;
                break;
            case "mapType":
                this.mapType = value;
                break;
            case "latitude":
                this.latitude = value;
                break;
            case "__boundaryType":
                if (Google_BooksLayerGeoDataGeo.class.isAssignableFrom(caller)) {

                    this.__boundaryType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__boundaryDataType":
                if (Google_BooksLayerGeoDataGeo.class.isAssignableFrom(caller)) {

                    this.__boundaryDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "boundary":
                this.boundary = value;
                break;
            case "__viewportType":
                if (Google_BooksLayerGeoDataGeo.class.isAssignableFrom(caller)) {

                    this.__viewportType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__viewportDataType":
                if (Google_BooksLayerGeoDataGeo.class.isAssignableFrom(caller)) {

                    this.__viewportDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "viewport":
                this.viewport = value;
                break;
            case "cachePolicy":
                this.cachePolicy = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setCountryCode(RuntimeEnv env, Object... args) {
        Object countryCode = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_BooksLayerGeoDataGeo.class, "countryCode", countryCode);

        return null;
    }

    public Object getCountryCode(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_BooksLayerGeoDataGeo.class, "countryCode"));
    }

    public Object setTitle(RuntimeEnv env, Object... args) {
        Object title = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_BooksLayerGeoDataGeo.class, "title", title);

        return null;
    }

    public Object getTitle(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_BooksLayerGeoDataGeo.class, "title"));
    }

    public Object setZoom(RuntimeEnv env, Object... args) {
        Object zoom = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_BooksLayerGeoDataGeo.class, "zoom", zoom);

        return null;
    }

    public Object getZoom(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_BooksLayerGeoDataGeo.class, "zoom"));
    }

    public Object setLongitude(RuntimeEnv env, Object... args) {
        Object longitude = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_BooksLayerGeoDataGeo.class, "longitude", longitude);

        return null;
    }

    public Object getLongitude(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_BooksLayerGeoDataGeo.class, "longitude"));
    }

    public Object setMapType(RuntimeEnv env, Object... args) {
        Object mapType = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_BooksLayerGeoDataGeo.class, "mapType", mapType);

        return null;
    }

    public Object getMapType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_BooksLayerGeoDataGeo.class, "mapType"));
    }

    public Object setLatitude(RuntimeEnv env, Object... args) {
        Object latitude = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_BooksLayerGeoDataGeo.class, "latitude", latitude);

        return null;
    }

    public Object getLatitude(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_BooksLayerGeoDataGeo.class, "latitude"));
    }

    public Object setBoundary(RuntimeEnv env, Object... args) {
        Object boundary = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_BooksLayerGeoDataGeo.class,
                boundary,
                "Google_BooksLayerGeoDataGeoBoundary",
                "setBoundary");
        ZVal.setProperty(this, Google_BooksLayerGeoDataGeo.class, "boundary", boundary);

        return null;
    }

    public Object getBoundary(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_BooksLayerGeoDataGeo.class, "boundary"));
    }

    public Object setViewport(RuntimeEnv env, Object... args) {
        Object viewport = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_BooksLayerGeoDataGeo.class, "viewport", viewport);

        return null;
    }

    public Object getViewport(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_BooksLayerGeoDataGeo.class, "viewport"));
    }

    public Object setCachePolicy(RuntimeEnv env, Object... args) {
        Object cachePolicy = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_BooksLayerGeoDataGeo.class, "cachePolicy", cachePolicy);

        return null;
    }

    public Object getCachePolicy(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_BooksLayerGeoDataGeo.class, "cachePolicy"));
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
