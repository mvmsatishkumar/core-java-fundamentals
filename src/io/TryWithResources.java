package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class TryWithResources {

    public static void main(String[] args) {
    	
        try (BufferedReader reader = new BufferedReader(new StringReader("Java"))) {
            System.out.println(reader.readLine());
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// Interview advantage: try-with-resources closes AutoCloseable resources automatically, even when an exception occurs.
// Multiple resources are closed in reverse declaration order.
