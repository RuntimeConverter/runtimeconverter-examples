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

public class Google_ShoppingModelRecommendationsJsonV1 extends Google_Model
        implements RuntimeFileContextInterface {

    public Object __recommendationListType =
            "Google_ShoppingModelRecommendationsJsonV1RecommendationList";

    public Object __recommendationListDataType = "array";

    public Object recommendationList = null;

    public Object type = null;

    public Google_ShoppingModelRecommendationsJsonV1(RuntimeEnv env, Object... args) {
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
            case "setRecommendationList":
                return this.setRecommendationList(env, args);
            case "getRecommendationList":
                return this.getRecommendationList(env, args);
            case "setType":
                return this.setType(env, args);
            case "getType":
                return this.getType(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__recommendationListType":
                if (Google_ShoppingModelRecommendationsJsonV1.class.isAssignableFrom(caller)) {

                    return this.__recommendationListType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__recommendationListDataType":
                if (Google_ShoppingModelRecommendationsJsonV1.class.isAssignableFrom(caller)) {

                    return this.__recommendationListDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "recommendationList":
                return this.recommendationList;
            case "type":
                return this.type;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__recommendationListType":
                if (Google_ShoppingModelRecommendationsJsonV1.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__recommendationListType);
                }
                break;
            case "__recommendationListDataType":
                if (Google_ShoppingModelRecommendationsJsonV1.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__recommendationListDataType);
                }
                break;
            case "recommendationList":
                return ZVal.isNull(this.recommendationList);
            case "type":
                return ZVal.isNull(this.type);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__recommendationListType":
                if (Google_ShoppingModelRecommendationsJsonV1.class.isAssignableFrom(caller)) {

                    this.__recommendationListType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__recommendationListDataType":
                if (Google_ShoppingModelRecommendationsJsonV1.class.isAssignableFrom(caller)) {

                    this.__recommendationListDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "recommendationList":
                this.recommendationList = value;
                break;
            case "type":
                this.type = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setRecommendationList(RuntimeEnv env, Object... args) {
        Object recommendationList = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_ShoppingModelRecommendationsJsonV1.class,
                recommendationList,
                "Google_ShoppingModelRecommendationsJsonV1RecommendationList",
                "setRecommendationList");
        ZVal.setProperty(
                this,
                Google_ShoppingModelRecommendationsJsonV1.class,
                "recommendationList",
                recommendationList);

        return null;
    }

    public Object getRecommendationList(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this,
                        Google_ShoppingModelRecommendationsJsonV1.class,
                        "recommendationList"));
    }

    public Object setType(RuntimeEnv env, Object... args) {
        Object type = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ShoppingModelRecommendationsJsonV1.class, "type", type);

        return null;
    }

    public Object getType(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelRecommendationsJsonV1.class, "type"));
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
