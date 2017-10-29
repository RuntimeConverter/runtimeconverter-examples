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

public class Google_Badge extends Google_Model implements RuntimeFileContextInterface {

    public Object badgeSmallLogo = null;

    public Object kind = null;

    public Object description = null;

    public Object sponsorLogo = null;

    public Object sponsorName = null;

    public Object badgeLargeLogo = null;

    public Object caption = null;

    public Object sponsorUrl = null;

    public Object id = null;

    public Google_Badge(RuntimeEnv env, Object... args) {
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
            case "setBadgeSmallLogo":
                return this.setBadgeSmallLogo(env, args);
            case "getBadgeSmallLogo":
                return this.getBadgeSmallLogo(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setDescription":
                return this.setDescription(env, args);
            case "getDescription":
                return this.getDescription(env, args);
            case "setSponsorLogo":
                return this.setSponsorLogo(env, args);
            case "getSponsorLogo":
                return this.getSponsorLogo(env, args);
            case "setSponsorName":
                return this.setSponsorName(env, args);
            case "getSponsorName":
                return this.getSponsorName(env, args);
            case "setBadgeLargeLogo":
                return this.setBadgeLargeLogo(env, args);
            case "getBadgeLargeLogo":
                return this.getBadgeLargeLogo(env, args);
            case "setCaption":
                return this.setCaption(env, args);
            case "getCaption":
                return this.getCaption(env, args);
            case "setSponsorUrl":
                return this.setSponsorUrl(env, args);
            case "getSponsorUrl":
                return this.getSponsorUrl(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "badgeSmallLogo":
                return this.badgeSmallLogo;
            case "kind":
                return this.kind;
            case "description":
                return this.description;
            case "sponsorLogo":
                return this.sponsorLogo;
            case "sponsorName":
                return this.sponsorName;
            case "badgeLargeLogo":
                return this.badgeLargeLogo;
            case "caption":
                return this.caption;
            case "sponsorUrl":
                return this.sponsorUrl;
            case "id":
                return this.id;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "badgeSmallLogo":
                return ZVal.isNull(this.badgeSmallLogo);
            case "kind":
                return ZVal.isNull(this.kind);
            case "description":
                return ZVal.isNull(this.description);
            case "sponsorLogo":
                return ZVal.isNull(this.sponsorLogo);
            case "sponsorName":
                return ZVal.isNull(this.sponsorName);
            case "badgeLargeLogo":
                return ZVal.isNull(this.badgeLargeLogo);
            case "caption":
                return ZVal.isNull(this.caption);
            case "sponsorUrl":
                return ZVal.isNull(this.sponsorUrl);
            case "id":
                return ZVal.isNull(this.id);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "badgeSmallLogo":
                this.badgeSmallLogo = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "description":
                this.description = value;
                break;
            case "sponsorLogo":
                this.sponsorLogo = value;
                break;
            case "sponsorName":
                this.sponsorName = value;
                break;
            case "badgeLargeLogo":
                this.badgeLargeLogo = value;
                break;
            case "caption":
                this.caption = value;
                break;
            case "sponsorUrl":
                this.sponsorUrl = value;
                break;
            case "id":
                this.id = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setBadgeSmallLogo(RuntimeEnv env, Object... args) {
        Object badgeSmallLogo = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Badge.class, "badgeSmallLogo", badgeSmallLogo);

        return null;
    }

    public Object getBadgeSmallLogo(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Badge.class, "badgeSmallLogo"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Badge.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Badge.class, "kind"));
    }

    public Object setDescription(RuntimeEnv env, Object... args) {
        Object description = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Badge.class, "description", description);

        return null;
    }

    public Object getDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Badge.class, "description"));
    }

    public Object setSponsorLogo(RuntimeEnv env, Object... args) {
        Object sponsorLogo = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Badge.class, "sponsorLogo", sponsorLogo);

        return null;
    }

    public Object getSponsorLogo(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Badge.class, "sponsorLogo"));
    }

    public Object setSponsorName(RuntimeEnv env, Object... args) {
        Object sponsorName = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Badge.class, "sponsorName", sponsorName);

        return null;
    }

    public Object getSponsorName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Badge.class, "sponsorName"));
    }

    public Object setBadgeLargeLogo(RuntimeEnv env, Object... args) {
        Object badgeLargeLogo = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Badge.class, "badgeLargeLogo", badgeLargeLogo);

        return null;
    }

    public Object getBadgeLargeLogo(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Badge.class, "badgeLargeLogo"));
    }

    public Object setCaption(RuntimeEnv env, Object... args) {
        Object caption = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Badge.class, "caption", caption);

        return null;
    }

    public Object getCaption(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Badge.class, "caption"));
    }

    public Object setSponsorUrl(RuntimeEnv env, Object... args) {
        Object sponsorUrl = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Badge.class, "sponsorUrl", sponsorUrl);

        return null;
    }

    public Object getSponsorUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Badge.class, "sponsorUrl"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Badge.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Badge.class, "id"));
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
