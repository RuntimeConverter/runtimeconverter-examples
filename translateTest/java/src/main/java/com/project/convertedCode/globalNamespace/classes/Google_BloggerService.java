package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Google_Service;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Google_CommentsServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_UsersServiceResource;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.classes.Google_BlogsServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_PagesServiceResource;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.classes.Google_PostsServiceResource;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_BloggerService.php

*/

public class Google_BloggerService extends Google_Service implements RuntimeFileContextInterface {

    public Object blogs = null;

    public Object posts = null;

    public Object pages = null;

    public Object comments = null;

    public Object users = null;

    public Google_BloggerService(RuntimeEnv env, Object... args) {
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
            case "blogs":
                return this.blogs;
            case "posts":
                return this.posts;
            case "pages":
                return this.pages;
            case "comments":
                return this.comments;
            case "users":
                return this.users;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "blogs":
                return ZVal.isNull(this.blogs);
            case "posts":
                return ZVal.isNull(this.posts);
            case "pages":
                return ZVal.isNull(this.pages);
            case "comments":
                return ZVal.isNull(this.comments);
            case "users":
                return ZVal.isNull(this.users);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "blogs":
                this.blogs = value;
                break;
            case "posts":
                this.posts = value;
                break;
            case "pages":
                this.pages = value;
                break;
            case "comments":
                this.comments = value;
                break;
            case "users":
                this.users = value;
                break;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object client = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_BloggerService.class, "servicePath", "blogger/v3/");
        ZVal.setProperty(this, Google_BloggerService.class, "version", "v3");
        ZVal.setProperty(this, Google_BloggerService.class, "serviceName", "blogger");
        env.callMethod(
                client,
                "addService",
                Google_BloggerService.class,
                ZVal.getProperty(this, Google_BloggerService.class, "serviceName"),
                ZVal.getProperty(this, Google_BloggerService.class, "version"));
        ZVal.setProperty(
                this,
                Google_BloggerService.class,
                "blogs",
                new Google_BlogsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_BloggerService.class, "serviceName"),
                        "blogs",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"listByUser\": {\"scopes\": [\"https://www.googleapis.com/auth/blogger\", \"https://www.googleapis.com/auth/blogger.readonly\"], \"parameters\": {\"userId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"blogger.blogs.listByUser\", \"httpMethod\": \"GET\", \"path\": \"users/{userId}/blogs\", \"response\": {\"$ref\": \"BlogList\"}}, \"getByUrl\": {\"scopes\": [\"https://www.googleapis.com/auth/blogger\", \"https://www.googleapis.com/auth/blogger.readonly\"], \"parameters\": {\"url\": {\"type\": \"string\", \"location\": \"query\"}}, \"response\": {\"$ref\": \"Blog\"}, \"httpMethod\": \"GET\", \"path\": \"blogs/byurl\", \"id\": \"blogger.blogs.getByUrl\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/blogger\", \"https://www.googleapis.com/auth/blogger.readonly\"], \"parameters\": {\"maxPosts\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"blogId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"blogger.blogs.get\", \"httpMethod\": \"GET\", \"path\": \"blogs/{blogId}\", \"response\": {\"$ref\": \"Blog\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_BloggerService.class,
                "posts",
                new Google_PostsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_BloggerService.class, "serviceName"),
                        "posts",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/blogger\"], \"parameters\": {\"blogId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Post\"}, \"response\": {\"$ref\": \"Post\"}, \"httpMethod\": \"POST\", \"path\": \"blogs/{blogId}/posts\", \"id\": \"blogger.posts.insert\"}, \"search\": {\"scopes\": [\"https://www.googleapis.com/auth/blogger\", \"https://www.googleapis.com/auth/blogger.readonly\"], \"parameters\": {\"q\": {\"type\": \"string\", \"location\": \"query\"}, \"blogId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"blogger.posts.search\", \"httpMethod\": \"GET\", \"path\": \"blogs/{blogId}/posts/search\", \"response\": {\"$ref\": \"PostList\"}}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/blogger\", \"https://www.googleapis.com/auth/blogger.readonly\"], \"parameters\": {\"maxComments\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"blogId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"postId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"blogger.posts.get\", \"httpMethod\": \"GET\", \"path\": \"blogs/{blogId}/posts/{postId}\", \"response\": {\"$ref\": \"Post\"}}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/blogger\", \"https://www.googleapis.com/auth/blogger.readonly\"], \"parameters\": {\"startDate\": {\"type\": \"string\", \"location\": \"query\", \"format\": \"date-time\"}, \"endDate\": {\"type\": \"string\", \"location\": \"query\", \"format\": \"date-time\"}, \"labels\": {\"type\": \"string\", \"location\": \"query\"}, \"maxResults\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"fetchBodies\": {\"type\": \"boolean\", \"location\": \"query\"}, \"blogId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"blogger.posts.list\", \"httpMethod\": \"GET\", \"path\": \"blogs/{blogId}/posts\", \"response\": {\"$ref\": \"PostList\"}}, \"update\": {\"scopes\": [\"https://www.googleapis.com/auth/blogger\"], \"parameters\": {\"postId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"blogId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Post\"}, \"response\": {\"$ref\": \"Post\"}, \"httpMethod\": \"PUT\", \"path\": \"blogs/{blogId}/posts/{postId}\", \"id\": \"blogger.posts.update\"}, \"getByPath\": {\"scopes\": [\"https://www.googleapis.com/auth/blogger\", \"https://www.googleapis.com/auth/blogger.readonly\"], \"parameters\": {\"path\": {\"type\": \"string\", \"location\": \"query\"}, \"maxComments\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"blogId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"blogger.posts.getByPath\", \"httpMethod\": \"GET\", \"path\": \"blogs/{blogId}/posts/bypath\", \"response\": {\"$ref\": \"Post\"}}, \"patch\": {\"scopes\": [\"https://www.googleapis.com/auth/blogger\"], \"parameters\": {\"postId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"blogId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Post\"}, \"response\": {\"$ref\": \"Post\"}, \"httpMethod\": \"PATCH\", \"path\": \"blogs/{blogId}/posts/{postId}\", \"id\": \"blogger.posts.patch\"}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/blogger\"], \"path\": \"blogs/{blogId}/posts/{postId}\", \"id\": \"blogger.posts.delete\", \"parameters\": {\"postId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"blogId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"httpMethod\": \"DELETE\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_BloggerService.class,
                "pages",
                new Google_PagesServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_BloggerService.class, "serviceName"),
                        "pages",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/blogger\", \"https://www.googleapis.com/auth/blogger.readonly\"], \"parameters\": {\"fetchBodies\": {\"type\": \"boolean\", \"location\": \"query\"}, \"blogId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"blogger.pages.list\", \"httpMethod\": \"GET\", \"path\": \"blogs/{blogId}/pages\", \"response\": {\"$ref\": \"PageList\"}}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/blogger\", \"https://www.googleapis.com/auth/blogger.readonly\"], \"parameters\": {\"pageId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"blogId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"blogger.pages.get\", \"httpMethod\": \"GET\", \"path\": \"blogs/{blogId}/pages/{pageId}\", \"response\": {\"$ref\": \"Page\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_BloggerService.class,
                "comments",
                new Google_CommentsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_BloggerService.class, "serviceName"),
                        "comments",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/blogger\", \"https://www.googleapis.com/auth/blogger.readonly\"], \"parameters\": {\"startDate\": {\"type\": \"string\", \"location\": \"query\", \"format\": \"date-time\"}, \"postId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"endDate\": {\"type\": \"string\", \"location\": \"query\", \"format\": \"date-time\"}, \"maxResults\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"fetchBodies\": {\"type\": \"boolean\", \"location\": \"query\"}, \"blogId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"blogger.comments.list\", \"httpMethod\": \"GET\", \"path\": \"blogs/{blogId}/posts/{postId}/comments\", \"response\": {\"$ref\": \"CommentList\"}}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/blogger\", \"https://www.googleapis.com/auth/blogger.readonly\"], \"parameters\": {\"commentId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"postId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"blogId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"blogger.comments.get\", \"httpMethod\": \"GET\", \"path\": \"blogs/{blogId}/posts/{postId}/comments/{commentId}\", \"response\": {\"$ref\": \"Comment\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_BloggerService.class,
                "users",
                new Google_UsersServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_BloggerService.class, "serviceName"),
                        "users",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"get\": {\"scopes\": [\"https://www.googleapis.com/auth/blogger\", \"https://www.googleapis.com/auth/blogger.readonly\"], \"parameters\": {\"userId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"blogger.users.get\", \"httpMethod\": \"GET\", \"path\": \"users/{userId}\", \"response\": {\"$ref\": \"User\"}}}}",
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
