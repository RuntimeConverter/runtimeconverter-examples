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

 google-api-php-client/src/contrib/Google_CalendarService.php

*/

public class Google_EventGadget extends Google_Model implements RuntimeFileContextInterface {

    public Object preferences = null;

    public Object title = null;

    public Object height = null;

    public Object width = null;

    public Object link = null;

    public Object type = null;

    public Object display = null;

    public Object iconLink = null;

    public Google_EventGadget(RuntimeEnv env, Object... args) {
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
            case "setPreferences":
                return this.setPreferences(env, args);
            case "getPreferences":
                return this.getPreferences(env, args);
            case "setTitle":
                return this.setTitle(env, args);
            case "getTitle":
                return this.getTitle(env, args);
            case "setHeight":
                return this.setHeight(env, args);
            case "getHeight":
                return this.getHeight(env, args);
            case "setWidth":
                return this.setWidth(env, args);
            case "getWidth":
                return this.getWidth(env, args);
            case "setLink":
                return this.setLink(env, args);
            case "getLink":
                return this.getLink(env, args);
            case "setType":
                return this.setType(env, args);
            case "getType":
                return this.getType(env, args);
            case "setDisplay":
                return this.setDisplay(env, args);
            case "getDisplay":
                return this.getDisplay(env, args);
            case "setIconLink":
                return this.setIconLink(env, args);
            case "getIconLink":
                return this.getIconLink(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "preferences":
                return this.preferences;
            case "title":
                return this.title;
            case "height":
                return this.height;
            case "width":
                return this.width;
            case "link":
                return this.link;
            case "type":
                return this.type;
            case "display":
                return this.display;
            case "iconLink":
                return this.iconLink;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "preferences":
                return ZVal.isNull(this.preferences);
            case "title":
                return ZVal.isNull(this.title);
            case "height":
                return ZVal.isNull(this.height);
            case "width":
                return ZVal.isNull(this.width);
            case "link":
                return ZVal.isNull(this.link);
            case "type":
                return ZVal.isNull(this.type);
            case "display":
                return ZVal.isNull(this.display);
            case "iconLink":
                return ZVal.isNull(this.iconLink);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "preferences":
                this.preferences = value;
                break;
            case "title":
                this.title = value;
                break;
            case "height":
                this.height = value;
                break;
            case "width":
                this.width = value;
                break;
            case "link":
                this.link = value;
                break;
            case "type":
                this.type = value;
                break;
            case "display":
                this.display = value;
                break;
            case "iconLink":
                this.iconLink = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setPreferences(RuntimeEnv env, Object... args) {
        Object preferences = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_EventGadget.class, "preferences", preferences);

        return null;
    }

    public Object getPreferences(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_EventGadget.class, "preferences"));
    }

    public Object setTitle(RuntimeEnv env, Object... args) {
        Object title = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_EventGadget.class, "title", title);

        return null;
    }

    public Object getTitle(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_EventGadget.class, "title"));
    }

    public Object setHeight(RuntimeEnv env, Object... args) {
        Object height = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_EventGadget.class, "height", height);

        return null;
    }

    public Object getHeight(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_EventGadget.class, "height"));
    }

    public Object setWidth(RuntimeEnv env, Object... args) {
        Object width = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_EventGadget.class, "width", width);

        return null;
    }

    public Object getWidth(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_EventGadget.class, "width"));
    }

    public Object setLink(RuntimeEnv env, Object... args) {
        Object link = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_EventGadget.class, "link", link);

        return null;
    }

    public Object getLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_EventGadget.class, "link"));
    }

    public Object setType(RuntimeEnv env, Object... args) {
        Object type = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_EventGadget.class, "type", type);

        return null;
    }

    public Object getType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_EventGadget.class, "type"));
    }

    public Object setDisplay(RuntimeEnv env, Object... args) {
        Object display = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_EventGadget.class, "display", display);

        return null;
    }

    public Object getDisplay(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_EventGadget.class, "display"));
    }

    public Object setIconLink(RuntimeEnv env, Object... args) {
        Object iconLink = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_EventGadget.class, "iconLink", iconLink);

        return null;
    }

    public Object getIconLink(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_EventGadget.class, "iconLink"));
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
