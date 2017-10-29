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

 google-api-php-client/src/auth/Google_OAuth2.php

*/

public class file_Google_OAuth2_php implements RuntimeIncludable, RuntimeFileContextInterface {

    public static final file_Google_OAuth2_php instance = new file_Google_OAuth2_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope6 scope = new Scope6();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope6 scope)
            throws IncludeEventException {
        env.include("Google_Verifier.php", stack, this, true, true);
        env.include("Google_LoginTicket.php", stack, this, true, true);
        env.include("service/Google_Utils.php", stack, this, true, true);
        // Conversion Note: class named Google_OAuth2 was here in the source code

    }

    @Override
    public String ___getRuntimeDirname() {
        return "/google-api-php-client/src/auth";
    }

    @Override
    public String ___getRuntimeFilename() {
        return "/google-api-php-client/src/auth/Google_OAuth2.php";
    }

    @Override
    public String ___getRuntimeNamespace() {
        return "";
    }

    private static class Scope6 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
