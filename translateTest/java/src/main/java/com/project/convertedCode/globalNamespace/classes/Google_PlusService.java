package com.project.convertedCode.globalNamespace.classes;

import com.project.convertedCode.globalNamespace.classes.Google_CommentsServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_PeopleServiceResource;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Google_ActivitiesServiceResource;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Google_Service;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_PlusService.php

*/

public class Google_PlusService extends Google_Service implements RuntimeFileContextInterface {

    public Object activities = null;

    public Object comments = null;

    public Object people = null;

    public Google_PlusService(RuntimeEnv env, Object... args) {
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
            case "activities":
                return this.activities;
            case "comments":
                return this.comments;
            case "people":
                return this.people;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "activities":
                return ZVal.isNull(this.activities);
            case "comments":
                return ZVal.isNull(this.comments);
            case "people":
                return ZVal.isNull(this.people);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "activities":
                this.activities = value;
                break;
            case "comments":
                this.comments = value;
                break;
            case "people":
                this.people = value;
                break;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object client = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_PlusService.class, "servicePath", "plus/v1/");
        ZVal.setProperty(this, Google_PlusService.class, "version", "v1");
        ZVal.setProperty(this, Google_PlusService.class, "serviceName", "plus");
        env.callMethod(
                client,
                "addService",
                Google_PlusService.class,
                ZVal.getProperty(this, Google_PlusService.class, "serviceName"),
                ZVal.getProperty(this, Google_PlusService.class, "version"));
        ZVal.setProperty(
                this,
                Google_PlusService.class,
                "activities",
                new Google_ActivitiesServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_PlusService.class, "serviceName"),
                        "activities",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"search\": {\"scopes\": [\"https://www.googleapis.com/auth/plus.me\"], \"parameters\": {\"orderBy\": {\"default\": \"recent\", \"enum\": [\"best\", \"recent\"], \"type\": \"string\", \"location\": \"query\"}, \"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"maxResults\": {\"format\": \"uint32\", \"default\": \"10\", \"maximum\": \"20\", \"minimum\": \"1\", \"location\": \"query\", \"type\": \"integer\"}, \"language\": {\"default\": \"\", \"type\": \"string\", \"location\": \"query\"}, \"query\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}}, \"id\": \"plus.activities.search\", \"httpMethod\": \"GET\", \"path\": \"activities\", \"response\": {\"$ref\": \"ActivityFeed\"}}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/plus.me\"], \"parameters\": {\"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"alt\": {\"default\": \"json\", \"enum\": [\"json\"], \"type\": \"string\", \"location\": \"query\"}, \"userId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"maxResults\": {\"format\": \"uint32\", \"default\": \"20\", \"maximum\": \"100\", \"minimum\": \"1\", \"location\": \"query\", \"type\": \"integer\"}, \"collection\": {\"required\": true, \"type\": \"string\", \"location\": \"path\", \"enum\": [\"public\"]}}, \"id\": \"plus.activities.list\", \"httpMethod\": \"GET\", \"path\": \"people/{userId}/activities/{collection}\", \"response\": {\"$ref\": \"ActivityFeed\"}}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/plus.me\"], \"parameters\": {\"activityId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"alt\": {\"default\": \"json\", \"enum\": [\"json\"], \"type\": \"string\", \"location\": \"query\"}}, \"id\": \"plus.activities.get\", \"httpMethod\": \"GET\", \"path\": \"activities/{activityId}\", \"response\": {\"$ref\": \"Activity\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_PlusService.class,
                "comments",
                new Google_CommentsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_PlusService.class, "serviceName"),
                        "comments",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/plus.me\"], \"parameters\": {\"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"activityId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"alt\": {\"default\": \"json\", \"enum\": [\"json\"], \"type\": \"string\", \"location\": \"query\"}, \"maxResults\": {\"format\": \"uint32\", \"default\": \"20\", \"maximum\": \"100\", \"minimum\": \"0\", \"location\": \"query\", \"type\": \"integer\"}, \"sortOrder\": {\"default\": \"ascending\", \"enum\": [\"ascending\", \"descending\"], \"type\": \"string\", \"location\": \"query\"}}, \"id\": \"plus.comments.list\", \"httpMethod\": \"GET\", \"path\": \"activities/{activityId}/comments\", \"response\": {\"$ref\": \"CommentFeed\"}}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/plus.me\"], \"parameters\": {\"commentId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"plus.comments.get\", \"httpMethod\": \"GET\", \"path\": \"comments/{commentId}\", \"response\": {\"$ref\": \"Comment\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_PlusService.class,
                "people",
                new Google_PeopleServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_PlusService.class, "serviceName"),
                        "people",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"listByActivity\": {\"scopes\": [\"https://www.googleapis.com/auth/plus.me\"], \"parameters\": {\"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"activityId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"maxResults\": {\"format\": \"uint32\", \"default\": \"20\", \"maximum\": \"100\", \"minimum\": \"1\", \"location\": \"query\", \"type\": \"integer\"}, \"collection\": {\"required\": true, \"type\": \"string\", \"location\": \"path\", \"enum\": [\"plusoners\", \"resharers\"]}}, \"id\": \"plus.people.listByActivity\", \"httpMethod\": \"GET\", \"path\": \"activities/{activityId}/people/{collection}\", \"response\": {\"$ref\": \"PeopleFeed\"}}, \"search\": {\"scopes\": [\"https://www.googleapis.com/auth/plus.me\"], \"parameters\": {\"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"maxResults\": {\"format\": \"uint32\", \"default\": \"10\", \"maximum\": \"20\", \"minimum\": \"1\", \"location\": \"query\", \"type\": \"integer\"}, \"language\": {\"default\": \"\", \"type\": \"string\", \"location\": \"query\"}, \"query\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}}, \"id\": \"plus.people.search\", \"httpMethod\": \"GET\", \"path\": \"people\", \"response\": {\"$ref\": \"PeopleFeed\"}}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/plus.me\", \"https://www.googleapis.com/auth/userinfo.email\"], \"parameters\": {\"userId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"plus.people.get\", \"httpMethod\": \"GET\", \"path\": \"people/{userId}\", \"response\": {\"$ref\": \"Person\"}}}}",
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
