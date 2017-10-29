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

public class Google_OrkutCommunitypolloptionResource extends Google_Model
        implements RuntimeFileContextInterface {

    public Object __imageType = "Google_OrkutCommunitypolloptionResourceImage";

    public Object __imageDataType = "";

    public Object image = null;

    public Object optionId = null;

    public Object description = null;

    public Object numberOfVotes = null;

    public Google_OrkutCommunitypolloptionResource(RuntimeEnv env, Object... args) {
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
            case "setImage":
                return this.setImage(env, args);
            case "getImage":
                return this.getImage(env, args);
            case "setOptionId":
                return this.setOptionId(env, args);
            case "getOptionId":
                return this.getOptionId(env, args);
            case "setDescription":
                return this.setDescription(env, args);
            case "getDescription":
                return this.getDescription(env, args);
            case "setNumberOfVotes":
                return this.setNumberOfVotes(env, args);
            case "getNumberOfVotes":
                return this.getNumberOfVotes(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__imageType":
                if (Google_OrkutCommunitypolloptionResource.class.isAssignableFrom(caller)) {

                    return this.__imageType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__imageDataType":
                if (Google_OrkutCommunitypolloptionResource.class.isAssignableFrom(caller)) {

                    return this.__imageDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "image":
                return this.image;
            case "optionId":
                return this.optionId;
            case "description":
                return this.description;
            case "numberOfVotes":
                return this.numberOfVotes;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__imageType":
                if (Google_OrkutCommunitypolloptionResource.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__imageType);
                }
                break;
            case "__imageDataType":
                if (Google_OrkutCommunitypolloptionResource.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__imageDataType);
                }
                break;
            case "image":
                return ZVal.isNull(this.image);
            case "optionId":
                return ZVal.isNull(this.optionId);
            case "description":
                return ZVal.isNull(this.description);
            case "numberOfVotes":
                return ZVal.isNull(this.numberOfVotes);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__imageType":
                if (Google_OrkutCommunitypolloptionResource.class.isAssignableFrom(caller)) {

                    this.__imageType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__imageDataType":
                if (Google_OrkutCommunitypolloptionResource.class.isAssignableFrom(caller)) {

                    this.__imageDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "image":
                this.image = value;
                break;
            case "optionId":
                this.optionId = value;
                break;
            case "description":
                this.description = value;
                break;
            case "numberOfVotes":
                this.numberOfVotes = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setImage(RuntimeEnv env, Object... args) {
        Object image = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_OrkutCommunitypolloptionResource.class, "image", image);

        return null;
    }

    public Object getImage(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_OrkutCommunitypolloptionResource.class, "image"));
    }

    public Object setOptionId(RuntimeEnv env, Object... args) {
        Object optionId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_OrkutCommunitypolloptionResource.class, "optionId", optionId);

        return null;
    }

    public Object getOptionId(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_OrkutCommunitypolloptionResource.class, "optionId"));
    }

    public Object setDescription(RuntimeEnv env, Object... args) {
        Object description = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_OrkutCommunitypolloptionResource.class, "description", description);

        return null;
    }

    public Object getDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_OrkutCommunitypolloptionResource.class, "description"));
    }

    public Object setNumberOfVotes(RuntimeEnv env, Object... args) {
        Object numberOfVotes = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_OrkutCommunitypolloptionResource.class,
                "numberOfVotes",
                numberOfVotes);

        return null;
    }

    public Object getNumberOfVotes(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_OrkutCommunitypolloptionResource.class, "numberOfVotes"));
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
