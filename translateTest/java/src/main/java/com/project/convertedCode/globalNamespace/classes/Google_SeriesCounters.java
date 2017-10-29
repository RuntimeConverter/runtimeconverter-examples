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

public class Google_SeriesCounters extends Google_Model implements RuntimeFileContextInterface {

    public Object users = null;

    public Object noneVotes = null;

    public Object videoSubmissions = null;

    public Object minusVotes = null;

    public Object anonymousSubmissions = null;

    public Object submissions = null;

    public Object plusVotes = null;

    public Google_SeriesCounters(RuntimeEnv env, Object... args) {
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
            case "setUsers":
                return this.setUsers(env, args);
            case "getUsers":
                return this.getUsers(env, args);
            case "setNoneVotes":
                return this.setNoneVotes(env, args);
            case "getNoneVotes":
                return this.getNoneVotes(env, args);
            case "setVideoSubmissions":
                return this.setVideoSubmissions(env, args);
            case "getVideoSubmissions":
                return this.getVideoSubmissions(env, args);
            case "setMinusVotes":
                return this.setMinusVotes(env, args);
            case "getMinusVotes":
                return this.getMinusVotes(env, args);
            case "setAnonymousSubmissions":
                return this.setAnonymousSubmissions(env, args);
            case "getAnonymousSubmissions":
                return this.getAnonymousSubmissions(env, args);
            case "setSubmissions":
                return this.setSubmissions(env, args);
            case "getSubmissions":
                return this.getSubmissions(env, args);
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
            case "users":
                return this.users;
            case "noneVotes":
                return this.noneVotes;
            case "videoSubmissions":
                return this.videoSubmissions;
            case "minusVotes":
                return this.minusVotes;
            case "anonymousSubmissions":
                return this.anonymousSubmissions;
            case "submissions":
                return this.submissions;
            case "plusVotes":
                return this.plusVotes;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "users":
                return ZVal.isNull(this.users);
            case "noneVotes":
                return ZVal.isNull(this.noneVotes);
            case "videoSubmissions":
                return ZVal.isNull(this.videoSubmissions);
            case "minusVotes":
                return ZVal.isNull(this.minusVotes);
            case "anonymousSubmissions":
                return ZVal.isNull(this.anonymousSubmissions);
            case "submissions":
                return ZVal.isNull(this.submissions);
            case "plusVotes":
                return ZVal.isNull(this.plusVotes);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "users":
                this.users = value;
                break;
            case "noneVotes":
                this.noneVotes = value;
                break;
            case "videoSubmissions":
                this.videoSubmissions = value;
                break;
            case "minusVotes":
                this.minusVotes = value;
                break;
            case "anonymousSubmissions":
                this.anonymousSubmissions = value;
                break;
            case "submissions":
                this.submissions = value;
                break;
            case "plusVotes":
                this.plusVotes = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setUsers(RuntimeEnv env, Object... args) {
        Object users = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_SeriesCounters.class, "users", users);

        return null;
    }

    public Object getUsers(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_SeriesCounters.class, "users"));
    }

    public Object setNoneVotes(RuntimeEnv env, Object... args) {
        Object noneVotes = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_SeriesCounters.class, "noneVotes", noneVotes);

        return null;
    }

    public Object getNoneVotes(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_SeriesCounters.class, "noneVotes"));
    }

    public Object setVideoSubmissions(RuntimeEnv env, Object... args) {
        Object videoSubmissions = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_SeriesCounters.class, "videoSubmissions", videoSubmissions);

        return null;
    }

    public Object getVideoSubmissions(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_SeriesCounters.class, "videoSubmissions"));
    }

    public Object setMinusVotes(RuntimeEnv env, Object... args) {
        Object minusVotes = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_SeriesCounters.class, "minusVotes", minusVotes);

        return null;
    }

    public Object getMinusVotes(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_SeriesCounters.class, "minusVotes"));
    }

    public Object setAnonymousSubmissions(RuntimeEnv env, Object... args) {
        Object anonymousSubmissions = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_SeriesCounters.class, "anonymousSubmissions", anonymousSubmissions);

        return null;
    }

    public Object getAnonymousSubmissions(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_SeriesCounters.class, "anonymousSubmissions"));
    }

    public Object setSubmissions(RuntimeEnv env, Object... args) {
        Object submissions = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_SeriesCounters.class, "submissions", submissions);

        return null;
    }

    public Object getSubmissions(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_SeriesCounters.class, "submissions"));
    }

    public Object setPlusVotes(RuntimeEnv env, Object... args) {
        Object plusVotes = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_SeriesCounters.class, "plusVotes", plusVotes);

        return null;
    }

    public Object getPlusVotes(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_SeriesCounters.class, "plusVotes"));
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
