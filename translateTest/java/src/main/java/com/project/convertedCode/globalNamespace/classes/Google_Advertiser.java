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

public class Google_Advertiser extends Google_Model implements RuntimeFileContextInterface {

    public Object category = null;

    public Object contactEmail = null;

    public Object kind = null;

    public Object siteUrl = null;

    public Object contactPhone = null;

    public Object description = null;

    public Object payoutRank = null;

    public Object defaultLinkId = null;

    public Object __epcSevenDayAverageType = "Google_Money";

    public Object __epcSevenDayAverageDataType = "";

    public Object epcSevenDayAverage = null;

    public Object commissionDuration = null;

    public Object status = null;

    public Object __epcNinetyDayAverageType = "Google_Money";

    public Object __epcNinetyDayAverageDataType = "";

    public Object epcNinetyDayAverage = null;

    public Object allowPublisherCreatedLinks = null;

    public Object __itemType = "Google_Advertiser";

    public Object __itemDataType = "";

    public Object item = null;

    public Object joinDate = null;

    public Object logoUrl = null;

    public Object id = null;

    public Object productFeedsEnabled = null;

    public Object name = null;

    public Google_Advertiser(RuntimeEnv env, Object... args) {
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
            case "setCategory":
                return this.setCategory(env, args);
            case "getCategory":
                return this.getCategory(env, args);
            case "setContactEmail":
                return this.setContactEmail(env, args);
            case "getContactEmail":
                return this.getContactEmail(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setSiteUrl":
                return this.setSiteUrl(env, args);
            case "getSiteUrl":
                return this.getSiteUrl(env, args);
            case "setContactPhone":
                return this.setContactPhone(env, args);
            case "getContactPhone":
                return this.getContactPhone(env, args);
            case "setDescription":
                return this.setDescription(env, args);
            case "getDescription":
                return this.getDescription(env, args);
            case "setPayoutRank":
                return this.setPayoutRank(env, args);
            case "getPayoutRank":
                return this.getPayoutRank(env, args);
            case "setDefaultLinkId":
                return this.setDefaultLinkId(env, args);
            case "getDefaultLinkId":
                return this.getDefaultLinkId(env, args);
            case "setEpcSevenDayAverage":
                return this.setEpcSevenDayAverage(env, args);
            case "getEpcSevenDayAverage":
                return this.getEpcSevenDayAverage(env, args);
            case "setCommissionDuration":
                return this.setCommissionDuration(env, args);
            case "getCommissionDuration":
                return this.getCommissionDuration(env, args);
            case "setStatus":
                return this.setStatus(env, args);
            case "getStatus":
                return this.getStatus(env, args);
            case "setEpcNinetyDayAverage":
                return this.setEpcNinetyDayAverage(env, args);
            case "getEpcNinetyDayAverage":
                return this.getEpcNinetyDayAverage(env, args);
            case "setAllowPublisherCreatedLinks":
                return this.setAllowPublisherCreatedLinks(env, args);
            case "getAllowPublisherCreatedLinks":
                return this.getAllowPublisherCreatedLinks(env, args);
            case "setItem":
                return this.setItem(env, args);
            case "getItem":
                return this.getItem(env, args);
            case "setJoinDate":
                return this.setJoinDate(env, args);
            case "getJoinDate":
                return this.getJoinDate(env, args);
            case "setLogoUrl":
                return this.setLogoUrl(env, args);
            case "getLogoUrl":
                return this.getLogoUrl(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setProductFeedsEnabled":
                return this.setProductFeedsEnabled(env, args);
            case "getProductFeedsEnabled":
                return this.getProductFeedsEnabled(env, args);
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
            case "category":
                return this.category;
            case "contactEmail":
                return this.contactEmail;
            case "kind":
                return this.kind;
            case "siteUrl":
                return this.siteUrl;
            case "contactPhone":
                return this.contactPhone;
            case "description":
                return this.description;
            case "payoutRank":
                return this.payoutRank;
            case "defaultLinkId":
                return this.defaultLinkId;
            case "__epcSevenDayAverageType":
                if (Google_Advertiser.class.isAssignableFrom(caller)) {

                    return this.__epcSevenDayAverageType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__epcSevenDayAverageDataType":
                if (Google_Advertiser.class.isAssignableFrom(caller)) {

                    return this.__epcSevenDayAverageDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "epcSevenDayAverage":
                return this.epcSevenDayAverage;
            case "commissionDuration":
                return this.commissionDuration;
            case "status":
                return this.status;
            case "__epcNinetyDayAverageType":
                if (Google_Advertiser.class.isAssignableFrom(caller)) {

                    return this.__epcNinetyDayAverageType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__epcNinetyDayAverageDataType":
                if (Google_Advertiser.class.isAssignableFrom(caller)) {

                    return this.__epcNinetyDayAverageDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "epcNinetyDayAverage":
                return this.epcNinetyDayAverage;
            case "allowPublisherCreatedLinks":
                return this.allowPublisherCreatedLinks;
            case "__itemType":
                if (Google_Advertiser.class.isAssignableFrom(caller)) {

                    return this.__itemType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__itemDataType":
                if (Google_Advertiser.class.isAssignableFrom(caller)) {

                    return this.__itemDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "item":
                return this.item;
            case "joinDate":
                return this.joinDate;
            case "logoUrl":
                return this.logoUrl;
            case "id":
                return this.id;
            case "productFeedsEnabled":
                return this.productFeedsEnabled;
            case "name":
                return this.name;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "category":
                return ZVal.isNull(this.category);
            case "contactEmail":
                return ZVal.isNull(this.contactEmail);
            case "kind":
                return ZVal.isNull(this.kind);
            case "siteUrl":
                return ZVal.isNull(this.siteUrl);
            case "contactPhone":
                return ZVal.isNull(this.contactPhone);
            case "description":
                return ZVal.isNull(this.description);
            case "payoutRank":
                return ZVal.isNull(this.payoutRank);
            case "defaultLinkId":
                return ZVal.isNull(this.defaultLinkId);
            case "__epcSevenDayAverageType":
                if (Google_Advertiser.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__epcSevenDayAverageType);
                }
                break;
            case "__epcSevenDayAverageDataType":
                if (Google_Advertiser.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__epcSevenDayAverageDataType);
                }
                break;
            case "epcSevenDayAverage":
                return ZVal.isNull(this.epcSevenDayAverage);
            case "commissionDuration":
                return ZVal.isNull(this.commissionDuration);
            case "status":
                return ZVal.isNull(this.status);
            case "__epcNinetyDayAverageType":
                if (Google_Advertiser.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__epcNinetyDayAverageType);
                }
                break;
            case "__epcNinetyDayAverageDataType":
                if (Google_Advertiser.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__epcNinetyDayAverageDataType);
                }
                break;
            case "epcNinetyDayAverage":
                return ZVal.isNull(this.epcNinetyDayAverage);
            case "allowPublisherCreatedLinks":
                return ZVal.isNull(this.allowPublisherCreatedLinks);
            case "__itemType":
                if (Google_Advertiser.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__itemType);
                }
                break;
            case "__itemDataType":
                if (Google_Advertiser.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__itemDataType);
                }
                break;
            case "item":
                return ZVal.isNull(this.item);
            case "joinDate":
                return ZVal.isNull(this.joinDate);
            case "logoUrl":
                return ZVal.isNull(this.logoUrl);
            case "id":
                return ZVal.isNull(this.id);
            case "productFeedsEnabled":
                return ZVal.isNull(this.productFeedsEnabled);
            case "name":
                return ZVal.isNull(this.name);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "category":
                this.category = value;
                break;
            case "contactEmail":
                this.contactEmail = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "siteUrl":
                this.siteUrl = value;
                break;
            case "contactPhone":
                this.contactPhone = value;
                break;
            case "description":
                this.description = value;
                break;
            case "payoutRank":
                this.payoutRank = value;
                break;
            case "defaultLinkId":
                this.defaultLinkId = value;
                break;
            case "__epcSevenDayAverageType":
                if (Google_Advertiser.class.isAssignableFrom(caller)) {

                    this.__epcSevenDayAverageType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__epcSevenDayAverageDataType":
                if (Google_Advertiser.class.isAssignableFrom(caller)) {

                    this.__epcSevenDayAverageDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "epcSevenDayAverage":
                this.epcSevenDayAverage = value;
                break;
            case "commissionDuration":
                this.commissionDuration = value;
                break;
            case "status":
                this.status = value;
                break;
            case "__epcNinetyDayAverageType":
                if (Google_Advertiser.class.isAssignableFrom(caller)) {

                    this.__epcNinetyDayAverageType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__epcNinetyDayAverageDataType":
                if (Google_Advertiser.class.isAssignableFrom(caller)) {

                    this.__epcNinetyDayAverageDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "epcNinetyDayAverage":
                this.epcNinetyDayAverage = value;
                break;
            case "allowPublisherCreatedLinks":
                this.allowPublisherCreatedLinks = value;
                break;
            case "__itemType":
                if (Google_Advertiser.class.isAssignableFrom(caller)) {

                    this.__itemType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__itemDataType":
                if (Google_Advertiser.class.isAssignableFrom(caller)) {

                    this.__itemDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "item":
                this.item = value;
                break;
            case "joinDate":
                this.joinDate = value;
                break;
            case "logoUrl":
                this.logoUrl = value;
                break;
            case "id":
                this.id = value;
                break;
            case "productFeedsEnabled":
                this.productFeedsEnabled = value;
                break;
            case "name":
                this.name = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setCategory(RuntimeEnv env, Object... args) {
        Object category = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Advertiser.class, "category", category);

        return null;
    }

    public Object getCategory(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Advertiser.class, "category"));
    }

    public Object setContactEmail(RuntimeEnv env, Object... args) {
        Object contactEmail = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Advertiser.class, "contactEmail", contactEmail);

        return null;
    }

    public Object getContactEmail(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Advertiser.class, "contactEmail"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Advertiser.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Advertiser.class, "kind"));
    }

    public Object setSiteUrl(RuntimeEnv env, Object... args) {
        Object siteUrl = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Advertiser.class, "siteUrl", siteUrl);

        return null;
    }

    public Object getSiteUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Advertiser.class, "siteUrl"));
    }

    public Object setContactPhone(RuntimeEnv env, Object... args) {
        Object contactPhone = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Advertiser.class, "contactPhone", contactPhone);

        return null;
    }

    public Object getContactPhone(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Advertiser.class, "contactPhone"));
    }

    public Object setDescription(RuntimeEnv env, Object... args) {
        Object description = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Advertiser.class, "description", description);

        return null;
    }

    public Object getDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Advertiser.class, "description"));
    }

    public Object setPayoutRank(RuntimeEnv env, Object... args) {
        Object payoutRank = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Advertiser.class, "payoutRank", payoutRank);

        return null;
    }

    public Object getPayoutRank(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Advertiser.class, "payoutRank"));
    }

    public Object setDefaultLinkId(RuntimeEnv env, Object... args) {
        Object defaultLinkId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Advertiser.class, "defaultLinkId", defaultLinkId);

        return null;
    }

    public Object getDefaultLinkId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Advertiser.class, "defaultLinkId"));
    }

    public Object setEpcSevenDayAverage(RuntimeEnv env, Object... args) {
        Object epcSevenDayAverage = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Advertiser.class, "epcSevenDayAverage", epcSevenDayAverage);

        return null;
    }

    public Object getEpcSevenDayAverage(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Advertiser.class, "epcSevenDayAverage"));
    }

    public Object setCommissionDuration(RuntimeEnv env, Object... args) {
        Object commissionDuration = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Advertiser.class, "commissionDuration", commissionDuration);

        return null;
    }

    public Object getCommissionDuration(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Advertiser.class, "commissionDuration"));
    }

    public Object setStatus(RuntimeEnv env, Object... args) {
        Object status = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Advertiser.class, "status", status);

        return null;
    }

    public Object getStatus(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Advertiser.class, "status"));
    }

    public Object setEpcNinetyDayAverage(RuntimeEnv env, Object... args) {
        Object epcNinetyDayAverage = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Advertiser.class, "epcNinetyDayAverage", epcNinetyDayAverage);

        return null;
    }

    public Object getEpcNinetyDayAverage(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Advertiser.class, "epcNinetyDayAverage"));
    }

    public Object setAllowPublisherCreatedLinks(RuntimeEnv env, Object... args) {
        Object allowPublisherCreatedLinks = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_Advertiser.class,
                "allowPublisherCreatedLinks",
                allowPublisherCreatedLinks);

        return null;
    }

    public Object getAllowPublisherCreatedLinks(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_Advertiser.class, "allowPublisherCreatedLinks"));
    }

    public Object setItem(RuntimeEnv env, Object... args) {
        Object item = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Advertiser.class, "item", item);

        return null;
    }

    public Object getItem(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Advertiser.class, "item"));
    }

    public Object setJoinDate(RuntimeEnv env, Object... args) {
        Object joinDate = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Advertiser.class, "joinDate", joinDate);

        return null;
    }

    public Object getJoinDate(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Advertiser.class, "joinDate"));
    }

    public Object setLogoUrl(RuntimeEnv env, Object... args) {
        Object logoUrl = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Advertiser.class, "logoUrl", logoUrl);

        return null;
    }

    public Object getLogoUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Advertiser.class, "logoUrl"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Advertiser.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Advertiser.class, "id"));
    }

    public Object setProductFeedsEnabled(RuntimeEnv env, Object... args) {
        Object productFeedsEnabled = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Advertiser.class, "productFeedsEnabled", productFeedsEnabled);

        return null;
    }

    public Object getProductFeedsEnabled(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Advertiser.class, "productFeedsEnabled"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Advertiser.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Advertiser.class, "name"));
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
