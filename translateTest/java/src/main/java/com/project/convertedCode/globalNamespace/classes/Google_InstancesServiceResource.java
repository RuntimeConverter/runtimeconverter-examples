package com.project.convertedCode.globalNamespace.classes;

import com.project.convertedCode.globalNamespace.classes.Google_ServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_Operation;
import com.project.convertedCode.globalNamespace.classes.Google_Instance;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Google_InstanceList;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_ComputeService.php

*/

public class Google_InstancesServiceResource extends Google_ServiceResource
        implements RuntimeFileContextInterface {

    public Google_InstancesServiceResource(RuntimeEnv env, Object... args) {
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
            case "deleteAccessConfig":
                return this.deleteAccessConfig(env, args);
            case "get":
                return this.get(env, args);
            case "listInstances":
                return this.listInstances(env, args);
            case "addAccessConfig":
                return this.addAccessConfig(env, args);
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
        Object project = ZVal.assignParameter(args, 0, null);
        Object postBody = ZVal.assignParameter(args, 1, null);
        Object optParams = ZVal.assignParameter(args, 2, null);
        if (ZVal.isNull(optParams)) {
            optParams = ZVal.newArray();
        }
        Object data = null;
        Object params = null;
        params = ZVal.newArray(new ZPair("project", project), new ZPair("postBody", postBody));
        params = CRArrayF.array_merge.call(env, params, optParams);
        data =
                env.callMethod(
                        this,
                        "__call",
                        Google_InstancesServiceResource.class,
                        "insert",
                        ZVal.newArray(new ZPair(0, params)));
        if (ZVal.isTrue(
                env.callMethod(this, "useObjects", Google_InstancesServiceResource.class))) {
            return ZVal.assign(new Google_Operation(env, data));

        } else {
            return ZVal.assign(data);
        }
    }

    public Object deleteAccessConfig(RuntimeEnv env, Object... args) {
        Object project = ZVal.assignParameter(args, 0, null);
        Object instance = ZVal.assignParameter(args, 1, null);
        Object access_config = ZVal.assignParameter(args, 2, null);
        Object network_interface = ZVal.assignParameter(args, 3, null);
        Object optParams = ZVal.assignParameter(args, 4, null);
        if (ZVal.isNull(optParams)) {
            optParams = ZVal.newArray();
        }
        Object data = null;
        Object params = null;
        params =
                ZVal.newArray(
                        new ZPair("project", project),
                        new ZPair("instance", instance),
                        new ZPair("access_config", access_config),
                        new ZPair("network_interface", network_interface));
        params = CRArrayF.array_merge.call(env, params, optParams);
        data =
                env.callMethod(
                        this,
                        "__call",
                        Google_InstancesServiceResource.class,
                        "deleteAccessConfig",
                        ZVal.newArray(new ZPair(0, params)));
        if (ZVal.isTrue(
                env.callMethod(this, "useObjects", Google_InstancesServiceResource.class))) {
            return ZVal.assign(new Google_Operation(env, data));

        } else {
            return ZVal.assign(data);
        }
    }

    public Object get(RuntimeEnv env, Object... args) {
        Object project = ZVal.assignParameter(args, 0, null);
        Object instance = ZVal.assignParameter(args, 1, null);
        Object optParams = ZVal.assignParameter(args, 2, null);
        if (ZVal.isNull(optParams)) {
            optParams = ZVal.newArray();
        }
        Object data = null;
        Object params = null;
        params = ZVal.newArray(new ZPair("project", project), new ZPair("instance", instance));
        params = CRArrayF.array_merge.call(env, params, optParams);
        data =
                env.callMethod(
                        this,
                        "__call",
                        Google_InstancesServiceResource.class,
                        "get",
                        ZVal.newArray(new ZPair(0, params)));
        if (ZVal.isTrue(
                env.callMethod(this, "useObjects", Google_InstancesServiceResource.class))) {
            return ZVal.assign(new Google_Instance(env, data));

        } else {
            return ZVal.assign(data);
        }
    }

    public Object listInstances(RuntimeEnv env, Object... args) {
        Object project = ZVal.assignParameter(args, 0, null);
        Object optParams = ZVal.assignParameter(args, 1, null);
        if (ZVal.isNull(optParams)) {
            optParams = ZVal.newArray();
        }
        Object data = null;
        Object params = null;
        params = ZVal.newArray(new ZPair("project", project));
        params = CRArrayF.array_merge.call(env, params, optParams);
        data =
                env.callMethod(
                        this,
                        "__call",
                        Google_InstancesServiceResource.class,
                        "list",
                        ZVal.newArray(new ZPair(0, params)));
        if (ZVal.isTrue(
                env.callMethod(this, "useObjects", Google_InstancesServiceResource.class))) {
            return ZVal.assign(new Google_InstanceList(env, data));

        } else {
            return ZVal.assign(data);
        }
    }

    public Object addAccessConfig(RuntimeEnv env, Object... args) {
        Object project = ZVal.assignParameter(args, 0, null);
        Object instance = ZVal.assignParameter(args, 1, null);
        Object network_interface = ZVal.assignParameter(args, 2, null);
        Object postBody = ZVal.assignParameter(args, 3, null);
        Object optParams = ZVal.assignParameter(args, 4, null);
        if (ZVal.isNull(optParams)) {
            optParams = ZVal.newArray();
        }
        Object data = null;
        Object params = null;
        params =
                ZVal.newArray(
                        new ZPair("project", project),
                        new ZPair("instance", instance),
                        new ZPair("network_interface", network_interface),
                        new ZPair("postBody", postBody));
        params = CRArrayF.array_merge.call(env, params, optParams);
        data =
                env.callMethod(
                        this,
                        "__call",
                        Google_InstancesServiceResource.class,
                        "addAccessConfig",
                        ZVal.newArray(new ZPair(0, params)));
        if (ZVal.isTrue(
                env.callMethod(this, "useObjects", Google_InstancesServiceResource.class))) {
            return ZVal.assign(new Google_Operation(env, data));

        } else {
            return ZVal.assign(data);
        }
    }

    public Object delete(RuntimeEnv env, Object... args) {
        Object project = ZVal.assignParameter(args, 0, null);
        Object instance = ZVal.assignParameter(args, 1, null);
        Object optParams = ZVal.assignParameter(args, 2, null);
        if (ZVal.isNull(optParams)) {
            optParams = ZVal.newArray();
        }
        Object data = null;
        Object params = null;
        params = ZVal.newArray(new ZPair("project", project), new ZPair("instance", instance));
        params = CRArrayF.array_merge.call(env, params, optParams);
        data =
                env.callMethod(
                        this,
                        "__call",
                        Google_InstancesServiceResource.class,
                        "delete",
                        ZVal.newArray(new ZPair(0, params)));
        if (ZVal.isTrue(
                env.callMethod(this, "useObjects", Google_InstancesServiceResource.class))) {
            return ZVal.assign(new Google_Operation(env, data));

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
