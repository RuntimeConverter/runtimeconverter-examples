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

public class Google_TopicRulesVotes extends Google_Model implements RuntimeFileContextInterface {

    public Object close = null;

    public Object open = null;

    public Google_TopicRulesVotes(RuntimeEnv env, Object... args) {
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
            case "setClose":
                return this.setClose(env, args);
            case "getClose":
                return this.getClose(env, args);
            case "setOpen":
                return this.setOpen(env, args);
            case "getOpen":
                return this.getOpen(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "close":
                return this.close;
            case "open":
                return this.open;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "close":
                return ZVal.isNull(this.close);
            case "open":
                return ZVal.isNull(this.open);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "close":
                this.close = value;
                break;
            case "open":
                this.open = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setClose(RuntimeEnv env, Object... args) {
        Object close = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_TopicRulesVotes.class, "close", close);

        return null;
    }

    public Object getClose(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_TopicRulesVotes.class, "close"));
    }

    public Object setOpen(RuntimeEnv env, Object... args) {
        Object open = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_TopicRulesVotes.class, "open", open);

        return null;
    }

    public Object getOpen(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_TopicRulesVotes.class, "open"));
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
