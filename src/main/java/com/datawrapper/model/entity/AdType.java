package com.datawrapper.model.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class AdType {
    @JacksonXmlProperty(localName = "name")
    private String name;

    @JacksonXmlProperty(localName = "desc")
    private String desc;

    @JacksonXmlProperty(localName = "desc_plural")
    private String descPlural;

    @JacksonXmlProperty(localName = "desc_short")
    private String descShort;

    // Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDescPlural() {
        return descPlural;
    }

    public void setDescPlural(String descPlural) {
        this.descPlural = descPlural;
    }

    public String getDescShort() {
        return descShort;
    }

    public void setDescShort(String descShort) {
        this.descShort = descShort;
    }
}
