package com.datawrapper.controller;

import com.datawrapper.model.entity.*;
import com.datawrapper.model.request.SearchQuery;
import com.datawrapper.service.DaftApiService;

import java.util.List;

public class DaftApiController {

    private final DaftApiService daftApiService;

    public DaftApiController(DaftApiService daftApiService) {
        this.daftApiService = daftApiService;
    }

    /**
     * Test the API connection.
     *
     * @param apiKey The API key.
     * @return The status of the API connection.
     */
    public String testApi(String apiKey) {
        return daftApiService.test(apiKey);
    }

    /**
     * Get all ad types.
     *
     * @param apiKey The API key.
     * @return A list of ad types.
     */
    public List<AdType> getAdTypes(String apiKey) {
        return daftApiService.getAdTypes(apiKey);
    }

    /**
     * Get features for a specific ad type.
     *
     * @param apiKey  The API key.
     * @param adType  The ad type.
     * @return A list of features.
     */
    public List<Feature> getFeatures(String apiKey, String adType) {
        return daftApiService.getFeatures(apiKey, adType);
    }

    /**
     * Get property types for a specific ad type.
     *
     * @param apiKey  The API key.
     * @param adType  The ad type.
     * @return A list of property types.
     */
    public List<PropertyType> getPropertyTypes(String apiKey, String adType) {
        return daftApiService.getPropertyTypes(apiKey, adType);
    }

    /**
     * Search for rental ads.
     *
     * @param apiKey The API key.
     * @param query  The search query.
     * @return A list of rental ads.
     */
    public RentalResults searchRental(String apiKey, SearchQuery query) {
        return daftApiService.searchRental(apiKey, query);
    }

    /**
     * Search for sale ads.
     *
     * @param apiKey The API key.
     * @param query  The search query.
     * @return A list of sale ads.
     */
    public SaleResults searchSale(String apiKey, SearchQuery query) {
        return daftApiService.searchSale(apiKey, query);
    }

    /**
     * Get agent information.
     *
     * @param apiKey The API key.
     * @param adId   The ad ID.
     * @param adType The ad type.
     * @return The agent information.
     */
    public AgentInfo getAgentInfo(String apiKey, String adId, String adType) {
        return daftApiService.getAgentInfo(apiKey, adId, adType);
    }

    /**
     * Get media for a specific ad.
     *
     * @param apiKey The API key.
     * @param adType The ad type.
     * @param adId   The ad ID.
     * @return The media information.
     */
    public Media getMedia(String apiKey, String adType, String adId) {
        return daftApiService.getMedia(apiKey, adType, adId);
    }
}