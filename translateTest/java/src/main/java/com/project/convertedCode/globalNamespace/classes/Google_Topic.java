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

public class Google_Topic extends Google_Model implements RuntimeFileContextInterface {

    public Object kind = null;

    public Object description = null;

    public Object __rulesType = "Google_TopicRules";

    public Object __rulesDataType = "";

    public Object rules = null;

    public Object __featuredSubmissionType = "Google_Submission";

    public Object __featuredSubmissionDataType = "";

    public Object featuredSubmission = null;

    public Object presenter = null;

    public Object __countersType = "Google_TopicCounters";

    public Object __countersDataType = "";

    public Object counters = null;

    public Object __idType = "Google_TopicId";

    public Object __idDataType = "";

    public Object id = null;

    public Object name = null;

    public Google_Topic(RuntimeEnv env, Object... args) {
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
            case "setDescription":
                return this.setDescription(env, args);
            case "getDescription":
                return this.getDescription(env, args);
            case "setRules":
                return this.setRules(env, args);
            case "getRules":
                return this.getRules(env, args);
            case "setFeaturedSubmission":
                return this.setFeaturedSubmission(env, args);
            case "getFeaturedSubmission":
                return this.getFeaturedSubmission(env, args);
            case "setPresenter":
                return this.setPresenter(env, args);
            case "getPresenter":
                return this.getPresenter(env, args);
            case "setCounters":
                return this.setCounters(env, args);
            case "getCounters":
                return this.getCounters(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setName":
                return this.setName(env, args);
            case "getName":
                return this.getName(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return this.kind;
            case "description":
                return this.description;
            case "__rulesType":
                if (Google_Topic.class.isAssignableFrom(caller)) {

                    return this.__rulesType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__rulesDataType":
                if (Google_Topic.class.isAssignableFrom(caller)) {

                    return this.__rulesDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "rules":
                return this.rules;
            case "__featuredSubmissionType":
                if (Google_Topic.class.isAssignableFrom(caller)) {

                    return this.__featuredSubmissionType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__featuredSubmissionDataType":
                if (Google_Topic.class.isAssignableFrom(caller)) {

                    return this.__featuredSubmissionDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "featuredSubmission":
                return this.featuredSubmission;
            case "presenter":
                return this.presenter;
            case "__countersType":
                if (Google_Topic.class.isAssignableFrom(caller)) {

                    return this.__countersType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__countersDataType":
                if (Google_Topic.class.isAssignableFrom(caller)) {

                    return this.__countersDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "counters":
                return this.counters;
            case "__idType":
                if (Google_Topic.class.isAssignableFrom(caller)) {

                    return this.__idType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__idDataType":
                if (Google_Topic.class.isAssignableFrom(caller)) {

                    return this.__idDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "id":
                return this.id;
            case "name":
                return this.name;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return ZVal.isNull(this.kind);
            case "description":
                return ZVal.isNull(this.description);
            case "__rulesType":
                if (Google_Topic.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__rulesType);
                }
                break;
            case "__rulesDataType":
                if (Google_Topic.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__rulesDataType);
                }
                break;
            case "rules":
                return ZVal.isNull(this.rules);
            case "__featuredSubmissionType":
                if (Google_Topic.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__featuredSubmissionType);
                }
                break;
            case "__featuredSubmissionDataType":
                if (Google_Topic.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__featuredSubmissionDataType);
                }
                break;
            case "featuredSubmission":
                return ZVal.isNull(this.featuredSubmission);
            case "presenter":
                return ZVal.isNull(this.presenter);
            case "__countersType":
                if (Google_Topic.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__countersType);
                }
                break;
            case "__countersDataType":
                if (Google_Topic.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__countersDataType);
                }
                break;
            case "counters":
                return ZVal.isNull(this.counters);
            case "__idType":
                if (Google_Topic.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__idType);
                }
                break;
            case "__idDataType":
                if (Google_Topic.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__idDataType);
                }
                break;
            case "id":
                return ZVal.isNull(this.id);
            case "name":
                return ZVal.isNull(this.name);
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
            case "description":
                this.description = value;
                break;
            case "__rulesType":
                if (Google_Topic.class.isAssignableFrom(caller)) {

                    this.__rulesType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__rulesDataType":
                if (Google_Topic.class.isAssignableFrom(caller)) {

                    this.__rulesDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "rules":
                this.rules = value;
                break;
            case "__featuredSubmissionType":
                if (Google_Topic.class.isAssignableFrom(caller)) {

                    this.__featuredSubmissionType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__featuredSubmissionDataType":
                if (Google_Topic.class.isAssignableFrom(caller)) {

                    this.__featuredSubmissionDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "featuredSubmission":
                this.featuredSubmission = value;
                break;
            case "presenter":
                this.presenter = value;
                break;
            case "__countersType":
                if (Google_Topic.class.isAssignableFrom(caller)) {

                    this.__countersType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__countersDataType":
                if (Google_Topic.class.isAssignableFrom(caller)) {

                    this.__countersDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "counters":
                this.counters = value;
                break;
            case "__idType":
                if (Google_Topic.class.isAssignableFrom(caller)) {

                    this.__idType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__idDataType":
                if (Google_Topic.class.isAssignableFrom(caller)) {

                    this.__idDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "id":
                this.id = value;
                break;
            case "name":
                this.name = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Topic.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Topic.class, "kind"));
    }

    public Object setDescription(RuntimeEnv env, Object... args) {
        Object description = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Topic.class, "description", description);

        return null;
    }

    public Object getDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Topic.class, "description"));
    }

    public Object setRules(RuntimeEnv env, Object... args) {
        Object rules = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Topic.class, "rules", rules);

        return null;
    }

    public Object getRules(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Topic.class, "rules"));
    }

    public Object setFeaturedSubmission(RuntimeEnv env, Object... args) {
        Object featuredSubmission = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Topic.class, "featuredSubmission", featuredSubmission);

        return null;
    }

    public Object getFeaturedSubmission(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Topic.class, "featuredSubmission"));
    }

    public Object setPresenter(RuntimeEnv env, Object... args) {
        Object presenter = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Topic.class, "presenter", presenter);

        return null;
    }

    public Object getPresenter(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Topic.class, "presenter"));
    }

    public Object setCounters(RuntimeEnv env, Object... args) {
        Object counters = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Topic.class, "counters", counters);

        return null;
    }

    public Object getCounters(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Topic.class, "counters"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Topic.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Topic.class, "id"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Topic.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Topic.class, "name"));
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
