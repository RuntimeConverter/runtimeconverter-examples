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

 google-api-php-client/src/contrib/Google_CalendarService.php

*/

public class Google_AclRule extends Google_Model implements RuntimeFileContextInterface {

    public Object __scopeType = "Google_AclRuleScope";

    public Object __scopeDataType = "";

    public Object scope = null;

    public Object kind = null;

    public Object etag = null;

    public Object role = null;

    public Object id = null;

    public Google_AclRule(RuntimeEnv env, Object... args) {
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
            case "setScope":
                return this.setScope(env, args);
            case "getScope":
                return this.getScope(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setEtag":
                return this.setEtag(env, args);
            case "getEtag":
                return this.getEtag(env, args);
            case "setRole":
                return this.setRole(env, args);
            case "getRole":
                return this.getRole(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__scopeType":
                if (Google_AclRule.class.isAssignableFrom(caller)) {

                    return this.__scopeType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__scopeDataType":
                if (Google_AclRule.class.isAssignableFrom(caller)) {

                    return this.__scopeDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "scope":
                return this.scope;
            case "kind":
                return this.kind;
            case "etag":
                return this.etag;
            case "role":
                return this.role;
            case "id":
                return this.id;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__scopeType":
                if (Google_AclRule.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__scopeType);
                }
                break;
            case "__scopeDataType":
                if (Google_AclRule.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__scopeDataType);
                }
                break;
            case "scope":
                return ZVal.isNull(this.scope);
            case "kind":
                return ZVal.isNull(this.kind);
            case "etag":
                return ZVal.isNull(this.etag);
            case "role":
                return ZVal.isNull(this.role);
            case "id":
                return ZVal.isNull(this.id);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__scopeType":
                if (Google_AclRule.class.isAssignableFrom(caller)) {

                    this.__scopeType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__scopeDataType":
                if (Google_AclRule.class.isAssignableFrom(caller)) {

                    this.__scopeDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "scope":
                this.scope = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "etag":
                this.etag = value;
                break;
            case "role":
                this.role = value;
                break;
            case "id":
                this.id = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setScope(RuntimeEnv env, Object... args) {
        Object scope = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AclRule.class, "scope", scope);

        return null;
    }

    public Object getScope(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AclRule.class, "scope"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AclRule.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AclRule.class, "kind"));
    }

    public Object setEtag(RuntimeEnv env, Object... args) {
        Object etag = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AclRule.class, "etag", etag);

        return null;
    }

    public Object getEtag(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AclRule.class, "etag"));
    }

    public Object setRole(RuntimeEnv env, Object... args) {
        Object role = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AclRule.class, "role", role);

        return null;
    }

    public Object getRole(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AclRule.class, "role"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AclRule.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AclRule.class, "id"));
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
