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

public class Google_Series extends Google_Model implements RuntimeFileContextInterface {

    public Object kind = null;

    public Object description = null;

    public Object __rulesType = "Google_SeriesRules";

    public Object __rulesDataType = "";

    public Object rules = null;

    public Object unauthVotingAllowed = null;

    public Object videoSubmissionAllowed = null;

    public Object name = null;

    public Object numTopics = null;

    public Object anonymousSubmissionAllowed = null;

    public Object unauthSubmissionAllowed = null;

    public Object __idType = "Google_SeriesId";

    public Object __idDataType = "";

    public Object id = null;

    public Object __countersType = "Google_SeriesCounters";

    public Object __countersDataType = "";

    public Object counters = null;

    public Google_Series(RuntimeEnv env, Object... args) {
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
            case "setUnauthVotingAllowed":
                return this.setUnauthVotingAllowed(env, args);
            case "getUnauthVotingAllowed":
                return this.getUnauthVotingAllowed(env, args);
            case "setVideoSubmissionAllowed":
                return this.setVideoSubmissionAllowed(env, args);
            case "getVideoSubmissionAllowed":
                return this.getVideoSubmissionAllowed(env, args);
            case "setName":
                return this.setName(env, args);
            case "getName":
                return this.getName(env, args);
            case "setNumTopics":
                return this.setNumTopics(env, args);
            case "getNumTopics":
                return this.getNumTopics(env, args);
            case "setAnonymousSubmissionAllowed":
                return this.setAnonymousSubmissionAllowed(env, args);
            case "getAnonymousSubmissionAllowed":
                return this.getAnonymousSubmissionAllowed(env, args);
            case "setUnauthSubmissionAllowed":
                return this.setUnauthSubmissionAllowed(env, args);
            case "getUnauthSubmissionAllowed":
                return this.getUnauthSubmissionAllowed(env, args);
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
            case "description":
                return this.description;
            case "__rulesType":
                if (Google_Series.class.isAssignableFrom(caller)) {

                    return this.__rulesType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__rulesDataType":
                if (Google_Series.class.isAssignableFrom(caller)) {

                    return this.__rulesDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "rules":
                return this.rules;
            case "unauthVotingAllowed":
                return this.unauthVotingAllowed;
            case "videoSubmissionAllowed":
                return this.videoSubmissionAllowed;
            case "name":
                return this.name;
            case "numTopics":
                return this.numTopics;
            case "anonymousSubmissionAllowed":
                return this.anonymousSubmissionAllowed;
            case "unauthSubmissionAllowed":
                return this.unauthSubmissionAllowed;
            case "__idType":
                if (Google_Series.class.isAssignableFrom(caller)) {

                    return this.__idType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__idDataType":
                if (Google_Series.class.isAssignableFrom(caller)) {

                    return this.__idDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "id":
                return this.id;
            case "__countersType":
                if (Google_Series.class.isAssignableFrom(caller)) {

                    return this.__countersType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__countersDataType":
                if (Google_Series.class.isAssignableFrom(caller)) {

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
            case "description":
                return ZVal.isNull(this.description);
            case "__rulesType":
                if (Google_Series.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__rulesType);
                }
                break;
            case "__rulesDataType":
                if (Google_Series.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__rulesDataType);
                }
                break;
            case "rules":
                return ZVal.isNull(this.rules);
            case "unauthVotingAllowed":
                return ZVal.isNull(this.unauthVotingAllowed);
            case "videoSubmissionAllowed":
                return ZVal.isNull(this.videoSubmissionAllowed);
            case "name":
                return ZVal.isNull(this.name);
            case "numTopics":
                return ZVal.isNull(this.numTopics);
            case "anonymousSubmissionAllowed":
                return ZVal.isNull(this.anonymousSubmissionAllowed);
            case "unauthSubmissionAllowed":
                return ZVal.isNull(this.unauthSubmissionAllowed);
            case "__idType":
                if (Google_Series.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__idType);
                }
                break;
            case "__idDataType":
                if (Google_Series.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__idDataType);
                }
                break;
            case "id":
                return ZVal.isNull(this.id);
            case "__countersType":
                if (Google_Series.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__countersType);
                }
                break;
            case "__countersDataType":
                if (Google_Series.class.isAssignableFrom(caller)) {

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
            case "description":
                this.description = value;
                break;
            case "__rulesType":
                if (Google_Series.class.isAssignableFrom(caller)) {

                    this.__rulesType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__rulesDataType":
                if (Google_Series.class.isAssignableFrom(caller)) {

                    this.__rulesDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "rules":
                this.rules = value;
                break;
            case "unauthVotingAllowed":
                this.unauthVotingAllowed = value;
                break;
            case "videoSubmissionAllowed":
                this.videoSubmissionAllowed = value;
                break;
            case "name":
                this.name = value;
                break;
            case "numTopics":
                this.numTopics = value;
                break;
            case "anonymousSubmissionAllowed":
                this.anonymousSubmissionAllowed = value;
                break;
            case "unauthSubmissionAllowed":
                this.unauthSubmissionAllowed = value;
                break;
            case "__idType":
                if (Google_Series.class.isAssignableFrom(caller)) {

                    this.__idType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__idDataType":
                if (Google_Series.class.isAssignableFrom(caller)) {

                    this.__idDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "id":
                this.id = value;
                break;
            case "__countersType":
                if (Google_Series.class.isAssignableFrom(caller)) {

                    this.__countersType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__countersDataType":
                if (Google_Series.class.isAssignableFrom(caller)) {

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
        ZVal.setProperty(this, Google_Series.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Series.class, "kind"));
    }

    public Object setDescription(RuntimeEnv env, Object... args) {
        Object description = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Series.class, "description", description);

        return null;
    }

    public Object getDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Series.class, "description"));
    }

    public Object setRules(RuntimeEnv env, Object... args) {
        Object rules = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Series.class, "rules", rules);

        return null;
    }

    public Object getRules(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Series.class, "rules"));
    }

    public Object setUnauthVotingAllowed(RuntimeEnv env, Object... args) {
        Object unauthVotingAllowed = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Series.class, "unauthVotingAllowed", unauthVotingAllowed);

        return null;
    }

    public Object getUnauthVotingAllowed(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Series.class, "unauthVotingAllowed"));
    }

    public Object setVideoSubmissionAllowed(RuntimeEnv env, Object... args) {
        Object videoSubmissionAllowed = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_Series.class, "videoSubmissionAllowed", videoSubmissionAllowed);

        return null;
    }

    public Object getVideoSubmissionAllowed(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Series.class, "videoSubmissionAllowed"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Series.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Series.class, "name"));
    }

    public Object setNumTopics(RuntimeEnv env, Object... args) {
        Object numTopics = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Series.class, "numTopics", numTopics);

        return null;
    }

    public Object getNumTopics(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Series.class, "numTopics"));
    }

    public Object setAnonymousSubmissionAllowed(RuntimeEnv env, Object... args) {
        Object anonymousSubmissionAllowed = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_Series.class,
                "anonymousSubmissionAllowed",
                anonymousSubmissionAllowed);

        return null;
    }

    public Object getAnonymousSubmissionAllowed(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_Series.class, "anonymousSubmissionAllowed"));
    }

    public Object setUnauthSubmissionAllowed(RuntimeEnv env, Object... args) {
        Object unauthSubmissionAllowed = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_Series.class, "unauthSubmissionAllowed", unauthSubmissionAllowed);

        return null;
    }

    public Object getUnauthSubmissionAllowed(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Series.class, "unauthSubmissionAllowed"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Series.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Series.class, "id"));
    }

    public Object setCounters(RuntimeEnv env, Object... args) {
        Object counters = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Series.class, "counters", counters);

        return null;
    }

    public Object getCounters(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Series.class, "counters"));
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
