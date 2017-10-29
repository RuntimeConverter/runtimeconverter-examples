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

 google-api-php-client/src/contrib/Google_ShoppingService.php

*/

public class Google_ProductsFacetsBuckets extends Google_Model
        implements RuntimeFileContextInterface {

    public Object count = null;

    public Object minExclusive = null;

    public Object min = null;

    public Object max = null;

    public Object value = null;

    public Object maxExclusive = null;

    public Google_ProductsFacetsBuckets(RuntimeEnv env, Object... args) {
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
            case "setCount":
                return this.setCount(env, args);
            case "getCount":
                return this.getCount(env, args);
            case "setMinExclusive":
                return this.setMinExclusive(env, args);
            case "getMinExclusive":
                return this.getMinExclusive(env, args);
            case "setMin":
                return this.setMin(env, args);
            case "getMin":
                return this.getMin(env, args);
            case "setMax":
                return this.setMax(env, args);
            case "getMax":
                return this.getMax(env, args);
            case "setValue":
                return this.setValue(env, args);
            case "getValue":
                return this.getValue(env, args);
            case "setMaxExclusive":
                return this.setMaxExclusive(env, args);
            case "getMaxExclusive":
                return this.getMaxExclusive(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "count":
                return this.count;
            case "minExclusive":
                return this.minExclusive;
            case "min":
                return this.min;
            case "max":
                return this.max;
            case "value":
                return this.value;
            case "maxExclusive":
                return this.maxExclusive;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "count":
                return ZVal.isNull(this.count);
            case "minExclusive":
                return ZVal.isNull(this.minExclusive);
            case "min":
                return ZVal.isNull(this.min);
            case "max":
                return ZVal.isNull(this.max);
            case "value":
                return ZVal.isNull(this.value);
            case "maxExclusive":
                return ZVal.isNull(this.maxExclusive);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "count":
                this.count = value;
                break;
            case "minExclusive":
                this.minExclusive = value;
                break;
            case "min":
                this.min = value;
                break;
            case "max":
                this.max = value;
                break;
            case "value":
                this.value = value;
                break;
            case "maxExclusive":
                this.maxExclusive = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setCount(RuntimeEnv env, Object... args) {
        Object count = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ProductsFacetsBuckets.class, "count", count);

        return null;
    }

    public Object getCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ProductsFacetsBuckets.class, "count"));
    }

    public Object setMinExclusive(RuntimeEnv env, Object... args) {
        Object minExclusive = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ProductsFacetsBuckets.class, "minExclusive", minExclusive);

        return null;
    }

    public Object getMinExclusive(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ProductsFacetsBuckets.class, "minExclusive"));
    }

    public Object setMin(RuntimeEnv env, Object... args) {
        Object min = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ProductsFacetsBuckets.class, "min", min);

        return null;
    }

    public Object getMin(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ProductsFacetsBuckets.class, "min"));
    }

    public Object setMax(RuntimeEnv env, Object... args) {
        Object max = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ProductsFacetsBuckets.class, "max", max);

        return null;
    }

    public Object getMax(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ProductsFacetsBuckets.class, "max"));
    }

    public Object setValue(RuntimeEnv env, Object... args) {
        Object value = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ProductsFacetsBuckets.class, "value", value);

        return null;
    }

    public Object getValue(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ProductsFacetsBuckets.class, "value"));
    }

    public Object setMaxExclusive(RuntimeEnv env, Object... args) {
        Object maxExclusive = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ProductsFacetsBuckets.class, "maxExclusive", maxExclusive);

        return null;
    }

    public Object getMaxExclusive(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ProductsFacetsBuckets.class, "maxExclusive"));
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
