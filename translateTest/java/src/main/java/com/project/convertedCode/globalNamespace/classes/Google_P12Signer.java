package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Google_Signer;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Google_AuthException;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.runtimeconverter.runtime.classes.ConvertedRuntimeException;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/auth/Google_P12Signer.php

*/

public class Google_P12Signer extends Google_Signer implements RuntimeFileContextInterface {

    public Object privateKey = null;

    public Google_P12Signer(RuntimeEnv env, Object... args) {
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
            case "sign":
                return this.sign(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "privateKey":
                if (Google_P12Signer.class.equals(caller)) {

                    return this.privateKey;
                }
                return this.__phpMagicMethod__isset(key);
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "privateKey":
                if (Google_P12Signer.class.equals(caller)) {

                    return ZVal.isNull(this.privateKey);
                }
                break;
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "privateKey":
                if (Google_P12Signer.class.equals(caller)) {

                    this.privateKey = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object p12 = ZVal.assignParameter(args, 0, null);
        Object password = ZVal.assignParameter(args, 1, null);
        ReferenceContainer certs = new BasicReferenceContainer();
        if (!ZVal.isTrue(NamespaceGlobal.function_exists.call(env, "openssl_x509_read"))) {
            throw new ConvertedRuntimeException(
                    env, "The Google PHP API library needs the openssl PHP extension");
        }

        certs.setObject(ZVal.assign(ZVal.newArray()));
        if (!ZVal.isTrue(
                NamespaceGlobal.openssl_pkcs12_read.call(
                        env,
                        new RuntimeArgsWithReferences().add(1, certs),
                        p12,
                        certs.getObject(),
                        password))) {
            throw new Google_AuthException(
                    env,
                    ZVal.toString(
                                    "Unable to parse the p12 file.  "
                                            + "Is this a .p12 file?  Is the password correct?  OpenSSL error: ")
                            + ZVal.toString(NamespaceGlobal.openssl_error_string.call(env)));
        }

        if (ZVal.toBool(
                        !ZVal.isTrue(
                                CRArrayF.array_key_exists.call(env, "pkey", certs.getObject())))
                || ZVal.toBool(!ZVal.isTrue(ZVal.getElement(certs.getObject(), "pkey")))) {
            throw new Google_AuthException(env, "No private key found in p12 file.");
        }

        ZVal.setProperty(
                this,
                Google_P12Signer.class,
                "privateKey",
                NamespaceGlobal.openssl_pkey_get_private.call(
                        env, ZVal.getElement(certs.getObject(), "pkey")));
        if (!ZVal.isTrue(ZVal.getProperty(this, Google_P12Signer.class, "privateKey"))) {
            throw new Google_AuthException(env, "Unable to load private key in ");
        }

        return null;
    }

    public Object __destruct(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(ZVal.getProperty(this, Google_P12Signer.class, "privateKey"))) {
            NamespaceGlobal.openssl_pkey_free.call(
                    env, ZVal.getProperty(this, Google_P12Signer.class, "privateKey"));
        }

        return null;
    }

    public Object sign(RuntimeEnv env, Object... args) {
        Object data = ZVal.assignParameter(args, 0, null);
        ReferenceContainer signature = new BasicReferenceContainer();
        if (ZVal.isLessThan(NamespaceGlobal.version_compare.call(env, "7.1.7", "5.3.0"), '<', 0)) {
            throw new Google_AuthException(
                    env, "PHP 5.3.0 or higher is required to use service accounts.");
        }

        if (!ZVal.isTrue(
                NamespaceGlobal.openssl_sign.call(
                        env,
                        new RuntimeArgsWithReferences().add(1, signature),
                        data,
                        signature.getObject(),
                        ZVal.getProperty(this, Google_P12Signer.class, "privateKey"),
                        "sha256"))) {
            throw new Google_AuthException(env, "Unable to sign data");
        }

        return ZVal.assign(signature.getObject());
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
