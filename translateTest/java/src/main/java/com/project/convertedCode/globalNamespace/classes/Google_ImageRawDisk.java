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

public class Google_ImageRawDisk extends Google_Model implements RuntimeFileContextInterface {

    public Object containerType = null;

    public Object source = null;

    public Object sha1Checksum = null;

    public Google_ImageRawDisk(RuntimeEnv env, Object... args) {
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
            case "setContainerType":
                return this.setContainerType(env, args);
            case "getContainerType":
                return this.getContainerType(env, args);
            case "setSource":
                return this.setSource(env, args);
            case "getSource":
                return this.getSource(env, args);
            case "setSha1Checksum":
                return this.setSha1Checksum(env, args);
            case "getSha1Checksum":
                return this.getSha1Checksum(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "containerType":
                return this.containerType;
            case "source":
                return this.source;
            case "sha1Checksum":
                return this.sha1Checksum;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "containerType":
                return ZVal.isNull(this.containerType);
            case "source":
                return ZVal.isNull(this.source);
            case "sha1Checksum":
                return ZVal.isNull(this.sha1Checksum);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "containerType":
                this.containerType = value;
                break;
            case "source":
                this.source = value;
                break;
            case "sha1Checksum":
                this.sha1Checksum = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setContainerType(RuntimeEnv env, Object... args) {
        Object containerType = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ImageRawDisk.class, "containerType", containerType);

        return null;
    }

    public Object getContainerType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ImageRawDisk.class, "containerType"));
    }

    public Object setSource(RuntimeEnv env, Object... args) {
        Object source = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ImageRawDisk.class, "source", source);

        return null;
    }

    public Object getSource(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ImageRawDisk.class, "source"));
    }

    public Object setSha1Checksum(RuntimeEnv env, Object... args) {
        Object sha1Checksum = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ImageRawDisk.class, "sha1Checksum", sha1Checksum);

        return null;
    }

    public Object getSha1Checksum(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ImageRawDisk.class, "sha1Checksum"));
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
