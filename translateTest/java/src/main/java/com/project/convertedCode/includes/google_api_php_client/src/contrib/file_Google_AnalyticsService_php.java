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

 google-api-php-client/src/contrib/Google_AnalyticsService.php

*/

public class file_Google_AnalyticsService_php
        implements RuntimeIncludable, RuntimeFileContextInterface {

    public static final file_Google_AnalyticsService_php instance =
            new file_Google_AnalyticsService_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope17 scope = new Scope17();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope17 scope)
            throws IncludeEventException {
        // Conversion Note: class named Google_ManagementServiceResource was here in the source code
        // Conversion Note: class named Google_ManagementWebpropertiesServiceResource was here in the source code
        // Conversion Note: class named Google_ManagementSegmentsServiceResource was here in the source code
        // Conversion Note: class named Google_ManagementAccountsServiceResource was here in the source code
        // Conversion Note: class named Google_ManagementGoalsServiceResource was here in the source code
        // Conversion Note: class named Google_ManagementProfilesServiceResource was here in the source code
        // Conversion Note: class named Google_DataServiceResource was here in the source code
        // Conversion Note: class named Google_DataMcfServiceResource was here in the source code
        // Conversion Note: class named Google_DataGaServiceResource was here in the source code
        // Conversion Note: class named Google_AnalyticsService was here in the source code
        // Conversion Note: class named Google_Account was here in the source code
        // Conversion Note: class named Google_AccountChildLink was here in the source code
        // Conversion Note: class named Google_Accounts was here in the source code
        // Conversion Note: class named Google_GaData was here in the source code
        // Conversion Note: class named Google_GaDataColumnHeaders was here in the source code
        // Conversion Note: class named Google_GaDataProfileInfo was here in the source code
        // Conversion Note: class named Google_GaDataQuery was here in the source code
        // Conversion Note: class named Google_Goal was here in the source code
        // Conversion Note: class named Google_GoalEventDetails was here in the source code
        // Conversion Note: class named Google_GoalEventDetailsEventConditions was here in the source code
        // Conversion Note: class named Google_GoalParentLink was here in the source code
        // Conversion Note: class named Google_GoalUrlDestinationDetails was here in the source code
        // Conversion Note: class named Google_GoalUrlDestinationDetailsSteps was here in the source code
        // Conversion Note: class named Google_GoalVisitNumPagesDetails was here in the source code
        // Conversion Note: class named Google_GoalVisitTimeOnSiteDetails was here in the source code
        // Conversion Note: class named Google_Goals was here in the source code
        // Conversion Note: class named Google_McfData was here in the source code
        // Conversion Note: class named Google_McfDataColumnHeaders was here in the source code
        // Conversion Note: class named Google_McfDataProfileInfo was here in the source code
        // Conversion Note: class named Google_McfDataQuery was here in the source code
        // Conversion Note: class named Google_McfDataRows was here in the source code
        // Conversion Note: class named Google_McfDataRowsConversionPathValue was here in the source code
        // Conversion Note: class named Google_Profile was here in the source code
        // Conversion Note: class named Google_ProfileChildLink was here in the source code
        // Conversion Note: class named Google_ProfileParentLink was here in the source code
        // Conversion Note: class named Google_Profiles was here in the source code
        // Conversion Note: class named Google_Segment was here in the source code
        // Conversion Note: class named Google_Segments was here in the source code
        // Conversion Note: class named Google_Webproperties was here in the source code
        // Conversion Note: class named Google_Webproperty was here in the source code
        // Conversion Note: class named Google_WebpropertyChildLink was here in the source code
        // Conversion Note: class named Google_WebpropertyParentLink was here in the source code

    }

    @Override
    public String ___getRuntimeDirname() {
        return "/google-api-php-client/src/contrib";
    }

    @Override
    public String ___getRuntimeFilename() {
        return "/google-api-php-client/src/contrib/Google_AnalyticsService.php";
    }

    @Override
    public String ___getRuntimeNamespace() {
        return "";
    }

    private static class Scope17 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
