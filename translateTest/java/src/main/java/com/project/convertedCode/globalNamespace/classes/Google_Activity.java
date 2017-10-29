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

public class Google_Activity extends Google_Model implements RuntimeFileContextInterface {

    public Object placeName = null;

    public Object kind = null;

    public Object updated = null;

    public Object __providerType = "Google_ActivityProvider";

    public Object __providerDataType = "";

    public Object provider = null;

    public Object title = null;

    public Object url = null;

    public Object geocode = null;

    public Object __objectType = "Google_ActivityObject";

    public Object __objectDataType = "";

    public Object _object = null;

    public Object placeId = null;

    public Object __actorType = "Google_ActivityActor";

    public Object __actorDataType = "";

    public Object actor = null;

    public Object id = null;

    public Object __accessType = "Google_Acl";

    public Object __accessDataType = "";

    public Object access = null;

    public Object verb = null;

    public Object etag = null;

    public Object radius = null;

    public Object address = null;

    public Object crosspostSource = null;

    public Object annotation = null;

    public Object published = null;

    public Google_Activity(RuntimeEnv env, Object... args) {
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
            case "setPlaceName":
                return this.setPlaceName(env, args);
            case "getPlaceName":
                return this.getPlaceName(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setUpdated":
                return this.setUpdated(env, args);
            case "getUpdated":
                return this.getUpdated(env, args);
            case "setProvider":
                return this.setProvider(env, args);
            case "getProvider":
                return this.getProvider(env, args);
            case "setTitle":
                return this.setTitle(env, args);
            case "getTitle":
                return this.getTitle(env, args);
            case "setUrl":
                return this.setUrl(env, args);
            case "getUrl":
                return this.getUrl(env, args);
            case "setGeocode":
                return this.setGeocode(env, args);
            case "getGeocode":
                return this.getGeocode(env, args);
            case "setObject":
                return this.setObject(env, args);
            case "getObject":
                return this.getObject(env, args);
            case "setPlaceId":
                return this.setPlaceId(env, args);
            case "getPlaceId":
                return this.getPlaceId(env, args);
            case "setActor":
                return this.setActor(env, args);
            case "getActor":
                return this.getActor(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setAccess":
                return this.setAccess(env, args);
            case "getAccess":
                return this.getAccess(env, args);
            case "setVerb":
                return this.setVerb(env, args);
            case "getVerb":
                return this.getVerb(env, args);
            case "setEtag":
                return this.setEtag(env, args);
            case "getEtag":
                return this.getEtag(env, args);
            case "setRadius":
                return this.setRadius(env, args);
            case "getRadius":
                return this.getRadius(env, args);
            case "setAddress":
                return this.setAddress(env, args);
            case "getAddress":
                return this.getAddress(env, args);
            case "setCrosspostSource":
                return this.setCrosspostSource(env, args);
            case "getCrosspostSource":
                return this.getCrosspostSource(env, args);
            case "setAnnotation":
                return this.setAnnotation(env, args);
            case "getAnnotation":
                return this.getAnnotation(env, args);
            case "setPublished":
                return this.setPublished(env, args);
            case "getPublished":
                return this.getPublished(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "placeName":
                return this.placeName;
            case "kind":
                return this.kind;
            case "updated":
                return this.updated;
            case "__providerType":
                if (Google_Activity.class.isAssignableFrom(caller)) {

                    return this.__providerType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__providerDataType":
                if (Google_Activity.class.isAssignableFrom(caller)) {

                    return this.__providerDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "provider":
                return this.provider;
            case "title":
                return this.title;
            case "url":
                return this.url;
            case "geocode":
                return this.geocode;
            case "__objectType":
                if (Google_Activity.class.isAssignableFrom(caller)) {

                    return this.__objectType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__objectDataType":
                if (Google_Activity.class.isAssignableFrom(caller)) {

                    return this.__objectDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "object":
                return this._object;
            case "placeId":
                return this.placeId;
            case "__actorType":
                if (Google_Activity.class.isAssignableFrom(caller)) {

                    return this.__actorType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__actorDataType":
                if (Google_Activity.class.isAssignableFrom(caller)) {

                    return this.__actorDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "actor":
                return this.actor;
            case "id":
                return this.id;
            case "__accessType":
                if (Google_Activity.class.isAssignableFrom(caller)) {

                    return this.__accessType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__accessDataType":
                if (Google_Activity.class.isAssignableFrom(caller)) {

                    return this.__accessDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "access":
                return this.access;
            case "verb":
                return this.verb;
            case "etag":
                return this.etag;
            case "radius":
                return this.radius;
            case "address":
                return this.address;
            case "crosspostSource":
                return this.crosspostSource;
            case "annotation":
                return this.annotation;
            case "published":
                return this.published;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "placeName":
                return ZVal.isNull(this.placeName);
            case "kind":
                return ZVal.isNull(this.kind);
            case "updated":
                return ZVal.isNull(this.updated);
            case "__providerType":
                if (Google_Activity.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__providerType);
                }
                break;
            case "__providerDataType":
                if (Google_Activity.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__providerDataType);
                }
                break;
            case "provider":
                return ZVal.isNull(this.provider);
            case "title":
                return ZVal.isNull(this.title);
            case "url":
                return ZVal.isNull(this.url);
            case "geocode":
                return ZVal.isNull(this.geocode);
            case "__objectType":
                if (Google_Activity.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__objectType);
                }
                break;
            case "__objectDataType":
                if (Google_Activity.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__objectDataType);
                }
                break;
            case "object":
                return ZVal.isNull(this._object);
            case "placeId":
                return ZVal.isNull(this.placeId);
            case "__actorType":
                if (Google_Activity.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__actorType);
                }
                break;
            case "__actorDataType":
                if (Google_Activity.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__actorDataType);
                }
                break;
            case "actor":
                return ZVal.isNull(this.actor);
            case "id":
                return ZVal.isNull(this.id);
            case "__accessType":
                if (Google_Activity.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__accessType);
                }
                break;
            case "__accessDataType":
                if (Google_Activity.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__accessDataType);
                }
                break;
            case "access":
                return ZVal.isNull(this.access);
            case "verb":
                return ZVal.isNull(this.verb);
            case "etag":
                return ZVal.isNull(this.etag);
            case "radius":
                return ZVal.isNull(this.radius);
            case "address":
                return ZVal.isNull(this.address);
            case "crosspostSource":
                return ZVal.isNull(this.crosspostSource);
            case "annotation":
                return ZVal.isNull(this.annotation);
            case "published":
                return ZVal.isNull(this.published);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "placeName":
                this.placeName = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "updated":
                this.updated = value;
                break;
            case "__providerType":
                if (Google_Activity.class.isAssignableFrom(caller)) {

                    this.__providerType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__providerDataType":
                if (Google_Activity.class.isAssignableFrom(caller)) {

                    this.__providerDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "provider":
                this.provider = value;
                break;
            case "title":
                this.title = value;
                break;
            case "url":
                this.url = value;
                break;
            case "geocode":
                this.geocode = value;
                break;
            case "__objectType":
                if (Google_Activity.class.isAssignableFrom(caller)) {

                    this.__objectType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__objectDataType":
                if (Google_Activity.class.isAssignableFrom(caller)) {

                    this.__objectDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "object":
                this._object = value;
                break;
            case "placeId":
                this.placeId = value;
                break;
            case "__actorType":
                if (Google_Activity.class.isAssignableFrom(caller)) {

                    this.__actorType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__actorDataType":
                if (Google_Activity.class.isAssignableFrom(caller)) {

                    this.__actorDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "actor":
                this.actor = value;
                break;
            case "id":
                this.id = value;
                break;
            case "__accessType":
                if (Google_Activity.class.isAssignableFrom(caller)) {

                    this.__accessType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__accessDataType":
                if (Google_Activity.class.isAssignableFrom(caller)) {

                    this.__accessDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "access":
                this.access = value;
                break;
            case "verb":
                this.verb = value;
                break;
            case "etag":
                this.etag = value;
                break;
            case "radius":
                this.radius = value;
                break;
            case "address":
                this.address = value;
                break;
            case "crosspostSource":
                this.crosspostSource = value;
                break;
            case "annotation":
                this.annotation = value;
                break;
            case "published":
                this.published = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setPlaceName(RuntimeEnv env, Object... args) {
        Object placeName = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Activity.class, "placeName", placeName);

        return null;
    }

    public Object getPlaceName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Activity.class, "placeName"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Activity.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Activity.class, "kind"));
    }

    public Object setUpdated(RuntimeEnv env, Object... args) {
        Object updated = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Activity.class, "updated", updated);

        return null;
    }

    public Object getUpdated(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Activity.class, "updated"));
    }

    public Object setProvider(RuntimeEnv env, Object... args) {
        Object provider = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Activity.class, "provider", provider);

        return null;
    }

    public Object getProvider(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Activity.class, "provider"));
    }

    public Object setTitle(RuntimeEnv env, Object... args) {
        Object title = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Activity.class, "title", title);

        return null;
    }

    public Object getTitle(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Activity.class, "title"));
    }

    public Object setUrl(RuntimeEnv env, Object... args) {
        Object url = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Activity.class, "url", url);

        return null;
    }

    public Object getUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Activity.class, "url"));
    }

    public Object setGeocode(RuntimeEnv env, Object... args) {
        Object geocode = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Activity.class, "geocode", geocode);

        return null;
    }

    public Object getGeocode(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Activity.class, "geocode"));
    }

    public Object setObject(RuntimeEnv env, Object... args) {
        Object _object = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Activity.class, "object", _object);

        return null;
    }

    public Object getObject(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Activity.class, "object"));
    }

    public Object setPlaceId(RuntimeEnv env, Object... args) {
        Object placeId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Activity.class, "placeId", placeId);

        return null;
    }

    public Object getPlaceId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Activity.class, "placeId"));
    }

    public Object setActor(RuntimeEnv env, Object... args) {
        Object actor = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Activity.class, "actor", actor);

        return null;
    }

    public Object getActor(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Activity.class, "actor"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Activity.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Activity.class, "id"));
    }

    public Object setAccess(RuntimeEnv env, Object... args) {
        Object access = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Activity.class, "access", access);

        return null;
    }

    public Object getAccess(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Activity.class, "access"));
    }

    public Object setVerb(RuntimeEnv env, Object... args) {
        Object verb = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Activity.class, "verb", verb);

        return null;
    }

    public Object getVerb(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Activity.class, "verb"));
    }

    public Object setEtag(RuntimeEnv env, Object... args) {
        Object etag = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Activity.class, "etag", etag);

        return null;
    }

    public Object getEtag(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Activity.class, "etag"));
    }

    public Object setRadius(RuntimeEnv env, Object... args) {
        Object radius = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Activity.class, "radius", radius);

        return null;
    }

    public Object getRadius(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Activity.class, "radius"));
    }

    public Object setAddress(RuntimeEnv env, Object... args) {
        Object address = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Activity.class, "address", address);

        return null;
    }

    public Object getAddress(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Activity.class, "address"));
    }

    public Object setCrosspostSource(RuntimeEnv env, Object... args) {
        Object crosspostSource = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Activity.class, "crosspostSource", crosspostSource);

        return null;
    }

    public Object getCrosspostSource(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Activity.class, "crosspostSource"));
    }

    public Object setAnnotation(RuntimeEnv env, Object... args) {
        Object annotation = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Activity.class, "annotation", annotation);

        return null;
    }

    public Object getAnnotation(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Activity.class, "annotation"));
    }

    public Object setPublished(RuntimeEnv env, Object... args) {
        Object published = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Activity.class, "published", published);

        return null;
    }

    public Object getPublished(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Activity.class, "published"));
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
