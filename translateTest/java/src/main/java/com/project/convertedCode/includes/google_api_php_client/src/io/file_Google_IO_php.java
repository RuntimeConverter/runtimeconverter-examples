package com.project.convertedCode.includes.google_api_php_client.src.io;

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

 google-api-php-client/src/io/Google_IO.php

*/

public class file_Google_IO_php implements RuntimeIncludable, RuntimeFileContextInterface {

    public static final file_Google_IO_php instance = new file_Google_IO_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope50 scope = new Scope50();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope50 scope)
            throws IncludeEventException {
        env.include("io/Google_HttpRequest.php", stack, this, true, true);
        env.include("io/Google_CurlIO.php", stack, this, true, true);
        env.include("io/Google_REST.php", stack, this, true, true);
        // Conversion Note: class named Google_IO was here in the source code

    }

    @Override
    public String ___getRuntimeDirname() {
        return "/google-api-php-client/src/io";
    }

    @Override
    public String ___getRuntimeFilename() {
        return "/google-api-php-client/src/io/Google_IO.php";
    }

    @Override
    public String ___getRuntimeNamespace() {
        return "";
    }

    private static class Scope50 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
