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

 google-api-php-client/src/contrib/Google_LicensingService.php

*/

public class Google_LicenseAssignment extends Google_Model implements RuntimeFileContextInterface {

    public Object skuId = null;

    public Object kind = null;

    public Object userId = null;

    public Object etags = null;

    public Object selfLink = null;

    public Object productId = null;

    public Google_LicenseAssignment(RuntimeEnv env, Object... args) {
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
            case "setSkuId":
                return this.setSkuId(env, args);
            case "getSkuId":
                return this.getSkuId(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setUserId":
                return this.setUserId(env, args);
            case "getUserId":
                return this.getUserId(env, args);
            case "setEtags":
                return this.setEtags(env, args);
            case "getEtags":
                return this.getEtags(env, args);
            case "setSelfLink":
                return this.setSelfLink(env, args);
            case "getSelfLink":
                return this.getSelfLink(env, args);
            case "setProductId":
                return this.setProductId(env, args);
            case "getProductId":
                return this.getProductId(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "skuId":
                return this.skuId;
            case "kind":
                return this.kind;
            case "userId":
                return this.userId;
            case "etags":
                return this.etags;
            case "selfLink":
                return this.selfLink;
            case "productId":
                return this.productId;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "skuId":
                return ZVal.isNull(this.skuId);
            case "kind":
                return ZVal.isNull(this.kind);
            case "userId":
                return ZVal.isNull(this.userId);
            case "etags":
                return ZVal.isNull(this.etags);
            case "selfLink":
                return ZVal.isNull(this.selfLink);
            case "productId":
                return ZVal.isNull(this.productId);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "skuId":
                this.skuId = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "userId":
                this.userId = value;
                break;
            case "etags":
                this.etags = value;
                break;
            case "selfLink":
                this.selfLink = value;
                break;
            case "productId":
                this.productId = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setSkuId(RuntimeEnv env, Object... args) {
        Object skuId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_LicenseAssignment.class, "skuId", skuId);

        return null;
    }

    public Object getSkuId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_LicenseAssignment.class, "skuId"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_LicenseAssignment.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_LicenseAssignment.class, "kind"));
    }

    public Object setUserId(RuntimeEnv env, Object... args) {
        Object userId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_LicenseAssignment.class, "userId", userId);

        return null;
    }

    public Object getUserId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_LicenseAssignment.class, "userId"));
    }

    public Object setEtags(RuntimeEnv env, Object... args) {
        Object etags = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_LicenseAssignment.class, "etags", etags);

        return null;
    }

    public Object getEtags(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_LicenseAssignment.class, "etags"));
    }

    public Object setSelfLink(RuntimeEnv env, Object... args) {
        Object selfLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_LicenseAssignment.class, "selfLink", selfLink);

        return null;
    }

    public Object getSelfLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_LicenseAssignment.class, "selfLink"));
    }

    public Object setProductId(RuntimeEnv env, Object... args) {
        Object productId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_LicenseAssignment.class, "productId", productId);

        return null;
    }

    public Object getProductId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_LicenseAssignment.class, "productId"));
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
