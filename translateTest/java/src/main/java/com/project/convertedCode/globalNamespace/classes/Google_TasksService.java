package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.classes.Google_TasksServiceResource;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Google_Service;
import com.project.convertedCode.globalNamespace.classes.Google_TasklistsServiceResource;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_TasksService.php

*/

public class Google_TasksService extends Google_Service implements RuntimeFileContextInterface {

    public Object tasks = null;

    public Object tasklists = null;

    public Google_TasksService(RuntimeEnv env, Object... args) {
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
            case "tasks":
                return this.tasks;
            case "tasklists":
                return this.tasklists;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "tasks":
                return ZVal.isNull(this.tasks);
            case "tasklists":
                return ZVal.isNull(this.tasklists);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "tasks":
                this.tasks = value;
                break;
            case "tasklists":
                this.tasklists = value;
                break;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object client = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_TasksService.class, "servicePath", "tasks/v1/");
        ZVal.setProperty(this, Google_TasksService.class, "version", "v1");
        ZVal.setProperty(this, Google_TasksService.class, "serviceName", "tasks");
        env.callMethod(
                client,
                "addService",
                Google_TasksService.class,
                ZVal.getProperty(this, Google_TasksService.class, "serviceName"),
                ZVal.getProperty(this, Google_TasksService.class, "version"));
        ZVal.setProperty(
                this,
                Google_TasksService.class,
                "tasks",
                new Google_TasksServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_TasksService.class, "serviceName"),
                        "tasks",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/tasks\"], \"parameters\": {\"tasklist\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"parent\": {\"type\": \"string\", \"location\": \"query\"}, \"previous\": {\"type\": \"string\", \"location\": \"query\"}}, \"request\": {\"$ref\": \"Task\"}, \"response\": {\"$ref\": \"Task\"}, \"httpMethod\": \"POST\", \"path\": \"lists/{tasklist}/tasks\", \"id\": \"tasks.tasks.insert\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/tasks\", \"https://www.googleapis.com/auth/tasks.readonly\"], \"parameters\": {\"tasklist\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"task\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"tasks.tasks.get\", \"httpMethod\": \"GET\", \"path\": \"lists/{tasklist}/tasks/{task}\", \"response\": {\"$ref\": \"Task\"}}, \"clear\": {\"scopes\": [\"https://www.googleapis.com/auth/tasks\"], \"path\": \"lists/{tasklist}/clear\", \"id\": \"tasks.tasks.clear\", \"parameters\": {\"tasklist\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"httpMethod\": \"POST\"}, \"move\": {\"scopes\": [\"https://www.googleapis.com/auth/tasks\"], \"parameters\": {\"task\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"tasklist\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"parent\": {\"type\": \"string\", \"location\": \"query\"}, \"previous\": {\"type\": \"string\", \"location\": \"query\"}}, \"id\": \"tasks.tasks.move\", \"httpMethod\": \"POST\", \"path\": \"lists/{tasklist}/tasks/{task}/move\", \"response\": {\"$ref\": \"Task\"}}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/tasks\", \"https://www.googleapis.com/auth/tasks.readonly\"], \"parameters\": {\"dueMax\": {\"type\": \"string\", \"location\": \"query\"}, \"tasklist\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"showDeleted\": {\"type\": \"boolean\", \"location\": \"query\"}, \"updatedMin\": {\"type\": \"string\", \"location\": \"query\"}, \"completedMin\": {\"type\": \"string\", \"location\": \"query\"}, \"maxResults\": {\"type\": \"string\", \"location\": \"query\", \"format\": \"int64\"}, \"showCompleted\": {\"type\": \"boolean\", \"location\": \"query\"}, \"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"completedMax\": {\"type\": \"string\", \"location\": \"query\"}, \"showHidden\": {\"type\": \"boolean\", \"location\": \"query\"}, \"dueMin\": {\"type\": \"string\", \"location\": \"query\"}}, \"id\": \"tasks.tasks.list\", \"httpMethod\": \"GET\", \"path\": \"lists/{tasklist}/tasks\", \"response\": {\"$ref\": \"Tasks\"}}, \"update\": {\"scopes\": [\"https://www.googleapis.com/auth/tasks\"], \"parameters\": {\"tasklist\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"task\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Task\"}, \"response\": {\"$ref\": \"Task\"}, \"httpMethod\": \"PUT\", \"path\": \"lists/{tasklist}/tasks/{task}\", \"id\": \"tasks.tasks.update\"}, \"patch\": {\"scopes\": [\"https://www.googleapis.com/auth/tasks\"], \"parameters\": {\"tasklist\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"task\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Task\"}, \"response\": {\"$ref\": \"Task\"}, \"httpMethod\": \"PATCH\", \"path\": \"lists/{tasklist}/tasks/{task}\", \"id\": \"tasks.tasks.patch\"}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/tasks\"], \"path\": \"lists/{tasklist}/tasks/{task}\", \"id\": \"tasks.tasks.delete\", \"parameters\": {\"tasklist\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"task\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"httpMethod\": \"DELETE\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_TasksService.class,
                "tasklists",
                new Google_TasklistsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_TasksService.class, "serviceName"),
                        "tasklists",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/tasks\"], \"request\": {\"$ref\": \"TaskList\"}, \"response\": {\"$ref\": \"TaskList\"}, \"httpMethod\": \"POST\", \"path\": \"users/@me/lists\", \"id\": \"tasks.tasklists.insert\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/tasks\", \"https://www.googleapis.com/auth/tasks.readonly\"], \"parameters\": {\"tasklist\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"tasks.tasklists.get\", \"httpMethod\": \"GET\", \"path\": \"users/@me/lists/{tasklist}\", \"response\": {\"$ref\": \"TaskList\"}}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/tasks\", \"https://www.googleapis.com/auth/tasks.readonly\"], \"parameters\": {\"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"maxResults\": {\"type\": \"string\", \"location\": \"query\", \"format\": \"int64\"}}, \"response\": {\"$ref\": \"TaskLists\"}, \"httpMethod\": \"GET\", \"path\": \"users/@me/lists\", \"id\": \"tasks.tasklists.list\"}, \"update\": {\"scopes\": [\"https://www.googleapis.com/auth/tasks\"], \"parameters\": {\"tasklist\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"TaskList\"}, \"response\": {\"$ref\": \"TaskList\"}, \"httpMethod\": \"PUT\", \"path\": \"users/@me/lists/{tasklist}\", \"id\": \"tasks.tasklists.update\"}, \"patch\": {\"scopes\": [\"https://www.googleapis.com/auth/tasks\"], \"parameters\": {\"tasklist\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"TaskList\"}, \"response\": {\"$ref\": \"TaskList\"}, \"httpMethod\": \"PATCH\", \"path\": \"users/@me/lists/{tasklist}\", \"id\": \"tasks.tasklists.patch\"}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/tasks\"], \"path\": \"users/@me/lists/{tasklist}\", \"id\": \"tasks.tasklists.delete\", \"parameters\": {\"tasklist\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"httpMethod\": \"DELETE\"}}}",
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
