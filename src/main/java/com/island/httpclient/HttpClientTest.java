package com.island.httpclient;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;




public class HttpClientTest {
	public static void main(String args[]) throws Exception{
		
        HttpClient client = new HttpClient();
        while(true){
	        GetMethod method = new GetMethod("http://192.168.1.23:1234");
	        int statusCode = client.executeMethod(method);
	        System.out.println(statusCode);
	        Thread.sleep(100);
           }
	}
}
