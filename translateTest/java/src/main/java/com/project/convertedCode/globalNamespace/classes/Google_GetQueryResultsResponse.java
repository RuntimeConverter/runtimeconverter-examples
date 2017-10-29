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

public class Google_GetQueryResultsResponse extends Google_Model
        implements RuntimeFileContextInterface {

    public Object kind = null;

    public Object __rowsType = "Google_TableRow";

    public Object __rowsDataType = "array";

    public Object rows = null;

    public Object __jobReferenceType = "Google_JobReference";

    public Object __jobReferenceDataType = "";

    public Object jobReference = null;

    public Object jobComplete = null;

    public Object totalRows = null;

    public Object etag = null;

    public Object __schemaType = "Google_TableSchema";

    public Object __schemaDataType = "";

    public Object schema = null;

    public Google_GetQueryResultsResponse(RuntimeEnv env, Object... args) {
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
            case "setRows":
                return this.setRows(env, args);
            case "getRows":
                return this.getRows(env, args);
            case "setJobReference":
                return this.setJobReference(env, args);
            case "getJobReference":
                return this.getJobReference(env, args);
            case "setJobComplete":
                return this.setJobComplete(env, args);
            case "getJobComplete":
                return this.getJobComplete(env, args);
            case "setTotalRows":
                return this.setTotalRows(env, args);
            case "getTotalRows":
                return this.getTotalRows(env, args);
            case "setEtag":
                return this.setEtag(env, args);
            case "getEtag":
                return this.getEtag(env, args);
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
            case "kind":
                return this.kind;
            case "__rowsType":
                if (Google_GetQueryResultsResponse.class.isAssignableFrom(caller)) {

                    return this.__rowsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__rowsDataType":
                if (Google_GetQueryResultsResponse.class.isAssignableFrom(caller)) {

                    return this.__rowsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "rows":
                return this.rows;
            case "__jobReferenceType":
                if (Google_GetQueryResultsResponse.class.isAssignableFrom(caller)) {

                    return this.__jobReferenceType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__jobReferenceDataType":
                if (Google_GetQueryResultsResponse.class.isAssignableFrom(caller)) {

                    return this.__jobReferenceDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "jobReference":
                return this.jobReference;
            case "jobComplete":
                return this.jobComplete;
            case "totalRows":
                return this.totalRows;
            case "etag":
                return this.etag;
            case "__schemaType":
                if (Google_GetQueryResultsResponse.class.isAssignableFrom(caller)) {

                    return this.__schemaType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__schemaDataType":
                if (Google_GetQueryResultsResponse.class.isAssignableFrom(caller)) {

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
            case "kind":
                return ZVal.isNull(this.kind);
            case "__rowsType":
                if (Google_GetQueryResultsResponse.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__rowsType);
                }
                break;
            case "__rowsDataType":
                if (Google_GetQueryResultsResponse.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__rowsDataType);
                }
                break;
            case "rows":
                return ZVal.isNull(this.rows);
            case "__jobReferenceType":
                if (Google_GetQueryResultsResponse.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__jobReferenceType);
                }
                break;
            case "__jobReferenceDataType":
                if (Google_GetQueryResultsResponse.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__jobReferenceDataType);
                }
                break;
            case "jobReference":
                return ZVal.isNull(this.jobReference);
            case "jobComplete":
                return ZVal.isNull(this.jobComplete);
            case "totalRows":
                return ZVal.isNull(this.totalRows);
            case "etag":
                return ZVal.isNull(this.etag);
            case "__schemaType":
                if (Google_GetQueryResultsResponse.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__schemaType);
                }
                break;
            case "__schemaDataType":
                if (Google_GetQueryResultsResponse.class.isAssignableFrom(caller)) {

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
            case "kind":
                this.kind = value;
                break;
            case "__rowsType":
                if (Google_GetQueryResultsResponse.class.isAssignableFrom(caller)) {

                    this.__rowsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__rowsDataType":
                if (Google_GetQueryResultsResponse.class.isAssignableFrom(caller)) {

                    this.__rowsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "rows":
                this.rows = value;
                break;
            case "__jobReferenceType":
                if (Google_GetQueryResultsResponse.class.isAssignableFrom(caller)) {

                    this.__jobReferenceType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__jobReferenceDataType":
                if (Google_GetQueryResultsResponse.class.isAssignableFrom(caller)) {

                    this.__jobReferenceDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "jobReference":
                this.jobReference = value;
                break;
            case "jobComplete":
                this.jobComplete = value;
                break;
            case "totalRows":
                this.totalRows = value;
                break;
            case "etag":
                this.etag = value;
                break;
            case "__schemaType":
                if (Google_GetQueryResultsResponse.class.isAssignableFrom(caller)) {

                    this.__schemaType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__schemaDataType":
                if (Google_GetQueryResultsResponse.class.isAssignableFrom(caller)) {

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

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_GetQueryResultsResponse.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_GetQueryResultsResponse.class, "kind"));
    }

    public Object setRows(RuntimeEnv env, Object... args) {
        Object rows = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_GetQueryResultsResponse.class,
                rows,
                "Google_TableRow",
                "setRows");
        ZVal.setProperty(this, Google_GetQueryResultsResponse.class, "rows", rows);

        return null;
    }

    public Object getRows(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_GetQueryResultsResponse.class, "rows"));
    }

    public Object setJobReference(RuntimeEnv env, Object... args) {
        Object jobReference = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_GetQueryResultsResponse.class, "jobReference", jobReference);

        return null;
    }

    public Object getJobReference(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_GetQueryResultsResponse.class, "jobReference"));
    }

    public Object setJobComplete(RuntimeEnv env, Object... args) {
        Object jobComplete = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_GetQueryResultsResponse.class, "jobComplete", jobComplete);

        return null;
    }

    public Object getJobComplete(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_GetQueryResultsResponse.class, "jobComplete"));
    }

    public Object setTotalRows(RuntimeEnv env, Object... args) {
        Object totalRows = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_GetQueryResultsResponse.class, "totalRows", totalRows);

        return null;
    }

    public Object getTotalRows(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_GetQueryResultsResponse.class, "totalRows"));
    }

    public Object setEtag(RuntimeEnv env, Object... args) {
        Object etag = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_GetQueryResultsResponse.class, "etag", etag);

        return null;
    }

    public Object getEtag(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_GetQueryResultsResponse.class, "etag"));
    }

    public Object setSchema(RuntimeEnv env, Object... args) {
        Object schema = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_GetQueryResultsResponse.class, "schema", schema);

        return null;
    }

    public Object getSchema(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_GetQueryResultsResponse.class, "schema"));
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
