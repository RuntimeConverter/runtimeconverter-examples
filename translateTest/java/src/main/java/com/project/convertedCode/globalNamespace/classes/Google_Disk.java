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

public class Google_Disk extends Google_Model implements RuntimeFileContextInterface {

    public Object status = null;

    public Object sourceSnapshot = null;

    public Object kind = null;

    public Object description = null;

    public Object sizeGb = null;

    public Object id = null;

    public Object sourceSnapshotId = null;

    public Object zone = null;

    public Object creationTimestamp = null;

    public Object options = null;

    public Object selfLink = null;

    public Object name = null;

    public Google_Disk(RuntimeEnv env, Object... args) {
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
            case "setSourceSnapshot":
                return this.setSourceSnapshot(env, args);
            case "getSourceSnapshot":
                return this.getSourceSnapshot(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setDescription":
                return this.setDescription(env, args);
            case "getDescription":
                return this.getDescription(env, args);
            case "setSizeGb":
                return this.setSizeGb(env, args);
            case "getSizeGb":
                return this.getSizeGb(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setSourceSnapshotId":
                return this.setSourceSnapshotId(env, args);
            case "getSourceSnapshotId":
                return this.getSourceSnapshotId(env, args);
            case "setZone":
                return this.setZone(env, args);
            case "getZone":
                return this.getZone(env, args);
            case "setCreationTimestamp":
                return this.setCreationTimestamp(env, args);
            case "getCreationTimestamp":
                return this.getCreationTimestamp(env, args);
            case "setOptions":
                return this.setOptions(env, args);
            case "getOptions":
                return this.getOptions(env, args);
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
            case "sourceSnapshot":
                return this.sourceSnapshot;
            case "kind":
                return this.kind;
            case "description":
                return this.description;
            case "sizeGb":
                return this.sizeGb;
            case "id":
                return this.id;
            case "sourceSnapshotId":
                return this.sourceSnapshotId;
            case "zone":
                return this.zone;
            case "creationTimestamp":
                return this.creationTimestamp;
            case "options":
                return this.options;
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
            case "sourceSnapshot":
                return ZVal.isNull(this.sourceSnapshot);
            case "kind":
                return ZVal.isNull(this.kind);
            case "description":
                return ZVal.isNull(this.description);
            case "sizeGb":
                return ZVal.isNull(this.sizeGb);
            case "id":
                return ZVal.isNull(this.id);
            case "sourceSnapshotId":
                return ZVal.isNull(this.sourceSnapshotId);
            case "zone":
                return ZVal.isNull(this.zone);
            case "creationTimestamp":
                return ZVal.isNull(this.creationTimestamp);
            case "options":
                return ZVal.isNull(this.options);
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
            case "sourceSnapshot":
                this.sourceSnapshot = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "description":
                this.description = value;
                break;
            case "sizeGb":
                this.sizeGb = value;
                break;
            case "id":
                this.id = value;
                break;
            case "sourceSnapshotId":
                this.sourceSnapshotId = value;
                break;
            case "zone":
                this.zone = value;
                break;
            case "creationTimestamp":
                this.creationTimestamp = value;
                break;
            case "options":
                this.options = value;
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
        ZVal.setProperty(this, Google_Disk.class, "status", status);

        return null;
    }

    public Object getStatus(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Disk.class, "status"));
    }

    public Object setSourceSnapshot(RuntimeEnv env, Object... args) {
        Object sourceSnapshot = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Disk.class, "sourceSnapshot", sourceSnapshot);

        return null;
    }

    public Object getSourceSnapshot(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Disk.class, "sourceSnapshot"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Disk.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Disk.class, "kind"));
    }

    public Object setDescription(RuntimeEnv env, Object... args) {
        Object description = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Disk.class, "description", description);

        return null;
    }

    public Object getDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Disk.class, "description"));
    }

    public Object setSizeGb(RuntimeEnv env, Object... args) {
        Object sizeGb = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Disk.class, "sizeGb", sizeGb);

        return null;
    }

    public Object getSizeGb(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Disk.class, "sizeGb"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Disk.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Disk.class, "id"));
    }

    public Object setSourceSnapshotId(RuntimeEnv env, Object... args) {
        Object sourceSnapshotId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Disk.class, "sourceSnapshotId", sourceSnapshotId);

        return null;
    }

    public Object getSourceSnapshotId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Disk.class, "sourceSnapshotId"));
    }

    public Object setZone(RuntimeEnv env, Object... args) {
        Object zone = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Disk.class, "zone", zone);

        return null;
    }

    public Object getZone(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Disk.class, "zone"));
    }

    public Object setCreationTimestamp(RuntimeEnv env, Object... args) {
        Object creationTimestamp = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Disk.class, "creationTimestamp", creationTimestamp);

        return null;
    }

    public Object getCreationTimestamp(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Disk.class, "creationTimestamp"));
    }

    public Object setOptions(RuntimeEnv env, Object... args) {
        Object options = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Disk.class, "options", options);

        return null;
    }

    public Object getOptions(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Disk.class, "options"));
    }

    public Object setSelfLink(RuntimeEnv env, Object... args) {
        Object selfLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Disk.class, "selfLink", selfLink);

        return null;
    }

    public Object getSelfLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Disk.class, "selfLink"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Disk.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Disk.class, "name"));
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
