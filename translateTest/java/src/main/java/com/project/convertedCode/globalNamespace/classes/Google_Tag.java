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

public class Google_Tag extends Google_Model implements RuntimeFileContextInterface {

    public Object text = null;

    public Object kind = null;

    public Object __idType = "Google_TagId";

    public Object __idDataType = "";

    public Object id = null;

    public Google_Tag(RuntimeEnv env, Object... args) {
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
            case "setText":
                return this.setText(env, args);
            case "getText":
                return this.getText(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
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
            case "text":
                return this.text;
            case "kind":
                return this.kind;
            case "__idType":
                if (Google_Tag.class.isAssignableFrom(caller)) {

                    return this.__idType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__idDataType":
                if (Google_Tag.class.isAssignableFrom(caller)) {

                    return this.__idDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "id":
                return this.id;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "text":
                return ZVal.isNull(this.text);
            case "kind":
                return ZVal.isNull(this.kind);
            case "__idType":
                if (Google_Tag.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__idType);
                }
                break;
            case "__idDataType":
                if (Google_Tag.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__idDataType);
                }
                break;
            case "id":
                return ZVal.isNull(this.id);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "text":
                this.text = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "__idType":
                if (Google_Tag.class.isAssignableFrom(caller)) {

                    this.__idType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__idDataType":
                if (Google_Tag.class.isAssignableFrom(caller)) {

                    this.__idDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "id":
                this.id = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setText(RuntimeEnv env, Object... args) {
        Object text = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Tag.class, "text", text);

        return null;
    }

    public Object getText(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Tag.class, "text"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Tag.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Tag.class, "kind"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Tag.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Tag.class, "id"));
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
