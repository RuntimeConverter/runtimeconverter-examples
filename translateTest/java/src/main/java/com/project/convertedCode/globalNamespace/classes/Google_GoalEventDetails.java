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

 google-api-php-client/src/contrib/Google_AnalyticsService.php

*/

public class Google_GoalEventDetails extends Google_Model implements RuntimeFileContextInterface {

    public Object __eventConditionsType = "Google_GoalEventDetailsEventConditions";

    public Object __eventConditionsDataType = "array";

    public Object eventConditions = null;

    public Object useEventValue = null;

    public Google_GoalEventDetails(RuntimeEnv env, Object... args) {
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
            case "setEventConditions":
                return this.setEventConditions(env, args);
            case "getEventConditions":
                return this.getEventConditions(env, args);
            case "setUseEventValue":
                return this.setUseEventValue(env, args);
            case "getUseEventValue":
                return this.getUseEventValue(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__eventConditionsType":
                if (Google_GoalEventDetails.class.isAssignableFrom(caller)) {

                    return this.__eventConditionsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__eventConditionsDataType":
                if (Google_GoalEventDetails.class.isAssignableFrom(caller)) {

                    return this.__eventConditionsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "eventConditions":
                return this.eventConditions;
            case "useEventValue":
                return this.useEventValue;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__eventConditionsType":
                if (Google_GoalEventDetails.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__eventConditionsType);
                }
                break;
            case "__eventConditionsDataType":
                if (Google_GoalEventDetails.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__eventConditionsDataType);
                }
                break;
            case "eventConditions":
                return ZVal.isNull(this.eventConditions);
            case "useEventValue":
                return ZVal.isNull(this.useEventValue);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__eventConditionsType":
                if (Google_GoalEventDetails.class.isAssignableFrom(caller)) {

                    this.__eventConditionsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__eventConditionsDataType":
                if (Google_GoalEventDetails.class.isAssignableFrom(caller)) {

                    this.__eventConditionsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "eventConditions":
                this.eventConditions = value;
                break;
            case "useEventValue":
                this.useEventValue = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setEventConditions(RuntimeEnv env, Object... args) {
        Object eventConditions = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_GoalEventDetails.class,
                eventConditions,
                "Google_GoalEventDetailsEventConditions",
                "setEventConditions");
        ZVal.setProperty(this, Google_GoalEventDetails.class, "eventConditions", eventConditions);

        return null;
    }

    public Object getEventConditions(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_GoalEventDetails.class, "eventConditions"));
    }

    public Object setUseEventValue(RuntimeEnv env, Object... args) {
        Object useEventValue = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_GoalEventDetails.class, "useEventValue", useEventValue);

        return null;
    }

    public Object getUseEventValue(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_GoalEventDetails.class, "useEventValue"));
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
