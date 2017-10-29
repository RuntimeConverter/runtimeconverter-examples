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

public class Google_InputInput extends Google_Model implements RuntimeFileContextInterface {

    public Object csvInstance = null;

    public Google_InputInput(RuntimeEnv env, Object... args) {
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
            case "setCsvInstance":
                return this.setCsvInstance(env, args);
            case "getCsvInstance":
                return this.getCsvInstance(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "csvInstance":
                return this.csvInstance;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "csvInstance":
                return ZVal.isNull(this.csvInstance);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "csvInstance":
                this.csvInstance = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setCsvInstance(RuntimeEnv env, Object... args) {
        Object csvInstance = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_InputInput.class,
                csvInstance,
                "Google_object",
                "setCsvInstance");
        ZVal.setProperty(this, Google_InputInput.class, "csvInstance", csvInstance);

        return null;
    }

    public Object getCsvInstance(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_InputInput.class, "csvInstance"));
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
