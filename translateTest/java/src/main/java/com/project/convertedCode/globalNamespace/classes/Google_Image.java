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

public class Google_Image extends Google_Model implements RuntimeFileContextInterface {

    public Object kind = null;

    public Object description = null;

    public Object __rawDiskType = "Google_ImageRawDisk";

    public Object __rawDiskDataType = "";

    public Object rawDisk = null;

    public Object preferredKernel = null;

    public Object __diskSnapshotType = "Google_ImageDiskSnapshot";

    public Object __diskSnapshotDataType = "";

    public Object diskSnapshot = null;

    public Object sourceType = null;

    public Object creationTimestamp = null;

    public Object id = null;

    public Object selfLink = null;

    public Object name = null;

    public Google_Image(RuntimeEnv env, Object... args) {
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
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setDescription":
                return this.setDescription(env, args);
            case "getDescription":
                return this.getDescription(env, args);
            case "setRawDisk":
                return this.setRawDisk(env, args);
            case "getRawDisk":
                return this.getRawDisk(env, args);
            case "setPreferredKernel":
                return this.setPreferredKernel(env, args);
            case "getPreferredKernel":
                return this.getPreferredKernel(env, args);
            case "setDiskSnapshot":
                return this.setDiskSnapshot(env, args);
            case "getDiskSnapshot":
                return this.getDiskSnapshot(env, args);
            case "setSourceType":
                return this.setSourceType(env, args);
            case "getSourceType":
                return this.getSourceType(env, args);
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
            case "kind":
                return this.kind;
            case "description":
                return this.description;
            case "__rawDiskType":
                if (Google_Image.class.isAssignableFrom(caller)) {

                    return this.__rawDiskType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__rawDiskDataType":
                if (Google_Image.class.isAssignableFrom(caller)) {

                    return this.__rawDiskDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "rawDisk":
                return this.rawDisk;
            case "preferredKernel":
                return this.preferredKernel;
            case "__diskSnapshotType":
                if (Google_Image.class.isAssignableFrom(caller)) {

                    return this.__diskSnapshotType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__diskSnapshotDataType":
                if (Google_Image.class.isAssignableFrom(caller)) {

                    return this.__diskSnapshotDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "diskSnapshot":
                return this.diskSnapshot;
            case "sourceType":
                return this.sourceType;
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
            case "kind":
                return ZVal.isNull(this.kind);
            case "description":
                return ZVal.isNull(this.description);
            case "__rawDiskType":
                if (Google_Image.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__rawDiskType);
                }
                break;
            case "__rawDiskDataType":
                if (Google_Image.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__rawDiskDataType);
                }
                break;
            case "rawDisk":
                return ZVal.isNull(this.rawDisk);
            case "preferredKernel":
                return ZVal.isNull(this.preferredKernel);
            case "__diskSnapshotType":
                if (Google_Image.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__diskSnapshotType);
                }
                break;
            case "__diskSnapshotDataType":
                if (Google_Image.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__diskSnapshotDataType);
                }
                break;
            case "diskSnapshot":
                return ZVal.isNull(this.diskSnapshot);
            case "sourceType":
                return ZVal.isNull(this.sourceType);
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
            case "kind":
                this.kind = value;
                break;
            case "description":
                this.description = value;
                break;
            case "__rawDiskType":
                if (Google_Image.class.isAssignableFrom(caller)) {

                    this.__rawDiskType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__rawDiskDataType":
                if (Google_Image.class.isAssignableFrom(caller)) {

                    this.__rawDiskDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "rawDisk":
                this.rawDisk = value;
                break;
            case "preferredKernel":
                this.preferredKernel = value;
                break;
            case "__diskSnapshotType":
                if (Google_Image.class.isAssignableFrom(caller)) {

                    this.__diskSnapshotType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__diskSnapshotDataType":
                if (Google_Image.class.isAssignableFrom(caller)) {

                    this.__diskSnapshotDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "diskSnapshot":
                this.diskSnapshot = value;
                break;
            case "sourceType":
                this.sourceType = value;
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

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Image.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Image.class, "kind"));
    }

    public Object setDescription(RuntimeEnv env, Object... args) {
        Object description = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Image.class, "description", description);

        return null;
    }

    public Object getDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Image.class, "description"));
    }

    public Object setRawDisk(RuntimeEnv env, Object... args) {
        Object rawDisk = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Image.class, "rawDisk", rawDisk);

        return null;
    }

    public Object getRawDisk(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Image.class, "rawDisk"));
    }

    public Object setPreferredKernel(RuntimeEnv env, Object... args) {
        Object preferredKernel = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Image.class, "preferredKernel", preferredKernel);

        return null;
    }

    public Object getPreferredKernel(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Image.class, "preferredKernel"));
    }

    public Object setDiskSnapshot(RuntimeEnv env, Object... args) {
        Object diskSnapshot = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Image.class, "diskSnapshot", diskSnapshot);

        return null;
    }

    public Object getDiskSnapshot(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Image.class, "diskSnapshot"));
    }

    public Object setSourceType(RuntimeEnv env, Object... args) {
        Object sourceType = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Image.class, "sourceType", sourceType);

        return null;
    }

    public Object getSourceType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Image.class, "sourceType"));
    }

    public Object setCreationTimestamp(RuntimeEnv env, Object... args) {
        Object creationTimestamp = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Image.class, "creationTimestamp", creationTimestamp);

        return null;
    }

    public Object getCreationTimestamp(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Image.class, "creationTimestamp"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Image.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Image.class, "id"));
    }

    public Object setSelfLink(RuntimeEnv env, Object... args) {
        Object selfLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Image.class, "selfLink", selfLink);

        return null;
    }

    public Object getSelfLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Image.class, "selfLink"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Image.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Image.class, "name"));
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
