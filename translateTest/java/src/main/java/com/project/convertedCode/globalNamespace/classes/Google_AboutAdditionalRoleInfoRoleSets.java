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

 google-api-php-client/src/contrib/Google_DriveService.php

*/

public class Google_AboutAdditionalRoleInfoRoleSets extends Google_Model
        implements RuntimeFileContextInterface {

    public Object primaryRole = null;

    public Object additionalRoles = null;

    public Google_AboutAdditionalRoleInfoRoleSets(RuntimeEnv env, Object... args) {
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
            case "setPrimaryRole":
                return this.setPrimaryRole(env, args);
            case "getPrimaryRole":
                return this.getPrimaryRole(env, args);
            case "setAdditionalRoles":
                return this.setAdditionalRoles(env, args);
            case "getAdditionalRoles":
                return this.getAdditionalRoles(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "primaryRole":
                return this.primaryRole;
            case "additionalRoles":
                return this.additionalRoles;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "primaryRole":
                return ZVal.isNull(this.primaryRole);
            case "additionalRoles":
                return ZVal.isNull(this.additionalRoles);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "primaryRole":
                this.primaryRole = value;
                break;
            case "additionalRoles":
                this.additionalRoles = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setPrimaryRole(RuntimeEnv env, Object... args) {
        Object primaryRole = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_AboutAdditionalRoleInfoRoleSets.class, "primaryRole", primaryRole);

        return null;
    }

    public Object getPrimaryRole(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_AboutAdditionalRoleInfoRoleSets.class, "primaryRole"));
    }

    public Object setAdditionalRoles(RuntimeEnv env, Object... args) {
        Object additionalRoles = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_AboutAdditionalRoleInfoRoleSets.class,
                additionalRoles,
                "Google_string",
                "setAdditionalRoles");
        ZVal.setProperty(
                this,
                Google_AboutAdditionalRoleInfoRoleSets.class,
                "additionalRoles",
                additionalRoles);

        return null;
    }

    public Object getAdditionalRoles(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_AboutAdditionalRoleInfoRoleSets.class, "additionalRoles"));
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
