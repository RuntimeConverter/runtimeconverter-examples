package com.project.convertedCode.includes.google_api_php_client.src;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/config.php

*/

public class file_config_php implements RuntimeIncludable, RuntimeFileContextInterface {

    public static final file_config_php instance = new file_config_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope13 scope = new Scope13();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope13 scope)
            throws IncludeEventException {

        scope.apiConfig =
                ZVal.newArray(
                        new ZPair("use_objects", false),
                        new ZPair("application_name", ""),
                        new ZPair("oauth2_client_id", ""),
                        new ZPair("oauth2_client_secret", ""),
                        new ZPair("oauth2_redirect_uri", ""),
                        new ZPair("developer_key", ""),
                        new ZPair("site_name", "www.example.org"),
                        new ZPair("authClass", "Google_OAuth2"),
                        new ZPair("ioClass", "Google_CurlIO"),
                        new ZPair("cacheClass", "Google_FileCache"),
                        new ZPair("basePath", "https://www.googleapis.com"),
                        new ZPair(
                                "ioFileCache_directory",
                                ZVal.isTrue(
                                                NamespaceGlobal.function_exists.call(
                                                        env, "sys_get_temp_dir"))
                                        ? ZVal.toString(NamespaceGlobal.sys_get_temp_dir.call(env))
                                                + "/Google_Client"
                                        : "/tmp/Google_Client"),
                        new ZPair(
                                "services",
                                ZVal.newArray(
                                        new ZPair(
                                                "analytics",
                                                ZVal.newArray(
                                                        new ZPair(
                                                                "scope",
                                                                "https://www.googleapis.com/auth/analytics.readonly"))),
                                        new ZPair(
                                                "calendar",
                                                ZVal.newArray(
                                                        new ZPair(
                                                                "scope",
                                                                ZVal.newArray(
                                                                        new ZPair(
                                                                                0,
                                                                                "https://www.googleapis.com/auth/calendar"),
                                                                        new ZPair(
                                                                                1,
                                                                                "https://www.googleapis.com/auth/calendar.readonly"))))),
                                        new ZPair(
                                                "books",
                                                ZVal.newArray(
                                                        new ZPair(
                                                                "scope",
                                                                "https://www.googleapis.com/auth/books"))),
                                        new ZPair(
                                                "latitude",
                                                ZVal.newArray(
                                                        new ZPair(
                                                                "scope",
                                                                ZVal.newArray(
                                                                        new ZPair(
                                                                                0,
                                                                                "https://www.googleapis.com/auth/latitude.all.best"),
                                                                        new ZPair(
                                                                                1,
                                                                                "https://www.googleapis.com/auth/latitude.all.city"))))),
                                        new ZPair(
                                                "moderator",
                                                ZVal.newArray(
                                                        new ZPair(
                                                                "scope",
                                                                "https://www.googleapis.com/auth/moderator"))),
                                        new ZPair(
                                                "oauth2",
                                                ZVal.newArray(
                                                        new ZPair(
                                                                "scope",
                                                                ZVal.newArray(
                                                                        new ZPair(
                                                                                0,
                                                                                "https://www.googleapis.com/auth/userinfo.profile"),
                                                                        new ZPair(
                                                                                1,
                                                                                "https://www.googleapis.com/auth/userinfo.email"))))),
                                        new ZPair(
                                                "plus",
                                                ZVal.newArray(
                                                        new ZPair(
                                                                "scope",
                                                                "https://www.googleapis.com/auth/plus.me"))),
                                        new ZPair(
                                                "siteVerification",
                                                ZVal.newArray(
                                                        new ZPair(
                                                                "scope",
                                                                "https://www.googleapis.com/auth/siteverification"))),
                                        new ZPair(
                                                "tasks",
                                                ZVal.newArray(
                                                        new ZPair(
                                                                "scope",
                                                                "https://www.googleapis.com/auth/tasks"))),
                                        new ZPair(
                                                "urlshortener",
                                                ZVal.newArray(
                                                        new ZPair(
                                                                "scope",
                                                                "https://www.googleapis.com/auth/urlshortener"))))));
    }

    @Override
    public String ___getRuntimeDirname() {
        return "/google-api-php-client/src";
    }

    @Override
    public String ___getRuntimeFilename() {
        return "/google-api-php-client/src/config.php";
    }

    @Override
    public String ___getRuntimeNamespace() {
        return "";
    }

    private static class Scope13 implements UpdateRuntimeScopeInterface {

        Object apiConfig;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("apiConfig", this.apiConfig);
        }

        public void updateScope(RuntimeStack stack) {

            this.apiConfig = stack.getVariable("apiConfig");
        }
    }
}
