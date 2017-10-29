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

public class Google_Volume extends Google_Model implements RuntimeFileContextInterface {

    public Object kind = null;

    public Object __accessInfoType = "Google_VolumeAccessInfo";

    public Object __accessInfoDataType = "";

    public Object accessInfo = null;

    public Object __searchInfoType = "Google_VolumeSearchInfo";

    public Object __searchInfoDataType = "";

    public Object searchInfo = null;

    public Object __saleInfoType = "Google_VolumeSaleInfo";

    public Object __saleInfoDataType = "";

    public Object saleInfo = null;

    public Object etag = null;

    public Object __userInfoType = "Google_VolumeUserInfo";

    public Object __userInfoDataType = "";

    public Object userInfo = null;

    public Object __volumeInfoType = "Google_VolumeVolumeInfo";

    public Object __volumeInfoDataType = "";

    public Object volumeInfo = null;

    public Object id = null;

    public Object selfLink = null;

    public Google_Volume(RuntimeEnv env, Object... args) {
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
            case "setAccessInfo":
                return this.setAccessInfo(env, args);
            case "getAccessInfo":
                return this.getAccessInfo(env, args);
            case "setSearchInfo":
                return this.setSearchInfo(env, args);
            case "getSearchInfo":
                return this.getSearchInfo(env, args);
            case "setSaleInfo":
                return this.setSaleInfo(env, args);
            case "getSaleInfo":
                return this.getSaleInfo(env, args);
            case "setEtag":
                return this.setEtag(env, args);
            case "getEtag":
                return this.getEtag(env, args);
            case "setUserInfo":
                return this.setUserInfo(env, args);
            case "getUserInfo":
                return this.getUserInfo(env, args);
            case "setVolumeInfo":
                return this.setVolumeInfo(env, args);
            case "getVolumeInfo":
                return this.getVolumeInfo(env, args);
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
            case "__accessInfoType":
                if (Google_Volume.class.isAssignableFrom(caller)) {

                    return this.__accessInfoType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__accessInfoDataType":
                if (Google_Volume.class.isAssignableFrom(caller)) {

                    return this.__accessInfoDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "accessInfo":
                return this.accessInfo;
            case "__searchInfoType":
                if (Google_Volume.class.isAssignableFrom(caller)) {

                    return this.__searchInfoType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__searchInfoDataType":
                if (Google_Volume.class.isAssignableFrom(caller)) {

                    return this.__searchInfoDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "searchInfo":
                return this.searchInfo;
            case "__saleInfoType":
                if (Google_Volume.class.isAssignableFrom(caller)) {

                    return this.__saleInfoType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__saleInfoDataType":
                if (Google_Volume.class.isAssignableFrom(caller)) {

                    return this.__saleInfoDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "saleInfo":
                return this.saleInfo;
            case "etag":
                return this.etag;
            case "__userInfoType":
                if (Google_Volume.class.isAssignableFrom(caller)) {

                    return this.__userInfoType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__userInfoDataType":
                if (Google_Volume.class.isAssignableFrom(caller)) {

                    return this.__userInfoDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "userInfo":
                return this.userInfo;
            case "__volumeInfoType":
                if (Google_Volume.class.isAssignableFrom(caller)) {

                    return this.__volumeInfoType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__volumeInfoDataType":
                if (Google_Volume.class.isAssignableFrom(caller)) {

                    return this.__volumeInfoDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "volumeInfo":
                return this.volumeInfo;
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
            case "__accessInfoType":
                if (Google_Volume.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__accessInfoType);
                }
                break;
            case "__accessInfoDataType":
                if (Google_Volume.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__accessInfoDataType);
                }
                break;
            case "accessInfo":
                return ZVal.isNull(this.accessInfo);
            case "__searchInfoType":
                if (Google_Volume.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__searchInfoType);
                }
                break;
            case "__searchInfoDataType":
                if (Google_Volume.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__searchInfoDataType);
                }
                break;
            case "searchInfo":
                return ZVal.isNull(this.searchInfo);
            case "__saleInfoType":
                if (Google_Volume.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__saleInfoType);
                }
                break;
            case "__saleInfoDataType":
                if (Google_Volume.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__saleInfoDataType);
                }
                break;
            case "saleInfo":
                return ZVal.isNull(this.saleInfo);
            case "etag":
                return ZVal.isNull(this.etag);
            case "__userInfoType":
                if (Google_Volume.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__userInfoType);
                }
                break;
            case "__userInfoDataType":
                if (Google_Volume.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__userInfoDataType);
                }
                break;
            case "userInfo":
                return ZVal.isNull(this.userInfo);
            case "__volumeInfoType":
                if (Google_Volume.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__volumeInfoType);
                }
                break;
            case "__volumeInfoDataType":
                if (Google_Volume.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__volumeInfoDataType);
                }
                break;
            case "volumeInfo":
                return ZVal.isNull(this.volumeInfo);
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
            case "__accessInfoType":
                if (Google_Volume.class.isAssignableFrom(caller)) {

                    this.__accessInfoType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__accessInfoDataType":
                if (Google_Volume.class.isAssignableFrom(caller)) {

                    this.__accessInfoDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "accessInfo":
                this.accessInfo = value;
                break;
            case "__searchInfoType":
                if (Google_Volume.class.isAssignableFrom(caller)) {

                    this.__searchInfoType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__searchInfoDataType":
                if (Google_Volume.class.isAssignableFrom(caller)) {

                    this.__searchInfoDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "searchInfo":
                this.searchInfo = value;
                break;
            case "__saleInfoType":
                if (Google_Volume.class.isAssignableFrom(caller)) {

                    this.__saleInfoType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__saleInfoDataType":
                if (Google_Volume.class.isAssignableFrom(caller)) {

                    this.__saleInfoDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "saleInfo":
                this.saleInfo = value;
                break;
            case "etag":
                this.etag = value;
                break;
            case "__userInfoType":
                if (Google_Volume.class.isAssignableFrom(caller)) {

                    this.__userInfoType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__userInfoDataType":
                if (Google_Volume.class.isAssignableFrom(caller)) {

                    this.__userInfoDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "userInfo":
                this.userInfo = value;
                break;
            case "__volumeInfoType":
                if (Google_Volume.class.isAssignableFrom(caller)) {

                    this.__volumeInfoType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__volumeInfoDataType":
                if (Google_Volume.class.isAssignableFrom(caller)) {

                    this.__volumeInfoDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "volumeInfo":
                this.volumeInfo = value;
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
        ZVal.setProperty(this, Google_Volume.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Volume.class, "kind"));
    }

    public Object setAccessInfo(RuntimeEnv env, Object... args) {
        Object accessInfo = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Volume.class, "accessInfo", accessInfo);

        return null;
    }

    public Object getAccessInfo(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Volume.class, "accessInfo"));
    }

    public Object setSearchInfo(RuntimeEnv env, Object... args) {
        Object searchInfo = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Volume.class, "searchInfo", searchInfo);

        return null;
    }

    public Object getSearchInfo(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Volume.class, "searchInfo"));
    }

    public Object setSaleInfo(RuntimeEnv env, Object... args) {
        Object saleInfo = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Volume.class, "saleInfo", saleInfo);

        return null;
    }

    public Object getSaleInfo(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Volume.class, "saleInfo"));
    }

    public Object setEtag(RuntimeEnv env, Object... args) {
        Object etag = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Volume.class, "etag", etag);

        return null;
    }

    public Object getEtag(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Volume.class, "etag"));
    }

    public Object setUserInfo(RuntimeEnv env, Object... args) {
        Object userInfo = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Volume.class, "userInfo", userInfo);

        return null;
    }

    public Object getUserInfo(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Volume.class, "userInfo"));
    }

    public Object setVolumeInfo(RuntimeEnv env, Object... args) {
        Object volumeInfo = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Volume.class, "volumeInfo", volumeInfo);

        return null;
    }

    public Object getVolumeInfo(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Volume.class, "volumeInfo"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Volume.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Volume.class, "id"));
    }

    public Object setSelfLink(RuntimeEnv env, Object... args) {
        Object selfLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Volume.class, "selfLink", selfLink);

        return null;
    }

    public Object getSelfLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Volume.class, "selfLink"));
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
