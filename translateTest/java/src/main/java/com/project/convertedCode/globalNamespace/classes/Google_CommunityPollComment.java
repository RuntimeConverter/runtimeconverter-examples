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

public class Google_CommunityPollComment extends Google_Model
        implements RuntimeFileContextInterface {

    public Object body = null;

    public Object kind = null;

    public Object addedDate = null;

    public Object id = null;

    public Object __authorType = "Google_OrkutAuthorResource";

    public Object __authorDataType = "";

    public Object author = null;

    public Google_CommunityPollComment(RuntimeEnv env, Object... args) {
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
            case "setBody":
                return this.setBody(env, args);
            case "getBody":
                return this.getBody(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setAddedDate":
                return this.setAddedDate(env, args);
            case "getAddedDate":
                return this.getAddedDate(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setAuthor":
                return this.setAuthor(env, args);
            case "getAuthor":
                return this.getAuthor(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "body":
                return this.body;
            case "kind":
                return this.kind;
            case "addedDate":
                return this.addedDate;
            case "id":
                return this.id;
            case "__authorType":
                if (Google_CommunityPollComment.class.isAssignableFrom(caller)) {

                    return this.__authorType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__authorDataType":
                if (Google_CommunityPollComment.class.isAssignableFrom(caller)) {

                    return this.__authorDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "author":
                return this.author;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "body":
                return ZVal.isNull(this.body);
            case "kind":
                return ZVal.isNull(this.kind);
            case "addedDate":
                return ZVal.isNull(this.addedDate);
            case "id":
                return ZVal.isNull(this.id);
            case "__authorType":
                if (Google_CommunityPollComment.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__authorType);
                }
                break;
            case "__authorDataType":
                if (Google_CommunityPollComment.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__authorDataType);
                }
                break;
            case "author":
                return ZVal.isNull(this.author);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "body":
                this.body = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "addedDate":
                this.addedDate = value;
                break;
            case "id":
                this.id = value;
                break;
            case "__authorType":
                if (Google_CommunityPollComment.class.isAssignableFrom(caller)) {

                    this.__authorType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__authorDataType":
                if (Google_CommunityPollComment.class.isAssignableFrom(caller)) {

                    this.__authorDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "author":
                this.author = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setBody(RuntimeEnv env, Object... args) {
        Object body = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityPollComment.class, "body", body);

        return null;
    }

    public Object getBody(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityPollComment.class, "body"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityPollComment.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityPollComment.class, "kind"));
    }

    public Object setAddedDate(RuntimeEnv env, Object... args) {
        Object addedDate = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityPollComment.class, "addedDate", addedDate);

        return null;
    }

    public Object getAddedDate(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityPollComment.class, "addedDate"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityPollComment.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityPollComment.class, "id"));
    }

    public Object setAuthor(RuntimeEnv env, Object... args) {
        Object author = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityPollComment.class, "author", author);

        return null;
    }

    public Object getAuthor(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityPollComment.class, "author"));
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
