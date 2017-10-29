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

 google-api-php-client/src/contrib/Google_YoutubeService.php

*/

public class Google_ChannelStatistics extends Google_Model implements RuntimeFileContextInterface {

    public Object commentCount = null;

    public Object subscriberCount = null;

    public Object videoCount = null;

    public Object viewCount = null;

    public Google_ChannelStatistics(RuntimeEnv env, Object... args) {
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
            case "setCommentCount":
                return this.setCommentCount(env, args);
            case "getCommentCount":
                return this.getCommentCount(env, args);
            case "setSubscriberCount":
                return this.setSubscriberCount(env, args);
            case "getSubscriberCount":
                return this.getSubscriberCount(env, args);
            case "setVideoCount":
                return this.setVideoCount(env, args);
            case "getVideoCount":
                return this.getVideoCount(env, args);
            case "setViewCount":
                return this.setViewCount(env, args);
            case "getViewCount":
                return this.getViewCount(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "commentCount":
                return this.commentCount;
            case "subscriberCount":
                return this.subscriberCount;
            case "videoCount":
                return this.videoCount;
            case "viewCount":
                return this.viewCount;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "commentCount":
                return ZVal.isNull(this.commentCount);
            case "subscriberCount":
                return ZVal.isNull(this.subscriberCount);
            case "videoCount":
                return ZVal.isNull(this.videoCount);
            case "viewCount":
                return ZVal.isNull(this.viewCount);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "commentCount":
                this.commentCount = value;
                break;
            case "subscriberCount":
                this.subscriberCount = value;
                break;
            case "videoCount":
                this.videoCount = value;
                break;
            case "viewCount":
                this.viewCount = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setCommentCount(RuntimeEnv env, Object... args) {
        Object commentCount = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ChannelStatistics.class, "commentCount", commentCount);

        return null;
    }

    public Object getCommentCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ChannelStatistics.class, "commentCount"));
    }

    public Object setSubscriberCount(RuntimeEnv env, Object... args) {
        Object subscriberCount = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ChannelStatistics.class, "subscriberCount", subscriberCount);

        return null;
    }

    public Object getSubscriberCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ChannelStatistics.class, "subscriberCount"));
    }

    public Object setVideoCount(RuntimeEnv env, Object... args) {
        Object videoCount = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ChannelStatistics.class, "videoCount", videoCount);

        return null;
    }

    public Object getVideoCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ChannelStatistics.class, "videoCount"));
    }

    public Object setViewCount(RuntimeEnv env, Object... args) {
        Object viewCount = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ChannelStatistics.class, "viewCount", viewCount);

        return null;
    }

    public Object getViewCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ChannelStatistics.class, "viewCount"));
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
