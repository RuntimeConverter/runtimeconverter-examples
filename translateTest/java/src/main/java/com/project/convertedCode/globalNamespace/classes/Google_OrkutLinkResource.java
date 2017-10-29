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

public class Google_OrkutLinkResource extends Google_Model implements RuntimeFileContextInterface {

    public Object href = null;

    public Object type = null;

    public Object rel = null;

    public Object title = null;

    public Google_OrkutLinkResource(RuntimeEnv env, Object... args) {
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
            case "setHref":
                return this.setHref(env, args);
            case "getHref":
                return this.getHref(env, args);
            case "setType":
                return this.setType(env, args);
            case "getType":
                return this.getType(env, args);
            case "setRel":
                return this.setRel(env, args);
            case "getRel":
                return this.getRel(env, args);
            case "setTitle":
                return this.setTitle(env, args);
            case "getTitle":
                return this.getTitle(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "href":
                return this.href;
            case "type":
                return this.type;
            case "rel":
                return this.rel;
            case "title":
                return this.title;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "href":
                return ZVal.isNull(this.href);
            case "type":
                return ZVal.isNull(this.type);
            case "rel":
                return ZVal.isNull(this.rel);
            case "title":
                return ZVal.isNull(this.title);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "href":
                this.href = value;
                break;
            case "type":
                this.type = value;
                break;
            case "rel":
                this.rel = value;
                break;
            case "title":
                this.title = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setHref(RuntimeEnv env, Object... args) {
        Object href = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_OrkutLinkResource.class, "href", href);

        return null;
    }

    public Object getHref(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_OrkutLinkResource.class, "href"));
    }

    public Object setType(RuntimeEnv env, Object... args) {
        Object type = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_OrkutLinkResource.class, "type", type);

        return null;
    }

    public Object getType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_OrkutLinkResource.class, "type"));
    }

    public Object setRel(RuntimeEnv env, Object... args) {
        Object rel = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_OrkutLinkResource.class, "rel", rel);

        return null;
    }

    public Object getRel(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_OrkutLinkResource.class, "rel"));
    }

    public Object setTitle(RuntimeEnv env, Object... args) {
        Object title = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_OrkutLinkResource.class, "title", title);

        return null;
    }

    public Object getTitle(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_OrkutLinkResource.class, "title"));
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
