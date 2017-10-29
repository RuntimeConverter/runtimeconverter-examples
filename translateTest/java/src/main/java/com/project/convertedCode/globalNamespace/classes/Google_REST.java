package com.project.convertedCode.globalNamespace.classes;

import com.project.convertedCode.globalNamespace.classes.Google_Client;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Google_ServiceException;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.classes.URI_Template_Parser;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/io/Google_REST.php

*/

public class Google_REST extends RuntimeClassBase implements RuntimeFileContextInterface {

    public Google_REST(RuntimeEnv env, Object... args) {
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

    public static Object execute(RuntimeEnv env, Object... args) {
        Object req = ZVal.assignParameter(args, 0, null);
        Object ret = null;
        Object decodedResponse = ZVal.newArray();
        Object httpRequest = null;
        httpRequest =
                env.callMethod(
                        Google_Client.getRequestStaticProperties(env).io,
                        "makeRequest",
                        Google_REST.class,
                        req);
        decodedResponse = decodeHttpResponse(env, httpRequest);
        ret =
                ZVal.assign(
                        ZVal.isset(ZVal.getElement(decodedResponse, "data"))
                                ? ZVal.getElement(decodedResponse, "data")
                                : decodedResponse);
        return ZVal.assign(ret);
    }

    public static Object decodeHttpResponse(RuntimeEnv env, Object... args) {
        Object response = ZVal.assignParameter(args, 0, null);
        Object code = null;
        Object err = null;
        Object decoded = ZVal.newArray();
        Object body = null;
        code = env.callMethod(response, "getResponseHttpCode", Google_REST.class);
        body = env.callMethod(response, "getResponseBody", Google_REST.class);
        decoded = ZVal.getNull();
        if (ZVal.toBool(
                        ZVal.toBool(ZVal.notEqualityCheck(code, "200"))
                                && ZVal.toBool(ZVal.notEqualityCheck(code, "201")))
                && ZVal.toBool(ZVal.notEqualityCheck(code, "204"))) {
            decoded = NamespaceGlobal.json_decode.call(env, body, true);
            err =
                    ZVal.toString(
                                    ZVal.toString(
                                                    "Error calling "
                                                            + ZVal.toString(
                                                                    env.callMethod(
                                                                            response,
                                                                            "getRequestMethod",
                                                                            Google_REST.class)))
                                            + " ")
                            + ZVal.toString(env.callMethod(response, "getUrl", Google_REST.class));
            if (ZVal.toBool(
                            ZVal.toBool(ZVal.notEqualityCheck(decoded, ZVal.getNull()))
                                    && ZVal.toBool(
                                            ZVal.isset(
                                                    ZVal.getElementRecursive(
                                                            decoded, "error", "message"))))
                    && ZVal.toBool(
                            ZVal.isset(ZVal.getElementRecursive(decoded, "error", "code")))) {
                err =
                        ZVal.toString(err)
                                + ZVal.toString(
                                        ": ("
                                                + ZVal.toString(
                                                        ZVal.getElementRecursive(
                                                                decoded, "error", "code"))
                                                + ") "
                                                + ZVal.toString(
                                                        ZVal.getElementRecursive(
                                                                decoded, "error", "message")));

            } else {
                err =
                        ZVal.toString(err)
                                + ZVal.toString(
                                        ": (" + ZVal.toString(code) + ") " + ZVal.toString(body));
            }

            throw new Google_ServiceException(
                    env,
                    err,
                    code,
                    ZVal.getNull(),
                    ZVal.getElementRecursive(decoded, "error", "errors"));
        }

        if (ZVal.notEqualityCheck(code, "204")) {
            decoded = NamespaceGlobal.json_decode.call(env, body, true);
            if (ZVal.toBool(ZVal.strictEqualityCheck(decoded, "===", ZVal.getNull()))
                    || ZVal.toBool(ZVal.strictEqualityCheck(decoded, "===", ""))) {
                throw new Google_ServiceException(
                        env, "Invalid json in service response: " + ZVal.toString(body));
            }
        }

        return ZVal.assign(decoded);
    }

    public static Object createRequestUri(RuntimeEnv env, Object... args) {
        Object servicePath = ZVal.assignParameter(args, 0, null);
        Object restPath = ZVal.assignParameter(args, 1, null);
        Object params = ZVal.assignParameter(args, 2, null);
        Object uriTemplateParser = null;
        Object requestUrl = null;
        Object uriTemplateVars = ZVal.newArray();
        Object queryVars = ZVal.newArray();
        Object paramName = null;
        Object value = null;
        Object paramSpec = ZVal.newArray();
        requestUrl = ZVal.toString(servicePath) + ZVal.toString(restPath);
        uriTemplateVars = ZVal.newArray();
        queryVars = ZVal.newArray();
        for (ZPair zpairResult15 : ZVal.getIterable(params)) {
            paramName = ZVal.assign(zpairResult15.getKey());
            paramSpec = ZVal.assign(zpairResult15.getValue());
            if (!ZVal.isset(ZVal.getElement(paramSpec, "location"))) {
                ZVal.putArrayElement(
                        paramSpec, "location", ZVal.getElement(paramSpec, "restParameterType"));
            }

            if (ZVal.equalityCheck(ZVal.getElement(paramSpec, "type"), "boolean")) {
                ZVal.putArrayElement(
                        paramSpec,
                        "value",
                        ZVal.isTrue(ZVal.getElement(paramSpec, "value")) ? "true" : "false");
            }

            if (ZVal.equalityCheck(ZVal.getElement(paramSpec, "location"), "path")) {
                ZVal.putArrayElement(
                        uriTemplateVars, paramName, ZVal.getElement(paramSpec, "value"));

            } else {
                if (ZVal.toBool(ZVal.isset(ZVal.getElement(paramSpec, "repeated")))
                        && ZVal.toBool(
                                NamespaceGlobal.is_array.call(
                                        env, ZVal.getElement(paramSpec, "value")))) {
                    for (ZPair zpairResult16 :
                            ZVal.getIterable(ZVal.getElement(paramSpec, "value"))) {
                        value = ZVal.assign(zpairResult16.getValue());
                        ZVal.addToArray(
                                queryVars,
                                ZVal.toString(ZVal.toString(paramName) + "=")
                                        + ZVal.toString(
                                                NamespaceGlobal.rawurlencode.call(env, value)));
                    }

                } else {
                    ZVal.addToArray(
                            queryVars,
                            ZVal.toString(ZVal.toString(paramName) + "=")
                                    + ZVal.toString(
                                            NamespaceGlobal.rawurlencode.call(
                                                    env, ZVal.getElement(paramSpec, "value"))));
                }
            }
        }

        if (ZVal.isTrue(CRArrayF.count.call(env, uriTemplateVars))) {
            uriTemplateParser = new URI_Template_Parser(env, requestUrl);
            requestUrl =
                    env.callMethod(uriTemplateParser, "expand", Google_REST.class, uriTemplateVars);
        }

        requestUrl =
                NamespaceGlobal.str_replace.call(
                        env, new RuntimeArgsWithReferences(), "%40", "@", requestUrl);
        if (ZVal.isTrue(CRArrayF.count.call(env, queryVars))) {
            requestUrl =
                    ZVal.toString(requestUrl)
                            + ZVal.toString(
                                    "?"
                                            + ZVal.toString(
                                                    NamespaceGlobal.implode.call(
                                                            env, queryVars, "&")));
        }

        return ZVal.assign(requestUrl);
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
