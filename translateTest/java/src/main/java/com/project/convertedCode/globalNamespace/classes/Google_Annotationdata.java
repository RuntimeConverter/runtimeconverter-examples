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

public class Google_Annotationdata extends Google_Model implements RuntimeFileContextInterface {

    public Object annotationType = null;

    public Object kind = null;

    public Object updated = null;

    public Object volumeId = null;

    public Object encoded_data = null;

    public Object layerId = null;

    public Object __dataType = "Google_BooksLayerGeoData";

    public Object __dataDataType = "";

    public Object data = null;

    public Object id = null;

    public Object selfLink = null;

    public Google_Annotationdata(RuntimeEnv env, Object... args) {
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
            case "setAnnotationType":
                return this.setAnnotationType(env, args);
            case "getAnnotationType":
                return this.getAnnotationType(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setUpdated":
                return this.setUpdated(env, args);
            case "getUpdated":
                return this.getUpdated(env, args);
            case "setVolumeId":
                return this.setVolumeId(env, args);
            case "getVolumeId":
                return this.getVolumeId(env, args);
            case "setEncoded_data":
                return this.setEncoded_data(env, args);
            case "getEncoded_data":
                return this.getEncoded_data(env, args);
            case "setLayerId":
                return this.setLayerId(env, args);
            case "getLayerId":
                return this.getLayerId(env, args);
            case "setData":
                return this.setData(env, args);
            case "getData":
                return this.getData(env, args);
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
            case "annotationType":
                return this.annotationType;
            case "kind":
                return this.kind;
            case "updated":
                return this.updated;
            case "volumeId":
                return this.volumeId;
            case "encoded_data":
                return this.encoded_data;
            case "layerId":
                return this.layerId;
            case "__dataType":
                if (Google_Annotationdata.class.isAssignableFrom(caller)) {

                    return this.__dataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__dataDataType":
                if (Google_Annotationdata.class.isAssignableFrom(caller)) {

                    return this.__dataDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "data":
                return this.data;
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
            case "annotationType":
                return ZVal.isNull(this.annotationType);
            case "kind":
                return ZVal.isNull(this.kind);
            case "updated":
                return ZVal.isNull(this.updated);
            case "volumeId":
                return ZVal.isNull(this.volumeId);
            case "encoded_data":
                return ZVal.isNull(this.encoded_data);
            case "layerId":
                return ZVal.isNull(this.layerId);
            case "__dataType":
                if (Google_Annotationdata.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__dataType);
                }
                break;
            case "__dataDataType":
                if (Google_Annotationdata.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__dataDataType);
                }
                break;
            case "data":
                return ZVal.isNull(this.data);
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
            case "annotationType":
                this.annotationType = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "updated":
                this.updated = value;
                break;
            case "volumeId":
                this.volumeId = value;
                break;
            case "encoded_data":
                this.encoded_data = value;
                break;
            case "layerId":
                this.layerId = value;
                break;
            case "__dataType":
                if (Google_Annotationdata.class.isAssignableFrom(caller)) {

                    this.__dataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__dataDataType":
                if (Google_Annotationdata.class.isAssignableFrom(caller)) {

                    this.__dataDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "data":
                this.data = value;
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

    public Object setAnnotationType(RuntimeEnv env, Object... args) {
        Object annotationType = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Annotationdata.class, "annotationType", annotationType);

        return null;
    }

    public Object getAnnotationType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Annotationdata.class, "annotationType"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Annotationdata.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Annotationdata.class, "kind"));
    }

    public Object setUpdated(RuntimeEnv env, Object... args) {
        Object updated = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Annotationdata.class, "updated", updated);

        return null;
    }

    public Object getUpdated(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Annotationdata.class, "updated"));
    }

    public Object setVolumeId(RuntimeEnv env, Object... args) {
        Object volumeId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Annotationdata.class, "volumeId", volumeId);

        return null;
    }

    public Object getVolumeId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Annotationdata.class, "volumeId"));
    }

    public Object setEncoded_data(RuntimeEnv env, Object... args) {
        Object encoded_data = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Annotationdata.class, "encoded_data", encoded_data);

        return null;
    }

    public Object getEncoded_data(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Annotationdata.class, "encoded_data"));
    }

    public Object setLayerId(RuntimeEnv env, Object... args) {
        Object layerId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Annotationdata.class, "layerId", layerId);

        return null;
    }

    public Object getLayerId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Annotationdata.class, "layerId"));
    }

    public Object setData(RuntimeEnv env, Object... args) {
        Object data = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Annotationdata.class, "data", data);

        return null;
    }

    public Object getData(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Annotationdata.class, "data"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Annotationdata.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Annotationdata.class, "id"));
    }

    public Object setSelfLink(RuntimeEnv env, Object... args) {
        Object selfLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Annotationdata.class, "selfLink", selfLink);

        return null;
    }

    public Object getSelfLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Annotationdata.class, "selfLink"));
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
