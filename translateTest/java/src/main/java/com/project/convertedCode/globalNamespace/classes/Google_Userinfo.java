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

 google-api-php-client/src/contrib/Google_Oauth2Service.php

*/

public class Google_Userinfo extends Google_Model implements RuntimeFileContextInterface {

    public Object family_name = null;

    public Object name = null;

    public Object picture = null;

    public Object locale = null;

    public Object gender = null;

    public Object email = null;

    public Object birthday = null;

    public Object link = null;

    public Object given_name = null;

    public Object timezone = null;

    public Object id = null;

    public Object verified_email = null;

    public Google_Userinfo(RuntimeEnv env, Object... args) {
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
            case "setFamily_name":
                return this.setFamily_name(env, args);
            case "getFamily_name":
                return this.getFamily_name(env, args);
            case "setName":
                return this.setName(env, args);
            case "getName":
                return this.getName(env, args);
            case "setPicture":
                return this.setPicture(env, args);
            case "getPicture":
                return this.getPicture(env, args);
            case "setLocale":
                return this.setLocale(env, args);
            case "getLocale":
                return this.getLocale(env, args);
            case "setGender":
                return this.setGender(env, args);
            case "getGender":
                return this.getGender(env, args);
            case "setEmail":
                return this.setEmail(env, args);
            case "getEmail":
                return this.getEmail(env, args);
            case "setBirthday":
                return this.setBirthday(env, args);
            case "getBirthday":
                return this.getBirthday(env, args);
            case "setLink":
                return this.setLink(env, args);
            case "getLink":
                return this.getLink(env, args);
            case "setGiven_name":
                return this.setGiven_name(env, args);
            case "getGiven_name":
                return this.getGiven_name(env, args);
            case "setTimezone":
                return this.setTimezone(env, args);
            case "getTimezone":
                return this.getTimezone(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setVerified_email":
                return this.setVerified_email(env, args);
            case "getVerified_email":
                return this.getVerified_email(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "family_name":
                return this.family_name;
            case "name":
                return this.name;
            case "picture":
                return this.picture;
            case "locale":
                return this.locale;
            case "gender":
                return this.gender;
            case "email":
                return this.email;
            case "birthday":
                return this.birthday;
            case "link":
                return this.link;
            case "given_name":
                return this.given_name;
            case "timezone":
                return this.timezone;
            case "id":
                return this.id;
            case "verified_email":
                return this.verified_email;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "family_name":
                return ZVal.isNull(this.family_name);
            case "name":
                return ZVal.isNull(this.name);
            case "picture":
                return ZVal.isNull(this.picture);
            case "locale":
                return ZVal.isNull(this.locale);
            case "gender":
                return ZVal.isNull(this.gender);
            case "email":
                return ZVal.isNull(this.email);
            case "birthday":
                return ZVal.isNull(this.birthday);
            case "link":
                return ZVal.isNull(this.link);
            case "given_name":
                return ZVal.isNull(this.given_name);
            case "timezone":
                return ZVal.isNull(this.timezone);
            case "id":
                return ZVal.isNull(this.id);
            case "verified_email":
                return ZVal.isNull(this.verified_email);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "family_name":
                this.family_name = value;
                break;
            case "name":
                this.name = value;
                break;
            case "picture":
                this.picture = value;
                break;
            case "locale":
                this.locale = value;
                break;
            case "gender":
                this.gender = value;
                break;
            case "email":
                this.email = value;
                break;
            case "birthday":
                this.birthday = value;
                break;
            case "link":
                this.link = value;
                break;
            case "given_name":
                this.given_name = value;
                break;
            case "timezone":
                this.timezone = value;
                break;
            case "id":
                this.id = value;
                break;
            case "verified_email":
                this.verified_email = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setFamily_name(RuntimeEnv env, Object... args) {
        Object family_name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Userinfo.class, "family_name", family_name);

        return null;
    }

    public Object getFamily_name(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Userinfo.class, "family_name"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Userinfo.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Userinfo.class, "name"));
    }

    public Object setPicture(RuntimeEnv env, Object... args) {
        Object picture = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Userinfo.class, "picture", picture);

        return null;
    }

    public Object getPicture(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Userinfo.class, "picture"));
    }

    public Object setLocale(RuntimeEnv env, Object... args) {
        Object locale = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Userinfo.class, "locale", locale);

        return null;
    }

    public Object getLocale(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Userinfo.class, "locale"));
    }

    public Object setGender(RuntimeEnv env, Object... args) {
        Object gender = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Userinfo.class, "gender", gender);

        return null;
    }

    public Object getGender(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Userinfo.class, "gender"));
    }

    public Object setEmail(RuntimeEnv env, Object... args) {
        Object email = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Userinfo.class, "email", email);

        return null;
    }

    public Object getEmail(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Userinfo.class, "email"));
    }

    public Object setBirthday(RuntimeEnv env, Object... args) {
        Object birthday = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Userinfo.class, "birthday", birthday);

        return null;
    }

    public Object getBirthday(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Userinfo.class, "birthday"));
    }

    public Object setLink(RuntimeEnv env, Object... args) {
        Object link = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Userinfo.class, "link", link);

        return null;
    }

    public Object getLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Userinfo.class, "link"));
    }

    public Object setGiven_name(RuntimeEnv env, Object... args) {
        Object given_name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Userinfo.class, "given_name", given_name);

        return null;
    }

    public Object getGiven_name(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Userinfo.class, "given_name"));
    }

    public Object setTimezone(RuntimeEnv env, Object... args) {
        Object timezone = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Userinfo.class, "timezone", timezone);

        return null;
    }

    public Object getTimezone(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Userinfo.class, "timezone"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Userinfo.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Userinfo.class, "id"));
    }

    public Object setVerified_email(RuntimeEnv env, Object... args) {
        Object verified_email = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Userinfo.class, "verified_email", verified_email);

        return null;
    }

    public Object getVerified_email(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Userinfo.class, "verified_email"));
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
