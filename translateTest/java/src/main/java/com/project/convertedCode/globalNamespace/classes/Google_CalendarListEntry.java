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

 google-api-php-client/src/contrib/Google_CalendarService.php

*/

public class Google_CalendarListEntry extends Google_Model implements RuntimeFileContextInterface {

    public Object kind = null;

    public Object foregroundColor = null;

    public Object __defaultRemindersType = "Google_EventReminder";

    public Object __defaultRemindersDataType = "array";

    public Object defaultReminders = null;

    public Object description = null;

    public Object colorId = null;

    public Object selected = null;

    public Object summary = null;

    public Object etag = null;

    public Object location = null;

    public Object backgroundColor = null;

    public Object summaryOverride = null;

    public Object timeZone = null;

    public Object hidden = null;

    public Object accessRole = null;

    public Object id = null;

    public Google_CalendarListEntry(RuntimeEnv env, Object... args) {
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
            case "setForegroundColor":
                return this.setForegroundColor(env, args);
            case "getForegroundColor":
                return this.getForegroundColor(env, args);
            case "setDefaultReminders":
                return this.setDefaultReminders(env, args);
            case "getDefaultReminders":
                return this.getDefaultReminders(env, args);
            case "setDescription":
                return this.setDescription(env, args);
            case "getDescription":
                return this.getDescription(env, args);
            case "setColorId":
                return this.setColorId(env, args);
            case "getColorId":
                return this.getColorId(env, args);
            case "setSelected":
                return this.setSelected(env, args);
            case "getSelected":
                return this.getSelected(env, args);
            case "setSummary":
                return this.setSummary(env, args);
            case "getSummary":
                return this.getSummary(env, args);
            case "setEtag":
                return this.setEtag(env, args);
            case "getEtag":
                return this.getEtag(env, args);
            case "setLocation":
                return this.setLocation(env, args);
            case "getLocation":
                return this.getLocation(env, args);
            case "setBackgroundColor":
                return this.setBackgroundColor(env, args);
            case "getBackgroundColor":
                return this.getBackgroundColor(env, args);
            case "setSummaryOverride":
                return this.setSummaryOverride(env, args);
            case "getSummaryOverride":
                return this.getSummaryOverride(env, args);
            case "setTimeZone":
                return this.setTimeZone(env, args);
            case "getTimeZone":
                return this.getTimeZone(env, args);
            case "setHidden":
                return this.setHidden(env, args);
            case "getHidden":
                return this.getHidden(env, args);
            case "setAccessRole":
                return this.setAccessRole(env, args);
            case "getAccessRole":
                return this.getAccessRole(env, args);
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
            case "kind":
                return this.kind;
            case "foregroundColor":
                return this.foregroundColor;
            case "__defaultRemindersType":
                if (Google_CalendarListEntry.class.isAssignableFrom(caller)) {

                    return this.__defaultRemindersType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__defaultRemindersDataType":
                if (Google_CalendarListEntry.class.isAssignableFrom(caller)) {

                    return this.__defaultRemindersDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "defaultReminders":
                return this.defaultReminders;
            case "description":
                return this.description;
            case "colorId":
                return this.colorId;
            case "selected":
                return this.selected;
            case "summary":
                return this.summary;
            case "etag":
                return this.etag;
            case "location":
                return this.location;
            case "backgroundColor":
                return this.backgroundColor;
            case "summaryOverride":
                return this.summaryOverride;
            case "timeZone":
                return this.timeZone;
            case "hidden":
                return this.hidden;
            case "accessRole":
                return this.accessRole;
            case "id":
                return this.id;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return ZVal.isNull(this.kind);
            case "foregroundColor":
                return ZVal.isNull(this.foregroundColor);
            case "__defaultRemindersType":
                if (Google_CalendarListEntry.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__defaultRemindersType);
                }
                break;
            case "__defaultRemindersDataType":
                if (Google_CalendarListEntry.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__defaultRemindersDataType);
                }
                break;
            case "defaultReminders":
                return ZVal.isNull(this.defaultReminders);
            case "description":
                return ZVal.isNull(this.description);
            case "colorId":
                return ZVal.isNull(this.colorId);
            case "selected":
                return ZVal.isNull(this.selected);
            case "summary":
                return ZVal.isNull(this.summary);
            case "etag":
                return ZVal.isNull(this.etag);
            case "location":
                return ZVal.isNull(this.location);
            case "backgroundColor":
                return ZVal.isNull(this.backgroundColor);
            case "summaryOverride":
                return ZVal.isNull(this.summaryOverride);
            case "timeZone":
                return ZVal.isNull(this.timeZone);
            case "hidden":
                return ZVal.isNull(this.hidden);
            case "accessRole":
                return ZVal.isNull(this.accessRole);
            case "id":
                return ZVal.isNull(this.id);
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
            case "foregroundColor":
                this.foregroundColor = value;
                break;
            case "__defaultRemindersType":
                if (Google_CalendarListEntry.class.isAssignableFrom(caller)) {

                    this.__defaultRemindersType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__defaultRemindersDataType":
                if (Google_CalendarListEntry.class.isAssignableFrom(caller)) {

                    this.__defaultRemindersDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "defaultReminders":
                this.defaultReminders = value;
                break;
            case "description":
                this.description = value;
                break;
            case "colorId":
                this.colorId = value;
                break;
            case "selected":
                this.selected = value;
                break;
            case "summary":
                this.summary = value;
                break;
            case "etag":
                this.etag = value;
                break;
            case "location":
                this.location = value;
                break;
            case "backgroundColor":
                this.backgroundColor = value;
                break;
            case "summaryOverride":
                this.summaryOverride = value;
                break;
            case "timeZone":
                this.timeZone = value;
                break;
            case "hidden":
                this.hidden = value;
                break;
            case "accessRole":
                this.accessRole = value;
                break;
            case "id":
                this.id = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CalendarListEntry.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CalendarListEntry.class, "kind"));
    }

    public Object setForegroundColor(RuntimeEnv env, Object... args) {
        Object foregroundColor = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CalendarListEntry.class, "foregroundColor", foregroundColor);

        return null;
    }

    public Object getForegroundColor(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_CalendarListEntry.class, "foregroundColor"));
    }

    public Object setDefaultReminders(RuntimeEnv env, Object... args) {
        Object defaultReminders = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_CalendarListEntry.class,
                defaultReminders,
                "Google_EventReminder",
                "setDefaultReminders");
        ZVal.setProperty(
                this, Google_CalendarListEntry.class, "defaultReminders", defaultReminders);

        return null;
    }

    public Object getDefaultReminders(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_CalendarListEntry.class, "defaultReminders"));
    }

    public Object setDescription(RuntimeEnv env, Object... args) {
        Object description = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CalendarListEntry.class, "description", description);

        return null;
    }

    public Object getDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CalendarListEntry.class, "description"));
    }

    public Object setColorId(RuntimeEnv env, Object... args) {
        Object colorId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CalendarListEntry.class, "colorId", colorId);

        return null;
    }

    public Object getColorId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CalendarListEntry.class, "colorId"));
    }

    public Object setSelected(RuntimeEnv env, Object... args) {
        Object selected = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CalendarListEntry.class, "selected", selected);

        return null;
    }

    public Object getSelected(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CalendarListEntry.class, "selected"));
    }

    public Object setSummary(RuntimeEnv env, Object... args) {
        Object summary = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CalendarListEntry.class, "summary", summary);

        return null;
    }

    public Object getSummary(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CalendarListEntry.class, "summary"));
    }

    public Object setEtag(RuntimeEnv env, Object... args) {
        Object etag = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CalendarListEntry.class, "etag", etag);

        return null;
    }

    public Object getEtag(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CalendarListEntry.class, "etag"));
    }

    public Object setLocation(RuntimeEnv env, Object... args) {
        Object location = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CalendarListEntry.class, "location", location);

        return null;
    }

    public Object getLocation(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CalendarListEntry.class, "location"));
    }

    public Object setBackgroundColor(RuntimeEnv env, Object... args) {
        Object backgroundColor = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CalendarListEntry.class, "backgroundColor", backgroundColor);

        return null;
    }

    public Object getBackgroundColor(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_CalendarListEntry.class, "backgroundColor"));
    }

    public Object setSummaryOverride(RuntimeEnv env, Object... args) {
        Object summaryOverride = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CalendarListEntry.class, "summaryOverride", summaryOverride);

        return null;
    }

    public Object getSummaryOverride(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_CalendarListEntry.class, "summaryOverride"));
    }

    public Object setTimeZone(RuntimeEnv env, Object... args) {
        Object timeZone = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CalendarListEntry.class, "timeZone", timeZone);

        return null;
    }

    public Object getTimeZone(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CalendarListEntry.class, "timeZone"));
    }

    public Object setHidden(RuntimeEnv env, Object... args) {
        Object hidden = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CalendarListEntry.class, "hidden", hidden);

        return null;
    }

    public Object getHidden(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CalendarListEntry.class, "hidden"));
    }

    public Object setAccessRole(RuntimeEnv env, Object... args) {
        Object accessRole = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CalendarListEntry.class, "accessRole", accessRole);

        return null;
    }

    public Object getAccessRole(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CalendarListEntry.class, "accessRole"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CalendarListEntry.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CalendarListEntry.class, "id"));
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
