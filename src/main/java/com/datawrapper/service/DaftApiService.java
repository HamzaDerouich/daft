package com.datawrapper.service;

import com.datawrapper.model.entity.*;
import com.datawrapper.service.impl.DaftAPIClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DaftApiService {

    private final DaftAPIClient client;

    @Autowired
    public DaftApiService(DaftAPIClient client) {
        this.client = client;
    }

    public String testConnection(String apiKey) {
        return client.test(apiKey);
    }

    public List<AdType> getAdTypes(String apiKey) {
        return client.adTypes(apiKey);
    }

    public List<Feature> getFeatures(String apiKey, String adType) {
        return client.features(apiKey, adType);
    }

    public List<PropertyType> getPropertyTypes(String apiKey, String adType) {
        return client.propertyTypes(apiKey, adType);
    }

    public SaleResults searchSale(String apiKey, SearchQuery query) {
        return client.searchSale(apiKey, query);
    }

    public RentalResults searchRental(String apiKey, SearchQuery query) {
        return client.searchRental(apiKey, query);
    }

    public AgentInfo getAgentInfo(String apiKey, String adId, String adType) {
        return client.agentInfo(apiKey, adId, adType);
    }

    public Media getMedia(String apiKey, String adType, String adId) {
        return client.media(apiKey, adType, adId);
    }
}