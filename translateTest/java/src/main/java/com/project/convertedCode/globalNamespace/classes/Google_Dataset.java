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

public class Google_Dataset extends Google_Model implements RuntimeFileContextInterface {

    public Object kind = null;

    public Object description = null;

    public Object __datasetReferenceType = "Google_DatasetReference";

    public Object __datasetReferenceDataType = "";

    public Object datasetReference = null;

    public Object creationTime = null;

    public Object __accessType = "Google_DatasetAccess";

    public Object __accessDataType = "array";

    public Object access = null;

    public Object etag = null;

    public Object friendlyName = null;

    public Object lastModifiedTime = null;

    public Object id = null;

    public Object selfLink = null;

    public Google_Dataset(RuntimeEnv env, Object... args) {
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
            case "setDescription":
                return this.setDescription(env, args);
            case "getDescription":
                return this.getDescription(env, args);
            case "setDatasetReference":
                return this.setDatasetReference(env, args);
            case "getDatasetReference":
                return this.getDatasetReference(env, args);
            case "setCreationTime":
                return this.setCreationTime(env, args);
            case "getCreationTime":
                return this.getCreationTime(env, args);
            case "setAccess":
                return this.setAccess(env, args);
            case "getAccess":
                return this.getAccess(env, args);
            case "setEtag":
                return this.setEtag(env, args);
            case "getEtag":
                return this.getEtag(env, args);
            case "setFriendlyName":
                return this.setFriendlyName(env, args);
            case "getFriendlyName":
                return this.getFriendlyName(env, args);
            case "setLastModifiedTime":
                return this.setLastModifiedTime(env, args);
            case "getLastModifiedTime":
                return this.getLastModifiedTime(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setSelfLink":
                return this.setSelfLink(env, args);
            case "getSelfLink":
                return this.getSelfLink(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return this.kind;
            case "description":
                return this.description;
            case "__datasetReferenceType":
                if (Google_Dataset.class.isAssignableFrom(caller)) {

                    return this.__datasetReferenceType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__datasetReferenceDataType":
                if (Google_Dataset.class.isAssignableFrom(caller)) {

                    return this.__datasetReferenceDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "datasetReference":
                return this.datasetReference;
            case "creationTime":
                return this.creationTime;
            case "__accessType":
                if (Google_Dataset.class.isAssignableFrom(caller)) {

                    return this.__accessType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__accessDataType":
                if (Google_Dataset.class.isAssignableFrom(caller)) {

                    return this.__accessDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "access":
                return this.access;
            case "etag":
                return this.etag;
            case "friendlyName":
                return this.friendlyName;
            case "lastModifiedTime":
                return this.lastModifiedTime;
            case "id":
                return this.id;
            case "selfLink":
                return this.selfLink;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return ZVal.isNull(this.kind);
            case "description":
                return ZVal.isNull(this.description);
            case "__datasetReferenceType":
                if (Google_Dataset.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__datasetReferenceType);
                }
                break;
            case "__datasetReferenceDataType":
                if (Google_Dataset.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__datasetReferenceDataType);
                }
                break;
            case "datasetReference":
                return ZVal.isNull(this.datasetReference);
            case "creationTime":
                return ZVal.isNull(this.creationTime);
            case "__accessType":
                if (Google_Dataset.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__accessType);
                }
                break;
            case "__accessDataType":
                if (Google_Dataset.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__accessDataType);
                }
                break;
            case "access":
                return ZVal.isNull(this.access);
            case "etag":
                return ZVal.isNull(this.etag);
            case "friendlyName":
                return ZVal.isNull(this.friendlyName);
            case "lastModifiedTime":
                return ZVal.isNull(this.lastModifiedTime);
            case "id":
                return ZVal.isNull(this.id);
            case "selfLink":
                return ZVal.isNull(this.selfLink);
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
            case "description":
                this.description = value;
                break;
            case "__datasetReferenceType":
                if (Google_Dataset.class.isAssignableFrom(caller)) {

                    this.__datasetReferenceType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__datasetReferenceDataType":
                if (Google_Dataset.class.isAssignableFrom(caller)) {

                    this.__datasetReferenceDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "datasetReference":
                this.datasetReference = value;
                break;
            case "creationTime":
                this.creationTime = value;
                break;
            case "__accessType":
                if (Google_Dataset.class.isAssignableFrom(caller)) {

                    this.__accessType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__accessDataType":
                if (Google_Dataset.class.isAssignableFrom(caller)) {

                    this.__accessDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "access":
                this.access = value;
                break;
            case "etag":
                this.etag = value;
                break;
            case "friendlyName":
                this.friendlyName = value;
                break;
            case "lastModifiedTime":
                this.lastModifiedTime = value;
                break;
            case "id":
                this.id = value;
                break;
            case "selfLink":
                this.selfLink = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Dataset.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Dataset.class, "kind"));
    }

    public Object setDescription(RuntimeEnv env, Object... args) {
        Object description = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Dataset.class, "description", description);

        return null;
    }

    public Object getDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Dataset.class, "description"));
    }

    public Object setDatasetReference(RuntimeEnv env, Object... args) {
        Object datasetReference = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Dataset.class, "datasetReference", datasetReference);

        return null;
    }

    public Object getDatasetReference(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Dataset.class, "datasetReference"));
    }

    public Object setCreationTime(RuntimeEnv env, Object... args) {
        Object creationTime = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Dataset.class, "creationTime", creationTime);

        return null;
    }

    public Object getCreationTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Dataset.class, "creationTime"));
    }

    public Object setAccess(RuntimeEnv env, Object... args) {
        Object access = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Dataset.class,
                access,
                "Google_DatasetAccess",
                "setAccess");
        ZVal.setProperty(this, Google_Dataset.class, "access", access);

        return null;
    }

    public Object getAccess(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Dataset.class, "access"));
    }

    public Object setEtag(RuntimeEnv env, Object... args) {
        Object etag = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Dataset.class, "etag", etag);

        return null;
    }

    public Object getEtag(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Dataset.class, "etag"));
    }

    public Object setFriendlyName(RuntimeEnv env, Object... args) {
        Object friendlyName = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Dataset.class, "friendlyName", friendlyName);

        return null;
    }

    public Object getFriendlyName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Dataset.class, "friendlyName"));
    }

    public Object setLastModifiedTime(RuntimeEnv env, Object... args) {
        Object lastModifiedTime = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Dataset.class, "lastModifiedTime", lastModifiedTime);

        return null;
    }

    public Object getLastModifiedTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Dataset.class, "lastModifiedTime"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Dataset.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Dataset.class, "id"));
    }

    public Object setSelfLink(RuntimeEnv env, Object... args) {
        Object selfLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Dataset.class, "selfLink", selfLink);

        return null;
    }

    public Object getSelfLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Dataset.class, "selfLink"));
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
