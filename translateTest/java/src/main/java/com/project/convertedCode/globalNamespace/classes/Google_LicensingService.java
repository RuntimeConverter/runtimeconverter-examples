package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Google_Service;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Google_LicenseAssignmentsServiceResource;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_LicensingService.php

*/

public class Google_LicensingService extends Google_Service implements RuntimeFileContextInterface {

    public Object licenseAssignments = null;

    public Google_LicensingService(RuntimeEnv env, Object... args) {
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
            case "licenseAssignments":
                return this.licenseAssignments;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "licenseAssignments":
                return ZVal.isNull(this.licenseAssignments);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "licenseAssignments":
                this.licenseAssignments = value;
                break;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object client = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_LicensingService.class, "servicePath", "apps/licensing/v1/product/");
        ZVal.setProperty(this, Google_LicensingService.class, "version", "v1");
        ZVal.setProperty(this, Google_LicensingService.class, "serviceName", "licensing");
        env.callMethod(
                client,
                "addService",
                Google_LicensingService.class,
                ZVal.getProperty(this, Google_LicensingService.class, "serviceName"),
                ZVal.getProperty(this, Google_LicensingService.class, "version"));
        ZVal.setProperty(
                this,
                Google_LicensingService.class,
                "licenseAssignments",
                new Google_LicenseAssignmentsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_LicensingService.class, "serviceName"),
                        "licenseAssignments",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"parameters\": {\"skuId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"productId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"LicenseAssignmentInsert\"}, \"id\": \"licensing.licenseAssignments.insert\", \"httpMethod\": \"POST\", \"path\": \"{productId}/sku/{skuId}/user\", \"response\": {\"$ref\": \"LicenseAssignment\"}}, \"get\": {\"httpMethod\": \"GET\", \"response\": {\"$ref\": \"LicenseAssignment\"}, \"id\": \"licensing.licenseAssignments.get\", \"parameters\": {\"skuId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"userId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"productId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"path\": \"{productId}/sku/{skuId}/user/{userId}\"}, \"listForProductAndSku\": {\"httpMethod\": \"GET\", \"response\": {\"$ref\": \"LicenseAssignmentList\"}, \"id\": \"licensing.licenseAssignments.listForProductAndSku\", \"parameters\": {\"pageToken\": {\"default\": \"\", \"type\": \"string\", \"location\": \"query\"}, \"skuId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"customerId\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"maxResults\": {\"format\": \"uint32\", \"default\": \"100\", \"maximum\": \"1000\", \"minimum\": \"1\", \"location\": \"query\", \"type\": \"integer\"}, \"productId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"path\": \"{productId}/sku/{skuId}/users\"}, \"listForProduct\": {\"httpMethod\": \"GET\", \"response\": {\"$ref\": \"LicenseAssignmentList\"}, \"id\": \"licensing.licenseAssignments.listForProduct\", \"parameters\": {\"pageToken\": {\"default\": \"\", \"type\": \"string\", \"location\": \"query\"}, \"customerId\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"maxResults\": {\"format\": \"uint32\", \"default\": \"100\", \"maximum\": \"1000\", \"minimum\": \"1\", \"location\": \"query\", \"type\": \"integer\"}, \"productId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"path\": \"{productId}/users\"}, \"update\": {\"parameters\": {\"skuId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"userId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"productId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"LicenseAssignment\"}, \"id\": \"licensing.licenseAssignments.update\", \"httpMethod\": \"PUT\", \"path\": \"{productId}/sku/{skuId}/user/{userId}\", \"response\": {\"$ref\": \"LicenseAssignment\"}}, \"patch\": {\"parameters\": {\"skuId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"userId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"productId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"LicenseAssignment\"}, \"id\": \"licensing.licenseAssignments.patch\", \"httpMethod\": \"PATCH\", \"path\": \"{productId}/sku/{skuId}/user/{userId}\", \"response\": {\"$ref\": \"LicenseAssignment\"}}, \"delete\": {\"httpMethod\": \"DELETE\", \"id\": \"licensing.licenseAssignments.delete\", \"parameters\": {\"skuId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"userId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"productId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"path\": \"{productId}/sku/{skuId}/user/{userId}\"}}}",
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
