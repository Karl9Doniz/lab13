package com.example.task1;

import java.time.LocalDate;

public class MyTwitterUser implements MyUser{
    private TwitterUser twitterUser;

    public MyTwitterUser(TwitterUser twitterUser) {
        this.twitterUser = twitterUser;
    }
    @Override
    public String getEmail() {
        return twitterUser.getUserMail();
    }

    @Override
    public String getCountry() {
        return twitterUser.getCountry();
    }
    
    @Override
    public LocalDate getLastActiveTime() {
        return twitterUser.getLastActiveTime();
    }
}
