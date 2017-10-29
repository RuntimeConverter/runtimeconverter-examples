package com.project.convertedCode.includes.google_api_php_client.src.contrib;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_YoutubeService.php

*/

public class file_Google_YoutubeService_php
        implements RuntimeIncludable, RuntimeFileContextInterface {

    public static final file_Google_YoutubeService_php instance =
            new file_Google_YoutubeService_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope45 scope = new Scope45();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope45 scope)
            throws IncludeEventException {
        // Conversion Note: class named Google_ChannelsServiceResource was here in the source code
        // Conversion Note: class named Google_SearchServiceResource was here in the source code
        // Conversion Note: class named Google_PlaylistitemsServiceResource was here in the source code
        // Conversion Note: class named Google_PlaylistsServiceResource was here in the source code
        // Conversion Note: class named Google_VideosServiceResource was here in the source code
        // Conversion Note: class named Google_YoutubeService was here in the source code
        // Conversion Note: class named Google_Channel was here in the source code
        // Conversion Note: class named Google_ChannelContentDetails was here in the source code
        // Conversion Note: class named Google_ChannelListResponse was here in the source code
        // Conversion Note: class named Google_ChannelSnippet was here in the source code
        // Conversion Note: class named Google_ChannelStatistics was here in the source code
        // Conversion Note: class named Google_PageInfo was here in the source code
        // Conversion Note: class named Google_Playlist was here in the source code
        // Conversion Note: class named Google_PlaylistItem was here in the source code
        // Conversion Note: class named Google_PlaylistItemListResponse was here in the source code
        // Conversion Note: class named Google_PlaylistItemSnippet was here in the source code
        // Conversion Note: class named Google_PlaylistListResponse was here in the source code
        // Conversion Note: class named Google_PlaylistSnippet was here in the source code
        // Conversion Note: class named Google_ResourceId was here in the source code
        // Conversion Note: class named Google_SearchListResponse was here in the source code
        // Conversion Note: class named Google_SearchResult was here in the source code
        // Conversion Note: class named Google_SearchResultSnippet was here in the source code
        // Conversion Note: class named Google_Thumbnail was here in the source code
        // Conversion Note: class named Google_Video was here in the source code
        // Conversion Note: class named Google_VideoContentDetails was here in the source code
        // Conversion Note: class named Google_VideoListResponse was here in the source code
        // Conversion Note: class named Google_VideoPlayer was here in the source code
        // Conversion Note: class named Google_VideoSnippet was here in the source code
        // Conversion Note: class named Google_VideoStatistics was here in the source code
        // Conversion Note: class named Google_VideoStatus was here in the source code

    }

    @Override
    public String ___getRuntimeDirname() {
        return "/google-api-php-client/src/contrib";
    }

    @Override
    public String ___getRuntimeFilename() {
        return "/google-api-php-client/src/contrib/Google_YoutubeService.php";
    }

    @Override
    public String ___getRuntimeNamespace() {
        return "";
    }

    private static class Scope45 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
