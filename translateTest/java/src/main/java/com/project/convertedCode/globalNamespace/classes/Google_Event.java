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

public class Google_Event extends Google_Model implements RuntimeFileContextInterface {

    public Object __networkFeeType = "Google_Money";

    public Object __networkFeeDataType = "";

    public Object networkFee = null;

    public Object advertiserName = null;

    public Object kind = null;

    public Object modifyDate = null;

    public Object type = null;

    public Object orderId = null;

    public Object publisherName = null;

    public Object memberId = null;

    public Object advertiserId = null;

    public Object status = null;

    public Object chargeId = null;

    public Object __productsType = "Google_EventProducts";

    public Object __productsDataType = "array";

    public Object products = null;

    public Object __earningsType = "Google_Money";

    public Object __earningsDataType = "";

    public Object earnings = null;

    public Object chargeType = null;

    public Object __publisherFeeType = "Google_Money";

    public Object __publisherFeeDataType = "";

    public Object publisherFee = null;

    public Object __commissionableSalesType = "Google_Money";

    public Object __commissionableSalesDataType = "";

    public Object commissionableSales = null;

    public Object publisherId = null;

    public Object eventDate = null;

    public Google_Event(RuntimeEnv env, Object... args) {
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
            case "setAdvertiserName":
                return this.setAdvertiserName(env, args);
            case "getAdvertiserName":
                return this.getAdvertiserName(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setModifyDate":
                return this.setModifyDate(env, args);
            case "getModifyDate":
                return this.getModifyDate(env, args);
            case "setType":
                return this.setType(env, args);
            case "getType":
                return this.getType(env, args);
            case "setOrderId":
                return this.setOrderId(env, args);
            case "getOrderId":
                return this.getOrderId(env, args);
            case "setPublisherName":
                return this.setPublisherName(env, args);
            case "getPublisherName":
                return this.getPublisherName(env, args);
            case "setMemberId":
                return this.setMemberId(env, args);
            case "getMemberId":
                return this.getMemberId(env, args);
            case "setAdvertiserId":
                return this.setAdvertiserId(env, args);
            case "getAdvertiserId":
                return this.getAdvertiserId(env, args);
            case "setStatus":
                return this.setStatus(env, args);
            case "getStatus":
                return this.getStatus(env, args);
            case "setChargeId":
                return this.setChargeId(env, args);
            case "getChargeId":
                return this.getChargeId(env, args);
            case "setProducts":
                return this.setProducts(env, args);
            case "getProducts":
                return this.getProducts(env, args);
            case "setEarnings":
                return this.setEarnings(env, args);
            case "getEarnings":
                return this.getEarnings(env, args);
            case "setChargeType":
                return this.setChargeType(env, args);
            case "getChargeType":
                return this.getChargeType(env, args);
            case "setPublisherFee":
                return this.setPublisherFee(env, args);
            case "getPublisherFee":
                return this.getPublisherFee(env, args);
            case "setCommissionableSales":
                return this.setCommissionableSales(env, args);
            case "getCommissionableSales":
                return this.getCommissionableSales(env, args);
            case "setPublisherId":
                return this.setPublisherId(env, args);
            case "getPublisherId":
                return this.getPublisherId(env, args);
            case "setEventDate":
                return this.setEventDate(env, args);
            case "getEventDate":
                return this.getEventDate(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__networkFeeType":
                if (Google_Event.class.isAssignableFrom(caller)) {

                    return this.__networkFeeType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__networkFeeDataType":
                if (Google_Event.class.isAssignableFrom(caller)) {

                    return this.__networkFeeDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "networkFee":
                return this.networkFee;
            case "advertiserName":
                return this.advertiserName;
            case "kind":
                return this.kind;
            case "modifyDate":
                return this.modifyDate;
            case "type":
                return this.type;
            case "orderId":
                return this.orderId;
            case "publisherName":
                return this.publisherName;
            case "memberId":
                return this.memberId;
            case "advertiserId":
                return this.advertiserId;
            case "status":
                return this.status;
            case "chargeId":
                return this.chargeId;
            case "__productsType":
                if (Google_Event.class.isAssignableFrom(caller)) {

                    return this.__productsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__productsDataType":
                if (Google_Event.class.isAssignableFrom(caller)) {

                    return this.__productsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "products":
                return this.products;
            case "__earningsType":
                if (Google_Event.class.isAssignableFrom(caller)) {

                    return this.__earningsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__earningsDataType":
                if (Google_Event.class.isAssignableFrom(caller)) {

                    return this.__earningsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "earnings":
                return this.earnings;
            case "chargeType":
                return this.chargeType;
            case "__publisherFeeType":
                if (Google_Event.class.isAssignableFrom(caller)) {

                    return this.__publisherFeeType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__publisherFeeDataType":
                if (Google_Event.class.isAssignableFrom(caller)) {

                    return this.__publisherFeeDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "publisherFee":
                return this.publisherFee;
            case "__commissionableSalesType":
                if (Google_Event.class.isAssignableFrom(caller)) {

                    return this.__commissionableSalesType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__commissionableSalesDataType":
                if (Google_Event.class.isAssignableFrom(caller)) {

                    return this.__commissionableSalesDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "commissionableSales":
                return this.commissionableSales;
            case "publisherId":
                return this.publisherId;
            case "eventDate":
                return this.eventDate;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__networkFeeType":
                if (Google_Event.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__networkFeeType);
                }
                break;
            case "__networkFeeDataType":
                if (Google_Event.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__networkFeeDataType);
                }
                break;
            case "networkFee":
                return ZVal.isNull(this.networkFee);
            case "advertiserName":
                return ZVal.isNull(this.advertiserName);
            case "kind":
                return ZVal.isNull(this.kind);
            case "modifyDate":
                return ZVal.isNull(this.modifyDate);
            case "type":
                return ZVal.isNull(this.type);
            case "orderId":
                return ZVal.isNull(this.orderId);
            case "publisherName":
                return ZVal.isNull(this.publisherName);
            case "memberId":
                return ZVal.isNull(this.memberId);
            case "advertiserId":
                return ZVal.isNull(this.advertiserId);
            case "status":
                return ZVal.isNull(this.status);
            case "chargeId":
                return ZVal.isNull(this.chargeId);
            case "__productsType":
                if (Google_Event.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__productsType);
                }
                break;
            case "__productsDataType":
                if (Google_Event.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__productsDataType);
                }
                break;
            case "products":
                return ZVal.isNull(this.products);
            case "__earningsType":
                if (Google_Event.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__earningsType);
                }
                break;
            case "__earningsDataType":
                if (Google_Event.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__earningsDataType);
                }
                break;
            case "earnings":
                return ZVal.isNull(this.earnings);
            case "chargeType":
                return ZVal.isNull(this.chargeType);
            case "__publisherFeeType":
                if (Google_Event.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__publisherFeeType);
                }
                break;
            case "__publisherFeeDataType":
                if (Google_Event.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__publisherFeeDataType);
                }
                break;
            case "publisherFee":
                return ZVal.isNull(this.publisherFee);
            case "__commissionableSalesType":
                if (Google_Event.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__commissionableSalesType);
                }
                break;
            case "__commissionableSalesDataType":
                if (Google_Event.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__commissionableSalesDataType);
                }
                break;
            case "commissionableSales":
                return ZVal.isNull(this.commissionableSales);
            case "publisherId":
                return ZVal.isNull(this.publisherId);
            case "eventDate":
                return ZVal.isNull(this.eventDate);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__networkFeeType":
                if (Google_Event.class.isAssignableFrom(caller)) {

                    this.__networkFeeType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__networkFeeDataType":
                if (Google_Event.class.isAssignableFrom(caller)) {

                    this.__networkFeeDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "networkFee":
                this.networkFee = value;
                break;
            case "advertiserName":
                this.advertiserName = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "modifyDate":
                this.modifyDate = value;
                break;
            case "type":
                this.type = value;
                break;
            case "orderId":
                this.orderId = value;
                break;
            case "publisherName":
                this.publisherName = value;
                break;
            case "memberId":
                this.memberId = value;
                break;
            case "advertiserId":
                this.advertiserId = value;
                break;
            case "status":
                this.status = value;
                break;
            case "chargeId":
                this.chargeId = value;
                break;
            case "__productsType":
                if (Google_Event.class.isAssignableFrom(caller)) {

                    this.__productsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__productsDataType":
                if (Google_Event.class.isAssignableFrom(caller)) {

                    this.__productsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "products":
                this.products = value;
                break;
            case "__earningsType":
                if (Google_Event.class.isAssignableFrom(caller)) {

                    this.__earningsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__earningsDataType":
                if (Google_Event.class.isAssignableFrom(caller)) {

                    this.__earningsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "earnings":
                this.earnings = value;
                break;
            case "chargeType":
                this.chargeType = value;
                break;
            case "__publisherFeeType":
                if (Google_Event.class.isAssignableFrom(caller)) {

                    this.__publisherFeeType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__publisherFeeDataType":
                if (Google_Event.class.isAssignableFrom(caller)) {

                    this.__publisherFeeDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "publisherFee":
                this.publisherFee = value;
                break;
            case "__commissionableSalesType":
                if (Google_Event.class.isAssignableFrom(caller)) {

                    this.__commissionableSalesType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__commissionableSalesDataType":
                if (Google_Event.class.isAssignableFrom(caller)) {

                    this.__commissionableSalesDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "commissionableSales":
                this.commissionableSales = value;
                break;
            case "publisherId":
                this.publisherId = value;
                break;
            case "eventDate":
                this.eventDate = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setNetworkFee(RuntimeEnv env, Object... args) {
        Object networkFee = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Event.class, "networkFee", networkFee);

        return null;
    }

    public Object getNetworkFee(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Event.class, "networkFee"));
    }

    public Object setAdvertiserName(RuntimeEnv env, Object... args) {
        Object advertiserName = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Event.class, "advertiserName", advertiserName);

        return null;
    }

    public Object getAdvertiserName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Event.class, "advertiserName"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Event.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Event.class, "kind"));
    }

    public Object setModifyDate(RuntimeEnv env, Object... args) {
        Object modifyDate = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Event.class, "modifyDate", modifyDate);

        return null;
    }

    public Object getModifyDate(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Event.class, "modifyDate"));
    }

    public Object setType(RuntimeEnv env, Object... args) {
        Object type = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Event.class, "type", type);

        return null;
    }

    public Object getType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Event.class, "type"));
    }

    public Object setOrderId(RuntimeEnv env, Object... args) {
        Object orderId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Event.class, "orderId", orderId);

        return null;
    }

    public Object getOrderId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Event.class, "orderId"));
    }

    public Object setPublisherName(RuntimeEnv env, Object... args) {
        Object publisherName = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Event.class, "publisherName", publisherName);

        return null;
    }

    public Object getPublisherName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Event.class, "publisherName"));
    }

    public Object setMemberId(RuntimeEnv env, Object... args) {
        Object memberId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Event.class, "memberId", memberId);

        return null;
    }

    public Object getMemberId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Event.class, "memberId"));
    }

    public Object setAdvertiserId(RuntimeEnv env, Object... args) {
        Object advertiserId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Event.class, "advertiserId", advertiserId);

        return null;
    }

    public Object getAdvertiserId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Event.class, "advertiserId"));
    }

    public Object setStatus(RuntimeEnv env, Object... args) {
        Object status = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Event.class, "status", status);

        return null;
    }

    public Object getStatus(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Event.class, "status"));
    }

    public Object setChargeId(RuntimeEnv env, Object... args) {
        Object chargeId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Event.class, "chargeId", chargeId);

        return null;
    }

    public Object getChargeId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Event.class, "chargeId"));
    }

    public Object setProducts(RuntimeEnv env, Object... args) {
        Object products = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Event.class,
                products,
                "Google_EventProducts",
                "setProducts");
        ZVal.setProperty(this, Google_Event.class, "products", products);

        return null;
    }

    public Object getProducts(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Event.class, "products"));
    }

    public Object setEarnings(RuntimeEnv env, Object... args) {
        Object earnings = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Event.class, "earnings", earnings);

        return null;
    }

    public Object getEarnings(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Event.class, "earnings"));
    }

    public Object setChargeType(RuntimeEnv env, Object... args) {
        Object chargeType = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Event.class, "chargeType", chargeType);

        return null;
    }

    public Object getChargeType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Event.class, "chargeType"));
    }

    public Object setPublisherFee(RuntimeEnv env, Object... args) {
        Object publisherFee = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Event.class, "publisherFee", publisherFee);

        return null;
    }

    public Object getPublisherFee(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Event.class, "publisherFee"));
    }

    public Object setCommissionableSales(RuntimeEnv env, Object... args) {
        Object commissionableSales = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Event.class, "commissionableSales", commissionableSales);

        return null;
    }

    public Object getCommissionableSales(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Event.class, "commissionableSales"));
    }

    public Object setPublisherId(RuntimeEnv env, Object... args) {
        Object publisherId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Event.class, "publisherId", publisherId);

        return null;
    }

    public Object getPublisherId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Event.class, "publisherId"));
    }

    public Object setEventDate(RuntimeEnv env, Object... args) {
        Object eventDate = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Event.class, "eventDate", eventDate);

        return null;
    }

    public Object getEventDate(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Event.class, "eventDate"));
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
