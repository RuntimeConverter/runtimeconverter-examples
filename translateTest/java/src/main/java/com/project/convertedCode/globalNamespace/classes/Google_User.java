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

 google-api-php-client/src/contrib/Google_BloggerService.php

*/

public class Google_User extends Google_Model implements RuntimeFileContextInterface {

    public Object about = null;

    public Object displayName = null;

    public Object created = null;

    public Object __localeType = "Google_UserLocale";

    public Object __localeDataType = "";

    public Object locale = null;

    public Object __blogsType = "Google_UserBlogs";

    public Object __blogsDataType = "";

    public Object blogs = null;

    public Object kind = null;

    public Object url = null;

    public Object id = null;

    public Object selfLink = null;

    public Google_User(RuntimeEnv env, Object... args) {
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
            case "setAbout":
                return this.setAbout(env, args);
            case "getAbout":
                return this.getAbout(env, args);
            case "setDisplayName":
                return this.setDisplayName(env, args);
            case "getDisplayName":
                return this.getDisplayName(env, args);
            case "setCreated":
                return this.setCreated(env, args);
            case "getCreated":
                return this.getCreated(env, args);
            case "setLocale":
                return this.setLocale(env, args);
            case "getLocale":
                return this.getLocale(env, args);
            case "setBlogs":
                return this.setBlogs(env, args);
            case "getBlogs":
                return this.getBlogs(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setUrl":
                return this.setUrl(env, args);
            case "getUrl":
                return this.getUrl(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setSelfLink":
                return this.setSelfLink(env, args);
            case "getSelfLink":
                return this.getSelfLink(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "about":
                return this.about;
            case "displayName":
                return this.displayName;
            case "created":
                return this.created;
            case "__localeType":
                if (Google_User.class.isAssignableFrom(caller)) {

                    return this.__localeType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__localeDataType":
                if (Google_User.class.isAssignableFrom(caller)) {

                    return this.__localeDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "locale":
                return this.locale;
            case "__blogsType":
                if (Google_User.class.isAssignableFrom(caller)) {

                    return this.__blogsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__blogsDataType":
                if (Google_User.class.isAssignableFrom(caller)) {

                    return this.__blogsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "blogs":
                return this.blogs;
            case "kind":
                return this.kind;
            case "url":
                return this.url;
            case "id":
                return this.id;
            case "selfLink":
                return this.selfLink;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "about":
                return ZVal.isNull(this.about);
            case "displayName":
                return ZVal.isNull(this.displayName);
            case "created":
                return ZVal.isNull(this.created);
            case "__localeType":
                if (Google_User.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__localeType);
                }
                break;
            case "__localeDataType":
                if (Google_User.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__localeDataType);
                }
                break;
            case "locale":
                return ZVal.isNull(this.locale);
            case "__blogsType":
                if (Google_User.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__blogsType);
                }
                break;
            case "__blogsDataType":
                if (Google_User.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__blogsDataType);
                }
                break;
            case "blogs":
                return ZVal.isNull(this.blogs);
            case "kind":
                return ZVal.isNull(this.kind);
            case "url":
                return ZVal.isNull(this.url);
            case "id":
                return ZVal.isNull(this.id);
            case "selfLink":
                return ZVal.isNull(this.selfLink);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "about":
                this.about = value;
                break;
            case "displayName":
                this.displayName = value;
                break;
            case "created":
                this.created = value;
                break;
            case "__localeType":
                if (Google_User.class.isAssignableFrom(caller)) {

                    this.__localeType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__localeDataType":
                if (Google_User.class.isAssignableFrom(caller)) {

                    this.__localeDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "locale":
                this.locale = value;
                break;
            case "__blogsType":
                if (Google_User.class.isAssignableFrom(caller)) {

                    this.__blogsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__blogsDataType":
                if (Google_User.class.isAssignableFrom(caller)) {

                    this.__blogsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "blogs":
                this.blogs = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "url":
                this.url = value;
                break;
            case "id":
                this.id = value;
                break;
            case "selfLink":
                this.selfLink = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setAbout(RuntimeEnv env, Object... args) {
        Object about = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_User.class, "about", about);

        return null;
    }

    public Object getAbout(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_User.class, "about"));
    }

    public Object setDisplayName(RuntimeEnv env, Object... args) {
        Object displayName = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_User.class, "displayName", displayName);

        return null;
    }

    public Object getDisplayName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_User.class, "displayName"));
    }

    public Object setCreated(RuntimeEnv env, Object... args) {
        Object created = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_User.class, "created", created);

        return null;
    }

    public Object getCreated(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_User.class, "created"));
    }

    public Object setLocale(RuntimeEnv env, Object... args) {
        Object locale = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_User.class, "locale", locale);

        return null;
    }

    public Object getLocale(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_User.class, "locale"));
    }

    public Object setBlogs(RuntimeEnv env, Object... args) {
        Object blogs = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_User.class, "blogs", blogs);

        return null;
    }

    public Object getBlogs(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_User.class, "blogs"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_User.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_User.class, "kind"));
    }

    public Object setUrl(RuntimeEnv env, Object... args) {
        Object url = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_User.class, "url", url);

        return null;
    }

    public Object getUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_User.class, "url"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_User.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_User.class, "id"));
    }

    public Object setSelfLink(RuntimeEnv env, Object... args) {
        Object selfLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_User.class, "selfLink", selfLink);

        return null;
    }

    public Object getSelfLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_User.class, "selfLink"));
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
