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

 google-api-php-client/src/contrib/Google_BigqueryService.php

*/

public class Google_JobStatus extends Google_Model implements RuntimeFileContextInterface {

    public Object state = null;

    public Object __errorsType = "Google_ErrorProto";

    public Object __errorsDataType = "array";

    public Object errors = null;

    public Object __errorResultType = "Google_ErrorProto";

    public Object __errorResultDataType = "";

    public Object errorResult = null;

    public Google_JobStatus(RuntimeEnv env, Object... args) {
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
            case "setState":
                return this.setState(env, args);
            case "getState":
                return this.getState(env, args);
            case "setErrors":
                return this.setErrors(env, args);
            case "getErrors":
                return this.getErrors(env, args);
            case "setErrorResult":
                return this.setErrorResult(env, args);
            case "getErrorResult":
                return this.getErrorResult(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "state":
                return this.state;
            case "__errorsType":
                if (Google_JobStatus.class.isAssignableFrom(caller)) {

                    return this.__errorsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__errorsDataType":
                if (Google_JobStatus.class.isAssignableFrom(caller)) {

                    return this.__errorsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "errors":
                return this.errors;
            case "__errorResultType":
                if (Google_JobStatus.class.isAssignableFrom(caller)) {

                    return this.__errorResultType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__errorResultDataType":
                if (Google_JobStatus.class.isAssignableFrom(caller)) {

                    return this.__errorResultDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "errorResult":
                return this.errorResult;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "state":
                return ZVal.isNull(this.state);
            case "__errorsType":
                if (Google_JobStatus.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__errorsType);
                }
                break;
            case "__errorsDataType":
                if (Google_JobStatus.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__errorsDataType);
                }
                break;
            case "errors":
                return ZVal.isNull(this.errors);
            case "__errorResultType":
                if (Google_JobStatus.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__errorResultType);
                }
                break;
            case "__errorResultDataType":
                if (Google_JobStatus.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__errorResultDataType);
                }
                break;
            case "errorResult":
                return ZVal.isNull(this.errorResult);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "state":
                this.state = value;
                break;
            case "__errorsType":
                if (Google_JobStatus.class.isAssignableFrom(caller)) {

                    this.__errorsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__errorsDataType":
                if (Google_JobStatus.class.isAssignableFrom(caller)) {

                    this.__errorsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "errors":
                this.errors = value;
                break;
            case "__errorResultType":
                if (Google_JobStatus.class.isAssignableFrom(caller)) {

                    this.__errorResultType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__errorResultDataType":
                if (Google_JobStatus.class.isAssignableFrom(caller)) {

                    this.__errorResultDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "errorResult":
                this.errorResult = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setState(RuntimeEnv env, Object... args) {
        Object state = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_JobStatus.class, "state", state);

        return null;
    }

    public Object getState(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_JobStatus.class, "state"));
    }

    public Object setErrors(RuntimeEnv env, Object... args) {
        Object errors = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_JobStatus.class,
                errors,
                "Google_ErrorProto",
                "setErrors");
        ZVal.setProperty(this, Google_JobStatus.class, "errors", errors);

        return null;
    }

    public Object getErrors(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_JobStatus.class, "errors"));
    }

    public Object setErrorResult(RuntimeEnv env, Object... args) {
        Object errorResult = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_JobStatus.class, "errorResult", errorResult);

        return null;
    }

    public Object getErrorResult(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_JobStatus.class, "errorResult"));
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
