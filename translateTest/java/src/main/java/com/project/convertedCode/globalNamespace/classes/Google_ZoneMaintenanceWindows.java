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

 google-api-php-client/src/contrib/Google_ComputeService.php

*/

public class Google_ZoneMaintenanceWindows extends Google_Model
        implements RuntimeFileContextInterface {

    public Object endTime = null;

    public Object beginTime = null;

    public Object name = null;

    public Object description = null;

    public Google_ZoneMaintenanceWindows(RuntimeEnv env, Object... args) {
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
            case "setEndTime":
                return this.setEndTime(env, args);
            case "getEndTime":
                return this.getEndTime(env, args);
            case "setBeginTime":
                return this.setBeginTime(env, args);
            case "getBeginTime":
                return this.getBeginTime(env, args);
            case "setName":
                return this.setName(env, args);
            case "getName":
                return this.getName(env, args);
            case "setDescription":
                return this.setDescription(env, args);
            case "getDescription":
                return this.getDescription(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "endTime":
                return this.endTime;
            case "beginTime":
                return this.beginTime;
            case "name":
                return this.name;
            case "description":
                return this.description;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "endTime":
                return ZVal.isNull(this.endTime);
            case "beginTime":
                return ZVal.isNull(this.beginTime);
            case "name":
                return ZVal.isNull(this.name);
            case "description":
                return ZVal.isNull(this.description);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "endTime":
                this.endTime = value;
                break;
            case "beginTime":
                this.beginTime = value;
                break;
            case "name":
                this.name = value;
                break;
            case "description":
                this.description = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setEndTime(RuntimeEnv env, Object... args) {
        Object endTime = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ZoneMaintenanceWindows.class, "endTime", endTime);

        return null;
    }

    public Object getEndTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ZoneMaintenanceWindows.class, "endTime"));
    }

    public Object setBeginTime(RuntimeEnv env, Object... args) {
        Object beginTime = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ZoneMaintenanceWindows.class, "beginTime", beginTime);

        return null;
    }

    public Object getBeginTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ZoneMaintenanceWindows.class, "beginTime"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ZoneMaintenanceWindows.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ZoneMaintenanceWindows.class, "name"));
    }

    public Object setDescription(RuntimeEnv env, Object... args) {
        Object description = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ZoneMaintenanceWindows.class, "description", description);

        return null;
    }

    public Object getDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ZoneMaintenanceWindows.class, "description"));
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
