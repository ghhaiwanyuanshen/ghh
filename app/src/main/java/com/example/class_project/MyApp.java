package com.example.class_project;

import android.app.Application;

public class MyApp extends Application {
    public static Application instanceGlobal;
    @Override
    public void onCreate(){
        super.onCreate();
        instanceGlobal =this;
        initSDK();
    }
    void initSDK(){

    }
}
