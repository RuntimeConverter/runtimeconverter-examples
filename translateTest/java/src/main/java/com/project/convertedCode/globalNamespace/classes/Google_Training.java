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

public class Google_Training extends Google_Model implements RuntimeFileContextInterface {

    public Object kind = null;

    public Object storageDataLocation = null;

    public Object storagePMMLModelLocation = null;

    public Object __dataAnalysisType = "Google_TrainingDataAnalysis";

    public Object __dataAnalysisDataType = "";

    public Object dataAnalysis = null;

    public Object trainingStatus = null;

    public Object __modelInfoType = "Google_TrainingModelInfo";

    public Object __modelInfoDataType = "";

    public Object modelInfo = null;

    public Object storagePMMLLocation = null;

    public Object id = null;

    public Object selfLink = null;

    public Object utility = null;

    public Google_Training(RuntimeEnv env, Object... args) {
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
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setStorageDataLocation":
                return this.setStorageDataLocation(env, args);
            case "getStorageDataLocation":
                return this.getStorageDataLocation(env, args);
            case "setStoragePMMLModelLocation":
                return this.setStoragePMMLModelLocation(env, args);
            case "getStoragePMMLModelLocation":
                return this.getStoragePMMLModelLocation(env, args);
            case "setDataAnalysis":
                return this.setDataAnalysis(env, args);
            case "getDataAnalysis":
                return this.getDataAnalysis(env, args);
            case "setTrainingStatus":
                return this.setTrainingStatus(env, args);
            case "getTrainingStatus":
                return this.getTrainingStatus(env, args);
            case "setModelInfo":
                return this.setModelInfo(env, args);
            case "getModelInfo":
                return this.getModelInfo(env, args);
            case "setStoragePMMLLocation":
                return this.setStoragePMMLLocation(env, args);
            case "getStoragePMMLLocation":
                return this.getStoragePMMLLocation(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setSelfLink":
                return this.setSelfLink(env, args);
            case "getSelfLink":
                return this.getSelfLink(env, args);
            case "setUtility":
                return this.setUtility(env, args);
            case "getUtility":
                return this.getUtility(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return this.kind;
            case "storageDataLocation":
                return this.storageDataLocation;
            case "storagePMMLModelLocation":
                return this.storagePMMLModelLocation;
            case "__dataAnalysisType":
                if (Google_Training.class.isAssignableFrom(caller)) {

                    return this.__dataAnalysisType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__dataAnalysisDataType":
                if (Google_Training.class.isAssignableFrom(caller)) {

                    return this.__dataAnalysisDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "dataAnalysis":
                return this.dataAnalysis;
            case "trainingStatus":
                return this.trainingStatus;
            case "__modelInfoType":
                if (Google_Training.class.isAssignableFrom(caller)) {

                    return this.__modelInfoType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__modelInfoDataType":
                if (Google_Training.class.isAssignableFrom(caller)) {

                    return this.__modelInfoDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "modelInfo":
                return this.modelInfo;
            case "storagePMMLLocation":
                return this.storagePMMLLocation;
            case "id":
                return this.id;
            case "selfLink":
                return this.selfLink;
            case "utility":
                return this.utility;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return ZVal.isNull(this.kind);
            case "storageDataLocation":
                return ZVal.isNull(this.storageDataLocation);
            case "storagePMMLModelLocation":
                return ZVal.isNull(this.storagePMMLModelLocation);
            case "__dataAnalysisType":
                if (Google_Training.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__dataAnalysisType);
                }
                break;
            case "__dataAnalysisDataType":
                if (Google_Training.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__dataAnalysisDataType);
                }
                break;
            case "dataAnalysis":
                return ZVal.isNull(this.dataAnalysis);
            case "trainingStatus":
                return ZVal.isNull(this.trainingStatus);
            case "__modelInfoType":
                if (Google_Training.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__modelInfoType);
                }
                break;
            case "__modelInfoDataType":
                if (Google_Training.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__modelInfoDataType);
                }
                break;
            case "modelInfo":
                return ZVal.isNull(this.modelInfo);
            case "storagePMMLLocation":
                return ZVal.isNull(this.storagePMMLLocation);
            case "id":
                return ZVal.isNull(this.id);
            case "selfLink":
                return ZVal.isNull(this.selfLink);
            case "utility":
                return ZVal.isNull(this.utility);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                this.kind = value;
                break;
            case "storageDataLocation":
                this.storageDataLocation = value;
                break;
            case "storagePMMLModelLocation":
                this.storagePMMLModelLocation = value;
                break;
            case "__dataAnalysisType":
                if (Google_Training.class.isAssignableFrom(caller)) {

                    this.__dataAnalysisType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__dataAnalysisDataType":
                if (Google_Training.class.isAssignableFrom(caller)) {

                    this.__dataAnalysisDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "dataAnalysis":
                this.dataAnalysis = value;
                break;
            case "trainingStatus":
                this.trainingStatus = value;
                break;
            case "__modelInfoType":
                if (Google_Training.class.isAssignableFrom(caller)) {

                    this.__modelInfoType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__modelInfoDataType":
                if (Google_Training.class.isAssignableFrom(caller)) {

                    this.__modelInfoDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "modelInfo":
                this.modelInfo = value;
                break;
            case "storagePMMLLocation":
                this.storagePMMLLocation = value;
                break;
            case "id":
                this.id = value;
                break;
            case "selfLink":
                this.selfLink = value;
                break;
            case "utility":
                this.utility = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Training.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Training.class, "kind"));
    }

    public Object setStorageDataLocation(RuntimeEnv env, Object... args) {
        Object storageDataLocation = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Training.class, "storageDataLocation", storageDataLocation);

        return null;
    }

    public Object getStorageDataLocation(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Training.class, "storageDataLocation"));
    }

    public Object setStoragePMMLModelLocation(RuntimeEnv env, Object... args) {
        Object storagePMMLModelLocation = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_Training.class, "storagePMMLModelLocation", storagePMMLModelLocation);

        return null;
    }

    public Object getStoragePMMLModelLocation(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_Training.class, "storagePMMLModelLocation"));
    }

    public Object setDataAnalysis(RuntimeEnv env, Object... args) {
        Object dataAnalysis = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Training.class, "dataAnalysis", dataAnalysis);

        return null;
    }

    public Object getDataAnalysis(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Training.class, "dataAnalysis"));
    }

    public Object setTrainingStatus(RuntimeEnv env, Object... args) {
        Object trainingStatus = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Training.class, "trainingStatus", trainingStatus);

        return null;
    }

    public Object getTrainingStatus(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Training.class, "trainingStatus"));
    }

    public Object setModelInfo(RuntimeEnv env, Object... args) {
        Object modelInfo = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Training.class, "modelInfo", modelInfo);

        return null;
    }

    public Object getModelInfo(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Training.class, "modelInfo"));
    }

    public Object setStoragePMMLLocation(RuntimeEnv env, Object... args) {
        Object storagePMMLLocation = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Training.class, "storagePMMLLocation", storagePMMLLocation);

        return null;
    }

    public Object getStoragePMMLLocation(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Training.class, "storagePMMLLocation"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Training.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Training.class, "id"));
    }

    public Object setSelfLink(RuntimeEnv env, Object... args) {
        Object selfLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Training.class, "selfLink", selfLink);

        return null;
    }

    public Object getSelfLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Training.class, "selfLink"));
    }

    public Object setUtility(RuntimeEnv env, Object... args) {
        Object utility = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Training.class,
                utility,
                "Google_double",
                "setUtility");
        ZVal.setProperty(this, Google_Training.class, "utility", utility);

        return null;
    }

    public Object getUtility(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Training.class, "utility"));
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
