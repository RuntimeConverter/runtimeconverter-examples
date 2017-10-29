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

 google-api-php-client/src/contrib/Google_YoutubeService.php

*/

public class Google_ChannelSnippet extends Google_Model implements RuntimeFileContextInterface {

    public Object title = null;

    public Object description = null;

    public Object __thumbnailsType = "Google_Thumbnail";

    public Object __thumbnailsDataType = "map";

    public Object thumbnails = null;

    public Google_ChannelSnippet(RuntimeEnv env, Object... args) {
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
            case "setTitle":
                return this.setTitle(env, args);
            case "getTitle":
                return this.getTitle(env, args);
            case "setDescription":
                return this.setDescription(env, args);
            case "getDescription":
                return this.getDescription(env, args);
            case "setThumbnails":
                return this.setThumbnails(env, args);
            case "getThumbnails":
                return this.getThumbnails(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "title":
                return this.title;
            case "description":
                return this.description;
            case "__thumbnailsType":
                if (Google_ChannelSnippet.class.isAssignableFrom(caller)) {

                    return this.__thumbnailsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__thumbnailsDataType":
                if (Google_ChannelSnippet.class.isAssignableFrom(caller)) {

                    return this.__thumbnailsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "thumbnails":
                return this.thumbnails;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "title":
                return ZVal.isNull(this.title);
            case "description":
                return ZVal.isNull(this.description);
            case "__thumbnailsType":
                if (Google_ChannelSnippet.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__thumbnailsType);
                }
                break;
            case "__thumbnailsDataType":
                if (Google_ChannelSnippet.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__thumbnailsDataType);
                }
                break;
            case "thumbnails":
                return ZVal.isNull(this.thumbnails);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "title":
                this.title = value;
                break;
            case "description":
                this.description = value;
                break;
            case "__thumbnailsType":
                if (Google_ChannelSnippet.class.isAssignableFrom(caller)) {

                    this.__thumbnailsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__thumbnailsDataType":
                if (Google_ChannelSnippet.class.isAssignableFrom(caller)) {

                    this.__thumbnailsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "thumbnails":
                this.thumbnails = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setTitle(RuntimeEnv env, Object... args) {
        Object title = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ChannelSnippet.class, "title", title);

        return null;
    }

    public Object getTitle(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ChannelSnippet.class, "title"));
    }

    public Object setDescription(RuntimeEnv env, Object... args) {
        Object description = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ChannelSnippet.class, "description", description);

        return null;
    }

    public Object getDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ChannelSnippet.class, "description"));
    }

    public Object setThumbnails(RuntimeEnv env, Object... args) {
        Object thumbnails = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ChannelSnippet.class, "thumbnails", thumbnails);

        return null;
    }

    public Object getThumbnails(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ChannelSnippet.class, "thumbnails"));
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
