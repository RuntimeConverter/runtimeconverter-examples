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

 google-api-php-client/src/contrib/Google_PagespeedonlineService.php

*/

public class Google_ResultPageStats extends Google_Model implements RuntimeFileContextInterface {

    public Object otherResponseBytes = null;

    public Object flashResponseBytes = null;

    public Object totalRequestBytes = null;

    public Object numberCssResources = null;

    public Object numberResources = null;

    public Object cssResponseBytes = null;

    public Object javascriptResponseBytes = null;

    public Object imageResponseBytes = null;

    public Object numberHosts = null;

    public Object numberStaticResources = null;

    public Object htmlResponseBytes = null;

    public Object numberJsResources = null;

    public Object textResponseBytes = null;

    public Google_ResultPageStats(RuntimeEnv env, Object... args) {
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
            case "setOtherResponseBytes":
                return this.setOtherResponseBytes(env, args);
            case "getOtherResponseBytes":
                return this.getOtherResponseBytes(env, args);
            case "setFlashResponseBytes":
                return this.setFlashResponseBytes(env, args);
            case "getFlashResponseBytes":
                return this.getFlashResponseBytes(env, args);
            case "setTotalRequestBytes":
                return this.setTotalRequestBytes(env, args);
            case "getTotalRequestBytes":
                return this.getTotalRequestBytes(env, args);
            case "setNumberCssResources":
                return this.setNumberCssResources(env, args);
            case "getNumberCssResources":
                return this.getNumberCssResources(env, args);
            case "setNumberResources":
                return this.setNumberResources(env, args);
            case "getNumberResources":
                return this.getNumberResources(env, args);
            case "setCssResponseBytes":
                return this.setCssResponseBytes(env, args);
            case "getCssResponseBytes":
                return this.getCssResponseBytes(env, args);
            case "setJavascriptResponseBytes":
                return this.setJavascriptResponseBytes(env, args);
            case "getJavascriptResponseBytes":
                return this.getJavascriptResponseBytes(env, args);
            case "setImageResponseBytes":
                return this.setImageResponseBytes(env, args);
            case "getImageResponseBytes":
                return this.getImageResponseBytes(env, args);
            case "setNumberHosts":
                return this.setNumberHosts(env, args);
            case "getNumberHosts":
                return this.getNumberHosts(env, args);
            case "setNumberStaticResources":
                return this.setNumberStaticResources(env, args);
            case "getNumberStaticResources":
                return this.getNumberStaticResources(env, args);
            case "setHtmlResponseBytes":
                return this.setHtmlResponseBytes(env, args);
            case "getHtmlResponseBytes":
                return this.getHtmlResponseBytes(env, args);
            case "setNumberJsResources":
                return this.setNumberJsResources(env, args);
            case "getNumberJsResources":
                return this.getNumberJsResources(env, args);
            case "setTextResponseBytes":
                return this.setTextResponseBytes(env, args);
            case "getTextResponseBytes":
                return this.getTextResponseBytes(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "otherResponseBytes":
                return this.otherResponseBytes;
            case "flashResponseBytes":
                return this.flashResponseBytes;
            case "totalRequestBytes":
                return this.totalRequestBytes;
            case "numberCssResources":
                return this.numberCssResources;
            case "numberResources":
                return this.numberResources;
            case "cssResponseBytes":
                return this.cssResponseBytes;
            case "javascriptResponseBytes":
                return this.javascriptResponseBytes;
            case "imageResponseBytes":
                return this.imageResponseBytes;
            case "numberHosts":
                return this.numberHosts;
            case "numberStaticResources":
                return this.numberStaticResources;
            case "htmlResponseBytes":
                return this.htmlResponseBytes;
            case "numberJsResources":
                return this.numberJsResources;
            case "textResponseBytes":
                return this.textResponseBytes;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "otherResponseBytes":
                return ZVal.isNull(this.otherResponseBytes);
            case "flashResponseBytes":
                return ZVal.isNull(this.flashResponseBytes);
            case "totalRequestBytes":
                return ZVal.isNull(this.totalRequestBytes);
            case "numberCssResources":
                return ZVal.isNull(this.numberCssResources);
            case "numberResources":
                return ZVal.isNull(this.numberResources);
            case "cssResponseBytes":
                return ZVal.isNull(this.cssResponseBytes);
            case "javascriptResponseBytes":
                return ZVal.isNull(this.javascriptResponseBytes);
            case "imageResponseBytes":
                return ZVal.isNull(this.imageResponseBytes);
            case "numberHosts":
                return ZVal.isNull(this.numberHosts);
            case "numberStaticResources":
                return ZVal.isNull(this.numberStaticResources);
            case "htmlResponseBytes":
                return ZVal.isNull(this.htmlResponseBytes);
            case "numberJsResources":
                return ZVal.isNull(this.numberJsResources);
            case "textResponseBytes":
                return ZVal.isNull(this.textResponseBytes);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "otherResponseBytes":
                this.otherResponseBytes = value;
                break;
            case "flashResponseBytes":
                this.flashResponseBytes = value;
                break;
            case "totalRequestBytes":
                this.totalRequestBytes = value;
                break;
            case "numberCssResources":
                this.numberCssResources = value;
                break;
            case "numberResources":
                this.numberResources = value;
                break;
            case "cssResponseBytes":
                this.cssResponseBytes = value;
                break;
            case "javascriptResponseBytes":
                this.javascriptResponseBytes = value;
                break;
            case "imageResponseBytes":
                this.imageResponseBytes = value;
                break;
            case "numberHosts":
                this.numberHosts = value;
                break;
            case "numberStaticResources":
                this.numberStaticResources = value;
                break;
            case "htmlResponseBytes":
                this.htmlResponseBytes = value;
                break;
            case "numberJsResources":
                this.numberJsResources = value;
                break;
            case "textResponseBytes":
                this.textResponseBytes = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setOtherResponseBytes(RuntimeEnv env, Object... args) {
        Object otherResponseBytes = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_ResultPageStats.class, "otherResponseBytes", otherResponseBytes);

        return null;
    }

    public Object getOtherResponseBytes(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ResultPageStats.class, "otherResponseBytes"));
    }

    public Object setFlashResponseBytes(RuntimeEnv env, Object... args) {
        Object flashResponseBytes = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_ResultPageStats.class, "flashResponseBytes", flashResponseBytes);

        return null;
    }

    public Object getFlashResponseBytes(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ResultPageStats.class, "flashResponseBytes"));
    }

    public Object setTotalRequestBytes(RuntimeEnv env, Object... args) {
        Object totalRequestBytes = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_ResultPageStats.class, "totalRequestBytes", totalRequestBytes);

        return null;
    }

    public Object getTotalRequestBytes(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ResultPageStats.class, "totalRequestBytes"));
    }

    public Object setNumberCssResources(RuntimeEnv env, Object... args) {
        Object numberCssResources = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_ResultPageStats.class, "numberCssResources", numberCssResources);

        return null;
    }

    public Object getNumberCssResources(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ResultPageStats.class, "numberCssResources"));
    }

    public Object setNumberResources(RuntimeEnv env, Object... args) {
        Object numberResources = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ResultPageStats.class, "numberResources", numberResources);

        return null;
    }

    public Object getNumberResources(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ResultPageStats.class, "numberResources"));
    }

    public Object setCssResponseBytes(RuntimeEnv env, Object... args) {
        Object cssResponseBytes = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ResultPageStats.class, "cssResponseBytes", cssResponseBytes);

        return null;
    }

    public Object getCssResponseBytes(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ResultPageStats.class, "cssResponseBytes"));
    }

    public Object setJavascriptResponseBytes(RuntimeEnv env, Object... args) {
        Object javascriptResponseBytes = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_ResultPageStats.class,
                "javascriptResponseBytes",
                javascriptResponseBytes);

        return null;
    }

    public Object getJavascriptResponseBytes(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ResultPageStats.class, "javascriptResponseBytes"));
    }

    public Object setImageResponseBytes(RuntimeEnv env, Object... args) {
        Object imageResponseBytes = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_ResultPageStats.class, "imageResponseBytes", imageResponseBytes);

        return null;
    }

    public Object getImageResponseBytes(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ResultPageStats.class, "imageResponseBytes"));
    }

    public Object setNumberHosts(RuntimeEnv env, Object... args) {
        Object numberHosts = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ResultPageStats.class, "numberHosts", numberHosts);

        return null;
    }

    public Object getNumberHosts(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ResultPageStats.class, "numberHosts"));
    }

    public Object setNumberStaticResources(RuntimeEnv env, Object... args) {
        Object numberStaticResources = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_ResultPageStats.class, "numberStaticResources", numberStaticResources);

        return null;
    }

    public Object getNumberStaticResources(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ResultPageStats.class, "numberStaticResources"));
    }

    public Object setHtmlResponseBytes(RuntimeEnv env, Object... args) {
        Object htmlResponseBytes = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_ResultPageStats.class, "htmlResponseBytes", htmlResponseBytes);

        return null;
    }

    public Object getHtmlResponseBytes(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ResultPageStats.class, "htmlResponseBytes"));
    }

    public Object setNumberJsResources(RuntimeEnv env, Object... args) {
        Object numberJsResources = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_ResultPageStats.class, "numberJsResources", numberJsResources);

        return null;
    }

    public Object getNumberJsResources(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ResultPageStats.class, "numberJsResources"));
    }

    public Object setTextResponseBytes(RuntimeEnv env, Object... args) {
        Object textResponseBytes = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_ResultPageStats.class, "textResponseBytes", textResponseBytes);

        return null;
    }

    public Object getTextResponseBytes(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_ResultPageStats.class, "textResponseBytes"));
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
