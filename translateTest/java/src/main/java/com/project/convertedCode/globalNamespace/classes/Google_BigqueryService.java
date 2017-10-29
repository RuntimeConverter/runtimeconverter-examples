package com.project.convertedCode.globalNamespace.classes;

import com.project.convertedCode.globalNamespace.classes.Google_DatasetsServiceResource;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Google_TabledataServiceResource;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Google_Service;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Google_JobsServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_ProjectsServiceResource;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.classes.Google_TablesServiceResource;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_BigqueryService.php

*/

public class Google_BigqueryService extends Google_Service implements RuntimeFileContextInterface {

    public Object tables = null;

    public Object datasets = null;

    public Object jobs = null;

    public Object tabledata = null;

    public Object projects = null;

    public Google_BigqueryService(RuntimeEnv env, Object... args) {
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
            case "tables":
                return this.tables;
            case "datasets":
                return this.datasets;
            case "jobs":
                return this.jobs;
            case "tabledata":
                return this.tabledata;
            case "projects":
                return this.projects;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "tables":
                return ZVal.isNull(this.tables);
            case "datasets":
                return ZVal.isNull(this.datasets);
            case "jobs":
                return ZVal.isNull(this.jobs);
            case "tabledata":
                return ZVal.isNull(this.tabledata);
            case "projects":
                return ZVal.isNull(this.projects);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "tables":
                this.tables = value;
                break;
            case "datasets":
                this.datasets = value;
                break;
            case "jobs":
                this.jobs = value;
                break;
            case "tabledata":
                this.tabledata = value;
                break;
            case "projects":
                this.projects = value;
                break;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object client = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_BigqueryService.class, "servicePath", "bigquery/v2/");
        ZVal.setProperty(this, Google_BigqueryService.class, "version", "v2");
        ZVal.setProperty(this, Google_BigqueryService.class, "serviceName", "bigquery");
        env.callMethod(
                client,
                "addService",
                Google_BigqueryService.class,
                ZVal.getProperty(this, Google_BigqueryService.class, "serviceName"),
                ZVal.getProperty(this, Google_BigqueryService.class, "version"));
        ZVal.setProperty(
                this,
                Google_BigqueryService.class,
                "tables",
                new Google_TablesServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_BigqueryService.class, "serviceName"),
                        "tables",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/bigquery\"], \"parameters\": {\"projectId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"datasetId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Table\"}, \"response\": {\"$ref\": \"Table\"}, \"httpMethod\": \"POST\", \"path\": \"projects/{projectId}/datasets/{datasetId}/tables\", \"id\": \"bigquery.tables.insert\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/bigquery\"], \"parameters\": {\"projectId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"tableId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"datasetId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"bigquery.tables.get\", \"httpMethod\": \"GET\", \"path\": \"projects/{projectId}/datasets/{datasetId}/tables/{tableId}\", \"response\": {\"$ref\": \"Table\"}}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/bigquery\"], \"parameters\": {\"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"maxResults\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"datasetId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"projectId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"bigquery.tables.list\", \"httpMethod\": \"GET\", \"path\": \"projects/{projectId}/datasets/{datasetId}/tables\", \"response\": {\"$ref\": \"TableList\"}}, \"update\": {\"scopes\": [\"https://www.googleapis.com/auth/bigquery\"], \"parameters\": {\"projectId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"tableId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"datasetId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Table\"}, \"response\": {\"$ref\": \"Table\"}, \"httpMethod\": \"PUT\", \"path\": \"projects/{projectId}/datasets/{datasetId}/tables/{tableId}\", \"id\": \"bigquery.tables.update\"}, \"patch\": {\"scopes\": [\"https://www.googleapis.com/auth/bigquery\"], \"parameters\": {\"projectId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"tableId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"datasetId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Table\"}, \"response\": {\"$ref\": \"Table\"}, \"httpMethod\": \"PATCH\", \"path\": \"projects/{projectId}/datasets/{datasetId}/tables/{tableId}\", \"id\": \"bigquery.tables.patch\"}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/bigquery\"], \"path\": \"projects/{projectId}/datasets/{datasetId}/tables/{tableId}\", \"id\": \"bigquery.tables.delete\", \"parameters\": {\"projectId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"tableId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"datasetId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"httpMethod\": \"DELETE\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_BigqueryService.class,
                "datasets",
                new Google_DatasetsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_BigqueryService.class, "serviceName"),
                        "datasets",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/bigquery\"], \"parameters\": {\"projectId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Dataset\"}, \"response\": {\"$ref\": \"Dataset\"}, \"httpMethod\": \"POST\", \"path\": \"projects/{projectId}/datasets\", \"id\": \"bigquery.datasets.insert\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/bigquery\"], \"parameters\": {\"projectId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"datasetId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"bigquery.datasets.get\", \"httpMethod\": \"GET\", \"path\": \"projects/{projectId}/datasets/{datasetId}\", \"response\": {\"$ref\": \"Dataset\"}}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/bigquery\"], \"parameters\": {\"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"maxResults\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"projectId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"bigquery.datasets.list\", \"httpMethod\": \"GET\", \"path\": \"projects/{projectId}/datasets\", \"response\": {\"$ref\": \"DatasetList\"}}, \"update\": {\"scopes\": [\"https://www.googleapis.com/auth/bigquery\"], \"parameters\": {\"projectId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"datasetId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Dataset\"}, \"response\": {\"$ref\": \"Dataset\"}, \"httpMethod\": \"PUT\", \"path\": \"projects/{projectId}/datasets/{datasetId}\", \"id\": \"bigquery.datasets.update\"}, \"patch\": {\"scopes\": [\"https://www.googleapis.com/auth/bigquery\"], \"parameters\": {\"projectId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"datasetId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Dataset\"}, \"response\": {\"$ref\": \"Dataset\"}, \"httpMethod\": \"PATCH\", \"path\": \"projects/{projectId}/datasets/{datasetId}\", \"id\": \"bigquery.datasets.patch\"}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/bigquery\"], \"path\": \"projects/{projectId}/datasets/{datasetId}\", \"id\": \"bigquery.datasets.delete\", \"parameters\": {\"deleteContents\": {\"type\": \"boolean\", \"location\": \"query\"}, \"datasetId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"projectId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"httpMethod\": \"DELETE\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_BigqueryService.class,
                "jobs",
                new Google_JobsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_BigqueryService.class, "serviceName"),
                        "jobs",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/bigquery\"], \"parameters\": {\"projectId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"supportsMediaUpload\": true, \"request\": {\"$ref\": \"Job\"}, \"mediaUpload\": {\"protocols\": {\"simple\": {\"path\": \"/upload/bigquery/v2/projects/{projectId}/jobs\", \"multipart\": true}, \"resumable\": {\"path\": \"/resumable/upload/bigquery/v2/projects/{projectId}/jobs\", \"multipart\": true}}, \"accept\": [\"application/octet-stream\"]}, \"response\": {\"$ref\": \"Job\"}, \"httpMethod\": \"POST\", \"path\": \"projects/{projectId}/jobs\", \"id\": \"bigquery.jobs.insert\"}, \"query\": {\"scopes\": [\"https://www.googleapis.com/auth/bigquery\"], \"parameters\": {\"projectId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"QueryRequest\"}, \"response\": {\"$ref\": \"QueryResponse\"}, \"httpMethod\": \"POST\", \"path\": \"projects/{projectId}/queries\", \"id\": \"bigquery.jobs.query\"}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/bigquery\"], \"parameters\": {\"projection\": {\"enum\": [\"full\", \"minimal\"], \"type\": \"string\", \"location\": \"query\"}, \"stateFilter\": {\"repeated\": true, \"enum\": [\"done\", \"pending\", \"running\"], \"type\": \"string\", \"location\": \"query\"}, \"projectId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"allUsers\": {\"type\": \"boolean\", \"location\": \"query\"}, \"maxResults\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"pageToken\": {\"type\": \"string\", \"location\": \"query\"}}, \"id\": \"bigquery.jobs.list\", \"httpMethod\": \"GET\", \"path\": \"projects/{projectId}/jobs\", \"response\": {\"$ref\": \"JobList\"}}, \"getQueryResults\": {\"scopes\": [\"https://www.googleapis.com/auth/bigquery\"], \"parameters\": {\"timeoutMs\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"projectId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"startIndex\": {\"type\": \"string\", \"location\": \"query\", \"format\": \"uint64\"}, \"maxResults\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"jobId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"bigquery.jobs.getQueryResults\", \"httpMethod\": \"GET\", \"path\": \"projects/{projectId}/queries/{jobId}\", \"response\": {\"$ref\": \"GetQueryResultsResponse\"}}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/bigquery\"], \"parameters\": {\"projectId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"jobId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"bigquery.jobs.get\", \"httpMethod\": \"GET\", \"path\": \"projects/{projectId}/jobs/{jobId}\", \"response\": {\"$ref\": \"Job\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_BigqueryService.class,
                "tabledata",
                new Google_TabledataServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_BigqueryService.class, "serviceName"),
                        "tabledata",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/bigquery\"], \"parameters\": {\"projectId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"maxResults\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"startIndex\": {\"type\": \"string\", \"location\": \"query\", \"format\": \"uint64\"}, \"tableId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"datasetId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"bigquery.tabledata.list\", \"httpMethod\": \"GET\", \"path\": \"projects/{projectId}/datasets/{datasetId}/tables/{tableId}/data\", \"response\": {\"$ref\": \"TableDataList\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_BigqueryService.class,
                "projects",
                new Google_ProjectsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_BigqueryService.class, "serviceName"),
                        "projects",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/bigquery\"], \"parameters\": {\"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"maxResults\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}}, \"response\": {\"$ref\": \"ProjectList\"}, \"httpMethod\": \"GET\", \"path\": \"projects\", \"id\": \"bigquery.projects.list\"}}}",
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
