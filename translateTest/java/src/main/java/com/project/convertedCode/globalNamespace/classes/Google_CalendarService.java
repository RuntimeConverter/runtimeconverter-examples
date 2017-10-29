package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Google_SettingsServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_AclServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_CalendarListServiceResource;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Google_Service;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Google_FreebusyServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_CalendarsServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_EventsServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_ColorsServiceResource;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_CalendarService.php

*/

public class Google_CalendarService extends Google_Service implements RuntimeFileContextInterface {

    public Object freebusy = null;

    public Object settings = null;

    public Object calendarList = null;

    public Object calendars = null;

    public Object acl = null;

    public Object colors = null;

    public Object events = null;

    public Google_CalendarService(RuntimeEnv env, Object... args) {
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
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "freebusy":
                return this.freebusy;
            case "settings":
                return this.settings;
            case "calendarList":
                return this.calendarList;
            case "calendars":
                return this.calendars;
            case "acl":
                return this.acl;
            case "colors":
                return this.colors;
            case "events":
                return this.events;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "freebusy":
                return ZVal.isNull(this.freebusy);
            case "settings":
                return ZVal.isNull(this.settings);
            case "calendarList":
                return ZVal.isNull(this.calendarList);
            case "calendars":
                return ZVal.isNull(this.calendars);
            case "acl":
                return ZVal.isNull(this.acl);
            case "colors":
                return ZVal.isNull(this.colors);
            case "events":
                return ZVal.isNull(this.events);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "freebusy":
                this.freebusy = value;
                break;
            case "settings":
                this.settings = value;
                break;
            case "calendarList":
                this.calendarList = value;
                break;
            case "calendars":
                this.calendars = value;
                break;
            case "acl":
                this.acl = value;
                break;
            case "colors":
                this.colors = value;
                break;
            case "events":
                this.events = value;
                break;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object client = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CalendarService.class, "servicePath", "calendar/v3/");
        ZVal.setProperty(this, Google_CalendarService.class, "version", "v3");
        ZVal.setProperty(this, Google_CalendarService.class, "serviceName", "calendar");
        env.callMethod(
                client,
                "addService",
                Google_CalendarService.class,
                ZVal.getProperty(this, Google_CalendarService.class, "serviceName"),
                ZVal.getProperty(this, Google_CalendarService.class, "version"));
        ZVal.setProperty(
                this,
                Google_CalendarService.class,
                "freebusy",
                new Google_FreebusyServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_CalendarService.class, "serviceName"),
                        "freebusy",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"query\": {\"scopes\": [\"https://www.googleapis.com/auth/calendar\", \"https://www.googleapis.com/auth/calendar.readonly\"], \"request\": {\"$ref\": \"FreeBusyRequest\"}, \"response\": {\"$ref\": \"FreeBusyResponse\"}, \"httpMethod\": \"POST\", \"path\": \"freeBusy\", \"id\": \"calendar.freebusy.query\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_CalendarService.class,
                "settings",
                new Google_SettingsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_CalendarService.class, "serviceName"),
                        "settings",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/calendar\", \"https://www.googleapis.com/auth/calendar.readonly\"], \"path\": \"users/me/settings\", \"response\": {\"$ref\": \"Settings\"}, \"id\": \"calendar.settings.list\", \"httpMethod\": \"GET\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/calendar\", \"https://www.googleapis.com/auth/calendar.readonly\"], \"parameters\": {\"setting\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"calendar.settings.get\", \"httpMethod\": \"GET\", \"path\": \"users/me/settings/{setting}\", \"response\": {\"$ref\": \"Setting\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_CalendarService.class,
                "calendarList",
                new Google_CalendarListServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_CalendarService.class, "serviceName"),
                        "calendarList",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/calendar\"], \"parameters\": {\"colorRgbFormat\": {\"type\": \"boolean\", \"location\": \"query\"}}, \"request\": {\"$ref\": \"CalendarListEntry\"}, \"response\": {\"$ref\": \"CalendarListEntry\"}, \"httpMethod\": \"POST\", \"path\": \"users/me/calendarList\", \"id\": \"calendar.calendarList.insert\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/calendar\", \"https://www.googleapis.com/auth/calendar.readonly\"], \"parameters\": {\"calendarId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"calendar.calendarList.get\", \"httpMethod\": \"GET\", \"path\": \"users/me/calendarList/{calendarId}\", \"response\": {\"$ref\": \"CalendarListEntry\"}}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/calendar\", \"https://www.googleapis.com/auth/calendar.readonly\"], \"parameters\": {\"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"showHidden\": {\"type\": \"boolean\", \"location\": \"query\"}, \"maxResults\": {\"minimum\": \"1\", \"type\": \"integer\", \"location\": \"query\", \"format\": \"int32\"}, \"minAccessRole\": {\"enum\": [\"freeBusyReader\", \"owner\", \"reader\", \"writer\"], \"type\": \"string\", \"location\": \"query\"}}, \"response\": {\"$ref\": \"CalendarList\"}, \"httpMethod\": \"GET\", \"path\": \"users/me/calendarList\", \"id\": \"calendar.calendarList.list\"}, \"update\": {\"scopes\": [\"https://www.googleapis.com/auth/calendar\"], \"parameters\": {\"colorRgbFormat\": {\"type\": \"boolean\", \"location\": \"query\"}, \"calendarId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"CalendarListEntry\"}, \"response\": {\"$ref\": \"CalendarListEntry\"}, \"httpMethod\": \"PUT\", \"path\": \"users/me/calendarList/{calendarId}\", \"id\": \"calendar.calendarList.update\"}, \"patch\": {\"scopes\": [\"https://www.googleapis.com/auth/calendar\"], \"parameters\": {\"colorRgbFormat\": {\"type\": \"boolean\", \"location\": \"query\"}, \"calendarId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"CalendarListEntry\"}, \"response\": {\"$ref\": \"CalendarListEntry\"}, \"httpMethod\": \"PATCH\", \"path\": \"users/me/calendarList/{calendarId}\", \"id\": \"calendar.calendarList.patch\"}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/calendar\"], \"path\": \"users/me/calendarList/{calendarId}\", \"id\": \"calendar.calendarList.delete\", \"parameters\": {\"calendarId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"httpMethod\": \"DELETE\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_CalendarService.class,
                "calendars",
                new Google_CalendarsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_CalendarService.class, "serviceName"),
                        "calendars",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/calendar\"], \"request\": {\"$ref\": \"Calendar\"}, \"response\": {\"$ref\": \"Calendar\"}, \"httpMethod\": \"POST\", \"path\": \"calendars\", \"id\": \"calendar.calendars.insert\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/calendar\", \"https://www.googleapis.com/auth/calendar.readonly\"], \"parameters\": {\"calendarId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"calendar.calendars.get\", \"httpMethod\": \"GET\", \"path\": \"calendars/{calendarId}\", \"response\": {\"$ref\": \"Calendar\"}}, \"clear\": {\"scopes\": [\"https://www.googleapis.com/auth/calendar\"], \"path\": \"calendars/{calendarId}/clear\", \"id\": \"calendar.calendars.clear\", \"parameters\": {\"calendarId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"httpMethod\": \"POST\"}, \"update\": {\"scopes\": [\"https://www.googleapis.com/auth/calendar\"], \"parameters\": {\"calendarId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Calendar\"}, \"response\": {\"$ref\": \"Calendar\"}, \"httpMethod\": \"PUT\", \"path\": \"calendars/{calendarId}\", \"id\": \"calendar.calendars.update\"}, \"patch\": {\"scopes\": [\"https://www.googleapis.com/auth/calendar\"], \"parameters\": {\"calendarId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Calendar\"}, \"response\": {\"$ref\": \"Calendar\"}, \"httpMethod\": \"PATCH\", \"path\": \"calendars/{calendarId}\", \"id\": \"calendar.calendars.patch\"}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/calendar\"], \"path\": \"calendars/{calendarId}\", \"id\": \"calendar.calendars.delete\", \"parameters\": {\"calendarId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"httpMethod\": \"DELETE\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_CalendarService.class,
                "acl",
                new Google_AclServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_CalendarService.class, "serviceName"),
                        "acl",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/calendar\"], \"parameters\": {\"calendarId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"AclRule\"}, \"response\": {\"$ref\": \"AclRule\"}, \"httpMethod\": \"POST\", \"path\": \"calendars/{calendarId}/acl\", \"id\": \"calendar.acl.insert\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/calendar\", \"https://www.googleapis.com/auth/calendar.readonly\"], \"parameters\": {\"calendarId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"ruleId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"calendar.acl.get\", \"httpMethod\": \"GET\", \"path\": \"calendars/{calendarId}/acl/{ruleId}\", \"response\": {\"$ref\": \"AclRule\"}}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/calendar\"], \"parameters\": {\"calendarId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"calendar.acl.list\", \"httpMethod\": \"GET\", \"path\": \"calendars/{calendarId}/acl\", \"response\": {\"$ref\": \"Acl\"}}, \"update\": {\"scopes\": [\"https://www.googleapis.com/auth/calendar\"], \"parameters\": {\"calendarId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"ruleId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"AclRule\"}, \"response\": {\"$ref\": \"AclRule\"}, \"httpMethod\": \"PUT\", \"path\": \"calendars/{calendarId}/acl/{ruleId}\", \"id\": \"calendar.acl.update\"}, \"patch\": {\"scopes\": [\"https://www.googleapis.com/auth/calendar\"], \"parameters\": {\"calendarId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"ruleId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"AclRule\"}, \"response\": {\"$ref\": \"AclRule\"}, \"httpMethod\": \"PATCH\", \"path\": \"calendars/{calendarId}/acl/{ruleId}\", \"id\": \"calendar.acl.patch\"}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/calendar\"], \"path\": \"calendars/{calendarId}/acl/{ruleId}\", \"id\": \"calendar.acl.delete\", \"parameters\": {\"calendarId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"ruleId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"httpMethod\": \"DELETE\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_CalendarService.class,
                "colors",
                new Google_ColorsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_CalendarService.class, "serviceName"),
                        "colors",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"get\": {\"scopes\": [\"https://www.googleapis.com/auth/calendar\", \"https://www.googleapis.com/auth/calendar.readonly\"], \"path\": \"colors\", \"response\": {\"$ref\": \"Colors\"}, \"id\": \"calendar.colors.get\", \"httpMethod\": \"GET\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_CalendarService.class,
                "events",
                new Google_EventsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_CalendarService.class, "serviceName"),
                        "events",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/calendar\"], \"parameters\": {\"calendarId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"sendNotifications\": {\"type\": \"boolean\", \"location\": \"query\"}}, \"request\": {\"$ref\": \"Event\"}, \"response\": {\"$ref\": \"Event\"}, \"httpMethod\": \"POST\", \"path\": \"calendars/{calendarId}/events\", \"id\": \"calendar.events.insert\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/calendar\", \"https://www.googleapis.com/auth/calendar.readonly\"], \"parameters\": {\"eventId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"timeZone\": {\"type\": \"string\", \"location\": \"query\"}, \"calendarId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"alwaysIncludeEmail\": {\"type\": \"boolean\", \"location\": \"query\"}, \"maxAttendees\": {\"minimum\": \"1\", \"type\": \"integer\", \"location\": \"query\", \"format\": \"int32\"}}, \"id\": \"calendar.events.get\", \"httpMethod\": \"GET\", \"path\": \"calendars/{calendarId}/events/{eventId}\", \"response\": {\"$ref\": \"Event\"}}, \"move\": {\"scopes\": [\"https://www.googleapis.com/auth/calendar\"], \"parameters\": {\"eventId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"destination\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"calendarId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"sendNotifications\": {\"type\": \"boolean\", \"location\": \"query\"}}, \"id\": \"calendar.events.move\", \"httpMethod\": \"POST\", \"path\": \"calendars/{calendarId}/events/{eventId}/move\", \"response\": {\"$ref\": \"Event\"}}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/calendar\", \"https://www.googleapis.com/auth/calendar.readonly\"], \"parameters\": {\"orderBy\": {\"enum\": [\"startTime\", \"updated\"], \"type\": \"string\", \"location\": \"query\"}, \"showHiddenInvitations\": {\"type\": \"boolean\", \"location\": \"query\"}, \"showDeleted\": {\"type\": \"boolean\", \"location\": \"query\"}, \"iCalUID\": {\"type\": \"string\", \"location\": \"query\"}, \"updatedMin\": {\"type\": \"string\", \"location\": \"query\", \"format\": \"date-time\"}, \"singleEvents\": {\"type\": \"boolean\", \"location\": \"query\"}, \"alwaysIncludeEmail\": {\"type\": \"boolean\", \"location\": \"query\"}, \"maxResults\": {\"minimum\": \"1\", \"type\": \"integer\", \"location\": \"query\", \"format\": \"int32\"}, \"q\": {\"type\": \"string\", \"location\": \"query\"}, \"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"calendarId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"timeMin\": {\"type\": \"string\", \"location\": \"query\", \"format\": \"date-time\"}, \"timeZone\": {\"type\": \"string\", \"location\": \"query\"}, \"timeMax\": {\"type\": \"string\", \"location\": \"query\", \"format\": \"date-time\"}, \"maxAttendees\": {\"minimum\": \"1\", \"type\": \"integer\", \"location\": \"query\", \"format\": \"int32\"}}, \"id\": \"calendar.events.list\", \"httpMethod\": \"GET\", \"path\": \"calendars/{calendarId}/events\", \"response\": {\"$ref\": \"Events\"}}, \"update\": {\"scopes\": [\"https://www.googleapis.com/auth/calendar\"], \"parameters\": {\"eventId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"calendarId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"alwaysIncludeEmail\": {\"type\": \"boolean\", \"location\": \"query\"}, \"sendNotifications\": {\"type\": \"boolean\", \"location\": \"query\"}}, \"request\": {\"$ref\": \"Event\"}, \"response\": {\"$ref\": \"Event\"}, \"httpMethod\": \"PUT\", \"path\": \"calendars/{calendarId}/events/{eventId}\", \"id\": \"calendar.events.update\"}, \"patch\": {\"scopes\": [\"https://www.googleapis.com/auth/calendar\"], \"parameters\": {\"eventId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"calendarId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"alwaysIncludeEmail\": {\"type\": \"boolean\", \"location\": \"query\"}, \"sendNotifications\": {\"type\": \"boolean\", \"location\": \"query\"}}, \"request\": {\"$ref\": \"Event\"}, \"response\": {\"$ref\": \"Event\"}, \"httpMethod\": \"PATCH\", \"path\": \"calendars/{calendarId}/events/{eventId}\", \"id\": \"calendar.events.patch\"}, \"instances\": {\"scopes\": [\"https://www.googleapis.com/auth/calendar\", \"https://www.googleapis.com/auth/calendar.readonly\"], \"parameters\": {\"eventId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"showDeleted\": {\"type\": \"boolean\", \"location\": \"query\"}, \"alwaysIncludeEmail\": {\"type\": \"boolean\", \"location\": \"query\"}, \"maxResults\": {\"minimum\": \"1\", \"type\": \"integer\", \"location\": \"query\", \"format\": \"int32\"}, \"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"calendarId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"timeZone\": {\"type\": \"string\", \"location\": \"query\"}, \"originalStart\": {\"type\": \"string\", \"location\": \"query\"}, \"maxAttendees\": {\"minimum\": \"1\", \"type\": \"integer\", \"location\": \"query\", \"format\": \"int32\"}}, \"id\": \"calendar.events.instances\", \"httpMethod\": \"GET\", \"path\": \"calendars/{calendarId}/events/{eventId}/instances\", \"response\": {\"$ref\": \"Events\"}}, \"import\": {\"scopes\": [\"https://www.googleapis.com/auth/calendar\"], \"parameters\": {\"calendarId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Event\"}, \"response\": {\"$ref\": \"Event\"}, \"httpMethod\": \"POST\", \"path\": \"calendars/{calendarId}/events/import\", \"id\": \"calendar.events.import\"}, \"quickAdd\": {\"scopes\": [\"https://www.googleapis.com/auth/calendar\"], \"parameters\": {\"text\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"calendarId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"sendNotifications\": {\"type\": \"boolean\", \"location\": \"query\"}}, \"id\": \"calendar.events.quickAdd\", \"httpMethod\": \"POST\", \"path\": \"calendars/{calendarId}/events/quickAdd\", \"response\": {\"$ref\": \"Event\"}}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/calendar\"], \"path\": \"calendars/{calendarId}/events/{eventId}\", \"id\": \"calendar.events.delete\", \"parameters\": {\"eventId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"calendarId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"sendNotifications\": {\"type\": \"boolean\", \"location\": \"query\"}}, \"httpMethod\": \"DELETE\"}}}",
                                true)));

        return null;
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
