package com.project.convertedCode.globalNamespace.classes;

import com.project.convertedCode.globalNamespace.classes.Google_BucketAccessControlsServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_ObjectsServiceResource;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Google_ObjectAccessControlsServiceResource;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Google_Service;
import com.project.convertedCode.globalNamespace.classes.Google_BucketsServiceResource;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_StorageService.php

*/

public class Google_StorageService extends Google_Service implements RuntimeFileContextInterface {

    public Object objectAccessControls = null;

    public Object bucketAccessControls = null;

    public Object objects = null;

    public Object buckets = null;

    public Google_StorageService(RuntimeEnv env, Object... args) {
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
            case "objectAccessControls":
                return this.objectAccessControls;
            case "bucketAccessControls":
                return this.bucketAccessControls;
            case "objects":
                return this.objects;
            case "buckets":
                return this.buckets;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "objectAccessControls":
                return ZVal.isNull(this.objectAccessControls);
            case "bucketAccessControls":
                return ZVal.isNull(this.bucketAccessControls);
            case "objects":
                return ZVal.isNull(this.objects);
            case "buckets":
                return ZVal.isNull(this.buckets);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "objectAccessControls":
                this.objectAccessControls = value;
                break;
            case "bucketAccessControls":
                this.bucketAccessControls = value;
                break;
            case "objects":
                this.objects = value;
                break;
            case "buckets":
                this.buckets = value;
                break;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object client = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_StorageService.class, "servicePath", "storage/v1beta1/");
        ZVal.setProperty(this, Google_StorageService.class, "version", "v1beta1");
        ZVal.setProperty(this, Google_StorageService.class, "serviceName", "storage");
        env.callMethod(
                client,
                "addService",
                Google_StorageService.class,
                ZVal.getProperty(this, Google_StorageService.class, "serviceName"),
                ZVal.getProperty(this, Google_StorageService.class, "version"));
        ZVal.setProperty(
                this,
                Google_StorageService.class,
                "objectAccessControls",
                new Google_ObjectAccessControlsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_StorageService.class, "serviceName"),
                        "objectAccessControls",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/devstorage.full_control\"], \"parameters\": {\"object\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"bucket\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"ObjectAccessControl\"}, \"response\": {\"$ref\": \"ObjectAccessControl\"}, \"httpMethod\": \"POST\", \"path\": \"b/{bucket}/o/{object}/acl\", \"id\": \"storage.objectAccessControls.insert\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/devstorage.full_control\"], \"parameters\": {\"object\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"bucket\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"entity\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"storage.objectAccessControls.get\", \"httpMethod\": \"GET\", \"path\": \"b/{bucket}/o/{object}/acl/{entity}\", \"response\": {\"$ref\": \"ObjectAccessControl\"}}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/devstorage.full_control\"], \"parameters\": {\"object\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"bucket\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"storage.objectAccessControls.list\", \"httpMethod\": \"GET\", \"path\": \"b/{bucket}/o/{object}/acl\", \"response\": {\"$ref\": \"ObjectAccessControls\"}}, \"update\": {\"scopes\": [\"https://www.googleapis.com/auth/devstorage.full_control\"], \"parameters\": {\"object\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"bucket\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"entity\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"ObjectAccessControl\"}, \"response\": {\"$ref\": \"ObjectAccessControl\"}, \"httpMethod\": \"PUT\", \"path\": \"b/{bucket}/o/{object}/acl/{entity}\", \"id\": \"storage.objectAccessControls.update\"}, \"patch\": {\"scopes\": [\"https://www.googleapis.com/auth/devstorage.full_control\"], \"parameters\": {\"object\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"bucket\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"entity\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"ObjectAccessControl\"}, \"response\": {\"$ref\": \"ObjectAccessControl\"}, \"httpMethod\": \"PATCH\", \"path\": \"b/{bucket}/o/{object}/acl/{entity}\", \"id\": \"storage.objectAccessControls.patch\"}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/devstorage.full_control\"], \"path\": \"b/{bucket}/o/{object}/acl/{entity}\", \"id\": \"storage.objectAccessControls.delete\", \"parameters\": {\"object\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"bucket\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"entity\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"httpMethod\": \"DELETE\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_StorageService.class,
                "bucketAccessControls",
                new Google_BucketAccessControlsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_StorageService.class, "serviceName"),
                        "bucketAccessControls",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/devstorage.full_control\"], \"parameters\": {\"bucket\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"BucketAccessControl\"}, \"response\": {\"$ref\": \"BucketAccessControl\"}, \"httpMethod\": \"POST\", \"path\": \"b/{bucket}/acl\", \"id\": \"storage.bucketAccessControls.insert\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/devstorage.full_control\"], \"parameters\": {\"bucket\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"entity\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"storage.bucketAccessControls.get\", \"httpMethod\": \"GET\", \"path\": \"b/{bucket}/acl/{entity}\", \"response\": {\"$ref\": \"BucketAccessControl\"}}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/devstorage.full_control\"], \"parameters\": {\"bucket\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"storage.bucketAccessControls.list\", \"httpMethod\": \"GET\", \"path\": \"b/{bucket}/acl\", \"response\": {\"$ref\": \"BucketAccessControls\"}}, \"update\": {\"scopes\": [\"https://www.googleapis.com/auth/devstorage.full_control\"], \"parameters\": {\"bucket\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"entity\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"BucketAccessControl\"}, \"response\": {\"$ref\": \"BucketAccessControl\"}, \"httpMethod\": \"PUT\", \"path\": \"b/{bucket}/acl/{entity}\", \"id\": \"storage.bucketAccessControls.update\"}, \"patch\": {\"scopes\": [\"https://www.googleapis.com/auth/devstorage.full_control\"], \"parameters\": {\"bucket\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"entity\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"BucketAccessControl\"}, \"response\": {\"$ref\": \"BucketAccessControl\"}, \"httpMethod\": \"PATCH\", \"path\": \"b/{bucket}/acl/{entity}\", \"id\": \"storage.bucketAccessControls.patch\"}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/devstorage.full_control\"], \"path\": \"b/{bucket}/acl/{entity}\", \"id\": \"storage.bucketAccessControls.delete\", \"parameters\": {\"bucket\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"entity\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"httpMethod\": \"DELETE\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_StorageService.class,
                "objects",
                new Google_ObjectsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_StorageService.class, "serviceName"),
                        "objects",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/devstorage.full_control\", \"https://www.googleapis.com/auth/devstorage.read_write\"], \"parameters\": {\"bucket\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"name\": {\"type\": \"string\", \"location\": \"query\"}, \"projection\": {\"enum\": [\"full\", \"no_acl\"], \"type\": \"string\", \"location\": \"query\"}}, \"supportsMediaUpload\": true, \"request\": {\"$ref\": \"Object\"}, \"mediaUpload\": {\"protocols\": {\"simple\": {\"path\": \"/upload/storage/v1beta1/b/{bucket}/o\", \"multipart\": true}, \"resumable\": {\"path\": \"/resumable/upload/storage/v1beta1/b/{bucket}/o\", \"multipart\": true}}, \"accept\": [\"*/*\"]}, \"response\": {\"$ref\": \"Object\"}, \"httpMethod\": \"POST\", \"path\": \"b/{bucket}/o\", \"id\": \"storage.objects.insert\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/devstorage.full_control\", \"https://www.googleapis.com/auth/devstorage.read_only\", \"https://www.googleapis.com/auth/devstorage.read_write\"], \"parameters\": {\"object\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"bucket\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"projection\": {\"enum\": [\"full\", \"no_acl\"], \"type\": \"string\", \"location\": \"query\"}}, \"id\": \"storage.objects.get\", \"httpMethod\": \"GET\", \"supportsMediaDownload\": true, \"path\": \"b/{bucket}/o/{object}\", \"response\": {\"$ref\": \"Object\"}}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/devstorage.full_control\", \"https://www.googleapis.com/auth/devstorage.read_only\", \"https://www.googleapis.com/auth/devstorage.read_write\"], \"parameters\": {\"max-results\": {\"minimum\": \"0\", \"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"projection\": {\"enum\": [\"full\", \"no_acl\"], \"type\": \"string\", \"location\": \"query\"}, \"bucket\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"prefix\": {\"type\": \"string\", \"location\": \"query\"}, \"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"delimiter\": {\"type\": \"string\", \"location\": \"query\"}}, \"response\": {\"$ref\": \"Objects\"}, \"httpMethod\": \"GET\", \"supportsSubscription\": true, \"path\": \"b/{bucket}/o\", \"id\": \"storage.objects.list\"}, \"update\": {\"scopes\": [\"https://www.googleapis.com/auth/devstorage.full_control\", \"https://www.googleapis.com/auth/devstorage.read_write\"], \"parameters\": {\"object\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"bucket\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"projection\": {\"enum\": [\"full\", \"no_acl\"], \"type\": \"string\", \"location\": \"query\"}}, \"request\": {\"$ref\": \"Object\"}, \"response\": {\"$ref\": \"Object\"}, \"httpMethod\": \"PUT\", \"path\": \"b/{bucket}/o/{object}\", \"id\": \"storage.objects.update\"}, \"patch\": {\"scopes\": [\"https://www.googleapis.com/auth/devstorage.full_control\", \"https://www.googleapis.com/auth/devstorage.read_write\"], \"parameters\": {\"object\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"bucket\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"projection\": {\"enum\": [\"full\", \"no_acl\"], \"type\": \"string\", \"location\": \"query\"}}, \"request\": {\"$ref\": \"Object\"}, \"response\": {\"$ref\": \"Object\"}, \"httpMethod\": \"PATCH\", \"path\": \"b/{bucket}/o/{object}\", \"id\": \"storage.objects.patch\"}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/devstorage.full_control\", \"https://www.googleapis.com/auth/devstorage.read_write\"], \"path\": \"b/{bucket}/o/{object}\", \"id\": \"storage.objects.delete\", \"parameters\": {\"object\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"bucket\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"httpMethod\": \"DELETE\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_StorageService.class,
                "buckets",
                new Google_BucketsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_StorageService.class, "serviceName"),
                        "buckets",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/devstorage.full_control\", \"https://www.googleapis.com/auth/devstorage.read_write\"], \"parameters\": {\"projection\": {\"enum\": [\"full\", \"no_acl\"], \"type\": \"string\", \"location\": \"query\"}}, \"request\": {\"$ref\": \"Bucket\"}, \"response\": {\"$ref\": \"Bucket\"}, \"httpMethod\": \"POST\", \"path\": \"b\", \"id\": \"storage.buckets.insert\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/devstorage.full_control\", \"https://www.googleapis.com/auth/devstorage.read_only\", \"https://www.googleapis.com/auth/devstorage.read_write\"], \"parameters\": {\"bucket\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"projection\": {\"enum\": [\"full\", \"no_acl\"], \"type\": \"string\", \"location\": \"query\"}}, \"id\": \"storage.buckets.get\", \"httpMethod\": \"GET\", \"path\": \"b/{bucket}\", \"response\": {\"$ref\": \"Bucket\"}}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/devstorage.full_control\", \"https://www.googleapis.com/auth/devstorage.read_only\", \"https://www.googleapis.com/auth/devstorage.read_write\"], \"parameters\": {\"max-results\": {\"minimum\": \"0\", \"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"projection\": {\"enum\": [\"full\", \"no_acl\"], \"type\": \"string\", \"location\": \"query\"}, \"projectId\": {\"required\": true, \"type\": \"string\", \"location\": \"query\", \"format\": \"uint64\"}}, \"id\": \"storage.buckets.list\", \"httpMethod\": \"GET\", \"path\": \"b\", \"response\": {\"$ref\": \"Buckets\"}}, \"update\": {\"scopes\": [\"https://www.googleapis.com/auth/devstorage.full_control\", \"https://www.googleapis.com/auth/devstorage.read_write\"], \"parameters\": {\"bucket\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"projection\": {\"enum\": [\"full\", \"no_acl\"], \"type\": \"string\", \"location\": \"query\"}}, \"request\": {\"$ref\": \"Bucket\"}, \"response\": {\"$ref\": \"Bucket\"}, \"httpMethod\": \"PUT\", \"path\": \"b/{bucket}\", \"id\": \"storage.buckets.update\"}, \"patch\": {\"scopes\": [\"https://www.googleapis.com/auth/devstorage.full_control\", \"https://www.googleapis.com/auth/devstorage.read_write\"], \"parameters\": {\"bucket\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"projection\": {\"enum\": [\"full\", \"no_acl\"], \"type\": \"string\", \"location\": \"query\"}}, \"request\": {\"$ref\": \"Bucket\"}, \"response\": {\"$ref\": \"Bucket\"}, \"httpMethod\": \"PATCH\", \"path\": \"b/{bucket}\", \"id\": \"storage.buckets.patch\"}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/devstorage.full_control\", \"https://www.googleapis.com/auth/devstorage.read_write\"], \"path\": \"b/{bucket}\", \"id\": \"storage.buckets.delete\", \"parameters\": {\"bucket\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"httpMethod\": \"DELETE\"}}}",
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
