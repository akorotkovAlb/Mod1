package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main (String[] args) throws IOException {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Hello and welcome!");

        GUser user = new GUser("Tim");
        ObjectMapper om = new ObjectMapper();
        System.out.println("JSON user -> " + om.writeValueAsString(user));

        Files.lines(Paths.get("source.txt")).forEach(line -> System.out.println("line -> " + line));
    }
}