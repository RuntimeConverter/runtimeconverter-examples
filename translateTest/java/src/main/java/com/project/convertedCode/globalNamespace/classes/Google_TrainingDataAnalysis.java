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

public class Google_TrainingDataAnalysis extends Google_Model
        implements RuntimeFileContextInterface {

    public Object warnings = null;

    public Google_TrainingDataAnalysis(RuntimeEnv env, Object... args) {
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
            case "setWarnings":
                return this.setWarnings(env, args);
            case "getWarnings":
                return this.getWarnings(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "warnings":
                return this.warnings;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "warnings":
                return ZVal.isNull(this.warnings);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "warnings":
                this.warnings = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setWarnings(RuntimeEnv env, Object... args) {
        Object warnings = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_TrainingDataAnalysis.class,
                warnings,
                "Google_string",
                "setWarnings");
        ZVal.setProperty(this, Google_TrainingDataAnalysis.class, "warnings", warnings);

        return null;
    }

    public Object getWarnings(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_TrainingDataAnalysis.class, "warnings"));
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
