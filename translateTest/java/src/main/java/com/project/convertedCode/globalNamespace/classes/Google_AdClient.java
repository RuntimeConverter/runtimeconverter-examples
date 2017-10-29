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

 google-api-php-client/src/contrib/Google_AdsensehostService.php

*/

public class Google_AdClient extends Google_Model implements RuntimeFileContextInterface {

    public Object productCode = null;

    public Object kind = null;

    public Object id = null;

    public Object arcOptIn = null;

    public Object supportsReporting = null;

    public Google_AdClient(RuntimeEnv env, Object... args) {
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
            case "setProductCode":
                return this.setProductCode(env, args);
            case "getProductCode":
                return this.getProductCode(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setArcOptIn":
                return this.setArcOptIn(env, args);
            case "getArcOptIn":
                return this.getArcOptIn(env, args);
            case "setSupportsReporting":
                return this.setSupportsReporting(env, args);
            case "getSupportsReporting":
                return this.getSupportsReporting(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "productCode":
                return this.productCode;
            case "kind":
                return this.kind;
            case "id":
                return this.id;
            case "arcOptIn":
                return this.arcOptIn;
            case "supportsReporting":
                return this.supportsReporting;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "productCode":
                return ZVal.isNull(this.productCode);
            case "kind":
                return ZVal.isNull(this.kind);
            case "id":
                return ZVal.isNull(this.id);
            case "arcOptIn":
                return ZVal.isNull(this.arcOptIn);
            case "supportsReporting":
                return ZVal.isNull(this.supportsReporting);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "productCode":
                this.productCode = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "id":
                this.id = value;
                break;
            case "arcOptIn":
                this.arcOptIn = value;
                break;
            case "supportsReporting":
                this.supportsReporting = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setProductCode(RuntimeEnv env, Object... args) {
        Object productCode = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AdClient.class, "productCode", productCode);

        return null;
    }

    public Object getProductCode(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AdClient.class, "productCode"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AdClient.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AdClient.class, "kind"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AdClient.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AdClient.class, "id"));
    }

    public Object setArcOptIn(RuntimeEnv env, Object... args) {
        Object arcOptIn = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AdClient.class, "arcOptIn", arcOptIn);

        return null;
    }

    public Object getArcOptIn(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AdClient.class, "arcOptIn"));
    }

    public Object setSupportsReporting(RuntimeEnv env, Object... args) {
        Object supportsReporting = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AdClient.class, "supportsReporting", supportsReporting);

        return null;
    }

    public Object getSupportsReporting(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AdClient.class, "supportsReporting"));
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
