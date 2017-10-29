package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/io/Google_CacheParser.php

*/

public class Google_CacheParser extends RuntimeClassBase implements RuntimeFileContextInterface {

    public Google_CacheParser(RuntimeEnv env, Object... args) {
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
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        super.__set(key, value, caller);
    }

    public static class RequestStaticProperties {

        public RequestStaticProperties(RuntimeEnv env) {}

        public Object CACHEABLE_HTTP_METHODS =
                ZVal.newArray(new ZPair(0, "GET"), new ZPair(1, "HEAD"));

        public Object CACHEABLE_STATUS_CODES =
                ZVal.newArray(
                        new ZPair(0, "200"),
                        new ZPair(1, "203"),
                        new ZPair(2, "300"),
                        new ZPair(3, "301"));
    }

    public static RequestStaticProperties getRequestStaticProperties(RuntimeEnv env) {
        RequestStaticProperties a =
                (RequestStaticProperties)
                        env.getRequestStaticProperty(
                                "com.project.convertedCode.globalNamespace.classes.Google_CacheParser");
        if (a == null) {
            a = new RequestStaticProperties(env);
            env.setRequestStaticProperty(
                    "com.project.convertedCode.globalNamespace.classes.Google_CacheParser", a);
        }
        return a;
    };

    protected Object __construct(RuntimeEnv env, Object... args) {

        return null;
    }

    public static Object isRequestCacheable(RuntimeEnv env, Object... args) {
        Object resp = ZVal.assignParameter(args, 0, null);
        Object method = null;
        method = env.callMethod(resp, "getRequestMethod", Google_CacheParser.class);
        if (!ZVal.isTrue(
                CRArrayF.in_array.call(
                        env, method, getRequestStaticProperties(env).CACHEABLE_HTTP_METHODS))) {
            return ZVal.assign(false);
        }

        if (ZVal.isTrue(
                env.callMethod(
                        resp, "getRequestHeader", Google_CacheParser.class, "authorization"))) {
            return ZVal.assign(false);
        }

        return ZVal.assign(true);
    }

    public static Object isResponseCacheable(RuntimeEnv env, Object... args) {
        Object resp = ZVal.assignParameter(args, 0, null);
        Object code = null;
        Object vary = null;
        Object etag = null;
        Object cacheControl = ZVal.newArray();
        Object pragma = null;
        if (ZVal.equalityCheck(false, isRequestCacheable(env, resp))) {
            return ZVal.assign(false);
        }

        code = env.callMethod(resp, "getResponseHttpCode", Google_CacheParser.class);
        if (!ZVal.isTrue(
                CRArrayF.in_array.call(
                        env, code, getRequestStaticProperties(env).CACHEABLE_STATUS_CODES))) {
            return ZVal.assign(false);
        }

        etag = env.callMethod(resp, "getResponseHeader", Google_CacheParser.class, "etag");
        if (ZVal.toBool(isExpired(env, resp)) && ZVal.toBool(ZVal.equalityCheck(etag, false))) {
            return ZVal.assign(false);
        }

        cacheControl = env.callMethod(resp, "getParsedCacheControl", Google_CacheParser.class);
        if (ZVal.isset(ZVal.getElement(cacheControl, "no-store"))) {
            return ZVal.assign(false);
        }

        pragma = env.callMethod(resp, "getResponseHeader", Google_CacheParser.class, "pragma");
        if (ZVal.toBool(ZVal.equalityCheck(pragma, "no-cache"))
                || ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                NamespaceGlobal.strpos.call(env, pragma, "no-cache"),
                                "!==",
                                false))) {
            return ZVal.assign(false);
        }

        vary = env.callMethod(resp, "getResponseHeader", Google_CacheParser.class, "vary");
        if (ZVal.isTrue(vary)) {
            return ZVal.assign(false);
        }

        return ZVal.assign(true);
    }

    public static Object isExpired(RuntimeEnv env, Object... args) {
        Object resp = ZVal.assignParameter(args, 0, null);
        Object rawExpires = null;
        Object parsedDate = null;
        Object responseHeaders = ZVal.newArray();
        Object freshnessLifetime = null;
        Object cacheControl = ZVal.newArray();
        Object age = null;
        Object parsedExpires = null;
        Object rawDate = null;
        parsedExpires = false;
        responseHeaders = env.callMethod(resp, "getResponseHeaders", Google_CacheParser.class);
        if (ZVal.isset(ZVal.getElement(responseHeaders, "expires"))) {
            rawExpires = ZVal.assign(ZVal.getElement(responseHeaders, "expires"));
            if (ZVal.toBool(ZVal.isEmpty(rawExpires))
                    || ZVal.toBool(
                            ZVal.toBool(NamespaceGlobal.is_numeric.call(env, rawExpires))
                                    && ZVal.toBool(
                                            ZVal.isLessThanOrEqualTo(rawExpires, "<=", 0)))) {
                return ZVal.assign(true);
            }

            parsedExpires = NamespaceGlobal.strtotime.call(env, rawExpires);
            if (ZVal.toBool(ZVal.equalityCheck(false, parsedExpires))
                    || ZVal.toBool(ZVal.isLessThanOrEqualTo(parsedExpires, "<=", 0))) {
                return ZVal.assign(true);
            }
        }

        freshnessLifetime = false;
        cacheControl = env.callMethod(resp, "getParsedCacheControl", Google_CacheParser.class);
        if (ZVal.isset(ZVal.getElement(cacheControl, "max-age"))) {
            freshnessLifetime = ZVal.assign(ZVal.getElement(cacheControl, "max-age"));
        }

        rawDate = env.callMethod(resp, "getResponseHeader", Google_CacheParser.class, "date");
        parsedDate = NamespaceGlobal.strtotime.call(env, rawDate);
        if (ZVal.toBool(ZVal.isEmpty(rawDate))
                || ZVal.toBool(ZVal.equalityCheck(false, parsedDate))) {
            parsedDate = NamespaceGlobal.time.call(env);
        }

        if (ZVal.toBool(ZVal.equalityCheck(false, freshnessLifetime))
                && ZVal.toBool(ZVal.isset(ZVal.getElement(responseHeaders, "expires")))) {
            freshnessLifetime = ZVal.subtract(parsedExpires, parsedDate);
        }

        if (ZVal.equalityCheck(false, freshnessLifetime)) {
            return ZVal.assign(true);
        }

        age =
                NamespaceGlobal.max.call(
                        env, 0, ZVal.subtract(NamespaceGlobal.time.call(env), parsedDate));
        if (ZVal.isset(ZVal.getElement(responseHeaders, "age"))) {
            age =
                    NamespaceGlobal.max.call(
                            env,
                            age,
                            NamespaceGlobal.strtotime.call(
                                    env, ZVal.getElement(responseHeaders, "age")));
        }

        return ZVal.assign(ZVal.isLessThanOrEqualTo(freshnessLifetime, "<=", age));
    }

    public static Object mustRevalidate(RuntimeEnv env, Object... args) {
        Object response = ZVal.assignParameter(args, 0, null);
        return ZVal.assign(isExpired(env, response));
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
