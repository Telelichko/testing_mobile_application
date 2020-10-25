package com.example.gamegoroda.UITests;

import org.openqa.selenium.By;

public class DomHelper {

    public static By button_new_game = By.xpath("//android.view.ViewGroup[@index='0']" +
            "//android.widget.FrameLayout[@index='1']//android.widget.Button[@index='1' and @text='" +
            Constants.new_game + "']");

    public static By button_cities = By.xpath("//android.view.ViewGroup[@index='0']" +
            "//android.widget.FrameLayout[@index='1']//android.widget.Button[@index='0' and @text='" +
            Constants.cities + "']");

    public static By button_countries = By.xpath("//android.view.ViewGroup[@index='0']" +
            "//android.widget.FrameLayout[@index='1']//android.widget.Button[@index='1' and @text='" +
            Constants.countries + "']");

    public static By button_names = By.xpath("//android.view.ViewGroup[@index='0']" +
            "//android.widget.FrameLayout[@index='1']//android.widget.Button[@index='2' and @text='" +
            Constants.names + "']");

    public static By button_send = By.xpath("//android.view.ViewGroup[@index='0']" +
            "//android.widget.FrameLayout[@index='1']//android.widget.Button[@index='3' and @text='" +
            Constants.send + "']");

    public static By button_surrender = By.xpath("//android.view.ViewGroup[@index='0']" +
            "//android.widget.FrameLayout[@index='1']//android.widget.Button[@index='4' and @text='" +
            Constants.surrender + "']");

    public static By button_start_over = By.xpath("//android.view.ViewGroup[@index='0']" +
            "//android.widget.FrameLayout[@index='1']//android.widget.Button[@index='1' and @text='" +
            Constants.start_over + "']");

    public static By button_back_to_menu = By.xpath("//android.view.ViewGroup[@index='0']" +
            "//android.widget.FrameLayout[@index='1']//android.widget.Button[@index='2' and @text='" +
            Constants.back_to_menu + "']");

    public static By button = By.xpath("//android.view.ViewGroup[@index='0']" +
            "//android.widget.FrameLayout[@index='1']//android.widget.Button");

    public static By input_in_start_game = By.xpath("//android.view.ViewGroup[@index='0']" +
            "//android.widget.FrameLayout[@index='1']//android.widget.EditText[@index='2']");

    public static By title = By.xpath("//android.view.ViewGroup[@index='0']" +
            "//android.widget.FrameLayout[@index='0']//android.widget.TextView[@index='0']");

    public static By label_rights_reserved = By.xpath("//android.view.ViewGroup[@index='0']" +
            "//android.widget.FrameLayout[@index='1']//android.widget.TextView[@index='0']");

    public static By label_info_new_game = By.xpath("//android.view.ViewGroup[@index='0']" +
            "//android.widget.FrameLayout[@index='1']//android.widget.TextView[@index='0']");

    public static By label_warning_new_game = By.xpath("//android.view.ViewGroup[@index='0']" +
            "//android.widget.FrameLayout[@index='1']//android.widget.TextView[@index='1']");

    public static By label_lost_win = By.xpath("//android.view.ViewGroup[@index='0']" +
            "//android.widget.FrameLayout[@index='1']//android.widget.TextView[@index='0']");

    public static By get_button_by_index(int button_index){
        return By.xpath("//android.view.ViewGroup[@index='0']" +
                "//android.widget.FrameLayout[@index='1']//android.widget.Button[@index='"+ button_index +"']");
    }

    public static By get_label_by_index(int button_index){
        return By.xpath("//android.widget.FrameLayout[@index='1']//" +
                "android.widget.TextView[@index='"+ button_index +"']");
    }


}
