package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Google_Model;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_ComputeService.php

*/

public class Google_NetworkInterface extends Google_Model implements RuntimeFileContextInterface {

    public Object network = null;

    public Object __accessConfigsType = "Google_AccessConfig";

    public Object __accessConfigsDataType = "array";

    public Object accessConfigs = null;

    public Object networkIP = null;

    public Object kind = null;

    public Object name = null;

    public Google_NetworkInterface(RuntimeEnv env, Object... args) {
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
            case "setNetwork":
                return this.setNetwork(env, args);
            case "getNetwork":
                return this.getNetwork(env, args);
            case "setAccessConfigs":
                return this.setAccessConfigs(env, args);
            case "getAccessConfigs":
                return this.getAccessConfigs(env, args);
            case "setNetworkIP":
                return this.setNetworkIP(env, args);
            case "getNetworkIP":
                return this.getNetworkIP(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setName":
                return this.setName(env, args);
            case "getName":
                return this.getName(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "network":
                return this.network;
            case "__accessConfigsType":
                if (Google_NetworkInterface.class.isAssignableFrom(caller)) {

                    return this.__accessConfigsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__accessConfigsDataType":
                if (Google_NetworkInterface.class.isAssignableFrom(caller)) {

                    return this.__accessConfigsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "accessConfigs":
                return this.accessConfigs;
            case "networkIP":
                return this.networkIP;
            case "kind":
                return this.kind;
            case "name":
                return this.name;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "network":
                return ZVal.isNull(this.network);
            case "__accessConfigsType":
                if (Google_NetworkInterface.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__accessConfigsType);
                }
                break;
            case "__accessConfigsDataType":
                if (Google_NetworkInterface.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__accessConfigsDataType);
                }
                break;
            case "accessConfigs":
                return ZVal.isNull(this.accessConfigs);
            case "networkIP":
                return ZVal.isNull(this.networkIP);
            case "kind":
                return ZVal.isNull(this.kind);
            case "name":
                return ZVal.isNull(this.name);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "network":
                this.network = value;
                break;
            case "__accessConfigsType":
                if (Google_NetworkInterface.class.isAssignableFrom(caller)) {

                    this.__accessConfigsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__accessConfigsDataType":
                if (Google_NetworkInterface.class.isAssignableFrom(caller)) {

                    this.__accessConfigsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "accessConfigs":
                this.accessConfigs = value;
                break;
            case "networkIP":
                this.networkIP = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "name":
                this.name = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setNetwork(RuntimeEnv env, Object... args) {
        Object network = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_NetworkInterface.class, "network", network);

        return null;
    }

    public Object getNetwork(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_NetworkInterface.class, "network"));
    }

    public Object setAccessConfigs(RuntimeEnv env, Object... args) {
        Object accessConfigs = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_NetworkInterface.class,
                accessConfigs,
                "Google_AccessConfig",
                "setAccessConfigs");
        ZVal.setProperty(this, Google_NetworkInterface.class, "accessConfigs", accessConfigs);

        return null;
    }

    public Object getAccessConfigs(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_NetworkInterface.class, "accessConfigs"));
    }

    public Object setNetworkIP(RuntimeEnv env, Object... args) {
        Object networkIP = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_NetworkInterface.class, "networkIP", networkIP);

        return null;
    }

    public Object getNetworkIP(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_NetworkInterface.class, "networkIP"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_NetworkInterface.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_NetworkInterface.class, "kind"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_NetworkInterface.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_NetworkInterface.class, "name"));
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
