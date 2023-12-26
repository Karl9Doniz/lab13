package com.example.task3;

import org.json.JSONObject;

import java.io.IOException;

public interface Facade {
    JSONObject getInfo(String website) throws IOException;
}
