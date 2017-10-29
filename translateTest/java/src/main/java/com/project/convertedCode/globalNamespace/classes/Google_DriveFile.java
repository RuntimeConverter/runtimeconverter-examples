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

public class Google_DriveFile extends Google_Model implements RuntimeFileContextInterface {

    public Object mimeType = null;

    public Object thumbnailLink = null;

    public Object __labelsType = "Google_DriveFileLabels";

    public Object __labelsDataType = "";

    public Object labels = null;

    public Object __indexableTextType = "Google_DriveFileIndexableText";

    public Object __indexableTextDataType = "";

    public Object indexableText = null;

    public Object explicitlyTrashed = null;

    public Object etag = null;

    public Object lastModifyingUserName = null;

    public Object writersCanShare = null;

    public Object id = null;

    public Object title = null;

    public Object ownerNames = null;

    public Object sharedWithMeDate = null;

    public Object lastViewedByMeDate = null;

    public Object __parentsType = "Google_ParentReference";

    public Object __parentsDataType = "array";

    public Object parents = null;

    public Object exportLinks = null;

    public Object originalFilename = null;

    public Object description = null;

    public Object webContentLink = null;

    public Object editable = null;

    public Object kind = null;

    public Object quotaBytesUsed = null;

    public Object fileSize = null;

    public Object createdDate = null;

    public Object md5Checksum = null;

    public Object __imageMediaMetadataType = "Google_DriveFileImageMediaMetadata";

    public Object __imageMediaMetadataDataType = "";

    public Object imageMediaMetadata = null;

    public Object embedLink = null;

    public Object alternateLink = null;

    public Object modifiedByMeDate = null;

    public Object downloadUrl = null;

    public Object __userPermissionType = "Google_Permission";

    public Object __userPermissionDataType = "";

    public Object userPermission = null;

    public Object fileExtension = null;

    public Object selfLink = null;

    public Object modifiedDate = null;

    public Google_DriveFile(RuntimeEnv env, Object... args) {
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
            case "setMimeType":
                return this.setMimeType(env, args);
            case "getMimeType":
                return this.getMimeType(env, args);
            case "setThumbnailLink":
                return this.setThumbnailLink(env, args);
            case "getThumbnailLink":
                return this.getThumbnailLink(env, args);
            case "setLabels":
                return this.setLabels(env, args);
            case "getLabels":
                return this.getLabels(env, args);
            case "setIndexableText":
                return this.setIndexableText(env, args);
            case "getIndexableText":
                return this.getIndexableText(env, args);
            case "setExplicitlyTrashed":
                return this.setExplicitlyTrashed(env, args);
            case "getExplicitlyTrashed":
                return this.getExplicitlyTrashed(env, args);
            case "setEtag":
                return this.setEtag(env, args);
            case "getEtag":
                return this.getEtag(env, args);
            case "setLastModifyingUserName":
                return this.setLastModifyingUserName(env, args);
            case "getLastModifyingUserName":
                return this.getLastModifyingUserName(env, args);
            case "setWritersCanShare":
                return this.setWritersCanShare(env, args);
            case "getWritersCanShare":
                return this.getWritersCanShare(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setTitle":
                return this.setTitle(env, args);
            case "getTitle":
                return this.getTitle(env, args);
            case "setOwnerNames":
                return this.setOwnerNames(env, args);
            case "getOwnerNames":
                return this.getOwnerNames(env, args);
            case "setSharedWithMeDate":
                return this.setSharedWithMeDate(env, args);
            case "getSharedWithMeDate":
                return this.getSharedWithMeDate(env, args);
            case "setLastViewedByMeDate":
                return this.setLastViewedByMeDate(env, args);
            case "getLastViewedByMeDate":
                return this.getLastViewedByMeDate(env, args);
            case "setParents":
                return this.setParents(env, args);
            case "getParents":
                return this.getParents(env, args);
            case "setExportLinks":
                return this.setExportLinks(env, args);
            case "getExportLinks":
                return this.getExportLinks(env, args);
            case "setOriginalFilename":
                return this.setOriginalFilename(env, args);
            case "getOriginalFilename":
                return this.getOriginalFilename(env, args);
            case "setDescription":
                return this.setDescription(env, args);
            case "getDescription":
                return this.getDescription(env, args);
            case "setWebContentLink":
                return this.setWebContentLink(env, args);
            case "getWebContentLink":
                return this.getWebContentLink(env, args);
            case "setEditable":
                return this.setEditable(env, args);
            case "getEditable":
                return this.getEditable(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setQuotaBytesUsed":
                return this.setQuotaBytesUsed(env, args);
            case "getQuotaBytesUsed":
                return this.getQuotaBytesUsed(env, args);
            case "setFileSize":
                return this.setFileSize(env, args);
            case "getFileSize":
                return this.getFileSize(env, args);
            case "setCreatedDate":
                return this.setCreatedDate(env, args);
            case "getCreatedDate":
                return this.getCreatedDate(env, args);
            case "setMd5Checksum":
                return this.setMd5Checksum(env, args);
            case "getMd5Checksum":
                return this.getMd5Checksum(env, args);
            case "setImageMediaMetadata":
                return this.setImageMediaMetadata(env, args);
            case "getImageMediaMetadata":
                return this.getImageMediaMetadata(env, args);
            case "setEmbedLink":
                return this.setEmbedLink(env, args);
            case "getEmbedLink":
                return this.getEmbedLink(env, args);
            case "setAlternateLink":
                return this.setAlternateLink(env, args);
            case "getAlternateLink":
                return this.getAlternateLink(env, args);
            case "setModifiedByMeDate":
                return this.setModifiedByMeDate(env, args);
            case "getModifiedByMeDate":
                return this.getModifiedByMeDate(env, args);
            case "setDownloadUrl":
                return this.setDownloadUrl(env, args);
            case "getDownloadUrl":
                return this.getDownloadUrl(env, args);
            case "setUserPermission":
                return this.setUserPermission(env, args);
            case "getUserPermission":
                return this.getUserPermission(env, args);
            case "setFileExtension":
                return this.setFileExtension(env, args);
            case "getFileExtension":
                return this.getFileExtension(env, args);
            case "setSelfLink":
                return this.setSelfLink(env, args);
            case "getSelfLink":
                return this.getSelfLink(env, args);
            case "setModifiedDate":
                return this.setModifiedDate(env, args);
            case "getModifiedDate":
                return this.getModifiedDate(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "mimeType":
                return this.mimeType;
            case "thumbnailLink":
                return this.thumbnailLink;
            case "__labelsType":
                if (Google_DriveFile.class.isAssignableFrom(caller)) {

                    return this.__labelsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__labelsDataType":
                if (Google_DriveFile.class.isAssignableFrom(caller)) {

                    return this.__labelsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "labels":
                return this.labels;
            case "__indexableTextType":
                if (Google_DriveFile.class.isAssignableFrom(caller)) {

                    return this.__indexableTextType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__indexableTextDataType":
                if (Google_DriveFile.class.isAssignableFrom(caller)) {

                    return this.__indexableTextDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "indexableText":
                return this.indexableText;
            case "explicitlyTrashed":
                return this.explicitlyTrashed;
            case "etag":
                return this.etag;
            case "lastModifyingUserName":
                return this.lastModifyingUserName;
            case "writersCanShare":
                return this.writersCanShare;
            case "id":
                return this.id;
            case "title":
                return this.title;
            case "ownerNames":
                return this.ownerNames;
            case "sharedWithMeDate":
                return this.sharedWithMeDate;
            case "lastViewedByMeDate":
                return this.lastViewedByMeDate;
            case "__parentsType":
                if (Google_DriveFile.class.isAssignableFrom(caller)) {

                    return this.__parentsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__parentsDataType":
                if (Google_DriveFile.class.isAssignableFrom(caller)) {

                    return this.__parentsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "parents":
                return this.parents;
            case "exportLinks":
                return this.exportLinks;
            case "originalFilename":
                return this.originalFilename;
            case "description":
                return this.description;
            case "webContentLink":
                return this.webContentLink;
            case "editable":
                return this.editable;
            case "kind":
                return this.kind;
            case "quotaBytesUsed":
                return this.quotaBytesUsed;
            case "fileSize":
                return this.fileSize;
            case "createdDate":
                return this.createdDate;
            case "md5Checksum":
                return this.md5Checksum;
            case "__imageMediaMetadataType":
                if (Google_DriveFile.class.isAssignableFrom(caller)) {

                    return this.__imageMediaMetadataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__imageMediaMetadataDataType":
                if (Google_DriveFile.class.isAssignableFrom(caller)) {

                    return this.__imageMediaMetadataDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "imageMediaMetadata":
                return this.imageMediaMetadata;
            case "embedLink":
                return this.embedLink;
            case "alternateLink":
                return this.alternateLink;
            case "modifiedByMeDate":
                return this.modifiedByMeDate;
            case "downloadUrl":
                return this.downloadUrl;
            case "__userPermissionType":
                if (Google_DriveFile.class.isAssignableFrom(caller)) {

                    return this.__userPermissionType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__userPermissionDataType":
                if (Google_DriveFile.class.isAssignableFrom(caller)) {

                    return this.__userPermissionDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "userPermission":
                return this.userPermission;
            case "fileExtension":
                return this.fileExtension;
            case "selfLink":
                return this.selfLink;
            case "modifiedDate":
                return this.modifiedDate;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "mimeType":
                return ZVal.isNull(this.mimeType);
            case "thumbnailLink":
                return ZVal.isNull(this.thumbnailLink);
            case "__labelsType":
                if (Google_DriveFile.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__labelsType);
                }
                break;
            case "__labelsDataType":
                if (Google_DriveFile.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__labelsDataType);
                }
                break;
            case "labels":
                return ZVal.isNull(this.labels);
            case "__indexableTextType":
                if (Google_DriveFile.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__indexableTextType);
                }
                break;
            case "__indexableTextDataType":
                if (Google_DriveFile.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__indexableTextDataType);
                }
                break;
            case "indexableText":
                return ZVal.isNull(this.indexableText);
            case "explicitlyTrashed":
                return ZVal.isNull(this.explicitlyTrashed);
            case "etag":
                return ZVal.isNull(this.etag);
            case "lastModifyingUserName":
                return ZVal.isNull(this.lastModifyingUserName);
            case "writersCanShare":
                return ZVal.isNull(this.writersCanShare);
            case "id":
                return ZVal.isNull(this.id);
            case "title":
                return ZVal.isNull(this.title);
            case "ownerNames":
                return ZVal.isNull(this.ownerNames);
            case "sharedWithMeDate":
                return ZVal.isNull(this.sharedWithMeDate);
            case "lastViewedByMeDate":
                return ZVal.isNull(this.lastViewedByMeDate);
            case "__parentsType":
                if (Google_DriveFile.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__parentsType);
                }
                break;
            case "__parentsDataType":
                if (Google_DriveFile.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__parentsDataType);
                }
                break;
            case "parents":
                return ZVal.isNull(this.parents);
            case "exportLinks":
                return ZVal.isNull(this.exportLinks);
            case "originalFilename":
                return ZVal.isNull(this.originalFilename);
            case "description":
                return ZVal.isNull(this.description);
            case "webContentLink":
                return ZVal.isNull(this.webContentLink);
            case "editable":
                return ZVal.isNull(this.editable);
            case "kind":
                return ZVal.isNull(this.kind);
            case "quotaBytesUsed":
                return ZVal.isNull(this.quotaBytesUsed);
            case "fileSize":
                return ZVal.isNull(this.fileSize);
            case "createdDate":
                return ZVal.isNull(this.createdDate);
            case "md5Checksum":
                return ZVal.isNull(this.md5Checksum);
            case "__imageMediaMetadataType":
                if (Google_DriveFile.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__imageMediaMetadataType);
                }
                break;
            case "__imageMediaMetadataDataType":
                if (Google_DriveFile.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__imageMediaMetadataDataType);
                }
                break;
            case "imageMediaMetadata":
                return ZVal.isNull(this.imageMediaMetadata);
            case "embedLink":
                return ZVal.isNull(this.embedLink);
            case "alternateLink":
                return ZVal.isNull(this.alternateLink);
            case "modifiedByMeDate":
                return ZVal.isNull(this.modifiedByMeDate);
            case "downloadUrl":
                return ZVal.isNull(this.downloadUrl);
            case "__userPermissionType":
                if (Google_DriveFile.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__userPermissionType);
                }
                break;
            case "__userPermissionDataType":
                if (Google_DriveFile.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__userPermissionDataType);
                }
                break;
            case "userPermission":
                return ZVal.isNull(this.userPermission);
            case "fileExtension":
                return ZVal.isNull(this.fileExtension);
            case "selfLink":
                return ZVal.isNull(this.selfLink);
            case "modifiedDate":
                return ZVal.isNull(this.modifiedDate);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "mimeType":
                this.mimeType = value;
                break;
            case "thumbnailLink":
                this.thumbnailLink = value;
                break;
            case "__labelsType":
                if (Google_DriveFile.class.isAssignableFrom(caller)) {

                    this.__labelsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__labelsDataType":
                if (Google_DriveFile.class.isAssignableFrom(caller)) {

                    this.__labelsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "labels":
                this.labels = value;
                break;
            case "__indexableTextType":
                if (Google_DriveFile.class.isAssignableFrom(caller)) {

                    this.__indexableTextType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__indexableTextDataType":
                if (Google_DriveFile.class.isAssignableFrom(caller)) {

                    this.__indexableTextDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "indexableText":
                this.indexableText = value;
                break;
            case "explicitlyTrashed":
                this.explicitlyTrashed = value;
                break;
            case "etag":
                this.etag = value;
                break;
            case "lastModifyingUserName":
                this.lastModifyingUserName = value;
                break;
            case "writersCanShare":
                this.writersCanShare = value;
                break;
            case "id":
                this.id = value;
                break;
            case "title":
                this.title = value;
                break;
            case "ownerNames":
                this.ownerNames = value;
                break;
            case "sharedWithMeDate":
                this.sharedWithMeDate = value;
                break;
            case "lastViewedByMeDate":
                this.lastViewedByMeDate = value;
                break;
            case "__parentsType":
                if (Google_DriveFile.class.isAssignableFrom(caller)) {

                    this.__parentsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__parentsDataType":
                if (Google_DriveFile.class.isAssignableFrom(caller)) {

                    this.__parentsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "parents":
                this.parents = value;
                break;
            case "exportLinks":
                this.exportLinks = value;
                break;
            case "originalFilename":
                this.originalFilename = value;
                break;
            case "description":
                this.description = value;
                break;
            case "webContentLink":
                this.webContentLink = value;
                break;
            case "editable":
                this.editable = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "quotaBytesUsed":
                this.quotaBytesUsed = value;
                break;
            case "fileSize":
                this.fileSize = value;
                break;
            case "createdDate":
                this.createdDate = value;
                break;
            case "md5Checksum":
                this.md5Checksum = value;
                break;
            case "__imageMediaMetadataType":
                if (Google_DriveFile.class.isAssignableFrom(caller)) {

                    this.__imageMediaMetadataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__imageMediaMetadataDataType":
                if (Google_DriveFile.class.isAssignableFrom(caller)) {

                    this.__imageMediaMetadataDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "imageMediaMetadata":
                this.imageMediaMetadata = value;
                break;
            case "embedLink":
                this.embedLink = value;
                break;
            case "alternateLink":
                this.alternateLink = value;
                break;
            case "modifiedByMeDate":
                this.modifiedByMeDate = value;
                break;
            case "downloadUrl":
                this.downloadUrl = value;
                break;
            case "__userPermissionType":
                if (Google_DriveFile.class.isAssignableFrom(caller)) {

                    this.__userPermissionType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__userPermissionDataType":
                if (Google_DriveFile.class.isAssignableFrom(caller)) {

                    this.__userPermissionDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "userPermission":
                this.userPermission = value;
                break;
            case "fileExtension":
                this.fileExtension = value;
                break;
            case "selfLink":
                this.selfLink = value;
                break;
            case "modifiedDate":
                this.modifiedDate = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setMimeType(RuntimeEnv env, Object... args) {
        Object mimeType = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DriveFile.class, "mimeType", mimeType);

        return null;
    }

    public Object getMimeType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DriveFile.class, "mimeType"));
    }

    public Object setThumbnailLink(RuntimeEnv env, Object... args) {
        Object thumbnailLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DriveFile.class, "thumbnailLink", thumbnailLink);

        return null;
    }

    public Object getThumbnailLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DriveFile.class, "thumbnailLink"));
    }

    public Object setLabels(RuntimeEnv env, Object... args) {
        Object labels = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DriveFile.class, "labels", labels);

        return null;
    }

    public Object getLabels(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DriveFile.class, "labels"));
    }

    public Object setIndexableText(RuntimeEnv env, Object... args) {
        Object indexableText = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DriveFile.class, "indexableText", indexableText);

        return null;
    }

    public Object getIndexableText(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DriveFile.class, "indexableText"));
    }

    public Object setExplicitlyTrashed(RuntimeEnv env, Object... args) {
        Object explicitlyTrashed = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DriveFile.class, "explicitlyTrashed", explicitlyTrashed);

        return null;
    }

    public Object getExplicitlyTrashed(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DriveFile.class, "explicitlyTrashed"));
    }

    public Object setEtag(RuntimeEnv env, Object... args) {
        Object etag = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DriveFile.class, "etag", etag);

        return null;
    }

    public Object getEtag(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DriveFile.class, "etag"));
    }

    public Object setLastModifyingUserName(RuntimeEnv env, Object... args) {
        Object lastModifyingUserName = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_DriveFile.class, "lastModifyingUserName", lastModifyingUserName);

        return null;
    }

    public Object getLastModifyingUserName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DriveFile.class, "lastModifyingUserName"));
    }

    public Object setWritersCanShare(RuntimeEnv env, Object... args) {
        Object writersCanShare = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DriveFile.class, "writersCanShare", writersCanShare);

        return null;
    }

    public Object getWritersCanShare(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DriveFile.class, "writersCanShare"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DriveFile.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DriveFile.class, "id"));
    }

    public Object setTitle(RuntimeEnv env, Object... args) {
        Object title = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DriveFile.class, "title", title);

        return null;
    }

    public Object getTitle(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DriveFile.class, "title"));
    }

    public Object setOwnerNames(RuntimeEnv env, Object... args) {
        Object ownerNames = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_DriveFile.class,
                ownerNames,
                "Google_string",
                "setOwnerNames");
        ZVal.setProperty(this, Google_DriveFile.class, "ownerNames", ownerNames);

        return null;
    }

    public Object getOwnerNames(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DriveFile.class, "ownerNames"));
    }

    public Object setSharedWithMeDate(RuntimeEnv env, Object... args) {
        Object sharedWithMeDate = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DriveFile.class, "sharedWithMeDate", sharedWithMeDate);

        return null;
    }

    public Object getSharedWithMeDate(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DriveFile.class, "sharedWithMeDate"));
    }

    public Object setLastViewedByMeDate(RuntimeEnv env, Object... args) {
        Object lastViewedByMeDate = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DriveFile.class, "lastViewedByMeDate", lastViewedByMeDate);

        return null;
    }

    public Object getLastViewedByMeDate(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DriveFile.class, "lastViewedByMeDate"));
    }

    public Object setParents(RuntimeEnv env, Object... args) {
        Object parents = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_DriveFile.class,
                parents,
                "Google_ParentReference",
                "setParents");
        ZVal.setProperty(this, Google_DriveFile.class, "parents", parents);

        return null;
    }

    public Object getParents(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DriveFile.class, "parents"));
    }

    public Object setExportLinks(RuntimeEnv env, Object... args) {
        Object exportLinks = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DriveFile.class, "exportLinks", exportLinks);

        return null;
    }

    public Object getExportLinks(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DriveFile.class, "exportLinks"));
    }

    public Object setOriginalFilename(RuntimeEnv env, Object... args) {
        Object originalFilename = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DriveFile.class, "originalFilename", originalFilename);

        return null;
    }

    public Object getOriginalFilename(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DriveFile.class, "originalFilename"));
    }

    public Object setDescription(RuntimeEnv env, Object... args) {
        Object description = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DriveFile.class, "description", description);

        return null;
    }

    public Object getDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DriveFile.class, "description"));
    }

    public Object setWebContentLink(RuntimeEnv env, Object... args) {
        Object webContentLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DriveFile.class, "webContentLink", webContentLink);

        return null;
    }

    public Object getWebContentLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DriveFile.class, "webContentLink"));
    }

    public Object setEditable(RuntimeEnv env, Object... args) {
        Object editable = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DriveFile.class, "editable", editable);

        return null;
    }

    public Object getEditable(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DriveFile.class, "editable"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DriveFile.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DriveFile.class, "kind"));
    }

    public Object setQuotaBytesUsed(RuntimeEnv env, Object... args) {
        Object quotaBytesUsed = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DriveFile.class, "quotaBytesUsed", quotaBytesUsed);

        return null;
    }

    public Object getQuotaBytesUsed(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DriveFile.class, "quotaBytesUsed"));
    }

    public Object setFileSize(RuntimeEnv env, Object... args) {
        Object fileSize = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DriveFile.class, "fileSize", fileSize);

        return null;
    }

    public Object getFileSize(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DriveFile.class, "fileSize"));
    }

    public Object setCreatedDate(RuntimeEnv env, Object... args) {
        Object createdDate = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DriveFile.class, "createdDate", createdDate);

        return null;
    }

    public Object getCreatedDate(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DriveFile.class, "createdDate"));
    }

    public Object setMd5Checksum(RuntimeEnv env, Object... args) {
        Object md5Checksum = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DriveFile.class, "md5Checksum", md5Checksum);

        return null;
    }

    public Object getMd5Checksum(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DriveFile.class, "md5Checksum"));
    }

    public Object setImageMediaMetadata(RuntimeEnv env, Object... args) {
        Object imageMediaMetadata = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DriveFile.class, "imageMediaMetadata", imageMediaMetadata);

        return null;
    }

    public Object getImageMediaMetadata(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DriveFile.class, "imageMediaMetadata"));
    }

    public Object setEmbedLink(RuntimeEnv env, Object... args) {
        Object embedLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DriveFile.class, "embedLink", embedLink);

        return null;
    }

    public Object getEmbedLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DriveFile.class, "embedLink"));
    }

    public Object setAlternateLink(RuntimeEnv env, Object... args) {
        Object alternateLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DriveFile.class, "alternateLink", alternateLink);

        return null;
    }

    public Object getAlternateLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DriveFile.class, "alternateLink"));
    }

    public Object setModifiedByMeDate(RuntimeEnv env, Object... args) {
        Object modifiedByMeDate = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DriveFile.class, "modifiedByMeDate", modifiedByMeDate);

        return null;
    }

    public Object getModifiedByMeDate(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DriveFile.class, "modifiedByMeDate"));
    }

    public Object setDownloadUrl(RuntimeEnv env, Object... args) {
        Object downloadUrl = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DriveFile.class, "downloadUrl", downloadUrl);

        return null;
    }

    public Object getDownloadUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DriveFile.class, "downloadUrl"));
    }

    public Object setUserPermission(RuntimeEnv env, Object... args) {
        Object userPermission = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DriveFile.class, "userPermission", userPermission);

        return null;
    }

    public Object getUserPermission(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DriveFile.class, "userPermission"));
    }

    public Object setFileExtension(RuntimeEnv env, Object... args) {
        Object fileExtension = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DriveFile.class, "fileExtension", fileExtension);

        return null;
    }

    public Object getFileExtension(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DriveFile.class, "fileExtension"));
    }

    public Object setSelfLink(RuntimeEnv env, Object... args) {
        Object selfLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DriveFile.class, "selfLink", selfLink);

        return null;
    }

    public Object getSelfLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DriveFile.class, "selfLink"));
    }

    public Object setModifiedDate(RuntimeEnv env, Object... args) {
        Object modifiedDate = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DriveFile.class, "modifiedDate", modifiedDate);

        return null;
    }

    public Object getModifiedDate(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DriveFile.class, "modifiedDate"));
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
