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

 google-api-php-client/src/contrib/Google_DriveService.php

*/

public class Google_ParentReference extends Google_Model implements RuntimeFileContextInterface {

    public Object selfLink = null;

    public Object kind = null;

    public Object id = null;

    public Object isRoot = null;

    public Object parentLink = null;

    public Google_ParentReference(RuntimeEnv env, Object... args) {
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
            case "setSelfLink":
                return this.setSelfLink(env, args);
            case "getSelfLink":
                return this.getSelfLink(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setIsRoot":
                return this.setIsRoot(env, args);
            case "getIsRoot":
                return this.getIsRoot(env, args);
            case "setParentLink":
                return this.setParentLink(env, args);
            case "getParentLink":
                return this.getParentLink(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "selfLink":
                return this.selfLink;
            case "kind":
                return this.kind;
            case "id":
                return this.id;
            case "isRoot":
                return this.isRoot;
            case "parentLink":
                return this.parentLink;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "selfLink":
                return ZVal.isNull(this.selfLink);
            case "kind":
                return ZVal.isNull(this.kind);
            case "id":
                return ZVal.isNull(this.id);
            case "isRoot":
                return ZVal.isNull(this.isRoot);
            case "parentLink":
                return ZVal.isNull(this.parentLink);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "selfLink":
                this.selfLink = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "id":
                this.id = value;
                break;
            case "isRoot":
                this.isRoot = value;
                break;
            case "parentLink":
                this.parentLink = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setSelfLink(RuntimeEnv env, Object... args) {
        Object selfLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ParentReference.class, "selfLink", selfLink);

        return null;
    }

    public Object getSelfLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ParentReference.class, "selfLink"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ParentReference.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ParentReference.class, "kind"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ParentReference.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ParentReference.class, "id"));
    }

    public Object setIsRoot(RuntimeEnv env, Object... args) {
        Object isRoot = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ParentReference.class, "isRoot", isRoot);

        return null;
    }

    public Object getIsRoot(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ParentReference.class, "isRoot"));
    }

    public Object setParentLink(RuntimeEnv env, Object... args) {
        Object parentLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ParentReference.class, "parentLink", parentLink);

        return null;
    }

    public Object getParentLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ParentReference.class, "parentLink"));
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
