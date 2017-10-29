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

public class Google_TableRow extends Google_Model implements RuntimeFileContextInterface {

    public Object __fType = "Google_TableRowF";

    public Object __fDataType = "array";

    public Object f = null;

    public Google_TableRow(RuntimeEnv env, Object... args) {
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
            case "setF":
                return this.setF(env, args);
            case "getF":
                return this.getF(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__fType":
                if (Google_TableRow.class.isAssignableFrom(caller)) {

                    return this.__fType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__fDataType":
                if (Google_TableRow.class.isAssignableFrom(caller)) {

                    return this.__fDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "f":
                return this.f;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__fType":
                if (Google_TableRow.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__fType);
                }
                break;
            case "__fDataType":
                if (Google_TableRow.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__fDataType);
                }
                break;
            case "f":
                return ZVal.isNull(this.f);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__fType":
                if (Google_TableRow.class.isAssignableFrom(caller)) {

                    this.__fType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__fDataType":
                if (Google_TableRow.class.isAssignableFrom(caller)) {

                    this.__fDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "f":
                this.f = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setF(RuntimeEnv env, Object... args) {
        Object f = ZVal.assignParameter(args, 0, null);
        env.callMethod(this, "assertIsArray", Google_TableRow.class, f, "Google_TableRowF", "setF");
        ZVal.setProperty(this, Google_TableRow.class, "f", f);

        return null;
    }

    public Object getF(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_TableRow.class, "f"));
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
