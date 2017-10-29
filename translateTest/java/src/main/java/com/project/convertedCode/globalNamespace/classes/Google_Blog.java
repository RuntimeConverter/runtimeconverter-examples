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

public class Google_Blog extends Google_Model implements RuntimeFileContextInterface {

    public Object kind = null;

    public Object description = null;

    public Object __localeType = "Google_BlogLocale";

    public Object __localeDataType = "";

    public Object locale = null;

    public Object __postsType = "Google_BlogPosts";

    public Object __postsDataType = "";

    public Object posts = null;

    public Object customMetaData = null;

    public Object updated = null;

    public Object __pagesType = "Google_BlogPages";

    public Object __pagesDataType = "";

    public Object pages = null;

    public Object url = null;

    public Object published = null;

    public Object id = null;

    public Object selfLink = null;

    public Object name = null;

    public Google_Blog(RuntimeEnv env, Object... args) {
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
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setDescription":
                return this.setDescription(env, args);
            case "getDescription":
                return this.getDescription(env, args);
            case "setLocale":
                return this.setLocale(env, args);
            case "getLocale":
                return this.getLocale(env, args);
            case "setPosts":
                return this.setPosts(env, args);
            case "getPosts":
                return this.getPosts(env, args);
            case "setCustomMetaData":
                return this.setCustomMetaData(env, args);
            case "getCustomMetaData":
                return this.getCustomMetaData(env, args);
            case "setUpdated":
                return this.setUpdated(env, args);
            case "getUpdated":
                return this.getUpdated(env, args);
            case "setPages":
                return this.setPages(env, args);
            case "getPages":
                return this.getPages(env, args);
            case "setUrl":
                return this.setUrl(env, args);
            case "getUrl":
                return this.getUrl(env, args);
            case "setPublished":
                return this.setPublished(env, args);
            case "getPublished":
                return this.getPublished(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setSelfLink":
                return this.setSelfLink(env, args);
            case "getSelfLink":
                return this.getSelfLink(env, args);
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
            case "kind":
                return this.kind;
            case "description":
                return this.description;
            case "__localeType":
                if (Google_Blog.class.isAssignableFrom(caller)) {

                    return this.__localeType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__localeDataType":
                if (Google_Blog.class.isAssignableFrom(caller)) {

                    return this.__localeDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "locale":
                return this.locale;
            case "__postsType":
                if (Google_Blog.class.isAssignableFrom(caller)) {

                    return this.__postsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__postsDataType":
                if (Google_Blog.class.isAssignableFrom(caller)) {

                    return this.__postsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "posts":
                return this.posts;
            case "customMetaData":
                return this.customMetaData;
            case "updated":
                return this.updated;
            case "__pagesType":
                if (Google_Blog.class.isAssignableFrom(caller)) {

                    return this.__pagesType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__pagesDataType":
                if (Google_Blog.class.isAssignableFrom(caller)) {

                    return this.__pagesDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "pages":
                return this.pages;
            case "url":
                return this.url;
            case "published":
                return this.published;
            case "id":
                return this.id;
            case "selfLink":
                return this.selfLink;
            case "name":
                return this.name;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return ZVal.isNull(this.kind);
            case "description":
                return ZVal.isNull(this.description);
            case "__localeType":
                if (Google_Blog.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__localeType);
                }
                break;
            case "__localeDataType":
                if (Google_Blog.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__localeDataType);
                }
                break;
            case "locale":
                return ZVal.isNull(this.locale);
            case "__postsType":
                if (Google_Blog.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__postsType);
                }
                break;
            case "__postsDataType":
                if (Google_Blog.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__postsDataType);
                }
                break;
            case "posts":
                return ZVal.isNull(this.posts);
            case "customMetaData":
                return ZVal.isNull(this.customMetaData);
            case "updated":
                return ZVal.isNull(this.updated);
            case "__pagesType":
                if (Google_Blog.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__pagesType);
                }
                break;
            case "__pagesDataType":
                if (Google_Blog.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__pagesDataType);
                }
                break;
            case "pages":
                return ZVal.isNull(this.pages);
            case "url":
                return ZVal.isNull(this.url);
            case "published":
                return ZVal.isNull(this.published);
            case "id":
                return ZVal.isNull(this.id);
            case "selfLink":
                return ZVal.isNull(this.selfLink);
            case "name":
                return ZVal.isNull(this.name);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                this.kind = value;
                break;
            case "description":
                this.description = value;
                break;
            case "__localeType":
                if (Google_Blog.class.isAssignableFrom(caller)) {

                    this.__localeType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__localeDataType":
                if (Google_Blog.class.isAssignableFrom(caller)) {

                    this.__localeDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "locale":
                this.locale = value;
                break;
            case "__postsType":
                if (Google_Blog.class.isAssignableFrom(caller)) {

                    this.__postsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__postsDataType":
                if (Google_Blog.class.isAssignableFrom(caller)) {

                    this.__postsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "posts":
                this.posts = value;
                break;
            case "customMetaData":
                this.customMetaData = value;
                break;
            case "updated":
                this.updated = value;
                break;
            case "__pagesType":
                if (Google_Blog.class.isAssignableFrom(caller)) {

                    this.__pagesType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__pagesDataType":
                if (Google_Blog.class.isAssignableFrom(caller)) {

                    this.__pagesDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "pages":
                this.pages = value;
                break;
            case "url":
                this.url = value;
                break;
            case "published":
                this.published = value;
                break;
            case "id":
                this.id = value;
                break;
            case "selfLink":
                this.selfLink = value;
                break;
            case "name":
                this.name = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Blog.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Blog.class, "kind"));
    }

    public Object setDescription(RuntimeEnv env, Object... args) {
        Object description = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Blog.class, "description", description);

        return null;
    }

    public Object getDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Blog.class, "description"));
    }

    public Object setLocale(RuntimeEnv env, Object... args) {
        Object locale = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Blog.class, "locale", locale);

        return null;
    }

    public Object getLocale(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Blog.class, "locale"));
    }

    public Object setPosts(RuntimeEnv env, Object... args) {
        Object posts = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Blog.class, "posts", posts);

        return null;
    }

    public Object getPosts(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Blog.class, "posts"));
    }

    public Object setCustomMetaData(RuntimeEnv env, Object... args) {
        Object customMetaData = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Blog.class, "customMetaData", customMetaData);

        return null;
    }

    public Object getCustomMetaData(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Blog.class, "customMetaData"));
    }

    public Object setUpdated(RuntimeEnv env, Object... args) {
        Object updated = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Blog.class, "updated", updated);

        return null;
    }

    public Object getUpdated(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Blog.class, "updated"));
    }

    public Object setPages(RuntimeEnv env, Object... args) {
        Object pages = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Blog.class, "pages", pages);

        return null;
    }

    public Object getPages(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Blog.class, "pages"));
    }

    public Object setUrl(RuntimeEnv env, Object... args) {
        Object url = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Blog.class, "url", url);

        return null;
    }

    public Object getUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Blog.class, "url"));
    }

    public Object setPublished(RuntimeEnv env, Object... args) {
        Object published = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Blog.class, "published", published);

        return null;
    }

    public Object getPublished(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Blog.class, "published"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Blog.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Blog.class, "id"));
    }

    public Object setSelfLink(RuntimeEnv env, Object... args) {
        Object selfLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Blog.class, "selfLink", selfLink);

        return null;
    }

    public Object getSelfLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Blog.class, "selfLink"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Blog.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Blog.class, "name"));
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
