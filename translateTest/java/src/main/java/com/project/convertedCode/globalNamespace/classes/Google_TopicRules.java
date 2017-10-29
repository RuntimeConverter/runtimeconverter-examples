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

public class Google_TopicRules extends Google_Model implements RuntimeFileContextInterface {

    public Object __votesType = "Google_TopicRulesVotes";

    public Object __votesDataType = "";

    public Object votes = null;

    public Object __submissionsType = "Google_TopicRulesSubmissions";

    public Object __submissionsDataType = "";

    public Object submissions = null;

    public Google_TopicRules(RuntimeEnv env, Object... args) {
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
            case "setVotes":
                return this.setVotes(env, args);
            case "getVotes":
                return this.getVotes(env, args);
            case "setSubmissions":
                return this.setSubmissions(env, args);
            case "getSubmissions":
                return this.getSubmissions(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__votesType":
                if (Google_TopicRules.class.isAssignableFrom(caller)) {

                    return this.__votesType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__votesDataType":
                if (Google_TopicRules.class.isAssignableFrom(caller)) {

                    return this.__votesDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "votes":
                return this.votes;
            case "__submissionsType":
                if (Google_TopicRules.class.isAssignableFrom(caller)) {

                    return this.__submissionsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__submissionsDataType":
                if (Google_TopicRules.class.isAssignableFrom(caller)) {

                    return this.__submissionsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "submissions":
                return this.submissions;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__votesType":
                if (Google_TopicRules.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__votesType);
                }
                break;
            case "__votesDataType":
                if (Google_TopicRules.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__votesDataType);
                }
                break;
            case "votes":
                return ZVal.isNull(this.votes);
            case "__submissionsType":
                if (Google_TopicRules.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__submissionsType);
                }
                break;
            case "__submissionsDataType":
                if (Google_TopicRules.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__submissionsDataType);
                }
                break;
            case "submissions":
                return ZVal.isNull(this.submissions);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__votesType":
                if (Google_TopicRules.class.isAssignableFrom(caller)) {

                    this.__votesType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__votesDataType":
                if (Google_TopicRules.class.isAssignableFrom(caller)) {

                    this.__votesDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "votes":
                this.votes = value;
                break;
            case "__submissionsType":
                if (Google_TopicRules.class.isAssignableFrom(caller)) {

                    this.__submissionsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__submissionsDataType":
                if (Google_TopicRules.class.isAssignableFrom(caller)) {

                    this.__submissionsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "submissions":
                this.submissions = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setVotes(RuntimeEnv env, Object... args) {
        Object votes = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_TopicRules.class, "votes", votes);

        return null;
    }

    public Object getVotes(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_TopicRules.class, "votes"));
    }

    public Object setSubmissions(RuntimeEnv env, Object... args) {
        Object submissions = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_TopicRules.class, "submissions", submissions);

        return null;
    }

    public Object getSubmissions(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_TopicRules.class, "submissions"));
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
