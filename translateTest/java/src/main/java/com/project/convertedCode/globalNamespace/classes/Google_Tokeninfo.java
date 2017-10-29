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

 google-api-php-client/src/contrib/Google_Oauth2Service.php

*/

public class Google_Tokeninfo extends Google_Model implements RuntimeFileContextInterface {

    public Object issued_to = null;

    public Object user_id = null;

    public Object expires_in = null;

    public Object access_type = null;

    public Object audience = null;

    public Object scope = null;

    public Object email = null;

    public Object verified_email = null;

    public Google_Tokeninfo(RuntimeEnv env, Object... args) {
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
            case "setIssued_to":
                return this.setIssued_to(env, args);
            case "getIssued_to":
                return this.getIssued_to(env, args);
            case "setUser_id":
                return this.setUser_id(env, args);
            case "getUser_id":
                return this.getUser_id(env, args);
            case "setExpires_in":
                return this.setExpires_in(env, args);
            case "getExpires_in":
                return this.getExpires_in(env, args);
            case "setAccess_type":
                return this.setAccess_type(env, args);
            case "getAccess_type":
                return this.getAccess_type(env, args);
            case "setAudience":
                return this.setAudience(env, args);
            case "getAudience":
                return this.getAudience(env, args);
            case "setScope":
                return this.setScope(env, args);
            case "getScope":
                return this.getScope(env, args);
            case "setEmail":
                return this.setEmail(env, args);
            case "getEmail":
                return this.getEmail(env, args);
            case "setVerified_email":
                return this.setVerified_email(env, args);
            case "getVerified_email":
                return this.getVerified_email(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "issued_to":
                return this.issued_to;
            case "user_id":
                return this.user_id;
            case "expires_in":
                return this.expires_in;
            case "access_type":
                return this.access_type;
            case "audience":
                return this.audience;
            case "scope":
                return this.scope;
            case "email":
                return this.email;
            case "verified_email":
                return this.verified_email;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "issued_to":
                return ZVal.isNull(this.issued_to);
            case "user_id":
                return ZVal.isNull(this.user_id);
            case "expires_in":
                return ZVal.isNull(this.expires_in);
            case "access_type":
                return ZVal.isNull(this.access_type);
            case "audience":
                return ZVal.isNull(this.audience);
            case "scope":
                return ZVal.isNull(this.scope);
            case "email":
                return ZVal.isNull(this.email);
            case "verified_email":
                return ZVal.isNull(this.verified_email);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "issued_to":
                this.issued_to = value;
                break;
            case "user_id":
                this.user_id = value;
                break;
            case "expires_in":
                this.expires_in = value;
                break;
            case "access_type":
                this.access_type = value;
                break;
            case "audience":
                this.audience = value;
                break;
            case "scope":
                this.scope = value;
                break;
            case "email":
                this.email = value;
                break;
            case "verified_email":
                this.verified_email = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setIssued_to(RuntimeEnv env, Object... args) {
        Object issued_to = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Tokeninfo.class, "issued_to", issued_to);

        return null;
    }

    public Object getIssued_to(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Tokeninfo.class, "issued_to"));
    }

    public Object setUser_id(RuntimeEnv env, Object... args) {
        Object user_id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Tokeninfo.class, "user_id", user_id);

        return null;
    }

    public Object getUser_id(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Tokeninfo.class, "user_id"));
    }

    public Object setExpires_in(RuntimeEnv env, Object... args) {
        Object expires_in = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Tokeninfo.class, "expires_in", expires_in);

        return null;
    }

    public Object getExpires_in(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Tokeninfo.class, "expires_in"));
    }

    public Object setAccess_type(RuntimeEnv env, Object... args) {
        Object access_type = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Tokeninfo.class, "access_type", access_type);

        return null;
    }

    public Object getAccess_type(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Tokeninfo.class, "access_type"));
    }

    public Object setAudience(RuntimeEnv env, Object... args) {
        Object audience = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Tokeninfo.class, "audience", audience);

        return null;
    }

    public Object getAudience(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Tokeninfo.class, "audience"));
    }

    public Object setScope(RuntimeEnv env, Object... args) {
        Object scope = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Tokeninfo.class, "scope", scope);

        return null;
    }

    public Object getScope(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Tokeninfo.class, "scope"));
    }

    public Object setEmail(RuntimeEnv env, Object... args) {
        Object email = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Tokeninfo.class, "email", email);

        return null;
    }

    public Object getEmail(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Tokeninfo.class, "email"));
    }

    public Object setVerified_email(RuntimeEnv env, Object... args) {
        Object verified_email = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Tokeninfo.class, "verified_email", verified_email);

        return null;
    }

    public Object getVerified_email(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Tokeninfo.class, "verified_email"));
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
