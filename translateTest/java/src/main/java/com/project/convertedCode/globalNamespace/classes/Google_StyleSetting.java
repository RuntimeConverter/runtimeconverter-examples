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

 google-api-php-client/src/contrib/Google_FusiontablesService.php

*/

public class Google_StyleSetting extends Google_Model implements RuntimeFileContextInterface {

    public Object __markerOptionsType = "Google_PointStyle";

    public Object __markerOptionsDataType = "";

    public Object markerOptions = null;

    public Object kind = null;

    public Object name = null;

    public Object __polygonOptionsType = "Google_PolygonStyle";

    public Object __polygonOptionsDataType = "";

    public Object polygonOptions = null;

    public Object isDefaultForTable = null;

    public Object __polylineOptionsType = "Google_LineStyle";

    public Object __polylineOptionsDataType = "";

    public Object polylineOptions = null;

    public Object tableId = null;

    public Object styleId = null;

    public Google_StyleSetting(RuntimeEnv env, Object... args) {
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
            case "setMarkerOptions":
                return this.setMarkerOptions(env, args);
            case "getMarkerOptions":
                return this.getMarkerOptions(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setName":
                return this.setName(env, args);
            case "getName":
                return this.getName(env, args);
            case "setPolygonOptions":
                return this.setPolygonOptions(env, args);
            case "getPolygonOptions":
                return this.getPolygonOptions(env, args);
            case "setIsDefaultForTable":
                return this.setIsDefaultForTable(env, args);
            case "getIsDefaultForTable":
                return this.getIsDefaultForTable(env, args);
            case "setPolylineOptions":
                return this.setPolylineOptions(env, args);
            case "getPolylineOptions":
                return this.getPolylineOptions(env, args);
            case "setTableId":
                return this.setTableId(env, args);
            case "getTableId":
                return this.getTableId(env, args);
            case "setStyleId":
                return this.setStyleId(env, args);
            case "getStyleId":
                return this.getStyleId(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__markerOptionsType":
                if (Google_StyleSetting.class.isAssignableFrom(caller)) {

                    return this.__markerOptionsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__markerOptionsDataType":
                if (Google_StyleSetting.class.isAssignableFrom(caller)) {

                    return this.__markerOptionsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "markerOptions":
                return this.markerOptions;
            case "kind":
                return this.kind;
            case "name":
                return this.name;
            case "__polygonOptionsType":
                if (Google_StyleSetting.class.isAssignableFrom(caller)) {

                    return this.__polygonOptionsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__polygonOptionsDataType":
                if (Google_StyleSetting.class.isAssignableFrom(caller)) {

                    return this.__polygonOptionsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "polygonOptions":
                return this.polygonOptions;
            case "isDefaultForTable":
                return this.isDefaultForTable;
            case "__polylineOptionsType":
                if (Google_StyleSetting.class.isAssignableFrom(caller)) {

                    return this.__polylineOptionsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__polylineOptionsDataType":
                if (Google_StyleSetting.class.isAssignableFrom(caller)) {

                    return this.__polylineOptionsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "polylineOptions":
                return this.polylineOptions;
            case "tableId":
                return this.tableId;
            case "styleId":
                return this.styleId;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__markerOptionsType":
                if (Google_StyleSetting.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__markerOptionsType);
                }
                break;
            case "__markerOptionsDataType":
                if (Google_StyleSetting.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__markerOptionsDataType);
                }
                break;
            case "markerOptions":
                return ZVal.isNull(this.markerOptions);
            case "kind":
                return ZVal.isNull(this.kind);
            case "name":
                return ZVal.isNull(this.name);
            case "__polygonOptionsType":
                if (Google_StyleSetting.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__polygonOptionsType);
                }
                break;
            case "__polygonOptionsDataType":
                if (Google_StyleSetting.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__polygonOptionsDataType);
                }
                break;
            case "polygonOptions":
                return ZVal.isNull(this.polygonOptions);
            case "isDefaultForTable":
                return ZVal.isNull(this.isDefaultForTable);
            case "__polylineOptionsType":
                if (Google_StyleSetting.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__polylineOptionsType);
                }
                break;
            case "__polylineOptionsDataType":
                if (Google_StyleSetting.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__polylineOptionsDataType);
                }
                break;
            case "polylineOptions":
                return ZVal.isNull(this.polylineOptions);
            case "tableId":
                return ZVal.isNull(this.tableId);
            case "styleId":
                return ZVal.isNull(this.styleId);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "__markerOptionsType":
                if (Google_StyleSetting.class.isAssignableFrom(caller)) {

                    this.__markerOptionsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__markerOptionsDataType":
                if (Google_StyleSetting.class.isAssignableFrom(caller)) {

                    this.__markerOptionsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "markerOptions":
                this.markerOptions = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "name":
                this.name = value;
                break;
            case "__polygonOptionsType":
                if (Google_StyleSetting.class.isAssignableFrom(caller)) {

                    this.__polygonOptionsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__polygonOptionsDataType":
                if (Google_StyleSetting.class.isAssignableFrom(caller)) {

                    this.__polygonOptionsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "polygonOptions":
                this.polygonOptions = value;
                break;
            case "isDefaultForTable":
                this.isDefaultForTable = value;
                break;
            case "__polylineOptionsType":
                if (Google_StyleSetting.class.isAssignableFrom(caller)) {

                    this.__polylineOptionsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__polylineOptionsDataType":
                if (Google_StyleSetting.class.isAssignableFrom(caller)) {

                    this.__polylineOptionsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "polylineOptions":
                this.polylineOptions = value;
                break;
            case "tableId":
                this.tableId = value;
                break;
            case "styleId":
                this.styleId = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setMarkerOptions(RuntimeEnv env, Object... args) {
        Object markerOptions = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_StyleSetting.class, "markerOptions", markerOptions);

        return null;
    }

    public Object getMarkerOptions(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_StyleSetting.class, "markerOptions"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_StyleSetting.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_StyleSetting.class, "kind"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_StyleSetting.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_StyleSetting.class, "name"));
    }

    public Object setPolygonOptions(RuntimeEnv env, Object... args) {
        Object polygonOptions = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_StyleSetting.class, "polygonOptions", polygonOptions);

        return null;
    }

    public Object getPolygonOptions(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_StyleSetting.class, "polygonOptions"));
    }

    public Object setIsDefaultForTable(RuntimeEnv env, Object... args) {
        Object isDefaultForTable = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_StyleSetting.class, "isDefaultForTable", isDefaultForTable);

        return null;
    }

    public Object getIsDefaultForTable(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_StyleSetting.class, "isDefaultForTable"));
    }

    public Object setPolylineOptions(RuntimeEnv env, Object... args) {
        Object polylineOptions = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_StyleSetting.class, "polylineOptions", polylineOptions);

        return null;
    }

    public Object getPolylineOptions(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_StyleSetting.class, "polylineOptions"));
    }

    public Object setTableId(RuntimeEnv env, Object... args) {
        Object tableId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_StyleSetting.class, "tableId", tableId);

        return null;
    }

    public Object getTableId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_StyleSetting.class, "tableId"));
    }

    public Object setStyleId(RuntimeEnv env, Object... args) {
        Object styleId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_StyleSetting.class, "styleId", styleId);

        return null;
    }

    public Object getStyleId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_StyleSetting.class, "styleId"));
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
