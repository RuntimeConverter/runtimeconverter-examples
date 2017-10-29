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

 google-api-php-client/src/contrib/Google_BooksService.php

*/

public class Google_BooksLayerGeoDataCommon extends Google_Model
        implements RuntimeFileContextInterface {

    public Object lang = null;

    public Object previewImageUrl = null;

    public Object snippet = null;

    public Object snippetUrl = null;

    public Google_BooksLayerGeoDataCommon(RuntimeEnv env, Object... args) {
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
            case "setLang":
                return this.setLang(env, args);
            case "getLang":
                return this.getLang(env, args);
            case "setPreviewImageUrl":
                return this.setPreviewImageUrl(env, args);
            case "getPreviewImageUrl":
                return this.getPreviewImageUrl(env, args);
            case "setSnippet":
                return this.setSnippet(env, args);
            case "getSnippet":
                return this.getSnippet(env, args);
            case "setSnippetUrl":
                return this.setSnippetUrl(env, args);
            case "getSnippetUrl":
                return this.getSnippetUrl(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "lang":
                return this.lang;
            case "previewImageUrl":
                return this.previewImageUrl;
            case "snippet":
                return this.snippet;
            case "snippetUrl":
                return this.snippetUrl;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "lang":
                return ZVal.isNull(this.lang);
            case "previewImageUrl":
                return ZVal.isNull(this.previewImageUrl);
            case "snippet":
                return ZVal.isNull(this.snippet);
            case "snippetUrl":
                return ZVal.isNull(this.snippetUrl);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "lang":
                this.lang = value;
                break;
            case "previewImageUrl":
                this.previewImageUrl = value;
                break;
            case "snippet":
                this.snippet = value;
                break;
            case "snippetUrl":
                this.snippetUrl = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setLang(RuntimeEnv env, Object... args) {
        Object lang = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_BooksLayerGeoDataCommon.class, "lang", lang);

        return null;
    }

    public Object getLang(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_BooksLayerGeoDataCommon.class, "lang"));
    }

    public Object setPreviewImageUrl(RuntimeEnv env, Object... args) {
        Object previewImageUrl = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_BooksLayerGeoDataCommon.class, "previewImageUrl", previewImageUrl);

        return null;
    }

    public Object getPreviewImageUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_BooksLayerGeoDataCommon.class, "previewImageUrl"));
    }

    public Object setSnippet(RuntimeEnv env, Object... args) {
        Object snippet = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_BooksLayerGeoDataCommon.class, "snippet", snippet);

        return null;
    }

    public Object getSnippet(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_BooksLayerGeoDataCommon.class, "snippet"));
    }

    public Object setSnippetUrl(RuntimeEnv env, Object... args) {
        Object snippetUrl = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_BooksLayerGeoDataCommon.class, "snippetUrl", snippetUrl);

        return null;
    }

    public Object getSnippetUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_BooksLayerGeoDataCommon.class, "snippetUrl"));
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
