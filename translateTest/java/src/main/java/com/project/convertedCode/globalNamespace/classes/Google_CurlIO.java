package com.project.convertedCode.globalNamespace.classes;

import com.project.convertedCode.globalNamespace.classes.Google_Client;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Google_CacheParser;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.classes.Google_IOException;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/io/Google_CurlIO.php

*/

public class Google_CurlIO extends RuntimeClassBase implements RuntimeFileContextInterface {

    public Object curlParams =
            ZVal.newArray(
                    new ZPair(19913, true),
                    new ZPair(52, 0),
                    new ZPair(45, false),
                    new ZPair(64, true),
                    new ZPair(42, true),
                    new ZPair(41, false));

    public Google_CurlIO(RuntimeEnv env, Object... args) {
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
            case "authenticatedRequest":
                return this.authenticatedRequest(env, args);
            case "makeRequest":
                return this.makeRequest(env, args);
            case "setCachedRequest":
                return this.setCachedRequest(env, args);
            case "getCachedRequest":
                return this.getCachedRequest(env, args);
            case "processEntityRequest":
                return this.processEntityRequest(env, args);
            case "setOptions":
                return this.setOptions(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "curlParams":
                if (Google_CurlIO.class.equals(caller)) {

                    return this.curlParams;
                }
                return this.__phpMagicMethod__isset(key);
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "curlParams":
                if (Google_CurlIO.class.equals(caller)) {

                    return ZVal.isNull(this.curlParams);
                }
                break;
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "curlParams":
                if (Google_CurlIO.class.equals(caller)) {

                    this.curlParams = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
        }
        super.__set(key, value, caller);
    }

    public static class RequestStaticProperties {

        public RequestStaticProperties(RuntimeEnv env) {}

        public Object ENTITY_HTTP_METHODS =
                ZVal.newArray(new ZPair("POST", ZVal.getNull()), new ZPair("PUT", ZVal.getNull()));

        public Object HOP_BY_HOP =
                ZVal.newArray(
                        new ZPair(0, "connection"),
                        new ZPair(1, "keep-alive"),
                        new ZPair(2, "proxy-authenticate"),
                        new ZPair(3, "proxy-authorization"),
                        new ZPair(4, "te"),
                        new ZPair(5, "trailers"),
                        new ZPair(6, "transfer-encoding"),
                        new ZPair(7, "upgrade"));
    }

    public static RequestStaticProperties getRequestStaticProperties(RuntimeEnv env) {
        RequestStaticProperties a =
                (RequestStaticProperties)
                        env.getRequestStaticProperty(
                                "com.project.convertedCode.globalNamespace.classes.Google_CurlIO");
        if (a == null) {
            a = new RequestStaticProperties(env);
            env.setRequestStaticProperty(
                    "com.project.convertedCode.globalNamespace.classes.Google_CurlIO", a);
        }
        return a;
    };

    public Object authenticatedRequest(RuntimeEnv env, Object... args) {
        Object request = ZVal.assignParameter(args, 0, null);
        request =
                env.callMethod(
                        Google_Client.getRequestStaticProperties(env).auth,
                        "sign",
                        Google_CurlIO.class,
                        request);
        return ZVal.assign(env.callMethod(this, "makeRequest", Google_CurlIO.class, request));
    }

    public Object makeRequest(RuntimeEnv env, Object... args) {
        Object request = ZVal.assignParameter(args, 0, null);
        Object addHeaders = ZVal.newArray();
        Object responseBody = null;
        Object ch = null;
        Object curlError = null;
        Object k = null;
        Object respHttpCode = null;
        Object hopByHop = null;
        Object requestHeaders = null;
        Object responseHeaders = ZVal.newArray();
        Object v = null;
        Object cached = null;
        Object curlErrorNum = null;
        Object respData = null;
        Object endToEnd = ZVal.newArray();
        Object parsed = ZVal.newArray();
        Object runtimeTempArrayResult1 = null;
        Object respHeaderSize = null;
        Object key = null;
        cached = env.callMethod(this, "getCachedRequest", Google_CurlIO.class, request);
        if (ZVal.strictNotEqualityCheck(cached, "!==", false)) {
            if (ZVal.isTrue(Google_CacheParser.mustRevalidate(env, cached))) {
                addHeaders = ZVal.newArray();
                if (ZVal.isTrue(
                        env.callMethod(cached, "getResponseHeader", Google_CurlIO.class, "etag"))) {
                    ZVal.putArrayElement(
                            addHeaders,
                            "If-None-Match",
                            env.callMethod(
                                    cached, "getResponseHeader", Google_CurlIO.class, "etag"));

                } else if (ZVal.isTrue(
                        env.callMethod(cached, "getResponseHeader", Google_CurlIO.class, "date"))) {
                    ZVal.putArrayElement(
                            addHeaders,
                            "If-Modified-Since",
                            env.callMethod(
                                    cached, "getResponseHeader", Google_CurlIO.class, "date"));
                }

                env.callMethod(request, "setRequestHeaders", Google_CurlIO.class, addHeaders);

            } else {
                return ZVal.assign(cached);
            }
        }

        if (ZVal.isTrue(
                CRArrayF.array_key_exists.call(
                        env,
                        env.callMethod(request, "getRequestMethod", Google_CurlIO.class),
                        getRequestStaticProperties(env).ENTITY_HTTP_METHODS))) {
            request = env.callMethod(this, "processEntityRequest", Google_CurlIO.class, request);
        }

        ch = NamespaceGlobal.curl_init.call(env);
        NamespaceGlobal.curl_setopt_array.call(
                env, ch, ZVal.getProperty(this, Google_CurlIO.class, "curlParams"));
        NamespaceGlobal.curl_setopt.call(
                env, ch, 10002, env.callMethod(request, "getUrl", Google_CurlIO.class));
        if (ZVal.isTrue(env.callMethod(request, "getPostBody", Google_CurlIO.class))) {
            NamespaceGlobal.curl_setopt.call(
                    env, ch, 10015, env.callMethod(request, "getPostBody", Google_CurlIO.class));
        }

        requestHeaders = env.callMethod(request, "getRequestHeaders", Google_CurlIO.class);
        if (ZVal.toBool(requestHeaders)
                && ZVal.toBool(NamespaceGlobal.is_array.call(env, requestHeaders))) {
            parsed = ZVal.newArray();
            for (ZPair zpairResult9 : ZVal.getIterable(requestHeaders)) {
                k = ZVal.assign(zpairResult9.getKey());
                v = ZVal.assign(zpairResult9.getValue());
                ZVal.addToArray(parsed, ZVal.toString(k) + ": " + ZVal.toString(v));
            }

            NamespaceGlobal.curl_setopt.call(env, ch, 10023, parsed);
        }

        NamespaceGlobal.curl_setopt.call(
                env, ch, 10036, env.callMethod(request, "getRequestMethod", Google_CurlIO.class));
        NamespaceGlobal.curl_setopt.call(
                env, ch, 10018, env.callMethod(request, "getUserAgent", Google_CurlIO.class));
        respData = NamespaceGlobal.curl_exec.call(env, ch);
        if (ZVal.equalityCheck(NamespaceGlobal.curl_errno.call(env, ch), 60)) {
            NamespaceGlobal.error_log.call(
                    env,
                    "SSL certificate problem, verify that the CA cert is OK."
                            + " Retrying with the CA cert bundle from google-api-php-client.");
            NamespaceGlobal.curl_setopt.call(
                    env,
                    ch,
                    10065,
                    ZVal.toString(NamespaceGlobal.dirname.call(env, this.___getRuntimeFilename()))
                            + "/cacerts.pem");
            respData = NamespaceGlobal.curl_exec.call(env, ch);
        }

        respHeaderSize = NamespaceGlobal.curl_getinfo.call(env, ch, 2097163);
        respHttpCode = ZVal.assign(NamespaceGlobal.curl_getinfo.call(env, ch, 2097154));
        curlErrorNum = NamespaceGlobal.curl_errno.call(env, ch);
        curlError = NamespaceGlobal.curl_error.call(env, ch);
        NamespaceGlobal.curl_close.call(env, ch);
        if (ZVal.notEqualityCheck(curlErrorNum, 0)) {
            throw new Google_IOException(
                    env,
                    "HTTP Error: ("
                            + ZVal.toString(respHttpCode)
                            + ") "
                            + ZVal.toString(curlError));
        }

        runtimeTempArrayResult1 = parseHttpResponse(env, respData, respHeaderSize);
        responseHeaders = ZVal.assign(ZVal.getElement(runtimeTempArrayResult1, 0));
        responseBody = ZVal.assign(ZVal.getElement(runtimeTempArrayResult1, 1));
        ;
        if (ZVal.toBool(ZVal.equalityCheck(respHttpCode, 304)) && ZVal.toBool(cached)) {
            if (ZVal.isset(ZVal.getElement(responseHeaders, "connection"))) {
                hopByHop =
                        CRArrayF.array_merge.call(
                                env,
                                getRequestStaticProperties(env).HOP_BY_HOP,
                                NamespaceGlobal.explode.call(
                                        env, ",", ZVal.getElement(responseHeaders, "connection")));
                endToEnd = ZVal.newArray();
                for (ZPair zpairResult10 : ZVal.getIterable(hopByHop)) {
                    key = ZVal.assign(zpairResult10.getValue());
                    if (ZVal.isset(ZVal.getElement(responseHeaders, key))) {
                        ZVal.putArrayElement(endToEnd, key, ZVal.getElement(responseHeaders, key));
                    }
                }

                env.callMethod(cached, "setResponseHeaders", Google_CurlIO.class, endToEnd);
            }

            return ZVal.assign(cached);
        }

        env.callMethod(request, "setResponseHttpCode", Google_CurlIO.class, respHttpCode);
        env.callMethod(request, "setResponseHeaders", Google_CurlIO.class, responseHeaders);
        env.callMethod(request, "setResponseBody", Google_CurlIO.class, responseBody);
        env.callMethod(this, "setCachedRequest", Google_CurlIO.class, request);
        return ZVal.assign(request);
    }

    public Object setCachedRequest(RuntimeEnv env, Object... args) {
        Object request = ZVal.assignParameter(args, 0, null);
        if (ZVal.isTrue(Google_CacheParser.isResponseCacheable(env, request))) {
            env.callMethod(
                    Google_Client.getRequestStaticProperties(env).cache,
                    "set",
                    Google_CurlIO.class,
                    env.callMethod(request, "getCacheKey", Google_CurlIO.class),
                    request);
            return ZVal.assign(true);
        }

        return ZVal.assign(false);
    }

    public Object getCachedRequest(RuntimeEnv env, Object... args) {
        Object request = ZVal.assignParameter(args, 0, null);
        if (ZVal.equalityCheck(false, Google_CacheParser.isRequestCacheable(env, request))) {
            /* An inline constant was removed */

        }

        return ZVal.assign(
                env.callMethod(
                        Google_Client.getRequestStaticProperties(env).cache,
                        "get",
                        Google_CurlIO.class,
                        env.callMethod(request, "getCacheKey", Google_CurlIO.class)));
    }

    public Object processEntityRequest(RuntimeEnv env, Object... args) {
        Object request = ZVal.assignParameter(args, 0, null);
        Object postBody = null;
        Object postsLength = null;
        Object contentType = null;
        postBody = env.callMethod(request, "getPostBody", Google_CurlIO.class);
        contentType =
                env.callMethod(request, "getRequestHeader", Google_CurlIO.class, "content-type");
        if (ZVal.equalityCheck(false, contentType)) {
            contentType = ZVal.assign(CONST_FORM_URLENCODED);
            env.callMethod(
                    request,
                    "setRequestHeaders",
                    Google_CurlIO.class,
                    ZVal.newArray(new ZPair("content-type", contentType)));
        }

        if (ZVal.toBool(ZVal.equalityCheck(contentType, CONST_FORM_URLENCODED))
                && ZVal.toBool(NamespaceGlobal.is_array.call(env, postBody))) {
            postBody = NamespaceGlobal.http_build_query.call(env, postBody, "", "&");
            env.callMethod(request, "setPostBody", Google_CurlIO.class, postBody);
        }

        if (ZVal.toBool(!ZVal.isTrue(postBody))
                || ZVal.toBool(NamespaceGlobal.is_string.call(env, postBody))) {
            postsLength = NamespaceGlobal.strlen.call(env, postBody);
            env.callMethod(
                    request,
                    "setRequestHeaders",
                    Google_CurlIO.class,
                    ZVal.newArray(new ZPair("content-length", postsLength)));
        }

        return ZVal.assign(request);
    }

    public Object setOptions(RuntimeEnv env, Object... args) {
        Object optCurlParams = ZVal.assignParameter(args, 0, null);
        Object val = null;
        Object key = null;
        for (ZPair zpairResult12 : ZVal.getIterable(optCurlParams)) {
            key = ZVal.assign(zpairResult12.getKey());
            val = ZVal.assign(zpairResult12.getValue());
            ZVal.putArrayElement(
                    ZVal.getProperty(this, Google_CurlIO.class, "curlParams"), key, val);
        }

        return null;
    }

    public static Object parseHttpResponse(RuntimeEnv env, Object... args) {
        Object respData = ZVal.assignParameter(args, 0, null);
        Object headerSize = ZVal.assignParameter(args, 1, null);
        Object responseBody = null;
        Object responseHeaders = null;
        Object runtimeTempArrayResult2 = null;
        if (ZVal.strictNotEqualityCheck(
                NamespaceGlobal.stripos.call(env, respData, CONST_CONNECTION_ESTABLISHED),
                "!==",
                false)) {
            respData =
                    NamespaceGlobal.str_ireplace.call(
                            env,
                            new RuntimeArgsWithReferences(),
                            CONST_CONNECTION_ESTABLISHED,
                            "",
                            respData);
        }

        if (ZVal.isTrue(headerSize)) {
            responseBody = NamespaceGlobal.substr.call(env, respData, headerSize);
            responseHeaders = NamespaceGlobal.substr.call(env, respData, 0, headerSize);

        } else {
            runtimeTempArrayResult2 = NamespaceGlobal.explode.call(env, "\r\n\r\n", respData, 2);
            responseHeaders = ZVal.assign(ZVal.getElement(runtimeTempArrayResult2, 0));
            responseBody = ZVal.assign(ZVal.getElement(runtimeTempArrayResult2, 1));
            ;
        }

        responseHeaders = parseResponseHeaders(env, responseHeaders);
        return ZVal.assign(
                ZVal.newArray(new ZPair(0, responseHeaders), new ZPair(1, responseBody)));
    }

    public static Object parseResponseHeaders(RuntimeEnv env, Object... args) {
        Object rawHeaders = ZVal.assignParameter(args, 0, null);
        Object responseHeaders = ZVal.newArray();
        Object runtimeTempArrayResult3 = null;
        Object header = null;
        Object headerLine = null;
        Object responseHeaderLines = null;
        Object value = null;
        responseHeaders = ZVal.newArray();
        responseHeaderLines = NamespaceGlobal.explode.call(env, "\r\n", rawHeaders);
        for (ZPair zpairResult11 : ZVal.getIterable(responseHeaderLines)) {
            headerLine = ZVal.assign(zpairResult11.getValue());
            if (ZVal.toBool(headerLine)
                    && ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    NamespaceGlobal.strpos.call(env, headerLine, ":"),
                                    "!==",
                                    false))) {
                runtimeTempArrayResult3 = NamespaceGlobal.explode.call(env, ": ", headerLine, 2);
                header = ZVal.assign(ZVal.getElement(runtimeTempArrayResult3, 0));
                value = ZVal.assign(ZVal.getElement(runtimeTempArrayResult3, 1));
                ;
                header = NamespaceGlobal.strtolower.call(env, header);
                if (ZVal.isset(ZVal.getElement(responseHeaders, header))) {
                    ZVal.putArrayElement(
                            responseHeaders,
                            header,
                            ZVal.toString(ZVal.getElement(responseHeaders, header))
                                    + ZVal.toString("\n" + ZVal.toString(value)));

                } else {
                    ZVal.putArrayElement(responseHeaders, header, value);
                }
            }
        }

        return ZVal.assign(responseHeaders);
    }

    public static final Object CONST_CONNECTION_ESTABLISHED =
            "HTTP/1.0 200 Connection established\r\n\r\n";

    public static final Object CONST_FORM_URLENCODED = "application/x-www-form-urlencoded";

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
