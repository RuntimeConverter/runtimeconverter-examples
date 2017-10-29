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

public class Google_CommunityTopic extends Google_Model implements RuntimeFileContextInterface {

    public Object body = null;

    public Object lastUpdate = null;

    public Object kind = null;

    public Object __linksType = "Google_OrkutLinkResource";

    public Object __linksDataType = "array";

    public Object links = null;

    public Object __authorType = "Google_OrkutAuthorResource";

    public Object __authorDataType = "";

    public Object author = null;

    public Object title = null;

    public Object __messagesType = "Google_CommunityMessage";

    public Object __messagesDataType = "array";

    public Object messages = null;

    public Object latestMessageSnippet = null;

    public Object isClosed = null;

    public Object numberOfReplies = null;

    public Object id = null;

    public Google_CommunityTopic(RuntimeEnv env, Object... args) {
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
            case "setLastUpdate":
                return this.setLastUpdate(env, args);
            case "getLastUpdate":
                return this.getLastUpdate(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setLinks":
                return this.setLinks(env, args);
            case "getLinks":
                return this.getLinks(env, args);
            case "setAuthor":
                return this.setAuthor(env, args);
            case "getAuthor":
                return this.getAuthor(env, args);
            case "setTitle":
                return this.setTitle(env, args);
            case "getTitle":
                return this.getTitle(env, args);
            case "setMessages":
                return this.setMessages(env, args);
            case "getMessages":
                return this.getMessages(env, args);
            case "setLatestMessageSnippet":
                return this.setLatestMessageSnippet(env, args);
            case "getLatestMessageSnippet":
                return this.getLatestMessageSnippet(env, args);
            case "setIsClosed":
                return this.setIsClosed(env, args);
            case "getIsClosed":
                return this.getIsClosed(env, args);
            case "setNumberOfReplies":
                return this.setNumberOfReplies(env, args);
            case "getNumberOfReplies":
                return this.getNumberOfReplies(env, args);
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
            case "body":
                return this.body;
            case "lastUpdate":
                return this.lastUpdate;
            case "kind":
                return this.kind;
            case "__linksType":
                if (Google_CommunityTopic.class.isAssignableFrom(caller)) {

                    return this.__linksType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__linksDataType":
                if (Google_CommunityTopic.class.isAssignableFrom(caller)) {

                    return this.__linksDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "links":
                return this.links;
            case "__authorType":
                if (Google_CommunityTopic.class.isAssignableFrom(caller)) {

                    return this.__authorType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__authorDataType":
                if (Google_CommunityTopic.class.isAssignableFrom(caller)) {

                    return this.__authorDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "author":
                return this.author;
            case "title":
                return this.title;
            case "__messagesType":
                if (Google_CommunityTopic.class.isAssignableFrom(caller)) {

                    return this.__messagesType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__messagesDataType":
                if (Google_CommunityTopic.class.isAssignableFrom(caller)) {

                    return this.__messagesDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "messages":
                return this.messages;
            case "latestMessageSnippet":
                return this.latestMessageSnippet;
            case "isClosed":
                return this.isClosed;
            case "numberOfReplies":
                return this.numberOfReplies;
            case "id":
                return this.id;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "body":
                return ZVal.isNull(this.body);
            case "lastUpdate":
                return ZVal.isNull(this.lastUpdate);
            case "kind":
                return ZVal.isNull(this.kind);
            case "__linksType":
                if (Google_CommunityTopic.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__linksType);
                }
                break;
            case "__linksDataType":
                if (Google_CommunityTopic.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__linksDataType);
                }
                break;
            case "links":
                return ZVal.isNull(this.links);
            case "__authorType":
                if (Google_CommunityTopic.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__authorType);
                }
                break;
            case "__authorDataType":
                if (Google_CommunityTopic.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__authorDataType);
                }
                break;
            case "author":
                return ZVal.isNull(this.author);
            case "title":
                return ZVal.isNull(this.title);
            case "__messagesType":
                if (Google_CommunityTopic.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__messagesType);
                }
                break;
            case "__messagesDataType":
                if (Google_CommunityTopic.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__messagesDataType);
                }
                break;
            case "messages":
                return ZVal.isNull(this.messages);
            case "latestMessageSnippet":
                return ZVal.isNull(this.latestMessageSnippet);
            case "isClosed":
                return ZVal.isNull(this.isClosed);
            case "numberOfReplies":
                return ZVal.isNull(this.numberOfReplies);
            case "id":
                return ZVal.isNull(this.id);
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
            case "lastUpdate":
                this.lastUpdate = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "__linksType":
                if (Google_CommunityTopic.class.isAssignableFrom(caller)) {

                    this.__linksType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__linksDataType":
                if (Google_CommunityTopic.class.isAssignableFrom(caller)) {

                    this.__linksDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "links":
                this.links = value;
                break;
            case "__authorType":
                if (Google_CommunityTopic.class.isAssignableFrom(caller)) {

                    this.__authorType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__authorDataType":
                if (Google_CommunityTopic.class.isAssignableFrom(caller)) {

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
            case "__messagesType":
                if (Google_CommunityTopic.class.isAssignableFrom(caller)) {

                    this.__messagesType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__messagesDataType":
                if (Google_CommunityTopic.class.isAssignableFrom(caller)) {

                    this.__messagesDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "messages":
                this.messages = value;
                break;
            case "latestMessageSnippet":
                this.latestMessageSnippet = value;
                break;
            case "isClosed":
                this.isClosed = value;
                break;
            case "numberOfReplies":
                this.numberOfReplies = value;
                break;
            case "id":
                this.id = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setBody(RuntimeEnv env, Object... args) {
        Object body = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityTopic.class, "body", body);

        return null;
    }

    public Object getBody(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityTopic.class, "body"));
    }

    public Object setLastUpdate(RuntimeEnv env, Object... args) {
        Object lastUpdate = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityTopic.class, "lastUpdate", lastUpdate);

        return null;
    }

    public Object getLastUpdate(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityTopic.class, "lastUpdate"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityTopic.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityTopic.class, "kind"));
    }

    public Object setLinks(RuntimeEnv env, Object... args) {
        Object links = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_CommunityTopic.class,
                links,
                "Google_OrkutLinkResource",
                "setLinks");
        ZVal.setProperty(this, Google_CommunityTopic.class, "links", links);

        return null;
    }

    public Object getLinks(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityTopic.class, "links"));
    }

    public Object setAuthor(RuntimeEnv env, Object... args) {
        Object author = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityTopic.class, "author", author);

        return null;
    }

    public Object getAuthor(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityTopic.class, "author"));
    }

    public Object setTitle(RuntimeEnv env, Object... args) {
        Object title = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityTopic.class, "title", title);

        return null;
    }

    public Object getTitle(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityTopic.class, "title"));
    }

    public Object setMessages(RuntimeEnv env, Object... args) {
        Object messages = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_CommunityTopic.class,
                messages,
                "Google_CommunityMessage",
                "setMessages");
        ZVal.setProperty(this, Google_CommunityTopic.class, "messages", messages);

        return null;
    }

    public Object getMessages(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityTopic.class, "messages"));
    }

    public Object setLatestMessageSnippet(RuntimeEnv env, Object... args) {
        Object latestMessageSnippet = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_CommunityTopic.class, "latestMessageSnippet", latestMessageSnippet);

        return null;
    }

    public Object getLatestMessageSnippet(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_CommunityTopic.class, "latestMessageSnippet"));
    }

    public Object setIsClosed(RuntimeEnv env, Object... args) {
        Object isClosed = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityTopic.class, "isClosed", isClosed);

        return null;
    }

    public Object getIsClosed(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityTopic.class, "isClosed"));
    }

    public Object setNumberOfReplies(RuntimeEnv env, Object... args) {
        Object numberOfReplies = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityTopic.class, "numberOfReplies", numberOfReplies);

        return null;
    }

    public Object getNumberOfReplies(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityTopic.class, "numberOfReplies"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityTopic.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityTopic.class, "id"));
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
