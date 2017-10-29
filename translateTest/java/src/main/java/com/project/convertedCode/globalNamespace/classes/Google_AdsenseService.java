package com.project.convertedCode.globalNamespace.classes;

import com.project.convertedCode.globalNamespace.classes.Google_AccountsCustomchannelsServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_AccountsCustomchannelsAdunitsServiceResource;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Google_AccountsAdunitsServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_AccountsUrlchannelsServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_UrlchannelsServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_CustomchannelsServiceResource;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Google_AdclientsServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_Service;
import com.project.convertedCode.globalNamespace.classes.Google_AdunitsServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_AccountsReportsServiceResource;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.classes.Google_AccountsAdunitsCustomchannelsServiceResource;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Google_AdunitsCustomchannelsServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_CustomchannelsAdunitsServiceResource;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.classes.Google_AccountsServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_ReportsServiceResource;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.classes.Google_AccountsAdclientsServiceResource;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_AdsenseService.php

*/

public class Google_AdsenseService extends Google_Service implements RuntimeFileContextInterface {

    public Object urlchannels = null;

    public Object adunits = null;

    public Object adunits_customchannels = null;

    public Object adclients = null;

    public Object reports = null;

    public Object accounts = null;

    public Object accounts_urlchannels = null;

    public Object accounts_adunits = null;

    public Object accounts_adunits_customchannels = null;

    public Object accounts_adclients = null;

    public Object accounts_reports = null;

    public Object accounts_customchannels = null;

    public Object accounts_customchannels_adunits = null;

    public Object customchannels = null;

    public Object customchannels_adunits = null;

    public Google_AdsenseService(RuntimeEnv env, Object... args) {
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
            case "urlchannels":
                return this.urlchannels;
            case "adunits":
                return this.adunits;
            case "adunits_customchannels":
                return this.adunits_customchannels;
            case "adclients":
                return this.adclients;
            case "reports":
                return this.reports;
            case "accounts":
                return this.accounts;
            case "accounts_urlchannels":
                return this.accounts_urlchannels;
            case "accounts_adunits":
                return this.accounts_adunits;
            case "accounts_adunits_customchannels":
                return this.accounts_adunits_customchannels;
            case "accounts_adclients":
                return this.accounts_adclients;
            case "accounts_reports":
                return this.accounts_reports;
            case "accounts_customchannels":
                return this.accounts_customchannels;
            case "accounts_customchannels_adunits":
                return this.accounts_customchannels_adunits;
            case "customchannels":
                return this.customchannels;
            case "customchannels_adunits":
                return this.customchannels_adunits;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "urlchannels":
                return ZVal.isNull(this.urlchannels);
            case "adunits":
                return ZVal.isNull(this.adunits);
            case "adunits_customchannels":
                return ZVal.isNull(this.adunits_customchannels);
            case "adclients":
                return ZVal.isNull(this.adclients);
            case "reports":
                return ZVal.isNull(this.reports);
            case "accounts":
                return ZVal.isNull(this.accounts);
            case "accounts_urlchannels":
                return ZVal.isNull(this.accounts_urlchannels);
            case "accounts_adunits":
                return ZVal.isNull(this.accounts_adunits);
            case "accounts_adunits_customchannels":
                return ZVal.isNull(this.accounts_adunits_customchannels);
            case "accounts_adclients":
                return ZVal.isNull(this.accounts_adclients);
            case "accounts_reports":
                return ZVal.isNull(this.accounts_reports);
            case "accounts_customchannels":
                return ZVal.isNull(this.accounts_customchannels);
            case "accounts_customchannels_adunits":
                return ZVal.isNull(this.accounts_customchannels_adunits);
            case "customchannels":
                return ZVal.isNull(this.customchannels);
            case "customchannels_adunits":
                return ZVal.isNull(this.customchannels_adunits);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "urlchannels":
                this.urlchannels = value;
                break;
            case "adunits":
                this.adunits = value;
                break;
            case "adunits_customchannels":
                this.adunits_customchannels = value;
                break;
            case "adclients":
                this.adclients = value;
                break;
            case "reports":
                this.reports = value;
                break;
            case "accounts":
                this.accounts = value;
                break;
            case "accounts_urlchannels":
                this.accounts_urlchannels = value;
                break;
            case "accounts_adunits":
                this.accounts_adunits = value;
                break;
            case "accounts_adunits_customchannels":
                this.accounts_adunits_customchannels = value;
                break;
            case "accounts_adclients":
                this.accounts_adclients = value;
                break;
            case "accounts_reports":
                this.accounts_reports = value;
                break;
            case "accounts_customchannels":
                this.accounts_customchannels = value;
                break;
            case "accounts_customchannels_adunits":
                this.accounts_customchannels_adunits = value;
                break;
            case "customchannels":
                this.customchannels = value;
                break;
            case "customchannels_adunits":
                this.customchannels_adunits = value;
                break;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object client = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AdsenseService.class, "servicePath", "adsense/v1.1/");
        ZVal.setProperty(this, Google_AdsenseService.class, "version", "v1.1");
        ZVal.setProperty(this, Google_AdsenseService.class, "serviceName", "adsense");
        env.callMethod(
                client,
                "addService",
                Google_AdsenseService.class,
                ZVal.getProperty(this, Google_AdsenseService.class, "serviceName"),
                ZVal.getProperty(this, Google_AdsenseService.class, "version"));
        ZVal.setProperty(
                this,
                Google_AdsenseService.class,
                "urlchannels",
                new Google_UrlchannelsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_AdsenseService.class, "serviceName"),
                        "urlchannels",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/adsense\", \"https://www.googleapis.com/auth/adsense.readonly\"], \"parameters\": {\"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"adClientId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"maxResults\": {\"location\": \"query\", \"minimum\": \"0\", \"type\": \"integer\", \"maximum\": \"10000\", \"format\": \"int32\"}}, \"id\": \"adsense.urlchannels.list\", \"httpMethod\": \"GET\", \"path\": \"adclients/{adClientId}/urlchannels\", \"response\": {\"$ref\": \"UrlChannels\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_AdsenseService.class,
                "adunits",
                new Google_AdunitsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_AdsenseService.class, "serviceName"),
                        "adunits",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/adsense\", \"https://www.googleapis.com/auth/adsense.readonly\"], \"parameters\": {\"includeInactive\": {\"type\": \"boolean\", \"location\": \"query\"}, \"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"adClientId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"maxResults\": {\"location\": \"query\", \"minimum\": \"0\", \"type\": \"integer\", \"maximum\": \"10000\", \"format\": \"int32\"}}, \"id\": \"adsense.adunits.list\", \"httpMethod\": \"GET\", \"path\": \"adclients/{adClientId}/adunits\", \"response\": {\"$ref\": \"AdUnits\"}}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/adsense\", \"https://www.googleapis.com/auth/adsense.readonly\"], \"parameters\": {\"adClientId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"adUnitId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"adsense.adunits.get\", \"httpMethod\": \"GET\", \"path\": \"adclients/{adClientId}/adunits/{adUnitId}\", \"response\": {\"$ref\": \"AdUnit\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_AdsenseService.class,
                "adunits_customchannels",
                new Google_AdunitsCustomchannelsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_AdsenseService.class, "serviceName"),
                        "customchannels",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/adsense\", \"https://www.googleapis.com/auth/adsense.readonly\"], \"parameters\": {\"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"adClientId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"maxResults\": {\"location\": \"query\", \"minimum\": \"0\", \"type\": \"integer\", \"maximum\": \"10000\", \"format\": \"int32\"}, \"adUnitId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"adsense.adunits.customchannels.list\", \"httpMethod\": \"GET\", \"path\": \"adclients/{adClientId}/adunits/{adUnitId}/customchannels\", \"response\": {\"$ref\": \"CustomChannels\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_AdsenseService.class,
                "adclients",
                new Google_AdclientsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_AdsenseService.class, "serviceName"),
                        "adclients",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/adsense\", \"https://www.googleapis.com/auth/adsense.readonly\"], \"parameters\": {\"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"maxResults\": {\"location\": \"query\", \"minimum\": \"0\", \"type\": \"integer\", \"maximum\": \"10000\", \"format\": \"int32\"}}, \"response\": {\"$ref\": \"AdClients\"}, \"httpMethod\": \"GET\", \"path\": \"adclients\", \"id\": \"adsense.adclients.list\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_AdsenseService.class,
                "reports",
                new Google_ReportsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_AdsenseService.class, "serviceName"),
                        "reports",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"generate\": {\"scopes\": [\"https://www.googleapis.com/auth/adsense\", \"https://www.googleapis.com/auth/adsense.readonly\"], \"parameters\": {\"sort\": {\"repeated\": true, \"type\": \"string\", \"location\": \"query\"}, \"startDate\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"endDate\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"locale\": {\"type\": \"string\", \"location\": \"query\"}, \"metric\": {\"repeated\": true, \"type\": \"string\", \"location\": \"query\"}, \"maxResults\": {\"location\": \"query\", \"minimum\": \"0\", \"type\": \"integer\", \"maximum\": \"50000\", \"format\": \"int32\"}, \"filter\": {\"repeated\": true, \"type\": \"string\", \"location\": \"query\"}, \"currency\": {\"type\": \"string\", \"location\": \"query\"}, \"startIndex\": {\"location\": \"query\", \"minimum\": \"0\", \"type\": \"integer\", \"maximum\": \"5000\", \"format\": \"int32\"}, \"dimension\": {\"repeated\": true, \"type\": \"string\", \"location\": \"query\"}, \"accountId\": {\"repeated\": true, \"type\": \"string\", \"location\": \"query\"}}, \"id\": \"adsense.reports.generate\", \"httpMethod\": \"GET\", \"supportsMediaDownload\": true, \"path\": \"reports\", \"response\": {\"$ref\": \"AdsenseReportsGenerateResponse\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_AdsenseService.class,
                "accounts",
                new Google_AccountsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_AdsenseService.class, "serviceName"),
                        "accounts",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/adsense\", \"https://www.googleapis.com/auth/adsense.readonly\"], \"parameters\": {\"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"maxResults\": {\"location\": \"query\", \"minimum\": \"0\", \"type\": \"integer\", \"maximum\": \"10000\", \"format\": \"int32\"}}, \"response\": {\"$ref\": \"Accounts\"}, \"httpMethod\": \"GET\", \"path\": \"accounts\", \"id\": \"adsense.accounts.list\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/adsense\", \"https://www.googleapis.com/auth/adsense.readonly\"], \"parameters\": {\"tree\": {\"type\": \"boolean\", \"location\": \"query\"}, \"accountId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"adsense.accounts.get\", \"httpMethod\": \"GET\", \"path\": \"accounts/{accountId}\", \"response\": {\"$ref\": \"Account\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_AdsenseService.class,
                "accounts_urlchannels",
                new Google_AccountsUrlchannelsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_AdsenseService.class, "serviceName"),
                        "urlchannels",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/adsense\", \"https://www.googleapis.com/auth/adsense.readonly\"], \"parameters\": {\"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"adClientId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"maxResults\": {\"location\": \"query\", \"minimum\": \"0\", \"type\": \"integer\", \"maximum\": \"10000\", \"format\": \"int32\"}, \"accountId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"adsense.accounts.urlchannels.list\", \"httpMethod\": \"GET\", \"path\": \"accounts/{accountId}/adclients/{adClientId}/urlchannels\", \"response\": {\"$ref\": \"UrlChannels\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_AdsenseService.class,
                "accounts_adunits",
                new Google_AccountsAdunitsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_AdsenseService.class, "serviceName"),
                        "adunits",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/adsense\", \"https://www.googleapis.com/auth/adsense.readonly\"], \"parameters\": {\"includeInactive\": {\"type\": \"boolean\", \"location\": \"query\"}, \"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"adClientId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"maxResults\": {\"location\": \"query\", \"minimum\": \"0\", \"type\": \"integer\", \"maximum\": \"10000\", \"format\": \"int32\"}, \"accountId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"adsense.accounts.adunits.list\", \"httpMethod\": \"GET\", \"path\": \"accounts/{accountId}/adclients/{adClientId}/adunits\", \"response\": {\"$ref\": \"AdUnits\"}}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/adsense\", \"https://www.googleapis.com/auth/adsense.readonly\"], \"parameters\": {\"adClientId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"adUnitId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"accountId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"adsense.accounts.adunits.get\", \"httpMethod\": \"GET\", \"path\": \"accounts/{accountId}/adclients/{adClientId}/adunits/{adUnitId}\", \"response\": {\"$ref\": \"AdUnit\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_AdsenseService.class,
                "accounts_adunits_customchannels",
                new Google_AccountsAdunitsCustomchannelsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_AdsenseService.class, "serviceName"),
                        "customchannels",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/adsense\", \"https://www.googleapis.com/auth/adsense.readonly\"], \"parameters\": {\"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"adClientId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"maxResults\": {\"location\": \"query\", \"minimum\": \"0\", \"type\": \"integer\", \"maximum\": \"10000\", \"format\": \"int32\"}, \"adUnitId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"accountId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"adsense.accounts.adunits.customchannels.list\", \"httpMethod\": \"GET\", \"path\": \"accounts/{accountId}/adclients/{adClientId}/adunits/{adUnitId}/customchannels\", \"response\": {\"$ref\": \"CustomChannels\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_AdsenseService.class,
                "accounts_adclients",
                new Google_AccountsAdclientsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_AdsenseService.class, "serviceName"),
                        "adclients",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/adsense\", \"https://www.googleapis.com/auth/adsense.readonly\"], \"parameters\": {\"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"maxResults\": {\"location\": \"query\", \"minimum\": \"0\", \"type\": \"integer\", \"maximum\": \"10000\", \"format\": \"int32\"}, \"accountId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"adsense.accounts.adclients.list\", \"httpMethod\": \"GET\", \"path\": \"accounts/{accountId}/adclients\", \"response\": {\"$ref\": \"AdClients\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_AdsenseService.class,
                "accounts_reports",
                new Google_AccountsReportsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_AdsenseService.class, "serviceName"),
                        "reports",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"generate\": {\"scopes\": [\"https://www.googleapis.com/auth/adsense\", \"https://www.googleapis.com/auth/adsense.readonly\"], \"parameters\": {\"sort\": {\"repeated\": true, \"type\": \"string\", \"location\": \"query\"}, \"startDate\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"endDate\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"locale\": {\"type\": \"string\", \"location\": \"query\"}, \"metric\": {\"repeated\": true, \"type\": \"string\", \"location\": \"query\"}, \"maxResults\": {\"location\": \"query\", \"minimum\": \"0\", \"type\": \"integer\", \"maximum\": \"50000\", \"format\": \"int32\"}, \"filter\": {\"repeated\": true, \"type\": \"string\", \"location\": \"query\"}, \"currency\": {\"type\": \"string\", \"location\": \"query\"}, \"startIndex\": {\"location\": \"query\", \"minimum\": \"0\", \"type\": \"integer\", \"maximum\": \"5000\", \"format\": \"int32\"}, \"dimension\": {\"repeated\": true, \"type\": \"string\", \"location\": \"query\"}, \"accountId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"adsense.accounts.reports.generate\", \"httpMethod\": \"GET\", \"supportsMediaDownload\": true, \"path\": \"accounts/{accountId}/reports\", \"response\": {\"$ref\": \"AdsenseReportsGenerateResponse\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_AdsenseService.class,
                "accounts_customchannels",
                new Google_AccountsCustomchannelsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_AdsenseService.class, "serviceName"),
                        "customchannels",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/adsense\", \"https://www.googleapis.com/auth/adsense.readonly\"], \"parameters\": {\"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"adClientId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"maxResults\": {\"location\": \"query\", \"minimum\": \"0\", \"type\": \"integer\", \"maximum\": \"10000\", \"format\": \"int32\"}, \"accountId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"adsense.accounts.customchannels.list\", \"httpMethod\": \"GET\", \"path\": \"accounts/{accountId}/adclients/{adClientId}/customchannels\", \"response\": {\"$ref\": \"CustomChannels\"}}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/adsense\", \"https://www.googleapis.com/auth/adsense.readonly\"], \"parameters\": {\"customChannelId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"adClientId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"accountId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"adsense.accounts.customchannels.get\", \"httpMethod\": \"GET\", \"path\": \"accounts/{accountId}/adclients/{adClientId}/customchannels/{customChannelId}\", \"response\": {\"$ref\": \"CustomChannel\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_AdsenseService.class,
                "accounts_customchannels_adunits",
                new Google_AccountsCustomchannelsAdunitsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_AdsenseService.class, "serviceName"),
                        "adunits",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/adsense\", \"https://www.googleapis.com/auth/adsense.readonly\"], \"parameters\": {\"includeInactive\": {\"type\": \"boolean\", \"location\": \"query\"}, \"customChannelId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"adClientId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"maxResults\": {\"location\": \"query\", \"minimum\": \"0\", \"type\": \"integer\", \"maximum\": \"10000\", \"format\": \"int32\"}, \"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"accountId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"adsense.accounts.customchannels.adunits.list\", \"httpMethod\": \"GET\", \"path\": \"accounts/{accountId}/adclients/{adClientId}/customchannels/{customChannelId}/adunits\", \"response\": {\"$ref\": \"AdUnits\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_AdsenseService.class,
                "customchannels",
                new Google_CustomchannelsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_AdsenseService.class, "serviceName"),
                        "customchannels",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/adsense\", \"https://www.googleapis.com/auth/adsense.readonly\"], \"parameters\": {\"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"adClientId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"maxResults\": {\"location\": \"query\", \"minimum\": \"0\", \"type\": \"integer\", \"maximum\": \"10000\", \"format\": \"int32\"}}, \"id\": \"adsense.customchannels.list\", \"httpMethod\": \"GET\", \"path\": \"adclients/{adClientId}/customchannels\", \"response\": {\"$ref\": \"CustomChannels\"}}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/adsense\", \"https://www.googleapis.com/auth/adsense.readonly\"], \"parameters\": {\"customChannelId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"adClientId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"adsense.customchannels.get\", \"httpMethod\": \"GET\", \"path\": \"adclients/{adClientId}/customchannels/{customChannelId}\", \"response\": {\"$ref\": \"CustomChannel\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_AdsenseService.class,
                "customchannels_adunits",
                new Google_CustomchannelsAdunitsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_AdsenseService.class, "serviceName"),
                        "adunits",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/adsense\", \"https://www.googleapis.com/auth/adsense.readonly\"], \"parameters\": {\"includeInactive\": {\"type\": \"boolean\", \"location\": \"query\"}, \"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"customChannelId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"adClientId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"maxResults\": {\"location\": \"query\", \"minimum\": \"0\", \"type\": \"integer\", \"maximum\": \"10000\", \"format\": \"int32\"}}, \"id\": \"adsense.customchannels.adunits.list\", \"httpMethod\": \"GET\", \"path\": \"adclients/{adClientId}/customchannels/{customChannelId}/adunits\", \"response\": {\"$ref\": \"AdUnits\"}}}}",
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
