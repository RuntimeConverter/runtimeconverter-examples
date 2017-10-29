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

public class Google_OrkutCounterResource extends Google_Model
        implements RuntimeFileContextInterface {

    public Object total = null;

    public Object __linkType = "Google_OrkutLinkResource";

    public Object __linkDataType = "";

    public Object link = null;

    public Object name = null;

    public Google_OrkutCounterResource(RuntimeEnv env, Object... args) {
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
            case "setTotal":
                return this.setTotal(env, args);
            case "getTotal":
                return this.getTotal(env, args);
            case "setLink":
                return this.setLink(env, args);
            case "getLink":
                return this.getLink(env, args);
            case "setName":
                return this.setName(env, args);
            case "getName":
                return this.getName(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "total":
                return this.total;
            case "__linkType":
                if (Google_OrkutCounterResource.class.isAssignableFrom(caller)) {

                    return this.__linkType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__linkDataType":
                if (Google_OrkutCounterResource.class.isAssignableFrom(caller)) {

                    return this.__linkDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "link":
                return this.link;
            case "name":
                return this.name;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "total":
                return ZVal.isNull(this.total);
            case "__linkType":
                if (Google_OrkutCounterResource.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__linkType);
                }
                break;
            case "__linkDataType":
                if (Google_OrkutCounterResource.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__linkDataType);
                }
                break;
            case "link":
                return ZVal.isNull(this.link);
            case "name":
                return ZVal.isNull(this.name);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "total":
                this.total = value;
                break;
            case "__linkType":
                if (Google_OrkutCounterResource.class.isAssignableFrom(caller)) {

                    this.__linkType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__linkDataType":
                if (Google_OrkutCounterResource.class.isAssignableFrom(caller)) {

                    this.__linkDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "link":
                this.link = value;
                break;
            case "name":
                this.name = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setTotal(RuntimeEnv env, Object... args) {
        Object total = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_OrkutCounterResource.class, "total", total);

        return null;
    }

    public Object getTotal(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_OrkutCounterResource.class, "total"));
    }

    public Object setLink(RuntimeEnv env, Object... args) {
        Object link = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_OrkutCounterResource.class, "link", link);

        return null;
    }

    public Object getLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_OrkutCounterResource.class, "link"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_OrkutCounterResource.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_OrkutCounterResource.class, "name"));
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
