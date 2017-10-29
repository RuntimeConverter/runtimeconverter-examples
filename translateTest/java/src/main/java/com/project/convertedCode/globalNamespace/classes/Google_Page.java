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

public class Google_Page extends Google_Model implements RuntimeFileContextInterface {

    public Object content = null;

    public Object kind = null;

    public Object __authorType = "Google_PageAuthor";

    public Object __authorDataType = "";

    public Object author = null;

    public Object url = null;

    public Object title = null;

    public Object updated = null;

    public Object __blogType = "Google_PageBlog";

    public Object __blogDataType = "";

    public Object blog = null;

    public Object published = null;

    public Object id = null;

    public Object selfLink = null;

    public Google_Page(RuntimeEnv env, Object... args) {
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
            case "setContent":
                return this.setContent(env, args);
            case "getContent":
                return this.getContent(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setAuthor":
                return this.setAuthor(env, args);
            case "getAuthor":
                return this.getAuthor(env, args);
            case "setUrl":
                return this.setUrl(env, args);
            case "getUrl":
                return this.getUrl(env, args);
            case "setTitle":
                return this.setTitle(env, args);
            case "getTitle":
                return this.getTitle(env, args);
            case "setUpdated":
                return this.setUpdated(env, args);
            case "getUpdated":
                return this.getUpdated(env, args);
            case "setBlog":
                return this.setBlog(env, args);
            case "getBlog":
                return this.getBlog(env, args);
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
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "content":
                return this.content;
            case "kind":
                return this.kind;
            case "__authorType":
                if (Google_Page.class.isAssignableFrom(caller)) {

                    return this.__authorType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__authorDataType":
                if (Google_Page.class.isAssignableFrom(caller)) {

                    return this.__authorDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "author":
                return this.author;
            case "url":
                return this.url;
            case "title":
                return this.title;
            case "updated":
                return this.updated;
            case "__blogType":
                if (Google_Page.class.isAssignableFrom(caller)) {

                    return this.__blogType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__blogDataType":
                if (Google_Page.class.isAssignableFrom(caller)) {

                    return this.__blogDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "blog":
                return this.blog;
            case "published":
                return this.published;
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
            case "content":
                return ZVal.isNull(this.content);
            case "kind":
                return ZVal.isNull(this.kind);
            case "__authorType":
                if (Google_Page.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__authorType);
                }
                break;
            case "__authorDataType":
                if (Google_Page.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__authorDataType);
                }
                break;
            case "author":
                return ZVal.isNull(this.author);
            case "url":
                return ZVal.isNull(this.url);
            case "title":
                return ZVal.isNull(this.title);
            case "updated":
                return ZVal.isNull(this.updated);
            case "__blogType":
                if (Google_Page.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__blogType);
                }
                break;
            case "__blogDataType":
                if (Google_Page.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__blogDataType);
                }
                break;
            case "blog":
                return ZVal.isNull(this.blog);
            case "published":
                return ZVal.isNull(this.published);
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
            case "content":
                this.content = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "__authorType":
                if (Google_Page.class.isAssignableFrom(caller)) {

                    this.__authorType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__authorDataType":
                if (Google_Page.class.isAssignableFrom(caller)) {

                    this.__authorDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "author":
                this.author = value;
                break;
            case "url":
                this.url = value;
                break;
            case "title":
                this.title = value;
                break;
            case "updated":
                this.updated = value;
                break;
            case "__blogType":
                if (Google_Page.class.isAssignableFrom(caller)) {

                    this.__blogType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__blogDataType":
                if (Google_Page.class.isAssignableFrom(caller)) {

                    this.__blogDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "blog":
                this.blog = value;
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
        }
        super.__set(key, value, caller);
    }

    public Object setContent(RuntimeEnv env, Object... args) {
        Object content = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Page.class, "content", content);

        return null;
    }

    public Object getContent(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Page.class, "content"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Page.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Page.class, "kind"));
    }

    public Object setAuthor(RuntimeEnv env, Object... args) {
        Object author = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Page.class, "author", author);

        return null;
    }

    public Object getAuthor(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Page.class, "author"));
    }

    public Object setUrl(RuntimeEnv env, Object... args) {
        Object url = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Page.class, "url", url);

        return null;
    }

    public Object getUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Page.class, "url"));
    }

    public Object setTitle(RuntimeEnv env, Object... args) {
        Object title = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Page.class, "title", title);

        return null;
    }

    public Object getTitle(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Page.class, "title"));
    }

    public Object setUpdated(RuntimeEnv env, Object... args) {
        Object updated = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Page.class, "updated", updated);

        return null;
    }

    public Object getUpdated(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Page.class, "updated"));
    }

    public Object setBlog(RuntimeEnv env, Object... args) {
        Object blog = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Page.class, "blog", blog);

        return null;
    }

    public Object getBlog(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Page.class, "blog"));
    }

    public Object setPublished(RuntimeEnv env, Object... args) {
        Object published = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Page.class, "published", published);

        return null;
    }

    public Object getPublished(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Page.class, "published"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Page.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Page.class, "id"));
    }

    public Object setSelfLink(RuntimeEnv env, Object... args) {
        Object selfLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Page.class, "selfLink", selfLink);

        return null;
    }

    public Object getSelfLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Page.class, "selfLink"));
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
