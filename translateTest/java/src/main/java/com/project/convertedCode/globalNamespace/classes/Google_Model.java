package com.project.convertedCode.globalNamespace.classes;

import com.project.convertedCode.globalNamespace.classes.Google_Exception;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/service/Google_Model.php

*/

public class Google_Model extends RuntimeClassBase implements RuntimeFileContextInterface {

    public Google_Model(RuntimeEnv env, Object... args) {
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
            case "mapTypes":
                if (Google_Model.class.isAssignableFrom(caller)) {

                    return this.mapTypes(env, args);
                }
                break;
            case "isAssociativeArray":
                if (Google_Model.class.isAssignableFrom(caller)) {

                    return this.isAssociativeArray(env, args);
                }
                break;
            case "createObjectFromName":
                if (Google_Model.class.equals(caller)) {

                    return this.createObjectFromName(env, args);
                }
                break;
            case "useObjects":
                if (Google_Model.class.isAssignableFrom(caller)) {

                    return this.useObjects(env, args);
                }
                break;
            case "assertIsArray":
                return this.assertIsArray(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object array = null;
        if (ZVal.toBool(ZVal.equalityCheck(NamespaceGlobal.func_num_args.call(env), 1))
                && ZVal.toBool(
                        NamespaceGlobal.is_array.call(
                                env, NamespaceGlobal.func_get_arg.call(env, 0)))) {
            array = NamespaceGlobal.func_get_arg.call(env, 0);
            env.callMethod(this, "mapTypes", Google_Model.class, array);
        }

        return null;
    }

    protected Object mapTypes(RuntimeEnv env, Object... args) {
        Object array = ZVal.assignParameter(args, 0, null);
        Object val = ZVal.newArray();
        Object arrayItem = null;
        Object keyTypeName = null;
        Object keyDataType = null;
        Object arrayObject = ZVal.newArray();
        Object arrayKey = null;
        Object arrayIndex = null;
        Object key = null;
        for (ZPair zpairResult20 : ZVal.getIterable(array)) {
            key = ZVal.assign(zpairResult20.getKey());
            val = ZVal.assign(zpairResult20.getValue());
            ZVal.setProperty(this, Google_Model.class, key, val);
            keyTypeName = ZVal.toString("__" + ZVal.toString(key)) + "Type";
            keyDataType = ZVal.toString("__" + ZVal.toString(key)) + "DataType";
            if (ZVal.toBool(env.callMethod(this, "useObjects", Google_Model.class))
                    && ZVal.toBool(NamespaceGlobal.property_exists.call(env, this, keyTypeName))) {
                if (ZVal.isTrue(
                        env.callMethod(this, "isAssociativeArray", Google_Model.class, val))) {
                    if (ZVal.toBool(
                                    ZVal.isset(
                                            ZVal.getProperty(
                                                    this, Google_Model.class, keyDataType)))
                            && ZVal.toBool(
                                    ZVal.equalityCheck(
                                            "map",
                                            ZVal.getProperty(
                                                    this, Google_Model.class, keyDataType)))) {
                        for (ZPair zpairResult21 : ZVal.getIterable(val)) {
                            arrayKey = ZVal.assign(zpairResult21.getKey());
                            arrayItem = ZVal.assign(zpairResult21.getValue());
                            ZVal.putArrayElement(
                                    val,
                                    arrayKey,
                                    env.callMethod(
                                            this,
                                            "createObjectFromName",
                                            Google_Model.class,
                                            keyTypeName,
                                            arrayItem));
                        }

                        ZVal.setProperty(this, Google_Model.class, key, val);

                    } else {
                        ZVal.setProperty(
                                this,
                                Google_Model.class,
                                key,
                                env.callMethod(
                                        this,
                                        "createObjectFromName",
                                        Google_Model.class,
                                        keyTypeName,
                                        val));
                    }

                } else {
                    if (ZVal.isTrue(NamespaceGlobal.is_array.call(env, val))) {
                        arrayObject = ZVal.newArray();
                        for (ZPair zpairResult22 : ZVal.getIterable(val)) {
                            arrayIndex = ZVal.assign(zpairResult22.getKey());
                            arrayItem = ZVal.assign(zpairResult22.getValue());
                            ZVal.putArrayElement(
                                    arrayObject,
                                    arrayIndex,
                                    env.callMethod(
                                            this,
                                            "createObjectFromName",
                                            Google_Model.class,
                                            keyTypeName,
                                            arrayItem));
                        }

                        ZVal.setProperty(this, Google_Model.class, key, arrayObject);
                    }
                }
            }
        }

        return null;
    }

    protected Object isAssociativeArray(RuntimeEnv env, Object... args) {
        Object array = ZVal.assignParameter(args, 0, null);
        Object keys = null;
        Object key = null;
        if (!ZVal.isTrue(NamespaceGlobal.is_array.call(env, array))) {
            return ZVal.assign(false);
        }

        keys = CRArrayF.array_keys.call(env, array);
        for (ZPair zpairResult23 : ZVal.getIterable(keys)) {
            key = ZVal.assign(zpairResult23.getValue());
            if (ZVal.isTrue(NamespaceGlobal.is_string.call(env, key))) {
                return ZVal.assign(true);
            }
        }

        return ZVal.assign(false);
    }

    private Object createObjectFromName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        Object item = ZVal.assignParameter(args, 1, null);
        Object type = null;
        type = ZVal.assign(ZVal.getProperty(this, Google_Model.class, name));
        return ZVal.assign(env.createNew(type, item));
    }

    protected Object useObjects(RuntimeEnv env, Object... args) {
        Object apiConfig = env.getGlobal("apiConfig");
        ;

        return env.returnWithGlobals(
                ZVal.toBool(ZVal.isset(ZVal.getElement(apiConfig, "use_objects")))
                        && ZVal.toBool(ZVal.getElement(apiConfig, "use_objects")),
                "apiConfig",
                apiConfig);
    }

    public Object assertIsArray(RuntimeEnv env, Object... args) {
        Object other = ZVal.assignParameter(args, 0, null);
        Object type = ZVal.assignParameter(args, 1, null);
        Object method = ZVal.assignParameter(args, 2, null);
        if (ZVal.toBool(other)
                && ZVal.toBool(!ZVal.isTrue(NamespaceGlobal.is_array.call(env, other)))) {
            throw new Google_Exception(
                    env,
                    ZVal.toString(
                                    "Incorrect parameter type passed to "
                                            + ZVal.toString(method)
                                            + "(), expected an")
                            + ZVal.toString(
                                    " array containing items of type "
                                            + ZVal.toString(type)
                                            + "."));
        }

        return null;
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
