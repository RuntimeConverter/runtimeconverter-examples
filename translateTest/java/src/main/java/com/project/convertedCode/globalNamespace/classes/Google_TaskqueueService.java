package com.project.convertedCode.globalNamespace.classes;

import com.project.convertedCode.globalNamespace.classes.Google_TaskqueuesServiceResource;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.classes.Google_TasksServiceResource;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Google_Service;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_TaskqueueService.php

*/

public class Google_TaskqueueService extends Google_Service implements RuntimeFileContextInterface {

    public Object taskqueues = null;

    public Object tasks = null;

    public Google_TaskqueueService(RuntimeEnv env, Object... args) {
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
            case "taskqueues":
                return this.taskqueues;
            case "tasks":
                return this.tasks;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "taskqueues":
                return ZVal.isNull(this.taskqueues);
            case "tasks":
                return ZVal.isNull(this.tasks);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "taskqueues":
                this.taskqueues = value;
                break;
            case "tasks":
                this.tasks = value;
                break;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object client = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_TaskqueueService.class, "servicePath", "taskqueue/v1beta2/projects/");
        ZVal.setProperty(this, Google_TaskqueueService.class, "version", "v1beta2");
        ZVal.setProperty(this, Google_TaskqueueService.class, "serviceName", "taskqueue");
        env.callMethod(
                client,
                "addService",
                Google_TaskqueueService.class,
                ZVal.getProperty(this, Google_TaskqueueService.class, "serviceName"),
                ZVal.getProperty(this, Google_TaskqueueService.class, "version"));
        ZVal.setProperty(
                this,
                Google_TaskqueueService.class,
                "taskqueues",
                new Google_TaskqueuesServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_TaskqueueService.class, "serviceName"),
                        "taskqueues",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"get\": {\"scopes\": [\"https://www.googleapis.com/auth/taskqueue\", \"https://www.googleapis.com/auth/taskqueue.consumer\"], \"parameters\": {\"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"taskqueue\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"getStats\": {\"type\": \"boolean\", \"location\": \"query\"}}, \"id\": \"taskqueue.taskqueues.get\", \"httpMethod\": \"GET\", \"path\": \"{project}/taskqueues/{taskqueue}\", \"response\": {\"$ref\": \"TaskQueue\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_TaskqueueService.class,
                "tasks",
                new Google_TasksServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_TaskqueueService.class, "serviceName"),
                        "tasks",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/taskqueue\", \"https://www.googleapis.com/auth/taskqueue.consumer\"], \"parameters\": {\"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"taskqueue\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Task\"}, \"response\": {\"$ref\": \"Task\"}, \"httpMethod\": \"POST\", \"path\": \"{project}/taskqueues/{taskqueue}/tasks\", \"id\": \"taskqueue.tasks.insert\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/taskqueue\", \"https://www.googleapis.com/auth/taskqueue.consumer\"], \"parameters\": {\"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"taskqueue\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"task\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"taskqueue.tasks.get\", \"httpMethod\": \"GET\", \"path\": \"{project}/taskqueues/{taskqueue}/tasks/{task}\", \"response\": {\"$ref\": \"Task\"}}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/taskqueue\", \"https://www.googleapis.com/auth/taskqueue.consumer\"], \"parameters\": {\"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"taskqueue\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"taskqueue.tasks.list\", \"httpMethod\": \"GET\", \"path\": \"{project}/taskqueues/{taskqueue}/tasks\", \"response\": {\"$ref\": \"Tasks2\"}}, \"update\": {\"scopes\": [\"https://www.googleapis.com/auth/taskqueue\", \"https://www.googleapis.com/auth/taskqueue.consumer\"], \"parameters\": {\"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"taskqueue\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"task\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"newLeaseSeconds\": {\"required\": true, \"type\": \"integer\", \"location\": \"query\", \"format\": \"int32\"}}, \"request\": {\"$ref\": \"Task\"}, \"response\": {\"$ref\": \"Task\"}, \"httpMethod\": \"POST\", \"path\": \"{project}/taskqueues/{taskqueue}/tasks/{task}\", \"id\": \"taskqueue.tasks.update\"}, \"patch\": {\"scopes\": [\"https://www.googleapis.com/auth/taskqueue\", \"https://www.googleapis.com/auth/taskqueue.consumer\"], \"parameters\": {\"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"taskqueue\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"task\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"newLeaseSeconds\": {\"required\": true, \"type\": \"integer\", \"location\": \"query\", \"format\": \"int32\"}}, \"request\": {\"$ref\": \"Task\"}, \"response\": {\"$ref\": \"Task\"}, \"httpMethod\": \"PATCH\", \"path\": \"{project}/taskqueues/{taskqueue}/tasks/{task}\", \"id\": \"taskqueue.tasks.patch\"}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/taskqueue\", \"https://www.googleapis.com/auth/taskqueue.consumer\"], \"path\": \"{project}/taskqueues/{taskqueue}/tasks/{task}\", \"id\": \"taskqueue.tasks.delete\", \"parameters\": {\"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"taskqueue\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"task\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"httpMethod\": \"DELETE\"}, \"lease\": {\"scopes\": [\"https://www.googleapis.com/auth/taskqueue\", \"https://www.googleapis.com/auth/taskqueue.consumer\"], \"parameters\": {\"groupByTag\": {\"type\": \"boolean\", \"location\": \"query\"}, \"leaseSecs\": {\"required\": true, \"type\": \"integer\", \"location\": \"query\", \"format\": \"int32\"}, \"project\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"taskqueue\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"tag\": {\"type\": \"string\", \"location\": \"query\"}, \"numTasks\": {\"required\": true, \"type\": \"integer\", \"location\": \"query\", \"format\": \"int32\"}}, \"id\": \"taskqueue.tasks.lease\", \"httpMethod\": \"POST\", \"path\": \"{project}/taskqueues/{taskqueue}/tasks/lease\", \"response\": {\"$ref\": \"Tasks\"}}}}",
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
