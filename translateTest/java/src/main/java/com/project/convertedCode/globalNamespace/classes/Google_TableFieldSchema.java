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

 google-api-php-client/src/contrib/Google_BigqueryService.php

*/

public class Google_TableFieldSchema extends Google_Model implements RuntimeFileContextInterface {

    public Object __fieldsType = "Google_TableFieldSchema";

    public Object __fieldsDataType = "array";

    public Object fields = null;

    public Object type = null;

    public Object mode = null;

    public Object name = null;

    public Google_TableFieldSchema(RuntimeEnv env, Object... args) {
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
            case "setFields":
                return this.setFields(env, args);
            case "getFields":
                return this.getFields(env, args);
            case "setType":
                return this.setType(env, args);
            case "getType":
                return this.getType(env, args);
            case "setMode":
                return this.setMode(env, args);
            case "getMode":
                return this.getMode(env, args);
            case "setName":
                return this.setName(env, args);
            case "getName":
                return this.getName(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__fieldsType":
                if (Google_TableFieldSchema.class.isAssignableFrom(caller)) {

                    return this.__fieldsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__fieldsDataType":
                if (Google_TableFieldSchema.class.isAssignableFrom(caller)) {

                    return this.__fieldsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "fields":
                return this.fields;
            case "type":
                return this.type;
            case "mode":
                return this.mode;
            case "name":
                return this.name;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__fieldsType":
                if (Google_TableFieldSchema.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__fieldsType);
                }
                break;
            case "__fieldsDataType":
                if (Google_TableFieldSchema.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__fieldsDataType);
                }
                break;
            case "fields":
                return ZVal.isNull(this.fields);
            case "type":
                return ZVal.isNull(this.type);
            case "mode":
                return ZVal.isNull(this.mode);
            case "name":
                return ZVal.isNull(this.name);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__fieldsType":
                if (Google_TableFieldSchema.class.isAssignableFrom(caller)) {

                    this.__fieldsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__fieldsDataType":
                if (Google_TableFieldSchema.class.isAssignableFrom(caller)) {

                    this.__fieldsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "fields":
                this.fields = value;
                break;
            case "type":
                this.type = value;
                break;
            case "mode":
                this.mode = value;
                break;
            case "name":
                this.name = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setFields(RuntimeEnv env, Object... args) {
        Object fields = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_TableFieldSchema.class,
                fields,
                "Google_TableFieldSchema",
                "setFields");
        ZVal.setProperty(this, Google_TableFieldSchema.class, "fields", fields);

        return null;
    }

    public Object getFields(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_TableFieldSchema.class, "fields"));
    }

    public Object setType(RuntimeEnv env, Object... args) {
        Object type = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_TableFieldSchema.class, "type", type);

        return null;
    }

    public Object getType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_TableFieldSchema.class, "type"));
    }

    public Object setMode(RuntimeEnv env, Object... args) {
        Object mode = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_TableFieldSchema.class, "mode", mode);

        return null;
    }

    public Object getMode(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_TableFieldSchema.class, "mode"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_TableFieldSchema.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_TableFieldSchema.class, "name"));
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
