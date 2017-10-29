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

public class Google_Visibility extends Google_Model implements RuntimeFileContextInterface {

    public Object kind = null;

    public Object visibility = null;

    public Object __linksType = "Google_OrkutLinkResource";

    public Object __linksDataType = "array";

    public Object links = null;

    public Google_Visibility(RuntimeEnv env, Object... args) {
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
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setVisibility":
                return this.setVisibility(env, args);
            case "getVisibility":
                return this.getVisibility(env, args);
            case "setLinks":
                return this.setLinks(env, args);
            case "getLinks":
                return this.getLinks(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return this.kind;
            case "visibility":
                return this.visibility;
            case "__linksType":
                if (Google_Visibility.class.isAssignableFrom(caller)) {

                    return this.__linksType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__linksDataType":
                if (Google_Visibility.class.isAssignableFrom(caller)) {

                    return this.__linksDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "links":
                return this.links;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return ZVal.isNull(this.kind);
            case "visibility":
                return ZVal.isNull(this.visibility);
            case "__linksType":
                if (Google_Visibility.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__linksType);
                }
                break;
            case "__linksDataType":
                if (Google_Visibility.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__linksDataType);
                }
                break;
            case "links":
                return ZVal.isNull(this.links);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                this.kind = value;
                break;
            case "visibility":
                this.visibility = value;
                break;
            case "__linksType":
                if (Google_Visibility.class.isAssignableFrom(caller)) {

                    this.__linksType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__linksDataType":
                if (Google_Visibility.class.isAssignableFrom(caller)) {

                    this.__linksDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "links":
                this.links = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Visibility.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Visibility.class, "kind"));
    }

    public Object setVisibility(RuntimeEnv env, Object... args) {
        Object visibility = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Visibility.class, "visibility", visibility);

        return null;
    }

    public Object getVisibility(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Visibility.class, "visibility"));
    }

    public Object setLinks(RuntimeEnv env, Object... args) {
        Object links = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_Visibility.class,
                links,
                "Google_OrkutLinkResource",
                "setLinks");
        ZVal.setProperty(this, Google_Visibility.class, "links", links);

        return null;
    }

    public Object getLinks(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Visibility.class, "links"));
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
