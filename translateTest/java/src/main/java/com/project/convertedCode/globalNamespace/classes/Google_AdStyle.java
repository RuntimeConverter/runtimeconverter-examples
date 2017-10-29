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

 google-api-php-client/src/contrib/Google_AdsensehostService.php

*/

public class Google_AdStyle extends Google_Model implements RuntimeFileContextInterface {

    public Object corners = null;

    public Object __colorsType = "Google_AdStyleColors";

    public Object __colorsDataType = "";

    public Object colors = null;

    public Object __fontType = "Google_AdStyleFont";

    public Object __fontDataType = "";

    public Object font = null;

    public Object kind = null;

    public Google_AdStyle(RuntimeEnv env, Object... args) {
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
            case "setCorners":
                return this.setCorners(env, args);
            case "getCorners":
                return this.getCorners(env, args);
            case "setColors":
                return this.setColors(env, args);
            case "getColors":
                return this.getColors(env, args);
            case "setFont":
                return this.setFont(env, args);
            case "getFont":
                return this.getFont(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "corners":
                return this.corners;
            case "__colorsType":
                if (Google_AdStyle.class.isAssignableFrom(caller)) {

                    return this.__colorsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__colorsDataType":
                if (Google_AdStyle.class.isAssignableFrom(caller)) {

                    return this.__colorsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "colors":
                return this.colors;
            case "__fontType":
                if (Google_AdStyle.class.isAssignableFrom(caller)) {

                    return this.__fontType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__fontDataType":
                if (Google_AdStyle.class.isAssignableFrom(caller)) {

                    return this.__fontDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "font":
                return this.font;
            case "kind":
                return this.kind;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "corners":
                return ZVal.isNull(this.corners);
            case "__colorsType":
                if (Google_AdStyle.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__colorsType);
                }
                break;
            case "__colorsDataType":
                if (Google_AdStyle.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__colorsDataType);
                }
                break;
            case "colors":
                return ZVal.isNull(this.colors);
            case "__fontType":
                if (Google_AdStyle.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__fontType);
                }
                break;
            case "__fontDataType":
                if (Google_AdStyle.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__fontDataType);
                }
                break;
            case "font":
                return ZVal.isNull(this.font);
            case "kind":
                return ZVal.isNull(this.kind);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "corners":
                this.corners = value;
                break;
            case "__colorsType":
                if (Google_AdStyle.class.isAssignableFrom(caller)) {

                    this.__colorsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__colorsDataType":
                if (Google_AdStyle.class.isAssignableFrom(caller)) {

                    this.__colorsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "colors":
                this.colors = value;
                break;
            case "__fontType":
                if (Google_AdStyle.class.isAssignableFrom(caller)) {

                    this.__fontType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__fontDataType":
                if (Google_AdStyle.class.isAssignableFrom(caller)) {

                    this.__fontDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "font":
                this.font = value;
                break;
            case "kind":
                this.kind = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setCorners(RuntimeEnv env, Object... args) {
        Object corners = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AdStyle.class, "corners", corners);

        return null;
    }

    public Object getCorners(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AdStyle.class, "corners"));
    }

    public Object setColors(RuntimeEnv env, Object... args) {
        Object colors = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AdStyle.class, "colors", colors);

        return null;
    }

    public Object getColors(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AdStyle.class, "colors"));
    }

    public Object setFont(RuntimeEnv env, Object... args) {
        Object font = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AdStyle.class, "font", font);

        return null;
    }

    public Object getFont(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AdStyle.class, "font"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_AdStyle.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_AdStyle.class, "kind"));
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
