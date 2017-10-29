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

public class Google_Table extends Google_Model implements RuntimeFileContextInterface {

    public Object kind = null;

    public Object attribution = null;

    public Object description = null;

    public Object isExportable = null;

    public Object baseTableIds = null;

    public Object attributionLink = null;

    public Object sql = null;

    public Object tableId = null;

    public Object __columnsType = "Google_Column";

    public Object __columnsDataType = "array";

    public Object columns = null;

    public Object name = null;

    public Google_Table(RuntimeEnv env, Object... args) {
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
            case "setAttribution":
                return this.setAttribution(env, args);
            case "getAttribution":
                return this.getAttribution(env, args);
            case "setDescription":
                return this.setDescription(env, args);
            case "getDescription":
                return this.getDescription(env, args);
            case "setIsExportable":
                return this.setIsExportable(env, args);
            case "getIsExportable":
                return this.getIsExportable(env, args);
            case "setBaseTableIds":
                return this.setBaseTableIds(env, args);
            case "getBaseTableIds":
                return this.getBaseTableIds(env, args);
            case "setAttributionLink":
                return this.setAttributionLink(env, args);
            case "getAttributionLink":
                return this.getAttributionLink(env, args);
            case "setSql":
                return this.setSql(env, args);
            case "getSql":
                return this.getSql(env, args);
            case "setTableId":
                return this.setTableId(env, args);
            case "getTableId":
                return this.getTableId(env, args);
            case "setColumns":
                return this.setColumns(env, args);
            case "getColumns":
                return this.getColumns(env, args);
            case "setName":
                return this.setName(env, args);
            case "getName":
                return this.getName(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return this.kind;
            case "attribution":
                return this.attribution;
            case "description":
                return this.description;
            case "isExportable":
                return this.isExportable;
            case "baseTableIds":
                return this.baseTableIds;
            case "attributionLink":
                return this.attributionLink;
            case "sql":
                return this.sql;
            case "tableId":
                return this.tableId;
            case "__columnsType":
                if (Google_Table.class.isAssignableFrom(caller)) {

                    return this.__columnsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__columnsDataType":
                if (Google_Table.class.isAssignableFrom(caller)) {

                    return this.__columnsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "columns":
                return this.columns;
            case "name":
                return this.name;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return ZVal.isNull(this.kind);
            case "attribution":
                return ZVal.isNull(this.attribution);
            case "description":
                return ZVal.isNull(this.description);
            case "isExportable":
                return ZVal.isNull(this.isExportable);
            case "baseTableIds":
                return ZVal.isNull(this.baseTableIds);
            case "attributionLink":
                return ZVal.isNull(this.attributionLink);
            case "sql":
                return ZVal.isNull(this.sql);
            case "tableId":
                return ZVal.isNull(this.tableId);
            case "__columnsType":
                if (Google_Table.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__columnsType);
                }
                break;
            case "__columnsDataType":
                if (Google_Table.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__columnsDataType);
                }
                break;
            case "columns":
                return ZVal.isNull(this.columns);
            case "name":
                return ZVal.isNull(this.name);
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
            case "attribution":
                this.attribution = value;
                break;
            case "description":
                this.description = value;
                break;
            case "isExportable":
                this.isExportable = value;
                break;
            case "baseTableIds":
                this.baseTableIds = value;
                break;
            case "attributionLink":
                this.attributionLink = value;
                break;
            case "sql":
                this.sql = value;
                break;
            case "tableId":
                this.tableId = value;
                break;
            case "__columnsType":
                if (Google_Table.class.isAssignableFrom(caller)) {

                    this.__columnsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__columnsDataType":
                if (Google_Table.class.isAssignableFrom(caller)) {

                    this.__columnsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "columns":
                this.columns = value;
                break;
            case "name":
                this.name = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Table.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Table.class, "kind"));
    }

    public Object setAttribution(RuntimeEnv env, Object... args) {
        Object attribution = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Table.class, "attribution", attribution);

        return null;
    }

    public Object getAttribution(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Table.class, "attribution"));
    }

    public Object setDescription(RuntimeEnv env, Object... args) {
        Object description = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Table.class, "description", description);

        return null;
    }

    public Object getDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Table.class, "description"));
    }

    public Object setIsExportable(RuntimeEnv env, Object... args) {
        Object isExportable = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Table.class, "isExportable", isExportable);

        return null;
    }

    public Object getIsExportable(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Table.class, "isExportable"));
    }

    public Object setBaseTableIds(RuntimeEnv env, Object... args) {
        Object baseTableIds = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Table.class,
                baseTableIds,
                "Google_string",
                "setBaseTableIds");
        ZVal.setProperty(this, Google_Table.class, "baseTableIds", baseTableIds);

        return null;
    }

    public Object getBaseTableIds(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Table.class, "baseTableIds"));
    }

    public Object setAttributionLink(RuntimeEnv env, Object... args) {
        Object attributionLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Table.class, "attributionLink", attributionLink);

        return null;
    }

    public Object getAttributionLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Table.class, "attributionLink"));
    }

    public Object setSql(RuntimeEnv env, Object... args) {
        Object sql = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Table.class, "sql", sql);

        return null;
    }

    public Object getSql(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Table.class, "sql"));
    }

    public Object setTableId(RuntimeEnv env, Object... args) {
        Object tableId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Table.class, "tableId", tableId);

        return null;
    }

    public Object getTableId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Table.class, "tableId"));
    }

    public Object setColumns(RuntimeEnv env, Object... args) {
        Object columns = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this, "assertIsArray", Google_Table.class, columns, "Google_Column", "setColumns");
        ZVal.setProperty(this, Google_Table.class, "columns", columns);

        return null;
    }

    public Object getColumns(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Table.class, "columns"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Table.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Table.class, "name"));
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
