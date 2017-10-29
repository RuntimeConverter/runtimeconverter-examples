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

public class Google_Bookshelf extends Google_Model implements RuntimeFileContextInterface {

    public Object kind = null;

    public Object description = null;

    public Object created = null;

    public Object volumeCount = null;

    public Object title = null;

    public Object updated = null;

    public Object access = null;

    public Object volumesLastUpdated = null;

    public Object id = null;

    public Object selfLink = null;

    public Google_Bookshelf(RuntimeEnv env, Object... args) {
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
            case "setCreated":
                return this.setCreated(env, args);
            case "getCreated":
                return this.getCreated(env, args);
            case "setVolumeCount":
                return this.setVolumeCount(env, args);
            case "getVolumeCount":
                return this.getVolumeCount(env, args);
            case "setTitle":
                return this.setTitle(env, args);
            case "getTitle":
                return this.getTitle(env, args);
            case "setUpdated":
                return this.setUpdated(env, args);
            case "getUpdated":
                return this.getUpdated(env, args);
            case "setAccess":
                return this.setAccess(env, args);
            case "getAccess":
                return this.getAccess(env, args);
            case "setVolumesLastUpdated":
                return this.setVolumesLastUpdated(env, args);
            case "getVolumesLastUpdated":
                return this.getVolumesLastUpdated(env, args);
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
            case "kind":
                return this.kind;
            case "description":
                return this.description;
            case "created":
                return this.created;
            case "volumeCount":
                return this.volumeCount;
            case "title":
                return this.title;
            case "updated":
                return this.updated;
            case "access":
                return this.access;
            case "volumesLastUpdated":
                return this.volumesLastUpdated;
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
            case "kind":
                return ZVal.isNull(this.kind);
            case "description":
                return ZVal.isNull(this.description);
            case "created":
                return ZVal.isNull(this.created);
            case "volumeCount":
                return ZVal.isNull(this.volumeCount);
            case "title":
                return ZVal.isNull(this.title);
            case "updated":
                return ZVal.isNull(this.updated);
            case "access":
                return ZVal.isNull(this.access);
            case "volumesLastUpdated":
                return ZVal.isNull(this.volumesLastUpdated);
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
            case "kind":
                this.kind = value;
                break;
            case "description":
                this.description = value;
                break;
            case "created":
                this.created = value;
                break;
            case "volumeCount":
                this.volumeCount = value;
                break;
            case "title":
                this.title = value;
                break;
            case "updated":
                this.updated = value;
                break;
            case "access":
                this.access = value;
                break;
            case "volumesLastUpdated":
                this.volumesLastUpdated = value;
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

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Bookshelf.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Bookshelf.class, "kind"));
    }

    public Object setDescription(RuntimeEnv env, Object... args) {
        Object description = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Bookshelf.class, "description", description);

        return null;
    }

    public Object getDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Bookshelf.class, "description"));
    }

    public Object setCreated(RuntimeEnv env, Object... args) {
        Object created = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Bookshelf.class, "created", created);

        return null;
    }

    public Object getCreated(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Bookshelf.class, "created"));
    }

    public Object setVolumeCount(RuntimeEnv env, Object... args) {
        Object volumeCount = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Bookshelf.class, "volumeCount", volumeCount);

        return null;
    }

    public Object getVolumeCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Bookshelf.class, "volumeCount"));
    }

    public Object setTitle(RuntimeEnv env, Object... args) {
        Object title = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Bookshelf.class, "title", title);

        return null;
    }

    public Object getTitle(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Bookshelf.class, "title"));
    }

    public Object setUpdated(RuntimeEnv env, Object... args) {
        Object updated = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Bookshelf.class, "updated", updated);

        return null;
    }

    public Object getUpdated(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Bookshelf.class, "updated"));
    }

    public Object setAccess(RuntimeEnv env, Object... args) {
        Object access = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Bookshelf.class, "access", access);

        return null;
    }

    public Object getAccess(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Bookshelf.class, "access"));
    }

    public Object setVolumesLastUpdated(RuntimeEnv env, Object... args) {
        Object volumesLastUpdated = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Bookshelf.class, "volumesLastUpdated", volumesLastUpdated);

        return null;
    }

    public Object getVolumesLastUpdated(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Bookshelf.class, "volumesLastUpdated"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Bookshelf.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Bookshelf.class, "id"));
    }

    public Object setSelfLink(RuntimeEnv env, Object... args) {
        Object selfLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Bookshelf.class, "selfLink", selfLink);

        return null;
    }

    public Object getSelfLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Bookshelf.class, "selfLink"));
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
