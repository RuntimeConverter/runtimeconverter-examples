package com.project.convertedCode.globalNamespace.classes;

import com.project.convertedCode.globalNamespace.classes.Google_Client;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.classes.Google_HttpRequest;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.classes.Google_CurlIO;
import com.project.convertedCode.globalNamespace.classes.Google_REST;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/service/Google_BatchRequest.php

*/

public class Google_BatchRequest extends RuntimeClassBase implements RuntimeFileContextInterface {

    public Object boundary = null;

    public Object requests = ZVal.newArray();

    public Google_BatchRequest(RuntimeEnv env, Object... args) {
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
            case "add":
                return this.add(env, args);
            case "execute":
                return this.execute(env, args);
            case "parseResponse":
                return this.parseResponse(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "boundary":
                if (Google_BatchRequest.class.equals(caller)) {

                    return this.boundary;
                }
                return this.__phpMagicMethod__isset(key);
            case "requests":
                if (Google_BatchRequest.class.equals(caller)) {

                    return this.requests;
                }
                return this.__phpMagicMethod__isset(key);
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "boundary":
                if (Google_BatchRequest.class.equals(caller)) {

                    return ZVal.isNull(this.boundary);
                }
                break;
            case "requests":
                if (Google_BatchRequest.class.equals(caller)) {

                    return ZVal.isNull(this.requests);
                }
                break;
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "boundary":
                if (Google_BatchRequest.class.equals(caller)) {

                    this.boundary = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "requests":
                if (Google_BatchRequest.class.equals(caller)) {

                    this.requests = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object boundary = ZVal.assignParameter(args, 0, null);
        if (ZVal.isNull(boundary)) {
            boundary = false;
        }
        boundary =
                ZVal.assign(
                        ZVal.equalityCheck(false, boundary)
                                ? NamespaceGlobal.mt_rand.call(env)
                                : boundary);
        ZVal.setProperty(
                this,
                Google_BatchRequest.class,
                "boundary",
                NamespaceGlobal.str_replace.call(
                        env, new RuntimeArgsWithReferences(), "\"", "", boundary));

        return null;
    }

    public Object add(RuntimeEnv env, Object... args) {
        Object request = ZVal.assignParameter(args, 0, null);
        Object key = ZVal.assignParameter(args, 1, null);
        if (ZVal.isNull(key)) {
            key = false;
        }
        if (ZVal.equalityCheck(false, key)) {
            key = NamespaceGlobal.mt_rand.call(env);
        }

        ZVal.putArrayElement(
                ZVal.getProperty(this, Google_BatchRequest.class, "requests"), key, request);

        return null;
    }

    public Object execute(RuntimeEnv env, Object... args) {
        Object response = null;
        Object apiConfig = env.getGlobal("apiConfig");
        ;
        Object httpRequest = null;
        Object body = null;
        Object key = null;
        Object url = null;
        Object req = null;
        body = "";
        for (ZPair zpairResult17 :
                ZVal.getIterable(ZVal.getProperty(this, Google_BatchRequest.class, "requests"))) {
            key = ZVal.assign(zpairResult17.getKey());
            req = ZVal.assign(zpairResult17.getValue());
            body =
                    ZVal.toString(body)
                            + ZVal.toString(
                                    "--"
                                            + ZVal.toString(
                                                    ZVal.getProperty(
                                                            this,
                                                            Google_BatchRequest.class,
                                                            "boundary"))
                                            + "\n");
            body =
                    ZVal.toString(body)
                            + ZVal.toString(
                                    ZVal.toString(
                                                    env.callMethod(
                                                            req,
                                                            "toBatchString",
                                                            Google_BatchRequest.class,
                                                            key))
                                            + "\n");
        }

        body = NamespaceGlobal.rtrim.call(env, body);
        body =
                ZVal.toString(body)
                        + ZVal.toString(
                                "\n--"
                                        + ZVal.toString(
                                                ZVal.getProperty(
                                                        this,
                                                        Google_BatchRequest.class,
                                                        "boundary"))
                                        + "--");

        url = ZVal.toString(ZVal.getElement(apiConfig, "basePath")) + "/batch";
        httpRequest = new Google_HttpRequest(env, url, "POST");
        env.callMethod(
                httpRequest,
                "setRequestHeaders",
                Google_BatchRequest.class,
                ZVal.newArray(
                        new ZPair(
                                "Content-Type",
                                "multipart/mixed; boundary="
                                        + ZVal.toString(
                                                ZVal.getProperty(
                                                        this,
                                                        Google_BatchRequest.class,
                                                        "boundary")))));
        env.callMethod(httpRequest, "setPostBody", Google_BatchRequest.class, body);
        response =
                env.callMethod(
                        Google_Client.getRequestStaticProperties(env).io,
                        "makeRequest",
                        Google_BatchRequest.class,
                        httpRequest);
        response = env.callMethod(this, "parseResponse", Google_BatchRequest.class, response);
        return env.returnWithGlobals(response, "apiConfig", apiConfig);
    }

    public Object parseResponse(RuntimeEnv env, Object... args) {
        Object response = ZVal.assignParameter(args, 0, null);
        Object boundary = null;
        Object part = ZVal.newArray();
        Object body = null;
        Object metaHeaders = ZVal.newArray();
        Object partHeaders = null;
        Object runtimeTempArrayResult5 = null;
        Object runtimeTempArrayResult4 = null;
        Object parts = null;
        Object responses = ZVal.newArray();
        Object contentType = null;
        Object status = ZVal.newArray();
        Object partBody = null;
        contentType =
                env.callMethod(
                        response, "getResponseHeader", Google_BatchRequest.class, "content-type");
        contentType = NamespaceGlobal.explode.call(env, ";", contentType);
        boundary = false;
        for (ZPair zpairResult18 : ZVal.getIterable(contentType)) {
            part = ZVal.assign(zpairResult18.getValue());
            part = NamespaceGlobal.explode.call(env, "=", part, 2);
            if (ZVal.toBool(ZVal.isset(ZVal.getElement(part, 0)))
                    && ZVal.toBool(
                            ZVal.equalityCheck(
                                    "boundary",
                                    NamespaceGlobal.trim.call(env, ZVal.getElement(part, 0))))) {
                boundary = ZVal.assign(ZVal.getElement(part, 1));
            }
        }

        body = env.callMethod(response, "getResponseBody", Google_BatchRequest.class);
        if (ZVal.isTrue(body)) {
            body =
                    NamespaceGlobal.str_replace.call(
                            env,
                            new RuntimeArgsWithReferences(),
                            "--" + ZVal.toString(boundary) + "--",
                            "--" + ZVal.toString(boundary),
                            body);
            parts = NamespaceGlobal.explode.call(env, "--" + ZVal.toString(boundary), body);
            responses = ZVal.newArray();
            for (ZPair zpairResult19 : ZVal.getIterable(parts)) {
                part = ZVal.assign(zpairResult19.getValue());
                part = NamespaceGlobal.trim.call(env, part);
                if (!ZVal.isEmpty(part)) {
                    runtimeTempArrayResult4 =
                            NamespaceGlobal.explode.call(env, "\r\n\r\n", part, 2);
                    metaHeaders = ZVal.assign(ZVal.getElement(runtimeTempArrayResult4, 0));
                    part = ZVal.assign(ZVal.getElement(runtimeTempArrayResult4, 1));
                    ;
                    metaHeaders = Google_CurlIO.parseResponseHeaders(env, metaHeaders);
                    status =
                            NamespaceGlobal.substr.call(
                                    env, part, 0, NamespaceGlobal.strpos.call(env, part, "\n"));
                    status = NamespaceGlobal.explode.call(env, " ", status);
                    status = ZVal.assign(ZVal.getElement(status, 1));
                    runtimeTempArrayResult5 = Google_CurlIO.parseHttpResponse(env, part, false);
                    partHeaders = ZVal.assign(ZVal.getElement(runtimeTempArrayResult5, 0));
                    partBody = ZVal.assign(ZVal.getElement(runtimeTempArrayResult5, 1));
                    ;
                    response = new Google_HttpRequest(env, "");
                    env.callMethod(
                            response, "setResponseHttpCode", Google_BatchRequest.class, status);
                    env.callMethod(
                            response, "setResponseHeaders", Google_BatchRequest.class, partHeaders);
                    env.callMethod(
                            response, "setResponseBody", Google_BatchRequest.class, partBody);
                    response = Google_REST.decodeHttpResponse(env, response);
                    ZVal.putArrayElement(
                            responses, ZVal.getElement(metaHeaders, "content-id"), response);
                }
            }

            return ZVal.assign(responses);
        }

        return ZVal.assign(ZVal.getNull());
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
