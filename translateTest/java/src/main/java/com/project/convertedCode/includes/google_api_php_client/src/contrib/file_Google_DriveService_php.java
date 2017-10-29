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

 google-api-php-client/src/contrib/Google_DriveService.php

*/

public class file_Google_DriveService_php
        implements RuntimeIncludable, RuntimeFileContextInterface {

    public static final file_Google_DriveService_php instance = new file_Google_DriveService_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope24 scope = new Scope24();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope24 scope)
            throws IncludeEventException {
        // Conversion Note: class named Google_FilesServiceResource was here in the source code
        // Conversion Note: class named Google_AboutServiceResource was here in the source code
        // Conversion Note: class named Google_AppsServiceResource was here in the source code
        // Conversion Note: class named Google_ParentsServiceResource was here in the source code
        // Conversion Note: class named Google_RevisionsServiceResource was here in the source code
        // Conversion Note: class named Google_ChangesServiceResource was here in the source code
        // Conversion Note: class named Google_ChildrenServiceResource was here in the source code
        // Conversion Note: class named Google_PermissionsServiceResource was here in the source code
        // Conversion Note: class named Google_DriveService was here in the source code
        // Conversion Note: class named Google_About was here in the source code
        // Conversion Note: class named Google_AboutAdditionalRoleInfo was here in the source code
        // Conversion Note: class named Google_AboutAdditionalRoleInfoRoleSets was here in the source code
        // Conversion Note: class named Google_AboutExportFormats was here in the source code
        // Conversion Note: class named Google_AboutFeatures was here in the source code
        // Conversion Note: class named Google_AboutImportFormats was here in the source code
        // Conversion Note: class named Google_AboutMaxUploadSizes was here in the source code
        // Conversion Note: class named Google_App was here in the source code
        // Conversion Note: class named Google_AppIcons was here in the source code
        // Conversion Note: class named Google_AppList was here in the source code
        // Conversion Note: class named Google_Change was here in the source code
        // Conversion Note: class named Google_ChangeList was here in the source code
        // Conversion Note: class named Google_ChildList was here in the source code
        // Conversion Note: class named Google_ChildReference was here in the source code
        // Conversion Note: class named Google_DriveFile was here in the source code
        // Conversion Note: class named Google_DriveFileImageMediaMetadata was here in the source code
        // Conversion Note: class named Google_DriveFileImageMediaMetadataLocation was here in the source code
        // Conversion Note: class named Google_DriveFileIndexableText was here in the source code
        // Conversion Note: class named Google_DriveFileLabels was here in the source code
        // Conversion Note: class named Google_FileList was here in the source code
        // Conversion Note: class named Google_ParentList was here in the source code
        // Conversion Note: class named Google_ParentReference was here in the source code
        // Conversion Note: class named Google_Permission was here in the source code
        // Conversion Note: class named Google_PermissionList was here in the source code
        // Conversion Note: class named Google_Revision was here in the source code
        // Conversion Note: class named Google_RevisionList was here in the source code

    }

    @Override
    public String ___getRuntimeDirname() {
        return "/google-api-php-client/src/contrib";
    }

    @Override
    public String ___getRuntimeFilename() {
        return "/google-api-php-client/src/contrib/Google_DriveService.php";
    }

    @Override
    public String ___getRuntimeNamespace() {
        return "";
    }

    private static class Scope24 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
