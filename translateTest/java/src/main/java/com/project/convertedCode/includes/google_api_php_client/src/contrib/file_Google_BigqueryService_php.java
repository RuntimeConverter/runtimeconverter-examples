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

 google-api-php-client/src/contrib/Google_BigqueryService.php

*/

public class file_Google_BigqueryService_php
        implements RuntimeIncludable, RuntimeFileContextInterface {

    public static final file_Google_BigqueryService_php instance =
            new file_Google_BigqueryService_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope18 scope = new Scope18();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope18 scope)
            throws IncludeEventException {
        // Conversion Note: class named Google_TablesServiceResource was here in the source code
        // Conversion Note: class named Google_DatasetsServiceResource was here in the source code
        // Conversion Note: class named Google_JobsServiceResource was here in the source code
        // Conversion Note: class named Google_TabledataServiceResource was here in the source code
        // Conversion Note: class named Google_ProjectsServiceResource was here in the source code
        // Conversion Note: class named Google_BigqueryService was here in the source code
        // Conversion Note: class named Google_Dataset was here in the source code
        // Conversion Note: class named Google_DatasetAccess was here in the source code
        // Conversion Note: class named Google_DatasetList was here in the source code
        // Conversion Note: class named Google_DatasetListDatasets was here in the source code
        // Conversion Note: class named Google_DatasetReference was here in the source code
        // Conversion Note: class named Google_ErrorProto was here in the source code
        // Conversion Note: class named Google_GetQueryResultsResponse was here in the source code
        // Conversion Note: class named Google_Job was here in the source code
        // Conversion Note: class named Google_JobConfiguration was here in the source code
        // Conversion Note: class named Google_JobConfigurationExtract was here in the source code
        // Conversion Note: class named Google_JobConfigurationLink was here in the source code
        // Conversion Note: class named Google_JobConfigurationLoad was here in the source code
        // Conversion Note: class named Google_JobConfigurationQuery was here in the source code
        // Conversion Note: class named Google_JobConfigurationTableCopy was here in the source code
        // Conversion Note: class named Google_JobList was here in the source code
        // Conversion Note: class named Google_JobListJobs was here in the source code
        // Conversion Note: class named Google_JobReference was here in the source code
        // Conversion Note: class named Google_JobStatistics was here in the source code
        // Conversion Note: class named Google_JobStatus was here in the source code
        // Conversion Note: class named Google_ProjectList was here in the source code
        // Conversion Note: class named Google_ProjectListProjects was here in the source code
        // Conversion Note: class named Google_ProjectReference was here in the source code
        // Conversion Note: class named Google_QueryRequest was here in the source code
        // Conversion Note: class named Google_QueryResponse was here in the source code
        // Conversion Note: class named Google_Table was here in the source code
        // Conversion Note: class named Google_TableDataList was here in the source code
        // Conversion Note: class named Google_TableFieldSchema was here in the source code
        // Conversion Note: class named Google_TableList was here in the source code
        // Conversion Note: class named Google_TableListTables was here in the source code
        // Conversion Note: class named Google_TableReference was here in the source code
        // Conversion Note: class named Google_TableRow was here in the source code
        // Conversion Note: class named Google_TableRowF was here in the source code
        // Conversion Note: class named Google_TableSchema was here in the source code

    }

    @Override
    public String ___getRuntimeDirname() {
        return "/google-api-php-client/src/contrib";
    }

    @Override
    public String ___getRuntimeFilename() {
        return "/google-api-php-client/src/contrib/Google_BigqueryService.php";
    }

    @Override
    public String ___getRuntimeNamespace() {
        return "";
    }

    private static class Scope18 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
