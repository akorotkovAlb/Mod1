package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

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
        System.out.println("TEST1");
        System.out.println("Hello and welcome!");

        GUser user = new GUser("Tim");
        ObjectMapper om = new ObjectMapper();
        Gson gson = new Gson();
        System.out.println("JSON user -> " + om.writeValueAsString(user));
        System.out.println("GSON JSON user -> " + gson.toJson(user));

        Files.lines(Paths.get("source.txt")).forEach(line -> System.out.println("line -> " + line));
    }
}