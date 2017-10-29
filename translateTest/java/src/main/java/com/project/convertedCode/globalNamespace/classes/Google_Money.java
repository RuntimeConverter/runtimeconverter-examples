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

 google-api-php-client/src/contrib/Google_GanService.php

*/

public class Google_Money extends Google_Model implements RuntimeFileContextInterface {

    public Object amount = null;

    public Object currencyCode = null;

    public Google_Money(RuntimeEnv env, Object... args) {
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
            case "setAmount":
                return this.setAmount(env, args);
            case "getAmount":
                return this.getAmount(env, args);
            case "setCurrencyCode":
                return this.setCurrencyCode(env, args);
            case "getCurrencyCode":
                return this.getCurrencyCode(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "amount":
                return this.amount;
            case "currencyCode":
                return this.currencyCode;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "amount":
                return ZVal.isNull(this.amount);
            case "currencyCode":
                return ZVal.isNull(this.currencyCode);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "amount":
                this.amount = value;
                break;
            case "currencyCode":
                this.currencyCode = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setAmount(RuntimeEnv env, Object... args) {
        Object amount = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Money.class, "amount", amount);

        return null;
    }

    public Object getAmount(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Money.class, "amount"));
    }

    public Object setCurrencyCode(RuntimeEnv env, Object... args) {
        Object currencyCode = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Money.class, "currencyCode", currencyCode);

        return null;
    }

    public Object getCurrencyCode(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Money.class, "currencyCode"));
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
