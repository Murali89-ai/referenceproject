package com.wu.brwallet.customer.profile.config;

import com.wu.brwallet.customer.profile.model.response.gateway.SoapEnvelope;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import org.springframework.stereotype.Component;

import java.io.StringReader;
import java.io.StringWriter;

@Component
public class SoapClient {

    public <T> String marshalTOXml(T request) throws JAXBException {

        JAXBContext context = JAXBContext.newInstance(request.getClass());
        Marshaller marshaller = context.createMarshaller();
        StringWriter stringWriter = new StringWriter();
        marshaller.marshal(request, stringWriter);
        return stringWriter.toString();

    }

    public SoapEnvelope unmarshalSoapResponse(String xmlResponse) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(SoapEnvelope.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        StringReader reader = new StringReader(xmlResponse);
        return (SoapEnvelope) unmarshaller.unmarshal(reader);
    }





}
