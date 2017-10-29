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

public class Google_ProductsFacets extends Google_Model implements RuntimeFileContextInterface {

    public Object count = null;

    public Object displayName = null;

    public Object name = null;

    public Object __bucketsType = "Google_ProductsFacetsBuckets";

    public Object __bucketsDataType = "array";

    public Object buckets = null;

    public Object property = null;

    public Object type = null;

    public Object unit = null;

    public Google_ProductsFacets(RuntimeEnv env, Object... args) {
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
            case "setDisplayName":
                return this.setDisplayName(env, args);
            case "getDisplayName":
                return this.getDisplayName(env, args);
            case "setName":
                return this.setName(env, args);
            case "getName":
                return this.getName(env, args);
            case "setBuckets":
                return this.setBuckets(env, args);
            case "getBuckets":
                return this.getBuckets(env, args);
            case "setProperty":
                return this.setProperty(env, args);
            case "getProperty":
                return this.getProperty(env, args);
            case "setType":
                return this.setType(env, args);
            case "getType":
                return this.getType(env, args);
            case "setUnit":
                return this.setUnit(env, args);
            case "getUnit":
                return this.getUnit(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "count":
                return this.count;
            case "displayName":
                return this.displayName;
            case "name":
                return this.name;
            case "__bucketsType":
                if (Google_ProductsFacets.class.isAssignableFrom(caller)) {

                    return this.__bucketsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__bucketsDataType":
                if (Google_ProductsFacets.class.isAssignableFrom(caller)) {

                    return this.__bucketsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "buckets":
                return this.buckets;
            case "property":
                return this.property;
            case "type":
                return this.type;
            case "unit":
                return this.unit;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "count":
                return ZVal.isNull(this.count);
            case "displayName":
                return ZVal.isNull(this.displayName);
            case "name":
                return ZVal.isNull(this.name);
            case "__bucketsType":
                if (Google_ProductsFacets.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__bucketsType);
                }
                break;
            case "__bucketsDataType":
                if (Google_ProductsFacets.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__bucketsDataType);
                }
                break;
            case "buckets":
                return ZVal.isNull(this.buckets);
            case "property":
                return ZVal.isNull(this.property);
            case "type":
                return ZVal.isNull(this.type);
            case "unit":
                return ZVal.isNull(this.unit);
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
            case "displayName":
                this.displayName = value;
                break;
            case "name":
                this.name = value;
                break;
            case "__bucketsType":
                if (Google_ProductsFacets.class.isAssignableFrom(caller)) {

                    this.__bucketsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__bucketsDataType":
                if (Google_ProductsFacets.class.isAssignableFrom(caller)) {

                    this.__bucketsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "buckets":
                this.buckets = value;
                break;
            case "property":
                this.property = value;
                break;
            case "type":
                this.type = value;
                break;
            case "unit":
                this.unit = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setCount(RuntimeEnv env, Object... args) {
        Object count = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ProductsFacets.class, "count", count);

        return null;
    }

    public Object getCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ProductsFacets.class, "count"));
    }

    public Object setDisplayName(RuntimeEnv env, Object... args) {
        Object displayName = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ProductsFacets.class, "displayName", displayName);

        return null;
    }

    public Object getDisplayName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ProductsFacets.class, "displayName"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ProductsFacets.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ProductsFacets.class, "name"));
    }

    public Object setBuckets(RuntimeEnv env, Object... args) {
        Object buckets = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_ProductsFacets.class,
                buckets,
                "Google_ProductsFacetsBuckets",
                "setBuckets");
        ZVal.setProperty(this, Google_ProductsFacets.class, "buckets", buckets);

        return null;
    }

    public Object getBuckets(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ProductsFacets.class, "buckets"));
    }

    public Object setProperty(RuntimeEnv env, Object... args) {
        Object property = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ProductsFacets.class, "property", property);

        return null;
    }

    public Object getProperty(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ProductsFacets.class, "property"));
    }

    public Object setType(RuntimeEnv env, Object... args) {
        Object type = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ProductsFacets.class, "type", type);

        return null;
    }

    public Object getType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ProductsFacets.class, "type"));
    }

    public Object setUnit(RuntimeEnv env, Object... args) {
        Object unit = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ProductsFacets.class, "unit", unit);

        return null;
    }

    public Object getUnit(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ProductsFacets.class, "unit"));
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
