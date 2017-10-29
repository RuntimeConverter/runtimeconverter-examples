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

 google-api-php-client/src/contrib/Google_OrkutService.php

*/

public class Google_CommunityPollVote extends Google_Model implements RuntimeFileContextInterface {

    public Object kind = null;

    public Object optionIds = null;

    public Object isVotevisible = null;

    public Google_CommunityPollVote(RuntimeEnv env, Object... args) {
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
            case "setOptionIds":
                return this.setOptionIds(env, args);
            case "getOptionIds":
                return this.getOptionIds(env, args);
            case "setIsVotevisible":
                return this.setIsVotevisible(env, args);
            case "getIsVotevisible":
                return this.getIsVotevisible(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return this.kind;
            case "optionIds":
                return this.optionIds;
            case "isVotevisible":
                return this.isVotevisible;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return ZVal.isNull(this.kind);
            case "optionIds":
                return ZVal.isNull(this.optionIds);
            case "isVotevisible":
                return ZVal.isNull(this.isVotevisible);
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
            case "optionIds":
                this.optionIds = value;
                break;
            case "isVotevisible":
                this.isVotevisible = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityPollVote.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityPollVote.class, "kind"));
    }

    public Object setOptionIds(RuntimeEnv env, Object... args) {
        Object optionIds = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_CommunityPollVote.class,
                optionIds,
                "Google_int",
                "setOptionIds");
        ZVal.setProperty(this, Google_CommunityPollVote.class, "optionIds", optionIds);

        return null;
    }

    public Object getOptionIds(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityPollVote.class, "optionIds"));
    }

    public Object setIsVotevisible(RuntimeEnv env, Object... args) {
        Object isVotevisible = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityPollVote.class, "isVotevisible", isVotevisible);

        return null;
    }

    public Object getIsVotevisible(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityPollVote.class, "isVotevisible"));
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
