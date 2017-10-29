package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Google_Service;
import com.project.convertedCode.globalNamespace.classes.Google_CseServiceResource;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_CustomsearchService.php

*/

public class Google_CustomsearchService extends Google_Service
        implements RuntimeFileContextInterface {

    public Object cse = null;

    public Google_CustomsearchService(RuntimeEnv env, Object... args) {
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
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "cse":
                return this.cse;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "cse":
                return ZVal.isNull(this.cse);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "cse":
                this.cse = value;
                break;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object client = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CustomsearchService.class, "servicePath", "customsearch/");
        ZVal.setProperty(this, Google_CustomsearchService.class, "version", "v1");
        ZVal.setProperty(this, Google_CustomsearchService.class, "serviceName", "customsearch");
        env.callMethod(
                client,
                "addService",
                Google_CustomsearchService.class,
                ZVal.getProperty(this, Google_CustomsearchService.class, "serviceName"),
                ZVal.getProperty(this, Google_CustomsearchService.class, "version"));
        ZVal.setProperty(
                this,
                Google_CustomsearchService.class,
                "cse",
                new Google_CseServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_CustomsearchService.class, "serviceName"),
                        "cse",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"httpMethod\": \"GET\", \"response\": {\"$ref\": \"Search\"}, \"id\": \"search.cse.list\", \"parameters\": {\"sort\": {\"type\": \"string\", \"location\": \"query\"}, \"orTerms\": {\"type\": \"string\", \"location\": \"query\"}, \"highRange\": {\"type\": \"string\", \"location\": \"query\"}, \"num\": {\"default\": \"10\", \"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"cr\": {\"type\": \"string\", \"location\": \"query\"}, \"imgType\": {\"enum\": [\"clipart\", \"face\", \"lineart\", \"news\", \"photo\"], \"type\": \"string\", \"location\": \"query\"}, \"gl\": {\"type\": \"string\", \"location\": \"query\"}, \"q\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"relatedSite\": {\"type\": \"string\", \"location\": \"query\"}, \"searchType\": {\"enum\": [\"image\"], \"type\": \"string\", \"location\": \"query\"}, \"fileType\": {\"type\": \"string\", \"location\": \"query\"}, \"start\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"imgDominantColor\": {\"enum\": [\"black\", \"blue\", \"brown\", \"gray\", \"green\", \"pink\", \"purple\", \"teal\", \"white\", \"yellow\"], \"type\": \"string\", \"location\": \"query\"}, \"lr\": {\"enum\": [\"lang_ar\", \"lang_bg\", \"lang_ca\", \"lang_cs\", \"lang_da\", \"lang_de\", \"lang_el\", \"lang_en\", \"lang_es\", \"lang_et\", \"lang_fi\", \"lang_fr\", \"lang_hr\", \"lang_hu\", \"lang_id\", \"lang_is\", \"lang_it\", \"lang_iw\", \"lang_ja\", \"lang_ko\", \"lang_lt\", \"lang_lv\", \"lang_nl\", \"lang_no\", \"lang_pl\", \"lang_pt\", \"lang_ro\", \"lang_ru\", \"lang_sk\", \"lang_sl\", \"lang_sr\", \"lang_sv\", \"lang_tr\", \"lang_zh-CN\", \"lang_zh-TW\"], \"type\": \"string\", \"location\": \"query\"}, \"siteSearch\": {\"type\": \"string\", \"location\": \"query\"}, \"cref\": {\"type\": \"string\", \"location\": \"query\"}, \"dateRestrict\": {\"type\": \"string\", \"location\": \"query\"}, \"safe\": {\"default\": \"off\", \"enum\": [\"high\", \"medium\", \"off\"], \"type\": \"string\", \"location\": \"query\"}, \"c2coff\": {\"type\": \"string\", \"location\": \"query\"}, \"googlehost\": {\"type\": \"string\", \"location\": \"query\"}, \"hq\": {\"type\": \"string\", \"location\": \"query\"}, \"exactTerms\": {\"type\": \"string\", \"location\": \"query\"}, \"hl\": {\"type\": \"string\", \"location\": \"query\"}, \"lowRange\": {\"type\": \"string\", \"location\": \"query\"}, \"imgSize\": {\"enum\": [\"huge\", \"icon\", \"large\", \"medium\", \"small\", \"xlarge\", \"xxlarge\"], \"type\": \"string\", \"location\": \"query\"}, \"imgColorType\": {\"enum\": [\"color\", \"gray\", \"mono\"], \"type\": \"string\", \"location\": \"query\"}, \"rights\": {\"type\": \"string\", \"location\": \"query\"}, \"excludeTerms\": {\"type\": \"string\", \"location\": \"query\"}, \"filter\": {\"enum\": [\"0\", \"1\"], \"type\": \"string\", \"location\": \"query\"}, \"linkSite\": {\"type\": \"string\", \"location\": \"query\"}, \"cx\": {\"type\": \"string\", \"location\": \"query\"}, \"siteSearchFilter\": {\"enum\": [\"e\", \"i\"], \"type\": \"string\", \"location\": \"query\"}}, \"path\": \"v1\"}}}",
                                true)));

        return null;
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
