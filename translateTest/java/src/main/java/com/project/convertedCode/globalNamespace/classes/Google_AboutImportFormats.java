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

 google-api-php-client/src/contrib/Google_DriveService.php

*/

public class Google_AboutImportFormats extends Google_Model implements RuntimeFileContextInterface {

    public Object source = null;

    public Object targets = null;

    public Google_AboutImportFormats(RuntimeEnv env, Object... args) {
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
            case "setSource":
                return this.setSource(env, args);
            case "getSource":
                return this.getSource(env, args);
            case "setTargets":
                return this.setTargets(env, args);
            case "getTargets":
                return this.getTargets(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "source":
                return this.source;
            case "targets":
                return this.targets;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "source":
                return ZVal.isNull(this.source);
            case "targets":
                return ZVal.isNull(this.targets);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "source":
                this.source = value;
                break;
            case "targets":
                this.targets = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setSource(RuntimeEnv env, Object... args) {
        Object source = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AboutImportFormats.class, "source", source);

        return null;
    }

    public Object getSource(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AboutImportFormats.class, "source"));
    }

    public Object setTargets(RuntimeEnv env, Object... args) {
        Object targets = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_AboutImportFormats.class,
                targets,
                "Google_string",
                "setTargets");
        ZVal.setProperty(this, Google_AboutImportFormats.class, "targets", targets);

        return null;
    }

    public Object getTargets(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AboutImportFormats.class, "targets"));
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
