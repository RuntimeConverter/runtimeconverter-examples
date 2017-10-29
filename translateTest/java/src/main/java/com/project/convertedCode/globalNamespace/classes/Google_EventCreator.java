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

public class Google_EventCreator extends Google_Model implements RuntimeFileContextInterface {

    public Object self = null;

    public Object displayName = null;

    public Object email = null;

    public Object id = null;

    public Google_EventCreator(RuntimeEnv env, Object... args) {
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
            case "setSelf":
                return this.setSelf(env, args);
            case "getSelf":
                return this.getSelf(env, args);
            case "setDisplayName":
                return this.setDisplayName(env, args);
            case "getDisplayName":
                return this.getDisplayName(env, args);
            case "setEmail":
                return this.setEmail(env, args);
            case "getEmail":
                return this.getEmail(env, args);
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
            case "self":
                return this.self;
            case "displayName":
                return this.displayName;
            case "email":
                return this.email;
            case "id":
                return this.id;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "self":
                return ZVal.isNull(this.self);
            case "displayName":
                return ZVal.isNull(this.displayName);
            case "email":
                return ZVal.isNull(this.email);
            case "id":
                return ZVal.isNull(this.id);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "self":
                this.self = value;
                break;
            case "displayName":
                this.displayName = value;
                break;
            case "email":
                this.email = value;
                break;
            case "id":
                this.id = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setSelf(RuntimeEnv env, Object... args) {
        Object self = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_EventCreator.class, "self", self);

        return null;
    }

    public Object getSelf(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_EventCreator.class, "self"));
    }

    public Object setDisplayName(RuntimeEnv env, Object... args) {
        Object displayName = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_EventCreator.class, "displayName", displayName);

        return null;
    }

    public Object getDisplayName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_EventCreator.class, "displayName"));
    }

    public Object setEmail(RuntimeEnv env, Object... args) {
        Object email = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_EventCreator.class, "email", email);

        return null;
    }

    public Object getEmail(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_EventCreator.class, "email"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_EventCreator.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_EventCreator.class, "id"));
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
