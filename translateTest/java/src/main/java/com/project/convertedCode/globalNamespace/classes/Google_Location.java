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

 google-api-php-client/src/contrib/Google_LatitudeService.php

*/

public class Google_Location extends Google_Model implements RuntimeFileContextInterface {

    public Object kind = null;

    public Object altitude = null;

    public Object longitude = null;

    public Object activityId = null;

    public Object latitude = null;

    public Object altitudeAccuracy = null;

    public Object timestampMs = null;

    public Object speed = null;

    public Object heading = null;

    public Object accuracy = null;

    public Google_Location(RuntimeEnv env, Object... args) {
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
            case "setAltitude":
                return this.setAltitude(env, args);
            case "getAltitude":
                return this.getAltitude(env, args);
            case "setLongitude":
                return this.setLongitude(env, args);
            case "getLongitude":
                return this.getLongitude(env, args);
            case "setActivityId":
                return this.setActivityId(env, args);
            case "getActivityId":
                return this.getActivityId(env, args);
            case "setLatitude":
                return this.setLatitude(env, args);
            case "getLatitude":
                return this.getLatitude(env, args);
            case "setAltitudeAccuracy":
                return this.setAltitudeAccuracy(env, args);
            case "getAltitudeAccuracy":
                return this.getAltitudeAccuracy(env, args);
            case "setTimestampMs":
                return this.setTimestampMs(env, args);
            case "getTimestampMs":
                return this.getTimestampMs(env, args);
            case "setSpeed":
                return this.setSpeed(env, args);
            case "getSpeed":
                return this.getSpeed(env, args);
            case "setHeading":
                return this.setHeading(env, args);
            case "getHeading":
                return this.getHeading(env, args);
            case "setAccuracy":
                return this.setAccuracy(env, args);
            case "getAccuracy":
                return this.getAccuracy(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return this.kind;
            case "altitude":
                return this.altitude;
            case "longitude":
                return this.longitude;
            case "activityId":
                return this.activityId;
            case "latitude":
                return this.latitude;
            case "altitudeAccuracy":
                return this.altitudeAccuracy;
            case "timestampMs":
                return this.timestampMs;
            case "speed":
                return this.speed;
            case "heading":
                return this.heading;
            case "accuracy":
                return this.accuracy;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "kind":
                return ZVal.isNull(this.kind);
            case "altitude":
                return ZVal.isNull(this.altitude);
            case "longitude":
                return ZVal.isNull(this.longitude);
            case "activityId":
                return ZVal.isNull(this.activityId);
            case "latitude":
                return ZVal.isNull(this.latitude);
            case "altitudeAccuracy":
                return ZVal.isNull(this.altitudeAccuracy);
            case "timestampMs":
                return ZVal.isNull(this.timestampMs);
            case "speed":
                return ZVal.isNull(this.speed);
            case "heading":
                return ZVal.isNull(this.heading);
            case "accuracy":
                return ZVal.isNull(this.accuracy);
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
            case "altitude":
                this.altitude = value;
                break;
            case "longitude":
                this.longitude = value;
                break;
            case "activityId":
                this.activityId = value;
                break;
            case "latitude":
                this.latitude = value;
                break;
            case "altitudeAccuracy":
                this.altitudeAccuracy = value;
                break;
            case "timestampMs":
                this.timestampMs = value;
                break;
            case "speed":
                this.speed = value;
                break;
            case "heading":
                this.heading = value;
                break;
            case "accuracy":
                this.accuracy = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Location.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Location.class, "kind"));
    }

    public Object setAltitude(RuntimeEnv env, Object... args) {
        Object altitude = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Location.class, "altitude", altitude);

        return null;
    }

    public Object getAltitude(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Location.class, "altitude"));
    }

    public Object setLongitude(RuntimeEnv env, Object... args) {
        Object longitude = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Location.class, "longitude", longitude);

        return null;
    }

    public Object getLongitude(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Location.class, "longitude"));
    }

    public Object setActivityId(RuntimeEnv env, Object... args) {
        Object activityId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Location.class, "activityId", activityId);

        return null;
    }

    public Object getActivityId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Location.class, "activityId"));
    }

    public Object setLatitude(RuntimeEnv env, Object... args) {
        Object latitude = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Location.class, "latitude", latitude);

        return null;
    }

    public Object getLatitude(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Location.class, "latitude"));
    }

    public Object setAltitudeAccuracy(RuntimeEnv env, Object... args) {
        Object altitudeAccuracy = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Location.class, "altitudeAccuracy", altitudeAccuracy);

        return null;
    }

    public Object getAltitudeAccuracy(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Location.class, "altitudeAccuracy"));
    }

    public Object setTimestampMs(RuntimeEnv env, Object... args) {
        Object timestampMs = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Location.class, "timestampMs", timestampMs);

        return null;
    }

    public Object getTimestampMs(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Location.class, "timestampMs"));
    }

    public Object setSpeed(RuntimeEnv env, Object... args) {
        Object speed = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Location.class, "speed", speed);

        return null;
    }

    public Object getSpeed(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Location.class, "speed"));
    }

    public Object setHeading(RuntimeEnv env, Object... args) {
        Object heading = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Location.class, "heading", heading);

        return null;
    }

    public Object getHeading(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Location.class, "heading"));
    }

    public Object setAccuracy(RuntimeEnv env, Object... args) {
        Object accuracy = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_Location.class, "accuracy", accuracy);

        return null;
    }

    public Object getAccuracy(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_Location.class, "accuracy"));
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
