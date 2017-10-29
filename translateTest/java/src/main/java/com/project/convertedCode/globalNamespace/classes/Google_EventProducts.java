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

 google-api-php-client/src/contrib/Google_GanService.php

*/

public class Google_EventProducts extends Google_Model implements RuntimeFileContextInterface {

    public Object __networkFeeType = "Google_Money";

    public Object __networkFeeDataType = "";

    public Object networkFee = null;

    public Object sku = null;

    public Object categoryName = null;

    public Object skuName = null;

    public Object __publisherFeeType = "Google_Money";

    public Object __publisherFeeDataType = "";

    public Object publisherFee = null;

    public Object __earningsType = "Google_Money";

    public Object __earningsDataType = "";

    public Object earnings = null;

    public Object __unitPriceType = "Google_Money";

    public Object __unitPriceDataType = "";

    public Object unitPrice = null;

    public Object categoryId = null;

    public Object quantity = null;

    public Google_EventProducts(RuntimeEnv env, Object... args) {
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
            case "setNetworkFee":
                return this.setNetworkFee(env, args);
            case "getNetworkFee":
                return this.getNetworkFee(env, args);
            case "setSku":
                return this.setSku(env, args);
            case "getSku":
                return this.getSku(env, args);
            case "setCategoryName":
                return this.setCategoryName(env, args);
            case "getCategoryName":
                return this.getCategoryName(env, args);
            case "setSkuName":
                return this.setSkuName(env, args);
            case "getSkuName":
                return this.getSkuName(env, args);
            case "setPublisherFee":
                return this.setPublisherFee(env, args);
            case "getPublisherFee":
                return this.getPublisherFee(env, args);
            case "setEarnings":
                return this.setEarnings(env, args);
            case "getEarnings":
                return this.getEarnings(env, args);
            case "setUnitPrice":
                return this.setUnitPrice(env, args);
            case "getUnitPrice":
                return this.getUnitPrice(env, args);
            case "setCategoryId":
                return this.setCategoryId(env, args);
            case "getCategoryId":
                return this.getCategoryId(env, args);
            case "setQuantity":
                return this.setQuantity(env, args);
            case "getQuantity":
                return this.getQuantity(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__networkFeeType":
                if (Google_EventProducts.class.isAssignableFrom(caller)) {

                    return this.__networkFeeType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__networkFeeDataType":
                if (Google_EventProducts.class.isAssignableFrom(caller)) {

                    return this.__networkFeeDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "networkFee":
                return this.networkFee;
            case "sku":
                return this.sku;
            case "categoryName":
                return this.categoryName;
            case "skuName":
                return this.skuName;
            case "__publisherFeeType":
                if (Google_EventProducts.class.isAssignableFrom(caller)) {

                    return this.__publisherFeeType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__publisherFeeDataType":
                if (Google_EventProducts.class.isAssignableFrom(caller)) {

                    return this.__publisherFeeDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "publisherFee":
                return this.publisherFee;
            case "__earningsType":
                if (Google_EventProducts.class.isAssignableFrom(caller)) {

                    return this.__earningsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__earningsDataType":
                if (Google_EventProducts.class.isAssignableFrom(caller)) {

                    return this.__earningsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "earnings":
                return this.earnings;
            case "__unitPriceType":
                if (Google_EventProducts.class.isAssignableFrom(caller)) {

                    return this.__unitPriceType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__unitPriceDataType":
                if (Google_EventProducts.class.isAssignableFrom(caller)) {

                    return this.__unitPriceDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "unitPrice":
                return this.unitPrice;
            case "categoryId":
                return this.categoryId;
            case "quantity":
                return this.quantity;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__networkFeeType":
                if (Google_EventProducts.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__networkFeeType);
                }
                break;
            case "__networkFeeDataType":
                if (Google_EventProducts.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__networkFeeDataType);
                }
                break;
            case "networkFee":
                return ZVal.isNull(this.networkFee);
            case "sku":
                return ZVal.isNull(this.sku);
            case "categoryName":
                return ZVal.isNull(this.categoryName);
            case "skuName":
                return ZVal.isNull(this.skuName);
            case "__publisherFeeType":
                if (Google_EventProducts.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__publisherFeeType);
                }
                break;
            case "__publisherFeeDataType":
                if (Google_EventProducts.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__publisherFeeDataType);
                }
                break;
            case "publisherFee":
                return ZVal.isNull(this.publisherFee);
            case "__earningsType":
                if (Google_EventProducts.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__earningsType);
                }
                break;
            case "__earningsDataType":
                if (Google_EventProducts.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__earningsDataType);
                }
                break;
            case "earnings":
                return ZVal.isNull(this.earnings);
            case "__unitPriceType":
                if (Google_EventProducts.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__unitPriceType);
                }
                break;
            case "__unitPriceDataType":
                if (Google_EventProducts.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__unitPriceDataType);
                }
                break;
            case "unitPrice":
                return ZVal.isNull(this.unitPrice);
            case "categoryId":
                return ZVal.isNull(this.categoryId);
            case "quantity":
                return ZVal.isNull(this.quantity);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__networkFeeType":
                if (Google_EventProducts.class.isAssignableFrom(caller)) {

                    this.__networkFeeType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__networkFeeDataType":
                if (Google_EventProducts.class.isAssignableFrom(caller)) {

                    this.__networkFeeDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "networkFee":
                this.networkFee = value;
                break;
            case "sku":
                this.sku = value;
                break;
            case "categoryName":
                this.categoryName = value;
                break;
            case "skuName":
                this.skuName = value;
                break;
            case "__publisherFeeType":
                if (Google_EventProducts.class.isAssignableFrom(caller)) {

                    this.__publisherFeeType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__publisherFeeDataType":
                if (Google_EventProducts.class.isAssignableFrom(caller)) {

                    this.__publisherFeeDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "publisherFee":
                this.publisherFee = value;
                break;
            case "__earningsType":
                if (Google_EventProducts.class.isAssignableFrom(caller)) {

                    this.__earningsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__earningsDataType":
                if (Google_EventProducts.class.isAssignableFrom(caller)) {

                    this.__earningsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "earnings":
                this.earnings = value;
                break;
            case "__unitPriceType":
                if (Google_EventProducts.class.isAssignableFrom(caller)) {

                    this.__unitPriceType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__unitPriceDataType":
                if (Google_EventProducts.class.isAssignableFrom(caller)) {

                    this.__unitPriceDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "unitPrice":
                this.unitPrice = value;
                break;
            case "categoryId":
                this.categoryId = value;
                break;
            case "quantity":
                this.quantity = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setNetworkFee(RuntimeEnv env, Object... args) {
        Object networkFee = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_EventProducts.class, "networkFee", networkFee);

        return null;
    }

    public Object getNetworkFee(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_EventProducts.class, "networkFee"));
    }

    public Object setSku(RuntimeEnv env, Object... args) {
        Object sku = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_EventProducts.class, "sku", sku);

        return null;
    }

    public Object getSku(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_EventProducts.class, "sku"));
    }

    public Object setCategoryName(RuntimeEnv env, Object... args) {
        Object categoryName = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_EventProducts.class, "categoryName", categoryName);

        return null;
    }

    public Object getCategoryName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_EventProducts.class, "categoryName"));
    }

    public Object setSkuName(RuntimeEnv env, Object... args) {
        Object skuName = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_EventProducts.class, "skuName", skuName);

        return null;
    }

    public Object getSkuName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_EventProducts.class, "skuName"));
    }

    public Object setPublisherFee(RuntimeEnv env, Object... args) {
        Object publisherFee = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_EventProducts.class, "publisherFee", publisherFee);

        return null;
    }

    public Object getPublisherFee(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_EventProducts.class, "publisherFee"));
    }

    public Object setEarnings(RuntimeEnv env, Object... args) {
        Object earnings = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_EventProducts.class, "earnings", earnings);

        return null;
    }

    public Object getEarnings(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_EventProducts.class, "earnings"));
    }

    public Object setUnitPrice(RuntimeEnv env, Object... args) {
        Object unitPrice = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_EventProducts.class, "unitPrice", unitPrice);

        return null;
    }

    public Object getUnitPrice(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_EventProducts.class, "unitPrice"));
    }

    public Object setCategoryId(RuntimeEnv env, Object... args) {
        Object categoryId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_EventProducts.class, "categoryId", categoryId);

        return null;
    }

    public Object getCategoryId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_EventProducts.class, "categoryId"));
    }

    public Object setQuantity(RuntimeEnv env, Object... args) {
        Object quantity = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_EventProducts.class, "quantity", quantity);

        return null;
    }

    public Object getQuantity(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_EventProducts.class, "quantity"));
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
