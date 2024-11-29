package com.javademo.net;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;

public class URLEncodingDemo {
    
    public static void main(String[] args) throws URISyntaxException, UnsupportedEncodingException {
        String url = "https://www.oracle.com?key1=value+1&key2=value%40%21%242&key3=value%253";

        // using URI
        URI uri = new URI(url);
        System.out.println("Scheme: " + uri.getScheme());
        System.out.println("Host: " + uri.getHost());
        System.out.println("Query: " + uri.getRawQuery());
        
        // Encode; typically we encode query portion of the URI only
        String decodedValue = URLDecoder.decode("RXPw%2BVWqfMcgdN6WbqJhChnEMy2alKeWI4CarqsO1e7XILtrLzDDavCp90tNmjJ5wocPcP4eB3SjQaD0OXY0swr%2Bwp%2BiU8BSDVfshfIrWApvOok9LpiToZD522T9rZKr98UAyD9jPrSdGQ5n0JGX%2FRmhauwKPayDYovDzGqNu5NKzRXcBk3XgmDn8JAXUgAOcEke86VlD0fqQpaL5BogzlelDf1IoS9QxigulR5kLxX7dQQN1ogLbakG4KsOPanC7O7G3mtZqWr61crEAuwDmkB1cKUrOrY4xP3i220DYVHTcwsZ6VFDymuQ4apqHeShyMDninL33C3M37nnGiLu4FUIZMJiL%2FGH6CqCG4UdfTI%3D", "UTF-8");

        System.out.println(decodedValue);

    }
}
