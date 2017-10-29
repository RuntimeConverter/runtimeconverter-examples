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

public class Google_Bucket extends Google_Model implements RuntimeFileContextInterface {

    public Object __websiteType = "Google_BucketWebsite";

    public Object __websiteDataType = "";

    public Object website = null;

    public Object kind = null;

    public Object timeCreated = null;

    public Object projectId = null;

    public Object __aclType = "Google_BucketAccessControl";

    public Object __aclDataType = "array";

    public Object acl = null;

    public Object __defaultObjectAclType = "Google_ObjectAccessControl";

    public Object __defaultObjectAclDataType = "array";

    public Object defaultObjectAcl = null;

    public Object location = null;

    public Object __ownerType = "Google_BucketOwner";

    public Object __ownerDataType = "";

    public Object owner = null;

    public Object id = null;

    public Object selfLink = null;

    public Google_Bucket(RuntimeEnv env, Object... args) {
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
            case "setWebsite":
                return this.setWebsite(env, args);
            case "getWebsite":
                return this.getWebsite(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setTimeCreated":
                return this.setTimeCreated(env, args);
            case "getTimeCreated":
                return this.getTimeCreated(env, args);
            case "setProjectId":
                return this.setProjectId(env, args);
            case "getProjectId":
                return this.getProjectId(env, args);
            case "setAcl":
                return this.setAcl(env, args);
            case "getAcl":
                return this.getAcl(env, args);
            case "setDefaultObjectAcl":
                return this.setDefaultObjectAcl(env, args);
            case "getDefaultObjectAcl":
                return this.getDefaultObjectAcl(env, args);
            case "setLocation":
                return this.setLocation(env, args);
            case "getLocation":
                return this.getLocation(env, args);
            case "setOwner":
                return this.setOwner(env, args);
            case "getOwner":
                return this.getOwner(env, args);
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
            case "__websiteType":
                if (Google_Bucket.class.isAssignableFrom(caller)) {

                    return this.__websiteType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__websiteDataType":
                if (Google_Bucket.class.isAssignableFrom(caller)) {

                    return this.__websiteDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "website":
                return this.website;
            case "kind":
                return this.kind;
            case "timeCreated":
                return this.timeCreated;
            case "projectId":
                return this.projectId;
            case "__aclType":
                if (Google_Bucket.class.isAssignableFrom(caller)) {

                    return this.__aclType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__aclDataType":
                if (Google_Bucket.class.isAssignableFrom(caller)) {

                    return this.__aclDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "acl":
                return this.acl;
            case "__defaultObjectAclType":
                if (Google_Bucket.class.isAssignableFrom(caller)) {

                    return this.__defaultObjectAclType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__defaultObjectAclDataType":
                if (Google_Bucket.class.isAssignableFrom(caller)) {

                    return this.__defaultObjectAclDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "defaultObjectAcl":
                return this.defaultObjectAcl;
            case "location":
                return this.location;
            case "__ownerType":
                if (Google_Bucket.class.isAssignableFrom(caller)) {

                    return this.__ownerType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__ownerDataType":
                if (Google_Bucket.class.isAssignableFrom(caller)) {

                    return this.__ownerDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "owner":
                return this.owner;
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
            case "__websiteType":
                if (Google_Bucket.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__websiteType);
                }
                break;
            case "__websiteDataType":
                if (Google_Bucket.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__websiteDataType);
                }
                break;
            case "website":
                return ZVal.isNull(this.website);
            case "kind":
                return ZVal.isNull(this.kind);
            case "timeCreated":
                return ZVal.isNull(this.timeCreated);
            case "projectId":
                return ZVal.isNull(this.projectId);
            case "__aclType":
                if (Google_Bucket.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__aclType);
                }
                break;
            case "__aclDataType":
                if (Google_Bucket.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__aclDataType);
                }
                break;
            case "acl":
                return ZVal.isNull(this.acl);
            case "__defaultObjectAclType":
                if (Google_Bucket.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__defaultObjectAclType);
                }
                break;
            case "__defaultObjectAclDataType":
                if (Google_Bucket.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__defaultObjectAclDataType);
                }
                break;
            case "defaultObjectAcl":
                return ZVal.isNull(this.defaultObjectAcl);
            case "location":
                return ZVal.isNull(this.location);
            case "__ownerType":
                if (Google_Bucket.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__ownerType);
                }
                break;
            case "__ownerDataType":
                if (Google_Bucket.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__ownerDataType);
                }
                break;
            case "owner":
                return ZVal.isNull(this.owner);
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
            case "__websiteType":
                if (Google_Bucket.class.isAssignableFrom(caller)) {

                    this.__websiteType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__websiteDataType":
                if (Google_Bucket.class.isAssignableFrom(caller)) {

                    this.__websiteDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "website":
                this.website = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "timeCreated":
                this.timeCreated = value;
                break;
            case "projectId":
                this.projectId = value;
                break;
            case "__aclType":
                if (Google_Bucket.class.isAssignableFrom(caller)) {

                    this.__aclType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__aclDataType":
                if (Google_Bucket.class.isAssignableFrom(caller)) {

                    this.__aclDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "acl":
                this.acl = value;
                break;
            case "__defaultObjectAclType":
                if (Google_Bucket.class.isAssignableFrom(caller)) {

                    this.__defaultObjectAclType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__defaultObjectAclDataType":
                if (Google_Bucket.class.isAssignableFrom(caller)) {

                    this.__defaultObjectAclDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "defaultObjectAcl":
                this.defaultObjectAcl = value;
                break;
            case "location":
                this.location = value;
                break;
            case "__ownerType":
                if (Google_Bucket.class.isAssignableFrom(caller)) {

                    this.__ownerType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__ownerDataType":
                if (Google_Bucket.class.isAssignableFrom(caller)) {

                    this.__ownerDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "owner":
                this.owner = value;
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

    public Object setWebsite(RuntimeEnv env, Object... args) {
        Object website = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Bucket.class, "website", website);

        return null;
    }

    public Object getWebsite(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Bucket.class, "website"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Bucket.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Bucket.class, "kind"));
    }

    public Object setTimeCreated(RuntimeEnv env, Object... args) {
        Object timeCreated = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Bucket.class, "timeCreated", timeCreated);

        return null;
    }

    public Object getTimeCreated(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Bucket.class, "timeCreated"));
    }

    public Object setProjectId(RuntimeEnv env, Object... args) {
        Object projectId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Bucket.class, "projectId", projectId);

        return null;
    }

    public Object getProjectId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Bucket.class, "projectId"));
    }

    public Object setAcl(RuntimeEnv env, Object... args) {
        Object acl = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Bucket.class,
                acl,
                "Google_BucketAccessControl",
                "setAcl");
        ZVal.setProperty(this, Google_Bucket.class, "acl", acl);

        return null;
    }

    public Object getAcl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Bucket.class, "acl"));
    }

    public Object setDefaultObjectAcl(RuntimeEnv env, Object... args) {
        Object defaultObjectAcl = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Bucket.class,
                defaultObjectAcl,
                "Google_ObjectAccessControl",
                "setDefaultObjectAcl");
        ZVal.setProperty(this, Google_Bucket.class, "defaultObjectAcl", defaultObjectAcl);

        return null;
    }

    public Object getDefaultObjectAcl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Bucket.class, "defaultObjectAcl"));
    }

    public Object setLocation(RuntimeEnv env, Object... args) {
        Object location = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Bucket.class, "location", location);

        return null;
    }

    public Object getLocation(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Bucket.class, "location"));
    }

    public Object setOwner(RuntimeEnv env, Object... args) {
        Object owner = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Bucket.class, "owner", owner);

        return null;
    }

    public Object getOwner(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Bucket.class, "owner"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Bucket.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Bucket.class, "id"));
    }

    public Object setSelfLink(RuntimeEnv env, Object... args) {
        Object selfLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Bucket.class, "selfLink", selfLink);

        return null;
    }

    public Object getSelfLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Bucket.class, "selfLink"));
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
