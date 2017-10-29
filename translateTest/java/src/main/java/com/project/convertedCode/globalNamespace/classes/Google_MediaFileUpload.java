package com.project.convertedCode.globalNamespace.classes;

import com.project.convertedCode.globalNamespace.classes.Google_Client;
import com.project.convertedCode.globalNamespace.classes.Google_Exception;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Google_Utils;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.classes.Google_HttpRequest;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.classes.Google_REST;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/service/Google_MediaFileUpload.php

*/

public class Google_MediaFileUpload extends RuntimeClassBase
        implements RuntimeFileContextInterface {

    public Object mimeType = null;

    public Object data = null;

    public Object resumable = null;

    public Object chunkSize = null;

    public Object size = null;

    public Object resumeUri = null;

    public Object progress = null;

    public Google_MediaFileUpload(RuntimeEnv env, Object... args) {
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
            case "nextChunk":
                return this.nextChunk(env, args);
            case "getResumeUri":
                if (Google_MediaFileUpload.class.equals(caller)) {

                    return this.getResumeUri(env, args);
                }
                break;
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "mimeType":
                return this.mimeType;
            case "data":
                return this.data;
            case "resumable":
                return this.resumable;
            case "chunkSize":
                return this.chunkSize;
            case "size":
                return this.size;
            case "resumeUri":
                return this.resumeUri;
            case "progress":
                return this.progress;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "mimeType":
                return ZVal.isNull(this.mimeType);
            case "data":
                return ZVal.isNull(this.data);
            case "resumable":
                return ZVal.isNull(this.resumable);
            case "chunkSize":
                return ZVal.isNull(this.chunkSize);
            case "size":
                return ZVal.isNull(this.size);
            case "resumeUri":
                return ZVal.isNull(this.resumeUri);
            case "progress":
                return ZVal.isNull(this.progress);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "mimeType":
                this.mimeType = value;
                break;
            case "data":
                this.data = value;
                break;
            case "resumable":
                this.resumable = value;
                break;
            case "chunkSize":
                this.chunkSize = value;
                break;
            case "size":
                this.size = value;
                break;
            case "resumeUri":
                this.resumeUri = value;
                break;
            case "progress":
                this.progress = value;
                break;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object mimeType = ZVal.assignParameter(args, 0, null);
        Object data = ZVal.assignParameter(args, 1, null);
        Object resumable = ZVal.assignParameter(args, 2, null);
        if (ZVal.isNull(resumable)) {
            resumable = false;
        }
        Object chunkSize = ZVal.assignParameter(args, 3, null);
        if (ZVal.isNull(chunkSize)) {
            chunkSize = false;
        }
        ZVal.setProperty(this, Google_MediaFileUpload.class, "mimeType", mimeType);
        ZVal.setProperty(this, Google_MediaFileUpload.class, "data", data);
        ZVal.setProperty(
                this,
                Google_MediaFileUpload.class,
                "size",
                NamespaceGlobal.strlen.call(
                        env, ZVal.getProperty(this, Google_MediaFileUpload.class, "data")));
        ZVal.setProperty(this, Google_MediaFileUpload.class, "resumable", resumable);
        if (!ZVal.isTrue(chunkSize)) {
            ZVal.setProperty(
                    this, Google_MediaFileUpload.class, "chunkSize", ZVal.multiply(256, 1024));
        }

        ZVal.setProperty(this, Google_MediaFileUpload.class, "progress", 0);

        return null;
    }

    public Object nextChunk(RuntimeEnv env, Object... args) {
        Object req = ZVal.assignParameter(args, 0, null);
        Object headers = null;
        Object code = null;
        Object data = null;
        Object response = null;
        Object range = ZVal.newArray();
        Object lastBytePos = null;
        Object httpRequest = null;
        if (ZVal.equalityCheck(
                false, ZVal.getProperty(this, Google_MediaFileUpload.class, "resumeUri"))) {
            ZVal.setProperty(
                    this,
                    Google_MediaFileUpload.class,
                    "resumeUri",
                    env.callMethod(this, "getResumeUri", Google_MediaFileUpload.class, req));
        }

        data =
                NamespaceGlobal.substr.call(
                        env,
                        ZVal.getProperty(this, Google_MediaFileUpload.class, "data"),
                        ZVal.getProperty(this, Google_MediaFileUpload.class, "progress"),
                        ZVal.getProperty(this, Google_MediaFileUpload.class, "chunkSize"));
        lastBytePos =
                ZVal.subtract(
                        ZVal.add(
                                ZVal.getProperty(this, Google_MediaFileUpload.class, "progress"),
                                NamespaceGlobal.strlen.call(env, data)),
                        1);
        headers =
                ZVal.newArray(
                        new ZPair(
                                "content-range",
                                "bytes "
                                        + ZVal.toString(
                                                ZVal.getProperty(
                                                        this,
                                                        Google_MediaFileUpload.class,
                                                        "progress"))
                                        + "-"
                                        + ZVal.toString(lastBytePos)
                                        + "/"
                                        + ZVal.toString(
                                                ZVal.getProperty(
                                                        this,
                                                        Google_MediaFileUpload.class,
                                                        "size"))),
                        new ZPair(
                                "content-type",
                                env.callMethod(
                                        req,
                                        "getRequestHeader",
                                        Google_MediaFileUpload.class,
                                        "content-type")),
                        new ZPair(
                                "content-length",
                                ZVal.getProperty(this, Google_MediaFileUpload.class, "chunkSize")),
                        new ZPair("expect", ""));
        httpRequest =
                new Google_HttpRequest(
                        env,
                        ZVal.getProperty(this, Google_MediaFileUpload.class, "resumeUri"),
                        "PUT",
                        headers,
                        data);
        response =
                env.callMethod(
                        Google_Client.getRequestStaticProperties(env).io,
                        "authenticatedRequest",
                        Google_MediaFileUpload.class,
                        httpRequest);
        code = env.callMethod(response, "getResponseHttpCode", Google_MediaFileUpload.class);
        if (ZVal.equalityCheck(308, code)) {
            range =
                    NamespaceGlobal.explode.call(
                            env,
                            "-",
                            env.callMethod(
                                    response,
                                    "getResponseHeader",
                                    Google_MediaFileUpload.class,
                                    "range"));
            ZVal.setProperty(
                    this,
                    Google_MediaFileUpload.class,
                    "progress",
                    ZVal.add(ZVal.getElement(range, 1), 1));
            return ZVal.assign(false);

        } else {
            return ZVal.assign(Google_REST.decodeHttpResponse(env, response));
        }
    }

    private Object getResumeUri(RuntimeEnv env, Object... args) {
        Object httpRequest = ZVal.assignParameter(args, 0, null);
        Object result = null;
        Object code = null;
        Object response = null;
        Object location = null;
        Object body = null;
        result = ZVal.getNull();
        body = env.callMethod(httpRequest, "getPostBody", Google_MediaFileUpload.class);
        if (ZVal.isTrue(body)) {
            env.callMethod(
                    httpRequest,
                    "setRequestHeaders",
                    Google_MediaFileUpload.class,
                    ZVal.newArray(
                            new ZPair("content-type", "application/json; charset=UTF-8"),
                            new ZPair("content-length", Google_Utils.getStrLen(env, body)),
                            new ZPair(
                                    "x-upload-content-type",
                                    ZVal.getProperty(
                                            this, Google_MediaFileUpload.class, "mimeType")),
                            new ZPair("expect", "")));
        }

        response =
                env.callMethod(
                        Google_Client.getRequestStaticProperties(env).io,
                        "makeRequest",
                        Google_MediaFileUpload.class,
                        httpRequest);
        location =
                env.callMethod(
                        response, "getResponseHeader", Google_MediaFileUpload.class, "location");
        code = env.callMethod(response, "getResponseHttpCode", Google_MediaFileUpload.class);
        if (ZVal.toBool(ZVal.equalityCheck(200, code))
                && ZVal.toBool(ZVal.equalityCheck(true, location))) {
            return ZVal.assign(location);
        }

        throw new Google_Exception(env, "Failed to start the resumable upload");
    }

    public static Object process(RuntimeEnv env, Object... args) {
        Object meta = ZVal.assignParameter(args, 0, null);
        Object params = ZVal.assignParameter(args, 1, null);
        if (ZVal.isNull(params)) {
            params = ZVal.newArray();
        }
        Object boundary = null;
        Object file = null;
        Object data = null;
        Object related = null;
        Object payload = ZVal.newArray();
        Object uploadType = null;
        Object mimeType = null;
        payload = ZVal.assign(payload, ZVal.newArray());
        meta =
                ZVal.assign(
                        ZVal.assign(
                                meta,
                                ZVal.isTrue(NamespaceGlobal.is_string.call(env, meta))
                                        ? NamespaceGlobal.json_decode.call(env, meta, true)
                                        : meta));
        uploadType = ZVal.assign(uploadType, getUploadType(env, meta, payload, params));
        if (!ZVal.isTrue(uploadType)) {
            return ZVal.assign(false);
        }

        ZVal.putArrayElement(
                params,
                "uploadType",
                ZVal.newArray(
                        new ZPair("type", "string"),
                        new ZPair("location", "query"),
                        new ZPair("value", uploadType)));
        if (ZVal.isset(ZVal.getElement(params, "file"))) {
            file =
                    ZVal.assign(
                            ZVal.assign(file, ZVal.getElementRecursive(params, "file", "value")));
            ZVal.unsetArrayElement(params, "file");
            return ZVal.assign(processFileUpload(env, file));
        }

        mimeType =
                ZVal.assign(
                        ZVal.assign(
                                mimeType,
                                ZVal.isset(ZVal.getElement(params, "mimeType"))
                                        ? ZVal.getElementRecursive(params, "mimeType", "value")
                                        : false));
        ZVal.unsetArrayElement(params, "mimeType");
        data =
                ZVal.assign(
                        ZVal.assign(
                                data,
                                ZVal.isset(ZVal.getElement(params, "data"))
                                        ? ZVal.getElementRecursive(params, "data", "value")
                                        : false));
        ZVal.unsetArrayElement(params, "data");
        if (ZVal.equalityCheck(CONST_UPLOAD_RESUMABLE_TYPE, uploadType)) {
            ZVal.putArrayElement(payload, "content-type", mimeType);

        } else if (ZVal.equalityCheck(CONST_UPLOAD_MEDIA_TYPE, uploadType)) {
            ZVal.putArrayElement(payload, "content-type", mimeType);
            ZVal.putArrayElement(payload, "postBody", data);

        } else if (ZVal.equalityCheck(CONST_UPLOAD_MULTIPART_TYPE, uploadType)) {
            boundary =
                    ZVal.assign(
                            ZVal.assign(
                                    boundary,
                                    ZVal.isset(
                                                    ZVal.getElementRecursive(
                                                            params, "boundary", "value"))
                                            ? ZVal.getElementRecursive(params, "boundary", "value")
                                            : NamespaceGlobal.mt_rand.call(env)));
            boundary =
                    ZVal.assign(
                            boundary,
                            NamespaceGlobal.str_replace.call(
                                    env, new RuntimeArgsWithReferences(), "\"", "", boundary));
            ZVal.putArrayElement(
                    payload,
                    "content-type",
                    "multipart/related; boundary=" + ZVal.toString(boundary));
            related = ZVal.assign(ZVal.assign(related, "--" + ZVal.toString(boundary) + "\r\n"));
            related =
                    ZVal.assign(
                            related,
                            ZVal.toString(related)
                                    + "Content-Type: application/json; charset=UTF-8\r\n");
            related =
                    ZVal.assign(
                            related,
                            ZVal.toString(related)
                                    + ZVal.toString(
                                            ZVal.toString(
                                                            "\r\n"
                                                                    + ZVal.toString(
                                                                            NamespaceGlobal
                                                                                    .json_encode
                                                                                    .call(
                                                                                            env,
                                                                                            meta)))
                                                    + "\r\n"));
            related =
                    ZVal.assign(
                            related,
                            ZVal.toString(related)
                                    + ZVal.toString("--" + ZVal.toString(boundary) + "\r\n"));
            related =
                    ZVal.assign(
                            related,
                            ZVal.toString(related)
                                    + ZVal.toString(
                                            "Content-Type: " + ZVal.toString(mimeType) + "\r\n"));
            related =
                    ZVal.assign(
                            related,
                            ZVal.toString(related) + "Content-Transfer-Encoding: base64\r\n");
            related =
                    ZVal.assign(
                            related,
                            ZVal.toString(related)
                                    + ZVal.toString(
                                            ZVal.toString(
                                                            "\r\n"
                                                                    + ZVal.toString(
                                                                            NamespaceGlobal
                                                                                    .base64_encode
                                                                                    .call(
                                                                                            env,
                                                                                            data)))
                                                    + "\r\n"));
            related =
                    ZVal.assign(
                            related,
                            ZVal.toString(related)
                                    + ZVal.toString("--" + ZVal.toString(boundary) + "--"));
            ZVal.putArrayElement(payload, "postBody", related);
        }

        return ZVal.assign(payload);
    }

    public static Object processFileUpload(RuntimeEnv env, Object... args) {
        Object file = ZVal.assignParameter(args, 0, null);
        if (!ZVal.isTrue(file)) {
            return ZVal.assign(ZVal.newArray());
        }

        if (ZVal.notEqualityCheck(NamespaceGlobal.substr.call(env, file, 0, 1), "@")) {
            file = "@" + ZVal.toString(file);
        }

        return ZVal.assign(
                ZVal.newArray(new ZPair("postBody", ZVal.newArray(new ZPair("file", file)))));
    }

    public static Object getUploadType(RuntimeEnv env, Object... args) {
        Object meta = ZVal.assignParameter(args, 0, null);
        Object payload = ZVal.assignParameter(args, 1, null);
        if (ZVal.isNull(payload)) {
            payload = ZVal.newArray();
        }
        Object params = ZVal.assignParameter(args, 2, null);
        if (ZVal.isNull(params)) {
            params = ZVal.newArray();
        }
        Object data = null;
        Object upload = null;
        if (ZVal.toBool(ZVal.isset(ZVal.getElement(params, "mediaUpload")))
                && ZVal.toBool(
                        ZVal.equalityCheck(
                                NamespaceGlobal.get_class.call(
                                        env,
                                        ZVal.getElementRecursive(params, "mediaUpload", "value")),
                                "Google_MediaFileUpload"))) {
            upload =
                    ZVal.assign(
                            ZVal.assign(
                                    upload,
                                    ZVal.getElementRecursive(params, "mediaUpload", "value")));
            ZVal.unsetArrayElement(params, "mediaUpload");
            ZVal.putArrayElement(
                    payload,
                    "content-type",
                    ZVal.getProperty(upload, Google_MediaFileUpload.class, "mimeType"));
            if (ZVal.toBool(
                            ZVal.isset(
                                    ZVal.getProperty(
                                            upload, Google_MediaFileUpload.class, "resumable")))
                    && ZVal.toBool(
                            ZVal.getProperty(upload, Google_MediaFileUpload.class, "resumable"))) {
                return ZVal.assign(CONST_UPLOAD_RESUMABLE_TYPE);
            }
        }

        if (ZVal.isset(ZVal.getElement(params, "uploadType"))) {
            return ZVal.assign(ZVal.getElementRecursive(params, "uploadType", "value"));
        }

        data =
                ZVal.assign(
                        ZVal.assign(
                                data,
                                ZVal.isset(ZVal.getElementRecursive(params, "data", "value"))
                                        ? ZVal.getElementRecursive(params, "data", "value")
                                        : false));
        if (ZVal.toBool(ZVal.equalityCheck(false, data))
                && ZVal.toBool(
                        ZVal.equalityCheck(false, ZVal.isset(ZVal.getElement(params, "file"))))) {
            return ZVal.assign(false);
        }

        if (ZVal.isset(ZVal.getElement(params, "file"))) {
            return ZVal.assign(CONST_UPLOAD_MEDIA_TYPE);
        }

        if (ZVal.equalityCheck(false, meta)) {
            return ZVal.assign(CONST_UPLOAD_MEDIA_TYPE);
        }

        return ZVal.assign(CONST_UPLOAD_MULTIPART_TYPE);
    }

    public static final Object CONST_UPLOAD_MEDIA_TYPE = "media";

    public static final Object CONST_UPLOAD_MULTIPART_TYPE = "multipart";

    public static final Object CONST_UPLOAD_RESUMABLE_TYPE = "resumable";

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
