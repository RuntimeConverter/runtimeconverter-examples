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

 google-api-php-client/src/contrib/Google_PagespeedonlineService.php

*/

public class file_Google_PagespeedonlineService_php
        implements RuntimeIncludable, RuntimeFileContextInterface {

    public static final file_Google_PagespeedonlineService_php instance =
            new file_Google_PagespeedonlineService_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope33 scope = new Scope33();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope33 scope)
            throws IncludeEventException {
        // Conversion Note: class named Google_PagespeedapiServiceResource was here in the source code
        // Conversion Note: class named Google_PagespeedonlineService was here in the source code
        // Conversion Note: class named Google_Result was here in the source code
        // Conversion Note: class named Google_ResultFormattedResults was here in the source code
        // Conversion Note: class named Google_ResultFormattedResultsRuleResults was here in the source code
        // Conversion Note: class named Google_ResultFormattedResultsRuleResultsUrlBlocks was here in the source code
        // Conversion Note: class named Google_ResultFormattedResultsRuleResultsUrlBlocksHeader was here in the source code
        // Conversion Note: class named Google_ResultFormattedResultsRuleResultsUrlBlocksHeaderArgs was here in the source code
        // Conversion Note: class named Google_ResultFormattedResultsRuleResultsUrlBlocksUrls was here in the source code
        // Conversion Note: class named Google_ResultFormattedResultsRuleResultsUrlBlocksUrlsDetails was here in the source code
        // Conversion Note: class named Google_ResultFormattedResultsRuleResultsUrlBlocksUrlsDetailsArgs was here in the source code
        // Conversion Note: class named Google_ResultFormattedResultsRuleResultsUrlBlocksUrlsResult was here in the source code
        // Conversion Note: class named Google_ResultFormattedResultsRuleResultsUrlBlocksUrlsResultArgs was here in the source code
        // Conversion Note: class named Google_ResultPageStats was here in the source code
        // Conversion Note: class named Google_ResultVersion was here in the source code

    }

    @Override
    public String ___getRuntimeDirname() {
        return "/google-api-php-client/src/contrib";
    }

    @Override
    public String ___getRuntimeFilename() {
        return "/google-api-php-client/src/contrib/Google_PagespeedonlineService.php";
    }

    @Override
    public String ___getRuntimeNamespace() {
        return "";
    }

    private static class Scope33 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
