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

public class Google_DownloadAccessRestriction extends Google_Model
        implements RuntimeFileContextInterface {

    public Object nonce = null;

    public Object kind = null;

    public Object justAcquired = null;

    public Object maxDownloadDevices = null;

    public Object downloadsAcquired = null;

    public Object signature = null;

    public Object volumeId = null;

    public Object deviceAllowed = null;

    public Object source = null;

    public Object restricted = null;

    public Object reasonCode = null;

    public Object message = null;

    public Google_DownloadAccessRestriction(RuntimeEnv env, Object... args) {
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
            case "setNonce":
                return this.setNonce(env, args);
            case "getNonce":
                return this.getNonce(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setJustAcquired":
                return this.setJustAcquired(env, args);
            case "getJustAcquired":
                return this.getJustAcquired(env, args);
            case "setMaxDownloadDevices":
                return this.setMaxDownloadDevices(env, args);
            case "getMaxDownloadDevices":
                return this.getMaxDownloadDevices(env, args);
            case "setDownloadsAcquired":
                return this.setDownloadsAcquired(env, args);
            case "getDownloadsAcquired":
                return this.getDownloadsAcquired(env, args);
            case "setSignature":
                return this.setSignature(env, args);
            case "getSignature":
                return this.getSignature(env, args);
            case "setVolumeId":
                return this.setVolumeId(env, args);
            case "getVolumeId":
                return this.getVolumeId(env, args);
            case "setDeviceAllowed":
                return this.setDeviceAllowed(env, args);
            case "getDeviceAllowed":
                return this.getDeviceAllowed(env, args);
            case "setSource":
                return this.setSource(env, args);
            case "getSource":
                return this.getSource(env, args);
            case "setRestricted":
                return this.setRestricted(env, args);
            case "getRestricted":
                return this.getRestricted(env, args);
            case "setReasonCode":
                return this.setReasonCode(env, args);
            case "getReasonCode":
                return this.getReasonCode(env, args);
            case "setMessage":
                return this.setMessage(env, args);
            case "getMessage":
                return this.getMessage(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "nonce":
                return this.nonce;
            case "kind":
                return this.kind;
            case "justAcquired":
                return this.justAcquired;
            case "maxDownloadDevices":
                return this.maxDownloadDevices;
            case "downloadsAcquired":
                return this.downloadsAcquired;
            case "signature":
                return this.signature;
            case "volumeId":
                return this.volumeId;
            case "deviceAllowed":
                return this.deviceAllowed;
            case "source":
                return this.source;
            case "restricted":
                return this.restricted;
            case "reasonCode":
                return this.reasonCode;
            case "message":
                return this.message;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "nonce":
                return ZVal.isNull(this.nonce);
            case "kind":
                return ZVal.isNull(this.kind);
            case "justAcquired":
                return ZVal.isNull(this.justAcquired);
            case "maxDownloadDevices":
                return ZVal.isNull(this.maxDownloadDevices);
            case "downloadsAcquired":
                return ZVal.isNull(this.downloadsAcquired);
            case "signature":
                return ZVal.isNull(this.signature);
            case "volumeId":
                return ZVal.isNull(this.volumeId);
            case "deviceAllowed":
                return ZVal.isNull(this.deviceAllowed);
            case "source":
                return ZVal.isNull(this.source);
            case "restricted":
                return ZVal.isNull(this.restricted);
            case "reasonCode":
                return ZVal.isNull(this.reasonCode);
            case "message":
                return ZVal.isNull(this.message);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "nonce":
                this.nonce = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "justAcquired":
                this.justAcquired = value;
                break;
            case "maxDownloadDevices":
                this.maxDownloadDevices = value;
                break;
            case "downloadsAcquired":
                this.downloadsAcquired = value;
                break;
            case "signature":
                this.signature = value;
                break;
            case "volumeId":
                this.volumeId = value;
                break;
            case "deviceAllowed":
                this.deviceAllowed = value;
                break;
            case "source":
                this.source = value;
                break;
            case "restricted":
                this.restricted = value;
                break;
            case "reasonCode":
                this.reasonCode = value;
                break;
            case "message":
                this.message = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setNonce(RuntimeEnv env, Object... args) {
        Object nonce = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DownloadAccessRestriction.class, "nonce", nonce);

        return null;
    }

    public Object getNonce(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DownloadAccessRestriction.class, "nonce"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DownloadAccessRestriction.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_DownloadAccessRestriction.class, "kind"));
    }

    public Object setJustAcquired(RuntimeEnv env, Object... args) {
        Object justAcquired = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_DownloadAccessRestriction.class, "justAcquired", justAcquired);

        return null;
    }

    public Object getJustAcquired(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_DownloadAccessRestriction.class, "justAcquired"));
    }

    public Object setMaxDownloadDevices(RuntimeEnv env, Object... args) {
        Object maxDownloadDevices = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_DownloadAccessRestriction.class,
                "maxDownloadDevices",
                maxDownloadDevices);

        return null;
    }

    public Object getMaxDownloadDevices(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_DownloadAccessRestriction.class, "maxDownloadDevices"));
    }

    public Object setDownloadsAcquired(RuntimeEnv env, Object... args) {
        Object downloadsAcquired = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_DownloadAccessRestriction.class,
                "downloadsAcquired",
                downloadsAcquired);

        return null;
    }

    public Object getDownloadsAcquired(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(
                        this, Google_DownloadAccessRestriction.class, "downloadsAcquired"));
    }

    public Object setSignature(RuntimeEnv env, Object... args) {
        Object signature = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DownloadAccessRestriction.class, "signature", signature);

        return null;
    }

    public Object getSignature(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_DownloadAccessRestriction.class, "signature"));
    }

    public Object setVolumeId(RuntimeEnv env, Object... args) {
        Object volumeId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DownloadAccessRestriction.class, "volumeId", volumeId);

        return null;
    }

    public Object getVolumeId(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_DownloadAccessRestriction.class, "volumeId"));
    }

    public Object setDeviceAllowed(RuntimeEnv env, Object... args) {
        Object deviceAllowed = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_DownloadAccessRestriction.class, "deviceAllowed", deviceAllowed);

        return null;
    }

    public Object getDeviceAllowed(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_DownloadAccessRestriction.class, "deviceAllowed"));
    }

    public Object setSource(RuntimeEnv env, Object... args) {
        Object source = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DownloadAccessRestriction.class, "source", source);

        return null;
    }

    public Object getSource(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_DownloadAccessRestriction.class, "source"));
    }

    public Object setRestricted(RuntimeEnv env, Object... args) {
        Object restricted = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DownloadAccessRestriction.class, "restricted", restricted);

        return null;
    }

    public Object getRestricted(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_DownloadAccessRestriction.class, "restricted"));
    }

    public Object setReasonCode(RuntimeEnv env, Object... args) {
        Object reasonCode = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DownloadAccessRestriction.class, "reasonCode", reasonCode);

        return null;
    }

    public Object getReasonCode(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_DownloadAccessRestriction.class, "reasonCode"));
    }

    public Object setMessage(RuntimeEnv env, Object... args) {
        Object message = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_DownloadAccessRestriction.class, "message", message);

        return null;
    }

    public Object getMessage(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_DownloadAccessRestriction.class, "message"));
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
