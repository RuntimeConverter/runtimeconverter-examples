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

public class Google_MachineType extends Google_Model implements RuntimeFileContextInterface {

    public Object guestCpus = null;

    public Object imageSpaceGb = null;

    public Object kind = null;

    public Object __ephemeralDisksType = "Google_MachineTypeEphemeralDisks";

    public Object __ephemeralDisksDataType = "array";

    public Object ephemeralDisks = null;

    public Object maximumPersistentDisksSizeGb = null;

    public Object description = null;

    public Object maximumPersistentDisks = null;

    public Object name = null;

    public Object memoryMb = null;

    public Object availableZone = null;

    public Object creationTimestamp = null;

    public Object id = null;

    public Object selfLink = null;

    public Object hostCpus = null;

    public Google_MachineType(RuntimeEnv env, Object... args) {
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
            case "setGuestCpus":
                return this.setGuestCpus(env, args);
            case "getGuestCpus":
                return this.getGuestCpus(env, args);
            case "setImageSpaceGb":
                return this.setImageSpaceGb(env, args);
            case "getImageSpaceGb":
                return this.getImageSpaceGb(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setEphemeralDisks":
                return this.setEphemeralDisks(env, args);
            case "getEphemeralDisks":
                return this.getEphemeralDisks(env, args);
            case "setMaximumPersistentDisksSizeGb":
                return this.setMaximumPersistentDisksSizeGb(env, args);
            case "getMaximumPersistentDisksSizeGb":
                return this.getMaximumPersistentDisksSizeGb(env, args);
            case "setDescription":
                return this.setDescription(env, args);
            case "getDescription":
                return this.getDescription(env, args);
            case "setMaximumPersistentDisks":
                return this.setMaximumPersistentDisks(env, args);
            case "getMaximumPersistentDisks":
                return this.getMaximumPersistentDisks(env, args);
            case "setName":
                return this.setName(env, args);
            case "getName":
                return this.getName(env, args);
            case "setMemoryMb":
                return this.setMemoryMb(env, args);
            case "getMemoryMb":
                return this.getMemoryMb(env, args);
            case "setAvailableZone":
                return this.setAvailableZone(env, args);
            case "getAvailableZone":
                return this.getAvailableZone(env, args);
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
            case "setHostCpus":
                return this.setHostCpus(env, args);
            case "getHostCpus":
                return this.getHostCpus(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "guestCpus":
                return this.guestCpus;
            case "imageSpaceGb":
                return this.imageSpaceGb;
            case "kind":
                return this.kind;
            case "__ephemeralDisksType":
                if (Google_MachineType.class.isAssignableFrom(caller)) {

                    return this.__ephemeralDisksType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__ephemeralDisksDataType":
                if (Google_MachineType.class.isAssignableFrom(caller)) {

                    return this.__ephemeralDisksDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "ephemeralDisks":
                return this.ephemeralDisks;
            case "maximumPersistentDisksSizeGb":
                return this.maximumPersistentDisksSizeGb;
            case "description":
                return this.description;
            case "maximumPersistentDisks":
                return this.maximumPersistentDisks;
            case "name":
                return this.name;
            case "memoryMb":
                return this.memoryMb;
            case "availableZone":
                return this.availableZone;
            case "creationTimestamp":
                return this.creationTimestamp;
            case "id":
                return this.id;
            case "selfLink":
                return this.selfLink;
            case "hostCpus":
                return this.hostCpus;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "guestCpus":
                return ZVal.isNull(this.guestCpus);
            case "imageSpaceGb":
                return ZVal.isNull(this.imageSpaceGb);
            case "kind":
                return ZVal.isNull(this.kind);
            case "__ephemeralDisksType":
                if (Google_MachineType.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__ephemeralDisksType);
                }
                break;
            case "__ephemeralDisksDataType":
                if (Google_MachineType.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__ephemeralDisksDataType);
                }
                break;
            case "ephemeralDisks":
                return ZVal.isNull(this.ephemeralDisks);
            case "maximumPersistentDisksSizeGb":
                return ZVal.isNull(this.maximumPersistentDisksSizeGb);
            case "description":
                return ZVal.isNull(this.description);
            case "maximumPersistentDisks":
                return ZVal.isNull(this.maximumPersistentDisks);
            case "name":
                return ZVal.isNull(this.name);
            case "memoryMb":
                return ZVal.isNull(this.memoryMb);
            case "availableZone":
                return ZVal.isNull(this.availableZone);
            case "creationTimestamp":
                return ZVal.isNull(this.creationTimestamp);
            case "id":
                return ZVal.isNull(this.id);
            case "selfLink":
                return ZVal.isNull(this.selfLink);
            case "hostCpus":
                return ZVal.isNull(this.hostCpus);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "guestCpus":
                this.guestCpus = value;
                break;
            case "imageSpaceGb":
                this.imageSpaceGb = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "__ephemeralDisksType":
                if (Google_MachineType.class.isAssignableFrom(caller)) {

                    this.__ephemeralDisksType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__ephemeralDisksDataType":
                if (Google_MachineType.class.isAssignableFrom(caller)) {

                    this.__ephemeralDisksDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "ephemeralDisks":
                this.ephemeralDisks = value;
                break;
            case "maximumPersistentDisksSizeGb":
                this.maximumPersistentDisksSizeGb = value;
                break;
            case "description":
                this.description = value;
                break;
            case "maximumPersistentDisks":
                this.maximumPersistentDisks = value;
                break;
            case "name":
                this.name = value;
                break;
            case "memoryMb":
                this.memoryMb = value;
                break;
            case "availableZone":
                this.availableZone = value;
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
            case "hostCpus":
                this.hostCpus = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setGuestCpus(RuntimeEnv env, Object... args) {
        Object guestCpus = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_MachineType.class, "guestCpus", guestCpus);

        return null;
    }

    public Object getGuestCpus(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_MachineType.class, "guestCpus"));
    }

    public Object setImageSpaceGb(RuntimeEnv env, Object... args) {
        Object imageSpaceGb = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_MachineType.class, "imageSpaceGb", imageSpaceGb);

        return null;
    }

    public Object getImageSpaceGb(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_MachineType.class, "imageSpaceGb"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_MachineType.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_MachineType.class, "kind"));
    }

    public Object setEphemeralDisks(RuntimeEnv env, Object... args) {
        Object ephemeralDisks = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_MachineType.class,
                ephemeralDisks,
                "Google_MachineTypeEphemeralDisks",
                "setEphemeralDisks");
        ZVal.setProperty(this, Google_MachineType.class, "ephemeralDisks", ephemeralDisks);

        return null;
    }

    public Object getEphemeralDisks(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_MachineType.class, "ephemeralDisks"));
    }

    public Object setMaximumPersistentDisksSizeGb(RuntimeEnv env, Object... args) {
        Object maximumPersistentDisksSizeGb = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_MachineType.class,
                "maximumPersistentDisksSizeGb",
                maximumPersistentDisksSizeGb);

        return null;
    }

    public Object getMaximumPersistentDisksSizeGb(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_MachineType.class, "maximumPersistentDisksSizeGb"));
    }

    public Object setDescription(RuntimeEnv env, Object... args) {
        Object description = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_MachineType.class, "description", description);

        return null;
    }

    public Object getDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_MachineType.class, "description"));
    }

    public Object setMaximumPersistentDisks(RuntimeEnv env, Object... args) {
        Object maximumPersistentDisks = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_MachineType.class, "maximumPersistentDisks", maximumPersistentDisks);

        return null;
    }

    public Object getMaximumPersistentDisks(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_MachineType.class, "maximumPersistentDisks"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_MachineType.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_MachineType.class, "name"));
    }

    public Object setMemoryMb(RuntimeEnv env, Object... args) {
        Object memoryMb = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_MachineType.class, "memoryMb", memoryMb);

        return null;
    }

    public Object getMemoryMb(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_MachineType.class, "memoryMb"));
    }

    public Object setAvailableZone(RuntimeEnv env, Object... args) {
        Object availableZone = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_MachineType.class, "availableZone", availableZone);

        return null;
    }

    public Object getAvailableZone(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_MachineType.class, "availableZone"));
    }

    public Object setCreationTimestamp(RuntimeEnv env, Object... args) {
        Object creationTimestamp = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_MachineType.class, "creationTimestamp", creationTimestamp);

        return null;
    }

    public Object getCreationTimestamp(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_MachineType.class, "creationTimestamp"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_MachineType.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_MachineType.class, "id"));
    }

    public Object setSelfLink(RuntimeEnv env, Object... args) {
        Object selfLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_MachineType.class, "selfLink", selfLink);

        return null;
    }

    public Object getSelfLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_MachineType.class, "selfLink"));
    }

    public Object setHostCpus(RuntimeEnv env, Object... args) {
        Object hostCpus = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_MachineType.class, "hostCpus", hostCpus);

        return null;
    }

    public Object getHostCpus(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_MachineType.class, "hostCpus"));
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
