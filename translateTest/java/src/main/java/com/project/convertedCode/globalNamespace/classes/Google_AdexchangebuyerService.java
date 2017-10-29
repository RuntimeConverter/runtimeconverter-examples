package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.classes.Google_AccountsServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_DirectDealsServiceResource;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Google_Service;
import com.project.convertedCode.globalNamespace.classes.Google_CreativesServiceResource;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_AdexchangebuyerService.php

*/

public class Google_AdexchangebuyerService extends Google_Service
        implements RuntimeFileContextInterface {

    public Object directDeals = null;

    public Object accounts = null;

    public Object creatives = null;

    public Google_AdexchangebuyerService(RuntimeEnv env, Object... args) {
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
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "directDeals":
                return this.directDeals;
            case "accounts":
                return this.accounts;
            case "creatives":
                return this.creatives;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "directDeals":
                return ZVal.isNull(this.directDeals);
            case "accounts":
                return ZVal.isNull(this.accounts);
            case "creatives":
                return ZVal.isNull(this.creatives);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "directDeals":
                this.directDeals = value;
                break;
            case "accounts":
                this.accounts = value;
                break;
            case "creatives":
                this.creatives = value;
                break;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object client = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_AdexchangebuyerService.class, "servicePath", "adexchangebuyer/v1/");
        ZVal.setProperty(this, Google_AdexchangebuyerService.class, "version", "v1");
        ZVal.setProperty(
                this, Google_AdexchangebuyerService.class, "serviceName", "adexchangebuyer");
        env.callMethod(
                client,
                "addService",
                Google_AdexchangebuyerService.class,
                ZVal.getProperty(this, Google_AdexchangebuyerService.class, "serviceName"),
                ZVal.getProperty(this, Google_AdexchangebuyerService.class, "version"));
        ZVal.setProperty(
                this,
                Google_AdexchangebuyerService.class,
                "directDeals",
                new Google_DirectDealsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_AdexchangebuyerService.class, "serviceName"),
                        "directDeals",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/adexchange.buyer\"], \"path\": \"directdeals\", \"response\": {\"$ref\": \"DirectDealsList\"}, \"id\": \"adexchangebuyer.directDeals.list\", \"httpMethod\": \"GET\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/adexchange.buyer\"], \"parameters\": {\"id\": {\"required\": true, \"type\": \"string\", \"location\": \"path\", \"format\": \"int64\"}}, \"id\": \"adexchangebuyer.directDeals.get\", \"httpMethod\": \"GET\", \"path\": \"directdeals/{id}\", \"response\": {\"$ref\": \"DirectDeal\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_AdexchangebuyerService.class,
                "accounts",
                new Google_AccountsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_AdexchangebuyerService.class, "serviceName"),
                        "accounts",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"patch\": {\"scopes\": [\"https://www.googleapis.com/auth/adexchange.buyer\"], \"parameters\": {\"id\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"int32\"}}, \"request\": {\"$ref\": \"Account\"}, \"response\": {\"$ref\": \"Account\"}, \"httpMethod\": \"PATCH\", \"path\": \"accounts/{id}\", \"id\": \"adexchangebuyer.accounts.patch\"}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/adexchange.buyer\"], \"path\": \"accounts\", \"response\": {\"$ref\": \"AccountsList\"}, \"id\": \"adexchangebuyer.accounts.list\", \"httpMethod\": \"GET\"}, \"update\": {\"scopes\": [\"https://www.googleapis.com/auth/adexchange.buyer\"], \"parameters\": {\"id\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"int32\"}}, \"request\": {\"$ref\": \"Account\"}, \"response\": {\"$ref\": \"Account\"}, \"httpMethod\": \"PUT\", \"path\": \"accounts/{id}\", \"id\": \"adexchangebuyer.accounts.update\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/adexchange.buyer\"], \"parameters\": {\"id\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"int32\"}}, \"id\": \"adexchangebuyer.accounts.get\", \"httpMethod\": \"GET\", \"path\": \"accounts/{id}\", \"response\": {\"$ref\": \"Account\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_AdexchangebuyerService.class,
                "creatives",
                new Google_CreativesServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_AdexchangebuyerService.class, "serviceName"),
                        "creatives",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/adexchange.buyer\"], \"request\": {\"$ref\": \"Creative\"}, \"response\": {\"$ref\": \"Creative\"}, \"httpMethod\": \"POST\", \"path\": \"creatives\", \"id\": \"adexchangebuyer.creatives.insert\"}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/adexchange.buyer\"], \"parameters\": {\"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"maxResults\": {\"location\": \"query\", \"minimum\": \"1\", \"type\": \"integer\", \"maximum\": \"1000\", \"format\": \"uint32\"}}, \"response\": {\"$ref\": \"CreativesList\"}, \"httpMethod\": \"GET\", \"path\": \"creatives\", \"id\": \"adexchangebuyer.creatives.list\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/adexchange.buyer\"], \"parameters\": {\"adgroupId\": {\"required\": true, \"type\": \"string\", \"location\": \"query\", \"format\": \"int64\"}, \"buyerCreativeId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"accountId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"int32\"}}, \"id\": \"adexchangebuyer.creatives.get\", \"httpMethod\": \"GET\", \"path\": \"creatives/{accountId}/{buyerCreativeId}\", \"response\": {\"$ref\": \"Creative\"}}}}",
                                true)));

        return null;
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
