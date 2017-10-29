package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Google_PlaylistitemsServiceResource;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Google_Service;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Google_VideosServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_SearchServiceResource;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.classes.Google_ChannelsServiceResource;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.classes.Google_PlaylistsServiceResource;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_YoutubeService.php

*/

public class Google_YoutubeService extends Google_Service implements RuntimeFileContextInterface {

    public Object channels = null;

    public Object search = null;

    public Object playlistitems = null;

    public Object playlists = null;

    public Object videos = null;

    public Google_YoutubeService(RuntimeEnv env, Object... args) {
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
            case "channels":
                return this.channels;
            case "search":
                return this.search;
            case "playlistitems":
                return this.playlistitems;
            case "playlists":
                return this.playlists;
            case "videos":
                return this.videos;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "channels":
                return ZVal.isNull(this.channels);
            case "search":
                return ZVal.isNull(this.search);
            case "playlistitems":
                return ZVal.isNull(this.playlistitems);
            case "playlists":
                return ZVal.isNull(this.playlists);
            case "videos":
                return ZVal.isNull(this.videos);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "channels":
                this.channels = value;
                break;
            case "search":
                this.search = value;
                break;
            case "playlistitems":
                this.playlistitems = value;
                break;
            case "playlists":
                this.playlists = value;
                break;
            case "videos":
                this.videos = value;
                break;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object client = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_YoutubeService.class, "servicePath", "youtube/v3alpha/");
        ZVal.setProperty(this, Google_YoutubeService.class, "version", "v3alpha");
        ZVal.setProperty(this, Google_YoutubeService.class, "serviceName", "youtube");
        env.callMethod(
                client,
                "addService",
                Google_YoutubeService.class,
                ZVal.getProperty(this, Google_YoutubeService.class, "serviceName"),
                ZVal.getProperty(this, Google_YoutubeService.class, "version"));
        ZVal.setProperty(
                this,
                Google_YoutubeService.class,
                "channels",
                new Google_ChannelsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_YoutubeService.class, "serviceName"),
                        "channels",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/youtube\"], \"parameters\": {\"part\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"id\": {\"type\": \"string\", \"location\": \"query\"}, \"mine\": {\"type\": \"string\", \"location\": \"query\"}}, \"id\": \"youtube.channels.list\", \"httpMethod\": \"GET\", \"path\": \"channels\", \"response\": {\"$ref\": \"ChannelListResponse\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_YoutubeService.class,
                "search",
                new Google_SearchServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_YoutubeService.class, "serviceName"),
                        "search",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/youtube\"], \"parameters\": {\"q\": {\"type\": \"string\", \"location\": \"query\"}, \"startIndex\": {\"format\": \"uint32\", \"default\": \"0\", \"maximum\": \"1000\", \"minimum\": \"0\", \"location\": \"query\", \"type\": \"integer\"}, \"type\": {\"repeated\": true, \"enum\": [\"channel\", \"playlist\", \"video\"], \"type\": \"string\", \"location\": \"query\"}, \"order\": {\"default\": \"SEARCH_SORT_RELEVANCE\", \"enum\": [\"date\", \"rating\", \"relevance\", \"view_count\"], \"type\": \"string\", \"location\": \"query\"}, \"maxResults\": {\"format\": \"uint32\", \"default\": \"25\", \"maximum\": \"50\", \"minimum\": \"0\", \"location\": \"query\", \"type\": \"integer\"}}, \"response\": {\"$ref\": \"SearchListResponse\"}, \"httpMethod\": \"GET\", \"path\": \"search\", \"id\": \"youtube.search.list\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_YoutubeService.class,
                "playlistitems",
                new Google_PlaylistitemsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_YoutubeService.class, "serviceName"),
                        "playlistitems",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/youtube\"], \"parameters\": {\"startIndex\": {\"minimum\": \"0\", \"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"part\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"playlistId\": {\"type\": \"string\", \"location\": \"query\"}, \"id\": {\"type\": \"string\", \"location\": \"query\"}, \"maxResults\": {\"default\": \"50\", \"minimum\": \"0\", \"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}}, \"id\": \"youtube.playlistitems.list\", \"httpMethod\": \"GET\", \"path\": \"playlistitems\", \"response\": {\"$ref\": \"PlaylistItemListResponse\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_YoutubeService.class,
                "playlists",
                new Google_PlaylistsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_YoutubeService.class, "serviceName"),
                        "playlists",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/youtube\"], \"parameters\": {\"part\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"id\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}}, \"id\": \"youtube.playlists.list\", \"httpMethod\": \"GET\", \"path\": \"playlists\", \"response\": {\"$ref\": \"PlaylistListResponse\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_YoutubeService.class,
                "videos",
                new Google_VideosServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_YoutubeService.class, "serviceName"),
                        "videos",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/youtube\"], \"parameters\": {\"part\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"id\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}}, \"id\": \"youtube.videos.list\", \"httpMethod\": \"GET\", \"path\": \"videos\", \"response\": {\"$ref\": \"VideoListResponse\"}}}}",
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
