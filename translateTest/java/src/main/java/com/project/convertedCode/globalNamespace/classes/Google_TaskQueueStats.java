package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Google_Model;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_TaskqueueService.php

*/

public class Google_TaskQueueStats extends Google_Model implements RuntimeFileContextInterface {

    public Object oldestTask = null;

    public Object leasedLastMinute = null;

    public Object totalTasks = null;

    public Object leasedLastHour = null;

    public Google_TaskQueueStats(RuntimeEnv env, Object... args) {
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
            case "setOldestTask":
                return this.setOldestTask(env, args);
            case "getOldestTask":
                return this.getOldestTask(env, args);
            case "setLeasedLastMinute":
                return this.setLeasedLastMinute(env, args);
            case "getLeasedLastMinute":
                return this.getLeasedLastMinute(env, args);
            case "setTotalTasks":
                return this.setTotalTasks(env, args);
            case "getTotalTasks":
                return this.getTotalTasks(env, args);
            case "setLeasedLastHour":
                return this.setLeasedLastHour(env, args);
            case "getLeasedLastHour":
                return this.getLeasedLastHour(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "oldestTask":
                return this.oldestTask;
            case "leasedLastMinute":
                return this.leasedLastMinute;
            case "totalTasks":
                return this.totalTasks;
            case "leasedLastHour":
                return this.leasedLastHour;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "oldestTask":
                return ZVal.isNull(this.oldestTask);
            case "leasedLastMinute":
                return ZVal.isNull(this.leasedLastMinute);
            case "totalTasks":
                return ZVal.isNull(this.totalTasks);
            case "leasedLastHour":
                return ZVal.isNull(this.leasedLastHour);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "oldestTask":
                this.oldestTask = value;
                break;
            case "leasedLastMinute":
                this.leasedLastMinute = value;
                break;
            case "totalTasks":
                this.totalTasks = value;
                break;
            case "leasedLastHour":
                this.leasedLastHour = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setOldestTask(RuntimeEnv env, Object... args) {
        Object oldestTask = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_TaskQueueStats.class, "oldestTask", oldestTask);

        return null;
    }

    public Object getOldestTask(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_TaskQueueStats.class, "oldestTask"));
    }

    public Object setLeasedLastMinute(RuntimeEnv env, Object... args) {
        Object leasedLastMinute = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_TaskQueueStats.class, "leasedLastMinute", leasedLastMinute);

        return null;
    }

    public Object getLeasedLastMinute(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_TaskQueueStats.class, "leasedLastMinute"));
    }

    public Object setTotalTasks(RuntimeEnv env, Object... args) {
        Object totalTasks = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_TaskQueueStats.class, "totalTasks", totalTasks);

        return null;
    }

    public Object getTotalTasks(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_TaskQueueStats.class, "totalTasks"));
    }

    public Object setLeasedLastHour(RuntimeEnv env, Object... args) {
        Object leasedLastHour = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_TaskQueueStats.class, "leasedLastHour", leasedLastHour);

        return null;
    }

    public Object getLeasedLastHour(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_TaskQueueStats.class, "leasedLastHour"));
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
