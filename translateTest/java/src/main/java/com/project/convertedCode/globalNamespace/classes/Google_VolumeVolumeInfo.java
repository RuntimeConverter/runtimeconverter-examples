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

public class Google_VolumeVolumeInfo extends Google_Model implements RuntimeFileContextInterface {

    public Object publisher = null;

    public Object subtitle = null;

    public Object description = null;

    public Object language = null;

    public Object pageCount = null;

    public Object __imageLinksType = "Google_VolumeVolumeInfoImageLinks";

    public Object __imageLinksDataType = "";

    public Object imageLinks = null;

    public Object publishedDate = null;

    public Object previewLink = null;

    public Object printType = null;

    public Object ratingsCount = null;

    public Object mainCategory = null;

    public Object __dimensionsType = "Google_VolumeVolumeInfoDimensions";

    public Object __dimensionsDataType = "";

    public Object dimensions = null;

    public Object contentVersion = null;

    public Object __industryIdentifiersType = "Google_VolumeVolumeInfoIndustryIdentifiers";

    public Object __industryIdentifiersDataType = "array";

    public Object industryIdentifiers = null;

    public Object authors = null;

    public Object title = null;

    public Object canonicalVolumeLink = null;

    public Object infoLink = null;

    public Object categories = null;

    public Object averageRating = null;

    public Google_VolumeVolumeInfo(RuntimeEnv env, Object... args) {
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
            case "setPublisher":
                return this.setPublisher(env, args);
            case "getPublisher":
                return this.getPublisher(env, args);
            case "setSubtitle":
                return this.setSubtitle(env, args);
            case "getSubtitle":
                return this.getSubtitle(env, args);
            case "setDescription":
                return this.setDescription(env, args);
            case "getDescription":
                return this.getDescription(env, args);
            case "setLanguage":
                return this.setLanguage(env, args);
            case "getLanguage":
                return this.getLanguage(env, args);
            case "setPageCount":
                return this.setPageCount(env, args);
            case "getPageCount":
                return this.getPageCount(env, args);
            case "setImageLinks":
                return this.setImageLinks(env, args);
            case "getImageLinks":
                return this.getImageLinks(env, args);
            case "setPublishedDate":
                return this.setPublishedDate(env, args);
            case "getPublishedDate":
                return this.getPublishedDate(env, args);
            case "setPreviewLink":
                return this.setPreviewLink(env, args);
            case "getPreviewLink":
                return this.getPreviewLink(env, args);
            case "setPrintType":
                return this.setPrintType(env, args);
            case "getPrintType":
                return this.getPrintType(env, args);
            case "setRatingsCount":
                return this.setRatingsCount(env, args);
            case "getRatingsCount":
                return this.getRatingsCount(env, args);
            case "setMainCategory":
                return this.setMainCategory(env, args);
            case "getMainCategory":
                return this.getMainCategory(env, args);
            case "setDimensions":
                return this.setDimensions(env, args);
            case "getDimensions":
                return this.getDimensions(env, args);
            case "setContentVersion":
                return this.setContentVersion(env, args);
            case "getContentVersion":
                return this.getContentVersion(env, args);
            case "setIndustryIdentifiers":
                return this.setIndustryIdentifiers(env, args);
            case "getIndustryIdentifiers":
                return this.getIndustryIdentifiers(env, args);
            case "setAuthors":
                return this.setAuthors(env, args);
            case "getAuthors":
                return this.getAuthors(env, args);
            case "setTitle":
                return this.setTitle(env, args);
            case "getTitle":
                return this.getTitle(env, args);
            case "setCanonicalVolumeLink":
                return this.setCanonicalVolumeLink(env, args);
            case "getCanonicalVolumeLink":
                return this.getCanonicalVolumeLink(env, args);
            case "setInfoLink":
                return this.setInfoLink(env, args);
            case "getInfoLink":
                return this.getInfoLink(env, args);
            case "setCategories":
                return this.setCategories(env, args);
            case "getCategories":
                return this.getCategories(env, args);
            case "setAverageRating":
                return this.setAverageRating(env, args);
            case "getAverageRating":
                return this.getAverageRating(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "publisher":
                return this.publisher;
            case "subtitle":
                return this.subtitle;
            case "description":
                return this.description;
            case "language":
                return this.language;
            case "pageCount":
                return this.pageCount;
            case "__imageLinksType":
                if (Google_VolumeVolumeInfo.class.isAssignableFrom(caller)) {

                    return this.__imageLinksType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__imageLinksDataType":
                if (Google_VolumeVolumeInfo.class.isAssignableFrom(caller)) {

                    return this.__imageLinksDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "imageLinks":
                return this.imageLinks;
            case "publishedDate":
                return this.publishedDate;
            case "previewLink":
                return this.previewLink;
            case "printType":
                return this.printType;
            case "ratingsCount":
                return this.ratingsCount;
            case "mainCategory":
                return this.mainCategory;
            case "__dimensionsType":
                if (Google_VolumeVolumeInfo.class.isAssignableFrom(caller)) {

                    return this.__dimensionsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__dimensionsDataType":
                if (Google_VolumeVolumeInfo.class.isAssignableFrom(caller)) {

                    return this.__dimensionsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "dimensions":
                return this.dimensions;
            case "contentVersion":
                return this.contentVersion;
            case "__industryIdentifiersType":
                if (Google_VolumeVolumeInfo.class.isAssignableFrom(caller)) {

                    return this.__industryIdentifiersType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__industryIdentifiersDataType":
                if (Google_VolumeVolumeInfo.class.isAssignableFrom(caller)) {

                    return this.__industryIdentifiersDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "industryIdentifiers":
                return this.industryIdentifiers;
            case "authors":
                return this.authors;
            case "title":
                return this.title;
            case "canonicalVolumeLink":
                return this.canonicalVolumeLink;
            case "infoLink":
                return this.infoLink;
            case "categories":
                return this.categories;
            case "averageRating":
                return this.averageRating;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "publisher":
                return ZVal.isNull(this.publisher);
            case "subtitle":
                return ZVal.isNull(this.subtitle);
            case "description":
                return ZVal.isNull(this.description);
            case "language":
                return ZVal.isNull(this.language);
            case "pageCount":
                return ZVal.isNull(this.pageCount);
            case "__imageLinksType":
                if (Google_VolumeVolumeInfo.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__imageLinksType);
                }
                break;
            case "__imageLinksDataType":
                if (Google_VolumeVolumeInfo.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__imageLinksDataType);
                }
                break;
            case "imageLinks":
                return ZVal.isNull(this.imageLinks);
            case "publishedDate":
                return ZVal.isNull(this.publishedDate);
            case "previewLink":
                return ZVal.isNull(this.previewLink);
            case "printType":
                return ZVal.isNull(this.printType);
            case "ratingsCount":
                return ZVal.isNull(this.ratingsCount);
            case "mainCategory":
                return ZVal.isNull(this.mainCategory);
            case "__dimensionsType":
                if (Google_VolumeVolumeInfo.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__dimensionsType);
                }
                break;
            case "__dimensionsDataType":
                if (Google_VolumeVolumeInfo.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__dimensionsDataType);
                }
                break;
            case "dimensions":
                return ZVal.isNull(this.dimensions);
            case "contentVersion":
                return ZVal.isNull(this.contentVersion);
            case "__industryIdentifiersType":
                if (Google_VolumeVolumeInfo.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__industryIdentifiersType);
                }
                break;
            case "__industryIdentifiersDataType":
                if (Google_VolumeVolumeInfo.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__industryIdentifiersDataType);
                }
                break;
            case "industryIdentifiers":
                return ZVal.isNull(this.industryIdentifiers);
            case "authors":
                return ZVal.isNull(this.authors);
            case "title":
                return ZVal.isNull(this.title);
            case "canonicalVolumeLink":
                return ZVal.isNull(this.canonicalVolumeLink);
            case "infoLink":
                return ZVal.isNull(this.infoLink);
            case "categories":
                return ZVal.isNull(this.categories);
            case "averageRating":
                return ZVal.isNull(this.averageRating);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "publisher":
                this.publisher = value;
                break;
            case "subtitle":
                this.subtitle = value;
                break;
            case "description":
                this.description = value;
                break;
            case "language":
                this.language = value;
                break;
            case "pageCount":
                this.pageCount = value;
                break;
            case "__imageLinksType":
                if (Google_VolumeVolumeInfo.class.isAssignableFrom(caller)) {

                    this.__imageLinksType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__imageLinksDataType":
                if (Google_VolumeVolumeInfo.class.isAssignableFrom(caller)) {

                    this.__imageLinksDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "imageLinks":
                this.imageLinks = value;
                break;
            case "publishedDate":
                this.publishedDate = value;
                break;
            case "previewLink":
                this.previewLink = value;
                break;
            case "printType":
                this.printType = value;
                break;
            case "ratingsCount":
                this.ratingsCount = value;
                break;
            case "mainCategory":
                this.mainCategory = value;
                break;
            case "__dimensionsType":
                if (Google_VolumeVolumeInfo.class.isAssignableFrom(caller)) {

                    this.__dimensionsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__dimensionsDataType":
                if (Google_VolumeVolumeInfo.class.isAssignableFrom(caller)) {

                    this.__dimensionsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "dimensions":
                this.dimensions = value;
                break;
            case "contentVersion":
                this.contentVersion = value;
                break;
            case "__industryIdentifiersType":
                if (Google_VolumeVolumeInfo.class.isAssignableFrom(caller)) {

                    this.__industryIdentifiersType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__industryIdentifiersDataType":
                if (Google_VolumeVolumeInfo.class.isAssignableFrom(caller)) {

                    this.__industryIdentifiersDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "industryIdentifiers":
                this.industryIdentifiers = value;
                break;
            case "authors":
                this.authors = value;
                break;
            case "title":
                this.title = value;
                break;
            case "canonicalVolumeLink":
                this.canonicalVolumeLink = value;
                break;
            case "infoLink":
                this.infoLink = value;
                break;
            case "categories":
                this.categories = value;
                break;
            case "averageRating":
                this.averageRating = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setPublisher(RuntimeEnv env, Object... args) {
        Object publisher = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeVolumeInfo.class, "publisher", publisher);

        return null;
    }

    public Object getPublisher(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeVolumeInfo.class, "publisher"));
    }

    public Object setSubtitle(RuntimeEnv env, Object... args) {
        Object subtitle = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeVolumeInfo.class, "subtitle", subtitle);

        return null;
    }

    public Object getSubtitle(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeVolumeInfo.class, "subtitle"));
    }

    public Object setDescription(RuntimeEnv env, Object... args) {
        Object description = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeVolumeInfo.class, "description", description);

        return null;
    }

    public Object getDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeVolumeInfo.class, "description"));
    }

    public Object setLanguage(RuntimeEnv env, Object... args) {
        Object language = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeVolumeInfo.class, "language", language);

        return null;
    }

    public Object getLanguage(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeVolumeInfo.class, "language"));
    }

    public Object setPageCount(RuntimeEnv env, Object... args) {
        Object pageCount = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeVolumeInfo.class, "pageCount", pageCount);

        return null;
    }

    public Object getPageCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeVolumeInfo.class, "pageCount"));
    }

    public Object setImageLinks(RuntimeEnv env, Object... args) {
        Object imageLinks = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeVolumeInfo.class, "imageLinks", imageLinks);

        return null;
    }

    public Object getImageLinks(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeVolumeInfo.class, "imageLinks"));
    }

    public Object setPublishedDate(RuntimeEnv env, Object... args) {
        Object publishedDate = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeVolumeInfo.class, "publishedDate", publishedDate);

        return null;
    }

    public Object getPublishedDate(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeVolumeInfo.class, "publishedDate"));
    }

    public Object setPreviewLink(RuntimeEnv env, Object... args) {
        Object previewLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeVolumeInfo.class, "previewLink", previewLink);

        return null;
    }

    public Object getPreviewLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeVolumeInfo.class, "previewLink"));
    }

    public Object setPrintType(RuntimeEnv env, Object... args) {
        Object printType = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeVolumeInfo.class, "printType", printType);

        return null;
    }

    public Object getPrintType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeVolumeInfo.class, "printType"));
    }

    public Object setRatingsCount(RuntimeEnv env, Object... args) {
        Object ratingsCount = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeVolumeInfo.class, "ratingsCount", ratingsCount);

        return null;
    }

    public Object getRatingsCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeVolumeInfo.class, "ratingsCount"));
    }

    public Object setMainCategory(RuntimeEnv env, Object... args) {
        Object mainCategory = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeVolumeInfo.class, "mainCategory", mainCategory);

        return null;
    }

    public Object getMainCategory(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeVolumeInfo.class, "mainCategory"));
    }

    public Object setDimensions(RuntimeEnv env, Object... args) {
        Object dimensions = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeVolumeInfo.class, "dimensions", dimensions);

        return null;
    }

    public Object getDimensions(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeVolumeInfo.class, "dimensions"));
    }

    public Object setContentVersion(RuntimeEnv env, Object... args) {
        Object contentVersion = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeVolumeInfo.class, "contentVersion", contentVersion);

        return null;
    }

    public Object getContentVersion(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeVolumeInfo.class, "contentVersion"));
    }

    public Object setIndustryIdentifiers(RuntimeEnv env, Object... args) {
        Object industryIdentifiers = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_VolumeVolumeInfo.class,
                industryIdentifiers,
                "Google_VolumeVolumeInfoIndustryIdentifiers",
                "setIndustryIdentifiers");
        ZVal.setProperty(
                this, Google_VolumeVolumeInfo.class, "industryIdentifiers", industryIdentifiers);

        return null;
    }

    public Object getIndustryIdentifiers(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_VolumeVolumeInfo.class, "industryIdentifiers"));
    }

    public Object setAuthors(RuntimeEnv env, Object... args) {
        Object authors = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_VolumeVolumeInfo.class,
                authors,
                "Google_string",
                "setAuthors");
        ZVal.setProperty(this, Google_VolumeVolumeInfo.class, "authors", authors);

        return null;
    }

    public Object getAuthors(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeVolumeInfo.class, "authors"));
    }

    public Object setTitle(RuntimeEnv env, Object... args) {
        Object title = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeVolumeInfo.class, "title", title);

        return null;
    }

    public Object getTitle(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeVolumeInfo.class, "title"));
    }

    public Object setCanonicalVolumeLink(RuntimeEnv env, Object... args) {
        Object canonicalVolumeLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_VolumeVolumeInfo.class, "canonicalVolumeLink", canonicalVolumeLink);

        return null;
    }

    public Object getCanonicalVolumeLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_VolumeVolumeInfo.class, "canonicalVolumeLink"));
    }

    public Object setInfoLink(RuntimeEnv env, Object... args) {
        Object infoLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeVolumeInfo.class, "infoLink", infoLink);

        return null;
    }

    public Object getInfoLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeVolumeInfo.class, "infoLink"));
    }

    public Object setCategories(RuntimeEnv env, Object... args) {
        Object categories = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_VolumeVolumeInfo.class,
                categories,
                "Google_string",
                "setCategories");
        ZVal.setProperty(this, Google_VolumeVolumeInfo.class, "categories", categories);

        return null;
    }

    public Object getCategories(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeVolumeInfo.class, "categories"));
    }

    public Object setAverageRating(RuntimeEnv env, Object... args) {
        Object averageRating = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeVolumeInfo.class, "averageRating", averageRating);

        return null;
    }

    public Object getAverageRating(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VolumeVolumeInfo.class, "averageRating"));
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
