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

 google-api-php-client/src/contrib/Google_ShoppingService.php

*/

public class file_Google_ShoppingService_php
        implements RuntimeIncludable, RuntimeFileContextInterface {

    public static final file_Google_ShoppingService_php instance =
            new file_Google_ShoppingService_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope37 scope = new Scope37();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope37 scope)
            throws IncludeEventException {
        // Conversion Note: class named Google_ProductsServiceResource was here in the source code
        // Conversion Note: class named Google_ShoppingService was here in the source code
        // Conversion Note: class named Google_Product was here in the source code
        // Conversion Note: class named Google_Products was here in the source code
        // Conversion Note: class named Google_ProductsFacets was here in the source code
        // Conversion Note: class named Google_ProductsFacetsBuckets was here in the source code
        // Conversion Note: class named Google_ProductsPromotions was here in the source code
        // Conversion Note: class named Google_ProductsPromotionsCustomFields was here in the source code
        // Conversion Note: class named Google_ProductsSpelling was here in the source code
        // Conversion Note: class named Google_ProductsStores was here in the source code
        // Conversion Note: class named Google_ShoppingModelCategoryJsonV1 was here in the source code
        // Conversion Note: class named Google_ShoppingModelDebugJsonV1 was here in the source code
        // Conversion Note: class named Google_ShoppingModelDebugJsonV1BackendTimes was here in the source code
        // Conversion Note: class named Google_ShoppingModelProductJsonV1 was here in the source code
        // Conversion Note: class named Google_ShoppingModelProductJsonV1Attributes was here in the source code
        // Conversion Note: class named Google_ShoppingModelProductJsonV1Author was here in the source code
        // Conversion Note: class named Google_ShoppingModelProductJsonV1Images was here in the source code
        // Conversion Note: class named Google_ShoppingModelProductJsonV1ImagesThumbnails was here in the source code
        // Conversion Note: class named Google_ShoppingModelProductJsonV1Internal4 was here in the source code
        // Conversion Note: class named Google_ShoppingModelProductJsonV1Inventories was here in the source code
        // Conversion Note: class named Google_ShoppingModelProductJsonV1Variants was here in the source code
        // Conversion Note: class named Google_ShoppingModelRecommendationsJsonV1 was here in the source code
        // Conversion Note: class named Google_ShoppingModelRecommendationsJsonV1RecommendationList was here in the source code

    }

    @Override
    public String ___getRuntimeDirname() {
        return "/google-api-php-client/src/contrib";
    }

    @Override
    public String ___getRuntimeFilename() {
        return "/google-api-php-client/src/contrib/Google_ShoppingService.php";
    }

    @Override
    public String ___getRuntimeNamespace() {
        return "";
    }

    private static class Scope37 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
