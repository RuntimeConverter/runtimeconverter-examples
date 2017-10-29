package com.project.convertedCode.includes.google_api_php_client.src.contrib;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/contrib/Google_GanService.php

*/

public class file_Google_GanService_php implements RuntimeIncludable, RuntimeFileContextInterface {

    public static final file_Google_GanService_php instance = new file_Google_GanService_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope27 scope = new Scope27();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope27 scope)
            throws IncludeEventException {
        // Conversion Note: class named Google_AdvertisersServiceResource was here in the source code
        // Conversion Note: class named Google_CcOffersServiceResource was here in the source code
        // Conversion Note: class named Google_EventsServiceResource was here in the source code
        // Conversion Note: class named Google_LinksServiceResource was here in the source code
        // Conversion Note: class named Google_PublishersServiceResource was here in the source code
        // Conversion Note: class named Google_GanService was here in the source code
        // Conversion Note: class named Google_Advertiser was here in the source code
        // Conversion Note: class named Google_Advertisers was here in the source code
        // Conversion Note: class named Google_CcOffer was here in the source code
        // Conversion Note: class named Google_CcOfferBonusRewards was here in the source code
        // Conversion Note: class named Google_CcOfferDefaultFees was here in the source code
        // Conversion Note: class named Google_CcOfferRewards was here in the source code
        // Conversion Note: class named Google_CcOffers was here in the source code
        // Conversion Note: class named Google_Event was here in the source code
        // Conversion Note: class named Google_EventProducts was here in the source code
        // Conversion Note: class named Google_Events was here in the source code
        // Conversion Note: class named Google_Link was here in the source code
        // Conversion Note: class named Google_Links was here in the source code
        // Conversion Note: class named Google_Money was here in the source code
        // Conversion Note: class named Google_Publisher was here in the source code
        // Conversion Note: class named Google_Publishers was here in the source code

    }

    @Override
    public String ___getRuntimeDirname() {
        return "/google-api-php-client/src/contrib";
    }

    @Override
    public String ___getRuntimeFilename() {
        return "/google-api-php-client/src/contrib/Google_GanService.php";
    }

    @Override
    public String ___getRuntimeNamespace() {
        return "";
    }

    private static class Scope27 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
