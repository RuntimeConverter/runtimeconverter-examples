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

 google-api-php-client/src/contrib/Google_AdsensehostService.php

*/

public class Google_AdUnit extends Google_Model implements RuntimeFileContextInterface {

    public Object status = null;

    public Object kind = null;

    public Object code = null;

    public Object name = null;

    public Object __contentAdsSettingsType = "Google_AdUnitContentAdsSettings";

    public Object __contentAdsSettingsDataType = "";

    public Object contentAdsSettings = null;

    public Object id = null;

    public Object __mobileContentAdsSettingsType = "Google_AdUnitMobileContentAdsSettings";

    public Object __mobileContentAdsSettingsDataType = "";

    public Object mobileContentAdsSettings = null;

    public Object __customStyleType = "Google_AdStyle";

    public Object __customStyleDataType = "";

    public Object customStyle = null;

    public Google_AdUnit(RuntimeEnv env, Object... args) {
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
            case "setStatus":
                return this.setStatus(env, args);
            case "getStatus":
                return this.getStatus(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setCode":
                return this.setCode(env, args);
            case "getCode":
                return this.getCode(env, args);
            case "setName":
                return this.setName(env, args);
            case "getName":
                return this.getName(env, args);
            case "setContentAdsSettings":
                return this.setContentAdsSettings(env, args);
            case "getContentAdsSettings":
                return this.getContentAdsSettings(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setMobileContentAdsSettings":
                return this.setMobileContentAdsSettings(env, args);
            case "getMobileContentAdsSettings":
                return this.getMobileContentAdsSettings(env, args);
            case "setCustomStyle":
                return this.setCustomStyle(env, args);
            case "getCustomStyle":
                return this.getCustomStyle(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "status":
                return this.status;
            case "kind":
                return this.kind;
            case "code":
                return this.code;
            case "name":
                return this.name;
            case "__contentAdsSettingsType":
                if (Google_AdUnit.class.isAssignableFrom(caller)) {

                    return this.__contentAdsSettingsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__contentAdsSettingsDataType":
                if (Google_AdUnit.class.isAssignableFrom(caller)) {

                    return this.__contentAdsSettingsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "contentAdsSettings":
                return this.contentAdsSettings;
            case "id":
                return this.id;
            case "__mobileContentAdsSettingsType":
                if (Google_AdUnit.class.isAssignableFrom(caller)) {

                    return this.__mobileContentAdsSettingsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__mobileContentAdsSettingsDataType":
                if (Google_AdUnit.class.isAssignableFrom(caller)) {

                    return this.__mobileContentAdsSettingsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "mobileContentAdsSettings":
                return this.mobileContentAdsSettings;
            case "__customStyleType":
                if (Google_AdUnit.class.isAssignableFrom(caller)) {

                    return this.__customStyleType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__customStyleDataType":
                if (Google_AdUnit.class.isAssignableFrom(caller)) {

                    return this.__customStyleDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "customStyle":
                return this.customStyle;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "status":
                return ZVal.isNull(this.status);
            case "kind":
                return ZVal.isNull(this.kind);
            case "code":
                return ZVal.isNull(this.code);
            case "name":
                return ZVal.isNull(this.name);
            case "__contentAdsSettingsType":
                if (Google_AdUnit.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__contentAdsSettingsType);
                }
                break;
            case "__contentAdsSettingsDataType":
                if (Google_AdUnit.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__contentAdsSettingsDataType);
                }
                break;
            case "contentAdsSettings":
                return ZVal.isNull(this.contentAdsSettings);
            case "id":
                return ZVal.isNull(this.id);
            case "__mobileContentAdsSettingsType":
                if (Google_AdUnit.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__mobileContentAdsSettingsType);
                }
                break;
            case "__mobileContentAdsSettingsDataType":
                if (Google_AdUnit.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__mobileContentAdsSettingsDataType);
                }
                break;
            case "mobileContentAdsSettings":
                return ZVal.isNull(this.mobileContentAdsSettings);
            case "__customStyleType":
                if (Google_AdUnit.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__customStyleType);
                }
                break;
            case "__customStyleDataType":
                if (Google_AdUnit.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__customStyleDataType);
                }
                break;
            case "customStyle":
                return ZVal.isNull(this.customStyle);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "status":
                this.status = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "code":
                this.code = value;
                break;
            case "name":
                this.name = value;
                break;
            case "__contentAdsSettingsType":
                if (Google_AdUnit.class.isAssignableFrom(caller)) {

                    this.__contentAdsSettingsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__contentAdsSettingsDataType":
                if (Google_AdUnit.class.isAssignableFrom(caller)) {

                    this.__contentAdsSettingsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "contentAdsSettings":
                this.contentAdsSettings = value;
                break;
            case "id":
                this.id = value;
                break;
            case "__mobileContentAdsSettingsType":
                if (Google_AdUnit.class.isAssignableFrom(caller)) {

                    this.__mobileContentAdsSettingsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__mobileContentAdsSettingsDataType":
                if (Google_AdUnit.class.isAssignableFrom(caller)) {

                    this.__mobileContentAdsSettingsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "mobileContentAdsSettings":
                this.mobileContentAdsSettings = value;
                break;
            case "__customStyleType":
                if (Google_AdUnit.class.isAssignableFrom(caller)) {

                    this.__customStyleType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__customStyleDataType":
                if (Google_AdUnit.class.isAssignableFrom(caller)) {

                    this.__customStyleDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "customStyle":
                this.customStyle = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setStatus(RuntimeEnv env, Object... args) {
        Object status = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AdUnit.class, "status", status);

        return null;
    }

    public Object getStatus(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AdUnit.class, "status"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AdUnit.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AdUnit.class, "kind"));
    }

    public Object setCode(RuntimeEnv env, Object... args) {
        Object code = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AdUnit.class, "code", code);

        return null;
    }

    public Object getCode(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AdUnit.class, "code"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AdUnit.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AdUnit.class, "name"));
    }

    public Object setContentAdsSettings(RuntimeEnv env, Object... args) {
        Object contentAdsSettings = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AdUnit.class, "contentAdsSettings", contentAdsSettings);

        return null;
    }

    public Object getContentAdsSettings(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AdUnit.class, "contentAdsSettings"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AdUnit.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AdUnit.class, "id"));
    }

    public Object setMobileContentAdsSettings(RuntimeEnv env, Object... args) {
        Object mobileContentAdsSettings = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_AdUnit.class, "mobileContentAdsSettings", mobileContentAdsSettings);

        return null;
    }

    public Object getMobileContentAdsSettings(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AdUnit.class, "mobileContentAdsSettings"));
    }

    public Object setCustomStyle(RuntimeEnv env, Object... args) {
        Object customStyle = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AdUnit.class, "customStyle", customStyle);

        return null;
    }

    public Object getCustomStyle(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AdUnit.class, "customStyle"));
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
