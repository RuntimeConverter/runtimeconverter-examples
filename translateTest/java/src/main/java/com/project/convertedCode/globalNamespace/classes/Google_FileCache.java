package com.project.convertedCode.globalNamespace.classes;

import com.project.convertedCode.globalNamespace.classes.Google_Cache;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.classes.Google_CacheException;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.modules.standard.serialization.function_unserialize;
import com.runtimeconverter.runtime.modules.standard.serialization.function_serialize;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.modules.standard.other.function_file_get_contents;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/cache/Google_FileCache.php

*/

public class Google_FileCache extends Google_Cache implements RuntimeFileContextInterface {

    public Object path = null;

    public Google_FileCache(RuntimeEnv env, Object... args) {
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
            case "isLocked":
                if (Google_FileCache.class.equals(caller)) {

                    return this.isLocked(env, args);
                }
                break;
            case "createLock":
                if (Google_FileCache.class.equals(caller)) {

                    return this.createLock(env, args);
                }
                break;
            case "removeLock":
                if (Google_FileCache.class.equals(caller)) {

                    return this.removeLock(env, args);
                }
                break;
            case "waitForLock":
                if (Google_FileCache.class.equals(caller)) {

                    return this.waitForLock(env, args);
                }
                break;
            case "getCacheDir":
                if (Google_FileCache.class.equals(caller)) {

                    return this.getCacheDir(env, args);
                }
                break;
            case "getCacheFile":
                if (Google_FileCache.class.equals(caller)) {

                    return this.getCacheFile(env, args);
                }
                break;
            case "get":
                return this.get(env, args);
            case "set":
                return this.set(env, args);
            case "delete":
                return this.delete(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "path":
                if (Google_FileCache.class.equals(caller)) {

                    return this.path;
                }
                return this.__phpMagicMethod__isset(key);
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "path":
                if (Google_FileCache.class.equals(caller)) {

                    return ZVal.isNull(this.path);
                }
                break;
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "path":
                if (Google_FileCache.class.equals(caller)) {

                    this.path = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object apiConfig = env.getGlobal("apiConfig");
        ;

        ZVal.setProperty(
                this,
                Google_FileCache.class,
                "path",
                ZVal.getElement(apiConfig, "ioFileCache_directory"));

        return env.returnWithGlobals(null, "apiConfig", apiConfig);
    }

    private Object isLocked(RuntimeEnv env, Object... args) {
        Object storageFile = ZVal.assignParameter(args, 0, null);
        return ZVal.assign(
                NamespaceGlobal.file_exists.call(env, ZVal.toString(storageFile) + ".lock"));
    }

    private Object createLock(RuntimeEnv env, Object... args) {
        Object storageFile = ZVal.assignParameter(args, 0, null);
        Object storageDir = null;
        storageDir = NamespaceGlobal.dirname.call(env, storageFile);
        if (!ZVal.isTrue(NamespaceGlobal.is_dir.call(env, storageDir))) {
            if (!ZVal.isTrue(NamespaceGlobal.mkdir.call(env, storageDir, 493, true))) {
                if (!ZVal.isTrue(NamespaceGlobal.is_dir.call(env, storageDir))) {
                    throw new Google_CacheException(
                            env,
                            "Could not create storage directory: " + ZVal.toString(storageDir));
                }
            }
        }

        NamespaceGlobal.touch.call(env, ZVal.toString(storageFile) + ".lock");

        return null;
    }

    private Object removeLock(RuntimeEnv env, Object... args) {
        Object storageFile = ZVal.assignParameter(args, 0, null);
        NamespaceGlobal.unlink.call(env, ZVal.toString(storageFile) + ".lock");

        return null;
    }

    private Object waitForLock(RuntimeEnv env, Object... args) {
        Object storageFile = ZVal.assignParameter(args, 0, null);
        Object tries = null;
        Object cnt = null;
        tries = 20;
        cnt = 0;
        do {
            NamespaceGlobal.clearstatcache.call(env);
            NamespaceGlobal.usleep.call(env, 250);
            cnt = ZVal.increment(cnt);

        } while (ZVal.toBool(ZVal.isLessThanOrEqualTo(cnt, "<=", tries))
                && ZVal.toBool(
                        env.callMethod(this, "isLocked", Google_FileCache.class, storageFile)));

        if (ZVal.isTrue(env.callMethod(this, "isLocked", Google_FileCache.class, storageFile))) {
            env.callMethod(this, "removeLock", Google_FileCache.class, storageFile);
        }

        return null;
    }

    private Object getCacheDir(RuntimeEnv env, Object... args) {
        Object hash = ZVal.assignParameter(args, 0, null);
        return ZVal.assign(
                ZVal.toString(
                                ZVal.toString(
                                                ZVal.getProperty(
                                                        this, Google_FileCache.class, "path"))
                                        + "/")
                        + ZVal.toString(NamespaceGlobal.substr.call(env, hash, 0, 2)));
    }

    private Object getCacheFile(RuntimeEnv env, Object... args) {
        Object hash = ZVal.assignParameter(args, 0, null);
        return ZVal.assign(
                ZVal.toString(
                                ZVal.toString(
                                                env.callMethod(
                                                        this,
                                                        "getCacheDir",
                                                        Google_FileCache.class,
                                                        hash))
                                        + "/")
                        + ZVal.toString(hash));
    }

    public Object get(RuntimeEnv env, Object... args) {
        Object key = ZVal.assignParameter(args, 0, null);
        Object expiration = ZVal.assignParameter(args, 1, null);
        if (ZVal.isNull(expiration)) {
            expiration = false;
        }
        Object storageFile = null;
        Object data = null;
        Object now = null;
        Object mtime = null;
        storageFile =
                env.callMethod(
                        this,
                        "getCacheFile",
                        Google_FileCache.class,
                        NamespaceGlobal.md5.call(env, key));
        if (ZVal.isTrue(env.callMethod(this, "isLocked", Google_FileCache.class, storageFile))) {
            env.callMethod(this, "waitForLock", Google_FileCache.class, storageFile);
        }

        if (ZVal.toBool(NamespaceGlobal.file_exists.call(env, storageFile))
                && ZVal.toBool(NamespaceGlobal.is_readable.call(env, storageFile))) {
            now = NamespaceGlobal.time.call(env);
            if (ZVal.toBool(!ZVal.isTrue(expiration))
                    || ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.strictNotEqualityCheck(
                                                    mtime =
                                                            NamespaceGlobal.filemtime.call(
                                                                    env, storageFile),
                                                    "!==",
                                                    false))
                                    && ZVal.toBool(
                                            ZVal.isLessThan(
                                                    ZVal.subtract(now, mtime), '<', expiration)))) {
                if (ZVal.strictNotEqualityCheck(
                        data = function_file_get_contents.f.call(env, storageFile), "!==", false)) {
                    data = function_unserialize.f.call(env, data);
                    return ZVal.assign(data);
                }
            }
        }

        return ZVal.assign(false);
    }

    public Object set(RuntimeEnv env, Object... args) {
        Object key = ZVal.assignParameter(args, 0, null);
        Object value = ZVal.assignParameter(args, 1, null);
        Object storageFile = null;
        Object data = null;
        Object storageDir = null;
        storageDir =
                env.callMethod(
                        this,
                        "getCacheDir",
                        Google_FileCache.class,
                        NamespaceGlobal.md5.call(env, key));
        storageFile =
                env.callMethod(
                        this,
                        "getCacheFile",
                        Google_FileCache.class,
                        NamespaceGlobal.md5.call(env, key));
        if (ZVal.isTrue(env.callMethod(this, "isLocked", Google_FileCache.class, storageFile))) {
            env.callMethod(this, "waitForLock", Google_FileCache.class, storageFile);
        }

        if (!ZVal.isTrue(NamespaceGlobal.is_dir.call(env, storageDir))) {
            if (!ZVal.isTrue(NamespaceGlobal.mkdir.call(env, storageDir, 493, true))) {
                throw new Google_CacheException(
                        env, "Could not create storage directory: " + ZVal.toString(storageDir));
            }
        }

        data = function_serialize.f.call(env, value);
        env.callMethod(this, "createLock", Google_FileCache.class, storageFile);
        if (!ZVal.isTrue(NamespaceGlobal.file_put_contents.call(env, storageFile, data))) {
            env.callMethod(this, "removeLock", Google_FileCache.class, storageFile);
            throw new Google_CacheException(env, "Could not store data in the file");
        }

        env.callMethod(this, "removeLock", Google_FileCache.class, storageFile);

        return null;
    }

    public Object delete(RuntimeEnv env, Object... args) {
        Object key = ZVal.assignParameter(args, 0, null);
        Object file = null;
        file =
                env.callMethod(
                        this,
                        "getCacheFile",
                        Google_FileCache.class,
                        NamespaceGlobal.md5.call(env, key));
        if (!ZVal.isTrue(NamespaceGlobal.unlink.call(env, file))) {
            throw new Google_CacheException(env, "Cache file could not be deleted");
        }

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
