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

public class Google_ObjectAccessControl extends Google_Model
        implements RuntimeFileContextInterface {

    public Object domain = null;

    public Object _object = null;

    public Object bucket = null;

    public Object kind = null;

    public Object id = null;

    public Object role = null;

    public Object entityId = null;

    public Object entity = null;

    public Object email = null;

    public Object selfLink = null;

    public Google_ObjectAccessControl(RuntimeEnv env, Object... args) {
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
            case "setDomain":
                return this.setDomain(env, args);
            case "getDomain":
                return this.getDomain(env, args);
            case "setObject":
                return this.setObject(env, args);
            case "getObject":
                return this.getObject(env, args);
            case "setBucket":
                return this.setBucket(env, args);
            case "getBucket":
                return this.getBucket(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setRole":
                return this.setRole(env, args);
            case "getRole":
                return this.getRole(env, args);
            case "setEntityId":
                return this.setEntityId(env, args);
            case "getEntityId":
                return this.getEntityId(env, args);
            case "setEntity":
                return this.setEntity(env, args);
            case "getEntity":
                return this.getEntity(env, args);
            case "setEmail":
                return this.setEmail(env, args);
            case "getEmail":
                return this.getEmail(env, args);
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
            case "domain":
                return this.domain;
            case "object":
                return this._object;
            case "bucket":
                return this.bucket;
            case "kind":
                return this.kind;
            case "id":
                return this.id;
            case "role":
                return this.role;
            case "entityId":
                return this.entityId;
            case "entity":
                return this.entity;
            case "email":
                return this.email;
            case "selfLink":
                return this.selfLink;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "domain":
                return ZVal.isNull(this.domain);
            case "object":
                return ZVal.isNull(this._object);
            case "bucket":
                return ZVal.isNull(this.bucket);
            case "kind":
                return ZVal.isNull(this.kind);
            case "id":
                return ZVal.isNull(this.id);
            case "role":
                return ZVal.isNull(this.role);
            case "entityId":
                return ZVal.isNull(this.entityId);
            case "entity":
                return ZVal.isNull(this.entity);
            case "email":
                return ZVal.isNull(this.email);
            case "selfLink":
                return ZVal.isNull(this.selfLink);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "domain":
                this.domain = value;
                break;
            case "object":
                this._object = value;
                break;
            case "bucket":
                this.bucket = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "id":
                this.id = value;
                break;
            case "role":
                this.role = value;
                break;
            case "entityId":
                this.entityId = value;
                break;
            case "entity":
                this.entity = value;
                break;
            case "email":
                this.email = value;
                break;
            case "selfLink":
                this.selfLink = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setDomain(RuntimeEnv env, Object... args) {
        Object domain = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ObjectAccessControl.class, "domain", domain);

        return null;
    }

    public Object getDomain(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ObjectAccessControl.class, "domain"));
    }

    public Object setObject(RuntimeEnv env, Object... args) {
        Object _object = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ObjectAccessControl.class, "object", _object);

        return null;
    }

    public Object getObject(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ObjectAccessControl.class, "object"));
    }

    public Object setBucket(RuntimeEnv env, Object... args) {
        Object bucket = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ObjectAccessControl.class, "bucket", bucket);

        return null;
    }

    public Object getBucket(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ObjectAccessControl.class, "bucket"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ObjectAccessControl.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ObjectAccessControl.class, "kind"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ObjectAccessControl.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ObjectAccessControl.class, "id"));
    }

    public Object setRole(RuntimeEnv env, Object... args) {
        Object role = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ObjectAccessControl.class, "role", role);

        return null;
    }

    public Object getRole(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ObjectAccessControl.class, "role"));
    }

    public Object setEntityId(RuntimeEnv env, Object... args) {
        Object entityId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ObjectAccessControl.class, "entityId", entityId);

        return null;
    }

    public Object getEntityId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ObjectAccessControl.class, "entityId"));
    }

    public Object setEntity(RuntimeEnv env, Object... args) {
        Object entity = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ObjectAccessControl.class, "entity", entity);

        return null;
    }

    public Object getEntity(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ObjectAccessControl.class, "entity"));
    }

    public Object setEmail(RuntimeEnv env, Object... args) {
        Object email = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ObjectAccessControl.class, "email", email);

        return null;
    }

    public Object getEmail(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ObjectAccessControl.class, "email"));
    }

    public Object setSelfLink(RuntimeEnv env, Object... args) {
        Object selfLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ObjectAccessControl.class, "selfLink", selfLink);

        return null;
    }

    public Object getSelfLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ObjectAccessControl.class, "selfLink"));
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
