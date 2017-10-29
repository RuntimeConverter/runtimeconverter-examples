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

 google-api-php-client/src/contrib/Google_BigqueryService.php

*/

public class Google_DatasetAccess extends Google_Model implements RuntimeFileContextInterface {

    public Object specialGroup = null;

    public Object domain = null;

    public Object role = null;

    public Object groupByEmail = null;

    public Object userByEmail = null;

    public Google_DatasetAccess(RuntimeEnv env, Object... args) {
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
            case "setSpecialGroup":
                return this.setSpecialGroup(env, args);
            case "getSpecialGroup":
                return this.getSpecialGroup(env, args);
            case "setDomain":
                return this.setDomain(env, args);
            case "getDomain":
                return this.getDomain(env, args);
            case "setRole":
                return this.setRole(env, args);
            case "getRole":
                return this.getRole(env, args);
            case "setGroupByEmail":
                return this.setGroupByEmail(env, args);
            case "getGroupByEmail":
                return this.getGroupByEmail(env, args);
            case "setUserByEmail":
                return this.setUserByEmail(env, args);
            case "getUserByEmail":
                return this.getUserByEmail(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "specialGroup":
                return this.specialGroup;
            case "domain":
                return this.domain;
            case "role":
                return this.role;
            case "groupByEmail":
                return this.groupByEmail;
            case "userByEmail":
                return this.userByEmail;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "specialGroup":
                return ZVal.isNull(this.specialGroup);
            case "domain":
                return ZVal.isNull(this.domain);
            case "role":
                return ZVal.isNull(this.role);
            case "groupByEmail":
                return ZVal.isNull(this.groupByEmail);
            case "userByEmail":
                return ZVal.isNull(this.userByEmail);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "specialGroup":
                this.specialGroup = value;
                break;
            case "domain":
                this.domain = value;
                break;
            case "role":
                this.role = value;
                break;
            case "groupByEmail":
                this.groupByEmail = value;
                break;
            case "userByEmail":
                this.userByEmail = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setSpecialGroup(RuntimeEnv env, Object... args) {
        Object specialGroup = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DatasetAccess.class, "specialGroup", specialGroup);

        return null;
    }

    public Object getSpecialGroup(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DatasetAccess.class, "specialGroup"));
    }

    public Object setDomain(RuntimeEnv env, Object... args) {
        Object domain = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DatasetAccess.class, "domain", domain);

        return null;
    }

    public Object getDomain(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DatasetAccess.class, "domain"));
    }

    public Object setRole(RuntimeEnv env, Object... args) {
        Object role = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DatasetAccess.class, "role", role);

        return null;
    }

    public Object getRole(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DatasetAccess.class, "role"));
    }

    public Object setGroupByEmail(RuntimeEnv env, Object... args) {
        Object groupByEmail = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DatasetAccess.class, "groupByEmail", groupByEmail);

        return null;
    }

    public Object getGroupByEmail(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DatasetAccess.class, "groupByEmail"));
    }

    public Object setUserByEmail(RuntimeEnv env, Object... args) {
        Object userByEmail = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DatasetAccess.class, "userByEmail", userByEmail);

        return null;
    }

    public Object getUserByEmail(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DatasetAccess.class, "userByEmail"));
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
