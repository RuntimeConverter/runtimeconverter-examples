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

public class Google_CommunityPoll extends Google_Model implements RuntimeFileContextInterface {

    public Object __linksType = "Google_OrkutLinkResource";

    public Object __linksDataType = "array";

    public Object links = null;

    public Object isMultipleAnswers = null;

    public Object __imageType = "Google_CommunityPollImage";

    public Object __imageDataType = "";

    public Object image = null;

    public Object endingTime = null;

    public Object isVotingAllowedForNonMembers = null;

    public Object isSpam = null;

    public Object totalNumberOfVotes = null;

    public Object __authorType = "Google_OrkutAuthorResource";

    public Object __authorDataType = "";

    public Object author = null;

    public Object question = null;

    public Object id = null;

    public Object isRestricted = null;

    public Object communityId = null;

    public Object isUsersVotePublic = null;

    public Object lastUpdate = null;

    public Object description = null;

    public Object votedOptions = null;

    public Object isOpenForVoting = null;

    public Object isClosed = null;

    public Object hasVoted = null;

    public Object kind = null;

    public Object creationTime = null;

    public Object __optionsType = "Google_OrkutCommunitypolloptionResource";

    public Object __optionsDataType = "array";

    public Object options = null;

    public Google_CommunityPoll(RuntimeEnv env, Object... args) {
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
            case "setLinks":
                return this.setLinks(env, args);
            case "getLinks":
                return this.getLinks(env, args);
            case "setIsMultipleAnswers":
                return this.setIsMultipleAnswers(env, args);
            case "getIsMultipleAnswers":
                return this.getIsMultipleAnswers(env, args);
            case "setImage":
                return this.setImage(env, args);
            case "getImage":
                return this.getImage(env, args);
            case "setEndingTime":
                return this.setEndingTime(env, args);
            case "getEndingTime":
                return this.getEndingTime(env, args);
            case "setIsVotingAllowedForNonMembers":
                return this.setIsVotingAllowedForNonMembers(env, args);
            case "getIsVotingAllowedForNonMembers":
                return this.getIsVotingAllowedForNonMembers(env, args);
            case "setIsSpam":
                return this.setIsSpam(env, args);
            case "getIsSpam":
                return this.getIsSpam(env, args);
            case "setTotalNumberOfVotes":
                return this.setTotalNumberOfVotes(env, args);
            case "getTotalNumberOfVotes":
                return this.getTotalNumberOfVotes(env, args);
            case "setAuthor":
                return this.setAuthor(env, args);
            case "getAuthor":
                return this.getAuthor(env, args);
            case "setQuestion":
                return this.setQuestion(env, args);
            case "getQuestion":
                return this.getQuestion(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setIsRestricted":
                return this.setIsRestricted(env, args);
            case "getIsRestricted":
                return this.getIsRestricted(env, args);
            case "setCommunityId":
                return this.setCommunityId(env, args);
            case "getCommunityId":
                return this.getCommunityId(env, args);
            case "setIsUsersVotePublic":
                return this.setIsUsersVotePublic(env, args);
            case "getIsUsersVotePublic":
                return this.getIsUsersVotePublic(env, args);
            case "setLastUpdate":
                return this.setLastUpdate(env, args);
            case "getLastUpdate":
                return this.getLastUpdate(env, args);
            case "setDescription":
                return this.setDescription(env, args);
            case "getDescription":
                return this.getDescription(env, args);
            case "setVotedOptions":
                return this.setVotedOptions(env, args);
            case "getVotedOptions":
                return this.getVotedOptions(env, args);
            case "setIsOpenForVoting":
                return this.setIsOpenForVoting(env, args);
            case "getIsOpenForVoting":
                return this.getIsOpenForVoting(env, args);
            case "setIsClosed":
                return this.setIsClosed(env, args);
            case "getIsClosed":
                return this.getIsClosed(env, args);
            case "setHasVoted":
                return this.setHasVoted(env, args);
            case "getHasVoted":
                return this.getHasVoted(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setCreationTime":
                return this.setCreationTime(env, args);
            case "getCreationTime":
                return this.getCreationTime(env, args);
            case "setOptions":
                return this.setOptions(env, args);
            case "getOptions":
                return this.getOptions(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__linksType":
                if (Google_CommunityPoll.class.isAssignableFrom(caller)) {

                    return this.__linksType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__linksDataType":
                if (Google_CommunityPoll.class.isAssignableFrom(caller)) {

                    return this.__linksDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "links":
                return this.links;
            case "isMultipleAnswers":
                return this.isMultipleAnswers;
            case "__imageType":
                if (Google_CommunityPoll.class.isAssignableFrom(caller)) {

                    return this.__imageType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__imageDataType":
                if (Google_CommunityPoll.class.isAssignableFrom(caller)) {

                    return this.__imageDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "image":
                return this.image;
            case "endingTime":
                return this.endingTime;
            case "isVotingAllowedForNonMembers":
                return this.isVotingAllowedForNonMembers;
            case "isSpam":
                return this.isSpam;
            case "totalNumberOfVotes":
                return this.totalNumberOfVotes;
            case "__authorType":
                if (Google_CommunityPoll.class.isAssignableFrom(caller)) {

                    return this.__authorType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__authorDataType":
                if (Google_CommunityPoll.class.isAssignableFrom(caller)) {

                    return this.__authorDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "author":
                return this.author;
            case "question":
                return this.question;
            case "id":
                return this.id;
            case "isRestricted":
                return this.isRestricted;
            case "communityId":
                return this.communityId;
            case "isUsersVotePublic":
                return this.isUsersVotePublic;
            case "lastUpdate":
                return this.lastUpdate;
            case "description":
                return this.description;
            case "votedOptions":
                return this.votedOptions;
            case "isOpenForVoting":
                return this.isOpenForVoting;
            case "isClosed":
                return this.isClosed;
            case "hasVoted":
                return this.hasVoted;
            case "kind":
                return this.kind;
            case "creationTime":
                return this.creationTime;
            case "__optionsType":
                if (Google_CommunityPoll.class.isAssignableFrom(caller)) {

                    return this.__optionsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__optionsDataType":
                if (Google_CommunityPoll.class.isAssignableFrom(caller)) {

                    return this.__optionsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "options":
                return this.options;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__linksType":
                if (Google_CommunityPoll.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__linksType);
                }
                break;
            case "__linksDataType":
                if (Google_CommunityPoll.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__linksDataType);
                }
                break;
            case "links":
                return ZVal.isNull(this.links);
            case "isMultipleAnswers":
                return ZVal.isNull(this.isMultipleAnswers);
            case "__imageType":
                if (Google_CommunityPoll.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__imageType);
                }
                break;
            case "__imageDataType":
                if (Google_CommunityPoll.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__imageDataType);
                }
                break;
            case "image":
                return ZVal.isNull(this.image);
            case "endingTime":
                return ZVal.isNull(this.endingTime);
            case "isVotingAllowedForNonMembers":
                return ZVal.isNull(this.isVotingAllowedForNonMembers);
            case "isSpam":
                return ZVal.isNull(this.isSpam);
            case "totalNumberOfVotes":
                return ZVal.isNull(this.totalNumberOfVotes);
            case "__authorType":
                if (Google_CommunityPoll.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__authorType);
                }
                break;
            case "__authorDataType":
                if (Google_CommunityPoll.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__authorDataType);
                }
                break;
            case "author":
                return ZVal.isNull(this.author);
            case "question":
                return ZVal.isNull(this.question);
            case "id":
                return ZVal.isNull(this.id);
            case "isRestricted":
                return ZVal.isNull(this.isRestricted);
            case "communityId":
                return ZVal.isNull(this.communityId);
            case "isUsersVotePublic":
                return ZVal.isNull(this.isUsersVotePublic);
            case "lastUpdate":
                return ZVal.isNull(this.lastUpdate);
            case "description":
                return ZVal.isNull(this.description);
            case "votedOptions":
                return ZVal.isNull(this.votedOptions);
            case "isOpenForVoting":
                return ZVal.isNull(this.isOpenForVoting);
            case "isClosed":
                return ZVal.isNull(this.isClosed);
            case "hasVoted":
                return ZVal.isNull(this.hasVoted);
            case "kind":
                return ZVal.isNull(this.kind);
            case "creationTime":
                return ZVal.isNull(this.creationTime);
            case "__optionsType":
                if (Google_CommunityPoll.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__optionsType);
                }
                break;
            case "__optionsDataType":
                if (Google_CommunityPoll.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__optionsDataType);
                }
                break;
            case "options":
                return ZVal.isNull(this.options);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__linksType":
                if (Google_CommunityPoll.class.isAssignableFrom(caller)) {

                    this.__linksType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__linksDataType":
                if (Google_CommunityPoll.class.isAssignableFrom(caller)) {

                    this.__linksDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "links":
                this.links = value;
                break;
            case "isMultipleAnswers":
                this.isMultipleAnswers = value;
                break;
            case "__imageType":
                if (Google_CommunityPoll.class.isAssignableFrom(caller)) {

                    this.__imageType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__imageDataType":
                if (Google_CommunityPoll.class.isAssignableFrom(caller)) {

                    this.__imageDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "image":
                this.image = value;
                break;
            case "endingTime":
                this.endingTime = value;
                break;
            case "isVotingAllowedForNonMembers":
                this.isVotingAllowedForNonMembers = value;
                break;
            case "isSpam":
                this.isSpam = value;
                break;
            case "totalNumberOfVotes":
                this.totalNumberOfVotes = value;
                break;
            case "__authorType":
                if (Google_CommunityPoll.class.isAssignableFrom(caller)) {

                    this.__authorType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__authorDataType":
                if (Google_CommunityPoll.class.isAssignableFrom(caller)) {

                    this.__authorDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "author":
                this.author = value;
                break;
            case "question":
                this.question = value;
                break;
            case "id":
                this.id = value;
                break;
            case "isRestricted":
                this.isRestricted = value;
                break;
            case "communityId":
                this.communityId = value;
                break;
            case "isUsersVotePublic":
                this.isUsersVotePublic = value;
                break;
            case "lastUpdate":
                this.lastUpdate = value;
                break;
            case "description":
                this.description = value;
                break;
            case "votedOptions":
                this.votedOptions = value;
                break;
            case "isOpenForVoting":
                this.isOpenForVoting = value;
                break;
            case "isClosed":
                this.isClosed = value;
                break;
            case "hasVoted":
                this.hasVoted = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "creationTime":
                this.creationTime = value;
                break;
            case "__optionsType":
                if (Google_CommunityPoll.class.isAssignableFrom(caller)) {

                    this.__optionsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__optionsDataType":
                if (Google_CommunityPoll.class.isAssignableFrom(caller)) {

                    this.__optionsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "options":
                this.options = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setLinks(RuntimeEnv env, Object... args) {
        Object links = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_CommunityPoll.class,
                links,
                "Google_OrkutLinkResource",
                "setLinks");
        ZVal.setProperty(this, Google_CommunityPoll.class, "links", links);

        return null;
    }

    public Object getLinks(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityPoll.class, "links"));
    }

    public Object setIsMultipleAnswers(RuntimeEnv env, Object... args) {
        Object isMultipleAnswers = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityPoll.class, "isMultipleAnswers", isMultipleAnswers);

        return null;
    }

    public Object getIsMultipleAnswers(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityPoll.class, "isMultipleAnswers"));
    }

    public Object setImage(RuntimeEnv env, Object... args) {
        Object image = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityPoll.class, "image", image);

        return null;
    }

    public Object getImage(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityPoll.class, "image"));
    }

    public Object setEndingTime(RuntimeEnv env, Object... args) {
        Object endingTime = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityPoll.class, "endingTime", endingTime);

        return null;
    }

    public Object getEndingTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityPoll.class, "endingTime"));
    }

    public Object setIsVotingAllowedForNonMembers(RuntimeEnv env, Object... args) {
        Object isVotingAllowedForNonMembers = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_CommunityPoll.class,
                "isVotingAllowedForNonMembers",
                isVotingAllowedForNonMembers);

        return null;
    }

    public Object getIsVotingAllowedForNonMembers(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_CommunityPoll.class, "isVotingAllowedForNonMembers"));
    }

    public Object setIsSpam(RuntimeEnv env, Object... args) {
        Object isSpam = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityPoll.class, "isSpam", isSpam);

        return null;
    }

    public Object getIsSpam(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityPoll.class, "isSpam"));
    }

    public Object setTotalNumberOfVotes(RuntimeEnv env, Object... args) {
        Object totalNumberOfVotes = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_CommunityPoll.class, "totalNumberOfVotes", totalNumberOfVotes);

        return null;
    }

    public Object getTotalNumberOfVotes(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_CommunityPoll.class, "totalNumberOfVotes"));
    }

    public Object setAuthor(RuntimeEnv env, Object... args) {
        Object author = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityPoll.class, "author", author);

        return null;
    }

    public Object getAuthor(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityPoll.class, "author"));
    }

    public Object setQuestion(RuntimeEnv env, Object... args) {
        Object question = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityPoll.class, "question", question);

        return null;
    }

    public Object getQuestion(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityPoll.class, "question"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityPoll.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityPoll.class, "id"));
    }

    public Object setIsRestricted(RuntimeEnv env, Object... args) {
        Object isRestricted = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityPoll.class, "isRestricted", isRestricted);

        return null;
    }

    public Object getIsRestricted(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityPoll.class, "isRestricted"));
    }

    public Object setCommunityId(RuntimeEnv env, Object... args) {
        Object communityId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityPoll.class, "communityId", communityId);

        return null;
    }

    public Object getCommunityId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityPoll.class, "communityId"));
    }

    public Object setIsUsersVotePublic(RuntimeEnv env, Object... args) {
        Object isUsersVotePublic = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityPoll.class, "isUsersVotePublic", isUsersVotePublic);

        return null;
    }

    public Object getIsUsersVotePublic(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityPoll.class, "isUsersVotePublic"));
    }

    public Object setLastUpdate(RuntimeEnv env, Object... args) {
        Object lastUpdate = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityPoll.class, "lastUpdate", lastUpdate);

        return null;
    }

    public Object getLastUpdate(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityPoll.class, "lastUpdate"));
    }

    public Object setDescription(RuntimeEnv env, Object... args) {
        Object description = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityPoll.class, "description", description);

        return null;
    }

    public Object getDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityPoll.class, "description"));
    }

    public Object setVotedOptions(RuntimeEnv env, Object... args) {
        Object votedOptions = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_CommunityPoll.class,
                votedOptions,
                "Google_int",
                "setVotedOptions");
        ZVal.setProperty(this, Google_CommunityPoll.class, "votedOptions", votedOptions);

        return null;
    }

    public Object getVotedOptions(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityPoll.class, "votedOptions"));
    }

    public Object setIsOpenForVoting(RuntimeEnv env, Object... args) {
        Object isOpenForVoting = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityPoll.class, "isOpenForVoting", isOpenForVoting);

        return null;
    }

    public Object getIsOpenForVoting(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityPoll.class, "isOpenForVoting"));
    }

    public Object setIsClosed(RuntimeEnv env, Object... args) {
        Object isClosed = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityPoll.class, "isClosed", isClosed);

        return null;
    }

    public Object getIsClosed(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityPoll.class, "isClosed"));
    }

    public Object setHasVoted(RuntimeEnv env, Object... args) {
        Object hasVoted = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityPoll.class, "hasVoted", hasVoted);

        return null;
    }

    public Object getHasVoted(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityPoll.class, "hasVoted"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityPoll.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityPoll.class, "kind"));
    }

    public Object setCreationTime(RuntimeEnv env, Object... args) {
        Object creationTime = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CommunityPoll.class, "creationTime", creationTime);

        return null;
    }

    public Object getCreationTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityPoll.class, "creationTime"));
    }

    public Object setOptions(RuntimeEnv env, Object... args) {
        Object options = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_CommunityPoll.class,
                options,
                "Google_OrkutCommunitypolloptionResource",
                "setOptions");
        ZVal.setProperty(this, Google_CommunityPoll.class, "options", options);

        return null;
    }

    public Object getOptions(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CommunityPoll.class, "options"));
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
