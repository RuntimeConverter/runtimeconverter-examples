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

public class Google_OrkutActivitypersonResource extends Google_Model
        implements RuntimeFileContextInterface {

    public Object __nameType = "Google_OrkutActivitypersonResourceName";

    public Object __nameDataType = "";

    public Object name = null;

    public Object url = null;

    public Object gender = null;

    public Object __imageType = "Google_OrkutActivitypersonResourceImage";

    public Object __imageDataType = "";

    public Object image = null;

    public Object birthday = null;

    public Object id = null;

    public Google_OrkutActivitypersonResource(RuntimeEnv env, Object... args) {
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
            case "setName":
                return this.setName(env, args);
            case "getName":
                return this.getName(env, args);
            case "setUrl":
                return this.setUrl(env, args);
            case "getUrl":
                return this.getUrl(env, args);
            case "setGender":
                return this.setGender(env, args);
            case "getGender":
                return this.getGender(env, args);
            case "setImage":
                return this.setImage(env, args);
            case "getImage":
                return this.getImage(env, args);
            case "setBirthday":
                return this.setBirthday(env, args);
            case "getBirthday":
                return this.getBirthday(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__nameType":
                if (Google_OrkutActivitypersonResource.class.isAssignableFrom(caller)) {

                    return this.__nameType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__nameDataType":
                if (Google_OrkutActivitypersonResource.class.isAssignableFrom(caller)) {

                    return this.__nameDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "name":
                return this.name;
            case "url":
                return this.url;
            case "gender":
                return this.gender;
            case "__imageType":
                if (Google_OrkutActivitypersonResource.class.isAssignableFrom(caller)) {

                    return this.__imageType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__imageDataType":
                if (Google_OrkutActivitypersonResource.class.isAssignableFrom(caller)) {

                    return this.__imageDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "image":
                return this.image;
            case "birthday":
                return this.birthday;
            case "id":
                return this.id;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__nameType":
                if (Google_OrkutActivitypersonResource.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__nameType);
                }
                break;
            case "__nameDataType":
                if (Google_OrkutActivitypersonResource.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__nameDataType);
                }
                break;
            case "name":
                return ZVal.isNull(this.name);
            case "url":
                return ZVal.isNull(this.url);
            case "gender":
                return ZVal.isNull(this.gender);
            case "__imageType":
                if (Google_OrkutActivitypersonResource.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__imageType);
                }
                break;
            case "__imageDataType":
                if (Google_OrkutActivitypersonResource.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__imageDataType);
                }
                break;
            case "image":
                return ZVal.isNull(this.image);
            case "birthday":
                return ZVal.isNull(this.birthday);
            case "id":
                return ZVal.isNull(this.id);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__nameType":
                if (Google_OrkutActivitypersonResource.class.isAssignableFrom(caller)) {

                    this.__nameType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__nameDataType":
                if (Google_OrkutActivitypersonResource.class.isAssignableFrom(caller)) {

                    this.__nameDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "name":
                this.name = value;
                break;
            case "url":
                this.url = value;
                break;
            case "gender":
                this.gender = value;
                break;
            case "__imageType":
                if (Google_OrkutActivitypersonResource.class.isAssignableFrom(caller)) {

                    this.__imageType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__imageDataType":
                if (Google_OrkutActivitypersonResource.class.isAssignableFrom(caller)) {

                    this.__imageDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "image":
                this.image = value;
                break;
            case "birthday":
                this.birthday = value;
                break;
            case "id":
                this.id = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_OrkutActivitypersonResource.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_OrkutActivitypersonResource.class, "name"));
    }

    public Object setUrl(RuntimeEnv env, Object... args) {
        Object url = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_OrkutActivitypersonResource.class, "url", url);

        return null;
    }

    public Object getUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_OrkutActivitypersonResource.class, "url"));
    }

    public Object setGender(RuntimeEnv env, Object... args) {
        Object gender = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_OrkutActivitypersonResource.class, "gender", gender);

        return null;
    }

    public Object getGender(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_OrkutActivitypersonResource.class, "gender"));
    }

    public Object setImage(RuntimeEnv env, Object... args) {
        Object image = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_OrkutActivitypersonResource.class, "image", image);

        return null;
    }

    public Object getImage(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_OrkutActivitypersonResource.class, "image"));
    }

    public Object setBirthday(RuntimeEnv env, Object... args) {
        Object birthday = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_OrkutActivitypersonResource.class, "birthday", birthday);

        return null;
    }

    public Object getBirthday(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_OrkutActivitypersonResource.class, "birthday"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_OrkutActivitypersonResource.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_OrkutActivitypersonResource.class, "id"));
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
