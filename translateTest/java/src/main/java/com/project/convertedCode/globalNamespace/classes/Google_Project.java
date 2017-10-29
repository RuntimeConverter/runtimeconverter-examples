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

public class Google_Project extends Google_Model implements RuntimeFileContextInterface {

    public Object kind = null;

    public Object description = null;

    public Object __commonInstanceMetadataType = "Google_Metadata";

    public Object __commonInstanceMetadataDataType = "";

    public Object commonInstanceMetadata = null;

    public Object externalIpAddresses = null;

    public Object __quotasType = "Google_ProjectQuotas";

    public Object __quotasDataType = "array";

    public Object quotas = null;

    public Object creationTimestamp = null;

    public Object id = null;

    public Object selfLink = null;

    public Object name = null;

    public Google_Project(RuntimeEnv env, Object... args) {
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
            case "setCommonInstanceMetadata":
                return this.setCommonInstanceMetadata(env, args);
            case "getCommonInstanceMetadata":
                return this.getCommonInstanceMetadata(env, args);
            case "setExternalIpAddresses":
                return this.setExternalIpAddresses(env, args);
            case "getExternalIpAddresses":
                return this.getExternalIpAddresses(env, args);
            case "setQuotas":
                return this.setQuotas(env, args);
            case "getQuotas":
                return this.getQuotas(env, args);
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
            case "__commonInstanceMetadataType":
                if (Google_Project.class.isAssignableFrom(caller)) {

                    return this.__commonInstanceMetadataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__commonInstanceMetadataDataType":
                if (Google_Project.class.isAssignableFrom(caller)) {

                    return this.__commonInstanceMetadataDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "commonInstanceMetadata":
                return this.commonInstanceMetadata;
            case "externalIpAddresses":
                return this.externalIpAddresses;
            case "__quotasType":
                if (Google_Project.class.isAssignableFrom(caller)) {

                    return this.__quotasType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__quotasDataType":
                if (Google_Project.class.isAssignableFrom(caller)) {

                    return this.__quotasDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "quotas":
                return this.quotas;
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
            case "__commonInstanceMetadataType":
                if (Google_Project.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__commonInstanceMetadataType);
                }
                break;
            case "__commonInstanceMetadataDataType":
                if (Google_Project.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__commonInstanceMetadataDataType);
                }
                break;
            case "commonInstanceMetadata":
                return ZVal.isNull(this.commonInstanceMetadata);
            case "externalIpAddresses":
                return ZVal.isNull(this.externalIpAddresses);
            case "__quotasType":
                if (Google_Project.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__quotasType);
                }
                break;
            case "__quotasDataType":
                if (Google_Project.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__quotasDataType);
                }
                break;
            case "quotas":
                return ZVal.isNull(this.quotas);
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
            case "__commonInstanceMetadataType":
                if (Google_Project.class.isAssignableFrom(caller)) {

                    this.__commonInstanceMetadataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__commonInstanceMetadataDataType":
                if (Google_Project.class.isAssignableFrom(caller)) {

                    this.__commonInstanceMetadataDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "commonInstanceMetadata":
                this.commonInstanceMetadata = value;
                break;
            case "externalIpAddresses":
                this.externalIpAddresses = value;
                break;
            case "__quotasType":
                if (Google_Project.class.isAssignableFrom(caller)) {

                    this.__quotasType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__quotasDataType":
                if (Google_Project.class.isAssignableFrom(caller)) {

                    this.__quotasDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "quotas":
                this.quotas = value;
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
        ZVal.setProperty(this, Google_Project.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Project.class, "kind"));
    }

    public Object setDescription(RuntimeEnv env, Object... args) {
        Object description = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Project.class, "description", description);

        return null;
    }

    public Object getDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Project.class, "description"));
    }

    public Object setCommonInstanceMetadata(RuntimeEnv env, Object... args) {
        Object commonInstanceMetadata = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_Project.class, "commonInstanceMetadata", commonInstanceMetadata);

        return null;
    }

    public Object getCommonInstanceMetadata(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Project.class, "commonInstanceMetadata"));
    }

    public Object setExternalIpAddresses(RuntimeEnv env, Object... args) {
        Object externalIpAddresses = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Project.class, "externalIpAddresses", externalIpAddresses);

        return null;
    }

    public Object getExternalIpAddresses(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Project.class, "externalIpAddresses"));
    }

    public Object setQuotas(RuntimeEnv env, Object... args) {
        Object quotas = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Project.class,
                quotas,
                "Google_ProjectQuotas",
                "setQuotas");
        ZVal.setProperty(this, Google_Project.class, "quotas", quotas);

        return null;
    }

    public Object getQuotas(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Project.class, "quotas"));
    }

    public Object setCreationTimestamp(RuntimeEnv env, Object... args) {
        Object creationTimestamp = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Project.class, "creationTimestamp", creationTimestamp);

        return null;
    }

    public Object getCreationTimestamp(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Project.class, "creationTimestamp"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Project.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Project.class, "id"));
    }

    public Object setSelfLink(RuntimeEnv env, Object... args) {
        Object selfLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Project.class, "selfLink", selfLink);

        return null;
    }

    public Object getSelfLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Project.class, "selfLink"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Project.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Project.class, "name"));
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
