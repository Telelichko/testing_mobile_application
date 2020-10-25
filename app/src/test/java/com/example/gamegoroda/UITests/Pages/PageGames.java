package com.example.gamegoroda.UITests.Pages;

import com.example.gamegoroda.UITests.CommonMethods;
import com.example.gamegoroda.UITests.Constants;
import com.example.gamegoroda.UITests.DomHelper;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.util.List;

import io.appium.java_client.AppiumDriver;

public class PageGames {

    AppiumDriver driver;

    @Before
    public void setUp(){
        CommonMethods.setUp();
    }

    @Test
    public void test_games_page_buttons_exist() throws Exception {
        CommonMethods.go_to_game_page();

        CommonMethods.wait_element(DomHelper.button);
        List<WebElement> new_buttons = driver.findElements(DomHelper.button);
        System.out.print("new_buttons.size() = " + new_buttons.size());

        Assert.assertTrue("Games page. There isn't 3 buttons on it",
                new_buttons.size() == 3);
    }

    @Test
    public void test_games_page_button_cities_exist() throws Exception {
        CommonMethods.go_to_game_page();

        WebElement button_cities = CommonMethods.wait_element(DomHelper.button_cities);

        Assert.assertNotNull("Game page. There isn't button \""+ button_cities.getText() +"\" on it.",
                button_cities);
    }

    @Test
    public void test_games_page_button_cities_clickable() throws Exception {
        CommonMethods.go_to_game_page();

        WebElement button_cities = CommonMethods.wait_element(DomHelper.button_cities);

        String button_cities_clickable_str = button_cities.getAttribute("clickable");

        Assert.assertEquals("Game page. Button \"" + button_cities.getText() + "\" isn't clickable.",
                "true", button_cities_clickable_str);
    }

    @Test
    public void test_games_page_button_cities_name() throws Exception {
        CommonMethods.go_to_game_page();

        String expected_text = Constants.cities;
        String button_cities_text = CommonMethods.wait_element(DomHelper.get_button_by_index(0)).getText();

        Assert.assertEquals("Game page. Expected button text " + expected_text +
                " does not match actual text" + button_cities_text + ".",
                expected_text, button_cities_text);
    }

    @Test
    public void test_games_page_button_countries_exist() throws Exception {
        CommonMethods.go_to_game_page();

        WebElement button_countries = CommonMethods.wait_element(DomHelper.button_countries);

        Assert.assertNotNull("Game page. There isn't button \""+ button_countries.getText() +"\" on it.",
                button_countries);
    }

    @Test
    public void test_games_page_button_countries_clickable() throws Exception {
        CommonMethods.go_to_game_page();

        WebElement button_countries = CommonMethods.wait_element(DomHelper.button_countries);

        String button_countries_clickable_str = button_countries.getAttribute("clickable");

        Assert.assertEquals("Game page. Button \"" + button_countries.getText() + "\" isn't clickable.",
                "true", button_countries_clickable_str);
    }

    @Test
    public void test_games_page_button_countries_name() throws Exception {
        CommonMethods.go_to_game_page();

        String expected_text = Constants.countries;
        String button_countries_text = CommonMethods.wait_element(DomHelper.get_button_by_index(1)).getText();

        Assert.assertEquals("Game page. Expected button text " + expected_text +
                " does not match actual text" + button_countries_text + ".",
                expected_text, button_countries_text);
    }

    @Test
    public void test_games_page_button_names_exist() throws Exception {
        CommonMethods.go_to_game_page();

        WebElement button_names = CommonMethods.wait_element(DomHelper.button_names);

        Assert.assertNotNull("Game page. There isn't button \""+ button_names.getText() +"\" on it.",
                button_names);
    }

    @Test
    public void test_games_page_button_names_clickable() throws Exception {
        CommonMethods.go_to_game_page();

        WebElement button_names = CommonMethods.wait_element(DomHelper.button_names);

        String button_names_clickable_str = button_names.getAttribute("clickable");

        Assert.assertEquals("Game page. Button \"" + button_names.getText() + "\" isn't clickable.",
                "true", button_names_clickable_str);
    }

    @Test
    public void test_games_page_button_names_name() throws Exception {
        CommonMethods.go_to_game_page();

        String expected_text = Constants.names;
        String button_names_text = CommonMethods.wait_element(DomHelper.get_button_by_index(2)).getText();

        Assert.assertEquals("Game page. Expected button text " + expected_text +
                " does not match actual text" + button_names_text + ".",
                expected_text, button_names_text);
    }

    @After
    public void End() {
        CommonMethods.End();
    }
}
