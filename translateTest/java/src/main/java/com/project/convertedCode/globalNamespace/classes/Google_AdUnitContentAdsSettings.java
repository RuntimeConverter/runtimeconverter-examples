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

public class Google_AdUnitContentAdsSettings extends Google_Model
        implements RuntimeFileContextInterface {

    public Object type = null;

    public Object __backupOptionType = "Google_AdUnitContentAdsSettingsBackupOption";

    public Object __backupOptionDataType = "";

    public Object backupOption = null;

    public Object size = null;

    public Google_AdUnitContentAdsSettings(RuntimeEnv env, Object... args) {
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
            case "setType":
                return this.setType(env, args);
            case "getType":
                return this.getType(env, args);
            case "setBackupOption":
                return this.setBackupOption(env, args);
            case "getBackupOption":
                return this.getBackupOption(env, args);
            case "setSize":
                return this.setSize(env, args);
            case "getSize":
                return this.getSize(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "type":
                return this.type;
            case "__backupOptionType":
                if (Google_AdUnitContentAdsSettings.class.isAssignableFrom(caller)) {

                    return this.__backupOptionType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__backupOptionDataType":
                if (Google_AdUnitContentAdsSettings.class.isAssignableFrom(caller)) {

                    return this.__backupOptionDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "backupOption":
                return this.backupOption;
            case "size":
                return this.size;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "type":
                return ZVal.isNull(this.type);
            case "__backupOptionType":
                if (Google_AdUnitContentAdsSettings.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__backupOptionType);
                }
                break;
            case "__backupOptionDataType":
                if (Google_AdUnitContentAdsSettings.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__backupOptionDataType);
                }
                break;
            case "backupOption":
                return ZVal.isNull(this.backupOption);
            case "size":
                return ZVal.isNull(this.size);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "type":
                this.type = value;
                break;
            case "__backupOptionType":
                if (Google_AdUnitContentAdsSettings.class.isAssignableFrom(caller)) {

                    this.__backupOptionType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__backupOptionDataType":
                if (Google_AdUnitContentAdsSettings.class.isAssignableFrom(caller)) {

                    this.__backupOptionDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "backupOption":
                this.backupOption = value;
                break;
            case "size":
                this.size = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setType(RuntimeEnv env, Object... args) {
        Object type = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AdUnitContentAdsSettings.class, "type", type);

        return null;
    }

    public Object getType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AdUnitContentAdsSettings.class, "type"));
    }

    public Object setBackupOption(RuntimeEnv env, Object... args) {
        Object backupOption = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AdUnitContentAdsSettings.class, "backupOption", backupOption);

        return null;
    }

    public Object getBackupOption(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_AdUnitContentAdsSettings.class, "backupOption"));
    }

    public Object setSize(RuntimeEnv env, Object... args) {
        Object size = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AdUnitContentAdsSettings.class, "size", size);

        return null;
    }

    public Object getSize(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AdUnitContentAdsSettings.class, "size"));
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
