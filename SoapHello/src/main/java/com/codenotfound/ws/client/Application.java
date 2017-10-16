package com.codenotfound.ws.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
	    SpringApplication.run(Application.class, args);
	    /*HelloWorldClient helloWorldClient=new HelloWorldClient();
	    String greeting=helloWorldClient.sayHello("Remya","Menon");
	    System.out.println(greeting);*/
	}

}
