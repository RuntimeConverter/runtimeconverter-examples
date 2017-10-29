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

 google-api-php-client/src/contrib/Google_ComputeService.php

*/

public class file_Google_ComputeService_php
        implements RuntimeIncludable, RuntimeFileContextInterface {

    public static final file_Google_ComputeService_php instance =
            new file_Google_ComputeService_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope22 scope = new Scope22();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope22 scope)
            throws IncludeEventException {
        // Conversion Note: class named Google_OperationsServiceResource was here in the source code
        // Conversion Note: class named Google_KernelsServiceResource was here in the source code
        // Conversion Note: class named Google_DisksServiceResource was here in the source code
        // Conversion Note: class named Google_SnapshotsServiceResource was here in the source code
        // Conversion Note: class named Google_ZonesServiceResource was here in the source code
        // Conversion Note: class named Google_InstancesServiceResource was here in the source code
        // Conversion Note: class named Google_MachineTypesServiceResource was here in the source code
        // Conversion Note: class named Google_ImagesServiceResource was here in the source code
        // Conversion Note: class named Google_FirewallsServiceResource was here in the source code
        // Conversion Note: class named Google_NetworksServiceResource was here in the source code
        // Conversion Note: class named Google_ProjectsServiceResource was here in the source code
        // Conversion Note: class named Google_ComputeService was here in the source code
        // Conversion Note: class named Google_AccessConfig was here in the source code
        // Conversion Note: class named Google_AttachedDisk was here in the source code
        // Conversion Note: class named Google_Disk was here in the source code
        // Conversion Note: class named Google_DiskList was here in the source code
        // Conversion Note: class named Google_Firewall was here in the source code
        // Conversion Note: class named Google_FirewallAllowed was here in the source code
        // Conversion Note: class named Google_FirewallList was here in the source code
        // Conversion Note: class named Google_Image was here in the source code
        // Conversion Note: class named Google_ImageDiskSnapshot was here in the source code
        // Conversion Note: class named Google_ImageList was here in the source code
        // Conversion Note: class named Google_ImageRawDisk was here in the source code
        // Conversion Note: class named Google_Instance was here in the source code
        // Conversion Note: class named Google_InstanceList was here in the source code
        // Conversion Note: class named Google_Kernel was here in the source code
        // Conversion Note: class named Google_KernelList was here in the source code
        // Conversion Note: class named Google_MachineType was here in the source code
        // Conversion Note: class named Google_MachineTypeEphemeralDisks was here in the source code
        // Conversion Note: class named Google_MachineTypeList was here in the source code
        // Conversion Note: class named Google_Metadata was here in the source code
        // Conversion Note: class named Google_MetadataItems was here in the source code
        // Conversion Note: class named Google_Network was here in the source code
        // Conversion Note: class named Google_NetworkInterface was here in the source code
        // Conversion Note: class named Google_NetworkList was here in the source code
        // Conversion Note: class named Google_Operation was here in the source code
        // Conversion Note: class named Google_OperationError was here in the source code
        // Conversion Note: class named Google_OperationErrorErrors was here in the source code
        // Conversion Note: class named Google_OperationList was here in the source code
        // Conversion Note: class named Google_Project was here in the source code
        // Conversion Note: class named Google_ProjectQuotas was here in the source code
        // Conversion Note: class named Google_ServiceAccount was here in the source code
        // Conversion Note: class named Google_Snapshot was here in the source code
        // Conversion Note: class named Google_SnapshotList was here in the source code
        // Conversion Note: class named Google_Zone was here in the source code
        // Conversion Note: class named Google_ZoneList was here in the source code
        // Conversion Note: class named Google_ZoneMaintenanceWindows was here in the source code

    }

    @Override
    public String ___getRuntimeDirname() {
        return "/google-api-php-client/src/contrib";
    }

    @Override
    public String ___getRuntimeFilename() {
        return "/google-api-php-client/src/contrib/Google_ComputeService.php";
    }

    @Override
    public String ___getRuntimeNamespace() {
        return "";
    }

    private static class Scope22 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
