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

 google-api-php-client/src/contrib/Google_SiteVerificationService.php

*/

public class file_Google_SiteVerificationService_php
        implements RuntimeIncludable, RuntimeFileContextInterface {

    public static final file_Google_SiteVerificationService_php instance =
            new file_Google_SiteVerificationService_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope38 scope = new Scope38();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope38 scope)
            throws IncludeEventException {
        // Conversion Note: class named Google_WebResourceServiceResource was here in the source code
        // Conversion Note: class named Google_SiteVerificationService was here in the source code
        // Conversion Note: class named Google_SiteVerificationWebResourceGettokenRequest was here in the source code
        // Conversion Note: class named Google_SiteVerificationWebResourceGettokenRequestSite was here in the source code
        // Conversion Note: class named Google_SiteVerificationWebResourceGettokenResponse was here in the source code
        // Conversion Note: class named Google_SiteVerificationWebResourceListResponse was here in the source code
        // Conversion Note: class named Google_SiteVerificationWebResourceResource was here in the source code
        // Conversion Note: class named Google_SiteVerificationWebResourceResourceSite was here in the source code

    }

    @Override
    public String ___getRuntimeDirname() {
        return "/google-api-php-client/src/contrib";
    }

    @Override
    public String ___getRuntimeFilename() {
        return "/google-api-php-client/src/contrib/Google_SiteVerificationService.php";
    }

    @Override
    public String ___getRuntimeNamespace() {
        return "";
    }

    private static class Scope38 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
