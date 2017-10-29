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

public class Google_CommunityMembershipStatus extends Google_Model
        implements RuntimeFileContextInterface {

    public Object status = null;

    public Object isFollowing = null;

    public Object isRestoreAvailable = null;

    public Object isModerator = null;

    public Object kind = null;

    public Object isCoOwner = null;

    public Object canCreatePoll = null;

    public Object canShout = null;

    public Object isOwner = null;

    public Object canCreateTopic = null;

    public Object isTakebackAvailable = null;

    public Google_CommunityMembershipStatus(RuntimeEnv env, Object... args) {
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
            case "setIsFollowing":
                return this.setIsFollowing(env, args);
            case "getIsFollowing":
                return this.getIsFollowing(env, args);
            case "setIsRestoreAvailable":
                return this.setIsRestoreAvailable(env, args);
            case "getIsRestoreAvailable":
                return this.getIsRestoreAvailable(env, args);
            case "setIsModerator":
                return this.setIsModerator(env, args);
            case "getIsModerator":
                return this.getIsModerator(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setIsCoOwner":
                return this.setIsCoOwner(env, args);
            case "getIsCoOwner":
                return this.getIsCoOwner(env, args);
            case "setCanCreatePoll":
                return this.setCanCreatePoll(env, args);
            case "getCanCreatePoll":
                return this.getCanCreatePoll(env, args);
            case "setCanShout":
                return this.setCanShout(env, args);
            case "getCanShout":
                return this.getCanShout(env, args);
            case "setIsOwner":
                return this.setIsOwner(env, args);
            case "getIsOwner":
                return this.getIsOwner(env, args);
            case "setCanCreateTopic":
                return this.setCanCreateTopic(env, args);
            case "getCanCreateTopic":
                return this.getCanCreateTopic(env, args);
            case "setIsTakebackAvailable":
                return this.setIsTakebackAvailable(env, args);
            case "getIsTakebackAvailable":
                return this.getIsTakebackAvailable(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "status":
                return this.status;
            case "isFollowing":
                return this.isFollowing;
            case "isRestoreAvailable":
                return this.isRestoreAvailable;
            case "isModerator":
                return this.isModerator;
            case "kind":
                return this.kind;
            case "isCoOwner":
                return this.isCoOwner;
            case "canCreatePoll":
                return this.canCreatePoll;
            case "canShout":
                return this.canShout;
            case "isOwner":
                return this.isOwner;
            case "canCreateTopic":
                return this.canCreateTopic;
            case "isTakebackAvailable":
                return this.isTakebackAvailable;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "status":
                return ZVal.isNull(this.status);
            case "isFollowing":
                return ZVal.isNull(this.isFollowing);
            case "isRestoreAvailable":
                return ZVal.isNull(this.isRestoreAvailable);
            case "isModerator":
                return ZVal.isNull(this.isModerator);
            case "kind":
                return ZVal.isNull(this.kind);
            case "isCoOwner":
                return ZVal.isNull(this.isCoOwner);
            case "canCreatePoll":
                return ZVal.isNull(this.canCreatePoll);
            case "canShout":
                return ZVal.isNull(this.canShout);
            case "isOwner":
                return ZVal.isNull(this.isOwner);
            case "canCreateTopic":
                return ZVal.isNull(this.canCreateTopic);
            case "isTakebackAvailable":
                return ZVal.isNull(this.isTakebackAvailable);
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
            case "isFollowing":
                this.isFollowing = value;
                break;
            case "isRestoreAvailable":
                this.isRestoreAvailable = value;
                break;
            case "isModerator":
                this.isModerator = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "isCoOwner":
                this.isCoOwner = value;
                break;
            case "canCreatePoll":
                this.canCreatePoll = value;
                break;
            case "canShout":
                this.canShout = value;
                break;
            case "isOwner":
                this.isOwner = value;
                break;
            case "canCreateTopic":
                this.canCreateTopic = value;
                break;
            case "isTakebackAvailable":
                this.isTakebackAvailable = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setStatus(RuntimeEnv env, Object... args) {
        Object status = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityMembershipStatus.class, "status", status);

        return null;
    }

    public Object getStatus(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_CommunityMembershipStatus.class, "status"));
    }

    public Object setIsFollowing(RuntimeEnv env, Object... args) {
        Object isFollowing = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityMembershipStatus.class, "isFollowing", isFollowing);

        return null;
    }

    public Object getIsFollowing(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_CommunityMembershipStatus.class, "isFollowing"));
    }

    public Object setIsRestoreAvailable(RuntimeEnv env, Object... args) {
        Object isRestoreAvailable = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_CommunityMembershipStatus.class,
                "isRestoreAvailable",
                isRestoreAvailable);

        return null;
    }

    public Object getIsRestoreAvailable(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_CommunityMembershipStatus.class, "isRestoreAvailable"));
    }

    public Object setIsModerator(RuntimeEnv env, Object... args) {
        Object isModerator = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityMembershipStatus.class, "isModerator", isModerator);

        return null;
    }

    public Object getIsModerator(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_CommunityMembershipStatus.class, "isModerator"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityMembershipStatus.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityMembershipStatus.class, "kind"));
    }

    public Object setIsCoOwner(RuntimeEnv env, Object... args) {
        Object isCoOwner = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityMembershipStatus.class, "isCoOwner", isCoOwner);

        return null;
    }

    public Object getIsCoOwner(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_CommunityMembershipStatus.class, "isCoOwner"));
    }

    public Object setCanCreatePoll(RuntimeEnv env, Object... args) {
        Object canCreatePoll = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_CommunityMembershipStatus.class, "canCreatePoll", canCreatePoll);

        return null;
    }

    public Object getCanCreatePoll(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_CommunityMembershipStatus.class, "canCreatePoll"));
    }

    public Object setCanShout(RuntimeEnv env, Object... args) {
        Object canShout = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityMembershipStatus.class, "canShout", canShout);

        return null;
    }

    public Object getCanShout(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_CommunityMembershipStatus.class, "canShout"));
    }

    public Object setIsOwner(RuntimeEnv env, Object... args) {
        Object isOwner = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityMembershipStatus.class, "isOwner", isOwner);

        return null;
    }

    public Object getIsOwner(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_CommunityMembershipStatus.class, "isOwner"));
    }

    public Object setCanCreateTopic(RuntimeEnv env, Object... args) {
        Object canCreateTopic = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_CommunityMembershipStatus.class, "canCreateTopic", canCreateTopic);

        return null;
    }

    public Object getCanCreateTopic(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_CommunityMembershipStatus.class, "canCreateTopic"));
    }

    public Object setIsTakebackAvailable(RuntimeEnv env, Object... args) {
        Object isTakebackAvailable = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_CommunityMembershipStatus.class,
                "isTakebackAvailable",
                isTakebackAvailable);

        return null;
    }

    public Object getIsTakebackAvailable(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_CommunityMembershipStatus.class, "isTakebackAvailable"));
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
