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

public class Google_Link extends Google_Model implements RuntimeFileContextInterface {

    public Object isActive = null;

    public Object linkType = null;

    public Object kind = null;

    public Object endDate = null;

    public Object description = null;

    public Object name = null;

    public Object startDate = null;

    public Object createDate = null;

    public Object imageAltText = null;

    public Object id = null;

    public Object advertiserId = null;

    public Object impressionTrackingUrl = null;

    public Object promotionType = null;

    public Object duration = null;

    public Object authorship = null;

    public Object availability = null;

    public Object clickTrackingUrl = null;

    public Object destinationUrl = null;

    public Google_Link(RuntimeEnv env, Object... args) {
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
            case "setIsActive":
                return this.setIsActive(env, args);
            case "getIsActive":
                return this.getIsActive(env, args);
            case "setLinkType":
                return this.setLinkType(env, args);
            case "getLinkType":
                return this.getLinkType(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setEndDate":
                return this.setEndDate(env, args);
            case "getEndDate":
                return this.getEndDate(env, args);
            case "setDescription":
                return this.setDescription(env, args);
            case "getDescription":
                return this.getDescription(env, args);
            case "setName":
                return this.setName(env, args);
            case "getName":
                return this.getName(env, args);
            case "setStartDate":
                return this.setStartDate(env, args);
            case "getStartDate":
                return this.getStartDate(env, args);
            case "setCreateDate":
                return this.setCreateDate(env, args);
            case "getCreateDate":
                return this.getCreateDate(env, args);
            case "setImageAltText":
                return this.setImageAltText(env, args);
            case "getImageAltText":
                return this.getImageAltText(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setAdvertiserId":
                return this.setAdvertiserId(env, args);
            case "getAdvertiserId":
                return this.getAdvertiserId(env, args);
            case "setImpressionTrackingUrl":
                return this.setImpressionTrackingUrl(env, args);
            case "getImpressionTrackingUrl":
                return this.getImpressionTrackingUrl(env, args);
            case "setPromotionType":
                return this.setPromotionType(env, args);
            case "getPromotionType":
                return this.getPromotionType(env, args);
            case "setDuration":
                return this.setDuration(env, args);
            case "getDuration":
                return this.getDuration(env, args);
            case "setAuthorship":
                return this.setAuthorship(env, args);
            case "getAuthorship":
                return this.getAuthorship(env, args);
            case "setAvailability":
                return this.setAvailability(env, args);
            case "getAvailability":
                return this.getAvailability(env, args);
            case "setClickTrackingUrl":
                return this.setClickTrackingUrl(env, args);
            case "getClickTrackingUrl":
                return this.getClickTrackingUrl(env, args);
            case "setDestinationUrl":
                return this.setDestinationUrl(env, args);
            case "getDestinationUrl":
                return this.getDestinationUrl(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "isActive":
                return this.isActive;
            case "linkType":
                return this.linkType;
            case "kind":
                return this.kind;
            case "endDate":
                return this.endDate;
            case "description":
                return this.description;
            case "name":
                return this.name;
            case "startDate":
                return this.startDate;
            case "createDate":
                return this.createDate;
            case "imageAltText":
                return this.imageAltText;
            case "id":
                return this.id;
            case "advertiserId":
                return this.advertiserId;
            case "impressionTrackingUrl":
                return this.impressionTrackingUrl;
            case "promotionType":
                return this.promotionType;
            case "duration":
                return this.duration;
            case "authorship":
                return this.authorship;
            case "availability":
                return this.availability;
            case "clickTrackingUrl":
                return this.clickTrackingUrl;
            case "destinationUrl":
                return this.destinationUrl;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "isActive":
                return ZVal.isNull(this.isActive);
            case "linkType":
                return ZVal.isNull(this.linkType);
            case "kind":
                return ZVal.isNull(this.kind);
            case "endDate":
                return ZVal.isNull(this.endDate);
            case "description":
                return ZVal.isNull(this.description);
            case "name":
                return ZVal.isNull(this.name);
            case "startDate":
                return ZVal.isNull(this.startDate);
            case "createDate":
                return ZVal.isNull(this.createDate);
            case "imageAltText":
                return ZVal.isNull(this.imageAltText);
            case "id":
                return ZVal.isNull(this.id);
            case "advertiserId":
                return ZVal.isNull(this.advertiserId);
            case "impressionTrackingUrl":
                return ZVal.isNull(this.impressionTrackingUrl);
            case "promotionType":
                return ZVal.isNull(this.promotionType);
            case "duration":
                return ZVal.isNull(this.duration);
            case "authorship":
                return ZVal.isNull(this.authorship);
            case "availability":
                return ZVal.isNull(this.availability);
            case "clickTrackingUrl":
                return ZVal.isNull(this.clickTrackingUrl);
            case "destinationUrl":
                return ZVal.isNull(this.destinationUrl);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "isActive":
                this.isActive = value;
                break;
            case "linkType":
                this.linkType = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "endDate":
                this.endDate = value;
                break;
            case "description":
                this.description = value;
                break;
            case "name":
                this.name = value;
                break;
            case "startDate":
                this.startDate = value;
                break;
            case "createDate":
                this.createDate = value;
                break;
            case "imageAltText":
                this.imageAltText = value;
                break;
            case "id":
                this.id = value;
                break;
            case "advertiserId":
                this.advertiserId = value;
                break;
            case "impressionTrackingUrl":
                this.impressionTrackingUrl = value;
                break;
            case "promotionType":
                this.promotionType = value;
                break;
            case "duration":
                this.duration = value;
                break;
            case "authorship":
                this.authorship = value;
                break;
            case "availability":
                this.availability = value;
                break;
            case "clickTrackingUrl":
                this.clickTrackingUrl = value;
                break;
            case "destinationUrl":
                this.destinationUrl = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setIsActive(RuntimeEnv env, Object... args) {
        Object isActive = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Link.class, "isActive", isActive);

        return null;
    }

    public Object getIsActive(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Link.class, "isActive"));
    }

    public Object setLinkType(RuntimeEnv env, Object... args) {
        Object linkType = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Link.class, "linkType", linkType);

        return null;
    }

    public Object getLinkType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Link.class, "linkType"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Link.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Link.class, "kind"));
    }

    public Object setEndDate(RuntimeEnv env, Object... args) {
        Object endDate = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Link.class, "endDate", endDate);

        return null;
    }

    public Object getEndDate(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Link.class, "endDate"));
    }

    public Object setDescription(RuntimeEnv env, Object... args) {
        Object description = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Link.class, "description", description);

        return null;
    }

    public Object getDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Link.class, "description"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Link.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Link.class, "name"));
    }

    public Object setStartDate(RuntimeEnv env, Object... args) {
        Object startDate = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Link.class, "startDate", startDate);

        return null;
    }

    public Object getStartDate(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Link.class, "startDate"));
    }

    public Object setCreateDate(RuntimeEnv env, Object... args) {
        Object createDate = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Link.class, "createDate", createDate);

        return null;
    }

    public Object getCreateDate(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Link.class, "createDate"));
    }

    public Object setImageAltText(RuntimeEnv env, Object... args) {
        Object imageAltText = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Link.class, "imageAltText", imageAltText);

        return null;
    }

    public Object getImageAltText(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Link.class, "imageAltText"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Link.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Link.class, "id"));
    }

    public Object setAdvertiserId(RuntimeEnv env, Object... args) {
        Object advertiserId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Link.class, "advertiserId", advertiserId);

        return null;
    }

    public Object getAdvertiserId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Link.class, "advertiserId"));
    }

    public Object setImpressionTrackingUrl(RuntimeEnv env, Object... args) {
        Object impressionTrackingUrl = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Link.class, "impressionTrackingUrl", impressionTrackingUrl);

        return null;
    }

    public Object getImpressionTrackingUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Link.class, "impressionTrackingUrl"));
    }

    public Object setPromotionType(RuntimeEnv env, Object... args) {
        Object promotionType = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Link.class, "promotionType", promotionType);

        return null;
    }

    public Object getPromotionType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Link.class, "promotionType"));
    }

    public Object setDuration(RuntimeEnv env, Object... args) {
        Object duration = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Link.class, "duration", duration);

        return null;
    }

    public Object getDuration(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Link.class, "duration"));
    }

    public Object setAuthorship(RuntimeEnv env, Object... args) {
        Object authorship = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Link.class, "authorship", authorship);

        return null;
    }

    public Object getAuthorship(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Link.class, "authorship"));
    }

    public Object setAvailability(RuntimeEnv env, Object... args) {
        Object availability = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Link.class, "availability", availability);

        return null;
    }

    public Object getAvailability(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Link.class, "availability"));
    }

    public Object setClickTrackingUrl(RuntimeEnv env, Object... args) {
        Object clickTrackingUrl = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Link.class, "clickTrackingUrl", clickTrackingUrl);

        return null;
    }

    public Object getClickTrackingUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Link.class, "clickTrackingUrl"));
    }

    public Object setDestinationUrl(RuntimeEnv env, Object... args) {
        Object destinationUrl = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Link.class, "destinationUrl", destinationUrl);

        return null;
    }

    public Object getDestinationUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Link.class, "destinationUrl"));
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
