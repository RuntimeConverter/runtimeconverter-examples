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

public class Google_AboutAdditionalRoleInfo extends Google_Model
        implements RuntimeFileContextInterface {

    public Object __roleSetsType = "Google_AboutAdditionalRoleInfoRoleSets";

    public Object __roleSetsDataType = "array";

    public Object roleSets = null;

    public Object type = null;

    public Google_AboutAdditionalRoleInfo(RuntimeEnv env, Object... args) {
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
            case "setRoleSets":
                return this.setRoleSets(env, args);
            case "getRoleSets":
                return this.getRoleSets(env, args);
            case "setType":
                return this.setType(env, args);
            case "getType":
                return this.getType(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__roleSetsType":
                if (Google_AboutAdditionalRoleInfo.class.isAssignableFrom(caller)) {

                    return this.__roleSetsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__roleSetsDataType":
                if (Google_AboutAdditionalRoleInfo.class.isAssignableFrom(caller)) {

                    return this.__roleSetsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "roleSets":
                return this.roleSets;
            case "type":
                return this.type;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__roleSetsType":
                if (Google_AboutAdditionalRoleInfo.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__roleSetsType);
                }
                break;
            case "__roleSetsDataType":
                if (Google_AboutAdditionalRoleInfo.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__roleSetsDataType);
                }
                break;
            case "roleSets":
                return ZVal.isNull(this.roleSets);
            case "type":
                return ZVal.isNull(this.type);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__roleSetsType":
                if (Google_AboutAdditionalRoleInfo.class.isAssignableFrom(caller)) {

                    this.__roleSetsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__roleSetsDataType":
                if (Google_AboutAdditionalRoleInfo.class.isAssignableFrom(caller)) {

                    this.__roleSetsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "roleSets":
                this.roleSets = value;
                break;
            case "type":
                this.type = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setRoleSets(RuntimeEnv env, Object... args) {
        Object roleSets = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_AboutAdditionalRoleInfo.class,
                roleSets,
                "Google_AboutAdditionalRoleInfoRoleSets",
                "setRoleSets");
        ZVal.setProperty(this, Google_AboutAdditionalRoleInfo.class, "roleSets", roleSets);

        return null;
    }

    public Object getRoleSets(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_AboutAdditionalRoleInfo.class, "roleSets"));
    }

    public Object setType(RuntimeEnv env, Object... args) {
        Object type = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AboutAdditionalRoleInfo.class, "type", type);

        return null;
    }

    public Object getType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AboutAdditionalRoleInfo.class, "type"));
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
