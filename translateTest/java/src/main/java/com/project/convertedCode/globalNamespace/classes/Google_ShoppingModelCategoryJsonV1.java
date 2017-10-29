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

public class Google_ShoppingModelCategoryJsonV1 extends Google_Model
        implements RuntimeFileContextInterface {

    public Object url = null;

    public Object shortName = null;

    public Object parents = null;

    public Object id = null;

    public Google_ShoppingModelCategoryJsonV1(RuntimeEnv env, Object... args) {
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
            case "setUrl":
                return this.setUrl(env, args);
            case "getUrl":
                return this.getUrl(env, args);
            case "setShortName":
                return this.setShortName(env, args);
            case "getShortName":
                return this.getShortName(env, args);
            case "setParents":
                return this.setParents(env, args);
            case "getParents":
                return this.getParents(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "url":
                return this.url;
            case "shortName":
                return this.shortName;
            case "parents":
                return this.parents;
            case "id":
                return this.id;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "url":
                return ZVal.isNull(this.url);
            case "shortName":
                return ZVal.isNull(this.shortName);
            case "parents":
                return ZVal.isNull(this.parents);
            case "id":
                return ZVal.isNull(this.id);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "url":
                this.url = value;
                break;
            case "shortName":
                this.shortName = value;
                break;
            case "parents":
                this.parents = value;
                break;
            case "id":
                this.id = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setUrl(RuntimeEnv env, Object... args) {
        Object url = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ShoppingModelCategoryJsonV1.class, "url", url);

        return null;
    }

    public Object getUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ShoppingModelCategoryJsonV1.class, "url"));
    }

    public Object setShortName(RuntimeEnv env, Object... args) {
        Object shortName = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ShoppingModelCategoryJsonV1.class, "shortName", shortName);

        return null;
    }

    public Object getShortName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelCategoryJsonV1.class, "shortName"));
    }

    public Object setParents(RuntimeEnv env, Object... args) {
        Object parents = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_ShoppingModelCategoryJsonV1.class,
                parents,
                "Google_string",
                "setParents");
        ZVal.setProperty(this, Google_ShoppingModelCategoryJsonV1.class, "parents", parents);

        return null;
    }

    public Object getParents(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelCategoryJsonV1.class, "parents"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ShoppingModelCategoryJsonV1.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ShoppingModelCategoryJsonV1.class, "id"));
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
