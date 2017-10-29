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

 google-api-php-client/src/contrib/Google_ShoppingService.php

*/

public class Google_ProductsStores extends Google_Model implements RuntimeFileContextInterface {

    public Object storeCode = null;

    public Object name = null;

    public Object storeName = null;

    public Object storeId = null;

    public Object telephone = null;

    public Object location = null;

    public Object address = null;

    public Google_ProductsStores(RuntimeEnv env, Object... args) {
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
            case "setStoreCode":
                return this.setStoreCode(env, args);
            case "getStoreCode":
                return this.getStoreCode(env, args);
            case "setName":
                return this.setName(env, args);
            case "getName":
                return this.getName(env, args);
            case "setStoreName":
                return this.setStoreName(env, args);
            case "getStoreName":
                return this.getStoreName(env, args);
            case "setStoreId":
                return this.setStoreId(env, args);
            case "getStoreId":
                return this.getStoreId(env, args);
            case "setTelephone":
                return this.setTelephone(env, args);
            case "getTelephone":
                return this.getTelephone(env, args);
            case "setLocation":
                return this.setLocation(env, args);
            case "getLocation":
                return this.getLocation(env, args);
            case "setAddress":
                return this.setAddress(env, args);
            case "getAddress":
                return this.getAddress(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "storeCode":
                return this.storeCode;
            case "name":
                return this.name;
            case "storeName":
                return this.storeName;
            case "storeId":
                return this.storeId;
            case "telephone":
                return this.telephone;
            case "location":
                return this.location;
            case "address":
                return this.address;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "storeCode":
                return ZVal.isNull(this.storeCode);
            case "name":
                return ZVal.isNull(this.name);
            case "storeName":
                return ZVal.isNull(this.storeName);
            case "storeId":
                return ZVal.isNull(this.storeId);
            case "telephone":
                return ZVal.isNull(this.telephone);
            case "location":
                return ZVal.isNull(this.location);
            case "address":
                return ZVal.isNull(this.address);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "storeCode":
                this.storeCode = value;
                break;
            case "name":
                this.name = value;
                break;
            case "storeName":
                this.storeName = value;
                break;
            case "storeId":
                this.storeId = value;
                break;
            case "telephone":
                this.telephone = value;
                break;
            case "location":
                this.location = value;
                break;
            case "address":
                this.address = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setStoreCode(RuntimeEnv env, Object... args) {
        Object storeCode = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ProductsStores.class, "storeCode", storeCode);

        return null;
    }

    public Object getStoreCode(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ProductsStores.class, "storeCode"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ProductsStores.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ProductsStores.class, "name"));
    }

    public Object setStoreName(RuntimeEnv env, Object... args) {
        Object storeName = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ProductsStores.class, "storeName", storeName);

        return null;
    }

    public Object getStoreName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ProductsStores.class, "storeName"));
    }

    public Object setStoreId(RuntimeEnv env, Object... args) {
        Object storeId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ProductsStores.class, "storeId", storeId);

        return null;
    }

    public Object getStoreId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ProductsStores.class, "storeId"));
    }

    public Object setTelephone(RuntimeEnv env, Object... args) {
        Object telephone = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ProductsStores.class, "telephone", telephone);

        return null;
    }

    public Object getTelephone(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ProductsStores.class, "telephone"));
    }

    public Object setLocation(RuntimeEnv env, Object... args) {
        Object location = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ProductsStores.class, "location", location);

        return null;
    }

    public Object getLocation(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ProductsStores.class, "location"));
    }

    public Object setAddress(RuntimeEnv env, Object... args) {
        Object address = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ProductsStores.class, "address", address);

        return null;
    }

    public Object getAddress(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ProductsStores.class, "address"));
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
