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

 google-api-php-client/src/contrib/Google_AdsenseService.php

*/

public class Google_AdsenseReportsGenerateResponse extends Google_Model
        implements RuntimeFileContextInterface {

    public Object kind = null;

    public Object rows = null;

    public Object warnings = null;

    public Object totals = null;

    public Object __headersType = "Google_AdsenseReportsGenerateResponseHeaders";

    public Object __headersDataType = "array";

    public Object headers = null;

    public Object totalMatchedRows = null;

    public Object averages = null;

    public Google_AdsenseReportsGenerateResponse(RuntimeEnv env, Object... args) {
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
            case "setWarnings":
                return this.setWarnings(env, args);
            case "getWarnings":
                return this.getWarnings(env, args);
            case "setTotals":
                return this.setTotals(env, args);
            case "getTotals":
                return this.getTotals(env, args);
            case "setHeaders":
                return this.setHeaders(env, args);
            case "getHeaders":
                return this.getHeaders(env, args);
            case "setTotalMatchedRows":
                return this.setTotalMatchedRows(env, args);
            case "getTotalMatchedRows":
                return this.getTotalMatchedRows(env, args);
            case "setAverages":
                return this.setAverages(env, args);
            case "getAverages":
                return this.getAverages(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return this.kind;
            case "rows":
                return this.rows;
            case "warnings":
                return this.warnings;
            case "totals":
                return this.totals;
            case "__headersType":
                if (Google_AdsenseReportsGenerateResponse.class.isAssignableFrom(caller)) {

                    return this.__headersType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__headersDataType":
                if (Google_AdsenseReportsGenerateResponse.class.isAssignableFrom(caller)) {

                    return this.__headersDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "headers":
                return this.headers;
            case "totalMatchedRows":
                return this.totalMatchedRows;
            case "averages":
                return this.averages;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return ZVal.isNull(this.kind);
            case "rows":
                return ZVal.isNull(this.rows);
            case "warnings":
                return ZVal.isNull(this.warnings);
            case "totals":
                return ZVal.isNull(this.totals);
            case "__headersType":
                if (Google_AdsenseReportsGenerateResponse.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__headersType);
                }
                break;
            case "__headersDataType":
                if (Google_AdsenseReportsGenerateResponse.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__headersDataType);
                }
                break;
            case "headers":
                return ZVal.isNull(this.headers);
            case "totalMatchedRows":
                return ZVal.isNull(this.totalMatchedRows);
            case "averages":
                return ZVal.isNull(this.averages);
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
            case "rows":
                this.rows = value;
                break;
            case "warnings":
                this.warnings = value;
                break;
            case "totals":
                this.totals = value;
                break;
            case "__headersType":
                if (Google_AdsenseReportsGenerateResponse.class.isAssignableFrom(caller)) {

                    this.__headersType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__headersDataType":
                if (Google_AdsenseReportsGenerateResponse.class.isAssignableFrom(caller)) {

                    this.__headersDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "headers":
                this.headers = value;
                break;
            case "totalMatchedRows":
                this.totalMatchedRows = value;
                break;
            case "averages":
                this.averages = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AdsenseReportsGenerateResponse.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_AdsenseReportsGenerateResponse.class, "kind"));
    }

    public Object setRows(RuntimeEnv env, Object... args) {
        Object rows = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AdsenseReportsGenerateResponse.class, "rows", rows);

        return null;
    }

    public Object getRows(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_AdsenseReportsGenerateResponse.class, "rows"));
    }

    public Object setWarnings(RuntimeEnv env, Object... args) {
        Object warnings = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AdsenseReportsGenerateResponse.class, "warnings", warnings);

        return null;
    }

    public Object getWarnings(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_AdsenseReportsGenerateResponse.class, "warnings"));
    }

    public Object setTotals(RuntimeEnv env, Object... args) {
        Object totals = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AdsenseReportsGenerateResponse.class, "totals", totals);

        return null;
    }

    public Object getTotals(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_AdsenseReportsGenerateResponse.class, "totals"));
    }

    public Object setHeaders(RuntimeEnv env, Object... args) {
        Object headers = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_AdsenseReportsGenerateResponse.class,
                headers,
                "Google_AdsenseReportsGenerateResponseHeaders",
                "setHeaders");
        ZVal.setProperty(this, Google_AdsenseReportsGenerateResponse.class, "headers", headers);

        return null;
    }

    public Object getHeaders(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_AdsenseReportsGenerateResponse.class, "headers"));
    }

    public Object setTotalMatchedRows(RuntimeEnv env, Object... args) {
        Object totalMatchedRows = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_AdsenseReportsGenerateResponse.class,
                "totalMatchedRows",
                totalMatchedRows);

        return null;
    }

    public Object getTotalMatchedRows(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_AdsenseReportsGenerateResponse.class, "totalMatchedRows"));
    }

    public Object setAverages(RuntimeEnv env, Object... args) {
        Object averages = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AdsenseReportsGenerateResponse.class, "averages", averages);

        return null;
    }

    public Object getAverages(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_AdsenseReportsGenerateResponse.class, "averages"));
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
