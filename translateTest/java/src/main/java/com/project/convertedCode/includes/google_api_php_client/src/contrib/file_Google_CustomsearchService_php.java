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

 google-api-php-client/src/contrib/Google_CustomsearchService.php

*/

public class file_Google_CustomsearchService_php
        implements RuntimeIncludable, RuntimeFileContextInterface {

    public static final file_Google_CustomsearchService_php instance =
            new file_Google_CustomsearchService_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope23 scope = new Scope23();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope23 scope)
            throws IncludeEventException {
        // Conversion Note: class named Google_CseServiceResource was here in the source code
        // Conversion Note: class named Google_CustomsearchService was here in the source code
        // Conversion Note: class named Google_Context was here in the source code
        // Conversion Note: class named Google_ContextFacets was here in the source code
        // Conversion Note: class named Google_Promotion was here in the source code
        // Conversion Note: class named Google_PromotionBodyLines was here in the source code
        // Conversion Note: class named Google_PromotionImage was here in the source code
        // Conversion Note: class named Google_Query was here in the source code
        // Conversion Note: class named Google_Result was here in the source code
        // Conversion Note: class named Google_ResultImage was here in the source code
        // Conversion Note: class named Google_ResultLabels was here in the source code
        // Conversion Note: class named Google_Search was here in the source code
        // Conversion Note: class named Google_SearchSearchInformation was here in the source code
        // Conversion Note: class named Google_SearchSpelling was here in the source code
        // Conversion Note: class named Google_SearchUrl was here in the source code

    }

    @Override
    public String ___getRuntimeDirname() {
        return "/google-api-php-client/src/contrib";
    }

    @Override
    public String ___getRuntimeFilename() {
        return "/google-api-php-client/src/contrib/Google_CustomsearchService.php";
    }

    @Override
    public String ___getRuntimeNamespace() {
        return "";
    }

    private static class Scope23 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
