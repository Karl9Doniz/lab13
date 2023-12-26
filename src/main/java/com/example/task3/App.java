package com.example.task3;

import org.json.JSONObject;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        Facade info = new PDLReader();

        JSONObject CompanyInfo = info.getInfo("ucu.edu.ua");
        System.out.println("Company Info: " + CompanyInfo);

    }
}
