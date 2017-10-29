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

 google-api-php-client/src/contrib/Google_GanService.php

*/

public class Google_CcOffer extends Google_Model implements RuntimeFileContextInterface {

    public Object luggageInsurance = null;

    public Object creditLimitMin = null;

    public Object cardName = null;

    public Object creditLimitMax = null;

    public Object gracePeriodDisplay = null;

    public Object offerId = null;

    public Object rewardUnit = null;

    public Object minPurchaseRate = null;

    public Object cardBenefits = null;

    public Object __rewardsType = "Google_CcOfferRewards";

    public Object __rewardsDataType = "array";

    public Object rewards = null;

    public Object offersImmediateCashReward = null;

    public Object travelInsurance = null;

    public Object returnedPaymentFee = null;

    public Object kind = null;

    public Object issuer = null;

    public Object maxPurchaseRate = null;

    public Object minimumFinanceCharge = null;

    public Object existingCustomerOnly = null;

    public Object annualFeeDisplay = null;

    public Object initialSetupAndProcessingFee = null;

    public Object issuerId = null;

    public Object purchaseRateAdditionalDetails = null;

    public Object prohibitedCategories = null;

    public Object fraudLiability = null;

    public Object cashAdvanceTerms = null;

    public Object landingPageUrl = null;

    public Object introCashAdvanceTerms = null;

    public Object rewardsExpire = null;

    public Object introPurchaseTerms = null;

    public Object __defaultFeesType = "Google_CcOfferDefaultFees";

    public Object __defaultFeesDataType = "array";

    public Object defaultFees = null;

    public Object extendedWarranty = null;

    public Object emergencyInsurance = null;

    public Object firstYearAnnualFee = null;

    public Object trackingUrl = null;

    public Object latePaymentFee = null;

    public Object overLimitFee = null;

    public Object cardType = null;

    public Object approvedCategories = null;

    public Object rewardPartner = null;

    public Object introBalanceTransferTerms = null;

    public Object foreignCurrencyTransactionFee = null;

    public Object annualFee = null;

    public Object issuerWebsite = null;

    public Object variableRatesUpdateFrequency = null;

    public Object carRentalInsurance = null;

    public Object additionalCardBenefits = null;

    public Object ageMinimum = null;

    public Object balanceComputationMethod = null;

    public Object aprDisplay = null;

    public Object additionalCardHolderFee = null;

    public Object variableRatesLastUpdated = null;

    public Object network = null;

    public Object purchaseRateType = null;

    public Object statementCopyFee = null;

    public Object rewardsHaveBlackoutDates = null;

    public Object creditRatingDisplay = null;

    public Object flightAccidentInsurance = null;

    public Object annualRewardMaximum = null;

    public Object balanceTransferTerms = null;

    public Object __bonusRewardsType = "Google_CcOfferBonusRewards";

    public Object __bonusRewardsDataType = "array";

    public Object bonusRewards = null;

    public Object imageUrl = null;

    public Object ageMinimumDetails = null;

    public Object disclaimer = null;

    public Google_CcOffer(RuntimeEnv env, Object... args) {
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
            case "setLuggageInsurance":
                return this.setLuggageInsurance(env, args);
            case "getLuggageInsurance":
                return this.getLuggageInsurance(env, args);
            case "setCreditLimitMin":
                return this.setCreditLimitMin(env, args);
            case "getCreditLimitMin":
                return this.getCreditLimitMin(env, args);
            case "setCardName":
                return this.setCardName(env, args);
            case "getCardName":
                return this.getCardName(env, args);
            case "setCreditLimitMax":
                return this.setCreditLimitMax(env, args);
            case "getCreditLimitMax":
                return this.getCreditLimitMax(env, args);
            case "setGracePeriodDisplay":
                return this.setGracePeriodDisplay(env, args);
            case "getGracePeriodDisplay":
                return this.getGracePeriodDisplay(env, args);
            case "setOfferId":
                return this.setOfferId(env, args);
            case "getOfferId":
                return this.getOfferId(env, args);
            case "setRewardUnit":
                return this.setRewardUnit(env, args);
            case "getRewardUnit":
                return this.getRewardUnit(env, args);
            case "setMinPurchaseRate":
                return this.setMinPurchaseRate(env, args);
            case "getMinPurchaseRate":
                return this.getMinPurchaseRate(env, args);
            case "setCardBenefits":
                return this.setCardBenefits(env, args);
            case "getCardBenefits":
                return this.getCardBenefits(env, args);
            case "setRewards":
                return this.setRewards(env, args);
            case "getRewards":
                return this.getRewards(env, args);
            case "setOffersImmediateCashReward":
                return this.setOffersImmediateCashReward(env, args);
            case "getOffersImmediateCashReward":
                return this.getOffersImmediateCashReward(env, args);
            case "setTravelInsurance":
                return this.setTravelInsurance(env, args);
            case "getTravelInsurance":
                return this.getTravelInsurance(env, args);
            case "setReturnedPaymentFee":
                return this.setReturnedPaymentFee(env, args);
            case "getReturnedPaymentFee":
                return this.getReturnedPaymentFee(env, args);
            case "setKind":
                return this.setKind(env, args);
            case "getKind":
                return this.getKind(env, args);
            case "setIssuer":
                return this.setIssuer(env, args);
            case "getIssuer":
                return this.getIssuer(env, args);
            case "setMaxPurchaseRate":
                return this.setMaxPurchaseRate(env, args);
            case "getMaxPurchaseRate":
                return this.getMaxPurchaseRate(env, args);
            case "setMinimumFinanceCharge":
                return this.setMinimumFinanceCharge(env, args);
            case "getMinimumFinanceCharge":
                return this.getMinimumFinanceCharge(env, args);
            case "setExistingCustomerOnly":
                return this.setExistingCustomerOnly(env, args);
            case "getExistingCustomerOnly":
                return this.getExistingCustomerOnly(env, args);
            case "setAnnualFeeDisplay":
                return this.setAnnualFeeDisplay(env, args);
            case "getAnnualFeeDisplay":
                return this.getAnnualFeeDisplay(env, args);
            case "setInitialSetupAndProcessingFee":
                return this.setInitialSetupAndProcessingFee(env, args);
            case "getInitialSetupAndProcessingFee":
                return this.getInitialSetupAndProcessingFee(env, args);
            case "setIssuerId":
                return this.setIssuerId(env, args);
            case "getIssuerId":
                return this.getIssuerId(env, args);
            case "setPurchaseRateAdditionalDetails":
                return this.setPurchaseRateAdditionalDetails(env, args);
            case "getPurchaseRateAdditionalDetails":
                return this.getPurchaseRateAdditionalDetails(env, args);
            case "setProhibitedCategories":
                return this.setProhibitedCategories(env, args);
            case "getProhibitedCategories":
                return this.getProhibitedCategories(env, args);
            case "setFraudLiability":
                return this.setFraudLiability(env, args);
            case "getFraudLiability":
                return this.getFraudLiability(env, args);
            case "setCashAdvanceTerms":
                return this.setCashAdvanceTerms(env, args);
            case "getCashAdvanceTerms":
                return this.getCashAdvanceTerms(env, args);
            case "setLandingPageUrl":
                return this.setLandingPageUrl(env, args);
            case "getLandingPageUrl":
                return this.getLandingPageUrl(env, args);
            case "setIntroCashAdvanceTerms":
                return this.setIntroCashAdvanceTerms(env, args);
            case "getIntroCashAdvanceTerms":
                return this.getIntroCashAdvanceTerms(env, args);
            case "setRewardsExpire":
                return this.setRewardsExpire(env, args);
            case "getRewardsExpire":
                return this.getRewardsExpire(env, args);
            case "setIntroPurchaseTerms":
                return this.setIntroPurchaseTerms(env, args);
            case "getIntroPurchaseTerms":
                return this.getIntroPurchaseTerms(env, args);
            case "setDefaultFees":
                return this.setDefaultFees(env, args);
            case "getDefaultFees":
                return this.getDefaultFees(env, args);
            case "setExtendedWarranty":
                return this.setExtendedWarranty(env, args);
            case "getExtendedWarranty":
                return this.getExtendedWarranty(env, args);
            case "setEmergencyInsurance":
                return this.setEmergencyInsurance(env, args);
            case "getEmergencyInsurance":
                return this.getEmergencyInsurance(env, args);
            case "setFirstYearAnnualFee":
                return this.setFirstYearAnnualFee(env, args);
            case "getFirstYearAnnualFee":
                return this.getFirstYearAnnualFee(env, args);
            case "setTrackingUrl":
                return this.setTrackingUrl(env, args);
            case "getTrackingUrl":
                return this.getTrackingUrl(env, args);
            case "setLatePaymentFee":
                return this.setLatePaymentFee(env, args);
            case "getLatePaymentFee":
                return this.getLatePaymentFee(env, args);
            case "setOverLimitFee":
                return this.setOverLimitFee(env, args);
            case "getOverLimitFee":
                return this.getOverLimitFee(env, args);
            case "setCardType":
                return this.setCardType(env, args);
            case "getCardType":
                return this.getCardType(env, args);
            case "setApprovedCategories":
                return this.setApprovedCategories(env, args);
            case "getApprovedCategories":
                return this.getApprovedCategories(env, args);
            case "setRewardPartner":
                return this.setRewardPartner(env, args);
            case "getRewardPartner":
                return this.getRewardPartner(env, args);
            case "setIntroBalanceTransferTerms":
                return this.setIntroBalanceTransferTerms(env, args);
            case "getIntroBalanceTransferTerms":
                return this.getIntroBalanceTransferTerms(env, args);
            case "setForeignCurrencyTransactionFee":
                return this.setForeignCurrencyTransactionFee(env, args);
            case "getForeignCurrencyTransactionFee":
                return this.getForeignCurrencyTransactionFee(env, args);
            case "setAnnualFee":
                return this.setAnnualFee(env, args);
            case "getAnnualFee":
                return this.getAnnualFee(env, args);
            case "setIssuerWebsite":
                return this.setIssuerWebsite(env, args);
            case "getIssuerWebsite":
                return this.getIssuerWebsite(env, args);
            case "setVariableRatesUpdateFrequency":
                return this.setVariableRatesUpdateFrequency(env, args);
            case "getVariableRatesUpdateFrequency":
                return this.getVariableRatesUpdateFrequency(env, args);
            case "setCarRentalInsurance":
                return this.setCarRentalInsurance(env, args);
            case "getCarRentalInsurance":
                return this.getCarRentalInsurance(env, args);
            case "setAdditionalCardBenefits":
                return this.setAdditionalCardBenefits(env, args);
            case "getAdditionalCardBenefits":
                return this.getAdditionalCardBenefits(env, args);
            case "setAgeMinimum":
                return this.setAgeMinimum(env, args);
            case "getAgeMinimum":
                return this.getAgeMinimum(env, args);
            case "setBalanceComputationMethod":
                return this.setBalanceComputationMethod(env, args);
            case "getBalanceComputationMethod":
                return this.getBalanceComputationMethod(env, args);
            case "setAprDisplay":
                return this.setAprDisplay(env, args);
            case "getAprDisplay":
                return this.getAprDisplay(env, args);
            case "setAdditionalCardHolderFee":
                return this.setAdditionalCardHolderFee(env, args);
            case "getAdditionalCardHolderFee":
                return this.getAdditionalCardHolderFee(env, args);
            case "setVariableRatesLastUpdated":
                return this.setVariableRatesLastUpdated(env, args);
            case "getVariableRatesLastUpdated":
                return this.getVariableRatesLastUpdated(env, args);
            case "setNetwork":
                return this.setNetwork(env, args);
            case "getNetwork":
                return this.getNetwork(env, args);
            case "setPurchaseRateType":
                return this.setPurchaseRateType(env, args);
            case "getPurchaseRateType":
                return this.getPurchaseRateType(env, args);
            case "setStatementCopyFee":
                return this.setStatementCopyFee(env, args);
            case "getStatementCopyFee":
                return this.getStatementCopyFee(env, args);
            case "setRewardsHaveBlackoutDates":
                return this.setRewardsHaveBlackoutDates(env, args);
            case "getRewardsHaveBlackoutDates":
                return this.getRewardsHaveBlackoutDates(env, args);
            case "setCreditRatingDisplay":
                return this.setCreditRatingDisplay(env, args);
            case "getCreditRatingDisplay":
                return this.getCreditRatingDisplay(env, args);
            case "setFlightAccidentInsurance":
                return this.setFlightAccidentInsurance(env, args);
            case "getFlightAccidentInsurance":
                return this.getFlightAccidentInsurance(env, args);
            case "setAnnualRewardMaximum":
                return this.setAnnualRewardMaximum(env, args);
            case "getAnnualRewardMaximum":
                return this.getAnnualRewardMaximum(env, args);
            case "setBalanceTransferTerms":
                return this.setBalanceTransferTerms(env, args);
            case "getBalanceTransferTerms":
                return this.getBalanceTransferTerms(env, args);
            case "setBonusRewards":
                return this.setBonusRewards(env, args);
            case "getBonusRewards":
                return this.getBonusRewards(env, args);
            case "setImageUrl":
                return this.setImageUrl(env, args);
            case "getImageUrl":
                return this.getImageUrl(env, args);
            case "setAgeMinimumDetails":
                return this.setAgeMinimumDetails(env, args);
            case "getAgeMinimumDetails":
                return this.getAgeMinimumDetails(env, args);
            case "setDisclaimer":
                return this.setDisclaimer(env, args);
            case "getDisclaimer":
                return this.getDisclaimer(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "luggageInsurance":
                return this.luggageInsurance;
            case "creditLimitMin":
                return this.creditLimitMin;
            case "cardName":
                return this.cardName;
            case "creditLimitMax":
                return this.creditLimitMax;
            case "gracePeriodDisplay":
                return this.gracePeriodDisplay;
            case "offerId":
                return this.offerId;
            case "rewardUnit":
                return this.rewardUnit;
            case "minPurchaseRate":
                return this.minPurchaseRate;
            case "cardBenefits":
                return this.cardBenefits;
            case "__rewardsType":
                if (Google_CcOffer.class.isAssignableFrom(caller)) {

                    return this.__rewardsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__rewardsDataType":
                if (Google_CcOffer.class.isAssignableFrom(caller)) {

                    return this.__rewardsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "rewards":
                return this.rewards;
            case "offersImmediateCashReward":
                return this.offersImmediateCashReward;
            case "travelInsurance":
                return this.travelInsurance;
            case "returnedPaymentFee":
                return this.returnedPaymentFee;
            case "kind":
                return this.kind;
            case "issuer":
                return this.issuer;
            case "maxPurchaseRate":
                return this.maxPurchaseRate;
            case "minimumFinanceCharge":
                return this.minimumFinanceCharge;
            case "existingCustomerOnly":
                return this.existingCustomerOnly;
            case "annualFeeDisplay":
                return this.annualFeeDisplay;
            case "initialSetupAndProcessingFee":
                return this.initialSetupAndProcessingFee;
            case "issuerId":
                return this.issuerId;
            case "purchaseRateAdditionalDetails":
                return this.purchaseRateAdditionalDetails;
            case "prohibitedCategories":
                return this.prohibitedCategories;
            case "fraudLiability":
                return this.fraudLiability;
            case "cashAdvanceTerms":
                return this.cashAdvanceTerms;
            case "landingPageUrl":
                return this.landingPageUrl;
            case "introCashAdvanceTerms":
                return this.introCashAdvanceTerms;
            case "rewardsExpire":
                return this.rewardsExpire;
            case "introPurchaseTerms":
                return this.introPurchaseTerms;
            case "__defaultFeesType":
                if (Google_CcOffer.class.isAssignableFrom(caller)) {

                    return this.__defaultFeesType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__defaultFeesDataType":
                if (Google_CcOffer.class.isAssignableFrom(caller)) {

                    return this.__defaultFeesDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "defaultFees":
                return this.defaultFees;
            case "extendedWarranty":
                return this.extendedWarranty;
            case "emergencyInsurance":
                return this.emergencyInsurance;
            case "firstYearAnnualFee":
                return this.firstYearAnnualFee;
            case "trackingUrl":
                return this.trackingUrl;
            case "latePaymentFee":
                return this.latePaymentFee;
            case "overLimitFee":
                return this.overLimitFee;
            case "cardType":
                return this.cardType;
            case "approvedCategories":
                return this.approvedCategories;
            case "rewardPartner":
                return this.rewardPartner;
            case "introBalanceTransferTerms":
                return this.introBalanceTransferTerms;
            case "foreignCurrencyTransactionFee":
                return this.foreignCurrencyTransactionFee;
            case "annualFee":
                return this.annualFee;
            case "issuerWebsite":
                return this.issuerWebsite;
            case "variableRatesUpdateFrequency":
                return this.variableRatesUpdateFrequency;
            case "carRentalInsurance":
                return this.carRentalInsurance;
            case "additionalCardBenefits":
                return this.additionalCardBenefits;
            case "ageMinimum":
                return this.ageMinimum;
            case "balanceComputationMethod":
                return this.balanceComputationMethod;
            case "aprDisplay":
                return this.aprDisplay;
            case "additionalCardHolderFee":
                return this.additionalCardHolderFee;
            case "variableRatesLastUpdated":
                return this.variableRatesLastUpdated;
            case "network":
                return this.network;
            case "purchaseRateType":
                return this.purchaseRateType;
            case "statementCopyFee":
                return this.statementCopyFee;
            case "rewardsHaveBlackoutDates":
                return this.rewardsHaveBlackoutDates;
            case "creditRatingDisplay":
                return this.creditRatingDisplay;
            case "flightAccidentInsurance":
                return this.flightAccidentInsurance;
            case "annualRewardMaximum":
                return this.annualRewardMaximum;
            case "balanceTransferTerms":
                return this.balanceTransferTerms;
            case "__bonusRewardsType":
                if (Google_CcOffer.class.isAssignableFrom(caller)) {

                    return this.__bonusRewardsType;
                }
                return this.__phpMagicMethod__isset(key);
            case "__bonusRewardsDataType":
                if (Google_CcOffer.class.isAssignableFrom(caller)) {

                    return this.__bonusRewardsDataType;
                }
                return this.__phpMagicMethod__isset(key);
            case "bonusRewards":
                return this.bonusRewards;
            case "imageUrl":
                return this.imageUrl;
            case "ageMinimumDetails":
                return this.ageMinimumDetails;
            case "disclaimer":
                return this.disclaimer;
        }
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "luggageInsurance":
                return ZVal.isNull(this.luggageInsurance);
            case "creditLimitMin":
                return ZVal.isNull(this.creditLimitMin);
            case "cardName":
                return ZVal.isNull(this.cardName);
            case "creditLimitMax":
                return ZVal.isNull(this.creditLimitMax);
            case "gracePeriodDisplay":
                return ZVal.isNull(this.gracePeriodDisplay);
            case "offerId":
                return ZVal.isNull(this.offerId);
            case "rewardUnit":
                return ZVal.isNull(this.rewardUnit);
            case "minPurchaseRate":
                return ZVal.isNull(this.minPurchaseRate);
            case "cardBenefits":
                return ZVal.isNull(this.cardBenefits);
            case "__rewardsType":
                if (Google_CcOffer.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__rewardsType);
                }
                break;
            case "__rewardsDataType":
                if (Google_CcOffer.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__rewardsDataType);
                }
                break;
            case "rewards":
                return ZVal.isNull(this.rewards);
            case "offersImmediateCashReward":
                return ZVal.isNull(this.offersImmediateCashReward);
            case "travelInsurance":
                return ZVal.isNull(this.travelInsurance);
            case "returnedPaymentFee":
                return ZVal.isNull(this.returnedPaymentFee);
            case "kind":
                return ZVal.isNull(this.kind);
            case "issuer":
                return ZVal.isNull(this.issuer);
            case "maxPurchaseRate":
                return ZVal.isNull(this.maxPurchaseRate);
            case "minimumFinanceCharge":
                return ZVal.isNull(this.minimumFinanceCharge);
            case "existingCustomerOnly":
                return ZVal.isNull(this.existingCustomerOnly);
            case "annualFeeDisplay":
                return ZVal.isNull(this.annualFeeDisplay);
            case "initialSetupAndProcessingFee":
                return ZVal.isNull(this.initialSetupAndProcessingFee);
            case "issuerId":
                return ZVal.isNull(this.issuerId);
            case "purchaseRateAdditionalDetails":
                return ZVal.isNull(this.purchaseRateAdditionalDetails);
            case "prohibitedCategories":
                return ZVal.isNull(this.prohibitedCategories);
            case "fraudLiability":
                return ZVal.isNull(this.fraudLiability);
            case "cashAdvanceTerms":
                return ZVal.isNull(this.cashAdvanceTerms);
            case "landingPageUrl":
                return ZVal.isNull(this.landingPageUrl);
            case "introCashAdvanceTerms":
                return ZVal.isNull(this.introCashAdvanceTerms);
            case "rewardsExpire":
                return ZVal.isNull(this.rewardsExpire);
            case "introPurchaseTerms":
                return ZVal.isNull(this.introPurchaseTerms);
            case "__defaultFeesType":
                if (Google_CcOffer.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__defaultFeesType);
                }
                break;
            case "__defaultFeesDataType":
                if (Google_CcOffer.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__defaultFeesDataType);
                }
                break;
            case "defaultFees":
                return ZVal.isNull(this.defaultFees);
            case "extendedWarranty":
                return ZVal.isNull(this.extendedWarranty);
            case "emergencyInsurance":
                return ZVal.isNull(this.emergencyInsurance);
            case "firstYearAnnualFee":
                return ZVal.isNull(this.firstYearAnnualFee);
            case "trackingUrl":
                return ZVal.isNull(this.trackingUrl);
            case "latePaymentFee":
                return ZVal.isNull(this.latePaymentFee);
            case "overLimitFee":
                return ZVal.isNull(this.overLimitFee);
            case "cardType":
                return ZVal.isNull(this.cardType);
            case "approvedCategories":
                return ZVal.isNull(this.approvedCategories);
            case "rewardPartner":
                return ZVal.isNull(this.rewardPartner);
            case "introBalanceTransferTerms":
                return ZVal.isNull(this.introBalanceTransferTerms);
            case "foreignCurrencyTransactionFee":
                return ZVal.isNull(this.foreignCurrencyTransactionFee);
            case "annualFee":
                return ZVal.isNull(this.annualFee);
            case "issuerWebsite":
                return ZVal.isNull(this.issuerWebsite);
            case "variableRatesUpdateFrequency":
                return ZVal.isNull(this.variableRatesUpdateFrequency);
            case "carRentalInsurance":
                return ZVal.isNull(this.carRentalInsurance);
            case "additionalCardBenefits":
                return ZVal.isNull(this.additionalCardBenefits);
            case "ageMinimum":
                return ZVal.isNull(this.ageMinimum);
            case "balanceComputationMethod":
                return ZVal.isNull(this.balanceComputationMethod);
            case "aprDisplay":
                return ZVal.isNull(this.aprDisplay);
            case "additionalCardHolderFee":
                return ZVal.isNull(this.additionalCardHolderFee);
            case "variableRatesLastUpdated":
                return ZVal.isNull(this.variableRatesLastUpdated);
            case "network":
                return ZVal.isNull(this.network);
            case "purchaseRateType":
                return ZVal.isNull(this.purchaseRateType);
            case "statementCopyFee":
                return ZVal.isNull(this.statementCopyFee);
            case "rewardsHaveBlackoutDates":
                return ZVal.isNull(this.rewardsHaveBlackoutDates);
            case "creditRatingDisplay":
                return ZVal.isNull(this.creditRatingDisplay);
            case "flightAccidentInsurance":
                return ZVal.isNull(this.flightAccidentInsurance);
            case "annualRewardMaximum":
                return ZVal.isNull(this.annualRewardMaximum);
            case "balanceTransferTerms":
                return ZVal.isNull(this.balanceTransferTerms);
            case "__bonusRewardsType":
                if (Google_CcOffer.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__bonusRewardsType);
                }
                break;
            case "__bonusRewardsDataType":
                if (Google_CcOffer.class.isAssignableFrom(caller)) {

                    return ZVal.isNull(this.__bonusRewardsDataType);
                }
                break;
            case "bonusRewards":
                return ZVal.isNull(this.bonusRewards);
            case "imageUrl":
                return ZVal.isNull(this.imageUrl);
            case "ageMinimumDetails":
                return ZVal.isNull(this.ageMinimumDetails);
            case "disclaimer":
                return ZVal.isNull(this.disclaimer);
        }
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        key = ZVal.toString(key);
        switch ((String) key) {
            case "luggageInsurance":
                this.luggageInsurance = value;
                break;
            case "creditLimitMin":
                this.creditLimitMin = value;
                break;
            case "cardName":
                this.cardName = value;
                break;
            case "creditLimitMax":
                this.creditLimitMax = value;
                break;
            case "gracePeriodDisplay":
                this.gracePeriodDisplay = value;
                break;
            case "offerId":
                this.offerId = value;
                break;
            case "rewardUnit":
                this.rewardUnit = value;
                break;
            case "minPurchaseRate":
                this.minPurchaseRate = value;
                break;
            case "cardBenefits":
                this.cardBenefits = value;
                break;
            case "__rewardsType":
                if (Google_CcOffer.class.isAssignableFrom(caller)) {

                    this.__rewardsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__rewardsDataType":
                if (Google_CcOffer.class.isAssignableFrom(caller)) {

                    this.__rewardsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "rewards":
                this.rewards = value;
                break;
            case "offersImmediateCashReward":
                this.offersImmediateCashReward = value;
                break;
            case "travelInsurance":
                this.travelInsurance = value;
                break;
            case "returnedPaymentFee":
                this.returnedPaymentFee = value;
                break;
            case "kind":
                this.kind = value;
                break;
            case "issuer":
                this.issuer = value;
                break;
            case "maxPurchaseRate":
                this.maxPurchaseRate = value;
                break;
            case "minimumFinanceCharge":
                this.minimumFinanceCharge = value;
                break;
            case "existingCustomerOnly":
                this.existingCustomerOnly = value;
                break;
            case "annualFeeDisplay":
                this.annualFeeDisplay = value;
                break;
            case "initialSetupAndProcessingFee":
                this.initialSetupAndProcessingFee = value;
                break;
            case "issuerId":
                this.issuerId = value;
                break;
            case "purchaseRateAdditionalDetails":
                this.purchaseRateAdditionalDetails = value;
                break;
            case "prohibitedCategories":
                this.prohibitedCategories = value;
                break;
            case "fraudLiability":
                this.fraudLiability = value;
                break;
            case "cashAdvanceTerms":
                this.cashAdvanceTerms = value;
                break;
            case "landingPageUrl":
                this.landingPageUrl = value;
                break;
            case "introCashAdvanceTerms":
                this.introCashAdvanceTerms = value;
                break;
            case "rewardsExpire":
                this.rewardsExpire = value;
                break;
            case "introPurchaseTerms":
                this.introPurchaseTerms = value;
                break;
            case "__defaultFeesType":
                if (Google_CcOffer.class.isAssignableFrom(caller)) {

                    this.__defaultFeesType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__defaultFeesDataType":
                if (Google_CcOffer.class.isAssignableFrom(caller)) {

                    this.__defaultFeesDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "defaultFees":
                this.defaultFees = value;
                break;
            case "extendedWarranty":
                this.extendedWarranty = value;
                break;
            case "emergencyInsurance":
                this.emergencyInsurance = value;
                break;
            case "firstYearAnnualFee":
                this.firstYearAnnualFee = value;
                break;
            case "trackingUrl":
                this.trackingUrl = value;
                break;
            case "latePaymentFee":
                this.latePaymentFee = value;
                break;
            case "overLimitFee":
                this.overLimitFee = value;
                break;
            case "cardType":
                this.cardType = value;
                break;
            case "approvedCategories":
                this.approvedCategories = value;
                break;
            case "rewardPartner":
                this.rewardPartner = value;
                break;
            case "introBalanceTransferTerms":
                this.introBalanceTransferTerms = value;
                break;
            case "foreignCurrencyTransactionFee":
                this.foreignCurrencyTransactionFee = value;
                break;
            case "annualFee":
                this.annualFee = value;
                break;
            case "issuerWebsite":
                this.issuerWebsite = value;
                break;
            case "variableRatesUpdateFrequency":
                this.variableRatesUpdateFrequency = value;
                break;
            case "carRentalInsurance":
                this.carRentalInsurance = value;
                break;
            case "additionalCardBenefits":
                this.additionalCardBenefits = value;
                break;
            case "ageMinimum":
                this.ageMinimum = value;
                break;
            case "balanceComputationMethod":
                this.balanceComputationMethod = value;
                break;
            case "aprDisplay":
                this.aprDisplay = value;
                break;
            case "additionalCardHolderFee":
                this.additionalCardHolderFee = value;
                break;
            case "variableRatesLastUpdated":
                this.variableRatesLastUpdated = value;
                break;
            case "network":
                this.network = value;
                break;
            case "purchaseRateType":
                this.purchaseRateType = value;
                break;
            case "statementCopyFee":
                this.statementCopyFee = value;
                break;
            case "rewardsHaveBlackoutDates":
                this.rewardsHaveBlackoutDates = value;
                break;
            case "creditRatingDisplay":
                this.creditRatingDisplay = value;
                break;
            case "flightAccidentInsurance":
                this.flightAccidentInsurance = value;
                break;
            case "annualRewardMaximum":
                this.annualRewardMaximum = value;
                break;
            case "balanceTransferTerms":
                this.balanceTransferTerms = value;
                break;
            case "__bonusRewardsType":
                if (Google_CcOffer.class.isAssignableFrom(caller)) {

                    this.__bonusRewardsType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "__bonusRewardsDataType":
                if (Google_CcOffer.class.isAssignableFrom(caller)) {

                    this.__bonusRewardsDataType = value;
                    break;
                }
                this.__phpMagicMethod__set_internal(key, value);
                return;
            case "bonusRewards":
                this.bonusRewards = value;
                break;
            case "imageUrl":
                this.imageUrl = value;
                break;
            case "ageMinimumDetails":
                this.ageMinimumDetails = value;
                break;
            case "disclaimer":
                this.disclaimer = value;
                break;
        }
        super.__set(key, value, caller);
    }

    public Object setLuggageInsurance(RuntimeEnv env, Object... args) {
        Object luggageInsurance = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "luggageInsurance", luggageInsurance);

        return null;
    }

    public Object getLuggageInsurance(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "luggageInsurance"));
    }

    public Object setCreditLimitMin(RuntimeEnv env, Object... args) {
        Object creditLimitMin = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "creditLimitMin", creditLimitMin);

        return null;
    }

    public Object getCreditLimitMin(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "creditLimitMin"));
    }

    public Object setCardName(RuntimeEnv env, Object... args) {
        Object cardName = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "cardName", cardName);

        return null;
    }

    public Object getCardName(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "cardName"));
    }

    public Object setCreditLimitMax(RuntimeEnv env, Object... args) {
        Object creditLimitMax = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "creditLimitMax", creditLimitMax);

        return null;
    }

    public Object getCreditLimitMax(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "creditLimitMax"));
    }

    public Object setGracePeriodDisplay(RuntimeEnv env, Object... args) {
        Object gracePeriodDisplay = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "gracePeriodDisplay", gracePeriodDisplay);

        return null;
    }

    public Object getGracePeriodDisplay(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "gracePeriodDisplay"));
    }

    public Object setOfferId(RuntimeEnv env, Object... args) {
        Object offerId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "offerId", offerId);

        return null;
    }

    public Object getOfferId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "offerId"));
    }

    public Object setRewardUnit(RuntimeEnv env, Object... args) {
        Object rewardUnit = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "rewardUnit", rewardUnit);

        return null;
    }

    public Object getRewardUnit(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "rewardUnit"));
    }

    public Object setMinPurchaseRate(RuntimeEnv env, Object... args) {
        Object minPurchaseRate = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "minPurchaseRate", minPurchaseRate);

        return null;
    }

    public Object getMinPurchaseRate(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "minPurchaseRate"));
    }

    public Object setCardBenefits(RuntimeEnv env, Object... args) {
        Object cardBenefits = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "cardBenefits", cardBenefits);

        return null;
    }

    public Object getCardBenefits(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "cardBenefits"));
    }

    public Object setRewards(RuntimeEnv env, Object... args) {
        Object rewards = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_CcOffer.class,
                rewards,
                "Google_CcOfferRewards",
                "setRewards");
        ZVal.setProperty(this, Google_CcOffer.class, "rewards", rewards);

        return null;
    }

    public Object getRewards(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "rewards"));
    }

    public Object setOffersImmediateCashReward(RuntimeEnv env, Object... args) {
        Object offersImmediateCashReward = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_CcOffer.class, "offersImmediateCashReward", offersImmediateCashReward);

        return null;
    }

    public Object getOffersImmediateCashReward(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_CcOffer.class, "offersImmediateCashReward"));
    }

    public Object setTravelInsurance(RuntimeEnv env, Object... args) {
        Object travelInsurance = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "travelInsurance", travelInsurance);

        return null;
    }

    public Object getTravelInsurance(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "travelInsurance"));
    }

    public Object setReturnedPaymentFee(RuntimeEnv env, Object... args) {
        Object returnedPaymentFee = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "returnedPaymentFee", returnedPaymentFee);

        return null;
    }

    public Object getReturnedPaymentFee(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "returnedPaymentFee"));
    }

    public Object setKind(RuntimeEnv env, Object... args) {
        Object kind = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "kind", kind);

        return null;
    }

    public Object getKind(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "kind"));
    }

    public Object setIssuer(RuntimeEnv env, Object... args) {
        Object issuer = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "issuer", issuer);

        return null;
    }

    public Object getIssuer(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "issuer"));
    }

    public Object setMaxPurchaseRate(RuntimeEnv env, Object... args) {
        Object maxPurchaseRate = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "maxPurchaseRate", maxPurchaseRate);

        return null;
    }

    public Object getMaxPurchaseRate(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "maxPurchaseRate"));
    }

    public Object setMinimumFinanceCharge(RuntimeEnv env, Object... args) {
        Object minimumFinanceCharge = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "minimumFinanceCharge", minimumFinanceCharge);

        return null;
    }

    public Object getMinimumFinanceCharge(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "minimumFinanceCharge"));
    }

    public Object setExistingCustomerOnly(RuntimeEnv env, Object... args) {
        Object existingCustomerOnly = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "existingCustomerOnly", existingCustomerOnly);

        return null;
    }

    public Object getExistingCustomerOnly(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "existingCustomerOnly"));
    }

    public Object setAnnualFeeDisplay(RuntimeEnv env, Object... args) {
        Object annualFeeDisplay = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "annualFeeDisplay", annualFeeDisplay);

        return null;
    }

    public Object getAnnualFeeDisplay(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "annualFeeDisplay"));
    }

    public Object setInitialSetupAndProcessingFee(RuntimeEnv env, Object... args) {
        Object initialSetupAndProcessingFee = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_CcOffer.class,
                "initialSetupAndProcessingFee",
                initialSetupAndProcessingFee);

        return null;
    }

    public Object getInitialSetupAndProcessingFee(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_CcOffer.class, "initialSetupAndProcessingFee"));
    }

    public Object setIssuerId(RuntimeEnv env, Object... args) {
        Object issuerId = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "issuerId", issuerId);

        return null;
    }

    public Object getIssuerId(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "issuerId"));
    }

    public Object setPurchaseRateAdditionalDetails(RuntimeEnv env, Object... args) {
        Object purchaseRateAdditionalDetails = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_CcOffer.class,
                "purchaseRateAdditionalDetails",
                purchaseRateAdditionalDetails);

        return null;
    }

    public Object getPurchaseRateAdditionalDetails(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_CcOffer.class, "purchaseRateAdditionalDetails"));
    }

    public Object setProhibitedCategories(RuntimeEnv env, Object... args) {
        Object prohibitedCategories = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "prohibitedCategories", prohibitedCategories);

        return null;
    }

    public Object getProhibitedCategories(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "prohibitedCategories"));
    }

    public Object setFraudLiability(RuntimeEnv env, Object... args) {
        Object fraudLiability = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "fraudLiability", fraudLiability);

        return null;
    }

    public Object getFraudLiability(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "fraudLiability"));
    }

    public Object setCashAdvanceTerms(RuntimeEnv env, Object... args) {
        Object cashAdvanceTerms = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "cashAdvanceTerms", cashAdvanceTerms);

        return null;
    }

    public Object getCashAdvanceTerms(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "cashAdvanceTerms"));
    }

    public Object setLandingPageUrl(RuntimeEnv env, Object... args) {
        Object landingPageUrl = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "landingPageUrl", landingPageUrl);

        return null;
    }

    public Object getLandingPageUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "landingPageUrl"));
    }

    public Object setIntroCashAdvanceTerms(RuntimeEnv env, Object... args) {
        Object introCashAdvanceTerms = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_CcOffer.class, "introCashAdvanceTerms", introCashAdvanceTerms);

        return null;
    }

    public Object getIntroCashAdvanceTerms(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "introCashAdvanceTerms"));
    }

    public Object setRewardsExpire(RuntimeEnv env, Object... args) {
        Object rewardsExpire = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "rewardsExpire", rewardsExpire);

        return null;
    }

    public Object getRewardsExpire(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "rewardsExpire"));
    }

    public Object setIntroPurchaseTerms(RuntimeEnv env, Object... args) {
        Object introPurchaseTerms = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "introPurchaseTerms", introPurchaseTerms);

        return null;
    }

    public Object getIntroPurchaseTerms(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "introPurchaseTerms"));
    }

    public Object setDefaultFees(RuntimeEnv env, Object... args) {
        Object defaultFees = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_CcOffer.class,
                defaultFees,
                "Google_CcOfferDefaultFees",
                "setDefaultFees");
        ZVal.setProperty(this, Google_CcOffer.class, "defaultFees", defaultFees);

        return null;
    }

    public Object getDefaultFees(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "defaultFees"));
    }

    public Object setExtendedWarranty(RuntimeEnv env, Object... args) {
        Object extendedWarranty = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "extendedWarranty", extendedWarranty);

        return null;
    }

    public Object getExtendedWarranty(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "extendedWarranty"));
    }

    public Object setEmergencyInsurance(RuntimeEnv env, Object... args) {
        Object emergencyInsurance = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "emergencyInsurance", emergencyInsurance);

        return null;
    }

    public Object getEmergencyInsurance(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "emergencyInsurance"));
    }

    public Object setFirstYearAnnualFee(RuntimeEnv env, Object... args) {
        Object firstYearAnnualFee = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "firstYearAnnualFee", firstYearAnnualFee);

        return null;
    }

    public Object getFirstYearAnnualFee(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "firstYearAnnualFee"));
    }

    public Object setTrackingUrl(RuntimeEnv env, Object... args) {
        Object trackingUrl = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "trackingUrl", trackingUrl);

        return null;
    }

    public Object getTrackingUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "trackingUrl"));
    }

    public Object setLatePaymentFee(RuntimeEnv env, Object... args) {
        Object latePaymentFee = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "latePaymentFee", latePaymentFee);

        return null;
    }

    public Object getLatePaymentFee(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "latePaymentFee"));
    }

    public Object setOverLimitFee(RuntimeEnv env, Object... args) {
        Object overLimitFee = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "overLimitFee", overLimitFee);

        return null;
    }

    public Object getOverLimitFee(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "overLimitFee"));
    }

    public Object setCardType(RuntimeEnv env, Object... args) {
        Object cardType = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "cardType", cardType);

        return null;
    }

    public Object getCardType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "cardType"));
    }

    public Object setApprovedCategories(RuntimeEnv env, Object... args) {
        Object approvedCategories = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "approvedCategories", approvedCategories);

        return null;
    }

    public Object getApprovedCategories(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "approvedCategories"));
    }

    public Object setRewardPartner(RuntimeEnv env, Object... args) {
        Object rewardPartner = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "rewardPartner", rewardPartner);

        return null;
    }

    public Object getRewardPartner(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "rewardPartner"));
    }

    public Object setIntroBalanceTransferTerms(RuntimeEnv env, Object... args) {
        Object introBalanceTransferTerms = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_CcOffer.class, "introBalanceTransferTerms", introBalanceTransferTerms);

        return null;
    }

    public Object getIntroBalanceTransferTerms(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_CcOffer.class, "introBalanceTransferTerms"));
    }

    public Object setForeignCurrencyTransactionFee(RuntimeEnv env, Object... args) {
        Object foreignCurrencyTransactionFee = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_CcOffer.class,
                "foreignCurrencyTransactionFee",
                foreignCurrencyTransactionFee);

        return null;
    }

    public Object getForeignCurrencyTransactionFee(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_CcOffer.class, "foreignCurrencyTransactionFee"));
    }

    public Object setAnnualFee(RuntimeEnv env, Object... args) {
        Object annualFee = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "annualFee", annualFee);

        return null;
    }

    public Object getAnnualFee(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "annualFee"));
    }

    public Object setIssuerWebsite(RuntimeEnv env, Object... args) {
        Object issuerWebsite = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "issuerWebsite", issuerWebsite);

        return null;
    }

    public Object getIssuerWebsite(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "issuerWebsite"));
    }

    public Object setVariableRatesUpdateFrequency(RuntimeEnv env, Object... args) {
        Object variableRatesUpdateFrequency = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this,
                Google_CcOffer.class,
                "variableRatesUpdateFrequency",
                variableRatesUpdateFrequency);

        return null;
    }

    public Object getVariableRatesUpdateFrequency(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_CcOffer.class, "variableRatesUpdateFrequency"));
    }

    public Object setCarRentalInsurance(RuntimeEnv env, Object... args) {
        Object carRentalInsurance = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "carRentalInsurance", carRentalInsurance);

        return null;
    }

    public Object getCarRentalInsurance(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "carRentalInsurance"));
    }

    public Object setAdditionalCardBenefits(RuntimeEnv env, Object... args) {
        Object additionalCardBenefits = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_CcOffer.class, "additionalCardBenefits", additionalCardBenefits);

        return null;
    }

    public Object getAdditionalCardBenefits(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "additionalCardBenefits"));
    }

    public Object setAgeMinimum(RuntimeEnv env, Object... args) {
        Object ageMinimum = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "ageMinimum", ageMinimum);

        return null;
    }

    public Object getAgeMinimum(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "ageMinimum"));
    }

    public Object setBalanceComputationMethod(RuntimeEnv env, Object... args) {
        Object balanceComputationMethod = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_CcOffer.class, "balanceComputationMethod", balanceComputationMethod);

        return null;
    }

    public Object getBalanceComputationMethod(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_CcOffer.class, "balanceComputationMethod"));
    }

    public Object setAprDisplay(RuntimeEnv env, Object... args) {
        Object aprDisplay = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "aprDisplay", aprDisplay);

        return null;
    }

    public Object getAprDisplay(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "aprDisplay"));
    }

    public Object setAdditionalCardHolderFee(RuntimeEnv env, Object... args) {
        Object additionalCardHolderFee = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_CcOffer.class, "additionalCardHolderFee", additionalCardHolderFee);

        return null;
    }

    public Object getAdditionalCardHolderFee(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "additionalCardHolderFee"));
    }

    public Object setVariableRatesLastUpdated(RuntimeEnv env, Object... args) {
        Object variableRatesLastUpdated = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_CcOffer.class, "variableRatesLastUpdated", variableRatesLastUpdated);

        return null;
    }

    public Object getVariableRatesLastUpdated(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_CcOffer.class, "variableRatesLastUpdated"));
    }

    public Object setNetwork(RuntimeEnv env, Object... args) {
        Object network = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "network", network);

        return null;
    }

    public Object getNetwork(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "network"));
    }

    public Object setPurchaseRateType(RuntimeEnv env, Object... args) {
        Object purchaseRateType = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "purchaseRateType", purchaseRateType);

        return null;
    }

    public Object getPurchaseRateType(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "purchaseRateType"));
    }

    public Object setStatementCopyFee(RuntimeEnv env, Object... args) {
        Object statementCopyFee = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "statementCopyFee", statementCopyFee);

        return null;
    }

    public Object getStatementCopyFee(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "statementCopyFee"));
    }

    public Object setRewardsHaveBlackoutDates(RuntimeEnv env, Object... args) {
        Object rewardsHaveBlackoutDates = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_CcOffer.class, "rewardsHaveBlackoutDates", rewardsHaveBlackoutDates);

        return null;
    }

    public Object getRewardsHaveBlackoutDates(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.getProperty(this, Google_CcOffer.class, "rewardsHaveBlackoutDates"));
    }

    public Object setCreditRatingDisplay(RuntimeEnv env, Object... args) {
        Object creditRatingDisplay = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "creditRatingDisplay", creditRatingDisplay);

        return null;
    }

    public Object getCreditRatingDisplay(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "creditRatingDisplay"));
    }

    public Object setFlightAccidentInsurance(RuntimeEnv env, Object... args) {
        Object flightAccidentInsurance = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(
                this, Google_CcOffer.class, "flightAccidentInsurance", flightAccidentInsurance);

        return null;
    }

    public Object getFlightAccidentInsurance(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "flightAccidentInsurance"));
    }

    public Object setAnnualRewardMaximum(RuntimeEnv env, Object... args) {
        Object annualRewardMaximum = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "annualRewardMaximum", annualRewardMaximum);

        return null;
    }

    public Object getAnnualRewardMaximum(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "annualRewardMaximum"));
    }

    public Object setBalanceTransferTerms(RuntimeEnv env, Object... args) {
        Object balanceTransferTerms = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "balanceTransferTerms", balanceTransferTerms);

        return null;
    }

    public Object getBalanceTransferTerms(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "balanceTransferTerms"));
    }

    public Object setBonusRewards(RuntimeEnv env, Object... args) {
        Object bonusRewards = ZVal.assignParameter(args, 0, null);
        env.callMethod(
                this,
                "assertIsArray",
                Google_CcOffer.class,
                bonusRewards,
                "Google_CcOfferBonusRewards",
                "setBonusRewards");
        ZVal.setProperty(this, Google_CcOffer.class, "bonusRewards", bonusRewards);

        return null;
    }

    public Object getBonusRewards(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "bonusRewards"));
    }

    public Object setImageUrl(RuntimeEnv env, Object... args) {
        Object imageUrl = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "imageUrl", imageUrl);

        return null;
    }

    public Object getImageUrl(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "imageUrl"));
    }

    public Object setAgeMinimumDetails(RuntimeEnv env, Object... args) {
        Object ageMinimumDetails = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "ageMinimumDetails", ageMinimumDetails);

        return null;
    }

    public Object getAgeMinimumDetails(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "ageMinimumDetails"));
    }

    public Object setDisclaimer(RuntimeEnv env, Object... args) {
        Object disclaimer = ZVal.assignParameter(args, 0, null);
        ZVal.setProperty(this, Google_CcOffer.class, "disclaimer", disclaimer);

        return null;
    }

    public Object getDisclaimer(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, Google_CcOffer.class, "disclaimer"));
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
