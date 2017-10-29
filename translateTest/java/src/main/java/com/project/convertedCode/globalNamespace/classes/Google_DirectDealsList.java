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

 google-api-php-client/src/contrib/Google_AdexchangebuyerService.php

*/

public class Google_DirectDealsList extends Google_Model implements RuntimeFileContextInterface {

    public Object kind = null;

    public Object __directDealsType = "Google_DirectDeal";

    public Object __directDealsDataType = "array";

    public Object directDeals = null;

    public Google_DirectDealsList(RuntimeEnv env, Object... args) {
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
            case "setDirectDeals":
                return this.setDirectDeals(env, args);
            case "getDirectDeals":
                return this.getDirectDeals(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return this.kind;
            case "__directDealsType":
                if (Google_DirectDealsList.class.isAssignableFrom(caller)) {

                    return this.__directDealsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__directDealsDataType":
                if (Google_DirectDealsList.class.isAssignableFrom(caller)) {

                    return this.__directDealsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "directDeals":
                return this.directDeals;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return ZVal.isNull(this.kind);
            case "__directDealsType":
                if (Google_DirectDealsList.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__directDealsType);
                }
                break;
            case "__directDealsDataType":
                if (Google_DirectDealsList.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__directDealsDataType);
                }
                break;
            case "directDeals":
                return ZVal.isNull(this.directDeals);
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
            case "__directDealsType":
                if (Google_DirectDealsList.class.isAssignableFrom(caller)) {

                    this.__directDealsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__directDealsDataType":
                if (Google_DirectDealsList.class.isAssignableFrom(caller)) {

                    this.__directDealsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "directDeals":
                this.directDeals = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DirectDealsList.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DirectDealsList.class, "kind"));
    }

    public Object setDirectDeals(RuntimeEnv env, Object... args) {
        Object directDeals = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_DirectDealsList.class,
                directDeals,
                "Google_DirectDeal",
                "setDirectDeals");
        ZVal.setProperty(this, Google_DirectDealsList.class, "directDeals", directDeals);

        return null;
    }

    public Object getDirectDeals(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DirectDealsList.class, "directDeals"));
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
