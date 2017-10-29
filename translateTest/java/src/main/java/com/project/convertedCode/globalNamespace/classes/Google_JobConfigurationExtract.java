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

public class Google_JobConfigurationExtract extends Google_Model
        implements RuntimeFileContextInterface {

    public Object destinationUri = null;

    public Object fieldDelimiter = null;

    public Object __sourceTableType = "Google_TableReference";

    public Object __sourceTableDataType = "";

    public Object sourceTable = null;

    public Object printHeader = null;

    public Google_JobConfigurationExtract(RuntimeEnv env, Object... args) {
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
            case "setDestinationUri":
                return this.setDestinationUri(env, args);
            case "getDestinationUri":
                return this.getDestinationUri(env, args);
            case "setFieldDelimiter":
                return this.setFieldDelimiter(env, args);
            case "getFieldDelimiter":
                return this.getFieldDelimiter(env, args);
            case "setSourceTable":
                return this.setSourceTable(env, args);
            case "getSourceTable":
                return this.getSourceTable(env, args);
            case "setPrintHeader":
                return this.setPrintHeader(env, args);
            case "getPrintHeader":
                return this.getPrintHeader(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "destinationUri":
                return this.destinationUri;
            case "fieldDelimiter":
                return this.fieldDelimiter;
            case "__sourceTableType":
                if (Google_JobConfigurationExtract.class.isAssignableFrom(caller)) {

                    return this.__sourceTableType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__sourceTableDataType":
                if (Google_JobConfigurationExtract.class.isAssignableFrom(caller)) {

                    return this.__sourceTableDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "sourceTable":
                return this.sourceTable;
            case "printHeader":
                return this.printHeader;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "destinationUri":
                return ZVal.isNull(this.destinationUri);
            case "fieldDelimiter":
                return ZVal.isNull(this.fieldDelimiter);
            case "__sourceTableType":
                if (Google_JobConfigurationExtract.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__sourceTableType);
                }
                break;
            case "__sourceTableDataType":
                if (Google_JobConfigurationExtract.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__sourceTableDataType);
                }
                break;
            case "sourceTable":
                return ZVal.isNull(this.sourceTable);
            case "printHeader":
                return ZVal.isNull(this.printHeader);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "destinationUri":
                this.destinationUri = value;
                break;
            case "fieldDelimiter":
                this.fieldDelimiter = value;
                break;
            case "__sourceTableType":
                if (Google_JobConfigurationExtract.class.isAssignableFrom(caller)) {

                    this.__sourceTableType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__sourceTableDataType":
                if (Google_JobConfigurationExtract.class.isAssignableFrom(caller)) {

                    this.__sourceTableDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "sourceTable":
                this.sourceTable = value;
                break;
            case "printHeader":
                this.printHeader = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setDestinationUri(RuntimeEnv env, Object... args) {
        Object destinationUri = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_JobConfigurationExtract.class, "destinationUri", destinationUri);

        return null;
    }

    public Object getDestinationUri(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_JobConfigurationExtract.class, "destinationUri"));
    }

    public Object setFieldDelimiter(RuntimeEnv env, Object... args) {
        Object fieldDelimiter = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_JobConfigurationExtract.class, "fieldDelimiter", fieldDelimiter);

        return null;
    }

    public Object getFieldDelimiter(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_JobConfigurationExtract.class, "fieldDelimiter"));
    }

    public Object setSourceTable(RuntimeEnv env, Object... args) {
        Object sourceTable = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_JobConfigurationExtract.class, "sourceTable", sourceTable);

        return null;
    }

    public Object getSourceTable(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_JobConfigurationExtract.class, "sourceTable"));
    }

    public Object setPrintHeader(RuntimeEnv env, Object... args) {
        Object printHeader = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_JobConfigurationExtract.class, "printHeader", printHeader);

        return null;
    }

    public Object getPrintHeader(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_JobConfigurationExtract.class, "printHeader"));
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
