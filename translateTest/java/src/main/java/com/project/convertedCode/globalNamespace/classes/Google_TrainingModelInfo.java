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

public class Google_TrainingModelInfo extends Google_Model implements RuntimeFileContextInterface {

    public Object confusionMatrixRowTotals = null;

    public Object numberLabels = null;

    public Object confusionMatrix = null;

    public Object meanSquaredError = null;

    public Object modelType = null;

    public Object numberInstances = null;

    public Object classWeightedAccuracy = null;

    public Object classificationAccuracy = null;

    public Google_TrainingModelInfo(RuntimeEnv env, Object... args) {
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
            case "setConfusionMatrixRowTotals":
                return this.setConfusionMatrixRowTotals(env, args);
            case "getConfusionMatrixRowTotals":
                return this.getConfusionMatrixRowTotals(env, args);
            case "setNumberLabels":
                return this.setNumberLabels(env, args);
            case "getNumberLabels":
                return this.getNumberLabels(env, args);
            case "setConfusionMatrix":
                return this.setConfusionMatrix(env, args);
            case "getConfusionMatrix":
                return this.getConfusionMatrix(env, args);
            case "setMeanSquaredError":
                return this.setMeanSquaredError(env, args);
            case "getMeanSquaredError":
                return this.getMeanSquaredError(env, args);
            case "setModelType":
                return this.setModelType(env, args);
            case "getModelType":
                return this.getModelType(env, args);
            case "setNumberInstances":
                return this.setNumberInstances(env, args);
            case "getNumberInstances":
                return this.getNumberInstances(env, args);
            case "setClassWeightedAccuracy":
                return this.setClassWeightedAccuracy(env, args);
            case "getClassWeightedAccuracy":
                return this.getClassWeightedAccuracy(env, args);
            case "setClassificationAccuracy":
                return this.setClassificationAccuracy(env, args);
            case "getClassificationAccuracy":
                return this.getClassificationAccuracy(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "confusionMatrixRowTotals":
                return this.confusionMatrixRowTotals;
            case "numberLabels":
                return this.numberLabels;
            case "confusionMatrix":
                return this.confusionMatrix;
            case "meanSquaredError":
                return this.meanSquaredError;
            case "modelType":
                return this.modelType;
            case "numberInstances":
                return this.numberInstances;
            case "classWeightedAccuracy":
                return this.classWeightedAccuracy;
            case "classificationAccuracy":
                return this.classificationAccuracy;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "confusionMatrixRowTotals":
                return ZVal.isNull(this.confusionMatrixRowTotals);
            case "numberLabels":
                return ZVal.isNull(this.numberLabels);
            case "confusionMatrix":
                return ZVal.isNull(this.confusionMatrix);
            case "meanSquaredError":
                return ZVal.isNull(this.meanSquaredError);
            case "modelType":
                return ZVal.isNull(this.modelType);
            case "numberInstances":
                return ZVal.isNull(this.numberInstances);
            case "classWeightedAccuracy":
                return ZVal.isNull(this.classWeightedAccuracy);
            case "classificationAccuracy":
                return ZVal.isNull(this.classificationAccuracy);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "confusionMatrixRowTotals":
                this.confusionMatrixRowTotals = value;
                break;
            case "numberLabels":
                this.numberLabels = value;
                break;
            case "confusionMatrix":
                this.confusionMatrix = value;
                break;
            case "meanSquaredError":
                this.meanSquaredError = value;
                break;
            case "modelType":
                this.modelType = value;
                break;
            case "numberInstances":
                this.numberInstances = value;
                break;
            case "classWeightedAccuracy":
                this.classWeightedAccuracy = value;
                break;
            case "classificationAccuracy":
                this.classificationAccuracy = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setConfusionMatrixRowTotals(RuntimeEnv env, Object... args) {
        Object confusionMatrixRowTotals = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_TrainingModelInfo.class,
                "confusionMatrixRowTotals",
                confusionMatrixRowTotals);

        return null;
    }

    public Object getConfusionMatrixRowTotals(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_TrainingModelInfo.class, "confusionMatrixRowTotals"));
    }

    public Object setNumberLabels(RuntimeEnv env, Object... args) {
        Object numberLabels = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_TrainingModelInfo.class, "numberLabels", numberLabels);

        return null;
    }

    public Object getNumberLabels(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_TrainingModelInfo.class, "numberLabels"));
    }

    public Object setConfusionMatrix(RuntimeEnv env, Object... args) {
        Object confusionMatrix = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_TrainingModelInfo.class, "confusionMatrix", confusionMatrix);

        return null;
    }

    public Object getConfusionMatrix(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_TrainingModelInfo.class, "confusionMatrix"));
    }

    public Object setMeanSquaredError(RuntimeEnv env, Object... args) {
        Object meanSquaredError = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_TrainingModelInfo.class, "meanSquaredError", meanSquaredError);

        return null;
    }

    public Object getMeanSquaredError(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_TrainingModelInfo.class, "meanSquaredError"));
    }

    public Object setModelType(RuntimeEnv env, Object... args) {
        Object modelType = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_TrainingModelInfo.class, "modelType", modelType);

        return null;
    }

    public Object getModelType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_TrainingModelInfo.class, "modelType"));
    }

    public Object setNumberInstances(RuntimeEnv env, Object... args) {
        Object numberInstances = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_TrainingModelInfo.class, "numberInstances", numberInstances);

        return null;
    }

    public Object getNumberInstances(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_TrainingModelInfo.class, "numberInstances"));
    }

    public Object setClassWeightedAccuracy(RuntimeEnv env, Object... args) {
        Object classWeightedAccuracy = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_TrainingModelInfo.class,
                "classWeightedAccuracy",
                classWeightedAccuracy);

        return null;
    }

    public Object getClassWeightedAccuracy(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_TrainingModelInfo.class, "classWeightedAccuracy"));
    }

    public Object setClassificationAccuracy(RuntimeEnv env, Object... args) {
        Object classificationAccuracy = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_TrainingModelInfo.class,
                "classificationAccuracy",
                classificationAccuracy);

        return null;
    }

    public Object getClassificationAccuracy(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_TrainingModelInfo.class, "classificationAccuracy"));
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
