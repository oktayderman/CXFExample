package ar.com.pabloExample.services;

import org.apache.cxf.feature.Features;

import javax.jws.WebService;

@WebService(endpointInterface = "ar.com.pabloExample.services.HelloWorldService")
@Features(features = "org.apache.cxf.feature.LoggingFeature")
public class HelloWorldServiceBean implements HelloWorldService {

	public void sayHello() {
		System.out.println("Hello World!!!");
	}

}
