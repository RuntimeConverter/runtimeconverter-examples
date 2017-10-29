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

 google-api-php-client/src/contrib/Google_StorageService.php

*/

public class file_Google_StorageService_php
        implements RuntimeIncludable, RuntimeFileContextInterface {

    public static final file_Google_StorageService_php instance =
            new file_Google_StorageService_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope39 scope = new Scope39();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope39 scope)
            throws IncludeEventException {
        // Conversion Note: class named Google_ObjectAccessControlsServiceResource was here in the source code
        // Conversion Note: class named Google_BucketAccessControlsServiceResource was here in the source code
        // Conversion Note: class named Google_ObjectsServiceResource was here in the source code
        // Conversion Note: class named Google_BucketsServiceResource was here in the source code
        // Conversion Note: class named Google_StorageService was here in the source code
        // Conversion Note: class named Google_Bucket was here in the source code
        // Conversion Note: class named Google_BucketAccessControl was here in the source code
        // Conversion Note: class named Google_BucketAccessControls was here in the source code
        // Conversion Note: class named Google_BucketOwner was here in the source code
        // Conversion Note: class named Google_BucketWebsite was here in the source code
        // Conversion Note: class named Google_Buckets was here in the source code
        // Conversion Note: class named Google_ObjectAccessControl was here in the source code
        // Conversion Note: class named Google_ObjectAccessControls was here in the source code
        // Conversion Note: class named Google_Objects was here in the source code
        // Conversion Note: class named Google_StorageObject was here in the source code
        // Conversion Note: class named Google_StorageObjectMedia was here in the source code
        // Conversion Note: class named Google_StorageObjectOwner was here in the source code

    }

    @Override
    public String ___getRuntimeDirname() {
        return "/google-api-php-client/src/contrib";
    }

    @Override
    public String ___getRuntimeFilename() {
        return "/google-api-php-client/src/contrib/Google_StorageService.php";
    }

    @Override
    public String ___getRuntimeNamespace() {
        return "";
    }

    private static class Scope39 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
