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

 google-api-php-client/src/contrib/Google_TaskqueueService.php

*/

public class file_Google_TaskqueueService_php
        implements RuntimeIncludable, RuntimeFileContextInterface {

    public static final file_Google_TaskqueueService_php instance =
            new file_Google_TaskqueueService_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope40 scope = new Scope40();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope40 scope)
            throws IncludeEventException {
        // Conversion Note: class named Google_TaskqueuesServiceResource was here in the source code
        // Conversion Note: class named Google_TasksServiceResource was here in the source code
        // Conversion Note: class named Google_TaskqueueService was here in the source code
        // Conversion Note: class named Google_Task was here in the source code
        // Conversion Note: class named Google_TaskQueue was here in the source code
        // Conversion Note: class named Google_TaskQueueAcl was here in the source code
        // Conversion Note: class named Google_TaskQueueStats was here in the source code
        // Conversion Note: class named Google_Tasks was here in the source code
        // Conversion Note: class named Google_Tasks2 was here in the source code

    }

    @Override
    public String ___getRuntimeDirname() {
        return "/google-api-php-client/src/contrib";
    }

    @Override
    public String ___getRuntimeFilename() {
        return "/google-api-php-client/src/contrib/Google_TaskqueueService.php";
    }

    @Override
    public String ___getRuntimeNamespace() {
        return "";
    }

    private static class Scope40 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
