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

 google-api-php-client/src/contrib/Google_AnalyticsService.php

*/

public class Google_McfDataQuery extends Google_Model implements RuntimeFileContextInterface {

    public Object max_results = null;

    public Object sort = null;

    public Object dimensions = null;

    public Object start_date = null;

    public Object start_index = null;

    public Object segment = null;

    public Object ids = null;

    public Object metrics = null;

    public Object filters = null;

    public Object end_date = null;

    public Google_McfDataQuery(RuntimeEnv env, Object... args) {
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
            case "setMax_results":
                return this.setMax_results(env, args);
            case "getMax_results":
                return this.getMax_results(env, args);
            case "setSort":
                return this.setSort(env, args);
            case "getSort":
                return this.getSort(env, args);
            case "setDimensions":
                return this.setDimensions(env, args);
            case "getDimensions":
                return this.getDimensions(env, args);
            case "setStart_date":
                return this.setStart_date(env, args);
            case "getStart_date":
                return this.getStart_date(env, args);
            case "setStart_index":
                return this.setStart_index(env, args);
            case "getStart_index":
                return this.getStart_index(env, args);
            case "setSegment":
                return this.setSegment(env, args);
            case "getSegment":
                return this.getSegment(env, args);
            case "setIds":
                return this.setIds(env, args);
            case "getIds":
                return this.getIds(env, args);
            case "setMetrics":
                return this.setMetrics(env, args);
            case "getMetrics":
                return this.getMetrics(env, args);
            case "setFilters":
                return this.setFilters(env, args);
            case "getFilters":
                return this.getFilters(env, args);
            case "setEnd_date":
                return this.setEnd_date(env, args);
            case "getEnd_date":
                return this.getEnd_date(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "max_results":
                return this.max_results;
            case "sort":
                return this.sort;
            case "dimensions":
                return this.dimensions;
            case "start_date":
                return this.start_date;
            case "start_index":
                return this.start_index;
            case "segment":
                return this.segment;
            case "ids":
                return this.ids;
            case "metrics":
                return this.metrics;
            case "filters":
                return this.filters;
            case "end_date":
                return this.end_date;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "max_results":
                return ZVal.isNull(this.max_results);
            case "sort":
                return ZVal.isNull(this.sort);
            case "dimensions":
                return ZVal.isNull(this.dimensions);
            case "start_date":
                return ZVal.isNull(this.start_date);
            case "start_index":
                return ZVal.isNull(this.start_index);
            case "segment":
                return ZVal.isNull(this.segment);
            case "ids":
                return ZVal.isNull(this.ids);
            case "metrics":
                return ZVal.isNull(this.metrics);
            case "filters":
                return ZVal.isNull(this.filters);
            case "end_date":
                return ZVal.isNull(this.end_date);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "max_results":
                this.max_results = value;
                break;
            case "sort":
                this.sort = value;
                break;
            case "dimensions":
                this.dimensions = value;
                break;
            case "start_date":
                this.start_date = value;
                break;
            case "start_index":
                this.start_index = value;
                break;
            case "segment":
                this.segment = value;
                break;
            case "ids":
                this.ids = value;
                break;
            case "metrics":
                this.metrics = value;
                break;
            case "filters":
                this.filters = value;
                break;
            case "end_date":
                this.end_date = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setMax_results(RuntimeEnv env, Object... args) {
        Object max_results = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_McfDataQuery.class, "max_results", max_results);

        return null;
    }

    public Object getMax_results(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_McfDataQuery.class, "max_results"));
    }

    public Object setSort(RuntimeEnv env, Object... args) {
        Object sort = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this, "assertIsArray", Google_McfDataQuery.class, sort, "Google_string", "setSort");
        ZVal.setProperty(this, Google_McfDataQuery.class, "sort", sort);

        return null;
    }

    public Object getSort(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_McfDataQuery.class, "sort"));
    }

    public Object setDimensions(RuntimeEnv env, Object... args) {
        Object dimensions = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_McfDataQuery.class, "dimensions", dimensions);

        return null;
    }

    public Object getDimensions(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_McfDataQuery.class, "dimensions"));
    }

    public Object setStart_date(RuntimeEnv env, Object... args) {
        Object start_date = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_McfDataQuery.class, "start_date", start_date);

        return null;
    }

    public Object getStart_date(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_McfDataQuery.class, "start_date"));
    }

    public Object setStart_index(RuntimeEnv env, Object... args) {
        Object start_index = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_McfDataQuery.class, "start_index", start_index);

        return null;
    }

    public Object getStart_index(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_McfDataQuery.class, "start_index"));
    }

    public Object setSegment(RuntimeEnv env, Object... args) {
        Object segment = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_McfDataQuery.class, "segment", segment);

        return null;
    }

    public Object getSegment(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_McfDataQuery.class, "segment"));
    }

    public Object setIds(RuntimeEnv env, Object... args) {
        Object ids = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_McfDataQuery.class, "ids", ids);

        return null;
    }

    public Object getIds(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_McfDataQuery.class, "ids"));
    }

    public Object setMetrics(RuntimeEnv env, Object... args) {
        Object metrics = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_McfDataQuery.class,
                metrics,
                "Google_string",
                "setMetrics");
        ZVal.setProperty(this, Google_McfDataQuery.class, "metrics", metrics);

        return null;
    }

    public Object getMetrics(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_McfDataQuery.class, "metrics"));
    }

    public Object setFilters(RuntimeEnv env, Object... args) {
        Object filters = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_McfDataQuery.class, "filters", filters);

        return null;
    }

    public Object getFilters(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_McfDataQuery.class, "filters"));
    }

    public Object setEnd_date(RuntimeEnv env, Object... args) {
        Object end_date = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_McfDataQuery.class, "end_date", end_date);

        return null;
    }

    public Object getEnd_date(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_McfDataQuery.class, "end_date"));
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
