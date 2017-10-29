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

public class Google_OrkutActivityobjectsResource extends Google_Model
        implements RuntimeFileContextInterface {

    public Object displayName = null;

    public Object __linksType = "Google_OrkutLinkResource";

    public Object __linksDataType = "array";

    public Object links = null;

    public Object __communityType = "Google_Community";

    public Object __communityDataType = "";

    public Object community = null;

    public Object content = null;

    public Object __personType = "Google_OrkutActivitypersonResource";

    public Object __personDataType = "";

    public Object person = null;

    public Object id = null;

    public Object objectType = null;

    public Google_OrkutActivityobjectsResource(RuntimeEnv env, Object... args) {
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
            case "setDisplayName":
                return this.setDisplayName(env, args);
            case "getDisplayName":
                return this.getDisplayName(env, args);
            case "setLinks":
                return this.setLinks(env, args);
            case "getLinks":
                return this.getLinks(env, args);
            case "setCommunity":
                return this.setCommunity(env, args);
            case "getCommunity":
                return this.getCommunity(env, args);
            case "setContent":
                return this.setContent(env, args);
            case "getContent":
                return this.getContent(env, args);
            case "setPerson":
                return this.setPerson(env, args);
            case "getPerson":
                return this.getPerson(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
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
            case "displayName":
                return this.displayName;
            case "__linksType":
                if (Google_OrkutActivityobjectsResource.class.isAssignableFrom(caller)) {

                    return this.__linksType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__linksDataType":
                if (Google_OrkutActivityobjectsResource.class.isAssignableFrom(caller)) {

                    return this.__linksDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "links":
                return this.links;
            case "__communityType":
                if (Google_OrkutActivityobjectsResource.class.isAssignableFrom(caller)) {

                    return this.__communityType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__communityDataType":
                if (Google_OrkutActivityobjectsResource.class.isAssignableFrom(caller)) {

                    return this.__communityDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "community":
                return this.community;
            case "content":
                return this.content;
            case "__personType":
                if (Google_OrkutActivityobjectsResource.class.isAssignableFrom(caller)) {

                    return this.__personType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__personDataType":
                if (Google_OrkutActivityobjectsResource.class.isAssignableFrom(caller)) {

                    return this.__personDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "person":
                return this.person;
            case "id":
                return this.id;
            case "objectType":
                return this.objectType;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "displayName":
                return ZVal.isNull(this.displayName);
            case "__linksType":
                if (Google_OrkutActivityobjectsResource.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__linksType);
                }
                break;
            case "__linksDataType":
                if (Google_OrkutActivityobjectsResource.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__linksDataType);
                }
                break;
            case "links":
                return ZVal.isNull(this.links);
            case "__communityType":
                if (Google_OrkutActivityobjectsResource.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__communityType);
                }
                break;
            case "__communityDataType":
                if (Google_OrkutActivityobjectsResource.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__communityDataType);
                }
                break;
            case "community":
                return ZVal.isNull(this.community);
            case "content":
                return ZVal.isNull(this.content);
            case "__personType":
                if (Google_OrkutActivityobjectsResource.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__personType);
                }
                break;
            case "__personDataType":
                if (Google_OrkutActivityobjectsResource.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__personDataType);
                }
                break;
            case "person":
                return ZVal.isNull(this.person);
            case "id":
                return ZVal.isNull(this.id);
            case "objectType":
                return ZVal.isNull(this.objectType);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "displayName":
                this.displayName = value;
                break;
            case "__linksType":
                if (Google_OrkutActivityobjectsResource.class.isAssignableFrom(caller)) {

                    this.__linksType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__linksDataType":
                if (Google_OrkutActivityobjectsResource.class.isAssignableFrom(caller)) {

                    this.__linksDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "links":
                this.links = value;
                break;
            case "__communityType":
                if (Google_OrkutActivityobjectsResource.class.isAssignableFrom(caller)) {

                    this.__communityType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__communityDataType":
                if (Google_OrkutActivityobjectsResource.class.isAssignableFrom(caller)) {

                    this.__communityDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "community":
                this.community = value;
                break;
            case "content":
                this.content = value;
                break;
            case "__personType":
                if (Google_OrkutActivityobjectsResource.class.isAssignableFrom(caller)) {

                    this.__personType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__personDataType":
                if (Google_OrkutActivityobjectsResource.class.isAssignableFrom(caller)) {

                    this.__personDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "person":
                this.person = value;
                break;
            case "id":
                this.id = value;
                break;
            case "objectType":
                this.objectType = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setDisplayName(RuntimeEnv env, Object... args) {
        Object displayName = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_OrkutActivityobjectsResource.class, "displayName", displayName);

        return null;
    }

    public Object getDisplayName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_OrkutActivityobjectsResource.class, "displayName"));
    }

    public Object setLinks(RuntimeEnv env, Object... args) {
        Object links = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_OrkutActivityobjectsResource.class,
                links,
                "Google_OrkutLinkResource",
                "setLinks");
        ZVal.setProperty(this, Google_OrkutActivityobjectsResource.class, "links", links);

        return null;
    }

    public Object getLinks(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_OrkutActivityobjectsResource.class, "links"));
    }

    public Object setCommunity(RuntimeEnv env, Object... args) {
        Object community = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_OrkutActivityobjectsResource.class, "community", community);

        return null;
    }

    public Object getCommunity(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_OrkutActivityobjectsResource.class, "community"));
    }

    public Object setContent(RuntimeEnv env, Object... args) {
        Object content = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_OrkutActivityobjectsResource.class, "content", content);

        return null;
    }

    public Object getContent(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_OrkutActivityobjectsResource.class, "content"));
    }

    public Object setPerson(RuntimeEnv env, Object... args) {
        Object person = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_OrkutActivityobjectsResource.class, "person", person);

        return null;
    }

    public Object getPerson(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_OrkutActivityobjectsResource.class, "person"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_OrkutActivityobjectsResource.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_OrkutActivityobjectsResource.class, "id"));
    }

    public Object setObjectType(RuntimeEnv env, Object... args) {
        Object objectType = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_OrkutActivityobjectsResource.class, "objectType", objectType);

        return null;
    }

    public Object getObjectType(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_OrkutActivityobjectsResource.class, "objectType"));
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
