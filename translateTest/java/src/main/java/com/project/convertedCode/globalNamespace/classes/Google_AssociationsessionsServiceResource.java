package com.project.convertedCode.globalNamespace.classes;

import com.project.convertedCode.globalNamespace.classes.Google_ServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_AssociationSession;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_AdsensehostService.php

*/

public class Google_AssociationsessionsServiceResource extends Google_ServiceResource
        implements RuntimeFileContextInterface {

    public Google_AssociationsessionsServiceResource(RuntimeEnv env, Object... args) {
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
            case "start":
                return this.start(env, args);
            case "verify":
                return this.verify(env, args);
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

    public Object start(RuntimeEnv env, Object... args) {
        Object productCode = ZVal.assignParameter(args, 0, null);
        Object websiteUrl = ZVal.assignParameter(args, 1, null);
        Object optParams = ZVal.assignParameter(args, 2, null);
        if (ZVal.isNull(optParams)) {
            optParams = ZVal.newArray();
        }
        Object data = null;
        Object params = null;
        params =
                ZVal.newArray(
                        new ZPair("productCode", productCode), new ZPair("websiteUrl", websiteUrl));
        params = CRArrayF.array_merge.call(env, params, optParams);
        data =
                env.callMethod(
                        this,
                        "__call",
                        Google_AssociationsessionsServiceResource.class,
                        "start",
                        ZVal.newArray(new ZPair(0, params)));
        if (ZVal.isTrue(
                env.callMethod(
                        this, "useObjects", Google_AssociationsessionsServiceResource.class))) {
            return ZVal.assign(new Google_AssociationSession(env, data));

        } else {
            return ZVal.assign(data);
        }
    }

    public Object verify(RuntimeEnv env, Object... args) {
        Object token = ZVal.assignParameter(args, 0, null);
        Object optParams = ZVal.assignParameter(args, 1, null);
        if (ZVal.isNull(optParams)) {
            optParams = ZVal.newArray();
        }
        Object data = null;
        Object params = null;
        params = ZVal.newArray(new ZPair("token", token));
        params = CRArrayF.array_merge.call(env, params, optParams);
        data =
                env.callMethod(
                        this,
                        "__call",
                        Google_AssociationsessionsServiceResource.class,
                        "verify",
                        ZVal.newArray(new ZPair(0, params)));
        if (ZVal.isTrue(
                env.callMethod(
                        this, "useObjects", Google_AssociationsessionsServiceResource.class))) {
            return ZVal.assign(new Google_AssociationSession(env, data));

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
