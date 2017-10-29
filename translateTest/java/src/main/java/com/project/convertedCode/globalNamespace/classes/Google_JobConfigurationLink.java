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

 google-api-php-client/src/contrib/Google_BigqueryService.php

*/

public class Google_JobConfigurationLink extends Google_Model
        implements RuntimeFileContextInterface {

    public Object createDisposition = null;

    public Object writeDisposition = null;

    public Object __destinationTableType = "Google_TableReference";

    public Object __destinationTableDataType = "";

    public Object destinationTable = null;

    public Object sourceUri = null;

    public Google_JobConfigurationLink(RuntimeEnv env, Object... args) {
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
            case "setCreateDisposition":
                return this.setCreateDisposition(env, args);
            case "getCreateDisposition":
                return this.getCreateDisposition(env, args);
            case "setWriteDisposition":
                return this.setWriteDisposition(env, args);
            case "getWriteDisposition":
                return this.getWriteDisposition(env, args);
            case "setDestinationTable":
                return this.setDestinationTable(env, args);
            case "getDestinationTable":
                return this.getDestinationTable(env, args);
            case "setSourceUri":
                return this.setSourceUri(env, args);
            case "getSourceUri":
                return this.getSourceUri(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "createDisposition":
                return this.createDisposition;
            case "writeDisposition":
                return this.writeDisposition;
            case "__destinationTableType":
                if (Google_JobConfigurationLink.class.isAssignableFrom(caller)) {

                    return this.__destinationTableType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__destinationTableDataType":
                if (Google_JobConfigurationLink.class.isAssignableFrom(caller)) {

                    return this.__destinationTableDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "destinationTable":
                return this.destinationTable;
            case "sourceUri":
                return this.sourceUri;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "createDisposition":
                return ZVal.isNull(this.createDisposition);
            case "writeDisposition":
                return ZVal.isNull(this.writeDisposition);
            case "__destinationTableType":
                if (Google_JobConfigurationLink.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__destinationTableType);
                }
                break;
            case "__destinationTableDataType":
                if (Google_JobConfigurationLink.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__destinationTableDataType);
                }
                break;
            case "destinationTable":
                return ZVal.isNull(this.destinationTable);
            case "sourceUri":
                return ZVal.isNull(this.sourceUri);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "createDisposition":
                this.createDisposition = value;
                break;
            case "writeDisposition":
                this.writeDisposition = value;
                break;
            case "__destinationTableType":
                if (Google_JobConfigurationLink.class.isAssignableFrom(caller)) {

                    this.__destinationTableType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__destinationTableDataType":
                if (Google_JobConfigurationLink.class.isAssignableFrom(caller)) {

                    this.__destinationTableDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "destinationTable":
                this.destinationTable = value;
                break;
            case "sourceUri":
                this.sourceUri = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setCreateDisposition(RuntimeEnv env, Object... args) {
        Object createDisposition = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_JobConfigurationLink.class, "createDisposition", createDisposition);

        return null;
    }

    public Object getCreateDisposition(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_JobConfigurationLink.class, "createDisposition"));
    }

    public Object setWriteDisposition(RuntimeEnv env, Object... args) {
        Object writeDisposition = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_JobConfigurationLink.class, "writeDisposition", writeDisposition);

        return null;
    }

    public Object getWriteDisposition(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_JobConfigurationLink.class, "writeDisposition"));
    }

    public Object setDestinationTable(RuntimeEnv env, Object... args) {
        Object destinationTable = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_JobConfigurationLink.class, "destinationTable", destinationTable);

        return null;
    }

    public Object getDestinationTable(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_JobConfigurationLink.class, "destinationTable"));
    }

    public Object setSourceUri(RuntimeEnv env, Object... args) {
        Object sourceUri = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_JobConfigurationLink.class,
                sourceUri,
                "Google_string",
                "setSourceUri");
        ZVal.setProperty(this, Google_JobConfigurationLink.class, "sourceUri", sourceUri);

        return null;
    }

    public Object getSourceUri(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_JobConfigurationLink.class, "sourceUri"));
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
