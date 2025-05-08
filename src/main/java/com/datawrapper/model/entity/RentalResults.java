package com.datawrapper.model.entity;

import java.util.List;

public class RentalResults {
    private String searchSentence;
    private Pagination pagination;
    private List<RentalAd> ads;

    // Getters y Setters
    public String getSearchSentence() {
        return searchSentence;
    }

    public void setSearchSentence(String searchSentence) {
        this.searchSentence = searchSentence;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public List<RentalAd> getAds() {
        return ads;
    }

    public void setAds(List<RentalAd> ads) {
        this.ads = ads;
    }
}