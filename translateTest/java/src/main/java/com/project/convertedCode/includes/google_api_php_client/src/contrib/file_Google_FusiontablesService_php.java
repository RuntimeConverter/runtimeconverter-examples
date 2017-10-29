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

 google-api-php-client/src/contrib/Google_FusiontablesService.php

*/

public class file_Google_FusiontablesService_php
        implements RuntimeIncludable, RuntimeFileContextInterface {

    public static final file_Google_FusiontablesService_php instance =
            new file_Google_FusiontablesService_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope26 scope = new Scope26();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope26 scope)
            throws IncludeEventException {
        // Conversion Note: class named Google_ColumnServiceResource was here in the source code
        // Conversion Note: class named Google_QueryServiceResource was here in the source code
        // Conversion Note: class named Google_StyleServiceResource was here in the source code
        // Conversion Note: class named Google_TemplateServiceResource was here in the source code
        // Conversion Note: class named Google_TableServiceResource was here in the source code
        // Conversion Note: class named Google_FusiontablesService was here in the source code
        // Conversion Note: class named Google_Bucket was here in the source code
        // Conversion Note: class named Google_Column was here in the source code
        // Conversion Note: class named Google_ColumnBaseColumn was here in the source code
        // Conversion Note: class named Google_ColumnList was here in the source code
        // Conversion Note: class named Google_Geometry was here in the source code
        // Conversion Note: class named Google_Line was here in the source code
        // Conversion Note: class named Google_LineStyle was here in the source code
        // Conversion Note: class named Google_Point was here in the source code
        // Conversion Note: class named Google_PointStyle was here in the source code
        // Conversion Note: class named Google_Polygon was here in the source code
        // Conversion Note: class named Google_PolygonStyle was here in the source code
        // Conversion Note: class named Google_Sqlresponse was here in the source code
        // Conversion Note: class named Google_StyleFunction was here in the source code
        // Conversion Note: class named Google_StyleFunctionGradient was here in the source code
        // Conversion Note: class named Google_StyleFunctionGradientColors was here in the source code
        // Conversion Note: class named Google_StyleSetting was here in the source code
        // Conversion Note: class named Google_StyleSettingList was here in the source code
        // Conversion Note: class named Google_Table was here in the source code
        // Conversion Note: class named Google_TableList was here in the source code
        // Conversion Note: class named Google_Template was here in the source code
        // Conversion Note: class named Google_TemplateList was here in the source code

    }

    @Override
    public String ___getRuntimeDirname() {
        return "/google-api-php-client/src/contrib";
    }

    @Override
    public String ___getRuntimeFilename() {
        return "/google-api-php-client/src/contrib/Google_FusiontablesService.php";
    }

    @Override
    public String ___getRuntimeNamespace() {
        return "";
    }

    private static class Scope26 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
