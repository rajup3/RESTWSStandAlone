package rp3.client;

import org.apache.cxf.jaxrs.client.WebClient;

public class RESTClient {

    static final String REST_URI = "http://localhost:9999/calcrest/";
    static final String ADD_PATH = "calc/add";
    static final String SUB_PATH = "calc/sub";
    static final String MUL_PATH = "calc/mul";
    static final String DIV_PATH = "calc/div";
 
    public static void main(String[] args) {
        int a = 122;
        int b = 34;
        String s = "";
 
        WebClient plainAddClient = WebClient.create(REST_URI);
        plainAddClient.path(ADD_PATH).path(a + "/" + b).accept("text/plain");
        s = plainAddClient.get(String.class);
        System.out.println(s);
 
        WebClient xmlAddClient = WebClient.create(REST_URI);
        xmlAddClient.path(ADD_PATH).path(a + "/" + b).accept("text/xml");
        s = xmlAddClient.get(String.class);
        System.out.println(s);
 
        WebClient plainSubClient = WebClient.create(REST_URI);
        plainSubClient.path(SUB_PATH).path(a + "/" + b).accept("text/plain");
        s = plainSubClient.get(String.class);
        System.out.println(s);
 
        WebClient xmlSubClient = WebClient.create(REST_URI);
        xmlSubClient.path(SUB_PATH).path(a + "/" + b).accept("text/xml");
        s = xmlSubClient.get(String.class);
        System.out.println(s);
    }

}
