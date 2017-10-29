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

public class Google_ShoppingModelProductJsonV1 extends Google_Model
        implements RuntimeFileContextInterface {

    public Object queryMatched = null;

    public Object gtin = null;

    public Object __imagesType = "Google_ShoppingModelProductJsonV1Images";

    public Object __imagesDataType = "array";

    public Object images = null;

    public Object __inventoriesType = "Google_ShoppingModelProductJsonV1Inventories";

    public Object __inventoriesDataType = "array";

    public Object inventories = null;

    public Object __authorType = "Google_ShoppingModelProductJsonV1Author";

    public Object __authorDataType = "";

    public Object author = null;

    public Object score = null;

    public Object condition = null;

    public Object providedId = null;

    public Object internal8 = null;

    public Object description = null;

    public Object gtins = null;

    public Object internal1 = null;

    public Object brand = null;

    public Object internal3 = null;

    public Object __internal4Type = "Google_ShoppingModelProductJsonV1Internal4";

    public Object __internal4DataType = "array";

    public Object internal4 = null;

    public Object internal6 = null;

    public Object internal7 = null;

    public Object link = null;

    public Object mpns = null;

    public Object __attributesType = "Google_ShoppingModelProductJsonV1Attributes";

    public Object __attributesDataType = "array";

    public Object attributes = null;

    public Object totalMatchingVariants = null;

    public Object __variantsType = "Google_ShoppingModelProductJsonV1Variants";

    public Object __variantsDataType = "array";

    public Object variants = null;

    public Object modificationTime = null;

    public Object categories = null;

    public Object language = null;

    public Object country = null;

    public Object title = null;

    public Object creationTime = null;

    public Object internal14 = null;

    public Object internal12 = null;

    public Object internal13 = null;

    public Object internal10 = null;

    public Object plusOne = null;

    public Object googleId = null;

    public Object internal15 = null;

    public Google_ShoppingModelProductJsonV1(RuntimeEnv env, Object... args) {
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
            case "setQueryMatched":
                return this.setQueryMatched(env, args);
            case "getQueryMatched":
                return this.getQueryMatched(env, args);
            case "setGtin":
                return this.setGtin(env, args);
            case "getGtin":
                return this.getGtin(env, args);
            case "setImages":
                return this.setImages(env, args);
            case "getImages":
                return this.getImages(env, args);
            case "setInventories":
                return this.setInventories(env, args);
            case "getInventories":
                return this.getInventories(env, args);
            case "setAuthor":
                return this.setAuthor(env, args);
            case "getAuthor":
                return this.getAuthor(env, args);
            case "setScore":
                return this.setScore(env, args);
            case "getScore":
                return this.getScore(env, args);
            case "setCondition":
                return this.setCondition(env, args);
            case "getCondition":
                return this.getCondition(env, args);
            case "setProvidedId":
                return this.setProvidedId(env, args);
            case "getProvidedId":
                return this.getProvidedId(env, args);
            case "setInternal8":
                return this.setInternal8(env, args);
            case "getInternal8":
                return this.getInternal8(env, args);
            case "setDescription":
                return this.setDescription(env, args);
            case "getDescription":
                return this.getDescription(env, args);
            case "setGtins":
                return this.setGtins(env, args);
            case "getGtins":
                return this.getGtins(env, args);
            case "setInternal1":
                return this.setInternal1(env, args);
            case "getInternal1":
                return this.getInternal1(env, args);
            case "setBrand":
                return this.setBrand(env, args);
            case "getBrand":
                return this.getBrand(env, args);
            case "setInternal3":
                return this.setInternal3(env, args);
            case "getInternal3":
                return this.getInternal3(env, args);
            case "setInternal4":
                return this.setInternal4(env, args);
            case "getInternal4":
                return this.getInternal4(env, args);
            case "setInternal6":
                return this.setInternal6(env, args);
            case "getInternal6":
                return this.getInternal6(env, args);
            case "setInternal7":
                return this.setInternal7(env, args);
            case "getInternal7":
                return this.getInternal7(env, args);
            case "setLink":
                return this.setLink(env, args);
            case "getLink":
                return this.getLink(env, args);
            case "setMpns":
                return this.setMpns(env, args);
            case "getMpns":
                return this.getMpns(env, args);
            case "setAttributes":
                return this.setAttributes(env, args);
            case "getAttributes":
                return this.getAttributes(env, args);
            case "setTotalMatchingVariants":
                return this.setTotalMatchingVariants(env, args);
            case "getTotalMatchingVariants":
                return this.getTotalMatchingVariants(env, args);
            case "setVariants":
                return this.setVariants(env, args);
            case "getVariants":
                return this.getVariants(env, args);
            case "setModificationTime":
                return this.setModificationTime(env, args);
            case "getModificationTime":
                return this.getModificationTime(env, args);
            case "setCategories":
                return this.setCategories(env, args);
            case "getCategories":
                return this.getCategories(env, args);
            case "setLanguage":
                return this.setLanguage(env, args);
            case "getLanguage":
                return this.getLanguage(env, args);
            case "setCountry":
                return this.setCountry(env, args);
            case "getCountry":
                return this.getCountry(env, args);
            case "setTitle":
                return this.setTitle(env, args);
            case "getTitle":
                return this.getTitle(env, args);
            case "setCreationTime":
                return this.setCreationTime(env, args);
            case "getCreationTime":
                return this.getCreationTime(env, args);
            case "setInternal14":
                return this.setInternal14(env, args);
            case "getInternal14":
                return this.getInternal14(env, args);
            case "setInternal12":
                return this.setInternal12(env, args);
            case "getInternal12":
                return this.getInternal12(env, args);
            case "setInternal13":
                return this.setInternal13(env, args);
            case "getInternal13":
                return this.getInternal13(env, args);
            case "setInternal10":
                return this.setInternal10(env, args);
            case "getInternal10":
                return this.getInternal10(env, args);
            case "setPlusOne":
                return this.setPlusOne(env, args);
            case "getPlusOne":
                return this.getPlusOne(env, args);
            case "setGoogleId":
                return this.setGoogleId(env, args);
            case "getGoogleId":
                return this.getGoogleId(env, args);
            case "setInternal15":
                return this.setInternal15(env, args);
            case "getInternal15":
                return this.getInternal15(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "queryMatched":
                return this.queryMatched;
            case "gtin":
                return this.gtin;
            case "__imagesType":
                if (Google_ShoppingModelProductJsonV1.class.isAssignableFrom(caller)) {

                    return this.__imagesType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__imagesDataType":
                if (Google_ShoppingModelProductJsonV1.class.isAssignableFrom(caller)) {

                    return this.__imagesDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "images":
                return this.images;
            case "__inventoriesType":
                if (Google_ShoppingModelProductJsonV1.class.isAssignableFrom(caller)) {

                    return this.__inventoriesType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__inventoriesDataType":
                if (Google_ShoppingModelProductJsonV1.class.isAssignableFrom(caller)) {

                    return this.__inventoriesDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "inventories":
                return this.inventories;
            case "__authorType":
                if (Google_ShoppingModelProductJsonV1.class.isAssignableFrom(caller)) {

                    return this.__authorType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__authorDataType":
                if (Google_ShoppingModelProductJsonV1.class.isAssignableFrom(caller)) {

                    return this.__authorDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "author":
                return this.author;
            case "score":
                return this.score;
            case "condition":
                return this.condition;
            case "providedId":
                return this.providedId;
            case "internal8":
                return this.internal8;
            case "description":
                return this.description;
            case "gtins":
                return this.gtins;
            case "internal1":
                return this.internal1;
            case "brand":
                return this.brand;
            case "internal3":
                return this.internal3;
            case "__internal4Type":
                if (Google_ShoppingModelProductJsonV1.class.isAssignableFrom(caller)) {

                    return this.__internal4Type;
                }
                return this.__phpMagicMethod__isset(key);
            case "__internal4DataType":
                if (Google_ShoppingModelProductJsonV1.class.isAssignableFrom(caller)) {

                    return this.__internal4DataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "internal4":
                return this.internal4;
            case "internal6":
                return this.internal6;
            case "internal7":
                return this.internal7;
            case "link":
                return this.link;
            case "mpns":
                return this.mpns;
            case "__attributesType":
                if (Google_ShoppingModelProductJsonV1.class.isAssignableFrom(caller)) {

                    return this.__attributesType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__attributesDataType":
                if (Google_ShoppingModelProductJsonV1.class.isAssignableFrom(caller)) {

                    return this.__attributesDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "attributes":
                return this.attributes;
            case "totalMatchingVariants":
                return this.totalMatchingVariants;
            case "__variantsType":
                if (Google_ShoppingModelProductJsonV1.class.isAssignableFrom(caller)) {

                    return this.__variantsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__variantsDataType":
                if (Google_ShoppingModelProductJsonV1.class.isAssignableFrom(caller)) {

                    return this.__variantsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "variants":
                return this.variants;
            case "modificationTime":
                return this.modificationTime;
            case "categories":
                return this.categories;
            case "language":
                return this.language;
            case "country":
                return this.country;
            case "title":
                return this.title;
            case "creationTime":
                return this.creationTime;
            case "internal14":
                return this.internal14;
            case "internal12":
                return this.internal12;
            case "internal13":
                return this.internal13;
            case "internal10":
                return this.internal10;
            case "plusOne":
                return this.plusOne;
            case "googleId":
                return this.googleId;
            case "internal15":
                return this.internal15;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "queryMatched":
                return ZVal.isNull(this.queryMatched);
            case "gtin":
                return ZVal.isNull(this.gtin);
            case "__imagesType":
                if (Google_ShoppingModelProductJsonV1.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__imagesType);
                }
                break;
            case "__imagesDataType":
                if (Google_ShoppingModelProductJsonV1.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__imagesDataType);
                }
                break;
            case "images":
                return ZVal.isNull(this.images);
            case "__inventoriesType":
                if (Google_ShoppingModelProductJsonV1.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__inventoriesType);
                }
                break;
            case "__inventoriesDataType":
                if (Google_ShoppingModelProductJsonV1.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__inventoriesDataType);
                }
                break;
            case "inventories":
                return ZVal.isNull(this.inventories);
            case "__authorType":
                if (Google_ShoppingModelProductJsonV1.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__authorType);
                }
                break;
            case "__authorDataType":
                if (Google_ShoppingModelProductJsonV1.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__authorDataType);
                }
                break;
            case "author":
                return ZVal.isNull(this.author);
            case "score":
                return ZVal.isNull(this.score);
            case "condition":
                return ZVal.isNull(this.condition);
            case "providedId":
                return ZVal.isNull(this.providedId);
            case "internal8":
                return ZVal.isNull(this.internal8);
            case "description":
                return ZVal.isNull(this.description);
            case "gtins":
                return ZVal.isNull(this.gtins);
            case "internal1":
                return ZVal.isNull(this.internal1);
            case "brand":
                return ZVal.isNull(this.brand);
            case "internal3":
                return ZVal.isNull(this.internal3);
            case "__internal4Type":
                if (Google_ShoppingModelProductJsonV1.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__internal4Type);
                }
                break;
            case "__internal4DataType":
                if (Google_ShoppingModelProductJsonV1.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__internal4DataType);
                }
                break;
            case "internal4":
                return ZVal.isNull(this.internal4);
            case "internal6":
                return ZVal.isNull(this.internal6);
            case "internal7":
                return ZVal.isNull(this.internal7);
            case "link":
                return ZVal.isNull(this.link);
            case "mpns":
                return ZVal.isNull(this.mpns);
            case "__attributesType":
                if (Google_ShoppingModelProductJsonV1.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__attributesType);
                }
                break;
            case "__attributesDataType":
                if (Google_ShoppingModelProductJsonV1.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__attributesDataType);
                }
                break;
            case "attributes":
                return ZVal.isNull(this.attributes);
            case "totalMatchingVariants":
                return ZVal.isNull(this.totalMatchingVariants);
            case "__variantsType":
                if (Google_ShoppingModelProductJsonV1.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__variantsType);
                }
                break;
            case "__variantsDataType":
                if (Google_ShoppingModelProductJsonV1.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__variantsDataType);
                }
                break;
            case "variants":
                return ZVal.isNull(this.variants);
            case "modificationTime":
                return ZVal.isNull(this.modificationTime);
            case "categories":
                return ZVal.isNull(this.categories);
            case "language":
                return ZVal.isNull(this.language);
            case "country":
                return ZVal.isNull(this.country);
            case "title":
                return ZVal.isNull(this.title);
            case "creationTime":
                return ZVal.isNull(this.creationTime);
            case "internal14":
                return ZVal.isNull(this.internal14);
            case "internal12":
                return ZVal.isNull(this.internal12);
            case "internal13":
                return ZVal.isNull(this.internal13);
            case "internal10":
                return ZVal.isNull(this.internal10);
            case "plusOne":
                return ZVal.isNull(this.plusOne);
            case "googleId":
                return ZVal.isNull(this.googleId);
            case "internal15":
                return ZVal.isNull(this.internal15);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "queryMatched":
                this.queryMatched = value;
                break;
            case "gtin":
                this.gtin = value;
                break;
            case "__imagesType":
                if (Google_ShoppingModelProductJsonV1.class.isAssignableFrom(caller)) {

                    this.__imagesType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__imagesDataType":
                if (Google_ShoppingModelProductJsonV1.class.isAssignableFrom(caller)) {

                    this.__imagesDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "images":
                this.images = value;
                break;
            case "__inventoriesType":
                if (Google_ShoppingModelProductJsonV1.class.isAssignableFrom(caller)) {

                    this.__inventoriesType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__inventoriesDataType":
                if (Google_ShoppingModelProductJsonV1.class.isAssignableFrom(caller)) {

                    this.__inventoriesDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "inventories":
                this.inventories = value;
                break;
            case "__authorType":
                if (Google_ShoppingModelProductJsonV1.class.isAssignableFrom(caller)) {

                    this.__authorType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__authorDataType":
                if (Google_ShoppingModelProductJsonV1.class.isAssignableFrom(caller)) {

                    this.__authorDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "author":
                this.author = value;
                break;
            case "score":
                this.score = value;
                break;
            case "condition":
                this.condition = value;
                break;
            case "providedId":
                this.providedId = value;
                break;
            case "internal8":
                this.internal8 = value;
                break;
            case "description":
                this.description = value;
                break;
            case "gtins":
                this.gtins = value;
                break;
            case "internal1":
                this.internal1 = value;
                break;
            case "brand":
                this.brand = value;
                break;
            case "internal3":
                this.internal3 = value;
                break;
            case "__internal4Type":
                if (Google_ShoppingModelProductJsonV1.class.isAssignableFrom(caller)) {

                    this.__internal4Type = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__internal4DataType":
                if (Google_ShoppingModelProductJsonV1.class.isAssignableFrom(caller)) {

                    this.__internal4DataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "internal4":
                this.internal4 = value;
                break;
            case "internal6":
                this.internal6 = value;
                break;
            case "internal7":
                this.internal7 = value;
                break;
            case "link":
                this.link = value;
                break;
            case "mpns":
                this.mpns = value;
                break;
            case "__attributesType":
                if (Google_ShoppingModelProductJsonV1.class.isAssignableFrom(caller)) {

                    this.__attributesType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__attributesDataType":
                if (Google_ShoppingModelProductJsonV1.class.isAssignableFrom(caller)) {

                    this.__attributesDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "attributes":
                this.attributes = value;
                break;
            case "totalMatchingVariants":
                this.totalMatchingVariants = value;
                break;
            case "__variantsType":
                if (Google_ShoppingModelProductJsonV1.class.isAssignableFrom(caller)) {

                    this.__variantsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__variantsDataType":
                if (Google_ShoppingModelProductJsonV1.class.isAssignableFrom(caller)) {

                    this.__variantsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "variants":
                this.variants = value;
                break;
            case "modificationTime":
                this.modificationTime = value;
                break;
            case "categories":
                this.categories = value;
                break;
            case "language":
                this.language = value;
                break;
            case "country":
                this.country = value;
                break;
            case "title":
                this.title = value;
                break;
            case "creationTime":
                this.creationTime = value;
                break;
            case "internal14":
                this.internal14 = value;
                break;
            case "internal12":
                this.internal12 = value;
                break;
            case "internal13":
                this.internal13 = value;
                break;
            case "internal10":
                this.internal10 = value;
                break;
            case "plusOne":
                this.plusOne = value;
                break;
            case "googleId":
                this.googleId = value;
                break;
            case "internal15":
                this.internal15 = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setQueryMatched(RuntimeEnv env, Object... args) {
        Object queryMatched = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_ShoppingModelProductJsonV1.class, "queryMatched", queryMatched);

        return null;
    }

    public Object getQueryMatched(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelProductJsonV1.class, "queryMatched"));
    }

    public Object setGtin(RuntimeEnv env, Object... args) {
        Object gtin = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ShoppingModelProductJsonV1.class, "gtin", gtin);

        return null;
    }

    public Object getGtin(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ShoppingModelProductJsonV1.class, "gtin"));
    }

    public Object setImages(RuntimeEnv env, Object... args) {
        Object images = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_ShoppingModelProductJsonV1.class,
                images,
                "Google_ShoppingModelProductJsonV1Images",
                "setImages");
        ZVal.setProperty(this, Google_ShoppingModelProductJsonV1.class, "images", images);

        return null;
    }

    public Object getImages(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelProductJsonV1.class, "images"));
    }

    public Object setInventories(RuntimeEnv env, Object... args) {
        Object inventories = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_ShoppingModelProductJsonV1.class,
                inventories,
                "Google_ShoppingModelProductJsonV1Inventories",
                "setInventories");
        ZVal.setProperty(this, Google_ShoppingModelProductJsonV1.class, "inventories", inventories);

        return null;
    }

    public Object getInventories(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelProductJsonV1.class, "inventories"));
    }

    public Object setAuthor(RuntimeEnv env, Object... args) {
        Object author = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ShoppingModelProductJsonV1.class, "author", author);

        return null;
    }

    public Object getAuthor(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelProductJsonV1.class, "author"));
    }

    public Object setScore(RuntimeEnv env, Object... args) {
        Object score = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ShoppingModelProductJsonV1.class, "score", score);

        return null;
    }

    public Object getScore(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelProductJsonV1.class, "score"));
    }

    public Object setCondition(RuntimeEnv env, Object... args) {
        Object condition = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ShoppingModelProductJsonV1.class, "condition", condition);

        return null;
    }

    public Object getCondition(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelProductJsonV1.class, "condition"));
    }

    public Object setProvidedId(RuntimeEnv env, Object... args) {
        Object providedId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ShoppingModelProductJsonV1.class, "providedId", providedId);

        return null;
    }

    public Object getProvidedId(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelProductJsonV1.class, "providedId"));
    }

    public Object setInternal8(RuntimeEnv env, Object... args) {
        Object internal8 = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_ShoppingModelProductJsonV1.class,
                internal8,
                "Google_string",
                "setInternal8");
        ZVal.setProperty(this, Google_ShoppingModelProductJsonV1.class, "internal8", internal8);

        return null;
    }

    public Object getInternal8(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelProductJsonV1.class, "internal8"));
    }

    public Object setDescription(RuntimeEnv env, Object... args) {
        Object description = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ShoppingModelProductJsonV1.class, "description", description);

        return null;
    }

    public Object getDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelProductJsonV1.class, "description"));
    }

    public Object setGtins(RuntimeEnv env, Object... args) {
        Object gtins = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_ShoppingModelProductJsonV1.class,
                gtins,
                "Google_string",
                "setGtins");
        ZVal.setProperty(this, Google_ShoppingModelProductJsonV1.class, "gtins", gtins);

        return null;
    }

    public Object getGtins(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelProductJsonV1.class, "gtins"));
    }

    public Object setInternal1(RuntimeEnv env, Object... args) {
        Object internal1 = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_ShoppingModelProductJsonV1.class,
                internal1,
                "Google_string",
                "setInternal1");
        ZVal.setProperty(this, Google_ShoppingModelProductJsonV1.class, "internal1", internal1);

        return null;
    }

    public Object getInternal1(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelProductJsonV1.class, "internal1"));
    }

    public Object setBrand(RuntimeEnv env, Object... args) {
        Object brand = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ShoppingModelProductJsonV1.class, "brand", brand);

        return null;
    }

    public Object getBrand(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelProductJsonV1.class, "brand"));
    }

    public Object setInternal3(RuntimeEnv env, Object... args) {
        Object internal3 = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ShoppingModelProductJsonV1.class, "internal3", internal3);

        return null;
    }

    public Object getInternal3(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelProductJsonV1.class, "internal3"));
    }

    public Object setInternal4(RuntimeEnv env, Object... args) {
        Object internal4 = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_ShoppingModelProductJsonV1.class,
                internal4,
                "Google_ShoppingModelProductJsonV1Internal4",
                "setInternal4");
        ZVal.setProperty(this, Google_ShoppingModelProductJsonV1.class, "internal4", internal4);

        return null;
    }

    public Object getInternal4(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelProductJsonV1.class, "internal4"));
    }

    public Object setInternal6(RuntimeEnv env, Object... args) {
        Object internal6 = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ShoppingModelProductJsonV1.class, "internal6", internal6);

        return null;
    }

    public Object getInternal6(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelProductJsonV1.class, "internal6"));
    }

    public Object setInternal7(RuntimeEnv env, Object... args) {
        Object internal7 = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ShoppingModelProductJsonV1.class, "internal7", internal7);

        return null;
    }

    public Object getInternal7(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelProductJsonV1.class, "internal7"));
    }

    public Object setLink(RuntimeEnv env, Object... args) {
        Object link = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ShoppingModelProductJsonV1.class, "link", link);

        return null;
    }

    public Object getLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ShoppingModelProductJsonV1.class, "link"));
    }

    public Object setMpns(RuntimeEnv env, Object... args) {
        Object mpns = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_ShoppingModelProductJsonV1.class,
                mpns,
                "Google_string",
                "setMpns");
        ZVal.setProperty(this, Google_ShoppingModelProductJsonV1.class, "mpns", mpns);

        return null;
    }

    public Object getMpns(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ShoppingModelProductJsonV1.class, "mpns"));
    }

    public Object setAttributes(RuntimeEnv env, Object... args) {
        Object attributes = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_ShoppingModelProductJsonV1.class,
                attributes,
                "Google_ShoppingModelProductJsonV1Attributes",
                "setAttributes");
        ZVal.setProperty(this, Google_ShoppingModelProductJsonV1.class, "attributes", attributes);

        return null;
    }

    public Object getAttributes(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelProductJsonV1.class, "attributes"));
    }

    public Object setTotalMatchingVariants(RuntimeEnv env, Object... args) {
        Object totalMatchingVariants = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_ShoppingModelProductJsonV1.class,
                "totalMatchingVariants",
                totalMatchingVariants);

        return null;
    }

    public Object getTotalMatchingVariants(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_ShoppingModelProductJsonV1.class, "totalMatchingVariants"));
    }

    public Object setVariants(RuntimeEnv env, Object... args) {
        Object variants = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_ShoppingModelProductJsonV1.class,
                variants,
                "Google_ShoppingModelProductJsonV1Variants",
                "setVariants");
        ZVal.setProperty(this, Google_ShoppingModelProductJsonV1.class, "variants", variants);

        return null;
    }

    public Object getVariants(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelProductJsonV1.class, "variants"));
    }

    public Object setModificationTime(RuntimeEnv env, Object... args) {
        Object modificationTime = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_ShoppingModelProductJsonV1.class,
                "modificationTime",
                modificationTime);

        return null;
    }

    public Object getModificationTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_ShoppingModelProductJsonV1.class, "modificationTime"));
    }

    public Object setCategories(RuntimeEnv env, Object... args) {
        Object categories = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_ShoppingModelProductJsonV1.class,
                categories,
                "Google_string",
                "setCategories");
        ZVal.setProperty(this, Google_ShoppingModelProductJsonV1.class, "categories", categories);

        return null;
    }

    public Object getCategories(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelProductJsonV1.class, "categories"));
    }

    public Object setLanguage(RuntimeEnv env, Object... args) {
        Object language = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ShoppingModelProductJsonV1.class, "language", language);

        return null;
    }

    public Object getLanguage(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelProductJsonV1.class, "language"));
    }

    public Object setCountry(RuntimeEnv env, Object... args) {
        Object country = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ShoppingModelProductJsonV1.class, "country", country);

        return null;
    }

    public Object getCountry(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelProductJsonV1.class, "country"));
    }

    public Object setTitle(RuntimeEnv env, Object... args) {
        Object title = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ShoppingModelProductJsonV1.class, "title", title);

        return null;
    }

    public Object getTitle(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelProductJsonV1.class, "title"));
    }

    public Object setCreationTime(RuntimeEnv env, Object... args) {
        Object creationTime = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_ShoppingModelProductJsonV1.class, "creationTime", creationTime);

        return null;
    }

    public Object getCreationTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelProductJsonV1.class, "creationTime"));
    }

    public Object setInternal14(RuntimeEnv env, Object... args) {
        Object internal14 = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ShoppingModelProductJsonV1.class, "internal14", internal14);

        return null;
    }

    public Object getInternal14(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelProductJsonV1.class, "internal14"));
    }

    public Object setInternal12(RuntimeEnv env, Object... args) {
        Object internal12 = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ShoppingModelProductJsonV1.class, "internal12", internal12);

        return null;
    }

    public Object getInternal12(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelProductJsonV1.class, "internal12"));
    }

    public Object setInternal13(RuntimeEnv env, Object... args) {
        Object internal13 = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ShoppingModelProductJsonV1.class, "internal13", internal13);

        return null;
    }

    public Object getInternal13(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelProductJsonV1.class, "internal13"));
    }

    public Object setInternal10(RuntimeEnv env, Object... args) {
        Object internal10 = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_ShoppingModelProductJsonV1.class,
                internal10,
                "Google_string",
                "setInternal10");
        ZVal.setProperty(this, Google_ShoppingModelProductJsonV1.class, "internal10", internal10);

        return null;
    }

    public Object getInternal10(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelProductJsonV1.class, "internal10"));
    }

    public Object setPlusOne(RuntimeEnv env, Object... args) {
        Object plusOne = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ShoppingModelProductJsonV1.class, "plusOne", plusOne);

        return null;
    }

    public Object getPlusOne(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelProductJsonV1.class, "plusOne"));
    }

    public Object setGoogleId(RuntimeEnv env, Object... args) {
        Object googleId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ShoppingModelProductJsonV1.class, "googleId", googleId);

        return null;
    }

    public Object getGoogleId(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelProductJsonV1.class, "googleId"));
    }

    public Object setInternal15(RuntimeEnv env, Object... args) {
        Object internal15 = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ShoppingModelProductJsonV1.class, "internal15", internal15);

        return null;
    }

    public Object getInternal15(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelProductJsonV1.class, "internal15"));
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
