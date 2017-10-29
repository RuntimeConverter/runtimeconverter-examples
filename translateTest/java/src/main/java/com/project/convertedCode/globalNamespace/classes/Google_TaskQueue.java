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

 google-api-php-client/src/contrib/Google_TaskqueueService.php

*/

public class Google_TaskQueue extends Google_Model implements RuntimeFileContextInterface {

    public Object kind = null;

    public Object __statsType = "Google_TaskQueueStats";

    public Object __statsDataType = "";

    public Object stats = null;

    public Object id = null;

    public Object maxLeases = null;

    public Object __aclType = "Google_TaskQueueAcl";

    public Object __aclDataType = "";

    public Object acl = null;

    public Google_TaskQueue(RuntimeEnv env, Object... args) {
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
            case "setStats":
                return this.setStats(env, args);
            case "getStats":
                return this.getStats(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setMaxLeases":
                return this.setMaxLeases(env, args);
            case "getMaxLeases":
                return this.getMaxLeases(env, args);
            case "setAcl":
                return this.setAcl(env, args);
            case "getAcl":
                return this.getAcl(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return this.kind;
            case "__statsType":
                if (Google_TaskQueue.class.isAssignableFrom(caller)) {

                    return this.__statsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__statsDataType":
                if (Google_TaskQueue.class.isAssignableFrom(caller)) {

                    return this.__statsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "stats":
                return this.stats;
            case "id":
                return this.id;
            case "maxLeases":
                return this.maxLeases;
            case "__aclType":
                if (Google_TaskQueue.class.isAssignableFrom(caller)) {

                    return this.__aclType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__aclDataType":
                if (Google_TaskQueue.class.isAssignableFrom(caller)) {

                    return this.__aclDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "acl":
                return this.acl;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return ZVal.isNull(this.kind);
            case "__statsType":
                if (Google_TaskQueue.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__statsType);
                }
                break;
            case "__statsDataType":
                if (Google_TaskQueue.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__statsDataType);
                }
                break;
            case "stats":
                return ZVal.isNull(this.stats);
            case "id":
                return ZVal.isNull(this.id);
            case "maxLeases":
                return ZVal.isNull(this.maxLeases);
            case "__aclType":
                if (Google_TaskQueue.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__aclType);
                }
                break;
            case "__aclDataType":
                if (Google_TaskQueue.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__aclDataType);
                }
                break;
            case "acl":
                return ZVal.isNull(this.acl);
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
            case "__statsType":
                if (Google_TaskQueue.class.isAssignableFrom(caller)) {

                    this.__statsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__statsDataType":
                if (Google_TaskQueue.class.isAssignableFrom(caller)) {

                    this.__statsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "stats":
                this.stats = value;
                break;
            case "id":
                this.id = value;
                break;
            case "maxLeases":
                this.maxLeases = value;
                break;
            case "__aclType":
                if (Google_TaskQueue.class.isAssignableFrom(caller)) {

                    this.__aclType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__aclDataType":
                if (Google_TaskQueue.class.isAssignableFrom(caller)) {

                    this.__aclDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "acl":
                this.acl = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_TaskQueue.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_TaskQueue.class, "kind"));
    }

    public Object setStats(RuntimeEnv env, Object... args) {
        Object stats = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_TaskQueue.class, "stats", stats);

        return null;
    }

    public Object getStats(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_TaskQueue.class, "stats"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_TaskQueue.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_TaskQueue.class, "id"));
    }

    public Object setMaxLeases(RuntimeEnv env, Object... args) {
        Object maxLeases = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_TaskQueue.class, "maxLeases", maxLeases);

        return null;
    }

    public Object getMaxLeases(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_TaskQueue.class, "maxLeases"));
    }

    public Object setAcl(RuntimeEnv env, Object... args) {
        Object acl = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_TaskQueue.class, "acl", acl);

        return null;
    }

    public Object getAcl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_TaskQueue.class, "acl"));
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
