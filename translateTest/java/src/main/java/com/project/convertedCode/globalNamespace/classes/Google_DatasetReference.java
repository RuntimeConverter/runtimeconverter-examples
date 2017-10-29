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

public class Google_DatasetReference extends Google_Model implements RuntimeFileContextInterface {

    public Object projectId = null;

    public Object datasetId = null;

    public Google_DatasetReference(RuntimeEnv env, Object... args) {
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
            case "setProjectId":
                return this.setProjectId(env, args);
            case "getProjectId":
                return this.getProjectId(env, args);
            case "setDatasetId":
                return this.setDatasetId(env, args);
            case "getDatasetId":
                return this.getDatasetId(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "projectId":
                return this.projectId;
            case "datasetId":
                return this.datasetId;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "projectId":
                return ZVal.isNull(this.projectId);
            case "datasetId":
                return ZVal.isNull(this.datasetId);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "projectId":
                this.projectId = value;
                break;
            case "datasetId":
                this.datasetId = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setProjectId(RuntimeEnv env, Object... args) {
        Object projectId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DatasetReference.class, "projectId", projectId);

        return null;
    }

    public Object getProjectId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DatasetReference.class, "projectId"));
    }

    public Object setDatasetId(RuntimeEnv env, Object... args) {
        Object datasetId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DatasetReference.class, "datasetId", datasetId);

        return null;
    }

    public Object getDatasetId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DatasetReference.class, "datasetId"));
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
