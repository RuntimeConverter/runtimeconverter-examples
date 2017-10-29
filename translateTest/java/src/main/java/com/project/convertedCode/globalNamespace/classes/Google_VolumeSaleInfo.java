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

 google-api-php-client/src/contrib/Google_BooksService.php

*/

public class Google_VolumeSaleInfo extends Google_Model implements RuntimeFileContextInterface {

    public Object country = null;

    public Object __retailPriceType = "Google_VolumeSaleInfoRetailPrice";

    public Object __retailPriceDataType = "";

    public Object retailPrice = null;

    public Object isEbook = null;

    public Object saleability = null;

    public Object buyLink = null;

    public Object onSaleDate = null;

    public Object __listPriceType = "Google_VolumeSaleInfoListPrice";

    public Object __listPriceDataType = "";

    public Object listPrice = null;

    public Google_VolumeSaleInfo(RuntimeEnv env, Object... args) {
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
            case "setCountry":
                return this.setCountry(env, args);
            case "getCountry":
                return this.getCountry(env, args);
            case "setRetailPrice":
                return this.setRetailPrice(env, args);
            case "getRetailPrice":
                return this.getRetailPrice(env, args);
            case "setIsEbook":
                return this.setIsEbook(env, args);
            case "getIsEbook":
                return this.getIsEbook(env, args);
            case "setSaleability":
                return this.setSaleability(env, args);
            case "getSaleability":
                return this.getSaleability(env, args);
            case "setBuyLink":
                return this.setBuyLink(env, args);
            case "getBuyLink":
                return this.getBuyLink(env, args);
            case "setOnSaleDate":
                return this.setOnSaleDate(env, args);
            case "getOnSaleDate":
                return this.getOnSaleDate(env, args);
            case "setListPrice":
                return this.setListPrice(env, args);
            case "getListPrice":
                return this.getListPrice(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "country":
                return this.country;
            case "__retailPriceType":
                if (Google_VolumeSaleInfo.class.isAssignableFrom(caller)) {

                    return this.__retailPriceType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__retailPriceDataType":
                if (Google_VolumeSaleInfo.class.isAssignableFrom(caller)) {

                    return this.__retailPriceDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "retailPrice":
                return this.retailPrice;
            case "isEbook":
                return this.isEbook;
            case "saleability":
                return this.saleability;
            case "buyLink":
                return this.buyLink;
            case "onSaleDate":
                return this.onSaleDate;
            case "__listPriceType":
                if (Google_VolumeSaleInfo.class.isAssignableFrom(caller)) {

                    return this.__listPriceType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__listPriceDataType":
                if (Google_VolumeSaleInfo.class.isAssignableFrom(caller)) {

                    return this.__listPriceDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "listPrice":
                return this.listPrice;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "country":
                return ZVal.isNull(this.country);
            case "__retailPriceType":
                if (Google_VolumeSaleInfo.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__retailPriceType);
                }
                break;
            case "__retailPriceDataType":
                if (Google_VolumeSaleInfo.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__retailPriceDataType);
                }
                break;
            case "retailPrice":
                return ZVal.isNull(this.retailPrice);
            case "isEbook":
                return ZVal.isNull(this.isEbook);
            case "saleability":
                return ZVal.isNull(this.saleability);
            case "buyLink":
                return ZVal.isNull(this.buyLink);
            case "onSaleDate":
                return ZVal.isNull(this.onSaleDate);
            case "__listPriceType":
                if (Google_VolumeSaleInfo.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__listPriceType);
                }
                break;
            case "__listPriceDataType":
                if (Google_VolumeSaleInfo.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__listPriceDataType);
                }
                break;
            case "listPrice":
                return ZVal.isNull(this.listPrice);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "country":
                this.country = value;
                break;
            case "__retailPriceType":
                if (Google_VolumeSaleInfo.class.isAssignableFrom(caller)) {

                    this.__retailPriceType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__retailPriceDataType":
                if (Google_VolumeSaleInfo.class.isAssignableFrom(caller)) {

                    this.__retailPriceDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "retailPrice":
                this.retailPrice = value;
                break;
            case "isEbook":
                this.isEbook = value;
                break;
            case "saleability":
                this.saleability = value;
                break;
            case "buyLink":
                this.buyLink = value;
                break;
            case "onSaleDate":
                this.onSaleDate = value;
                break;
            case "__listPriceType":
                if (Google_VolumeSaleInfo.class.isAssignableFrom(caller)) {

                    this.__listPriceType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__listPriceDataType":
                if (Google_VolumeSaleInfo.class.isAssignableFrom(caller)) {

                    this.__listPriceDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "listPrice":
                this.listPrice = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setCountry(RuntimeEnv env, Object... args) {
        Object country = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeSaleInfo.class, "country", country);

        return null;
    }

    public Object getCountry(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeSaleInfo.class, "country"));
    }

    public Object setRetailPrice(RuntimeEnv env, Object... args) {
        Object retailPrice = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeSaleInfo.class, "retailPrice", retailPrice);

        return null;
    }

    public Object getRetailPrice(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeSaleInfo.class, "retailPrice"));
    }

    public Object setIsEbook(RuntimeEnv env, Object... args) {
        Object isEbook = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeSaleInfo.class, "isEbook", isEbook);

        return null;
    }

    public Object getIsEbook(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeSaleInfo.class, "isEbook"));
    }

    public Object setSaleability(RuntimeEnv env, Object... args) {
        Object saleability = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeSaleInfo.class, "saleability", saleability);

        return null;
    }

    public Object getSaleability(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeSaleInfo.class, "saleability"));
    }

    public Object setBuyLink(RuntimeEnv env, Object... args) {
        Object buyLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeSaleInfo.class, "buyLink", buyLink);

        return null;
    }

    public Object getBuyLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeSaleInfo.class, "buyLink"));
    }

    public Object setOnSaleDate(RuntimeEnv env, Object... args) {
        Object onSaleDate = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeSaleInfo.class, "onSaleDate", onSaleDate);

        return null;
    }

    public Object getOnSaleDate(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeSaleInfo.class, "onSaleDate"));
    }

    public Object setListPrice(RuntimeEnv env, Object... args) {
        Object listPrice = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeSaleInfo.class, "listPrice", listPrice);

        return null;
    }

    public Object getListPrice(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeSaleInfo.class, "listPrice"));
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
