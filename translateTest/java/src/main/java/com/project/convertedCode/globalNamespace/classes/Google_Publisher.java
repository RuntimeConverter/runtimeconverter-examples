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

 google-api-php-client/src/contrib/Google_GanService.php

*/

public class Google_Publisher extends Google_Model implements RuntimeFileContextInterface {

    public Object status = null;

    public Object kind = null;

    public Object name = null;

    public Object classification = null;

    public Object __epcSevenDayAverageType = "Google_Money";

    public Object __epcSevenDayAverageDataType = "";

    public Object epcSevenDayAverage = null;

    public Object payoutRank = null;

    public Object __epcNinetyDayAverageType = "Google_Money";

    public Object __epcNinetyDayAverageDataType = "";

    public Object epcNinetyDayAverage = null;

    public Object __itemType = "Google_Publisher";

    public Object __itemDataType = "";

    public Object item = null;

    public Object joinDate = null;

    public Object sites = null;

    public Object id = null;

    public Google_Publisher(RuntimeEnv env, Object... args) {
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
            case "setName":
                return this.setName(env, args);
            case "getName":
                return this.getName(env, args);
            case "setClassification":
                return this.setClassification(env, args);
            case "getClassification":
                return this.getClassification(env, args);
            case "setEpcSevenDayAverage":
                return this.setEpcSevenDayAverage(env, args);
            case "getEpcSevenDayAverage":
                return this.getEpcSevenDayAverage(env, args);
            case "setPayoutRank":
                return this.setPayoutRank(env, args);
            case "getPayoutRank":
                return this.getPayoutRank(env, args);
            case "setEpcNinetyDayAverage":
                return this.setEpcNinetyDayAverage(env, args);
            case "getEpcNinetyDayAverage":
                return this.getEpcNinetyDayAverage(env, args);
            case "setItem":
                return this.setItem(env, args);
            case "getItem":
                return this.getItem(env, args);
            case "setJoinDate":
                return this.setJoinDate(env, args);
            case "getJoinDate":
                return this.getJoinDate(env, args);
            case "setSites":
                return this.setSites(env, args);
            case "getSites":
                return this.getSites(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "status":
                return this.status;
            case "kind":
                return this.kind;
            case "name":
                return this.name;
            case "classification":
                return this.classification;
            case "__epcSevenDayAverageType":
                if (Google_Publisher.class.isAssignableFrom(caller)) {

                    return this.__epcSevenDayAverageType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__epcSevenDayAverageDataType":
                if (Google_Publisher.class.isAssignableFrom(caller)) {

                    return this.__epcSevenDayAverageDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "epcSevenDayAverage":
                return this.epcSevenDayAverage;
            case "payoutRank":
                return this.payoutRank;
            case "__epcNinetyDayAverageType":
                if (Google_Publisher.class.isAssignableFrom(caller)) {

                    return this.__epcNinetyDayAverageType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__epcNinetyDayAverageDataType":
                if (Google_Publisher.class.isAssignableFrom(caller)) {

                    return this.__epcNinetyDayAverageDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "epcNinetyDayAverage":
                return this.epcNinetyDayAverage;
            case "__itemType":
                if (Google_Publisher.class.isAssignableFrom(caller)) {

                    return this.__itemType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__itemDataType":
                if (Google_Publisher.class.isAssignableFrom(caller)) {

                    return this.__itemDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "item":
                return this.item;
            case "joinDate":
                return this.joinDate;
            case "sites":
                return this.sites;
            case "id":
                return this.id;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "status":
                return ZVal.isNull(this.status);
            case "kind":
                return ZVal.isNull(this.kind);
            case "name":
                return ZVal.isNull(this.name);
            case "classification":
                return ZVal.isNull(this.classification);
            case "__epcSevenDayAverageType":
                if (Google_Publisher.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__epcSevenDayAverageType);
                }
                break;
            case "__epcSevenDayAverageDataType":
                if (Google_Publisher.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__epcSevenDayAverageDataType);
                }
                break;
            case "epcSevenDayAverage":
                return ZVal.isNull(this.epcSevenDayAverage);
            case "payoutRank":
                return ZVal.isNull(this.payoutRank);
            case "__epcNinetyDayAverageType":
                if (Google_Publisher.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__epcNinetyDayAverageType);
                }
                break;
            case "__epcNinetyDayAverageDataType":
                if (Google_Publisher.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__epcNinetyDayAverageDataType);
                }
                break;
            case "epcNinetyDayAverage":
                return ZVal.isNull(this.epcNinetyDayAverage);
            case "__itemType":
                if (Google_Publisher.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__itemType);
                }
                break;
            case "__itemDataType":
                if (Google_Publisher.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__itemDataType);
                }
                break;
            case "item":
                return ZVal.isNull(this.item);
            case "joinDate":
                return ZVal.isNull(this.joinDate);
            case "sites":
                return ZVal.isNull(this.sites);
            case "id":
                return ZVal.isNull(this.id);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "status":
                this.status = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "name":
                this.name = value;
                break;
            case "classification":
                this.classification = value;
                break;
            case "__epcSevenDayAverageType":
                if (Google_Publisher.class.isAssignableFrom(caller)) {

                    this.__epcSevenDayAverageType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__epcSevenDayAverageDataType":
                if (Google_Publisher.class.isAssignableFrom(caller)) {

                    this.__epcSevenDayAverageDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "epcSevenDayAverage":
                this.epcSevenDayAverage = value;
                break;
            case "payoutRank":
                this.payoutRank = value;
                break;
            case "__epcNinetyDayAverageType":
                if (Google_Publisher.class.isAssignableFrom(caller)) {

                    this.__epcNinetyDayAverageType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__epcNinetyDayAverageDataType":
                if (Google_Publisher.class.isAssignableFrom(caller)) {

                    this.__epcNinetyDayAverageDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "epcNinetyDayAverage":
                this.epcNinetyDayAverage = value;
                break;
            case "__itemType":
                if (Google_Publisher.class.isAssignableFrom(caller)) {

                    this.__itemType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__itemDataType":
                if (Google_Publisher.class.isAssignableFrom(caller)) {

                    this.__itemDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "item":
                this.item = value;
                break;
            case "joinDate":
                this.joinDate = value;
                break;
            case "sites":
                this.sites = value;
                break;
            case "id":
                this.id = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setStatus(RuntimeEnv env, Object... args) {
        Object status = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Publisher.class, "status", status);

        return null;
    }

    public Object getStatus(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Publisher.class, "status"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Publisher.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Publisher.class, "kind"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Publisher.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Publisher.class, "name"));
    }

    public Object setClassification(RuntimeEnv env, Object... args) {
        Object classification = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Publisher.class, "classification", classification);

        return null;
    }

    public Object getClassification(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Publisher.class, "classification"));
    }

    public Object setEpcSevenDayAverage(RuntimeEnv env, Object... args) {
        Object epcSevenDayAverage = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Publisher.class, "epcSevenDayAverage", epcSevenDayAverage);

        return null;
    }

    public Object getEpcSevenDayAverage(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Publisher.class, "epcSevenDayAverage"));
    }

    public Object setPayoutRank(RuntimeEnv env, Object... args) {
        Object payoutRank = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Publisher.class, "payoutRank", payoutRank);

        return null;
    }

    public Object getPayoutRank(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Publisher.class, "payoutRank"));
    }

    public Object setEpcNinetyDayAverage(RuntimeEnv env, Object... args) {
        Object epcNinetyDayAverage = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Publisher.class, "epcNinetyDayAverage", epcNinetyDayAverage);

        return null;
    }

    public Object getEpcNinetyDayAverage(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Publisher.class, "epcNinetyDayAverage"));
    }

    public Object setItem(RuntimeEnv env, Object... args) {
        Object item = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Publisher.class, "item", item);

        return null;
    }

    public Object getItem(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Publisher.class, "item"));
    }

    public Object setJoinDate(RuntimeEnv env, Object... args) {
        Object joinDate = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Publisher.class, "joinDate", joinDate);

        return null;
    }

    public Object getJoinDate(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Publisher.class, "joinDate"));
    }

    public Object setSites(RuntimeEnv env, Object... args) {
        Object sites = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Publisher.class, "sites", sites);

        return null;
    }

    public Object getSites(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Publisher.class, "sites"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Publisher.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Publisher.class, "id"));
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
