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

public class Google_TableListTables extends Google_Model implements RuntimeFileContextInterface {

    public Object friendlyName = null;

    public Object kind = null;

    public Object id = null;

    public Object __tableReferenceType = "Google_TableReference";

    public Object __tableReferenceDataType = "";

    public Object tableReference = null;

    public Google_TableListTables(RuntimeEnv env, Object... args) {
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
            case "setTableReference":
                return this.setTableReference(env, args);
            case "getTableReference":
                return this.getTableReference(env, args);
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
            case "__tableReferenceType":
                if (Google_TableListTables.class.isAssignableFrom(caller)) {

                    return this.__tableReferenceType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__tableReferenceDataType":
                if (Google_TableListTables.class.isAssignableFrom(caller)) {

                    return this.__tableReferenceDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "tableReference":
                return this.tableReference;
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
            case "__tableReferenceType":
                if (Google_TableListTables.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__tableReferenceType);
                }
                break;
            case "__tableReferenceDataType":
                if (Google_TableListTables.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__tableReferenceDataType);
                }
                break;
            case "tableReference":
                return ZVal.isNull(this.tableReference);
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
            case "__tableReferenceType":
                if (Google_TableListTables.class.isAssignableFrom(caller)) {

                    this.__tableReferenceType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__tableReferenceDataType":
                if (Google_TableListTables.class.isAssignableFrom(caller)) {

                    this.__tableReferenceDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "tableReference":
                this.tableReference = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setFriendlyName(RuntimeEnv env, Object... args) {
        Object friendlyName = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_TableListTables.class, "friendlyName", friendlyName);

        return null;
    }

    public Object getFriendlyName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_TableListTables.class, "friendlyName"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_TableListTables.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_TableListTables.class, "kind"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_TableListTables.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_TableListTables.class, "id"));
    }

    public Object setTableReference(RuntimeEnv env, Object... args) {
        Object tableReference = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_TableListTables.class, "tableReference", tableReference);

        return null;
    }

    public Object getTableReference(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_TableListTables.class, "tableReference"));
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
