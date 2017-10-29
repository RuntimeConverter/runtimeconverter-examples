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

public class Google_ActivityObject extends Google_Model implements RuntimeFileContextInterface {

    public Object __resharersType = "Google_ActivityObjectResharers";

    public Object __resharersDataType = "";

    public Object resharers = null;

    public Object __attachmentsType = "Google_ActivityObjectAttachments";

    public Object __attachmentsDataType = "array";

    public Object attachments = null;

    public Object originalContent = null;

    public Object __plusonersType = "Google_ActivityObjectPlusoners";

    public Object __plusonersDataType = "";

    public Object plusoners = null;

    public Object __actorType = "Google_ActivityObjectActor";

    public Object __actorDataType = "";

    public Object actor = null;

    public Object content = null;

    public Object url = null;

    public Object __repliesType = "Google_ActivityObjectReplies";

    public Object __repliesDataType = "";

    public Object replies = null;

    public Object id = null;

    public Object objectType = null;

    public Google_ActivityObject(RuntimeEnv env, Object... args) {
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
            case "setResharers":
                return this.setResharers(env, args);
            case "getResharers":
                return this.getResharers(env, args);
            case "setAttachments":
                return this.setAttachments(env, args);
            case "getAttachments":
                return this.getAttachments(env, args);
            case "setOriginalContent":
                return this.setOriginalContent(env, args);
            case "getOriginalContent":
                return this.getOriginalContent(env, args);
            case "setPlusoners":
                return this.setPlusoners(env, args);
            case "getPlusoners":
                return this.getPlusoners(env, args);
            case "setActor":
                return this.setActor(env, args);
            case "getActor":
                return this.getActor(env, args);
            case "setContent":
                return this.setContent(env, args);
            case "getContent":
                return this.getContent(env, args);
            case "setUrl":
                return this.setUrl(env, args);
            case "getUrl":
                return this.getUrl(env, args);
            case "setReplies":
                return this.setReplies(env, args);
            case "getReplies":
                return this.getReplies(env, args);
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
            case "__resharersType":
                if (Google_ActivityObject.class.isAssignableFrom(caller)) {

                    return this.__resharersType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__resharersDataType":
                if (Google_ActivityObject.class.isAssignableFrom(caller)) {

                    return this.__resharersDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "resharers":
                return this.resharers;
            case "__attachmentsType":
                if (Google_ActivityObject.class.isAssignableFrom(caller)) {

                    return this.__attachmentsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__attachmentsDataType":
                if (Google_ActivityObject.class.isAssignableFrom(caller)) {

                    return this.__attachmentsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "attachments":
                return this.attachments;
            case "originalContent":
                return this.originalContent;
            case "__plusonersType":
                if (Google_ActivityObject.class.isAssignableFrom(caller)) {

                    return this.__plusonersType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__plusonersDataType":
                if (Google_ActivityObject.class.isAssignableFrom(caller)) {

                    return this.__plusonersDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "plusoners":
                return this.plusoners;
            case "__actorType":
                if (Google_ActivityObject.class.isAssignableFrom(caller)) {

                    return this.__actorType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__actorDataType":
                if (Google_ActivityObject.class.isAssignableFrom(caller)) {

                    return this.__actorDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "actor":
                return this.actor;
            case "content":
                return this.content;
            case "url":
                return this.url;
            case "__repliesType":
                if (Google_ActivityObject.class.isAssignableFrom(caller)) {

                    return this.__repliesType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__repliesDataType":
                if (Google_ActivityObject.class.isAssignableFrom(caller)) {

                    return this.__repliesDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "replies":
                return this.replies;
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
            case "__resharersType":
                if (Google_ActivityObject.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__resharersType);
                }
                break;
            case "__resharersDataType":
                if (Google_ActivityObject.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__resharersDataType);
                }
                break;
            case "resharers":
                return ZVal.isNull(this.resharers);
            case "__attachmentsType":
                if (Google_ActivityObject.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__attachmentsType);
                }
                break;
            case "__attachmentsDataType":
                if (Google_ActivityObject.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__attachmentsDataType);
                }
                break;
            case "attachments":
                return ZVal.isNull(this.attachments);
            case "originalContent":
                return ZVal.isNull(this.originalContent);
            case "__plusonersType":
                if (Google_ActivityObject.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__plusonersType);
                }
                break;
            case "__plusonersDataType":
                if (Google_ActivityObject.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__plusonersDataType);
                }
                break;
            case "plusoners":
                return ZVal.isNull(this.plusoners);
            case "__actorType":
                if (Google_ActivityObject.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__actorType);
                }
                break;
            case "__actorDataType":
                if (Google_ActivityObject.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__actorDataType);
                }
                break;
            case "actor":
                return ZVal.isNull(this.actor);
            case "content":
                return ZVal.isNull(this.content);
            case "url":
                return ZVal.isNull(this.url);
            case "__repliesType":
                if (Google_ActivityObject.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__repliesType);
                }
                break;
            case "__repliesDataType":
                if (Google_ActivityObject.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__repliesDataType);
                }
                break;
            case "replies":
                return ZVal.isNull(this.replies);
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
            case "__resharersType":
                if (Google_ActivityObject.class.isAssignableFrom(caller)) {

                    this.__resharersType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__resharersDataType":
                if (Google_ActivityObject.class.isAssignableFrom(caller)) {

                    this.__resharersDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "resharers":
                this.resharers = value;
                break;
            case "__attachmentsType":
                if (Google_ActivityObject.class.isAssignableFrom(caller)) {

                    this.__attachmentsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__attachmentsDataType":
                if (Google_ActivityObject.class.isAssignableFrom(caller)) {

                    this.__attachmentsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "attachments":
                this.attachments = value;
                break;
            case "originalContent":
                this.originalContent = value;
                break;
            case "__plusonersType":
                if (Google_ActivityObject.class.isAssignableFrom(caller)) {

                    this.__plusonersType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__plusonersDataType":
                if (Google_ActivityObject.class.isAssignableFrom(caller)) {

                    this.__plusonersDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "plusoners":
                this.plusoners = value;
                break;
            case "__actorType":
                if (Google_ActivityObject.class.isAssignableFrom(caller)) {

                    this.__actorType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__actorDataType":
                if (Google_ActivityObject.class.isAssignableFrom(caller)) {

                    this.__actorDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "actor":
                this.actor = value;
                break;
            case "content":
                this.content = value;
                break;
            case "url":
                this.url = value;
                break;
            case "__repliesType":
                if (Google_ActivityObject.class.isAssignableFrom(caller)) {

                    this.__repliesType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__repliesDataType":
                if (Google_ActivityObject.class.isAssignableFrom(caller)) {

                    this.__repliesDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "replies":
                this.replies = value;
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

    public Object setResharers(RuntimeEnv env, Object... args) {
        Object resharers = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ActivityObject.class, "resharers", resharers);

        return null;
    }

    public Object getResharers(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ActivityObject.class, "resharers"));
    }

    public Object setAttachments(RuntimeEnv env, Object... args) {
        Object attachments = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_ActivityObject.class,
                attachments,
                "Google_ActivityObjectAttachments",
                "setAttachments");
        ZVal.setProperty(this, Google_ActivityObject.class, "attachments", attachments);

        return null;
    }

    public Object getAttachments(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ActivityObject.class, "attachments"));
    }

    public Object setOriginalContent(RuntimeEnv env, Object... args) {
        Object originalContent = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ActivityObject.class, "originalContent", originalContent);

        return null;
    }

    public Object getOriginalContent(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ActivityObject.class, "originalContent"));
    }

    public Object setPlusoners(RuntimeEnv env, Object... args) {
        Object plusoners = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ActivityObject.class, "plusoners", plusoners);

        return null;
    }

    public Object getPlusoners(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ActivityObject.class, "plusoners"));
    }

    public Object setActor(RuntimeEnv env, Object... args) {
        Object actor = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ActivityObject.class, "actor", actor);

        return null;
    }

    public Object getActor(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ActivityObject.class, "actor"));
    }

    public Object setContent(RuntimeEnv env, Object... args) {
        Object content = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ActivityObject.class, "content", content);

        return null;
    }

    public Object getContent(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ActivityObject.class, "content"));
    }

    public Object setUrl(RuntimeEnv env, Object... args) {
        Object url = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ActivityObject.class, "url", url);

        return null;
    }

    public Object getUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ActivityObject.class, "url"));
    }

    public Object setReplies(RuntimeEnv env, Object... args) {
        Object replies = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ActivityObject.class, "replies", replies);

        return null;
    }

    public Object getReplies(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ActivityObject.class, "replies"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ActivityObject.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ActivityObject.class, "id"));
    }

    public Object setObjectType(RuntimeEnv env, Object... args) {
        Object objectType = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ActivityObject.class, "objectType", objectType);

        return null;
    }

    public Object getObjectType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ActivityObject.class, "objectType"));
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
