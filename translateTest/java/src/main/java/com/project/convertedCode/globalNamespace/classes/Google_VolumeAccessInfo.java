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

public class Google_VolumeAccessInfo extends Google_Model implements RuntimeFileContextInterface {

    public Object webReaderLink = null;

    public Object publicDomain = null;

    public Object embeddable = null;

    public Object __downloadAccessType = "Google_DownloadAccessRestriction";

    public Object __downloadAccessDataType = "";

    public Object downloadAccess = null;

    public Object country = null;

    public Object viewOrderUrl = null;

    public Object textToSpeechPermission = null;

    public Object __pdfType = "Google_VolumeAccessInfoPdf";

    public Object __pdfDataType = "";

    public Object pdf = null;

    public Object viewability = null;

    public Object __epubType = "Google_VolumeAccessInfoEpub";

    public Object __epubDataType = "";

    public Object epub = null;

    public Object accessViewStatus = null;

    public Google_VolumeAccessInfo(RuntimeEnv env, Object... args) {
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
            case "setWebReaderLink":
                return this.setWebReaderLink(env, args);
            case "getWebReaderLink":
                return this.getWebReaderLink(env, args);
            case "setPublicDomain":
                return this.setPublicDomain(env, args);
            case "getPublicDomain":
                return this.getPublicDomain(env, args);
            case "setEmbeddable":
                return this.setEmbeddable(env, args);
            case "getEmbeddable":
                return this.getEmbeddable(env, args);
            case "setDownloadAccess":
                return this.setDownloadAccess(env, args);
            case "getDownloadAccess":
                return this.getDownloadAccess(env, args);
            case "setCountry":
                return this.setCountry(env, args);
            case "getCountry":
                return this.getCountry(env, args);
            case "setViewOrderUrl":
                return this.setViewOrderUrl(env, args);
            case "getViewOrderUrl":
                return this.getViewOrderUrl(env, args);
            case "setTextToSpeechPermission":
                return this.setTextToSpeechPermission(env, args);
            case "getTextToSpeechPermission":
                return this.getTextToSpeechPermission(env, args);
            case "setPdf":
                return this.setPdf(env, args);
            case "getPdf":
                return this.getPdf(env, args);
            case "setViewability":
                return this.setViewability(env, args);
            case "getViewability":
                return this.getViewability(env, args);
            case "setEpub":
                return this.setEpub(env, args);
            case "getEpub":
                return this.getEpub(env, args);
            case "setAccessViewStatus":
                return this.setAccessViewStatus(env, args);
            case "getAccessViewStatus":
                return this.getAccessViewStatus(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "webReaderLink":
                return this.webReaderLink;
            case "publicDomain":
                return this.publicDomain;
            case "embeddable":
                return this.embeddable;
            case "__downloadAccessType":
                if (Google_VolumeAccessInfo.class.isAssignableFrom(caller)) {

                    return this.__downloadAccessType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__downloadAccessDataType":
                if (Google_VolumeAccessInfo.class.isAssignableFrom(caller)) {

                    return this.__downloadAccessDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "downloadAccess":
                return this.downloadAccess;
            case "country":
                return this.country;
            case "viewOrderUrl":
                return this.viewOrderUrl;
            case "textToSpeechPermission":
                return this.textToSpeechPermission;
            case "__pdfType":
                if (Google_VolumeAccessInfo.class.isAssignableFrom(caller)) {

                    return this.__pdfType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__pdfDataType":
                if (Google_VolumeAccessInfo.class.isAssignableFrom(caller)) {

                    return this.__pdfDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "pdf":
                return this.pdf;
            case "viewability":
                return this.viewability;
            case "__epubType":
                if (Google_VolumeAccessInfo.class.isAssignableFrom(caller)) {

                    return this.__epubType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__epubDataType":
                if (Google_VolumeAccessInfo.class.isAssignableFrom(caller)) {

                    return this.__epubDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "epub":
                return this.epub;
            case "accessViewStatus":
                return this.accessViewStatus;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "webReaderLink":
                return ZVal.isNull(this.webReaderLink);
            case "publicDomain":
                return ZVal.isNull(this.publicDomain);
            case "embeddable":
                return ZVal.isNull(this.embeddable);
            case "__downloadAccessType":
                if (Google_VolumeAccessInfo.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__downloadAccessType);
                }
                break;
            case "__downloadAccessDataType":
                if (Google_VolumeAccessInfo.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__downloadAccessDataType);
                }
                break;
            case "downloadAccess":
                return ZVal.isNull(this.downloadAccess);
            case "country":
                return ZVal.isNull(this.country);
            case "viewOrderUrl":
                return ZVal.isNull(this.viewOrderUrl);
            case "textToSpeechPermission":
                return ZVal.isNull(this.textToSpeechPermission);
            case "__pdfType":
                if (Google_VolumeAccessInfo.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__pdfType);
                }
                break;
            case "__pdfDataType":
                if (Google_VolumeAccessInfo.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__pdfDataType);
                }
                break;
            case "pdf":
                return ZVal.isNull(this.pdf);
            case "viewability":
                return ZVal.isNull(this.viewability);
            case "__epubType":
                if (Google_VolumeAccessInfo.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__epubType);
                }
                break;
            case "__epubDataType":
                if (Google_VolumeAccessInfo.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__epubDataType);
                }
                break;
            case "epub":
                return ZVal.isNull(this.epub);
            case "accessViewStatus":
                return ZVal.isNull(this.accessViewStatus);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "webReaderLink":
                this.webReaderLink = value;
                break;
            case "publicDomain":
                this.publicDomain = value;
                break;
            case "embeddable":
                this.embeddable = value;
                break;
            case "__downloadAccessType":
                if (Google_VolumeAccessInfo.class.isAssignableFrom(caller)) {

                    this.__downloadAccessType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__downloadAccessDataType":
                if (Google_VolumeAccessInfo.class.isAssignableFrom(caller)) {

                    this.__downloadAccessDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "downloadAccess":
                this.downloadAccess = value;
                break;
            case "country":
                this.country = value;
                break;
            case "viewOrderUrl":
                this.viewOrderUrl = value;
                break;
            case "textToSpeechPermission":
                this.textToSpeechPermission = value;
                break;
            case "__pdfType":
                if (Google_VolumeAccessInfo.class.isAssignableFrom(caller)) {

                    this.__pdfType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__pdfDataType":
                if (Google_VolumeAccessInfo.class.isAssignableFrom(caller)) {

                    this.__pdfDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "pdf":
                this.pdf = value;
                break;
            case "viewability":
                this.viewability = value;
                break;
            case "__epubType":
                if (Google_VolumeAccessInfo.class.isAssignableFrom(caller)) {

                    this.__epubType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__epubDataType":
                if (Google_VolumeAccessInfo.class.isAssignableFrom(caller)) {

                    this.__epubDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "epub":
                this.epub = value;
                break;
            case "accessViewStatus":
                this.accessViewStatus = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setWebReaderLink(RuntimeEnv env, Object... args) {
        Object webReaderLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeAccessInfo.class, "webReaderLink", webReaderLink);

        return null;
    }

    public Object getWebReaderLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeAccessInfo.class, "webReaderLink"));
    }

    public Object setPublicDomain(RuntimeEnv env, Object... args) {
        Object publicDomain = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeAccessInfo.class, "publicDomain", publicDomain);

        return null;
    }

    public Object getPublicDomain(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeAccessInfo.class, "publicDomain"));
    }

    public Object setEmbeddable(RuntimeEnv env, Object... args) {
        Object embeddable = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeAccessInfo.class, "embeddable", embeddable);

        return null;
    }

    public Object getEmbeddable(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeAccessInfo.class, "embeddable"));
    }

    public Object setDownloadAccess(RuntimeEnv env, Object... args) {
        Object downloadAccess = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeAccessInfo.class, "downloadAccess", downloadAccess);

        return null;
    }

    public Object getDownloadAccess(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeAccessInfo.class, "downloadAccess"));
    }

    public Object setCountry(RuntimeEnv env, Object... args) {
        Object country = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeAccessInfo.class, "country", country);

        return null;
    }

    public Object getCountry(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeAccessInfo.class, "country"));
    }

    public Object setViewOrderUrl(RuntimeEnv env, Object... args) {
        Object viewOrderUrl = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeAccessInfo.class, "viewOrderUrl", viewOrderUrl);

        return null;
    }

    public Object getViewOrderUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeAccessInfo.class, "viewOrderUrl"));
    }

    public Object setTextToSpeechPermission(RuntimeEnv env, Object... args) {
        Object textToSpeechPermission = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_VolumeAccessInfo.class,
                "textToSpeechPermission",
                textToSpeechPermission);

        return null;
    }

    public Object getTextToSpeechPermission(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_VolumeAccessInfo.class, "textToSpeechPermission"));
    }

    public Object setPdf(RuntimeEnv env, Object... args) {
        Object pdf = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeAccessInfo.class, "pdf", pdf);

        return null;
    }

    public Object getPdf(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeAccessInfo.class, "pdf"));
    }

    public Object setViewability(RuntimeEnv env, Object... args) {
        Object viewability = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeAccessInfo.class, "viewability", viewability);

        return null;
    }

    public Object getViewability(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeAccessInfo.class, "viewability"));
    }

    public Object setEpub(RuntimeEnv env, Object... args) {
        Object epub = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeAccessInfo.class, "epub", epub);

        return null;
    }

    public Object getEpub(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeAccessInfo.class, "epub"));
    }

    public Object setAccessViewStatus(RuntimeEnv env, Object... args) {
        Object accessViewStatus = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeAccessInfo.class, "accessViewStatus", accessViewStatus);

        return null;
    }

    public Object getAccessViewStatus(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_VolumeAccessInfo.class, "accessViewStatus"));
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
