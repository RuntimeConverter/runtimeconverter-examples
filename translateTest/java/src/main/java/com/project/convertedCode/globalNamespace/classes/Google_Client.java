package com.project.convertedCode.globalNamespace.classes;

import com.project.convertedCode.globalNamespace.classes.Google_Exception;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/Google_Client.php

*/

public class Google_Client extends RuntimeClassBase implements RuntimeFileContextInterface {

    public Object scopes = ZVal.newArray();

    public Object useObjects = false;

    public Object services = ZVal.newArray();

    public Object authenticated = false;

    public Google_Client(RuntimeEnv env, Object... args) {
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
            case "addService":
                return this.addService(env, args);
            case "authenticate":
                return this.authenticate(env, args);
            case "prepareService":
                return this.prepareService(env, args);
            case "setAccessToken":
                return this.setAccessToken(env, args);
            case "setAuthClass":
                return this.setAuthClass(env, args);
            case "createAuthUrl":
                return this.createAuthUrl(env, args);
            case "getAccessToken":
                return this.getAccessToken(env, args);
            case "isAccessTokenExpired":
                return this.isAccessTokenExpired(env, args);
            case "setDeveloperKey":
                return this.setDeveloperKey(env, args);
            case "setState":
                return this.setState(env, args);
            case "setAccessType":
                return this.setAccessType(env, args);
            case "setApprovalPrompt":
                return this.setApprovalPrompt(env, args);
            case "setApplicationName":
                return this.setApplicationName(env, args);
            case "setClientId":
                return this.setClientId(env, args);
            case "getClientId":
                return this.getClientId(env, args);
            case "setClientSecret":
                return this.setClientSecret(env, args);
            case "getClientSecret":
                return this.getClientSecret(env, args);
            case "setRedirectUri":
                return this.setRedirectUri(env, args);
            case "getRedirectUri":
                return this.getRedirectUri(env, args);
            case "refreshToken":
                return this.refreshToken(env, args);
            case "revokeToken":
                return this.revokeToken(env, args);
            case "verifyIdToken":
                return this.verifyIdToken(env, args);
            case "setAssertionCredentials":
                return this.setAssertionCredentials(env, args);
            case "setScopes":
                return this.setScopes(env, args);
            case "setUseObjects":
                return this.setUseObjects(env, args);
            case "setUseBatch":
                return this.setUseBatch(env, args);
            case "getCache":
                return this.getCache(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "scopes":
                if (Google_Client.class.isAssignableFrom(caller)) {

                    return this.scopes;
                }
                return this.__phpMagicMethod__isset(key);
            case "useObjects":
                if (Google_Client.class.isAssignableFrom(caller)) {

                    return this.useObjects;
                }
                return this.__phpMagicMethod__isset(key);
            case "services":
                if (Google_Client.class.isAssignableFrom(caller)) {

                    return this.services;
                }
                return this.__phpMagicMethod__isset(key);
            case "authenticated":
                if (Google_Client.class.equals(caller)) {

                    return this.authenticated;
                }
                return this.__phpMagicMethod__isset(key);
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "scopes":
                if (Google_Client.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.scopes);
                }
                break;
            case "useObjects":
                if (Google_Client.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.useObjects);
                }
                break;
            case "services":
                if (Google_Client.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.services);
                }
                break;
            case "authenticated":
                if (Google_Client.class.equals(caller)) {

                    return ZVal.isNull(this.authenticated);
                }
                break;
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "scopes":
                if (Google_Client.class.isAssignableFrom(caller)) {

                    this.scopes = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "useObjects":
                if (Google_Client.class.isAssignableFrom(caller)) {

                    this.useObjects = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "services":
                if (Google_Client.class.isAssignableFrom(caller)) {

                    this.services = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "authenticated":
                if (Google_Client.class.equals(caller)) {

                    this.authenticated = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
        }
        super.__set(key, value, caller);
    }

    public static class RequestStaticProperties {

        public RequestStaticProperties(RuntimeEnv env) {}

        public Object auth = null;

        public Object io = null;

        public Object cache = null;

        public Object useBatch = false;
    }

    public static RequestStaticProperties getRequestStaticProperties(RuntimeEnv env) {
        RequestStaticProperties a =
                (RequestStaticProperties)
                        env.getRequestStaticProperty(
                                "com.project.convertedCode.globalNamespace.classes.Google_Client");
        if (a == null) {
            a = new RequestStaticProperties(env);
            env.setRequestStaticProperty(
                    "com.project.convertedCode.globalNamespace.classes.Google_Client", a);
        }
        return a;
    };

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object config = ZVal.assignParameter(args, 0, null);
        if (ZVal.isNull(config)) {
            config = ZVal.newArray();
        }
        Object apiConfig = env.getGlobal("apiConfig");
        ;

        apiConfig = CRArrayF.array_merge.call(env, apiConfig, config);
        getRequestStaticProperties(env).cache =
                env.createNew(ZVal.getElement(apiConfig, "cacheClass"));
        getRequestStaticProperties(env).auth =
                env.createNew(ZVal.getElement(apiConfig, "authClass"));
        getRequestStaticProperties(env).io = env.createNew(ZVal.getElement(apiConfig, "ioClass"));

        return env.returnWithGlobals(null, "apiConfig", apiConfig);
    }

    public Object addService(RuntimeEnv env, Object... args) {
        Object service = ZVal.assignParameter(args, 0, null);
        Object version = ZVal.assignParameter(args, 1, null);
        if (ZVal.isNull(version)) {
            version = false;
        }
        Object apiConfig = env.getGlobal("apiConfig");
        ;

        if (ZVal.isTrue(ZVal.getProperty(this, Google_Client.class, "authenticated"))) {
            throw new Google_Exception(env, "Cant add services after having authenticated");
        }

        ZVal.putArrayElement(
                ZVal.getProperty(this, Google_Client.class, "services"), service, ZVal.newArray());
        if (ZVal.isset(ZVal.getElementRecursive(apiConfig, "services", service))) {
            ZVal.putArrayElement(
                    ZVal.getProperty(this, Google_Client.class, "services"),
                    service,
                    CRArrayF.array_merge.call(
                            env,
                            ZVal.getElement(
                                    ZVal.getProperty(this, Google_Client.class, "services"),
                                    service),
                            ZVal.getElementRecursive(apiConfig, "services", service)));
        }

        return env.returnWithGlobals(null, "apiConfig", apiConfig);
    }

    public Object authenticate(RuntimeEnv env, Object... args) {
        Object code = ZVal.assignParameter(args, 0, null);
        if (ZVal.isNull(code)) {
            code = ZVal.getNull();
        }
        Object service = null;
        service = env.callMethod(this, "prepareService", Google_Client.class);
        ZVal.setProperty(this, Google_Client.class, "authenticated", true);
        return ZVal.assign(
                env.callMethod(
                        getRequestStaticProperties(env).auth,
                        "authenticate",
                        Google_Client.class,
                        service,
                        code));
    }

    public Object prepareService(RuntimeEnv env, Object... args) {
        Object val = ZVal.newArray();
        Object service = ZVal.newArray();
        Object scopes = ZVal.newArray();
        Object key = null;
        service = ZVal.newArray();
        scopes = ZVal.newArray();
        if (ZVal.isTrue(ZVal.getProperty(this, Google_Client.class, "scopes"))) {
            scopes = ZVal.assign(ZVal.getProperty(this, Google_Client.class, "scopes"));

        } else {
            for (ZPair zpairResult2 :
                    ZVal.getIterable(ZVal.getProperty(this, Google_Client.class, "services"))) {
                key = ZVal.assign(zpairResult2.getKey());
                val = ZVal.assign(zpairResult2.getValue());
                if (ZVal.isset(ZVal.getElement(val, "scope"))) {
                    if (ZVal.isTrue(
                            NamespaceGlobal.is_array.call(env, ZVal.getElement(val, "scope")))) {
                        scopes =
                                CRArrayF.array_merge.call(
                                        env, ZVal.getElement(val, "scope"), scopes);

                    } else {
                        ZVal.addToArray(scopes, ZVal.getElement(val, "scope"));
                    }

                } else {
                    ZVal.addToArray(
                            scopes, "https://www.googleapis.com/auth/" + ZVal.toString(key));
                }

                ZVal.unsetArrayElement(val, "discoveryURI");
                ZVal.unsetArrayElement(val, "scope");
                service = CRArrayF.array_merge.call(env, service, val);
            }
        }

        ZVal.putArrayElement(service, "scope", NamespaceGlobal.implode.call(env, " ", scopes));
        return ZVal.assign(service);
    }

    public Object setAccessToken(RuntimeEnv env, Object... args) {
        Object accessToken = ZVal.assignParameter(args, 0, null);
        if (ZVal.toBool(ZVal.equalityCheck(accessToken, ZVal.getNull()))
                || ZVal.toBool(ZVal.equalityCheck("null", accessToken))) {
            accessToken = ZVal.getNull();
        }

        env.callMethod(
                getRequestStaticProperties(env).auth,
                "setAccessToken",
                Google_Client.class,
                accessToken);

        return null;
    }

    public Object setAuthClass(RuntimeEnv env, Object... args) {
        Object authClassName = ZVal.assignParameter(args, 0, null);
        getRequestStaticProperties(env).auth = env.createNew(authClassName);

        return null;
    }

    public Object createAuthUrl(RuntimeEnv env, Object... args) {
        Object service = ZVal.newArray();
        service = env.callMethod(this, "prepareService", Google_Client.class);
        return ZVal.assign(
                env.callMethod(
                        getRequestStaticProperties(env).auth,
                        "createAuthUrl",
                        Google_Client.class,
                        ZVal.getElement(service, "scope")));
    }

    public Object getAccessToken(RuntimeEnv env, Object... args) {
        Object token = null;
        token =
                env.callMethod(
                        getRequestStaticProperties(env).auth,
                        "getAccessToken",
                        Google_Client.class);
        return ZVal.assign(
                ZVal.toBool(ZVal.equalityCheck(ZVal.getNull(), token))
                                || ZVal.toBool(ZVal.equalityCheck("null", token))
                        ? ZVal.getNull()
                        : token);
    }

    public Object isAccessTokenExpired(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        getRequestStaticProperties(env).auth,
                        "isAccessTokenExpired",
                        Google_Client.class));
    }

    public Object setDeveloperKey(RuntimeEnv env, Object... args) {
        Object developerKey = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                getRequestStaticProperties(env).auth,
                "setDeveloperKey",
                Google_Client.class,
                developerKey);

        return null;
    }

    public Object setState(RuntimeEnv env, Object... args) {
        Object state = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                getRequestStaticProperties(env).auth, "setState", Google_Client.class, state);

        return null;
    }

    public Object setAccessType(RuntimeEnv env, Object... args) {
        Object accessType = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                getRequestStaticProperties(env).auth,
                "setAccessType",
                Google_Client.class,
                accessType);

        return null;
    }

    public Object setApprovalPrompt(RuntimeEnv env, Object... args) {
        Object approvalPrompt = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                getRequestStaticProperties(env).auth,
                "setApprovalPrompt",
                Google_Client.class,
                approvalPrompt);

        return null;
    }

    public Object setApplicationName(RuntimeEnv env, Object... args) {
        Object applicationName = ZVal.assignParameter(args, 0, null);
        Object apiConfig = env.getGlobal("apiConfig");
        ;

        ZVal.putArrayElement(apiConfig, "application_name", applicationName);

        return env.returnWithGlobals(null, "apiConfig", apiConfig);
    }

    public Object setClientId(RuntimeEnv env, Object... args) {
        Object clientId = ZVal.assignParameter(args, 0, null);
        Object apiConfig = env.getGlobal("apiConfig");
        ;

        ZVal.putArrayElement(apiConfig, "oauth2_client_id", clientId);
        ZVal.setProperty(
                getRequestStaticProperties(env).auth, Google_Client.class, "clientId", clientId);

        return env.returnWithGlobals(null, "apiConfig", apiConfig);
    }

    public Object getClientId(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        getRequestStaticProperties(env).auth, Google_Client.class, "clientId"));
    }

    public Object setClientSecret(RuntimeEnv env, Object... args) {
        Object clientSecret = ZVal.assignParameter(args, 0, null);
        Object apiConfig = env.getGlobal("apiConfig");
        ;

        ZVal.putArrayElement(apiConfig, "oauth2_client_secret", clientSecret);
        ZVal.setProperty(
                getRequestStaticProperties(env).auth,
                Google_Client.class,
                "clientSecret",
                clientSecret);

        return env.returnWithGlobals(null, "apiConfig", apiConfig);
    }

    public Object getClientSecret(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        getRequestStaticProperties(env).auth, Google_Client.class, "clientSecret"));
    }

    public Object setRedirectUri(RuntimeEnv env, Object... args) {
        Object redirectUri = ZVal.assignParameter(args, 0, null);
        Object apiConfig = env.getGlobal("apiConfig");
        ;

        ZVal.putArrayElement(apiConfig, "oauth2_redirect_uri", redirectUri);
        ZVal.setProperty(
                getRequestStaticProperties(env).auth,
                Google_Client.class,
                "redirectUri",
                redirectUri);

        return env.returnWithGlobals(null, "apiConfig", apiConfig);
    }

    public Object getRedirectUri(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        getRequestStaticProperties(env).auth, Google_Client.class, "redirectUri"));
    }

    public Object refreshToken(RuntimeEnv env, Object... args) {
        Object refreshToken = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                getRequestStaticProperties(env).auth,
                "refreshToken",
                Google_Client.class,
                refreshToken);

        return null;
    }

    public Object revokeToken(RuntimeEnv env, Object... args) {
        Object token = ZVal.assignParameter(args, 0, null);
        if (ZVal.isNull(token)) {
            token = ZVal.getNull();
        }
        env.callMethod(
                getRequestStaticProperties(env).auth, "revokeToken", Google_Client.class, token);

        return null;
    }

    public Object verifyIdToken(RuntimeEnv env, Object... args) {
        Object token = ZVal.assignParameter(args, 0, null);
        if (ZVal.isNull(token)) {
            token = ZVal.getNull();
        }
        return ZVal.assign(
                env.callMethod(
                        getRequestStaticProperties(env).auth,
                        "verifyIdToken",
                        Google_Client.class,
                        token));
    }

    public Object setAssertionCredentials(RuntimeEnv env, Object... args) {
        Object creds = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                getRequestStaticProperties(env).auth,
                "setAssertionCredentials",
                Google_Client.class,
                creds);

        return null;
    }

    public Object setScopes(RuntimeEnv env, Object... args) {
        Object scopes = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_Client.class,
                "scopes",
                ZVal.isTrue(NamespaceGlobal.is_string.call(env, scopes))
                        ? NamespaceGlobal.explode.call(env, " ", scopes)
                        : scopes);

        return null;
    }

    public Object setUseObjects(RuntimeEnv env, Object... args) {
        Object useObjects = ZVal.assignParameter(args, 0, null);
        Object apiConfig = env.getGlobal("apiConfig");
        ;

        ZVal.putArrayElement(apiConfig, "use_objects", useObjects);

        return env.returnWithGlobals(null, "apiConfig", apiConfig);
    }

    public Object setUseBatch(RuntimeEnv env, Object... args) {
        Object useBatch = ZVal.assignParameter(args, 0, null);
        getRequestStaticProperties(env).useBatch = useBatch;

        return null;
    }

    public Object getCache(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                com.project.convertedCode.globalNamespace.classes.Google_Client
                        .getRequestStaticProperties(env)
                        .cache);
    }

    public static Object getAuth(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                com.project.convertedCode.globalNamespace.classes.Google_Client
                        .getRequestStaticProperties(env)
                        .auth);
    }

    public static Object getIo(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                com.project.convertedCode.globalNamespace.classes.Google_Client
                        .getRequestStaticProperties(env)
                        .io);
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
