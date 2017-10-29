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

 google-api-php-client/src/contrib/Google_PlusService.php

*/

public class Google_ActivityActor extends Google_Model implements RuntimeFileContextInterface {

    public Object url = null;

    public Object __imageType = "Google_ActivityActorImage";

    public Object __imageDataType = "";

    public Object image = null;

    public Object displayName = null;

    public Object id = null;

    public Object __nameType = "Google_ActivityActorName";

    public Object __nameDataType = "";

    public Object name = null;

    public Google_ActivityActor(RuntimeEnv env, Object... args) {
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
            case "setUrl":
                return this.setUrl(env, args);
            case "getUrl":
                return this.getUrl(env, args);
            case "setImage":
                return this.setImage(env, args);
            case "getImage":
                return this.getImage(env, args);
            case "setDisplayName":
                return this.setDisplayName(env, args);
            case "getDisplayName":
                return this.getDisplayName(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
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
            case "url":
                return this.url;
            case "__imageType":
                if (Google_ActivityActor.class.isAssignableFrom(caller)) {

                    return this.__imageType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__imageDataType":
                if (Google_ActivityActor.class.isAssignableFrom(caller)) {

                    return this.__imageDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "image":
                return this.image;
            case "displayName":
                return this.displayName;
            case "id":
                return this.id;
            case "__nameType":
                if (Google_ActivityActor.class.isAssignableFrom(caller)) {

                    return this.__nameType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__nameDataType":
                if (Google_ActivityActor.class.isAssignableFrom(caller)) {

                    return this.__nameDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "name":
                return this.name;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "url":
                return ZVal.isNull(this.url);
            case "__imageType":
                if (Google_ActivityActor.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__imageType);
                }
                break;
            case "__imageDataType":
                if (Google_ActivityActor.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__imageDataType);
                }
                break;
            case "image":
                return ZVal.isNull(this.image);
            case "displayName":
                return ZVal.isNull(this.displayName);
            case "id":
                return ZVal.isNull(this.id);
            case "__nameType":
                if (Google_ActivityActor.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__nameType);
                }
                break;
            case "__nameDataType":
                if (Google_ActivityActor.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__nameDataType);
                }
                break;
            case "name":
                return ZVal.isNull(this.name);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "url":
                this.url = value;
                break;
            case "__imageType":
                if (Google_ActivityActor.class.isAssignableFrom(caller)) {

                    this.__imageType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__imageDataType":
                if (Google_ActivityActor.class.isAssignableFrom(caller)) {

                    this.__imageDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "image":
                this.image = value;
                break;
            case "displayName":
                this.displayName = value;
                break;
            case "id":
                this.id = value;
                break;
            case "__nameType":
                if (Google_ActivityActor.class.isAssignableFrom(caller)) {

                    this.__nameType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__nameDataType":
                if (Google_ActivityActor.class.isAssignableFrom(caller)) {

                    this.__nameDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "name":
                this.name = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setUrl(RuntimeEnv env, Object... args) {
        Object url = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ActivityActor.class, "url", url);

        return null;
    }

    public Object getUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ActivityActor.class, "url"));
    }

    public Object setImage(RuntimeEnv env, Object... args) {
        Object image = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ActivityActor.class, "image", image);

        return null;
    }

    public Object getImage(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ActivityActor.class, "image"));
    }

    public Object setDisplayName(RuntimeEnv env, Object... args) {
        Object displayName = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ActivityActor.class, "displayName", displayName);

        return null;
    }

    public Object getDisplayName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ActivityActor.class, "displayName"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ActivityActor.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ActivityActor.class, "id"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ActivityActor.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ActivityActor.class, "name"));
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
