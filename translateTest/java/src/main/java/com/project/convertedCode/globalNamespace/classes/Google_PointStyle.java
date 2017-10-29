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

public class Google_PointStyle extends Google_Model implements RuntimeFileContextInterface {

    public Object __iconStylerType = "Google_StyleFunction";

    public Object __iconStylerDataType = "";

    public Object iconStyler = null;

    public Object iconName = null;

    public Google_PointStyle(RuntimeEnv env, Object... args) {
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
            case "setIconStyler":
                return this.setIconStyler(env, args);
            case "getIconStyler":
                return this.getIconStyler(env, args);
            case "setIconName":
                return this.setIconName(env, args);
            case "getIconName":
                return this.getIconName(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__iconStylerType":
                if (Google_PointStyle.class.isAssignableFrom(caller)) {

                    return this.__iconStylerType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__iconStylerDataType":
                if (Google_PointStyle.class.isAssignableFrom(caller)) {

                    return this.__iconStylerDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "iconStyler":
                return this.iconStyler;
            case "iconName":
                return this.iconName;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__iconStylerType":
                if (Google_PointStyle.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__iconStylerType);
                }
                break;
            case "__iconStylerDataType":
                if (Google_PointStyle.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__iconStylerDataType);
                }
                break;
            case "iconStyler":
                return ZVal.isNull(this.iconStyler);
            case "iconName":
                return ZVal.isNull(this.iconName);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__iconStylerType":
                if (Google_PointStyle.class.isAssignableFrom(caller)) {

                    this.__iconStylerType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__iconStylerDataType":
                if (Google_PointStyle.class.isAssignableFrom(caller)) {

                    this.__iconStylerDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "iconStyler":
                this.iconStyler = value;
                break;
            case "iconName":
                this.iconName = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setIconStyler(RuntimeEnv env, Object... args) {
        Object iconStyler = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PointStyle.class, "iconStyler", iconStyler);

        return null;
    }

    public Object getIconStyler(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PointStyle.class, "iconStyler"));
    }

    public Object setIconName(RuntimeEnv env, Object... args) {
        Object iconName = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PointStyle.class, "iconName", iconName);

        return null;
    }

    public Object getIconName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PointStyle.class, "iconName"));
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
