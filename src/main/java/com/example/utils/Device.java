package com.example.utils;

public enum Device {

    Pixel_2("emulator-5554",
            "11",
            "Pixel_2",
            "Android"),
    Redmi5("emulator-5554",
            "11",
            "Pixel_2",
            "Android");

    public String udid;
    public String version;
    public String deviceName;
    public String platformName;

    Device(String udid, String version, String deviceName, String platformName) {
        this.udid = udid;
        this.version = version;
        this.deviceName = deviceName;
        this.platformName = platformName;
    }
}
