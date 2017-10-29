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

public class Google_FirewallAllowed extends Google_Model implements RuntimeFileContextInterface {

    public Object IPProtocol = null;

    public Object ports = null;

    public Google_FirewallAllowed(RuntimeEnv env, Object... args) {
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
            case "setIPProtocol":
                return this.setIPProtocol(env, args);
            case "getIPProtocol":
                return this.getIPProtocol(env, args);
            case "setPorts":
                return this.setPorts(env, args);
            case "getPorts":
                return this.getPorts(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "IPProtocol":
                return this.IPProtocol;
            case "ports":
                return this.ports;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "IPProtocol":
                return ZVal.isNull(this.IPProtocol);
            case "ports":
                return ZVal.isNull(this.ports);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "IPProtocol":
                this.IPProtocol = value;
                break;
            case "ports":
                this.ports = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setIPProtocol(RuntimeEnv env, Object... args) {
        Object IPProtocol = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_FirewallAllowed.class, "IPProtocol", IPProtocol);

        return null;
    }

    public Object getIPProtocol(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_FirewallAllowed.class, "IPProtocol"));
    }

    public Object setPorts(RuntimeEnv env, Object... args) {
        Object ports = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_FirewallAllowed.class, "ports", ports);

        return null;
    }

    public Object getPorts(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_FirewallAllowed.class, "ports"));
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
