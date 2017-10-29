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

public class Google_GoalEventDetailsEventConditions extends Google_Model
        implements RuntimeFileContextInterface {

    public Object type = null;

    public Object matchType = null;

    public Object expression = null;

    public Object comparisonType = null;

    public Object comparisonValue = null;

    public Google_GoalEventDetailsEventConditions(RuntimeEnv env, Object... args) {
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
            case "setMatchType":
                return this.setMatchType(env, args);
            case "getMatchType":
                return this.getMatchType(env, args);
            case "setExpression":
                return this.setExpression(env, args);
            case "getExpression":
                return this.getExpression(env, args);
            case "setComparisonType":
                return this.setComparisonType(env, args);
            case "getComparisonType":
                return this.getComparisonType(env, args);
            case "setComparisonValue":
                return this.setComparisonValue(env, args);
            case "getComparisonValue":
                return this.getComparisonValue(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "type":
                return this.type;
            case "matchType":
                return this.matchType;
            case "expression":
                return this.expression;
            case "comparisonType":
                return this.comparisonType;
            case "comparisonValue":
                return this.comparisonValue;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "type":
                return ZVal.isNull(this.type);
            case "matchType":
                return ZVal.isNull(this.matchType);
            case "expression":
                return ZVal.isNull(this.expression);
            case "comparisonType":
                return ZVal.isNull(this.comparisonType);
            case "comparisonValue":
                return ZVal.isNull(this.comparisonValue);
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
            case "matchType":
                this.matchType = value;
                break;
            case "expression":
                this.expression = value;
                break;
            case "comparisonType":
                this.comparisonType = value;
                break;
            case "comparisonValue":
                this.comparisonValue = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setType(RuntimeEnv env, Object... args) {
        Object type = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_GoalEventDetailsEventConditions.class, "type", type);

        return null;
    }

    public Object getType(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_GoalEventDetailsEventConditions.class, "type"));
    }

    public Object setMatchType(RuntimeEnv env, Object... args) {
        Object matchType = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_GoalEventDetailsEventConditions.class, "matchType", matchType);

        return null;
    }

    public Object getMatchType(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_GoalEventDetailsEventConditions.class, "matchType"));
    }

    public Object setExpression(RuntimeEnv env, Object... args) {
        Object expression = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_GoalEventDetailsEventConditions.class, "expression", expression);

        return null;
    }

    public Object getExpression(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_GoalEventDetailsEventConditions.class, "expression"));
    }

    public Object setComparisonType(RuntimeEnv env, Object... args) {
        Object comparisonType = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_GoalEventDetailsEventConditions.class,
                "comparisonType",
                comparisonType);

        return null;
    }

    public Object getComparisonType(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_GoalEventDetailsEventConditions.class, "comparisonType"));
    }

    public Object setComparisonValue(RuntimeEnv env, Object... args) {
        Object comparisonValue = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_GoalEventDetailsEventConditions.class,
                "comparisonValue",
                comparisonValue);

        return null;
    }

    public Object getComparisonValue(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_GoalEventDetailsEventConditions.class, "comparisonValue"));
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
