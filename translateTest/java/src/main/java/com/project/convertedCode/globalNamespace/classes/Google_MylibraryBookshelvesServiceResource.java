package com.project.convertedCode.globalNamespace.classes;

import com.project.convertedCode.globalNamespace.classes.Google_ServiceResource;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.classes.Google_Bookshelf;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.project.convertedCode.globalNamespace.classes.Google_Bookshelves;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_BooksService.php

*/

public class Google_MylibraryBookshelvesServiceResource extends Google_ServiceResource
        implements RuntimeFileContextInterface {

    public Google_MylibraryBookshelvesServiceResource(RuntimeEnv env, Object... args) {
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
            case "removeVolume":
                return this.removeVolume(env, args);
            case "get":
                return this.get(env, args);
            case "clearVolumes":
                return this.clearVolumes(env, args);
            case "listMylibraryBookshelves":
                return this.listMylibraryBookshelves(env, args);
            case "addVolume":
                return this.addVolume(env, args);
            case "moveVolume":
                return this.moveVolume(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        super.__set(key, value, caller);
    }

    public Object removeVolume(RuntimeEnv env, Object... args) {
        Object shelf = ZVal.assignParameter(args, 0, null);
        Object volumeId = ZVal.assignParameter(args, 1, null);
        Object optParams = ZVal.assignParameter(args, 2, null);
        if (ZVal.isNull(optParams)) {
            optParams = ZVal.newArray();
        }
        Object data = null;
        Object params = null;
        params = ZVal.newArray(new ZPair("shelf", shelf), new ZPair("volumeId", volumeId));
        params = CRArrayF.array_merge.call(env, params, optParams);
        data =
                env.callMethod(
                        this,
                        "__call",
                        Google_MylibraryBookshelvesServiceResource.class,
                        "removeVolume",
                        ZVal.newArray(new ZPair(0, params)));
        return ZVal.assign(data);
    }

    public Object get(RuntimeEnv env, Object... args) {
        Object shelf = ZVal.assignParameter(args, 0, null);
        Object optParams = ZVal.assignParameter(args, 1, null);
        if (ZVal.isNull(optParams)) {
            optParams = ZVal.newArray();
        }
        Object data = null;
        Object params = null;
        params = ZVal.newArray(new ZPair("shelf", shelf));
        params = CRArrayF.array_merge.call(env, params, optParams);
        data =
                env.callMethod(
                        this,
                        "__call",
                        Google_MylibraryBookshelvesServiceResource.class,
                        "get",
                        ZVal.newArray(new ZPair(0, params)));
        if (ZVal.isTrue(
                env.callMethod(
                        this, "useObjects", Google_MylibraryBookshelvesServiceResource.class))) {
            return ZVal.assign(new Google_Bookshelf(env, data));

        } else {
            return ZVal.assign(data);
        }
    }

    public Object clearVolumes(RuntimeEnv env, Object... args) {
        Object shelf = ZVal.assignParameter(args, 0, null);
        Object optParams = ZVal.assignParameter(args, 1, null);
        if (ZVal.isNull(optParams)) {
            optParams = ZVal.newArray();
        }
        Object data = null;
        Object params = null;
        params = ZVal.newArray(new ZPair("shelf", shelf));
        params = CRArrayF.array_merge.call(env, params, optParams);
        data =
                env.callMethod(
                        this,
                        "__call",
                        Google_MylibraryBookshelvesServiceResource.class,
                        "clearVolumes",
                        ZVal.newArray(new ZPair(0, params)));
        return ZVal.assign(data);
    }

    public Object listMylibraryBookshelves(RuntimeEnv env, Object... args) {
        Object optParams = ZVal.assignParameter(args, 0, null);
        if (ZVal.isNull(optParams)) {
            optParams = ZVal.newArray();
        }
        Object data = null;
        Object params = null;
        params = ZVal.newArray();
        params = CRArrayF.array_merge.call(env, params, optParams);
        data =
                env.callMethod(
                        this,
                        "__call",
                        Google_MylibraryBookshelvesServiceResource.class,
                        "list",
                        ZVal.newArray(new ZPair(0, params)));
        if (ZVal.isTrue(
                env.callMethod(
                        this, "useObjects", Google_MylibraryBookshelvesServiceResource.class))) {
            return ZVal.assign(new Google_Bookshelves(env, data));

        } else {
            return ZVal.assign(data);
        }
    }

    public Object addVolume(RuntimeEnv env, Object... args) {
        Object shelf = ZVal.assignParameter(args, 0, null);
        Object volumeId = ZVal.assignParameter(args, 1, null);
        Object optParams = ZVal.assignParameter(args, 2, null);
        if (ZVal.isNull(optParams)) {
            optParams = ZVal.newArray();
        }
        Object data = null;
        Object params = null;
        params = ZVal.newArray(new ZPair("shelf", shelf), new ZPair("volumeId", volumeId));
        params = CRArrayF.array_merge.call(env, params, optParams);
        data =
                env.callMethod(
                        this,
                        "__call",
                        Google_MylibraryBookshelvesServiceResource.class,
                        "addVolume",
                        ZVal.newArray(new ZPair(0, params)));
        return ZVal.assign(data);
    }

    public Object moveVolume(RuntimeEnv env, Object... args) {
        Object shelf = ZVal.assignParameter(args, 0, null);
        Object volumeId = ZVal.assignParameter(args, 1, null);
        Object volumePosition = ZVal.assignParameter(args, 2, null);
        Object optParams = ZVal.assignParameter(args, 3, null);
        if (ZVal.isNull(optParams)) {
            optParams = ZVal.newArray();
        }
        Object data = null;
        Object params = null;
        params =
                ZVal.newArray(
                        new ZPair("shelf", shelf),
                        new ZPair("volumeId", volumeId),
                        new ZPair("volumePosition", volumePosition));
        params = CRArrayF.array_merge.call(env, params, optParams);
        data =
                env.callMethod(
                        this,
                        "__call",
                        Google_MylibraryBookshelvesServiceResource.class,
                        "moveVolume",
                        ZVal.newArray(new ZPair(0, params)));
        return ZVal.assign(data);
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
