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

public class Google_JobReference extends Google_Model implements RuntimeFileContextInterface {

    public Object projectId = null;

    public Object jobId = null;

    public Google_JobReference(RuntimeEnv env, Object... args) {
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
            case "setJobId":
                return this.setJobId(env, args);
            case "getJobId":
                return this.getJobId(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "projectId":
                return this.projectId;
            case "jobId":
                return this.jobId;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "projectId":
                return ZVal.isNull(this.projectId);
            case "jobId":
                return ZVal.isNull(this.jobId);
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
            case "jobId":
                this.jobId = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setProjectId(RuntimeEnv env, Object... args) {
        Object projectId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_JobReference.class, "projectId", projectId);

        return null;
    }

    public Object getProjectId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_JobReference.class, "projectId"));
    }

    public Object setJobId(RuntimeEnv env, Object... args) {
        Object jobId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_JobReference.class, "jobId", jobId);

        return null;
    }

    public Object getJobId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_JobReference.class, "jobId"));
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
