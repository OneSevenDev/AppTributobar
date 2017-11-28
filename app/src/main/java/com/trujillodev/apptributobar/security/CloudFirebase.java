package com.trujillodev.apptributobar.security;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Guarniz on 28/11/2017.
 */

public class CloudFirebase extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
