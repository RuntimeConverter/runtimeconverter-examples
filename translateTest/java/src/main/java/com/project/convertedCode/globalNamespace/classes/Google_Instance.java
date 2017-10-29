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

public class Google_Instance extends Google_Model implements RuntimeFileContextInterface {

    public Object status = null;

    public Object kind = null;

    public Object machineType = null;

    public Object description = null;

    public Object zone = null;

    public Object tags = null;

    public Object image = null;

    public Object __disksType = "Google_AttachedDisk";

    public Object __disksDataType = "array";

    public Object disks = null;

    public Object name = null;

    public Object statusMessage = null;

    public Object __serviceAccountsType = "Google_ServiceAccount";

    public Object __serviceAccountsDataType = "array";

    public Object serviceAccounts = null;

    public Object __networkInterfacesType = "Google_NetworkInterface";

    public Object __networkInterfacesDataType = "array";

    public Object networkInterfaces = null;

    public Object creationTimestamp = null;

    public Object id = null;

    public Object selfLink = null;

    public Object __metadataType = "Google_Metadata";

    public Object __metadataDataType = "";

    public Object metadata = null;

    public Google_Instance(RuntimeEnv env, Object... args) {
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
            case "setMachineType":
                return this.setMachineType(env, args);
            case "getMachineType":
                return this.getMachineType(env, args);
            case "setDescription":
                return this.setDescription(env, args);
            case "getDescription":
                return this.getDescription(env, args);
            case "setZone":
                return this.setZone(env, args);
            case "getZone":
                return this.getZone(env, args);
            case "setTags":
                return this.setTags(env, args);
            case "getTags":
                return this.getTags(env, args);
            case "setImage":
                return this.setImage(env, args);
            case "getImage":
                return this.getImage(env, args);
            case "setDisks":
                return this.setDisks(env, args);
            case "getDisks":
                return this.getDisks(env, args);
            case "setName":
                return this.setName(env, args);
            case "getName":
                return this.getName(env, args);
            case "setStatusMessage":
                return this.setStatusMessage(env, args);
            case "getStatusMessage":
                return this.getStatusMessage(env, args);
            case "setServiceAccounts":
                return this.setServiceAccounts(env, args);
            case "getServiceAccounts":
                return this.getServiceAccounts(env, args);
            case "setNetworkInterfaces":
                return this.setNetworkInterfaces(env, args);
            case "getNetworkInterfaces":
                return this.getNetworkInterfaces(env, args);
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
            case "setMetadata":
                return this.setMetadata(env, args);
            case "getMetadata":
                return this.getMetadata(env, args);
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
            case "machineType":
                return this.machineType;
            case "description":
                return this.description;
            case "zone":
                return this.zone;
            case "tags":
                return this.tags;
            case "image":
                return this.image;
            case "__disksType":
                if (Google_Instance.class.isAssignableFrom(caller)) {

                    return this.__disksType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__disksDataType":
                if (Google_Instance.class.isAssignableFrom(caller)) {

                    return this.__disksDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "disks":
                return this.disks;
            case "name":
                return this.name;
            case "statusMessage":
                return this.statusMessage;
            case "__serviceAccountsType":
                if (Google_Instance.class.isAssignableFrom(caller)) {

                    return this.__serviceAccountsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__serviceAccountsDataType":
                if (Google_Instance.class.isAssignableFrom(caller)) {

                    return this.__serviceAccountsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "serviceAccounts":
                return this.serviceAccounts;
            case "__networkInterfacesType":
                if (Google_Instance.class.isAssignableFrom(caller)) {

                    return this.__networkInterfacesType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__networkInterfacesDataType":
                if (Google_Instance.class.isAssignableFrom(caller)) {

                    return this.__networkInterfacesDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "networkInterfaces":
                return this.networkInterfaces;
            case "creationTimestamp":
                return this.creationTimestamp;
            case "id":
                return this.id;
            case "selfLink":
                return this.selfLink;
            case "__metadataType":
                if (Google_Instance.class.isAssignableFrom(caller)) {

                    return this.__metadataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__metadataDataType":
                if (Google_Instance.class.isAssignableFrom(caller)) {

                    return this.__metadataDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "metadata":
                return this.metadata;
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
            case "machineType":
                return ZVal.isNull(this.machineType);
            case "description":
                return ZVal.isNull(this.description);
            case "zone":
                return ZVal.isNull(this.zone);
            case "tags":
                return ZVal.isNull(this.tags);
            case "image":
                return ZVal.isNull(this.image);
            case "__disksType":
                if (Google_Instance.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__disksType);
                }
                break;
            case "__disksDataType":
                if (Google_Instance.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__disksDataType);
                }
                break;
            case "disks":
                return ZVal.isNull(this.disks);
            case "name":
                return ZVal.isNull(this.name);
            case "statusMessage":
                return ZVal.isNull(this.statusMessage);
            case "__serviceAccountsType":
                if (Google_Instance.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__serviceAccountsType);
                }
                break;
            case "__serviceAccountsDataType":
                if (Google_Instance.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__serviceAccountsDataType);
                }
                break;
            case "serviceAccounts":
                return ZVal.isNull(this.serviceAccounts);
            case "__networkInterfacesType":
                if (Google_Instance.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__networkInterfacesType);
                }
                break;
            case "__networkInterfacesDataType":
                if (Google_Instance.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__networkInterfacesDataType);
                }
                break;
            case "networkInterfaces":
                return ZVal.isNull(this.networkInterfaces);
            case "creationTimestamp":
                return ZVal.isNull(this.creationTimestamp);
            case "id":
                return ZVal.isNull(this.id);
            case "selfLink":
                return ZVal.isNull(this.selfLink);
            case "__metadataType":
                if (Google_Instance.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__metadataType);
                }
                break;
            case "__metadataDataType":
                if (Google_Instance.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__metadataDataType);
                }
                break;
            case "metadata":
                return ZVal.isNull(this.metadata);
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
            case "machineType":
                this.machineType = value;
                break;
            case "description":
                this.description = value;
                break;
            case "zone":
                this.zone = value;
                break;
            case "tags":
                this.tags = value;
                break;
            case "image":
                this.image = value;
                break;
            case "__disksType":
                if (Google_Instance.class.isAssignableFrom(caller)) {

                    this.__disksType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__disksDataType":
                if (Google_Instance.class.isAssignableFrom(caller)) {

                    this.__disksDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "disks":
                this.disks = value;
                break;
            case "name":
                this.name = value;
                break;
            case "statusMessage":
                this.statusMessage = value;
                break;
            case "__serviceAccountsType":
                if (Google_Instance.class.isAssignableFrom(caller)) {

                    this.__serviceAccountsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__serviceAccountsDataType":
                if (Google_Instance.class.isAssignableFrom(caller)) {

                    this.__serviceAccountsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "serviceAccounts":
                this.serviceAccounts = value;
                break;
            case "__networkInterfacesType":
                if (Google_Instance.class.isAssignableFrom(caller)) {

                    this.__networkInterfacesType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__networkInterfacesDataType":
                if (Google_Instance.class.isAssignableFrom(caller)) {

                    this.__networkInterfacesDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "networkInterfaces":
                this.networkInterfaces = value;
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
            case "__metadataType":
                if (Google_Instance.class.isAssignableFrom(caller)) {

                    this.__metadataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__metadataDataType":
                if (Google_Instance.class.isAssignableFrom(caller)) {

                    this.__metadataDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "metadata":
                this.metadata = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setStatus(RuntimeEnv env, Object... args) {
        Object status = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Instance.class, "status", status);

        return null;
    }

    public Object getStatus(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Instance.class, "status"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Instance.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Instance.class, "kind"));
    }

    public Object setMachineType(RuntimeEnv env, Object... args) {
        Object machineType = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Instance.class, "machineType", machineType);

        return null;
    }

    public Object getMachineType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Instance.class, "machineType"));
    }

    public Object setDescription(RuntimeEnv env, Object... args) {
        Object description = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Instance.class, "description", description);

        return null;
    }

    public Object getDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Instance.class, "description"));
    }

    public Object setZone(RuntimeEnv env, Object... args) {
        Object zone = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Instance.class, "zone", zone);

        return null;
    }

    public Object getZone(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Instance.class, "zone"));
    }

    public Object setTags(RuntimeEnv env, Object... args) {
        Object tags = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Instance.class, "tags", tags);

        return null;
    }

    public Object getTags(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Instance.class, "tags"));
    }

    public Object setImage(RuntimeEnv env, Object... args) {
        Object image = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Instance.class, "image", image);

        return null;
    }

    public Object getImage(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Instance.class, "image"));
    }

    public Object setDisks(RuntimeEnv env, Object... args) {
        Object disks = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Instance.class,
                disks,
                "Google_AttachedDisk",
                "setDisks");
        ZVal.setProperty(this, Google_Instance.class, "disks", disks);

        return null;
    }

    public Object getDisks(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Instance.class, "disks"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Instance.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Instance.class, "name"));
    }

    public Object setStatusMessage(RuntimeEnv env, Object... args) {
        Object statusMessage = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Instance.class, "statusMessage", statusMessage);

        return null;
    }

    public Object getStatusMessage(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Instance.class, "statusMessage"));
    }

    public Object setServiceAccounts(RuntimeEnv env, Object... args) {
        Object serviceAccounts = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Instance.class,
                serviceAccounts,
                "Google_ServiceAccount",
                "setServiceAccounts");
        ZVal.setProperty(this, Google_Instance.class, "serviceAccounts", serviceAccounts);

        return null;
    }

    public Object getServiceAccounts(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Instance.class, "serviceAccounts"));
    }

    public Object setNetworkInterfaces(RuntimeEnv env, Object... args) {
        Object networkInterfaces = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Instance.class,
                networkInterfaces,
                "Google_NetworkInterface",
                "setNetworkInterfaces");
        ZVal.setProperty(this, Google_Instance.class, "networkInterfaces", networkInterfaces);

        return null;
    }

    public Object getNetworkInterfaces(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Instance.class, "networkInterfaces"));
    }

    public Object setCreationTimestamp(RuntimeEnv env, Object... args) {
        Object creationTimestamp = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Instance.class, "creationTimestamp", creationTimestamp);

        return null;
    }

    public Object getCreationTimestamp(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Instance.class, "creationTimestamp"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Instance.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Instance.class, "id"));
    }

    public Object setSelfLink(RuntimeEnv env, Object... args) {
        Object selfLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Instance.class, "selfLink", selfLink);

        return null;
    }

    public Object getSelfLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Instance.class, "selfLink"));
    }

    public Object setMetadata(RuntimeEnv env, Object... args) {
        Object metadata = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Instance.class, "metadata", metadata);

        return null;
    }

    public Object getMetadata(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Instance.class, "metadata"));
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
