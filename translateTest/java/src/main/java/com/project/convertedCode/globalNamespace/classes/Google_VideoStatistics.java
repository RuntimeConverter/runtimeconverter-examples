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

public class Google_VideoStatistics extends Google_Model implements RuntimeFileContextInterface {

    public Object commentCount = null;

    public Object viewCount = null;

    public Object favoriteCount = null;

    public Object dislikeCount = null;

    public Object likeCount = null;

    public Google_VideoStatistics(RuntimeEnv env, Object... args) {
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
            case "setViewCount":
                return this.setViewCount(env, args);
            case "getViewCount":
                return this.getViewCount(env, args);
            case "setFavoriteCount":
                return this.setFavoriteCount(env, args);
            case "getFavoriteCount":
                return this.getFavoriteCount(env, args);
            case "setDislikeCount":
                return this.setDislikeCount(env, args);
            case "getDislikeCount":
                return this.getDislikeCount(env, args);
            case "setLikeCount":
                return this.setLikeCount(env, args);
            case "getLikeCount":
                return this.getLikeCount(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "commentCount":
                return this.commentCount;
            case "viewCount":
                return this.viewCount;
            case "favoriteCount":
                return this.favoriteCount;
            case "dislikeCount":
                return this.dislikeCount;
            case "likeCount":
                return this.likeCount;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "commentCount":
                return ZVal.isNull(this.commentCount);
            case "viewCount":
                return ZVal.isNull(this.viewCount);
            case "favoriteCount":
                return ZVal.isNull(this.favoriteCount);
            case "dislikeCount":
                return ZVal.isNull(this.dislikeCount);
            case "likeCount":
                return ZVal.isNull(this.likeCount);
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
            case "viewCount":
                this.viewCount = value;
                break;
            case "favoriteCount":
                this.favoriteCount = value;
                break;
            case "dislikeCount":
                this.dislikeCount = value;
                break;
            case "likeCount":
                this.likeCount = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setCommentCount(RuntimeEnv env, Object... args) {
        Object commentCount = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VideoStatistics.class, "commentCount", commentCount);

        return null;
    }

    public Object getCommentCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VideoStatistics.class, "commentCount"));
    }

    public Object setViewCount(RuntimeEnv env, Object... args) {
        Object viewCount = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VideoStatistics.class, "viewCount", viewCount);

        return null;
    }

    public Object getViewCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VideoStatistics.class, "viewCount"));
    }

    public Object setFavoriteCount(RuntimeEnv env, Object... args) {
        Object favoriteCount = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VideoStatistics.class, "favoriteCount", favoriteCount);

        return null;
    }

    public Object getFavoriteCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VideoStatistics.class, "favoriteCount"));
    }

    public Object setDislikeCount(RuntimeEnv env, Object... args) {
        Object dislikeCount = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VideoStatistics.class, "dislikeCount", dislikeCount);

        return null;
    }

    public Object getDislikeCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VideoStatistics.class, "dislikeCount"));
    }

    public Object setLikeCount(RuntimeEnv env, Object... args) {
        Object likeCount = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VideoStatistics.class, "likeCount", likeCount);

        return null;
    }

    public Object getLikeCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VideoStatistics.class, "likeCount"));
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
