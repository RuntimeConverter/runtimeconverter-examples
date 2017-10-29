package com.project.convertedCode.globalNamespace.classes;

import com.project.convertedCode.globalNamespace.classes.Google_Volumes;
import com.project.convertedCode.globalNamespace.classes.Google_ServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_RequestAccess;
import com.project.convertedCode.globalNamespace.classes.Google_DownloadAccesses;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
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

public class Google_MyconfigServiceResource extends Google_ServiceResource
        implements RuntimeFileContextInterface {

    public Google_MyconfigServiceResource(RuntimeEnv env, Object... args) {
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
            case "releaseDownloadAccess":
                return this.releaseDownloadAccess(env, args);
            case "requestAccess":
                return this.requestAccess(env, args);
            case "syncVolumeLicenses":
                return this.syncVolumeLicenses(env, args);
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

    public Object releaseDownloadAccess(RuntimeEnv env, Object... args) {
        Object volumeIds = ZVal.assignParameter(args, 0, null);
        Object cpksver = ZVal.assignParameter(args, 1, null);
        Object optParams = ZVal.assignParameter(args, 2, null);
        if (ZVal.isNull(optParams)) {
            optParams = ZVal.newArray();
        }
        Object data = null;
        Object params = null;
        params = ZVal.newArray(new ZPair("volumeIds", volumeIds), new ZPair("cpksver", cpksver));
        params = CRArrayF.array_merge.call(env, params, optParams);
        data =
                env.callMethod(
                        this,
                        "__call",
                        Google_MyconfigServiceResource.class,
                        "releaseDownloadAccess",
                        ZVal.newArray(new ZPair(0, params)));
        if (ZVal.isTrue(env.callMethod(this, "useObjects", Google_MyconfigServiceResource.class))) {
            return ZVal.assign(new Google_DownloadAccesses(env, data));

        } else {
            return ZVal.assign(data);
        }
    }

    public Object requestAccess(RuntimeEnv env, Object... args) {
        Object source = ZVal.assignParameter(args, 0, null);
        Object volumeId = ZVal.assignParameter(args, 1, null);
        Object nonce = ZVal.assignParameter(args, 2, null);
        Object cpksver = ZVal.assignParameter(args, 3, null);
        Object optParams = ZVal.assignParameter(args, 4, null);
        if (ZVal.isNull(optParams)) {
            optParams = ZVal.newArray();
        }
        Object data = null;
        Object params = null;
        params =
                ZVal.newArray(
                        new ZPair("source", source),
                        new ZPair("volumeId", volumeId),
                        new ZPair("nonce", nonce),
                        new ZPair("cpksver", cpksver));
        params = CRArrayF.array_merge.call(env, params, optParams);
        data =
                env.callMethod(
                        this,
                        "__call",
                        Google_MyconfigServiceResource.class,
                        "requestAccess",
                        ZVal.newArray(new ZPair(0, params)));
        if (ZVal.isTrue(env.callMethod(this, "useObjects", Google_MyconfigServiceResource.class))) {
            return ZVal.assign(new Google_RequestAccess(env, data));

        } else {
            return ZVal.assign(data);
        }
    }

    public Object syncVolumeLicenses(RuntimeEnv env, Object... args) {
        Object source = ZVal.assignParameter(args, 0, null);
        Object nonce = ZVal.assignParameter(args, 1, null);
        Object cpksver = ZVal.assignParameter(args, 2, null);
        Object optParams = ZVal.assignParameter(args, 3, null);
        if (ZVal.isNull(optParams)) {
            optParams = ZVal.newArray();
        }
        Object data = null;
        Object params = null;
        params =
                ZVal.newArray(
                        new ZPair("source", source),
                        new ZPair("nonce", nonce),
                        new ZPair("cpksver", cpksver));
        params = CRArrayF.array_merge.call(env, params, optParams);
        data =
                env.callMethod(
                        this,
                        "__call",
                        Google_MyconfigServiceResource.class,
                        "syncVolumeLicenses",
                        ZVal.newArray(new ZPair(0, params)));
        if (ZVal.isTrue(env.callMethod(this, "useObjects", Google_MyconfigServiceResource.class))) {
            return ZVal.assign(new Google_Volumes(env, data));

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
