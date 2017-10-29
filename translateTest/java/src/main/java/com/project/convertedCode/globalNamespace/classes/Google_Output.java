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

public class Google_Output extends Google_Model implements RuntimeFileContextInterface {

    public Object kind = null;

    public Object outputLabel = null;

    public Object id = null;

    public Object __outputMultiType = "Google_OutputOutputMulti";

    public Object __outputMultiDataType = "array";

    public Object outputMulti = null;

    public Object outputValue = null;

    public Object selfLink = null;

    public Google_Output(RuntimeEnv env, Object... args) {
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
            case "setOutputLabel":
                return this.setOutputLabel(env, args);
            case "getOutputLabel":
                return this.getOutputLabel(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setOutputMulti":
                return this.setOutputMulti(env, args);
            case "getOutputMulti":
                return this.getOutputMulti(env, args);
            case "setOutputValue":
                return this.setOutputValue(env, args);
            case "getOutputValue":
                return this.getOutputValue(env, args);
            case "setSelfLink":
                return this.setSelfLink(env, args);
            case "getSelfLink":
                return this.getSelfLink(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return this.kind;
            case "outputLabel":
                return this.outputLabel;
            case "id":
                return this.id;
            case "__outputMultiType":
                if (Google_Output.class.isAssignableFrom(caller)) {

                    return this.__outputMultiType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__outputMultiDataType":
                if (Google_Output.class.isAssignableFrom(caller)) {

                    return this.__outputMultiDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "outputMulti":
                return this.outputMulti;
            case "outputValue":
                return this.outputValue;
            case "selfLink":
                return this.selfLink;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return ZVal.isNull(this.kind);
            case "outputLabel":
                return ZVal.isNull(this.outputLabel);
            case "id":
                return ZVal.isNull(this.id);
            case "__outputMultiType":
                if (Google_Output.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__outputMultiType);
                }
                break;
            case "__outputMultiDataType":
                if (Google_Output.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__outputMultiDataType);
                }
                break;
            case "outputMulti":
                return ZVal.isNull(this.outputMulti);
            case "outputValue":
                return ZVal.isNull(this.outputValue);
            case "selfLink":
                return ZVal.isNull(this.selfLink);
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
            case "outputLabel":
                this.outputLabel = value;
                break;
            case "id":
                this.id = value;
                break;
            case "__outputMultiType":
                if (Google_Output.class.isAssignableFrom(caller)) {

                    this.__outputMultiType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__outputMultiDataType":
                if (Google_Output.class.isAssignableFrom(caller)) {

                    this.__outputMultiDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "outputMulti":
                this.outputMulti = value;
                break;
            case "outputValue":
                this.outputValue = value;
                break;
            case "selfLink":
                this.selfLink = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Output.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Output.class, "kind"));
    }

    public Object setOutputLabel(RuntimeEnv env, Object... args) {
        Object outputLabel = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Output.class, "outputLabel", outputLabel);

        return null;
    }

    public Object getOutputLabel(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Output.class, "outputLabel"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Output.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Output.class, "id"));
    }

    public Object setOutputMulti(RuntimeEnv env, Object... args) {
        Object outputMulti = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Output.class,
                outputMulti,
                "Google_OutputOutputMulti",
                "setOutputMulti");
        ZVal.setProperty(this, Google_Output.class, "outputMulti", outputMulti);

        return null;
    }

    public Object getOutputMulti(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Output.class, "outputMulti"));
    }

    public Object setOutputValue(RuntimeEnv env, Object... args) {
        Object outputValue = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Output.class, "outputValue", outputValue);

        return null;
    }

    public Object getOutputValue(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Output.class, "outputValue"));
    }

    public Object setSelfLink(RuntimeEnv env, Object... args) {
        Object selfLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Output.class, "selfLink", selfLink);

        return null;
    }

    public Object getSelfLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Output.class, "selfLink"));
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
