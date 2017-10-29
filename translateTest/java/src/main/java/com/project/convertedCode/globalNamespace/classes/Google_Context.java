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

 google-api-php-client/src/contrib/Google_CustomsearchService.php

*/

public class Google_Context extends Google_Model implements RuntimeFileContextInterface {

    public Object __facetsType = "Google_ContextFacets";

    public Object __facetsDataType = "array";

    public Object facets = null;

    public Object title = null;

    public Google_Context(RuntimeEnv env, Object... args) {
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
            case "setFacets":
                return this.setFacets(env, args);
            case "getFacets":
                return this.getFacets(env, args);
            case "setTitle":
                return this.setTitle(env, args);
            case "getTitle":
                return this.getTitle(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__facetsType":
                if (Google_Context.class.isAssignableFrom(caller)) {

                    return this.__facetsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__facetsDataType":
                if (Google_Context.class.isAssignableFrom(caller)) {

                    return this.__facetsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "facets":
                return this.facets;
            case "title":
                return this.title;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__facetsType":
                if (Google_Context.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__facetsType);
                }
                break;
            case "__facetsDataType":
                if (Google_Context.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__facetsDataType);
                }
                break;
            case "facets":
                return ZVal.isNull(this.facets);
            case "title":
                return ZVal.isNull(this.title);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__facetsType":
                if (Google_Context.class.isAssignableFrom(caller)) {

                    this.__facetsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__facetsDataType":
                if (Google_Context.class.isAssignableFrom(caller)) {

                    this.__facetsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "facets":
                this.facets = value;
                break;
            case "title":
                this.title = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setFacets(RuntimeEnv env, Object... args) {
        Object facets = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Context.class,
                facets,
                "Google_ContextFacets",
                "setFacets");
        ZVal.setProperty(this, Google_Context.class, "facets", facets);

        return null;
    }

    public Object getFacets(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Context.class, "facets"));
    }

    public Object setTitle(RuntimeEnv env, Object... args) {
        Object title = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Context.class, "title", title);

        return null;
    }

    public Object getTitle(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Context.class, "title"));
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
