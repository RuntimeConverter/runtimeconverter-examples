package com.project.convertedCode.globalNamespace.classes;

import com.project.convertedCode.globalNamespace.classes.Google_Annotationsdata;
import com.project.convertedCode.globalNamespace.classes.Google_ServiceResource;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Google_Annotationdata;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_BooksService.php

*/

public class Google_LayersAnnotationDataServiceResource extends Google_ServiceResource
        implements RuntimeFileContextInterface {

    public Google_LayersAnnotationDataServiceResource(RuntimeEnv env, Object... args) {
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
            case "listLayersAnnotationData":
                return this.listLayersAnnotationData(env, args);
            case "get":
                return this.get(env, args);
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

    public Object listLayersAnnotationData(RuntimeEnv env, Object... args) {
        Object volumeId = ZVal.assignParameter(args, 0, null);
        Object layerId = ZVal.assignParameter(args, 1, null);
        Object contentVersion = ZVal.assignParameter(args, 2, null);
        Object optParams = ZVal.assignParameter(args, 3, null);
        if (ZVal.isNull(optParams)) {
            optParams = ZVal.newArray();
        }
        Object data = null;
        Object params = null;
        params =
                ZVal.newArray(
                        new ZPair("volumeId", volumeId),
                        new ZPair("layerId", layerId),
                        new ZPair("contentVersion", contentVersion));
        params = CRArrayF.array_merge.call(env, params, optParams);
        data =
                env.callMethod(
                        this,
                        "__call",
                        Google_LayersAnnotationDataServiceResource.class,
                        "list",
                        ZVal.newArray(new ZPair(0, params)));
        if (ZVal.isTrue(
                env.callMethod(
                        this, "useObjects", Google_LayersAnnotationDataServiceResource.class))) {
            return ZVal.assign(new Google_Annotationsdata(env, data));

        } else {
            return ZVal.assign(data);
        }
    }

    public Object get(RuntimeEnv env, Object... args) {
        Object volumeId = ZVal.assignParameter(args, 0, null);
        Object layerId = ZVal.assignParameter(args, 1, null);
        Object annotationDataId = ZVal.assignParameter(args, 2, null);
        Object contentVersion = ZVal.assignParameter(args, 3, null);
        Object optParams = ZVal.assignParameter(args, 4, null);
        if (ZVal.isNull(optParams)) {
            optParams = ZVal.newArray();
        }
        Object data = null;
        Object params = null;
        params =
                ZVal.newArray(
                        new ZPair("volumeId", volumeId),
                        new ZPair("layerId", layerId),
                        new ZPair("annotationDataId", annotationDataId),
                        new ZPair("contentVersion", contentVersion));
        params = CRArrayF.array_merge.call(env, params, optParams);
        data =
                env.callMethod(
                        this,
                        "__call",
                        Google_LayersAnnotationDataServiceResource.class,
                        "get",
                        ZVal.newArray(new ZPair(0, params)));
        if (ZVal.isTrue(
                env.callMethod(
                        this, "useObjects", Google_LayersAnnotationDataServiceResource.class))) {
            return ZVal.assign(new Google_Annotationdata(env, data));

        } else {
            return ZVal.assign(data);
        }
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
