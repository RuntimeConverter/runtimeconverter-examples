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

public class Google_TableSchema extends Google_Model implements RuntimeFileContextInterface {

    public Object __fieldsType = "Google_TableFieldSchema";

    public Object __fieldsDataType = "array";

    public Object fields = null;

    public Google_TableSchema(RuntimeEnv env, Object... args) {
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
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__fieldsType":
                if (Google_TableSchema.class.isAssignableFrom(caller)) {

                    return this.__fieldsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__fieldsDataType":
                if (Google_TableSchema.class.isAssignableFrom(caller)) {

                    return this.__fieldsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "fields":
                return this.fields;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__fieldsType":
                if (Google_TableSchema.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__fieldsType);
                }
                break;
            case "__fieldsDataType":
                if (Google_TableSchema.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__fieldsDataType);
                }
                break;
            case "fields":
                return ZVal.isNull(this.fields);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__fieldsType":
                if (Google_TableSchema.class.isAssignableFrom(caller)) {

                    this.__fieldsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__fieldsDataType":
                if (Google_TableSchema.class.isAssignableFrom(caller)) {

                    this.__fieldsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "fields":
                this.fields = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setFields(RuntimeEnv env, Object... args) {
        Object fields = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_TableSchema.class,
                fields,
                "Google_TableFieldSchema",
                "setFields");
        ZVal.setProperty(this, Google_TableSchema.class, "fields", fields);

        return null;
    }

    public Object getFields(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_TableSchema.class, "fields"));
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
