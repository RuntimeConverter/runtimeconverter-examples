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

public class Google_JobList extends Google_Model implements RuntimeFileContextInterface {

    public Object nextPageToken = null;

    public Object totalItems = null;

    public Object kind = null;

    public Object etag = null;

    public Object __jobsType = "Google_JobListJobs";

    public Object __jobsDataType = "array";

    public Object jobs = null;

    public Google_JobList(RuntimeEnv env, Object... args) {
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
            case "setTotalItems":
                return this.setTotalItems(env, args);
            case "getTotalItems":
                return this.getTotalItems(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setEtag":
                return this.setEtag(env, args);
            case "getEtag":
                return this.getEtag(env, args);
            case "setJobs":
                return this.setJobs(env, args);
            case "getJobs":
                return this.getJobs(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "nextPageToken":
                return this.nextPageToken;
            case "totalItems":
                return this.totalItems;
            case "kind":
                return this.kind;
            case "etag":
                return this.etag;
            case "__jobsType":
                if (Google_JobList.class.isAssignableFrom(caller)) {

                    return this.__jobsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__jobsDataType":
                if (Google_JobList.class.isAssignableFrom(caller)) {

                    return this.__jobsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "jobs":
                return this.jobs;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "nextPageToken":
                return ZVal.isNull(this.nextPageToken);
            case "totalItems":
                return ZVal.isNull(this.totalItems);
            case "kind":
                return ZVal.isNull(this.kind);
            case "etag":
                return ZVal.isNull(this.etag);
            case "__jobsType":
                if (Google_JobList.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__jobsType);
                }
                break;
            case "__jobsDataType":
                if (Google_JobList.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__jobsDataType);
                }
                break;
            case "jobs":
                return ZVal.isNull(this.jobs);
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
            case "totalItems":
                this.totalItems = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "etag":
                this.etag = value;
                break;
            case "__jobsType":
                if (Google_JobList.class.isAssignableFrom(caller)) {

                    this.__jobsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__jobsDataType":
                if (Google_JobList.class.isAssignableFrom(caller)) {

                    this.__jobsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "jobs":
                this.jobs = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setNextPageToken(RuntimeEnv env, Object... args) {
        Object nextPageToken = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_JobList.class, "nextPageToken", nextPageToken);

        return null;
    }

    public Object getNextPageToken(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_JobList.class, "nextPageToken"));
    }

    public Object setTotalItems(RuntimeEnv env, Object... args) {
        Object totalItems = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_JobList.class, "totalItems", totalItems);

        return null;
    }

    public Object getTotalItems(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_JobList.class, "totalItems"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_JobList.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_JobList.class, "kind"));
    }

    public Object setEtag(RuntimeEnv env, Object... args) {
        Object etag = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_JobList.class, "etag", etag);

        return null;
    }

    public Object getEtag(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_JobList.class, "etag"));
    }

    public Object setJobs(RuntimeEnv env, Object... args) {
        Object jobs = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this, "assertIsArray", Google_JobList.class, jobs, "Google_JobListJobs", "setJobs");
        ZVal.setProperty(this, Google_JobList.class, "jobs", jobs);

        return null;
    }

    public Object getJobs(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_JobList.class, "jobs"));
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
