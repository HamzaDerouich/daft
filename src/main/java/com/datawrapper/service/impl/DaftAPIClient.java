package com.datawrapper.service.impl;

import com.datawrapper.soap.AdTypesRequest;
import com.datawrapper.soap.AdTypesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;

@Component
public class DaftAPIClient {

    private final WebServiceTemplate webServiceTemplate;

    @Autowired
    public DaftAPIClient(WebServiceTemplate webServiceTemplate) {
        this.webServiceTemplate = webServiceTemplate;
    }

    public AdTypesResponse getAdTypes(String apiKey) {
        AdTypesRequest request = new AdTypesRequest();
        request.setApiKey(apiKey);

        return (AdTypesResponse) webServiceTemplate.marshalSendAndReceive(request);
    }

    
}