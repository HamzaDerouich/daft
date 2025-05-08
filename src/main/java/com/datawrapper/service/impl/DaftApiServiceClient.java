package com.datawrapper.service.impl;

import com.datawrapper.service.soap.DaftAPIService;
import com.datawrapper.service.soap.DaftAPIService_Service;

import javax.xml.ws.BindingProvider;

public class DaftApiServiceClient {

    private final DaftAPIService service;

    public DaftApiServiceClient(String endpointUrl) {
        DaftAPIService_Service serviceFactory = new DaftAPIService_Service();
        this.service = serviceFactory.getDaftAPIServicePort();

        // Configura dinámicamente la URL del endpoint SOAP
        ((BindingProvider) service).getRequestContext()
            .put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpointUrl);
    }

    public String test(String apiKey) {
        return service.test(apiKey);
    }

    // Otros métodos para interactuar con el servicio SOAP
}