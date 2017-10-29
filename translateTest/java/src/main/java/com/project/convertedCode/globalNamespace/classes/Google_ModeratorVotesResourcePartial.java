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

public class Google_ModeratorVotesResourcePartial extends Google_Model
        implements RuntimeFileContextInterface {

    public Object vote = null;

    public Object flag = null;

    public Google_ModeratorVotesResourcePartial(RuntimeEnv env, Object... args) {
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
            case "setVote":
                return this.setVote(env, args);
            case "getVote":
                return this.getVote(env, args);
            case "setFlag":
                return this.setFlag(env, args);
            case "getFlag":
                return this.getFlag(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "vote":
                return this.vote;
            case "flag":
                return this.flag;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "vote":
                return ZVal.isNull(this.vote);
            case "flag":
                return ZVal.isNull(this.flag);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "vote":
                this.vote = value;
                break;
            case "flag":
                this.flag = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setVote(RuntimeEnv env, Object... args) {
        Object vote = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ModeratorVotesResourcePartial.class, "vote", vote);

        return null;
    }

    public Object getVote(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ModeratorVotesResourcePartial.class, "vote"));
    }

    public Object setFlag(RuntimeEnv env, Object... args) {
        Object flag = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ModeratorVotesResourcePartial.class, "flag", flag);

        return null;
    }

    public Object getFlag(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ModeratorVotesResourcePartial.class, "flag"));
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
