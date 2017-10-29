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

 google-api-php-client/src/contrib/Google_BooksService.php

*/

public class Google_VolumeVolumeInfoDimensions extends Google_Model
        implements RuntimeFileContextInterface {

    public Object width = null;

    public Object thickness = null;

    public Object height = null;

    public Google_VolumeVolumeInfoDimensions(RuntimeEnv env, Object... args) {
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
            case "setWidth":
                return this.setWidth(env, args);
            case "getWidth":
                return this.getWidth(env, args);
            case "setThickness":
                return this.setThickness(env, args);
            case "getThickness":
                return this.getThickness(env, args);
            case "setHeight":
                return this.setHeight(env, args);
            case "getHeight":
                return this.getHeight(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "width":
                return this.width;
            case "thickness":
                return this.thickness;
            case "height":
                return this.height;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "width":
                return ZVal.isNull(this.width);
            case "thickness":
                return ZVal.isNull(this.thickness);
            case "height":
                return ZVal.isNull(this.height);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "width":
                this.width = value;
                break;
            case "thickness":
                this.thickness = value;
                break;
            case "height":
                this.height = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setWidth(RuntimeEnv env, Object... args) {
        Object width = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeVolumeInfoDimensions.class, "width", width);

        return null;
    }

    public Object getWidth(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_VolumeVolumeInfoDimensions.class, "width"));
    }

    public Object setThickness(RuntimeEnv env, Object... args) {
        Object thickness = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeVolumeInfoDimensions.class, "thickness", thickness);

        return null;
    }

    public Object getThickness(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_VolumeVolumeInfoDimensions.class, "thickness"));
    }

    public Object setHeight(RuntimeEnv env, Object... args) {
        Object height = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeVolumeInfoDimensions.class, "height", height);

        return null;
    }

    public Object getHeight(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_VolumeVolumeInfoDimensions.class, "height"));
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
