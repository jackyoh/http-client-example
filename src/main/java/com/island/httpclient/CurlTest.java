package com.island.httpclient;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
public class CurlTest {

	public static void main(String args[]) throws IOException{
		
        String stringUrl = "http://192.168.1.8:8080/v2/events";
        URL url = new URL(stringUrl);
        URLConnection uc = url.openConnection();
          uc.setRequestProperty("Accept", "text/event-stream");
       // uc.setRequestProperty("Accept: text/event-stream", "Curl");

        //String userpass = "username" + ":" + "password";
        //String basicAuth = "Basic " + new String(new Base64().encode(userpass.getBytes()));
        //uc.setRequestProperty("Authorization", basicAuth);

        InputStreamReader inputStreamReader = new InputStreamReader(uc.getInputStream());
        // read this input
        inputStreamReader.read();
		

		
	}
}
