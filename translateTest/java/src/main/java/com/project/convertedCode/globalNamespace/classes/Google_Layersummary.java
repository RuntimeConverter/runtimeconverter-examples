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

public class Google_Layersummary extends Google_Model implements RuntimeFileContextInterface {

    public Object kind = null;

    public Object annotationCount = null;

    public Object dataCount = null;

    public Object annotationsLink = null;

    public Object updated = null;

    public Object volumeId = null;

    public Object id = null;

    public Object annotationTypes = null;

    public Object contentVersion = null;

    public Object layerId = null;

    public Object annotationsDataLink = null;

    public Object selfLink = null;

    public Google_Layersummary(RuntimeEnv env, Object... args) {
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
            case "setAnnotationCount":
                return this.setAnnotationCount(env, args);
            case "getAnnotationCount":
                return this.getAnnotationCount(env, args);
            case "setDataCount":
                return this.setDataCount(env, args);
            case "getDataCount":
                return this.getDataCount(env, args);
            case "setAnnotationsLink":
                return this.setAnnotationsLink(env, args);
            case "getAnnotationsLink":
                return this.getAnnotationsLink(env, args);
            case "setUpdated":
                return this.setUpdated(env, args);
            case "getUpdated":
                return this.getUpdated(env, args);
            case "setVolumeId":
                return this.setVolumeId(env, args);
            case "getVolumeId":
                return this.getVolumeId(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setAnnotationTypes":
                return this.setAnnotationTypes(env, args);
            case "getAnnotationTypes":
                return this.getAnnotationTypes(env, args);
            case "setContentVersion":
                return this.setContentVersion(env, args);
            case "getContentVersion":
                return this.getContentVersion(env, args);
            case "setLayerId":
                return this.setLayerId(env, args);
            case "getLayerId":
                return this.getLayerId(env, args);
            case "setAnnotationsDataLink":
                return this.setAnnotationsDataLink(env, args);
            case "getAnnotationsDataLink":
                return this.getAnnotationsDataLink(env, args);
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
            case "annotationCount":
                return this.annotationCount;
            case "dataCount":
                return this.dataCount;
            case "annotationsLink":
                return this.annotationsLink;
            case "updated":
                return this.updated;
            case "volumeId":
                return this.volumeId;
            case "id":
                return this.id;
            case "annotationTypes":
                return this.annotationTypes;
            case "contentVersion":
                return this.contentVersion;
            case "layerId":
                return this.layerId;
            case "annotationsDataLink":
                return this.annotationsDataLink;
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
            case "annotationCount":
                return ZVal.isNull(this.annotationCount);
            case "dataCount":
                return ZVal.isNull(this.dataCount);
            case "annotationsLink":
                return ZVal.isNull(this.annotationsLink);
            case "updated":
                return ZVal.isNull(this.updated);
            case "volumeId":
                return ZVal.isNull(this.volumeId);
            case "id":
                return ZVal.isNull(this.id);
            case "annotationTypes":
                return ZVal.isNull(this.annotationTypes);
            case "contentVersion":
                return ZVal.isNull(this.contentVersion);
            case "layerId":
                return ZVal.isNull(this.layerId);
            case "annotationsDataLink":
                return ZVal.isNull(this.annotationsDataLink);
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
            case "annotationCount":
                this.annotationCount = value;
                break;
            case "dataCount":
                this.dataCount = value;
                break;
            case "annotationsLink":
                this.annotationsLink = value;
                break;
            case "updated":
                this.updated = value;
                break;
            case "volumeId":
                this.volumeId = value;
                break;
            case "id":
                this.id = value;
                break;
            case "annotationTypes":
                this.annotationTypes = value;
                break;
            case "contentVersion":
                this.contentVersion = value;
                break;
            case "layerId":
                this.layerId = value;
                break;
            case "annotationsDataLink":
                this.annotationsDataLink = value;
                break;
            case "selfLink":
                this.selfLink = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Layersummary.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Layersummary.class, "kind"));
    }

    public Object setAnnotationCount(RuntimeEnv env, Object... args) {
        Object annotationCount = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Layersummary.class, "annotationCount", annotationCount);

        return null;
    }

    public Object getAnnotationCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Layersummary.class, "annotationCount"));
    }

    public Object setDataCount(RuntimeEnv env, Object... args) {
        Object dataCount = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Layersummary.class, "dataCount", dataCount);

        return null;
    }

    public Object getDataCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Layersummary.class, "dataCount"));
    }

    public Object setAnnotationsLink(RuntimeEnv env, Object... args) {
        Object annotationsLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Layersummary.class, "annotationsLink", annotationsLink);

        return null;
    }

    public Object getAnnotationsLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Layersummary.class, "annotationsLink"));
    }

    public Object setUpdated(RuntimeEnv env, Object... args) {
        Object updated = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Layersummary.class, "updated", updated);

        return null;
    }

    public Object getUpdated(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Layersummary.class, "updated"));
    }

    public Object setVolumeId(RuntimeEnv env, Object... args) {
        Object volumeId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Layersummary.class, "volumeId", volumeId);

        return null;
    }

    public Object getVolumeId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Layersummary.class, "volumeId"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Layersummary.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Layersummary.class, "id"));
    }

    public Object setAnnotationTypes(RuntimeEnv env, Object... args) {
        Object annotationTypes = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Layersummary.class,
                annotationTypes,
                "Google_string",
                "setAnnotationTypes");
        ZVal.setProperty(this, Google_Layersummary.class, "annotationTypes", annotationTypes);

        return null;
    }

    public Object getAnnotationTypes(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Layersummary.class, "annotationTypes"));
    }

    public Object setContentVersion(RuntimeEnv env, Object... args) {
        Object contentVersion = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Layersummary.class, "contentVersion", contentVersion);

        return null;
    }

    public Object getContentVersion(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Layersummary.class, "contentVersion"));
    }

    public Object setLayerId(RuntimeEnv env, Object... args) {
        Object layerId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Layersummary.class, "layerId", layerId);

        return null;
    }

    public Object getLayerId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Layersummary.class, "layerId"));
    }

    public Object setAnnotationsDataLink(RuntimeEnv env, Object... args) {
        Object annotationsDataLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_Layersummary.class, "annotationsDataLink", annotationsDataLink);

        return null;
    }

    public Object getAnnotationsDataLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_Layersummary.class, "annotationsDataLink"));
    }

    public Object setSelfLink(RuntimeEnv env, Object... args) {
        Object selfLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Layersummary.class, "selfLink", selfLink);

        return null;
    }

    public Object getSelfLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Layersummary.class, "selfLink"));
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
