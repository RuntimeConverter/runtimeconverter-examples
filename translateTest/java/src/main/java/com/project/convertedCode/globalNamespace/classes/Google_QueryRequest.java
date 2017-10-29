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

public class Google_QueryRequest extends Google_Model implements RuntimeFileContextInterface {

    public Object timeoutMs = null;

    public Object kind = null;

    public Object dryRun = null;

    public Object __defaultDatasetType = "Google_DatasetReference";

    public Object __defaultDatasetDataType = "";

    public Object defaultDataset = null;

    public Object maxResults = null;

    public Object query = null;

    public Google_QueryRequest(RuntimeEnv env, Object... args) {
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
            case "setTimeoutMs":
                return this.setTimeoutMs(env, args);
            case "getTimeoutMs":
                return this.getTimeoutMs(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setDryRun":
                return this.setDryRun(env, args);
            case "getDryRun":
                return this.getDryRun(env, args);
            case "setDefaultDataset":
                return this.setDefaultDataset(env, args);
            case "getDefaultDataset":
                return this.getDefaultDataset(env, args);
            case "setMaxResults":
                return this.setMaxResults(env, args);
            case "getMaxResults":
                return this.getMaxResults(env, args);
            case "setQuery":
                return this.setQuery(env, args);
            case "getQuery":
                return this.getQuery(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "timeoutMs":
                return this.timeoutMs;
            case "kind":
                return this.kind;
            case "dryRun":
                return this.dryRun;
            case "__defaultDatasetType":
                if (Google_QueryRequest.class.isAssignableFrom(caller)) {

                    return this.__defaultDatasetType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__defaultDatasetDataType":
                if (Google_QueryRequest.class.isAssignableFrom(caller)) {

                    return this.__defaultDatasetDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "defaultDataset":
                return this.defaultDataset;
            case "maxResults":
                return this.maxResults;
            case "query":
                return this.query;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "timeoutMs":
                return ZVal.isNull(this.timeoutMs);
            case "kind":
                return ZVal.isNull(this.kind);
            case "dryRun":
                return ZVal.isNull(this.dryRun);
            case "__defaultDatasetType":
                if (Google_QueryRequest.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__defaultDatasetType);
                }
                break;
            case "__defaultDatasetDataType":
                if (Google_QueryRequest.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__defaultDatasetDataType);
                }
                break;
            case "defaultDataset":
                return ZVal.isNull(this.defaultDataset);
            case "maxResults":
                return ZVal.isNull(this.maxResults);
            case "query":
                return ZVal.isNull(this.query);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "timeoutMs":
                this.timeoutMs = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "dryRun":
                this.dryRun = value;
                break;
            case "__defaultDatasetType":
                if (Google_QueryRequest.class.isAssignableFrom(caller)) {

                    this.__defaultDatasetType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__defaultDatasetDataType":
                if (Google_QueryRequest.class.isAssignableFrom(caller)) {

                    this.__defaultDatasetDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "defaultDataset":
                this.defaultDataset = value;
                break;
            case "maxResults":
                this.maxResults = value;
                break;
            case "query":
                this.query = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setTimeoutMs(RuntimeEnv env, Object... args) {
        Object timeoutMs = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_QueryRequest.class, "timeoutMs", timeoutMs);

        return null;
    }

    public Object getTimeoutMs(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_QueryRequest.class, "timeoutMs"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_QueryRequest.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_QueryRequest.class, "kind"));
    }

    public Object setDryRun(RuntimeEnv env, Object... args) {
        Object dryRun = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_QueryRequest.class, "dryRun", dryRun);

        return null;
    }

    public Object getDryRun(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_QueryRequest.class, "dryRun"));
    }

    public Object setDefaultDataset(RuntimeEnv env, Object... args) {
        Object defaultDataset = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_QueryRequest.class, "defaultDataset", defaultDataset);

        return null;
    }

    public Object getDefaultDataset(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_QueryRequest.class, "defaultDataset"));
    }

    public Object setMaxResults(RuntimeEnv env, Object... args) {
        Object maxResults = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_QueryRequest.class, "maxResults", maxResults);

        return null;
    }

    public Object getMaxResults(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_QueryRequest.class, "maxResults"));
    }

    public Object setQuery(RuntimeEnv env, Object... args) {
        Object query = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_QueryRequest.class, "query", query);

        return null;
    }

    public Object getQuery(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_QueryRequest.class, "query"));
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
