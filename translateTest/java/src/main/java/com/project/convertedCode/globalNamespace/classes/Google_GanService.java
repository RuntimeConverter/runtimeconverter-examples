package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Google_LinksServiceResource;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.classes.Google_Service;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.classes.Google_EventsServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_PublishersServiceResource;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.classes.Google_CcOffersServiceResource;
import com.project.convertedCode.globalNamespace.classes.Google_AdvertisersServiceResource;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_GanService.php

*/

public class Google_GanService extends Google_Service implements RuntimeFileContextInterface {

    public Object advertisers = null;

    public Object ccOffers = null;

    public Object events = null;

    public Object links = null;

    public Object publishers = null;

    public Google_GanService(RuntimeEnv env, Object... args) {
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
            case "advertisers":
                return this.advertisers;
            case "ccOffers":
                return this.ccOffers;
            case "events":
                return this.events;
            case "links":
                return this.links;
            case "publishers":
                return this.publishers;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "advertisers":
                return ZVal.isNull(this.advertisers);
            case "ccOffers":
                return ZVal.isNull(this.ccOffers);
            case "events":
                return ZVal.isNull(this.events);
            case "links":
                return ZVal.isNull(this.links);
            case "publishers":
                return ZVal.isNull(this.publishers);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "advertisers":
                this.advertisers = value;
                break;
            case "ccOffers":
                this.ccOffers = value;
                break;
            case "events":
                this.events = value;
                break;
            case "links":
                this.links = value;
                break;
            case "publishers":
                this.publishers = value;
                break;
        }
        super.__set(key, value, caller);
    }

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object client = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_GanService.class, "servicePath", "gan/v1beta1/");
        ZVal.setProperty(this, Google_GanService.class, "version", "v1beta1");
        ZVal.setProperty(this, Google_GanService.class, "serviceName", "gan");
        env.callMethod(
                client,
                "addService",
                Google_GanService.class,
                ZVal.getProperty(this, Google_GanService.class, "serviceName"),
                ZVal.getProperty(this, Google_GanService.class, "version"));
        ZVal.setProperty(
                this,
                Google_GanService.class,
                "advertisers",
                new Google_AdvertisersServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_GanService.class, "serviceName"),
                        "advertisers",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/gan\", \"https://www.googleapis.com/auth/gan.readonly\"], \"parameters\": {\"relationshipStatus\": {\"enum\": [\"approved\", \"available\", \"deactivated\", \"declined\", \"pending\"], \"type\": \"string\", \"location\": \"query\"}, \"minSevenDayEpc\": {\"type\": \"number\", \"location\": \"query\", \"format\": \"double\"}, \"advertiserCategory\": {\"type\": \"string\", \"location\": \"query\"}, \"minNinetyDayEpc\": {\"type\": \"number\", \"location\": \"query\", \"format\": \"double\"}, \"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"role\": {\"required\": true, \"type\": \"string\", \"location\": \"path\", \"enum\": [\"advertisers\", \"publishers\"]}, \"maxResults\": {\"location\": \"query\", \"minimum\": \"0\", \"type\": \"integer\", \"maximum\": \"100\", \"format\": \"uint32\"}, \"roleId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"minPayoutRank\": {\"location\": \"query\", \"minimum\": \"1\", \"type\": \"integer\", \"maximum\": \"4\", \"format\": \"int32\"}}, \"id\": \"gan.advertisers.list\", \"httpMethod\": \"GET\", \"path\": \"{role}/{roleId}/advertisers\", \"response\": {\"$ref\": \"Advertisers\"}}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/gan\", \"https://www.googleapis.com/auth/gan.readonly\"], \"parameters\": {\"advertiserId\": {\"type\": \"string\", \"location\": \"query\"}, \"roleId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"role\": {\"required\": true, \"type\": \"string\", \"location\": \"path\", \"enum\": [\"advertisers\", \"publishers\"]}}, \"id\": \"gan.advertisers.get\", \"httpMethod\": \"GET\", \"path\": \"{role}/{roleId}/advertiser\", \"response\": {\"$ref\": \"Advertiser\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_GanService.class,
                "ccOffers",
                new Google_CcOffersServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_GanService.class, "serviceName"),
                        "ccOffers",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/gan\", \"https://www.googleapis.com/auth/gan.readonly\"], \"parameters\": {\"advertiser\": {\"repeated\": true, \"type\": \"string\", \"location\": \"query\"}, \"projection\": {\"enum\": [\"full\", \"summary\"], \"type\": \"string\", \"location\": \"query\"}, \"publisher\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"gan.ccOffers.list\", \"httpMethod\": \"GET\", \"path\": \"publishers/{publisher}/ccOffers\", \"response\": {\"$ref\": \"CcOffers\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_GanService.class,
                "events",
                new Google_EventsServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_GanService.class, "serviceName"),
                        "events",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/gan\", \"https://www.googleapis.com/auth/gan.readonly\"], \"parameters\": {\"orderId\": {\"type\": \"string\", \"location\": \"query\"}, \"sku\": {\"type\": \"string\", \"location\": \"query\"}, \"eventDateMax\": {\"type\": \"string\", \"location\": \"query\"}, \"type\": {\"enum\": [\"action\", \"charge\", \"transaction\"], \"type\": \"string\", \"location\": \"query\"}, \"roleId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"linkId\": {\"type\": \"string\", \"location\": \"query\"}, \"status\": {\"enum\": [\"active\", \"canceled\"], \"type\": \"string\", \"location\": \"query\"}, \"eventDateMin\": {\"type\": \"string\", \"location\": \"query\"}, \"memberId\": {\"type\": \"string\", \"location\": \"query\"}, \"maxResults\": {\"location\": \"query\", \"minimum\": \"0\", \"type\": \"integer\", \"maximum\": \"100\", \"format\": \"uint32\"}, \"advertiserId\": {\"type\": \"string\", \"location\": \"query\"}, \"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"role\": {\"required\": true, \"type\": \"string\", \"location\": \"path\", \"enum\": [\"advertisers\", \"publishers\"]}, \"productCategory\": {\"type\": \"string\", \"location\": \"query\"}, \"chargeType\": {\"enum\": [\"credit\", \"debit\", \"monthly_minimum\", \"other\", \"slotting_fee\", \"tier_bonus\"], \"type\": \"string\", \"location\": \"query\"}, \"modifyDateMin\": {\"type\": \"string\", \"location\": \"query\"}, \"modifyDateMax\": {\"type\": \"string\", \"location\": \"query\"}, \"publisherId\": {\"type\": \"string\", \"location\": \"query\"}}, \"id\": \"gan.events.list\", \"httpMethod\": \"GET\", \"path\": \"{role}/{roleId}/events\", \"response\": {\"$ref\": \"Events\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_GanService.class,
                "links",
                new Google_LinksServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_GanService.class, "serviceName"),
                        "links",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"insert\": {\"scopes\": [\"https://www.googleapis.com/auth/gan\"], \"parameters\": {\"roleId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"role\": {\"required\": true, \"type\": \"string\", \"location\": \"path\", \"enum\": [\"advertisers\", \"publishers\"]}}, \"request\": {\"$ref\": \"Link\"}, \"response\": {\"$ref\": \"Link\"}, \"httpMethod\": \"POST\", \"path\": \"{role}/{roleId}/link\", \"id\": \"gan.links.insert\"}, \"list\": {\"scopes\": [\"https://www.googleapis.com/auth/gan\", \"https://www.googleapis.com/auth/gan.readonly\"], \"parameters\": {\"linkType\": {\"enum\": [\"banner\", \"text\"], \"type\": \"string\", \"location\": \"query\"}, \"startDateMin\": {\"type\": \"string\", \"location\": \"query\"}, \"assetSize\": {\"repeated\": true, \"type\": \"string\", \"location\": \"query\"}, \"roleId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"relationshipStatus\": {\"enum\": [\"approved\", \"available\"], \"type\": \"string\", \"location\": \"query\"}, \"maxResults\": {\"location\": \"query\", \"minimum\": \"0\", \"type\": \"integer\", \"maximum\": \"100\", \"format\": \"uint32\"}, \"advertiserCategory\": {\"repeated\": true, \"enum\": [\"apparel_accessories\", \"appliances_electronics\", \"auto_dealer\", \"automotive\", \"babies_kids\", \"blogs_personal_sites\", \"books_magazines\", \"computers\", \"dating\", \"department_stores\", \"education\", \"employment\", \"financial_credit_cards\", \"financial_other\", \"flowers_gifts\", \"grocery\", \"health_beauty\", \"home_garden\", \"hosting_domain\", \"internet_providers\", \"legal\", \"media_entertainment\", \"medical\", \"movies_games\", \"music\", \"nonprofit\", \"office_supplies\", \"online_games\", \"outdoor\", \"pets\", \"real_estate\", \"restaurants\", \"sport_fitness\", \"telecom\", \"ticketing\", \"toys_hobbies\", \"travel\", \"utilities\", \"wholesale_relationship\", \"wine_spirits\"], \"type\": \"string\", \"location\": \"query\"}, \"advertiserId\": {\"repeated\": true, \"type\": \"string\", \"location\": \"query\", \"format\": \"int64\"}, \"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"role\": {\"required\": true, \"type\": \"string\", \"location\": \"path\", \"enum\": [\"advertisers\", \"publishers\"]}, \"startDateMax\": {\"type\": \"string\", \"location\": \"query\"}, \"promotionType\": {\"repeated\": true, \"enum\": [\"buy_get\", \"coupon\", \"free_gift\", \"free_gift_wrap\", \"free_shipping\", \"none\", \"ongoing\", \"percent_off\", \"price_cut\", \"product_promotion\", \"sale\", \"sweepstakes\"], \"type\": \"string\", \"location\": \"query\"}, \"authorship\": {\"enum\": [\"advertiser\", \"publisher\"], \"type\": \"string\", \"location\": \"query\"}}, \"id\": \"gan.links.list\", \"httpMethod\": \"GET\", \"path\": \"{role}/{roleId}/links\", \"response\": {\"$ref\": \"Links\"}}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/gan\", \"https://www.googleapis.com/auth/gan.readonly\"], \"parameters\": {\"linkId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\", \"format\": \"int64\"}, \"role\": {\"required\": true, \"type\": \"string\", \"location\": \"path\", \"enum\": [\"advertisers\", \"publishers\"]}, \"roleId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"gan.links.get\", \"httpMethod\": \"GET\", \"path\": \"{role}/{roleId}/link/{linkId}\", \"response\": {\"$ref\": \"Link\"}}}}",
                                true)));
        ZVal.setProperty(
                this,
                Google_GanService.class,
                "publishers",
                new Google_PublishersServiceResource(
                        env,
                        this,
                        ZVal.getProperty(this, Google_GanService.class, "serviceName"),
                        "publishers",
                        NamespaceGlobal.json_decode.call(
                                env,
                                "{\"methods\": {\"list\": {\"scopes\": [\"https://www.googleapis.com/auth/gan\", \"https://www.googleapis.com/auth/gan.readonly\"], \"parameters\": {\"publisherCategory\": {\"type\": \"string\", \"location\": \"query\"}, \"relationshipStatus\": {\"enum\": [\"approved\", \"available\", \"deactivated\", \"declined\", \"pending\"], \"type\": \"string\", \"location\": \"query\"}, \"minSevenDayEpc\": {\"type\": \"number\", \"location\": \"query\", \"format\": \"double\"}, \"minNinetyDayEpc\": {\"type\": \"number\", \"location\": \"query\", \"format\": \"double\"}, \"pageToken\": {\"type\": \"string\", \"location\": \"query\"}, \"role\": {\"required\": true, \"type\": \"string\", \"location\": \"path\", \"enum\": [\"advertisers\", \"publishers\"]}, \"maxResults\": {\"location\": \"query\", \"minimum\": \"0\", \"type\": \"integer\", \"maximum\": \"100\", \"format\": \"uint32\"}, \"roleId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}, \"minPayoutRank\": {\"location\": \"query\", \"minimum\": \"1\", \"type\": \"integer\", \"maximum\": \"4\", \"format\": \"int32\"}}, \"id\": \"gan.publishers.list\", \"httpMethod\": \"GET\", \"path\": \"{role}/{roleId}/publishers\", \"response\": {\"$ref\": \"Publishers\"}}, \"get\": {\"scopes\": [\"https://www.googleapis.com/auth/gan\", \"https://www.googleapis.com/auth/gan.readonly\"], \"parameters\": {\"role\": {\"required\": true, \"type\": \"string\", \"location\": \"path\", \"enum\": [\"advertisers\", \"publishers\"]}, \"publisherId\": {\"type\": \"string\", \"location\": \"query\"}, \"roleId\": {\"required\": true, \"type\": \"string\", \"location\": \"path\"}}, \"id\": \"gan.publishers.get\", \"httpMethod\": \"GET\", \"path\": \"{role}/{roleId}/publisher\", \"response\": {\"$ref\": \"Publisher\"}}}}",
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
