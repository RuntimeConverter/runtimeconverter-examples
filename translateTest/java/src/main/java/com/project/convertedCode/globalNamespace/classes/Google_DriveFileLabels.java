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

 google-api-php-client/src/contrib/Google_DriveService.php

*/

public class Google_DriveFileLabels extends Google_Model implements RuntimeFileContextInterface {

    public Object restricted = null;

    public Object hidden = null;

    public Object viewed = null;

    public Object starred = null;

    public Object trashed = null;

    public Google_DriveFileLabels(RuntimeEnv env, Object... args) {
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
            case "setRestricted":
                return this.setRestricted(env, args);
            case "getRestricted":
                return this.getRestricted(env, args);
            case "setHidden":
                return this.setHidden(env, args);
            case "getHidden":
                return this.getHidden(env, args);
            case "setViewed":
                return this.setViewed(env, args);
            case "getViewed":
                return this.getViewed(env, args);
            case "setStarred":
                return this.setStarred(env, args);
            case "getStarred":
                return this.getStarred(env, args);
            case "setTrashed":
                return this.setTrashed(env, args);
            case "getTrashed":
                return this.getTrashed(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "restricted":
                return this.restricted;
            case "hidden":
                return this.hidden;
            case "viewed":
                return this.viewed;
            case "starred":
                return this.starred;
            case "trashed":
                return this.trashed;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "restricted":
                return ZVal.isNull(this.restricted);
            case "hidden":
                return ZVal.isNull(this.hidden);
            case "viewed":
                return ZVal.isNull(this.viewed);
            case "starred":
                return ZVal.isNull(this.starred);
            case "trashed":
                return ZVal.isNull(this.trashed);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "restricted":
                this.restricted = value;
                break;
            case "hidden":
                this.hidden = value;
                break;
            case "viewed":
                this.viewed = value;
                break;
            case "starred":
                this.starred = value;
                break;
            case "trashed":
                this.trashed = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setRestricted(RuntimeEnv env, Object... args) {
        Object restricted = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DriveFileLabels.class, "restricted", restricted);

        return null;
    }

    public Object getRestricted(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DriveFileLabels.class, "restricted"));
    }

    public Object setHidden(RuntimeEnv env, Object... args) {
        Object hidden = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DriveFileLabels.class, "hidden", hidden);

        return null;
    }

    public Object getHidden(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DriveFileLabels.class, "hidden"));
    }

    public Object setViewed(RuntimeEnv env, Object... args) {
        Object viewed = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DriveFileLabels.class, "viewed", viewed);

        return null;
    }

    public Object getViewed(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DriveFileLabels.class, "viewed"));
    }

    public Object setStarred(RuntimeEnv env, Object... args) {
        Object starred = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DriveFileLabels.class, "starred", starred);

        return null;
    }

    public Object getStarred(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DriveFileLabels.class, "starred"));
    }

    public Object setTrashed(RuntimeEnv env, Object... args) {
        Object trashed = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DriveFileLabels.class, "trashed", trashed);

        return null;
    }

    public Object getTrashed(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DriveFileLabels.class, "trashed"));
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
