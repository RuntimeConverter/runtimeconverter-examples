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

 google-api-php-client/src/contrib/Google_PlusService.php

*/

public class file_Google_PlusService_php implements RuntimeIncludable, RuntimeFileContextInterface {

    public static final file_Google_PlusService_php instance = new file_Google_PlusService_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope35 scope = new Scope35();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope35 scope)
            throws IncludeEventException {
        // Conversion Note: class named Google_ActivitiesServiceResource was here in the source code
        // Conversion Note: class named Google_CommentsServiceResource was here in the source code
        // Conversion Note: class named Google_PeopleServiceResource was here in the source code
        // Conversion Note: class named Google_PlusService was here in the source code
        // Conversion Note: class named Google_Acl was here in the source code
        // Conversion Note: class named Google_Activity was here in the source code
        // Conversion Note: class named Google_ActivityActor was here in the source code
        // Conversion Note: class named Google_ActivityActorImage was here in the source code
        // Conversion Note: class named Google_ActivityActorName was here in the source code
        // Conversion Note: class named Google_ActivityFeed was here in the source code
        // Conversion Note: class named Google_ActivityObject was here in the source code
        // Conversion Note: class named Google_ActivityObjectActor was here in the source code
        // Conversion Note: class named Google_ActivityObjectActorImage was here in the source code
        // Conversion Note: class named Google_ActivityObjectAttachments was here in the source code
        // Conversion Note: class named Google_ActivityObjectAttachmentsEmbed was here in the source code
        // Conversion Note: class named Google_ActivityObjectAttachmentsFullImage was here in the source code
        // Conversion Note: class named Google_ActivityObjectAttachmentsImage was here in the source code
        // Conversion Note: class named Google_ActivityObjectPlusoners was here in the source code
        // Conversion Note: class named Google_ActivityObjectReplies was here in the source code
        // Conversion Note: class named Google_ActivityObjectResharers was here in the source code
        // Conversion Note: class named Google_ActivityProvider was here in the source code
        // Conversion Note: class named Google_Comment was here in the source code
        // Conversion Note: class named Google_CommentActor was here in the source code
        // Conversion Note: class named Google_CommentActorImage was here in the source code
        // Conversion Note: class named Google_CommentFeed was here in the source code
        // Conversion Note: class named Google_CommentInReplyTo was here in the source code
        // Conversion Note: class named Google_CommentObject was here in the source code
        // Conversion Note: class named Google_PeopleFeed was here in the source code
        // Conversion Note: class named Google_Person was here in the source code
        // Conversion Note: class named Google_PersonEmails was here in the source code
        // Conversion Note: class named Google_PersonImage was here in the source code
        // Conversion Note: class named Google_PersonName was here in the source code
        // Conversion Note: class named Google_PersonOrganizations was here in the source code
        // Conversion Note: class named Google_PersonPlacesLived was here in the source code
        // Conversion Note: class named Google_PersonUrls was here in the source code
        // Conversion Note: class named Google_PlusAclentryResource was here in the source code

    }

    @Override
    public String ___getRuntimeDirname() {
        return "/google-api-php-client/src/contrib";
    }

    @Override
    public String ___getRuntimeFilename() {
        return "/google-api-php-client/src/contrib/Google_PlusService.php";
    }

    @Override
    public String ___getRuntimeNamespace() {
        return "";
    }

    private static class Scope35 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
