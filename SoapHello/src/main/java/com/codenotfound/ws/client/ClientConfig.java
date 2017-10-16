package com.codenotfound.ws.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;

@Configuration
public class ClientConfig {

  @Bean
  Jaxb2Marshaller jaxb2Marshaller() {
    Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
    //jaxb2Marshaller.setContextPath("com.codenotfound.types.helloworld");
    jaxb2Marshaller.setContextPath("com.codenotfound.types.flightsearch");

    return jaxb2Marshaller;
  }

  @Bean
  public HelloWorldClient userClient() {
  HelloWorldClient uc = new HelloWorldClient();
  //uc.setDefaultUri("http://localhost:9090/codenotfound/ws/helloworld/wsdl/helloworld.wsdl");
  uc.setDefaultUri("http://localhost:9090/codenotfound/ws/flightsearch/wsdl/flightsearch.wsdl");
  uc.setMarshaller(jaxb2Marshaller());
  uc.setUnmarshaller(jaxb2Marshaller());
  return uc;
  }
 /* @Bean
  public WebServiceTemplate webServiceTemplate() {
    WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
    webServiceTemplate.setMarshaller(jaxb2Marshaller());
    webServiceTemplate.setUnmarshaller(jaxb2Marshaller());
    webServiceTemplate.setDefaultUri("http://localhost:9090/codenotfound/ws/helloworld/wsdl/helloworld.wsdl");

    return webServiceTemplate;
  }*/
}
