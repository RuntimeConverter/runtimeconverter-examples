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

public class Google_ChangeList extends Google_Model implements RuntimeFileContextInterface {

    public Object nextPageToken = null;

    public Object kind = null;

    public Object __itemsType = "Google_Change";

    public Object __itemsDataType = "array";

    public Object items = null;

    public Object nextLink = null;

    public Object etag = null;

    public Object largestChangeId = null;

    public Object selfLink = null;

    public Google_ChangeList(RuntimeEnv env, Object... args) {
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
            case "setNextPageToken":
                return this.setNextPageToken(env, args);
            case "getNextPageToken":
                return this.getNextPageToken(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setItems":
                return this.setItems(env, args);
            case "getItems":
                return this.getItems(env, args);
            case "setNextLink":
                return this.setNextLink(env, args);
            case "getNextLink":
                return this.getNextLink(env, args);
            case "setEtag":
                return this.setEtag(env, args);
            case "getEtag":
                return this.getEtag(env, args);
            case "setLargestChangeId":
                return this.setLargestChangeId(env, args);
            case "getLargestChangeId":
                return this.getLargestChangeId(env, args);
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
            case "nextPageToken":
                return this.nextPageToken;
            case "kind":
                return this.kind;
            case "__itemsType":
                if (Google_ChangeList.class.isAssignableFrom(caller)) {

                    return this.__itemsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__itemsDataType":
                if (Google_ChangeList.class.isAssignableFrom(caller)) {

                    return this.__itemsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "items":
                return this.items;
            case "nextLink":
                return this.nextLink;
            case "etag":
                return this.etag;
            case "largestChangeId":
                return this.largestChangeId;
            case "selfLink":
                return this.selfLink;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "nextPageToken":
                return ZVal.isNull(this.nextPageToken);
            case "kind":
                return ZVal.isNull(this.kind);
            case "__itemsType":
                if (Google_ChangeList.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__itemsType);
                }
                break;
            case "__itemsDataType":
                if (Google_ChangeList.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__itemsDataType);
                }
                break;
            case "items":
                return ZVal.isNull(this.items);
            case "nextLink":
                return ZVal.isNull(this.nextLink);
            case "etag":
                return ZVal.isNull(this.etag);
            case "largestChangeId":
                return ZVal.isNull(this.largestChangeId);
            case "selfLink":
                return ZVal.isNull(this.selfLink);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "nextPageToken":
                this.nextPageToken = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "__itemsType":
                if (Google_ChangeList.class.isAssignableFrom(caller)) {

                    this.__itemsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__itemsDataType":
                if (Google_ChangeList.class.isAssignableFrom(caller)) {

                    this.__itemsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "items":
                this.items = value;
                break;
            case "nextLink":
                this.nextLink = value;
                break;
            case "etag":
                this.etag = value;
                break;
            case "largestChangeId":
                this.largestChangeId = value;
                break;
            case "selfLink":
                this.selfLink = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setNextPageToken(RuntimeEnv env, Object... args) {
        Object nextPageToken = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ChangeList.class, "nextPageToken", nextPageToken);

        return null;
    }

    public Object getNextPageToken(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ChangeList.class, "nextPageToken"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ChangeList.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ChangeList.class, "kind"));
    }

    public Object setItems(RuntimeEnv env, Object... args) {
        Object items = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this, "assertIsArray", Google_ChangeList.class, items, "Google_Change", "setItems");
        ZVal.setProperty(this, Google_ChangeList.class, "items", items);

        return null;
    }

    public Object getItems(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ChangeList.class, "items"));
    }

    public Object setNextLink(RuntimeEnv env, Object... args) {
        Object nextLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ChangeList.class, "nextLink", nextLink);

        return null;
    }

    public Object getNextLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ChangeList.class, "nextLink"));
    }

    public Object setEtag(RuntimeEnv env, Object... args) {
        Object etag = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ChangeList.class, "etag", etag);

        return null;
    }

    public Object getEtag(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ChangeList.class, "etag"));
    }

    public Object setLargestChangeId(RuntimeEnv env, Object... args) {
        Object largestChangeId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ChangeList.class, "largestChangeId", largestChangeId);

        return null;
    }

    public Object getLargestChangeId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ChangeList.class, "largestChangeId"));
    }

    public Object setSelfLink(RuntimeEnv env, Object... args) {
        Object selfLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ChangeList.class, "selfLink", selfLink);

        return null;
    }

    public Object getSelfLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ChangeList.class, "selfLink"));
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
