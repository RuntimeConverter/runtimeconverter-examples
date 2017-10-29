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

public class Google_DownloadAccesses extends Google_Model implements RuntimeFileContextInterface {

    public Object __downloadAccessListType = "Google_DownloadAccessRestriction";

    public Object __downloadAccessListDataType = "array";

    public Object downloadAccessList = null;

    public Object kind = null;

    public Google_DownloadAccesses(RuntimeEnv env, Object... args) {
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
            case "setDownloadAccessList":
                return this.setDownloadAccessList(env, args);
            case "getDownloadAccessList":
                return this.getDownloadAccessList(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__downloadAccessListType":
                if (Google_DownloadAccesses.class.isAssignableFrom(caller)) {

                    return this.__downloadAccessListType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__downloadAccessListDataType":
                if (Google_DownloadAccesses.class.isAssignableFrom(caller)) {

                    return this.__downloadAccessListDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "downloadAccessList":
                return this.downloadAccessList;
            case "kind":
                return this.kind;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__downloadAccessListType":
                if (Google_DownloadAccesses.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__downloadAccessListType);
                }
                break;
            case "__downloadAccessListDataType":
                if (Google_DownloadAccesses.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__downloadAccessListDataType);
                }
                break;
            case "downloadAccessList":
                return ZVal.isNull(this.downloadAccessList);
            case "kind":
                return ZVal.isNull(this.kind);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__downloadAccessListType":
                if (Google_DownloadAccesses.class.isAssignableFrom(caller)) {

                    this.__downloadAccessListType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__downloadAccessListDataType":
                if (Google_DownloadAccesses.class.isAssignableFrom(caller)) {

                    this.__downloadAccessListDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "downloadAccessList":
                this.downloadAccessList = value;
                break;
            case "kind":
                this.kind = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setDownloadAccessList(RuntimeEnv env, Object... args) {
        Object downloadAccessList = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_DownloadAccesses.class,
                downloadAccessList,
                "Google_DownloadAccessRestriction",
                "setDownloadAccessList");
        ZVal.setProperty(
                this, Google_DownloadAccesses.class, "downloadAccessList", downloadAccessList);

        return null;
    }

    public Object getDownloadAccessList(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_DownloadAccesses.class, "downloadAccessList"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DownloadAccesses.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DownloadAccesses.class, "kind"));
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
