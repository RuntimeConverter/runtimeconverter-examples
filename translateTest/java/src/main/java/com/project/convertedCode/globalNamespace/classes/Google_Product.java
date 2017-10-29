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

public class Google_Product extends Google_Model implements RuntimeFileContextInterface {

    public Object selfLink = null;

    public Object kind = null;

    public Object __productType = "Google_ShoppingModelProductJsonV1";

    public Object __productDataType = "";

    public Object product = null;

    public Object requestId = null;

    public Object __recommendationsType = "Google_ShoppingModelRecommendationsJsonV1";

    public Object __recommendationsDataType = "array";

    public Object recommendations = null;

    public Object __debugType = "Google_ShoppingModelDebugJsonV1";

    public Object __debugDataType = "";

    public Object debug = null;

    public Object id = null;

    public Object __categoriesType = "Google_ShoppingModelCategoryJsonV1";

    public Object __categoriesDataType = "array";

    public Object categories = null;

    public Google_Product(RuntimeEnv env, Object... args) {
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
            case "setSelfLink":
                return this.setSelfLink(env, args);
            case "getSelfLink":
                return this.getSelfLink(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setProduct":
                return this.setProduct(env, args);
            case "getProduct":
                return this.getProduct(env, args);
            case "setRequestId":
                return this.setRequestId(env, args);
            case "getRequestId":
                return this.getRequestId(env, args);
            case "setRecommendations":
                return this.setRecommendations(env, args);
            case "getRecommendations":
                return this.getRecommendations(env, args);
            case "setDebug":
                return this.setDebug(env, args);
            case "getDebug":
                return this.getDebug(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setCategories":
                return this.setCategories(env, args);
            case "getCategories":
                return this.getCategories(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "selfLink":
                return this.selfLink;
            case "kind":
                return this.kind;
            case "__productType":
                if (Google_Product.class.isAssignableFrom(caller)) {

                    return this.__productType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__productDataType":
                if (Google_Product.class.isAssignableFrom(caller)) {

                    return this.__productDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "product":
                return this.product;
            case "requestId":
                return this.requestId;
            case "__recommendationsType":
                if (Google_Product.class.isAssignableFrom(caller)) {

                    return this.__recommendationsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__recommendationsDataType":
                if (Google_Product.class.isAssignableFrom(caller)) {

                    return this.__recommendationsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "recommendations":
                return this.recommendations;
            case "__debugType":
                if (Google_Product.class.isAssignableFrom(caller)) {

                    return this.__debugType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__debugDataType":
                if (Google_Product.class.isAssignableFrom(caller)) {

                    return this.__debugDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "debug":
                return this.debug;
            case "id":
                return this.id;
            case "__categoriesType":
                if (Google_Product.class.isAssignableFrom(caller)) {

                    return this.__categoriesType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__categoriesDataType":
                if (Google_Product.class.isAssignableFrom(caller)) {

                    return this.__categoriesDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "categories":
                return this.categories;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "selfLink":
                return ZVal.isNull(this.selfLink);
            case "kind":
                return ZVal.isNull(this.kind);
            case "__productType":
                if (Google_Product.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__productType);
                }
                break;
            case "__productDataType":
                if (Google_Product.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__productDataType);
                }
                break;
            case "product":
                return ZVal.isNull(this.product);
            case "requestId":
                return ZVal.isNull(this.requestId);
            case "__recommendationsType":
                if (Google_Product.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__recommendationsType);
                }
                break;
            case "__recommendationsDataType":
                if (Google_Product.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__recommendationsDataType);
                }
                break;
            case "recommendations":
                return ZVal.isNull(this.recommendations);
            case "__debugType":
                if (Google_Product.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__debugType);
                }
                break;
            case "__debugDataType":
                if (Google_Product.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__debugDataType);
                }
                break;
            case "debug":
                return ZVal.isNull(this.debug);
            case "id":
                return ZVal.isNull(this.id);
            case "__categoriesType":
                if (Google_Product.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__categoriesType);
                }
                break;
            case "__categoriesDataType":
                if (Google_Product.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__categoriesDataType);
                }
                break;
            case "categories":
                return ZVal.isNull(this.categories);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "selfLink":
                this.selfLink = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "__productType":
                if (Google_Product.class.isAssignableFrom(caller)) {

                    this.__productType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__productDataType":
                if (Google_Product.class.isAssignableFrom(caller)) {

                    this.__productDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "product":
                this.product = value;
                break;
            case "requestId":
                this.requestId = value;
                break;
            case "__recommendationsType":
                if (Google_Product.class.isAssignableFrom(caller)) {

                    this.__recommendationsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__recommendationsDataType":
                if (Google_Product.class.isAssignableFrom(caller)) {

                    this.__recommendationsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "recommendations":
                this.recommendations = value;
                break;
            case "__debugType":
                if (Google_Product.class.isAssignableFrom(caller)) {

                    this.__debugType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__debugDataType":
                if (Google_Product.class.isAssignableFrom(caller)) {

                    this.__debugDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "debug":
                this.debug = value;
                break;
            case "id":
                this.id = value;
                break;
            case "__categoriesType":
                if (Google_Product.class.isAssignableFrom(caller)) {

                    this.__categoriesType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__categoriesDataType":
                if (Google_Product.class.isAssignableFrom(caller)) {

                    this.__categoriesDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "categories":
                this.categories = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setSelfLink(RuntimeEnv env, Object... args) {
        Object selfLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Product.class, "selfLink", selfLink);

        return null;
    }

    public Object getSelfLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Product.class, "selfLink"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Product.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Product.class, "kind"));
    }

    public Object setProduct(RuntimeEnv env, Object... args) {
        Object product = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Product.class, "product", product);

        return null;
    }

    public Object getProduct(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Product.class, "product"));
    }

    public Object setRequestId(RuntimeEnv env, Object... args) {
        Object requestId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Product.class, "requestId", requestId);

        return null;
    }

    public Object getRequestId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Product.class, "requestId"));
    }

    public Object setRecommendations(RuntimeEnv env, Object... args) {
        Object recommendations = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Product.class,
                recommendations,
                "Google_ShoppingModelRecommendationsJsonV1",
                "setRecommendations");
        ZVal.setProperty(this, Google_Product.class, "recommendations", recommendations);

        return null;
    }

    public Object getRecommendations(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Product.class, "recommendations"));
    }

    public Object setDebug(RuntimeEnv env, Object... args) {
        Object debug = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Product.class, "debug", debug);

        return null;
    }

    public Object getDebug(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Product.class, "debug"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Product.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Product.class, "id"));
    }

    public Object setCategories(RuntimeEnv env, Object... args) {
        Object categories = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Product.class,
                categories,
                "Google_ShoppingModelCategoryJsonV1",
                "setCategories");
        ZVal.setProperty(this, Google_Product.class, "categories", categories);

        return null;
    }

    public Object getCategories(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Product.class, "categories"));
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
