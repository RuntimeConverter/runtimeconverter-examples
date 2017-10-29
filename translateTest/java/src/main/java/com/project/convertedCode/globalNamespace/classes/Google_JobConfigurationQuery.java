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

public class Google_JobConfigurationQuery extends Google_Model
        implements RuntimeFileContextInterface {

    public Object __defaultDatasetType = "Google_DatasetReference";

    public Object __defaultDatasetDataType = "";

    public Object defaultDataset = null;

    public Object __destinationTableType = "Google_TableReference";

    public Object __destinationTableDataType = "";

    public Object destinationTable = null;

    public Object priority = null;

    public Object writeDisposition = null;

    public Object createDisposition = null;

    public Object query = null;

    public Google_JobConfigurationQuery(RuntimeEnv env, Object... args) {
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
            case "setDefaultDataset":
                return this.setDefaultDataset(env, args);
            case "getDefaultDataset":
                return this.getDefaultDataset(env, args);
            case "setDestinationTable":
                return this.setDestinationTable(env, args);
            case "getDestinationTable":
                return this.getDestinationTable(env, args);
            case "setPriority":
                return this.setPriority(env, args);
            case "getPriority":
                return this.getPriority(env, args);
            case "setWriteDisposition":
                return this.setWriteDisposition(env, args);
            case "getWriteDisposition":
                return this.getWriteDisposition(env, args);
            case "setCreateDisposition":
                return this.setCreateDisposition(env, args);
            case "getCreateDisposition":
                return this.getCreateDisposition(env, args);
            case "setQuery":
                return this.setQuery(env, args);
            case "getQuery":
                return this.getQuery(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__defaultDatasetType":
                if (Google_JobConfigurationQuery.class.isAssignableFrom(caller)) {

                    return this.__defaultDatasetType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__defaultDatasetDataType":
                if (Google_JobConfigurationQuery.class.isAssignableFrom(caller)) {

                    return this.__defaultDatasetDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "defaultDataset":
                return this.defaultDataset;
            case "__destinationTableType":
                if (Google_JobConfigurationQuery.class.isAssignableFrom(caller)) {

                    return this.__destinationTableType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__destinationTableDataType":
                if (Google_JobConfigurationQuery.class.isAssignableFrom(caller)) {

                    return this.__destinationTableDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "destinationTable":
                return this.destinationTable;
            case "priority":
                return this.priority;
            case "writeDisposition":
                return this.writeDisposition;
            case "createDisposition":
                return this.createDisposition;
            case "query":
                return this.query;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__defaultDatasetType":
                if (Google_JobConfigurationQuery.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__defaultDatasetType);
                }
                break;
            case "__defaultDatasetDataType":
                if (Google_JobConfigurationQuery.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__defaultDatasetDataType);
                }
                break;
            case "defaultDataset":
                return ZVal.isNull(this.defaultDataset);
            case "__destinationTableType":
                if (Google_JobConfigurationQuery.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__destinationTableType);
                }
                break;
            case "__destinationTableDataType":
                if (Google_JobConfigurationQuery.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__destinationTableDataType);
                }
                break;
            case "destinationTable":
                return ZVal.isNull(this.destinationTable);
            case "priority":
                return ZVal.isNull(this.priority);
            case "writeDisposition":
                return ZVal.isNull(this.writeDisposition);
            case "createDisposition":
                return ZVal.isNull(this.createDisposition);
            case "query":
                return ZVal.isNull(this.query);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__defaultDatasetType":
                if (Google_JobConfigurationQuery.class.isAssignableFrom(caller)) {

                    this.__defaultDatasetType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__defaultDatasetDataType":
                if (Google_JobConfigurationQuery.class.isAssignableFrom(caller)) {

                    this.__defaultDatasetDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "defaultDataset":
                this.defaultDataset = value;
                break;
            case "__destinationTableType":
                if (Google_JobConfigurationQuery.class.isAssignableFrom(caller)) {

                    this.__destinationTableType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__destinationTableDataType":
                if (Google_JobConfigurationQuery.class.isAssignableFrom(caller)) {

                    this.__destinationTableDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "destinationTable":
                this.destinationTable = value;
                break;
            case "priority":
                this.priority = value;
                break;
            case "writeDisposition":
                this.writeDisposition = value;
                break;
            case "createDisposition":
                this.createDisposition = value;
                break;
            case "query":
                this.query = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setDefaultDataset(RuntimeEnv env, Object... args) {
        Object defaultDataset = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_JobConfigurationQuery.class, "defaultDataset", defaultDataset);

        return null;
    }

    public Object getDefaultDataset(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_JobConfigurationQuery.class, "defaultDataset"));
    }

    public Object setDestinationTable(RuntimeEnv env, Object... args) {
        Object destinationTable = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_JobConfigurationQuery.class, "destinationTable", destinationTable);

        return null;
    }

    public Object getDestinationTable(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_JobConfigurationQuery.class, "destinationTable"));
    }

    public Object setPriority(RuntimeEnv env, Object... args) {
        Object priority = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_JobConfigurationQuery.class, "priority", priority);

        return null;
    }

    public Object getPriority(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_JobConfigurationQuery.class, "priority"));
    }

    public Object setWriteDisposition(RuntimeEnv env, Object... args) {
        Object writeDisposition = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_JobConfigurationQuery.class, "writeDisposition", writeDisposition);

        return null;
    }

    public Object getWriteDisposition(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_JobConfigurationQuery.class, "writeDisposition"));
    }

    public Object setCreateDisposition(RuntimeEnv env, Object... args) {
        Object createDisposition = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_JobConfigurationQuery.class, "createDisposition", createDisposition);

        return null;
    }

    public Object getCreateDisposition(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_JobConfigurationQuery.class, "createDisposition"));
    }

    public Object setQuery(RuntimeEnv env, Object... args) {
        Object query = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_JobConfigurationQuery.class, "query", query);

        return null;
    }

    public Object getQuery(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_JobConfigurationQuery.class, "query"));
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
