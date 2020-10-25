package com.example.gamegoroda.UITests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class CommonMethods {

    public static AppiumDriver driver;

    public static void setUp(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Nexus 5 (Google)");
        capabilities.setCapability("avd", "Nexus_5_API_28");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "9.0");
        capabilities.setCapability("deviceName","emulator-5554");
        capabilities.setCapability("appPackage", "com.example.gamegoroda");
        capabilities.setCapability("appActivity", "com.example.gamegoroda.MenuActivity");

        //Instantiate Appium Driver
        try {
            driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            System.out.println(driver);

        } catch (MalformedURLException e) {
            System.out.println(driver);
            System.out.println(e.getMessage());
        }
    }

    public static boolean is_exist_element(By elementSelector) {
        List<WebElement> elements = driver.findElements(elementSelector);

        return elements.size() > 0;
    }

    public static WebElement wait_element(By elementSelector) throws InterruptedException {
        int expectation_max = 10;
        int expectation_one_iteration = 1;
        for(int i = 0; i < expectation_max; i++){
            if(is_exist_element(elementSelector)){
                return driver.findElement(elementSelector);
            }

            Thread.sleep(expectation_one_iteration);
        }

        throw new InterruptedException("Element with XPath \""+ elementSelector +"\" doesn't appeared during "+
                expectation_max * expectation_one_iteration +" millis.");
    }

    public static boolean getting_opposite_visible(By elementSelector, boolean visible) throws Exception {
        int max_expectation = 10;
        int expectation_one_iteration = 10;
        for(int i = 0; i < max_expectation; i++){
            boolean visible_next = is_exist_element(elementSelector);
            if(visible_next != visible){
                return true;
            }

            Thread.sleep(expectation_one_iteration);
        }

        return false;
    }

    public static void go_to_game_page() throws Exception {
        WebElement button_start = wait_element(DomHelper.button_new_game);
        button_start.click();

//        boolean element_disappear = getting_opposite_visible(DomHelper.button_new_game, true);
//        if(!element_disappear){
//            throw new InterruptedException("Button \""+ button_start.getText() +"\" doesn't disappear.");
//        }
    }

    public static void go_to_new_game_page(String new_game_name) throws Exception {
        go_to_game_page();

        By button_new_game_by = null;
        if(new_game_name == Constants.cities){
            button_new_game_by = DomHelper.button_cities;
        }else if(new_game_name == Constants.countries){
            button_new_game_by = DomHelper.button_countries;
        }else if(new_game_name == Constants.names){
            button_new_game_by = DomHelper.button_names;
        }else{
            throw new Exception("Selected non-existent game.");
        }

        WebElement button_new_game = wait_element(button_new_game_by);
        button_new_game.click();
//        boolean element_disappear = getting_opposite_visible(button_new_game_by, true);
//        if(!element_disappear){
//            throw new Exception("Button \""+ button_new_game.getText() +"\" doesn't disappear.");
//        }
    }

    public static void go_to_win_loss_page(String new_game_name) throws Exception {
        go_to_new_game_page(new_game_name);

        WebElement button_surrender = wait_element(DomHelper.button_surrender);
        button_surrender.click();

//        boolean element_disappear = getting_opposite_visible(DomHelper.button_surrender, true);
//        if(!element_disappear){
//            throw new Exception("Button \""+ button_surrender.getText() +"\" doesn't disappear.");
//        }
    }

    public static void End() {
        driver.quit();
    }
}