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

 google-api-php-client/src/contrib/Google_CalendarService.php

*/

public class Google_EventReminders extends Google_Model implements RuntimeFileContextInterface {

    public Object __overridesType = "Google_EventReminder";

    public Object __overridesDataType = "array";

    public Object overrides = null;

    public Object useDefault = null;

    public Google_EventReminders(RuntimeEnv env, Object... args) {
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
            case "setOverrides":
                return this.setOverrides(env, args);
            case "getOverrides":
                return this.getOverrides(env, args);
            case "setUseDefault":
                return this.setUseDefault(env, args);
            case "getUseDefault":
                return this.getUseDefault(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__overridesType":
                if (Google_EventReminders.class.isAssignableFrom(caller)) {

                    return this.__overridesType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__overridesDataType":
                if (Google_EventReminders.class.isAssignableFrom(caller)) {

                    return this.__overridesDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "overrides":
                return this.overrides;
            case "useDefault":
                return this.useDefault;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__overridesType":
                if (Google_EventReminders.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__overridesType);
                }
                break;
            case "__overridesDataType":
                if (Google_EventReminders.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__overridesDataType);
                }
                break;
            case "overrides":
                return ZVal.isNull(this.overrides);
            case "useDefault":
                return ZVal.isNull(this.useDefault);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__overridesType":
                if (Google_EventReminders.class.isAssignableFrom(caller)) {

                    this.__overridesType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__overridesDataType":
                if (Google_EventReminders.class.isAssignableFrom(caller)) {

                    this.__overridesDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "overrides":
                this.overrides = value;
                break;
            case "useDefault":
                this.useDefault = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setOverrides(RuntimeEnv env, Object... args) {
        Object overrides = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_EventReminders.class,
                overrides,
                "Google_EventReminder",
                "setOverrides");
        ZVal.setProperty(this, Google_EventReminders.class, "overrides", overrides);

        return null;
    }

    public Object getOverrides(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_EventReminders.class, "overrides"));
    }

    public Object setUseDefault(RuntimeEnv env, Object... args) {
        Object useDefault = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_EventReminders.class, "useDefault", useDefault);

        return null;
    }

    public Object getUseDefault(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_EventReminders.class, "useDefault"));
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
