package com.project.convertedCode.globalNamespace.classes;

import com.project.convertedCode.globalNamespace.classes.Google_ServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_Training;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.project.convertedCode.globalNamespace.classes.Google_Output;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_PredictionService.php

*/

public class Google_TrainedmodelsServiceResource extends Google_ServiceResource
        implements RuntimeFileContextInterface {

    public Google_TrainedmodelsServiceResource(RuntimeEnv env, Object... args) {
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
            case "predict":
                return this.predict(env, args);
            case "insert":
                return this.insert(env, args);
            case "get":
                return this.get(env, args);
            case "update":
                return this.update(env, args);
            case "delete":
                return this.delete(env, args);
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

    public Object predict(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        Object postBody = ZVal.assignParameter(args, 1, null);
        Object optParams = ZVal.assignParameter(args, 2, null);
        if (ZVal.isNull(optParams)) {
            optParams = ZVal.newArray();
        }
        Object data = null;
        Object params = null;
        params = ZVal.newArray(new ZPair("id", id), new ZPair("postBody", postBody));
        params = CRArrayF.array_merge.call(env, params, optParams);
        data =
                env.callMethod(
                        this,
                        "__call",
                        Google_TrainedmodelsServiceResource.class,
                        "predict",
                        ZVal.newArray(new ZPair(0, params)));
        if (ZVal.isTrue(
                env.callMethod(this, "useObjects", Google_TrainedmodelsServiceResource.class))) {
            return ZVal.assign(new Google_Output(env, data));

        } else {
            return ZVal.assign(data);
        }
    }

    public Object insert(RuntimeEnv env, Object... args) {
        Object postBody = ZVal.assignParameter(args, 0, null);
        Object optParams = ZVal.assignParameter(args, 1, null);
        if (ZVal.isNull(optParams)) {
            optParams = ZVal.newArray();
        }
        Object data = null;
        Object params = null;
        params = ZVal.newArray(new ZPair("postBody", postBody));
        params = CRArrayF.array_merge.call(env, params, optParams);
        data =
                env.callMethod(
                        this,
                        "__call",
                        Google_TrainedmodelsServiceResource.class,
                        "insert",
                        ZVal.newArray(new ZPair(0, params)));
        if (ZVal.isTrue(
                env.callMethod(this, "useObjects", Google_TrainedmodelsServiceResource.class))) {
            return ZVal.assign(new Google_Training(env, data));

        } else {
            return ZVal.assign(data);
        }
    }

    public Object get(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        Object optParams = ZVal.assignParameter(args, 1, null);
        if (ZVal.isNull(optParams)) {
            optParams = ZVal.newArray();
        }
        Object data = null;
        Object params = null;
        params = ZVal.newArray(new ZPair("id", id));
        params = CRArrayF.array_merge.call(env, params, optParams);
        data =
                env.callMethod(
                        this,
                        "__call",
                        Google_TrainedmodelsServiceResource.class,
                        "get",
                        ZVal.newArray(new ZPair(0, params)));
        if (ZVal.isTrue(
                env.callMethod(this, "useObjects", Google_TrainedmodelsServiceResource.class))) {
            return ZVal.assign(new Google_Training(env, data));

        } else {
            return ZVal.assign(data);
        }
    }

    public Object update(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        Object postBody = ZVal.assignParameter(args, 1, null);
        Object optParams = ZVal.assignParameter(args, 2, null);
        if (ZVal.isNull(optParams)) {
            optParams = ZVal.newArray();
        }
        Object data = null;
        Object params = null;
        params = ZVal.newArray(new ZPair("id", id), new ZPair("postBody", postBody));
        params = CRArrayF.array_merge.call(env, params, optParams);
        data =
                env.callMethod(
                        this,
                        "__call",
                        Google_TrainedmodelsServiceResource.class,
                        "update",
                        ZVal.newArray(new ZPair(0, params)));
        if (ZVal.isTrue(
                env.callMethod(this, "useObjects", Google_TrainedmodelsServiceResource.class))) {
            return ZVal.assign(new Google_Training(env, data));

        } else {
            return ZVal.assign(data);
        }
    }

    public Object delete(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        Object optParams = ZVal.assignParameter(args, 1, null);
        if (ZVal.isNull(optParams)) {
            optParams = ZVal.newArray();
        }
        Object data = null;
        Object params = null;
        params = ZVal.newArray(new ZPair("id", id));
        params = CRArrayF.array_merge.call(env, params, optParams);
        data =
                env.callMethod(
                        this,
                        "__call",
                        Google_TrainedmodelsServiceResource.class,
                        "delete",
                        ZVal.newArray(new ZPair(0, params)));
        return ZVal.assign(data);
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
