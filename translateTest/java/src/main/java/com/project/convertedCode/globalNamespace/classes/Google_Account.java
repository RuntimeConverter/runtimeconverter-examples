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

 google-api-php-client/src/contrib/Google_AnalyticsService.php

*/

public class Google_Account extends Google_Model implements RuntimeFileContextInterface {

    public Object kind = null;

    public Object name = null;

    public Object created = null;

    public Object updated = null;

    public Object __childLinkType = "Google_AccountChildLink";

    public Object __childLinkDataType = "";

    public Object childLink = null;

    public Object id = null;

    public Object selfLink = null;

    public Google_Account(RuntimeEnv env, Object... args) {
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
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setName":
                return this.setName(env, args);
            case "getName":
                return this.getName(env, args);
            case "setCreated":
                return this.setCreated(env, args);
            case "getCreated":
                return this.getCreated(env, args);
            case "setUpdated":
                return this.setUpdated(env, args);
            case "getUpdated":
                return this.getUpdated(env, args);
            case "setChildLink":
                return this.setChildLink(env, args);
            case "getChildLink":
                return this.getChildLink(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setSelfLink":
                return this.setSelfLink(env, args);
            case "getSelfLink":
                return this.getSelfLink(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return this.kind;
            case "name":
                return this.name;
            case "created":
                return this.created;
            case "updated":
                return this.updated;
            case "__childLinkType":
                if (Google_Account.class.isAssignableFrom(caller)) {

                    return this.__childLinkType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__childLinkDataType":
                if (Google_Account.class.isAssignableFrom(caller)) {

                    return this.__childLinkDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "childLink":
                return this.childLink;
            case "id":
                return this.id;
            case "selfLink":
                return this.selfLink;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return ZVal.isNull(this.kind);
            case "name":
                return ZVal.isNull(this.name);
            case "created":
                return ZVal.isNull(this.created);
            case "updated":
                return ZVal.isNull(this.updated);
            case "__childLinkType":
                if (Google_Account.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__childLinkType);
                }
                break;
            case "__childLinkDataType":
                if (Google_Account.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__childLinkDataType);
                }
                break;
            case "childLink":
                return ZVal.isNull(this.childLink);
            case "id":
                return ZVal.isNull(this.id);
            case "selfLink":
                return ZVal.isNull(this.selfLink);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                this.kind = value;
                break;
            case "name":
                this.name = value;
                break;
            case "created":
                this.created = value;
                break;
            case "updated":
                this.updated = value;
                break;
            case "__childLinkType":
                if (Google_Account.class.isAssignableFrom(caller)) {

                    this.__childLinkType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__childLinkDataType":
                if (Google_Account.class.isAssignableFrom(caller)) {

                    this.__childLinkDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "childLink":
                this.childLink = value;
                break;
            case "id":
                this.id = value;
                break;
            case "selfLink":
                this.selfLink = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Account.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Account.class, "kind"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Account.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Account.class, "name"));
    }

    public Object setCreated(RuntimeEnv env, Object... args) {
        Object created = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Account.class, "created", created);

        return null;
    }

    public Object getCreated(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Account.class, "created"));
    }

    public Object setUpdated(RuntimeEnv env, Object... args) {
        Object updated = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Account.class, "updated", updated);

        return null;
    }

    public Object getUpdated(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Account.class, "updated"));
    }

    public Object setChildLink(RuntimeEnv env, Object... args) {
        Object childLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Account.class, "childLink", childLink);

        return null;
    }

    public Object getChildLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Account.class, "childLink"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Account.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Account.class, "id"));
    }

    public Object setSelfLink(RuntimeEnv env, Object... args) {
        Object selfLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Account.class, "selfLink", selfLink);

        return null;
    }

    public Object getSelfLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Account.class, "selfLink"));
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
