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

public class Google_StyleFunction extends Google_Model implements RuntimeFileContextInterface {

    public Object __gradientType = "Google_StyleFunctionGradient";

    public Object __gradientDataType = "";

    public Object gradient = null;

    public Object columnName = null;

    public Object __bucketsType = "Google_Bucket";

    public Object __bucketsDataType = "array";

    public Object buckets = null;

    public Object kind = null;

    public Google_StyleFunction(RuntimeEnv env, Object... args) {
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
            case "setGradient":
                return this.setGradient(env, args);
            case "getGradient":
                return this.getGradient(env, args);
            case "setColumnName":
                return this.setColumnName(env, args);
            case "getColumnName":
                return this.getColumnName(env, args);
            case "setBuckets":
                return this.setBuckets(env, args);
            case "getBuckets":
                return this.getBuckets(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__gradientType":
                if (Google_StyleFunction.class.isAssignableFrom(caller)) {

                    return this.__gradientType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__gradientDataType":
                if (Google_StyleFunction.class.isAssignableFrom(caller)) {

                    return this.__gradientDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "gradient":
                return this.gradient;
            case "columnName":
                return this.columnName;
            case "__bucketsType":
                if (Google_StyleFunction.class.isAssignableFrom(caller)) {

                    return this.__bucketsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__bucketsDataType":
                if (Google_StyleFunction.class.isAssignableFrom(caller)) {

                    return this.__bucketsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "buckets":
                return this.buckets;
            case "kind":
                return this.kind;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__gradientType":
                if (Google_StyleFunction.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__gradientType);
                }
                break;
            case "__gradientDataType":
                if (Google_StyleFunction.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__gradientDataType);
                }
                break;
            case "gradient":
                return ZVal.isNull(this.gradient);
            case "columnName":
                return ZVal.isNull(this.columnName);
            case "__bucketsType":
                if (Google_StyleFunction.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__bucketsType);
                }
                break;
            case "__bucketsDataType":
                if (Google_StyleFunction.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__bucketsDataType);
                }
                break;
            case "buckets":
                return ZVal.isNull(this.buckets);
            case "kind":
                return ZVal.isNull(this.kind);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__gradientType":
                if (Google_StyleFunction.class.isAssignableFrom(caller)) {

                    this.__gradientType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__gradientDataType":
                if (Google_StyleFunction.class.isAssignableFrom(caller)) {

                    this.__gradientDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "gradient":
                this.gradient = value;
                break;
            case "columnName":
                this.columnName = value;
                break;
            case "__bucketsType":
                if (Google_StyleFunction.class.isAssignableFrom(caller)) {

                    this.__bucketsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__bucketsDataType":
                if (Google_StyleFunction.class.isAssignableFrom(caller)) {

                    this.__bucketsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "buckets":
                this.buckets = value;
                break;
            case "kind":
                this.kind = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setGradient(RuntimeEnv env, Object... args) {
        Object gradient = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_StyleFunction.class, "gradient", gradient);

        return null;
    }

    public Object getGradient(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_StyleFunction.class, "gradient"));
    }

    public Object setColumnName(RuntimeEnv env, Object... args) {
        Object columnName = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_StyleFunction.class, "columnName", columnName);

        return null;
    }

    public Object getColumnName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_StyleFunction.class, "columnName"));
    }

    public Object setBuckets(RuntimeEnv env, Object... args) {
        Object buckets = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_StyleFunction.class,
                buckets,
                "Google_Bucket",
                "setBuckets");
        ZVal.setProperty(this, Google_StyleFunction.class, "buckets", buckets);

        return null;
    }

    public Object getBuckets(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_StyleFunction.class, "buckets"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_StyleFunction.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_StyleFunction.class, "kind"));
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
