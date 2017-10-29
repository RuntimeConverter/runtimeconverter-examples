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

public class Google_StyleFunctionGradientColors extends Google_Model
        implements RuntimeFileContextInterface {

    public Object color = null;

    public Object opacity = null;

    public Google_StyleFunctionGradientColors(RuntimeEnv env, Object... args) {
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
            case "setColor":
                return this.setColor(env, args);
            case "getColor":
                return this.getColor(env, args);
            case "setOpacity":
                return this.setOpacity(env, args);
            case "getOpacity":
                return this.getOpacity(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "color":
                return this.color;
            case "opacity":
                return this.opacity;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "color":
                return ZVal.isNull(this.color);
            case "opacity":
                return ZVal.isNull(this.opacity);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "color":
                this.color = value;
                break;
            case "opacity":
                this.opacity = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setColor(RuntimeEnv env, Object... args) {
        Object color = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_StyleFunctionGradientColors.class, "color", color);

        return null;
    }

    public Object getColor(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_StyleFunctionGradientColors.class, "color"));
    }

    public Object setOpacity(RuntimeEnv env, Object... args) {
        Object opacity = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_StyleFunctionGradientColors.class, "opacity", opacity);

        return null;
    }

    public Object getOpacity(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_StyleFunctionGradientColors.class, "opacity"));
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
