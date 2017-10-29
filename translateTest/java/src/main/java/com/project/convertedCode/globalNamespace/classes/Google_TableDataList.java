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

public class Google_TableDataList extends Google_Model implements RuntimeFileContextInterface {

    public Object pageToken = null;

    public Object kind = null;

    public Object etag = null;

    public Object __rowsType = "Google_TableRow";

    public Object __rowsDataType = "array";

    public Object rows = null;

    public Object totalRows = null;

    public Google_TableDataList(RuntimeEnv env, Object... args) {
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
            case "setPageToken":
                return this.setPageToken(env, args);
            case "getPageToken":
                return this.getPageToken(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setEtag":
                return this.setEtag(env, args);
            case "getEtag":
                return this.getEtag(env, args);
            case "setRows":
                return this.setRows(env, args);
            case "getRows":
                return this.getRows(env, args);
            case "setTotalRows":
                return this.setTotalRows(env, args);
            case "getTotalRows":
                return this.getTotalRows(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "pageToken":
                return this.pageToken;
            case "kind":
                return this.kind;
            case "etag":
                return this.etag;
            case "__rowsType":
                if (Google_TableDataList.class.isAssignableFrom(caller)) {

                    return this.__rowsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__rowsDataType":
                if (Google_TableDataList.class.isAssignableFrom(caller)) {

                    return this.__rowsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "rows":
                return this.rows;
            case "totalRows":
                return this.totalRows;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "pageToken":
                return ZVal.isNull(this.pageToken);
            case "kind":
                return ZVal.isNull(this.kind);
            case "etag":
                return ZVal.isNull(this.etag);
            case "__rowsType":
                if (Google_TableDataList.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__rowsType);
                }
                break;
            case "__rowsDataType":
                if (Google_TableDataList.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__rowsDataType);
                }
                break;
            case "rows":
                return ZVal.isNull(this.rows);
            case "totalRows":
                return ZVal.isNull(this.totalRows);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "pageToken":
                this.pageToken = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "etag":
                this.etag = value;
                break;
            case "__rowsType":
                if (Google_TableDataList.class.isAssignableFrom(caller)) {

                    this.__rowsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__rowsDataType":
                if (Google_TableDataList.class.isAssignableFrom(caller)) {

                    this.__rowsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "rows":
                this.rows = value;
                break;
            case "totalRows":
                this.totalRows = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setPageToken(RuntimeEnv env, Object... args) {
        Object pageToken = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_TableDataList.class, "pageToken", pageToken);

        return null;
    }

    public Object getPageToken(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_TableDataList.class, "pageToken"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_TableDataList.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_TableDataList.class, "kind"));
    }

    public Object setEtag(RuntimeEnv env, Object... args) {
        Object etag = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_TableDataList.class, "etag", etag);

        return null;
    }

    public Object getEtag(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_TableDataList.class, "etag"));
    }

    public Object setRows(RuntimeEnv env, Object... args) {
        Object rows = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_TableDataList.class,
                rows,
                "Google_TableRow",
                "setRows");
        ZVal.setProperty(this, Google_TableDataList.class, "rows", rows);

        return null;
    }

    public Object getRows(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_TableDataList.class, "rows"));
    }

    public Object setTotalRows(RuntimeEnv env, Object... args) {
        Object totalRows = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_TableDataList.class, "totalRows", totalRows);

        return null;
    }

    public Object getTotalRows(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_TableDataList.class, "totalRows"));
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
