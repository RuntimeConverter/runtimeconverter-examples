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

 google-api-php-client/src/contrib/Google_FusiontablesService.php

*/

public class Google_PolygonStyle extends Google_Model implements RuntimeFileContextInterface {

    public Object __strokeColorStylerType = "Google_StyleFunction";

    public Object __strokeColorStylerDataType = "";

    public Object strokeColorStyler = null;

    public Object strokeWeight = null;

    public Object strokeOpacity = null;

    public Object __strokeWeightStylerType = "Google_StyleFunction";

    public Object __strokeWeightStylerDataType = "";

    public Object strokeWeightStyler = null;

    public Object __fillColorStylerType = "Google_StyleFunction";

    public Object __fillColorStylerDataType = "";

    public Object fillColorStyler = null;

    public Object fillColor = null;

    public Object strokeColor = null;

    public Object fillOpacity = null;

    public Google_PolygonStyle(RuntimeEnv env, Object... args) {
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
            case "setStrokeColorStyler":
                return this.setStrokeColorStyler(env, args);
            case "getStrokeColorStyler":
                return this.getStrokeColorStyler(env, args);
            case "setStrokeWeight":
                return this.setStrokeWeight(env, args);
            case "getStrokeWeight":
                return this.getStrokeWeight(env, args);
            case "setStrokeOpacity":
                return this.setStrokeOpacity(env, args);
            case "getStrokeOpacity":
                return this.getStrokeOpacity(env, args);
            case "setStrokeWeightStyler":
                return this.setStrokeWeightStyler(env, args);
            case "getStrokeWeightStyler":
                return this.getStrokeWeightStyler(env, args);
            case "setFillColorStyler":
                return this.setFillColorStyler(env, args);
            case "getFillColorStyler":
                return this.getFillColorStyler(env, args);
            case "setFillColor":
                return this.setFillColor(env, args);
            case "getFillColor":
                return this.getFillColor(env, args);
            case "setStrokeColor":
                return this.setStrokeColor(env, args);
            case "getStrokeColor":
                return this.getStrokeColor(env, args);
            case "setFillOpacity":
                return this.setFillOpacity(env, args);
            case "getFillOpacity":
                return this.getFillOpacity(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__strokeColorStylerType":
                if (Google_PolygonStyle.class.isAssignableFrom(caller)) {

                    return this.__strokeColorStylerType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__strokeColorStylerDataType":
                if (Google_PolygonStyle.class.isAssignableFrom(caller)) {

                    return this.__strokeColorStylerDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "strokeColorStyler":
                return this.strokeColorStyler;
            case "strokeWeight":
                return this.strokeWeight;
            case "strokeOpacity":
                return this.strokeOpacity;
            case "__strokeWeightStylerType":
                if (Google_PolygonStyle.class.isAssignableFrom(caller)) {

                    return this.__strokeWeightStylerType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__strokeWeightStylerDataType":
                if (Google_PolygonStyle.class.isAssignableFrom(caller)) {

                    return this.__strokeWeightStylerDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "strokeWeightStyler":
                return this.strokeWeightStyler;
            case "__fillColorStylerType":
                if (Google_PolygonStyle.class.isAssignableFrom(caller)) {

                    return this.__fillColorStylerType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__fillColorStylerDataType":
                if (Google_PolygonStyle.class.isAssignableFrom(caller)) {

                    return this.__fillColorStylerDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "fillColorStyler":
                return this.fillColorStyler;
            case "fillColor":
                return this.fillColor;
            case "strokeColor":
                return this.strokeColor;
            case "fillOpacity":
                return this.fillOpacity;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__strokeColorStylerType":
                if (Google_PolygonStyle.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__strokeColorStylerType);
                }
                break;
            case "__strokeColorStylerDataType":
                if (Google_PolygonStyle.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__strokeColorStylerDataType);
                }
                break;
            case "strokeColorStyler":
                return ZVal.isNull(this.strokeColorStyler);
            case "strokeWeight":
                return ZVal.isNull(this.strokeWeight);
            case "strokeOpacity":
                return ZVal.isNull(this.strokeOpacity);
            case "__strokeWeightStylerType":
                if (Google_PolygonStyle.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__strokeWeightStylerType);
                }
                break;
            case "__strokeWeightStylerDataType":
                if (Google_PolygonStyle.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__strokeWeightStylerDataType);
                }
                break;
            case "strokeWeightStyler":
                return ZVal.isNull(this.strokeWeightStyler);
            case "__fillColorStylerType":
                if (Google_PolygonStyle.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__fillColorStylerType);
                }
                break;
            case "__fillColorStylerDataType":
                if (Google_PolygonStyle.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__fillColorStylerDataType);
                }
                break;
            case "fillColorStyler":
                return ZVal.isNull(this.fillColorStyler);
            case "fillColor":
                return ZVal.isNull(this.fillColor);
            case "strokeColor":
                return ZVal.isNull(this.strokeColor);
            case "fillOpacity":
                return ZVal.isNull(this.fillOpacity);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__strokeColorStylerType":
                if (Google_PolygonStyle.class.isAssignableFrom(caller)) {

                    this.__strokeColorStylerType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__strokeColorStylerDataType":
                if (Google_PolygonStyle.class.isAssignableFrom(caller)) {

                    this.__strokeColorStylerDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "strokeColorStyler":
                this.strokeColorStyler = value;
                break;
            case "strokeWeight":
                this.strokeWeight = value;
                break;
            case "strokeOpacity":
                this.strokeOpacity = value;
                break;
            case "__strokeWeightStylerType":
                if (Google_PolygonStyle.class.isAssignableFrom(caller)) {

                    this.__strokeWeightStylerType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__strokeWeightStylerDataType":
                if (Google_PolygonStyle.class.isAssignableFrom(caller)) {

                    this.__strokeWeightStylerDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "strokeWeightStyler":
                this.strokeWeightStyler = value;
                break;
            case "__fillColorStylerType":
                if (Google_PolygonStyle.class.isAssignableFrom(caller)) {

                    this.__fillColorStylerType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__fillColorStylerDataType":
                if (Google_PolygonStyle.class.isAssignableFrom(caller)) {

                    this.__fillColorStylerDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "fillColorStyler":
                this.fillColorStyler = value;
                break;
            case "fillColor":
                this.fillColor = value;
                break;
            case "strokeColor":
                this.strokeColor = value;
                break;
            case "fillOpacity":
                this.fillOpacity = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setStrokeColorStyler(RuntimeEnv env, Object... args) {
        Object strokeColorStyler = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PolygonStyle.class, "strokeColorStyler", strokeColorStyler);

        return null;
    }

    public Object getStrokeColorStyler(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PolygonStyle.class, "strokeColorStyler"));
    }

    public Object setStrokeWeight(RuntimeEnv env, Object... args) {
        Object strokeWeight = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PolygonStyle.class, "strokeWeight", strokeWeight);

        return null;
    }

    public Object getStrokeWeight(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PolygonStyle.class, "strokeWeight"));
    }

    public Object setStrokeOpacity(RuntimeEnv env, Object... args) {
        Object strokeOpacity = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PolygonStyle.class, "strokeOpacity", strokeOpacity);

        return null;
    }

    public Object getStrokeOpacity(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PolygonStyle.class, "strokeOpacity"));
    }

    public Object setStrokeWeightStyler(RuntimeEnv env, Object... args) {
        Object strokeWeightStyler = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PolygonStyle.class, "strokeWeightStyler", strokeWeightStyler);

        return null;
    }

    public Object getStrokeWeightStyler(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PolygonStyle.class, "strokeWeightStyler"));
    }

    public Object setFillColorStyler(RuntimeEnv env, Object... args) {
        Object fillColorStyler = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PolygonStyle.class, "fillColorStyler", fillColorStyler);

        return null;
    }

    public Object getFillColorStyler(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PolygonStyle.class, "fillColorStyler"));
    }

    public Object setFillColor(RuntimeEnv env, Object... args) {
        Object fillColor = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PolygonStyle.class, "fillColor", fillColor);

        return null;
    }

    public Object getFillColor(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PolygonStyle.class, "fillColor"));
    }

    public Object setStrokeColor(RuntimeEnv env, Object... args) {
        Object strokeColor = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PolygonStyle.class, "strokeColor", strokeColor);

        return null;
    }

    public Object getStrokeColor(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PolygonStyle.class, "strokeColor"));
    }

    public Object setFillOpacity(RuntimeEnv env, Object... args) {
        Object fillOpacity = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PolygonStyle.class, "fillOpacity", fillOpacity);

        return null;
    }

    public Object getFillOpacity(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PolygonStyle.class, "fillOpacity"));
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
