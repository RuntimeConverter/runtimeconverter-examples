package com.project.convertedCode.includes;

import com.project.convertedCode.globalNamespace.classes.Google_Client;
import com.project.convertedCode.globalNamespace.functions.russianToEnglishTransliterated;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.modules.standard.constants.function_constant;
import com.project.convertedCode.globalNamespace.classes.Google_TranslateService;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 translate.php

*/

public class file_translate_php implements RuntimeIncludable, RuntimeFileContextInterface {

    public static final file_translate_php instance = new file_translate_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope59 scope = new Scope59();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope59 scope)
            throws IncludeEventException {
        env.include("google-api-php-client/src/Google_Client.php", stack, this, true, true);
        env.include(
                "google-api-php-client/src/contrib/Google_TranslateService.php",
                stack,
                this,
                true,
                true);
        scope.text = ZVal.assign(ZVal.getElement(scope._REQUEST, "text"));
        env.defineConstant(null, "NL_REPLACE", "*^*");

        scope.text =
                NamespaceGlobal.str_replace.call(
                        env,
                        new RuntimeArgsWithReferences(),
                        "\n",
                        function_constant.f.call(env, "NL_REPLACE"),
                        scope.text);
        scope.client = new Google_Client(env);
        env.callMethod(
                scope.client,
                "setApplicationName",
                file_translate_php.class,
                "Google Translate PHP Starter Application");
        env.callMethod(
                scope.client,
                "setClientId",
                file_translate_php.class,
                "#####removed#####");
        env.callMethod(
                scope.client,
                "setClientSecret",
                file_translate_php.class,
                "#####removed#####");
        env.callMethod(
                scope.client, "setRedirectUri", file_translate_php.class, "http://localhost");
        env.callMethod(
                scope.client,
                "setDeveloperKey",
                file_translate_php.class,
                "#####removed#####");
        scope.service = new Google_TranslateService(env, scope.client);
        scope.result = ZVal.newArray();
        scope.translations =
                env.callMethod(
                        ZVal.getProperty(scope.service, file_translate_php.class, "translations"),
                        "listTranslations",
                        file_translate_php.class,
                        scope.text,
                        "ru",
                        ZVal.newArray(new ZPair("source", "en")));
        ZVal.putArrayElement(
                scope.result,
                "ru",
                ZVal.isset(
                                ZVal.getElementRecursive(
                                        scope.translations, "translations", 0, "translatedText"))
                        ? ZVal.getElementRecursive(
                                scope.translations, "translations", 0, "translatedText")
                        : "");
        scope.translations =
                env.callMethod(
                        ZVal.getProperty(scope.service, file_translate_php.class, "translations"),
                        "listTranslations",
                        file_translate_php.class,
                        scope.text,
                        "en",
                        ZVal.newArray(new ZPair("source", "ru")));
        ZVal.putArrayElement(
                scope.result,
                "en",
                ZVal.isset(
                                ZVal.getElementRecursive(
                                        scope.translations, "translations", 0, "translatedText"))
                        ? ZVal.getElementRecursive(
                                scope.translations, "translations", 0, "translatedText")
                        : "");
        ZVal.putArrayElement(
                scope.result,
                "en",
                NamespaceGlobal.nl2br.call(env, ZVal.getElement(scope.result, "en")));
        ZVal.putArrayElement(
                scope.result,
                "ru",
                NamespaceGlobal.nl2br.call(env, ZVal.getElement(scope.result, "ru")));
        ZVal.putArrayElement(
                scope.result,
                "en",
                NamespaceGlobal.str_replace.call(
                        env,
                        new RuntimeArgsWithReferences(),
                        function_constant.f.call(env, "NL_REPLACE"),
                        "<br />",
                        ZVal.getElement(scope.result, "en")));
        ZVal.putArrayElement(
                scope.result,
                "ru",
                NamespaceGlobal.str_replace.call(
                        env,
                        new RuntimeArgsWithReferences(),
                        function_constant.f.call(env, "NL_REPLACE"),
                        "<br />",
                        ZVal.getElement(scope.result, "ru")));
        ZVal.putArrayElement(
                scope.result,
                "en",
                NamespaceGlobal.str_replace.call(
                        env,
                        new RuntimeArgsWithReferences(),
                        "* ^ *",
                        "<br />",
                        ZVal.getElement(scope.result, "en")));
        ZVal.putArrayElement(
                scope.result,
                "ru",
                NamespaceGlobal.str_replace.call(
                        env,
                        new RuntimeArgsWithReferences(),
                        "* ^ *",
                        "<br />",
                        ZVal.getElement(scope.result, "ru")));
        if (ZVal.toBool(ZVal.notEqualityCheck(ZVal.getElement(scope.result, "en"), scope.text))
                && ZVal.toBool(!ZVal.isTrue(NamespaceGlobal.stripos.call(env, scope.text, " ")))) {
            scope.transliterated = russianToEnglishTransliterated.f.call(env, scope.text);
            ZVal.putArrayElement(scope.result, "transliterated", scope.transliterated);
        }

        env.echo(NamespaceGlobal.json_encode.call(env, scope.result));
        // a function named russianToEnglishTransliterated was defined here with PHP code
        // a function named transliterate was defined here with PHP code

    }

    @Override
    public String ___getRuntimeDirname() {
        return "/";
    }

    @Override
    public String ___getRuntimeFilename() {
        return "/translate.php";
    }

    @Override
    public String ___getRuntimeNamespace() {
        return "";
    }

    private static class Scope59 implements UpdateRuntimeScopeInterface {

        Object result;
        Object service;
        Object translations;
        Object client;
        Object _REQUEST;
        Object text;
        Object transliterated;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("result", this.result);
            stack.setVariable("service", this.service);
            stack.setVariable("translations", this.translations);
            stack.setVariable("client", this.client);
            stack.setVariable("_REQUEST", this._REQUEST);
            stack.setVariable("text", this.text);
            stack.setVariable("transliterated", this.transliterated);
        }

        public void updateScope(RuntimeStack stack) {

            this.result = stack.getVariable("result");
            this.service = stack.getVariable("service");
            this.translations = stack.getVariable("translations");
            this.client = stack.getVariable("client");
            this._REQUEST = stack.getVariable("_REQUEST");
            this.text = stack.getVariable("text");
            this.transliterated = stack.getVariable("transliterated");
        }
    }
}
