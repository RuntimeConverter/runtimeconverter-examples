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

 google-api-php-client/src/contrib/Google_AnalyticsService.php

*/

public class Google_Goal extends Google_Model implements RuntimeFileContextInterface {

    public Object kind = null;

    public Object __visitTimeOnSiteDetailsType = "Google_GoalVisitTimeOnSiteDetails";

    public Object __visitTimeOnSiteDetailsDataType = "";

    public Object visitTimeOnSiteDetails = null;

    public Object name = null;

    public Object created = null;

    public Object __urlDestinationDetailsType = "Google_GoalUrlDestinationDetails";

    public Object __urlDestinationDetailsDataType = "";

    public Object urlDestinationDetails = null;

    public Object updated = null;

    public Object value = null;

    public Object __visitNumPagesDetailsType = "Google_GoalVisitNumPagesDetails";

    public Object __visitNumPagesDetailsDataType = "";

    public Object visitNumPagesDetails = null;

    public Object internalWebPropertyId = null;

    public Object __eventDetailsType = "Google_GoalEventDetails";

    public Object __eventDetailsDataType = "";

    public Object eventDetails = null;

    public Object webPropertyId = null;

    public Object active = null;

    public Object profileId = null;

    public Object __parentLinkType = "Google_GoalParentLink";

    public Object __parentLinkDataType = "";

    public Object parentLink = null;

    public Object type = null;

    public Object id = null;

    public Object selfLink = null;

    public Object accountId = null;

    public Google_Goal(RuntimeEnv env, Object... args) {
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
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setVisitTimeOnSiteDetails":
                return this.setVisitTimeOnSiteDetails(env, args);
            case "getVisitTimeOnSiteDetails":
                return this.getVisitTimeOnSiteDetails(env, args);
            case "setName":
                return this.setName(env, args);
            case "getName":
                return this.getName(env, args);
            case "setCreated":
                return this.setCreated(env, args);
            case "getCreated":
                return this.getCreated(env, args);
            case "setUrlDestinationDetails":
                return this.setUrlDestinationDetails(env, args);
            case "getUrlDestinationDetails":
                return this.getUrlDestinationDetails(env, args);
            case "setUpdated":
                return this.setUpdated(env, args);
            case "getUpdated":
                return this.getUpdated(env, args);
            case "setValue":
                return this.setValue(env, args);
            case "getValue":
                return this.getValue(env, args);
            case "setVisitNumPagesDetails":
                return this.setVisitNumPagesDetails(env, args);
            case "getVisitNumPagesDetails":
                return this.getVisitNumPagesDetails(env, args);
            case "setInternalWebPropertyId":
                return this.setInternalWebPropertyId(env, args);
            case "getInternalWebPropertyId":
                return this.getInternalWebPropertyId(env, args);
            case "setEventDetails":
                return this.setEventDetails(env, args);
            case "getEventDetails":
                return this.getEventDetails(env, args);
            case "setWebPropertyId":
                return this.setWebPropertyId(env, args);
            case "getWebPropertyId":
                return this.getWebPropertyId(env, args);
            case "setActive":
                return this.setActive(env, args);
            case "getActive":
                return this.getActive(env, args);
            case "setProfileId":
                return this.setProfileId(env, args);
            case "getProfileId":
                return this.getProfileId(env, args);
            case "setParentLink":
                return this.setParentLink(env, args);
            case "getParentLink":
                return this.getParentLink(env, args);
            case "setType":
                return this.setType(env, args);
            case "getType":
                return this.getType(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setSelfLink":
                return this.setSelfLink(env, args);
            case "getSelfLink":
                return this.getSelfLink(env, args);
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
            case "kind":
                return this.kind;
            case "__visitTimeOnSiteDetailsType":
                if (Google_Goal.class.isAssignableFrom(caller)) {

                    return this.__visitTimeOnSiteDetailsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__visitTimeOnSiteDetailsDataType":
                if (Google_Goal.class.isAssignableFrom(caller)) {

                    return this.__visitTimeOnSiteDetailsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "visitTimeOnSiteDetails":
                return this.visitTimeOnSiteDetails;
            case "name":
                return this.name;
            case "created":
                return this.created;
            case "__urlDestinationDetailsType":
                if (Google_Goal.class.isAssignableFrom(caller)) {

                    return this.__urlDestinationDetailsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__urlDestinationDetailsDataType":
                if (Google_Goal.class.isAssignableFrom(caller)) {

                    return this.__urlDestinationDetailsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "urlDestinationDetails":
                return this.urlDestinationDetails;
            case "updated":
                return this.updated;
            case "value":
                return this.value;
            case "__visitNumPagesDetailsType":
                if (Google_Goal.class.isAssignableFrom(caller)) {

                    return this.__visitNumPagesDetailsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__visitNumPagesDetailsDataType":
                if (Google_Goal.class.isAssignableFrom(caller)) {

                    return this.__visitNumPagesDetailsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "visitNumPagesDetails":
                return this.visitNumPagesDetails;
            case "internalWebPropertyId":
                return this.internalWebPropertyId;
            case "__eventDetailsType":
                if (Google_Goal.class.isAssignableFrom(caller)) {

                    return this.__eventDetailsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__eventDetailsDataType":
                if (Google_Goal.class.isAssignableFrom(caller)) {

                    return this.__eventDetailsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "eventDetails":
                return this.eventDetails;
            case "webPropertyId":
                return this.webPropertyId;
            case "active":
                return this.active;
            case "profileId":
                return this.profileId;
            case "__parentLinkType":
                if (Google_Goal.class.isAssignableFrom(caller)) {

                    return this.__parentLinkType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__parentLinkDataType":
                if (Google_Goal.class.isAssignableFrom(caller)) {

                    return this.__parentLinkDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "parentLink":
                return this.parentLink;
            case "type":
                return this.type;
            case "id":
                return this.id;
            case "selfLink":
                return this.selfLink;
            case "accountId":
                return this.accountId;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return ZVal.isNull(this.kind);
            case "__visitTimeOnSiteDetailsType":
                if (Google_Goal.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__visitTimeOnSiteDetailsType);
                }
                break;
            case "__visitTimeOnSiteDetailsDataType":
                if (Google_Goal.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__visitTimeOnSiteDetailsDataType);
                }
                break;
            case "visitTimeOnSiteDetails":
                return ZVal.isNull(this.visitTimeOnSiteDetails);
            case "name":
                return ZVal.isNull(this.name);
            case "created":
                return ZVal.isNull(this.created);
            case "__urlDestinationDetailsType":
                if (Google_Goal.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__urlDestinationDetailsType);
                }
                break;
            case "__urlDestinationDetailsDataType":
                if (Google_Goal.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__urlDestinationDetailsDataType);
                }
                break;
            case "urlDestinationDetails":
                return ZVal.isNull(this.urlDestinationDetails);
            case "updated":
                return ZVal.isNull(this.updated);
            case "value":
                return ZVal.isNull(this.value);
            case "__visitNumPagesDetailsType":
                if (Google_Goal.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__visitNumPagesDetailsType);
                }
                break;
            case "__visitNumPagesDetailsDataType":
                if (Google_Goal.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__visitNumPagesDetailsDataType);
                }
                break;
            case "visitNumPagesDetails":
                return ZVal.isNull(this.visitNumPagesDetails);
            case "internalWebPropertyId":
                return ZVal.isNull(this.internalWebPropertyId);
            case "__eventDetailsType":
                if (Google_Goal.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__eventDetailsType);
                }
                break;
            case "__eventDetailsDataType":
                if (Google_Goal.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__eventDetailsDataType);
                }
                break;
            case "eventDetails":
                return ZVal.isNull(this.eventDetails);
            case "webPropertyId":
                return ZVal.isNull(this.webPropertyId);
            case "active":
                return ZVal.isNull(this.active);
            case "profileId":
                return ZVal.isNull(this.profileId);
            case "__parentLinkType":
                if (Google_Goal.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__parentLinkType);
                }
                break;
            case "__parentLinkDataType":
                if (Google_Goal.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__parentLinkDataType);
                }
                break;
            case "parentLink":
                return ZVal.isNull(this.parentLink);
            case "type":
                return ZVal.isNull(this.type);
            case "id":
                return ZVal.isNull(this.id);
            case "selfLink":
                return ZVal.isNull(this.selfLink);
            case "accountId":
                return ZVal.isNull(this.accountId);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                this.kind = value;
                break;
            case "__visitTimeOnSiteDetailsType":
                if (Google_Goal.class.isAssignableFrom(caller)) {

                    this.__visitTimeOnSiteDetailsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__visitTimeOnSiteDetailsDataType":
                if (Google_Goal.class.isAssignableFrom(caller)) {

                    this.__visitTimeOnSiteDetailsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "visitTimeOnSiteDetails":
                this.visitTimeOnSiteDetails = value;
                break;
            case "name":
                this.name = value;
                break;
            case "created":
                this.created = value;
                break;
            case "__urlDestinationDetailsType":
                if (Google_Goal.class.isAssignableFrom(caller)) {

                    this.__urlDestinationDetailsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__urlDestinationDetailsDataType":
                if (Google_Goal.class.isAssignableFrom(caller)) {

                    this.__urlDestinationDetailsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "urlDestinationDetails":
                this.urlDestinationDetails = value;
                break;
            case "updated":
                this.updated = value;
                break;
            case "value":
                this.value = value;
                break;
            case "__visitNumPagesDetailsType":
                if (Google_Goal.class.isAssignableFrom(caller)) {

                    this.__visitNumPagesDetailsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__visitNumPagesDetailsDataType":
                if (Google_Goal.class.isAssignableFrom(caller)) {

                    this.__visitNumPagesDetailsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "visitNumPagesDetails":
                this.visitNumPagesDetails = value;
                break;
            case "internalWebPropertyId":
                this.internalWebPropertyId = value;
                break;
            case "__eventDetailsType":
                if (Google_Goal.class.isAssignableFrom(caller)) {

                    this.__eventDetailsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__eventDetailsDataType":
                if (Google_Goal.class.isAssignableFrom(caller)) {

                    this.__eventDetailsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "eventDetails":
                this.eventDetails = value;
                break;
            case "webPropertyId":
                this.webPropertyId = value;
                break;
            case "active":
                this.active = value;
                break;
            case "profileId":
                this.profileId = value;
                break;
            case "__parentLinkType":
                if (Google_Goal.class.isAssignableFrom(caller)) {

                    this.__parentLinkType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__parentLinkDataType":
                if (Google_Goal.class.isAssignableFrom(caller)) {

                    this.__parentLinkDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "parentLink":
                this.parentLink = value;
                break;
            case "type":
                this.type = value;
                break;
            case "id":
                this.id = value;
                break;
            case "selfLink":
                this.selfLink = value;
                break;
            case "accountId":
                this.accountId = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Goal.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Goal.class, "kind"));
    }

    public Object setVisitTimeOnSiteDetails(RuntimeEnv env, Object... args) {
        Object visitTimeOnSiteDetails = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Goal.class, "visitTimeOnSiteDetails", visitTimeOnSiteDetails);

        return null;
    }

    public Object getVisitTimeOnSiteDetails(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Goal.class, "visitTimeOnSiteDetails"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Goal.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Goal.class, "name"));
    }

    public Object setCreated(RuntimeEnv env, Object... args) {
        Object created = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Goal.class, "created", created);

        return null;
    }

    public Object getCreated(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Goal.class, "created"));
    }

    public Object setUrlDestinationDetails(RuntimeEnv env, Object... args) {
        Object urlDestinationDetails = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Goal.class, "urlDestinationDetails", urlDestinationDetails);

        return null;
    }

    public Object getUrlDestinationDetails(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Goal.class, "urlDestinationDetails"));
    }

    public Object setUpdated(RuntimeEnv env, Object... args) {
        Object updated = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Goal.class, "updated", updated);

        return null;
    }

    public Object getUpdated(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Goal.class, "updated"));
    }

    public Object setValue(RuntimeEnv env, Object... args) {
        Object value = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Goal.class, "value", value);

        return null;
    }

    public Object getValue(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Goal.class, "value"));
    }

    public Object setVisitNumPagesDetails(RuntimeEnv env, Object... args) {
        Object visitNumPagesDetails = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Goal.class, "visitNumPagesDetails", visitNumPagesDetails);

        return null;
    }

    public Object getVisitNumPagesDetails(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Goal.class, "visitNumPagesDetails"));
    }

    public Object setInternalWebPropertyId(RuntimeEnv env, Object... args) {
        Object internalWebPropertyId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Goal.class, "internalWebPropertyId", internalWebPropertyId);

        return null;
    }

    public Object getInternalWebPropertyId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Goal.class, "internalWebPropertyId"));
    }

    public Object setEventDetails(RuntimeEnv env, Object... args) {
        Object eventDetails = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Goal.class, "eventDetails", eventDetails);

        return null;
    }

    public Object getEventDetails(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Goal.class, "eventDetails"));
    }

    public Object setWebPropertyId(RuntimeEnv env, Object... args) {
        Object webPropertyId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Goal.class, "webPropertyId", webPropertyId);

        return null;
    }

    public Object getWebPropertyId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Goal.class, "webPropertyId"));
    }

    public Object setActive(RuntimeEnv env, Object... args) {
        Object active = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Goal.class, "active", active);

        return null;
    }

    public Object getActive(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Goal.class, "active"));
    }

    public Object setProfileId(RuntimeEnv env, Object... args) {
        Object profileId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Goal.class, "profileId", profileId);

        return null;
    }

    public Object getProfileId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Goal.class, "profileId"));
    }

    public Object setParentLink(RuntimeEnv env, Object... args) {
        Object parentLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Goal.class, "parentLink", parentLink);

        return null;
    }

    public Object getParentLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Goal.class, "parentLink"));
    }

    public Object setType(RuntimeEnv env, Object... args) {
        Object type = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Goal.class, "type", type);

        return null;
    }

    public Object getType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Goal.class, "type"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Goal.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Goal.class, "id"));
    }

    public Object setSelfLink(RuntimeEnv env, Object... args) {
        Object selfLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Goal.class, "selfLink", selfLink);

        return null;
    }

    public Object getSelfLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Goal.class, "selfLink"));
    }

    public Object setAccountId(RuntimeEnv env, Object... args) {
        Object accountId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Goal.class, "accountId", accountId);

        return null;
    }

    public Object getAccountId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Goal.class, "accountId"));
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
