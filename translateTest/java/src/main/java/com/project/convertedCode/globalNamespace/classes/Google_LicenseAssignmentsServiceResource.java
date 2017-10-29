package com.project.convertedCode.globalNamespace.classes;

import com.project.convertedCode.globalNamespace.classes.Google_ServiceResource;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.classes.Google_LicenseAssignmentList;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Google_LicenseAssignment;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_LicensingService.php

*/

public class Google_LicenseAssignmentsServiceResource extends Google_ServiceResource
        implements RuntimeFileContextInterface {

    public Google_LicenseAssignmentsServiceResource(RuntimeEnv env, Object... args) {
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
            case "insert":
                return this.insert(env, args);
            case "get":
                return this.get(env, args);
            case "listForProductAndSku":
                return this.listForProductAndSku(env, args);
            case "listForProduct":
                return this.listForProduct(env, args);
            case "update":
                return this.update(env, args);
            case "patch":
                return this.patch(env, args);
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

    public Object insert(RuntimeEnv env, Object... args) {
        Object productId = ZVal.assignParameter(args, 0, null);
        Object skuId = ZVal.assignParameter(args, 1, null);
        Object postBody = ZVal.assignParameter(args, 2, null);
        Object optParams = ZVal.assignParameter(args, 3, null);
        if (ZVal.isNull(optParams)) {
            optParams = ZVal.newArray();
        }
        Object data = null;
        Object params = null;
        params =
                ZVal.newArray(
                        new ZPair("productId", productId),
                        new ZPair("skuId", skuId),
                        new ZPair("postBody", postBody));
        params = CRArrayF.array_merge.call(env, params, optParams);
        data =
                env.callMethod(
                        this,
                        "__call",
                        Google_LicenseAssignmentsServiceResource.class,
                        "insert",
                        ZVal.newArray(new ZPair(0, params)));
        if (ZVal.isTrue(
                env.callMethod(
                        this, "useObjects", Google_LicenseAssignmentsServiceResource.class))) {
            return ZVal.assign(new Google_LicenseAssignment(env, data));

        } else {
            return ZVal.assign(data);
        }
    }

    public Object get(RuntimeEnv env, Object... args) {
        Object productId = ZVal.assignParameter(args, 0, null);
        Object skuId = ZVal.assignParameter(args, 1, null);
        Object userId = ZVal.assignParameter(args, 2, null);
        Object optParams = ZVal.assignParameter(args, 3, null);
        if (ZVal.isNull(optParams)) {
            optParams = ZVal.newArray();
        }
        Object data = null;
        Object params = null;
        params =
                ZVal.newArray(
                        new ZPair("productId", productId),
                        new ZPair("skuId", skuId),
                        new ZPair("userId", userId));
        params = CRArrayF.array_merge.call(env, params, optParams);
        data =
                env.callMethod(
                        this,
                        "__call",
                        Google_LicenseAssignmentsServiceResource.class,
                        "get",
                        ZVal.newArray(new ZPair(0, params)));
        if (ZVal.isTrue(
                env.callMethod(
                        this, "useObjects", Google_LicenseAssignmentsServiceResource.class))) {
            return ZVal.assign(new Google_LicenseAssignment(env, data));

        } else {
            return ZVal.assign(data);
        }
    }

    public Object listForProductAndSku(RuntimeEnv env, Object... args) {
        Object productId = ZVal.assignParameter(args, 0, null);
        Object skuId = ZVal.assignParameter(args, 1, null);
        Object customerId = ZVal.assignParameter(args, 2, null);
        Object optParams = ZVal.assignParameter(args, 3, null);
        if (ZVal.isNull(optParams)) {
            optParams = ZVal.newArray();
        }
        Object data = null;
        Object params = null;
        params =
                ZVal.newArray(
                        new ZPair("productId", productId),
                        new ZPair("skuId", skuId),
                        new ZPair("customerId", customerId));
        params = CRArrayF.array_merge.call(env, params, optParams);
        data =
                env.callMethod(
                        this,
                        "__call",
                        Google_LicenseAssignmentsServiceResource.class,
                        "listForProductAndSku",
                        ZVal.newArray(new ZPair(0, params)));
        if (ZVal.isTrue(
                env.callMethod(
                        this, "useObjects", Google_LicenseAssignmentsServiceResource.class))) {
            return ZVal.assign(new Google_LicenseAssignmentList(env, data));

        } else {
            return ZVal.assign(data);
        }
    }

    public Object listForProduct(RuntimeEnv env, Object... args) {
        Object productId = ZVal.assignParameter(args, 0, null);
        Object customerId = ZVal.assignParameter(args, 1, null);
        Object optParams = ZVal.assignParameter(args, 2, null);
        if (ZVal.isNull(optParams)) {
            optParams = ZVal.newArray();
        }
        Object data = null;
        Object params = null;
        params =
                ZVal.newArray(
                        new ZPair("productId", productId), new ZPair("customerId", customerId));
        params = CRArrayF.array_merge.call(env, params, optParams);
        data =
                env.callMethod(
                        this,
                        "__call",
                        Google_LicenseAssignmentsServiceResource.class,
                        "listForProduct",
                        ZVal.newArray(new ZPair(0, params)));
        if (ZVal.isTrue(
                env.callMethod(
                        this, "useObjects", Google_LicenseAssignmentsServiceResource.class))) {
            return ZVal.assign(new Google_LicenseAssignmentList(env, data));

        } else {
            return ZVal.assign(data);
        }
    }

    public Object update(RuntimeEnv env, Object... args) {
        Object productId = ZVal.assignParameter(args, 0, null);
        Object skuId = ZVal.assignParameter(args, 1, null);
        Object userId = ZVal.assignParameter(args, 2, null);
        Object postBody = ZVal.assignParameter(args, 3, null);
        Object optParams = ZVal.assignParameter(args, 4, null);
        if (ZVal.isNull(optParams)) {
            optParams = ZVal.newArray();
        }
        Object data = null;
        Object params = null;
        params =
                ZVal.newArray(
                        new ZPair("productId", productId),
                        new ZPair("skuId", skuId),
                        new ZPair("userId", userId),
                        new ZPair("postBody", postBody));
        params = CRArrayF.array_merge.call(env, params, optParams);
        data =
                env.callMethod(
                        this,
                        "__call",
                        Google_LicenseAssignmentsServiceResource.class,
                        "update",
                        ZVal.newArray(new ZPair(0, params)));
        if (ZVal.isTrue(
                env.callMethod(
                        this, "useObjects", Google_LicenseAssignmentsServiceResource.class))) {
            return ZVal.assign(new Google_LicenseAssignment(env, data));

        } else {
            return ZVal.assign(data);
        }
    }

    public Object patch(RuntimeEnv env, Object... args) {
        Object productId = ZVal.assignParameter(args, 0, null);
        Object skuId = ZVal.assignParameter(args, 1, null);
        Object userId = ZVal.assignParameter(args, 2, null);
        Object postBody = ZVal.assignParameter(args, 3, null);
        Object optParams = ZVal.assignParameter(args, 4, null);
        if (ZVal.isNull(optParams)) {
            optParams = ZVal.newArray();
        }
        Object data = null;
        Object params = null;
        params =
                ZVal.newArray(
                        new ZPair("productId", productId),
                        new ZPair("skuId", skuId),
                        new ZPair("userId", userId),
                        new ZPair("postBody", postBody));
        params = CRArrayF.array_merge.call(env, params, optParams);
        data =
                env.callMethod(
                        this,
                        "__call",
                        Google_LicenseAssignmentsServiceResource.class,
                        "patch",
                        ZVal.newArray(new ZPair(0, params)));
        if (ZVal.isTrue(
                env.callMethod(
                        this, "useObjects", Google_LicenseAssignmentsServiceResource.class))) {
            return ZVal.assign(new Google_LicenseAssignment(env, data));

        } else {
            return ZVal.assign(data);
        }
    }

    public Object delete(RuntimeEnv env, Object... args) {
        Object productId = ZVal.assignParameter(args, 0, null);
        Object skuId = ZVal.assignParameter(args, 1, null);
        Object userId = ZVal.assignParameter(args, 2, null);
        Object optParams = ZVal.assignParameter(args, 3, null);
        if (ZVal.isNull(optParams)) {
            optParams = ZVal.newArray();
        }
        Object data = null;
        Object params = null;
        params =
                ZVal.newArray(
                        new ZPair("productId", productId),
                        new ZPair("skuId", skuId),
                        new ZPair("userId", userId));
        params = CRArrayF.array_merge.call(env, params, optParams);
        data =
                env.callMethod(
                        this,
                        "__call",
                        Google_LicenseAssignmentsServiceResource.class,
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
