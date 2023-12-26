package com.example.task2;

public class Database extends БазаДаних{
    public String receiveUserData() {
        return отриматиДаніКористувача();
    }

    public String receiveStatisticalData() {
        return отриматиСтатистичніДані();
    }
}
