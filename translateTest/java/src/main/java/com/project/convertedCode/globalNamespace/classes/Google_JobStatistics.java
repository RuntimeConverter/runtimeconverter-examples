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

public class Google_JobStatistics extends Google_Model implements RuntimeFileContextInterface {

    public Object endTime = null;

    public Object totalBytesProcessed = null;

    public Object startTime = null;

    public Google_JobStatistics(RuntimeEnv env, Object... args) {
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
            case "setEndTime":
                return this.setEndTime(env, args);
            case "getEndTime":
                return this.getEndTime(env, args);
            case "setTotalBytesProcessed":
                return this.setTotalBytesProcessed(env, args);
            case "getTotalBytesProcessed":
                return this.getTotalBytesProcessed(env, args);
            case "setStartTime":
                return this.setStartTime(env, args);
            case "getStartTime":
                return this.getStartTime(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "endTime":
                return this.endTime;
            case "totalBytesProcessed":
                return this.totalBytesProcessed;
            case "startTime":
                return this.startTime;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "endTime":
                return ZVal.isNull(this.endTime);
            case "totalBytesProcessed":
                return ZVal.isNull(this.totalBytesProcessed);
            case "startTime":
                return ZVal.isNull(this.startTime);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "endTime":
                this.endTime = value;
                break;
            case "totalBytesProcessed":
                this.totalBytesProcessed = value;
                break;
            case "startTime":
                this.startTime = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setEndTime(RuntimeEnv env, Object... args) {
        Object endTime = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_JobStatistics.class, "endTime", endTime);

        return null;
    }

    public Object getEndTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_JobStatistics.class, "endTime"));
    }

    public Object setTotalBytesProcessed(RuntimeEnv env, Object... args) {
        Object totalBytesProcessed = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_JobStatistics.class, "totalBytesProcessed", totalBytesProcessed);

        return null;
    }

    public Object getTotalBytesProcessed(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_JobStatistics.class, "totalBytesProcessed"));
    }

    public Object setStartTime(RuntimeEnv env, Object... args) {
        Object startTime = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_JobStatistics.class, "startTime", startTime);

        return null;
    }

    public Object getStartTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_JobStatistics.class, "startTime"));
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
