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

 google-api-php-client/src/contrib/Google_DriveService.php

*/

public class Google_Permission extends Google_Model implements RuntimeFileContextInterface {

    public Object withLink = null;

    public Object kind = null;

    public Object name = null;

    public Object value = null;

    public Object id = null;

    public Object authKey = null;

    public Object etag = null;

    public Object role = null;

    public Object photoLink = null;

    public Object type = null;

    public Object additionalRoles = null;

    public Object selfLink = null;

    public Google_Permission(RuntimeEnv env, Object... args) {
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
            case "setWithLink":
                return this.setWithLink(env, args);
            case "getWithLink":
                return this.getWithLink(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setName":
                return this.setName(env, args);
            case "getName":
                return this.getName(env, args);
            case "setValue":
                return this.setValue(env, args);
            case "getValue":
                return this.getValue(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setAuthKey":
                return this.setAuthKey(env, args);
            case "getAuthKey":
                return this.getAuthKey(env, args);
            case "setEtag":
                return this.setEtag(env, args);
            case "getEtag":
                return this.getEtag(env, args);
            case "setRole":
                return this.setRole(env, args);
            case "getRole":
                return this.getRole(env, args);
            case "setPhotoLink":
                return this.setPhotoLink(env, args);
            case "getPhotoLink":
                return this.getPhotoLink(env, args);
            case "setType":
                return this.setType(env, args);
            case "getType":
                return this.getType(env, args);
            case "setAdditionalRoles":
                return this.setAdditionalRoles(env, args);
            case "getAdditionalRoles":
                return this.getAdditionalRoles(env, args);
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
            case "withLink":
                return this.withLink;
            case "kind":
                return this.kind;
            case "name":
                return this.name;
            case "value":
                return this.value;
            case "id":
                return this.id;
            case "authKey":
                return this.authKey;
            case "etag":
                return this.etag;
            case "role":
                return this.role;
            case "photoLink":
                return this.photoLink;
            case "type":
                return this.type;
            case "additionalRoles":
                return this.additionalRoles;
            case "selfLink":
                return this.selfLink;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "withLink":
                return ZVal.isNull(this.withLink);
            case "kind":
                return ZVal.isNull(this.kind);
            case "name":
                return ZVal.isNull(this.name);
            case "value":
                return ZVal.isNull(this.value);
            case "id":
                return ZVal.isNull(this.id);
            case "authKey":
                return ZVal.isNull(this.authKey);
            case "etag":
                return ZVal.isNull(this.etag);
            case "role":
                return ZVal.isNull(this.role);
            case "photoLink":
                return ZVal.isNull(this.photoLink);
            case "type":
                return ZVal.isNull(this.type);
            case "additionalRoles":
                return ZVal.isNull(this.additionalRoles);
            case "selfLink":
                return ZVal.isNull(this.selfLink);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "withLink":
                this.withLink = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "name":
                this.name = value;
                break;
            case "value":
                this.value = value;
                break;
            case "id":
                this.id = value;
                break;
            case "authKey":
                this.authKey = value;
                break;
            case "etag":
                this.etag = value;
                break;
            case "role":
                this.role = value;
                break;
            case "photoLink":
                this.photoLink = value;
                break;
            case "type":
                this.type = value;
                break;
            case "additionalRoles":
                this.additionalRoles = value;
                break;
            case "selfLink":
                this.selfLink = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setWithLink(RuntimeEnv env, Object... args) {
        Object withLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Permission.class, "withLink", withLink);

        return null;
    }

    public Object getWithLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Permission.class, "withLink"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Permission.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Permission.class, "kind"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Permission.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Permission.class, "name"));
    }

    public Object setValue(RuntimeEnv env, Object... args) {
        Object value = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Permission.class, "value", value);

        return null;
    }

    public Object getValue(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Permission.class, "value"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Permission.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Permission.class, "id"));
    }

    public Object setAuthKey(RuntimeEnv env, Object... args) {
        Object authKey = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Permission.class, "authKey", authKey);

        return null;
    }

    public Object getAuthKey(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Permission.class, "authKey"));
    }

    public Object setEtag(RuntimeEnv env, Object... args) {
        Object etag = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Permission.class, "etag", etag);

        return null;
    }

    public Object getEtag(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Permission.class, "etag"));
    }

    public Object setRole(RuntimeEnv env, Object... args) {
        Object role = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Permission.class, "role", role);

        return null;
    }

    public Object getRole(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Permission.class, "role"));
    }

    public Object setPhotoLink(RuntimeEnv env, Object... args) {
        Object photoLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Permission.class, "photoLink", photoLink);

        return null;
    }

    public Object getPhotoLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Permission.class, "photoLink"));
    }

    public Object setType(RuntimeEnv env, Object... args) {
        Object type = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Permission.class, "type", type);

        return null;
    }

    public Object getType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Permission.class, "type"));
    }

    public Object setAdditionalRoles(RuntimeEnv env, Object... args) {
        Object additionalRoles = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Permission.class,
                additionalRoles,
                "Google_string",
                "setAdditionalRoles");
        ZVal.setProperty(this, Google_Permission.class, "additionalRoles", additionalRoles);

        return null;
    }

    public Object getAdditionalRoles(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Permission.class, "additionalRoles"));
    }

    public Object setSelfLink(RuntimeEnv env, Object... args) {
        Object selfLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Permission.class, "selfLink", selfLink);

        return null;
    }

    public Object getSelfLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Permission.class, "selfLink"));
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
