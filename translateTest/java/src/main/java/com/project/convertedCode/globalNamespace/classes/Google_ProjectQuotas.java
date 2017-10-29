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

 google-api-php-client/src/contrib/Google_ComputeService.php

*/

public class Google_ProjectQuotas extends Google_Model implements RuntimeFileContextInterface {

    public Object usage = null;

    public Object metric = null;

    public Object limit = null;

    public Google_ProjectQuotas(RuntimeEnv env, Object... args) {
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
            case "setUsage":
                return this.setUsage(env, args);
            case "getUsage":
                return this.getUsage(env, args);
            case "setMetric":
                return this.setMetric(env, args);
            case "getMetric":
                return this.getMetric(env, args);
            case "setLimit":
                return this.setLimit(env, args);
            case "getLimit":
                return this.getLimit(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "usage":
                return this.usage;
            case "metric":
                return this.metric;
            case "limit":
                return this.limit;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "usage":
                return ZVal.isNull(this.usage);
            case "metric":
                return ZVal.isNull(this.metric);
            case "limit":
                return ZVal.isNull(this.limit);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "usage":
                this.usage = value;
                break;
            case "metric":
                this.metric = value;
                break;
            case "limit":
                this.limit = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setUsage(RuntimeEnv env, Object... args) {
        Object usage = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ProjectQuotas.class, "usage", usage);

        return null;
    }

    public Object getUsage(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ProjectQuotas.class, "usage"));
    }

    public Object setMetric(RuntimeEnv env, Object... args) {
        Object metric = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ProjectQuotas.class, "metric", metric);

        return null;
    }

    public Object getMetric(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ProjectQuotas.class, "metric"));
    }

    public Object setLimit(RuntimeEnv env, Object... args) {
        Object limit = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ProjectQuotas.class, "limit", limit);

        return null;
    }

    public Object getLimit(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ProjectQuotas.class, "limit"));
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
