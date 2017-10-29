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

 google-api-php-client/src/contrib/Google_CustomsearchService.php

*/

public class Google_Promotion extends Google_Model implements RuntimeFileContextInterface {

    public Object title = null;

    public Object displayLink = null;

    public Object htmlTitle = null;

    public Object link = null;

    public Object __bodyLinesType = "Google_PromotionBodyLines";

    public Object __bodyLinesDataType = "array";

    public Object bodyLines = null;

    public Object __imageType = "Google_PromotionImage";

    public Object __imageDataType = "";

    public Object image = null;

    public Google_Promotion(RuntimeEnv env, Object... args) {
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
            case "setTitle":
                return this.setTitle(env, args);
            case "getTitle":
                return this.getTitle(env, args);
            case "setDisplayLink":
                return this.setDisplayLink(env, args);
            case "getDisplayLink":
                return this.getDisplayLink(env, args);
            case "setHtmlTitle":
                return this.setHtmlTitle(env, args);
            case "getHtmlTitle":
                return this.getHtmlTitle(env, args);
            case "setLink":
                return this.setLink(env, args);
            case "getLink":
                return this.getLink(env, args);
            case "setBodyLines":
                return this.setBodyLines(env, args);
            case "getBodyLines":
                return this.getBodyLines(env, args);
            case "setImage":
                return this.setImage(env, args);
            case "getImage":
                return this.getImage(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "title":
                return this.title;
            case "displayLink":
                return this.displayLink;
            case "htmlTitle":
                return this.htmlTitle;
            case "link":
                return this.link;
            case "__bodyLinesType":
                if (Google_Promotion.class.isAssignableFrom(caller)) {

                    return this.__bodyLinesType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__bodyLinesDataType":
                if (Google_Promotion.class.isAssignableFrom(caller)) {

                    return this.__bodyLinesDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "bodyLines":
                return this.bodyLines;
            case "__imageType":
                if (Google_Promotion.class.isAssignableFrom(caller)) {

                    return this.__imageType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__imageDataType":
                if (Google_Promotion.class.isAssignableFrom(caller)) {

                    return this.__imageDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "image":
                return this.image;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "title":
                return ZVal.isNull(this.title);
            case "displayLink":
                return ZVal.isNull(this.displayLink);
            case "htmlTitle":
                return ZVal.isNull(this.htmlTitle);
            case "link":
                return ZVal.isNull(this.link);
            case "__bodyLinesType":
                if (Google_Promotion.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__bodyLinesType);
                }
                break;
            case "__bodyLinesDataType":
                if (Google_Promotion.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__bodyLinesDataType);
                }
                break;
            case "bodyLines":
                return ZVal.isNull(this.bodyLines);
            case "__imageType":
                if (Google_Promotion.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__imageType);
                }
                break;
            case "__imageDataType":
                if (Google_Promotion.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__imageDataType);
                }
                break;
            case "image":
                return ZVal.isNull(this.image);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "title":
                this.title = value;
                break;
            case "displayLink":
                this.displayLink = value;
                break;
            case "htmlTitle":
                this.htmlTitle = value;
                break;
            case "link":
                this.link = value;
                break;
            case "__bodyLinesType":
                if (Google_Promotion.class.isAssignableFrom(caller)) {

                    this.__bodyLinesType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__bodyLinesDataType":
                if (Google_Promotion.class.isAssignableFrom(caller)) {

                    this.__bodyLinesDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "bodyLines":
                this.bodyLines = value;
                break;
            case "__imageType":
                if (Google_Promotion.class.isAssignableFrom(caller)) {

                    this.__imageType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__imageDataType":
                if (Google_Promotion.class.isAssignableFrom(caller)) {

                    this.__imageDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "image":
                this.image = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setTitle(RuntimeEnv env, Object... args) {
        Object title = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Promotion.class, "title", title);

        return null;
    }

    public Object getTitle(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Promotion.class, "title"));
    }

    public Object setDisplayLink(RuntimeEnv env, Object... args) {
        Object displayLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Promotion.class, "displayLink", displayLink);

        return null;
    }

    public Object getDisplayLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Promotion.class, "displayLink"));
    }

    public Object setHtmlTitle(RuntimeEnv env, Object... args) {
        Object htmlTitle = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Promotion.class, "htmlTitle", htmlTitle);

        return null;
    }

    public Object getHtmlTitle(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Promotion.class, "htmlTitle"));
    }

    public Object setLink(RuntimeEnv env, Object... args) {
        Object link = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Promotion.class, "link", link);

        return null;
    }

    public Object getLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Promotion.class, "link"));
    }

    public Object setBodyLines(RuntimeEnv env, Object... args) {
        Object bodyLines = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Promotion.class,
                bodyLines,
                "Google_PromotionBodyLines",
                "setBodyLines");
        ZVal.setProperty(this, Google_Promotion.class, "bodyLines", bodyLines);

        return null;
    }

    public Object getBodyLines(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Promotion.class, "bodyLines"));
    }

    public Object setImage(RuntimeEnv env, Object... args) {
        Object image = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Promotion.class, "image", image);

        return null;
    }

    public Object getImage(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Promotion.class, "image"));
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
