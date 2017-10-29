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

public class Google_TopicId extends Google_Model implements RuntimeFileContextInterface {

    public Object seriesId = null;

    public Object topicId = null;

    public Google_TopicId(RuntimeEnv env, Object... args) {
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
            case "setTopicId":
                return this.setTopicId(env, args);
            case "getTopicId":
                return this.getTopicId(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "seriesId":
                return this.seriesId;
            case "topicId":
                return this.topicId;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "seriesId":
                return ZVal.isNull(this.seriesId);
            case "topicId":
                return ZVal.isNull(this.topicId);
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
            case "topicId":
                this.topicId = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setSeriesId(RuntimeEnv env, Object... args) {
        Object seriesId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_TopicId.class, "seriesId", seriesId);

        return null;
    }

    public Object getSeriesId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_TopicId.class, "seriesId"));
    }

    public Object setTopicId(RuntimeEnv env, Object... args) {
        Object topicId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_TopicId.class, "topicId", topicId);

        return null;
    }

    public Object getTopicId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_TopicId.class, "topicId"));
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
