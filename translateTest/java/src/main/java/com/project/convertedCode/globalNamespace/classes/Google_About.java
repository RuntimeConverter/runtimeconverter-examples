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

public class Google_About extends Google_Model implements RuntimeFileContextInterface {

    public Object kind = null;

    public Object __featuresType = "Google_AboutFeatures";

    public Object __featuresDataType = "array";

    public Object features = null;

    public Object quotaBytesUsed = null;

    public Object permissionId = null;

    public Object __maxUploadSizesType = "Google_AboutMaxUploadSizes";

    public Object __maxUploadSizesDataType = "array";

    public Object maxUploadSizes = null;

    public Object name = null;

    public Object remainingChangeIds = null;

    public Object __additionalRoleInfoType = "Google_AboutAdditionalRoleInfo";

    public Object __additionalRoleInfoDataType = "array";

    public Object additionalRoleInfo = null;

    public Object etag = null;

    public Object __importFormatsType = "Google_AboutImportFormats";

    public Object __importFormatsDataType = "array";

    public Object importFormats = null;

    public Object quotaBytesTotal = null;

    public Object rootFolderId = null;

    public Object largestChangeId = null;

    public Object quotaBytesUsedInTrash = null;

    public Object __exportFormatsType = "Google_AboutExportFormats";

    public Object __exportFormatsDataType = "array";

    public Object exportFormats = null;

    public Object domainSharingPolicy = null;

    public Object selfLink = null;

    public Object isCurrentAppInstalled = null;

    public Google_About(RuntimeEnv env, Object... args) {
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
            case "setFeatures":
                return this.setFeatures(env, args);
            case "getFeatures":
                return this.getFeatures(env, args);
            case "setQuotaBytesUsed":
                return this.setQuotaBytesUsed(env, args);
            case "getQuotaBytesUsed":
                return this.getQuotaBytesUsed(env, args);
            case "setPermissionId":
                return this.setPermissionId(env, args);
            case "getPermissionId":
                return this.getPermissionId(env, args);
            case "setMaxUploadSizes":
                return this.setMaxUploadSizes(env, args);
            case "getMaxUploadSizes":
                return this.getMaxUploadSizes(env, args);
            case "setName":
                return this.setName(env, args);
            case "getName":
                return this.getName(env, args);
            case "setRemainingChangeIds":
                return this.setRemainingChangeIds(env, args);
            case "getRemainingChangeIds":
                return this.getRemainingChangeIds(env, args);
            case "setAdditionalRoleInfo":
                return this.setAdditionalRoleInfo(env, args);
            case "getAdditionalRoleInfo":
                return this.getAdditionalRoleInfo(env, args);
            case "setEtag":
                return this.setEtag(env, args);
            case "getEtag":
                return this.getEtag(env, args);
            case "setImportFormats":
                return this.setImportFormats(env, args);
            case "getImportFormats":
                return this.getImportFormats(env, args);
            case "setQuotaBytesTotal":
                return this.setQuotaBytesTotal(env, args);
            case "getQuotaBytesTotal":
                return this.getQuotaBytesTotal(env, args);
            case "setRootFolderId":
                return this.setRootFolderId(env, args);
            case "getRootFolderId":
                return this.getRootFolderId(env, args);
            case "setLargestChangeId":
                return this.setLargestChangeId(env, args);
            case "getLargestChangeId":
                return this.getLargestChangeId(env, args);
            case "setQuotaBytesUsedInTrash":
                return this.setQuotaBytesUsedInTrash(env, args);
            case "getQuotaBytesUsedInTrash":
                return this.getQuotaBytesUsedInTrash(env, args);
            case "setExportFormats":
                return this.setExportFormats(env, args);
            case "getExportFormats":
                return this.getExportFormats(env, args);
            case "setDomainSharingPolicy":
                return this.setDomainSharingPolicy(env, args);
            case "getDomainSharingPolicy":
                return this.getDomainSharingPolicy(env, args);
            case "setSelfLink":
                return this.setSelfLink(env, args);
            case "getSelfLink":
                return this.getSelfLink(env, args);
            case "setIsCurrentAppInstalled":
                return this.setIsCurrentAppInstalled(env, args);
            case "getIsCurrentAppInstalled":
                return this.getIsCurrentAppInstalled(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return this.kind;
            case "__featuresType":
                if (Google_About.class.isAssignableFrom(caller)) {

                    return this.__featuresType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__featuresDataType":
                if (Google_About.class.isAssignableFrom(caller)) {

                    return this.__featuresDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "features":
                return this.features;
            case "quotaBytesUsed":
                return this.quotaBytesUsed;
            case "permissionId":
                return this.permissionId;
            case "__maxUploadSizesType":
                if (Google_About.class.isAssignableFrom(caller)) {

                    return this.__maxUploadSizesType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__maxUploadSizesDataType":
                if (Google_About.class.isAssignableFrom(caller)) {

                    return this.__maxUploadSizesDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "maxUploadSizes":
                return this.maxUploadSizes;
            case "name":
                return this.name;
            case "remainingChangeIds":
                return this.remainingChangeIds;
            case "__additionalRoleInfoType":
                if (Google_About.class.isAssignableFrom(caller)) {

                    return this.__additionalRoleInfoType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__additionalRoleInfoDataType":
                if (Google_About.class.isAssignableFrom(caller)) {

                    return this.__additionalRoleInfoDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "additionalRoleInfo":
                return this.additionalRoleInfo;
            case "etag":
                return this.etag;
            case "__importFormatsType":
                if (Google_About.class.isAssignableFrom(caller)) {

                    return this.__importFormatsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__importFormatsDataType":
                if (Google_About.class.isAssignableFrom(caller)) {

                    return this.__importFormatsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "importFormats":
                return this.importFormats;
            case "quotaBytesTotal":
                return this.quotaBytesTotal;
            case "rootFolderId":
                return this.rootFolderId;
            case "largestChangeId":
                return this.largestChangeId;
            case "quotaBytesUsedInTrash":
                return this.quotaBytesUsedInTrash;
            case "__exportFormatsType":
                if (Google_About.class.isAssignableFrom(caller)) {

                    return this.__exportFormatsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__exportFormatsDataType":
                if (Google_About.class.isAssignableFrom(caller)) {

                    return this.__exportFormatsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "exportFormats":
                return this.exportFormats;
            case "domainSharingPolicy":
                return this.domainSharingPolicy;
            case "selfLink":
                return this.selfLink;
            case "isCurrentAppInstalled":
                return this.isCurrentAppInstalled;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return ZVal.isNull(this.kind);
            case "__featuresType":
                if (Google_About.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__featuresType);
                }
                break;
            case "__featuresDataType":
                if (Google_About.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__featuresDataType);
                }
                break;
            case "features":
                return ZVal.isNull(this.features);
            case "quotaBytesUsed":
                return ZVal.isNull(this.quotaBytesUsed);
            case "permissionId":
                return ZVal.isNull(this.permissionId);
            case "__maxUploadSizesType":
                if (Google_About.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__maxUploadSizesType);
                }
                break;
            case "__maxUploadSizesDataType":
                if (Google_About.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__maxUploadSizesDataType);
                }
                break;
            case "maxUploadSizes":
                return ZVal.isNull(this.maxUploadSizes);
            case "name":
                return ZVal.isNull(this.name);
            case "remainingChangeIds":
                return ZVal.isNull(this.remainingChangeIds);
            case "__additionalRoleInfoType":
                if (Google_About.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__additionalRoleInfoType);
                }
                break;
            case "__additionalRoleInfoDataType":
                if (Google_About.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__additionalRoleInfoDataType);
                }
                break;
            case "additionalRoleInfo":
                return ZVal.isNull(this.additionalRoleInfo);
            case "etag":
                return ZVal.isNull(this.etag);
            case "__importFormatsType":
                if (Google_About.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__importFormatsType);
                }
                break;
            case "__importFormatsDataType":
                if (Google_About.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__importFormatsDataType);
                }
                break;
            case "importFormats":
                return ZVal.isNull(this.importFormats);
            case "quotaBytesTotal":
                return ZVal.isNull(this.quotaBytesTotal);
            case "rootFolderId":
                return ZVal.isNull(this.rootFolderId);
            case "largestChangeId":
                return ZVal.isNull(this.largestChangeId);
            case "quotaBytesUsedInTrash":
                return ZVal.isNull(this.quotaBytesUsedInTrash);
            case "__exportFormatsType":
                if (Google_About.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__exportFormatsType);
                }
                break;
            case "__exportFormatsDataType":
                if (Google_About.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__exportFormatsDataType);
                }
                break;
            case "exportFormats":
                return ZVal.isNull(this.exportFormats);
            case "domainSharingPolicy":
                return ZVal.isNull(this.domainSharingPolicy);
            case "selfLink":
                return ZVal.isNull(this.selfLink);
            case "isCurrentAppInstalled":
                return ZVal.isNull(this.isCurrentAppInstalled);
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
            case "__featuresType":
                if (Google_About.class.isAssignableFrom(caller)) {

                    this.__featuresType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__featuresDataType":
                if (Google_About.class.isAssignableFrom(caller)) {

                    this.__featuresDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "features":
                this.features = value;
                break;
            case "quotaBytesUsed":
                this.quotaBytesUsed = value;
                break;
            case "permissionId":
                this.permissionId = value;
                break;
            case "__maxUploadSizesType":
                if (Google_About.class.isAssignableFrom(caller)) {

                    this.__maxUploadSizesType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__maxUploadSizesDataType":
                if (Google_About.class.isAssignableFrom(caller)) {

                    this.__maxUploadSizesDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "maxUploadSizes":
                this.maxUploadSizes = value;
                break;
            case "name":
                this.name = value;
                break;
            case "remainingChangeIds":
                this.remainingChangeIds = value;
                break;
            case "__additionalRoleInfoType":
                if (Google_About.class.isAssignableFrom(caller)) {

                    this.__additionalRoleInfoType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__additionalRoleInfoDataType":
                if (Google_About.class.isAssignableFrom(caller)) {

                    this.__additionalRoleInfoDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "additionalRoleInfo":
                this.additionalRoleInfo = value;
                break;
            case "etag":
                this.etag = value;
                break;
            case "__importFormatsType":
                if (Google_About.class.isAssignableFrom(caller)) {

                    this.__importFormatsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__importFormatsDataType":
                if (Google_About.class.isAssignableFrom(caller)) {

                    this.__importFormatsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "importFormats":
                this.importFormats = value;
                break;
            case "quotaBytesTotal":
                this.quotaBytesTotal = value;
                break;
            case "rootFolderId":
                this.rootFolderId = value;
                break;
            case "largestChangeId":
                this.largestChangeId = value;
                break;
            case "quotaBytesUsedInTrash":
                this.quotaBytesUsedInTrash = value;
                break;
            case "__exportFormatsType":
                if (Google_About.class.isAssignableFrom(caller)) {

                    this.__exportFormatsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__exportFormatsDataType":
                if (Google_About.class.isAssignableFrom(caller)) {

                    this.__exportFormatsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "exportFormats":
                this.exportFormats = value;
                break;
            case "domainSharingPolicy":
                this.domainSharingPolicy = value;
                break;
            case "selfLink":
                this.selfLink = value;
                break;
            case "isCurrentAppInstalled":
                this.isCurrentAppInstalled = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_About.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_About.class, "kind"));
    }

    public Object setFeatures(RuntimeEnv env, Object... args) {
        Object features = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_About.class,
                features,
                "Google_AboutFeatures",
                "setFeatures");
        ZVal.setProperty(this, Google_About.class, "features", features);

        return null;
    }

    public Object getFeatures(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_About.class, "features"));
    }

    public Object setQuotaBytesUsed(RuntimeEnv env, Object... args) {
        Object quotaBytesUsed = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_About.class, "quotaBytesUsed", quotaBytesUsed);

        return null;
    }

    public Object getQuotaBytesUsed(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_About.class, "quotaBytesUsed"));
    }

    public Object setPermissionId(RuntimeEnv env, Object... args) {
        Object permissionId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_About.class, "permissionId", permissionId);

        return null;
    }

    public Object getPermissionId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_About.class, "permissionId"));
    }

    public Object setMaxUploadSizes(RuntimeEnv env, Object... args) {
        Object maxUploadSizes = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_About.class,
                maxUploadSizes,
                "Google_AboutMaxUploadSizes",
                "setMaxUploadSizes");
        ZVal.setProperty(this, Google_About.class, "maxUploadSizes", maxUploadSizes);

        return null;
    }

    public Object getMaxUploadSizes(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_About.class, "maxUploadSizes"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_About.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_About.class, "name"));
    }

    public Object setRemainingChangeIds(RuntimeEnv env, Object... args) {
        Object remainingChangeIds = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_About.class, "remainingChangeIds", remainingChangeIds);

        return null;
    }

    public Object getRemainingChangeIds(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_About.class, "remainingChangeIds"));
    }

    public Object setAdditionalRoleInfo(RuntimeEnv env, Object... args) {
        Object additionalRoleInfo = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_About.class,
                additionalRoleInfo,
                "Google_AboutAdditionalRoleInfo",
                "setAdditionalRoleInfo");
        ZVal.setProperty(this, Google_About.class, "additionalRoleInfo", additionalRoleInfo);

        return null;
    }

    public Object getAdditionalRoleInfo(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_About.class, "additionalRoleInfo"));
    }

    public Object setEtag(RuntimeEnv env, Object... args) {
        Object etag = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_About.class, "etag", etag);

        return null;
    }

    public Object getEtag(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_About.class, "etag"));
    }

    public Object setImportFormats(RuntimeEnv env, Object... args) {
        Object importFormats = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_About.class,
                importFormats,
                "Google_AboutImportFormats",
                "setImportFormats");
        ZVal.setProperty(this, Google_About.class, "importFormats", importFormats);

        return null;
    }

    public Object getImportFormats(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_About.class, "importFormats"));
    }

    public Object setQuotaBytesTotal(RuntimeEnv env, Object... args) {
        Object quotaBytesTotal = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_About.class, "quotaBytesTotal", quotaBytesTotal);

        return null;
    }

    public Object getQuotaBytesTotal(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_About.class, "quotaBytesTotal"));
    }

    public Object setRootFolderId(RuntimeEnv env, Object... args) {
        Object rootFolderId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_About.class, "rootFolderId", rootFolderId);

        return null;
    }

    public Object getRootFolderId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_About.class, "rootFolderId"));
    }

    public Object setLargestChangeId(RuntimeEnv env, Object... args) {
        Object largestChangeId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_About.class, "largestChangeId", largestChangeId);

        return null;
    }

    public Object getLargestChangeId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_About.class, "largestChangeId"));
    }

    public Object setQuotaBytesUsedInTrash(RuntimeEnv env, Object... args) {
        Object quotaBytesUsedInTrash = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_About.class, "quotaBytesUsedInTrash", quotaBytesUsedInTrash);

        return null;
    }

    public Object getQuotaBytesUsedInTrash(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_About.class, "quotaBytesUsedInTrash"));
    }

    public Object setExportFormats(RuntimeEnv env, Object... args) {
        Object exportFormats = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_About.class,
                exportFormats,
                "Google_AboutExportFormats",
                "setExportFormats");
        ZVal.setProperty(this, Google_About.class, "exportFormats", exportFormats);

        return null;
    }

    public Object getExportFormats(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_About.class, "exportFormats"));
    }

    public Object setDomainSharingPolicy(RuntimeEnv env, Object... args) {
        Object domainSharingPolicy = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_About.class, "domainSharingPolicy", domainSharingPolicy);

        return null;
    }

    public Object getDomainSharingPolicy(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_About.class, "domainSharingPolicy"));
    }

    public Object setSelfLink(RuntimeEnv env, Object... args) {
        Object selfLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_About.class, "selfLink", selfLink);

        return null;
    }

    public Object getSelfLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_About.class, "selfLink"));
    }

    public Object setIsCurrentAppInstalled(RuntimeEnv env, Object... args) {
        Object isCurrentAppInstalled = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_About.class, "isCurrentAppInstalled", isCurrentAppInstalled);

        return null;
    }

    public Object getIsCurrentAppInstalled(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_About.class, "isCurrentAppInstalled"));
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
