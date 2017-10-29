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

public class Google_Annotation extends Google_Model implements RuntimeFileContextInterface {

    public Object kind = null;

    public Object updated = null;

    public Object created = null;

    public Object deleted = null;

    public Object beforeSelectedText = null;

    public Object __currentVersionRangesType = "Google_AnnotationCurrentVersionRanges";

    public Object __currentVersionRangesDataType = "";

    public Object currentVersionRanges = null;

    public Object afterSelectedText = null;

    public Object __clientVersionRangesType = "Google_AnnotationClientVersionRanges";

    public Object __clientVersionRangesDataType = "";

    public Object clientVersionRanges = null;

    public Object volumeId = null;

    public Object pageIds = null;

    public Object layerId = null;

    public Object selectedText = null;

    public Object highlightStyle = null;

    public Object data = null;

    public Object id = null;

    public Object selfLink = null;

    public Google_Annotation(RuntimeEnv env, Object... args) {
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
            case "setUpdated":
                return this.setUpdated(env, args);
            case "getUpdated":
                return this.getUpdated(env, args);
            case "setCreated":
                return this.setCreated(env, args);
            case "getCreated":
                return this.getCreated(env, args);
            case "setDeleted":
                return this.setDeleted(env, args);
            case "getDeleted":
                return this.getDeleted(env, args);
            case "setBeforeSelectedText":
                return this.setBeforeSelectedText(env, args);
            case "getBeforeSelectedText":
                return this.getBeforeSelectedText(env, args);
            case "setCurrentVersionRanges":
                return this.setCurrentVersionRanges(env, args);
            case "getCurrentVersionRanges":
                return this.getCurrentVersionRanges(env, args);
            case "setAfterSelectedText":
                return this.setAfterSelectedText(env, args);
            case "getAfterSelectedText":
                return this.getAfterSelectedText(env, args);
            case "setClientVersionRanges":
                return this.setClientVersionRanges(env, args);
            case "getClientVersionRanges":
                return this.getClientVersionRanges(env, args);
            case "setVolumeId":
                return this.setVolumeId(env, args);
            case "getVolumeId":
                return this.getVolumeId(env, args);
            case "setPageIds":
                return this.setPageIds(env, args);
            case "getPageIds":
                return this.getPageIds(env, args);
            case "setLayerId":
                return this.setLayerId(env, args);
            case "getLayerId":
                return this.getLayerId(env, args);
            case "setSelectedText":
                return this.setSelectedText(env, args);
            case "getSelectedText":
                return this.getSelectedText(env, args);
            case "setHighlightStyle":
                return this.setHighlightStyle(env, args);
            case "getHighlightStyle":
                return this.getHighlightStyle(env, args);
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
            case "kind":
                return this.kind;
            case "updated":
                return this.updated;
            case "created":
                return this.created;
            case "deleted":
                return this.deleted;
            case "beforeSelectedText":
                return this.beforeSelectedText;
            case "__currentVersionRangesType":
                if (Google_Annotation.class.isAssignableFrom(caller)) {

                    return this.__currentVersionRangesType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__currentVersionRangesDataType":
                if (Google_Annotation.class.isAssignableFrom(caller)) {

                    return this.__currentVersionRangesDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "currentVersionRanges":
                return this.currentVersionRanges;
            case "afterSelectedText":
                return this.afterSelectedText;
            case "__clientVersionRangesType":
                if (Google_Annotation.class.isAssignableFrom(caller)) {

                    return this.__clientVersionRangesType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__clientVersionRangesDataType":
                if (Google_Annotation.class.isAssignableFrom(caller)) {

                    return this.__clientVersionRangesDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "clientVersionRanges":
                return this.clientVersionRanges;
            case "volumeId":
                return this.volumeId;
            case "pageIds":
                return this.pageIds;
            case "layerId":
                return this.layerId;
            case "selectedText":
                return this.selectedText;
            case "highlightStyle":
                return this.highlightStyle;
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
            case "kind":
                return ZVal.isNull(this.kind);
            case "updated":
                return ZVal.isNull(this.updated);
            case "created":
                return ZVal.isNull(this.created);
            case "deleted":
                return ZVal.isNull(this.deleted);
            case "beforeSelectedText":
                return ZVal.isNull(this.beforeSelectedText);
            case "__currentVersionRangesType":
                if (Google_Annotation.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__currentVersionRangesType);
                }
                break;
            case "__currentVersionRangesDataType":
                if (Google_Annotation.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__currentVersionRangesDataType);
                }
                break;
            case "currentVersionRanges":
                return ZVal.isNull(this.currentVersionRanges);
            case "afterSelectedText":
                return ZVal.isNull(this.afterSelectedText);
            case "__clientVersionRangesType":
                if (Google_Annotation.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__clientVersionRangesType);
                }
                break;
            case "__clientVersionRangesDataType":
                if (Google_Annotation.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__clientVersionRangesDataType);
                }
                break;
            case "clientVersionRanges":
                return ZVal.isNull(this.clientVersionRanges);
            case "volumeId":
                return ZVal.isNull(this.volumeId);
            case "pageIds":
                return ZVal.isNull(this.pageIds);
            case "layerId":
                return ZVal.isNull(this.layerId);
            case "selectedText":
                return ZVal.isNull(this.selectedText);
            case "highlightStyle":
                return ZVal.isNull(this.highlightStyle);
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
            case "kind":
                this.kind = value;
                break;
            case "updated":
                this.updated = value;
                break;
            case "created":
                this.created = value;
                break;
            case "deleted":
                this.deleted = value;
                break;
            case "beforeSelectedText":
                this.beforeSelectedText = value;
                break;
            case "__currentVersionRangesType":
                if (Google_Annotation.class.isAssignableFrom(caller)) {

                    this.__currentVersionRangesType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__currentVersionRangesDataType":
                if (Google_Annotation.class.isAssignableFrom(caller)) {

                    this.__currentVersionRangesDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "currentVersionRanges":
                this.currentVersionRanges = value;
                break;
            case "afterSelectedText":
                this.afterSelectedText = value;
                break;
            case "__clientVersionRangesType":
                if (Google_Annotation.class.isAssignableFrom(caller)) {

                    this.__clientVersionRangesType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__clientVersionRangesDataType":
                if (Google_Annotation.class.isAssignableFrom(caller)) {

                    this.__clientVersionRangesDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "clientVersionRanges":
                this.clientVersionRanges = value;
                break;
            case "volumeId":
                this.volumeId = value;
                break;
            case "pageIds":
                this.pageIds = value;
                break;
            case "layerId":
                this.layerId = value;
                break;
            case "selectedText":
                this.selectedText = value;
                break;
            case "highlightStyle":
                this.highlightStyle = value;
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

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Annotation.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Annotation.class, "kind"));
    }

    public Object setUpdated(RuntimeEnv env, Object... args) {
        Object updated = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Annotation.class, "updated", updated);

        return null;
    }

    public Object getUpdated(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Annotation.class, "updated"));
    }

    public Object setCreated(RuntimeEnv env, Object... args) {
        Object created = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Annotation.class, "created", created);

        return null;
    }

    public Object getCreated(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Annotation.class, "created"));
    }

    public Object setDeleted(RuntimeEnv env, Object... args) {
        Object deleted = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Annotation.class, "deleted", deleted);

        return null;
    }

    public Object getDeleted(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Annotation.class, "deleted"));
    }

    public Object setBeforeSelectedText(RuntimeEnv env, Object... args) {
        Object beforeSelectedText = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Annotation.class, "beforeSelectedText", beforeSelectedText);

        return null;
    }

    public Object getBeforeSelectedText(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Annotation.class, "beforeSelectedText"));
    }

    public Object setCurrentVersionRanges(RuntimeEnv env, Object... args) {
        Object currentVersionRanges = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_Annotation.class, "currentVersionRanges", currentVersionRanges);

        return null;
    }

    public Object getCurrentVersionRanges(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Annotation.class, "currentVersionRanges"));
    }

    public Object setAfterSelectedText(RuntimeEnv env, Object... args) {
        Object afterSelectedText = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Annotation.class, "afterSelectedText", afterSelectedText);

        return null;
    }

    public Object getAfterSelectedText(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Annotation.class, "afterSelectedText"));
    }

    public Object setClientVersionRanges(RuntimeEnv env, Object... args) {
        Object clientVersionRanges = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Annotation.class, "clientVersionRanges", clientVersionRanges);

        return null;
    }

    public Object getClientVersionRanges(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Annotation.class, "clientVersionRanges"));
    }

    public Object setVolumeId(RuntimeEnv env, Object... args) {
        Object volumeId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Annotation.class, "volumeId", volumeId);

        return null;
    }

    public Object getVolumeId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Annotation.class, "volumeId"));
    }

    public Object setPageIds(RuntimeEnv env, Object... args) {
        Object pageIds = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Annotation.class,
                pageIds,
                "Google_string",
                "setPageIds");
        ZVal.setProperty(this, Google_Annotation.class, "pageIds", pageIds);

        return null;
    }

    public Object getPageIds(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Annotation.class, "pageIds"));
    }

    public Object setLayerId(RuntimeEnv env, Object... args) {
        Object layerId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Annotation.class, "layerId", layerId);

        return null;
    }

    public Object getLayerId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Annotation.class, "layerId"));
    }

    public Object setSelectedText(RuntimeEnv env, Object... args) {
        Object selectedText = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Annotation.class, "selectedText", selectedText);

        return null;
    }

    public Object getSelectedText(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Annotation.class, "selectedText"));
    }

    public Object setHighlightStyle(RuntimeEnv env, Object... args) {
        Object highlightStyle = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Annotation.class, "highlightStyle", highlightStyle);

        return null;
    }

    public Object getHighlightStyle(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Annotation.class, "highlightStyle"));
    }

    public Object setData(RuntimeEnv env, Object... args) {
        Object data = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Annotation.class, "data", data);

        return null;
    }

    public Object getData(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Annotation.class, "data"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Annotation.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Annotation.class, "id"));
    }

    public Object setSelfLink(RuntimeEnv env, Object... args) {
        Object selfLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Annotation.class, "selfLink", selfLink);

        return null;
    }

    public Object getSelfLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Annotation.class, "selfLink"));
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
