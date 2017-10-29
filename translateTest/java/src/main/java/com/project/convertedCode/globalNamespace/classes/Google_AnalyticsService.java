package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Google_Service;
import com.project.convertedCode.globalNamespace.classes.Google_DataMcfServiceResource;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Google_ManagementAccountsServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_ManagementSegmentsServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_DataGaServiceResource;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.classes.Google_ManagementProfilesServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_ManagementGoalsServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_ManagementWebpropertiesServiceResource;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_AnalyticsService.php

*/

public class Google_AnalyticsService extends Google_Service implements RuntimeFileContextInterface {

    public Object management_webproperties = null;

    public Object management_segments = null;

    public Object management_accounts = null;

    public Object management_goals = null;

    public Object management_profiles = null;

    public Object data_mcf = null;

    public Object data_ga = null;

    public Google_AnalyticsService(RuntimeEnv env, Object... args) {
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
            case "management_webproperties":
                return this.management_webproperties;
            case "management_segments":
                return this.management_segments;
            case "management_accounts":
                return this.management_accounts;
            case "management_goals":
                return this.management_goals;
            case "management_profiles":
                return this.management_profiles;
            case "data_mcf":
                return this.data_mcf;
            case "data_ga":
                return this.data_ga;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "management_webproperties":
                return ZVal.isNull(this.management_webproperties);
            case "management_segments":
                return ZVal.isNull(this.management_segments);
            case "management_accounts":
                return ZVal.isNull(this.management_accounts);
            case "management_goals":
                return ZVal.isNull(this.management_goals);
            case "management_profiles":
                return ZVal.isNull(this.management_profiles);
            case "data_mcf":
                return ZVal.isNull(this.data_mcf);
            case "data_ga":
                return ZVal.isNull(this.data_ga);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "management_webproperties":
                this.management_webproperties = value;
                break;
            case "management_segments":
                this.management_segments = value;
                break;
            case "management_accounts":
                this.management_accounts = value;
                break;
            case "management_goals":
                this.management_goals = value;
                break;
            case "management_profiles":
                this.management_profiles = value;
                break;
            case "data_mcf":
                this.data_mcf = value;
                break;
            case "data_ga":
                this.data_ga = value;
                break;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object client = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AnalyticsService.class, "servicePath", "analytics/v3/");
        ZVal.setProperty(this, Google_AnalyticsService.class, "version", "v3");
        ZVal.setProperty(this, Google_AnalyticsService.class, "serviceName", "analytics");
        env.callMethod(
                client,
                "addService",
                Google_AnalyticsService.class,
                ZVal.getProperty(this, Google_AnalyticsService.class, "serviceName"),
                ZVal.getProperty(this, Google_AnalyticsService.class, "version"));
        ZVal.setProperty(
                this,
                Google_AnalyticsService.class,
                "management_webproperties",
                new Google_ManagementWebpropertiesServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_AnalyticsService.class, "serviceName"),
                        "webproperties",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/analytics.readonly\"], \"parameters\": {\"max-results\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"int32\"}, \"start-index\": {\"minimum\": \"1\", \"type\": \"integer\", \"location\": \"query\", \"format\": \"int32\"}, \"accountId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"analytics.management.webproperties.list\", \"httpMethod\": \"GET\", \"path\": \"management/accounts/{accountId}/webproperties\", \"response\": {\"$ref\": \"Webproperties\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_AnalyticsService.class,
                "management_segments",
                new Google_ManagementSegmentsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_AnalyticsService.class, "serviceName"),
                        "segments",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/analytics.readonly\"], \"parameters\": {\"max-results\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"int32\"}, \"start-index\": {\"minimum\": \"1\", \"type\": \"integer\", \"location\": \"query\", \"format\": \"int32\"}}, \"response\": {\"$ref\": \"Segments\"}, \"httpMethod\": \"GET\", \"path\": \"management/segments\", \"id\": \"analytics.management.segments.list\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_AnalyticsService.class,
                "management_accounts",
                new Google_ManagementAccountsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_AnalyticsService.class, "serviceName"),
                        "accounts",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/analytics.readonly\"], \"parameters\": {\"max-results\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"int32\"}, \"start-index\": {\"minimum\": \"1\", \"type\": \"integer\", \"location\": \"query\", \"format\": \"int32\"}}, \"response\": {\"$ref\": \"Accounts\"}, \"httpMethod\": \"GET\", \"path\": \"management/accounts\", \"id\": \"analytics.management.accounts.list\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_AnalyticsService.class,
                "management_goals",
                new Google_ManagementGoalsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_AnalyticsService.class, "serviceName"),
                        "goals",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/analytics.readonly\"], \"parameters\": {\"max-results\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"int32\"}, \"profileId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"start-index\": {\"minimum\": \"1\", \"type\": \"integer\", \"location\": \"query\", \"format\": \"int32\"}, \"webPropertyId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"accountId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"analytics.management.goals.list\", \"httpMethod\": \"GET\", \"path\": \"management/accounts/{accountId}/webproperties/{webPropertyId}/profiles/{profileId}/goals\", \"response\": {\"$ref\": \"Goals\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_AnalyticsService.class,
                "management_profiles",
                new Google_ManagementProfilesServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_AnalyticsService.class, "serviceName"),
                        "profiles",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/analytics.readonly\"], \"parameters\": {\"max-results\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"int32\"}, \"start-index\": {\"minimum\": \"1\", \"type\": \"integer\", \"location\": \"query\", \"format\": \"int32\"}, \"webPropertyId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"accountId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"analytics.management.profiles.list\", \"httpMethod\": \"GET\", \"path\": \"management/accounts/{accountId}/webproperties/{webPropertyId}/profiles\", \"response\": {\"$ref\": \"Profiles\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_AnalyticsService.class,
                "data_mcf",
                new Google_DataMcfServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_AnalyticsService.class, "serviceName"),
                        "mcf",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"get\": {\"scopes\": [\"https://www.googleapis.com/auth/analytics.readonly\"], \"parameters\": {\"max-results\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"int32\"}, \"sort\": {\"type\": \"string\", \"location\": \"query\"}, \"dimensions\": {\"type\": \"string\", \"location\": \"query\"}, \"start-date\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"start-index\": {\"minimum\": \"1\", \"type\": \"integer\", \"location\": \"query\", \"format\": \"int32\"}, \"ids\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"metrics\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"filters\": {\"type\": \"string\", \"location\": \"query\"}, \"end-date\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}}, \"id\": \"analytics.data.mcf.get\", \"httpMethod\": \"GET\", \"path\": \"data/mcf\", \"response\": {\"$ref\": \"McfData\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_AnalyticsService.class,
                "data_ga",
                new Google_DataGaServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_AnalyticsService.class, "serviceName"),
                        "ga",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"get\": {\"scopes\": [\"https://www.googleapis.com/auth/analytics.readonly\"], \"parameters\": {\"max-results\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"int32\"}, \"sort\": {\"type\": \"string\", \"location\": \"query\"}, \"dimensions\": {\"type\": \"string\", \"location\": \"query\"}, \"start-date\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"start-index\": {\"minimum\": \"1\", \"type\": \"integer\", \"location\": \"query\", \"format\": \"int32\"}, \"segment\": {\"type\": \"string\", \"location\": \"query\"}, \"ids\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"metrics\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"filters\": {\"type\": \"string\", \"location\": \"query\"}, \"end-date\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}}, \"id\": \"analytics.data.ga.get\", \"httpMethod\": \"GET\", \"path\": \"data/ga\", \"response\": {\"$ref\": \"GaData\"}}}}",
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
