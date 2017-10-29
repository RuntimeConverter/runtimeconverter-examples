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

public class Google_ProductsPromotions extends Google_Model implements RuntimeFileContextInterface {

    public Object __productType = "Google_ShoppingModelProductJsonV1";

    public Object __productDataType = "";

    public Object product = null;

    public Object description = null;

    public Object imageLink = null;

    public Object destLink = null;

    public Object customHtml = null;

    public Object __customFieldsType = "Google_ProductsPromotionsCustomFields";

    public Object __customFieldsDataType = "array";

    public Object customFields = null;

    public Object type = null;

    public Object name = null;

    public Google_ProductsPromotions(RuntimeEnv env, Object... args) {
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
            case "setDescription":
                return this.setDescription(env, args);
            case "getDescription":
                return this.getDescription(env, args);
            case "setImageLink":
                return this.setImageLink(env, args);
            case "getImageLink":
                return this.getImageLink(env, args);
            case "setDestLink":
                return this.setDestLink(env, args);
            case "getDestLink":
                return this.getDestLink(env, args);
            case "setCustomHtml":
                return this.setCustomHtml(env, args);
            case "getCustomHtml":
                return this.getCustomHtml(env, args);
            case "setCustomFields":
                return this.setCustomFields(env, args);
            case "getCustomFields":
                return this.getCustomFields(env, args);
            case "setType":
                return this.setType(env, args);
            case "getType":
                return this.getType(env, args);
            case "setName":
                return this.setName(env, args);
            case "getName":
                return this.getName(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__productType":
                if (Google_ProductsPromotions.class.isAssignableFrom(caller)) {

                    return this.__productType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__productDataType":
                if (Google_ProductsPromotions.class.isAssignableFrom(caller)) {

                    return this.__productDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "product":
                return this.product;
            case "description":
                return this.description;
            case "imageLink":
                return this.imageLink;
            case "destLink":
                return this.destLink;
            case "customHtml":
                return this.customHtml;
            case "__customFieldsType":
                if (Google_ProductsPromotions.class.isAssignableFrom(caller)) {

                    return this.__customFieldsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__customFieldsDataType":
                if (Google_ProductsPromotions.class.isAssignableFrom(caller)) {

                    return this.__customFieldsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "customFields":
                return this.customFields;
            case "type":
                return this.type;
            case "name":
                return this.name;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__productType":
                if (Google_ProductsPromotions.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__productType);
                }
                break;
            case "__productDataType":
                if (Google_ProductsPromotions.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__productDataType);
                }
                break;
            case "product":
                return ZVal.isNull(this.product);
            case "description":
                return ZVal.isNull(this.description);
            case "imageLink":
                return ZVal.isNull(this.imageLink);
            case "destLink":
                return ZVal.isNull(this.destLink);
            case "customHtml":
                return ZVal.isNull(this.customHtml);
            case "__customFieldsType":
                if (Google_ProductsPromotions.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__customFieldsType);
                }
                break;
            case "__customFieldsDataType":
                if (Google_ProductsPromotions.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__customFieldsDataType);
                }
                break;
            case "customFields":
                return ZVal.isNull(this.customFields);
            case "type":
                return ZVal.isNull(this.type);
            case "name":
                return ZVal.isNull(this.name);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__productType":
                if (Google_ProductsPromotions.class.isAssignableFrom(caller)) {

                    this.__productType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__productDataType":
                if (Google_ProductsPromotions.class.isAssignableFrom(caller)) {

                    this.__productDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "product":
                this.product = value;
                break;
            case "description":
                this.description = value;
                break;
            case "imageLink":
                this.imageLink = value;
                break;
            case "destLink":
                this.destLink = value;
                break;
            case "customHtml":
                this.customHtml = value;
                break;
            case "__customFieldsType":
                if (Google_ProductsPromotions.class.isAssignableFrom(caller)) {

                    this.__customFieldsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__customFieldsDataType":
                if (Google_ProductsPromotions.class.isAssignableFrom(caller)) {

                    this.__customFieldsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "customFields":
                this.customFields = value;
                break;
            case "type":
                this.type = value;
                break;
            case "name":
                this.name = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setProduct(RuntimeEnv env, Object... args) {
        Object product = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ProductsPromotions.class, "product", product);

        return null;
    }

    public Object getProduct(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ProductsPromotions.class, "product"));
    }

    public Object setDescription(RuntimeEnv env, Object... args) {
        Object description = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ProductsPromotions.class, "description", description);

        return null;
    }

    public Object getDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ProductsPromotions.class, "description"));
    }

    public Object setImageLink(RuntimeEnv env, Object... args) {
        Object imageLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ProductsPromotions.class, "imageLink", imageLink);

        return null;
    }

    public Object getImageLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ProductsPromotions.class, "imageLink"));
    }

    public Object setDestLink(RuntimeEnv env, Object... args) {
        Object destLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ProductsPromotions.class, "destLink", destLink);

        return null;
    }

    public Object getDestLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ProductsPromotions.class, "destLink"));
    }

    public Object setCustomHtml(RuntimeEnv env, Object... args) {
        Object customHtml = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ProductsPromotions.class, "customHtml", customHtml);

        return null;
    }

    public Object getCustomHtml(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ProductsPromotions.class, "customHtml"));
    }

    public Object setCustomFields(RuntimeEnv env, Object... args) {
        Object customFields = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_ProductsPromotions.class,
                customFields,
                "Google_ProductsPromotionsCustomFields",
                "setCustomFields");
        ZVal.setProperty(this, Google_ProductsPromotions.class, "customFields", customFields);

        return null;
    }

    public Object getCustomFields(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ProductsPromotions.class, "customFields"));
    }

    public Object setType(RuntimeEnv env, Object... args) {
        Object type = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ProductsPromotions.class, "type", type);

        return null;
    }

    public Object getType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ProductsPromotions.class, "type"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ProductsPromotions.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ProductsPromotions.class, "name"));
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
