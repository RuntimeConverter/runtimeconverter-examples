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

public class Google_Operation extends Google_Model implements RuntimeFileContextInterface {

    public Object status = null;

    public Object kind = null;

    public Object name = null;

    public Object startTime = null;

    public Object httpErrorStatusCode = null;

    public Object user = null;

    public Object __errorType = "Google_OperationError";

    public Object __errorDataType = "";

    public Object error = null;

    public Object targetId = null;

    public Object operationType = null;

    public Object statusMessage = null;

    public Object insertTime = null;

    public Object httpErrorMessage = null;

    public Object progress = null;

    public Object clientOperationId = null;

    public Object endTime = null;

    public Object creationTimestamp = null;

    public Object id = null;

    public Object selfLink = null;

    public Object targetLink = null;

    public Google_Operation(RuntimeEnv env, Object... args) {
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
            case "setStatus":
                return this.setStatus(env, args);
            case "getStatus":
                return this.getStatus(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setName":
                return this.setName(env, args);
            case "getName":
                return this.getName(env, args);
            case "setStartTime":
                return this.setStartTime(env, args);
            case "getStartTime":
                return this.getStartTime(env, args);
            case "setHttpErrorStatusCode":
                return this.setHttpErrorStatusCode(env, args);
            case "getHttpErrorStatusCode":
                return this.getHttpErrorStatusCode(env, args);
            case "setUser":
                return this.setUser(env, args);
            case "getUser":
                return this.getUser(env, args);
            case "setError":
                return this.setError(env, args);
            case "getError":
                return this.getError(env, args);
            case "setTargetId":
                return this.setTargetId(env, args);
            case "getTargetId":
                return this.getTargetId(env, args);
            case "setOperationType":
                return this.setOperationType(env, args);
            case "getOperationType":
                return this.getOperationType(env, args);
            case "setStatusMessage":
                return this.setStatusMessage(env, args);
            case "getStatusMessage":
                return this.getStatusMessage(env, args);
            case "setInsertTime":
                return this.setInsertTime(env, args);
            case "getInsertTime":
                return this.getInsertTime(env, args);
            case "setHttpErrorMessage":
                return this.setHttpErrorMessage(env, args);
            case "getHttpErrorMessage":
                return this.getHttpErrorMessage(env, args);
            case "setProgress":
                return this.setProgress(env, args);
            case "getProgress":
                return this.getProgress(env, args);
            case "setClientOperationId":
                return this.setClientOperationId(env, args);
            case "getClientOperationId":
                return this.getClientOperationId(env, args);
            case "setEndTime":
                return this.setEndTime(env, args);
            case "getEndTime":
                return this.getEndTime(env, args);
            case "setCreationTimestamp":
                return this.setCreationTimestamp(env, args);
            case "getCreationTimestamp":
                return this.getCreationTimestamp(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setSelfLink":
                return this.setSelfLink(env, args);
            case "getSelfLink":
                return this.getSelfLink(env, args);
            case "setTargetLink":
                return this.setTargetLink(env, args);
            case "getTargetLink":
                return this.getTargetLink(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "status":
                return this.status;
            case "kind":
                return this.kind;
            case "name":
                return this.name;
            case "startTime":
                return this.startTime;
            case "httpErrorStatusCode":
                return this.httpErrorStatusCode;
            case "user":
                return this.user;
            case "__errorType":
                if (Google_Operation.class.isAssignableFrom(caller)) {

                    return this.__errorType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__errorDataType":
                if (Google_Operation.class.isAssignableFrom(caller)) {

                    return this.__errorDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "error":
                return this.error;
            case "targetId":
                return this.targetId;
            case "operationType":
                return this.operationType;
            case "statusMessage":
                return this.statusMessage;
            case "insertTime":
                return this.insertTime;
            case "httpErrorMessage":
                return this.httpErrorMessage;
            case "progress":
                return this.progress;
            case "clientOperationId":
                return this.clientOperationId;
            case "endTime":
                return this.endTime;
            case "creationTimestamp":
                return this.creationTimestamp;
            case "id":
                return this.id;
            case "selfLink":
                return this.selfLink;
            case "targetLink":
                return this.targetLink;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "status":
                return ZVal.isNull(this.status);
            case "kind":
                return ZVal.isNull(this.kind);
            case "name":
                return ZVal.isNull(this.name);
            case "startTime":
                return ZVal.isNull(this.startTime);
            case "httpErrorStatusCode":
                return ZVal.isNull(this.httpErrorStatusCode);
            case "user":
                return ZVal.isNull(this.user);
            case "__errorType":
                if (Google_Operation.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__errorType);
                }
                break;
            case "__errorDataType":
                if (Google_Operation.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__errorDataType);
                }
                break;
            case "error":
                return ZVal.isNull(this.error);
            case "targetId":
                return ZVal.isNull(this.targetId);
            case "operationType":
                return ZVal.isNull(this.operationType);
            case "statusMessage":
                return ZVal.isNull(this.statusMessage);
            case "insertTime":
                return ZVal.isNull(this.insertTime);
            case "httpErrorMessage":
                return ZVal.isNull(this.httpErrorMessage);
            case "progress":
                return ZVal.isNull(this.progress);
            case "clientOperationId":
                return ZVal.isNull(this.clientOperationId);
            case "endTime":
                return ZVal.isNull(this.endTime);
            case "creationTimestamp":
                return ZVal.isNull(this.creationTimestamp);
            case "id":
                return ZVal.isNull(this.id);
            case "selfLink":
                return ZVal.isNull(this.selfLink);
            case "targetLink":
                return ZVal.isNull(this.targetLink);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "status":
                this.status = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "name":
                this.name = value;
                break;
            case "startTime":
                this.startTime = value;
                break;
            case "httpErrorStatusCode":
                this.httpErrorStatusCode = value;
                break;
            case "user":
                this.user = value;
                break;
            case "__errorType":
                if (Google_Operation.class.isAssignableFrom(caller)) {

                    this.__errorType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__errorDataType":
                if (Google_Operation.class.isAssignableFrom(caller)) {

                    this.__errorDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "error":
                this.error = value;
                break;
            case "targetId":
                this.targetId = value;
                break;
            case "operationType":
                this.operationType = value;
                break;
            case "statusMessage":
                this.statusMessage = value;
                break;
            case "insertTime":
                this.insertTime = value;
                break;
            case "httpErrorMessage":
                this.httpErrorMessage = value;
                break;
            case "progress":
                this.progress = value;
                break;
            case "clientOperationId":
                this.clientOperationId = value;
                break;
            case "endTime":
                this.endTime = value;
                break;
            case "creationTimestamp":
                this.creationTimestamp = value;
                break;
            case "id":
                this.id = value;
                break;
            case "selfLink":
                this.selfLink = value;
                break;
            case "targetLink":
                this.targetLink = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setStatus(RuntimeEnv env, Object... args) {
        Object status = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Operation.class, "status", status);

        return null;
    }

    public Object getStatus(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Operation.class, "status"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Operation.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Operation.class, "kind"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Operation.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Operation.class, "name"));
    }

    public Object setStartTime(RuntimeEnv env, Object... args) {
        Object startTime = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Operation.class, "startTime", startTime);

        return null;
    }

    public Object getStartTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Operation.class, "startTime"));
    }

    public Object setHttpErrorStatusCode(RuntimeEnv env, Object... args) {
        Object httpErrorStatusCode = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Operation.class, "httpErrorStatusCode", httpErrorStatusCode);

        return null;
    }

    public Object getHttpErrorStatusCode(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Operation.class, "httpErrorStatusCode"));
    }

    public Object setUser(RuntimeEnv env, Object... args) {
        Object user = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Operation.class, "user", user);

        return null;
    }

    public Object getUser(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Operation.class, "user"));
    }

    public Object setError(RuntimeEnv env, Object... args) {
        Object error = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Operation.class, "error", error);

        return null;
    }

    public Object getError(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Operation.class, "error"));
    }

    public Object setTargetId(RuntimeEnv env, Object... args) {
        Object targetId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Operation.class, "targetId", targetId);

        return null;
    }

    public Object getTargetId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Operation.class, "targetId"));
    }

    public Object setOperationType(RuntimeEnv env, Object... args) {
        Object operationType = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Operation.class, "operationType", operationType);

        return null;
    }

    public Object getOperationType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Operation.class, "operationType"));
    }

    public Object setStatusMessage(RuntimeEnv env, Object... args) {
        Object statusMessage = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Operation.class, "statusMessage", statusMessage);

        return null;
    }

    public Object getStatusMessage(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Operation.class, "statusMessage"));
    }

    public Object setInsertTime(RuntimeEnv env, Object... args) {
        Object insertTime = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Operation.class, "insertTime", insertTime);

        return null;
    }

    public Object getInsertTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Operation.class, "insertTime"));
    }

    public Object setHttpErrorMessage(RuntimeEnv env, Object... args) {
        Object httpErrorMessage = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Operation.class, "httpErrorMessage", httpErrorMessage);

        return null;
    }

    public Object getHttpErrorMessage(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Operation.class, "httpErrorMessage"));
    }

    public Object setProgress(RuntimeEnv env, Object... args) {
        Object progress = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Operation.class, "progress", progress);

        return null;
    }

    public Object getProgress(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Operation.class, "progress"));
    }

    public Object setClientOperationId(RuntimeEnv env, Object... args) {
        Object clientOperationId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Operation.class, "clientOperationId", clientOperationId);

        return null;
    }

    public Object getClientOperationId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Operation.class, "clientOperationId"));
    }

    public Object setEndTime(RuntimeEnv env, Object... args) {
        Object endTime = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Operation.class, "endTime", endTime);

        return null;
    }

    public Object getEndTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Operation.class, "endTime"));
    }

    public Object setCreationTimestamp(RuntimeEnv env, Object... args) {
        Object creationTimestamp = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Operation.class, "creationTimestamp", creationTimestamp);

        return null;
    }

    public Object getCreationTimestamp(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Operation.class, "creationTimestamp"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Operation.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Operation.class, "id"));
    }

    public Object setSelfLink(RuntimeEnv env, Object... args) {
        Object selfLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Operation.class, "selfLink", selfLink);

        return null;
    }

    public Object getSelfLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Operation.class, "selfLink"));
    }

    public Object setTargetLink(RuntimeEnv env, Object... args) {
        Object targetLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Operation.class, "targetLink", targetLink);

        return null;
    }

    public Object getTargetLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Operation.class, "targetLink"));
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
