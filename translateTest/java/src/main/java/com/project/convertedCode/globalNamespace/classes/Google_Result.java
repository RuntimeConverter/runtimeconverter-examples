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

 google-api-php-client/src/contrib/Google_PagespeedonlineService.php

*/

public class Google_Result extends Google_Model implements RuntimeFileContextInterface {

    public Object kind = null;

    public Object __formattedResultsType = "Google_ResultFormattedResults";

    public Object __formattedResultsDataType = "";

    public Object formattedResults = null;

    public Object title = null;

    public Object __versionType = "Google_ResultVersion";

    public Object __versionDataType = "";

    public Object version = null;

    public Object score = null;

    public Object responseCode = null;

    public Object invalidRules = null;

    public Object __pageStatsType = "Google_ResultPageStats";

    public Object __pageStatsDataType = "";

    public Object pageStats = null;

    public Object id = null;

    public Google_Result(RuntimeEnv env, Object... args) {
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
            case "setFormattedResults":
                return this.setFormattedResults(env, args);
            case "getFormattedResults":
                return this.getFormattedResults(env, args);
            case "setTitle":
                return this.setTitle(env, args);
            case "getTitle":
                return this.getTitle(env, args);
            case "setVersion":
                return this.setVersion(env, args);
            case "getVersion":
                return this.getVersion(env, args);
            case "setScore":
                return this.setScore(env, args);
            case "getScore":
                return this.getScore(env, args);
            case "setResponseCode":
                return this.setResponseCode(env, args);
            case "getResponseCode":
                return this.getResponseCode(env, args);
            case "setInvalidRules":
                return this.setInvalidRules(env, args);
            case "getInvalidRules":
                return this.getInvalidRules(env, args);
            case "setPageStats":
                return this.setPageStats(env, args);
            case "getPageStats":
                return this.getPageStats(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return this.kind;
            case "__formattedResultsType":
                if (Google_Result.class.isAssignableFrom(caller)) {

                    return this.__formattedResultsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__formattedResultsDataType":
                if (Google_Result.class.isAssignableFrom(caller)) {

                    return this.__formattedResultsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "formattedResults":
                return this.formattedResults;
            case "title":
                return this.title;
            case "__versionType":
                if (Google_Result.class.isAssignableFrom(caller)) {

                    return this.__versionType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__versionDataType":
                if (Google_Result.class.isAssignableFrom(caller)) {

                    return this.__versionDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "version":
                return this.version;
            case "score":
                return this.score;
            case "responseCode":
                return this.responseCode;
            case "invalidRules":
                return this.invalidRules;
            case "__pageStatsType":
                if (Google_Result.class.isAssignableFrom(caller)) {

                    return this.__pageStatsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__pageStatsDataType":
                if (Google_Result.class.isAssignableFrom(caller)) {

                    return this.__pageStatsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "pageStats":
                return this.pageStats;
            case "id":
                return this.id;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return ZVal.isNull(this.kind);
            case "__formattedResultsType":
                if (Google_Result.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__formattedResultsType);
                }
                break;
            case "__formattedResultsDataType":
                if (Google_Result.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__formattedResultsDataType);
                }
                break;
            case "formattedResults":
                return ZVal.isNull(this.formattedResults);
            case "title":
                return ZVal.isNull(this.title);
            case "__versionType":
                if (Google_Result.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__versionType);
                }
                break;
            case "__versionDataType":
                if (Google_Result.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__versionDataType);
                }
                break;
            case "version":
                return ZVal.isNull(this.version);
            case "score":
                return ZVal.isNull(this.score);
            case "responseCode":
                return ZVal.isNull(this.responseCode);
            case "invalidRules":
                return ZVal.isNull(this.invalidRules);
            case "__pageStatsType":
                if (Google_Result.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__pageStatsType);
                }
                break;
            case "__pageStatsDataType":
                if (Google_Result.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__pageStatsDataType);
                }
                break;
            case "pageStats":
                return ZVal.isNull(this.pageStats);
            case "id":
                return ZVal.isNull(this.id);
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
            case "__formattedResultsType":
                if (Google_Result.class.isAssignableFrom(caller)) {

                    this.__formattedResultsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__formattedResultsDataType":
                if (Google_Result.class.isAssignableFrom(caller)) {

                    this.__formattedResultsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "formattedResults":
                this.formattedResults = value;
                break;
            case "title":
                this.title = value;
                break;
            case "__versionType":
                if (Google_Result.class.isAssignableFrom(caller)) {

                    this.__versionType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__versionDataType":
                if (Google_Result.class.isAssignableFrom(caller)) {

                    this.__versionDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "version":
                this.version = value;
                break;
            case "score":
                this.score = value;
                break;
            case "responseCode":
                this.responseCode = value;
                break;
            case "invalidRules":
                this.invalidRules = value;
                break;
            case "__pageStatsType":
                if (Google_Result.class.isAssignableFrom(caller)) {

                    this.__pageStatsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__pageStatsDataType":
                if (Google_Result.class.isAssignableFrom(caller)) {

                    this.__pageStatsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "pageStats":
                this.pageStats = value;
                break;
            case "id":
                this.id = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Result.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Result.class, "kind"));
    }

    public Object setFormattedResults(RuntimeEnv env, Object... args) {
        Object formattedResults = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Result.class, "formattedResults", formattedResults);

        return null;
    }

    public Object getFormattedResults(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Result.class, "formattedResults"));
    }

    public Object setTitle(RuntimeEnv env, Object... args) {
        Object title = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Result.class, "title", title);

        return null;
    }

    public Object getTitle(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Result.class, "title"));
    }

    public Object setVersion(RuntimeEnv env, Object... args) {
        Object version = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Result.class, "version", version);

        return null;
    }

    public Object getVersion(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Result.class, "version"));
    }

    public Object setScore(RuntimeEnv env, Object... args) {
        Object score = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Result.class, "score", score);

        return null;
    }

    public Object getScore(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Result.class, "score"));
    }

    public Object setResponseCode(RuntimeEnv env, Object... args) {
        Object responseCode = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Result.class, "responseCode", responseCode);

        return null;
    }

    public Object getResponseCode(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Result.class, "responseCode"));
    }

    public Object setInvalidRules(RuntimeEnv env, Object... args) {
        Object invalidRules = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Result.class,
                invalidRules,
                "Google_string",
                "setInvalidRules");
        ZVal.setProperty(this, Google_Result.class, "invalidRules", invalidRules);

        return null;
    }

    public Object getInvalidRules(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Result.class, "invalidRules"));
    }

    public Object setPageStats(RuntimeEnv env, Object... args) {
        Object pageStats = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Result.class, "pageStats", pageStats);

        return null;
    }

    public Object getPageStats(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Result.class, "pageStats"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Result.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Result.class, "id"));
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
