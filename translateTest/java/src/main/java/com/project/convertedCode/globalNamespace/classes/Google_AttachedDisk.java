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

public class Google_AttachedDisk extends Google_Model implements RuntimeFileContextInterface {

    public Object deviceName = null;

    public Object kind = null;

    public Object index = null;

    public Object source = null;

    public Object mode = null;

    public Object deleteOnTerminate = null;

    public Object type = null;

    public Google_AttachedDisk(RuntimeEnv env, Object... args) {
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
            case "setDeviceName":
                return this.setDeviceName(env, args);
            case "getDeviceName":
                return this.getDeviceName(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setIndex":
                return this.setIndex(env, args);
            case "getIndex":
                return this.getIndex(env, args);
            case "setSource":
                return this.setSource(env, args);
            case "getSource":
                return this.getSource(env, args);
            case "setMode":
                return this.setMode(env, args);
            case "getMode":
                return this.getMode(env, args);
            case "setDeleteOnTerminate":
                return this.setDeleteOnTerminate(env, args);
            case "getDeleteOnTerminate":
                return this.getDeleteOnTerminate(env, args);
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
            case "deviceName":
                return this.deviceName;
            case "kind":
                return this.kind;
            case "index":
                return this.index;
            case "source":
                return this.source;
            case "mode":
                return this.mode;
            case "deleteOnTerminate":
                return this.deleteOnTerminate;
            case "type":
                return this.type;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "deviceName":
                return ZVal.isNull(this.deviceName);
            case "kind":
                return ZVal.isNull(this.kind);
            case "index":
                return ZVal.isNull(this.index);
            case "source":
                return ZVal.isNull(this.source);
            case "mode":
                return ZVal.isNull(this.mode);
            case "deleteOnTerminate":
                return ZVal.isNull(this.deleteOnTerminate);
            case "type":
                return ZVal.isNull(this.type);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "deviceName":
                this.deviceName = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "index":
                this.index = value;
                break;
            case "source":
                this.source = value;
                break;
            case "mode":
                this.mode = value;
                break;
            case "deleteOnTerminate":
                this.deleteOnTerminate = value;
                break;
            case "type":
                this.type = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setDeviceName(RuntimeEnv env, Object... args) {
        Object deviceName = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AttachedDisk.class, "deviceName", deviceName);

        return null;
    }

    public Object getDeviceName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AttachedDisk.class, "deviceName"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AttachedDisk.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AttachedDisk.class, "kind"));
    }

    public Object setIndex(RuntimeEnv env, Object... args) {
        Object index = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AttachedDisk.class, "index", index);

        return null;
    }

    public Object getIndex(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AttachedDisk.class, "index"));
    }

    public Object setSource(RuntimeEnv env, Object... args) {
        Object source = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AttachedDisk.class, "source", source);

        return null;
    }

    public Object getSource(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AttachedDisk.class, "source"));
    }

    public Object setMode(RuntimeEnv env, Object... args) {
        Object mode = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AttachedDisk.class, "mode", mode);

        return null;
    }

    public Object getMode(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AttachedDisk.class, "mode"));
    }

    public Object setDeleteOnTerminate(RuntimeEnv env, Object... args) {
        Object deleteOnTerminate = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AttachedDisk.class, "deleteOnTerminate", deleteOnTerminate);

        return null;
    }

    public Object getDeleteOnTerminate(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AttachedDisk.class, "deleteOnTerminate"));
    }

    public Object setType(RuntimeEnv env, Object... args) {
        Object type = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AttachedDisk.class, "type", type);

        return null;
    }

    public Object getType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AttachedDisk.class, "type"));
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
