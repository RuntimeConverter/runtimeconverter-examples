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

 google-api-php-client/src/contrib/Google_BooksService.php

*/

public class Google_Review extends Google_Model implements RuntimeFileContextInterface {

    public Object rating = null;

    public Object kind = null;

    public Object __authorType = "Google_ReviewAuthor";

    public Object __authorDataType = "";

    public Object author = null;

    public Object title = null;

    public Object volumeId = null;

    public Object content = null;

    public Object __sourceType = "Google_ReviewSource";

    public Object __sourceDataType = "";

    public Object source = null;

    public Object date = null;

    public Object type = null;

    public Object fullTextUrl = null;

    public Google_Review(RuntimeEnv env, Object... args) {
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
            case "setRating":
                return this.setRating(env, args);
            case "getRating":
                return this.getRating(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setAuthor":
                return this.setAuthor(env, args);
            case "getAuthor":
                return this.getAuthor(env, args);
            case "setTitle":
                return this.setTitle(env, args);
            case "getTitle":
                return this.getTitle(env, args);
            case "setVolumeId":
                return this.setVolumeId(env, args);
            case "getVolumeId":
                return this.getVolumeId(env, args);
            case "setContent":
                return this.setContent(env, args);
            case "getContent":
                return this.getContent(env, args);
            case "setSource":
                return this.setSource(env, args);
            case "getSource":
                return this.getSource(env, args);
            case "setDate":
                return this.setDate(env, args);
            case "getDate":
                return this.getDate(env, args);
            case "setType":
                return this.setType(env, args);
            case "getType":
                return this.getType(env, args);
            case "setFullTextUrl":
                return this.setFullTextUrl(env, args);
            case "getFullTextUrl":
                return this.getFullTextUrl(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "rating":
                return this.rating;
            case "kind":
                return this.kind;
            case "__authorType":
                if (Google_Review.class.isAssignableFrom(caller)) {

                    return this.__authorType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__authorDataType":
                if (Google_Review.class.isAssignableFrom(caller)) {

                    return this.__authorDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "author":
                return this.author;
            case "title":
                return this.title;
            case "volumeId":
                return this.volumeId;
            case "content":
                return this.content;
            case "__sourceType":
                if (Google_Review.class.isAssignableFrom(caller)) {

                    return this.__sourceType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__sourceDataType":
                if (Google_Review.class.isAssignableFrom(caller)) {

                    return this.__sourceDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "source":
                return this.source;
            case "date":
                return this.date;
            case "type":
                return this.type;
            case "fullTextUrl":
                return this.fullTextUrl;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "rating":
                return ZVal.isNull(this.rating);
            case "kind":
                return ZVal.isNull(this.kind);
            case "__authorType":
                if (Google_Review.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__authorType);
                }
                break;
            case "__authorDataType":
                if (Google_Review.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__authorDataType);
                }
                break;
            case "author":
                return ZVal.isNull(this.author);
            case "title":
                return ZVal.isNull(this.title);
            case "volumeId":
                return ZVal.isNull(this.volumeId);
            case "content":
                return ZVal.isNull(this.content);
            case "__sourceType":
                if (Google_Review.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__sourceType);
                }
                break;
            case "__sourceDataType":
                if (Google_Review.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__sourceDataType);
                }
                break;
            case "source":
                return ZVal.isNull(this.source);
            case "date":
                return ZVal.isNull(this.date);
            case "type":
                return ZVal.isNull(this.type);
            case "fullTextUrl":
                return ZVal.isNull(this.fullTextUrl);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "rating":
                this.rating = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "__authorType":
                if (Google_Review.class.isAssignableFrom(caller)) {

                    this.__authorType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__authorDataType":
                if (Google_Review.class.isAssignableFrom(caller)) {

                    this.__authorDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "author":
                this.author = value;
                break;
            case "title":
                this.title = value;
                break;
            case "volumeId":
                this.volumeId = value;
                break;
            case "content":
                this.content = value;
                break;
            case "__sourceType":
                if (Google_Review.class.isAssignableFrom(caller)) {

                    this.__sourceType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__sourceDataType":
                if (Google_Review.class.isAssignableFrom(caller)) {

                    this.__sourceDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "source":
                this.source = value;
                break;
            case "date":
                this.date = value;
                break;
            case "type":
                this.type = value;
                break;
            case "fullTextUrl":
                this.fullTextUrl = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setRating(RuntimeEnv env, Object... args) {
        Object rating = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Review.class, "rating", rating);

        return null;
    }

    public Object getRating(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Review.class, "rating"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Review.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Review.class, "kind"));
    }

    public Object setAuthor(RuntimeEnv env, Object... args) {
        Object author = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Review.class, "author", author);

        return null;
    }

    public Object getAuthor(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Review.class, "author"));
    }

    public Object setTitle(RuntimeEnv env, Object... args) {
        Object title = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Review.class, "title", title);

        return null;
    }

    public Object getTitle(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Review.class, "title"));
    }

    public Object setVolumeId(RuntimeEnv env, Object... args) {
        Object volumeId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Review.class, "volumeId", volumeId);

        return null;
    }

    public Object getVolumeId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Review.class, "volumeId"));
    }

    public Object setContent(RuntimeEnv env, Object... args) {
        Object content = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Review.class, "content", content);

        return null;
    }

    public Object getContent(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Review.class, "content"));
    }

    public Object setSource(RuntimeEnv env, Object... args) {
        Object source = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Review.class, "source", source);

        return null;
    }

    public Object getSource(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Review.class, "source"));
    }

    public Object setDate(RuntimeEnv env, Object... args) {
        Object date = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Review.class, "date", date);

        return null;
    }

    public Object getDate(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Review.class, "date"));
    }

    public Object setType(RuntimeEnv env, Object... args) {
        Object type = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Review.class, "type", type);

        return null;
    }

    public Object getType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Review.class, "type"));
    }

    public Object setFullTextUrl(RuntimeEnv env, Object... args) {
        Object fullTextUrl = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Review.class, "fullTextUrl", fullTextUrl);

        return null;
    }

    public Object getFullTextUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Review.class, "fullTextUrl"));
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
