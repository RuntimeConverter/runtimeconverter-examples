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

public class Google_Geometry extends Google_Model implements RuntimeFileContextInterface {

    public Object geometry = null;

    public Object type = null;

    public Object geometries = null;

    public Google_Geometry(RuntimeEnv env, Object... args) {
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
            case "setGeometry":
                return this.setGeometry(env, args);
            case "getGeometry":
                return this.getGeometry(env, args);
            case "setType":
                return this.setType(env, args);
            case "getType":
                return this.getType(env, args);
            case "setGeometries":
                return this.setGeometries(env, args);
            case "getGeometries":
                return this.getGeometries(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "geometry":
                return this.geometry;
            case "type":
                return this.type;
            case "geometries":
                return this.geometries;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "geometry":
                return ZVal.isNull(this.geometry);
            case "type":
                return ZVal.isNull(this.type);
            case "geometries":
                return ZVal.isNull(this.geometries);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "geometry":
                this.geometry = value;
                break;
            case "type":
                this.type = value;
                break;
            case "geometries":
                this.geometries = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setGeometry(RuntimeEnv env, Object... args) {
        Object geometry = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Geometry.class, "geometry", geometry);

        return null;
    }

    public Object getGeometry(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Geometry.class, "geometry"));
    }

    public Object setType(RuntimeEnv env, Object... args) {
        Object type = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Geometry.class, "type", type);

        return null;
    }

    public Object getType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Geometry.class, "type"));
    }

    public Object setGeometries(RuntimeEnv env, Object... args) {
        Object geometries = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Geometry.class,
                geometries,
                "Google_object",
                "setGeometries");
        ZVal.setProperty(this, Google_Geometry.class, "geometries", geometries);

        return null;
    }

    public Object getGeometries(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Geometry.class, "geometries"));
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
