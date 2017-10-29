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

public class Google_ShoppingModelRecommendationsJsonV1RecommendationList extends Google_Model
        implements RuntimeFileContextInterface {

    public Object __productType = "Google_ShoppingModelProductJsonV1";

    public Object __productDataType = "";

    public Object product = null;

    public Google_ShoppingModelRecommendationsJsonV1RecommendationList(
            RuntimeEnv env, Object... args) {
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
            case "setProduct":
                return this.setProduct(env, args);
            case "getProduct":
                return this.getProduct(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__productType":
                if (Google_ShoppingModelRecommendationsJsonV1RecommendationList.class
                        .isAssignableFrom(caller)) {

                    return this.__productType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__productDataType":
                if (Google_ShoppingModelRecommendationsJsonV1RecommendationList.class
                        .isAssignableFrom(caller)) {

                    return this.__productDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "product":
                return this.product;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__productType":
                if (Google_ShoppingModelRecommendationsJsonV1RecommendationList.class
                        .isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__productType);
                }
                break;
            case "__productDataType":
                if (Google_ShoppingModelRecommendationsJsonV1RecommendationList.class
                        .isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__productDataType);
                }
                break;
            case "product":
                return ZVal.isNull(this.product);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__productType":
                if (Google_ShoppingModelRecommendationsJsonV1RecommendationList.class
                        .isAssignableFrom(caller)) {

                    this.__productType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__productDataType":
                if (Google_ShoppingModelRecommendationsJsonV1RecommendationList.class
                        .isAssignableFrom(caller)) {

                    this.__productDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "product":
                this.product = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setProduct(RuntimeEnv env, Object... args) {
        Object product = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_ShoppingModelRecommendationsJsonV1RecommendationList.class,
                "product",
                product);

        return null;
    }

    public Object getProduct(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this,
                        Google_ShoppingModelRecommendationsJsonV1RecommendationList.class,
                        "product"));
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
