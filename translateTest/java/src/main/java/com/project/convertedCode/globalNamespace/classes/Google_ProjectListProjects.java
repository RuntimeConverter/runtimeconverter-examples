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

public class Google_ProjectListProjects extends Google_Model
        implements RuntimeFileContextInterface {

    public Object friendlyName = null;

    public Object kind = null;

    public Object id = null;

    public Object __projectReferenceType = "Google_ProjectReference";

    public Object __projectReferenceDataType = "";

    public Object projectReference = null;

    public Google_ProjectListProjects(RuntimeEnv env, Object... args) {
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
            case "setFriendlyName":
                return this.setFriendlyName(env, args);
            case "getFriendlyName":
                return this.getFriendlyName(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setProjectReference":
                return this.setProjectReference(env, args);
            case "getProjectReference":
                return this.getProjectReference(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "friendlyName":
                return this.friendlyName;
            case "kind":
                return this.kind;
            case "id":
                return this.id;
            case "__projectReferenceType":
                if (Google_ProjectListProjects.class.isAssignableFrom(caller)) {

                    return this.__projectReferenceType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__projectReferenceDataType":
                if (Google_ProjectListProjects.class.isAssignableFrom(caller)) {

                    return this.__projectReferenceDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "projectReference":
                return this.projectReference;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "friendlyName":
                return ZVal.isNull(this.friendlyName);
            case "kind":
                return ZVal.isNull(this.kind);
            case "id":
                return ZVal.isNull(this.id);
            case "__projectReferenceType":
                if (Google_ProjectListProjects.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__projectReferenceType);
                }
                break;
            case "__projectReferenceDataType":
                if (Google_ProjectListProjects.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__projectReferenceDataType);
                }
                break;
            case "projectReference":
                return ZVal.isNull(this.projectReference);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "friendlyName":
                this.friendlyName = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "id":
                this.id = value;
                break;
            case "__projectReferenceType":
                if (Google_ProjectListProjects.class.isAssignableFrom(caller)) {

                    this.__projectReferenceType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__projectReferenceDataType":
                if (Google_ProjectListProjects.class.isAssignableFrom(caller)) {

                    this.__projectReferenceDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "projectReference":
                this.projectReference = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setFriendlyName(RuntimeEnv env, Object... args) {
        Object friendlyName = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ProjectListProjects.class, "friendlyName", friendlyName);

        return null;
    }

    public Object getFriendlyName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ProjectListProjects.class, "friendlyName"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ProjectListProjects.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ProjectListProjects.class, "kind"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ProjectListProjects.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ProjectListProjects.class, "id"));
    }

    public Object setProjectReference(RuntimeEnv env, Object... args) {
        Object projectReference = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_ProjectListProjects.class, "projectReference", projectReference);

        return null;
    }

    public Object getProjectReference(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ProjectListProjects.class, "projectReference"));
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
