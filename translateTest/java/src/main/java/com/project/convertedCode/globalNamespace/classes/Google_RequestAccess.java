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

public class Google_RequestAccess extends Google_Model implements RuntimeFileContextInterface {

    public Object __downloadAccessType = "Google_DownloadAccessRestriction";

    public Object __downloadAccessDataType = "";

    public Object downloadAccess = null;

    public Object kind = null;

    public Object __concurrentAccessType = "Google_ConcurrentAccessRestriction";

    public Object __concurrentAccessDataType = "";

    public Object concurrentAccess = null;

    public Google_RequestAccess(RuntimeEnv env, Object... args) {
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
            case "setDownloadAccess":
                return this.setDownloadAccess(env, args);
            case "getDownloadAccess":
                return this.getDownloadAccess(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setConcurrentAccess":
                return this.setConcurrentAccess(env, args);
            case "getConcurrentAccess":
                return this.getConcurrentAccess(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__downloadAccessType":
                if (Google_RequestAccess.class.isAssignableFrom(caller)) {

                    return this.__downloadAccessType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__downloadAccessDataType":
                if (Google_RequestAccess.class.isAssignableFrom(caller)) {

                    return this.__downloadAccessDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "downloadAccess":
                return this.downloadAccess;
            case "kind":
                return this.kind;
            case "__concurrentAccessType":
                if (Google_RequestAccess.class.isAssignableFrom(caller)) {

                    return this.__concurrentAccessType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__concurrentAccessDataType":
                if (Google_RequestAccess.class.isAssignableFrom(caller)) {

                    return this.__concurrentAccessDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "concurrentAccess":
                return this.concurrentAccess;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__downloadAccessType":
                if (Google_RequestAccess.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__downloadAccessType);
                }
                break;
            case "__downloadAccessDataType":
                if (Google_RequestAccess.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__downloadAccessDataType);
                }
                break;
            case "downloadAccess":
                return ZVal.isNull(this.downloadAccess);
            case "kind":
                return ZVal.isNull(this.kind);
            case "__concurrentAccessType":
                if (Google_RequestAccess.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__concurrentAccessType);
                }
                break;
            case "__concurrentAccessDataType":
                if (Google_RequestAccess.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__concurrentAccessDataType);
                }
                break;
            case "concurrentAccess":
                return ZVal.isNull(this.concurrentAccess);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__downloadAccessType":
                if (Google_RequestAccess.class.isAssignableFrom(caller)) {

                    this.__downloadAccessType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__downloadAccessDataType":
                if (Google_RequestAccess.class.isAssignableFrom(caller)) {

                    this.__downloadAccessDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "downloadAccess":
                this.downloadAccess = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "__concurrentAccessType":
                if (Google_RequestAccess.class.isAssignableFrom(caller)) {

                    this.__concurrentAccessType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__concurrentAccessDataType":
                if (Google_RequestAccess.class.isAssignableFrom(caller)) {

                    this.__concurrentAccessDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "concurrentAccess":
                this.concurrentAccess = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setDownloadAccess(RuntimeEnv env, Object... args) {
        Object downloadAccess = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_RequestAccess.class, "downloadAccess", downloadAccess);

        return null;
    }

    public Object getDownloadAccess(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_RequestAccess.class, "downloadAccess"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_RequestAccess.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_RequestAccess.class, "kind"));
    }

    public Object setConcurrentAccess(RuntimeEnv env, Object... args) {
        Object concurrentAccess = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_RequestAccess.class, "concurrentAccess", concurrentAccess);

        return null;
    }

    public Object getConcurrentAccess(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_RequestAccess.class, "concurrentAccess"));
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
