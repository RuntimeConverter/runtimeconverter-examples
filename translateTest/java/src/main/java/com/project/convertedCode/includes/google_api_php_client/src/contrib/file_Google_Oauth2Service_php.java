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

 google-api-php-client/src/contrib/Google_Oauth2Service.php

*/

public class file_Google_Oauth2Service_php
        implements RuntimeIncludable, RuntimeFileContextInterface {

    public static final file_Google_Oauth2Service_php instance =
            new file_Google_Oauth2Service_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope31 scope = new Scope31();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope31 scope)
            throws IncludeEventException {
        // Conversion Note: class named Google_UserinfoServiceResource was here in the source code
        // Conversion Note: class named Google_UserinfoV2ServiceResource was here in the source code
        // Conversion Note: class named Google_UserinfoV2MeServiceResource was here in the source code
        // Conversion Note: class named Google_Oauth2Service was here in the source code
        // Conversion Note: class named Google_Tokeninfo was here in the source code
        // Conversion Note: class named Google_Userinfo was here in the source code

    }

    @Override
    public String ___getRuntimeDirname() {
        return "/google-api-php-client/src/contrib";
    }

    @Override
    public String ___getRuntimeFilename() {
        return "/google-api-php-client/src/contrib/Google_Oauth2Service.php";
    }

    @Override
    public String ___getRuntimeNamespace() {
        return "";
    }

    private static class Scope31 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
