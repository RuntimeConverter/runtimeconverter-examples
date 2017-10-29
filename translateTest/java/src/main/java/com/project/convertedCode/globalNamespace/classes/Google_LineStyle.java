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

public class Google_LineStyle extends Google_Model implements RuntimeFileContextInterface {

    public Object strokeWeight = null;

    public Object __strokeWeightStylerType = "Google_StyleFunction";

    public Object __strokeWeightStylerDataType = "";

    public Object strokeWeightStyler = null;

    public Object strokeColor = null;

    public Object strokeOpacity = null;

    public Object __strokeColorStylerType = "Google_StyleFunction";

    public Object __strokeColorStylerDataType = "";

    public Object strokeColorStyler = null;

    public Google_LineStyle(RuntimeEnv env, Object... args) {
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
            case "setStrokeWeight":
                return this.setStrokeWeight(env, args);
            case "getStrokeWeight":
                return this.getStrokeWeight(env, args);
            case "setStrokeWeightStyler":
                return this.setStrokeWeightStyler(env, args);
            case "getStrokeWeightStyler":
                return this.getStrokeWeightStyler(env, args);
            case "setStrokeColor":
                return this.setStrokeColor(env, args);
            case "getStrokeColor":
                return this.getStrokeColor(env, args);
            case "setStrokeOpacity":
                return this.setStrokeOpacity(env, args);
            case "getStrokeOpacity":
                return this.getStrokeOpacity(env, args);
            case "setStrokeColorStyler":
                return this.setStrokeColorStyler(env, args);
            case "getStrokeColorStyler":
                return this.getStrokeColorStyler(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "strokeWeight":
                return this.strokeWeight;
            case "__strokeWeightStylerType":
                if (Google_LineStyle.class.isAssignableFrom(caller)) {

                    return this.__strokeWeightStylerType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__strokeWeightStylerDataType":
                if (Google_LineStyle.class.isAssignableFrom(caller)) {

                    return this.__strokeWeightStylerDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "strokeWeightStyler":
                return this.strokeWeightStyler;
            case "strokeColor":
                return this.strokeColor;
            case "strokeOpacity":
                return this.strokeOpacity;
            case "__strokeColorStylerType":
                if (Google_LineStyle.class.isAssignableFrom(caller)) {

                    return this.__strokeColorStylerType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__strokeColorStylerDataType":
                if (Google_LineStyle.class.isAssignableFrom(caller)) {

                    return this.__strokeColorStylerDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "strokeColorStyler":
                return this.strokeColorStyler;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "strokeWeight":
                return ZVal.isNull(this.strokeWeight);
            case "__strokeWeightStylerType":
                if (Google_LineStyle.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__strokeWeightStylerType);
                }
                break;
            case "__strokeWeightStylerDataType":
                if (Google_LineStyle.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__strokeWeightStylerDataType);
                }
                break;
            case "strokeWeightStyler":
                return ZVal.isNull(this.strokeWeightStyler);
            case "strokeColor":
                return ZVal.isNull(this.strokeColor);
            case "strokeOpacity":
                return ZVal.isNull(this.strokeOpacity);
            case "__strokeColorStylerType":
                if (Google_LineStyle.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__strokeColorStylerType);
                }
                break;
            case "__strokeColorStylerDataType":
                if (Google_LineStyle.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__strokeColorStylerDataType);
                }
                break;
            case "strokeColorStyler":
                return ZVal.isNull(this.strokeColorStyler);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "strokeWeight":
                this.strokeWeight = value;
                break;
            case "__strokeWeightStylerType":
                if (Google_LineStyle.class.isAssignableFrom(caller)) {

                    this.__strokeWeightStylerType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__strokeWeightStylerDataType":
                if (Google_LineStyle.class.isAssignableFrom(caller)) {

                    this.__strokeWeightStylerDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "strokeWeightStyler":
                this.strokeWeightStyler = value;
                break;
            case "strokeColor":
                this.strokeColor = value;
                break;
            case "strokeOpacity":
                this.strokeOpacity = value;
                break;
            case "__strokeColorStylerType":
                if (Google_LineStyle.class.isAssignableFrom(caller)) {

                    this.__strokeColorStylerType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__strokeColorStylerDataType":
                if (Google_LineStyle.class.isAssignableFrom(caller)) {

                    this.__strokeColorStylerDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "strokeColorStyler":
                this.strokeColorStyler = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setStrokeWeight(RuntimeEnv env, Object... args) {
        Object strokeWeight = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_LineStyle.class, "strokeWeight", strokeWeight);

        return null;
    }

    public Object getStrokeWeight(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_LineStyle.class, "strokeWeight"));
    }

    public Object setStrokeWeightStyler(RuntimeEnv env, Object... args) {
        Object strokeWeightStyler = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_LineStyle.class, "strokeWeightStyler", strokeWeightStyler);

        return null;
    }

    public Object getStrokeWeightStyler(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_LineStyle.class, "strokeWeightStyler"));
    }

    public Object setStrokeColor(RuntimeEnv env, Object... args) {
        Object strokeColor = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_LineStyle.class, "strokeColor", strokeColor);

        return null;
    }

    public Object getStrokeColor(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_LineStyle.class, "strokeColor"));
    }

    public Object setStrokeOpacity(RuntimeEnv env, Object... args) {
        Object strokeOpacity = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_LineStyle.class, "strokeOpacity", strokeOpacity);

        return null;
    }

    public Object getStrokeOpacity(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_LineStyle.class, "strokeOpacity"));
    }

    public Object setStrokeColorStyler(RuntimeEnv env, Object... args) {
        Object strokeColorStyler = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_LineStyle.class, "strokeColorStyler", strokeColorStyler);

        return null;
    }

    public Object getStrokeColorStyler(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_LineStyle.class, "strokeColorStyler"));
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
