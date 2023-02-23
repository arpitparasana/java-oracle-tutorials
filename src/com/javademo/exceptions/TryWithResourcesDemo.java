package com.javademo.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesDemo {
    
    public static void main(String[] args) throws IOException {
        System.out.println(readLine("resources/test.txt"));
    }

    public static String readLine(String fileName)  throws IOException {
        try (FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr)){
                return br.readLine();
        }
    }
}
