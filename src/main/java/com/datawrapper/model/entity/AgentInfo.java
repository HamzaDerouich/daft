package com.datawrapper.model.entity;

public class AgentInfo {
    private String id;
    private String name;
    private String address;
    private String phone;
    private String fax;
    private boolean isBranded;
    private String mainLogoUrl;
    private String brandedLogoUrl;

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public boolean isBranded() {
        return isBranded;
    }

    public void setBranded(boolean branded) {
        isBranded = branded;
    }

    public String getMainLogoUrl() {
        return mainLogoUrl;
    }

    public void setMainLogoUrl(String mainLogoUrl) {
        this.mainLogoUrl = mainLogoUrl;
    }

    public String getBrandedLogoUrl() {
        return brandedLogoUrl;
    }

    public void setBrandedLogoUrl(String brandedLogoUrl) {
        this.brandedLogoUrl = brandedLogoUrl;
    }
}