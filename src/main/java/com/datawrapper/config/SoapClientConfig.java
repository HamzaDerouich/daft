package com.datawrapper.config;

import java.time.Duration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.transport.http.HttpUrlConnectionMessageSender;
import com.datawrapper.service.impl.DaftAPIClient;

@Configuration
public class SoapClientConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.datawrapper.soap"); 
        return marshaller;
    }

    @Bean
    public WebServiceTemplate webServiceTemplate(Jaxb2Marshaller marshaller) {
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate(marshaller);
        HttpUrlConnectionMessageSender messageSender = new HttpUrlConnectionMessageSender();
        messageSender.setConnectionTimeout(Duration.ofMillis(5000));
        messageSender.setReadTimeout(Duration.ofMillis(5000));
        webServiceTemplate.setMessageSender(messageSender);
        return webServiceTemplate;
    }

    @Bean
    public DaftAPIClient daftAPIClient(WebServiceTemplate webServiceTemplate) {
        DaftAPIClient client = new DaftAPIClient();
        client.setWebServiceTemplate(webServiceTemplate);
        return client;
    }
}
