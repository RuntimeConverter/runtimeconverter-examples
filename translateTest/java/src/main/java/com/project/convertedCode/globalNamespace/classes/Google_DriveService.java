package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Google_ChildrenServiceResource;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Google_Service;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Google_ChangesServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_PermissionsServiceResource;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.classes.Google_ParentsServiceResource;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.classes.Google_AppsServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_AboutServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_RevisionsServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_FilesServiceResource;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_DriveService.php

*/

public class Google_DriveService extends Google_Service implements RuntimeFileContextInterface {

    public Object files = null;

    public Object about = null;

    public Object apps = null;

    public Object parents = null;

    public Object revisions = null;

    public Object changes = null;

    public Object children = null;

    public Object permissions = null;

    public Google_DriveService(RuntimeEnv env, Object... args) {
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
            case "files":
                return this.files;
            case "about":
                return this.about;
            case "apps":
                return this.apps;
            case "parents":
                return this.parents;
            case "revisions":
                return this.revisions;
            case "changes":
                return this.changes;
            case "children":
                return this.children;
            case "permissions":
                return this.permissions;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "files":
                return ZVal.isNull(this.files);
            case "about":
                return ZVal.isNull(this.about);
            case "apps":
                return ZVal.isNull(this.apps);
            case "parents":
                return ZVal.isNull(this.parents);
            case "revisions":
                return ZVal.isNull(this.revisions);
            case "changes":
                return ZVal.isNull(this.changes);
            case "children":
                return ZVal.isNull(this.children);
            case "permissions":
                return ZVal.isNull(this.permissions);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "files":
                this.files = value;
                break;
            case "about":
                this.about = value;
                break;
            case "apps":
                this.apps = value;
                break;
            case "parents":
                this.parents = value;
                break;
            case "revisions":
                this.revisions = value;
                break;
            case "changes":
                this.changes = value;
                break;
            case "children":
                this.children = value;
                break;
            case "permissions":
                this.permissions = value;
                break;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object client = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DriveService.class, "servicePath", "drive/v2/");
        ZVal.setProperty(this, Google_DriveService.class, "version", "v2");
        ZVal.setProperty(this, Google_DriveService.class, "serviceName", "drive");
        env.callMethod(
                client,
                "addService",
                Google_DriveService.class,
                ZVal.getProperty(this, Google_DriveService.class, "serviceName"),
                ZVal.getProperty(this, Google_DriveService.class, "version"));
        ZVal.setProperty(
                this,
                Google_DriveService.class,
                "files",
                new Google_FilesServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_DriveService.class, "serviceName"),
                        "files",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/drive\", \"https://www.googleapis.com/auth/drive.file\"], \"parameters\": {\"convert\": {\"default\": \"false\", \"type\": \"boolean\", \"location\": \"query\"}, \"targetLanguage\": {\"type\": \"string\", \"location\": \"query\"}, \"sourceLanguage\": {\"type\": \"string\", \"location\": \"query\"}, \"ocrLanguage\": {\"type\": \"string\", \"location\": \"query\"}, \"pinned\": {\"default\": \"false\", \"type\": \"boolean\", \"location\": \"query\"}, \"ocr\": {\"default\": \"false\", \"type\": \"boolean\", \"location\": \"query\"}, \"timedTextTrackName\": {\"type\": \"string\", \"location\": \"query\"}, \"timedTextLanguage\": {\"type\": \"string\", \"location\": \"query\"}}, \"supportsMediaUpload\": true, \"request\": {\"$ref\": \"File\"}, \"mediaUpload\": {\"maxSize\": \"10GB\", \"protocols\": {\"simple\": {\"path\": \"/upload/drive/v2/files\", \"multipart\": true}, \"resumable\": {\"path\": \"/resumable/upload/drive/v2/files\", \"multipart\": true}}, \"accept\": [\"*/*\"]}, \"response\": {\"$ref\": \"File\"}, \"httpMethod\": \"POST\", \"path\": \"files\", \"id\": \"drive.files.insert\"}, \"untrash\": {\"scopes\": [\"https://www.googleapis.com/auth/drive\", \"https://www.googleapis.com/auth/drive.file\"], \"parameters\": {\"fileId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"drive.files.untrash\", \"httpMethod\": \"POST\", \"path\": \"files/{fileId}/untrash\", \"response\": {\"$ref\": \"File\"}}, \"trash\": {\"scopes\": [\"https://www.googleapis.com/auth/drive\", \"https://www.googleapis.com/auth/drive.file\"], \"parameters\": {\"fileId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"drive.files.trash\", \"httpMethod\": \"POST\", \"path\": \"files/{fileId}/trash\", \"response\": {\"$ref\": \"File\"}}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/drive\", \"https://www.googleapis.com/auth/drive.file\", \"https://www.googleapis.com/auth/drive.metadata.readonly\", \"https://www.googleapis.com/auth/drive.readonly\"], \"parameters\": {\"updateViewedDate\": {\"default\": \"false\", \"type\": \"boolean\", \"location\": \"query\"}, \"projection\": {\"enum\": [\"BASIC\", \"FULL\"], \"type\": \"string\", \"location\": \"query\"}, \"fileId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"drive.files.get\", \"httpMethod\": \"GET\", \"path\": \"files/{fileId}\", \"response\": {\"$ref\": \"File\"}}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/drive\", \"https://www.googleapis.com/auth/drive.file\", \"https://www.googleapis.com/auth/drive.metadata.readonly\", \"https://www.googleapis.com/auth/drive.readonly\"], \"parameters\": {\"q\": {\"type\": \"string\", \"location\": \"query\"}, \"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"projection\": {\"enum\": [\"BASIC\", \"FULL\"], \"type\": \"string\", \"location\": \"query\"}, \"maxResults\": {\"default\": \"100\", \"minimum\": \"0\", \"type\": \"integer\", \"location\": \"query\", \"format\": \"int32\"}}, \"response\": {\"$ref\": \"FileList\"}, \"httpMethod\": \"GET\", \"path\": \"files\", \"id\": \"drive.files.list\"}, \"update\": {\"scopes\": [\"https://www.googleapis.com/auth/drive\", \"https://www.googleapis.com/auth/drive.file\"], \"parameters\": {\"convert\": {\"default\": \"false\", \"type\": \"boolean\", \"location\": \"query\"}, \"ocr\": {\"default\": \"false\", \"type\": \"boolean\", \"location\": \"query\"}, \"setModifiedDate\": {\"default\": \"false\", \"type\": \"boolean\", \"location\": \"query\"}, \"updateViewedDate\": {\"default\": \"true\", \"type\": \"boolean\", \"location\": \"query\"}, \"sourceLanguage\": {\"type\": \"string\", \"location\": \"query\"}, \"ocrLanguage\": {\"type\": \"string\", \"location\": \"query\"}, \"pinned\": {\"default\": \"false\", \"type\": \"boolean\", \"location\": \"query\"}, \"newRevision\": {\"default\": \"true\", \"type\": \"boolean\", \"location\": \"query\"}, \"targetLanguage\": {\"type\": \"string\", \"location\": \"query\"}, \"timedTextLanguage\": {\"type\": \"string\", \"location\": \"query\"}, \"timedTextTrackName\": {\"type\": \"string\", \"location\": \"query\"}, \"fileId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"supportsMediaUpload\": true, \"request\": {\"$ref\": \"File\"}, \"mediaUpload\": {\"maxSize\": \"10GB\", \"protocols\": {\"simple\": {\"path\": \"/upload/drive/v2/files/{fileId}\", \"multipart\": true}, \"resumable\": {\"path\": \"/resumable/upload/drive/v2/files/{fileId}\", \"multipart\": true}}, \"accept\": [\"*/*\"]}, \"response\": {\"$ref\": \"File\"}, \"httpMethod\": \"PUT\", \"path\": \"files/{fileId}\", \"id\": \"drive.files.update\"}, \"patch\": {\"scopes\": [\"https://www.googleapis.com/auth/drive\", \"https://www.googleapis.com/auth/drive.file\"], \"parameters\": {\"convert\": {\"default\": \"false\", \"type\": \"boolean\", \"location\": \"query\"}, \"ocr\": {\"default\": \"false\", \"type\": \"boolean\", \"location\": \"query\"}, \"setModifiedDate\": {\"default\": \"false\", \"type\": \"boolean\", \"location\": \"query\"}, \"updateViewedDate\": {\"default\": \"true\", \"type\": \"boolean\", \"location\": \"query\"}, \"sourceLanguage\": {\"type\": \"string\", \"location\": \"query\"}, \"ocrLanguage\": {\"type\": \"string\", \"location\": \"query\"}, \"pinned\": {\"default\": \"false\", \"type\": \"boolean\", \"location\": \"query\"}, \"newRevision\": {\"default\": \"true\", \"type\": \"boolean\", \"location\": \"query\"}, \"targetLanguage\": {\"type\": \"string\", \"location\": \"query\"}, \"timedTextLanguage\": {\"type\": \"string\", \"location\": \"query\"}, \"timedTextTrackName\": {\"type\": \"string\", \"location\": \"query\"}, \"fileId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"File\"}, \"response\": {\"$ref\": \"File\"}, \"httpMethod\": \"PATCH\", \"path\": \"files/{fileId}\", \"id\": \"drive.files.patch\"}, \"touch\": {\"scopes\": [\"https://www.googleapis.com/auth/drive\", \"https://www.googleapis.com/auth/drive.file\"], \"parameters\": {\"fileId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"drive.files.touch\", \"httpMethod\": \"POST\", \"path\": \"files/{fileId}/touch\", \"response\": {\"$ref\": \"File\"}}, \"copy\": {\"scopes\": [\"https://www.googleapis.com/auth/drive\", \"https://www.googleapis.com/auth/drive.file\"], \"parameters\": {\"convert\": {\"default\": \"false\", \"type\": \"boolean\", \"location\": \"query\"}, \"ocr\": {\"default\": \"false\", \"type\": \"boolean\", \"location\": \"query\"}, \"sourceLanguage\": {\"type\": \"string\", \"location\": \"query\"}, \"ocrLanguage\": {\"type\": \"string\", \"location\": \"query\"}, \"pinned\": {\"default\": \"false\", \"type\": \"boolean\", \"location\": \"query\"}, \"targetLanguage\": {\"type\": \"string\", \"location\": \"query\"}, \"timedTextLanguage\": {\"type\": \"string\", \"location\": \"query\"}, \"timedTextTrackName\": {\"type\": \"string\", \"location\": \"query\"}, \"fileId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"File\"}, \"response\": {\"$ref\": \"File\"}, \"httpMethod\": \"POST\", \"path\": \"files/{fileId}/copy\", \"id\": \"drive.files.copy\"}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/drive\", \"https://www.googleapis.com/auth/drive.file\"], \"path\": \"files/{fileId}\", \"id\": \"drive.files.delete\", \"parameters\": {\"fileId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"httpMethod\": \"DELETE\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_DriveService.class,
                "about",
                new Google_AboutServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_DriveService.class, "serviceName"),
                        "about",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"get\": {\"scopes\": [\"https://www.googleapis.com/auth/drive\", \"https://www.googleapis.com/auth/drive.file\", \"https://www.googleapis.com/auth/drive.metadata.readonly\", \"https://www.googleapis.com/auth/drive.readonly\"], \"parameters\": {\"includeSubscribed\": {\"default\": \"true\", \"type\": \"boolean\", \"location\": \"query\"}, \"maxChangeIdCount\": {\"default\": \"1\", \"type\": \"string\", \"location\": \"query\", \"format\": \"int64\"}, \"startChangeId\": {\"type\": \"string\", \"location\": \"query\", \"format\": \"int64\"}}, \"response\": {\"$ref\": \"About\"}, \"httpMethod\": \"GET\", \"path\": \"about\", \"id\": \"drive.about.get\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_DriveService.class,
                "apps",
                new Google_AppsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_DriveService.class, "serviceName"),
                        "apps",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/drive.apps.readonly\"], \"path\": \"apps\", \"response\": {\"$ref\": \"AppList\"}, \"id\": \"drive.apps.list\", \"httpMethod\": \"GET\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/drive.apps.readonly\"], \"parameters\": {\"appId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"drive.apps.get\", \"httpMethod\": \"GET\", \"path\": \"apps/{appId}\", \"response\": {\"$ref\": \"App\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_DriveService.class,
                "parents",
                new Google_ParentsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_DriveService.class, "serviceName"),
                        "parents",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/drive\", \"https://www.googleapis.com/auth/drive.file\"], \"parameters\": {\"fileId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"ParentReference\"}, \"response\": {\"$ref\": \"ParentReference\"}, \"httpMethod\": \"POST\", \"path\": \"files/{fileId}/parents\", \"id\": \"drive.parents.insert\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/drive\", \"https://www.googleapis.com/auth/drive.file\", \"https://www.googleapis.com/auth/drive.metadata.readonly\", \"https://www.googleapis.com/auth/drive.readonly\"], \"parameters\": {\"parentId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"fileId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"drive.parents.get\", \"httpMethod\": \"GET\", \"path\": \"files/{fileId}/parents/{parentId}\", \"response\": {\"$ref\": \"ParentReference\"}}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/drive\", \"https://www.googleapis.com/auth/drive.file\", \"https://www.googleapis.com/auth/drive.metadata.readonly\", \"https://www.googleapis.com/auth/drive.readonly\"], \"parameters\": {\"fileId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"drive.parents.list\", \"httpMethod\": \"GET\", \"path\": \"files/{fileId}/parents\", \"response\": {\"$ref\": \"ParentList\"}}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/drive\", \"https://www.googleapis.com/auth/drive.file\"], \"path\": \"files/{fileId}/parents/{parentId}\", \"id\": \"drive.parents.delete\", \"parameters\": {\"parentId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"fileId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"httpMethod\": \"DELETE\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_DriveService.class,
                "revisions",
                new Google_RevisionsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_DriveService.class, "serviceName"),
                        "revisions",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"patch\": {\"scopes\": [\"https://www.googleapis.com/auth/drive\", \"https://www.googleapis.com/auth/drive.file\"], \"parameters\": {\"revisionId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"fileId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Revision\"}, \"response\": {\"$ref\": \"Revision\"}, \"httpMethod\": \"PATCH\", \"path\": \"files/{fileId}/revisions/{revisionId}\", \"id\": \"drive.revisions.patch\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/drive\", \"https://www.googleapis.com/auth/drive.file\", \"https://www.googleapis.com/auth/drive.metadata.readonly\", \"https://www.googleapis.com/auth/drive.readonly\"], \"parameters\": {\"revisionId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"fileId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"drive.revisions.get\", \"httpMethod\": \"GET\", \"path\": \"files/{fileId}/revisions/{revisionId}\", \"response\": {\"$ref\": \"Revision\"}}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/drive\", \"https://www.googleapis.com/auth/drive.file\", \"https://www.googleapis.com/auth/drive.metadata.readonly\", \"https://www.googleapis.com/auth/drive.readonly\"], \"parameters\": {\"fileId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"drive.revisions.list\", \"httpMethod\": \"GET\", \"path\": \"files/{fileId}/revisions\", \"response\": {\"$ref\": \"RevisionList\"}}, \"update\": {\"scopes\": [\"https://www.googleapis.com/auth/drive\", \"https://www.googleapis.com/auth/drive.file\"], \"parameters\": {\"revisionId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"fileId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Revision\"}, \"response\": {\"$ref\": \"Revision\"}, \"httpMethod\": \"PUT\", \"path\": \"files/{fileId}/revisions/{revisionId}\", \"id\": \"drive.revisions.update\"}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/drive\", \"https://www.googleapis.com/auth/drive.file\"], \"path\": \"files/{fileId}/revisions/{revisionId}\", \"id\": \"drive.revisions.delete\", \"parameters\": {\"revisionId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"fileId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"httpMethod\": \"DELETE\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_DriveService.class,
                "changes",
                new Google_ChangesServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_DriveService.class, "serviceName"),
                        "changes",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/drive\", \"https://www.googleapis.com/auth/drive.file\", \"https://www.googleapis.com/auth/drive.metadata.readonly\", \"https://www.googleapis.com/auth/drive.readonly\"], \"parameters\": {\"includeSubscribed\": {\"default\": \"true\", \"type\": \"boolean\", \"location\": \"query\"}, \"startChangeId\": {\"type\": \"string\", \"location\": \"query\", \"format\": \"int64\"}, \"includeDeleted\": {\"default\": \"true\", \"type\": \"boolean\", \"location\": \"query\"}, \"maxResults\": {\"default\": \"100\", \"minimum\": \"0\", \"type\": \"integer\", \"location\": \"query\", \"format\": \"int32\"}, \"pageToken\": {\"type\": \"string\", \"location\": \"query\"}}, \"response\": {\"$ref\": \"ChangeList\"}, \"httpMethod\": \"GET\", \"path\": \"changes\", \"id\": \"drive.changes.list\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/drive\", \"https://www.googleapis.com/auth/drive.file\", \"https://www.googleapis.com/auth/drive.metadata.readonly\", \"https://www.googleapis.com/auth/drive.readonly\"], \"parameters\": {\"changeId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"drive.changes.get\", \"httpMethod\": \"GET\", \"path\": \"changes/{changeId}\", \"response\": {\"$ref\": \"Change\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_DriveService.class,
                "children",
                new Google_ChildrenServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_DriveService.class, "serviceName"),
                        "children",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/drive\", \"https://www.googleapis.com/auth/drive.file\"], \"parameters\": {\"folderId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"ChildReference\"}, \"response\": {\"$ref\": \"ChildReference\"}, \"httpMethod\": \"POST\", \"path\": \"files/{folderId}/children\", \"id\": \"drive.children.insert\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/drive\", \"https://www.googleapis.com/auth/drive.file\", \"https://www.googleapis.com/auth/drive.metadata.readonly\", \"https://www.googleapis.com/auth/drive.readonly\"], \"parameters\": {\"folderId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"childId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"drive.children.get\", \"httpMethod\": \"GET\", \"path\": \"files/{folderId}/children/{childId}\", \"response\": {\"$ref\": \"ChildReference\"}}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/drive\", \"https://www.googleapis.com/auth/drive.file\", \"https://www.googleapis.com/auth/drive.metadata.readonly\", \"https://www.googleapis.com/auth/drive.readonly\"], \"parameters\": {\"q\": {\"type\": \"string\", \"location\": \"query\"}, \"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"folderId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"maxResults\": {\"default\": \"100\", \"minimum\": \"0\", \"type\": \"integer\", \"location\": \"query\", \"format\": \"int32\"}}, \"id\": \"drive.children.list\", \"httpMethod\": \"GET\", \"path\": \"files/{folderId}/children\", \"response\": {\"$ref\": \"ChildList\"}}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/drive\", \"https://www.googleapis.com/auth/drive.file\"], \"path\": \"files/{folderId}/children/{childId}\", \"id\": \"drive.children.delete\", \"parameters\": {\"folderId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"childId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"httpMethod\": \"DELETE\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_DriveService.class,
                "permissions",
                new Google_PermissionsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_DriveService.class, "serviceName"),
                        "permissions",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/drive\", \"https://www.googleapis.com/auth/drive.file\"], \"parameters\": {\"sendNotificationEmails\": {\"default\": \"true\", \"type\": \"boolean\", \"location\": \"query\"}, \"fileId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Permission\"}, \"response\": {\"$ref\": \"Permission\"}, \"httpMethod\": \"POST\", \"path\": \"files/{fileId}/permissions\", \"id\": \"drive.permissions.insert\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/drive\", \"https://www.googleapis.com/auth/drive.file\", \"https://www.googleapis.com/auth/drive.metadata.readonly\", \"https://www.googleapis.com/auth/drive.readonly\"], \"parameters\": {\"permissionId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"fileId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"drive.permissions.get\", \"httpMethod\": \"GET\", \"path\": \"files/{fileId}/permissions/{permissionId}\", \"response\": {\"$ref\": \"Permission\"}}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/drive\", \"https://www.googleapis.com/auth/drive.file\", \"https://www.googleapis.com/auth/drive.metadata.readonly\", \"https://www.googleapis.com/auth/drive.readonly\"], \"parameters\": {\"fileId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"drive.permissions.list\", \"httpMethod\": \"GET\", \"path\": \"files/{fileId}/permissions\", \"response\": {\"$ref\": \"PermissionList\"}}, \"update\": {\"scopes\": [\"https://www.googleapis.com/auth/drive\", \"https://www.googleapis.com/auth/drive.file\"], \"parameters\": {\"permissionId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"fileId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Permission\"}, \"response\": {\"$ref\": \"Permission\"}, \"httpMethod\": \"PUT\", \"path\": \"files/{fileId}/permissions/{permissionId}\", \"id\": \"drive.permissions.update\"}, \"patch\": {\"scopes\": [\"https://www.googleapis.com/auth/drive\", \"https://www.googleapis.com/auth/drive.file\"], \"parameters\": {\"permissionId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"fileId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Permission\"}, \"response\": {\"$ref\": \"Permission\"}, \"httpMethod\": \"PATCH\", \"path\": \"files/{fileId}/permissions/{permissionId}\", \"id\": \"drive.permissions.patch\"}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/drive\", \"https://www.googleapis.com/auth/drive.file\"], \"path\": \"files/{fileId}/permissions/{permissionId}\", \"id\": \"drive.permissions.delete\", \"parameters\": {\"permissionId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"fileId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"httpMethod\": \"DELETE\"}}}",
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
