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

 google-api-php-client/src/contrib/Google_PlusMomentsService.php

*/

public class Google_ItemScope extends Google_Model implements RuntimeFileContextInterface {

    public Object startDate = null;

    public Object endDate = null;

    public Object text = null;

    public Object image = null;

    public Object __addressType = "Google_ItemScope";

    public Object __addressDataType = "";

    public Object address = null;

    public Object birthDate = null;

    public Object datePublished = null;

    public Object addressLocality = null;

    public Object duration = null;

    public Object additionalName = null;

    public Object worstRating = null;

    public Object __contributorType = "Google_ItemScope";

    public Object __contributorDataType = "array";

    public Object contributor = null;

    public Object thumbnailUrl = null;

    public Object id = null;

    public Object postOfficeBoxNumber = null;

    public Object __attendeesType = "Google_ItemScope";

    public Object __attendeesDataType = "array";

    public Object attendees = null;

    public Object __authorType = "Google_ItemScope";

    public Object __authorDataType = "array";

    public Object author = null;

    public Object __associated_mediaType = "Google_ItemScope";

    public Object __associated_mediaDataType = "array";

    public Object associated_media = null;

    public Object bestRating = null;

    public Object addressCountry = null;

    public Object width = null;

    public Object streetAddress = null;

    public Object __locationType = "Google_ItemScope";

    public Object __locationDataType = "";

    public Object location = null;

    public Object latitude = null;

    public Object __byArtistType = "Google_ItemScope";

    public Object __byArtistDataType = "";

    public Object byArtist = null;

    public Object type = null;

    public Object dateModified = null;

    public Object contentSize = null;

    public Object contentUrl = null;

    public Object __partOfTVSeriesType = "Google_ItemScope";

    public Object __partOfTVSeriesDataType = "";

    public Object partOfTVSeries = null;

    public Object description = null;

    public Object familyName = null;

    public Object kind = null;

    public Object dateCreated = null;

    public Object postalCode = null;

    public Object attendeeCount = null;

    public Object __inAlbumType = "Google_ItemScope";

    public Object __inAlbumDataType = "";

    public Object inAlbum = null;

    public Object addressRegion = null;

    public Object height = null;

    public Object __geoType = "Google_ItemScope";

    public Object __geoDataType = "";

    public Object geo = null;

    public Object embedUrl = null;

    public Object tickerSymbol = null;

    public Object playerType = null;

    public Object __aboutType = "Google_ItemScope";

    public Object __aboutDataType = "";

    public Object about = null;

    public Object givenName = null;

    public Object name = null;

    public Object __performersType = "Google_ItemScope";

    public Object __performersDataType = "array";

    public Object performers = null;

    public Object url = null;

    public Object gender = null;

    public Object longitude = null;

    public Object __thumbnailType = "Google_ItemScope";

    public Object __thumbnailDataType = "";

    public Object thumbnail = null;

    public Object caption = null;

    public Object ratingValue = null;

    public Object __reviewRatingType = "Google_ItemScope";

    public Object __reviewRatingDataType = "";

    public Object reviewRating = null;

    public Object __audioType = "Google_ItemScope";

    public Object __audioDataType = "";

    public Object audio = null;

    public Google_ItemScope(RuntimeEnv env, Object... args) {
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
            case "setStartDate":
                return this.setStartDate(env, args);
            case "getStartDate":
                return this.getStartDate(env, args);
            case "setEndDate":
                return this.setEndDate(env, args);
            case "getEndDate":
                return this.getEndDate(env, args);
            case "setText":
                return this.setText(env, args);
            case "getText":
                return this.getText(env, args);
            case "setImage":
                return this.setImage(env, args);
            case "getImage":
                return this.getImage(env, args);
            case "setAddress":
                return this.setAddress(env, args);
            case "getAddress":
                return this.getAddress(env, args);
            case "setBirthDate":
                return this.setBirthDate(env, args);
            case "getBirthDate":
                return this.getBirthDate(env, args);
            case "setDatePublished":
                return this.setDatePublished(env, args);
            case "getDatePublished":
                return this.getDatePublished(env, args);
            case "setAddressLocality":
                return this.setAddressLocality(env, args);
            case "getAddressLocality":
                return this.getAddressLocality(env, args);
            case "setDuration":
                return this.setDuration(env, args);
            case "getDuration":
                return this.getDuration(env, args);
            case "setAdditionalName":
                return this.setAdditionalName(env, args);
            case "getAdditionalName":
                return this.getAdditionalName(env, args);
            case "setWorstRating":
                return this.setWorstRating(env, args);
            case "getWorstRating":
                return this.getWorstRating(env, args);
            case "setContributor":
                return this.setContributor(env, args);
            case "getContributor":
                return this.getContributor(env, args);
            case "setThumbnailUrl":
                return this.setThumbnailUrl(env, args);
            case "getThumbnailUrl":
                return this.getThumbnailUrl(env, args);
            case "setId":
                return this.setId(env, args);
            case "getId":
                return this.getId(env, args);
            case "setPostOfficeBoxNumber":
                return this.setPostOfficeBoxNumber(env, args);
            case "getPostOfficeBoxNumber":
                return this.getPostOfficeBoxNumber(env, args);
            case "setAttendees":
                return this.setAttendees(env, args);
            case "getAttendees":
                return this.getAttendees(env, args);
            case "setAuthor":
                return this.setAuthor(env, args);
            case "getAuthor":
                return this.getAuthor(env, args);
            case "setAssociated_media":
                return this.setAssociated_media(env, args);
            case "getAssociated_media":
                return this.getAssociated_media(env, args);
            case "setBestRating":
                return this.setBestRating(env, args);
            case "getBestRating":
                return this.getBestRating(env, args);
            case "setAddressCountry":
                return this.setAddressCountry(env, args);
            case "getAddressCountry":
                return this.getAddressCountry(env, args);
            case "setWidth":
                return this.setWidth(env, args);
            case "getWidth":
                return this.getWidth(env, args);
            case "setStreetAddress":
                return this.setStreetAddress(env, args);
            case "getStreetAddress":
                return this.getStreetAddress(env, args);
            case "setLocation":
                return this.setLocation(env, args);
            case "getLocation":
                return this.getLocation(env, args);
            case "setLatitude":
                return this.setLatitude(env, args);
            case "getLatitude":
                return this.getLatitude(env, args);
            case "setByArtist":
                return this.setByArtist(env, args);
            case "getByArtist":
                return this.getByArtist(env, args);
            case "setType":
                return this.setType(env, args);
            case "getType":
                return this.getType(env, args);
            case "setDateModified":
                return this.setDateModified(env, args);
            case "getDateModified":
                return this.getDateModified(env, args);
            case "setContentSize":
                return this.setContentSize(env, args);
            case "getContentSize":
                return this.getContentSize(env, args);
            case "setContentUrl":
                return this.setContentUrl(env, args);
            case "getContentUrl":
                return this.getContentUrl(env, args);
            case "setPartOfTVSeries":
                return this.setPartOfTVSeries(env, args);
            case "getPartOfTVSeries":
                return this.getPartOfTVSeries(env, args);
            case "setDescription":
                return this.setDescription(env, args);
            case "getDescription":
                return this.getDescription(env, args);
            case "setFamilyName":
                return this.setFamilyName(env, args);
            case "getFamilyName":
                return this.getFamilyName(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setDateCreated":
                return this.setDateCreated(env, args);
            case "getDateCreated":
                return this.getDateCreated(env, args);
            case "setPostalCode":
                return this.setPostalCode(env, args);
            case "getPostalCode":
                return this.getPostalCode(env, args);
            case "setAttendeeCount":
                return this.setAttendeeCount(env, args);
            case "getAttendeeCount":
                return this.getAttendeeCount(env, args);
            case "setInAlbum":
                return this.setInAlbum(env, args);
            case "getInAlbum":
                return this.getInAlbum(env, args);
            case "setAddressRegion":
                return this.setAddressRegion(env, args);
            case "getAddressRegion":
                return this.getAddressRegion(env, args);
            case "setHeight":
                return this.setHeight(env, args);
            case "getHeight":
                return this.getHeight(env, args);
            case "setGeo":
                return this.setGeo(env, args);
            case "getGeo":
                return this.getGeo(env, args);
            case "setEmbedUrl":
                return this.setEmbedUrl(env, args);
            case "getEmbedUrl":
                return this.getEmbedUrl(env, args);
            case "setTickerSymbol":
                return this.setTickerSymbol(env, args);
            case "getTickerSymbol":
                return this.getTickerSymbol(env, args);
            case "setPlayerType":
                return this.setPlayerType(env, args);
            case "getPlayerType":
                return this.getPlayerType(env, args);
            case "setAbout":
                return this.setAbout(env, args);
            case "getAbout":
                return this.getAbout(env, args);
            case "setGivenName":
                return this.setGivenName(env, args);
            case "getGivenName":
                return this.getGivenName(env, args);
            case "setName":
                return this.setName(env, args);
            case "getName":
                return this.getName(env, args);
            case "setPerformers":
                return this.setPerformers(env, args);
            case "getPerformers":
                return this.getPerformers(env, args);
            case "setUrl":
                return this.setUrl(env, args);
            case "getUrl":
                return this.getUrl(env, args);
            case "setGender":
                return this.setGender(env, args);
            case "getGender":
                return this.getGender(env, args);
            case "setLongitude":
                return this.setLongitude(env, args);
            case "getLongitude":
                return this.getLongitude(env, args);
            case "setThumbnail":
                return this.setThumbnail(env, args);
            case "getThumbnail":
                return this.getThumbnail(env, args);
            case "setCaption":
                return this.setCaption(env, args);
            case "getCaption":
                return this.getCaption(env, args);
            case "setRatingValue":
                return this.setRatingValue(env, args);
            case "getRatingValue":
                return this.getRatingValue(env, args);
            case "setReviewRating":
                return this.setReviewRating(env, args);
            case "getReviewRating":
                return this.getReviewRating(env, args);
            case "setAudio":
                return this.setAudio(env, args);
            case "getAudio":
                return this.getAudio(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "startDate":
                return this.startDate;
            case "endDate":
                return this.endDate;
            case "text":
                return this.text;
            case "image":
                return this.image;
            case "__addressType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return this.__addressType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__addressDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return this.__addressDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "address":
                return this.address;
            case "birthDate":
                return this.birthDate;
            case "datePublished":
                return this.datePublished;
            case "addressLocality":
                return this.addressLocality;
            case "duration":
                return this.duration;
            case "additionalName":
                return this.additionalName;
            case "worstRating":
                return this.worstRating;
            case "__contributorType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return this.__contributorType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__contributorDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return this.__contributorDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "contributor":
                return this.contributor;
            case "thumbnailUrl":
                return this.thumbnailUrl;
            case "id":
                return this.id;
            case "postOfficeBoxNumber":
                return this.postOfficeBoxNumber;
            case "__attendeesType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return this.__attendeesType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__attendeesDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return this.__attendeesDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "attendees":
                return this.attendees;
            case "__authorType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return this.__authorType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__authorDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return this.__authorDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "author":
                return this.author;
            case "__associated_mediaType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return this.__associated_mediaType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__associated_mediaDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return this.__associated_mediaDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "associated_media":
                return this.associated_media;
            case "bestRating":
                return this.bestRating;
            case "addressCountry":
                return this.addressCountry;
            case "width":
                return this.width;
            case "streetAddress":
                return this.streetAddress;
            case "__locationType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return this.__locationType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__locationDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return this.__locationDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "location":
                return this.location;
            case "latitude":
                return this.latitude;
            case "__byArtistType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return this.__byArtistType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__byArtistDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return this.__byArtistDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "byArtist":
                return this.byArtist;
            case "type":
                return this.type;
            case "dateModified":
                return this.dateModified;
            case "contentSize":
                return this.contentSize;
            case "contentUrl":
                return this.contentUrl;
            case "__partOfTVSeriesType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return this.__partOfTVSeriesType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__partOfTVSeriesDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return this.__partOfTVSeriesDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "partOfTVSeries":
                return this.partOfTVSeries;
            case "description":
                return this.description;
            case "familyName":
                return this.familyName;
            case "kind":
                return this.kind;
            case "dateCreated":
                return this.dateCreated;
            case "postalCode":
                return this.postalCode;
            case "attendeeCount":
                return this.attendeeCount;
            case "__inAlbumType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return this.__inAlbumType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__inAlbumDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return this.__inAlbumDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "inAlbum":
                return this.inAlbum;
            case "addressRegion":
                return this.addressRegion;
            case "height":
                return this.height;
            case "__geoType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return this.__geoType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__geoDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return this.__geoDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "geo":
                return this.geo;
            case "embedUrl":
                return this.embedUrl;
            case "tickerSymbol":
                return this.tickerSymbol;
            case "playerType":
                return this.playerType;
            case "__aboutType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return this.__aboutType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__aboutDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return this.__aboutDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "about":
                return this.about;
            case "givenName":
                return this.givenName;
            case "name":
                return this.name;
            case "__performersType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return this.__performersType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__performersDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return this.__performersDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "performers":
                return this.performers;
            case "url":
                return this.url;
            case "gender":
                return this.gender;
            case "longitude":
                return this.longitude;
            case "__thumbnailType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return this.__thumbnailType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__thumbnailDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return this.__thumbnailDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "thumbnail":
                return this.thumbnail;
            case "caption":
                return this.caption;
            case "ratingValue":
                return this.ratingValue;
            case "__reviewRatingType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return this.__reviewRatingType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__reviewRatingDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return this.__reviewRatingDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "reviewRating":
                return this.reviewRating;
            case "__audioType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return this.__audioType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__audioDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return this.__audioDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "audio":
                return this.audio;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "startDate":
                return ZVal.isNull(this.startDate);
            case "endDate":
                return ZVal.isNull(this.endDate);
            case "text":
                return ZVal.isNull(this.text);
            case "image":
                return ZVal.isNull(this.image);
            case "__addressType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__addressType);
                }
                break;
            case "__addressDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__addressDataType);
                }
                break;
            case "address":
                return ZVal.isNull(this.address);
            case "birthDate":
                return ZVal.isNull(this.birthDate);
            case "datePublished":
                return ZVal.isNull(this.datePublished);
            case "addressLocality":
                return ZVal.isNull(this.addressLocality);
            case "duration":
                return ZVal.isNull(this.duration);
            case "additionalName":
                return ZVal.isNull(this.additionalName);
            case "worstRating":
                return ZVal.isNull(this.worstRating);
            case "__contributorType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__contributorType);
                }
                break;
            case "__contributorDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__contributorDataType);
                }
                break;
            case "contributor":
                return ZVal.isNull(this.contributor);
            case "thumbnailUrl":
                return ZVal.isNull(this.thumbnailUrl);
            case "id":
                return ZVal.isNull(this.id);
            case "postOfficeBoxNumber":
                return ZVal.isNull(this.postOfficeBoxNumber);
            case "__attendeesType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__attendeesType);
                }
                break;
            case "__attendeesDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__attendeesDataType);
                }
                break;
            case "attendees":
                return ZVal.isNull(this.attendees);
            case "__authorType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__authorType);
                }
                break;
            case "__authorDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__authorDataType);
                }
                break;
            case "author":
                return ZVal.isNull(this.author);
            case "__associated_mediaType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__associated_mediaType);
                }
                break;
            case "__associated_mediaDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__associated_mediaDataType);
                }
                break;
            case "associated_media":
                return ZVal.isNull(this.associated_media);
            case "bestRating":
                return ZVal.isNull(this.bestRating);
            case "addressCountry":
                return ZVal.isNull(this.addressCountry);
            case "width":
                return ZVal.isNull(this.width);
            case "streetAddress":
                return ZVal.isNull(this.streetAddress);
            case "__locationType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__locationType);
                }
                break;
            case "__locationDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__locationDataType);
                }
                break;
            case "location":
                return ZVal.isNull(this.location);
            case "latitude":
                return ZVal.isNull(this.latitude);
            case "__byArtistType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__byArtistType);
                }
                break;
            case "__byArtistDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__byArtistDataType);
                }
                break;
            case "byArtist":
                return ZVal.isNull(this.byArtist);
            case "type":
                return ZVal.isNull(this.type);
            case "dateModified":
                return ZVal.isNull(this.dateModified);
            case "contentSize":
                return ZVal.isNull(this.contentSize);
            case "contentUrl":
                return ZVal.isNull(this.contentUrl);
            case "__partOfTVSeriesType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__partOfTVSeriesType);
                }
                break;
            case "__partOfTVSeriesDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__partOfTVSeriesDataType);
                }
                break;
            case "partOfTVSeries":
                return ZVal.isNull(this.partOfTVSeries);
            case "description":
                return ZVal.isNull(this.description);
            case "familyName":
                return ZVal.isNull(this.familyName);
            case "kind":
                return ZVal.isNull(this.kind);
            case "dateCreated":
                return ZVal.isNull(this.dateCreated);
            case "postalCode":
                return ZVal.isNull(this.postalCode);
            case "attendeeCount":
                return ZVal.isNull(this.attendeeCount);
            case "__inAlbumType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__inAlbumType);
                }
                break;
            case "__inAlbumDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__inAlbumDataType);
                }
                break;
            case "inAlbum":
                return ZVal.isNull(this.inAlbum);
            case "addressRegion":
                return ZVal.isNull(this.addressRegion);
            case "height":
                return ZVal.isNull(this.height);
            case "__geoType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__geoType);
                }
                break;
            case "__geoDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__geoDataType);
                }
                break;
            case "geo":
                return ZVal.isNull(this.geo);
            case "embedUrl":
                return ZVal.isNull(this.embedUrl);
            case "tickerSymbol":
                return ZVal.isNull(this.tickerSymbol);
            case "playerType":
                return ZVal.isNull(this.playerType);
            case "__aboutType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__aboutType);
                }
                break;
            case "__aboutDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__aboutDataType);
                }
                break;
            case "about":
                return ZVal.isNull(this.about);
            case "givenName":
                return ZVal.isNull(this.givenName);
            case "name":
                return ZVal.isNull(this.name);
            case "__performersType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__performersType);
                }
                break;
            case "__performersDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__performersDataType);
                }
                break;
            case "performers":
                return ZVal.isNull(this.performers);
            case "url":
                return ZVal.isNull(this.url);
            case "gender":
                return ZVal.isNull(this.gender);
            case "longitude":
                return ZVal.isNull(this.longitude);
            case "__thumbnailType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__thumbnailType);
                }
                break;
            case "__thumbnailDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__thumbnailDataType);
                }
                break;
            case "thumbnail":
                return ZVal.isNull(this.thumbnail);
            case "caption":
                return ZVal.isNull(this.caption);
            case "ratingValue":
                return ZVal.isNull(this.ratingValue);
            case "__reviewRatingType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__reviewRatingType);
                }
                break;
            case "__reviewRatingDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__reviewRatingDataType);
                }
                break;
            case "reviewRating":
                return ZVal.isNull(this.reviewRating);
            case "__audioType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__audioType);
                }
                break;
            case "__audioDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__audioDataType);
                }
                break;
            case "audio":
                return ZVal.isNull(this.audio);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "startDate":
                this.startDate = value;
                break;
            case "endDate":
                this.endDate = value;
                break;
            case "text":
                this.text = value;
                break;
            case "image":
                this.image = value;
                break;
            case "__addressType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    this.__addressType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__addressDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    this.__addressDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "address":
                this.address = value;
                break;
            case "birthDate":
                this.birthDate = value;
                break;
            case "datePublished":
                this.datePublished = value;
                break;
            case "addressLocality":
                this.addressLocality = value;
                break;
            case "duration":
                this.duration = value;
                break;
            case "additionalName":
                this.additionalName = value;
                break;
            case "worstRating":
                this.worstRating = value;
                break;
            case "__contributorType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    this.__contributorType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__contributorDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    this.__contributorDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "contributor":
                this.contributor = value;
                break;
            case "thumbnailUrl":
                this.thumbnailUrl = value;
                break;
            case "id":
                this.id = value;
                break;
            case "postOfficeBoxNumber":
                this.postOfficeBoxNumber = value;
                break;
            case "__attendeesType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    this.__attendeesType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__attendeesDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    this.__attendeesDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "attendees":
                this.attendees = value;
                break;
            case "__authorType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    this.__authorType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__authorDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    this.__authorDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "author":
                this.author = value;
                break;
            case "__associated_mediaType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    this.__associated_mediaType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__associated_mediaDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    this.__associated_mediaDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "associated_media":
                this.associated_media = value;
                break;
            case "bestRating":
                this.bestRating = value;
                break;
            case "addressCountry":
                this.addressCountry = value;
                break;
            case "width":
                this.width = value;
                break;
            case "streetAddress":
                this.streetAddress = value;
                break;
            case "__locationType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    this.__locationType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__locationDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    this.__locationDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "location":
                this.location = value;
                break;
            case "latitude":
                this.latitude = value;
                break;
            case "__byArtistType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    this.__byArtistType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__byArtistDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    this.__byArtistDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "byArtist":
                this.byArtist = value;
                break;
            case "type":
                this.type = value;
                break;
            case "dateModified":
                this.dateModified = value;
                break;
            case "contentSize":
                this.contentSize = value;
                break;
            case "contentUrl":
                this.contentUrl = value;
                break;
            case "__partOfTVSeriesType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    this.__partOfTVSeriesType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__partOfTVSeriesDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    this.__partOfTVSeriesDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "partOfTVSeries":
                this.partOfTVSeries = value;
                break;
            case "description":
                this.description = value;
                break;
            case "familyName":
                this.familyName = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "dateCreated":
                this.dateCreated = value;
                break;
            case "postalCode":
                this.postalCode = value;
                break;
            case "attendeeCount":
                this.attendeeCount = value;
                break;
            case "__inAlbumType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    this.__inAlbumType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__inAlbumDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    this.__inAlbumDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "inAlbum":
                this.inAlbum = value;
                break;
            case "addressRegion":
                this.addressRegion = value;
                break;
            case "height":
                this.height = value;
                break;
            case "__geoType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    this.__geoType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__geoDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    this.__geoDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "geo":
                this.geo = value;
                break;
            case "embedUrl":
                this.embedUrl = value;
                break;
            case "tickerSymbol":
                this.tickerSymbol = value;
                break;
            case "playerType":
                this.playerType = value;
                break;
            case "__aboutType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    this.__aboutType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__aboutDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    this.__aboutDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "about":
                this.about = value;
                break;
            case "givenName":
                this.givenName = value;
                break;
            case "name":
                this.name = value;
                break;
            case "__performersType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    this.__performersType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__performersDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    this.__performersDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "performers":
                this.performers = value;
                break;
            case "url":
                this.url = value;
                break;
            case "gender":
                this.gender = value;
                break;
            case "longitude":
                this.longitude = value;
                break;
            case "__thumbnailType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    this.__thumbnailType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__thumbnailDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    this.__thumbnailDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "thumbnail":
                this.thumbnail = value;
                break;
            case "caption":
                this.caption = value;
                break;
            case "ratingValue":
                this.ratingValue = value;
                break;
            case "__reviewRatingType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    this.__reviewRatingType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__reviewRatingDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    this.__reviewRatingDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "reviewRating":
                this.reviewRating = value;
                break;
            case "__audioType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    this.__audioType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__audioDataType":
                if (Google_ItemScope.class.isAssignableFrom(caller)) {

                    this.__audioDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "audio":
                this.audio = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setStartDate(RuntimeEnv env, Object... args) {
        Object startDate = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "startDate", startDate);

        return null;
    }

    public Object getStartDate(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "startDate"));
    }

    public Object setEndDate(RuntimeEnv env, Object... args) {
        Object endDate = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "endDate", endDate);

        return null;
    }

    public Object getEndDate(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "endDate"));
    }

    public Object setText(RuntimeEnv env, Object... args) {
        Object text = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "text", text);

        return null;
    }

    public Object getText(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "text"));
    }

    public Object setImage(RuntimeEnv env, Object... args) {
        Object image = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "image", image);

        return null;
    }

    public Object getImage(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "image"));
    }

    public Object setAddress(RuntimeEnv env, Object... args) {
        Object address = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "address", address);

        return null;
    }

    public Object getAddress(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "address"));
    }

    public Object setBirthDate(RuntimeEnv env, Object... args) {
        Object birthDate = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "birthDate", birthDate);

        return null;
    }

    public Object getBirthDate(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "birthDate"));
    }

    public Object setDatePublished(RuntimeEnv env, Object... args) {
        Object datePublished = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "datePublished", datePublished);

        return null;
    }

    public Object getDatePublished(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "datePublished"));
    }

    public Object setAddressLocality(RuntimeEnv env, Object... args) {
        Object addressLocality = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "addressLocality", addressLocality);

        return null;
    }

    public Object getAddressLocality(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "addressLocality"));
    }

    public Object setDuration(RuntimeEnv env, Object... args) {
        Object duration = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "duration", duration);

        return null;
    }

    public Object getDuration(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "duration"));
    }

    public Object setAdditionalName(RuntimeEnv env, Object... args) {
        Object additionalName = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_ItemScope.class,
                additionalName,
                "Google_string",
                "setAdditionalName");
        ZVal.setProperty(this, Google_ItemScope.class, "additionalName", additionalName);

        return null;
    }

    public Object getAdditionalName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "additionalName"));
    }

    public Object setWorstRating(RuntimeEnv env, Object... args) {
        Object worstRating = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "worstRating", worstRating);

        return null;
    }

    public Object getWorstRating(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "worstRating"));
    }

    public Object setContributor(RuntimeEnv env, Object... args) {
        Object contributor = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_ItemScope.class,
                contributor,
                "Google_ItemScope",
                "setContributor");
        ZVal.setProperty(this, Google_ItemScope.class, "contributor", contributor);

        return null;
    }

    public Object getContributor(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "contributor"));
    }

    public Object setThumbnailUrl(RuntimeEnv env, Object... args) {
        Object thumbnailUrl = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "thumbnailUrl", thumbnailUrl);

        return null;
    }

    public Object getThumbnailUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "thumbnailUrl"));
    }

    public Object setId(RuntimeEnv env, Object... args) {
        Object id = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "id", id);

        return null;
    }

    public Object getId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "id"));
    }

    public Object setPostOfficeBoxNumber(RuntimeEnv env, Object... args) {
        Object postOfficeBoxNumber = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "postOfficeBoxNumber", postOfficeBoxNumber);

        return null;
    }

    public Object getPostOfficeBoxNumber(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "postOfficeBoxNumber"));
    }

    public Object setAttendees(RuntimeEnv env, Object... args) {
        Object attendees = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_ItemScope.class,
                attendees,
                "Google_ItemScope",
                "setAttendees");
        ZVal.setProperty(this, Google_ItemScope.class, "attendees", attendees);

        return null;
    }

    public Object getAttendees(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "attendees"));
    }

    public Object setAuthor(RuntimeEnv env, Object... args) {
        Object author = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_ItemScope.class,
                author,
                "Google_ItemScope",
                "setAuthor");
        ZVal.setProperty(this, Google_ItemScope.class, "author", author);

        return null;
    }

    public Object getAuthor(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "author"));
    }

    public Object setAssociated_media(RuntimeEnv env, Object... args) {
        Object associated_media = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_ItemScope.class,
                associated_media,
                "Google_ItemScope",
                "setAssociated_media");
        ZVal.setProperty(this, Google_ItemScope.class, "associated_media", associated_media);

        return null;
    }

    public Object getAssociated_media(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "associated_media"));
    }

    public Object setBestRating(RuntimeEnv env, Object... args) {
        Object bestRating = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "bestRating", bestRating);

        return null;
    }

    public Object getBestRating(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "bestRating"));
    }

    public Object setAddressCountry(RuntimeEnv env, Object... args) {
        Object addressCountry = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "addressCountry", addressCountry);

        return null;
    }

    public Object getAddressCountry(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "addressCountry"));
    }

    public Object setWidth(RuntimeEnv env, Object... args) {
        Object width = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "width", width);

        return null;
    }

    public Object getWidth(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "width"));
    }

    public Object setStreetAddress(RuntimeEnv env, Object... args) {
        Object streetAddress = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "streetAddress", streetAddress);

        return null;
    }

    public Object getStreetAddress(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "streetAddress"));
    }

    public Object setLocation(RuntimeEnv env, Object... args) {
        Object location = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "location", location);

        return null;
    }

    public Object getLocation(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "location"));
    }

    public Object setLatitude(RuntimeEnv env, Object... args) {
        Object latitude = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "latitude", latitude);

        return null;
    }

    public Object getLatitude(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "latitude"));
    }

    public Object setByArtist(RuntimeEnv env, Object... args) {
        Object byArtist = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "byArtist", byArtist);

        return null;
    }

    public Object getByArtist(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "byArtist"));
    }

    public Object setType(RuntimeEnv env, Object... args) {
        Object type = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "type", type);

        return null;
    }

    public Object getType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "type"));
    }

    public Object setDateModified(RuntimeEnv env, Object... args) {
        Object dateModified = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "dateModified", dateModified);

        return null;
    }

    public Object getDateModified(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "dateModified"));
    }

    public Object setContentSize(RuntimeEnv env, Object... args) {
        Object contentSize = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "contentSize", contentSize);

        return null;
    }

    public Object getContentSize(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "contentSize"));
    }

    public Object setContentUrl(RuntimeEnv env, Object... args) {
        Object contentUrl = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "contentUrl", contentUrl);

        return null;
    }

    public Object getContentUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "contentUrl"));
    }

    public Object setPartOfTVSeries(RuntimeEnv env, Object... args) {
        Object partOfTVSeries = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "partOfTVSeries", partOfTVSeries);

        return null;
    }

    public Object getPartOfTVSeries(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "partOfTVSeries"));
    }

    public Object setDescription(RuntimeEnv env, Object... args) {
        Object description = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "description", description);

        return null;
    }

    public Object getDescription(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "description"));
    }

    public Object setFamilyName(RuntimeEnv env, Object... args) {
        Object familyName = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "familyName", familyName);

        return null;
    }

    public Object getFamilyName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "familyName"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "kind"));
    }

    public Object setDateCreated(RuntimeEnv env, Object... args) {
        Object dateCreated = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "dateCreated", dateCreated);

        return null;
    }

    public Object getDateCreated(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "dateCreated"));
    }

    public Object setPostalCode(RuntimeEnv env, Object... args) {
        Object postalCode = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "postalCode", postalCode);

        return null;
    }

    public Object getPostalCode(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "postalCode"));
    }

    public Object setAttendeeCount(RuntimeEnv env, Object... args) {
        Object attendeeCount = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "attendeeCount", attendeeCount);

        return null;
    }

    public Object getAttendeeCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "attendeeCount"));
    }

    public Object setInAlbum(RuntimeEnv env, Object... args) {
        Object inAlbum = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "inAlbum", inAlbum);

        return null;
    }

    public Object getInAlbum(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "inAlbum"));
    }

    public Object setAddressRegion(RuntimeEnv env, Object... args) {
        Object addressRegion = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "addressRegion", addressRegion);

        return null;
    }

    public Object getAddressRegion(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "addressRegion"));
    }

    public Object setHeight(RuntimeEnv env, Object... args) {
        Object height = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "height", height);

        return null;
    }

    public Object getHeight(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "height"));
    }

    public Object setGeo(RuntimeEnv env, Object... args) {
        Object geo = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "geo", geo);

        return null;
    }

    public Object getGeo(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "geo"));
    }

    public Object setEmbedUrl(RuntimeEnv env, Object... args) {
        Object embedUrl = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "embedUrl", embedUrl);

        return null;
    }

    public Object getEmbedUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "embedUrl"));
    }

    public Object setTickerSymbol(RuntimeEnv env, Object... args) {
        Object tickerSymbol = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "tickerSymbol", tickerSymbol);

        return null;
    }

    public Object getTickerSymbol(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "tickerSymbol"));
    }

    public Object setPlayerType(RuntimeEnv env, Object... args) {
        Object playerType = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "playerType", playerType);

        return null;
    }

    public Object getPlayerType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "playerType"));
    }

    public Object setAbout(RuntimeEnv env, Object... args) {
        Object about = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "about", about);

        return null;
    }

    public Object getAbout(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "about"));
    }

    public Object setGivenName(RuntimeEnv env, Object... args) {
        Object givenName = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "givenName", givenName);

        return null;
    }

    public Object getGivenName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "givenName"));
    }

    public Object setName(RuntimeEnv env, Object... args) {
        Object name = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "name", name);

        return null;
    }

    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "name"));
    }

    public Object setPerformers(RuntimeEnv env, Object... args) {
        Object performers = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_ItemScope.class,
                performers,
                "Google_ItemScope",
                "setPerformers");
        ZVal.setProperty(this, Google_ItemScope.class, "performers", performers);

        return null;
    }

    public Object getPerformers(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "performers"));
    }

    public Object setUrl(RuntimeEnv env, Object... args) {
        Object url = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "url", url);

        return null;
    }

    public Object getUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "url"));
    }

    public Object setGender(RuntimeEnv env, Object... args) {
        Object gender = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "gender", gender);

        return null;
    }

    public Object getGender(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "gender"));
    }

    public Object setLongitude(RuntimeEnv env, Object... args) {
        Object longitude = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "longitude", longitude);

        return null;
    }

    public Object getLongitude(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "longitude"));
    }

    public Object setThumbnail(RuntimeEnv env, Object... args) {
        Object thumbnail = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "thumbnail", thumbnail);

        return null;
    }

    public Object getThumbnail(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "thumbnail"));
    }

    public Object setCaption(RuntimeEnv env, Object... args) {
        Object caption = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "caption", caption);

        return null;
    }

    public Object getCaption(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "caption"));
    }

    public Object setRatingValue(RuntimeEnv env, Object... args) {
        Object ratingValue = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "ratingValue", ratingValue);

        return null;
    }

    public Object getRatingValue(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "ratingValue"));
    }

    public Object setReviewRating(RuntimeEnv env, Object... args) {
        Object reviewRating = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "reviewRating", reviewRating);

        return null;
    }

    public Object getReviewRating(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "reviewRating"));
    }

    public Object setAudio(RuntimeEnv env, Object... args) {
        Object audio = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_ItemScope.class, "audio", audio);

        return null;
    }

    public Object getAudio(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_ItemScope.class, "audio"));
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
