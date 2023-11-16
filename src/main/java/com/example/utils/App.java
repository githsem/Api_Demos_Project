package com.example.utils;

public enum App {

    API_Demos("com.touchboarder.android.api.demos","com.touchboarder.androidapidemos.MainActivity", "API Demos for Android_1.9.0_Apkpure.apk.zip"),
    CALCULATOR("com.google.android.calculator","com.android.calculator2.Calculator","");


    public String appPackage;
    public String appActivity;
    public String appZipFile;

    App(String appPackage, String appActivity, String appZipFile) {
        this.appPackage = appPackage;
        this.appActivity = appActivity;
        this.appZipFile = appZipFile;
    }
}
