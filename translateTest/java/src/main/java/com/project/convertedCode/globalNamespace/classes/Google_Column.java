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

 google-api-php-client/src/contrib/Google_FusiontablesService.php

*/

public class Google_Column extends Google_Model implements RuntimeFileContextInterface {

    public Object kind = null;

    public Object type = null;

    public Object columnId = null;

    public Object name = null;

    public Object __baseColumnType = "Google_ColumnBaseColumn";

    public Object __baseColumnDataType = "";

    public Object baseColumn = null;

    public Google_Column(RuntimeEnv env, Object... args) {
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
            case "setType":
                return this.setType(env, args);
            case "getType":
                return this.getType(env, args);
            case "setColumnId":
                return this.setColumnId(env, args);
            case "getColumnId":
                return this.getColumnId(env, args);
            case "setName":
                return this.setName(env, args);
            case "getName":
                return this.getName(env, args);
            case "setBaseColumn":
                return this.setBaseColumn(env, args);
            case "getBaseColumn":
                return this.getBaseColumn(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return this.kind;
            case "type":
                return this.type;
            case "columnId":
                return this.columnId;
            case "name":
                return this.name;
            case "__baseColumnType":
                if (Google_Column.class.isAssignableFrom(caller)) {

                    return this.__baseColumnType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__baseColumnDataType":
                if (Google_Column.class.isAssignableFrom(caller)) {

                    return this.__baseColumnDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "baseColumn":
                return this.baseColumn;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return ZVal.isNull(this.kind);
            case "type":
                return ZVal.isNull(this.type);
            case "columnId":
                return ZVal.isNull(this.columnId);
            case "name":
                return ZVal.isNull(this.name);
            case "__baseColumnType":
                if (Google_Column.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__baseColumnType);
                }
                break;
            case "__baseColumnDataType":
                if (Google_Column.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__baseColumnDataType);
                }
                break;
            case "baseColumn":
                return ZVal.isNull(this.baseColumn);
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
            case "type":
                this.type = value;
                break;
            case "columnId":
                this.columnId = value;
                break;
            case "name":
                this.name = value;
                break;
            case "__baseColumnType":
                if (Google_Column.class.isAssignableFrom(caller)) {

                    this.__baseColumnType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__baseColumnDataType":
                if (Google_Column.class.isAssignableFrom(caller)) {

                    this.__baseColumnDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "baseColumn":
                this.baseColumn = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Column.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Column.class, "kind"));
    }

    public Object setType(RuntimeEnv env, Object... args) {
        Object type = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Column.class, "type", type);

        return null;
    }

    public Object getType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Column.class, "type"));
    }

    public Object setColumnId(RuntimeEnv env, Object... args) {
        Object columnId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Column.class, "columnId", columnId);

        return null;
    }

    public Object getColumnId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Column.class, "columnId"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Column.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Column.class, "name"));
    }

    public Object setBaseColumn(RuntimeEnv env, Object... args) {
        Object baseColumn = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Column.class, "baseColumn", baseColumn);

        return null;
    }

    public Object getBaseColumn(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Column.class, "baseColumn"));
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
