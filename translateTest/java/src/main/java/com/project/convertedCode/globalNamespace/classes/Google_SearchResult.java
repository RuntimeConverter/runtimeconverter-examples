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

public class Google_SearchResult extends Google_Model implements RuntimeFileContextInterface {

    public Object __snippetType = "Google_SearchResultSnippet";

    public Object __snippetDataType = "";

    public Object snippet = null;

    public Object kind = null;

    public Object etag = null;

    public Object __idType = "Google_ResourceId";

    public Object __idDataType = "";

    public Object id = null;

    public Google_SearchResult(RuntimeEnv env, Object... args) {
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
            case "setSnippet":
                return this.setSnippet(env, args);
            case "getSnippet":
                return this.getSnippet(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setEtag":
                return this.setEtag(env, args);
            case "getEtag":
                return this.getEtag(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__snippetType":
                if (Google_SearchResult.class.isAssignableFrom(caller)) {

                    return this.__snippetType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__snippetDataType":
                if (Google_SearchResult.class.isAssignableFrom(caller)) {

                    return this.__snippetDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "snippet":
                return this.snippet;
            case "kind":
                return this.kind;
            case "etag":
                return this.etag;
            case "__idType":
                if (Google_SearchResult.class.isAssignableFrom(caller)) {

                    return this.__idType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__idDataType":
                if (Google_SearchResult.class.isAssignableFrom(caller)) {

                    return this.__idDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "id":
                return this.id;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__snippetType":
                if (Google_SearchResult.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__snippetType);
                }
                break;
            case "__snippetDataType":
                if (Google_SearchResult.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__snippetDataType);
                }
                break;
            case "snippet":
                return ZVal.isNull(this.snippet);
            case "kind":
                return ZVal.isNull(this.kind);
            case "etag":
                return ZVal.isNull(this.etag);
            case "__idType":
                if (Google_SearchResult.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__idType);
                }
                break;
            case "__idDataType":
                if (Google_SearchResult.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__idDataType);
                }
                break;
            case "id":
                return ZVal.isNull(this.id);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__snippetType":
                if (Google_SearchResult.class.isAssignableFrom(caller)) {

                    this.__snippetType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__snippetDataType":
                if (Google_SearchResult.class.isAssignableFrom(caller)) {

                    this.__snippetDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "snippet":
                this.snippet = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "etag":
                this.etag = value;
                break;
            case "__idType":
                if (Google_SearchResult.class.isAssignableFrom(caller)) {

                    this.__idType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__idDataType":
                if (Google_SearchResult.class.isAssignableFrom(caller)) {

                    this.__idDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "id":
                this.id = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setSnippet(RuntimeEnv env, Object... args) {
        Object snippet = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_SearchResult.class, "snippet", snippet);

        return null;
    }

    public Object getSnippet(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_SearchResult.class, "snippet"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_SearchResult.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_SearchResult.class, "kind"));
    }

    public Object setEtag(RuntimeEnv env, Object... args) {
        Object etag = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_SearchResult.class, "etag", etag);

        return null;
    }

    public Object getEtag(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_SearchResult.class, "etag"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_SearchResult.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_SearchResult.class, "id"));
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
