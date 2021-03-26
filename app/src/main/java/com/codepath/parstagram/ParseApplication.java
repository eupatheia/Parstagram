package com.codepath.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    //initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        //register parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("YfjLasfeaDZD9fCqkkGRWOMOqke2eaxEfm0OOwjt")
                .clientKey("u7mErYqUKObe3cAjJGZgnwhHotvnxjPFBnu35DOH")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
