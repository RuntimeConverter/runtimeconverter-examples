package com.project.convertedCode.globalNamespace.classes;

import com.project.convertedCode.globalNamespace.classes.Google_Auth;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/auth/Google_AuthNone.php

*/

public class Google_AuthNone extends Google_Auth implements RuntimeFileContextInterface {

    public Object key = ZVal.getNull();

    public Google_AuthNone(RuntimeEnv env, Object... args) {
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
            case "setDeveloperKey":
                return this.setDeveloperKey(env, args);
            case "authenticate":
                return this.authenticate(env, args);
            case "setAccessToken":
                return this.setAccessToken(env, args);
            case "getAccessToken":
                return this.getAccessToken(env, args);
            case "createAuthUrl":
                return this.createAuthUrl(env, args);
            case "refreshToken":
                return this.refreshToken(env, args);
            case "revokeToken":
                return this.revokeToken(env, args);
            case "sign":
                return this.sign(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "key":
                return this.key;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "key":
                return ZVal.isNull(this.key);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "key":
                this.key = value;
                break;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object apiConfig = env.getGlobal("apiConfig");
        ;

        if (!ZVal.isEmpty(ZVal.getElement(apiConfig, "developer_key"))) {
            env.callMethod(
                    this,
                    "setDeveloperKey",
                    Google_AuthNone.class,
                    ZVal.getElement(apiConfig, "developer_key"));
        }

        return env.returnWithGlobals(null, "apiConfig", apiConfig);
    }

    public Object setDeveloperKey(RuntimeEnv env, Object... args) {
        Object key = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AuthNone.class, "key", key);

        return null;
    }

    public Object authenticate(RuntimeEnv env, Object... args) {
        Object service = ZVal.assignParameter(args, 0, null);

        return null;
    }

    public Object setAccessToken(RuntimeEnv env, Object... args) {
        Object accessToken = ZVal.assignParameter(args, 0, null);

        return null;
    }

    public Object getAccessToken(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getNull());
    }

    public Object createAuthUrl(RuntimeEnv env, Object... args) {
        Object scope = ZVal.assignParameter(args, 0, null);
        return ZVal.assign(ZVal.getNull());
    }

    public Object refreshToken(RuntimeEnv env, Object... args) {
        Object refreshToken = ZVal.assignParameter(args, 0, null);

        return null;
    }

    public Object revokeToken(RuntimeEnv env, Object... args) {

        return null;
    }

    public Object sign(RuntimeEnv env, Object... args) {
        Object request = ZVal.assignParameter(args, 0, null);
        if (ZVal.isTrue(ZVal.getProperty(this, Google_AuthNone.class, "key"))) {
            env.callMethod(
                    request,
                    "setUrl",
                    Google_AuthNone.class,
                    ZVal.toString(
                                    ZVal.toString(
                                                    ZVal.toString(
                                                                    env.callMethod(
                                                                            request,
                                                                            "getUrl",
                                                                            Google_AuthNone.class))
                                                            + ZVal.toString(
                                                                    ZVal.strictEqualityCheck(
                                                                                    NamespaceGlobal
                                                                                            .strpos
                                                                                            .call(
                                                                                                    env,
                                                                                                    env
                                                                                                            .callMethod(
                                                                                                                    request,
                                                                                                                    "getUrl",
                                                                                                                    Google_AuthNone
                                                                                                                            .class),
                                                                                                    "?"),
                                                                                    "===",
                                                                                    false)
                                                                            ? "?"
                                                                            : "&"))
                                            + "key=")
                            + ZVal.toString(
                                    NamespaceGlobal.urlencode.call(
                                            env,
                                            ZVal.getProperty(this, Google_AuthNone.class, "key"))));
        }

        return ZVal.assign(request);
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
