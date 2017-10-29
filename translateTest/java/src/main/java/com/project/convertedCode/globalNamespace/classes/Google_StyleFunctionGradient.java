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

public class Google_StyleFunctionGradient extends Google_Model
        implements RuntimeFileContextInterface {

    public Object max = null;

    public Object __colorsType = "Google_StyleFunctionGradientColors";

    public Object __colorsDataType = "array";

    public Object colors = null;

    public Object min = null;

    public Google_StyleFunctionGradient(RuntimeEnv env, Object... args) {
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
            case "setMax":
                return this.setMax(env, args);
            case "getMax":
                return this.getMax(env, args);
            case "setColors":
                return this.setColors(env, args);
            case "getColors":
                return this.getColors(env, args);
            case "setMin":
                return this.setMin(env, args);
            case "getMin":
                return this.getMin(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "max":
                return this.max;
            case "__colorsType":
                if (Google_StyleFunctionGradient.class.isAssignableFrom(caller)) {

                    return this.__colorsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__colorsDataType":
                if (Google_StyleFunctionGradient.class.isAssignableFrom(caller)) {

                    return this.__colorsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "colors":
                return this.colors;
            case "min":
                return this.min;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "max":
                return ZVal.isNull(this.max);
            case "__colorsType":
                if (Google_StyleFunctionGradient.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__colorsType);
                }
                break;
            case "__colorsDataType":
                if (Google_StyleFunctionGradient.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__colorsDataType);
                }
                break;
            case "colors":
                return ZVal.isNull(this.colors);
            case "min":
                return ZVal.isNull(this.min);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "max":
                this.max = value;
                break;
            case "__colorsType":
                if (Google_StyleFunctionGradient.class.isAssignableFrom(caller)) {

                    this.__colorsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__colorsDataType":
                if (Google_StyleFunctionGradient.class.isAssignableFrom(caller)) {

                    this.__colorsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "colors":
                this.colors = value;
                break;
            case "min":
                this.min = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setMax(RuntimeEnv env, Object... args) {
        Object max = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_StyleFunctionGradient.class, "max", max);

        return null;
    }

    public Object getMax(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_StyleFunctionGradient.class, "max"));
    }

    public Object setColors(RuntimeEnv env, Object... args) {
        Object colors = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_StyleFunctionGradient.class,
                colors,
                "Google_StyleFunctionGradientColors",
                "setColors");
        ZVal.setProperty(this, Google_StyleFunctionGradient.class, "colors", colors);

        return null;
    }

    public Object getColors(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_StyleFunctionGradient.class, "colors"));
    }

    public Object setMin(RuntimeEnv env, Object... args) {
        Object min = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_StyleFunctionGradient.class, "min", min);

        return null;
    }

    public Object getMin(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_StyleFunctionGradient.class, "min"));
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
