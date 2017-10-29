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

 google-api-php-client/src/contrib/Google_AnalyticsService.php

*/

public class Google_Goals extends Google_Model implements RuntimeFileContextInterface {

    public Object username = null;

    public Object kind = null;

    public Object __itemsType = "Google_Goal";

    public Object __itemsDataType = "array";

    public Object items = null;

    public Object itemsPerPage = null;

    public Object previousLink = null;

    public Object startIndex = null;

    public Object nextLink = null;

    public Object totalResults = null;

    public Google_Goals(RuntimeEnv env, Object... args) {
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
            case "setUsername":
                return this.setUsername(env, args);
            case "getUsername":
                return this.getUsername(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setItems":
                return this.setItems(env, args);
            case "getItems":
                return this.getItems(env, args);
            case "setItemsPerPage":
                return this.setItemsPerPage(env, args);
            case "getItemsPerPage":
                return this.getItemsPerPage(env, args);
            case "setPreviousLink":
                return this.setPreviousLink(env, args);
            case "getPreviousLink":
                return this.getPreviousLink(env, args);
            case "setStartIndex":
                return this.setStartIndex(env, args);
            case "getStartIndex":
                return this.getStartIndex(env, args);
            case "setNextLink":
                return this.setNextLink(env, args);
            case "getNextLink":
                return this.getNextLink(env, args);
            case "setTotalResults":
                return this.setTotalResults(env, args);
            case "getTotalResults":
                return this.getTotalResults(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "username":
                return this.username;
            case "kind":
                return this.kind;
            case "__itemsType":
                if (Google_Goals.class.isAssignableFrom(caller)) {

                    return this.__itemsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__itemsDataType":
                if (Google_Goals.class.isAssignableFrom(caller)) {

                    return this.__itemsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "items":
                return this.items;
            case "itemsPerPage":
                return this.itemsPerPage;
            case "previousLink":
                return this.previousLink;
            case "startIndex":
                return this.startIndex;
            case "nextLink":
                return this.nextLink;
            case "totalResults":
                return this.totalResults;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "username":
                return ZVal.isNull(this.username);
            case "kind":
                return ZVal.isNull(this.kind);
            case "__itemsType":
                if (Google_Goals.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__itemsType);
                }
                break;
            case "__itemsDataType":
                if (Google_Goals.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__itemsDataType);
                }
                break;
            case "items":
                return ZVal.isNull(this.items);
            case "itemsPerPage":
                return ZVal.isNull(this.itemsPerPage);
            case "previousLink":
                return ZVal.isNull(this.previousLink);
            case "startIndex":
                return ZVal.isNull(this.startIndex);
            case "nextLink":
                return ZVal.isNull(this.nextLink);
            case "totalResults":
                return ZVal.isNull(this.totalResults);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "username":
                this.username = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "__itemsType":
                if (Google_Goals.class.isAssignableFrom(caller)) {

                    this.__itemsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__itemsDataType":
                if (Google_Goals.class.isAssignableFrom(caller)) {

                    this.__itemsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "items":
                this.items = value;
                break;
            case "itemsPerPage":
                this.itemsPerPage = value;
                break;
            case "previousLink":
                this.previousLink = value;
                break;
            case "startIndex":
                this.startIndex = value;
                break;
            case "nextLink":
                this.nextLink = value;
                break;
            case "totalResults":
                this.totalResults = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setUsername(RuntimeEnv env, Object... args) {
        Object username = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Goals.class, "username", username);

        return null;
    }

    public Object getUsername(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Goals.class, "username"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Goals.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Goals.class, "kind"));
    }

    public Object setItems(RuntimeEnv env, Object... args) {
        Object items = ZVal.assignParameter(args, 0, null);
        env.callMethod(this, "assertIsArray", Google_Goals.class, items, "Google_Goal", "setItems");
        ZVal.setProperty(this, Google_Goals.class, "items", items);

        return null;
    }

    public Object getItems(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Goals.class, "items"));
    }

    public Object setItemsPerPage(RuntimeEnv env, Object... args) {
        Object itemsPerPage = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Goals.class, "itemsPerPage", itemsPerPage);

        return null;
    }

    public Object getItemsPerPage(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Goals.class, "itemsPerPage"));
    }

    public Object setPreviousLink(RuntimeEnv env, Object... args) {
        Object previousLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Goals.class, "previousLink", previousLink);

        return null;
    }

    public Object getPreviousLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Goals.class, "previousLink"));
    }

    public Object setStartIndex(RuntimeEnv env, Object... args) {
        Object startIndex = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Goals.class, "startIndex", startIndex);

        return null;
    }

    public Object getStartIndex(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Goals.class, "startIndex"));
    }

    public Object setNextLink(RuntimeEnv env, Object... args) {
        Object nextLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Goals.class, "nextLink", nextLink);

        return null;
    }

    public Object getNextLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Goals.class, "nextLink"));
    }

    public Object setTotalResults(RuntimeEnv env, Object... args) {
        Object totalResults = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Goals.class, "totalResults", totalResults);

        return null;
    }

    public Object getTotalResults(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Goals.class, "totalResults"));
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
