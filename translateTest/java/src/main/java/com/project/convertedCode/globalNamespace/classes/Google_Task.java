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

 google-api-php-client/src/contrib/Google_TasksService.php

*/

public class Google_Task extends Google_Model implements RuntimeFileContextInterface {

    public Object status = null;

    public Object kind = null;

    public Object updated = null;

    public Object parent = null;

    public Object __linksType = "Google_TaskLinks";

    public Object __linksDataType = "array";

    public Object links = null;

    public Object title = null;

    public Object deleted = null;

    public Object completed = null;

    public Object due = null;

    public Object etag = null;

    public Object notes = null;

    public Object position = null;

    public Object hidden = null;

    public Object id = null;

    public Object selfLink = null;

    public Google_Task(RuntimeEnv env, Object... args) {
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
            case "setStatus":
                return this.setStatus(env, args);
            case "getStatus":
                return this.getStatus(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setUpdated":
                return this.setUpdated(env, args);
            case "getUpdated":
                return this.getUpdated(env, args);
            case "setParent":
                return this.setParent(env, args);
            case "getParent":
                return this.getParent(env, args);
            case "setLinks":
                return this.setLinks(env, args);
            case "getLinks":
                return this.getLinks(env, args);
            case "setTitle":
                return this.setTitle(env, args);
            case "getTitle":
                return this.getTitle(env, args);
            case "setDeleted":
                return this.setDeleted(env, args);
            case "getDeleted":
                return this.getDeleted(env, args);
            case "setCompleted":
                return this.setCompleted(env, args);
            case "getCompleted":
                return this.getCompleted(env, args);
            case "setDue":
                return this.setDue(env, args);
            case "getDue":
                return this.getDue(env, args);
            case "setEtag":
                return this.setEtag(env, args);
            case "getEtag":
                return this.getEtag(env, args);
            case "setNotes":
                return this.setNotes(env, args);
            case "getNotes":
                return this.getNotes(env, args);
            case "setPosition":
                return this.setPosition(env, args);
            case "getPosition":
                return this.getPosition(env, args);
            case "setHidden":
                return this.setHidden(env, args);
            case "getHidden":
                return this.getHidden(env, args);
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
            case "status":
                return this.status;
            case "kind":
                return this.kind;
            case "updated":
                return this.updated;
            case "parent":
                return this.parent;
            case "__linksType":
                if (Google_Task.class.isAssignableFrom(caller)) {

                    return this.__linksType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__linksDataType":
                if (Google_Task.class.isAssignableFrom(caller)) {

                    return this.__linksDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "links":
                return this.links;
            case "title":
                return this.title;
            case "deleted":
                return this.deleted;
            case "completed":
                return this.completed;
            case "due":
                return this.due;
            case "etag":
                return this.etag;
            case "notes":
                return this.notes;
            case "position":
                return this.position;
            case "hidden":
                return this.hidden;
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
            case "status":
                return ZVal.isNull(this.status);
            case "kind":
                return ZVal.isNull(this.kind);
            case "updated":
                return ZVal.isNull(this.updated);
            case "parent":
                return ZVal.isNull(this.parent);
            case "__linksType":
                if (Google_Task.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__linksType);
                }
                break;
            case "__linksDataType":
                if (Google_Task.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__linksDataType);
                }
                break;
            case "links":
                return ZVal.isNull(this.links);
            case "title":
                return ZVal.isNull(this.title);
            case "deleted":
                return ZVal.isNull(this.deleted);
            case "completed":
                return ZVal.isNull(this.completed);
            case "due":
                return ZVal.isNull(this.due);
            case "etag":
                return ZVal.isNull(this.etag);
            case "notes":
                return ZVal.isNull(this.notes);
            case "position":
                return ZVal.isNull(this.position);
            case "hidden":
                return ZVal.isNull(this.hidden);
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
            case "status":
                this.status = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "updated":
                this.updated = value;
                break;
            case "parent":
                this.parent = value;
                break;
            case "__linksType":
                if (Google_Task.class.isAssignableFrom(caller)) {

                    this.__linksType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__linksDataType":
                if (Google_Task.class.isAssignableFrom(caller)) {

                    this.__linksDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "links":
                this.links = value;
                break;
            case "title":
                this.title = value;
                break;
            case "deleted":
                this.deleted = value;
                break;
            case "completed":
                this.completed = value;
                break;
            case "due":
                this.due = value;
                break;
            case "etag":
                this.etag = value;
                break;
            case "notes":
                this.notes = value;
                break;
            case "position":
                this.position = value;
                break;
            case "hidden":
                this.hidden = value;
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

    public Object setStatus(RuntimeEnv env, Object... args) {
        Object status = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Task.class, "status", status);

        return null;
    }

    public Object getStatus(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Task.class, "status"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Task.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Task.class, "kind"));
    }

    public Object setUpdated(RuntimeEnv env, Object... args) {
        Object updated = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Task.class, "updated", updated);

        return null;
    }

    public Object getUpdated(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Task.class, "updated"));
    }

    public Object setParent(RuntimeEnv env, Object... args) {
        Object parent = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Task.class, "parent", parent);

        return null;
    }

    public Object getParent(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Task.class, "parent"));
    }

    public Object setLinks(RuntimeEnv env, Object... args) {
        Object links = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this, "assertIsArray", Google_Task.class, links, "Google_TaskLinks", "setLinks");
        ZVal.setProperty(this, Google_Task.class, "links", links);

        return null;
    }

    public Object getLinks(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Task.class, "links"));
    }

    public Object setTitle(RuntimeEnv env, Object... args) {
        Object title = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Task.class, "title", title);

        return null;
    }

    public Object getTitle(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Task.class, "title"));
    }

    public Object setDeleted(RuntimeEnv env, Object... args) {
        Object deleted = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Task.class, "deleted", deleted);

        return null;
    }

    public Object getDeleted(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Task.class, "deleted"));
    }

    public Object setCompleted(RuntimeEnv env, Object... args) {
        Object completed = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Task.class, "completed", completed);

        return null;
    }

    public Object getCompleted(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Task.class, "completed"));
    }

    public Object setDue(RuntimeEnv env, Object... args) {
        Object due = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Task.class, "due", due);

        return null;
    }

    public Object getDue(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Task.class, "due"));
    }

    public Object setEtag(RuntimeEnv env, Object... args) {
        Object etag = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Task.class, "etag", etag);

        return null;
    }

    public Object getEtag(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Task.class, "etag"));
    }

    public Object setNotes(RuntimeEnv env, Object... args) {
        Object notes = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Task.class, "notes", notes);

        return null;
    }

    public Object getNotes(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Task.class, "notes"));
    }

    public Object setPosition(RuntimeEnv env, Object... args) {
        Object position = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Task.class, "position", position);

        return null;
    }

    public Object getPosition(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Task.class, "position"));
    }

    public Object setHidden(RuntimeEnv env, Object... args) {
        Object hidden = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Task.class, "hidden", hidden);

        return null;
    }

    public Object getHidden(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Task.class, "hidden"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Task.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Task.class, "id"));
    }

    public Object setSelfLink(RuntimeEnv env, Object... args) {
        Object selfLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Task.class, "selfLink", selfLink);

        return null;
    }

    public Object getSelfLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Task.class, "selfLink"));
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
