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

 google-api-php-client/src/contrib/Google_PlusMomentsService.php

*/

public class Google_Moment extends Google_Model implements RuntimeFileContextInterface {

    public Object startDate = null;

    public Object kind = null;

    public Object __targetType = "Google_ItemScope";

    public Object __targetDataType = "";

    public Object target = null;

    public Object __verbType = "Google_MomentVerb";

    public Object __verbDataType = "";

    public Object verb = null;

    public Object __resultType = "Google_ItemScope";

    public Object __resultDataType = "";

    public Object result = null;

    public Object type = null;

    public Google_Moment(RuntimeEnv env, Object... args) {
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
            case "setStartDate":
                return this.setStartDate(env, args);
            case "getStartDate":
                return this.getStartDate(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setTarget":
                return this.setTarget(env, args);
            case "getTarget":
                return this.getTarget(env, args);
            case "setVerb":
                return this.setVerb(env, args);
            case "getVerb":
                return this.getVerb(env, args);
            case "setResult":
                return this.setResult(env, args);
            case "getResult":
                return this.getResult(env, args);
            case "setType":
                return this.setType(env, args);
            case "getType":
                return this.getType(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "startDate":
                return this.startDate;
            case "kind":
                return this.kind;
            case "__targetType":
                if (Google_Moment.class.isAssignableFrom(caller)) {

                    return this.__targetType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__targetDataType":
                if (Google_Moment.class.isAssignableFrom(caller)) {

                    return this.__targetDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "target":
                return this.target;
            case "__verbType":
                if (Google_Moment.class.isAssignableFrom(caller)) {

                    return this.__verbType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__verbDataType":
                if (Google_Moment.class.isAssignableFrom(caller)) {

                    return this.__verbDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "verb":
                return this.verb;
            case "__resultType":
                if (Google_Moment.class.isAssignableFrom(caller)) {

                    return this.__resultType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__resultDataType":
                if (Google_Moment.class.isAssignableFrom(caller)) {

                    return this.__resultDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "result":
                return this.result;
            case "type":
                return this.type;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "startDate":
                return ZVal.isNull(this.startDate);
            case "kind":
                return ZVal.isNull(this.kind);
            case "__targetType":
                if (Google_Moment.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__targetType);
                }
                break;
            case "__targetDataType":
                if (Google_Moment.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__targetDataType);
                }
                break;
            case "target":
                return ZVal.isNull(this.target);
            case "__verbType":
                if (Google_Moment.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__verbType);
                }
                break;
            case "__verbDataType":
                if (Google_Moment.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__verbDataType);
                }
                break;
            case "verb":
                return ZVal.isNull(this.verb);
            case "__resultType":
                if (Google_Moment.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__resultType);
                }
                break;
            case "__resultDataType":
                if (Google_Moment.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__resultDataType);
                }
                break;
            case "result":
                return ZVal.isNull(this.result);
            case "type":
                return ZVal.isNull(this.type);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "startDate":
                this.startDate = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "__targetType":
                if (Google_Moment.class.isAssignableFrom(caller)) {

                    this.__targetType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__targetDataType":
                if (Google_Moment.class.isAssignableFrom(caller)) {

                    this.__targetDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "target":
                this.target = value;
                break;
            case "__verbType":
                if (Google_Moment.class.isAssignableFrom(caller)) {

                    this.__verbType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__verbDataType":
                if (Google_Moment.class.isAssignableFrom(caller)) {

                    this.__verbDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "verb":
                this.verb = value;
                break;
            case "__resultType":
                if (Google_Moment.class.isAssignableFrom(caller)) {

                    this.__resultType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__resultDataType":
                if (Google_Moment.class.isAssignableFrom(caller)) {

                    this.__resultDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "result":
                this.result = value;
                break;
            case "type":
                this.type = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setStartDate(RuntimeEnv env, Object... args) {
        Object startDate = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Moment.class, "startDate", startDate);

        return null;
    }

    public Object getStartDate(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Moment.class, "startDate"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Moment.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Moment.class, "kind"));
    }

    public Object setTarget(RuntimeEnv env, Object... args) {
        Object target = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Moment.class, "target", target);

        return null;
    }

    public Object getTarget(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Moment.class, "target"));
    }

    public Object setVerb(RuntimeEnv env, Object... args) {
        Object verb = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Moment.class, "verb", verb);

        return null;
    }

    public Object getVerb(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Moment.class, "verb"));
    }

    public Object setResult(RuntimeEnv env, Object... args) {
        Object result = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Moment.class, "result", result);

        return null;
    }

    public Object getResult(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Moment.class, "result"));
    }

    public Object setType(RuntimeEnv env, Object... args) {
        Object type = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Moment.class, "type", type);

        return null;
    }

    public Object getType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Moment.class, "type"));
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
