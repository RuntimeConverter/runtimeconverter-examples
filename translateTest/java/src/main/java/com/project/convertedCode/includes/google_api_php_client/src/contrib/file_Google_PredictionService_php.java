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

 google-api-php-client/src/contrib/Google_PredictionService.php

*/

public class file_Google_PredictionService_php
        implements RuntimeIncludable, RuntimeFileContextInterface {

    public static final file_Google_PredictionService_php instance =
            new file_Google_PredictionService_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope36 scope = new Scope36();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope36 scope)
            throws IncludeEventException {
        // Conversion Note: class named Google_TrainedmodelsServiceResource was here in the source code
        // Conversion Note: class named Google_HostedmodelsServiceResource was here in the source code
        // Conversion Note: class named Google_PredictionService was here in the source code
        // Conversion Note: class named Google_Input was here in the source code
        // Conversion Note: class named Google_InputInput was here in the source code
        // Conversion Note: class named Google_Output was here in the source code
        // Conversion Note: class named Google_OutputOutputMulti was here in the source code
        // Conversion Note: class named Google_Training was here in the source code
        // Conversion Note: class named Google_TrainingDataAnalysis was here in the source code
        // Conversion Note: class named Google_TrainingModelInfo was here in the source code
        // Conversion Note: class named Google_Update was here in the source code

    }

    @Override
    public String ___getRuntimeDirname() {
        return "/google-api-php-client/src/contrib";
    }

    @Override
    public String ___getRuntimeFilename() {
        return "/google-api-php-client/src/contrib/Google_PredictionService.php";
    }

    @Override
    public String ___getRuntimeNamespace() {
        return "";
    }

    private static class Scope36 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
