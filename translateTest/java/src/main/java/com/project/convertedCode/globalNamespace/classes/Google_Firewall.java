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

public class Google_Firewall extends Google_Model implements RuntimeFileContextInterface {

    public Object kind = null;

    public Object description = null;

    public Object sourceTags = null;

    public Object sourceRanges = null;

    public Object network = null;

    public Object targetTags = null;

    public Object __allowedType = "Google_FirewallAllowed";

    public Object __allowedDataType = "array";

    public Object allowed = null;

    public Object creationTimestamp = null;

    public Object id = null;

    public Object selfLink = null;

    public Object name = null;

    public Google_Firewall(RuntimeEnv env, Object... args) {
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
            case "setSourceTags":
                return this.setSourceTags(env, args);
            case "getSourceTags":
                return this.getSourceTags(env, args);
            case "setSourceRanges":
                return this.setSourceRanges(env, args);
            case "getSourceRanges":
                return this.getSourceRanges(env, args);
            case "setNetwork":
                return this.setNetwork(env, args);
            case "getNetwork":
                return this.getNetwork(env, args);
            case "setTargetTags":
                return this.setTargetTags(env, args);
            case "getTargetTags":
                return this.getTargetTags(env, args);
            case "setAllowed":
                return this.setAllowed(env, args);
            case "getAllowed":
                return this.getAllowed(env, args);
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
            case "sourceTags":
                return this.sourceTags;
            case "sourceRanges":
                return this.sourceRanges;
            case "network":
                return this.network;
            case "targetTags":
                return this.targetTags;
            case "__allowedType":
                if (Google_Firewall.class.isAssignableFrom(caller)) {

                    return this.__allowedType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__allowedDataType":
                if (Google_Firewall.class.isAssignableFrom(caller)) {

                    return this.__allowedDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "allowed":
                return this.allowed;
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
            case "sourceTags":
                return ZVal.isNull(this.sourceTags);
            case "sourceRanges":
                return ZVal.isNull(this.sourceRanges);
            case "network":
                return ZVal.isNull(this.network);
            case "targetTags":
                return ZVal.isNull(this.targetTags);
            case "__allowedType":
                if (Google_Firewall.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__allowedType);
                }
                break;
            case "__allowedDataType":
                if (Google_Firewall.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__allowedDataType);
                }
                break;
            case "allowed":
                return ZVal.isNull(this.allowed);
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
            case "sourceTags":
                this.sourceTags = value;
                break;
            case "sourceRanges":
                this.sourceRanges = value;
                break;
            case "network":
                this.network = value;
                break;
            case "targetTags":
                this.targetTags = value;
                break;
            case "__allowedType":
                if (Google_Firewall.class.isAssignableFrom(caller)) {

                    this.__allowedType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__allowedDataType":
                if (Google_Firewall.class.isAssignableFrom(caller)) {

                    this.__allowedDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "allowed":
                this.allowed = value;
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
        ZVal.setProperty(this, Google_Firewall.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Firewall.class, "kind"));
    }

    public Object setDescription(RuntimeEnv env, Object... args) {
        Object description = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Firewall.class, "description", description);

        return null;
    }

    public Object getDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Firewall.class, "description"));
    }

    public Object setSourceTags(RuntimeEnv env, Object... args) {
        Object sourceTags = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Firewall.class, "sourceTags", sourceTags);

        return null;
    }

    public Object getSourceTags(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Firewall.class, "sourceTags"));
    }

    public Object setSourceRanges(RuntimeEnv env, Object... args) {
        Object sourceRanges = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Firewall.class, "sourceRanges", sourceRanges);

        return null;
    }

    public Object getSourceRanges(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Firewall.class, "sourceRanges"));
    }

    public Object setNetwork(RuntimeEnv env, Object... args) {
        Object network = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Firewall.class, "network", network);

        return null;
    }

    public Object getNetwork(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Firewall.class, "network"));
    }

    public Object setTargetTags(RuntimeEnv env, Object... args) {
        Object targetTags = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Firewall.class, "targetTags", targetTags);

        return null;
    }

    public Object getTargetTags(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Firewall.class, "targetTags"));
    }

    public Object setAllowed(RuntimeEnv env, Object... args) {
        Object allowed = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Firewall.class,
                allowed,
                "Google_FirewallAllowed",
                "setAllowed");
        ZVal.setProperty(this, Google_Firewall.class, "allowed", allowed);

        return null;
    }

    public Object getAllowed(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Firewall.class, "allowed"));
    }

    public Object setCreationTimestamp(RuntimeEnv env, Object... args) {
        Object creationTimestamp = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Firewall.class, "creationTimestamp", creationTimestamp);

        return null;
    }

    public Object getCreationTimestamp(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Firewall.class, "creationTimestamp"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Firewall.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Firewall.class, "id"));
    }

    public Object setSelfLink(RuntimeEnv env, Object... args) {
        Object selfLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Firewall.class, "selfLink", selfLink);

        return null;
    }

    public Object getSelfLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Firewall.class, "selfLink"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Firewall.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Firewall.class, "name"));
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
