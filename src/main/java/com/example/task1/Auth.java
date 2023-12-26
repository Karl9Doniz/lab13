package com.example.task1;

public class Auth {
    public MyUser login() {
        int random = 10;
        return new MyTwitterUser(new TwitterUser());
    }

    public void doSomething(MyUser user) {
        // ..
    }
}
