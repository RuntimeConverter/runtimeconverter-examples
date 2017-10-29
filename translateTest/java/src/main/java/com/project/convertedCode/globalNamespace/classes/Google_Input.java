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

 google-api-php-client/src/contrib/Google_PredictionService.php

*/

public class Google_Input extends Google_Model implements RuntimeFileContextInterface {

    public Object __inputType = "Google_InputInput";

    public Object __inputDataType = "";

    public Object input = null;

    public Google_Input(RuntimeEnv env, Object... args) {
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
            case "setInput":
                return this.setInput(env, args);
            case "getInput":
                return this.getInput(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__inputType":
                if (Google_Input.class.isAssignableFrom(caller)) {

                    return this.__inputType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__inputDataType":
                if (Google_Input.class.isAssignableFrom(caller)) {

                    return this.__inputDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "input":
                return this.input;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__inputType":
                if (Google_Input.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__inputType);
                }
                break;
            case "__inputDataType":
                if (Google_Input.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__inputDataType);
                }
                break;
            case "input":
                return ZVal.isNull(this.input);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__inputType":
                if (Google_Input.class.isAssignableFrom(caller)) {

                    this.__inputType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__inputDataType":
                if (Google_Input.class.isAssignableFrom(caller)) {

                    this.__inputDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "input":
                this.input = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setInput(RuntimeEnv env, Object... args) {
        Object input = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Input.class, "input", input);

        return null;
    }

    public Object getInput(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Input.class, "input"));
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
