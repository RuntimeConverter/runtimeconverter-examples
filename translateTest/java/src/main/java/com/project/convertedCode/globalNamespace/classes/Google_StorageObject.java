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

 google-api-php-client/src/contrib/Google_StorageService.php

*/

public class Google_StorageObject extends Google_Model implements RuntimeFileContextInterface {

    public Object kind = null;

    public Object name = null;

    public Object __mediaType = "Google_StorageObjectMedia";

    public Object __mediaDataType = "";

    public Object media = null;

    public Object bucket = null;

    public Object contentEncoding = null;

    public Object selfLink = null;

    public Object __ownerType = "Google_StorageObjectOwner";

    public Object __ownerDataType = "";

    public Object owner = null;

    public Object cacheControl = null;

    public Object __aclType = "Google_ObjectAccessControl";

    public Object __aclDataType = "array";

    public Object acl = null;

    public Object id = null;

    public Object contentDisposition = null;

    public Object metadata = null;

    public Google_StorageObject(RuntimeEnv env, Object... args) {
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
            case "setName":
                return this.setName(env, args);
            case "getName":
                return this.getName(env, args);
            case "setMedia":
                return this.setMedia(env, args);
            case "getMedia":
                return this.getMedia(env, args);
            case "setBucket":
                return this.setBucket(env, args);
            case "getBucket":
                return this.getBucket(env, args);
            case "setContentEncoding":
                return this.setContentEncoding(env, args);
            case "getContentEncoding":
                return this.getContentEncoding(env, args);
            case "setSelfLink":
                return this.setSelfLink(env, args);
            case "getSelfLink":
                return this.getSelfLink(env, args);
            case "setOwner":
                return this.setOwner(env, args);
            case "getOwner":
                return this.getOwner(env, args);
            case "setCacheControl":
                return this.setCacheControl(env, args);
            case "getCacheControl":
                return this.getCacheControl(env, args);
            case "setAcl":
                return this.setAcl(env, args);
            case "getAcl":
                return this.getAcl(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setContentDisposition":
                return this.setContentDisposition(env, args);
            case "getContentDisposition":
                return this.getContentDisposition(env, args);
            case "setMetadata":
                return this.setMetadata(env, args);
            case "getMetadata":
                return this.getMetadata(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return this.kind;
            case "name":
                return this.name;
            case "__mediaType":
                if (Google_StorageObject.class.isAssignableFrom(caller)) {

                    return this.__mediaType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__mediaDataType":
                if (Google_StorageObject.class.isAssignableFrom(caller)) {

                    return this.__mediaDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "media":
                return this.media;
            case "bucket":
                return this.bucket;
            case "contentEncoding":
                return this.contentEncoding;
            case "selfLink":
                return this.selfLink;
            case "__ownerType":
                if (Google_StorageObject.class.isAssignableFrom(caller)) {

                    return this.__ownerType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__ownerDataType":
                if (Google_StorageObject.class.isAssignableFrom(caller)) {

                    return this.__ownerDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "owner":
                return this.owner;
            case "cacheControl":
                return this.cacheControl;
            case "__aclType":
                if (Google_StorageObject.class.isAssignableFrom(caller)) {

                    return this.__aclType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__aclDataType":
                if (Google_StorageObject.class.isAssignableFrom(caller)) {

                    return this.__aclDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "acl":
                return this.acl;
            case "id":
                return this.id;
            case "contentDisposition":
                return this.contentDisposition;
            case "metadata":
                return this.metadata;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return ZVal.isNull(this.kind);
            case "name":
                return ZVal.isNull(this.name);
            case "__mediaType":
                if (Google_StorageObject.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__mediaType);
                }
                break;
            case "__mediaDataType":
                if (Google_StorageObject.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__mediaDataType);
                }
                break;
            case "media":
                return ZVal.isNull(this.media);
            case "bucket":
                return ZVal.isNull(this.bucket);
            case "contentEncoding":
                return ZVal.isNull(this.contentEncoding);
            case "selfLink":
                return ZVal.isNull(this.selfLink);
            case "__ownerType":
                if (Google_StorageObject.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__ownerType);
                }
                break;
            case "__ownerDataType":
                if (Google_StorageObject.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__ownerDataType);
                }
                break;
            case "owner":
                return ZVal.isNull(this.owner);
            case "cacheControl":
                return ZVal.isNull(this.cacheControl);
            case "__aclType":
                if (Google_StorageObject.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__aclType);
                }
                break;
            case "__aclDataType":
                if (Google_StorageObject.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__aclDataType);
                }
                break;
            case "acl":
                return ZVal.isNull(this.acl);
            case "id":
                return ZVal.isNull(this.id);
            case "contentDisposition":
                return ZVal.isNull(this.contentDisposition);
            case "metadata":
                return ZVal.isNull(this.metadata);
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
            case "name":
                this.name = value;
                break;
            case "__mediaType":
                if (Google_StorageObject.class.isAssignableFrom(caller)) {

                    this.__mediaType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__mediaDataType":
                if (Google_StorageObject.class.isAssignableFrom(caller)) {

                    this.__mediaDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "media":
                this.media = value;
                break;
            case "bucket":
                this.bucket = value;
                break;
            case "contentEncoding":
                this.contentEncoding = value;
                break;
            case "selfLink":
                this.selfLink = value;
                break;
            case "__ownerType":
                if (Google_StorageObject.class.isAssignableFrom(caller)) {

                    this.__ownerType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__ownerDataType":
                if (Google_StorageObject.class.isAssignableFrom(caller)) {

                    this.__ownerDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "owner":
                this.owner = value;
                break;
            case "cacheControl":
                this.cacheControl = value;
                break;
            case "__aclType":
                if (Google_StorageObject.class.isAssignableFrom(caller)) {

                    this.__aclType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__aclDataType":
                if (Google_StorageObject.class.isAssignableFrom(caller)) {

                    this.__aclDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "acl":
                this.acl = value;
                break;
            case "id":
                this.id = value;
                break;
            case "contentDisposition":
                this.contentDisposition = value;
                break;
            case "metadata":
                this.metadata = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_StorageObject.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_StorageObject.class, "kind"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_StorageObject.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_StorageObject.class, "name"));
    }

    public Object setMedia(RuntimeEnv env, Object... args) {
        Object media = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_StorageObject.class, "media", media);

        return null;
    }

    public Object getMedia(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_StorageObject.class, "media"));
    }

    public Object setBucket(RuntimeEnv env, Object... args) {
        Object bucket = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_StorageObject.class, "bucket", bucket);

        return null;
    }

    public Object getBucket(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_StorageObject.class, "bucket"));
    }

    public Object setContentEncoding(RuntimeEnv env, Object... args) {
        Object contentEncoding = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_StorageObject.class, "contentEncoding", contentEncoding);

        return null;
    }

    public Object getContentEncoding(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_StorageObject.class, "contentEncoding"));
    }

    public Object setSelfLink(RuntimeEnv env, Object... args) {
        Object selfLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_StorageObject.class, "selfLink", selfLink);

        return null;
    }

    public Object getSelfLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_StorageObject.class, "selfLink"));
    }

    public Object setOwner(RuntimeEnv env, Object... args) {
        Object owner = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_StorageObject.class, "owner", owner);

        return null;
    }

    public Object getOwner(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_StorageObject.class, "owner"));
    }

    public Object setCacheControl(RuntimeEnv env, Object... args) {
        Object cacheControl = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_StorageObject.class, "cacheControl", cacheControl);

        return null;
    }

    public Object getCacheControl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_StorageObject.class, "cacheControl"));
    }

    public Object setAcl(RuntimeEnv env, Object... args) {
        Object acl = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_StorageObject.class,
                acl,
                "Google_ObjectAccessControl",
                "setAcl");
        ZVal.setProperty(this, Google_StorageObject.class, "acl", acl);

        return null;
    }

    public Object getAcl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_StorageObject.class, "acl"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_StorageObject.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_StorageObject.class, "id"));
    }

    public Object setContentDisposition(RuntimeEnv env, Object... args) {
        Object contentDisposition = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_StorageObject.class, "contentDisposition", contentDisposition);

        return null;
    }

    public Object getContentDisposition(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_StorageObject.class, "contentDisposition"));
    }

    public Object setMetadata(RuntimeEnv env, Object... args) {
        Object metadata = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_StorageObject.class, "metadata", metadata);

        return null;
    }

    public Object getMetadata(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_StorageObject.class, "metadata"));
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
