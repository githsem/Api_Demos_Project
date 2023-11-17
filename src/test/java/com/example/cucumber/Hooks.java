package com.example.cucumber;

import com.example.utils.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import java.util.concurrent.TimeUnit;
import static com.example.utils.App.API_Demos;
import static com.example.utils.Device.Pixel_2;
import static com.example.utils.MobileUtilities.openApp;

public class Hooks {

    protected AppiumDriver<MobileElement> driver;

    @Before
    public void setUp() {
        driver = openApp(Pixel_2, API_Demos);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        Driver.getDriver().closeApp();
    }
}
