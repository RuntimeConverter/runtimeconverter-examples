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

public class Google_Template extends Google_Model implements RuntimeFileContextInterface {

    public Object body = null;

    public Object kind = null;

    public Object name = null;

    public Object automaticColumnNames = null;

    public Object isDefaultForTable = null;

    public Object tableId = null;

    public Object templateId = null;

    public Google_Template(RuntimeEnv env, Object... args) {
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
            case "setBody":
                return this.setBody(env, args);
            case "getBody":
                return this.getBody(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setName":
                return this.setName(env, args);
            case "getName":
                return this.getName(env, args);
            case "setAutomaticColumnNames":
                return this.setAutomaticColumnNames(env, args);
            case "getAutomaticColumnNames":
                return this.getAutomaticColumnNames(env, args);
            case "setIsDefaultForTable":
                return this.setIsDefaultForTable(env, args);
            case "getIsDefaultForTable":
                return this.getIsDefaultForTable(env, args);
            case "setTableId":
                return this.setTableId(env, args);
            case "getTableId":
                return this.getTableId(env, args);
            case "setTemplateId":
                return this.setTemplateId(env, args);
            case "getTemplateId":
                return this.getTemplateId(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "body":
                return this.body;
            case "kind":
                return this.kind;
            case "name":
                return this.name;
            case "automaticColumnNames":
                return this.automaticColumnNames;
            case "isDefaultForTable":
                return this.isDefaultForTable;
            case "tableId":
                return this.tableId;
            case "templateId":
                return this.templateId;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "body":
                return ZVal.isNull(this.body);
            case "kind":
                return ZVal.isNull(this.kind);
            case "name":
                return ZVal.isNull(this.name);
            case "automaticColumnNames":
                return ZVal.isNull(this.automaticColumnNames);
            case "isDefaultForTable":
                return ZVal.isNull(this.isDefaultForTable);
            case "tableId":
                return ZVal.isNull(this.tableId);
            case "templateId":
                return ZVal.isNull(this.templateId);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "body":
                this.body = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "name":
                this.name = value;
                break;
            case "automaticColumnNames":
                this.automaticColumnNames = value;
                break;
            case "isDefaultForTable":
                this.isDefaultForTable = value;
                break;
            case "tableId":
                this.tableId = value;
                break;
            case "templateId":
                this.templateId = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setBody(RuntimeEnv env, Object... args) {
        Object body = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Template.class, "body", body);

        return null;
    }

    public Object getBody(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Template.class, "body"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Template.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Template.class, "kind"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Template.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Template.class, "name"));
    }

    public Object setAutomaticColumnNames(RuntimeEnv env, Object... args) {
        Object automaticColumnNames = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Template.class,
                automaticColumnNames,
                "Google_string",
                "setAutomaticColumnNames");
        ZVal.setProperty(this, Google_Template.class, "automaticColumnNames", automaticColumnNames);

        return null;
    }

    public Object getAutomaticColumnNames(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Template.class, "automaticColumnNames"));
    }

    public Object setIsDefaultForTable(RuntimeEnv env, Object... args) {
        Object isDefaultForTable = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Template.class, "isDefaultForTable", isDefaultForTable);

        return null;
    }

    public Object getIsDefaultForTable(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Template.class, "isDefaultForTable"));
    }

    public Object setTableId(RuntimeEnv env, Object... args) {
        Object tableId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Template.class, "tableId", tableId);

        return null;
    }

    public Object getTableId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Template.class, "tableId"));
    }

    public Object setTemplateId(RuntimeEnv env, Object... args) {
        Object templateId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Template.class, "templateId", templateId);

        return null;
    }

    public Object getTemplateId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Template.class, "templateId"));
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
