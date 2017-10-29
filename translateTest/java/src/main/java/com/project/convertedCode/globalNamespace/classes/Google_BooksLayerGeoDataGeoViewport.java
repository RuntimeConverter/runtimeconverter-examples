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

public class Google_BooksLayerGeoDataGeoViewport extends Google_Model
        implements RuntimeFileContextInterface {

    public Object __loType = "Google_BooksLayerGeoDataGeoViewportLo";

    public Object __loDataType = "";

    public Object lo = null;

    public Object __hiType = "Google_BooksLayerGeoDataGeoViewportHi";

    public Object __hiDataType = "";

    public Object hi = null;

    public Google_BooksLayerGeoDataGeoViewport(RuntimeEnv env, Object... args) {
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
            case "setLo":
                return this.setLo(env, args);
            case "getLo":
                return this.getLo(env, args);
            case "setHi":
                return this.setHi(env, args);
            case "getHi":
                return this.getHi(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__loType":
                if (Google_BooksLayerGeoDataGeoViewport.class.isAssignableFrom(caller)) {

                    return this.__loType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__loDataType":
                if (Google_BooksLayerGeoDataGeoViewport.class.isAssignableFrom(caller)) {

                    return this.__loDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "lo":
                return this.lo;
            case "__hiType":
                if (Google_BooksLayerGeoDataGeoViewport.class.isAssignableFrom(caller)) {

                    return this.__hiType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__hiDataType":
                if (Google_BooksLayerGeoDataGeoViewport.class.isAssignableFrom(caller)) {

                    return this.__hiDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "hi":
                return this.hi;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__loType":
                if (Google_BooksLayerGeoDataGeoViewport.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__loType);
                }
                break;
            case "__loDataType":
                if (Google_BooksLayerGeoDataGeoViewport.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__loDataType);
                }
                break;
            case "lo":
                return ZVal.isNull(this.lo);
            case "__hiType":
                if (Google_BooksLayerGeoDataGeoViewport.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__hiType);
                }
                break;
            case "__hiDataType":
                if (Google_BooksLayerGeoDataGeoViewport.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__hiDataType);
                }
                break;
            case "hi":
                return ZVal.isNull(this.hi);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__loType":
                if (Google_BooksLayerGeoDataGeoViewport.class.isAssignableFrom(caller)) {

                    this.__loType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__loDataType":
                if (Google_BooksLayerGeoDataGeoViewport.class.isAssignableFrom(caller)) {

                    this.__loDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "lo":
                this.lo = value;
                break;
            case "__hiType":
                if (Google_BooksLayerGeoDataGeoViewport.class.isAssignableFrom(caller)) {

                    this.__hiType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__hiDataType":
                if (Google_BooksLayerGeoDataGeoViewport.class.isAssignableFrom(caller)) {

                    this.__hiDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "hi":
                this.hi = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setLo(RuntimeEnv env, Object... args) {
        Object lo = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_BooksLayerGeoDataGeoViewport.class, "lo", lo);

        return null;
    }

    public Object getLo(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_BooksLayerGeoDataGeoViewport.class, "lo"));
    }

    public Object setHi(RuntimeEnv env, Object... args) {
        Object hi = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_BooksLayerGeoDataGeoViewport.class, "hi", hi);

        return null;
    }

    public Object getHi(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_BooksLayerGeoDataGeoViewport.class, "hi"));
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
