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

public class Google_Comment extends Google_Model implements RuntimeFileContextInterface {

    public Object __inReplyToType = "Google_CommentInReplyTo";

    public Object __inReplyToDataType = "array";

    public Object inReplyTo = null;

    public Object kind = null;

    public Object __objectType = "Google_CommentObject";

    public Object __objectDataType = "";

    public Object _object = null;

    public Object updated = null;

    public Object __actorType = "Google_CommentActor";

    public Object __actorDataType = "";

    public Object actor = null;

    public Object verb = null;

    public Object etag = null;

    public Object published = null;

    public Object id = null;

    public Object selfLink = null;

    public Google_Comment(RuntimeEnv env, Object... args) {
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
            case "setInReplyTo":
                return this.setInReplyTo(env, args);
            case "getInReplyTo":
                return this.getInReplyTo(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setObject":
                return this.setObject(env, args);
            case "getObject":
                return this.getObject(env, args);
            case "setUpdated":
                return this.setUpdated(env, args);
            case "getUpdated":
                return this.getUpdated(env, args);
            case "setActor":
                return this.setActor(env, args);
            case "getActor":
                return this.getActor(env, args);
            case "setVerb":
                return this.setVerb(env, args);
            case "getVerb":
                return this.getVerb(env, args);
            case "setEtag":
                return this.setEtag(env, args);
            case "getEtag":
                return this.getEtag(env, args);
            case "setPublished":
                return this.setPublished(env, args);
            case "getPublished":
                return this.getPublished(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setSelfLink":
                return this.setSelfLink(env, args);
            case "getSelfLink":
                return this.getSelfLink(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__inReplyToType":
                if (Google_Comment.class.isAssignableFrom(caller)) {

                    return this.__inReplyToType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__inReplyToDataType":
                if (Google_Comment.class.isAssignableFrom(caller)) {

                    return this.__inReplyToDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "inReplyTo":
                return this.inReplyTo;
            case "kind":
                return this.kind;
            case "__objectType":
                if (Google_Comment.class.isAssignableFrom(caller)) {

                    return this.__objectType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__objectDataType":
                if (Google_Comment.class.isAssignableFrom(caller)) {

                    return this.__objectDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "object":
                return this._object;
            case "updated":
                return this.updated;
            case "__actorType":
                if (Google_Comment.class.isAssignableFrom(caller)) {

                    return this.__actorType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__actorDataType":
                if (Google_Comment.class.isAssignableFrom(caller)) {

                    return this.__actorDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "actor":
                return this.actor;
            case "verb":
                return this.verb;
            case "etag":
                return this.etag;
            case "published":
                return this.published;
            case "id":
                return this.id;
            case "selfLink":
                return this.selfLink;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__inReplyToType":
                if (Google_Comment.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__inReplyToType);
                }
                break;
            case "__inReplyToDataType":
                if (Google_Comment.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__inReplyToDataType);
                }
                break;
            case "inReplyTo":
                return ZVal.isNull(this.inReplyTo);
            case "kind":
                return ZVal.isNull(this.kind);
            case "__objectType":
                if (Google_Comment.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__objectType);
                }
                break;
            case "__objectDataType":
                if (Google_Comment.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__objectDataType);
                }
                break;
            case "object":
                return ZVal.isNull(this._object);
            case "updated":
                return ZVal.isNull(this.updated);
            case "__actorType":
                if (Google_Comment.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__actorType);
                }
                break;
            case "__actorDataType":
                if (Google_Comment.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__actorDataType);
                }
                break;
            case "actor":
                return ZVal.isNull(this.actor);
            case "verb":
                return ZVal.isNull(this.verb);
            case "etag":
                return ZVal.isNull(this.etag);
            case "published":
                return ZVal.isNull(this.published);
            case "id":
                return ZVal.isNull(this.id);
            case "selfLink":
                return ZVal.isNull(this.selfLink);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__inReplyToType":
                if (Google_Comment.class.isAssignableFrom(caller)) {

                    this.__inReplyToType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__inReplyToDataType":
                if (Google_Comment.class.isAssignableFrom(caller)) {

                    this.__inReplyToDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "inReplyTo":
                this.inReplyTo = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "__objectType":
                if (Google_Comment.class.isAssignableFrom(caller)) {

                    this.__objectType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__objectDataType":
                if (Google_Comment.class.isAssignableFrom(caller)) {

                    this.__objectDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "object":
                this._object = value;
                break;
            case "updated":
                this.updated = value;
                break;
            case "__actorType":
                if (Google_Comment.class.isAssignableFrom(caller)) {

                    this.__actorType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__actorDataType":
                if (Google_Comment.class.isAssignableFrom(caller)) {

                    this.__actorDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "actor":
                this.actor = value;
                break;
            case "verb":
                this.verb = value;
                break;
            case "etag":
                this.etag = value;
                break;
            case "published":
                this.published = value;
                break;
            case "id":
                this.id = value;
                break;
            case "selfLink":
                this.selfLink = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setInReplyTo(RuntimeEnv env, Object... args) {
        Object inReplyTo = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Comment.class,
                inReplyTo,
                "Google_CommentInReplyTo",
                "setInReplyTo");
        ZVal.setProperty(this, Google_Comment.class, "inReplyTo", inReplyTo);

        return null;
    }

    public Object getInReplyTo(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Comment.class, "inReplyTo"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Comment.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Comment.class, "kind"));
    }

    public Object setObject(RuntimeEnv env, Object... args) {
        Object _object = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Comment.class, "object", _object);

        return null;
    }

    public Object getObject(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Comment.class, "object"));
    }

    public Object setUpdated(RuntimeEnv env, Object... args) {
        Object updated = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Comment.class, "updated", updated);

        return null;
    }

    public Object getUpdated(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Comment.class, "updated"));
    }

    public Object setActor(RuntimeEnv env, Object... args) {
        Object actor = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Comment.class, "actor", actor);

        return null;
    }

    public Object getActor(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Comment.class, "actor"));
    }

    public Object setVerb(RuntimeEnv env, Object... args) {
        Object verb = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Comment.class, "verb", verb);

        return null;
    }

    public Object getVerb(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Comment.class, "verb"));
    }

    public Object setEtag(RuntimeEnv env, Object... args) {
        Object etag = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Comment.class, "etag", etag);

        return null;
    }

    public Object getEtag(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Comment.class, "etag"));
    }

    public Object setPublished(RuntimeEnv env, Object... args) {
        Object published = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Comment.class, "published", published);

        return null;
    }

    public Object getPublished(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Comment.class, "published"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Comment.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Comment.class, "id"));
    }

    public Object setSelfLink(RuntimeEnv env, Object... args) {
        Object selfLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Comment.class, "selfLink", selfLink);

        return null;
    }

    public Object getSelfLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Comment.class, "selfLink"));
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
