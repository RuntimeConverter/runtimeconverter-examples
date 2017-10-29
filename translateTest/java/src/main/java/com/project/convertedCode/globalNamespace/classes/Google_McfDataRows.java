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

 google-api-php-client/src/contrib/Google_AnalyticsService.php

*/

public class Google_McfDataRows extends Google_Model implements RuntimeFileContextInterface {

    public Object primitiveValue = null;

    public Object __conversionPathValueType = "Google_McfDataRowsConversionPathValue";

    public Object __conversionPathValueDataType = "array";

    public Object conversionPathValue = null;

    public Google_McfDataRows(RuntimeEnv env, Object... args) {
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
            case "setPrimitiveValue":
                return this.setPrimitiveValue(env, args);
            case "getPrimitiveValue":
                return this.getPrimitiveValue(env, args);
            case "setConversionPathValue":
                return this.setConversionPathValue(env, args);
            case "getConversionPathValue":
                return this.getConversionPathValue(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "primitiveValue":
                return this.primitiveValue;
            case "__conversionPathValueType":
                if (Google_McfDataRows.class.isAssignableFrom(caller)) {

                    return this.__conversionPathValueType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__conversionPathValueDataType":
                if (Google_McfDataRows.class.isAssignableFrom(caller)) {

                    return this.__conversionPathValueDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "conversionPathValue":
                return this.conversionPathValue;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "primitiveValue":
                return ZVal.isNull(this.primitiveValue);
            case "__conversionPathValueType":
                if (Google_McfDataRows.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__conversionPathValueType);
                }
                break;
            case "__conversionPathValueDataType":
                if (Google_McfDataRows.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__conversionPathValueDataType);
                }
                break;
            case "conversionPathValue":
                return ZVal.isNull(this.conversionPathValue);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "primitiveValue":
                this.primitiveValue = value;
                break;
            case "__conversionPathValueType":
                if (Google_McfDataRows.class.isAssignableFrom(caller)) {

                    this.__conversionPathValueType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__conversionPathValueDataType":
                if (Google_McfDataRows.class.isAssignableFrom(caller)) {

                    this.__conversionPathValueDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "conversionPathValue":
                this.conversionPathValue = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setPrimitiveValue(RuntimeEnv env, Object... args) {
        Object primitiveValue = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_McfDataRows.class, "primitiveValue", primitiveValue);

        return null;
    }

    public Object getPrimitiveValue(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_McfDataRows.class, "primitiveValue"));
    }

    public Object setConversionPathValue(RuntimeEnv env, Object... args) {
        Object conversionPathValue = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_McfDataRows.class,
                conversionPathValue,
                "Google_McfDataRowsConversionPathValue",
                "setConversionPathValue");
        ZVal.setProperty(
                this, Google_McfDataRows.class, "conversionPathValue", conversionPathValue);

        return null;
    }

    public Object getConversionPathValue(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_McfDataRows.class, "conversionPathValue"));
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
