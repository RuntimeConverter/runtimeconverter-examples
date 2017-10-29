package com.project.convertedCode.globalNamespace.classes;

import com.project.convertedCode.globalNamespace.classes.Google_CommunityPollVotesServiceResource;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Google_CommunityPollsServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_AclServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_BadgesServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_CommunityTopicsServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_CommunitiesServiceResource;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Google_Service;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.classes.Google_ActivityVisibilityServiceResource;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Google_CommunityFollowServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_CountersServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_CommentsServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_ActivitiesServiceResource;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.classes.Google_CommunityPollCommentsServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_CommunityRelatedServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_CommunityMessagesServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_ScrapsServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_CommunityMembersServiceResource;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_OrkutService.php

*/

public class Google_OrkutService extends Google_Service implements RuntimeFileContextInterface {

    public Object communityMembers = null;

    public Object activities = null;

    public Object communityPollComments = null;

    public Object communityPolls = null;

    public Object communityMessages = null;

    public Object communityTopics = null;

    public Object comments = null;

    public Object acl = null;

    public Object communityRelated = null;

    public Object scraps = null;

    public Object communityPollVotes = null;

    public Object communities = null;

    public Object communityFollow = null;

    public Object activityVisibility = null;

    public Object badges = null;

    public Object counters = null;

    public Google_OrkutService(RuntimeEnv env, Object... args) {
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
            case "communityMembers":
                return this.communityMembers;
            case "activities":
                return this.activities;
            case "communityPollComments":
                return this.communityPollComments;
            case "communityPolls":
                return this.communityPolls;
            case "communityMessages":
                return this.communityMessages;
            case "communityTopics":
                return this.communityTopics;
            case "comments":
                return this.comments;
            case "acl":
                return this.acl;
            case "communityRelated":
                return this.communityRelated;
            case "scraps":
                return this.scraps;
            case "communityPollVotes":
                return this.communityPollVotes;
            case "communities":
                return this.communities;
            case "communityFollow":
                return this.communityFollow;
            case "activityVisibility":
                return this.activityVisibility;
            case "badges":
                return this.badges;
            case "counters":
                return this.counters;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "communityMembers":
                return ZVal.isNull(this.communityMembers);
            case "activities":
                return ZVal.isNull(this.activities);
            case "communityPollComments":
                return ZVal.isNull(this.communityPollComments);
            case "communityPolls":
                return ZVal.isNull(this.communityPolls);
            case "communityMessages":
                return ZVal.isNull(this.communityMessages);
            case "communityTopics":
                return ZVal.isNull(this.communityTopics);
            case "comments":
                return ZVal.isNull(this.comments);
            case "acl":
                return ZVal.isNull(this.acl);
            case "communityRelated":
                return ZVal.isNull(this.communityRelated);
            case "scraps":
                return ZVal.isNull(this.scraps);
            case "communityPollVotes":
                return ZVal.isNull(this.communityPollVotes);
            case "communities":
                return ZVal.isNull(this.communities);
            case "communityFollow":
                return ZVal.isNull(this.communityFollow);
            case "activityVisibility":
                return ZVal.isNull(this.activityVisibility);
            case "badges":
                return ZVal.isNull(this.badges);
            case "counters":
                return ZVal.isNull(this.counters);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "communityMembers":
                this.communityMembers = value;
                break;
            case "activities":
                this.activities = value;
                break;
            case "communityPollComments":
                this.communityPollComments = value;
                break;
            case "communityPolls":
                this.communityPolls = value;
                break;
            case "communityMessages":
                this.communityMessages = value;
                break;
            case "communityTopics":
                this.communityTopics = value;
                break;
            case "comments":
                this.comments = value;
                break;
            case "acl":
                this.acl = value;
                break;
            case "communityRelated":
                this.communityRelated = value;
                break;
            case "scraps":
                this.scraps = value;
                break;
            case "communityPollVotes":
                this.communityPollVotes = value;
                break;
            case "communities":
                this.communities = value;
                break;
            case "communityFollow":
                this.communityFollow = value;
                break;
            case "activityVisibility":
                this.activityVisibility = value;
                break;
            case "badges":
                this.badges = value;
                break;
            case "counters":
                this.counters = value;
                break;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object client = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_OrkutService.class, "servicePath", "orkut/v2/");
        ZVal.setProperty(this, Google_OrkutService.class, "version", "v2");
        ZVal.setProperty(this, Google_OrkutService.class, "serviceName", "orkut");
        env.callMethod(
                client,
                "addService",
                Google_OrkutService.class,
                ZVal.getProperty(this, Google_OrkutService.class, "serviceName"),
                ZVal.getProperty(this, Google_OrkutService.class, "version"));
        ZVal.setProperty(
                this,
                Google_OrkutService.class,
                "communityMembers",
                new Google_CommunityMembersServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_OrkutService.class, "serviceName"),
                        "communityMembers",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/orkut\"], \"parameters\": {\"communityId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"int32\"}, \"userId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"orkut.communityMembers.insert\", \"httpMethod\": \"POST\", \"path\": \"communities/{communityId}/members/{userId}\", \"response\": {\"$ref\": \"CommunityMembers\"}}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/orkut\", \"https://www.googleapis.com/auth/orkut.readonly\"], \"parameters\": {\"communityId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"int32\"}, \"userId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"hl\": {\"type\": \"string\", \"location\": \"query\"}}, \"id\": \"orkut.communityMembers.get\", \"httpMethod\": \"GET\", \"path\": \"communities/{communityId}/members/{userId}\", \"response\": {\"$ref\": \"CommunityMembers\"}}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/orkut\", \"https://www.googleapis.com/auth/orkut.readonly\"], \"parameters\": {\"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"friendsOnly\": {\"type\": \"boolean\", \"location\": \"query\"}, \"communityId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"int32\"}, \"maxResults\": {\"minimum\": \"1\", \"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"hl\": {\"type\": \"string\", \"location\": \"query\"}}, \"id\": \"orkut.communityMembers.list\", \"httpMethod\": \"GET\", \"path\": \"communities/{communityId}/members\", \"response\": {\"$ref\": \"CommunityMembersList\"}}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/orkut\"], \"path\": \"communities/{communityId}/members/{userId}\", \"id\": \"orkut.communityMembers.delete\", \"parameters\": {\"communityId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"int32\"}, \"userId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"httpMethod\": \"DELETE\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_OrkutService.class,
                "activities",
                new Google_ActivitiesServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_OrkutService.class, "serviceName"),
                        "activities",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/orkut\", \"https://www.googleapis.com/auth/orkut.readonly\"], \"parameters\": {\"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"maxResults\": {\"location\": \"query\", \"minimum\": \"1\", \"type\": \"integer\", \"maximum\": \"100\", \"format\": \"uint32\"}, \"userId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"hl\": {\"type\": \"string\", \"location\": \"query\"}, \"collection\": {\"required\": true, \"type\": \"string\", \"location\": \"path\", \"enum\": [\"all\", \"scraps\", \"stream\"]}}, \"id\": \"orkut.activities.list\", \"httpMethod\": \"GET\", \"path\": \"people/{userId}/activities/{collection}\", \"response\": {\"$ref\": \"ActivityList\"}}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/orkut\"], \"path\": \"activities/{activityId}\", \"id\": \"orkut.activities.delete\", \"parameters\": {\"activityId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"httpMethod\": \"DELETE\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_OrkutService.class,
                "communityPollComments",
                new Google_CommunityPollCommentsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_OrkutService.class, "serviceName"),
                        "communityPollComments",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/orkut\"], \"parameters\": {\"communityId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"int32\"}, \"pollId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"CommunityPollComment\"}, \"response\": {\"$ref\": \"CommunityPollComment\"}, \"httpMethod\": \"POST\", \"path\": \"communities/{communityId}/polls/{pollId}/comments\", \"id\": \"orkut.communityPollComments.insert\"}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/orkut\", \"https://www.googleapis.com/auth/orkut.readonly\"], \"parameters\": {\"pollId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"communityId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"int32\"}, \"maxResults\": {\"minimum\": \"1\", \"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"hl\": {\"type\": \"string\", \"location\": \"query\"}}, \"id\": \"orkut.communityPollComments.list\", \"httpMethod\": \"GET\", \"path\": \"communities/{communityId}/polls/{pollId}/comments\", \"response\": {\"$ref\": \"CommunityPollCommentList\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_OrkutService.class,
                "communityPolls",
                new Google_CommunityPollsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_OrkutService.class, "serviceName"),
                        "communityPolls",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/orkut\", \"https://www.googleapis.com/auth/orkut.readonly\"], \"parameters\": {\"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"communityId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"int32\"}, \"maxResults\": {\"minimum\": \"1\", \"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"hl\": {\"type\": \"string\", \"location\": \"query\"}}, \"id\": \"orkut.communityPolls.list\", \"httpMethod\": \"GET\", \"path\": \"communities/{communityId}/polls\", \"response\": {\"$ref\": \"CommunityPollList\"}}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/orkut\", \"https://www.googleapis.com/auth/orkut.readonly\"], \"parameters\": {\"communityId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"int32\"}, \"pollId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"hl\": {\"type\": \"string\", \"location\": \"query\"}}, \"id\": \"orkut.communityPolls.get\", \"httpMethod\": \"GET\", \"path\": \"communities/{communityId}/polls/{pollId}\", \"response\": {\"$ref\": \"CommunityPoll\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_OrkutService.class,
                "communityMessages",
                new Google_CommunityMessagesServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_OrkutService.class, "serviceName"),
                        "communityMessages",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/orkut\"], \"parameters\": {\"topicId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\", \"format\": \"int64\"}, \"communityId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"int32\"}}, \"request\": {\"$ref\": \"CommunityMessage\"}, \"response\": {\"$ref\": \"CommunityMessage\"}, \"httpMethod\": \"POST\", \"path\": \"communities/{communityId}/topics/{topicId}/messages\", \"id\": \"orkut.communityMessages.insert\"}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/orkut\", \"https://www.googleapis.com/auth/orkut.readonly\"], \"parameters\": {\"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"communityId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"int32\"}, \"maxResults\": {\"location\": \"query\", \"minimum\": \"1\", \"type\": \"integer\", \"maximum\": \"100\", \"format\": \"uint32\"}, \"hl\": {\"type\": \"string\", \"location\": \"query\"}, \"topicId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\", \"format\": \"int64\"}}, \"id\": \"orkut.communityMessages.list\", \"httpMethod\": \"GET\", \"path\": \"communities/{communityId}/topics/{topicId}/messages\", \"response\": {\"$ref\": \"CommunityMessageList\"}}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/orkut\"], \"path\": \"communities/{communityId}/topics/{topicId}/messages/{messageId}\", \"id\": \"orkut.communityMessages.delete\", \"parameters\": {\"topicId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\", \"format\": \"int64\"}, \"communityId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"int32\"}, \"messageId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\", \"format\": \"int64\"}}, \"httpMethod\": \"DELETE\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_OrkutService.class,
                "communityTopics",
                new Google_CommunityTopicsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_OrkutService.class, "serviceName"),
                        "communityTopics",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/orkut\"], \"parameters\": {\"isShout\": {\"type\": \"boolean\", \"location\": \"query\"}, \"communityId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"int32\"}}, \"request\": {\"$ref\": \"CommunityTopic\"}, \"response\": {\"$ref\": \"CommunityTopic\"}, \"httpMethod\": \"POST\", \"path\": \"communities/{communityId}/topics\", \"id\": \"orkut.communityTopics.insert\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/orkut\", \"https://www.googleapis.com/auth/orkut.readonly\"], \"parameters\": {\"topicId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\", \"format\": \"int64\"}, \"communityId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"int32\"}, \"hl\": {\"type\": \"string\", \"location\": \"query\"}}, \"id\": \"orkut.communityTopics.get\", \"httpMethod\": \"GET\", \"path\": \"communities/{communityId}/topics/{topicId}\", \"response\": {\"$ref\": \"CommunityTopic\"}}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/orkut\", \"https://www.googleapis.com/auth/orkut.readonly\"], \"parameters\": {\"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"communityId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"int32\"}, \"maxResults\": {\"location\": \"query\", \"minimum\": \"1\", \"type\": \"integer\", \"maximum\": \"100\", \"format\": \"uint32\"}, \"hl\": {\"type\": \"string\", \"location\": \"query\"}}, \"id\": \"orkut.communityTopics.list\", \"httpMethod\": \"GET\", \"path\": \"communities/{communityId}/topics\", \"response\": {\"$ref\": \"CommunityTopicList\"}}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/orkut\"], \"path\": \"communities/{communityId}/topics/{topicId}\", \"id\": \"orkut.communityTopics.delete\", \"parameters\": {\"topicId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\", \"format\": \"int64\"}, \"communityId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"int32\"}}, \"httpMethod\": \"DELETE\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_OrkutService.class,
                "comments",
                new Google_CommentsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_OrkutService.class, "serviceName"),
                        "comments",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/orkut\"], \"parameters\": {\"activityId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Comment\"}, \"response\": {\"$ref\": \"Comment\"}, \"httpMethod\": \"POST\", \"path\": \"activities/{activityId}/comments\", \"id\": \"orkut.comments.insert\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/orkut\", \"https://www.googleapis.com/auth/orkut.readonly\"], \"parameters\": {\"commentId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"hl\": {\"type\": \"string\", \"location\": \"query\"}}, \"id\": \"orkut.comments.get\", \"httpMethod\": \"GET\", \"path\": \"comments/{commentId}\", \"response\": {\"$ref\": \"Comment\"}}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/orkut\", \"https://www.googleapis.com/auth/orkut.readonly\"], \"parameters\": {\"orderBy\": {\"default\": \"DESCENDING_SORT\", \"enum\": [\"ascending\", \"descending\"], \"type\": \"string\", \"location\": \"query\"}, \"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"activityId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"maxResults\": {\"minimum\": \"1\", \"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"hl\": {\"type\": \"string\", \"location\": \"query\"}}, \"id\": \"orkut.comments.list\", \"httpMethod\": \"GET\", \"path\": \"activities/{activityId}/comments\", \"response\": {\"$ref\": \"CommentList\"}}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/orkut\"], \"path\": \"comments/{commentId}\", \"id\": \"orkut.comments.delete\", \"parameters\": {\"commentId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"httpMethod\": \"DELETE\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_OrkutService.class,
                "acl",
                new Google_AclServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_OrkutService.class, "serviceName"),
                        "acl",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/orkut\"], \"path\": \"activities/{activityId}/acl/{userId}\", \"id\": \"orkut.acl.delete\", \"parameters\": {\"activityId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"userId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"httpMethod\": \"DELETE\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_OrkutService.class,
                "communityRelated",
                new Google_CommunityRelatedServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_OrkutService.class, "serviceName"),
                        "communityRelated",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/orkut\", \"https://www.googleapis.com/auth/orkut.readonly\"], \"parameters\": {\"communityId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"int32\"}, \"hl\": {\"type\": \"string\", \"location\": \"query\"}}, \"id\": \"orkut.communityRelated.list\", \"httpMethod\": \"GET\", \"path\": \"communities/{communityId}/related\", \"response\": {\"$ref\": \"CommunityList\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_OrkutService.class,
                "scraps",
                new Google_ScrapsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_OrkutService.class, "serviceName"),
                        "scraps",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/orkut\"], \"request\": {\"$ref\": \"Activity\"}, \"response\": {\"$ref\": \"Activity\"}, \"httpMethod\": \"POST\", \"path\": \"activities/scraps\", \"id\": \"orkut.scraps.insert\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_OrkutService.class,
                "communityPollVotes",
                new Google_CommunityPollVotesServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_OrkutService.class, "serviceName"),
                        "communityPollVotes",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/orkut\"], \"parameters\": {\"communityId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"int32\"}, \"pollId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"CommunityPollVote\"}, \"response\": {\"$ref\": \"CommunityPollVote\"}, \"httpMethod\": \"POST\", \"path\": \"communities/{communityId}/polls/{pollId}/votes\", \"id\": \"orkut.communityPollVotes.insert\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_OrkutService.class,
                "communities",
                new Google_CommunitiesServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_OrkutService.class, "serviceName"),
                        "communities",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/orkut\", \"https://www.googleapis.com/auth/orkut.readonly\"], \"parameters\": {\"orderBy\": {\"enum\": [\"id\", \"ranked\"], \"type\": \"string\", \"location\": \"query\"}, \"userId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"maxResults\": {\"minimum\": \"1\", \"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"hl\": {\"type\": \"string\", \"location\": \"query\"}}, \"id\": \"orkut.communities.list\", \"httpMethod\": \"GET\", \"path\": \"people/{userId}/communities\", \"response\": {\"$ref\": \"CommunityList\"}}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/orkut\", \"https://www.googleapis.com/auth/orkut.readonly\"], \"parameters\": {\"communityId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"int32\"}, \"hl\": {\"type\": \"string\", \"location\": \"query\"}}, \"id\": \"orkut.communities.get\", \"httpMethod\": \"GET\", \"path\": \"communities/{communityId}\", \"response\": {\"$ref\": \"Community\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_OrkutService.class,
                "communityFollow",
                new Google_CommunityFollowServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_OrkutService.class, "serviceName"),
                        "communityFollow",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/orkut\"], \"parameters\": {\"communityId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"int32\"}, \"userId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"orkut.communityFollow.insert\", \"httpMethod\": \"POST\", \"path\": \"communities/{communityId}/followers/{userId}\", \"response\": {\"$ref\": \"CommunityMembers\"}}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/orkut\"], \"path\": \"communities/{communityId}/followers/{userId}\", \"id\": \"orkut.communityFollow.delete\", \"parameters\": {\"communityId\": {\"required\": true, \"type\": \"integer\", \"location\": \"path\", \"format\": \"int32\"}, \"userId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"httpMethod\": \"DELETE\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_OrkutService.class,
                "activityVisibility",
                new Google_ActivityVisibilityServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_OrkutService.class, "serviceName"),
                        "activityVisibility",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"patch\": {\"scopes\": [\"https://www.googleapis.com/auth/orkut\"], \"parameters\": {\"activityId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Visibility\"}, \"response\": {\"$ref\": \"Visibility\"}, \"httpMethod\": \"PATCH\", \"path\": \"activities/{activityId}/visibility\", \"id\": \"orkut.activityVisibility.patch\"}, \"update\": {\"scopes\": [\"https://www.googleapis.com/auth/orkut\"], \"parameters\": {\"activityId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Visibility\"}, \"response\": {\"$ref\": \"Visibility\"}, \"httpMethod\": \"PUT\", \"path\": \"activities/{activityId}/visibility\", \"id\": \"orkut.activityVisibility.update\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/orkut\", \"https://www.googleapis.com/auth/orkut.readonly\"], \"parameters\": {\"activityId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"orkut.activityVisibility.get\", \"httpMethod\": \"GET\", \"path\": \"activities/{activityId}/visibility\", \"response\": {\"$ref\": \"Visibility\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_OrkutService.class,
                "badges",
                new Google_BadgesServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_OrkutService.class, "serviceName"),
                        "badges",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/orkut\", \"https://www.googleapis.com/auth/orkut.readonly\"], \"parameters\": {\"userId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"orkut.badges.list\", \"httpMethod\": \"GET\", \"path\": \"people/{userId}/badges\", \"response\": {\"$ref\": \"BadgeList\"}}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/orkut\", \"https://www.googleapis.com/auth/orkut.readonly\"], \"parameters\": {\"userId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"badgeId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\", \"format\": \"int64\"}}, \"id\": \"orkut.badges.get\", \"httpMethod\": \"GET\", \"path\": \"people/{userId}/badges/{badgeId}\", \"response\": {\"$ref\": \"Badge\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_OrkutService.class,
                "counters",
                new Google_CountersServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_OrkutService.class, "serviceName"),
                        "counters",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/orkut\", \"https://www.googleapis.com/auth/orkut.readonly\"], \"parameters\": {\"userId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"orkut.counters.list\", \"httpMethod\": \"GET\", \"path\": \"people/{userId}/counters\", \"response\": {\"$ref\": \"Counters\"}}}}",
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
