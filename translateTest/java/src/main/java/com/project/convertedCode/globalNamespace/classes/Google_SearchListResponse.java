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

public class Google_SearchListResponse extends Google_Model implements RuntimeFileContextInterface {

    public Object __searchResultsType = "Google_SearchResult";

    public Object __searchResultsDataType = "array";

    public Object searchResults = null;

    public Object kind = null;

    public Object etag = null;

    public Object __pageInfoType = "Google_PageInfo";

    public Object __pageInfoDataType = "";

    public Object pageInfo = null;

    public Google_SearchListResponse(RuntimeEnv env, Object... args) {
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
            case "setSearchResults":
                return this.setSearchResults(env, args);
            case "getSearchResults":
                return this.getSearchResults(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setEtag":
                return this.setEtag(env, args);
            case "getEtag":
                return this.getEtag(env, args);
            case "setPageInfo":
                return this.setPageInfo(env, args);
            case "getPageInfo":
                return this.getPageInfo(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__searchResultsType":
                if (Google_SearchListResponse.class.isAssignableFrom(caller)) {

                    return this.__searchResultsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__searchResultsDataType":
                if (Google_SearchListResponse.class.isAssignableFrom(caller)) {

                    return this.__searchResultsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "searchResults":
                return this.searchResults;
            case "kind":
                return this.kind;
            case "etag":
                return this.etag;
            case "__pageInfoType":
                if (Google_SearchListResponse.class.isAssignableFrom(caller)) {

                    return this.__pageInfoType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__pageInfoDataType":
                if (Google_SearchListResponse.class.isAssignableFrom(caller)) {

                    return this.__pageInfoDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "pageInfo":
                return this.pageInfo;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__searchResultsType":
                if (Google_SearchListResponse.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__searchResultsType);
                }
                break;
            case "__searchResultsDataType":
                if (Google_SearchListResponse.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__searchResultsDataType);
                }
                break;
            case "searchResults":
                return ZVal.isNull(this.searchResults);
            case "kind":
                return ZVal.isNull(this.kind);
            case "etag":
                return ZVal.isNull(this.etag);
            case "__pageInfoType":
                if (Google_SearchListResponse.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__pageInfoType);
                }
                break;
            case "__pageInfoDataType":
                if (Google_SearchListResponse.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__pageInfoDataType);
                }
                break;
            case "pageInfo":
                return ZVal.isNull(this.pageInfo);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__searchResultsType":
                if (Google_SearchListResponse.class.isAssignableFrom(caller)) {

                    this.__searchResultsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__searchResultsDataType":
                if (Google_SearchListResponse.class.isAssignableFrom(caller)) {

                    this.__searchResultsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "searchResults":
                this.searchResults = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "etag":
                this.etag = value;
                break;
            case "__pageInfoType":
                if (Google_SearchListResponse.class.isAssignableFrom(caller)) {

                    this.__pageInfoType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__pageInfoDataType":
                if (Google_SearchListResponse.class.isAssignableFrom(caller)) {

                    this.__pageInfoDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "pageInfo":
                this.pageInfo = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setSearchResults(RuntimeEnv env, Object... args) {
        Object searchResults = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_SearchListResponse.class,
                searchResults,
                "Google_SearchResult",
                "setSearchResults");
        ZVal.setProperty(this, Google_SearchListResponse.class, "searchResults", searchResults);

        return null;
    }

    public Object getSearchResults(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_SearchListResponse.class, "searchResults"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_SearchListResponse.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_SearchListResponse.class, "kind"));
    }

    public Object setEtag(RuntimeEnv env, Object... args) {
        Object etag = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_SearchListResponse.class, "etag", etag);

        return null;
    }

    public Object getEtag(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_SearchListResponse.class, "etag"));
    }

    public Object setPageInfo(RuntimeEnv env, Object... args) {
        Object pageInfo = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_SearchListResponse.class, "pageInfo", pageInfo);

        return null;
    }

    public Object getPageInfo(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_SearchListResponse.class, "pageInfo"));
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
