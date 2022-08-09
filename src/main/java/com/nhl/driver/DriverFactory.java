package com.nhl.driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public final class DriverFactory {

    private DriverFactory(){}

    public static WebDriver getDriver(String browserName) {
        WebDriver driver = null;
        if(browserName.equalsIgnoreCase("android")){
            DesiredCapabilities capabilties = new DesiredCapabilities();

//            capabilties.setCapability(MobileCapabilityType.UDID, "R58M248NA3N");
            //capabilties.setCapability(MobileCapabilityType.UDID, "dav49pyhgaztdyww");
            //capabilties.setCapability(MobileCapabilityType.APP,"D:\\app-debug.apk");
//            capabilties.setCapability(MobileCapabilityType.APP,System.getProperty("user.dir") + "\\src\\test\\resources\\apkfiles\\app-release.apk");
            //capabilties.setCapability(MobileCapabilityType.UDID, "R58M248NA3N");
            //capabilties.setCapability(MobileCapabilityType.APP,System.getProperty("user.dir") + "\\src\\test\resources\\apkfiles\\app-release.apk");

//            capabilties.setCapability(MobileCapabilityType.UDID, "dav49pyhgaztdyww");
//            capabilties.setCapability(MobileCapabilityType.APP,"D:\\app-debug.apk");


            capabilties.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.bankfab.nhl");
            capabilties.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".MainActivity");
            capabilties.setCapability(MobileCapabilityType.NO_RESET, true);
            capabilties.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
            //new session always install while execute
            capabilties.setCapability(MobileCapabilityType.FULL_RESET, true);
            capabilties.setCapability(MobileCapabilityType.NO_RESET, false);
            try {
                driver =  new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), capabilties);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        } else if(browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if(browserName.equalsIgnoreCase("edge")){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        else {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        return driver;
    }
}
