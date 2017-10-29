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

public class Google_Job extends Google_Model implements RuntimeFileContextInterface {

    public Object __statusType = "Google_JobStatus";

    public Object __statusDataType = "";

    public Object status = null;

    public Object kind = null;

    public Object __statisticsType = "Google_JobStatistics";

    public Object __statisticsDataType = "";

    public Object statistics = null;

    public Object __jobReferenceType = "Google_JobReference";

    public Object __jobReferenceDataType = "";

    public Object jobReference = null;

    public Object etag = null;

    public Object __configurationType = "Google_JobConfiguration";

    public Object __configurationDataType = "";

    public Object configuration = null;

    public Object id = null;

    public Object selfLink = null;

    public Google_Job(RuntimeEnv env, Object... args) {
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
            case "setStatus":
                return this.setStatus(env, args);
            case "getStatus":
                return this.getStatus(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setStatistics":
                return this.setStatistics(env, args);
            case "getStatistics":
                return this.getStatistics(env, args);
            case "setJobReference":
                return this.setJobReference(env, args);
            case "getJobReference":
                return this.getJobReference(env, args);
            case "setEtag":
                return this.setEtag(env, args);
            case "getEtag":
                return this.getEtag(env, args);
            case "setConfiguration":
                return this.setConfiguration(env, args);
            case "getConfiguration":
                return this.getConfiguration(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setSelfLink":
                return this.setSelfLink(env, args);
            case "getSelfLink":
                return this.getSelfLink(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__statusType":
                if (Google_Job.class.isAssignableFrom(caller)) {

                    return this.__statusType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__statusDataType":
                if (Google_Job.class.isAssignableFrom(caller)) {

                    return this.__statusDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "status":
                return this.status;
            case "kind":
                return this.kind;
            case "__statisticsType":
                if (Google_Job.class.isAssignableFrom(caller)) {

                    return this.__statisticsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__statisticsDataType":
                if (Google_Job.class.isAssignableFrom(caller)) {

                    return this.__statisticsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "statistics":
                return this.statistics;
            case "__jobReferenceType":
                if (Google_Job.class.isAssignableFrom(caller)) {

                    return this.__jobReferenceType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__jobReferenceDataType":
                if (Google_Job.class.isAssignableFrom(caller)) {

                    return this.__jobReferenceDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "jobReference":
                return this.jobReference;
            case "etag":
                return this.etag;
            case "__configurationType":
                if (Google_Job.class.isAssignableFrom(caller)) {

                    return this.__configurationType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__configurationDataType":
                if (Google_Job.class.isAssignableFrom(caller)) {

                    return this.__configurationDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "configuration":
                return this.configuration;
            case "id":
                return this.id;
            case "selfLink":
                return this.selfLink;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__statusType":
                if (Google_Job.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__statusType);
                }
                break;
            case "__statusDataType":
                if (Google_Job.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__statusDataType);
                }
                break;
            case "status":
                return ZVal.isNull(this.status);
            case "kind":
                return ZVal.isNull(this.kind);
            case "__statisticsType":
                if (Google_Job.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__statisticsType);
                }
                break;
            case "__statisticsDataType":
                if (Google_Job.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__statisticsDataType);
                }
                break;
            case "statistics":
                return ZVal.isNull(this.statistics);
            case "__jobReferenceType":
                if (Google_Job.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__jobReferenceType);
                }
                break;
            case "__jobReferenceDataType":
                if (Google_Job.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__jobReferenceDataType);
                }
                break;
            case "jobReference":
                return ZVal.isNull(this.jobReference);
            case "etag":
                return ZVal.isNull(this.etag);
            case "__configurationType":
                if (Google_Job.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__configurationType);
                }
                break;
            case "__configurationDataType":
                if (Google_Job.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__configurationDataType);
                }
                break;
            case "configuration":
                return ZVal.isNull(this.configuration);
            case "id":
                return ZVal.isNull(this.id);
            case "selfLink":
                return ZVal.isNull(this.selfLink);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__statusType":
                if (Google_Job.class.isAssignableFrom(caller)) {

                    this.__statusType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__statusDataType":
                if (Google_Job.class.isAssignableFrom(caller)) {

                    this.__statusDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "status":
                this.status = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "__statisticsType":
                if (Google_Job.class.isAssignableFrom(caller)) {

                    this.__statisticsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__statisticsDataType":
                if (Google_Job.class.isAssignableFrom(caller)) {

                    this.__statisticsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "statistics":
                this.statistics = value;
                break;
            case "__jobReferenceType":
                if (Google_Job.class.isAssignableFrom(caller)) {

                    this.__jobReferenceType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__jobReferenceDataType":
                if (Google_Job.class.isAssignableFrom(caller)) {

                    this.__jobReferenceDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "jobReference":
                this.jobReference = value;
                break;
            case "etag":
                this.etag = value;
                break;
            case "__configurationType":
                if (Google_Job.class.isAssignableFrom(caller)) {

                    this.__configurationType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__configurationDataType":
                if (Google_Job.class.isAssignableFrom(caller)) {

                    this.__configurationDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "configuration":
                this.configuration = value;
                break;
            case "id":
                this.id = value;
                break;
            case "selfLink":
                this.selfLink = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setStatus(RuntimeEnv env, Object... args) {
        Object status = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Job.class, "status", status);

        return null;
    }

    public Object getStatus(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Job.class, "status"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Job.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Job.class, "kind"));
    }

    public Object setStatistics(RuntimeEnv env, Object... args) {
        Object statistics = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Job.class, "statistics", statistics);

        return null;
    }

    public Object getStatistics(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Job.class, "statistics"));
    }

    public Object setJobReference(RuntimeEnv env, Object... args) {
        Object jobReference = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Job.class, "jobReference", jobReference);

        return null;
    }

    public Object getJobReference(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Job.class, "jobReference"));
    }

    public Object setEtag(RuntimeEnv env, Object... args) {
        Object etag = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Job.class, "etag", etag);

        return null;
    }

    public Object getEtag(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Job.class, "etag"));
    }

    public Object setConfiguration(RuntimeEnv env, Object... args) {
        Object configuration = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Job.class, "configuration", configuration);

        return null;
    }

    public Object getConfiguration(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Job.class, "configuration"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Job.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Job.class, "id"));
    }

    public Object setSelfLink(RuntimeEnv env, Object... args) {
        Object selfLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Job.class, "selfLink", selfLink);

        return null;
    }

    public Object getSelfLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Job.class, "selfLink"));
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
