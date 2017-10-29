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

public class Google_Revision extends Google_Model implements RuntimeFileContextInterface {

    public Object mimeType = null;

    public Object pinned = null;

    public Object kind = null;

    public Object publishedLink = null;

    public Object publishedOutsideDomain = null;

    public Object publishAuto = null;

    public Object published = null;

    public Object downloadUrl = null;

    public Object selfLink = null;

    public Object etag = null;

    public Object fileSize = null;

    public Object exportLinks = null;

    public Object lastModifyingUserName = null;

    public Object originalFilename = null;

    public Object id = null;

    public Object md5Checksum = null;

    public Object modifiedDate = null;

    public Google_Revision(RuntimeEnv env, Object... args) {
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
            case "setPinned":
                return this.setPinned(env, args);
            case "getPinned":
                return this.getPinned(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setPublishedLink":
                return this.setPublishedLink(env, args);
            case "getPublishedLink":
                return this.getPublishedLink(env, args);
            case "setPublishedOutsideDomain":
                return this.setPublishedOutsideDomain(env, args);
            case "getPublishedOutsideDomain":
                return this.getPublishedOutsideDomain(env, args);
            case "setPublishAuto":
                return this.setPublishAuto(env, args);
            case "getPublishAuto":
                return this.getPublishAuto(env, args);
            case "setPublished":
                return this.setPublished(env, args);
            case "getPublished":
                return this.getPublished(env, args);
            case "setDownloadUrl":
                return this.setDownloadUrl(env, args);
            case "getDownloadUrl":
                return this.getDownloadUrl(env, args);
            case "setSelfLink":
                return this.setSelfLink(env, args);
            case "getSelfLink":
                return this.getSelfLink(env, args);
            case "setEtag":
                return this.setEtag(env, args);
            case "getEtag":
                return this.getEtag(env, args);
            case "setFileSize":
                return this.setFileSize(env, args);
            case "getFileSize":
                return this.getFileSize(env, args);
            case "setExportLinks":
                return this.setExportLinks(env, args);
            case "getExportLinks":
                return this.getExportLinks(env, args);
            case "setLastModifyingUserName":
                return this.setLastModifyingUserName(env, args);
            case "getLastModifyingUserName":
                return this.getLastModifyingUserName(env, args);
            case "setOriginalFilename":
                return this.setOriginalFilename(env, args);
            case "getOriginalFilename":
                return this.getOriginalFilename(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setMd5Checksum":
                return this.setMd5Checksum(env, args);
            case "getMd5Checksum":
                return this.getMd5Checksum(env, args);
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
            case "pinned":
                return this.pinned;
            case "kind":
                return this.kind;
            case "publishedLink":
                return this.publishedLink;
            case "publishedOutsideDomain":
                return this.publishedOutsideDomain;
            case "publishAuto":
                return this.publishAuto;
            case "published":
                return this.published;
            case "downloadUrl":
                return this.downloadUrl;
            case "selfLink":
                return this.selfLink;
            case "etag":
                return this.etag;
            case "fileSize":
                return this.fileSize;
            case "exportLinks":
                return this.exportLinks;
            case "lastModifyingUserName":
                return this.lastModifyingUserName;
            case "originalFilename":
                return this.originalFilename;
            case "id":
                return this.id;
            case "md5Checksum":
                return this.md5Checksum;
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
            case "pinned":
                return ZVal.isNull(this.pinned);
            case "kind":
                return ZVal.isNull(this.kind);
            case "publishedLink":
                return ZVal.isNull(this.publishedLink);
            case "publishedOutsideDomain":
                return ZVal.isNull(this.publishedOutsideDomain);
            case "publishAuto":
                return ZVal.isNull(this.publishAuto);
            case "published":
                return ZVal.isNull(this.published);
            case "downloadUrl":
                return ZVal.isNull(this.downloadUrl);
            case "selfLink":
                return ZVal.isNull(this.selfLink);
            case "etag":
                return ZVal.isNull(this.etag);
            case "fileSize":
                return ZVal.isNull(this.fileSize);
            case "exportLinks":
                return ZVal.isNull(this.exportLinks);
            case "lastModifyingUserName":
                return ZVal.isNull(this.lastModifyingUserName);
            case "originalFilename":
                return ZVal.isNull(this.originalFilename);
            case "id":
                return ZVal.isNull(this.id);
            case "md5Checksum":
                return ZVal.isNull(this.md5Checksum);
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
            case "pinned":
                this.pinned = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "publishedLink":
                this.publishedLink = value;
                break;
            case "publishedOutsideDomain":
                this.publishedOutsideDomain = value;
                break;
            case "publishAuto":
                this.publishAuto = value;
                break;
            case "published":
                this.published = value;
                break;
            case "downloadUrl":
                this.downloadUrl = value;
                break;
            case "selfLink":
                this.selfLink = value;
                break;
            case "etag":
                this.etag = value;
                break;
            case "fileSize":
                this.fileSize = value;
                break;
            case "exportLinks":
                this.exportLinks = value;
                break;
            case "lastModifyingUserName":
                this.lastModifyingUserName = value;
                break;
            case "originalFilename":
                this.originalFilename = value;
                break;
            case "id":
                this.id = value;
                break;
            case "md5Checksum":
                this.md5Checksum = value;
                break;
            case "modifiedDate":
                this.modifiedDate = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setMimeType(RuntimeEnv env, Object... args) {
        Object mimeType = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Revision.class, "mimeType", mimeType);

        return null;
    }

    public Object getMimeType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Revision.class, "mimeType"));
    }

    public Object setPinned(RuntimeEnv env, Object... args) {
        Object pinned = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Revision.class, "pinned", pinned);

        return null;
    }

    public Object getPinned(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Revision.class, "pinned"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Revision.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Revision.class, "kind"));
    }

    public Object setPublishedLink(RuntimeEnv env, Object... args) {
        Object publishedLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Revision.class, "publishedLink", publishedLink);

        return null;
    }

    public Object getPublishedLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Revision.class, "publishedLink"));
    }

    public Object setPublishedOutsideDomain(RuntimeEnv env, Object... args) {
        Object publishedOutsideDomain = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_Revision.class, "publishedOutsideDomain", publishedOutsideDomain);

        return null;
    }

    public Object getPublishedOutsideDomain(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Revision.class, "publishedOutsideDomain"));
    }

    public Object setPublishAuto(RuntimeEnv env, Object... args) {
        Object publishAuto = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Revision.class, "publishAuto", publishAuto);

        return null;
    }

    public Object getPublishAuto(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Revision.class, "publishAuto"));
    }

    public Object setPublished(RuntimeEnv env, Object... args) {
        Object published = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Revision.class, "published", published);

        return null;
    }

    public Object getPublished(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Revision.class, "published"));
    }

    public Object setDownloadUrl(RuntimeEnv env, Object... args) {
        Object downloadUrl = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Revision.class, "downloadUrl", downloadUrl);

        return null;
    }

    public Object getDownloadUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Revision.class, "downloadUrl"));
    }

    public Object setSelfLink(RuntimeEnv env, Object... args) {
        Object selfLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Revision.class, "selfLink", selfLink);

        return null;
    }

    public Object getSelfLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Revision.class, "selfLink"));
    }

    public Object setEtag(RuntimeEnv env, Object... args) {
        Object etag = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Revision.class, "etag", etag);

        return null;
    }

    public Object getEtag(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Revision.class, "etag"));
    }

    public Object setFileSize(RuntimeEnv env, Object... args) {
        Object fileSize = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Revision.class, "fileSize", fileSize);

        return null;
    }

    public Object getFileSize(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Revision.class, "fileSize"));
    }

    public Object setExportLinks(RuntimeEnv env, Object... args) {
        Object exportLinks = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Revision.class, "exportLinks", exportLinks);

        return null;
    }

    public Object getExportLinks(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Revision.class, "exportLinks"));
    }

    public Object setLastModifyingUserName(RuntimeEnv env, Object... args) {
        Object lastModifyingUserName = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_Revision.class, "lastModifyingUserName", lastModifyingUserName);

        return null;
    }

    public Object getLastModifyingUserName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Revision.class, "lastModifyingUserName"));
    }

    public Object setOriginalFilename(RuntimeEnv env, Object... args) {
        Object originalFilename = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Revision.class, "originalFilename", originalFilename);

        return null;
    }

    public Object getOriginalFilename(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Revision.class, "originalFilename"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Revision.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Revision.class, "id"));
    }

    public Object setMd5Checksum(RuntimeEnv env, Object... args) {
        Object md5Checksum = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Revision.class, "md5Checksum", md5Checksum);

        return null;
    }

    public Object getMd5Checksum(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Revision.class, "md5Checksum"));
    }

    public Object setModifiedDate(RuntimeEnv env, Object... args) {
        Object modifiedDate = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Revision.class, "modifiedDate", modifiedDate);

        return null;
    }

    public Object getModifiedDate(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Revision.class, "modifiedDate"));
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
