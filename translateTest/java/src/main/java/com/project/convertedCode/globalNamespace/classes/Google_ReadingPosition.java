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

public class Google_ReadingPosition extends Google_Model implements RuntimeFileContextInterface {

    public Object kind = null;

    public Object gbImagePosition = null;

    public Object epubCfiPosition = null;

    public Object updated = null;

    public Object volumeId = null;

    public Object pdfPosition = null;

    public Object gbTextPosition = null;

    public Google_ReadingPosition(RuntimeEnv env, Object... args) {
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
            case "setGbImagePosition":
                return this.setGbImagePosition(env, args);
            case "getGbImagePosition":
                return this.getGbImagePosition(env, args);
            case "setEpubCfiPosition":
                return this.setEpubCfiPosition(env, args);
            case "getEpubCfiPosition":
                return this.getEpubCfiPosition(env, args);
            case "setUpdated":
                return this.setUpdated(env, args);
            case "getUpdated":
                return this.getUpdated(env, args);
            case "setVolumeId":
                return this.setVolumeId(env, args);
            case "getVolumeId":
                return this.getVolumeId(env, args);
            case "setPdfPosition":
                return this.setPdfPosition(env, args);
            case "getPdfPosition":
                return this.getPdfPosition(env, args);
            case "setGbTextPosition":
                return this.setGbTextPosition(env, args);
            case "getGbTextPosition":
                return this.getGbTextPosition(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return this.kind;
            case "gbImagePosition":
                return this.gbImagePosition;
            case "epubCfiPosition":
                return this.epubCfiPosition;
            case "updated":
                return this.updated;
            case "volumeId":
                return this.volumeId;
            case "pdfPosition":
                return this.pdfPosition;
            case "gbTextPosition":
                return this.gbTextPosition;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return ZVal.isNull(this.kind);
            case "gbImagePosition":
                return ZVal.isNull(this.gbImagePosition);
            case "epubCfiPosition":
                return ZVal.isNull(this.epubCfiPosition);
            case "updated":
                return ZVal.isNull(this.updated);
            case "volumeId":
                return ZVal.isNull(this.volumeId);
            case "pdfPosition":
                return ZVal.isNull(this.pdfPosition);
            case "gbTextPosition":
                return ZVal.isNull(this.gbTextPosition);
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
            case "gbImagePosition":
                this.gbImagePosition = value;
                break;
            case "epubCfiPosition":
                this.epubCfiPosition = value;
                break;
            case "updated":
                this.updated = value;
                break;
            case "volumeId":
                this.volumeId = value;
                break;
            case "pdfPosition":
                this.pdfPosition = value;
                break;
            case "gbTextPosition":
                this.gbTextPosition = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ReadingPosition.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ReadingPosition.class, "kind"));
    }

    public Object setGbImagePosition(RuntimeEnv env, Object... args) {
        Object gbImagePosition = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ReadingPosition.class, "gbImagePosition", gbImagePosition);

        return null;
    }

    public Object getGbImagePosition(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ReadingPosition.class, "gbImagePosition"));
    }

    public Object setEpubCfiPosition(RuntimeEnv env, Object... args) {
        Object epubCfiPosition = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ReadingPosition.class, "epubCfiPosition", epubCfiPosition);

        return null;
    }

    public Object getEpubCfiPosition(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ReadingPosition.class, "epubCfiPosition"));
    }

    public Object setUpdated(RuntimeEnv env, Object... args) {
        Object updated = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ReadingPosition.class, "updated", updated);

        return null;
    }

    public Object getUpdated(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ReadingPosition.class, "updated"));
    }

    public Object setVolumeId(RuntimeEnv env, Object... args) {
        Object volumeId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ReadingPosition.class, "volumeId", volumeId);

        return null;
    }

    public Object getVolumeId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ReadingPosition.class, "volumeId"));
    }

    public Object setPdfPosition(RuntimeEnv env, Object... args) {
        Object pdfPosition = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ReadingPosition.class, "pdfPosition", pdfPosition);

        return null;
    }

    public Object getPdfPosition(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ReadingPosition.class, "pdfPosition"));
    }

    public Object setGbTextPosition(RuntimeEnv env, Object... args) {
        Object gbTextPosition = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ReadingPosition.class, "gbTextPosition", gbTextPosition);

        return null;
    }

    public Object getGbTextPosition(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ReadingPosition.class, "gbTextPosition"));
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
