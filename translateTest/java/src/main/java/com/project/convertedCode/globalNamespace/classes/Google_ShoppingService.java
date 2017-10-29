package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.classes.Google_ProductsServiceResource;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Google_Service;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_ShoppingService.php

*/

public class Google_ShoppingService extends Google_Service implements RuntimeFileContextInterface {

    public Object products = null;

    public Google_ShoppingService(RuntimeEnv env, Object... args) {
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
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "products":
                return this.products;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "products":
                return ZVal.isNull(this.products);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "products":
                this.products = value;
                break;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object client = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ShoppingService.class, "servicePath", "shopping/search/v1/");
        ZVal.setProperty(this, Google_ShoppingService.class, "version", "v1");
        ZVal.setProperty(this, Google_ShoppingService.class, "serviceName", "shopping");
        env.callMethod(
                client,
                "addService",
                Google_ShoppingService.class,
                ZVal.getProperty(this, Google_ShoppingService.class, "serviceName"),
                ZVal.getProperty(this, Google_ShoppingService.class, "version"));
        ZVal.setProperty(
                this,
                Google_ShoppingService.class,
                "products",
                new Google_ProductsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_ShoppingService.class, "serviceName"),
                        "products",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/shoppingapi\"], \"parameters\": {\"facets.include\": {\"type\": \"string\", \"location\": \"query\"}, \"plusOne.enabled\": {\"type\": \"boolean\", \"location\": \"query\"}, \"plusOne.useGcsConfig\": {\"type\": \"boolean\", \"location\": \"query\"}, \"facets.enabled\": {\"type\": \"boolean\", \"location\": \"query\"}, \"relatedQueries.useGcsConfig\": {\"type\": \"boolean\", \"location\": \"query\"}, \"promotions.enabled\": {\"type\": \"boolean\", \"location\": \"query\"}, \"channels\": {\"type\": \"string\", \"location\": \"query\"}, \"currency\": {\"type\": \"string\", \"location\": \"query\"}, \"startIndex\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"facets.discover\": {\"type\": \"string\", \"location\": \"query\"}, \"categoryRecommendations.category\": {\"type\": \"string\", \"location\": \"query\"}, \"availability\": {\"type\": \"string\", \"location\": \"query\"}, \"crowdBy\": {\"type\": \"string\", \"location\": \"query\"}, \"spelling.enabled\": {\"type\": \"boolean\", \"location\": \"query\"}, \"taxonomy\": {\"type\": \"string\", \"location\": \"query\"}, \"spelling.useGcsConfig\": {\"type\": \"boolean\", \"location\": \"query\"}, \"source\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"useCase\": {\"type\": \"string\", \"location\": \"query\"}, \"location\": {\"type\": \"string\", \"location\": \"query\"}, \"maxVariants\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"int32\"}, \"categories.include\": {\"type\": \"string\", \"location\": \"query\"}, \"boostBy\": {\"type\": \"string\", \"location\": \"query\"}, \"safe\": {\"type\": \"boolean\", \"location\": \"query\"}, \"categories.useGcsConfig\": {\"type\": \"boolean\", \"location\": \"query\"}, \"maxResults\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"facets.useGcsConfig\": {\"type\": \"boolean\", \"location\": \"query\"}, \"categories.enabled\": {\"type\": \"boolean\", \"location\": \"query\"}, \"plusOne.styles\": {\"type\": \"string\", \"location\": \"query\"}, \"attributeFilter\": {\"type\": \"string\", \"location\": \"query\"}, \"clickTracking\": {\"type\": \"boolean\", \"location\": \"query\"}, \"categoryRecommendations.enabled\": {\"type\": \"boolean\", \"location\": \"query\"}, \"thumbnails\": {\"type\": \"string\", \"location\": \"query\"}, \"language\": {\"type\": \"string\", \"location\": \"query\"}, \"categoryRecommendations.include\": {\"type\": \"string\", \"location\": \"query\"}, \"country\": {\"type\": \"string\", \"location\": \"query\"}, \"rankBy\": {\"type\": \"string\", \"location\": \"query\"}, \"restrictBy\": {\"type\": \"string\", \"location\": \"query\"}, \"q\": {\"type\": \"string\", \"location\": \"query\"}, \"redirects.enabled\": {\"type\": \"boolean\", \"location\": \"query\"}, \"redirects.useGcsConfig\": {\"type\": \"boolean\", \"location\": \"query\"}, \"relatedQueries.enabled\": {\"type\": \"boolean\", \"location\": \"query\"}, \"categoryRecommendations.useGcsConfig\": {\"type\": \"boolean\", \"location\": \"query\"}, \"promotions.useGcsConfig\": {\"type\": \"boolean\", \"location\": \"query\"}}, \"id\": \"shopping.products.list\", \"httpMethod\": \"GET\", \"path\": \"{source}/products\", \"response\": {\"$ref\": \"Products\"}}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/shoppingapi\"], \"parameters\": {\"categories.include\": {\"type\": \"string\", \"location\": \"query\"}, \"recommendations.enabled\": {\"type\": \"boolean\", \"location\": \"query\"}, \"thumbnails\": {\"type\": \"string\", \"location\": \"query\"}, \"plusOne.useGcsConfig\": {\"type\": \"boolean\", \"location\": \"query\"}, \"source\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"taxonomy\": {\"type\": \"string\", \"location\": \"query\"}, \"productIdType\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"categories.useGcsConfig\": {\"type\": \"boolean\", \"location\": \"query\"}, \"plusOne.styles\": {\"type\": \"string\", \"location\": \"query\"}, \"recommendations.include\": {\"type\": \"string\", \"location\": \"query\"}, \"categories.enabled\": {\"type\": \"boolean\", \"location\": \"query\"}, \"location\": {\"type\": \"string\", \"location\": \"query\"}, \"plusOne.enabled\": {\"type\": \"boolean\", \"location\": \"query\"}, \"attributeFilter\": {\"type\": \"string\", \"location\": \"query\"}, \"recommendations.useGcsConfig\": {\"type\": \"boolean\", \"location\": \"query\"}, \"productId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"accountId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"uint32\"}}, \"id\": \"shopping.products.get\", \"httpMethod\": \"GET\", \"path\": \"{source}/products/{accountId}/{productIdType}/{productId}\", \"response\": {\"$ref\": \"Product\"}}}}",
                                true)));

        return null;
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
