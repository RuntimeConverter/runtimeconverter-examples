package com.project.convertedCode.globalNamespace.classes;

import com.project.convertedCode.globalNamespace.classes.Google_QueryResponse;
import com.project.convertedCode.globalNamespace.classes.Google_ServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_Job;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Google_GetQueryResultsResponse;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Google_JobList;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_BigqueryService.php

*/

public class Google_JobsServiceResource extends Google_ServiceResource
        implements RuntimeFileContextInterface {

    public Google_JobsServiceResource(RuntimeEnv env, Object... args) {
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
            case "insert":
                return this.insert(env, args);
            case "query":
                return this.query(env, args);
            case "listJobs":
                return this.listJobs(env, args);
            case "getQueryResults":
                return this.getQueryResults(env, args);
            case "get":
                return this.get(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        super.__set(key, value, caller);
    }

    public Object insert(RuntimeEnv env, Object... args) {
        Object projectId = ZVal.assignParameter(args, 0, null);
        Object postBody = ZVal.assignParameter(args, 1, null);
        Object optParams = ZVal.assignParameter(args, 2, null);
        if (ZVal.isNull(optParams)) {
            optParams = ZVal.newArray();
        }
        Object data = null;
        Object params = null;
        params = ZVal.newArray(new ZPair("projectId", projectId), new ZPair("postBody", postBody));
        params = CRArrayF.array_merge.call(env, params, optParams);
        data =
                env.callMethod(
                        this,
                        "__call",
                        Google_JobsServiceResource.class,
                        "insert",
                        ZVal.newArray(new ZPair(0, params)));
        if (ZVal.isTrue(env.callMethod(this, "useObjects", Google_JobsServiceResource.class))) {
            return ZVal.assign(new Google_Job(env, data));

        } else {
            return ZVal.assign(data);
        }
    }

    public Object query(RuntimeEnv env, Object... args) {
        Object projectId = ZVal.assignParameter(args, 0, null);
        Object postBody = ZVal.assignParameter(args, 1, null);
        Object optParams = ZVal.assignParameter(args, 2, null);
        if (ZVal.isNull(optParams)) {
            optParams = ZVal.newArray();
        }
        Object data = null;
        Object params = null;
        params = ZVal.newArray(new ZPair("projectId", projectId), new ZPair("postBody", postBody));
        params = CRArrayF.array_merge.call(env, params, optParams);
        data =
                env.callMethod(
                        this,
                        "__call",
                        Google_JobsServiceResource.class,
                        "query",
                        ZVal.newArray(new ZPair(0, params)));
        if (ZVal.isTrue(env.callMethod(this, "useObjects", Google_JobsServiceResource.class))) {
            return ZVal.assign(new Google_QueryResponse(env, data));

        } else {
            return ZVal.assign(data);
        }
    }

    public Object listJobs(RuntimeEnv env, Object... args) {
        Object projectId = ZVal.assignParameter(args, 0, null);
        Object optParams = ZVal.assignParameter(args, 1, null);
        if (ZVal.isNull(optParams)) {
            optParams = ZVal.newArray();
        }
        Object data = null;
        Object params = null;
        params = ZVal.newArray(new ZPair("projectId", projectId));
        params = CRArrayF.array_merge.call(env, params, optParams);
        data =
                env.callMethod(
                        this,
                        "__call",
                        Google_JobsServiceResource.class,
                        "list",
                        ZVal.newArray(new ZPair(0, params)));
        if (ZVal.isTrue(env.callMethod(this, "useObjects", Google_JobsServiceResource.class))) {
            return ZVal.assign(new Google_JobList(env, data));

        } else {
            return ZVal.assign(data);
        }
    }

    public Object getQueryResults(RuntimeEnv env, Object... args) {
        Object projectId = ZVal.assignParameter(args, 0, null);
        Object jobId = ZVal.assignParameter(args, 1, null);
        Object optParams = ZVal.assignParameter(args, 2, null);
        if (ZVal.isNull(optParams)) {
            optParams = ZVal.newArray();
        }
        Object data = null;
        Object params = null;
        params = ZVal.newArray(new ZPair("projectId", projectId), new ZPair("jobId", jobId));
        params = CRArrayF.array_merge.call(env, params, optParams);
        data =
                env.callMethod(
                        this,
                        "__call",
                        Google_JobsServiceResource.class,
                        "getQueryResults",
                        ZVal.newArray(new ZPair(0, params)));
        if (ZVal.isTrue(env.callMethod(this, "useObjects", Google_JobsServiceResource.class))) {
            return ZVal.assign(new Google_GetQueryResultsResponse(env, data));

        } else {
            return ZVal.assign(data);
        }
    }

    public Object get(RuntimeEnv env, Object... args) {
        Object projectId = ZVal.assignParameter(args, 0, null);
        Object jobId = ZVal.assignParameter(args, 1, null);
        Object optParams = ZVal.assignParameter(args, 2, null);
        if (ZVal.isNull(optParams)) {
            optParams = ZVal.newArray();
        }
        Object data = null;
        Object params = null;
        params = ZVal.newArray(new ZPair("projectId", projectId), new ZPair("jobId", jobId));
        params = CRArrayF.array_merge.call(env, params, optParams);
        data =
                env.callMethod(
                        this,
                        "__call",
                        Google_JobsServiceResource.class,
                        "get",
                        ZVal.newArray(new ZPair(0, params)));
        if (ZVal.isTrue(env.callMethod(this, "useObjects", Google_JobsServiceResource.class))) {
            return ZVal.assign(new Google_Job(env, data));

        } else {
            return ZVal.assign(data);
        }
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
