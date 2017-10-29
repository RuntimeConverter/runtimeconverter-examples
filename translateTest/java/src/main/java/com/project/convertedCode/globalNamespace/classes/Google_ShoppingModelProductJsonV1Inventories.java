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

public class Google_ShoppingModelProductJsonV1Inventories extends Google_Model
        implements RuntimeFileContextInterface {

    public Object installmentPrice = null;

    public Object installmentMonths = null;

    public Object distance = null;

    public Object price = null;

    public Object storeId = null;

    public Object tax = null;

    public Object shipping = null;

    public Object currency = null;

    public Object salePrice = null;

    public Object originalPrice = null;

    public Object distanceUnit = null;

    public Object saleStartDate = null;

    public Object availability = null;

    public Object channel = null;

    public Object saleEndDate = null;

    public Google_ShoppingModelProductJsonV1Inventories(RuntimeEnv env, Object... args) {
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
            case "setInstallmentPrice":
                return this.setInstallmentPrice(env, args);
            case "getInstallmentPrice":
                return this.getInstallmentPrice(env, args);
            case "setInstallmentMonths":
                return this.setInstallmentMonths(env, args);
            case "getInstallmentMonths":
                return this.getInstallmentMonths(env, args);
            case "setDistance":
                return this.setDistance(env, args);
            case "getDistance":
                return this.getDistance(env, args);
            case "setPrice":
                return this.setPrice(env, args);
            case "getPrice":
                return this.getPrice(env, args);
            case "setStoreId":
                return this.setStoreId(env, args);
            case "getStoreId":
                return this.getStoreId(env, args);
            case "setTax":
                return this.setTax(env, args);
            case "getTax":
                return this.getTax(env, args);
            case "setShipping":
                return this.setShipping(env, args);
            case "getShipping":
                return this.getShipping(env, args);
            case "setCurrency":
                return this.setCurrency(env, args);
            case "getCurrency":
                return this.getCurrency(env, args);
            case "setSalePrice":
                return this.setSalePrice(env, args);
            case "getSalePrice":
                return this.getSalePrice(env, args);
            case "setOriginalPrice":
                return this.setOriginalPrice(env, args);
            case "getOriginalPrice":
                return this.getOriginalPrice(env, args);
            case "setDistanceUnit":
                return this.setDistanceUnit(env, args);
            case "getDistanceUnit":
                return this.getDistanceUnit(env, args);
            case "setSaleStartDate":
                return this.setSaleStartDate(env, args);
            case "getSaleStartDate":
                return this.getSaleStartDate(env, args);
            case "setAvailability":
                return this.setAvailability(env, args);
            case "getAvailability":
                return this.getAvailability(env, args);
            case "setChannel":
                return this.setChannel(env, args);
            case "getChannel":
                return this.getChannel(env, args);
            case "setSaleEndDate":
                return this.setSaleEndDate(env, args);
            case "getSaleEndDate":
                return this.getSaleEndDate(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "installmentPrice":
                return this.installmentPrice;
            case "installmentMonths":
                return this.installmentMonths;
            case "distance":
                return this.distance;
            case "price":
                return this.price;
            case "storeId":
                return this.storeId;
            case "tax":
                return this.tax;
            case "shipping":
                return this.shipping;
            case "currency":
                return this.currency;
            case "salePrice":
                return this.salePrice;
            case "originalPrice":
                return this.originalPrice;
            case "distanceUnit":
                return this.distanceUnit;
            case "saleStartDate":
                return this.saleStartDate;
            case "availability":
                return this.availability;
            case "channel":
                return this.channel;
            case "saleEndDate":
                return this.saleEndDate;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "installmentPrice":
                return ZVal.isNull(this.installmentPrice);
            case "installmentMonths":
                return ZVal.isNull(this.installmentMonths);
            case "distance":
                return ZVal.isNull(this.distance);
            case "price":
                return ZVal.isNull(this.price);
            case "storeId":
                return ZVal.isNull(this.storeId);
            case "tax":
                return ZVal.isNull(this.tax);
            case "shipping":
                return ZVal.isNull(this.shipping);
            case "currency":
                return ZVal.isNull(this.currency);
            case "salePrice":
                return ZVal.isNull(this.salePrice);
            case "originalPrice":
                return ZVal.isNull(this.originalPrice);
            case "distanceUnit":
                return ZVal.isNull(this.distanceUnit);
            case "saleStartDate":
                return ZVal.isNull(this.saleStartDate);
            case "availability":
                return ZVal.isNull(this.availability);
            case "channel":
                return ZVal.isNull(this.channel);
            case "saleEndDate":
                return ZVal.isNull(this.saleEndDate);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "installmentPrice":
                this.installmentPrice = value;
                break;
            case "installmentMonths":
                this.installmentMonths = value;
                break;
            case "distance":
                this.distance = value;
                break;
            case "price":
                this.price = value;
                break;
            case "storeId":
                this.storeId = value;
                break;
            case "tax":
                this.tax = value;
                break;
            case "shipping":
                this.shipping = value;
                break;
            case "currency":
                this.currency = value;
                break;
            case "salePrice":
                this.salePrice = value;
                break;
            case "originalPrice":
                this.originalPrice = value;
                break;
            case "distanceUnit":
                this.distanceUnit = value;
                break;
            case "saleStartDate":
                this.saleStartDate = value;
                break;
            case "availability":
                this.availability = value;
                break;
            case "channel":
                this.channel = value;
                break;
            case "saleEndDate":
                this.saleEndDate = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setInstallmentPrice(RuntimeEnv env, Object... args) {
        Object installmentPrice = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_ShoppingModelProductJsonV1Inventories.class,
                "installmentPrice",
                installmentPrice);

        return null;
    }

    public Object getInstallmentPrice(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this,
                        Google_ShoppingModelProductJsonV1Inventories.class,
                        "installmentPrice"));
    }

    public Object setInstallmentMonths(RuntimeEnv env, Object... args) {
        Object installmentMonths = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_ShoppingModelProductJsonV1Inventories.class,
                "installmentMonths",
                installmentMonths);

        return null;
    }

    public Object getInstallmentMonths(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this,
                        Google_ShoppingModelProductJsonV1Inventories.class,
                        "installmentMonths"));
    }

    public Object setDistance(RuntimeEnv env, Object... args) {
        Object distance = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_ShoppingModelProductJsonV1Inventories.class, "distance", distance);

        return null;
    }

    public Object getDistance(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_ShoppingModelProductJsonV1Inventories.class, "distance"));
    }

    public Object setPrice(RuntimeEnv env, Object... args) {
        Object price = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ShoppingModelProductJsonV1Inventories.class, "price", price);

        return null;
    }

    public Object getPrice(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_ShoppingModelProductJsonV1Inventories.class, "price"));
    }

    public Object setStoreId(RuntimeEnv env, Object... args) {
        Object storeId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_ShoppingModelProductJsonV1Inventories.class, "storeId", storeId);

        return null;
    }

    public Object getStoreId(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_ShoppingModelProductJsonV1Inventories.class, "storeId"));
    }

    public Object setTax(RuntimeEnv env, Object... args) {
        Object tax = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ShoppingModelProductJsonV1Inventories.class, "tax", tax);

        return null;
    }

    public Object getTax(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ShoppingModelProductJsonV1Inventories.class, "tax"));
    }

    public Object setShipping(RuntimeEnv env, Object... args) {
        Object shipping = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_ShoppingModelProductJsonV1Inventories.class, "shipping", shipping);

        return null;
    }

    public Object getShipping(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_ShoppingModelProductJsonV1Inventories.class, "shipping"));
    }

    public Object setCurrency(RuntimeEnv env, Object... args) {
        Object currency = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_ShoppingModelProductJsonV1Inventories.class, "currency", currency);

        return null;
    }

    public Object getCurrency(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_ShoppingModelProductJsonV1Inventories.class, "currency"));
    }

    public Object setSalePrice(RuntimeEnv env, Object... args) {
        Object salePrice = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_ShoppingModelProductJsonV1Inventories.class, "salePrice", salePrice);

        return null;
    }

    public Object getSalePrice(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_ShoppingModelProductJsonV1Inventories.class, "salePrice"));
    }

    public Object setOriginalPrice(RuntimeEnv env, Object... args) {
        Object originalPrice = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_ShoppingModelProductJsonV1Inventories.class,
                "originalPrice",
                originalPrice);

        return null;
    }

    public Object getOriginalPrice(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_ShoppingModelProductJsonV1Inventories.class, "originalPrice"));
    }

    public Object setDistanceUnit(RuntimeEnv env, Object... args) {
        Object distanceUnit = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_ShoppingModelProductJsonV1Inventories.class,
                "distanceUnit",
                distanceUnit);

        return null;
    }

    public Object getDistanceUnit(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_ShoppingModelProductJsonV1Inventories.class, "distanceUnit"));
    }

    public Object setSaleStartDate(RuntimeEnv env, Object... args) {
        Object saleStartDate = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_ShoppingModelProductJsonV1Inventories.class,
                "saleStartDate",
                saleStartDate);

        return null;
    }

    public Object getSaleStartDate(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_ShoppingModelProductJsonV1Inventories.class, "saleStartDate"));
    }

    public Object setAvailability(RuntimeEnv env, Object... args) {
        Object availability = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_ShoppingModelProductJsonV1Inventories.class,
                "availability",
                availability);

        return null;
    }

    public Object getAvailability(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_ShoppingModelProductJsonV1Inventories.class, "availability"));
    }

    public Object setChannel(RuntimeEnv env, Object... args) {
        Object channel = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_ShoppingModelProductJsonV1Inventories.class, "channel", channel);

        return null;
    }

    public Object getChannel(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_ShoppingModelProductJsonV1Inventories.class, "channel"));
    }

    public Object setSaleEndDate(RuntimeEnv env, Object... args) {
        Object saleEndDate = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_ShoppingModelProductJsonV1Inventories.class,
                "saleEndDate",
                saleEndDate);

        return null;
    }

    public Object getSaleEndDate(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_ShoppingModelProductJsonV1Inventories.class, "saleEndDate"));
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
