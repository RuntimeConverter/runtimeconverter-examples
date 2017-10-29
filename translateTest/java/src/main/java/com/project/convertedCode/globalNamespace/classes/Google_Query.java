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

 google-api-php-client/src/contrib/Google_CustomsearchService.php

*/

public class Google_Query extends Google_Model implements RuntimeFileContextInterface {

    public Object sort = null;

    public Object inputEncoding = null;

    public Object orTerms = null;

    public Object highRange = null;

    public Object cx = null;

    public Object startPage = null;

    public Object disableCnTwTranslation = null;

    public Object cr = null;

    public Object imgType = null;

    public Object gl = null;

    public Object relatedSite = null;

    public Object searchType = null;

    public Object title = null;

    public Object googleHost = null;

    public Object fileType = null;

    public Object imgDominantColor = null;

    public Object siteSearch = null;

    public Object cref = null;

    public Object dateRestrict = null;

    public Object safe = null;

    public Object outputEncoding = null;

    public Object hq = null;

    public Object searchTerms = null;

    public Object exactTerms = null;

    public Object language = null;

    public Object hl = null;

    public Object totalResults = null;

    public Object lowRange = null;

    public Object count = null;

    public Object imgSize = null;

    public Object imgColorType = null;

    public Object rights = null;

    public Object startIndex = null;

    public Object excludeTerms = null;

    public Object filter = null;

    public Object linkSite = null;

    public Object siteSearchFilter = null;

    public Google_Query(RuntimeEnv env, Object... args) {
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
            case "setSort":
                return this.setSort(env, args);
            case "getSort":
                return this.getSort(env, args);
            case "setInputEncoding":
                return this.setInputEncoding(env, args);
            case "getInputEncoding":
                return this.getInputEncoding(env, args);
            case "setOrTerms":
                return this.setOrTerms(env, args);
            case "getOrTerms":
                return this.getOrTerms(env, args);
            case "setHighRange":
                return this.setHighRange(env, args);
            case "getHighRange":
                return this.getHighRange(env, args);
            case "setCx":
                return this.setCx(env, args);
            case "getCx":
                return this.getCx(env, args);
            case "setStartPage":
                return this.setStartPage(env, args);
            case "getStartPage":
                return this.getStartPage(env, args);
            case "setDisableCnTwTranslation":
                return this.setDisableCnTwTranslation(env, args);
            case "getDisableCnTwTranslation":
                return this.getDisableCnTwTranslation(env, args);
            case "setCr":
                return this.setCr(env, args);
            case "getCr":
                return this.getCr(env, args);
            case "setImgType":
                return this.setImgType(env, args);
            case "getImgType":
                return this.getImgType(env, args);
            case "setGl":
                return this.setGl(env, args);
            case "getGl":
                return this.getGl(env, args);
            case "setRelatedSite":
                return this.setRelatedSite(env, args);
            case "getRelatedSite":
                return this.getRelatedSite(env, args);
            case "setSearchType":
                return this.setSearchType(env, args);
            case "getSearchType":
                return this.getSearchType(env, args);
            case "setTitle":
                return this.setTitle(env, args);
            case "getTitle":
                return this.getTitle(env, args);
            case "setGoogleHost":
                return this.setGoogleHost(env, args);
            case "getGoogleHost":
                return this.getGoogleHost(env, args);
            case "setFileType":
                return this.setFileType(env, args);
            case "getFileType":
                return this.getFileType(env, args);
            case "setImgDominantColor":
                return this.setImgDominantColor(env, args);
            case "getImgDominantColor":
                return this.getImgDominantColor(env, args);
            case "setSiteSearch":
                return this.setSiteSearch(env, args);
            case "getSiteSearch":
                return this.getSiteSearch(env, args);
            case "setCref":
                return this.setCref(env, args);
            case "getCref":
                return this.getCref(env, args);
            case "setDateRestrict":
                return this.setDateRestrict(env, args);
            case "getDateRestrict":
                return this.getDateRestrict(env, args);
            case "setSafe":
                return this.setSafe(env, args);
            case "getSafe":
                return this.getSafe(env, args);
            case "setOutputEncoding":
                return this.setOutputEncoding(env, args);
            case "getOutputEncoding":
                return this.getOutputEncoding(env, args);
            case "setHq":
                return this.setHq(env, args);
            case "getHq":
                return this.getHq(env, args);
            case "setSearchTerms":
                return this.setSearchTerms(env, args);
            case "getSearchTerms":
                return this.getSearchTerms(env, args);
            case "setExactTerms":
                return this.setExactTerms(env, args);
            case "getExactTerms":
                return this.getExactTerms(env, args);
            case "setLanguage":
                return this.setLanguage(env, args);
            case "getLanguage":
                return this.getLanguage(env, args);
            case "setHl":
                return this.setHl(env, args);
            case "getHl":
                return this.getHl(env, args);
            case "setTotalResults":
                return this.setTotalResults(env, args);
            case "getTotalResults":
                return this.getTotalResults(env, args);
            case "setLowRange":
                return this.setLowRange(env, args);
            case "getLowRange":
                return this.getLowRange(env, args);
            case "setCount":
                return this.setCount(env, args);
            case "getCount":
                return this.getCount(env, args);
            case "setImgSize":
                return this.setImgSize(env, args);
            case "getImgSize":
                return this.getImgSize(env, args);
            case "setImgColorType":
                return this.setImgColorType(env, args);
            case "getImgColorType":
                return this.getImgColorType(env, args);
            case "setRights":
                return this.setRights(env, args);
            case "getRights":
                return this.getRights(env, args);
            case "setStartIndex":
                return this.setStartIndex(env, args);
            case "getStartIndex":
                return this.getStartIndex(env, args);
            case "setExcludeTerms":
                return this.setExcludeTerms(env, args);
            case "getExcludeTerms":
                return this.getExcludeTerms(env, args);
            case "setFilter":
                return this.setFilter(env, args);
            case "getFilter":
                return this.getFilter(env, args);
            case "setLinkSite":
                return this.setLinkSite(env, args);
            case "getLinkSite":
                return this.getLinkSite(env, args);
            case "setSiteSearchFilter":
                return this.setSiteSearchFilter(env, args);
            case "getSiteSearchFilter":
                return this.getSiteSearchFilter(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "sort":
                return this.sort;
            case "inputEncoding":
                return this.inputEncoding;
            case "orTerms":
                return this.orTerms;
            case "highRange":
                return this.highRange;
            case "cx":
                return this.cx;
            case "startPage":
                return this.startPage;
            case "disableCnTwTranslation":
                return this.disableCnTwTranslation;
            case "cr":
                return this.cr;
            case "imgType":
                return this.imgType;
            case "gl":
                return this.gl;
            case "relatedSite":
                return this.relatedSite;
            case "searchType":
                return this.searchType;
            case "title":
                return this.title;
            case "googleHost":
                return this.googleHost;
            case "fileType":
                return this.fileType;
            case "imgDominantColor":
                return this.imgDominantColor;
            case "siteSearch":
                return this.siteSearch;
            case "cref":
                return this.cref;
            case "dateRestrict":
                return this.dateRestrict;
            case "safe":
                return this.safe;
            case "outputEncoding":
                return this.outputEncoding;
            case "hq":
                return this.hq;
            case "searchTerms":
                return this.searchTerms;
            case "exactTerms":
                return this.exactTerms;
            case "language":
                return this.language;
            case "hl":
                return this.hl;
            case "totalResults":
                return this.totalResults;
            case "lowRange":
                return this.lowRange;
            case "count":
                return this.count;
            case "imgSize":
                return this.imgSize;
            case "imgColorType":
                return this.imgColorType;
            case "rights":
                return this.rights;
            case "startIndex":
                return this.startIndex;
            case "excludeTerms":
                return this.excludeTerms;
            case "filter":
                return this.filter;
            case "linkSite":
                return this.linkSite;
            case "siteSearchFilter":
                return this.siteSearchFilter;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "sort":
                return ZVal.isNull(this.sort);
            case "inputEncoding":
                return ZVal.isNull(this.inputEncoding);
            case "orTerms":
                return ZVal.isNull(this.orTerms);
            case "highRange":
                return ZVal.isNull(this.highRange);
            case "cx":
                return ZVal.isNull(this.cx);
            case "startPage":
                return ZVal.isNull(this.startPage);
            case "disableCnTwTranslation":
                return ZVal.isNull(this.disableCnTwTranslation);
            case "cr":
                return ZVal.isNull(this.cr);
            case "imgType":
                return ZVal.isNull(this.imgType);
            case "gl":
                return ZVal.isNull(this.gl);
            case "relatedSite":
                return ZVal.isNull(this.relatedSite);
            case "searchType":
                return ZVal.isNull(this.searchType);
            case "title":
                return ZVal.isNull(this.title);
            case "googleHost":
                return ZVal.isNull(this.googleHost);
            case "fileType":
                return ZVal.isNull(this.fileType);
            case "imgDominantColor":
                return ZVal.isNull(this.imgDominantColor);
            case "siteSearch":
                return ZVal.isNull(this.siteSearch);
            case "cref":
                return ZVal.isNull(this.cref);
            case "dateRestrict":
                return ZVal.isNull(this.dateRestrict);
            case "safe":
                return ZVal.isNull(this.safe);
            case "outputEncoding":
                return ZVal.isNull(this.outputEncoding);
            case "hq":
                return ZVal.isNull(this.hq);
            case "searchTerms":
                return ZVal.isNull(this.searchTerms);
            case "exactTerms":
                return ZVal.isNull(this.exactTerms);
            case "language":
                return ZVal.isNull(this.language);
            case "hl":
                return ZVal.isNull(this.hl);
            case "totalResults":
                return ZVal.isNull(this.totalResults);
            case "lowRange":
                return ZVal.isNull(this.lowRange);
            case "count":
                return ZVal.isNull(this.count);
            case "imgSize":
                return ZVal.isNull(this.imgSize);
            case "imgColorType":
                return ZVal.isNull(this.imgColorType);
            case "rights":
                return ZVal.isNull(this.rights);
            case "startIndex":
                return ZVal.isNull(this.startIndex);
            case "excludeTerms":
                return ZVal.isNull(this.excludeTerms);
            case "filter":
                return ZVal.isNull(this.filter);
            case "linkSite":
                return ZVal.isNull(this.linkSite);
            case "siteSearchFilter":
                return ZVal.isNull(this.siteSearchFilter);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "sort":
                this.sort = value;
                break;
            case "inputEncoding":
                this.inputEncoding = value;
                break;
            case "orTerms":
                this.orTerms = value;
                break;
            case "highRange":
                this.highRange = value;
                break;
            case "cx":
                this.cx = value;
                break;
            case "startPage":
                this.startPage = value;
                break;
            case "disableCnTwTranslation":
                this.disableCnTwTranslation = value;
                break;
            case "cr":
                this.cr = value;
                break;
            case "imgType":
                this.imgType = value;
                break;
            case "gl":
                this.gl = value;
                break;
            case "relatedSite":
                this.relatedSite = value;
                break;
            case "searchType":
                this.searchType = value;
                break;
            case "title":
                this.title = value;
                break;
            case "googleHost":
                this.googleHost = value;
                break;
            case "fileType":
                this.fileType = value;
                break;
            case "imgDominantColor":
                this.imgDominantColor = value;
                break;
            case "siteSearch":
                this.siteSearch = value;
                break;
            case "cref":
                this.cref = value;
                break;
            case "dateRestrict":
                this.dateRestrict = value;
                break;
            case "safe":
                this.safe = value;
                break;
            case "outputEncoding":
                this.outputEncoding = value;
                break;
            case "hq":
                this.hq = value;
                break;
            case "searchTerms":
                this.searchTerms = value;
                break;
            case "exactTerms":
                this.exactTerms = value;
                break;
            case "language":
                this.language = value;
                break;
            case "hl":
                this.hl = value;
                break;
            case "totalResults":
                this.totalResults = value;
                break;
            case "lowRange":
                this.lowRange = value;
                break;
            case "count":
                this.count = value;
                break;
            case "imgSize":
                this.imgSize = value;
                break;
            case "imgColorType":
                this.imgColorType = value;
                break;
            case "rights":
                this.rights = value;
                break;
            case "startIndex":
                this.startIndex = value;
                break;
            case "excludeTerms":
                this.excludeTerms = value;
                break;
            case "filter":
                this.filter = value;
                break;
            case "linkSite":
                this.linkSite = value;
                break;
            case "siteSearchFilter":
                this.siteSearchFilter = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setSort(RuntimeEnv env, Object... args) {
        Object sort = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Query.class, "sort", sort);

        return null;
    }

    public Object getSort(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Query.class, "sort"));
    }

    public Object setInputEncoding(RuntimeEnv env, Object... args) {
        Object inputEncoding = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Query.class, "inputEncoding", inputEncoding);

        return null;
    }

    public Object getInputEncoding(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Query.class, "inputEncoding"));
    }

    public Object setOrTerms(RuntimeEnv env, Object... args) {
        Object orTerms = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Query.class, "orTerms", orTerms);

        return null;
    }

    public Object getOrTerms(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Query.class, "orTerms"));
    }

    public Object setHighRange(RuntimeEnv env, Object... args) {
        Object highRange = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Query.class, "highRange", highRange);

        return null;
    }

    public Object getHighRange(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Query.class, "highRange"));
    }

    public Object setCx(RuntimeEnv env, Object... args) {
        Object cx = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Query.class, "cx", cx);

        return null;
    }

    public Object getCx(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Query.class, "cx"));
    }

    public Object setStartPage(RuntimeEnv env, Object... args) {
        Object startPage = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Query.class, "startPage", startPage);

        return null;
    }

    public Object getStartPage(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Query.class, "startPage"));
    }

    public Object setDisableCnTwTranslation(RuntimeEnv env, Object... args) {
        Object disableCnTwTranslation = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_Query.class, "disableCnTwTranslation", disableCnTwTranslation);

        return null;
    }

    public Object getDisableCnTwTranslation(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Query.class, "disableCnTwTranslation"));
    }

    public Object setCr(RuntimeEnv env, Object... args) {
        Object cr = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Query.class, "cr", cr);

        return null;
    }

    public Object getCr(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Query.class, "cr"));
    }

    public Object setImgType(RuntimeEnv env, Object... args) {
        Object imgType = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Query.class, "imgType", imgType);

        return null;
    }

    public Object getImgType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Query.class, "imgType"));
    }

    public Object setGl(RuntimeEnv env, Object... args) {
        Object gl = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Query.class, "gl", gl);

        return null;
    }

    public Object getGl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Query.class, "gl"));
    }

    public Object setRelatedSite(RuntimeEnv env, Object... args) {
        Object relatedSite = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Query.class, "relatedSite", relatedSite);

        return null;
    }

    public Object getRelatedSite(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Query.class, "relatedSite"));
    }

    public Object setSearchType(RuntimeEnv env, Object... args) {
        Object searchType = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Query.class, "searchType", searchType);

        return null;
    }

    public Object getSearchType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Query.class, "searchType"));
    }

    public Object setTitle(RuntimeEnv env, Object... args) {
        Object title = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Query.class, "title", title);

        return null;
    }

    public Object getTitle(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Query.class, "title"));
    }

    public Object setGoogleHost(RuntimeEnv env, Object... args) {
        Object googleHost = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Query.class, "googleHost", googleHost);

        return null;
    }

    public Object getGoogleHost(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Query.class, "googleHost"));
    }

    public Object setFileType(RuntimeEnv env, Object... args) {
        Object fileType = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Query.class, "fileType", fileType);

        return null;
    }

    public Object getFileType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Query.class, "fileType"));
    }

    public Object setImgDominantColor(RuntimeEnv env, Object... args) {
        Object imgDominantColor = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Query.class, "imgDominantColor", imgDominantColor);

        return null;
    }

    public Object getImgDominantColor(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Query.class, "imgDominantColor"));
    }

    public Object setSiteSearch(RuntimeEnv env, Object... args) {
        Object siteSearch = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Query.class, "siteSearch", siteSearch);

        return null;
    }

    public Object getSiteSearch(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Query.class, "siteSearch"));
    }

    public Object setCref(RuntimeEnv env, Object... args) {
        Object cref = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Query.class, "cref", cref);

        return null;
    }

    public Object getCref(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Query.class, "cref"));
    }

    public Object setDateRestrict(RuntimeEnv env, Object... args) {
        Object dateRestrict = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Query.class, "dateRestrict", dateRestrict);

        return null;
    }

    public Object getDateRestrict(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Query.class, "dateRestrict"));
    }

    public Object setSafe(RuntimeEnv env, Object... args) {
        Object safe = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Query.class, "safe", safe);

        return null;
    }

    public Object getSafe(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Query.class, "safe"));
    }

    public Object setOutputEncoding(RuntimeEnv env, Object... args) {
        Object outputEncoding = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Query.class, "outputEncoding", outputEncoding);

        return null;
    }

    public Object getOutputEncoding(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Query.class, "outputEncoding"));
    }

    public Object setHq(RuntimeEnv env, Object... args) {
        Object hq = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Query.class, "hq", hq);

        return null;
    }

    public Object getHq(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Query.class, "hq"));
    }

    public Object setSearchTerms(RuntimeEnv env, Object... args) {
        Object searchTerms = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Query.class, "searchTerms", searchTerms);

        return null;
    }

    public Object getSearchTerms(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Query.class, "searchTerms"));
    }

    public Object setExactTerms(RuntimeEnv env, Object... args) {
        Object exactTerms = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Query.class, "exactTerms", exactTerms);

        return null;
    }

    public Object getExactTerms(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Query.class, "exactTerms"));
    }

    public Object setLanguage(RuntimeEnv env, Object... args) {
        Object language = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Query.class, "language", language);

        return null;
    }

    public Object getLanguage(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Query.class, "language"));
    }

    public Object setHl(RuntimeEnv env, Object... args) {
        Object hl = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Query.class, "hl", hl);

        return null;
    }

    public Object getHl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Query.class, "hl"));
    }

    public Object setTotalResults(RuntimeEnv env, Object... args) {
        Object totalResults = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Query.class, "totalResults", totalResults);

        return null;
    }

    public Object getTotalResults(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Query.class, "totalResults"));
    }

    public Object setLowRange(RuntimeEnv env, Object... args) {
        Object lowRange = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Query.class, "lowRange", lowRange);

        return null;
    }

    public Object getLowRange(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Query.class, "lowRange"));
    }

    public Object setCount(RuntimeEnv env, Object... args) {
        Object count = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Query.class, "count", count);

        return null;
    }

    public Object getCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Query.class, "count"));
    }

    public Object setImgSize(RuntimeEnv env, Object... args) {
        Object imgSize = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Query.class, "imgSize", imgSize);

        return null;
    }

    public Object getImgSize(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Query.class, "imgSize"));
    }

    public Object setImgColorType(RuntimeEnv env, Object... args) {
        Object imgColorType = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Query.class, "imgColorType", imgColorType);

        return null;
    }

    public Object getImgColorType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Query.class, "imgColorType"));
    }

    public Object setRights(RuntimeEnv env, Object... args) {
        Object rights = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Query.class, "rights", rights);

        return null;
    }

    public Object getRights(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Query.class, "rights"));
    }

    public Object setStartIndex(RuntimeEnv env, Object... args) {
        Object startIndex = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Query.class, "startIndex", startIndex);

        return null;
    }

    public Object getStartIndex(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Query.class, "startIndex"));
    }

    public Object setExcludeTerms(RuntimeEnv env, Object... args) {
        Object excludeTerms = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Query.class, "excludeTerms", excludeTerms);

        return null;
    }

    public Object getExcludeTerms(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Query.class, "excludeTerms"));
    }

    public Object setFilter(RuntimeEnv env, Object... args) {
        Object filter = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Query.class, "filter", filter);

        return null;
    }

    public Object getFilter(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Query.class, "filter"));
    }

    public Object setLinkSite(RuntimeEnv env, Object... args) {
        Object linkSite = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Query.class, "linkSite", linkSite);

        return null;
    }

    public Object getLinkSite(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Query.class, "linkSite"));
    }

    public Object setSiteSearchFilter(RuntimeEnv env, Object... args) {
        Object siteSearchFilter = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Query.class, "siteSearchFilter", siteSearchFilter);

        return null;
    }

    public Object getSiteSearchFilter(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Query.class, "siteSearchFilter"));
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
