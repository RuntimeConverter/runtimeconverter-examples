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

 google-api-php-client/src/contrib/Google_BigqueryService.php

*/

public class Google_JobConfigurationLoad extends Google_Model
        implements RuntimeFileContextInterface {

    public Object encoding = null;

    public Object fieldDelimiter = null;

    public Object __destinationTableType = "Google_TableReference";

    public Object __destinationTableDataType = "";

    public Object destinationTable = null;

    public Object writeDisposition = null;

    public Object maxBadRecords = null;

    public Object skipLeadingRows = null;

    public Object sourceUris = null;

    public Object quote = null;

    public Object createDisposition = null;

    public Object schemaInlineFormat = null;

    public Object schemaInline = null;

    public Object __schemaType = "Google_TableSchema";

    public Object __schemaDataType = "";

    public Object schema = null;

    public Google_JobConfigurationLoad(RuntimeEnv env, Object... args) {
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
            case "setEncoding":
                return this.setEncoding(env, args);
            case "getEncoding":
                return this.getEncoding(env, args);
            case "setFieldDelimiter":
                return this.setFieldDelimiter(env, args);
            case "getFieldDelimiter":
                return this.getFieldDelimiter(env, args);
            case "setDestinationTable":
                return this.setDestinationTable(env, args);
            case "getDestinationTable":
                return this.getDestinationTable(env, args);
            case "setWriteDisposition":
                return this.setWriteDisposition(env, args);
            case "getWriteDisposition":
                return this.getWriteDisposition(env, args);
            case "setMaxBadRecords":
                return this.setMaxBadRecords(env, args);
            case "getMaxBadRecords":
                return this.getMaxBadRecords(env, args);
            case "setSkipLeadingRows":
                return this.setSkipLeadingRows(env, args);
            case "getSkipLeadingRows":
                return this.getSkipLeadingRows(env, args);
            case "setSourceUris":
                return this.setSourceUris(env, args);
            case "getSourceUris":
                return this.getSourceUris(env, args);
            case "setQuote":
                return this.setQuote(env, args);
            case "getQuote":
                return this.getQuote(env, args);
            case "setCreateDisposition":
                return this.setCreateDisposition(env, args);
            case "getCreateDisposition":
                return this.getCreateDisposition(env, args);
            case "setSchemaInlineFormat":
                return this.setSchemaInlineFormat(env, args);
            case "getSchemaInlineFormat":
                return this.getSchemaInlineFormat(env, args);
            case "setSchemaInline":
                return this.setSchemaInline(env, args);
            case "getSchemaInline":
                return this.getSchemaInline(env, args);
            case "setSchema":
                return this.setSchema(env, args);
            case "getSchema":
                return this.getSchema(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "encoding":
                return this.encoding;
            case "fieldDelimiter":
                return this.fieldDelimiter;
            case "__destinationTableType":
                if (Google_JobConfigurationLoad.class.isAssignableFrom(caller)) {

                    return this.__destinationTableType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__destinationTableDataType":
                if (Google_JobConfigurationLoad.class.isAssignableFrom(caller)) {

                    return this.__destinationTableDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "destinationTable":
                return this.destinationTable;
            case "writeDisposition":
                return this.writeDisposition;
            case "maxBadRecords":
                return this.maxBadRecords;
            case "skipLeadingRows":
                return this.skipLeadingRows;
            case "sourceUris":
                return this.sourceUris;
            case "quote":
                return this.quote;
            case "createDisposition":
                return this.createDisposition;
            case "schemaInlineFormat":
                return this.schemaInlineFormat;
            case "schemaInline":
                return this.schemaInline;
            case "__schemaType":
                if (Google_JobConfigurationLoad.class.isAssignableFrom(caller)) {

                    return this.__schemaType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__schemaDataType":
                if (Google_JobConfigurationLoad.class.isAssignableFrom(caller)) {

                    return this.__schemaDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "schema":
                return this.schema;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "encoding":
                return ZVal.isNull(this.encoding);
            case "fieldDelimiter":
                return ZVal.isNull(this.fieldDelimiter);
            case "__destinationTableType":
                if (Google_JobConfigurationLoad.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__destinationTableType);
                }
                break;
            case "__destinationTableDataType":
                if (Google_JobConfigurationLoad.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__destinationTableDataType);
                }
                break;
            case "destinationTable":
                return ZVal.isNull(this.destinationTable);
            case "writeDisposition":
                return ZVal.isNull(this.writeDisposition);
            case "maxBadRecords":
                return ZVal.isNull(this.maxBadRecords);
            case "skipLeadingRows":
                return ZVal.isNull(this.skipLeadingRows);
            case "sourceUris":
                return ZVal.isNull(this.sourceUris);
            case "quote":
                return ZVal.isNull(this.quote);
            case "createDisposition":
                return ZVal.isNull(this.createDisposition);
            case "schemaInlineFormat":
                return ZVal.isNull(this.schemaInlineFormat);
            case "schemaInline":
                return ZVal.isNull(this.schemaInline);
            case "__schemaType":
                if (Google_JobConfigurationLoad.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__schemaType);
                }
                break;
            case "__schemaDataType":
                if (Google_JobConfigurationLoad.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__schemaDataType);
                }
                break;
            case "schema":
                return ZVal.isNull(this.schema);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "encoding":
                this.encoding = value;
                break;
            case "fieldDelimiter":
                this.fieldDelimiter = value;
                break;
            case "__destinationTableType":
                if (Google_JobConfigurationLoad.class.isAssignableFrom(caller)) {

                    this.__destinationTableType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__destinationTableDataType":
                if (Google_JobConfigurationLoad.class.isAssignableFrom(caller)) {

                    this.__destinationTableDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "destinationTable":
                this.destinationTable = value;
                break;
            case "writeDisposition":
                this.writeDisposition = value;
                break;
            case "maxBadRecords":
                this.maxBadRecords = value;
                break;
            case "skipLeadingRows":
                this.skipLeadingRows = value;
                break;
            case "sourceUris":
                this.sourceUris = value;
                break;
            case "quote":
                this.quote = value;
                break;
            case "createDisposition":
                this.createDisposition = value;
                break;
            case "schemaInlineFormat":
                this.schemaInlineFormat = value;
                break;
            case "schemaInline":
                this.schemaInline = value;
                break;
            case "__schemaType":
                if (Google_JobConfigurationLoad.class.isAssignableFrom(caller)) {

                    this.__schemaType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__schemaDataType":
                if (Google_JobConfigurationLoad.class.isAssignableFrom(caller)) {

                    this.__schemaDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "schema":
                this.schema = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setEncoding(RuntimeEnv env, Object... args) {
        Object encoding = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_JobConfigurationLoad.class, "encoding", encoding);

        return null;
    }

    public Object getEncoding(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_JobConfigurationLoad.class, "encoding"));
    }

    public Object setFieldDelimiter(RuntimeEnv env, Object... args) {
        Object fieldDelimiter = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_JobConfigurationLoad.class, "fieldDelimiter", fieldDelimiter);

        return null;
    }

    public Object getFieldDelimiter(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_JobConfigurationLoad.class, "fieldDelimiter"));
    }

    public Object setDestinationTable(RuntimeEnv env, Object... args) {
        Object destinationTable = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_JobConfigurationLoad.class, "destinationTable", destinationTable);

        return null;
    }

    public Object getDestinationTable(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_JobConfigurationLoad.class, "destinationTable"));
    }

    public Object setWriteDisposition(RuntimeEnv env, Object... args) {
        Object writeDisposition = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_JobConfigurationLoad.class, "writeDisposition", writeDisposition);

        return null;
    }

    public Object getWriteDisposition(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_JobConfigurationLoad.class, "writeDisposition"));
    }

    public Object setMaxBadRecords(RuntimeEnv env, Object... args) {
        Object maxBadRecords = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_JobConfigurationLoad.class, "maxBadRecords", maxBadRecords);

        return null;
    }

    public Object getMaxBadRecords(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_JobConfigurationLoad.class, "maxBadRecords"));
    }

    public Object setSkipLeadingRows(RuntimeEnv env, Object... args) {
        Object skipLeadingRows = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_JobConfigurationLoad.class, "skipLeadingRows", skipLeadingRows);

        return null;
    }

    public Object getSkipLeadingRows(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_JobConfigurationLoad.class, "skipLeadingRows"));
    }

    public Object setSourceUris(RuntimeEnv env, Object... args) {
        Object sourceUris = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_JobConfigurationLoad.class,
                sourceUris,
                "Google_string",
                "setSourceUris");
        ZVal.setProperty(this, Google_JobConfigurationLoad.class, "sourceUris", sourceUris);

        return null;
    }

    public Object getSourceUris(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_JobConfigurationLoad.class, "sourceUris"));
    }

    public Object setQuote(RuntimeEnv env, Object... args) {
        Object quote = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_JobConfigurationLoad.class, "quote", quote);

        return null;
    }

    public Object getQuote(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_JobConfigurationLoad.class, "quote"));
    }

    public Object setCreateDisposition(RuntimeEnv env, Object... args) {
        Object createDisposition = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_JobConfigurationLoad.class, "createDisposition", createDisposition);

        return null;
    }

    public Object getCreateDisposition(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_JobConfigurationLoad.class, "createDisposition"));
    }

    public Object setSchemaInlineFormat(RuntimeEnv env, Object... args) {
        Object schemaInlineFormat = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_JobConfigurationLoad.class, "schemaInlineFormat", schemaInlineFormat);

        return null;
    }

    public Object getSchemaInlineFormat(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_JobConfigurationLoad.class, "schemaInlineFormat"));
    }

    public Object setSchemaInline(RuntimeEnv env, Object... args) {
        Object schemaInline = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_JobConfigurationLoad.class, "schemaInline", schemaInline);

        return null;
    }

    public Object getSchemaInline(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_JobConfigurationLoad.class, "schemaInline"));
    }

    public Object setSchema(RuntimeEnv env, Object... args) {
        Object schema = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_JobConfigurationLoad.class, "schema", schema);

        return null;
    }

    public Object getSchema(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_JobConfigurationLoad.class, "schema"));
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
