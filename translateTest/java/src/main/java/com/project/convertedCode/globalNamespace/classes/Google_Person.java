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

 google-api-php-client/src/contrib/Google_PlusService.php

*/

public class Google_Person extends Google_Model implements RuntimeFileContextInterface {

    public Object relationshipStatus = null;

    public Object __organizationsType = "Google_PersonOrganizations";

    public Object __organizationsDataType = "array";

    public Object organizations = null;

    public Object kind = null;

    public Object displayName = null;

    public Object __nameType = "Google_PersonName";

    public Object __nameDataType = "";

    public Object name = null;

    public Object url = null;

    public Object gender = null;

    public Object aboutMe = null;

    public Object tagline = null;

    public Object __urlsType = "Google_PersonUrls";

    public Object __urlsDataType = "array";

    public Object urls = null;

    public Object __placesLivedType = "Google_PersonPlacesLived";

    public Object __placesLivedDataType = "array";

    public Object placesLived = null;

    public Object __emailsType = "Google_PersonEmails";

    public Object __emailsDataType = "array";

    public Object emails = null;

    public Object nickname = null;

    public Object birthday = null;

    public Object etag = null;

    public Object __imageType = "Google_PersonImage";

    public Object __imageDataType = "";

    public Object image = null;

    public Object hasApp = null;

    public Object id = null;

    public Object languagesSpoken = null;

    public Object currentLocation = null;

    public Object objectType = null;

    public Google_Person(RuntimeEnv env, Object... args) {
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
            case "setRelationshipStatus":
                return this.setRelationshipStatus(env, args);
            case "getRelationshipStatus":
                return this.getRelationshipStatus(env, args);
            case "setOrganizations":
                return this.setOrganizations(env, args);
            case "getOrganizations":
                return this.getOrganizations(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setDisplayName":
                return this.setDisplayName(env, args);
            case "getDisplayName":
                return this.getDisplayName(env, args);
            case "setName":
                return this.setName(env, args);
            case "getName":
                return this.getName(env, args);
            case "setUrl":
                return this.setUrl(env, args);
            case "getUrl":
                return this.getUrl(env, args);
            case "setGender":
                return this.setGender(env, args);
            case "getGender":
                return this.getGender(env, args);
            case "setAboutMe":
                return this.setAboutMe(env, args);
            case "getAboutMe":
                return this.getAboutMe(env, args);
            case "setTagline":
                return this.setTagline(env, args);
            case "getTagline":
                return this.getTagline(env, args);
            case "setUrls":
                return this.setUrls(env, args);
            case "getUrls":
                return this.getUrls(env, args);
            case "setPlacesLived":
                return this.setPlacesLived(env, args);
            case "getPlacesLived":
                return this.getPlacesLived(env, args);
            case "setEmails":
                return this.setEmails(env, args);
            case "getEmails":
                return this.getEmails(env, args);
            case "setNickname":
                return this.setNickname(env, args);
            case "getNickname":
                return this.getNickname(env, args);
            case "setBirthday":
                return this.setBirthday(env, args);
            case "getBirthday":
                return this.getBirthday(env, args);
            case "setEtag":
                return this.setEtag(env, args);
            case "getEtag":
                return this.getEtag(env, args);
            case "setImage":
                return this.setImage(env, args);
            case "getImage":
                return this.getImage(env, args);
            case "setHasApp":
                return this.setHasApp(env, args);
            case "getHasApp":
                return this.getHasApp(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setLanguagesSpoken":
                return this.setLanguagesSpoken(env, args);
            case "getLanguagesSpoken":
                return this.getLanguagesSpoken(env, args);
            case "setCurrentLocation":
                return this.setCurrentLocation(env, args);
            case "getCurrentLocation":
                return this.getCurrentLocation(env, args);
            case "setObjectType":
                return this.setObjectType(env, args);
            case "getObjectType":
                return this.getObjectType(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "relationshipStatus":
                return this.relationshipStatus;
            case "__organizationsType":
                if (Google_Person.class.isAssignableFrom(caller)) {

                    return this.__organizationsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__organizationsDataType":
                if (Google_Person.class.isAssignableFrom(caller)) {

                    return this.__organizationsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "organizations":
                return this.organizations;
            case "kind":
                return this.kind;
            case "displayName":
                return this.displayName;
            case "__nameType":
                if (Google_Person.class.isAssignableFrom(caller)) {

                    return this.__nameType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__nameDataType":
                if (Google_Person.class.isAssignableFrom(caller)) {

                    return this.__nameDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "name":
                return this.name;
            case "url":
                return this.url;
            case "gender":
                return this.gender;
            case "aboutMe":
                return this.aboutMe;
            case "tagline":
                return this.tagline;
            case "__urlsType":
                if (Google_Person.class.isAssignableFrom(caller)) {

                    return this.__urlsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__urlsDataType":
                if (Google_Person.class.isAssignableFrom(caller)) {

                    return this.__urlsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "urls":
                return this.urls;
            case "__placesLivedType":
                if (Google_Person.class.isAssignableFrom(caller)) {

                    return this.__placesLivedType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__placesLivedDataType":
                if (Google_Person.class.isAssignableFrom(caller)) {

                    return this.__placesLivedDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "placesLived":
                return this.placesLived;
            case "__emailsType":
                if (Google_Person.class.isAssignableFrom(caller)) {

                    return this.__emailsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__emailsDataType":
                if (Google_Person.class.isAssignableFrom(caller)) {

                    return this.__emailsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "emails":
                return this.emails;
            case "nickname":
                return this.nickname;
            case "birthday":
                return this.birthday;
            case "etag":
                return this.etag;
            case "__imageType":
                if (Google_Person.class.isAssignableFrom(caller)) {

                    return this.__imageType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__imageDataType":
                if (Google_Person.class.isAssignableFrom(caller)) {

                    return this.__imageDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "image":
                return this.image;
            case "hasApp":
                return this.hasApp;
            case "id":
                return this.id;
            case "languagesSpoken":
                return this.languagesSpoken;
            case "currentLocation":
                return this.currentLocation;
            case "objectType":
                return this.objectType;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "relationshipStatus":
                return ZVal.isNull(this.relationshipStatus);
            case "__organizationsType":
                if (Google_Person.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__organizationsType);
                }
                break;
            case "__organizationsDataType":
                if (Google_Person.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__organizationsDataType);
                }
                break;
            case "organizations":
                return ZVal.isNull(this.organizations);
            case "kind":
                return ZVal.isNull(this.kind);
            case "displayName":
                return ZVal.isNull(this.displayName);
            case "__nameType":
                if (Google_Person.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__nameType);
                }
                break;
            case "__nameDataType":
                if (Google_Person.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__nameDataType);
                }
                break;
            case "name":
                return ZVal.isNull(this.name);
            case "url":
                return ZVal.isNull(this.url);
            case "gender":
                return ZVal.isNull(this.gender);
            case "aboutMe":
                return ZVal.isNull(this.aboutMe);
            case "tagline":
                return ZVal.isNull(this.tagline);
            case "__urlsType":
                if (Google_Person.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__urlsType);
                }
                break;
            case "__urlsDataType":
                if (Google_Person.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__urlsDataType);
                }
                break;
            case "urls":
                return ZVal.isNull(this.urls);
            case "__placesLivedType":
                if (Google_Person.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__placesLivedType);
                }
                break;
            case "__placesLivedDataType":
                if (Google_Person.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__placesLivedDataType);
                }
                break;
            case "placesLived":
                return ZVal.isNull(this.placesLived);
            case "__emailsType":
                if (Google_Person.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__emailsType);
                }
                break;
            case "__emailsDataType":
                if (Google_Person.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__emailsDataType);
                }
                break;
            case "emails":
                return ZVal.isNull(this.emails);
            case "nickname":
                return ZVal.isNull(this.nickname);
            case "birthday":
                return ZVal.isNull(this.birthday);
            case "etag":
                return ZVal.isNull(this.etag);
            case "__imageType":
                if (Google_Person.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__imageType);
                }
                break;
            case "__imageDataType":
                if (Google_Person.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__imageDataType);
                }
                break;
            case "image":
                return ZVal.isNull(this.image);
            case "hasApp":
                return ZVal.isNull(this.hasApp);
            case "id":
                return ZVal.isNull(this.id);
            case "languagesSpoken":
                return ZVal.isNull(this.languagesSpoken);
            case "currentLocation":
                return ZVal.isNull(this.currentLocation);
            case "objectType":
                return ZVal.isNull(this.objectType);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "relationshipStatus":
                this.relationshipStatus = value;
                break;
            case "__organizationsType":
                if (Google_Person.class.isAssignableFrom(caller)) {

                    this.__organizationsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__organizationsDataType":
                if (Google_Person.class.isAssignableFrom(caller)) {

                    this.__organizationsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "organizations":
                this.organizations = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "displayName":
                this.displayName = value;
                break;
            case "__nameType":
                if (Google_Person.class.isAssignableFrom(caller)) {

                    this.__nameType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__nameDataType":
                if (Google_Person.class.isAssignableFrom(caller)) {

                    this.__nameDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "name":
                this.name = value;
                break;
            case "url":
                this.url = value;
                break;
            case "gender":
                this.gender = value;
                break;
            case "aboutMe":
                this.aboutMe = value;
                break;
            case "tagline":
                this.tagline = value;
                break;
            case "__urlsType":
                if (Google_Person.class.isAssignableFrom(caller)) {

                    this.__urlsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__urlsDataType":
                if (Google_Person.class.isAssignableFrom(caller)) {

                    this.__urlsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "urls":
                this.urls = value;
                break;
            case "__placesLivedType":
                if (Google_Person.class.isAssignableFrom(caller)) {

                    this.__placesLivedType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__placesLivedDataType":
                if (Google_Person.class.isAssignableFrom(caller)) {

                    this.__placesLivedDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "placesLived":
                this.placesLived = value;
                break;
            case "__emailsType":
                if (Google_Person.class.isAssignableFrom(caller)) {

                    this.__emailsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__emailsDataType":
                if (Google_Person.class.isAssignableFrom(caller)) {

                    this.__emailsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "emails":
                this.emails = value;
                break;
            case "nickname":
                this.nickname = value;
                break;
            case "birthday":
                this.birthday = value;
                break;
            case "etag":
                this.etag = value;
                break;
            case "__imageType":
                if (Google_Person.class.isAssignableFrom(caller)) {

                    this.__imageType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__imageDataType":
                if (Google_Person.class.isAssignableFrom(caller)) {

                    this.__imageDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "image":
                this.image = value;
                break;
            case "hasApp":
                this.hasApp = value;
                break;
            case "id":
                this.id = value;
                break;
            case "languagesSpoken":
                this.languagesSpoken = value;
                break;
            case "currentLocation":
                this.currentLocation = value;
                break;
            case "objectType":
                this.objectType = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setRelationshipStatus(RuntimeEnv env, Object... args) {
        Object relationshipStatus = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Person.class, "relationshipStatus", relationshipStatus);

        return null;
    }

    public Object getRelationshipStatus(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Person.class, "relationshipStatus"));
    }

    public Object setOrganizations(RuntimeEnv env, Object... args) {
        Object organizations = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Person.class,
                organizations,
                "Google_PersonOrganizations",
                "setOrganizations");
        ZVal.setProperty(this, Google_Person.class, "organizations", organizations);

        return null;
    }

    public Object getOrganizations(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Person.class, "organizations"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Person.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Person.class, "kind"));
    }

    public Object setDisplayName(RuntimeEnv env, Object... args) {
        Object displayName = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Person.class, "displayName", displayName);

        return null;
    }

    public Object getDisplayName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Person.class, "displayName"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Person.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Person.class, "name"));
    }

    public Object setUrl(RuntimeEnv env, Object... args) {
        Object url = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Person.class, "url", url);

        return null;
    }

    public Object getUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Person.class, "url"));
    }

    public Object setGender(RuntimeEnv env, Object... args) {
        Object gender = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Person.class, "gender", gender);

        return null;
    }

    public Object getGender(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Person.class, "gender"));
    }

    public Object setAboutMe(RuntimeEnv env, Object... args) {
        Object aboutMe = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Person.class, "aboutMe", aboutMe);

        return null;
    }

    public Object getAboutMe(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Person.class, "aboutMe"));
    }

    public Object setTagline(RuntimeEnv env, Object... args) {
        Object tagline = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Person.class, "tagline", tagline);

        return null;
    }

    public Object getTagline(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Person.class, "tagline"));
    }

    public Object setUrls(RuntimeEnv env, Object... args) {
        Object urls = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this, "assertIsArray", Google_Person.class, urls, "Google_PersonUrls", "setUrls");
        ZVal.setProperty(this, Google_Person.class, "urls", urls);

        return null;
    }

    public Object getUrls(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Person.class, "urls"));
    }

    public Object setPlacesLived(RuntimeEnv env, Object... args) {
        Object placesLived = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Person.class,
                placesLived,
                "Google_PersonPlacesLived",
                "setPlacesLived");
        ZVal.setProperty(this, Google_Person.class, "placesLived", placesLived);

        return null;
    }

    public Object getPlacesLived(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Person.class, "placesLived"));
    }

    public Object setEmails(RuntimeEnv env, Object... args) {
        Object emails = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Person.class,
                emails,
                "Google_PersonEmails",
                "setEmails");
        ZVal.setProperty(this, Google_Person.class, "emails", emails);

        return null;
    }

    public Object getEmails(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Person.class, "emails"));
    }

    public Object setNickname(RuntimeEnv env, Object... args) {
        Object nickname = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Person.class, "nickname", nickname);

        return null;
    }

    public Object getNickname(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Person.class, "nickname"));
    }

    public Object setBirthday(RuntimeEnv env, Object... args) {
        Object birthday = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Person.class, "birthday", birthday);

        return null;
    }

    public Object getBirthday(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Person.class, "birthday"));
    }

    public Object setEtag(RuntimeEnv env, Object... args) {
        Object etag = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Person.class, "etag", etag);

        return null;
    }

    public Object getEtag(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Person.class, "etag"));
    }

    public Object setImage(RuntimeEnv env, Object... args) {
        Object image = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Person.class, "image", image);

        return null;
    }

    public Object getImage(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Person.class, "image"));
    }

    public Object setHasApp(RuntimeEnv env, Object... args) {
        Object hasApp = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Person.class, "hasApp", hasApp);

        return null;
    }

    public Object getHasApp(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Person.class, "hasApp"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Person.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Person.class, "id"));
    }

    public Object setLanguagesSpoken(RuntimeEnv env, Object... args) {
        Object languagesSpoken = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Person.class, "languagesSpoken", languagesSpoken);

        return null;
    }

    public Object getLanguagesSpoken(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Person.class, "languagesSpoken"));
    }

    public Object setCurrentLocation(RuntimeEnv env, Object... args) {
        Object currentLocation = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Person.class, "currentLocation", currentLocation);

        return null;
    }

    public Object getCurrentLocation(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Person.class, "currentLocation"));
    }

    public Object setObjectType(RuntimeEnv env, Object... args) {
        Object objectType = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Person.class, "objectType", objectType);

        return null;
    }

    public Object getObjectType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Person.class, "objectType"));
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
