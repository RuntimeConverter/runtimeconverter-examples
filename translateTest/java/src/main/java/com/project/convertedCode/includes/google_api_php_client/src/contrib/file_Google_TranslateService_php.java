package com.project.convertedCode.includes.google_api_php_client.src.contrib;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_TranslateService.php

*/

public class file_Google_TranslateService_php
        implements RuntimeIncludable, RuntimeFileContextInterface {

    public static final file_Google_TranslateService_php instance =
            new file_Google_TranslateService_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope42 scope = new Scope42();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope42 scope)
            throws IncludeEventException {
        // Conversion Note: class named Google_LanguagesServiceResource was here in the source code
        // Conversion Note: class named Google_DetectionsServiceResource was here in the source code
        // Conversion Note: class named Google_TranslationsServiceResource was here in the source code
        // Conversion Note: class named Google_TranslateService was here in the source code
        // Conversion Note: class named Google_DetectionsListResponse was here in the source code
        // Conversion Note: class named Google_DetectionsResourceItems was here in the source code
        // Conversion Note: class named Google_LanguagesListResponse was here in the source code
        // Conversion Note: class named Google_LanguagesResource was here in the source code
        // Conversion Note: class named Google_TranslationsListResponse was here in the source code
        // Conversion Note: class named Google_TranslationsResource was here in the source code

    }

    @Override
    public String ___getRuntimeDirname() {
        return "/google-api-php-client/src/contrib";
    }

    @Override
    public String ___getRuntimeFilename() {
        return "/google-api-php-client/src/contrib/Google_TranslateService.php";
    }

    @Override
    public String ___getRuntimeNamespace() {
        return "";
    }

    private static class Scope42 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
