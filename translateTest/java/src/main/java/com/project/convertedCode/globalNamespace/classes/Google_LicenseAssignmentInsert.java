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

 google-api-php-client/src/contrib/Google_LicensingService.php

*/

public class Google_LicenseAssignmentInsert extends Google_Model
        implements RuntimeFileContextInterface {

    public Object userId = null;

    public Google_LicenseAssignmentInsert(RuntimeEnv env, Object... args) {
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
            case "setUserId":
                return this.setUserId(env, args);
            case "getUserId":
                return this.getUserId(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "userId":
                return this.userId;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "userId":
                return ZVal.isNull(this.userId);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "userId":
                this.userId = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setUserId(RuntimeEnv env, Object... args) {
        Object userId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_LicenseAssignmentInsert.class, "userId", userId);

        return null;
    }

    public Object getUserId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_LicenseAssignmentInsert.class, "userId"));
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
