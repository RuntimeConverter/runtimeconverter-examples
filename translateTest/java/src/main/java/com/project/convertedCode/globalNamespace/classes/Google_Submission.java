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

 google-api-php-client/src/contrib/Google_ModeratorService.php

*/

public class Google_Submission extends Google_Model implements RuntimeFileContextInterface {

    public Object kind = null;

    public Object __attributionType = "Google_SubmissionAttribution";

    public Object __attributionDataType = "";

    public Object attribution = null;

    public Object created = null;

    public Object text = null;

    public Object __topicsType = "Google_ModeratorTopicsResourcePartial";

    public Object __topicsDataType = "array";

    public Object topics = null;

    public Object author = null;

    public Object __translationsType = "Google_SubmissionTranslations";

    public Object __translationsDataType = "array";

    public Object translations = null;

    public Object __parentSubmissionIdType = "Google_SubmissionParentSubmissionId";

    public Object __parentSubmissionIdDataType = "";

    public Object parentSubmissionId = null;

    public Object __voteType = "Google_ModeratorVotesResourcePartial";

    public Object __voteDataType = "";

    public Object vote = null;

    public Object attachmentUrl = null;

    public Object __geoType = "Google_SubmissionGeo";

    public Object __geoDataType = "";

    public Object geo = null;

    public Object __idType = "Google_SubmissionId";

    public Object __idDataType = "";

    public Object id = null;

    public Object __countersType = "Google_SubmissionCounters";

    public Object __countersDataType = "";

    public Object counters = null;

    public Google_Submission(RuntimeEnv env, Object... args) {
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
            case "setAttribution":
                return this.setAttribution(env, args);
            case "getAttribution":
                return this.getAttribution(env, args);
            case "setCreated":
                return this.setCreated(env, args);
            case "getCreated":
                return this.getCreated(env, args);
            case "setText":
                return this.setText(env, args);
            case "getText":
                return this.getText(env, args);
            case "setTopics":
                return this.setTopics(env, args);
            case "getTopics":
                return this.getTopics(env, args);
            case "setAuthor":
                return this.setAuthor(env, args);
            case "getAuthor":
                return this.getAuthor(env, args);
            case "setTranslations":
                return this.setTranslations(env, args);
            case "getTranslations":
                return this.getTranslations(env, args);
            case "setParentSubmissionId":
                return this.setParentSubmissionId(env, args);
            case "getParentSubmissionId":
                return this.getParentSubmissionId(env, args);
            case "setVote":
                return this.setVote(env, args);
            case "getVote":
                return this.getVote(env, args);
            case "setAttachmentUrl":
                return this.setAttachmentUrl(env, args);
            case "getAttachmentUrl":
                return this.getAttachmentUrl(env, args);
            case "setGeo":
                return this.setGeo(env, args);
            case "getGeo":
                return this.getGeo(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setCounters":
                return this.setCounters(env, args);
            case "getCounters":
                return this.getCounters(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return this.kind;
            case "__attributionType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    return this.__attributionType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__attributionDataType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    return this.__attributionDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "attribution":
                return this.attribution;
            case "created":
                return this.created;
            case "text":
                return this.text;
            case "__topicsType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    return this.__topicsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__topicsDataType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    return this.__topicsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "topics":
                return this.topics;
            case "author":
                return this.author;
            case "__translationsType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    return this.__translationsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__translationsDataType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    return this.__translationsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "translations":
                return this.translations;
            case "__parentSubmissionIdType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    return this.__parentSubmissionIdType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__parentSubmissionIdDataType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    return this.__parentSubmissionIdDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "parentSubmissionId":
                return this.parentSubmissionId;
            case "__voteType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    return this.__voteType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__voteDataType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    return this.__voteDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "vote":
                return this.vote;
            case "attachmentUrl":
                return this.attachmentUrl;
            case "__geoType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    return this.__geoType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__geoDataType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    return this.__geoDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "geo":
                return this.geo;
            case "__idType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    return this.__idType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__idDataType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    return this.__idDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "id":
                return this.id;
            case "__countersType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    return this.__countersType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__countersDataType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    return this.__countersDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "counters":
                return this.counters;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return ZVal.isNull(this.kind);
            case "__attributionType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__attributionType);
                }
                break;
            case "__attributionDataType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__attributionDataType);
                }
                break;
            case "attribution":
                return ZVal.isNull(this.attribution);
            case "created":
                return ZVal.isNull(this.created);
            case "text":
                return ZVal.isNull(this.text);
            case "__topicsType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__topicsType);
                }
                break;
            case "__topicsDataType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__topicsDataType);
                }
                break;
            case "topics":
                return ZVal.isNull(this.topics);
            case "author":
                return ZVal.isNull(this.author);
            case "__translationsType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__translationsType);
                }
                break;
            case "__translationsDataType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__translationsDataType);
                }
                break;
            case "translations":
                return ZVal.isNull(this.translations);
            case "__parentSubmissionIdType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__parentSubmissionIdType);
                }
                break;
            case "__parentSubmissionIdDataType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__parentSubmissionIdDataType);
                }
                break;
            case "parentSubmissionId":
                return ZVal.isNull(this.parentSubmissionId);
            case "__voteType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__voteType);
                }
                break;
            case "__voteDataType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__voteDataType);
                }
                break;
            case "vote":
                return ZVal.isNull(this.vote);
            case "attachmentUrl":
                return ZVal.isNull(this.attachmentUrl);
            case "__geoType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__geoType);
                }
                break;
            case "__geoDataType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__geoDataType);
                }
                break;
            case "geo":
                return ZVal.isNull(this.geo);
            case "__idType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__idType);
                }
                break;
            case "__idDataType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__idDataType);
                }
                break;
            case "id":
                return ZVal.isNull(this.id);
            case "__countersType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__countersType);
                }
                break;
            case "__countersDataType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__countersDataType);
                }
                break;
            case "counters":
                return ZVal.isNull(this.counters);
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
            case "__attributionType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    this.__attributionType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__attributionDataType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    this.__attributionDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "attribution":
                this.attribution = value;
                break;
            case "created":
                this.created = value;
                break;
            case "text":
                this.text = value;
                break;
            case "__topicsType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    this.__topicsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__topicsDataType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    this.__topicsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "topics":
                this.topics = value;
                break;
            case "author":
                this.author = value;
                break;
            case "__translationsType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    this.__translationsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__translationsDataType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    this.__translationsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "translations":
                this.translations = value;
                break;
            case "__parentSubmissionIdType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    this.__parentSubmissionIdType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__parentSubmissionIdDataType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    this.__parentSubmissionIdDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "parentSubmissionId":
                this.parentSubmissionId = value;
                break;
            case "__voteType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    this.__voteType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__voteDataType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    this.__voteDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "vote":
                this.vote = value;
                break;
            case "attachmentUrl":
                this.attachmentUrl = value;
                break;
            case "__geoType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    this.__geoType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__geoDataType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    this.__geoDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "geo":
                this.geo = value;
                break;
            case "__idType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    this.__idType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__idDataType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    this.__idDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "id":
                this.id = value;
                break;
            case "__countersType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    this.__countersType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__countersDataType":
                if (Google_Submission.class.isAssignableFrom(caller)) {

                    this.__countersDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "counters":
                this.counters = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Submission.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Submission.class, "kind"));
    }

    public Object setAttribution(RuntimeEnv env, Object... args) {
        Object attribution = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Submission.class, "attribution", attribution);

        return null;
    }

    public Object getAttribution(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Submission.class, "attribution"));
    }

    public Object setCreated(RuntimeEnv env, Object... args) {
        Object created = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Submission.class, "created", created);

        return null;
    }

    public Object getCreated(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Submission.class, "created"));
    }

    public Object setText(RuntimeEnv env, Object... args) {
        Object text = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Submission.class, "text", text);

        return null;
    }

    public Object getText(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Submission.class, "text"));
    }

    public Object setTopics(RuntimeEnv env, Object... args) {
        Object topics = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Submission.class,
                topics,
                "Google_ModeratorTopicsResourcePartial",
                "setTopics");
        ZVal.setProperty(this, Google_Submission.class, "topics", topics);

        return null;
    }

    public Object getTopics(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Submission.class, "topics"));
    }

    public Object setAuthor(RuntimeEnv env, Object... args) {
        Object author = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Submission.class, "author", author);

        return null;
    }

    public Object getAuthor(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Submission.class, "author"));
    }

    public Object setTranslations(RuntimeEnv env, Object... args) {
        Object translations = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Submission.class,
                translations,
                "Google_SubmissionTranslations",
                "setTranslations");
        ZVal.setProperty(this, Google_Submission.class, "translations", translations);

        return null;
    }

    public Object getTranslations(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Submission.class, "translations"));
    }

    public Object setParentSubmissionId(RuntimeEnv env, Object... args) {
        Object parentSubmissionId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Submission.class, "parentSubmissionId", parentSubmissionId);

        return null;
    }

    public Object getParentSubmissionId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Submission.class, "parentSubmissionId"));
    }

    public Object setVote(RuntimeEnv env, Object... args) {
        Object vote = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Submission.class, "vote", vote);

        return null;
    }

    public Object getVote(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Submission.class, "vote"));
    }

    public Object setAttachmentUrl(RuntimeEnv env, Object... args) {
        Object attachmentUrl = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Submission.class, "attachmentUrl", attachmentUrl);

        return null;
    }

    public Object getAttachmentUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Submission.class, "attachmentUrl"));
    }

    public Object setGeo(RuntimeEnv env, Object... args) {
        Object geo = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Submission.class, "geo", geo);

        return null;
    }

    public Object getGeo(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Submission.class, "geo"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Submission.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Submission.class, "id"));
    }

    public Object setCounters(RuntimeEnv env, Object... args) {
        Object counters = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Submission.class, "counters", counters);

        return null;
    }

    public Object getCounters(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Submission.class, "counters"));
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
