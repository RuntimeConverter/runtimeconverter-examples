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

public class Google_TaskQueueAcl extends Google_Model implements RuntimeFileContextInterface {

    public Object consumerEmails = null;

    public Object producerEmails = null;

    public Object adminEmails = null;

    public Google_TaskQueueAcl(RuntimeEnv env, Object... args) {
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
            case "setConsumerEmails":
                return this.setConsumerEmails(env, args);
            case "getConsumerEmails":
                return this.getConsumerEmails(env, args);
            case "setProducerEmails":
                return this.setProducerEmails(env, args);
            case "getProducerEmails":
                return this.getProducerEmails(env, args);
            case "setAdminEmails":
                return this.setAdminEmails(env, args);
            case "getAdminEmails":
                return this.getAdminEmails(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "consumerEmails":
                return this.consumerEmails;
            case "producerEmails":
                return this.producerEmails;
            case "adminEmails":
                return this.adminEmails;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "consumerEmails":
                return ZVal.isNull(this.consumerEmails);
            case "producerEmails":
                return ZVal.isNull(this.producerEmails);
            case "adminEmails":
                return ZVal.isNull(this.adminEmails);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "consumerEmails":
                this.consumerEmails = value;
                break;
            case "producerEmails":
                this.producerEmails = value;
                break;
            case "adminEmails":
                this.adminEmails = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setConsumerEmails(RuntimeEnv env, Object... args) {
        Object consumerEmails = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_TaskQueueAcl.class,
                consumerEmails,
                "Google_string",
                "setConsumerEmails");
        ZVal.setProperty(this, Google_TaskQueueAcl.class, "consumerEmails", consumerEmails);

        return null;
    }

    public Object getConsumerEmails(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_TaskQueueAcl.class, "consumerEmails"));
    }

    public Object setProducerEmails(RuntimeEnv env, Object... args) {
        Object producerEmails = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_TaskQueueAcl.class,
                producerEmails,
                "Google_string",
                "setProducerEmails");
        ZVal.setProperty(this, Google_TaskQueueAcl.class, "producerEmails", producerEmails);

        return null;
    }

    public Object getProducerEmails(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_TaskQueueAcl.class, "producerEmails"));
    }

    public Object setAdminEmails(RuntimeEnv env, Object... args) {
        Object adminEmails = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_TaskQueueAcl.class,
                adminEmails,
                "Google_string",
                "setAdminEmails");
        ZVal.setProperty(this, Google_TaskQueueAcl.class, "adminEmails", adminEmails);

        return null;
    }

    public Object getAdminEmails(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_TaskQueueAcl.class, "adminEmails"));
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
