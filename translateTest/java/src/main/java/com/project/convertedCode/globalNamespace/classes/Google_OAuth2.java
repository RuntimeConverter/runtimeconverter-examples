package com.project.convertedCode.globalNamespace.classes;

import com.project.convertedCode.globalNamespace.classes.Google_Client;
import com.project.convertedCode.globalNamespace.classes.Google_LoginTicket;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.project.convertedCode.globalNamespace.classes.Google_Utils;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Google_PemVerifier;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.modules.standard.http.function_header;
import com.project.convertedCode.globalNamespace.classes.Google_Auth;
import com.project.convertedCode.globalNamespace.classes.Google_AuthException;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.classes.Google_HttpRequest;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/auth/Google_OAuth2.php

*/

public class Google_OAuth2 extends Google_Auth implements RuntimeFileContextInterface {

    public Object clientId = null;

    public Object clientSecret = null;

    public Object developerKey = null;

    public Object token = null;

    public Object redirectUri = null;

    public Object state = null;

    public Object accessType = "offline";

    public Object approvalPrompt = "force";

    public Object assertionCredentials = null;

    public Google_OAuth2(RuntimeEnv env, Object... args) {
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
            case "createAuthUrl":
                return this.createAuthUrl(env, args);
            case "setAccessToken":
                return this.setAccessToken(env, args);
            case "getAccessToken":
                return this.getAccessToken(env, args);
            case "setDeveloperKey":
                return this.setDeveloperKey(env, args);
            case "setState":
                return this.setState(env, args);
            case "setAccessType":
                return this.setAccessType(env, args);
            case "setApprovalPrompt":
                return this.setApprovalPrompt(env, args);
            case "setAssertionCredentials":
                return this.setAssertionCredentials(env, args);
            case "sign":
                return this.sign(env, args);
            case "refreshToken":
                return this.refreshToken(env, args);
            case "refreshTokenWithAssertion":
                return this.refreshTokenWithAssertion(env, args);
            case "refreshTokenRequest":
                if (Google_OAuth2.class.equals(caller)) {

                    return this.refreshTokenRequest(env, args);
                }
                break;
            case "revokeToken":
                return this.revokeToken(env, args);
            case "isAccessTokenExpired":
                return this.isAccessTokenExpired(env, args);
            case "getFederatedSignOnCerts":
                if (Google_OAuth2.class.equals(caller)) {

                    return this.getFederatedSignOnCerts(env, args);
                }
                break;
            case "verifyIdToken":
                return this.verifyIdToken(env, args);
            case "verifySignedJwtWithCerts":
                return this.verifySignedJwtWithCerts(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "clientId":
                return this.clientId;
            case "clientSecret":
                return this.clientSecret;
            case "developerKey":
                return this.developerKey;
            case "token":
                return this.token;
            case "redirectUri":
                return this.redirectUri;
            case "state":
                return this.state;
            case "accessType":
                return this.accessType;
            case "approvalPrompt":
                return this.approvalPrompt;
            case "assertionCredentials":
                return this.assertionCredentials;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "clientId":
                return ZVal.isNull(this.clientId);
            case "clientSecret":
                return ZVal.isNull(this.clientSecret);
            case "developerKey":
                return ZVal.isNull(this.developerKey);
            case "token":
                return ZVal.isNull(this.token);
            case "redirectUri":
                return ZVal.isNull(this.redirectUri);
            case "state":
                return ZVal.isNull(this.state);
            case "accessType":
                return ZVal.isNull(this.accessType);
            case "approvalPrompt":
                return ZVal.isNull(this.approvalPrompt);
            case "assertionCredentials":
                return ZVal.isNull(this.assertionCredentials);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "clientId":
                this.clientId = value;
                break;
            case "clientSecret":
                this.clientSecret = value;
                break;
            case "developerKey":
                this.developerKey = value;
                break;
            case "token":
                this.token = value;
                break;
            case "redirectUri":
                this.redirectUri = value;
                break;
            case "state":
                this.state = value;
                break;
            case "accessType":
                this.accessType = value;
                break;
            case "approvalPrompt":
                this.approvalPrompt = value;
                break;
            case "assertionCredentials":
                this.assertionCredentials = value;
                break;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object apiConfig = env.getGlobal("apiConfig");
        ;

        if (!ZVal.isEmpty(ZVal.getElement(apiConfig, "developer_key"))) {
            ZVal.setProperty(
                    this,
                    Google_OAuth2.class,
                    "developerKey",
                    ZVal.getElement(apiConfig, "developer_key"));
        }

        if (!ZVal.isEmpty(ZVal.getElement(apiConfig, "oauth2_client_id"))) {
            ZVal.setProperty(
                    this,
                    Google_OAuth2.class,
                    "clientId",
                    ZVal.getElement(apiConfig, "oauth2_client_id"));
        }

        if (!ZVal.isEmpty(ZVal.getElement(apiConfig, "oauth2_client_secret"))) {
            ZVal.setProperty(
                    this,
                    Google_OAuth2.class,
                    "clientSecret",
                    ZVal.getElement(apiConfig, "oauth2_client_secret"));
        }

        if (!ZVal.isEmpty(ZVal.getElement(apiConfig, "oauth2_redirect_uri"))) {
            ZVal.setProperty(
                    this,
                    Google_OAuth2.class,
                    "redirectUri",
                    ZVal.getElement(apiConfig, "oauth2_redirect_uri"));
        }

        if (!ZVal.isEmpty(ZVal.getElement(apiConfig, "oauth2_access_type"))) {
            ZVal.setProperty(
                    this,
                    Google_OAuth2.class,
                    "accessType",
                    ZVal.getElement(apiConfig, "oauth2_access_type"));
        }

        if (!ZVal.isEmpty(ZVal.getElement(apiConfig, "oauth2_approval_prompt"))) {
            ZVal.setProperty(
                    this,
                    Google_OAuth2.class,
                    "approvalPrompt",
                    ZVal.getElement(apiConfig, "oauth2_approval_prompt"));
        }

        return env.returnWithGlobals(null, "apiConfig", apiConfig);
    }

    public Object authenticate(RuntimeEnv env, Object... args) {
        Object service = ZVal.assignParameter(args, 0, null);
        if (ZVal.isNull(service)) {
            service = ZVal.newArray();
        }
        Object code = ZVal.assignParameter(args, 1, null);
        if (ZVal.isNull(code)) {
            code = ZVal.getNull();
        }
        Object request = null;
        Object authUrl = null;
        Object decodedResponse = ZVal.newArray();
        Object response = null;
        Object _GET = env.getGlobal("_GET");
        ;
        if (ZVal.toBool(!ZVal.isTrue(code))
                && ZVal.toBool(ZVal.isset(ZVal.getElement(_GET, "code")))) {
            code = ZVal.assign(ZVal.getElement(_GET, "code"));
        }

        if (ZVal.isTrue(code)) {
            request =
                    env.callMethod(
                            Google_Client.getRequestStaticProperties(env).io,
                            "makeRequest",
                            Google_OAuth2.class,
                            new Google_HttpRequest(
                                    env,
                                    CONST_OAUTH2_TOKEN_URI,
                                    "POST",
                                    ZVal.newArray(),
                                    ZVal.newArray(
                                            new ZPair("code", code),
                                            new ZPair("grant_type", "authorization_code"),
                                            new ZPair(
                                                    "redirect_uri",
                                                    ZVal.getProperty(
                                                            this,
                                                            Google_OAuth2.class,
                                                            "redirectUri")),
                                            new ZPair(
                                                    "client_id",
                                                    ZVal.getProperty(
                                                            this, Google_OAuth2.class, "clientId")),
                                            new ZPair(
                                                    "client_secret",
                                                    ZVal.getProperty(
                                                            this,
                                                            Google_OAuth2.class,
                                                            "clientSecret")))));
            if (ZVal.equalityCheck(
                    env.callMethod(request, "getResponseHttpCode", Google_OAuth2.class), 200)) {
                env.callMethod(
                        this,
                        "setAccessToken",
                        Google_OAuth2.class,
                        env.callMethod(request, "getResponseBody", Google_OAuth2.class));
                ZVal.putArrayElement(
                        ZVal.getProperty(this, Google_OAuth2.class, "token"),
                        "created",
                        NamespaceGlobal.time.call(env));
                return env.returnWithGlobals(
                        env.callMethod(this, "getAccessToken", Google_OAuth2.class), "_GET", _GET);

            } else {
                response = env.callMethod(request, "getResponseBody", Google_OAuth2.class);
                decodedResponse = NamespaceGlobal.json_decode.call(env, response, true);
                if (ZVal.toBool(ZVal.notEqualityCheck(decodedResponse, ZVal.getNull()))
                        && ZVal.toBool(ZVal.getElement(decodedResponse, "error"))) {
                    response = ZVal.assign(ZVal.getElement(decodedResponse, "error"));
                }

                throw new Google_AuthException(
                        env,
                        "Error fetching OAuth2 access token, message: '"
                                + ZVal.toString(response)
                                + "'",
                        env.callMethod(request, "getResponseHttpCode", Google_OAuth2.class));
            }
        }

        authUrl =
                env.callMethod(
                        this,
                        "createAuthUrl",
                        Google_OAuth2.class,
                        ZVal.getElement(service, "scope"));
        function_header.f.call(env, "Location: " + ZVal.toString(authUrl));
        return env.returnWithGlobals(true, "_GET", _GET);
    }

    public Object createAuthUrl(RuntimeEnv env, Object... args) {
        Object scope = ZVal.assignParameter(args, 0, null);
        Object params = ZVal.newArray();
        params =
                ZVal.newArray(
                        new ZPair(0, "response_type=code"),
                        new ZPair(
                                1,
                                "redirect_uri="
                                        + ZVal.toString(
                                                NamespaceGlobal.urlencode.call(
                                                        env,
                                                        ZVal.getProperty(
                                                                this,
                                                                Google_OAuth2.class,
                                                                "redirectUri")))),
                        new ZPair(
                                2,
                                "client_id="
                                        + ZVal.toString(
                                                NamespaceGlobal.urlencode.call(
                                                        env,
                                                        ZVal.getProperty(
                                                                this,
                                                                Google_OAuth2.class,
                                                                "clientId")))),
                        new ZPair(
                                3,
                                "scope="
                                        + ZVal.toString(
                                                NamespaceGlobal.urlencode.call(env, scope))),
                        new ZPair(
                                4,
                                "access_type="
                                        + ZVal.toString(
                                                NamespaceGlobal.urlencode.call(
                                                        env,
                                                        ZVal.getProperty(
                                                                this,
                                                                Google_OAuth2.class,
                                                                "accessType")))),
                        new ZPair(
                                5,
                                "approval_prompt="
                                        + ZVal.toString(
                                                NamespaceGlobal.urlencode.call(
                                                        env,
                                                        ZVal.getProperty(
                                                                this,
                                                                Google_OAuth2.class,
                                                                "approvalPrompt")))));
        if (ZVal.isset(ZVal.getProperty(this, Google_OAuth2.class, "state"))) {
            ZVal.addToArray(
                    params,
                    "state="
                            + ZVal.toString(
                                    NamespaceGlobal.urlencode.call(
                                            env,
                                            ZVal.getProperty(this, Google_OAuth2.class, "state"))));
        }

        params = NamespaceGlobal.implode.call(env, "&", params);
        return ZVal.assign(
                ZVal.toString(CONST_OAUTH2_AUTH_URL) + ZVal.toString("?" + ZVal.toString(params)));
    }

    public Object setAccessToken(RuntimeEnv env, Object... args) {
        Object token = ZVal.assignParameter(args, 0, null);
        if (ZVal.isNull(token)) {
            token = ZVal.newArray();
        }
        token = NamespaceGlobal.json_decode.call(env, token, true);
        if (ZVal.equalityCheck(token, ZVal.getNull())) {
            throw new Google_AuthException(env, "Could not json decode the token");
        }

        if (!ZVal.isset(ZVal.getElement(token, "access_token"))) {
            throw new Google_AuthException(env, "Invalid token format");
        }

        ZVal.setProperty(this, Google_OAuth2.class, "token", token);

        return null;
    }

    public Object getAccessToken(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                NamespaceGlobal.json_encode.call(
                        env, ZVal.getProperty(this, Google_OAuth2.class, "token")));
    }

    public Object setDeveloperKey(RuntimeEnv env, Object... args) {
        Object developerKey = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_OAuth2.class, "developerKey", developerKey);

        return null;
    }

    public Object setState(RuntimeEnv env, Object... args) {
        Object state = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_OAuth2.class, "state", state);

        return null;
    }

    public Object setAccessType(RuntimeEnv env, Object... args) {
        Object accessType = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_OAuth2.class, "accessType", accessType);

        return null;
    }

    public Object setApprovalPrompt(RuntimeEnv env, Object... args) {
        Object approvalPrompt = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_OAuth2.class, "approvalPrompt", approvalPrompt);

        return null;
    }

    public Object setAssertionCredentials(RuntimeEnv env, Object... args) {
        Object creds = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_OAuth2.class, "assertionCredentials", creds);

        return null;
    }

    public Object sign(RuntimeEnv env, Object... args) {
        Object request = ZVal.assignParameter(args, 0, null);
        Object requestUrl = null;
        if (ZVal.isTrue(ZVal.getProperty(this, Google_OAuth2.class, "developerKey"))) {
            requestUrl = env.callMethod(request, "getUrl", Google_OAuth2.class);
            requestUrl =
                    ZVal.toString(requestUrl)
                            + ZVal.toString(
                                    ZVal.strictEqualityCheck(
                                                    NamespaceGlobal.strpos.call(
                                                            env,
                                                            env.callMethod(
                                                                    request,
                                                                    "getUrl",
                                                                    Google_OAuth2.class),
                                                            "?"),
                                                    "===",
                                                    false)
                                            ? "?"
                                            : "&");
            requestUrl =
                    ZVal.toString(requestUrl)
                            + ZVal.toString(
                                    "key="
                                            + ZVal.toString(
                                                    NamespaceGlobal.urlencode.call(
                                                            env,
                                                            ZVal.getProperty(
                                                                    this,
                                                                    Google_OAuth2.class,
                                                                    "developerKey"))));
            env.callMethod(request, "setUrl", Google_OAuth2.class, requestUrl);
        }

        if (ZVal.toBool(
                        ZVal.equalityCheck(
                                ZVal.getNull(),
                                ZVal.getProperty(this, Google_OAuth2.class, "token")))
                && ZVal.toBool(
                        ZVal.equalityCheck(
                                ZVal.getNull(),
                                ZVal.getProperty(
                                        this, Google_OAuth2.class, "assertionCredentials")))) {
            return ZVal.assign(request);
        }

        if (ZVal.isTrue(env.callMethod(this, "isAccessTokenExpired", Google_OAuth2.class))) {
            if (ZVal.isTrue(ZVal.getProperty(this, Google_OAuth2.class, "assertionCredentials"))) {
                env.callMethod(this, "refreshTokenWithAssertion", Google_OAuth2.class);

            } else {
                if (!ZVal.isTrue(
                        CRArrayF.array_key_exists.call(
                                env,
                                "refresh_token",
                                ZVal.getProperty(this, Google_OAuth2.class, "token")))) {
                    throw new Google_AuthException(
                            env,
                            ZVal.toString(
                                            "The OAuth 2.0 access token has expired, "
                                                    + "and a refresh token is not available. Refresh tokens are not ")
                                    + "returned for responses that were auto-approved.");
                }

                env.callMethod(
                        this,
                        "refreshToken",
                        Google_OAuth2.class,
                        ZVal.getElement(
                                ZVal.getProperty(this, Google_OAuth2.class, "token"),
                                "refresh_token"));
            }
        }

        env.callMethod(
                request,
                "setRequestHeaders",
                Google_OAuth2.class,
                ZVal.newArray(
                        new ZPair(
                                "Authorization",
                                "Bearer "
                                        + ZVal.toString(
                                                ZVal.getElement(
                                                        ZVal.getProperty(
                                                                this, Google_OAuth2.class, "token"),
                                                        "access_token")))));
        return ZVal.assign(request);
    }

    public Object refreshToken(RuntimeEnv env, Object... args) {
        Object refreshToken = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "refreshTokenRequest",
                Google_OAuth2.class,
                ZVal.newArray(
                        new ZPair(
                                "client_id",
                                ZVal.getProperty(this, Google_OAuth2.class, "clientId")),
                        new ZPair(
                                "client_secret",
                                ZVal.getProperty(this, Google_OAuth2.class, "clientSecret")),
                        new ZPair("refresh_token", refreshToken),
                        new ZPair("grant_type", "refresh_token")));

        return null;
    }

    public Object refreshTokenWithAssertion(RuntimeEnv env, Object... args) {
        Object assertionCredentials = ZVal.assignParameter(args, 0, null);
        if (ZVal.isNull(assertionCredentials)) {
            assertionCredentials = ZVal.getNull();
        }
        if (!ZVal.isTrue(assertionCredentials)) {
            assertionCredentials =
                    ZVal.assign(
                            ZVal.getProperty(this, Google_OAuth2.class, "assertionCredentials"));
        }

        env.callMethod(
                this,
                "refreshTokenRequest",
                Google_OAuth2.class,
                ZVal.newArray(
                        new ZPair("grant_type", "assertion"),
                        new ZPair(
                                "assertion_type",
                                ZVal.getProperty(
                                        assertionCredentials,
                                        Google_OAuth2.class,
                                        "assertionType")),
                        new ZPair(
                                "assertion",
                                env.callMethod(
                                        assertionCredentials,
                                        "generateAssertion",
                                        Google_OAuth2.class))));

        return null;
    }

    private Object refreshTokenRequest(RuntimeEnv env, Object... args) {
        Object params = ZVal.assignParameter(args, 0, null);
        Object request = null;
        Object code = null;
        Object http = null;
        Object body = null;
        Object token = ZVal.newArray();
        http = new Google_HttpRequest(env, CONST_OAUTH2_TOKEN_URI, "POST", ZVal.newArray(), params);
        request =
                env.callMethod(
                        Google_Client.getRequestStaticProperties(env).io,
                        "makeRequest",
                        Google_OAuth2.class,
                        http);
        code = env.callMethod(request, "getResponseHttpCode", Google_OAuth2.class);
        body = env.callMethod(request, "getResponseBody", Google_OAuth2.class);
        if (ZVal.equalityCheck(200, code)) {
            token = NamespaceGlobal.json_decode.call(env, body, true);
            if (ZVal.equalityCheck(token, ZVal.getNull())) {
                throw new Google_AuthException(env, "Could not json decode the access token");
            }

            if (ZVal.toBool(!ZVal.isset(ZVal.getElement(token, "access_token")))
                    || ZVal.toBool(!ZVal.isset(ZVal.getElement(token, "expires_in")))) {
                throw new Google_AuthException(env, "Invalid token format");
            }

            ZVal.putArrayElement(
                    ZVal.getProperty(this, Google_OAuth2.class, "token"),
                    "access_token",
                    ZVal.getElement(token, "access_token"));
            ZVal.putArrayElement(
                    ZVal.getProperty(this, Google_OAuth2.class, "token"),
                    "expires_in",
                    ZVal.getElement(token, "expires_in"));
            ZVal.putArrayElement(
                    ZVal.getProperty(this, Google_OAuth2.class, "token"),
                    "created",
                    NamespaceGlobal.time.call(env));

        } else {
            throw new Google_AuthException(
                    env,
                    "Error refreshing the OAuth2 token, message: '" + ZVal.toString(body) + "'",
                    code);
        }

        return null;
    }

    public Object revokeToken(RuntimeEnv env, Object... args) {
        Object token = ZVal.assignParameter(args, 0, null);
        if (ZVal.isNull(token)) {
            token = ZVal.getNull();
        }
        Object request = null;
        Object code = null;
        Object response = null;
        if (!ZVal.isTrue(token)) {
            token =
                    ZVal.assign(
                            ZVal.getElement(
                                    ZVal.getProperty(this, Google_OAuth2.class, "token"),
                                    "access_token"));
        }

        request =
                new Google_HttpRequest(
                        env,
                        CONST_OAUTH2_REVOKE_URI,
                        "POST",
                        ZVal.newArray(),
                        "token=" + ZVal.toString(token));
        response =
                env.callMethod(
                        Google_Client.getRequestStaticProperties(env).io,
                        "makeRequest",
                        Google_OAuth2.class,
                        request);
        code = env.callMethod(response, "getResponseHttpCode", Google_OAuth2.class);
        if (ZVal.equalityCheck(code, 200)) {
            ZVal.setProperty(this, Google_OAuth2.class, "token", ZVal.getNull());
            return ZVal.assign(true);
        }

        return ZVal.assign(false);
    }

    public Object isAccessTokenExpired(RuntimeEnv env, Object... args) {
        Object expired = null;
        if (ZVal.equalityCheck(
                ZVal.getNull(), ZVal.getProperty(this, Google_OAuth2.class, "token"))) {
            return ZVal.assign(true);
        }

        expired =
                ZVal.isLessThan(
                        ZVal.add(
                                ZVal.getElement(
                                        ZVal.getProperty(this, Google_OAuth2.class, "token"),
                                        "created"),
                                ZVal.subtract(
                                        ZVal.getElement(
                                                ZVal.getProperty(
                                                        this, Google_OAuth2.class, "token"),
                                                "expires_in"),
                                        30)),
                        '<',
                        NamespaceGlobal.time.call(env));
        return ZVal.assign(expired);
    }

    private Object getFederatedSignOnCerts(RuntimeEnv env, Object... args) {
        Object request = null;
        Object certs = null;
        request =
                env.callMethod(
                        Google_Client.getRequestStaticProperties(env).io,
                        "makeRequest",
                        Google_OAuth2.class,
                        new Google_HttpRequest(env, CONST_OAUTH2_FEDERATED_SIGNON_CERTS_URL));
        if (ZVal.equalityCheck(
                env.callMethod(request, "getResponseHttpCode", Google_OAuth2.class), 200)) {
            certs =
                    NamespaceGlobal.json_decode.call(
                            env,
                            env.callMethod(request, "getResponseBody", Google_OAuth2.class),
                            true);
            if (ZVal.isTrue(certs)) {
                return ZVal.assign(certs);
            }
        }

        throw new Google_AuthException(
                env,
                ZVal.toString(
                                "Failed to retrieve verification certificates: '"
                                        + ZVal.toString(
                                                env.callMethod(
                                                        request,
                                                        "getResponseBody",
                                                        Google_OAuth2.class)))
                        + "'.",
                env.callMethod(request, "getResponseHttpCode", Google_OAuth2.class));
    }

    public Object verifyIdToken(RuntimeEnv env, Object... args) {
        Object id_token = ZVal.assignParameter(args, 0, null);
        if (ZVal.isNull(id_token)) {
            id_token = ZVal.getNull();
        }
        Object audience = ZVal.assignParameter(args, 1, null);
        if (ZVal.isNull(audience)) {
            audience = ZVal.getNull();
        }
        Object certs = null;
        if (!ZVal.isTrue(id_token)) {
            id_token =
                    ZVal.assign(
                            ZVal.getElement(
                                    ZVal.getProperty(this, Google_OAuth2.class, "token"),
                                    "id_token"));
        }

        certs = env.callMethod(this, "getFederatedSignonCerts", Google_OAuth2.class);
        if (!ZVal.isTrue(audience)) {
            audience = ZVal.assign(ZVal.getProperty(this, Google_OAuth2.class, "clientId"));
        }

        return ZVal.assign(
                env.callMethod(
                        this,
                        "verifySignedJwtWithCerts",
                        Google_OAuth2.class,
                        id_token,
                        certs,
                        audience));
    }

    public Object verifySignedJwtWithCerts(RuntimeEnv env, Object... args) {
        Object jwt = ZVal.assignParameter(args, 0, null);
        Object certs = ZVal.assignParameter(args, 1, null);
        Object required_audience = ZVal.assignParameter(args, 2, null);
        Object public_key = null;
        Object signature = null;
        Object verified = null;
        Object keyName = null;
        Object signed = null;
        Object earliest = null;
        Object segments = ZVal.newArray();
        Object aud = null;
        Object envelope = null;
        Object payload = ZVal.newArray();
        Object json_body = null;
        Object now = null;
        Object pem = null;
        Object exp = null;
        Object iat = null;
        Object latest = null;
        segments = NamespaceGlobal.explode.call(env, ".", jwt);
        if (ZVal.notEqualityCheck(CRArrayF.count.call(env, segments), 3)) {
            throw new Google_AuthException(
                    env, "Wrong number of segments in token: " + ZVal.toString(jwt));
        }

        signed =
                ZVal.toString(ZVal.toString(ZVal.getElement(segments, 0)) + ".")
                        + ZVal.toString(ZVal.getElement(segments, 1));
        signature = Google_Utils.urlSafeB64Decode(env, ZVal.getElement(segments, 2));
        envelope =
                NamespaceGlobal.json_decode.call(
                        env,
                        Google_Utils.urlSafeB64Decode(env, ZVal.getElement(segments, 0)),
                        true);
        if (!ZVal.isTrue(envelope)) {
            throw new Google_AuthException(
                    env,
                    "Can't parse token envelope: " + ZVal.toString(ZVal.getElement(segments, 0)));
        }

        json_body = Google_Utils.urlSafeB64Decode(env, ZVal.getElement(segments, 1));
        payload = NamespaceGlobal.json_decode.call(env, json_body, true);
        if (!ZVal.isTrue(payload)) {
            throw new Google_AuthException(
                    env,
                    "Can't parse token payload: " + ZVal.toString(ZVal.getElement(segments, 1)));
        }

        verified = false;
        for (ZPair zpairResult3 : ZVal.getIterable(certs)) {
            keyName = ZVal.assign(zpairResult3.getKey());
            pem = ZVal.assign(zpairResult3.getValue());
            public_key = new Google_PemVerifier(env, pem);
            if (ZVal.isTrue(
                    env.callMethod(public_key, "verify", Google_OAuth2.class, signed, signature))) {
                verified = true;
                break;
            }
        }

        if (!ZVal.isTrue(verified)) {
            throw new Google_AuthException(env, "Invalid token signature: " + ZVal.toString(jwt));
        }

        iat = 0;
        if (ZVal.isTrue(CRArrayF.array_key_exists.call(env, "iat", payload))) {
            iat = ZVal.assign(ZVal.getElement(payload, "iat"));
        }

        if (!ZVal.isTrue(iat)) {
            throw new Google_AuthException(
                    env, "No issue time in token: " + ZVal.toString(json_body));
        }

        earliest = ZVal.subtract(iat, CONST_CLOCK_SKEW_SECS);
        now = NamespaceGlobal.time.call(env);
        exp = 0;
        if (ZVal.isTrue(CRArrayF.array_key_exists.call(env, "exp", payload))) {
            exp = ZVal.assign(ZVal.getElement(payload, "exp"));
        }

        if (!ZVal.isTrue(exp)) {
            throw new Google_AuthException(
                    env, "No expiration time in token: " + ZVal.toString(json_body));
        }

        if (ZVal.isGreaterThanOrEqualTo(exp, ">=", ZVal.add(now, CONST_MAX_TOKEN_LIFETIME_SECS))) {
            throw new Google_AuthException(
                    env, "Expiration time too far in future: " + ZVal.toString(json_body));
        }

        latest = ZVal.add(exp, CONST_CLOCK_SKEW_SECS);
        if (ZVal.isLessThan(now, '<', earliest)) {
            throw new Google_AuthException(
                    env,
                    "Token used too early, "
                            + ZVal.toString(now)
                            + " < "
                            + ZVal.toString(earliest)
                            + ": "
                            + ZVal.toString(json_body));
        }

        if (ZVal.isGreaterThan(now, '>', latest)) {
            throw new Google_AuthException(
                    env,
                    "Token used too late, "
                            + ZVal.toString(now)
                            + " > "
                            + ZVal.toString(latest)
                            + ": "
                            + ZVal.toString(json_body));
        }

        aud = ZVal.assign(ZVal.getElement(payload, "aud"));
        if (ZVal.notEqualityCheck(aud, required_audience)) {
            throw new Google_AuthException(
                    env,
                    "Wrong recipient, "
                            + ZVal.toString(aud)
                            + " != "
                            + ZVal.toString(required_audience)
                            + ": "
                            + ZVal.toString(json_body));
        }

        return ZVal.assign(new Google_LoginTicket(env, envelope, payload));
    }

    public static final Object CONST_OAUTH2_REVOKE_URI =
            "https://accounts.google.com/o/oauth2/revoke";

    public static final Object CONST_OAUTH2_TOKEN_URI =
            "https://accounts.google.com/o/oauth2/token";

    public static final Object CONST_OAUTH2_AUTH_URL = "https://accounts.google.com/o/oauth2/auth";

    public static final Object CONST_OAUTH2_FEDERATED_SIGNON_CERTS_URL =
            "https://www.googleapis.com/oauth2/v1/certs";

    public static final Object CONST_CLOCK_SKEW_SECS = 300;

    public static final Object CONST_AUTH_TOKEN_LIFETIME_SECS = 300;

    public static final Object CONST_MAX_TOKEN_LIFETIME_SECS = 86400;

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
