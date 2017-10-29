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

 google-api-php-client/src/contrib/Google_ModeratorService.php

*/

public class Google_VoteId extends Google_Model implements RuntimeFileContextInterface {

    public Object seriesId = null;

    public Object submissionId = null;

    public Google_VoteId(RuntimeEnv env, Object... args) {
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
            case "setSeriesId":
                return this.setSeriesId(env, args);
            case "getSeriesId":
                return this.getSeriesId(env, args);
            case "setSubmissionId":
                return this.setSubmissionId(env, args);
            case "getSubmissionId":
                return this.getSubmissionId(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "seriesId":
                return this.seriesId;
            case "submissionId":
                return this.submissionId;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "seriesId":
                return ZVal.isNull(this.seriesId);
            case "submissionId":
                return ZVal.isNull(this.submissionId);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "seriesId":
                this.seriesId = value;
                break;
            case "submissionId":
                this.submissionId = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setSeriesId(RuntimeEnv env, Object... args) {
        Object seriesId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VoteId.class, "seriesId", seriesId);

        return null;
    }

    public Object getSeriesId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VoteId.class, "seriesId"));
    }

    public Object setSubmissionId(RuntimeEnv env, Object... args) {
        Object submissionId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VoteId.class, "submissionId", submissionId);

        return null;
    }

    public Object getSubmissionId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VoteId.class, "submissionId"));
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
