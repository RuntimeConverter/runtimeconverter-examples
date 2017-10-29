package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/auth/Google_Auth.php

*/

public abstract class Google_Auth extends RuntimeClassBase implements RuntimeFileContextInterface {

    public Google_Auth(RuntimeEnv env, Object... args) {
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
            case "authenticate":
                return this.authenticate(env, args);
            case "sign":
                return this.sign(env, args);
            case "createAuthUrl":
                return this.createAuthUrl(env, args);
            case "getAccessToken":
                return this.getAccessToken(env, args);
            case "setAccessToken":
                return this.setAccessToken(env, args);
            case "setDeveloperKey":
                return this.setDeveloperKey(env, args);
            case "refreshToken":
                return this.refreshToken(env, args);
            case "revokeToken":
                return this.revokeToken(env, args);
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

    public abstract Object authenticate(RuntimeEnv env, Object... args);

    public abstract Object sign(RuntimeEnv env, Object... args);

    public abstract Object createAuthUrl(RuntimeEnv env, Object... args);

    public abstract Object getAccessToken(RuntimeEnv env, Object... args);

    public abstract Object setAccessToken(RuntimeEnv env, Object... args);

    public abstract Object setDeveloperKey(RuntimeEnv env, Object... args);

    public abstract Object refreshToken(RuntimeEnv env, Object... args);

    public abstract Object revokeToken(RuntimeEnv env, Object... args);

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
