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

public class Google_ContextFacets extends Google_Model implements RuntimeFileContextInterface {

    public Object anchor = null;

    public Object label = null;

    public Google_ContextFacets(RuntimeEnv env, Object... args) {
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
            case "setAnchor":
                return this.setAnchor(env, args);
            case "getAnchor":
                return this.getAnchor(env, args);
            case "setLabel":
                return this.setLabel(env, args);
            case "getLabel":
                return this.getLabel(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "anchor":
                return this.anchor;
            case "label":
                return this.label;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "anchor":
                return ZVal.isNull(this.anchor);
            case "label":
                return ZVal.isNull(this.label);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "anchor":
                this.anchor = value;
                break;
            case "label":
                this.label = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setAnchor(RuntimeEnv env, Object... args) {
        Object anchor = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ContextFacets.class, "anchor", anchor);

        return null;
    }

    public Object getAnchor(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ContextFacets.class, "anchor"));
    }

    public Object setLabel(RuntimeEnv env, Object... args) {
        Object label = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ContextFacets.class, "label", label);

        return null;
    }

    public Object getLabel(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ContextFacets.class, "label"));
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
