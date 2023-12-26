package com.example.task3;

import org.json.JSONObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import java.util.Scanner;

public class PDLReader implements Facade {
    @Override
    public JSONObject getInfo(String website) throws IOException {
        // No api key because website throws an error
        String API_KEY = "";
        URL url = new URL("https://api.peopledatalabs.com/v5/company/enrich?website=ucu.edu.ua");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("X-Api-Key", API_KEY);
        connection.connect();
        String text = new Scanner(connection.getInputStream()).useDelimiter("\\Z").next();
        JSONObject jsonObject = new JSONObject(text);
        return jsonObject;
    }
}
