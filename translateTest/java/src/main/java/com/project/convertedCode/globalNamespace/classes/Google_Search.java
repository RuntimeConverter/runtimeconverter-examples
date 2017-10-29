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

public class Google_Search extends Google_Model implements RuntimeFileContextInterface {

    public Object __promotionsType = "Google_Promotion";

    public Object __promotionsDataType = "array";

    public Object promotions = null;

    public Object kind = null;

    public Object __urlType = "Google_SearchUrl";

    public Object __urlDataType = "";

    public Object url = null;

    public Object __itemsType = "Google_Result";

    public Object __itemsDataType = "array";

    public Object items = null;

    public Object __contextType = "Google_Context";

    public Object __contextDataType = "";

    public Object context = null;

    public Object __queriesType = "Google_Query";

    public Object __queriesDataType = "map";

    public Object queries = null;

    public Object __spellingType = "Google_SearchSpelling";

    public Object __spellingDataType = "";

    public Object spelling = null;

    public Object __searchInformationType = "Google_SearchSearchInformation";

    public Object __searchInformationDataType = "";

    public Object searchInformation = null;

    public Google_Search(RuntimeEnv env, Object... args) {
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
            case "setPromotions":
                return this.setPromotions(env, args);
            case "getPromotions":
                return this.getPromotions(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setUrl":
                return this.setUrl(env, args);
            case "getUrl":
                return this.getUrl(env, args);
            case "setItems":
                return this.setItems(env, args);
            case "getItems":
                return this.getItems(env, args);
            case "setContext":
                return this.setContext(env, args);
            case "getContext":
                return this.getContext(env, args);
            case "setQueries":
                return this.setQueries(env, args);
            case "getQueries":
                return this.getQueries(env, args);
            case "setSpelling":
                return this.setSpelling(env, args);
            case "getSpelling":
                return this.getSpelling(env, args);
            case "setSearchInformation":
                return this.setSearchInformation(env, args);
            case "getSearchInformation":
                return this.getSearchInformation(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__promotionsType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    return this.__promotionsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__promotionsDataType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    return this.__promotionsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "promotions":
                return this.promotions;
            case "kind":
                return this.kind;
            case "__urlType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    return this.__urlType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__urlDataType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    return this.__urlDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "url":
                return this.url;
            case "__itemsType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    return this.__itemsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__itemsDataType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    return this.__itemsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "items":
                return this.items;
            case "__contextType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    return this.__contextType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__contextDataType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    return this.__contextDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "context":
                return this.context;
            case "__queriesType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    return this.__queriesType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__queriesDataType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    return this.__queriesDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "queries":
                return this.queries;
            case "__spellingType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    return this.__spellingType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__spellingDataType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    return this.__spellingDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "spelling":
                return this.spelling;
            case "__searchInformationType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    return this.__searchInformationType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__searchInformationDataType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    return this.__searchInformationDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "searchInformation":
                return this.searchInformation;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__promotionsType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__promotionsType);
                }
                break;
            case "__promotionsDataType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__promotionsDataType);
                }
                break;
            case "promotions":
                return ZVal.isNull(this.promotions);
            case "kind":
                return ZVal.isNull(this.kind);
            case "__urlType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__urlType);
                }
                break;
            case "__urlDataType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__urlDataType);
                }
                break;
            case "url":
                return ZVal.isNull(this.url);
            case "__itemsType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__itemsType);
                }
                break;
            case "__itemsDataType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__itemsDataType);
                }
                break;
            case "items":
                return ZVal.isNull(this.items);
            case "__contextType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__contextType);
                }
                break;
            case "__contextDataType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__contextDataType);
                }
                break;
            case "context":
                return ZVal.isNull(this.context);
            case "__queriesType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__queriesType);
                }
                break;
            case "__queriesDataType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__queriesDataType);
                }
                break;
            case "queries":
                return ZVal.isNull(this.queries);
            case "__spellingType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__spellingType);
                }
                break;
            case "__spellingDataType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__spellingDataType);
                }
                break;
            case "spelling":
                return ZVal.isNull(this.spelling);
            case "__searchInformationType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__searchInformationType);
                }
                break;
            case "__searchInformationDataType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__searchInformationDataType);
                }
                break;
            case "searchInformation":
                return ZVal.isNull(this.searchInformation);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__promotionsType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    this.__promotionsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__promotionsDataType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    this.__promotionsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "promotions":
                this.promotions = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "__urlType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    this.__urlType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__urlDataType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    this.__urlDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "url":
                this.url = value;
                break;
            case "__itemsType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    this.__itemsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__itemsDataType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    this.__itemsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "items":
                this.items = value;
                break;
            case "__contextType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    this.__contextType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__contextDataType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    this.__contextDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "context":
                this.context = value;
                break;
            case "__queriesType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    this.__queriesType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__queriesDataType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    this.__queriesDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "queries":
                this.queries = value;
                break;
            case "__spellingType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    this.__spellingType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__spellingDataType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    this.__spellingDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "spelling":
                this.spelling = value;
                break;
            case "__searchInformationType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    this.__searchInformationType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__searchInformationDataType":
                if (Google_Search.class.isAssignableFrom(caller)) {

                    this.__searchInformationDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "searchInformation":
                this.searchInformation = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setPromotions(RuntimeEnv env, Object... args) {
        Object promotions = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Search.class,
                promotions,
                "Google_Promotion",
                "setPromotions");
        ZVal.setProperty(this, Google_Search.class, "promotions", promotions);

        return null;
    }

    public Object getPromotions(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Search.class, "promotions"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Search.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Search.class, "kind"));
    }

    public Object setUrl(RuntimeEnv env, Object... args) {
        Object url = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Search.class, "url", url);

        return null;
    }

    public Object getUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Search.class, "url"));
    }

    public Object setItems(RuntimeEnv env, Object... args) {
        Object items = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this, "assertIsArray", Google_Search.class, items, "Google_Result", "setItems");
        ZVal.setProperty(this, Google_Search.class, "items", items);

        return null;
    }

    public Object getItems(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Search.class, "items"));
    }

    public Object setContext(RuntimeEnv env, Object... args) {
        Object context = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Search.class, "context", context);

        return null;
    }

    public Object getContext(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Search.class, "context"));
    }

    public Object setQueries(RuntimeEnv env, Object... args) {
        Object queries = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Search.class, "queries", queries);

        return null;
    }

    public Object getQueries(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Search.class, "queries"));
    }

    public Object setSpelling(RuntimeEnv env, Object... args) {
        Object spelling = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Search.class, "spelling", spelling);

        return null;
    }

    public Object getSpelling(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Search.class, "spelling"));
    }

    public Object setSearchInformation(RuntimeEnv env, Object... args) {
        Object searchInformation = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Search.class, "searchInformation", searchInformation);

        return null;
    }

    public Object getSearchInformation(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Search.class, "searchInformation"));
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
