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

public class Google_ShoppingModelProductJsonV1Variants extends Google_Model
        implements RuntimeFileContextInterface {

    public Object __variantType = "Google_ShoppingModelProductJsonV1";

    public Object __variantDataType = "";

    public Object variant = null;

    public Google_ShoppingModelProductJsonV1Variants(RuntimeEnv env, Object... args) {
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
            case "setVariant":
                return this.setVariant(env, args);
            case "getVariant":
                return this.getVariant(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__variantType":
                if (Google_ShoppingModelProductJsonV1Variants.class.isAssignableFrom(caller)) {

                    return this.__variantType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__variantDataType":
                if (Google_ShoppingModelProductJsonV1Variants.class.isAssignableFrom(caller)) {

                    return this.__variantDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "variant":
                return this.variant;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__variantType":
                if (Google_ShoppingModelProductJsonV1Variants.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__variantType);
                }
                break;
            case "__variantDataType":
                if (Google_ShoppingModelProductJsonV1Variants.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__variantDataType);
                }
                break;
            case "variant":
                return ZVal.isNull(this.variant);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__variantType":
                if (Google_ShoppingModelProductJsonV1Variants.class.isAssignableFrom(caller)) {

                    this.__variantType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__variantDataType":
                if (Google_ShoppingModelProductJsonV1Variants.class.isAssignableFrom(caller)) {

                    this.__variantDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "variant":
                this.variant = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setVariant(RuntimeEnv env, Object... args) {
        Object variant = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ShoppingModelProductJsonV1Variants.class, "variant", variant);

        return null;
    }

    public Object getVariant(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelProductJsonV1Variants.class, "variant"));
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
