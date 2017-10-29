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

 google-api-php-client/src/contrib/Google_AnalyticsService.php

*/

public class Google_GaData extends Google_Model implements RuntimeFileContextInterface {

    public Object kind = null;

    public Object rows = null;

    public Object containsSampledData = null;

    public Object totalResults = null;

    public Object itemsPerPage = null;

    public Object totalsForAllResults = null;

    public Object nextLink = null;

    public Object id = null;

    public Object __queryType = "Google_GaDataQuery";

    public Object __queryDataType = "";

    public Object query = null;

    public Object previousLink = null;

    public Object __profileInfoType = "Google_GaDataProfileInfo";

    public Object __profileInfoDataType = "";

    public Object profileInfo = null;

    public Object __columnHeadersType = "Google_GaDataColumnHeaders";

    public Object __columnHeadersDataType = "array";

    public Object columnHeaders = null;

    public Object selfLink = null;

    public Google_GaData(RuntimeEnv env, Object... args) {
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
            case "setRows":
                return this.setRows(env, args);
            case "getRows":
                return this.getRows(env, args);
            case "setContainsSampledData":
                return this.setContainsSampledData(env, args);
            case "getContainsSampledData":
                return this.getContainsSampledData(env, args);
            case "setTotalResults":
                return this.setTotalResults(env, args);
            case "getTotalResults":
                return this.getTotalResults(env, args);
            case "setItemsPerPage":
                return this.setItemsPerPage(env, args);
            case "getItemsPerPage":
                return this.getItemsPerPage(env, args);
            case "setTotalsForAllResults":
                return this.setTotalsForAllResults(env, args);
            case "getTotalsForAllResults":
                return this.getTotalsForAllResults(env, args);
            case "setNextLink":
                return this.setNextLink(env, args);
            case "getNextLink":
                return this.getNextLink(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setQuery":
                return this.setQuery(env, args);
            case "getQuery":
                return this.getQuery(env, args);
            case "setPreviousLink":
                return this.setPreviousLink(env, args);
            case "getPreviousLink":
                return this.getPreviousLink(env, args);
            case "setProfileInfo":
                return this.setProfileInfo(env, args);
            case "getProfileInfo":
                return this.getProfileInfo(env, args);
            case "setColumnHeaders":
                return this.setColumnHeaders(env, args);
            case "getColumnHeaders":
                return this.getColumnHeaders(env, args);
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
            case "rows":
                return this.rows;
            case "containsSampledData":
                return this.containsSampledData;
            case "totalResults":
                return this.totalResults;
            case "itemsPerPage":
                return this.itemsPerPage;
            case "totalsForAllResults":
                return this.totalsForAllResults;
            case "nextLink":
                return this.nextLink;
            case "id":
                return this.id;
            case "__queryType":
                if (Google_GaData.class.isAssignableFrom(caller)) {

                    return this.__queryType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__queryDataType":
                if (Google_GaData.class.isAssignableFrom(caller)) {

                    return this.__queryDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "query":
                return this.query;
            case "previousLink":
                return this.previousLink;
            case "__profileInfoType":
                if (Google_GaData.class.isAssignableFrom(caller)) {

                    return this.__profileInfoType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__profileInfoDataType":
                if (Google_GaData.class.isAssignableFrom(caller)) {

                    return this.__profileInfoDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "profileInfo":
                return this.profileInfo;
            case "__columnHeadersType":
                if (Google_GaData.class.isAssignableFrom(caller)) {

                    return this.__columnHeadersType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__columnHeadersDataType":
                if (Google_GaData.class.isAssignableFrom(caller)) {

                    return this.__columnHeadersDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "columnHeaders":
                return this.columnHeaders;
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
            case "rows":
                return ZVal.isNull(this.rows);
            case "containsSampledData":
                return ZVal.isNull(this.containsSampledData);
            case "totalResults":
                return ZVal.isNull(this.totalResults);
            case "itemsPerPage":
                return ZVal.isNull(this.itemsPerPage);
            case "totalsForAllResults":
                return ZVal.isNull(this.totalsForAllResults);
            case "nextLink":
                return ZVal.isNull(this.nextLink);
            case "id":
                return ZVal.isNull(this.id);
            case "__queryType":
                if (Google_GaData.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__queryType);
                }
                break;
            case "__queryDataType":
                if (Google_GaData.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__queryDataType);
                }
                break;
            case "query":
                return ZVal.isNull(this.query);
            case "previousLink":
                return ZVal.isNull(this.previousLink);
            case "__profileInfoType":
                if (Google_GaData.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__profileInfoType);
                }
                break;
            case "__profileInfoDataType":
                if (Google_GaData.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__profileInfoDataType);
                }
                break;
            case "profileInfo":
                return ZVal.isNull(this.profileInfo);
            case "__columnHeadersType":
                if (Google_GaData.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__columnHeadersType);
                }
                break;
            case "__columnHeadersDataType":
                if (Google_GaData.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__columnHeadersDataType);
                }
                break;
            case "columnHeaders":
                return ZVal.isNull(this.columnHeaders);
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
            case "rows":
                this.rows = value;
                break;
            case "containsSampledData":
                this.containsSampledData = value;
                break;
            case "totalResults":
                this.totalResults = value;
                break;
            case "itemsPerPage":
                this.itemsPerPage = value;
                break;
            case "totalsForAllResults":
                this.totalsForAllResults = value;
                break;
            case "nextLink":
                this.nextLink = value;
                break;
            case "id":
                this.id = value;
                break;
            case "__queryType":
                if (Google_GaData.class.isAssignableFrom(caller)) {

                    this.__queryType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__queryDataType":
                if (Google_GaData.class.isAssignableFrom(caller)) {

                    this.__queryDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "query":
                this.query = value;
                break;
            case "previousLink":
                this.previousLink = value;
                break;
            case "__profileInfoType":
                if (Google_GaData.class.isAssignableFrom(caller)) {

                    this.__profileInfoType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__profileInfoDataType":
                if (Google_GaData.class.isAssignableFrom(caller)) {

                    this.__profileInfoDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "profileInfo":
                this.profileInfo = value;
                break;
            case "__columnHeadersType":
                if (Google_GaData.class.isAssignableFrom(caller)) {

                    this.__columnHeadersType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__columnHeadersDataType":
                if (Google_GaData.class.isAssignableFrom(caller)) {

                    this.__columnHeadersDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "columnHeaders":
                this.columnHeaders = value;
                break;
            case "selfLink":
                this.selfLink = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_GaData.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_GaData.class, "kind"));
    }

    public Object setRows(RuntimeEnv env, Object... args) {
        Object rows = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this, "assertIsArray", Google_GaData.class, rows, "Google_string", "setRows");
        ZVal.setProperty(this, Google_GaData.class, "rows", rows);

        return null;
    }

    public Object getRows(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_GaData.class, "rows"));
    }

    public Object setContainsSampledData(RuntimeEnv env, Object... args) {
        Object containsSampledData = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_GaData.class, "containsSampledData", containsSampledData);

        return null;
    }

    public Object getContainsSampledData(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_GaData.class, "containsSampledData"));
    }

    public Object setTotalResults(RuntimeEnv env, Object... args) {
        Object totalResults = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_GaData.class, "totalResults", totalResults);

        return null;
    }

    public Object getTotalResults(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_GaData.class, "totalResults"));
    }

    public Object setItemsPerPage(RuntimeEnv env, Object... args) {
        Object itemsPerPage = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_GaData.class, "itemsPerPage", itemsPerPage);

        return null;
    }

    public Object getItemsPerPage(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_GaData.class, "itemsPerPage"));
    }

    public Object setTotalsForAllResults(RuntimeEnv env, Object... args) {
        Object totalsForAllResults = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_GaData.class, "totalsForAllResults", totalsForAllResults);

        return null;
    }

    public Object getTotalsForAllResults(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_GaData.class, "totalsForAllResults"));
    }

    public Object setNextLink(RuntimeEnv env, Object... args) {
        Object nextLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_GaData.class, "nextLink", nextLink);

        return null;
    }

    public Object getNextLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_GaData.class, "nextLink"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_GaData.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_GaData.class, "id"));
    }

    public Object setQuery(RuntimeEnv env, Object... args) {
        Object query = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_GaData.class, "query", query);

        return null;
    }

    public Object getQuery(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_GaData.class, "query"));
    }

    public Object setPreviousLink(RuntimeEnv env, Object... args) {
        Object previousLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_GaData.class, "previousLink", previousLink);

        return null;
    }

    public Object getPreviousLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_GaData.class, "previousLink"));
    }

    public Object setProfileInfo(RuntimeEnv env, Object... args) {
        Object profileInfo = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_GaData.class, "profileInfo", profileInfo);

        return null;
    }

    public Object getProfileInfo(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_GaData.class, "profileInfo"));
    }

    public Object setColumnHeaders(RuntimeEnv env, Object... args) {
        Object columnHeaders = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_GaData.class,
                columnHeaders,
                "Google_GaDataColumnHeaders",
                "setColumnHeaders");
        ZVal.setProperty(this, Google_GaData.class, "columnHeaders", columnHeaders);

        return null;
    }

    public Object getColumnHeaders(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_GaData.class, "columnHeaders"));
    }

    public Object setSelfLink(RuntimeEnv env, Object... args) {
        Object selfLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_GaData.class, "selfLink", selfLink);

        return null;
    }

    public Object getSelfLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_GaData.class, "selfLink"));
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
