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

public class Google_ServiceAccount extends Google_Model implements RuntimeFileContextInterface {

    public Object scopes = null;

    public Object kind = null;

    public Object email = null;

    public Google_ServiceAccount(RuntimeEnv env, Object... args) {
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
            case "setScopes":
                return this.setScopes(env, args);
            case "getScopes":
                return this.getScopes(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setEmail":
                return this.setEmail(env, args);
            case "getEmail":
                return this.getEmail(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "scopes":
                return this.scopes;
            case "kind":
                return this.kind;
            case "email":
                return this.email;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "scopes":
                return ZVal.isNull(this.scopes);
            case "kind":
                return ZVal.isNull(this.kind);
            case "email":
                return ZVal.isNull(this.email);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "scopes":
                this.scopes = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "email":
                this.email = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setScopes(RuntimeEnv env, Object... args) {
        Object scopes = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ServiceAccount.class, "scopes", scopes);

        return null;
    }

    public Object getScopes(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ServiceAccount.class, "scopes"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ServiceAccount.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ServiceAccount.class, "kind"));
    }

    public Object setEmail(RuntimeEnv env, Object... args) {
        Object email = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ServiceAccount.class, "email", email);

        return null;
    }

    public Object getEmail(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ServiceAccount.class, "email"));
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
