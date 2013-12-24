package rp3.service;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;

public class RESTServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		JAXRSServerFactoryBean sf = new JAXRSServerFactoryBean();
        sf.setResourceClasses(CalcREST.class);
        sf.setResourceProvider(CalcREST.class, new SingletonResourceProvider(new CalcREST()));
        sf.setAddress("http://localhost:9999/calcrest/");
        Server server = sf.create();

        System.out.println(" REST Server is ready! ");
        
        // http://localhost:9999/calcrest/calc?_wadl
        // http://localhost:9999/calcrest/calc/add/20/30/
        // http://localhost:9999/calcrest/calc/sub/20/30/
        
        
        // destroy the server
        // uncomment when you want to close/destroy it
        // server.destroy();

	}

}
