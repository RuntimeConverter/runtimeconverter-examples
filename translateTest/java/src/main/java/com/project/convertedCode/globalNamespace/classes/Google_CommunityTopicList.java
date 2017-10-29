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

 google-api-php-client/src/contrib/Google_OrkutService.php

*/

public class Google_CommunityTopicList extends Google_Model implements RuntimeFileContextInterface {

    public Object nextPageToken = null;

    public Object kind = null;

    public Object __itemsType = "Google_CommunityTopic";

    public Object __itemsDataType = "array";

    public Object items = null;

    public Object prevPageToken = null;

    public Object lastPageToken = null;

    public Object firstPageToken = null;

    public Google_CommunityTopicList(RuntimeEnv env, Object... args) {
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
            case "setPrevPageToken":
                return this.setPrevPageToken(env, args);
            case "getPrevPageToken":
                return this.getPrevPageToken(env, args);
            case "setLastPageToken":
                return this.setLastPageToken(env, args);
            case "getLastPageToken":
                return this.getLastPageToken(env, args);
            case "setFirstPageToken":
                return this.setFirstPageToken(env, args);
            case "getFirstPageToken":
                return this.getFirstPageToken(env, args);
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
                if (Google_CommunityTopicList.class.isAssignableFrom(caller)) {

                    return this.__itemsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__itemsDataType":
                if (Google_CommunityTopicList.class.isAssignableFrom(caller)) {

                    return this.__itemsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "items":
                return this.items;
            case "prevPageToken":
                return this.prevPageToken;
            case "lastPageToken":
                return this.lastPageToken;
            case "firstPageToken":
                return this.firstPageToken;
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
                if (Google_CommunityTopicList.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__itemsType);
                }
                break;
            case "__itemsDataType":
                if (Google_CommunityTopicList.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__itemsDataType);
                }
                break;
            case "items":
                return ZVal.isNull(this.items);
            case "prevPageToken":
                return ZVal.isNull(this.prevPageToken);
            case "lastPageToken":
                return ZVal.isNull(this.lastPageToken);
            case "firstPageToken":
                return ZVal.isNull(this.firstPageToken);
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
                if (Google_CommunityTopicList.class.isAssignableFrom(caller)) {

                    this.__itemsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__itemsDataType":
                if (Google_CommunityTopicList.class.isAssignableFrom(caller)) {

                    this.__itemsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "items":
                this.items = value;
                break;
            case "prevPageToken":
                this.prevPageToken = value;
                break;
            case "lastPageToken":
                this.lastPageToken = value;
                break;
            case "firstPageToken":
                this.firstPageToken = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setNextPageToken(RuntimeEnv env, Object... args) {
        Object nextPageToken = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityTopicList.class, "nextPageToken", nextPageToken);

        return null;
    }

    public Object getNextPageToken(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_CommunityTopicList.class, "nextPageToken"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityTopicList.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityTopicList.class, "kind"));
    }

    public Object setItems(RuntimeEnv env, Object... args) {
        Object items = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_CommunityTopicList.class,
                items,
                "Google_CommunityTopic",
                "setItems");
        ZVal.setProperty(this, Google_CommunityTopicList.class, "items", items);

        return null;
    }

    public Object getItems(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityTopicList.class, "items"));
    }

    public Object setPrevPageToken(RuntimeEnv env, Object... args) {
        Object prevPageToken = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityTopicList.class, "prevPageToken", prevPageToken);

        return null;
    }

    public Object getPrevPageToken(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_CommunityTopicList.class, "prevPageToken"));
    }

    public Object setLastPageToken(RuntimeEnv env, Object... args) {
        Object lastPageToken = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityTopicList.class, "lastPageToken", lastPageToken);

        return null;
    }

    public Object getLastPageToken(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_CommunityTopicList.class, "lastPageToken"));
    }

    public Object setFirstPageToken(RuntimeEnv env, Object... args) {
        Object firstPageToken = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityTopicList.class, "firstPageToken", firstPageToken);

        return null;
    }

    public Object getFirstPageToken(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_CommunityTopicList.class, "firstPageToken"));
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
