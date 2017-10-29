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

 google-api-php-client/src/contrib/Google_ModeratorService.php

*/

public class Google_Vote extends Google_Model implements RuntimeFileContextInterface {

    public Object vote = null;

    public Object flag = null;

    public Object __idType = "Google_VoteId";

    public Object __idDataType = "";

    public Object id = null;

    public Object kind = null;

    public Google_Vote(RuntimeEnv env, Object... args) {
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
            case "setVote":
                return this.setVote(env, args);
            case "getVote":
                return this.getVote(env, args);
            case "setFlag":
                return this.setFlag(env, args);
            case "getFlag":
                return this.getFlag(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "vote":
                return this.vote;
            case "flag":
                return this.flag;
            case "__idType":
                if (Google_Vote.class.isAssignableFrom(caller)) {

                    return this.__idType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__idDataType":
                if (Google_Vote.class.isAssignableFrom(caller)) {

                    return this.__idDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "id":
                return this.id;
            case "kind":
                return this.kind;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "vote":
                return ZVal.isNull(this.vote);
            case "flag":
                return ZVal.isNull(this.flag);
            case "__idType":
                if (Google_Vote.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__idType);
                }
                break;
            case "__idDataType":
                if (Google_Vote.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__idDataType);
                }
                break;
            case "id":
                return ZVal.isNull(this.id);
            case "kind":
                return ZVal.isNull(this.kind);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "vote":
                this.vote = value;
                break;
            case "flag":
                this.flag = value;
                break;
            case "__idType":
                if (Google_Vote.class.isAssignableFrom(caller)) {

                    this.__idType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__idDataType":
                if (Google_Vote.class.isAssignableFrom(caller)) {

                    this.__idDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "id":
                this.id = value;
                break;
            case "kind":
                this.kind = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setVote(RuntimeEnv env, Object... args) {
        Object vote = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Vote.class, "vote", vote);

        return null;
    }

    public Object getVote(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Vote.class, "vote"));
    }

    public Object setFlag(RuntimeEnv env, Object... args) {
        Object flag = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Vote.class, "flag", flag);

        return null;
    }

    public Object getFlag(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Vote.class, "flag"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Vote.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Vote.class, "id"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Vote.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Vote.class, "kind"));
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
