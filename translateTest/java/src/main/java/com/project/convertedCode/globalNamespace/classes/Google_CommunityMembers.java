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

 google-api-php-client/src/contrib/Google_OrkutService.php

*/

public class Google_CommunityMembers extends Google_Model implements RuntimeFileContextInterface {

    public Object __communityMembershipStatusType = "Google_CommunityMembershipStatus";

    public Object __communityMembershipStatusDataType = "";

    public Object communityMembershipStatus = null;

    public Object __personType = "Google_OrkutActivitypersonResource";

    public Object __personDataType = "";

    public Object person = null;

    public Object kind = null;

    public Google_CommunityMembers(RuntimeEnv env, Object... args) {
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
            case "setCommunityMembershipStatus":
                return this.setCommunityMembershipStatus(env, args);
            case "getCommunityMembershipStatus":
                return this.getCommunityMembershipStatus(env, args);
            case "setPerson":
                return this.setPerson(env, args);
            case "getPerson":
                return this.getPerson(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__communityMembershipStatusType":
                if (Google_CommunityMembers.class.isAssignableFrom(caller)) {

                    return this.__communityMembershipStatusType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__communityMembershipStatusDataType":
                if (Google_CommunityMembers.class.isAssignableFrom(caller)) {

                    return this.__communityMembershipStatusDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "communityMembershipStatus":
                return this.communityMembershipStatus;
            case "__personType":
                if (Google_CommunityMembers.class.isAssignableFrom(caller)) {

                    return this.__personType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__personDataType":
                if (Google_CommunityMembers.class.isAssignableFrom(caller)) {

                    return this.__personDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "person":
                return this.person;
            case "kind":
                return this.kind;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__communityMembershipStatusType":
                if (Google_CommunityMembers.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__communityMembershipStatusType);
                }
                break;
            case "__communityMembershipStatusDataType":
                if (Google_CommunityMembers.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__communityMembershipStatusDataType);
                }
                break;
            case "communityMembershipStatus":
                return ZVal.isNull(this.communityMembershipStatus);
            case "__personType":
                if (Google_CommunityMembers.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__personType);
                }
                break;
            case "__personDataType":
                if (Google_CommunityMembers.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__personDataType);
                }
                break;
            case "person":
                return ZVal.isNull(this.person);
            case "kind":
                return ZVal.isNull(this.kind);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__communityMembershipStatusType":
                if (Google_CommunityMembers.class.isAssignableFrom(caller)) {

                    this.__communityMembershipStatusType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__communityMembershipStatusDataType":
                if (Google_CommunityMembers.class.isAssignableFrom(caller)) {

                    this.__communityMembershipStatusDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "communityMembershipStatus":
                this.communityMembershipStatus = value;
                break;
            case "__personType":
                if (Google_CommunityMembers.class.isAssignableFrom(caller)) {

                    this.__personType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__personDataType":
                if (Google_CommunityMembers.class.isAssignableFrom(caller)) {

                    this.__personDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "person":
                this.person = value;
                break;
            case "kind":
                this.kind = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setCommunityMembershipStatus(RuntimeEnv env, Object... args) {
        Object communityMembershipStatus = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_CommunityMembers.class,
                "communityMembershipStatus",
                communityMembershipStatus);

        return null;
    }

    public Object getCommunityMembershipStatus(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_CommunityMembers.class, "communityMembershipStatus"));
    }

    public Object setPerson(RuntimeEnv env, Object... args) {
        Object person = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityMembers.class, "person", person);

        return null;
    }

    public Object getPerson(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityMembers.class, "person"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityMembers.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityMembers.class, "kind"));
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
