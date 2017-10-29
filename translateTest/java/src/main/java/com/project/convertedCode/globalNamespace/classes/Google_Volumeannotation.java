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

public class Google_Volumeannotation extends Google_Model implements RuntimeFileContextInterface {

    public Object annotationType = null;

    public Object kind = null;

    public Object updated = null;

    public Object deleted = null;

    public Object __contentRangesType = "Google_VolumeannotationContentRanges";

    public Object __contentRangesDataType = "";

    public Object contentRanges = null;

    public Object selectedText = null;

    public Object volumeId = null;

    public Object annotationDataId = null;

    public Object annotationDataLink = null;

    public Object pageIds = null;

    public Object layerId = null;

    public Object data = null;

    public Object id = null;

    public Object selfLink = null;

    public Google_Volumeannotation(RuntimeEnv env, Object... args) {
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
            case "setDeleted":
                return this.setDeleted(env, args);
            case "getDeleted":
                return this.getDeleted(env, args);
            case "setContentRanges":
                return this.setContentRanges(env, args);
            case "getContentRanges":
                return this.getContentRanges(env, args);
            case "setSelectedText":
                return this.setSelectedText(env, args);
            case "getSelectedText":
                return this.getSelectedText(env, args);
            case "setVolumeId":
                return this.setVolumeId(env, args);
            case "getVolumeId":
                return this.getVolumeId(env, args);
            case "setAnnotationDataId":
                return this.setAnnotationDataId(env, args);
            case "getAnnotationDataId":
                return this.getAnnotationDataId(env, args);
            case "setAnnotationDataLink":
                return this.setAnnotationDataLink(env, args);
            case "getAnnotationDataLink":
                return this.getAnnotationDataLink(env, args);
            case "setPageIds":
                return this.setPageIds(env, args);
            case "getPageIds":
                return this.getPageIds(env, args);
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
            case "deleted":
                return this.deleted;
            case "__contentRangesType":
                if (Google_Volumeannotation.class.isAssignableFrom(caller)) {

                    return this.__contentRangesType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__contentRangesDataType":
                if (Google_Volumeannotation.class.isAssignableFrom(caller)) {

                    return this.__contentRangesDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "contentRanges":
                return this.contentRanges;
            case "selectedText":
                return this.selectedText;
            case "volumeId":
                return this.volumeId;
            case "annotationDataId":
                return this.annotationDataId;
            case "annotationDataLink":
                return this.annotationDataLink;
            case "pageIds":
                return this.pageIds;
            case "layerId":
                return this.layerId;
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
            case "deleted":
                return ZVal.isNull(this.deleted);
            case "__contentRangesType":
                if (Google_Volumeannotation.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__contentRangesType);
                }
                break;
            case "__contentRangesDataType":
                if (Google_Volumeannotation.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__contentRangesDataType);
                }
                break;
            case "contentRanges":
                return ZVal.isNull(this.contentRanges);
            case "selectedText":
                return ZVal.isNull(this.selectedText);
            case "volumeId":
                return ZVal.isNull(this.volumeId);
            case "annotationDataId":
                return ZVal.isNull(this.annotationDataId);
            case "annotationDataLink":
                return ZVal.isNull(this.annotationDataLink);
            case "pageIds":
                return ZVal.isNull(this.pageIds);
            case "layerId":
                return ZVal.isNull(this.layerId);
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
            case "deleted":
                this.deleted = value;
                break;
            case "__contentRangesType":
                if (Google_Volumeannotation.class.isAssignableFrom(caller)) {

                    this.__contentRangesType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__contentRangesDataType":
                if (Google_Volumeannotation.class.isAssignableFrom(caller)) {

                    this.__contentRangesDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "contentRanges":
                this.contentRanges = value;
                break;
            case "selectedText":
                this.selectedText = value;
                break;
            case "volumeId":
                this.volumeId = value;
                break;
            case "annotationDataId":
                this.annotationDataId = value;
                break;
            case "annotationDataLink":
                this.annotationDataLink = value;
                break;
            case "pageIds":
                this.pageIds = value;
                break;
            case "layerId":
                this.layerId = value;
                break;
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
        ZVal.setProperty(this, Google_Volumeannotation.class, "annotationType", annotationType);

        return null;
    }

    public Object getAnnotationType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Volumeannotation.class, "annotationType"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Volumeannotation.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Volumeannotation.class, "kind"));
    }

    public Object setUpdated(RuntimeEnv env, Object... args) {
        Object updated = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Volumeannotation.class, "updated", updated);

        return null;
    }

    public Object getUpdated(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Volumeannotation.class, "updated"));
    }

    public Object setDeleted(RuntimeEnv env, Object... args) {
        Object deleted = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Volumeannotation.class, "deleted", deleted);

        return null;
    }

    public Object getDeleted(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Volumeannotation.class, "deleted"));
    }

    public Object setContentRanges(RuntimeEnv env, Object... args) {
        Object contentRanges = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Volumeannotation.class, "contentRanges", contentRanges);

        return null;
    }

    public Object getContentRanges(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Volumeannotation.class, "contentRanges"));
    }

    public Object setSelectedText(RuntimeEnv env, Object... args) {
        Object selectedText = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Volumeannotation.class, "selectedText", selectedText);

        return null;
    }

    public Object getSelectedText(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Volumeannotation.class, "selectedText"));
    }

    public Object setVolumeId(RuntimeEnv env, Object... args) {
        Object volumeId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Volumeannotation.class, "volumeId", volumeId);

        return null;
    }

    public Object getVolumeId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Volumeannotation.class, "volumeId"));
    }

    public Object setAnnotationDataId(RuntimeEnv env, Object... args) {
        Object annotationDataId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Volumeannotation.class, "annotationDataId", annotationDataId);

        return null;
    }

    public Object getAnnotationDataId(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_Volumeannotation.class, "annotationDataId"));
    }

    public Object setAnnotationDataLink(RuntimeEnv env, Object... args) {
        Object annotationDataLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_Volumeannotation.class, "annotationDataLink", annotationDataLink);

        return null;
    }

    public Object getAnnotationDataLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_Volumeannotation.class, "annotationDataLink"));
    }

    public Object setPageIds(RuntimeEnv env, Object... args) {
        Object pageIds = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Volumeannotation.class,
                pageIds,
                "Google_string",
                "setPageIds");
        ZVal.setProperty(this, Google_Volumeannotation.class, "pageIds", pageIds);

        return null;
    }

    public Object getPageIds(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Volumeannotation.class, "pageIds"));
    }

    public Object setLayerId(RuntimeEnv env, Object... args) {
        Object layerId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Volumeannotation.class, "layerId", layerId);

        return null;
    }

    public Object getLayerId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Volumeannotation.class, "layerId"));
    }

    public Object setData(RuntimeEnv env, Object... args) {
        Object data = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Volumeannotation.class, "data", data);

        return null;
    }

    public Object getData(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Volumeannotation.class, "data"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Volumeannotation.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Volumeannotation.class, "id"));
    }

    public Object setSelfLink(RuntimeEnv env, Object... args) {
        Object selfLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Volumeannotation.class, "selfLink", selfLink);

        return null;
    }

    public Object getSelfLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Volumeannotation.class, "selfLink"));
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
