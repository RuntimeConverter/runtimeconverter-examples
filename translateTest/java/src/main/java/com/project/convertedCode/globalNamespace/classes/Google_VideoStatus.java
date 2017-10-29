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

 google-api-php-client/src/contrib/Google_YoutubeService.php

*/

public class Google_VideoStatus extends Google_Model implements RuntimeFileContextInterface {

    public Object privacyStatus = null;

    public Object uploadStatus = null;

    public Object rejectionReason = null;

    public Object failureReason = null;

    public Google_VideoStatus(RuntimeEnv env, Object... args) {
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
            case "setPrivacyStatus":
                return this.setPrivacyStatus(env, args);
            case "getPrivacyStatus":
                return this.getPrivacyStatus(env, args);
            case "setUploadStatus":
                return this.setUploadStatus(env, args);
            case "getUploadStatus":
                return this.getUploadStatus(env, args);
            case "setRejectionReason":
                return this.setRejectionReason(env, args);
            case "getRejectionReason":
                return this.getRejectionReason(env, args);
            case "setFailureReason":
                return this.setFailureReason(env, args);
            case "getFailureReason":
                return this.getFailureReason(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "privacyStatus":
                return this.privacyStatus;
            case "uploadStatus":
                return this.uploadStatus;
            case "rejectionReason":
                return this.rejectionReason;
            case "failureReason":
                return this.failureReason;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "privacyStatus":
                return ZVal.isNull(this.privacyStatus);
            case "uploadStatus":
                return ZVal.isNull(this.uploadStatus);
            case "rejectionReason":
                return ZVal.isNull(this.rejectionReason);
            case "failureReason":
                return ZVal.isNull(this.failureReason);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "privacyStatus":
                this.privacyStatus = value;
                break;
            case "uploadStatus":
                this.uploadStatus = value;
                break;
            case "rejectionReason":
                this.rejectionReason = value;
                break;
            case "failureReason":
                this.failureReason = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setPrivacyStatus(RuntimeEnv env, Object... args) {
        Object privacyStatus = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VideoStatus.class, "privacyStatus", privacyStatus);

        return null;
    }

    public Object getPrivacyStatus(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VideoStatus.class, "privacyStatus"));
    }

    public Object setUploadStatus(RuntimeEnv env, Object... args) {
        Object uploadStatus = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VideoStatus.class, "uploadStatus", uploadStatus);

        return null;
    }

    public Object getUploadStatus(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VideoStatus.class, "uploadStatus"));
    }

    public Object setRejectionReason(RuntimeEnv env, Object... args) {
        Object rejectionReason = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VideoStatus.class, "rejectionReason", rejectionReason);

        return null;
    }

    public Object getRejectionReason(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VideoStatus.class, "rejectionReason"));
    }

    public Object setFailureReason(RuntimeEnv env, Object... args) {
        Object failureReason = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VideoStatus.class, "failureReason", failureReason);

        return null;
    }

    public Object getFailureReason(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VideoStatus.class, "failureReason"));
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
