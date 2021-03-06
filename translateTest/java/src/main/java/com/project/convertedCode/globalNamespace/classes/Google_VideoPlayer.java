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

 google-api-php-client/src/contrib/Google_YoutubeService.php

*/

public class Google_VideoPlayer extends Google_Model implements RuntimeFileContextInterface {

    public Object embedHtml = null;

    public Google_VideoPlayer(RuntimeEnv env, Object... args) {
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
            case "setEmbedHtml":
                return this.setEmbedHtml(env, args);
            case "getEmbedHtml":
                return this.getEmbedHtml(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "embedHtml":
                return this.embedHtml;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "embedHtml":
                return ZVal.isNull(this.embedHtml);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "embedHtml":
                this.embedHtml = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setEmbedHtml(RuntimeEnv env, Object... args) {
        Object embedHtml = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VideoPlayer.class, "embedHtml", embedHtml);

        return null;
    }

    public Object getEmbedHtml(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_VideoPlayer.class, "embedHtml"));
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
