package com.project.convertedCode.globalNamespace.classes;

import com.project.convertedCode.globalNamespace.classes.Google_P12Signer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Google_OAuth2;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.classes.Google_Utils;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/auth/Google_AssertionCredentials.php

*/

public class Google_AssertionCredentials extends RuntimeClassBase
        implements RuntimeFileContextInterface {

    public Object serviceAccountName = null;

    public Object scopes = null;

    public Object privateKey = null;

    public Object privateKeyPassword = null;

    public Object assertionType = null;

    public Object prn = null;

    public Google_AssertionCredentials(RuntimeEnv env, Object... args) {
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
            case "generateAssertion":
                return this.generateAssertion(env, args);
            case "makeSignedJwt":
                if (Google_AssertionCredentials.class.equals(caller)) {

                    return this.makeSignedJwt(env, args);
                }
                break;
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "serviceAccountName":
                return this.serviceAccountName;
            case "scopes":
                return this.scopes;
            case "privateKey":
                return this.privateKey;
            case "privateKeyPassword":
                return this.privateKeyPassword;
            case "assertionType":
                return this.assertionType;
            case "prn":
                return this.prn;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "serviceAccountName":
                return ZVal.isNull(this.serviceAccountName);
            case "scopes":
                return ZVal.isNull(this.scopes);
            case "privateKey":
                return ZVal.isNull(this.privateKey);
            case "privateKeyPassword":
                return ZVal.isNull(this.privateKeyPassword);
            case "assertionType":
                return ZVal.isNull(this.assertionType);
            case "prn":
                return ZVal.isNull(this.prn);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "serviceAccountName":
                this.serviceAccountName = value;
                break;
            case "scopes":
                this.scopes = value;
                break;
            case "privateKey":
                this.privateKey = value;
                break;
            case "privateKeyPassword":
                this.privateKeyPassword = value;
                break;
            case "assertionType":
                this.assertionType = value;
                break;
            case "prn":
                this.prn = value;
                break;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object serviceAccountName = ZVal.assignParameter(args, 0, null);
        Object scopes = ZVal.assignParameter(args, 1, null);
        Object privateKey = ZVal.assignParameter(args, 2, null);
        Object privateKeyPassword = ZVal.assignParameter(args, 3, null);
        if (ZVal.isNull(privateKeyPassword)) {
            privateKeyPassword = "notasecret";
        }
        Object assertionType = ZVal.assignParameter(args, 4, null);
        if (ZVal.isNull(assertionType)) {
            assertionType = "http://oauth.net/grant_type/jwt/1.0/bearer";
        }
        Object prn = ZVal.assignParameter(args, 5, null);
        if (ZVal.isNull(prn)) {
            prn = false;
        }
        ZVal.setProperty(
                this, Google_AssertionCredentials.class, "serviceAccountName", serviceAccountName);
        ZVal.setProperty(
                this,
                Google_AssertionCredentials.class,
                "scopes",
                ZVal.isTrue(NamespaceGlobal.is_string.call(env, scopes))
                        ? scopes
                        : NamespaceGlobal.implode.call(env, " ", scopes));
        ZVal.setProperty(this, Google_AssertionCredentials.class, "privateKey", privateKey);
        ZVal.setProperty(
                this, Google_AssertionCredentials.class, "privateKeyPassword", privateKeyPassword);
        ZVal.setProperty(this, Google_AssertionCredentials.class, "assertionType", assertionType);
        ZVal.setProperty(this, Google_AssertionCredentials.class, "prn", prn);

        return null;
    }

    public Object generateAssertion(RuntimeEnv env, Object... args) {
        Object now = null;
        Object jwtParams = ZVal.newArray();
        now = NamespaceGlobal.time.call(env);
        jwtParams =
                ZVal.newArray(
                        new ZPair("aud", Google_OAuth2.CONST_OAUTH2_TOKEN_URI),
                        new ZPair(
                                "scope",
                                ZVal.getProperty(
                                        this, Google_AssertionCredentials.class, "scopes")),
                        new ZPair("iat", now),
                        new ZPair("exp", ZVal.add(now, CONST_MAX_TOKEN_LIFETIME_SECS)),
                        new ZPair(
                                "iss",
                                ZVal.getProperty(
                                        this,
                                        Google_AssertionCredentials.class,
                                        "serviceAccountName")));
        if (ZVal.strictNotEqualityCheck(
                ZVal.getProperty(this, Google_AssertionCredentials.class, "prn"), "!==", false)) {
            ZVal.putArrayElement(
                    jwtParams,
                    "prn",
                    ZVal.getProperty(this, Google_AssertionCredentials.class, "prn"));
        }

        return ZVal.assign(
                env.callMethod(
                        this, "makeSignedJwt", Google_AssertionCredentials.class, jwtParams));
    }

    private Object makeSignedJwt(RuntimeEnv env, Object... args) {
        Object payload = ZVal.assignParameter(args, 0, null);
        Object signature = null;
        Object signingInput = null;
        Object header = null;
        Object segments = ZVal.newArray();
        Object signer = null;
        header = ZVal.newArray(new ZPair("typ", "JWT"), new ZPair("alg", "RS256"));
        segments =
                ZVal.newArray(
                        new ZPair(
                                0,
                                Google_Utils.urlSafeB64Encode(
                                        env, NamespaceGlobal.json_encode.call(env, header))),
                        new ZPair(
                                1,
                                Google_Utils.urlSafeB64Encode(
                                        env, NamespaceGlobal.json_encode.call(env, payload))));
        signingInput = NamespaceGlobal.implode.call(env, ".", segments);
        signer =
                new Google_P12Signer(
                        env,
                        ZVal.getProperty(this, Google_AssertionCredentials.class, "privateKey"),
                        ZVal.getProperty(
                                this, Google_AssertionCredentials.class, "privateKeyPassword"));
        signature = env.callMethod(signer, "sign", Google_AssertionCredentials.class, signingInput);
        ZVal.addToArray(segments, Google_Utils.urlSafeB64Encode(env, signature));
        return ZVal.assign(NamespaceGlobal.implode.call(env, ".", segments));
    }

    public static final Object CONST_MAX_TOKEN_LIFETIME_SECS = 3600;

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
