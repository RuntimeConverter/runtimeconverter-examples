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

public class Google_JobConfiguration extends Google_Model implements RuntimeFileContextInterface {

    public Object __loadType = "Google_JobConfigurationLoad";

    public Object __loadDataType = "";

    public Object load = null;

    public Object __linkType = "Google_JobConfigurationLink";

    public Object __linkDataType = "";

    public Object link = null;

    public Object __queryType = "Google_JobConfigurationQuery";

    public Object __queryDataType = "";

    public Object query = null;

    public Object __copyType = "Google_JobConfigurationTableCopy";

    public Object __copyDataType = "";

    public Object copy = null;

    public Object __extractType = "Google_JobConfigurationExtract";

    public Object __extractDataType = "";

    public Object extract = null;

    public Object properties = null;

    public Google_JobConfiguration(RuntimeEnv env, Object... args) {
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
            case "setLoad":
                return this.setLoad(env, args);
            case "getLoad":
                return this.getLoad(env, args);
            case "setLink":
                return this.setLink(env, args);
            case "getLink":
                return this.getLink(env, args);
            case "setQuery":
                return this.setQuery(env, args);
            case "getQuery":
                return this.getQuery(env, args);
            case "setCopy":
                return this.setCopy(env, args);
            case "getCopy":
                return this.getCopy(env, args);
            case "setExtract":
                return this.setExtract(env, args);
            case "getExtract":
                return this.getExtract(env, args);
            case "setProperties":
                return this.setProperties(env, args);
            case "getProperties":
                return this.getProperties(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__loadType":
                if (Google_JobConfiguration.class.isAssignableFrom(caller)) {

                    return this.__loadType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__loadDataType":
                if (Google_JobConfiguration.class.isAssignableFrom(caller)) {

                    return this.__loadDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "load":
                return this.load;
            case "__linkType":
                if (Google_JobConfiguration.class.isAssignableFrom(caller)) {

                    return this.__linkType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__linkDataType":
                if (Google_JobConfiguration.class.isAssignableFrom(caller)) {

                    return this.__linkDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "link":
                return this.link;
            case "__queryType":
                if (Google_JobConfiguration.class.isAssignableFrom(caller)) {

                    return this.__queryType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__queryDataType":
                if (Google_JobConfiguration.class.isAssignableFrom(caller)) {

                    return this.__queryDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "query":
                return this.query;
            case "__copyType":
                if (Google_JobConfiguration.class.isAssignableFrom(caller)) {

                    return this.__copyType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__copyDataType":
                if (Google_JobConfiguration.class.isAssignableFrom(caller)) {

                    return this.__copyDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "copy":
                return this.copy;
            case "__extractType":
                if (Google_JobConfiguration.class.isAssignableFrom(caller)) {

                    return this.__extractType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__extractDataType":
                if (Google_JobConfiguration.class.isAssignableFrom(caller)) {

                    return this.__extractDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "extract":
                return this.extract;
            case "properties":
                return this.properties;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__loadType":
                if (Google_JobConfiguration.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__loadType);
                }
                break;
            case "__loadDataType":
                if (Google_JobConfiguration.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__loadDataType);
                }
                break;
            case "load":
                return ZVal.isNull(this.load);
            case "__linkType":
                if (Google_JobConfiguration.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__linkType);
                }
                break;
            case "__linkDataType":
                if (Google_JobConfiguration.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__linkDataType);
                }
                break;
            case "link":
                return ZVal.isNull(this.link);
            case "__queryType":
                if (Google_JobConfiguration.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__queryType);
                }
                break;
            case "__queryDataType":
                if (Google_JobConfiguration.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__queryDataType);
                }
                break;
            case "query":
                return ZVal.isNull(this.query);
            case "__copyType":
                if (Google_JobConfiguration.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__copyType);
                }
                break;
            case "__copyDataType":
                if (Google_JobConfiguration.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__copyDataType);
                }
                break;
            case "copy":
                return ZVal.isNull(this.copy);
            case "__extractType":
                if (Google_JobConfiguration.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__extractType);
                }
                break;
            case "__extractDataType":
                if (Google_JobConfiguration.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__extractDataType);
                }
                break;
            case "extract":
                return ZVal.isNull(this.extract);
            case "properties":
                return ZVal.isNull(this.properties);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__loadType":
                if (Google_JobConfiguration.class.isAssignableFrom(caller)) {

                    this.__loadType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__loadDataType":
                if (Google_JobConfiguration.class.isAssignableFrom(caller)) {

                    this.__loadDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "load":
                this.load = value;
                break;
            case "__linkType":
                if (Google_JobConfiguration.class.isAssignableFrom(caller)) {

                    this.__linkType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__linkDataType":
                if (Google_JobConfiguration.class.isAssignableFrom(caller)) {

                    this.__linkDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "link":
                this.link = value;
                break;
            case "__queryType":
                if (Google_JobConfiguration.class.isAssignableFrom(caller)) {

                    this.__queryType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__queryDataType":
                if (Google_JobConfiguration.class.isAssignableFrom(caller)) {

                    this.__queryDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "query":
                this.query = value;
                break;
            case "__copyType":
                if (Google_JobConfiguration.class.isAssignableFrom(caller)) {

                    this.__copyType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__copyDataType":
                if (Google_JobConfiguration.class.isAssignableFrom(caller)) {

                    this.__copyDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "copy":
                this.copy = value;
                break;
            case "__extractType":
                if (Google_JobConfiguration.class.isAssignableFrom(caller)) {

                    this.__extractType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__extractDataType":
                if (Google_JobConfiguration.class.isAssignableFrom(caller)) {

                    this.__extractDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "extract":
                this.extract = value;
                break;
            case "properties":
                this.properties = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setLoad(RuntimeEnv env, Object... args) {
        Object load = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_JobConfiguration.class, "load", load);

        return null;
    }

    public Object getLoad(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_JobConfiguration.class, "load"));
    }

    public Object setLink(RuntimeEnv env, Object... args) {
        Object link = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_JobConfiguration.class, "link", link);

        return null;
    }

    public Object getLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_JobConfiguration.class, "link"));
    }

    public Object setQuery(RuntimeEnv env, Object... args) {
        Object query = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_JobConfiguration.class, "query", query);

        return null;
    }

    public Object getQuery(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_JobConfiguration.class, "query"));
    }

    public Object setCopy(RuntimeEnv env, Object... args) {
        Object copy = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_JobConfiguration.class, "copy", copy);

        return null;
    }

    public Object getCopy(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_JobConfiguration.class, "copy"));
    }

    public Object setExtract(RuntimeEnv env, Object... args) {
        Object extract = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_JobConfiguration.class, "extract", extract);

        return null;
    }

    public Object getExtract(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_JobConfiguration.class, "extract"));
    }

    public Object setProperties(RuntimeEnv env, Object... args) {
        Object properties = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_JobConfiguration.class, "properties", properties);

        return null;
    }

    public Object getProperties(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_JobConfiguration.class, "properties"));
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
