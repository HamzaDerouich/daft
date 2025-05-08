package com.datawrapper.model.entity;
import java.util.List;

public class Media {
    private String adType;
    private String adId;
    private List<Image> images;
    private List<VirtualTour> virtualTours;
    private List<Document> documents;

    // Getters y Setters
    public String getAdType() {
        return adType;
    }

    public void setAdType(String adType) {
        this.adType = adType;
    }

    public String getAdId() {
        return adId;
    }

    public void setAdId(String adId) {
        this.adId = adId;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public List<VirtualTour> getVirtualTours() {
        return virtualTours;
    }

    public void setVirtualTours(List<VirtualTour> virtualTours) {
        this.virtualTours = virtualTours;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }
}
