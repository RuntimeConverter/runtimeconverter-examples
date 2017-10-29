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

public class Google_GoalUrlDestinationDetails extends Google_Model
        implements RuntimeFileContextInterface {

    public Object url = null;

    public Object caseSensitive = null;

    public Object matchType = null;

    public Object __stepsType = "Google_GoalUrlDestinationDetailsSteps";

    public Object __stepsDataType = "array";

    public Object steps = null;

    public Object firstStepRequired = null;

    public Google_GoalUrlDestinationDetails(RuntimeEnv env, Object... args) {
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
            case "setUrl":
                return this.setUrl(env, args);
            case "getUrl":
                return this.getUrl(env, args);
            case "setCaseSensitive":
                return this.setCaseSensitive(env, args);
            case "getCaseSensitive":
                return this.getCaseSensitive(env, args);
            case "setMatchType":
                return this.setMatchType(env, args);
            case "getMatchType":
                return this.getMatchType(env, args);
            case "setSteps":
                return this.setSteps(env, args);
            case "getSteps":
                return this.getSteps(env, args);
            case "setFirstStepRequired":
                return this.setFirstStepRequired(env, args);
            case "getFirstStepRequired":
                return this.getFirstStepRequired(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "url":
                return this.url;
            case "caseSensitive":
                return this.caseSensitive;
            case "matchType":
                return this.matchType;
            case "__stepsType":
                if (Google_GoalUrlDestinationDetails.class.isAssignableFrom(caller)) {

                    return this.__stepsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__stepsDataType":
                if (Google_GoalUrlDestinationDetails.class.isAssignableFrom(caller)) {

                    return this.__stepsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "steps":
                return this.steps;
            case "firstStepRequired":
                return this.firstStepRequired;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "url":
                return ZVal.isNull(this.url);
            case "caseSensitive":
                return ZVal.isNull(this.caseSensitive);
            case "matchType":
                return ZVal.isNull(this.matchType);
            case "__stepsType":
                if (Google_GoalUrlDestinationDetails.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__stepsType);
                }
                break;
            case "__stepsDataType":
                if (Google_GoalUrlDestinationDetails.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__stepsDataType);
                }
                break;
            case "steps":
                return ZVal.isNull(this.steps);
            case "firstStepRequired":
                return ZVal.isNull(this.firstStepRequired);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "url":
                this.url = value;
                break;
            case "caseSensitive":
                this.caseSensitive = value;
                break;
            case "matchType":
                this.matchType = value;
                break;
            case "__stepsType":
                if (Google_GoalUrlDestinationDetails.class.isAssignableFrom(caller)) {

                    this.__stepsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__stepsDataType":
                if (Google_GoalUrlDestinationDetails.class.isAssignableFrom(caller)) {

                    this.__stepsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "steps":
                this.steps = value;
                break;
            case "firstStepRequired":
                this.firstStepRequired = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setUrl(RuntimeEnv env, Object... args) {
        Object url = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_GoalUrlDestinationDetails.class, "url", url);

        return null;
    }

    public Object getUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_GoalUrlDestinationDetails.class, "url"));
    }

    public Object setCaseSensitive(RuntimeEnv env, Object... args) {
        Object caseSensitive = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_GoalUrlDestinationDetails.class, "caseSensitive", caseSensitive);

        return null;
    }

    public Object getCaseSensitive(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_GoalUrlDestinationDetails.class, "caseSensitive"));
    }

    public Object setMatchType(RuntimeEnv env, Object... args) {
        Object matchType = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_GoalUrlDestinationDetails.class, "matchType", matchType);

        return null;
    }

    public Object getMatchType(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_GoalUrlDestinationDetails.class, "matchType"));
    }

    public Object setSteps(RuntimeEnv env, Object... args) {
        Object steps = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_GoalUrlDestinationDetails.class,
                steps,
                "Google_GoalUrlDestinationDetailsSteps",
                "setSteps");
        ZVal.setProperty(this, Google_GoalUrlDestinationDetails.class, "steps", steps);

        return null;
    }

    public Object getSteps(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_GoalUrlDestinationDetails.class, "steps"));
    }

    public Object setFirstStepRequired(RuntimeEnv env, Object... args) {
        Object firstStepRequired = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_GoalUrlDestinationDetails.class,
                "firstStepRequired",
                firstStepRequired);

        return null;
    }

    public Object getFirstStepRequired(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_GoalUrlDestinationDetails.class, "firstStepRequired"));
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
