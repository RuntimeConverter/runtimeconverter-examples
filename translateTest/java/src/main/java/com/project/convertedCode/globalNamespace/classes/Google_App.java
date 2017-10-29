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

public class Google_App extends Google_Model implements RuntimeFileContextInterface {

    public Object kind = null;

    public Object primaryFileExtensions = null;

    public Object useByDefault = null;

    public Object name = null;

    public Object __iconsType = "Google_AppIcons";

    public Object __iconsDataType = "array";

    public Object icons = null;

    public Object secondaryFileExtensions = null;

    public Object installed = null;

    public Object productUrl = null;

    public Object secondaryMimeTypes = null;

    public Object authorized = null;

    public Object supportsCreate = null;

    public Object supportsImport = null;

    public Object primaryMimeTypes = null;

    public Object id = null;

    public Object objectType = null;

    public Google_App(RuntimeEnv env, Object... args) {
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
            case "setPrimaryFileExtensions":
                return this.setPrimaryFileExtensions(env, args);
            case "getPrimaryFileExtensions":
                return this.getPrimaryFileExtensions(env, args);
            case "setUseByDefault":
                return this.setUseByDefault(env, args);
            case "getUseByDefault":
                return this.getUseByDefault(env, args);
            case "setName":
                return this.setName(env, args);
            case "getName":
                return this.getName(env, args);
            case "setIcons":
                return this.setIcons(env, args);
            case "getIcons":
                return this.getIcons(env, args);
            case "setSecondaryFileExtensions":
                return this.setSecondaryFileExtensions(env, args);
            case "getSecondaryFileExtensions":
                return this.getSecondaryFileExtensions(env, args);
            case "setInstalled":
                return this.setInstalled(env, args);
            case "getInstalled":
                return this.getInstalled(env, args);
            case "setProductUrl":
                return this.setProductUrl(env, args);
            case "getProductUrl":
                return this.getProductUrl(env, args);
            case "setSecondaryMimeTypes":
                return this.setSecondaryMimeTypes(env, args);
            case "getSecondaryMimeTypes":
                return this.getSecondaryMimeTypes(env, args);
            case "setAuthorized":
                return this.setAuthorized(env, args);
            case "getAuthorized":
                return this.getAuthorized(env, args);
            case "setSupportsCreate":
                return this.setSupportsCreate(env, args);
            case "getSupportsCreate":
                return this.getSupportsCreate(env, args);
            case "setSupportsImport":
                return this.setSupportsImport(env, args);
            case "getSupportsImport":
                return this.getSupportsImport(env, args);
            case "setPrimaryMimeTypes":
                return this.setPrimaryMimeTypes(env, args);
            case "getPrimaryMimeTypes":
                return this.getPrimaryMimeTypes(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setObjectType":
                return this.setObjectType(env, args);
            case "getObjectType":
                return this.getObjectType(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return this.kind;
            case "primaryFileExtensions":
                return this.primaryFileExtensions;
            case "useByDefault":
                return this.useByDefault;
            case "name":
                return this.name;
            case "__iconsType":
                if (Google_App.class.isAssignableFrom(caller)) {

                    return this.__iconsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__iconsDataType":
                if (Google_App.class.isAssignableFrom(caller)) {

                    return this.__iconsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "icons":
                return this.icons;
            case "secondaryFileExtensions":
                return this.secondaryFileExtensions;
            case "installed":
                return this.installed;
            case "productUrl":
                return this.productUrl;
            case "secondaryMimeTypes":
                return this.secondaryMimeTypes;
            case "authorized":
                return this.authorized;
            case "supportsCreate":
                return this.supportsCreate;
            case "supportsImport":
                return this.supportsImport;
            case "primaryMimeTypes":
                return this.primaryMimeTypes;
            case "id":
                return this.id;
            case "objectType":
                return this.objectType;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return ZVal.isNull(this.kind);
            case "primaryFileExtensions":
                return ZVal.isNull(this.primaryFileExtensions);
            case "useByDefault":
                return ZVal.isNull(this.useByDefault);
            case "name":
                return ZVal.isNull(this.name);
            case "__iconsType":
                if (Google_App.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__iconsType);
                }
                break;
            case "__iconsDataType":
                if (Google_App.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__iconsDataType);
                }
                break;
            case "icons":
                return ZVal.isNull(this.icons);
            case "secondaryFileExtensions":
                return ZVal.isNull(this.secondaryFileExtensions);
            case "installed":
                return ZVal.isNull(this.installed);
            case "productUrl":
                return ZVal.isNull(this.productUrl);
            case "secondaryMimeTypes":
                return ZVal.isNull(this.secondaryMimeTypes);
            case "authorized":
                return ZVal.isNull(this.authorized);
            case "supportsCreate":
                return ZVal.isNull(this.supportsCreate);
            case "supportsImport":
                return ZVal.isNull(this.supportsImport);
            case "primaryMimeTypes":
                return ZVal.isNull(this.primaryMimeTypes);
            case "id":
                return ZVal.isNull(this.id);
            case "objectType":
                return ZVal.isNull(this.objectType);
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
            case "primaryFileExtensions":
                this.primaryFileExtensions = value;
                break;
            case "useByDefault":
                this.useByDefault = value;
                break;
            case "name":
                this.name = value;
                break;
            case "__iconsType":
                if (Google_App.class.isAssignableFrom(caller)) {

                    this.__iconsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__iconsDataType":
                if (Google_App.class.isAssignableFrom(caller)) {

                    this.__iconsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "icons":
                this.icons = value;
                break;
            case "secondaryFileExtensions":
                this.secondaryFileExtensions = value;
                break;
            case "installed":
                this.installed = value;
                break;
            case "productUrl":
                this.productUrl = value;
                break;
            case "secondaryMimeTypes":
                this.secondaryMimeTypes = value;
                break;
            case "authorized":
                this.authorized = value;
                break;
            case "supportsCreate":
                this.supportsCreate = value;
                break;
            case "supportsImport":
                this.supportsImport = value;
                break;
            case "primaryMimeTypes":
                this.primaryMimeTypes = value;
                break;
            case "id":
                this.id = value;
                break;
            case "objectType":
                this.objectType = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_App.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_App.class, "kind"));
    }

    public Object setPrimaryFileExtensions(RuntimeEnv env, Object... args) {
        Object primaryFileExtensions = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_App.class,
                primaryFileExtensions,
                "Google_string",
                "setPrimaryFileExtensions");
        ZVal.setProperty(this, Google_App.class, "primaryFileExtensions", primaryFileExtensions);

        return null;
    }

    public Object getPrimaryFileExtensions(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_App.class, "primaryFileExtensions"));
    }

    public Object setUseByDefault(RuntimeEnv env, Object... args) {
        Object useByDefault = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_App.class, "useByDefault", useByDefault);

        return null;
    }

    public Object getUseByDefault(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_App.class, "useByDefault"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_App.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_App.class, "name"));
    }

    public Object setIcons(RuntimeEnv env, Object... args) {
        Object icons = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this, "assertIsArray", Google_App.class, icons, "Google_AppIcons", "setIcons");
        ZVal.setProperty(this, Google_App.class, "icons", icons);

        return null;
    }

    public Object getIcons(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_App.class, "icons"));
    }

    public Object setSecondaryFileExtensions(RuntimeEnv env, Object... args) {
        Object secondaryFileExtensions = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_App.class,
                secondaryFileExtensions,
                "Google_string",
                "setSecondaryFileExtensions");
        ZVal.setProperty(
                this, Google_App.class, "secondaryFileExtensions", secondaryFileExtensions);

        return null;
    }

    public Object getSecondaryFileExtensions(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_App.class, "secondaryFileExtensions"));
    }

    public Object setInstalled(RuntimeEnv env, Object... args) {
        Object installed = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_App.class, "installed", installed);

        return null;
    }

    public Object getInstalled(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_App.class, "installed"));
    }

    public Object setProductUrl(RuntimeEnv env, Object... args) {
        Object productUrl = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_App.class, "productUrl", productUrl);

        return null;
    }

    public Object getProductUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_App.class, "productUrl"));
    }

    public Object setSecondaryMimeTypes(RuntimeEnv env, Object... args) {
        Object secondaryMimeTypes = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_App.class,
                secondaryMimeTypes,
                "Google_string",
                "setSecondaryMimeTypes");
        ZVal.setProperty(this, Google_App.class, "secondaryMimeTypes", secondaryMimeTypes);

        return null;
    }

    public Object getSecondaryMimeTypes(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_App.class, "secondaryMimeTypes"));
    }

    public Object setAuthorized(RuntimeEnv env, Object... args) {
        Object authorized = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_App.class, "authorized", authorized);

        return null;
    }

    public Object getAuthorized(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_App.class, "authorized"));
    }

    public Object setSupportsCreate(RuntimeEnv env, Object... args) {
        Object supportsCreate = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_App.class, "supportsCreate", supportsCreate);

        return null;
    }

    public Object getSupportsCreate(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_App.class, "supportsCreate"));
    }

    public Object setSupportsImport(RuntimeEnv env, Object... args) {
        Object supportsImport = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_App.class, "supportsImport", supportsImport);

        return null;
    }

    public Object getSupportsImport(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_App.class, "supportsImport"));
    }

    public Object setPrimaryMimeTypes(RuntimeEnv env, Object... args) {
        Object primaryMimeTypes = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_App.class,
                primaryMimeTypes,
                "Google_string",
                "setPrimaryMimeTypes");
        ZVal.setProperty(this, Google_App.class, "primaryMimeTypes", primaryMimeTypes);

        return null;
    }

    public Object getPrimaryMimeTypes(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_App.class, "primaryMimeTypes"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_App.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_App.class, "id"));
    }

    public Object setObjectType(RuntimeEnv env, Object... args) {
        Object objectType = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_App.class, "objectType", objectType);

        return null;
    }

    public Object getObjectType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_App.class, "objectType"));
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
