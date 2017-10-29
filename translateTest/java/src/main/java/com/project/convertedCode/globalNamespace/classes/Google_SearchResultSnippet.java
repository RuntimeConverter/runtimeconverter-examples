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

public class Google_SearchResultSnippet extends Google_Model
        implements RuntimeFileContextInterface {

    public Object channelId = null;

    public Object description = null;

    public Object publishedAt = null;

    public Object title = null;

    public Google_SearchResultSnippet(RuntimeEnv env, Object... args) {
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
            case "setChannelId":
                return this.setChannelId(env, args);
            case "getChannelId":
                return this.getChannelId(env, args);
            case "setDescription":
                return this.setDescription(env, args);
            case "getDescription":
                return this.getDescription(env, args);
            case "setPublishedAt":
                return this.setPublishedAt(env, args);
            case "getPublishedAt":
                return this.getPublishedAt(env, args);
            case "setTitle":
                return this.setTitle(env, args);
            case "getTitle":
                return this.getTitle(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "channelId":
                return this.channelId;
            case "description":
                return this.description;
            case "publishedAt":
                return this.publishedAt;
            case "title":
                return this.title;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "channelId":
                return ZVal.isNull(this.channelId);
            case "description":
                return ZVal.isNull(this.description);
            case "publishedAt":
                return ZVal.isNull(this.publishedAt);
            case "title":
                return ZVal.isNull(this.title);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "channelId":
                this.channelId = value;
                break;
            case "description":
                this.description = value;
                break;
            case "publishedAt":
                this.publishedAt = value;
                break;
            case "title":
                this.title = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setChannelId(RuntimeEnv env, Object... args) {
        Object channelId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_SearchResultSnippet.class, "channelId", channelId);

        return null;
    }

    public Object getChannelId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_SearchResultSnippet.class, "channelId"));
    }

    public Object setDescription(RuntimeEnv env, Object... args) {
        Object description = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_SearchResultSnippet.class, "description", description);

        return null;
    }

    public Object getDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_SearchResultSnippet.class, "description"));
    }

    public Object setPublishedAt(RuntimeEnv env, Object... args) {
        Object publishedAt = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_SearchResultSnippet.class, "publishedAt", publishedAt);

        return null;
    }

    public Object getPublishedAt(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_SearchResultSnippet.class, "publishedAt"));
    }

    public Object setTitle(RuntimeEnv env, Object... args) {
        Object title = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_SearchResultSnippet.class, "title", title);

        return null;
    }

    public Object getTitle(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_SearchResultSnippet.class, "title"));
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
