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

 google-api-php-client/src/contrib/Google_PlusService.php

*/

public class Google_PersonOrganizations extends Google_Model
        implements RuntimeFileContextInterface {

    public Object startDate = null;

    public Object endDate = null;

    public Object description = null;

    public Object title = null;

    public Object primary = null;

    public Object location = null;

    public Object department = null;

    public Object type = null;

    public Object name = null;

    public Google_PersonOrganizations(RuntimeEnv env, Object... args) {
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
            case "setStartDate":
                return this.setStartDate(env, args);
            case "getStartDate":
                return this.getStartDate(env, args);
            case "setEndDate":
                return this.setEndDate(env, args);
            case "getEndDate":
                return this.getEndDate(env, args);
            case "setDescription":
                return this.setDescription(env, args);
            case "getDescription":
                return this.getDescription(env, args);
            case "setTitle":
                return this.setTitle(env, args);
            case "getTitle":
                return this.getTitle(env, args);
            case "setPrimary":
                return this.setPrimary(env, args);
            case "getPrimary":
                return this.getPrimary(env, args);
            case "setLocation":
                return this.setLocation(env, args);
            case "getLocation":
                return this.getLocation(env, args);
            case "setDepartment":
                return this.setDepartment(env, args);
            case "getDepartment":
                return this.getDepartment(env, args);
            case "setType":
                return this.setType(env, args);
            case "getType":
                return this.getType(env, args);
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
            case "startDate":
                return this.startDate;
            case "endDate":
                return this.endDate;
            case "description":
                return this.description;
            case "title":
                return this.title;
            case "primary":
                return this.primary;
            case "location":
                return this.location;
            case "department":
                return this.department;
            case "type":
                return this.type;
            case "name":
                return this.name;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "startDate":
                return ZVal.isNull(this.startDate);
            case "endDate":
                return ZVal.isNull(this.endDate);
            case "description":
                return ZVal.isNull(this.description);
            case "title":
                return ZVal.isNull(this.title);
            case "primary":
                return ZVal.isNull(this.primary);
            case "location":
                return ZVal.isNull(this.location);
            case "department":
                return ZVal.isNull(this.department);
            case "type":
                return ZVal.isNull(this.type);
            case "name":
                return ZVal.isNull(this.name);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "startDate":
                this.startDate = value;
                break;
            case "endDate":
                this.endDate = value;
                break;
            case "description":
                this.description = value;
                break;
            case "title":
                this.title = value;
                break;
            case "primary":
                this.primary = value;
                break;
            case "location":
                this.location = value;
                break;
            case "department":
                this.department = value;
                break;
            case "type":
                this.type = value;
                break;
            case "name":
                this.name = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setStartDate(RuntimeEnv env, Object... args) {
        Object startDate = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PersonOrganizations.class, "startDate", startDate);

        return null;
    }

    public Object getStartDate(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PersonOrganizations.class, "startDate"));
    }

    public Object setEndDate(RuntimeEnv env, Object... args) {
        Object endDate = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PersonOrganizations.class, "endDate", endDate);

        return null;
    }

    public Object getEndDate(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PersonOrganizations.class, "endDate"));
    }

    public Object setDescription(RuntimeEnv env, Object... args) {
        Object description = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PersonOrganizations.class, "description", description);

        return null;
    }

    public Object getDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PersonOrganizations.class, "description"));
    }

    public Object setTitle(RuntimeEnv env, Object... args) {
        Object title = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PersonOrganizations.class, "title", title);

        return null;
    }

    public Object getTitle(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PersonOrganizations.class, "title"));
    }

    public Object setPrimary(RuntimeEnv env, Object... args) {
        Object primary = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PersonOrganizations.class, "primary", primary);

        return null;
    }

    public Object getPrimary(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PersonOrganizations.class, "primary"));
    }

    public Object setLocation(RuntimeEnv env, Object... args) {
        Object location = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PersonOrganizations.class, "location", location);

        return null;
    }

    public Object getLocation(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PersonOrganizations.class, "location"));
    }

    public Object setDepartment(RuntimeEnv env, Object... args) {
        Object department = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PersonOrganizations.class, "department", department);

        return null;
    }

    public Object getDepartment(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PersonOrganizations.class, "department"));
    }

    public Object setType(RuntimeEnv env, Object... args) {
        Object type = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PersonOrganizations.class, "type", type);

        return null;
    }

    public Object getType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PersonOrganizations.class, "type"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PersonOrganizations.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_PersonOrganizations.class, "name"));
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
