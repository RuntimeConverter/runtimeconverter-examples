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

 google-api-php-client/src/contrib/Google_PagespeedonlineService.php

*/

public class Google_ResultFormattedResultsRuleResultsUrlBlocksHeaderArgs extends Google_Model
        implements RuntimeFileContextInterface {

    public Object type = null;

    public Object value = null;

    public Google_ResultFormattedResultsRuleResultsUrlBlocksHeaderArgs(
            RuntimeEnv env, Object... args) {
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
            case "setType":
                return this.setType(env, args);
            case "getType":
                return this.getType(env, args);
            case "setValue":
                return this.setValue(env, args);
            case "getValue":
                return this.getValue(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "type":
                return this.type;
            case "value":
                return this.value;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "type":
                return ZVal.isNull(this.type);
            case "value":
                return ZVal.isNull(this.value);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "type":
                this.type = value;
                break;
            case "value":
                this.value = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setType(RuntimeEnv env, Object... args) {
        Object type = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_ResultFormattedResultsRuleResultsUrlBlocksHeaderArgs.class,
                "type",
                type);

        return null;
    }

    public Object getType(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this,
                        Google_ResultFormattedResultsRuleResultsUrlBlocksHeaderArgs.class,
                        "type"));
    }

    public Object setValue(RuntimeEnv env, Object... args) {
        Object value = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_ResultFormattedResultsRuleResultsUrlBlocksHeaderArgs.class,
                "value",
                value);

        return null;
    }

    public Object getValue(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this,
                        Google_ResultFormattedResultsRuleResultsUrlBlocksHeaderArgs.class,
                        "value"));
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
