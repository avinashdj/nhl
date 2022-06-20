package com.nhl.utils;

import com.nhl.config.ConfigFactory;
import com.nhl.driver.DriverManager;
import com.nhl.enums.WaitType;
import com.nhl.reports.ExtentLogger;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public final class SeleniumUtils {

    private SeleniumUtils(){}

    public static void click(By by, String elementName){
        WebElement element = waitUntilElementToBeClickable(by);
        element.click();
        //ExtentLogger.pass(elementName + " is clicked successfully");
    }

    public static void click(WebElement element){
        element.click();
    }

    public static void click(By by, WaitType waitType){
        WebElement element = null;
        if(waitType == WaitType.PRESENCE){
            element = waitUntilElementPresent(by);
        } else if(waitType == WaitType.CLICKABLE){
            element = waitUntilElementToBeClickable(by);
        } else if(waitType == WaitType.VISIBLE){
            element = waitUntilElementToBeVisible(by);
        }
        element.click();
    }

    public static void sendKeys(By by, String value, String elementName){
        WebElement element = waitUntilElementPresent(by);
        element.clear();
        element.sendKeys(value);
       // ExtentLogger.pass(value + " is entered "+ " successfully in "+elementName);
    }

    public static String getTextFromLabel(By by){
        WebElement element = waitUntilElementPresent(by);
        return element.getAttribute("content-desc");
        // ExtentLogger.pass(value + " is entered "+ " successfully in "+elementName);
    }

    public static void enterPin(final String value){
        new Actions(DriverManager.getDriver()).sendKeys(value).perform();
    }

    private static WebElement waitUntilElementToBeVisible(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), ConfigFactory.getConfig().timeout());
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    private static WebElement waitUntilElementPresent(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), ConfigFactory.getConfig().timeout());
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    private static WebElement waitUntilElementToBeClickable(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), ConfigFactory.getConfig().timeout());
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static String getContentDesc(By by){
        WebElement element = waitUntilElementPresent(by);
        return element.getAttribute("content-desc");
    }

    public static void hideKeyboard(){
        ((AndroidDriver) DriverManager.getDriver()).hideKeyboard();
    }

    private static String getFileFromResourceAsStream(String fileName) {
        File file = new File("D:\\coderepo\\nhlmobile\\SeleniumFramework\\src\\test\\resources\\files\\file1.pdf");
        return file.getAbsolutePath();
    }

//    private static InputStream getFileFromResourceAsStream(String fileName) {
//
//        // The class loader that loaded the class
//        ClassLoader classLoader = SeleniumUtils.class.getClassLoader();
//        InputStream inputStream = classLoader.getResourceAsStream(fileName);
//
//        // the stream holding the file content
//        if (inputStream == null) {
//            throw new IllegalArgumentException("file not found! " + fileName);
//        } else {
//            return inputStream;
//        }
//
//    }

    /**
     * Upload document
     */
    public static void uploadDocument(final String fileName, final By docToUpload, final String documentType) {
        //click(docToUpload, documentType);
        try{
            String filePathInDevice = String.format("/sdcard/download/%s.pdf", fileName);
            String filePathInResource = String.format("/files/%s.pdf", fileName);

            ((AndroidDriver) DriverManager.getDriver()).pushFile(filePathInDevice,
                    new File(getFileFromResourceAsStream(filePathInResource)));

            click(docToUpload, documentType);

            try{
                By allow = By.id("com.android.permissioncontroller:id/permission_allow_button");
                click(allow, "Allow option");
            }catch(Exception e){

            }
            By fileInDevice = By.xpath(String.format("//*[@text='%s.pdf']", fileName));
            click(fileInDevice, fileName);
        } catch(Exception e){
            e.printStackTrace();
        }

//        WebDriverWait wait2 = new WebDriverWait(DriverManager.getDriver(), 100);
//        wait2.until(ExpectedConditions.visibilityOf(DriverManager.getDriver().findElement(linkSitePlan))).click();
//        By eleFile = By.xpath("//*[@text=\"site-plan-doc.pdf\"]");
//        wait2.until(ExpectedConditions.visibilityOfElementLocated(eleFile));
//        driver.findElement(eleFile).click();

    }

    public static boolean isEnabled(final By by, final String elementName){
        WebElement element = waitUntilElementPresent(by);
        return element.getAttribute("enabled").equalsIgnoreCase("true") ? true : false;
    }

    public static boolean isClickable(final By by, final String elementName){
        WebElement element = waitUntilElementPresent(by);
        return element.getAttribute("clickable").equalsIgnoreCase("true") ? true : false;
    }

    public static boolean isDisplayed(final By by, final String elementName){
        WebElement element = waitUntilElementPresent(by);
        return element.getAttribute("displayed").equalsIgnoreCase("true") ? true : false;
    }
}
