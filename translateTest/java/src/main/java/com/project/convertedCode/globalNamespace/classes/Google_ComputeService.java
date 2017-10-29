package com.project.convertedCode.globalNamespace.classes;

import com.project.convertedCode.globalNamespace.classes.Google_NetworksServiceResource;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Google_MachineTypesServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_FirewallsServiceResource;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Google_ImagesServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_Service;
import com.project.convertedCode.globalNamespace.classes.Google_SnapshotsServiceResource;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Google_InstancesServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_DisksServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_OperationsServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_ProjectsServiceResource;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.classes.Google_ZonesServiceResource;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.classes.Google_KernelsServiceResource;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_ComputeService.php

*/

public class Google_ComputeService extends Google_Service implements RuntimeFileContextInterface {

    public Object operations = null;

    public Object kernels = null;

    public Object disks = null;

    public Object snapshots = null;

    public Object zones = null;

    public Object instances = null;

    public Object machineTypes = null;

    public Object images = null;

    public Object firewalls = null;

    public Object networks = null;

    public Object projects = null;

    public Google_ComputeService(RuntimeEnv env, Object... args) {
        super(env, args);
        this.__construct(env, args);
    }

    @Override
    public Object converterRuntimeCallExtended(
            RuntimeEnv env,
            String method,
            Class caller,
            PassByReferenceArgs passByReferenceArgs,
            Object... args) {
        switch (method) {
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "operations":
                return this.operations;
            case "kernels":
                return this.kernels;
            case "disks":
                return this.disks;
            case "snapshots":
                return this.snapshots;
            case "zones":
                return this.zones;
            case "instances":
                return this.instances;
            case "machineTypes":
                return this.machineTypes;
            case "images":
                return this.images;
            case "firewalls":
                return this.firewalls;
            case "networks":
                return this.networks;
            case "projects":
                return this.projects;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "operations":
                return ZVal.isNull(this.operations);
            case "kernels":
                return ZVal.isNull(this.kernels);
            case "disks":
                return ZVal.isNull(this.disks);
            case "snapshots":
                return ZVal.isNull(this.snapshots);
            case "zones":
                return ZVal.isNull(this.zones);
            case "instances":
                return ZVal.isNull(this.instances);
            case "machineTypes":
                return ZVal.isNull(this.machineTypes);
            case "images":
                return ZVal.isNull(this.images);
            case "firewalls":
                return ZVal.isNull(this.firewalls);
            case "networks":
                return ZVal.isNull(this.networks);
            case "projects":
                return ZVal.isNull(this.projects);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "operations":
                this.operations = value;
                break;
            case "kernels":
                this.kernels = value;
                break;
            case "disks":
                this.disks = value;
                break;
            case "snapshots":
                this.snapshots = value;
                break;
            case "zones":
                this.zones = value;
                break;
            case "instances":
                this.instances = value;
                break;
            case "machineTypes":
                this.machineTypes = value;
                break;
            case "images":
                this.images = value;
                break;
            case "firewalls":
                this.firewalls = value;
                break;
            case "networks":
                this.networks = value;
                break;
            case "projects":
                this.projects = value;
                break;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object client = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_ComputeService.class, "servicePath", "compute/v1beta12/projects/");
        ZVal.setProperty(this, Google_ComputeService.class, "version", "v1beta12");
        ZVal.setProperty(this, Google_ComputeService.class, "serviceName", "compute");
        env.callMethod(
                client,
                "addService",
                Google_ComputeService.class,
                ZVal.getProperty(this, Google_ComputeService.class, "serviceName"),
                ZVal.getProperty(this, Google_ComputeService.class, "version"));
        ZVal.setProperty(
                this,
                Google_ComputeService.class,
                "operations",
                new Google_OperationsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_ComputeService.class, "serviceName"),
                        "operations",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"get\": {\"scopes\": [\"https://www.googleapis.com/auth/compute.readonly\"], \"parameters\": {\"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"operation\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"compute.operations.get\", \"httpMethod\": \"GET\", \"path\": \"{project}/operations/{operation}\", \"response\": {\"$ref\": \"Operation\"}}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/compute.readonly\"], \"parameters\": {\"filter\": {\"type\": \"string\", \"location\": \"query\"}, \"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"maxResults\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}}, \"id\": \"compute.operations.list\", \"httpMethod\": \"GET\", \"path\": \"{project}/operations\", \"response\": {\"$ref\": \"OperationList\"}}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/compute\"], \"path\": \"{project}/operations/{operation}\", \"id\": \"compute.operations.delete\", \"parameters\": {\"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"operation\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"httpMethod\": \"DELETE\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_ComputeService.class,
                "kernels",
                new Google_KernelsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_ComputeService.class, "serviceName"),
                        "kernels",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/compute.readonly\"], \"parameters\": {\"filter\": {\"type\": \"string\", \"location\": \"query\"}, \"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"maxResults\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}}, \"id\": \"compute.kernels.list\", \"httpMethod\": \"GET\", \"path\": \"{project}/kernels\", \"response\": {\"$ref\": \"KernelList\"}}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/compute.readonly\"], \"parameters\": {\"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"kernel\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"compute.kernels.get\", \"httpMethod\": \"GET\", \"path\": \"{project}/kernels/{kernel}\", \"response\": {\"$ref\": \"Kernel\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_ComputeService.class,
                "disks",
                new Google_DisksServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_ComputeService.class, "serviceName"),
                        "disks",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/compute\"], \"parameters\": {\"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Disk\"}, \"response\": {\"$ref\": \"Operation\"}, \"httpMethod\": \"POST\", \"path\": \"{project}/disks\", \"id\": \"compute.disks.insert\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/compute.readonly\"], \"parameters\": {\"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"disk\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"compute.disks.get\", \"httpMethod\": \"GET\", \"path\": \"{project}/disks/{disk}\", \"response\": {\"$ref\": \"Disk\"}}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/compute.readonly\"], \"parameters\": {\"filter\": {\"type\": \"string\", \"location\": \"query\"}, \"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"maxResults\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}}, \"id\": \"compute.disks.list\", \"httpMethod\": \"GET\", \"path\": \"{project}/disks\", \"response\": {\"$ref\": \"DiskList\"}}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/compute\"], \"parameters\": {\"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"disk\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"compute.disks.delete\", \"httpMethod\": \"DELETE\", \"path\": \"{project}/disks/{disk}\", \"response\": {\"$ref\": \"Operation\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_ComputeService.class,
                "snapshots",
                new Google_SnapshotsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_ComputeService.class, "serviceName"),
                        "snapshots",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/compute\"], \"parameters\": {\"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Snapshot\"}, \"response\": {\"$ref\": \"Operation\"}, \"httpMethod\": \"POST\", \"path\": \"{project}/snapshots\", \"id\": \"compute.snapshots.insert\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/compute.readonly\"], \"parameters\": {\"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"snapshot\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"compute.snapshots.get\", \"httpMethod\": \"GET\", \"path\": \"{project}/snapshots/{snapshot}\", \"response\": {\"$ref\": \"Snapshot\"}}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/compute.readonly\"], \"parameters\": {\"filter\": {\"type\": \"string\", \"location\": \"query\"}, \"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"maxResults\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}}, \"id\": \"compute.snapshots.list\", \"httpMethod\": \"GET\", \"path\": \"{project}/snapshots\", \"response\": {\"$ref\": \"SnapshotList\"}}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/compute\"], \"parameters\": {\"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"snapshot\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"compute.snapshots.delete\", \"httpMethod\": \"DELETE\", \"path\": \"{project}/snapshots/{snapshot}\", \"response\": {\"$ref\": \"Operation\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_ComputeService.class,
                "zones",
                new Google_ZonesServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_ComputeService.class, "serviceName"),
                        "zones",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/compute.readonly\"], \"parameters\": {\"filter\": {\"type\": \"string\", \"location\": \"query\"}, \"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"maxResults\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}}, \"id\": \"compute.zones.list\", \"httpMethod\": \"GET\", \"path\": \"{project}/zones\", \"response\": {\"$ref\": \"ZoneList\"}}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/compute.readonly\"], \"parameters\": {\"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"zone\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"compute.zones.get\", \"httpMethod\": \"GET\", \"path\": \"{project}/zones/{zone}\", \"response\": {\"$ref\": \"Zone\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_ComputeService.class,
                "instances",
                new Google_InstancesServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_ComputeService.class, "serviceName"),
                        "instances",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/compute\"], \"parameters\": {\"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Instance\"}, \"response\": {\"$ref\": \"Operation\"}, \"httpMethod\": \"POST\", \"path\": \"{project}/instances\", \"id\": \"compute.instances.insert\"}, \"deleteAccessConfig\": {\"scopes\": [\"https://www.googleapis.com/auth/compute\"], \"parameters\": {\"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"instance\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"access_config\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"network_interface\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}}, \"id\": \"compute.instances.deleteAccessConfig\", \"httpMethod\": \"POST\", \"path\": \"{project}/instances/{instance}/delete-access-config\", \"response\": {\"$ref\": \"Operation\"}}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/compute.readonly\"], \"parameters\": {\"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"instance\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"compute.instances.get\", \"httpMethod\": \"GET\", \"path\": \"{project}/instances/{instance}\", \"response\": {\"$ref\": \"Instance\"}}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/compute.readonly\"], \"parameters\": {\"filter\": {\"type\": \"string\", \"location\": \"query\"}, \"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"maxResults\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}}, \"id\": \"compute.instances.list\", \"httpMethod\": \"GET\", \"path\": \"{project}/instances\", \"response\": {\"$ref\": \"InstanceList\"}}, \"addAccessConfig\": {\"scopes\": [\"https://www.googleapis.com/auth/compute\"], \"parameters\": {\"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"instance\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"network_interface\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}}, \"request\": {\"$ref\": \"AccessConfig\"}, \"response\": {\"$ref\": \"Operation\"}, \"httpMethod\": \"POST\", \"path\": \"{project}/instances/{instance}/add-access-config\", \"id\": \"compute.instances.addAccessConfig\"}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/compute\"], \"parameters\": {\"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"instance\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"compute.instances.delete\", \"httpMethod\": \"DELETE\", \"path\": \"{project}/instances/{instance}\", \"response\": {\"$ref\": \"Operation\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_ComputeService.class,
                "machineTypes",
                new Google_MachineTypesServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_ComputeService.class, "serviceName"),
                        "machineTypes",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/compute.readonly\"], \"parameters\": {\"filter\": {\"type\": \"string\", \"location\": \"query\"}, \"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"maxResults\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}}, \"id\": \"compute.machineTypes.list\", \"httpMethod\": \"GET\", \"path\": \"{project}/machine-types\", \"response\": {\"$ref\": \"MachineTypeList\"}}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/compute.readonly\"], \"parameters\": {\"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"machineType\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"compute.machineTypes.get\", \"httpMethod\": \"GET\", \"path\": \"{project}/machine-types/{machineType}\", \"response\": {\"$ref\": \"MachineType\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_ComputeService.class,
                "images",
                new Google_ImagesServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_ComputeService.class, "serviceName"),
                        "images",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/compute\", \"https://www.googleapis.com/auth/devstorage.read_only\"], \"parameters\": {\"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Image\"}, \"response\": {\"$ref\": \"Operation\"}, \"httpMethod\": \"POST\", \"path\": \"{project}/images\", \"id\": \"compute.images.insert\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/compute.readonly\"], \"parameters\": {\"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"image\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"compute.images.get\", \"httpMethod\": \"GET\", \"path\": \"{project}/images/{image}\", \"response\": {\"$ref\": \"Image\"}}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/compute.readonly\"], \"parameters\": {\"filter\": {\"type\": \"string\", \"location\": \"query\"}, \"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"maxResults\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}}, \"id\": \"compute.images.list\", \"httpMethod\": \"GET\", \"path\": \"{project}/images\", \"response\": {\"$ref\": \"ImageList\"}}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/compute\"], \"parameters\": {\"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"image\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"compute.images.delete\", \"httpMethod\": \"DELETE\", \"path\": \"{project}/images/{image}\", \"response\": {\"$ref\": \"Operation\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_ComputeService.class,
                "firewalls",
                new Google_FirewallsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_ComputeService.class, "serviceName"),
                        "firewalls",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/compute\"], \"parameters\": {\"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Firewall\"}, \"response\": {\"$ref\": \"Operation\"}, \"httpMethod\": \"POST\", \"path\": \"{project}/firewalls\", \"id\": \"compute.firewalls.insert\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/compute.readonly\"], \"parameters\": {\"firewall\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"compute.firewalls.get\", \"httpMethod\": \"GET\", \"path\": \"{project}/firewalls/{firewall}\", \"response\": {\"$ref\": \"Firewall\"}}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/compute.readonly\"], \"parameters\": {\"filter\": {\"type\": \"string\", \"location\": \"query\"}, \"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"maxResults\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}}, \"id\": \"compute.firewalls.list\", \"httpMethod\": \"GET\", \"path\": \"{project}/firewalls\", \"response\": {\"$ref\": \"FirewallList\"}}, \"update\": {\"scopes\": [\"https://www.googleapis.com/auth/compute\"], \"parameters\": {\"firewall\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Firewall\"}, \"response\": {\"$ref\": \"Operation\"}, \"httpMethod\": \"PUT\", \"path\": \"{project}/firewalls/{firewall}\", \"id\": \"compute.firewalls.update\"}, \"patch\": {\"scopes\": [\"https://www.googleapis.com/auth/compute\"], \"parameters\": {\"firewall\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Firewall\"}, \"response\": {\"$ref\": \"Operation\"}, \"httpMethod\": \"PATCH\", \"path\": \"{project}/firewalls/{firewall}\", \"id\": \"compute.firewalls.patch\"}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/compute\"], \"parameters\": {\"firewall\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"compute.firewalls.delete\", \"httpMethod\": \"DELETE\", \"path\": \"{project}/firewalls/{firewall}\", \"response\": {\"$ref\": \"Operation\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_ComputeService.class,
                "networks",
                new Google_NetworksServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_ComputeService.class, "serviceName"),
                        "networks",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/compute\"], \"parameters\": {\"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Network\"}, \"response\": {\"$ref\": \"Operation\"}, \"httpMethod\": \"POST\", \"path\": \"{project}/networks\", \"id\": \"compute.networks.insert\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/compute.readonly\"], \"parameters\": {\"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"network\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"compute.networks.get\", \"httpMethod\": \"GET\", \"path\": \"{project}/networks/{network}\", \"response\": {\"$ref\": \"Network\"}}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/compute.readonly\"], \"parameters\": {\"filter\": {\"type\": \"string\", \"location\": \"query\"}, \"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"maxResults\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}}, \"id\": \"compute.networks.list\", \"httpMethod\": \"GET\", \"path\": \"{project}/networks\", \"response\": {\"$ref\": \"NetworkList\"}}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/compute\"], \"parameters\": {\"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"network\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"compute.networks.delete\", \"httpMethod\": \"DELETE\", \"path\": \"{project}/networks/{network}\", \"response\": {\"$ref\": \"Operation\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_ComputeService.class,
                "projects",
                new Google_ProjectsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_ComputeService.class, "serviceName"),
                        "projects",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"setCommonInstanceMetadata\": {\"scopes\": [\"https://www.googleapis.com/auth/compute\"], \"parameters\": {\"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Metadata\"}, \"httpMethod\": \"POST\", \"path\": \"{project}/set-common-instance-metadata\", \"id\": \"compute.projects.setCommonInstanceMetadata\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/compute.readonly\"], \"parameters\": {\"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"compute.projects.get\", \"httpMethod\": \"GET\", \"path\": \"{project}\", \"response\": {\"$ref\": \"Project\"}}}}",
                                true)));

        return null;
    }

    public String ___getRuntimeFilename() {
        return "";
    }

    public String ___getRuntimeDirname() {
        return "";
    }

    public String ___getRuntimeNamespace() {
        return "";
    }
}
