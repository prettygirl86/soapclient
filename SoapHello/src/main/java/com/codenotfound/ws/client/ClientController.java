package com.codenotfound.ws.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.codenotfound.types.flightsearch.Flightinfo;

@Controller

public class ClientController {
	
	@Autowired
	private HelloWorldClient usc;
    //@RequestMapping(value="/getGreeting",method=RequestMethod.GET)
	@RequestMapping(value="/getFlight",method=RequestMethod.GET)
    @ResponseBody
    //public void  greeting() {
		public Flightinfo  info() {
                    System.out.println(" Inside call ");
                    
                   /* HelloWorldClient helloWorldClient=new HelloWorldClient();
            	    String greeting=helloWorldClient.sayHello("Remya","Menon");
            	    System.out.println(greeting); */      
                   // AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
                   // ctx.register(ClientConfig.class);
                   // ctx.refresh();
                   // HelloWorldClient usc = ctx.getBean(HelloWorldClient.class);
                    //System.out.println(" For Employee: ");
                    //String response = usc.sayHello("hjgj", "lkjl");
                    Flightinfo response = usc.getFlight("COK", "HYD", "311017");
                    //System.out.println(response);
                    return response;

//System.out.println("Inside result "+response);  
    }
    
    @RequestMapping(value="/sample",method=RequestMethod.GET)
    @ResponseBody
  public String samplemsg()
  {
	  return "testinggggggggggg";
  }
    


}
