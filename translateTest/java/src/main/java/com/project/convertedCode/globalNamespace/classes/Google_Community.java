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

 google-api-php-client/src/contrib/Google_OrkutService.php

*/

public class Google_Community extends Google_Model implements RuntimeFileContextInterface {

    public Object category = null;

    public Object kind = null;

    public Object member_count = null;

    public Object description = null;

    public Object language = null;

    public Object __linksType = "Google_OrkutLinkResource";

    public Object __linksDataType = "array";

    public Object links = null;

    public Object creation_date = null;

    public Object __ownerType = "Google_OrkutAuthorResource";

    public Object __ownerDataType = "";

    public Object owner = null;

    public Object __moderatorsType = "Google_OrkutAuthorResource";

    public Object __moderatorsDataType = "array";

    public Object moderators = null;

    public Object location = null;

    public Object __co_ownersType = "Google_OrkutAuthorResource";

    public Object __co_ownersDataType = "array";

    public Object co_owners = null;

    public Object photo_url = null;

    public Object id = null;

    public Object name = null;

    public Google_Community(RuntimeEnv env, Object... args) {
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
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setMember_count":
                return this.setMember_count(env, args);
            case "getMember_count":
                return this.getMember_count(env, args);
            case "setDescription":
                return this.setDescription(env, args);
            case "getDescription":
                return this.getDescription(env, args);
            case "setLanguage":
                return this.setLanguage(env, args);
            case "getLanguage":
                return this.getLanguage(env, args);
            case "setLinks":
                return this.setLinks(env, args);
            case "getLinks":
                return this.getLinks(env, args);
            case "setCreation_date":
                return this.setCreation_date(env, args);
            case "getCreation_date":
                return this.getCreation_date(env, args);
            case "setOwner":
                return this.setOwner(env, args);
            case "getOwner":
                return this.getOwner(env, args);
            case "setModerators":
                return this.setModerators(env, args);
            case "getModerators":
                return this.getModerators(env, args);
            case "setLocation":
                return this.setLocation(env, args);
            case "getLocation":
                return this.getLocation(env, args);
            case "setCo_owners":
                return this.setCo_owners(env, args);
            case "getCo_owners":
                return this.getCo_owners(env, args);
            case "setPhoto_url":
                return this.setPhoto_url(env, args);
            case "getPhoto_url":
                return this.getPhoto_url(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
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
            case "kind":
                return this.kind;
            case "member_count":
                return this.member_count;
            case "description":
                return this.description;
            case "language":
                return this.language;
            case "__linksType":
                if (Google_Community.class.isAssignableFrom(caller)) {

                    return this.__linksType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__linksDataType":
                if (Google_Community.class.isAssignableFrom(caller)) {

                    return this.__linksDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "links":
                return this.links;
            case "creation_date":
                return this.creation_date;
            case "__ownerType":
                if (Google_Community.class.isAssignableFrom(caller)) {

                    return this.__ownerType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__ownerDataType":
                if (Google_Community.class.isAssignableFrom(caller)) {

                    return this.__ownerDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "owner":
                return this.owner;
            case "__moderatorsType":
                if (Google_Community.class.isAssignableFrom(caller)) {

                    return this.__moderatorsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__moderatorsDataType":
                if (Google_Community.class.isAssignableFrom(caller)) {

                    return this.__moderatorsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "moderators":
                return this.moderators;
            case "location":
                return this.location;
            case "__co_ownersType":
                if (Google_Community.class.isAssignableFrom(caller)) {

                    return this.__co_ownersType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__co_ownersDataType":
                if (Google_Community.class.isAssignableFrom(caller)) {

                    return this.__co_ownersDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "co_owners":
                return this.co_owners;
            case "photo_url":
                return this.photo_url;
            case "id":
                return this.id;
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
            case "kind":
                return ZVal.isNull(this.kind);
            case "member_count":
                return ZVal.isNull(this.member_count);
            case "description":
                return ZVal.isNull(this.description);
            case "language":
                return ZVal.isNull(this.language);
            case "__linksType":
                if (Google_Community.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__linksType);
                }
                break;
            case "__linksDataType":
                if (Google_Community.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__linksDataType);
                }
                break;
            case "links":
                return ZVal.isNull(this.links);
            case "creation_date":
                return ZVal.isNull(this.creation_date);
            case "__ownerType":
                if (Google_Community.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__ownerType);
                }
                break;
            case "__ownerDataType":
                if (Google_Community.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__ownerDataType);
                }
                break;
            case "owner":
                return ZVal.isNull(this.owner);
            case "__moderatorsType":
                if (Google_Community.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__moderatorsType);
                }
                break;
            case "__moderatorsDataType":
                if (Google_Community.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__moderatorsDataType);
                }
                break;
            case "moderators":
                return ZVal.isNull(this.moderators);
            case "location":
                return ZVal.isNull(this.location);
            case "__co_ownersType":
                if (Google_Community.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__co_ownersType);
                }
                break;
            case "__co_ownersDataType":
                if (Google_Community.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__co_ownersDataType);
                }
                break;
            case "co_owners":
                return ZVal.isNull(this.co_owners);
            case "photo_url":
                return ZVal.isNull(this.photo_url);
            case "id":
                return ZVal.isNull(this.id);
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
            case "kind":
                this.kind = value;
                break;
            case "member_count":
                this.member_count = value;
                break;
            case "description":
                this.description = value;
                break;
            case "language":
                this.language = value;
                break;
            case "__linksType":
                if (Google_Community.class.isAssignableFrom(caller)) {

                    this.__linksType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__linksDataType":
                if (Google_Community.class.isAssignableFrom(caller)) {

                    this.__linksDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "links":
                this.links = value;
                break;
            case "creation_date":
                this.creation_date = value;
                break;
            case "__ownerType":
                if (Google_Community.class.isAssignableFrom(caller)) {

                    this.__ownerType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__ownerDataType":
                if (Google_Community.class.isAssignableFrom(caller)) {

                    this.__ownerDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "owner":
                this.owner = value;
                break;
            case "__moderatorsType":
                if (Google_Community.class.isAssignableFrom(caller)) {

                    this.__moderatorsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__moderatorsDataType":
                if (Google_Community.class.isAssignableFrom(caller)) {

                    this.__moderatorsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "moderators":
                this.moderators = value;
                break;
            case "location":
                this.location = value;
                break;
            case "__co_ownersType":
                if (Google_Community.class.isAssignableFrom(caller)) {

                    this.__co_ownersType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__co_ownersDataType":
                if (Google_Community.class.isAssignableFrom(caller)) {

                    this.__co_ownersDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "co_owners":
                this.co_owners = value;
                break;
            case "photo_url":
                this.photo_url = value;
                break;
            case "id":
                this.id = value;
                break;
            case "name":
                this.name = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setCategory(RuntimeEnv env, Object... args) {
        Object category = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Community.class, "category", category);

        return null;
    }

    public Object getCategory(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Community.class, "category"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Community.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Community.class, "kind"));
    }

    public Object setMember_count(RuntimeEnv env, Object... args) {
        Object member_count = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Community.class, "member_count", member_count);

        return null;
    }

    public Object getMember_count(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Community.class, "member_count"));
    }

    public Object setDescription(RuntimeEnv env, Object... args) {
        Object description = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Community.class, "description", description);

        return null;
    }

    public Object getDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Community.class, "description"));
    }

    public Object setLanguage(RuntimeEnv env, Object... args) {
        Object language = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Community.class, "language", language);

        return null;
    }

    public Object getLanguage(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Community.class, "language"));
    }

    public Object setLinks(RuntimeEnv env, Object... args) {
        Object links = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Community.class,
                links,
                "Google_OrkutLinkResource",
                "setLinks");
        ZVal.setProperty(this, Google_Community.class, "links", links);

        return null;
    }

    public Object getLinks(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Community.class, "links"));
    }

    public Object setCreation_date(RuntimeEnv env, Object... args) {
        Object creation_date = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Community.class, "creation_date", creation_date);

        return null;
    }

    public Object getCreation_date(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Community.class, "creation_date"));
    }

    public Object setOwner(RuntimeEnv env, Object... args) {
        Object owner = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Community.class, "owner", owner);

        return null;
    }

    public Object getOwner(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Community.class, "owner"));
    }

    public Object setModerators(RuntimeEnv env, Object... args) {
        Object moderators = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Community.class,
                moderators,
                "Google_OrkutAuthorResource",
                "setModerators");
        ZVal.setProperty(this, Google_Community.class, "moderators", moderators);

        return null;
    }

    public Object getModerators(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Community.class, "moderators"));
    }

    public Object setLocation(RuntimeEnv env, Object... args) {
        Object location = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Community.class, "location", location);

        return null;
    }

    public Object getLocation(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Community.class, "location"));
    }

    public Object setCo_owners(RuntimeEnv env, Object... args) {
        Object co_owners = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Community.class,
                co_owners,
                "Google_OrkutAuthorResource",
                "setCo_owners");
        ZVal.setProperty(this, Google_Community.class, "co_owners", co_owners);

        return null;
    }

    public Object getCo_owners(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Community.class, "co_owners"));
    }

    public Object setPhoto_url(RuntimeEnv env, Object... args) {
        Object photo_url = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Community.class, "photo_url", photo_url);

        return null;
    }

    public Object getPhoto_url(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Community.class, "photo_url"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Community.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Community.class, "id"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Community.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Community.class, "name"));
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
