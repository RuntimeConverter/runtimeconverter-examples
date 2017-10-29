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

public class Google_Products extends Google_Model implements RuntimeFileContextInterface {

    public Object __promotionsType = "Google_ProductsPromotions";

    public Object __promotionsDataType = "array";

    public Object promotions = null;

    public Object selfLink = null;

    public Object kind = null;

    public Object __storesType = "Google_ProductsStores";

    public Object __storesDataType = "array";

    public Object stores = null;

    public Object currentItemCount = null;

    public Object __itemsType = "Google_Product";

    public Object __itemsDataType = "array";

    public Object items = null;

    public Object __facetsType = "Google_ProductsFacets";

    public Object __facetsDataType = "array";

    public Object facets = null;

    public Object itemsPerPage = null;

    public Object redirects = null;

    public Object nextLink = null;

    public Object relatedQueries = null;

    public Object totalItems = null;

    public Object startIndex = null;

    public Object etag = null;

    public Object requestId = null;

    public Object __categoryRecommendationsType = "Google_ShoppingModelRecommendationsJsonV1";

    public Object __categoryRecommendationsDataType = "array";

    public Object categoryRecommendations = null;

    public Object __debugType = "Google_ShoppingModelDebugJsonV1";

    public Object __debugDataType = "";

    public Object debug = null;

    public Object __spellingType = "Google_ProductsSpelling";

    public Object __spellingDataType = "";

    public Object spelling = null;

    public Object previousLink = null;

    public Object id = null;

    public Object __categoriesType = "Google_ShoppingModelCategoryJsonV1";

    public Object __categoriesDataType = "array";

    public Object categories = null;

    public Google_Products(RuntimeEnv env, Object... args) {
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
            case "setPromotions":
                return this.setPromotions(env, args);
            case "getPromotions":
                return this.getPromotions(env, args);
            case "setSelfLink":
                return this.setSelfLink(env, args);
            case "getSelfLink":
                return this.getSelfLink(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setStores":
                return this.setStores(env, args);
            case "getStores":
                return this.getStores(env, args);
            case "setCurrentItemCount":
                return this.setCurrentItemCount(env, args);
            case "getCurrentItemCount":
                return this.getCurrentItemCount(env, args);
            case "setItems":
                return this.setItems(env, args);
            case "getItems":
                return this.getItems(env, args);
            case "setFacets":
                return this.setFacets(env, args);
            case "getFacets":
                return this.getFacets(env, args);
            case "setItemsPerPage":
                return this.setItemsPerPage(env, args);
            case "getItemsPerPage":
                return this.getItemsPerPage(env, args);
            case "setRedirects":
                return this.setRedirects(env, args);
            case "getRedirects":
                return this.getRedirects(env, args);
            case "setNextLink":
                return this.setNextLink(env, args);
            case "getNextLink":
                return this.getNextLink(env, args);
            case "setRelatedQueries":
                return this.setRelatedQueries(env, args);
            case "getRelatedQueries":
                return this.getRelatedQueries(env, args);
            case "setTotalItems":
                return this.setTotalItems(env, args);
            case "getTotalItems":
                return this.getTotalItems(env, args);
            case "setStartIndex":
                return this.setStartIndex(env, args);
            case "getStartIndex":
                return this.getStartIndex(env, args);
            case "setEtag":
                return this.setEtag(env, args);
            case "getEtag":
                return this.getEtag(env, args);
            case "setRequestId":
                return this.setRequestId(env, args);
            case "getRequestId":
                return this.getRequestId(env, args);
            case "setCategoryRecommendations":
                return this.setCategoryRecommendations(env, args);
            case "getCategoryRecommendations":
                return this.getCategoryRecommendations(env, args);
            case "setDebug":
                return this.setDebug(env, args);
            case "getDebug":
                return this.getDebug(env, args);
            case "setSpelling":
                return this.setSpelling(env, args);
            case "getSpelling":
                return this.getSpelling(env, args);
            case "setPreviousLink":
                return this.setPreviousLink(env, args);
            case "getPreviousLink":
                return this.getPreviousLink(env, args);
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
            case "__promotionsType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    return this.__promotionsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__promotionsDataType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    return this.__promotionsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "promotions":
                return this.promotions;
            case "selfLink":
                return this.selfLink;
            case "kind":
                return this.kind;
            case "__storesType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    return this.__storesType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__storesDataType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    return this.__storesDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "stores":
                return this.stores;
            case "currentItemCount":
                return this.currentItemCount;
            case "__itemsType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    return this.__itemsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__itemsDataType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    return this.__itemsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "items":
                return this.items;
            case "__facetsType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    return this.__facetsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__facetsDataType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    return this.__facetsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "facets":
                return this.facets;
            case "itemsPerPage":
                return this.itemsPerPage;
            case "redirects":
                return this.redirects;
            case "nextLink":
                return this.nextLink;
            case "relatedQueries":
                return this.relatedQueries;
            case "totalItems":
                return this.totalItems;
            case "startIndex":
                return this.startIndex;
            case "etag":
                return this.etag;
            case "requestId":
                return this.requestId;
            case "__categoryRecommendationsType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    return this.__categoryRecommendationsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__categoryRecommendationsDataType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    return this.__categoryRecommendationsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "categoryRecommendations":
                return this.categoryRecommendations;
            case "__debugType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    return this.__debugType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__debugDataType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    return this.__debugDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "debug":
                return this.debug;
            case "__spellingType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    return this.__spellingType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__spellingDataType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    return this.__spellingDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "spelling":
                return this.spelling;
            case "previousLink":
                return this.previousLink;
            case "id":
                return this.id;
            case "__categoriesType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    return this.__categoriesType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__categoriesDataType":
                if (Google_Products.class.isAssignableFrom(caller)) {

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
            case "__promotionsType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__promotionsType);
                }
                break;
            case "__promotionsDataType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__promotionsDataType);
                }
                break;
            case "promotions":
                return ZVal.isNull(this.promotions);
            case "selfLink":
                return ZVal.isNull(this.selfLink);
            case "kind":
                return ZVal.isNull(this.kind);
            case "__storesType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__storesType);
                }
                break;
            case "__storesDataType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__storesDataType);
                }
                break;
            case "stores":
                return ZVal.isNull(this.stores);
            case "currentItemCount":
                return ZVal.isNull(this.currentItemCount);
            case "__itemsType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__itemsType);
                }
                break;
            case "__itemsDataType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__itemsDataType);
                }
                break;
            case "items":
                return ZVal.isNull(this.items);
            case "__facetsType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__facetsType);
                }
                break;
            case "__facetsDataType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__facetsDataType);
                }
                break;
            case "facets":
                return ZVal.isNull(this.facets);
            case "itemsPerPage":
                return ZVal.isNull(this.itemsPerPage);
            case "redirects":
                return ZVal.isNull(this.redirects);
            case "nextLink":
                return ZVal.isNull(this.nextLink);
            case "relatedQueries":
                return ZVal.isNull(this.relatedQueries);
            case "totalItems":
                return ZVal.isNull(this.totalItems);
            case "startIndex":
                return ZVal.isNull(this.startIndex);
            case "etag":
                return ZVal.isNull(this.etag);
            case "requestId":
                return ZVal.isNull(this.requestId);
            case "__categoryRecommendationsType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__categoryRecommendationsType);
                }
                break;
            case "__categoryRecommendationsDataType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__categoryRecommendationsDataType);
                }
                break;
            case "categoryRecommendations":
                return ZVal.isNull(this.categoryRecommendations);
            case "__debugType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__debugType);
                }
                break;
            case "__debugDataType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__debugDataType);
                }
                break;
            case "debug":
                return ZVal.isNull(this.debug);
            case "__spellingType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__spellingType);
                }
                break;
            case "__spellingDataType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__spellingDataType);
                }
                break;
            case "spelling":
                return ZVal.isNull(this.spelling);
            case "previousLink":
                return ZVal.isNull(this.previousLink);
            case "id":
                return ZVal.isNull(this.id);
            case "__categoriesType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__categoriesType);
                }
                break;
            case "__categoriesDataType":
                if (Google_Products.class.isAssignableFrom(caller)) {

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
            case "__promotionsType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    this.__promotionsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__promotionsDataType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    this.__promotionsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "promotions":
                this.promotions = value;
                break;
            case "selfLink":
                this.selfLink = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "__storesType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    this.__storesType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__storesDataType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    this.__storesDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "stores":
                this.stores = value;
                break;
            case "currentItemCount":
                this.currentItemCount = value;
                break;
            case "__itemsType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    this.__itemsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__itemsDataType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    this.__itemsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "items":
                this.items = value;
                break;
            case "__facetsType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    this.__facetsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__facetsDataType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    this.__facetsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "facets":
                this.facets = value;
                break;
            case "itemsPerPage":
                this.itemsPerPage = value;
                break;
            case "redirects":
                this.redirects = value;
                break;
            case "nextLink":
                this.nextLink = value;
                break;
            case "relatedQueries":
                this.relatedQueries = value;
                break;
            case "totalItems":
                this.totalItems = value;
                break;
            case "startIndex":
                this.startIndex = value;
                break;
            case "etag":
                this.etag = value;
                break;
            case "requestId":
                this.requestId = value;
                break;
            case "__categoryRecommendationsType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    this.__categoryRecommendationsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__categoryRecommendationsDataType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    this.__categoryRecommendationsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "categoryRecommendations":
                this.categoryRecommendations = value;
                break;
            case "__debugType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    this.__debugType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__debugDataType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    this.__debugDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "debug":
                this.debug = value;
                break;
            case "__spellingType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    this.__spellingType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__spellingDataType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    this.__spellingDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "spelling":
                this.spelling = value;
                break;
            case "previousLink":
                this.previousLink = value;
                break;
            case "id":
                this.id = value;
                break;
            case "__categoriesType":
                if (Google_Products.class.isAssignableFrom(caller)) {

                    this.__categoriesType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__categoriesDataType":
                if (Google_Products.class.isAssignableFrom(caller)) {

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

    public Object setPromotions(RuntimeEnv env, Object... args) {
        Object promotions = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Products.class,
                promotions,
                "Google_ProductsPromotions",
                "setPromotions");
        ZVal.setProperty(this, Google_Products.class, "promotions", promotions);

        return null;
    }

    public Object getPromotions(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Products.class, "promotions"));
    }

    public Object setSelfLink(RuntimeEnv env, Object... args) {
        Object selfLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Products.class, "selfLink", selfLink);

        return null;
    }

    public Object getSelfLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Products.class, "selfLink"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Products.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Products.class, "kind"));
    }

    public Object setStores(RuntimeEnv env, Object... args) {
        Object stores = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Products.class,
                stores,
                "Google_ProductsStores",
                "setStores");
        ZVal.setProperty(this, Google_Products.class, "stores", stores);

        return null;
    }

    public Object getStores(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Products.class, "stores"));
    }

    public Object setCurrentItemCount(RuntimeEnv env, Object... args) {
        Object currentItemCount = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Products.class, "currentItemCount", currentItemCount);

        return null;
    }

    public Object getCurrentItemCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Products.class, "currentItemCount"));
    }

    public Object setItems(RuntimeEnv env, Object... args) {
        Object items = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this, "assertIsArray", Google_Products.class, items, "Google_Product", "setItems");
        ZVal.setProperty(this, Google_Products.class, "items", items);

        return null;
    }

    public Object getItems(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Products.class, "items"));
    }

    public Object setFacets(RuntimeEnv env, Object... args) {
        Object facets = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Products.class,
                facets,
                "Google_ProductsFacets",
                "setFacets");
        ZVal.setProperty(this, Google_Products.class, "facets", facets);

        return null;
    }

    public Object getFacets(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Products.class, "facets"));
    }

    public Object setItemsPerPage(RuntimeEnv env, Object... args) {
        Object itemsPerPage = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Products.class, "itemsPerPage", itemsPerPage);

        return null;
    }

    public Object getItemsPerPage(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Products.class, "itemsPerPage"));
    }

    public Object setRedirects(RuntimeEnv env, Object... args) {
        Object redirects = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Products.class,
                redirects,
                "Google_string",
                "setRedirects");
        ZVal.setProperty(this, Google_Products.class, "redirects", redirects);

        return null;
    }

    public Object getRedirects(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Products.class, "redirects"));
    }

    public Object setNextLink(RuntimeEnv env, Object... args) {
        Object nextLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Products.class, "nextLink", nextLink);

        return null;
    }

    public Object getNextLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Products.class, "nextLink"));
    }

    public Object setRelatedQueries(RuntimeEnv env, Object... args) {
        Object relatedQueries = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Products.class,
                relatedQueries,
                "Google_string",
                "setRelatedQueries");
        ZVal.setProperty(this, Google_Products.class, "relatedQueries", relatedQueries);

        return null;
    }

    public Object getRelatedQueries(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Products.class, "relatedQueries"));
    }

    public Object setTotalItems(RuntimeEnv env, Object... args) {
        Object totalItems = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Products.class, "totalItems", totalItems);

        return null;
    }

    public Object getTotalItems(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Products.class, "totalItems"));
    }

    public Object setStartIndex(RuntimeEnv env, Object... args) {
        Object startIndex = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Products.class, "startIndex", startIndex);

        return null;
    }

    public Object getStartIndex(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Products.class, "startIndex"));
    }

    public Object setEtag(RuntimeEnv env, Object... args) {
        Object etag = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Products.class, "etag", etag);

        return null;
    }

    public Object getEtag(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Products.class, "etag"));
    }

    public Object setRequestId(RuntimeEnv env, Object... args) {
        Object requestId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Products.class, "requestId", requestId);

        return null;
    }

    public Object getRequestId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Products.class, "requestId"));
    }

    public Object setCategoryRecommendations(RuntimeEnv env, Object... args) {
        Object categoryRecommendations = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Products.class,
                categoryRecommendations,
                "Google_ShoppingModelRecommendationsJsonV1",
                "setCategoryRecommendations");
        ZVal.setProperty(
                this, Google_Products.class, "categoryRecommendations", categoryRecommendations);

        return null;
    }

    public Object getCategoryRecommendations(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_Products.class, "categoryRecommendations"));
    }

    public Object setDebug(RuntimeEnv env, Object... args) {
        Object debug = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Products.class, "debug", debug);

        return null;
    }

    public Object getDebug(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Products.class, "debug"));
    }

    public Object setSpelling(RuntimeEnv env, Object... args) {
        Object spelling = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Products.class, "spelling", spelling);

        return null;
    }

    public Object getSpelling(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Products.class, "spelling"));
    }

    public Object setPreviousLink(RuntimeEnv env, Object... args) {
        Object previousLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Products.class, "previousLink", previousLink);

        return null;
    }

    public Object getPreviousLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Products.class, "previousLink"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Products.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Products.class, "id"));
    }

    public Object setCategories(RuntimeEnv env, Object... args) {
        Object categories = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Products.class,
                categories,
                "Google_ShoppingModelCategoryJsonV1",
                "setCategories");
        ZVal.setProperty(this, Google_Products.class, "categories", categories);

        return null;
    }

    public Object getCategories(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Products.class, "categories"));
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
