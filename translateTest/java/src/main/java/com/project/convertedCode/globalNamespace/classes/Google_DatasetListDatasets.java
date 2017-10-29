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

public class Google_DatasetListDatasets extends Google_Model
        implements RuntimeFileContextInterface {

    public Object friendlyName = null;

    public Object kind = null;

    public Object id = null;

    public Object __datasetReferenceType = "Google_DatasetReference";

    public Object __datasetReferenceDataType = "";

    public Object datasetReference = null;

    public Google_DatasetListDatasets(RuntimeEnv env, Object... args) {
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
            case "setFriendlyName":
                return this.setFriendlyName(env, args);
            case "getFriendlyName":
                return this.getFriendlyName(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setDatasetReference":
                return this.setDatasetReference(env, args);
            case "getDatasetReference":
                return this.getDatasetReference(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "friendlyName":
                return this.friendlyName;
            case "kind":
                return this.kind;
            case "id":
                return this.id;
            case "__datasetReferenceType":
                if (Google_DatasetListDatasets.class.isAssignableFrom(caller)) {

                    return this.__datasetReferenceType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__datasetReferenceDataType":
                if (Google_DatasetListDatasets.class.isAssignableFrom(caller)) {

                    return this.__datasetReferenceDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "datasetReference":
                return this.datasetReference;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "friendlyName":
                return ZVal.isNull(this.friendlyName);
            case "kind":
                return ZVal.isNull(this.kind);
            case "id":
                return ZVal.isNull(this.id);
            case "__datasetReferenceType":
                if (Google_DatasetListDatasets.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__datasetReferenceType);
                }
                break;
            case "__datasetReferenceDataType":
                if (Google_DatasetListDatasets.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__datasetReferenceDataType);
                }
                break;
            case "datasetReference":
                return ZVal.isNull(this.datasetReference);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "friendlyName":
                this.friendlyName = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "id":
                this.id = value;
                break;
            case "__datasetReferenceType":
                if (Google_DatasetListDatasets.class.isAssignableFrom(caller)) {

                    this.__datasetReferenceType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__datasetReferenceDataType":
                if (Google_DatasetListDatasets.class.isAssignableFrom(caller)) {

                    this.__datasetReferenceDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "datasetReference":
                this.datasetReference = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setFriendlyName(RuntimeEnv env, Object... args) {
        Object friendlyName = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DatasetListDatasets.class, "friendlyName", friendlyName);

        return null;
    }

    public Object getFriendlyName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_DatasetListDatasets.class, "friendlyName"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DatasetListDatasets.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DatasetListDatasets.class, "kind"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DatasetListDatasets.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DatasetListDatasets.class, "id"));
    }

    public Object setDatasetReference(RuntimeEnv env, Object... args) {
        Object datasetReference = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_DatasetListDatasets.class, "datasetReference", datasetReference);

        return null;
    }

    public Object getDatasetReference(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_DatasetListDatasets.class, "datasetReference"));
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
