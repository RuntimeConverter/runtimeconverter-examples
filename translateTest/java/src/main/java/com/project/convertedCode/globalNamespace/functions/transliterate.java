package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.classes.ConvertedRuntimeException;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 translate.php

*/

public class transliterate extends FunctionBaseRegular implements RuntimeFileContextInterface {

    public static transliterate f = new transliterate();

    public Object call(RuntimeEnv env, Object... args) {
        Object a = null;
        Object b = null;
        Object russian = null;
        Object string = null;
        Object english = null;
        english = "q w e r t y u i o p [ ] \\ \\ a s d f g h j k l ; ' z x c v b n m , . /";
        russian =
                "\u0439 \u0446 \u0443 \u043A \u0435 \u043D \u0433 \u0448 \u0449 \u0437 \u0445 \u044A \\ \u0444 \u044B \u0432 \u0430 \u043F \u0440 \u043E \u043B \u0434 \u0436 \u044D \u044F \u0447 \u0441 \u043C \u0438 \u0442 \u044C \u0431 \u044E .";
        russian = "nd u have to g e n u s u s b \\ f s c a n p o l d e f h i s m and t s u b .";
        a = NamespaceGlobal.explode.call(env, " ", english);
        b = NamespaceGlobal.explode.call(env, " ", russian);
        if (ZVal.equalityCheck(CRArrayF.count.call(env, a), CRArrayF.count.call(env, b))) {
            return ZVal.assign(
                    NamespaceGlobal.str_replace.call(
                            env, new RuntimeArgsWithReferences(), a, b, string));

        } else {
            throw new ConvertedRuntimeException(env);
        }
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
