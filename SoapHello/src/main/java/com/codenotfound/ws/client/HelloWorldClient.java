package com.codenotfound.ws.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.codenotfound.types.flightsearch.Flight;
import com.codenotfound.types.flightsearch.Flightinfo;
import com.codenotfound.types.helloworld.Greeting;
//import com.codenotfound.types.helloworld.ObjectFactory;
import com.codenotfound.types.flightsearch.ObjectFactory;
import com.codenotfound.types.helloworld.Person;


public class HelloWorldClient extends WebServiceGatewaySupport {

  private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldClient.class);

/*  @Autowired
  private WebServiceTemplate webServiceTemplate;*/

  //public String sayHello(String firstName, String lastName) {
  //public String getFlight(String source, String destination, String dte) {
	  public Flightinfo getFlight(String source, String destination, String dte) {
    
    /*Person person = factory.createPerson();

    person.setFirstName(firstName);
    person.setLastName(lastName);*/
	ObjectFactory factory = new ObjectFactory();
    Flight flight = factory.createFlight();
    flight.setSource(source);
    flight.setDestination(destination);
    flight.setDteofjourney(dte);

    /*LOGGER.info("Client sending person[firstName={},lastName={}]", person.getFirstName(),
        person.getLastName());*/
    LOGGER.info("Client sending flight[source={},destination={},dteofjourney={}]", flight.getSource(),
            flight.getDestination(),flight.getDteofjourney());

    //Greeting greeting = (Greeting) webServiceTemplate.marshalSendAndReceive("http://localhost:9090/codenotfound/ws/helloworld", person);
    //Greeting greeting = (Greeting) webServiceTemplate.marshalSendAndReceive(person,new SoapActionCallback("http://codenotfound.com/types/helloworld/Greeting"));
    //Greeting greeting = (Greeting) getWebServiceTemplate().marshalSendAndReceive(person, new SoapActionCallback("http://codenotfound.com/types/helloworld/Greeting"));
    Flightinfo flightinfo = (Flightinfo) getWebServiceTemplate().marshalSendAndReceive(flight,new SoapActionCallback("http://codenotfound.com/types/flightsearch/Flightinfo"));

    /*LOGGER.info("Client received greeting='{}'", greeting.getGreeting());
    return greeting.getGreeting();*/
    
    LOGGER.info("Client received flightinfo='{}'", flightinfo.toString());
    //return flightinfo.toString();
    return flightinfo;
  }
}
