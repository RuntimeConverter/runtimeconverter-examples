package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Google_AccountsAdunitsServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_UrlchannelsServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_CustomchannelsServiceResource;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Google_AdclientsServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_AssociationsessionsServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_Service;
import com.project.convertedCode.globalNamespace.classes.Google_AccountsReportsServiceResource;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.classes.Google_AccountsServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_ReportsServiceResource;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.classes.Google_AccountsAdclientsServiceResource;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_AdsensehostService.php

*/

public class Google_AdsensehostService extends Google_Service
        implements RuntimeFileContextInterface {

    public Object urlchannels = null;

    public Object adclients = null;

    public Object associationsessions = null;

    public Object reports = null;

    public Object accounts = null;

    public Object accounts_adunits = null;

    public Object accounts_adclients = null;

    public Object accounts_reports = null;

    public Object customchannels = null;

    public Google_AdsensehostService(RuntimeEnv env, Object... args) {
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
            case "adclients":
                return this.adclients;
            case "associationsessions":
                return this.associationsessions;
            case "reports":
                return this.reports;
            case "accounts":
                return this.accounts;
            case "accounts_adunits":
                return this.accounts_adunits;
            case "accounts_adclients":
                return this.accounts_adclients;
            case "accounts_reports":
                return this.accounts_reports;
            case "customchannels":
                return this.customchannels;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "urlchannels":
                return ZVal.isNull(this.urlchannels);
            case "adclients":
                return ZVal.isNull(this.adclients);
            case "associationsessions":
                return ZVal.isNull(this.associationsessions);
            case "reports":
                return ZVal.isNull(this.reports);
            case "accounts":
                return ZVal.isNull(this.accounts);
            case "accounts_adunits":
                return ZVal.isNull(this.accounts_adunits);
            case "accounts_adclients":
                return ZVal.isNull(this.accounts_adclients);
            case "accounts_reports":
                return ZVal.isNull(this.accounts_reports);
            case "customchannels":
                return ZVal.isNull(this.customchannels);
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
            case "adclients":
                this.adclients = value;
                break;
            case "associationsessions":
                this.associationsessions = value;
                break;
            case "reports":
                this.reports = value;
                break;
            case "accounts":
                this.accounts = value;
                break;
            case "accounts_adunits":
                this.accounts_adunits = value;
                break;
            case "accounts_adclients":
                this.accounts_adclients = value;
                break;
            case "accounts_reports":
                this.accounts_reports = value;
                break;
            case "customchannels":
                this.customchannels = value;
                break;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object client = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AdsensehostService.class, "servicePath", "adsensehost/v4.1/");
        ZVal.setProperty(this, Google_AdsensehostService.class, "version", "v4.1");
        ZVal.setProperty(this, Google_AdsensehostService.class, "serviceName", "adsensehost");
        env.callMethod(
                client,
                "addService",
                Google_AdsensehostService.class,
                ZVal.getProperty(this, Google_AdsensehostService.class, "serviceName"),
                ZVal.getProperty(this, Google_AdsensehostService.class, "version"));
        ZVal.setProperty(
                this,
                Google_AdsensehostService.class,
                "urlchannels",
                new Google_UrlchannelsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_AdsensehostService.class, "serviceName"),
                        "urlchannels",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/adsensehost\"], \"parameters\": {\"adClientId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"UrlChannel\"}, \"response\": {\"$ref\": \"UrlChannel\"}, \"httpMethod\": \"POST\", \"path\": \"adclients/{adClientId}/urlchannels\", \"id\": \"adsensehost.urlchannels.insert\"}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/adsensehost\"], \"parameters\": {\"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"adClientId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"maxResults\": {\"location\": \"query\", \"minimum\": \"0\", \"type\": \"integer\", \"maximum\": \"10000\", \"format\": \"uint32\"}}, \"id\": \"adsensehost.urlchannels.list\", \"httpMethod\": \"GET\", \"path\": \"adclients/{adClientId}/urlchannels\", \"response\": {\"$ref\": \"UrlChannels\"}}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/adsensehost\"], \"parameters\": {\"adClientId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"urlChannelId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"adsensehost.urlchannels.delete\", \"httpMethod\": \"DELETE\", \"path\": \"adclients/{adClientId}/urlchannels/{urlChannelId}\", \"response\": {\"$ref\": \"UrlChannel\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_AdsensehostService.class,
                "adclients",
                new Google_AdclientsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_AdsensehostService.class, "serviceName"),
                        "adclients",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/adsensehost\"], \"parameters\": {\"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"maxResults\": {\"location\": \"query\", \"minimum\": \"0\", \"type\": \"integer\", \"maximum\": \"10000\", \"format\": \"uint32\"}}, \"response\": {\"$ref\": \"AdClients\"}, \"httpMethod\": \"GET\", \"path\": \"adclients\", \"id\": \"adsensehost.adclients.list\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/adsensehost\"], \"parameters\": {\"adClientId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"adsensehost.adclients.get\", \"httpMethod\": \"GET\", \"path\": \"adclients/{adClientId}\", \"response\": {\"$ref\": \"AdClient\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_AdsensehostService.class,
                "associationsessions",
                new Google_AssociationsessionsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_AdsensehostService.class, "serviceName"),
                        "associationsessions",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"start\": {\"scopes\": [\"https://www.googleapis.com/auth/adsensehost\"], \"parameters\": {\"websiteLocale\": {\"type\": \"string\", \"location\": \"query\"}, \"productCode\": {\"repeated\": true, \"required\": true, \"type\": \"string\", \"location\": \"query\", \"enum\": [\"AFC\", \"AFF\", \"AFMC\", \"AFS\"]}, \"userLocale\": {\"type\": \"string\", \"location\": \"query\"}, \"websiteUrl\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}}, \"id\": \"adsensehost.associationsessions.start\", \"httpMethod\": \"GET\", \"path\": \"associationsessions/start\", \"response\": {\"$ref\": \"AssociationSession\"}}, \"verify\": {\"scopes\": [\"https://www.googleapis.com/auth/adsensehost\"], \"parameters\": {\"token\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}}, \"id\": \"adsensehost.associationsessions.verify\", \"httpMethod\": \"GET\", \"path\": \"associationsessions/verify\", \"response\": {\"$ref\": \"AssociationSession\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_AdsensehostService.class,
                "reports",
                new Google_ReportsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_AdsensehostService.class, "serviceName"),
                        "reports",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"generate\": {\"scopes\": [\"https://www.googleapis.com/auth/adsensehost\"], \"parameters\": {\"sort\": {\"repeated\": true, \"type\": \"string\", \"location\": \"query\"}, \"startDate\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"endDate\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"locale\": {\"type\": \"string\", \"location\": \"query\"}, \"metric\": {\"repeated\": true, \"type\": \"string\", \"location\": \"query\"}, \"maxResults\": {\"location\": \"query\", \"minimum\": \"0\", \"type\": \"integer\", \"maximum\": \"50000\", \"format\": \"uint32\"}, \"filter\": {\"repeated\": true, \"type\": \"string\", \"location\": \"query\"}, \"startIndex\": {\"location\": \"query\", \"minimum\": \"0\", \"type\": \"integer\", \"maximum\": \"5000\", \"format\": \"uint32\"}, \"dimension\": {\"repeated\": true, \"type\": \"string\", \"location\": \"query\"}}, \"id\": \"adsensehost.reports.generate\", \"httpMethod\": \"GET\", \"path\": \"reports\", \"response\": {\"$ref\": \"Report\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_AdsensehostService.class,
                "accounts",
                new Google_AccountsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_AdsensehostService.class, "serviceName"),
                        "accounts",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/adsensehost\"], \"parameters\": {\"filterAdClientId\": {\"repeated\": true, \"required\": true, \"type\": \"string\", \"location\": \"query\"}}, \"id\": \"adsensehost.accounts.list\", \"httpMethod\": \"GET\", \"path\": \"accounts\", \"response\": {\"$ref\": \"Accounts\"}}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/adsensehost\"], \"parameters\": {\"accountId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"adsensehost.accounts.get\", \"httpMethod\": \"GET\", \"path\": \"accounts/{accountId}\", \"response\": {\"$ref\": \"Account\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_AdsensehostService.class,
                "accounts_adunits",
                new Google_AccountsAdunitsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_AdsensehostService.class, "serviceName"),
                        "adunits",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/adsensehost\"], \"parameters\": {\"adClientId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"accountId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"AdUnit\"}, \"response\": {\"$ref\": \"AdUnit\"}, \"httpMethod\": \"POST\", \"path\": \"accounts/{accountId}/adclients/{adClientId}/adunits\", \"id\": \"adsensehost.accounts.adunits.insert\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/adsensehost\"], \"parameters\": {\"adClientId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"adUnitId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"accountId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"adsensehost.accounts.adunits.get\", \"httpMethod\": \"GET\", \"path\": \"accounts/{accountId}/adclients/{adClientId}/adunits/{adUnitId}\", \"response\": {\"$ref\": \"AdUnit\"}}, \"getAdCode\": {\"scopes\": [\"https://www.googleapis.com/auth/adsensehost\"], \"parameters\": {\"adClientId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"hostCustomChannelId\": {\"repeated\": true, \"type\": \"string\", \"location\": \"query\"}, \"adUnitId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"accountId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"adsensehost.accounts.adunits.getAdCode\", \"httpMethod\": \"GET\", \"path\": \"accounts/{accountId}/adclients/{adClientId}/adunits/{adUnitId}/adcode\", \"response\": {\"$ref\": \"AdCode\"}}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/adsensehost\"], \"parameters\": {\"includeInactive\": {\"type\": \"boolean\", \"location\": \"query\"}, \"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"adClientId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"maxResults\": {\"location\": \"query\", \"minimum\": \"0\", \"type\": \"integer\", \"maximum\": \"10000\", \"format\": \"uint32\"}, \"accountId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"adsensehost.accounts.adunits.list\", \"httpMethod\": \"GET\", \"path\": \"accounts/{accountId}/adclients/{adClientId}/adunits\", \"response\": {\"$ref\": \"AdUnits\"}}, \"update\": {\"scopes\": [\"https://www.googleapis.com/auth/adsensehost\"], \"parameters\": {\"adClientId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"accountId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"AdUnit\"}, \"response\": {\"$ref\": \"AdUnit\"}, \"httpMethod\": \"PUT\", \"path\": \"accounts/{accountId}/adclients/{adClientId}/adunits\", \"id\": \"adsensehost.accounts.adunits.update\"}, \"patch\": {\"scopes\": [\"https://www.googleapis.com/auth/adsensehost\"], \"parameters\": {\"adClientId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"adUnitId\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"accountId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"AdUnit\"}, \"response\": {\"$ref\": \"AdUnit\"}, \"httpMethod\": \"PATCH\", \"path\": \"accounts/{accountId}/adclients/{adClientId}/adunits\", \"id\": \"adsensehost.accounts.adunits.patch\"}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/adsensehost\"], \"parameters\": {\"adClientId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"adUnitId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"accountId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"adsensehost.accounts.adunits.delete\", \"httpMethod\": \"DELETE\", \"path\": \"accounts/{accountId}/adclients/{adClientId}/adunits/{adUnitId}\", \"response\": {\"$ref\": \"AdUnit\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_AdsensehostService.class,
                "accounts_adclients",
                new Google_AccountsAdclientsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_AdsensehostService.class, "serviceName"),
                        "adclients",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/adsensehost\"], \"parameters\": {\"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"maxResults\": {\"location\": \"query\", \"minimum\": \"0\", \"type\": \"integer\", \"maximum\": \"10000\", \"format\": \"uint32\"}, \"accountId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"adsensehost.accounts.adclients.list\", \"httpMethod\": \"GET\", \"path\": \"accounts/{accountId}/adclients\", \"response\": {\"$ref\": \"AdClients\"}}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/adsensehost\"], \"parameters\": {\"adClientId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"accountId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"adsensehost.accounts.adclients.get\", \"httpMethod\": \"GET\", \"path\": \"accounts/{accountId}/adclients/{adClientId}\", \"response\": {\"$ref\": \"AdClient\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_AdsensehostService.class,
                "accounts_reports",
                new Google_AccountsReportsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_AdsensehostService.class, "serviceName"),
                        "reports",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"generate\": {\"scopes\": [\"https://www.googleapis.com/auth/adsensehost\"], \"parameters\": {\"sort\": {\"repeated\": true, \"type\": \"string\", \"location\": \"query\"}, \"startDate\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"endDate\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"locale\": {\"type\": \"string\", \"location\": \"query\"}, \"metric\": {\"repeated\": true, \"type\": \"string\", \"location\": \"query\"}, \"maxResults\": {\"location\": \"query\", \"minimum\": \"0\", \"type\": \"integer\", \"maximum\": \"50000\", \"format\": \"uint32\"}, \"filter\": {\"repeated\": true, \"type\": \"string\", \"location\": \"query\"}, \"startIndex\": {\"location\": \"query\", \"minimum\": \"0\", \"type\": \"integer\", \"maximum\": \"5000\", \"format\": \"uint32\"}, \"dimension\": {\"repeated\": true, \"type\": \"string\", \"location\": \"query\"}, \"accountId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"adsensehost.accounts.reports.generate\", \"httpMethod\": \"GET\", \"path\": \"accounts/{accountId}/reports\", \"response\": {\"$ref\": \"Report\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_AdsensehostService.class,
                "customchannels",
                new Google_CustomchannelsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_AdsensehostService.class, "serviceName"),
                        "customchannels",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/adsensehost\"], \"parameters\": {\"adClientId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"CustomChannel\"}, \"response\": {\"$ref\": \"CustomChannel\"}, \"httpMethod\": \"POST\", \"path\": \"adclients/{adClientId}/customchannels\", \"id\": \"adsensehost.customchannels.insert\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/adsensehost\"], \"parameters\": {\"customChannelId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"adClientId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"adsensehost.customchannels.get\", \"httpMethod\": \"GET\", \"path\": \"adclients/{adClientId}/customchannels/{customChannelId}\", \"response\": {\"$ref\": \"CustomChannel\"}}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/adsensehost\"], \"parameters\": {\"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"adClientId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"maxResults\": {\"location\": \"query\", \"minimum\": \"0\", \"type\": \"integer\", \"maximum\": \"10000\", \"format\": \"uint32\"}}, \"id\": \"adsensehost.customchannels.list\", \"httpMethod\": \"GET\", \"path\": \"adclients/{adClientId}/customchannels\", \"response\": {\"$ref\": \"CustomChannels\"}}, \"update\": {\"scopes\": [\"https://www.googleapis.com/auth/adsensehost\"], \"parameters\": {\"adClientId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"CustomChannel\"}, \"response\": {\"$ref\": \"CustomChannel\"}, \"httpMethod\": \"PUT\", \"path\": \"adclients/{adClientId}/customchannels\", \"id\": \"adsensehost.customchannels.update\"}, \"patch\": {\"scopes\": [\"https://www.googleapis.com/auth/adsensehost\"], \"parameters\": {\"customChannelId\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"adClientId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"CustomChannel\"}, \"response\": {\"$ref\": \"CustomChannel\"}, \"httpMethod\": \"PATCH\", \"path\": \"adclients/{adClientId}/customchannels\", \"id\": \"adsensehost.customchannels.patch\"}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/adsensehost\"], \"parameters\": {\"customChannelId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"adClientId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"adsensehost.customchannels.delete\", \"httpMethod\": \"DELETE\", \"path\": \"adclients/{adClientId}/customchannels/{customChannelId}\", \"response\": {\"$ref\": \"CustomChannel\"}}}}",
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
