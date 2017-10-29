package com.project.convertedCode.globalNamespace.classes;

import com.project.convertedCode.globalNamespace.classes.Google_UserinfoServiceResource;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Google_Service;
import com.project.convertedCode.globalNamespace.classes.Google_UserinfoV2MeServiceResource;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_Oauth2Service.php

*/

public class Google_Oauth2Service extends Google_Service implements RuntimeFileContextInterface {

    public Object userinfo = null;

    public Object userinfo_v2_me = null;

    public Google_Oauth2Service(RuntimeEnv env, Object... args) {
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
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "userinfo":
                return this.userinfo;
            case "userinfo_v2_me":
                return this.userinfo_v2_me;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "userinfo":
                return ZVal.isNull(this.userinfo);
            case "userinfo_v2_me":
                return ZVal.isNull(this.userinfo_v2_me);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "userinfo":
                this.userinfo = value;
                break;
            case "userinfo_v2_me":
                this.userinfo_v2_me = value;
                break;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object client = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Oauth2Service.class, "servicePath", "");
        ZVal.setProperty(this, Google_Oauth2Service.class, "version", "v2");
        ZVal.setProperty(this, Google_Oauth2Service.class, "serviceName", "oauth2");
        env.callMethod(
                client,
                "addService",
                Google_Oauth2Service.class,
                ZVal.getProperty(this, Google_Oauth2Service.class, "serviceName"),
                ZVal.getProperty(this, Google_Oauth2Service.class, "version"));
        ZVal.setProperty(
                this,
                Google_Oauth2Service.class,
                "userinfo",
                new Google_UserinfoServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_Oauth2Service.class, "serviceName"),
                        "userinfo",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"get\": {\"path\": \"oauth2/v2/userinfo\", \"scopes\": [\"https://www.googleapis.com/auth/userinfo.email\", \"https://www.googleapis.com/auth/userinfo.profile\"], \"id\": \"oauth2.userinfo.get\", \"httpMethod\": \"GET\", \"response\": {\"$ref\": \"Userinfo\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_Oauth2Service.class,
                "userinfo_v2_me",
                new Google_UserinfoV2MeServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_Oauth2Service.class, "serviceName"),
                        "me",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"get\": {\"path\": \"userinfo/v2/me\", \"scopes\": [\"https://www.googleapis.com/auth/userinfo.email\", \"https://www.googleapis.com/auth/userinfo.profile\"], \"id\": \"oauth2.userinfo.v2.me.get\", \"httpMethod\": \"GET\", \"response\": {\"$ref\": \"Userinfo\"}}}}",
                                true)));

        return null;
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
