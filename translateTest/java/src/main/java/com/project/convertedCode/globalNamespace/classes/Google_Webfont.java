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

 google-api-php-client/src/contrib/Google_WebfontsService.php

*/

public class Google_Webfont extends Google_Model implements RuntimeFileContextInterface {

    public Object kind = null;

    public Object variants = null;

    public Object subsets = null;

    public Object family = null;

    public Google_Webfont(RuntimeEnv env, Object... args) {
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
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setVariants":
                return this.setVariants(env, args);
            case "getVariants":
                return this.getVariants(env, args);
            case "setSubsets":
                return this.setSubsets(env, args);
            case "getSubsets":
                return this.getSubsets(env, args);
            case "setFamily":
                return this.setFamily(env, args);
            case "getFamily":
                return this.getFamily(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return this.kind;
            case "variants":
                return this.variants;
            case "subsets":
                return this.subsets;
            case "family":
                return this.family;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return ZVal.isNull(this.kind);
            case "variants":
                return ZVal.isNull(this.variants);
            case "subsets":
                return ZVal.isNull(this.subsets);
            case "family":
                return ZVal.isNull(this.family);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                this.kind = value;
                break;
            case "variants":
                this.variants = value;
                break;
            case "subsets":
                this.subsets = value;
                break;
            case "family":
                this.family = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Webfont.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Webfont.class, "kind"));
    }

    public Object setVariants(RuntimeEnv env, Object... args) {
        Object variants = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Webfont.class, "variants", variants);

        return null;
    }

    public Object getVariants(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Webfont.class, "variants"));
    }

    public Object setSubsets(RuntimeEnv env, Object... args) {
        Object subsets = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Webfont.class, "subsets", subsets);

        return null;
    }

    public Object getSubsets(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Webfont.class, "subsets"));
    }

    public Object setFamily(RuntimeEnv env, Object... args) {
        Object family = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Webfont.class, "family", family);

        return null;
    }

    public Object getFamily(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Webfont.class, "family"));
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
