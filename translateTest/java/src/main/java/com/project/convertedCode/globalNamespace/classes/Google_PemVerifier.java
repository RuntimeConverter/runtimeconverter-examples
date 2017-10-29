package com.project.convertedCode.globalNamespace.classes;

import com.project.convertedCode.globalNamespace.classes.Google_Exception;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Google_AuthException;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.classes.Google_Verifier;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/auth/Google_PemVerifier.php

*/

public class Google_PemVerifier extends Google_Verifier implements RuntimeFileContextInterface {

    public Object publicKey = null;

    public Google_PemVerifier(RuntimeEnv env, Object... args) {
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
            case "__destruct":
                return this.__destruct(env, args);
            case "verify":
                return this.verify(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "publicKey":
                if (Google_PemVerifier.class.equals(caller)) {

                    return this.publicKey;
                }
                return this.__phpMagicMethod__isset(key);
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "publicKey":
                if (Google_PemVerifier.class.equals(caller)) {

                    return ZVal.isNull(this.publicKey);
                }
                break;
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "publicKey":
                if (Google_PemVerifier.class.equals(caller)) {

                    this.publicKey = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object pem = ZVal.assignParameter(args, 0, null);
        if (!ZVal.isTrue(NamespaceGlobal.function_exists.call(env, "openssl_x509_read"))) {
            throw new Google_Exception(
                    env, "Google API PHP client needs the openssl PHP extension");
        }

        ZVal.setProperty(
                this,
                Google_PemVerifier.class,
                "publicKey",
                NamespaceGlobal.openssl_x509_read.call(env, pem));
        if (!ZVal.isTrue(ZVal.getProperty(this, Google_PemVerifier.class, "publicKey"))) {
            throw new Google_AuthException(env, "Unable to parse PEM: " + ZVal.toString(pem));
        }

        return null;
    }

    public Object __destruct(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(ZVal.getProperty(this, Google_PemVerifier.class, "publicKey"))) {
            NamespaceGlobal.openssl_x509_free.call(
                    env, ZVal.getProperty(this, Google_PemVerifier.class, "publicKey"));
        }

        return null;
    }

    public Object verify(RuntimeEnv env, Object... args) {
        Object data = ZVal.assignParameter(args, 0, null);
        Object signature = ZVal.assignParameter(args, 1, null);
        Object status = null;
        status =
                NamespaceGlobal.openssl_verify.call(
                        env,
                        data,
                        signature,
                        ZVal.getProperty(this, Google_PemVerifier.class, "publicKey"),
                        "sha256");
        if (ZVal.strictEqualityCheck(status, "===", -1)) {
            throw new Google_AuthException(
                    env,
                    "Signature verification error: "
                            + ZVal.toString(NamespaceGlobal.openssl_error_string.call(env)));
        }

        return ZVal.assign(ZVal.strictEqualityCheck(status, "===", 1));
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
