package com.project.convertedCode.includes.google_api_php_client.src;

import com.runtimeconverter.runtime.modules.standard.other.function_get_include_path;
import com.runtimeconverter.runtime.modules.standard.other.function_set_include_path;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.runtimeconverter.runtime.classes.ConvertedRuntimeException;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/Google_Client.php

*/

public class file_Google_Client_php implements RuntimeIncludable, RuntimeFileContextInterface {

    public static final file_Google_Client_php instance = new file_Google_Client_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1 scope = new Scope1();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1 scope)
            throws IncludeEventException {
        if (!ZVal.isTrue(NamespaceGlobal.function_exists.call(env, "curl_init"))) {
            throw new ConvertedRuntimeException(
                    env, "Google PHP API Client requires the CURL PHP extension");
        }

        if (!ZVal.isTrue(NamespaceGlobal.function_exists.call(env, "json_decode"))) {
            throw new ConvertedRuntimeException(
                    env, "Google PHP API Client requires the JSON PHP extension");
        }

        if (!ZVal.isTrue(NamespaceGlobal.function_exists.call(env, "http_build_query"))) {
            throw new ConvertedRuntimeException(
                    env, "Google PHP API Client requires http_build_query()");
        }

        if (ZVal.toBool(!ZVal.isTrue(NamespaceGlobal.ini_get.call(env, "date.timezone")))
                && ZVal.toBool(
                        NamespaceGlobal.function_exists.call(env, "date_default_timezone_set"))) {
            NamespaceGlobal.date_default_timezone_set.call(env, "UTC");
        }

        function_set_include_path.f.call(
                env,
                ZVal.toString(
                                ZVal.toString(
                                                NamespaceGlobal.dirname.call(
                                                        env, this.___getRuntimeFilename()))
                                        + ZVal.toString(":"))
                        + ZVal.toString(function_get_include_path.f.call(env)));
        env.include("config.php", stack, this, true, true);
        if (ZVal.isTrue(
                NamespaceGlobal.file_exists.call(
                        env,
                        ZVal.toString(
                                        NamespaceGlobal.dirname.call(
                                                env, this.___getRuntimeFilename()))
                                + "/local_config.php"))) {
            scope.defaultConfig = ZVal.assign(scope.apiConfig);
            env.include(
                    ZVal.toString(NamespaceGlobal.dirname.call(env, this.___getRuntimeFilename()))
                            + "/local_config.php",
                    stack,
                    this,
                    true,
                    true);
            scope.apiConfig = CRArrayF.array_merge.call(env, scope.defaultConfig, scope.apiConfig);
        }

        env.include("service/Google_Model.php", stack, this, true, true);
        env.include("service/Google_Service.php", stack, this, true, true);
        env.include("service/Google_ServiceResource.php", stack, this, true, true);
        env.include("auth/Google_AssertionCredentials.php", stack, this, true, true);
        env.include("auth/Google_Signer.php", stack, this, true, true);
        env.include("auth/Google_P12Signer.php", stack, this, true, true);
        env.include("service/Google_BatchRequest.php", stack, this, true, true);
        env.include("external/URITemplateParser.php", stack, this, true, true);
        env.include("auth/Google_Auth.php", stack, this, true, true);
        env.include("cache/Google_Cache.php", stack, this, true, true);
        env.include("io/Google_IO.php", stack, this, true, true);
        env.include("service/Google_MediaFileUpload.php", stack, this, true, true);
        // Conversion Note: class named Google_Client was here in the source code
        // Conversion Note: class named Google_Exception was here in the source code
        // Conversion Note: class named Google_AuthException was here in the source code
        // Conversion Note: class named Google_CacheException was here in the source code
        // Conversion Note: class named Google_IOException was here in the source code
        // Conversion Note: class named Google_ServiceException was here in the source code

    }

    @Override
    public String ___getRuntimeDirname() {
        return "/google-api-php-client/src";
    }

    @Override
    public String ___getRuntimeFilename() {
        return "/google-api-php-client/src/Google_Client.php";
    }

    @Override
    public String ___getRuntimeNamespace() {
        return "";
    }

    private static class Scope1 implements UpdateRuntimeScopeInterface {

        Object defaultConfig;
        Object apiConfig;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("defaultConfig", this.defaultConfig);
            stack.setVariable("apiConfig", this.apiConfig);
        }

        public void updateScope(RuntimeStack stack) {

            this.defaultConfig = stack.getVariable("defaultConfig");
            this.apiConfig = stack.getVariable("apiConfig");
        }
    }
}
