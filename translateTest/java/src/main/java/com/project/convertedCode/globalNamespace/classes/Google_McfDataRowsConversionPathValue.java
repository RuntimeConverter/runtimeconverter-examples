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

public class Google_McfDataRowsConversionPathValue extends Google_Model
        implements RuntimeFileContextInterface {

    public Object nodeValue = null;

    public Object interactionType = null;

    public Google_McfDataRowsConversionPathValue(RuntimeEnv env, Object... args) {
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
            case "setNodeValue":
                return this.setNodeValue(env, args);
            case "getNodeValue":
                return this.getNodeValue(env, args);
            case "setInteractionType":
                return this.setInteractionType(env, args);
            case "getInteractionType":
                return this.getInteractionType(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "nodeValue":
                return this.nodeValue;
            case "interactionType":
                return this.interactionType;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "nodeValue":
                return ZVal.isNull(this.nodeValue);
            case "interactionType":
                return ZVal.isNull(this.interactionType);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "nodeValue":
                this.nodeValue = value;
                break;
            case "interactionType":
                this.interactionType = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setNodeValue(RuntimeEnv env, Object... args) {
        Object nodeValue = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_McfDataRowsConversionPathValue.class, "nodeValue", nodeValue);

        return null;
    }

    public Object getNodeValue(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_McfDataRowsConversionPathValue.class, "nodeValue"));
    }

    public Object setInteractionType(RuntimeEnv env, Object... args) {
        Object interactionType = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_McfDataRowsConversionPathValue.class,
                "interactionType",
                interactionType);

        return null;
    }

    public Object getInteractionType(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_McfDataRowsConversionPathValue.class, "interactionType"));
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
