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

public class Google_BooksAnnotationsRange extends Google_Model
        implements RuntimeFileContextInterface {

    public Object startPosition = null;

    public Object endPosition = null;

    public Object startOffset = null;

    public Object endOffset = null;

    public Google_BooksAnnotationsRange(RuntimeEnv env, Object... args) {
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
            case "setStartPosition":
                return this.setStartPosition(env, args);
            case "getStartPosition":
                return this.getStartPosition(env, args);
            case "setEndPosition":
                return this.setEndPosition(env, args);
            case "getEndPosition":
                return this.getEndPosition(env, args);
            case "setStartOffset":
                return this.setStartOffset(env, args);
            case "getStartOffset":
                return this.getStartOffset(env, args);
            case "setEndOffset":
                return this.setEndOffset(env, args);
            case "getEndOffset":
                return this.getEndOffset(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "startPosition":
                return this.startPosition;
            case "endPosition":
                return this.endPosition;
            case "startOffset":
                return this.startOffset;
            case "endOffset":
                return this.endOffset;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "startPosition":
                return ZVal.isNull(this.startPosition);
            case "endPosition":
                return ZVal.isNull(this.endPosition);
            case "startOffset":
                return ZVal.isNull(this.startOffset);
            case "endOffset":
                return ZVal.isNull(this.endOffset);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "startPosition":
                this.startPosition = value;
                break;
            case "endPosition":
                this.endPosition = value;
                break;
            case "startOffset":
                this.startOffset = value;
                break;
            case "endOffset":
                this.endOffset = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setStartPosition(RuntimeEnv env, Object... args) {
        Object startPosition = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_BooksAnnotationsRange.class, "startPosition", startPosition);

        return null;
    }

    public Object getStartPosition(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_BooksAnnotationsRange.class, "startPosition"));
    }

    public Object setEndPosition(RuntimeEnv env, Object... args) {
        Object endPosition = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_BooksAnnotationsRange.class, "endPosition", endPosition);

        return null;
    }

    public Object getEndPosition(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_BooksAnnotationsRange.class, "endPosition"));
    }

    public Object setStartOffset(RuntimeEnv env, Object... args) {
        Object startOffset = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_BooksAnnotationsRange.class, "startOffset", startOffset);

        return null;
    }

    public Object getStartOffset(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_BooksAnnotationsRange.class, "startOffset"));
    }

    public Object setEndOffset(RuntimeEnv env, Object... args) {
        Object endOffset = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_BooksAnnotationsRange.class, "endOffset", endOffset);

        return null;
    }

    public Object getEndOffset(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_BooksAnnotationsRange.class, "endOffset"));
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
