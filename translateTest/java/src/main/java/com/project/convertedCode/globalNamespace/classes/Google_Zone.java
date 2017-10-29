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

 google-api-php-client/src/contrib/Google_ComputeService.php

*/

public class Google_Zone extends Google_Model implements RuntimeFileContextInterface {

    public Object status = null;

    public Object kind = null;

    public Object availableMachineType = null;

    public Object description = null;

    public Object __maintenanceWindowsType = "Google_ZoneMaintenanceWindows";

    public Object __maintenanceWindowsDataType = "array";

    public Object maintenanceWindows = null;

    public Object creationTimestamp = null;

    public Object id = null;

    public Object selfLink = null;

    public Object name = null;

    public Google_Zone(RuntimeEnv env, Object... args) {
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
            case "setAvailableMachineType":
                return this.setAvailableMachineType(env, args);
            case "getAvailableMachineType":
                return this.getAvailableMachineType(env, args);
            case "setDescription":
                return this.setDescription(env, args);
            case "getDescription":
                return this.getDescription(env, args);
            case "setMaintenanceWindows":
                return this.setMaintenanceWindows(env, args);
            case "getMaintenanceWindows":
                return this.getMaintenanceWindows(env, args);
            case "setCreationTimestamp":
                return this.setCreationTimestamp(env, args);
            case "getCreationTimestamp":
                return this.getCreationTimestamp(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setSelfLink":
                return this.setSelfLink(env, args);
            case "getSelfLink":
                return this.getSelfLink(env, args);
            case "setName":
                return this.setName(env, args);
            case "getName":
                return this.getName(env, args);
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
            case "availableMachineType":
                return this.availableMachineType;
            case "description":
                return this.description;
            case "__maintenanceWindowsType":
                if (Google_Zone.class.isAssignableFrom(caller)) {

                    return this.__maintenanceWindowsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__maintenanceWindowsDataType":
                if (Google_Zone.class.isAssignableFrom(caller)) {

                    return this.__maintenanceWindowsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "maintenanceWindows":
                return this.maintenanceWindows;
            case "creationTimestamp":
                return this.creationTimestamp;
            case "id":
                return this.id;
            case "selfLink":
                return this.selfLink;
            case "name":
                return this.name;
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
            case "availableMachineType":
                return ZVal.isNull(this.availableMachineType);
            case "description":
                return ZVal.isNull(this.description);
            case "__maintenanceWindowsType":
                if (Google_Zone.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__maintenanceWindowsType);
                }
                break;
            case "__maintenanceWindowsDataType":
                if (Google_Zone.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__maintenanceWindowsDataType);
                }
                break;
            case "maintenanceWindows":
                return ZVal.isNull(this.maintenanceWindows);
            case "creationTimestamp":
                return ZVal.isNull(this.creationTimestamp);
            case "id":
                return ZVal.isNull(this.id);
            case "selfLink":
                return ZVal.isNull(this.selfLink);
            case "name":
                return ZVal.isNull(this.name);
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
            case "availableMachineType":
                this.availableMachineType = value;
                break;
            case "description":
                this.description = value;
                break;
            case "__maintenanceWindowsType":
                if (Google_Zone.class.isAssignableFrom(caller)) {

                    this.__maintenanceWindowsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__maintenanceWindowsDataType":
                if (Google_Zone.class.isAssignableFrom(caller)) {

                    this.__maintenanceWindowsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "maintenanceWindows":
                this.maintenanceWindows = value;
                break;
            case "creationTimestamp":
                this.creationTimestamp = value;
                break;
            case "id":
                this.id = value;
                break;
            case "selfLink":
                this.selfLink = value;
                break;
            case "name":
                this.name = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setStatus(RuntimeEnv env, Object... args) {
        Object status = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Zone.class, "status", status);

        return null;
    }

    public Object getStatus(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Zone.class, "status"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Zone.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Zone.class, "kind"));
    }

    public Object setAvailableMachineType(RuntimeEnv env, Object... args) {
        Object availableMachineType = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Zone.class, "availableMachineType", availableMachineType);

        return null;
    }

    public Object getAvailableMachineType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Zone.class, "availableMachineType"));
    }

    public Object setDescription(RuntimeEnv env, Object... args) {
        Object description = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Zone.class, "description", description);

        return null;
    }

    public Object getDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Zone.class, "description"));
    }

    public Object setMaintenanceWindows(RuntimeEnv env, Object... args) {
        Object maintenanceWindows = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Zone.class,
                maintenanceWindows,
                "Google_ZoneMaintenanceWindows",
                "setMaintenanceWindows");
        ZVal.setProperty(this, Google_Zone.class, "maintenanceWindows", maintenanceWindows);

        return null;
    }

    public Object getMaintenanceWindows(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Zone.class, "maintenanceWindows"));
    }

    public Object setCreationTimestamp(RuntimeEnv env, Object... args) {
        Object creationTimestamp = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Zone.class, "creationTimestamp", creationTimestamp);

        return null;
    }

    public Object getCreationTimestamp(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Zone.class, "creationTimestamp"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Zone.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Zone.class, "id"));
    }

    public Object setSelfLink(RuntimeEnv env, Object... args) {
        Object selfLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Zone.class, "selfLink", selfLink);

        return null;
    }

    public Object getSelfLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Zone.class, "selfLink"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Zone.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Zone.class, "name"));
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
