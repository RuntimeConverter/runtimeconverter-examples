package com.project.convertedCode.includes.google_api_php_client.src.auth;

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

 google-api-php-client/src/auth/Google_LoginTicket.php

*/

public class file_Google_LoginTicket_php implements RuntimeIncludable, RuntimeFileContextInterface {

    public static final file_Google_LoginTicket_php instance = new file_Google_LoginTicket_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope5 scope = new Scope5();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope5 scope)
            throws IncludeEventException {
        // Conversion Note: class named Google_LoginTicket was here in the source code

    }

    @Override
    public String ___getRuntimeDirname() {
        return "/google-api-php-client/src/auth";
    }

    @Override
    public String ___getRuntimeFilename() {
        return "/google-api-php-client/src/auth/Google_LoginTicket.php";
    }

    @Override
    public String ___getRuntimeNamespace() {
        return "";
    }

    private static class Scope5 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
