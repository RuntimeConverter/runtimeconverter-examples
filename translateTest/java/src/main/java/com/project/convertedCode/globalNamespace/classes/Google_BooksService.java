package com.project.convertedCode.globalNamespace.classes;

import com.project.convertedCode.globalNamespace.classes.Google_LayersServiceResource;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Google_MylibraryBookshelvesServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_MylibraryBookshelvesVolumesServiceResource;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Google_Service;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Google_MylibraryReadingpositionsServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_MylibraryAnnotationsServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_BookshelvesServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_BookshelvesVolumesServiceResource;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.classes.Google_LayersAnnotationDataServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_LayersVolumeAnnotationsServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_MyconfigServiceResource;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.classes.Google_VolumesAssociatedServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_VolumesServiceResource;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_BooksService.php

*/

public class Google_BooksService extends Google_Service implements RuntimeFileContextInterface {

    public Object layers = null;

    public Object layers_annotationData = null;

    public Object layers_volumeAnnotations = null;

    public Object bookshelves = null;

    public Object bookshelves_volumes = null;

    public Object myconfig = null;

    public Object volumes = null;

    public Object volumes_associated = null;

    public Object mylibrary_bookshelves = null;

    public Object mylibrary_bookshelves_volumes = null;

    public Object mylibrary_readingpositions = null;

    public Object mylibrary_annotations = null;

    public Google_BooksService(RuntimeEnv env, Object... args) {
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
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "layers":
                return this.layers;
            case "layers_annotationData":
                return this.layers_annotationData;
            case "layers_volumeAnnotations":
                return this.layers_volumeAnnotations;
            case "bookshelves":
                return this.bookshelves;
            case "bookshelves_volumes":
                return this.bookshelves_volumes;
            case "myconfig":
                return this.myconfig;
            case "volumes":
                return this.volumes;
            case "volumes_associated":
                return this.volumes_associated;
            case "mylibrary_bookshelves":
                return this.mylibrary_bookshelves;
            case "mylibrary_bookshelves_volumes":
                return this.mylibrary_bookshelves_volumes;
            case "mylibrary_readingpositions":
                return this.mylibrary_readingpositions;
            case "mylibrary_annotations":
                return this.mylibrary_annotations;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "layers":
                return ZVal.isNull(this.layers);
            case "layers_annotationData":
                return ZVal.isNull(this.layers_annotationData);
            case "layers_volumeAnnotations":
                return ZVal.isNull(this.layers_volumeAnnotations);
            case "bookshelves":
                return ZVal.isNull(this.bookshelves);
            case "bookshelves_volumes":
                return ZVal.isNull(this.bookshelves_volumes);
            case "myconfig":
                return ZVal.isNull(this.myconfig);
            case "volumes":
                return ZVal.isNull(this.volumes);
            case "volumes_associated":
                return ZVal.isNull(this.volumes_associated);
            case "mylibrary_bookshelves":
                return ZVal.isNull(this.mylibrary_bookshelves);
            case "mylibrary_bookshelves_volumes":
                return ZVal.isNull(this.mylibrary_bookshelves_volumes);
            case "mylibrary_readingpositions":
                return ZVal.isNull(this.mylibrary_readingpositions);
            case "mylibrary_annotations":
                return ZVal.isNull(this.mylibrary_annotations);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "layers":
                this.layers = value;
                break;
            case "layers_annotationData":
                this.layers_annotationData = value;
                break;
            case "layers_volumeAnnotations":
                this.layers_volumeAnnotations = value;
                break;
            case "bookshelves":
                this.bookshelves = value;
                break;
            case "bookshelves_volumes":
                this.bookshelves_volumes = value;
                break;
            case "myconfig":
                this.myconfig = value;
                break;
            case "volumes":
                this.volumes = value;
                break;
            case "volumes_associated":
                this.volumes_associated = value;
                break;
            case "mylibrary_bookshelves":
                this.mylibrary_bookshelves = value;
                break;
            case "mylibrary_bookshelves_volumes":
                this.mylibrary_bookshelves_volumes = value;
                break;
            case "mylibrary_readingpositions":
                this.mylibrary_readingpositions = value;
                break;
            case "mylibrary_annotations":
                this.mylibrary_annotations = value;
                break;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object client = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_BooksService.class, "servicePath", "books/v1/");
        ZVal.setProperty(this, Google_BooksService.class, "version", "v1");
        ZVal.setProperty(this, Google_BooksService.class, "serviceName", "books");
        env.callMethod(
                client,
                "addService",
                Google_BooksService.class,
                ZVal.getProperty(this, Google_BooksService.class, "serviceName"),
                ZVal.getProperty(this, Google_BooksService.class, "version"));
        ZVal.setProperty(
                this,
                Google_BooksService.class,
                "layers",
                new Google_LayersServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_BooksService.class, "serviceName"),
                        "layers",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/books\"], \"parameters\": {\"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"contentVersion\": {\"type\": \"string\", \"location\": \"query\"}, \"volumeId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"maxResults\": {\"location\": \"query\", \"minimum\": \"0\", \"type\": \"integer\", \"maximum\": \"200\", \"format\": \"uint32\"}, \"source\": {\"type\": \"string\", \"location\": \"query\"}}, \"id\": \"books.layers.list\", \"httpMethod\": \"GET\", \"path\": \"volumes/{volumeId}/layersummary\", \"response\": {\"$ref\": \"Layersummaries\"}}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/books\"], \"parameters\": {\"source\": {\"type\": \"string\", \"location\": \"query\"}, \"contentVersion\": {\"type\": \"string\", \"location\": \"query\"}, \"volumeId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"summaryId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"books.layers.get\", \"httpMethod\": \"GET\", \"path\": \"volumes/{volumeId}/layersummary/{summaryId}\", \"response\": {\"$ref\": \"Layersummary\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_BooksService.class,
                "layers_annotationData",
                new Google_LayersAnnotationDataServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_BooksService.class, "serviceName"),
                        "annotationData",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/books\"], \"parameters\": {\"scale\": {\"minimum\": \"0\", \"type\": \"integer\", \"location\": \"query\", \"format\": \"int32\"}, \"updatedMax\": {\"type\": \"string\", \"location\": \"query\"}, \"locale\": {\"type\": \"string\", \"location\": \"query\"}, \"h\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"int32\"}, \"volumeId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"maxResults\": {\"location\": \"query\", \"minimum\": \"0\", \"type\": \"integer\", \"maximum\": \"200\", \"format\": \"uint32\"}, \"annotationDataId\": {\"repeated\": true, \"type\": \"string\", \"location\": \"query\"}, \"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"contentVersion\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"source\": {\"type\": \"string\", \"location\": \"query\"}, \"w\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"int32\"}, \"layerId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"updatedMin\": {\"type\": \"string\", \"location\": \"query\"}}, \"id\": \"books.layers.annotationData.list\", \"httpMethod\": \"GET\", \"path\": \"volumes/{volumeId}/layers/{layerId}/data\", \"response\": {\"$ref\": \"Annotationsdata\"}}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/books\"], \"parameters\": {\"scale\": {\"minimum\": \"0\", \"type\": \"integer\", \"location\": \"query\", \"format\": \"int32\"}, \"locale\": {\"type\": \"string\", \"location\": \"query\"}, \"h\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"int32\"}, \"volumeId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"annotationDataId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"source\": {\"type\": \"string\", \"location\": \"query\"}, \"contentVersion\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"w\": {\"type\": \"integer\", \"location\": \"query\", \"format\": \"int32\"}, \"layerId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"books.layers.annotationData.get\", \"httpMethod\": \"GET\", \"path\": \"volumes/{volumeId}/layers/{layerId}/data/{annotationDataId}\", \"response\": {\"$ref\": \"Annotationdata\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_BooksService.class,
                "layers_volumeAnnotations",
                new Google_LayersVolumeAnnotationsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_BooksService.class, "serviceName"),
                        "volumeAnnotations",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/books\"], \"parameters\": {\"showDeleted\": {\"type\": \"boolean\", \"location\": \"query\"}, \"endPosition\": {\"type\": \"string\", \"location\": \"query\"}, \"endOffset\": {\"type\": \"string\", \"location\": \"query\"}, \"locale\": {\"type\": \"string\", \"location\": \"query\"}, \"updatedMin\": {\"type\": \"string\", \"location\": \"query\"}, \"updatedMax\": {\"type\": \"string\", \"location\": \"query\"}, \"volumeId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"maxResults\": {\"location\": \"query\", \"minimum\": \"0\", \"type\": \"integer\", \"maximum\": \"200\", \"format\": \"uint32\"}, \"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"contentVersion\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"source\": {\"type\": \"string\", \"location\": \"query\"}, \"startOffset\": {\"type\": \"string\", \"location\": \"query\"}, \"layerId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"startPosition\": {\"type\": \"string\", \"location\": \"query\"}}, \"id\": \"books.layers.volumeAnnotations.list\", \"httpMethod\": \"GET\", \"path\": \"volumes/{volumeId}/layers/{layerId}\", \"response\": {\"$ref\": \"Volumeannotations\"}}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/books\"], \"parameters\": {\"locale\": {\"type\": \"string\", \"location\": \"query\"}, \"source\": {\"type\": \"string\", \"location\": \"query\"}, \"annotationId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"volumeId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"layerId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"books.layers.volumeAnnotations.get\", \"httpMethod\": \"GET\", \"path\": \"volumes/{volumeId}/layers/{layerId}/annotations/{annotationId}\", \"response\": {\"$ref\": \"Volumeannotation\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_BooksService.class,
                "bookshelves",
                new Google_BookshelvesServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_BooksService.class, "serviceName"),
                        "bookshelves",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/books\"], \"parameters\": {\"source\": {\"type\": \"string\", \"location\": \"query\"}, \"userId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"books.bookshelves.list\", \"httpMethod\": \"GET\", \"path\": \"users/{userId}/bookshelves\", \"response\": {\"$ref\": \"Bookshelves\"}}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/books\"], \"parameters\": {\"shelf\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"userId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"source\": {\"type\": \"string\", \"location\": \"query\"}}, \"id\": \"books.bookshelves.get\", \"httpMethod\": \"GET\", \"path\": \"users/{userId}/bookshelves/{shelf}\", \"response\": {\"$ref\": \"Bookshelf\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_BooksService.class,
                "bookshelves_volumes",
                new Google_BookshelvesVolumesServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_BooksService.class, "serviceName"),
                        "volumes",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/books\"], \"parameters\": {\"shelf\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"showPreorders\": {\"type\": \"boolean\", \"location\": \"query\"}, \"maxResults\": {\"minimum\": \"0\", \"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"source\": {\"type\": \"string\", \"location\": \"query\"}, \"startIndex\": {\"minimum\": \"0\", \"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"userId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"books.bookshelves.volumes.list\", \"httpMethod\": \"GET\", \"path\": \"users/{userId}/bookshelves/{shelf}/volumes\", \"response\": {\"$ref\": \"Volumes\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_BooksService.class,
                "myconfig",
                new Google_MyconfigServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_BooksService.class, "serviceName"),
                        "myconfig",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"releaseDownloadAccess\": {\"scopes\": [\"https://www.googleapis.com/auth/books\"], \"parameters\": {\"locale\": {\"type\": \"string\", \"location\": \"query\"}, \"source\": {\"type\": \"string\", \"location\": \"query\"}, \"cpksver\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"volumeIds\": {\"repeated\": true, \"required\": true, \"type\": \"string\", \"location\": \"query\"}}, \"id\": \"books.myconfig.releaseDownloadAccess\", \"httpMethod\": \"POST\", \"path\": \"myconfig/releaseDownloadAccess\", \"response\": {\"$ref\": \"DownloadAccesses\"}}, \"requestAccess\": {\"scopes\": [\"https://www.googleapis.com/auth/books\"], \"parameters\": {\"locale\": {\"type\": \"string\", \"location\": \"query\"}, \"nonce\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"cpksver\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"volumeId\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"source\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}}, \"id\": \"books.myconfig.requestAccess\", \"httpMethod\": \"POST\", \"path\": \"myconfig/requestAccess\", \"response\": {\"$ref\": \"RequestAccess\"}}, \"syncVolumeLicenses\": {\"scopes\": [\"https://www.googleapis.com/auth/books\"], \"parameters\": {\"nonce\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"locale\": {\"type\": \"string\", \"location\": \"query\"}, \"showPreorders\": {\"type\": \"boolean\", \"location\": \"query\"}, \"cpksver\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"source\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"volumeIds\": {\"repeated\": true, \"type\": \"string\", \"location\": \"query\"}}, \"id\": \"books.myconfig.syncVolumeLicenses\", \"httpMethod\": \"POST\", \"path\": \"myconfig/syncVolumeLicenses\", \"response\": {\"$ref\": \"Volumes\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_BooksService.class,
                "volumes",
                new Google_VolumesServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_BooksService.class, "serviceName"),
                        "volumes",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/books\"], \"parameters\": {\"orderBy\": {\"enum\": [\"newest\", \"relevance\"], \"type\": \"string\", \"location\": \"query\"}, \"q\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"projection\": {\"enum\": [\"full\", \"lite\"], \"type\": \"string\", \"location\": \"query\"}, \"libraryRestrict\": {\"enum\": [\"my-library\", \"no-restrict\"], \"type\": \"string\", \"location\": \"query\"}, \"langRestrict\": {\"type\": \"string\", \"location\": \"query\"}, \"showPreorders\": {\"type\": \"boolean\", \"location\": \"query\"}, \"printType\": {\"enum\": [\"all\", \"books\", \"magazines\"], \"type\": \"string\", \"location\": \"query\"}, \"maxResults\": {\"location\": \"query\", \"minimum\": \"0\", \"type\": \"integer\", \"maximum\": \"40\", \"format\": \"uint32\"}, \"filter\": {\"enum\": [\"ebooks\", \"free-ebooks\", \"full\", \"paid-ebooks\", \"partial\"], \"type\": \"string\", \"location\": \"query\"}, \"source\": {\"type\": \"string\", \"location\": \"query\"}, \"startIndex\": {\"minimum\": \"0\", \"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"download\": {\"enum\": [\"epub\"], \"type\": \"string\", \"location\": \"query\"}, \"partner\": {\"type\": \"string\", \"location\": \"query\"}}, \"id\": \"books.volumes.list\", \"httpMethod\": \"GET\", \"path\": \"volumes\", \"response\": {\"$ref\": \"Volumes\"}}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/books\"], \"parameters\": {\"partner\": {\"type\": \"string\", \"location\": \"query\"}, \"country\": {\"type\": \"string\", \"location\": \"query\"}, \"projection\": {\"enum\": [\"full\", \"lite\"], \"type\": \"string\", \"location\": \"query\"}, \"volumeId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"source\": {\"type\": \"string\", \"location\": \"query\"}}, \"id\": \"books.volumes.get\", \"httpMethod\": \"GET\", \"path\": \"volumes/{volumeId}\", \"response\": {\"$ref\": \"Volume\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_BooksService.class,
                "volumes_associated",
                new Google_VolumesAssociatedServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_BooksService.class, "serviceName"),
                        "associated",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/books\"], \"parameters\": {\"projection\": {\"enum\": [\"full\", \"lite\"], \"type\": \"string\", \"location\": \"query\"}, \"volumeId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"maxResults\": {\"location\": \"query\", \"minimum\": \"0\", \"type\": \"integer\", \"maximum\": \"40\", \"format\": \"uint32\"}, \"filter\": {\"enum\": [\"ebooks\", \"free-ebooks\", \"full\", \"paid-ebooks\", \"partial\"], \"type\": \"string\", \"location\": \"query\"}, \"source\": {\"type\": \"string\", \"location\": \"query\"}, \"startIndex\": {\"minimum\": \"0\", \"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"association\": {\"enum\": [\"complementary\"], \"type\": \"string\", \"location\": \"query\"}}, \"id\": \"books.volumes.associated.list\", \"httpMethod\": \"GET\", \"path\": \"volumes/{volumeId}/associated\", \"response\": {\"$ref\": \"Volumes\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_BooksService.class,
                "mylibrary_bookshelves",
                new Google_MylibraryBookshelvesServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_BooksService.class, "serviceName"),
                        "bookshelves",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"removeVolume\": {\"scopes\": [\"https://www.googleapis.com/auth/books\"], \"path\": \"mylibrary/bookshelves/{shelf}/removeVolume\", \"id\": \"books.mylibrary.bookshelves.removeVolume\", \"parameters\": {\"shelf\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"volumeId\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"source\": {\"type\": \"string\", \"location\": \"query\"}}, \"httpMethod\": \"POST\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/books\"], \"parameters\": {\"shelf\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"source\": {\"type\": \"string\", \"location\": \"query\"}}, \"id\": \"books.mylibrary.bookshelves.get\", \"httpMethod\": \"GET\", \"path\": \"mylibrary/bookshelves/{shelf}\", \"response\": {\"$ref\": \"Bookshelf\"}}, \"clearVolumes\": {\"scopes\": [\"https://www.googleapis.com/auth/books\"], \"path\": \"mylibrary/bookshelves/{shelf}/clearVolumes\", \"id\": \"books.mylibrary.bookshelves.clearVolumes\", \"parameters\": {\"shelf\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"source\": {\"type\": \"string\", \"location\": \"query\"}}, \"httpMethod\": \"POST\"}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/books\"], \"parameters\": {\"source\": {\"type\": \"string\", \"location\": \"query\"}}, \"response\": {\"$ref\": \"Bookshelves\"}, \"httpMethod\": \"GET\", \"path\": \"mylibrary/bookshelves\", \"id\": \"books.mylibrary.bookshelves.list\"}, \"addVolume\": {\"scopes\": [\"https://www.googleapis.com/auth/books\"], \"path\": \"mylibrary/bookshelves/{shelf}/addVolume\", \"id\": \"books.mylibrary.bookshelves.addVolume\", \"parameters\": {\"shelf\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"volumeId\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"source\": {\"type\": \"string\", \"location\": \"query\"}}, \"httpMethod\": \"POST\"}, \"moveVolume\": {\"scopes\": [\"https://www.googleapis.com/auth/books\"], \"path\": \"mylibrary/bookshelves/{shelf}/moveVolume\", \"id\": \"books.mylibrary.bookshelves.moveVolume\", \"parameters\": {\"source\": {\"type\": \"string\", \"location\": \"query\"}, \"volumePosition\": {\"required\": true, \"type\": \"integer\", \"location\": \"query\", \"format\": \"int32\"}, \"volumeId\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"shelf\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"httpMethod\": \"POST\"}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_BooksService.class,
                "mylibrary_bookshelves_volumes",
                new Google_MylibraryBookshelvesVolumesServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_BooksService.class, "serviceName"),
                        "volumes",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/books\"], \"parameters\": {\"projection\": {\"enum\": [\"full\", \"lite\"], \"type\": \"string\", \"location\": \"query\"}, \"country\": {\"type\": \"string\", \"location\": \"query\"}, \"showPreorders\": {\"type\": \"boolean\", \"location\": \"query\"}, \"maxResults\": {\"minimum\": \"0\", \"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"q\": {\"type\": \"string\", \"location\": \"query\"}, \"source\": {\"type\": \"string\", \"location\": \"query\"}, \"startIndex\": {\"minimum\": \"0\", \"type\": \"integer\", \"location\": \"query\", \"format\": \"uint32\"}, \"shelf\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"books.mylibrary.bookshelves.volumes.list\", \"httpMethod\": \"GET\", \"path\": \"mylibrary/bookshelves/{shelf}/volumes\", \"response\": {\"$ref\": \"Volumes\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_BooksService.class,
                "mylibrary_readingpositions",
                new Google_MylibraryReadingpositionsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_BooksService.class, "serviceName"),
                        "readingpositions",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"setPosition\": {\"scopes\": [\"https://www.googleapis.com/auth/books\"], \"path\": \"mylibrary/readingpositions/{volumeId}/setPosition\", \"id\": \"books.mylibrary.readingpositions.setPosition\", \"parameters\": {\"timestamp\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}, \"volumeId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"source\": {\"type\": \"string\", \"location\": \"query\"}, \"contentVersion\": {\"type\": \"string\", \"location\": \"query\"}, \"action\": {\"enum\": [\"bookmark\", \"chapter\", \"next-page\", \"prev-page\", \"scroll\", \"search\"], \"type\": \"string\", \"location\": \"query\"}, \"position\": {\"required\": true, \"type\": \"string\", \"location\": \"query\"}}, \"httpMethod\": \"POST\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/books\"], \"parameters\": {\"source\": {\"type\": \"string\", \"location\": \"query\"}, \"contentVersion\": {\"type\": \"string\", \"location\": \"query\"}, \"volumeId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"books.mylibrary.readingpositions.get\", \"httpMethod\": \"GET\", \"path\": \"mylibrary/readingpositions/{volumeId}\", \"response\": {\"$ref\": \"ReadingPosition\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_BooksService.class,
                "mylibrary_annotations",
                new Google_MylibraryAnnotationsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_BooksService.class, "serviceName"),
                        "annotations",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/books\"], \"parameters\": {\"source\": {\"type\": \"string\", \"location\": \"query\"}}, \"request\": {\"$ref\": \"Annotation\"}, \"response\": {\"$ref\": \"Annotation\"}, \"httpMethod\": \"POST\", \"path\": \"mylibrary/annotations\", \"id\": \"books.mylibrary.annotations.insert\"}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/books\"], \"parameters\": {\"source\": {\"type\": \"string\", \"location\": \"query\"}, \"annotationId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"books.mylibrary.annotations.get\", \"httpMethod\": \"GET\", \"path\": \"mylibrary/annotations/{annotationId}\", \"response\": {\"$ref\": \"Annotation\"}}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/books\"], \"parameters\": {\"showDeleted\": {\"type\": \"boolean\", \"location\": \"query\"}, \"updatedMin\": {\"type\": \"string\", \"location\": \"query\"}, \"updatedMax\": {\"type\": \"string\", \"location\": \"query\"}, \"volumeId\": {\"type\": \"string\", \"location\": \"query\"}, \"maxResults\": {\"location\": \"query\", \"minimum\": \"0\", \"type\": \"integer\", \"maximum\": \"40\", \"format\": \"uint32\"}, \"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"pageIds\": {\"repeated\": true, \"type\": \"string\", \"location\": \"query\"}, \"contentVersion\": {\"type\": \"string\", \"location\": \"query\"}, \"source\": {\"type\": \"string\", \"location\": \"query\"}, \"layerId\": {\"type\": \"string\", \"location\": \"query\"}}, \"response\": {\"$ref\": \"Annotations\"}, \"httpMethod\": \"GET\", \"path\": \"mylibrary/annotations\", \"id\": \"books.mylibrary.annotations.list\"}, \"update\": {\"scopes\": [\"https://www.googleapis.com/auth/books\"], \"parameters\": {\"source\": {\"type\": \"string\", \"location\": \"query\"}, \"annotationId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"request\": {\"$ref\": \"Annotation\"}, \"response\": {\"$ref\": \"Annotation\"}, \"httpMethod\": \"PUT\", \"path\": \"mylibrary/annotations/{annotationId}\", \"id\": \"books.mylibrary.annotations.update\"}, \"delete\": {\"scopes\": [\"https://www.googleapis.com/auth/books\"], \"path\": \"mylibrary/annotations/{annotationId}\", \"id\": \"books.mylibrary.annotations.delete\", \"parameters\": {\"source\": {\"type\": \"string\", \"location\": \"query\"}, \"annotationId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"httpMethod\": \"DELETE\"}}}",
                                true)));

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
