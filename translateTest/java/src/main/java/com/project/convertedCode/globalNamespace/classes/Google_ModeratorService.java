package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Google_FeaturedSeriesServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_SeriesSubmissionsServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_SeriesResponsesServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_ModeratorGlobalSeriesServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_SeriesServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_TopicsServiceResource;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Google_Service;
import com.project.convertedCode.globalNamespace.classes.Google_TopicsSubmissionsServiceResource;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Google_SubmissionsServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_ResponsesServiceResource;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.classes.Google_TagsServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_ProfilesServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_VotesServiceResource;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.classes.Google_MyrecentSeriesServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_MySeriesServiceResource;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_ModeratorService.php

*/

public class Google_ModeratorService extends Google_Service implements RuntimeFileContextInterface {

    public Object votes = null;

    public Object responses = null;

    public Object tags = null;

    public Object series = null;

    public Object series_submissions = null;

    public Object series_responses = null;

    public Object topics = null;

    public Object topics_submissions = null;

    public Object global_series = null;

    public Object profiles = null;

    public Object featured_series = null;

    public Object myrecent_series = null;

    public Object my_series = null;

    public Object submissions = null;

    public Google_ModeratorService(RuntimeEnv env, Object... args) {
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
            case "votes":
                return this.votes;
            case "responses":
                return this.responses;
            case "tags":
                return this.tags;
            case "series":
                return this.series;
            case "series_submissions":
                return this.series_submissions;
            case "series_responses":
                return this.series_responses;
            case "topics":
                return this.topics;
            case "topics_submissions":
                return this.topics_submissions;
            case "global_series":
                return this.global_series;
            case "profiles":
                return this.profiles;
            case "featured_series":
                return this.featured_series;
            case "myrecent_series":
                return this.myrecent_series;
            case "my_series":
                return this.my_series;
            case "submissions":
                return this.submissions;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "votes":
                return ZVal.isNull(this.votes);
            case "responses":
                return ZVal.isNull(this.responses);
            case "tags":
                return ZVal.isNull(this.tags);
            case "series":
                return ZVal.isNull(this.series);
            case "series_submissions":
                return ZVal.isNull(this.series_submissions);
            case "series_responses":
                return ZVal.isNull(this.series_responses);
            case "topics":
                return ZVal.isNull(this.topics);
            case "topics_submissions":
                return ZVal.isNull(this.topics_submissions);
            case "global_series":
                return ZVal.isNull(this.global_series);
            case "profiles":
                return ZVal.isNull(this.profiles);
            case "featured_series":
                return ZVal.isNull(this.featured_series);
            case "myrecent_series":
                return ZVal.isNull(this.myrecent_series);
            case "my_series":
                return ZVal.isNull(this.my_series);
            case "submissions":
                return ZVal.isNull(this.submissions);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "votes":
                this.votes = value;
                break;
            case "responses":
                this.responses = value;
                break;
            case "tags":
                this.tags = value;
                break;
            case "series":
                this.series = value;
                break;
            case "series_submissions":
                this.series_submissions = value;
                break;
            case "series_responses":
                this.series_responses = value;
                break;
            case "topics":
                this.topics = value;
                break;
            case "topics_submissions":
                this.topics_submissions = value;
                break;
            case "global_series":
                this.global_series = value;
                break;
            case "profiles":
                this.profiles = value;
                break;
            case "featured_series":
                this.featured_series = value;
                break;
            case "myrecent_series":
                this.myrecent_series = value;
                break;
            case "my_series":
                this.my_series = value;
                break;
            case "submissions":
                this.submissions = value;
                break;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object client = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ModeratorService.class, "servicePath", "moderator/v1/");
        ZVal.setProperty(this, Google_ModeratorService.class, "version", "v1");
        ZVal.setProperty(this, Google_ModeratorService.class, "serviceName", "moderator");
        env.callMethod(
                client,
                "addService",
                Google_ModeratorService.class,
                ZVal.getProperty(this, Google_ModeratorService.class, "serviceName"),
                ZVal.getProperty(this, Google_ModeratorService.class, "version"));
        ZVal.setProperty(
                this,
                Google_ModeratorService.class,
                "votes",
                new Google_VotesServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_ModeratorService.class, "serviceName"),
                        "votes",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/moderator\"], \"parameters\": {\"seriesId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"uint32\"}, \"unauthToken\": {\"type\": \"string\", \"location\": \"query\"}, \"submissionId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"uint32\"}}, \"request\": {\"$ref\": \"Vote\"}, \"response\": {\"$ref\": \"Vote\"}, \"httpMethod\": \"POST\", \"path\": \"series/{seriesId}/submissions/{submissionId}/votes/@me\", \"id\": \"moderator.votes.insert\"}, \"patch\": {\"scopes\": [\"https://www.googleapis.com/auth/moderator\"], \"parameters\": {\"seriesId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"uint32\"}, \"userId\": {\"type\": \"string\", \"location\": \"query\"}, \"unauthToken\": {\"type\": \"string\", \"location\": \"query\"}, \"submissionId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"uint32\"}}, \"request\": {\"$ref\": \"Vote\"}, \"response\": {\"$ref\": \"Vote\"}, \"httpMethod\": \"PATCH\", \"path\": \"series/{seriesId}/submissions/{submissionId}/votes/@me\", \"id\": \"moderator.votes.patch\"}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/moderator\"], \"parameters\": {\"max-results\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"seriesId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"uint32\"}, \"start-index\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}}, \"id\": \"moderator.votes.list\", \"httpMethod\": \"GET\", \"path\": \"series/{seriesId}/votes/@me\", \"response\": {\"$ref\": \"VoteList\"}}, \"update\": {\"scopes\": [\"https://www.googleapis.com/auth/moderator\"], \"parameters\": {\"seriesId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"uint32\"}, \"userId\": {\"type\": \"string\", \"location\": \"query\"}, \"unauthToken\": {\"type\": \"string\", \"location\": \"query\"}, \"submissionId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"uint32\"}}, \"request\": {\"$ref\": \"Vote\"}, \"response\": {\"$ref\": \"Vote\"}, \"httpMethod\": \"PUT\", \"path\": \"series/{seriesId}/submissions/{submissionId}/votes/@me\", \"id\": \"moderator.votes.update\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/moderator\"], \"parameters\": {\"seriesId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"uint32\"}, \"userId\": {\"type\": \"string\", \"location\": \"query\"}, \"unauthToken\": {\"type\": \"string\", \"location\": \"query\"}, \"submissionId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"uint32\"}}, \"id\": \"moderator.votes.get\", \"httpMethod\": \"GET\", \"path\": \"series/{seriesId}/submissions/{submissionId}/votes/@me\", \"response\": {\"$ref\": \"Vote\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_ModeratorService.class,
                "responses",
                new Google_ResponsesServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_ModeratorService.class, "serviceName"),
                        "responses",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/moderator\"], \"parameters\": {\"seriesId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"uint32\"}, \"parentSubmissionId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"uint32\"}, \"unauthToken\": {\"type\": \"string\", \"location\": \"query\"}, \"anonymous\": {\"type\": \"boolean\", \"location\": \"query\"}, \"topicId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"uint32\"}}, \"request\": {\"$ref\": \"Submission\"}, \"response\": {\"$ref\": \"Submission\"}, \"httpMethod\": \"POST\", \"path\": \"series/{seriesId}/topics/{topicId}/submissions/{parentSubmissionId}/responses\", \"id\": \"moderator.responses.insert\"}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/moderator\"], \"parameters\": {\"max-results\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"sort\": {\"type\": \"string\", \"location\": \"query\"}, \"seriesId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"uint32\"}, \"author\": {\"type\": \"string\", \"location\": \"query\"}, \"start-index\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"submissionId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"uint32\"}, \"q\": {\"type\": \"string\", \"location\": \"query\"}, \"hasAttachedVideo\": {\"type\": \"boolean\", \"location\": \"query\"}}, \"id\": \"moderator.responses.list\", \"httpMethod\": \"GET\", \"path\": \"series/{seriesId}/submissions/{submissionId}/responses\", \"response\": {\"$ref\": \"SubmissionList\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_ModeratorService.class,
                "tags",
                new Google_TagsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_ModeratorService.class, "serviceName"),
                        "tags",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/moderator\"], \"parameters\": {\"seriesId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"uint32\"}, \"submissionId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"uint32\"}}, \"request\": {\"$ref\": \"Tag\"}, \"response\": {\"$ref\": \"Tag\"}, \"httpMethod\": \"POST\", \"path\": \"series/{seriesId}/submissions/{submissionId}/tags\", \"id\": \"moderator.tags.insert\"}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/moderator\"], \"parameters\": {\"seriesId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"uint32\"}, \"submissionId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"uint32\"}}, \"id\": \"moderator.tags.list\", \"httpMethod\": \"GET\", \"path\": \"series/{seriesId}/submissions/{submissionId}/tags\", \"response\": {\"$ref\": \"TagList\"}}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/moderator\"], \"path\": \"series/{seriesId}/submissions/{submissionId}/tags/{tagId}\", \"id\": \"moderator.tags.delete\", \"parameters\": {\"seriesId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"uint32\"}, \"tagId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"submissionId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"uint32\"}}, \"httpMethod\": \"DELETE\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_ModeratorService.class,
                "series",
                new Google_SeriesServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_ModeratorService.class, "serviceName"),
                        "series",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/moderator\"], \"request\": {\"$ref\": \"Series\"}, \"response\": {\"$ref\": \"Series\"}, \"httpMethod\": \"POST\", \"path\": \"series\", \"id\": \"moderator.series.insert\"}, \"patch\": {\"scopes\": [\"https://www.googleapis.com/auth/moderator\"], \"parameters\": {\"seriesId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"uint32\"}}, \"request\": {\"$ref\": \"Series\"}, \"response\": {\"$ref\": \"Series\"}, \"httpMethod\": \"PATCH\", \"path\": \"series/{seriesId}\", \"id\": \"moderator.series.patch\"}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/moderator\"], \"parameters\": {\"max-results\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"q\": {\"type\": \"string\", \"location\": \"query\"}, \"start-index\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}}, \"response\": {\"$ref\": \"SeriesList\"}, \"httpMethod\": \"GET\", \"path\": \"series\", \"id\": \"moderator.series.list\"}, \"update\": {\"scopes\": [\"https://www.googleapis.com/auth/moderator\"], \"parameters\": {\"seriesId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"uint32\"}}, \"request\": {\"$ref\": \"Series\"}, \"response\": {\"$ref\": \"Series\"}, \"httpMethod\": \"PUT\", \"path\": \"series/{seriesId}\", \"id\": \"moderator.series.update\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/moderator\"], \"parameters\": {\"seriesId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"uint32\"}}, \"id\": \"moderator.series.get\", \"httpMethod\": \"GET\", \"path\": \"series/{seriesId}\", \"response\": {\"$ref\": \"Series\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_ModeratorService.class,
                "series_submissions",
                new Google_SeriesSubmissionsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_ModeratorService.class, "serviceName"),
                        "submissions",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/moderator\"], \"parameters\": {\"lang\": {\"type\": \"string\", \"location\": \"query\"}, \"max-results\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"seriesId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"uint32\"}, \"includeVotes\": {\"type\": \"boolean\", \"location\": \"query\"}, \"start-index\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"author\": {\"type\": \"string\", \"location\": \"query\"}, \"sort\": {\"type\": \"string\", \"location\": \"query\"}, \"q\": {\"type\": \"string\", \"location\": \"query\"}, \"hasAttachedVideo\": {\"type\": \"boolean\", \"location\": \"query\"}}, \"id\": \"moderator.series.submissions.list\", \"httpMethod\": \"GET\", \"path\": \"series/{seriesId}/submissions\", \"response\": {\"$ref\": \"SubmissionList\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_ModeratorService.class,
                "series_responses",
                new Google_SeriesResponsesServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_ModeratorService.class, "serviceName"),
                        "responses",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/moderator\"], \"parameters\": {\"max-results\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"sort\": {\"type\": \"string\", \"location\": \"query\"}, \"seriesId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"uint32\"}, \"author\": {\"type\": \"string\", \"location\": \"query\"}, \"start-index\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"q\": {\"type\": \"string\", \"location\": \"query\"}, \"hasAttachedVideo\": {\"type\": \"boolean\", \"location\": \"query\"}}, \"id\": \"moderator.series.responses.list\", \"httpMethod\": \"GET\", \"path\": \"series/{seriesId}/responses\", \"response\": {\"$ref\": \"SeriesList\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_ModeratorService.class,
                "topics",
                new Google_TopicsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_ModeratorService.class, "serviceName"),
                        "topics",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/moderator\"], \"parameters\": {\"seriesId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"uint32\"}}, \"request\": {\"$ref\": \"Topic\"}, \"response\": {\"$ref\": \"Topic\"}, \"httpMethod\": \"POST\", \"path\": \"series/{seriesId}/topics\", \"id\": \"moderator.topics.insert\"}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/moderator\"], \"parameters\": {\"max-results\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"q\": {\"type\": \"string\", \"location\": \"query\"}, \"start-index\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"mode\": {\"type\": \"string\", \"location\": \"query\"}, \"seriesId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"uint32\"}}, \"id\": \"moderator.topics.list\", \"httpMethod\": \"GET\", \"path\": \"series/{seriesId}/topics\", \"response\": {\"$ref\": \"TopicList\"}}, \"update\": {\"scopes\": [\"https://www.googleapis.com/auth/moderator\"], \"parameters\": {\"seriesId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"uint32\"}, \"topicId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"uint32\"}}, \"request\": {\"$ref\": \"Topic\"}, \"response\": {\"$ref\": \"Topic\"}, \"httpMethod\": \"PUT\", \"path\": \"series/{seriesId}/topics/{topicId}\", \"id\": \"moderator.topics.update\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/moderator\"], \"parameters\": {\"seriesId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"uint32\"}, \"topicId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"uint32\"}}, \"id\": \"moderator.topics.get\", \"httpMethod\": \"GET\", \"path\": \"series/{seriesId}/topics/{topicId}\", \"response\": {\"$ref\": \"Topic\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_ModeratorService.class,
                "topics_submissions",
                new Google_TopicsSubmissionsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_ModeratorService.class, "serviceName"),
                        "submissions",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/moderator\"], \"parameters\": {\"max-results\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"seriesId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"uint32\"}, \"includeVotes\": {\"type\": \"boolean\", \"location\": \"query\"}, \"topicId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"uint32\"}, \"start-index\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"author\": {\"type\": \"string\", \"location\": \"query\"}, \"sort\": {\"type\": \"string\", \"location\": \"query\"}, \"q\": {\"type\": \"string\", \"location\": \"query\"}, \"hasAttachedVideo\": {\"type\": \"boolean\", \"location\": \"query\"}}, \"id\": \"moderator.topics.submissions.list\", \"httpMethod\": \"GET\", \"path\": \"series/{seriesId}/topics/{topicId}/submissions\", \"response\": {\"$ref\": \"SubmissionList\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_ModeratorService.class,
                "global_series",
                new Google_ModeratorGlobalSeriesServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_ModeratorService.class, "serviceName"),
                        "series",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/moderator\"], \"parameters\": {\"max-results\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"q\": {\"type\": \"string\", \"location\": \"query\"}, \"start-index\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}}, \"response\": {\"$ref\": \"SeriesList\"}, \"httpMethod\": \"GET\", \"path\": \"search\", \"id\": \"moderator.global.series.list\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_ModeratorService.class,
                "profiles",
                new Google_ProfilesServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_ModeratorService.class, "serviceName"),
                        "profiles",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"patch\": {\"scopes\": [\"https://www.googleapis.com/auth/moderator\"], \"request\": {\"$ref\": \"Profile\"}, \"response\": {\"$ref\": \"Profile\"}, \"httpMethod\": \"PATCH\", \"path\": \"profiles/@me\", \"id\": \"moderator.profiles.patch\"}, \"update\": {\"scopes\": [\"https://www.googleapis.com/auth/moderator\"], \"request\": {\"$ref\": \"Profile\"}, \"response\": {\"$ref\": \"Profile\"}, \"httpMethod\": \"PUT\", \"path\": \"profiles/@me\", \"id\": \"moderator.profiles.update\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/moderator\"], \"path\": \"profiles/@me\", \"response\": {\"$ref\": \"Profile\"}, \"id\": \"moderator.profiles.get\", \"httpMethod\": \"GET\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_ModeratorService.class,
                "featured_series",
                new Google_FeaturedSeriesServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_ModeratorService.class, "serviceName"),
                        "series",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/moderator\"], \"path\": \"series/featured\", \"response\": {\"$ref\": \"SeriesList\"}, \"id\": \"moderator.featured.series.list\", \"httpMethod\": \"GET\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_ModeratorService.class,
                "myrecent_series",
                new Google_MyrecentSeriesServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_ModeratorService.class, "serviceName"),
                        "series",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/moderator\"], \"path\": \"series/@me/recent\", \"response\": {\"$ref\": \"SeriesList\"}, \"id\": \"moderator.myrecent.series.list\", \"httpMethod\": \"GET\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_ModeratorService.class,
                "my_series",
                new Google_MySeriesServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_ModeratorService.class, "serviceName"),
                        "series",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/moderator\"], \"path\": \"series/@me/mine\", \"response\": {\"$ref\": \"SeriesList\"}, \"id\": \"moderator.my.series.list\", \"httpMethod\": \"GET\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_ModeratorService.class,
                "submissions",
                new Google_SubmissionsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_ModeratorService.class, "serviceName"),
                        "submissions",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/moderator\"], \"parameters\": {\"seriesId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"uint32\"}, \"topicId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"uint32\"}, \"unauthToken\": {\"type\": \"string\", \"location\": \"query\"}, \"anonymous\": {\"type\": \"boolean\", \"location\": \"query\"}}, \"request\": {\"$ref\": \"Submission\"}, \"response\": {\"$ref\": \"Submission\"}, \"httpMethod\": \"POST\", \"path\": \"series/{seriesId}/topics/{topicId}/submissions\", \"id\": \"moderator.submissions.insert\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/moderator\"], \"parameters\": {\"lang\": {\"type\": \"string\", \"location\": \"query\"}, \"seriesId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"uint32\"}, \"submissionId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"uint32\"}, \"includeVotes\": {\"type\": \"boolean\", \"location\": \"query\"}}, \"id\": \"moderator.submissions.get\", \"httpMethod\": \"GET\", \"path\": \"series/{seriesId}/submissions/{submissionId}\", \"response\": {\"$ref\": \"Submission\"}}}}",
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
