package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Google_Service;
import com.project.convertedCode.globalNamespace.classes.Google_QueryServiceResource;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Google_StyleServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_TemplateServiceResource;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.classes.Google_TableServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_ColumnServiceResource;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_FusiontablesService.php

*/

public class Google_FusiontablesService extends Google_Service
        implements RuntimeFileContextInterface {

    public Object column = null;

    public Object query = null;

    public Object style = null;

    public Object template = null;

    public Object table = null;

    public Google_FusiontablesService(RuntimeEnv env, Object... args) {
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
            case "column":
                return this.column;
            case "query":
                return this.query;
            case "style":
                return this.style;
            case "template":
                return this.template;
            case "table":
                return this.table;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "column":
                return ZVal.isNull(this.column);
            case "query":
                return ZVal.isNull(this.query);
            case "style":
                return ZVal.isNull(this.style);
            case "template":
                return ZVal.isNull(this.template);
            case "table":
                return ZVal.isNull(this.table);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "column":
                this.column = value;
                break;
            case "query":
                this.query = value;
                break;
            case "style":
                this.style = value;
                break;
            case "template":
                this.template = value;
                break;
            case "table":
                this.table = value;
                break;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object client = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_FusiontablesService.class, "servicePath", "fusiontables/v1/");
        ZVal.setProperty(this, Google_FusiontablesService.class, "version", "v1");
        ZVal.setProperty(this, Google_FusiontablesService.class, "serviceName", "fusiontables");
        env.callMethod(
                client,
                "addService",
                Google_FusiontablesService.class,
                ZVal.getProperty(this, Google_FusiontablesService.class, "serviceName"),
                ZVal.getProperty(this, Google_FusiontablesService.class, "version"));
        ZVal.setProperty(
                this,
                Google_FusiontablesService.class,
                "column",
                new Google_ColumnServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_FusiontablesService.class, "serviceName"),
                        "column",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/fusiontables\"], \"parameters\": {\"tableId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Column\"}, \"response\": {\"$ref\": \"Column\"}, \"httpMethod\": \"POST\", \"path\": \"tables/{tableId}/columns\", \"id\": \"fusiontables.column.insert\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/fusiontables\", \"https://www.googleapis.com/auth/fusiontables.readonly\"], \"parameters\": {\"tableId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"columnId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"fusiontables.column.get\", \"httpMethod\": \"GET\", \"path\": \"tables/{tableId}/columns/{columnId}\", \"response\": {\"$ref\": \"Column\"}}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/fusiontables\", \"https://www.googleapis.com/auth/fusiontables.readonly\"], \"parameters\": {\"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"tableId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"maxResults\": {\"minimum\": \"0\", \"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}}, \"id\": \"fusiontables.column.list\", \"httpMethod\": \"GET\", \"path\": \"tables/{tableId}/columns\", \"response\": {\"$ref\": \"ColumnList\"}}, \"update\": {\"scopes\": [\"https://www.googleapis.com/auth/fusiontables\"], \"parameters\": {\"tableId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"columnId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Column\"}, \"response\": {\"$ref\": \"Column\"}, \"httpMethod\": \"PUT\", \"path\": \"tables/{tableId}/columns/{columnId}\", \"id\": \"fusiontables.column.update\"}, \"patch\": {\"scopes\": [\"https://www.googleapis.com/auth/fusiontables\"], \"parameters\": {\"tableId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"columnId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Column\"}, \"response\": {\"$ref\": \"Column\"}, \"httpMethod\": \"PATCH\", \"path\": \"tables/{tableId}/columns/{columnId}\", \"id\": \"fusiontables.column.patch\"}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/fusiontables\"], \"path\": \"tables/{tableId}/columns/{columnId}\", \"id\": \"fusiontables.column.delete\", \"parameters\": {\"tableId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"columnId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"httpMethod\": \"DELETE\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_FusiontablesService.class,
                "query",
                new Google_QueryServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_FusiontablesService.class, "serviceName"),
                        "query",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"sqlGet\": {\"scopes\": [\"https://www.googleapis.com/auth/fusiontables\", \"https://www.googleapis.com/auth/fusiontables.readonly\"], \"parameters\": {\"typed\": {\"type\": \"boolean\", \"location\": \"query\"}, \"hdrs\": {\"type\": \"boolean\", \"location\": \"query\"}, \"sql\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}}, \"id\": \"fusiontables.query.sqlGet\", \"httpMethod\": \"GET\", \"path\": \"query\", \"response\": {\"$ref\": \"Sqlresponse\"}}, \"sql\": {\"scopes\": [\"https://www.googleapis.com/auth/fusiontables\", \"https://www.googleapis.com/auth/fusiontables.readonly\"], \"parameters\": {\"typed\": {\"type\": \"boolean\", \"location\": \"query\"}, \"hdrs\": {\"type\": \"boolean\", \"location\": \"query\"}, \"sql\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}}, \"id\": \"fusiontables.query.sql\", \"httpMethod\": \"POST\", \"path\": \"query\", \"response\": {\"$ref\": \"Sqlresponse\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_FusiontablesService.class,
                "style",
                new Google_StyleServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_FusiontablesService.class, "serviceName"),
                        "style",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/fusiontables\"], \"parameters\": {\"tableId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"StyleSetting\"}, \"response\": {\"$ref\": \"StyleSetting\"}, \"httpMethod\": \"POST\", \"path\": \"tables/{tableId}/styles\", \"id\": \"fusiontables.style.insert\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/fusiontables\", \"https://www.googleapis.com/auth/fusiontables.readonly\"], \"parameters\": {\"tableId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"styleId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"int32\"}}, \"id\": \"fusiontables.style.get\", \"httpMethod\": \"GET\", \"path\": \"tables/{tableId}/styles/{styleId}\", \"response\": {\"$ref\": \"StyleSetting\"}}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/fusiontables\", \"https://www.googleapis.com/auth/fusiontables.readonly\"], \"parameters\": {\"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"tableId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"maxResults\": {\"minimum\": \"0\", \"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}}, \"id\": \"fusiontables.style.list\", \"httpMethod\": \"GET\", \"path\": \"tables/{tableId}/styles\", \"response\": {\"$ref\": \"StyleSettingList\"}}, \"update\": {\"scopes\": [\"https://www.googleapis.com/auth/fusiontables\"], \"parameters\": {\"tableId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"styleId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"int32\"}}, \"request\": {\"$ref\": \"StyleSetting\"}, \"response\": {\"$ref\": \"StyleSetting\"}, \"httpMethod\": \"PUT\", \"path\": \"tables/{tableId}/styles/{styleId}\", \"id\": \"fusiontables.style.update\"}, \"patch\": {\"scopes\": [\"https://www.googleapis.com/auth/fusiontables\"], \"parameters\": {\"tableId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"styleId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"int32\"}}, \"request\": {\"$ref\": \"StyleSetting\"}, \"response\": {\"$ref\": \"StyleSetting\"}, \"httpMethod\": \"PATCH\", \"path\": \"tables/{tableId}/styles/{styleId}\", \"id\": \"fusiontables.style.patch\"}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/fusiontables\"], \"path\": \"tables/{tableId}/styles/{styleId}\", \"id\": \"fusiontables.style.delete\", \"parameters\": {\"tableId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"styleId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"int32\"}}, \"httpMethod\": \"DELETE\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_FusiontablesService.class,
                "template",
                new Google_TemplateServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_FusiontablesService.class, "serviceName"),
                        "template",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/fusiontables\"], \"parameters\": {\"tableId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Template\"}, \"response\": {\"$ref\": \"Template\"}, \"httpMethod\": \"POST\", \"path\": \"tables/{tableId}/templates\", \"id\": \"fusiontables.template.insert\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/fusiontables\", \"https://www.googleapis.com/auth/fusiontables.readonly\"], \"parameters\": {\"tableId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"templateId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"int32\"}}, \"id\": \"fusiontables.template.get\", \"httpMethod\": \"GET\", \"path\": \"tables/{tableId}/templates/{templateId}\", \"response\": {\"$ref\": \"Template\"}}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/fusiontables\", \"https://www.googleapis.com/auth/fusiontables.readonly\"], \"parameters\": {\"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"tableId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"maxResults\": {\"minimum\": \"0\", \"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}}, \"id\": \"fusiontables.template.list\", \"httpMethod\": \"GET\", \"path\": \"tables/{tableId}/templates\", \"response\": {\"$ref\": \"TemplateList\"}}, \"update\": {\"scopes\": [\"https://www.googleapis.com/auth/fusiontables\"], \"parameters\": {\"tableId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"templateId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"int32\"}}, \"request\": {\"$ref\": \"Template\"}, \"response\": {\"$ref\": \"Template\"}, \"httpMethod\": \"PUT\", \"path\": \"tables/{tableId}/templates/{templateId}\", \"id\": \"fusiontables.template.update\"}, \"patch\": {\"scopes\": [\"https://www.googleapis.com/auth/fusiontables\"], \"parameters\": {\"tableId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"templateId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"int32\"}}, \"request\": {\"$ref\": \"Template\"}, \"response\": {\"$ref\": \"Template\"}, \"httpMethod\": \"PATCH\", \"path\": \"tables/{tableId}/templates/{templateId}\", \"id\": \"fusiontables.template.patch\"}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/fusiontables\"], \"path\": \"tables/{tableId}/templates/{templateId}\", \"id\": \"fusiontables.template.delete\", \"parameters\": {\"tableId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"templateId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"int32\"}}, \"httpMethod\": \"DELETE\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_FusiontablesService.class,
                "table",
                new Google_TableServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_FusiontablesService.class, "serviceName"),
                        "table",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/fusiontables\"], \"request\": {\"$ref\": \"Table\"}, \"response\": {\"$ref\": \"Table\"}, \"httpMethod\": \"POST\", \"path\": \"tables\", \"id\": \"fusiontables.table.insert\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/fusiontables\", \"https://www.googleapis.com/auth/fusiontables.readonly\"], \"parameters\": {\"tableId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"fusiontables.table.get\", \"httpMethod\": \"GET\", \"path\": \"tables/{tableId}\", \"response\": {\"$ref\": \"Table\"}}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/fusiontables\", \"https://www.googleapis.com/auth/fusiontables.readonly\"], \"parameters\": {\"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"maxResults\": {\"minimum\": \"0\", \"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}}, \"response\": {\"$ref\": \"TableList\"}, \"httpMethod\": \"GET\", \"path\": \"tables\", \"id\": \"fusiontables.table.list\"}, \"update\": {\"scopes\": [\"https://www.googleapis.com/auth/fusiontables\"], \"parameters\": {\"replaceViewDefinition\": {\"type\": \"boolean\", \"location\": \"query\"}, \"tableId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Table\"}, \"response\": {\"$ref\": \"Table\"}, \"httpMethod\": \"PUT\", \"path\": \"tables/{tableId}\", \"id\": \"fusiontables.table.update\"}, \"patch\": {\"scopes\": [\"https://www.googleapis.com/auth/fusiontables\"], \"parameters\": {\"replaceViewDefinition\": {\"type\": \"boolean\", \"location\": \"query\"}, \"tableId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Table\"}, \"response\": {\"$ref\": \"Table\"}, \"httpMethod\": \"PATCH\", \"path\": \"tables/{tableId}\", \"id\": \"fusiontables.table.patch\"}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/fusiontables\"], \"path\": \"tables/{tableId}\", \"id\": \"fusiontables.table.delete\", \"parameters\": {\"tableId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"httpMethod\": \"DELETE\"}}}",
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
