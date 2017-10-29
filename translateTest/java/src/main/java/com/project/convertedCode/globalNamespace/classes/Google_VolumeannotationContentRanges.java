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

 google-api-php-client/src/contrib/Google_BooksService.php

*/

public class Google_VolumeannotationContentRanges extends Google_Model
        implements RuntimeFileContextInterface {

    public Object contentVersion = null;

    public Object __gbTextRangeType = "Google_BooksAnnotationsRange";

    public Object __gbTextRangeDataType = "";

    public Object gbTextRange = null;

    public Object __cfiRangeType = "Google_BooksAnnotationsRange";

    public Object __cfiRangeDataType = "";

    public Object cfiRange = null;

    public Object __gbImageRangeType = "Google_BooksAnnotationsRange";

    public Object __gbImageRangeDataType = "";

    public Object gbImageRange = null;

    public Google_VolumeannotationContentRanges(RuntimeEnv env, Object... args) {
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
            case "setContentVersion":
                return this.setContentVersion(env, args);
            case "getContentVersion":
                return this.getContentVersion(env, args);
            case "setGbTextRange":
                return this.setGbTextRange(env, args);
            case "getGbTextRange":
                return this.getGbTextRange(env, args);
            case "setCfiRange":
                return this.setCfiRange(env, args);
            case "getCfiRange":
                return this.getCfiRange(env, args);
            case "setGbImageRange":
                return this.setGbImageRange(env, args);
            case "getGbImageRange":
                return this.getGbImageRange(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "contentVersion":
                return this.contentVersion;
            case "__gbTextRangeType":
                if (Google_VolumeannotationContentRanges.class.isAssignableFrom(caller)) {

                    return this.__gbTextRangeType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__gbTextRangeDataType":
                if (Google_VolumeannotationContentRanges.class.isAssignableFrom(caller)) {

                    return this.__gbTextRangeDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "gbTextRange":
                return this.gbTextRange;
            case "__cfiRangeType":
                if (Google_VolumeannotationContentRanges.class.isAssignableFrom(caller)) {

                    return this.__cfiRangeType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__cfiRangeDataType":
                if (Google_VolumeannotationContentRanges.class.isAssignableFrom(caller)) {

                    return this.__cfiRangeDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "cfiRange":
                return this.cfiRange;
            case "__gbImageRangeType":
                if (Google_VolumeannotationContentRanges.class.isAssignableFrom(caller)) {

                    return this.__gbImageRangeType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__gbImageRangeDataType":
                if (Google_VolumeannotationContentRanges.class.isAssignableFrom(caller)) {

                    return this.__gbImageRangeDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "gbImageRange":
                return this.gbImageRange;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "contentVersion":
                return ZVal.isNull(this.contentVersion);
            case "__gbTextRangeType":
                if (Google_VolumeannotationContentRanges.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__gbTextRangeType);
                }
                break;
            case "__gbTextRangeDataType":
                if (Google_VolumeannotationContentRanges.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__gbTextRangeDataType);
                }
                break;
            case "gbTextRange":
                return ZVal.isNull(this.gbTextRange);
            case "__cfiRangeType":
                if (Google_VolumeannotationContentRanges.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__cfiRangeType);
                }
                break;
            case "__cfiRangeDataType":
                if (Google_VolumeannotationContentRanges.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__cfiRangeDataType);
                }
                break;
            case "cfiRange":
                return ZVal.isNull(this.cfiRange);
            case "__gbImageRangeType":
                if (Google_VolumeannotationContentRanges.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__gbImageRangeType);
                }
                break;
            case "__gbImageRangeDataType":
                if (Google_VolumeannotationContentRanges.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__gbImageRangeDataType);
                }
                break;
            case "gbImageRange":
                return ZVal.isNull(this.gbImageRange);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "contentVersion":
                this.contentVersion = value;
                break;
            case "__gbTextRangeType":
                if (Google_VolumeannotationContentRanges.class.isAssignableFrom(caller)) {

                    this.__gbTextRangeType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__gbTextRangeDataType":
                if (Google_VolumeannotationContentRanges.class.isAssignableFrom(caller)) {

                    this.__gbTextRangeDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "gbTextRange":
                this.gbTextRange = value;
                break;
            case "__cfiRangeType":
                if (Google_VolumeannotationContentRanges.class.isAssignableFrom(caller)) {

                    this.__cfiRangeType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__cfiRangeDataType":
                if (Google_VolumeannotationContentRanges.class.isAssignableFrom(caller)) {

                    this.__cfiRangeDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "cfiRange":
                this.cfiRange = value;
                break;
            case "__gbImageRangeType":
                if (Google_VolumeannotationContentRanges.class.isAssignableFrom(caller)) {

                    this.__gbImageRangeType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__gbImageRangeDataType":
                if (Google_VolumeannotationContentRanges.class.isAssignableFrom(caller)) {

                    this.__gbImageRangeDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "gbImageRange":
                this.gbImageRange = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setContentVersion(RuntimeEnv env, Object... args) {
        Object contentVersion = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_VolumeannotationContentRanges.class, "contentVersion", contentVersion);

        return null;
    }

    public Object getContentVersion(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_VolumeannotationContentRanges.class, "contentVersion"));
    }

    public Object setGbTextRange(RuntimeEnv env, Object... args) {
        Object gbTextRange = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_VolumeannotationContentRanges.class, "gbTextRange", gbTextRange);

        return null;
    }

    public Object getGbTextRange(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_VolumeannotationContentRanges.class, "gbTextRange"));
    }

    public Object setCfiRange(RuntimeEnv env, Object... args) {
        Object cfiRange = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_VolumeannotationContentRanges.class, "cfiRange", cfiRange);

        return null;
    }

    public Object getCfiRange(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_VolumeannotationContentRanges.class, "cfiRange"));
    }

    public Object setGbImageRange(RuntimeEnv env, Object... args) {
        Object gbImageRange = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_VolumeannotationContentRanges.class, "gbImageRange", gbImageRange);

        return null;
    }

    public Object getGbImageRange(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_VolumeannotationContentRanges.class, "gbImageRange"));
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
