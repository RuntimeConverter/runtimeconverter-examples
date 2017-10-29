package com.project.convertedCode.includes.google_api_php_client.src.service;

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

 google-api-php-client/src/service/Google_Utils.php

*/

public class file_Google_Utils_php implements RuntimeIncludable, RuntimeFileContextInterface {

    public static final file_Google_Utils_php instance = new file_Google_Utils_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope57 scope = new Scope57();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope57 scope)
            throws IncludeEventException {
        // Conversion Note: class named Google_Utils was here in the source code

    }

    @Override
    public String ___getRuntimeDirname() {
        return "/google-api-php-client/src/service";
    }

    @Override
    public String ___getRuntimeFilename() {
        return "/google-api-php-client/src/service/Google_Utils.php";
    }

    @Override
    public String ___getRuntimeNamespace() {
        return "";
    }

    private static class Scope57 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
