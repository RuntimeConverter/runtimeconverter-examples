package com.project.convertedCode.globalNamespace.classes;

import com.project.convertedCode.globalNamespace.classes.Google_Exception;
import com.project.convertedCode.globalNamespace.classes.Google_Client;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.project.convertedCode.globalNamespace.classes.Google_Utils;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Google_MediaFileUpload;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.classes.Google_HttpRequest;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.classes.Google_REST;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/service/Google_ServiceResource.php

*/

public class Google_ServiceResource extends RuntimeClassBase
        implements RuntimeFileContextInterface {

    public Object stackParameters =
            ZVal.newArray(
                    new ZPair(
                            "alt",
                            ZVal.newArray(
                                    new ZPair("type", "string"), new ZPair("location", "query"))),
                    new ZPair(
                            "boundary",
                            ZVal.newArray(
                                    new ZPair("type", "string"), new ZPair("location", "query"))),
                    new ZPair(
                            "fields",
                            ZVal.newArray(
                                    new ZPair("type", "string"), new ZPair("location", "query"))),
                    new ZPair(
                            "trace",
                            ZVal.newArray(
                                    new ZPair("type", "string"), new ZPair("location", "query"))),
                    new ZPair(
                            "userIp",
                            ZVal.newArray(
                                    new ZPair("type", "string"), new ZPair("location", "query"))),
                    new ZPair(
                            "userip",
                            ZVal.newArray(
                                    new ZPair("type", "string"), new ZPair("location", "query"))),
                    new ZPair(
                            "file",
                            ZVal.newArray(
                                    new ZPair("type", "complex"), new ZPair("location", "body"))),
                    new ZPair(
                            "data",
                            ZVal.newArray(
                                    new ZPair("type", "string"), new ZPair("location", "body"))),
                    new ZPair(
                            "mimeType",
                            ZVal.newArray(
                                    new ZPair("type", "string"), new ZPair("location", "header"))),
                    new ZPair(
                            "uploadType",
                            ZVal.newArray(
                                    new ZPair("type", "string"), new ZPair("location", "query"))),
                    new ZPair(
                            "mediaUpload",
                            ZVal.newArray(
                                    new ZPair("type", "complex"), new ZPair("location", "query"))));

    public Object service = null;

    public Object serviceName = null;

    public Object resourceName = null;

    public Object methods = null;

    public Google_ServiceResource(RuntimeEnv env, Object... args) {
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
            case "__call":
                return this.__call(env, args);
            case "useObjects":
                return this.useObjects(env, args);
            case "stripNull":
                if (Google_ServiceResource.class.isAssignableFrom(caller)) {

                    return this.stripNull(env, args);
                }
                break;
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "stackParameters":
                if (Google_ServiceResource.class.equals(caller)) {

                    return this.stackParameters;
                }
                return this.__phpMagicMethod__isset(key);
            case "service":
                if (Google_ServiceResource.class.equals(caller)) {

                    return this.service;
                }
                return this.__phpMagicMethod__isset(key);
            case "serviceName":
                if (Google_ServiceResource.class.equals(caller)) {

                    return this.serviceName;
                }
                return this.__phpMagicMethod__isset(key);
            case "resourceName":
                if (Google_ServiceResource.class.equals(caller)) {

                    return this.resourceName;
                }
                return this.__phpMagicMethod__isset(key);
            case "methods":
                if (Google_ServiceResource.class.equals(caller)) {

                    return this.methods;
                }
                return this.__phpMagicMethod__isset(key);
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "stackParameters":
                if (Google_ServiceResource.class.equals(caller)) {

                    return ZVal.isNull(this.stackParameters);
                }
                break;
            case "service":
                if (Google_ServiceResource.class.equals(caller)) {

                    return ZVal.isNull(this.service);
                }
                break;
            case "serviceName":
                if (Google_ServiceResource.class.equals(caller)) {

                    return ZVal.isNull(this.serviceName);
                }
                break;
            case "resourceName":
                if (Google_ServiceResource.class.equals(caller)) {

                    return ZVal.isNull(this.resourceName);
                }
                break;
            case "methods":
                if (Google_ServiceResource.class.equals(caller)) {

                    return ZVal.isNull(this.methods);
                }
                break;
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "stackParameters":
                if (Google_ServiceResource.class.equals(caller)) {

                    this.stackParameters = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "service":
                if (Google_ServiceResource.class.equals(caller)) {

                    this.service = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "serviceName":
                if (Google_ServiceResource.class.equals(caller)) {

                    this.serviceName = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "resourceName":
                if (Google_ServiceResource.class.equals(caller)) {

                    this.resourceName = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "methods":
                if (Google_ServiceResource.class.equals(caller)) {

                    this.methods = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object service = ZVal.assignParameter(args, 0, null);
        Object serviceName = ZVal.assignParameter(args, 1, null);
        Object resourceName = ZVal.assignParameter(args, 2, null);
        Object resource = ZVal.assignParameter(args, 3, null);
        if (ZVal.isNull(resource)) {
            resource = ZVal.newArray();
        }
        ZVal.setProperty(this, Google_ServiceResource.class, "service", service);
        ZVal.setProperty(this, Google_ServiceResource.class, "serviceName", serviceName);
        ZVal.setProperty(this, Google_ServiceResource.class, "resourceName", resourceName);
        ZVal.setProperty(
                this,
                Google_ServiceResource.class,
                "methods",
                ZVal.isset(ZVal.getElement(resource, "methods"))
                        ? ZVal.getElement(resource, "methods")
                        : ZVal.newArray(new ZPair(resourceName, resource)));

        return null;
    }

    public Object __call(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        Object arguments = ZVal.assignParameter(args, 1, null);
        if (ZVal.isNull(arguments)) {
            arguments = ZVal.newArray();
        }
        Object val = null;
        Object contentTypeHeader = ZVal.newArray();
        Object method = ZVal.newArray();
        Object optParams = null;
        Object paramName = null;
        Object media = ZVal.newArray();
        Object url = null;
        Object rawBody = null;
        Object postBody = null;
        Object servicePath = null;
        Object httpRequest = null;
        Object parameters = ZVal.newArray();
        Object value = null;
        Object contentType = null;
        Object key = null;
        Object paramSpec = ZVal.newArray();
        if (!ZVal.isset(
                ZVal.getElement(
                        ZVal.getProperty(this, Google_ServiceResource.class, "methods"), name))) {
            throw new Google_Exception(
                    env,
                    "Unknown function: "
                            + ZVal.toString(
                                    ZVal.getProperty(
                                            this, Google_ServiceResource.class, "serviceName"))
                            + "->"
                            + ZVal.toString(
                                    ZVal.getProperty(
                                            this, Google_ServiceResource.class, "resourceName"))
                            + "->"
                            + ZVal.toString(name)
                            + "()");
        }

        method =
                ZVal.assign(
                        ZVal.getElement(
                                ZVal.getProperty(this, Google_ServiceResource.class, "methods"),
                                name));
        parameters = ZVal.assign(ZVal.getElement(arguments, 0));
        postBody = ZVal.getNull();
        if (ZVal.isset(ZVal.getElement(parameters, "postBody"))) {
            if (ZVal.isTrue(
                    NamespaceGlobal.is_object.call(env, ZVal.getElement(parameters, "postBody")))) {
                env.callMethod(
                        this,
                        "stripNull",
                        Google_ServiceResource.class,
                        ZVal.getElement(parameters, "postBody"));
            }

            if (ZVal.toBool(
                            NamespaceGlobal.is_array.call(
                                    env, ZVal.getElement(parameters, "postBody")))
                    && ZVal.toBool(
                            ZVal.equalityCheck(
                                    "latitude",
                                    ZVal.getProperty(
                                            this, Google_ServiceResource.class, "serviceName")))) {
                if (!ZVal.isset(ZVal.getElementRecursive(parameters, "postBody", "data"))) {
                    rawBody = ZVal.assign(ZVal.getElement(parameters, "postBody"));
                    ZVal.unsetArrayElement(parameters, "postBody");
                    ZVal.setElementRecursive(parameters, rawBody, "postBody", "data");
                }
            }

            postBody =
                    ZVal.assign(
                            ZVal.toBool(
                                                    NamespaceGlobal.is_array.call(
                                                            env,
                                                            ZVal.getElement(
                                                                    parameters, "postBody")))
                                            || ZVal.toBool(
                                                    NamespaceGlobal.is_object.call(
                                                            env,
                                                            ZVal.getElement(
                                                                    parameters, "postBody")))
                                    ? NamespaceGlobal.json_encode.call(
                                            env, ZVal.getElement(parameters, "postBody"))
                                    : ZVal.getElement(parameters, "postBody"));
            ZVal.unsetArrayElement(parameters, "postBody");
            if (ZVal.isset(ZVal.getElement(parameters, "optParams"))) {
                optParams = ZVal.assign(ZVal.getElement(parameters, "optParams"));
                ZVal.unsetArrayElement(parameters, "optParams");
                parameters = CRArrayF.array_merge.call(env, parameters, optParams);
            }
        }

        if (!ZVal.isset(ZVal.getElement(method, "parameters"))) {
            ZVal.putArrayElement(method, "parameters", ZVal.newArray());
        }

        ZVal.putArrayElement(
                method,
                "parameters",
                CRArrayF.array_merge.call(
                        env,
                        ZVal.getElement(method, "parameters"),
                        ZVal.getProperty(this, Google_ServiceResource.class, "stackParameters")));
        for (ZPair zpairResult24 : ZVal.getIterable(parameters)) {
            key = ZVal.assign(zpairResult24.getKey());
            val = ZVal.assign(zpairResult24.getValue());
            if (ZVal.toBool(ZVal.notEqualityCheck(key, "postBody"))
                    && ZVal.toBool(
                            !ZVal.isset(ZVal.getElementRecursive(method, "parameters", key)))) {
                throw new Google_Exception(
                        env,
                        "("
                                + ZVal.toString(name)
                                + ") unknown parameter: '"
                                + ZVal.toString(key)
                                + "'");
            }
        }

        if (ZVal.isset(ZVal.getElement(method, "parameters"))) {
            for (ZPair zpairResult25 : ZVal.getIterable(ZVal.getElement(method, "parameters"))) {
                paramName = ZVal.assign(zpairResult25.getKey());
                paramSpec = ZVal.assign(zpairResult25.getValue());
                if (ZVal.toBool(
                                ZVal.toBool(ZVal.isset(ZVal.getElement(paramSpec, "required")))
                                        && ZVal.toBool(ZVal.getElement(paramSpec, "required")))
                        && ZVal.toBool(!ZVal.isset(ZVal.getElement(parameters, paramName)))) {
                    throw new Google_Exception(
                            env,
                            "("
                                    + ZVal.toString(name)
                                    + ") missing required param: '"
                                    + ZVal.toString(paramName)
                                    + "'");
                }

                if (ZVal.isset(ZVal.getElement(parameters, paramName))) {
                    value = ZVal.assign(ZVal.getElement(parameters, paramName));
                    ZVal.putArrayElement(parameters, paramName, paramSpec);
                    ZVal.setElementRecursive(parameters, value, paramName, "value");
                    ZVal.unsetElementRecursive(parameters, paramName, "required");

                } else {
                    ZVal.unsetArrayElement(parameters, paramName);
                }
            }
        }

        if (!ZVal.isset(ZVal.getElement(method, "id"))) {
            ZVal.putArrayElement(method, "id", ZVal.getElement(method, "rpcMethod"));
        }

        if (!ZVal.isset(ZVal.getElement(method, "path"))) {
            ZVal.putArrayElement(method, "path", ZVal.getElement(method, "restPath"));
        }

        servicePath =
                ZVal.assign(
                        ZVal.getProperty(
                                ZVal.getProperty(this, Google_ServiceResource.class, "service"),
                                Google_ServiceResource.class,
                                "servicePath"));
        contentType = false;
        if (ZVal.isset(ZVal.getElement(method, "mediaUpload"))) {
            media = Google_MediaFileUpload.process(env, postBody, parameters);
            if (ZVal.isTrue(media)) {
                contentType =
                        ZVal.assign(
                                ZVal.isset(ZVal.getElement(media, "content-type"))
                                        ? ZVal.getElement(media, "content-type")
                                        : ZVal.getNull());
                postBody =
                        ZVal.assign(
                                ZVal.isset(ZVal.getElement(media, "postBody"))
                                        ? ZVal.getElement(media, "postBody")
                                        : ZVal.getNull());
                servicePath =
                        ZVal.assign(
                                ZVal.getElementRecursive(
                                        method, "mediaUpload", "protocols", "simple", "path"));
                ZVal.putArrayElement(method, "path", "");
            }
        }

        url =
                Google_REST.createRequestUri(
                        env, servicePath, ZVal.getElement(method, "path"), parameters);
        httpRequest =
                new Google_HttpRequest(
                        env, url, ZVal.getElement(method, "httpMethod"), ZVal.getNull(), postBody);
        if (ZVal.isTrue(postBody)) {
            contentTypeHeader = ZVal.newArray();
            if (ZVal.toBool(ZVal.isset(contentType)) && ZVal.toBool(contentType)) {
                ZVal.putArrayElement(contentTypeHeader, "content-type", contentType);

            } else {
                ZVal.putArrayElement(
                        contentTypeHeader, "content-type", "application/json; charset=UTF-8");
                ZVal.putArrayElement(
                        contentTypeHeader, "content-length", Google_Utils.getStrLen(env, postBody));
            }

            env.callMethod(
                    httpRequest,
                    "setRequestHeaders",
                    Google_ServiceResource.class,
                    contentTypeHeader);
        }

        httpRequest =
                env.callMethod(
                        Google_Client.getRequestStaticProperties(env).auth,
                        "sign",
                        Google_ServiceResource.class,
                        httpRequest);
        if (ZVal.isTrue(Google_Client.getRequestStaticProperties(env).useBatch)) {
            return ZVal.assign(httpRequest);
        }

        if (ZVal.toBool(ZVal.isset(ZVal.getElementRecursive(parameters, "uploadType", "value")))
                && ZVal.toBool(
                        ZVal.equalityCheck(
                                "resumable",
                                ZVal.getElementRecursive(parameters, "uploadType", "value")))) {
            return ZVal.assign(httpRequest);
        }

        return ZVal.assign(Google_REST.execute(env, httpRequest));
    }

    public Object useObjects(RuntimeEnv env, Object... args) {
        Object apiConfig = env.getGlobal("apiConfig");
        ;

        return env.returnWithGlobals(
                ZVal.toBool(ZVal.isset(ZVal.getElement(apiConfig, "use_objects")))
                        && ZVal.toBool(ZVal.getElement(apiConfig, "use_objects")),
                "apiConfig",
                apiConfig);
    }

    protected Object stripNull(RuntimeEnv env, Object... args) {
        Object o = ZVal.assignParameter(args, 0, null);
        if (ZVal.isNull(o)) {
            o = ZVal.newArray();
        }
        Object v = null;
        Object k = null;
        o = ZVal.assign(ZVal.assign(o, o));
        for (ZPair zpairResult26 : ZVal.getIterable(o)) {
            k = ZVal.assign(ZVal.assign(k, zpairResult26.getKey()));
            v = ZVal.assign(ZVal.assign(v, zpairResult26.getValue()));
            if (ZVal.toBool(ZVal.strictEqualityCheck(v, "===", ZVal.getNull()))
                    || ZVal.toBool(NamespaceGlobal.strstr.call(env, k, "\u0000*\u0000__"))) {
                ZVal.unsetArrayElement(o, k);

            } else if (ZVal.toBool(NamespaceGlobal.is_object.call(env, v))
                    || ZVal.toBool(NamespaceGlobal.is_array.call(env, v))) {
                env.callMethod(
                        this, "stripNull", Google_ServiceResource.class, ZVal.getElement(o, k));
            }
        }

        return null;
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
