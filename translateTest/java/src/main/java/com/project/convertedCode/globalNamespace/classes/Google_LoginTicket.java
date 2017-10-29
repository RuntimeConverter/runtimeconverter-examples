package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Google_AuthException;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/auth/Google_LoginTicket.php

*/

public class Google_LoginTicket extends RuntimeClassBase implements RuntimeFileContextInterface {

    public Object envelope = null;

    public Object payload = null;

    public Google_LoginTicket(RuntimeEnv env, Object... args) {
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
            case "getUserId":
                return this.getUserId(env, args);
            case "getAttributes":
                return this.getAttributes(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "envelope":
                if (Google_LoginTicket.class.equals(caller)) {

                    return this.envelope;
                }
                return this.__phpMagicMethod__isset(key);
            case "payload":
                if (Google_LoginTicket.class.equals(caller)) {

                    return this.payload;
                }
                return this.__phpMagicMethod__isset(key);
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "envelope":
                if (Google_LoginTicket.class.equals(caller)) {

                    return ZVal.isNull(this.envelope);
                }
                break;
            case "payload":
                if (Google_LoginTicket.class.equals(caller)) {

                    return ZVal.isNull(this.payload);
                }
                break;
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "envelope":
                if (Google_LoginTicket.class.equals(caller)) {

                    this.envelope = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "payload":
                if (Google_LoginTicket.class.equals(caller)) {

                    this.payload = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object envelope = ZVal.assignParameter(args, 0, null);
        Object payload = ZVal.assignParameter(args, 1, null);
        ZVal.setProperty(this, Google_LoginTicket.class, "envelope", envelope);
        ZVal.setProperty(this, Google_LoginTicket.class, "payload", payload);

        return null;
    }

    public Object getUserId(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(
                CRArrayF.array_key_exists.call(
                        env,
                        CONST_USER_ATTR,
                        ZVal.getProperty(this, Google_LoginTicket.class, "payload")))) {
            return ZVal.assign(
                    ZVal.getElement(
                            ZVal.getProperty(this, Google_LoginTicket.class, "payload"),
                            CONST_USER_ATTR));
        }

        throw new Google_AuthException(env, "No user_id in token");
    }

    public Object getAttributes(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                "envelope",
                                ZVal.getProperty(this, Google_LoginTicket.class, "envelope")),
                        new ZPair(
                                "payload",
                                ZVal.getProperty(this, Google_LoginTicket.class, "payload"))));
    }

    public static final Object CONST_USER_ATTR = "id";

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
