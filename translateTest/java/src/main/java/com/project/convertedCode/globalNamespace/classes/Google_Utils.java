package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/service/Google_Utils.php

*/

public class Google_Utils extends RuntimeClassBase implements RuntimeFileContextInterface {

    public Google_Utils(RuntimeEnv env, Object... args) {
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

    public static Object urlSafeB64Encode(RuntimeEnv env, Object... args) {
        Object data = ZVal.assignParameter(args, 0, null);
        Object b64 = null;
        b64 = NamespaceGlobal.base64_encode.call(env, data);
        b64 =
                NamespaceGlobal.str_replace.call(
                        env,
                        new RuntimeArgsWithReferences(),
                        ZVal.newArray(
                                new ZPair(0, "+"),
                                new ZPair(1, "/"),
                                new ZPair(2, "\\r"),
                                new ZPair(3, "\\n"),
                                new ZPair(4, "=")),
                        ZVal.newArray(new ZPair(0, "-"), new ZPair(1, "_")),
                        b64);
        return ZVal.assign(b64);
    }

    public static Object urlSafeB64Decode(RuntimeEnv env, Object... args) {
        Object b64 = ZVal.assignParameter(args, 0, null);
        b64 =
                NamespaceGlobal.str_replace.call(
                        env,
                        new RuntimeArgsWithReferences(),
                        ZVal.newArray(new ZPair(0, "-"), new ZPair(1, "_")),
                        ZVal.newArray(new ZPair(0, "+"), new ZPair(1, "/")),
                        b64);
        return ZVal.assign(NamespaceGlobal.base64_decode.call(env, b64));
    }

    public static Object getStrLen(RuntimeEnv env, Object... args) {
        Object str = ZVal.assignParameter(args, 0, null);
        if (ZVal.isNull(str)) {
            str = ZVal.newArray();
        }
        Object ret = null;
        Object ordinalValue = null;
        Object d = null;
        Object count = null;
        Object strlenVar = null;
        strlenVar = NamespaceGlobal.strlen.call(env, str);
        d = ZVal.assign(ret = 0);
        for (count = 0; ZVal.isLessThan(count, '<', strlenVar); count = ZVal.increment(count)) {
            ordinalValue = NamespaceGlobal.ord.call(env, ZVal.getElement(str, ret));
            SwitchEnumType1 switchVariable1 =
                    ZVal.getEnum(
                            true,
                            SwitchEnumType1.DEFAULT_CASE,
                            SwitchEnumType1.RESERVED_CHARS_1990729969_MINUS_null,
                            ZVal.toBool(ZVal.isGreaterThanOrEqualTo(ordinalValue, ">=", 32))
                                    && ZVal.toBool(
                                            ZVal.isLessThanOrEqualTo(ordinalValue, "<=", 127)),
                            SwitchEnumType1.RESERVED_CHARS_874787471_MINUS_null,
                            ZVal.equalityCheck(ZVal.toLong(ordinalValue) & ZVal.toLong(224), 192),
                            SwitchEnumType1.RESERVED_CHARS_322943273_MINUS_null,
                            ZVal.equalityCheck(ZVal.toLong(ordinalValue) & ZVal.toLong(240), 224),
                            SwitchEnumType1.RESERVED_CHARS_2072744756_MINUS_null,
                            ZVal.equalityCheck(ZVal.toLong(ordinalValue) & ZVal.toLong(248), 240),
                            SwitchEnumType1.RESERVED_CHARS_482011873_MINUS_null,
                            ZVal.equalityCheck(ZVal.toLong(ordinalValue) & ZVal.toLong(252), 248),
                            SwitchEnumType1.RESERVED_CHARS_1390086784_MINUS_null,
                            ZVal.equalityCheck(ZVal.toLong(ordinalValue) & ZVal.toLong(254), 252));
            switch (switchVariable1) {
                case RESERVED_CHARS_1990729969_MINUS_null:
                    ret = ZVal.increment(ret);
                    break;
                case RESERVED_CHARS_874787471_MINUS_null:
                    ret = ZAssignment.add("+=", ret, 2);
                    break;
                case RESERVED_CHARS_322943273_MINUS_null:
                    ret = ZAssignment.add("+=", ret, 3);
                    break;
                case RESERVED_CHARS_2072744756_MINUS_null:
                    ret = ZAssignment.add("+=", ret, 4);
                    break;
                case RESERVED_CHARS_482011873_MINUS_null:
                    ret = ZAssignment.add("+=", ret, 5);
                    break;
                case RESERVED_CHARS_1390086784_MINUS_null:
                    ret = ZAssignment.add("+=", ret, 6);
                    break;
                case DEFAULT_CASE:
                    ret = ZVal.increment(ret);
            }
            ;
        }

        return ZVal.assign(ret);
    }

    public static Object normalize(RuntimeEnv env, Object... args) {
        Object arr = ZVal.assignParameter(args, 0, null);
        Object val = null;
        Object normalized = ZVal.newArray();
        Object key = null;
        if (!ZVal.isTrue(NamespaceGlobal.is_array.call(env, arr))) {
            return ZVal.assign(ZVal.newArray());
        }

        normalized = ZVal.newArray();
        for (ZPair zpairResult27 : ZVal.getIterable(arr)) {
            key = ZVal.assign(zpairResult27.getKey());
            val = ZVal.assign(zpairResult27.getValue());
            ZVal.putArrayElement(normalized, NamespaceGlobal.strtolower.call(env, key), val);
        }

        return ZVal.assign(normalized);
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

    private enum SwitchEnumType1 {
        RESERVED_CHARS_1990729969_MINUS_null,
        RESERVED_CHARS_874787471_MINUS_null,
        RESERVED_CHARS_322943273_MINUS_null,
        RESERVED_CHARS_2072744756_MINUS_null,
        RESERVED_CHARS_482011873_MINUS_null,
        RESERVED_CHARS_1390086784_MINUS_null,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
