package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.project.convertedCode.globalNamespace.classes.Google_Utils;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.modules.standard.other.function_parse_str;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/io/Google_HttpRequest.php

*/

public class Google_HttpRequest extends RuntimeClassBase implements RuntimeFileContextInterface {

    public Object batchHeaders =
            ZVal.newArray(
                    new ZPair("Content-Type", "application/http"),
                    new ZPair("Content-Transfer-Encoding", "binary"),
                    new ZPair("MIME-Version", "1.0"),
                    new ZPair("Content-Length", ""));

    public Object url = null;

    public Object requestMethod = null;

    public Object requestHeaders = null;

    public Object postBody = null;

    public Object userAgent = null;

    public Object responseHttpCode = null;

    public Object responseHeaders = null;

    public Object responseBody = null;

    public Object accessKey = null;

    public Google_HttpRequest(RuntimeEnv env, Object... args) {
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
            case "getBaseUrl":
                return this.getBaseUrl(env, args);
            case "getQueryParams":
                return this.getQueryParams(env, args);
            case "getResponseHttpCode":
                return this.getResponseHttpCode(env, args);
            case "setResponseHttpCode":
                return this.setResponseHttpCode(env, args);
            case "getResponseHeaders":
                return this.getResponseHeaders(env, args);
            case "getResponseBody":
                return this.getResponseBody(env, args);
            case "setResponseHeaders":
                return this.setResponseHeaders(env, args);
            case "getResponseHeader":
                return this.getResponseHeader(env, args);
            case "setResponseBody":
                return this.setResponseBody(env, args);
            case "getUrl":
                return this.getUrl(env, args);
            case "getRequestMethod":
                return this.getRequestMethod(env, args);
            case "getRequestHeaders":
                return this.getRequestHeaders(env, args);
            case "getRequestHeader":
                return this.getRequestHeader(env, args);
            case "getPostBody":
                return this.getPostBody(env, args);
            case "setUrl":
                return this.setUrl(env, args);
            case "setRequestMethod":
                return this.setRequestMethod(env, args);
            case "setRequestHeaders":
                return this.setRequestHeaders(env, args);
            case "setPostBody":
                return this.setPostBody(env, args);
            case "setUserAgent":
                return this.setUserAgent(env, args);
            case "getUserAgent":
                return this.getUserAgent(env, args);
            case "getCacheKey":
                return this.getCacheKey(env, args);
            case "getParsedCacheControl":
                return this.getParsedCacheControl(env, args);
            case "toBatchString":
                return this.toBatchString(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "batchHeaders":
                if (Google_HttpRequest.class.equals(caller)) {

                    return this.batchHeaders;
                }
                return this.__phpMagicMethod__isset(key);
            case "url":
                if (Google_HttpRequest.class.isAssignableFrom(caller)) {

                    return this.url;
                }
                return this.__phpMagicMethod__isset(key);
            case "requestMethod":
                if (Google_HttpRequest.class.isAssignableFrom(caller)) {

                    return this.requestMethod;
                }
                return this.__phpMagicMethod__isset(key);
            case "requestHeaders":
                if (Google_HttpRequest.class.isAssignableFrom(caller)) {

                    return this.requestHeaders;
                }
                return this.__phpMagicMethod__isset(key);
            case "postBody":
                if (Google_HttpRequest.class.isAssignableFrom(caller)) {

                    return this.postBody;
                }
                return this.__phpMagicMethod__isset(key);
            case "userAgent":
                if (Google_HttpRequest.class.isAssignableFrom(caller)) {

                    return this.userAgent;
                }
                return this.__phpMagicMethod__isset(key);
            case "responseHttpCode":
                if (Google_HttpRequest.class.isAssignableFrom(caller)) {

                    return this.responseHttpCode;
                }
                return this.__phpMagicMethod__isset(key);
            case "responseHeaders":
                if (Google_HttpRequest.class.isAssignableFrom(caller)) {

                    return this.responseHeaders;
                }
                return this.__phpMagicMethod__isset(key);
            case "responseBody":
                if (Google_HttpRequest.class.isAssignableFrom(caller)) {

                    return this.responseBody;
                }
                return this.__phpMagicMethod__isset(key);
            case "accessKey":
                return this.accessKey;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "batchHeaders":
                if (Google_HttpRequest.class.equals(caller)) {

                    return ZVal.isNull(this.batchHeaders);
                }
                break;
            case "url":
                if (Google_HttpRequest.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.url);
                }
                break;
            case "requestMethod":
                if (Google_HttpRequest.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.requestMethod);
                }
                break;
            case "requestHeaders":
                if (Google_HttpRequest.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.requestHeaders);
                }
                break;
            case "postBody":
                if (Google_HttpRequest.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.postBody);
                }
                break;
            case "userAgent":
                if (Google_HttpRequest.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.userAgent);
                }
                break;
            case "responseHttpCode":
                if (Google_HttpRequest.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.responseHttpCode);
                }
                break;
            case "responseHeaders":
                if (Google_HttpRequest.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.responseHeaders);
                }
                break;
            case "responseBody":
                if (Google_HttpRequest.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.responseBody);
                }
                break;
            case "accessKey":
                return ZVal.isNull(this.accessKey);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "batchHeaders":
                if (Google_HttpRequest.class.equals(caller)) {

                    this.batchHeaders = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "url":
                if (Google_HttpRequest.class.isAssignableFrom(caller)) {

                    this.url = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "requestMethod":
                if (Google_HttpRequest.class.isAssignableFrom(caller)) {

                    this.requestMethod = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "requestHeaders":
                if (Google_HttpRequest.class.isAssignableFrom(caller)) {

                    this.requestHeaders = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "postBody":
                if (Google_HttpRequest.class.isAssignableFrom(caller)) {

                    this.postBody = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "userAgent":
                if (Google_HttpRequest.class.isAssignableFrom(caller)) {

                    this.userAgent = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "responseHttpCode":
                if (Google_HttpRequest.class.isAssignableFrom(caller)) {

                    this.responseHttpCode = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "responseHeaders":
                if (Google_HttpRequest.class.isAssignableFrom(caller)) {

                    this.responseHeaders = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "responseBody":
                if (Google_HttpRequest.class.isAssignableFrom(caller)) {

                    this.responseBody = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "accessKey":
                this.accessKey = value;
                break;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object url = ZVal.assignParameter(args, 0, null);
        Object method = ZVal.assignParameter(args, 1, null);
        if (ZVal.isNull(method)) {
            method = "GET";
        }
        Object headers = ZVal.assignParameter(args, 2, null);
        if (ZVal.isNull(headers)) {
            headers = ZVal.newArray();
        }
        Object postBody = ZVal.assignParameter(args, 3, null);
        if (ZVal.isNull(postBody)) {
            postBody = ZVal.getNull();
        }
        Object apiConfig = env.getGlobal("apiConfig");
        ;
        env.callMethod(this, "setUrl", Google_HttpRequest.class, url);
        env.callMethod(this, "setRequestMethod", Google_HttpRequest.class, method);
        env.callMethod(this, "setRequestHeaders", Google_HttpRequest.class, headers);
        env.callMethod(this, "setPostBody", Google_HttpRequest.class, postBody);

        if (ZVal.isEmpty(ZVal.getElement(apiConfig, "application_name"))) {
            ZVal.setProperty(this, Google_HttpRequest.class, "userAgent", CONST_USER_AGENT_SUFFIX);

        } else {
            ZVal.setProperty(
                    this,
                    Google_HttpRequest.class,
                    "userAgent",
                    ZVal.toString(
                                    ZVal.toString(ZVal.getElement(apiConfig, "application_name"))
                                            + " ")
                            + ZVal.toString(CONST_USER_AGENT_SUFFIX));
        }

        return env.returnWithGlobals(null, "apiConfig", apiConfig);
    }

    public Object getBaseUrl(RuntimeEnv env, Object... args) {
        Object pos = null;
        if (ZVal.isTrue(
                pos =
                        NamespaceGlobal.strpos.call(
                                env,
                                ZVal.getProperty(this, Google_HttpRequest.class, "url"),
                                "?"))) {
            return ZVal.assign(
                    NamespaceGlobal.substr.call(
                            env, ZVal.getProperty(this, Google_HttpRequest.class, "url"), 0, pos));
        }

        return ZVal.assign(ZVal.getProperty(this, Google_HttpRequest.class, "url"));
    }

    public Object getQueryParams(RuntimeEnv env, Object... args) {
        Object pos = null;
        Object params = null;
        Object queryStr = null;
        if (ZVal.isTrue(
                pos =
                        NamespaceGlobal.strpos.call(
                                env,
                                ZVal.getProperty(this, Google_HttpRequest.class, "url"),
                                "?"))) {
            queryStr =
                    NamespaceGlobal.substr.call(
                            env,
                            ZVal.getProperty(this, Google_HttpRequest.class, "url"),
                            ZVal.add(pos, 1));
            params = ZVal.newArray();
            function_parse_str.f.call(env, queryStr, params);
            return ZVal.assign(params);
        }

        return ZVal.assign(ZVal.newArray());
    }

    public Object getResponseHttpCode(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_HttpRequest.class, "responseHttpCode"));
    }

    public Object setResponseHttpCode(RuntimeEnv env, Object... args) {
        Object responseHttpCode = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_HttpRequest.class, "responseHttpCode", responseHttpCode);

        return null;
    }

    public Object getResponseHeaders(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_HttpRequest.class, "responseHeaders"));
    }

    public Object getResponseBody(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_HttpRequest.class, "responseBody"));
    }

    public Object setResponseHeaders(RuntimeEnv env, Object... args) {
        Object headers = ZVal.assignParameter(args, 0, null);
        headers = Google_Utils.normalize(env, headers);
        if (ZVal.isTrue(ZVal.getProperty(this, Google_HttpRequest.class, "responseHeaders"))) {
            headers =
                    CRArrayF.array_merge.call(
                            env,
                            ZVal.getProperty(this, Google_HttpRequest.class, "responseHeaders"),
                            headers);
        }

        ZVal.setProperty(this, Google_HttpRequest.class, "responseHeaders", headers);

        return null;
    }

    public Object getResponseHeader(RuntimeEnv env, Object... args) {
        Object key = ZVal.assignParameter(args, 0, null);
        return ZVal.assign(
                ZVal.isset(
                                ZVal.getElement(
                                        ZVal.getProperty(
                                                this, Google_HttpRequest.class, "responseHeaders"),
                                        key))
                        ? ZVal.getElement(
                                ZVal.getProperty(this, Google_HttpRequest.class, "responseHeaders"),
                                key)
                        : false);
    }

    public Object setResponseBody(RuntimeEnv env, Object... args) {
        Object responseBody = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_HttpRequest.class, "responseBody", responseBody);

        return null;
    }

    public Object getUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_HttpRequest.class, "url"));
    }

    public Object getRequestMethod(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_HttpRequest.class, "requestMethod"));
    }

    public Object getRequestHeaders(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_HttpRequest.class, "requestHeaders"));
    }

    public Object getRequestHeader(RuntimeEnv env, Object... args) {
        Object key = ZVal.assignParameter(args, 0, null);
        return ZVal.assign(
                ZVal.isset(
                                ZVal.getElement(
                                        ZVal.getProperty(
                                                this, Google_HttpRequest.class, "requestHeaders"),
                                        key))
                        ? ZVal.getElement(
                                ZVal.getProperty(this, Google_HttpRequest.class, "requestHeaders"),
                                key)
                        : false);
    }

    public Object getPostBody(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_HttpRequest.class, "postBody"));
    }

    public Object setUrl(RuntimeEnv env, Object... args) {
        Object url = ZVal.assignParameter(args, 0, null);
        Object apiConfig = env.getGlobal("apiConfig");
        ;
        if (ZVal.equalityCheck(NamespaceGlobal.substr.call(env, url, 0, 4), "http")) {
            ZVal.setProperty(this, Google_HttpRequest.class, "url", url);

        } else {
            if (ZVal.strictNotEqualityCheck(
                    NamespaceGlobal.substr.call(env, url, 0, 1), "!==", "/")) {
                url = "/" + ZVal.toString(url);
            }

            ZVal.setProperty(
                    this,
                    Google_HttpRequest.class,
                    "url",
                    ZVal.toString(ZVal.getElement(apiConfig, "basePath")) + ZVal.toString(url));
        }

        return env.returnWithGlobals(null, "apiConfig", apiConfig);
    }

    public Object setRequestMethod(RuntimeEnv env, Object... args) {
        Object method = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_HttpRequest.class,
                "requestMethod",
                NamespaceGlobal.strtoupper.call(env, method));

        return null;
    }

    public Object setRequestHeaders(RuntimeEnv env, Object... args) {
        Object headers = ZVal.assignParameter(args, 0, null);
        headers = Google_Utils.normalize(env, headers);
        if (ZVal.isTrue(ZVal.getProperty(this, Google_HttpRequest.class, "requestHeaders"))) {
            headers =
                    CRArrayF.array_merge.call(
                            env,
                            ZVal.getProperty(this, Google_HttpRequest.class, "requestHeaders"),
                            headers);
        }

        ZVal.setProperty(this, Google_HttpRequest.class, "requestHeaders", headers);

        return null;
    }

    public Object setPostBody(RuntimeEnv env, Object... args) {
        Object postBody = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_HttpRequest.class, "postBody", postBody);

        return null;
    }

    public Object setUserAgent(RuntimeEnv env, Object... args) {
        Object userAgent = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_HttpRequest.class, "userAgent", userAgent);

        return null;
    }

    public Object getUserAgent(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_HttpRequest.class, "userAgent"));
    }

    public Object getCacheKey(RuntimeEnv env, Object... args) {
        Object key = null;
        key = env.callMethod(this, "getUrl", Google_HttpRequest.class);
        if (ZVal.isset(ZVal.getProperty(this, Google_HttpRequest.class, "accessKey"))) {
            key =
                    ZVal.toString(key)
                            + ZVal.toString(
                                    ZVal.getProperty(this, Google_HttpRequest.class, "accessKey"));
        }

        if (ZVal.isset(
                ZVal.getElement(
                        ZVal.getProperty(this, Google_HttpRequest.class, "requestHeaders"),
                        "authorization"))) {
            key =
                    ZVal.toString(key)
                            + ZVal.toString(
                                    ZVal.getElement(
                                            ZVal.getProperty(
                                                    this,
                                                    Google_HttpRequest.class,
                                                    "requestHeaders"),
                                            "authorization"));
        }

        return ZVal.assign(NamespaceGlobal.md5.call(env, key));
    }

    public Object getParsedCacheControl(RuntimeEnv env, Object... args) {
        Object rawCacheControl = null;
        Object parsed = null;
        parsed = ZVal.newArray();
        rawCacheControl =
                env.callMethod(
                        this, "getResponseHeader", Google_HttpRequest.class, "cache-control");
        if (ZVal.isTrue(rawCacheControl)) {
            rawCacheControl =
                    NamespaceGlobal.str_replace.call(
                            env, new RuntimeArgsWithReferences(), ", ", "&", rawCacheControl);
            function_parse_str.f.call(env, rawCacheControl, parsed);
        }

        return ZVal.assign(parsed);
    }

    public Object toBatchString(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        Object str = null;
        Object val = null;
        Object path = null;
        Object key = null;
        str = "";
        for (ZPair zpairResult13 :
                ZVal.getIterable(
                        ZVal.getProperty(this, Google_HttpRequest.class, "batchHeaders"))) {
            key = ZVal.assign(zpairResult13.getKey());
            val = ZVal.assign(zpairResult13.getValue());
            str =
                    ZVal.toString(str)
                            + ZVal.toString(
                                    ZVal.toString(
                                                    ZVal.toString(ZVal.toString(key) + ": ")
                                                            + ZVal.toString(val))
                                            + "\n");
        }

        str = ZVal.toString(str) + ZVal.toString("Content-ID: " + ZVal.toString(id) + "\n");
        str = ZVal.toString(str) + "\n";
        path =
                NamespaceGlobal.parse_url.call(
                        env, env.callMethod(this, "getUrl", Google_HttpRequest.class), 5);
        str =
                ZVal.toString(str)
                        + ZVal.toString(
                                ZVal.toString(
                                                ZVal.toString(
                                                                ZVal.toString(
                                                                                env.callMethod(
                                                                                        this,
                                                                                        "getRequestMethod",
                                                                                        Google_HttpRequest
                                                                                                .class))
                                                                        + " ")
                                                        + ZVal.toString(path))
                                        + " HTTP/1.1\n");
        for (ZPair zpairResult14 :
                ZVal.getIterable(
                        env.callMethod(this, "getRequestHeaders", Google_HttpRequest.class))) {
            key = ZVal.assign(zpairResult14.getKey());
            val = ZVal.assign(zpairResult14.getValue());
            str =
                    ZVal.toString(str)
                            + ZVal.toString(
                                    ZVal.toString(
                                                    ZVal.toString(ZVal.toString(key) + ": ")
                                                            + ZVal.toString(val))
                                            + "\n");
        }

        if (ZVal.isTrue(env.callMethod(this, "getPostBody", Google_HttpRequest.class))) {
            str = ZVal.toString(str) + "\n";
            str =
                    ZVal.toString(str)
                            + ZVal.toString(
                                    env.callMethod(this, "getPostBody", Google_HttpRequest.class));
        }

        return ZVal.assign(str);
    }

    public static final Object CONST_USER_AGENT_SUFFIX = "google-api-php-client/0.6.0";

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
