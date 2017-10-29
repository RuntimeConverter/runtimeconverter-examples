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

 google-api-php-client/src/contrib/Google_BloggerService.php

*/

public class file_Google_BloggerService_php
        implements RuntimeIncludable, RuntimeFileContextInterface {

    public static final file_Google_BloggerService_php instance =
            new file_Google_BloggerService_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope19 scope = new Scope19();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope19 scope)
            throws IncludeEventException {
        // Conversion Note: class named Google_BlogsServiceResource was here in the source code
        // Conversion Note: class named Google_PostsServiceResource was here in the source code
        // Conversion Note: class named Google_PagesServiceResource was here in the source code
        // Conversion Note: class named Google_CommentsServiceResource was here in the source code
        // Conversion Note: class named Google_UsersServiceResource was here in the source code
        // Conversion Note: class named Google_BloggerService was here in the source code
        // Conversion Note: class named Google_Blog was here in the source code
        // Conversion Note: class named Google_BlogList was here in the source code
        // Conversion Note: class named Google_BlogLocale was here in the source code
        // Conversion Note: class named Google_BlogPages was here in the source code
        // Conversion Note: class named Google_BlogPosts was here in the source code
        // Conversion Note: class named Google_Comment was here in the source code
        // Conversion Note: class named Google_CommentAuthor was here in the source code
        // Conversion Note: class named Google_CommentAuthorImage was here in the source code
        // Conversion Note: class named Google_CommentBlog was here in the source code
        // Conversion Note: class named Google_CommentInReplyTo was here in the source code
        // Conversion Note: class named Google_CommentList was here in the source code
        // Conversion Note: class named Google_CommentPost was here in the source code
        // Conversion Note: class named Google_Page was here in the source code
        // Conversion Note: class named Google_PageAuthor was here in the source code
        // Conversion Note: class named Google_PageAuthorImage was here in the source code
        // Conversion Note: class named Google_PageBlog was here in the source code
        // Conversion Note: class named Google_PageList was here in the source code
        // Conversion Note: class named Google_Post was here in the source code
        // Conversion Note: class named Google_PostAuthor was here in the source code
        // Conversion Note: class named Google_PostAuthorImage was here in the source code
        // Conversion Note: class named Google_PostBlog was here in the source code
        // Conversion Note: class named Google_PostList was here in the source code
        // Conversion Note: class named Google_PostLocation was here in the source code
        // Conversion Note: class named Google_PostReplies was here in the source code
        // Conversion Note: class named Google_User was here in the source code
        // Conversion Note: class named Google_UserBlogs was here in the source code
        // Conversion Note: class named Google_UserLocale was here in the source code

    }

    @Override
    public String ___getRuntimeDirname() {
        return "/google-api-php-client/src/contrib";
    }

    @Override
    public String ___getRuntimeFilename() {
        return "/google-api-php-client/src/contrib/Google_BloggerService.php";
    }

    @Override
    public String ___getRuntimeNamespace() {
        return "";
    }

    private static class Scope19 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
