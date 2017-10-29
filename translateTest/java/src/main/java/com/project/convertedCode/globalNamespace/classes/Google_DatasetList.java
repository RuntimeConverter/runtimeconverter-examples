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

public class Google_DatasetList extends Google_Model implements RuntimeFileContextInterface {

    public Object nextPageToken = null;

    public Object kind = null;

    public Object __datasetsType = "Google_DatasetListDatasets";

    public Object __datasetsDataType = "array";

    public Object datasets = null;

    public Object etag = null;

    public Google_DatasetList(RuntimeEnv env, Object... args) {
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
            case "setNextPageToken":
                return this.setNextPageToken(env, args);
            case "getNextPageToken":
                return this.getNextPageToken(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setDatasets":
                return this.setDatasets(env, args);
            case "getDatasets":
                return this.getDatasets(env, args);
            case "setEtag":
                return this.setEtag(env, args);
            case "getEtag":
                return this.getEtag(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "nextPageToken":
                return this.nextPageToken;
            case "kind":
                return this.kind;
            case "__datasetsType":
                if (Google_DatasetList.class.isAssignableFrom(caller)) {

                    return this.__datasetsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__datasetsDataType":
                if (Google_DatasetList.class.isAssignableFrom(caller)) {

                    return this.__datasetsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "datasets":
                return this.datasets;
            case "etag":
                return this.etag;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "nextPageToken":
                return ZVal.isNull(this.nextPageToken);
            case "kind":
                return ZVal.isNull(this.kind);
            case "__datasetsType":
                if (Google_DatasetList.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__datasetsType);
                }
                break;
            case "__datasetsDataType":
                if (Google_DatasetList.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__datasetsDataType);
                }
                break;
            case "datasets":
                return ZVal.isNull(this.datasets);
            case "etag":
                return ZVal.isNull(this.etag);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "nextPageToken":
                this.nextPageToken = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "__datasetsType":
                if (Google_DatasetList.class.isAssignableFrom(caller)) {

                    this.__datasetsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__datasetsDataType":
                if (Google_DatasetList.class.isAssignableFrom(caller)) {

                    this.__datasetsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "datasets":
                this.datasets = value;
                break;
            case "etag":
                this.etag = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setNextPageToken(RuntimeEnv env, Object... args) {
        Object nextPageToken = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DatasetList.class, "nextPageToken", nextPageToken);

        return null;
    }

    public Object getNextPageToken(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DatasetList.class, "nextPageToken"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DatasetList.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DatasetList.class, "kind"));
    }

    public Object setDatasets(RuntimeEnv env, Object... args) {
        Object datasets = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_DatasetList.class,
                datasets,
                "Google_DatasetListDatasets",
                "setDatasets");
        ZVal.setProperty(this, Google_DatasetList.class, "datasets", datasets);

        return null;
    }

    public Object getDatasets(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DatasetList.class, "datasets"));
    }

    public Object setEtag(RuntimeEnv env, Object... args) {
        Object etag = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DatasetList.class, "etag", etag);

        return null;
    }

    public Object getEtag(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DatasetList.class, "etag"));
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
