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

public class Google_SubmissionCounters extends Google_Model implements RuntimeFileContextInterface {

    public Object noneVotes = null;

    public Object minusVotes = null;

    public Object plusVotes = null;

    public Google_SubmissionCounters(RuntimeEnv env, Object... args) {
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
            case "setNoneVotes":
                return this.setNoneVotes(env, args);
            case "getNoneVotes":
                return this.getNoneVotes(env, args);
            case "setMinusVotes":
                return this.setMinusVotes(env, args);
            case "getMinusVotes":
                return this.getMinusVotes(env, args);
            case "setPlusVotes":
                return this.setPlusVotes(env, args);
            case "getPlusVotes":
                return this.getPlusVotes(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "noneVotes":
                return this.noneVotes;
            case "minusVotes":
                return this.minusVotes;
            case "plusVotes":
                return this.plusVotes;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "noneVotes":
                return ZVal.isNull(this.noneVotes);
            case "minusVotes":
                return ZVal.isNull(this.minusVotes);
            case "plusVotes":
                return ZVal.isNull(this.plusVotes);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "noneVotes":
                this.noneVotes = value;
                break;
            case "minusVotes":
                this.minusVotes = value;
                break;
            case "plusVotes":
                this.plusVotes = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setNoneVotes(RuntimeEnv env, Object... args) {
        Object noneVotes = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_SubmissionCounters.class, "noneVotes", noneVotes);

        return null;
    }

    public Object getNoneVotes(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_SubmissionCounters.class, "noneVotes"));
    }

    public Object setMinusVotes(RuntimeEnv env, Object... args) {
        Object minusVotes = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_SubmissionCounters.class, "minusVotes", minusVotes);

        return null;
    }

    public Object getMinusVotes(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_SubmissionCounters.class, "minusVotes"));
    }

    public Object setPlusVotes(RuntimeEnv env, Object... args) {
        Object plusVotes = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_SubmissionCounters.class, "plusVotes", plusVotes);

        return null;
    }

    public Object getPlusVotes(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_SubmissionCounters.class, "plusVotes"));
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
