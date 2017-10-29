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

 google-api-php-client/src/contrib/Google_DriveService.php

*/

public class Google_Change extends Google_Model implements RuntimeFileContextInterface {

    public Object kind = null;

    public Object deleted = null;

    public Object __fileType = "Google_DriveFile";

    public Object __fileDataType = "";

    public Object file = null;

    public Object id = null;

    public Object selfLink = null;

    public Object fileId = null;

    public Google_Change(RuntimeEnv env, Object... args) {
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
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setDeleted":
                return this.setDeleted(env, args);
            case "getDeleted":
                return this.getDeleted(env, args);
            case "setFile":
                return this.setFile(env, args);
            case "getFile":
                return this.getFile(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setSelfLink":
                return this.setSelfLink(env, args);
            case "getSelfLink":
                return this.getSelfLink(env, args);
            case "setFileId":
                return this.setFileId(env, args);
            case "getFileId":
                return this.getFileId(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return this.kind;
            case "deleted":
                return this.deleted;
            case "__fileType":
                if (Google_Change.class.isAssignableFrom(caller)) {

                    return this.__fileType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__fileDataType":
                if (Google_Change.class.isAssignableFrom(caller)) {

                    return this.__fileDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "file":
                return this.file;
            case "id":
                return this.id;
            case "selfLink":
                return this.selfLink;
            case "fileId":
                return this.fileId;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return ZVal.isNull(this.kind);
            case "deleted":
                return ZVal.isNull(this.deleted);
            case "__fileType":
                if (Google_Change.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__fileType);
                }
                break;
            case "__fileDataType":
                if (Google_Change.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__fileDataType);
                }
                break;
            case "file":
                return ZVal.isNull(this.file);
            case "id":
                return ZVal.isNull(this.id);
            case "selfLink":
                return ZVal.isNull(this.selfLink);
            case "fileId":
                return ZVal.isNull(this.fileId);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                this.kind = value;
                break;
            case "deleted":
                this.deleted = value;
                break;
            case "__fileType":
                if (Google_Change.class.isAssignableFrom(caller)) {

                    this.__fileType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__fileDataType":
                if (Google_Change.class.isAssignableFrom(caller)) {

                    this.__fileDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "file":
                this.file = value;
                break;
            case "id":
                this.id = value;
                break;
            case "selfLink":
                this.selfLink = value;
                break;
            case "fileId":
                this.fileId = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Change.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Change.class, "kind"));
    }

    public Object setDeleted(RuntimeEnv env, Object... args) {
        Object deleted = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Change.class, "deleted", deleted);

        return null;
    }

    public Object getDeleted(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Change.class, "deleted"));
    }

    public Object setFile(RuntimeEnv env, Object... args) {
        Object file = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Change.class, "file", file);

        return null;
    }

    public Object getFile(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Change.class, "file"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Change.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Change.class, "id"));
    }

    public Object setSelfLink(RuntimeEnv env, Object... args) {
        Object selfLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Change.class, "selfLink", selfLink);

        return null;
    }

    public Object getSelfLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Change.class, "selfLink"));
    }

    public Object setFileId(RuntimeEnv env, Object... args) {
        Object fileId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Change.class, "fileId", fileId);

        return null;
    }

    public Object getFileId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Change.class, "fileId"));
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
