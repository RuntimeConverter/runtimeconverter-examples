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

public class Google_StorageObjectOwner extends Google_Model implements RuntimeFileContextInterface {

    public Object entityId = null;

    public Object entity = null;

    public Google_StorageObjectOwner(RuntimeEnv env, Object... args) {
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
            case "setEntityId":
                return this.setEntityId(env, args);
            case "getEntityId":
                return this.getEntityId(env, args);
            case "setEntity":
                return this.setEntity(env, args);
            case "getEntity":
                return this.getEntity(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "entityId":
                return this.entityId;
            case "entity":
                return this.entity;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "entityId":
                return ZVal.isNull(this.entityId);
            case "entity":
                return ZVal.isNull(this.entity);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "entityId":
                this.entityId = value;
                break;
            case "entity":
                this.entity = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setEntityId(RuntimeEnv env, Object... args) {
        Object entityId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_StorageObjectOwner.class, "entityId", entityId);

        return null;
    }

    public Object getEntityId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_StorageObjectOwner.class, "entityId"));
    }

    public Object setEntity(RuntimeEnv env, Object... args) {
        Object entity = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_StorageObjectOwner.class, "entity", entity);

        return null;
    }

    public Object getEntity(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_StorageObjectOwner.class, "entity"));
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
