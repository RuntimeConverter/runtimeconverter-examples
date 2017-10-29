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

 google-api-php-client/src/contrib/Google_AdexchangebuyerService.php

*/

public class Google_Creative extends Google_Model implements RuntimeFileContextInterface {

    public Object productCategories = null;

    public Object advertiserName = null;

    public Object adgroupId = null;

    public Object videoURL = null;

    public Object width = null;

    public Object attribute = null;

    public Object kind = null;

    public Object height = null;

    public Object advertiserId = null;

    public Object HTMLSnippet = null;

    public Object status = null;

    public Object buyerCreativeId = null;

    public Object clickThroughUrl = null;

    public Object vendorType = null;

    public Object disapprovalReasons = null;

    public Object sensitiveCategories = null;

    public Object accountId = null;

    public Google_Creative(RuntimeEnv env, Object... args) {
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
            case "setProductCategories":
                return this.setProductCategories(env, args);
            case "getProductCategories":
                return this.getProductCategories(env, args);
            case "setAdvertiserName":
                return this.setAdvertiserName(env, args);
            case "getAdvertiserName":
                return this.getAdvertiserName(env, args);
            case "setAdgroupId":
                return this.setAdgroupId(env, args);
            case "getAdgroupId":
                return this.getAdgroupId(env, args);
            case "setVideoURL":
                return this.setVideoURL(env, args);
            case "getVideoURL":
                return this.getVideoURL(env, args);
            case "setWidth":
                return this.setWidth(env, args);
            case "getWidth":
                return this.getWidth(env, args);
            case "setAttribute":
                return this.setAttribute(env, args);
            case "getAttribute":
                return this.getAttribute(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setHeight":
                return this.setHeight(env, args);
            case "getHeight":
                return this.getHeight(env, args);
            case "setAdvertiserId":
                return this.setAdvertiserId(env, args);
            case "getAdvertiserId":
                return this.getAdvertiserId(env, args);
            case "setHTMLSnippet":
                return this.setHTMLSnippet(env, args);
            case "getHTMLSnippet":
                return this.getHTMLSnippet(env, args);
            case "setStatus":
                return this.setStatus(env, args);
            case "getStatus":
                return this.getStatus(env, args);
            case "setBuyerCreativeId":
                return this.setBuyerCreativeId(env, args);
            case "getBuyerCreativeId":
                return this.getBuyerCreativeId(env, args);
            case "setClickThroughUrl":
                return this.setClickThroughUrl(env, args);
            case "getClickThroughUrl":
                return this.getClickThroughUrl(env, args);
            case "setVendorType":
                return this.setVendorType(env, args);
            case "getVendorType":
                return this.getVendorType(env, args);
            case "setDisapprovalReasons":
                return this.setDisapprovalReasons(env, args);
            case "getDisapprovalReasons":
                return this.getDisapprovalReasons(env, args);
            case "setSensitiveCategories":
                return this.setSensitiveCategories(env, args);
            case "getSensitiveCategories":
                return this.getSensitiveCategories(env, args);
            case "setAccountId":
                return this.setAccountId(env, args);
            case "getAccountId":
                return this.getAccountId(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "productCategories":
                return this.productCategories;
            case "advertiserName":
                return this.advertiserName;
            case "adgroupId":
                return this.adgroupId;
            case "videoURL":
                return this.videoURL;
            case "width":
                return this.width;
            case "attribute":
                return this.attribute;
            case "kind":
                return this.kind;
            case "height":
                return this.height;
            case "advertiserId":
                return this.advertiserId;
            case "HTMLSnippet":
                return this.HTMLSnippet;
            case "status":
                return this.status;
            case "buyerCreativeId":
                return this.buyerCreativeId;
            case "clickThroughUrl":
                return this.clickThroughUrl;
            case "vendorType":
                return this.vendorType;
            case "disapprovalReasons":
                return this.disapprovalReasons;
            case "sensitiveCategories":
                return this.sensitiveCategories;
            case "accountId":
                return this.accountId;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "productCategories":
                return ZVal.isNull(this.productCategories);
            case "advertiserName":
                return ZVal.isNull(this.advertiserName);
            case "adgroupId":
                return ZVal.isNull(this.adgroupId);
            case "videoURL":
                return ZVal.isNull(this.videoURL);
            case "width":
                return ZVal.isNull(this.width);
            case "attribute":
                return ZVal.isNull(this.attribute);
            case "kind":
                return ZVal.isNull(this.kind);
            case "height":
                return ZVal.isNull(this.height);
            case "advertiserId":
                return ZVal.isNull(this.advertiserId);
            case "HTMLSnippet":
                return ZVal.isNull(this.HTMLSnippet);
            case "status":
                return ZVal.isNull(this.status);
            case "buyerCreativeId":
                return ZVal.isNull(this.buyerCreativeId);
            case "clickThroughUrl":
                return ZVal.isNull(this.clickThroughUrl);
            case "vendorType":
                return ZVal.isNull(this.vendorType);
            case "disapprovalReasons":
                return ZVal.isNull(this.disapprovalReasons);
            case "sensitiveCategories":
                return ZVal.isNull(this.sensitiveCategories);
            case "accountId":
                return ZVal.isNull(this.accountId);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "productCategories":
                this.productCategories = value;
                break;
            case "advertiserName":
                this.advertiserName = value;
                break;
            case "adgroupId":
                this.adgroupId = value;
                break;
            case "videoURL":
                this.videoURL = value;
                break;
            case "width":
                this.width = value;
                break;
            case "attribute":
                this.attribute = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "height":
                this.height = value;
                break;
            case "advertiserId":
                this.advertiserId = value;
                break;
            case "HTMLSnippet":
                this.HTMLSnippet = value;
                break;
            case "status":
                this.status = value;
                break;
            case "buyerCreativeId":
                this.buyerCreativeId = value;
                break;
            case "clickThroughUrl":
                this.clickThroughUrl = value;
                break;
            case "vendorType":
                this.vendorType = value;
                break;
            case "disapprovalReasons":
                this.disapprovalReasons = value;
                break;
            case "sensitiveCategories":
                this.sensitiveCategories = value;
                break;
            case "accountId":
                this.accountId = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setProductCategories(RuntimeEnv env, Object... args) {
        Object productCategories = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Creative.class, "productCategories", productCategories);

        return null;
    }

    public Object getProductCategories(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Creative.class, "productCategories"));
    }

    public Object setAdvertiserName(RuntimeEnv env, Object... args) {
        Object advertiserName = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Creative.class, "advertiserName", advertiserName);

        return null;
    }

    public Object getAdvertiserName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Creative.class, "advertiserName"));
    }

    public Object setAdgroupId(RuntimeEnv env, Object... args) {
        Object adgroupId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Creative.class, "adgroupId", adgroupId);

        return null;
    }

    public Object getAdgroupId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Creative.class, "adgroupId"));
    }

    public Object setVideoURL(RuntimeEnv env, Object... args) {
        Object videoURL = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Creative.class, "videoURL", videoURL);

        return null;
    }

    public Object getVideoURL(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Creative.class, "videoURL"));
    }

    public Object setWidth(RuntimeEnv env, Object... args) {
        Object width = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Creative.class, "width", width);

        return null;
    }

    public Object getWidth(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Creative.class, "width"));
    }

    public Object setAttribute(RuntimeEnv env, Object... args) {
        Object attribute = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Creative.class, "attribute", attribute);

        return null;
    }

    public Object getAttribute(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Creative.class, "attribute"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Creative.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Creative.class, "kind"));
    }

    public Object setHeight(RuntimeEnv env, Object... args) {
        Object height = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Creative.class, "height", height);

        return null;
    }

    public Object getHeight(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Creative.class, "height"));
    }

    public Object setAdvertiserId(RuntimeEnv env, Object... args) {
        Object advertiserId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Creative.class, "advertiserId", advertiserId);

        return null;
    }

    public Object getAdvertiserId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Creative.class, "advertiserId"));
    }

    public Object setHTMLSnippet(RuntimeEnv env, Object... args) {
        Object HTMLSnippet = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Creative.class, "HTMLSnippet", HTMLSnippet);

        return null;
    }

    public Object getHTMLSnippet(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Creative.class, "HTMLSnippet"));
    }

    public Object setStatus(RuntimeEnv env, Object... args) {
        Object status = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Creative.class, "status", status);

        return null;
    }

    public Object getStatus(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Creative.class, "status"));
    }

    public Object setBuyerCreativeId(RuntimeEnv env, Object... args) {
        Object buyerCreativeId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Creative.class, "buyerCreativeId", buyerCreativeId);

        return null;
    }

    public Object getBuyerCreativeId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Creative.class, "buyerCreativeId"));
    }

    public Object setClickThroughUrl(RuntimeEnv env, Object... args) {
        Object clickThroughUrl = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Creative.class, "clickThroughUrl", clickThroughUrl);

        return null;
    }

    public Object getClickThroughUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Creative.class, "clickThroughUrl"));
    }

    public Object setVendorType(RuntimeEnv env, Object... args) {
        Object vendorType = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Creative.class, "vendorType", vendorType);

        return null;
    }

    public Object getVendorType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Creative.class, "vendorType"));
    }

    public Object setDisapprovalReasons(RuntimeEnv env, Object... args) {
        Object disapprovalReasons = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Creative.class, "disapprovalReasons", disapprovalReasons);

        return null;
    }

    public Object getDisapprovalReasons(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Creative.class, "disapprovalReasons"));
    }

    public Object setSensitiveCategories(RuntimeEnv env, Object... args) {
        Object sensitiveCategories = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Creative.class, "sensitiveCategories", sensitiveCategories);

        return null;
    }

    public Object getSensitiveCategories(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Creative.class, "sensitiveCategories"));
    }

    public Object setAccountId(RuntimeEnv env, Object... args) {
        Object accountId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Creative.class, "accountId", accountId);

        return null;
    }

    public Object getAccountId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Creative.class, "accountId"));
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
