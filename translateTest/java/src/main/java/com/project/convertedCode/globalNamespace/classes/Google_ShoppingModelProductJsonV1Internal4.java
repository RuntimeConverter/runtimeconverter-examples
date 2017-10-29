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

public class Google_ShoppingModelProductJsonV1Internal4 extends Google_Model
        implements RuntimeFileContextInterface {

    public Object node = null;

    public Object confidence = null;

    public Google_ShoppingModelProductJsonV1Internal4(RuntimeEnv env, Object... args) {
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
            case "setNode":
                return this.setNode(env, args);
            case "getNode":
                return this.getNode(env, args);
            case "setConfidence":
                return this.setConfidence(env, args);
            case "getConfidence":
                return this.getConfidence(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "node":
                return this.node;
            case "confidence":
                return this.confidence;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "node":
                return ZVal.isNull(this.node);
            case "confidence":
                return ZVal.isNull(this.confidence);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "node":
                this.node = value;
                break;
            case "confidence":
                this.confidence = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setNode(RuntimeEnv env, Object... args) {
        Object node = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ShoppingModelProductJsonV1Internal4.class, "node", node);

        return null;
    }

    public Object getNode(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelProductJsonV1Internal4.class, "node"));
    }

    public Object setConfidence(RuntimeEnv env, Object... args) {
        Object confidence = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_ShoppingModelProductJsonV1Internal4.class, "confidence", confidence);

        return null;
    }

    public Object getConfidence(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_ShoppingModelProductJsonV1Internal4.class, "confidence"));
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
