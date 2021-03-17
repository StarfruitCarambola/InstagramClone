package com.example.instagramclone;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Tdi7r00yiPA1r6pbCGwA3GAyVctMkolLfc6ju3Ro")
                .clientKey("H3NCOULxKwSEekgU8vPN5tMZ80s90SKlOrpHRjPC")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}

