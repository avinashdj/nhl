package com.nhl.driver;

import com.nhl.config.ConfigFactory;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public final class Driver { //IS A relationship

    private Driver(){}

    public static void initDriver(){
        String browser = ConfigFactory.getConfig().browser();
        if(DriverManager.getDriver() == null) {
            WebDriver driver = DriverFactory.getDriver(browser);
            DriverManager.setDriver(driver);
            //.manage().window().maximize(); //DriverFactory.getDriver(browser);
            DriverManager.getDriver().manage().timeouts().implicitlyWait(ConfigFactory.getConfig().timeout(), TimeUnit.SECONDS);//presence of element in the dom
            //DriverManager.getDriver().get(ConfigFactory.getConfig().url());
        }
    }

    public static void quitDriver(){
        if(DriverManager.getDriver() != null) {
            //DriverManager.getDriver().close();
            DriverManager.getDriver().quit();
            DriverManager.setDriver(null);
        }
    }
}
