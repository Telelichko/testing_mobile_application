package com.example.gamegoroda.UITests.Pages;

import com.example.gamegoroda.UITests.CommonMethods;
import com.example.gamegoroda.UITests.Constants;
import com.example.gamegoroda.UITests.DomHelper;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class PageNewGameCountries {

    @Before
    public void setUp(){
        CommonMethods.setUp();
    }

    @Test
    public void test_new_game_countries_page_filling_country() throws Exception {
        CommonMethods.go_to_new_game_page(Constants.countries);

        String country = Constants.default_country;
        String input_last_char = country.substring(country.length() - 1);

        WebElement inputs_in_start_game = CommonMethods.wait_element(DomHelper.input_in_start_game);
        inputs_in_start_game.sendKeys(country);

        WebElement button_send = CommonMethods.wait_element(DomHelper.button_send);
        button_send.click();

        WebElement label_info_new_game = CommonMethods.wait_element(DomHelper.label_info_new_game);
        String output_first_char = label_info_new_game.getText().substring(0, 1).toLowerCase();

        Assert.assertEquals("Start page. Expected text \"" + input_last_char +
                        "\" does not match actual text \"" + output_first_char + "\".",
                input_last_char, output_first_char);
    }

    @Test
    public void test_new_game_countries_page_label_info_exist() throws Exception {
        CommonMethods.go_to_new_game_page(Constants.countries);

        WebElement label_info = CommonMethods.wait_element(DomHelper.label_info_new_game);

        Assert.assertNotNull("New game page. There isn't button \""+ label_info.getText() +"\" on it.",
                label_info);
    }

    @Test
    public void test_new_game_countries_page_label_info_name() throws Exception {
        CommonMethods.go_to_new_game_page(Constants.countries);

        String expected_text = Constants.enter_word;
        String label_info_text = CommonMethods.wait_element(DomHelper.get_label_by_index(0)).getText();

        Assert.assertEquals("Game page. Expected button text " + expected_text +
                        " does not match actual text" + label_info_text + ".",
                expected_text, label_info_text);
    }

    @Test
    public void test_new_game_countries_page_label_warning_exist() throws Exception {
        CommonMethods.go_to_new_game_page(Constants.countries);

        WebElement label_warning = CommonMethods.wait_element(DomHelper.label_warning_new_game);

        Assert.assertNotNull("New game page. There isn't button \""+ label_warning.getText() +"\" on it.",
                label_warning);
    }

    @Test
    public void test_new_game_countries_page_label_warning_name_before_mistake() throws Exception {
        CommonMethods.go_to_new_game_page(Constants.countries);

        String expected_text = "";
        String label_warning_text = CommonMethods.wait_element(DomHelper.get_label_by_index(1)).getText();

        Assert.assertEquals("Game page. Expected button text " + expected_text +
                        " does not match actual text" + label_warning_text + ".",
                expected_text, label_warning_text);
    }

    @Test
    public void test_new_game_countries_page_label_warning_name_after_mistake() throws Exception {
        CommonMethods.go_to_new_game_page(Constants.countries);

        String expected_text = Constants.warning_text;

        WebElement inputs_in_start_game = CommonMethods.wait_element(DomHelper.input_in_start_game);
        inputs_in_start_game.sendKeys(Constants.country_to_get_warning);

        WebElement button_send = CommonMethods.wait_element(DomHelper.button_send);
        button_send.click();

        String label_warning_text = CommonMethods.wait_element(DomHelper.get_label_by_index(1)).getText();

        Assert.assertEquals("Game page. Expected button text " + expected_text +
                        " does not match actual text" + label_warning_text + ".",
                expected_text, label_warning_text);
    }

    @Test
    public void test_new_game_countries_page_input_words_exist() throws Exception {
        CommonMethods.go_to_new_game_page(Constants.countries);

        WebElement input_words = CommonMethods.wait_element(DomHelper.input_in_start_game);

        Assert.assertNotNull("New game page. There isn't input on it.", input_words);
    }

    @Test
    public void test_new_game_countries_page_button_send_exist() throws Exception {
        CommonMethods.go_to_new_game_page(Constants.countries);

        WebElement button_send = CommonMethods.wait_element(DomHelper.button_send);

        Assert.assertNotNull("New game page. There isn't button \""+ button_send.getText() +"\" on it.",
                button_send);
    }

    @Test
    public void test_new_game_countries_page_button_send_clickable() throws Exception {
        CommonMethods.go_to_new_game_page(Constants.countries);

        WebElement button_send = CommonMethods.wait_element(DomHelper.button_send);

        String button_send_clickable_str = button_send.getAttribute("clickable");

        Assert.assertEquals("Game page. Button \"" + button_send.getText() + "\" isn't clickable.",
                "true", button_send_clickable_str);
    }

    @Test
    public void test_new_game_countries_page_button_send_name() throws Exception {
        CommonMethods.go_to_new_game_page(Constants.countries);

        String expected_text = Constants.send;
        String button_send_text = CommonMethods.wait_element(DomHelper.get_button_by_index(3)).getText();

        Assert.assertEquals("Game page. Expected button text " + expected_text +
                        " does not match actual text" + button_send_text + ".",
                expected_text, button_send_text);
    }

    @Test
    public void test_new_game_countries_page_button_surrender_exist() throws Exception {
        CommonMethods.go_to_new_game_page(Constants.countries);

        WebElement button_surrender = CommonMethods.wait_element(DomHelper.button_surrender);

        Assert.assertNotNull("New game page. There isn't button \""+ button_surrender.getText() +"\" on it.",
                button_surrender);
    }

    @Test
    public void test_new_game_countries_page_button_surrender_clickable() throws Exception {
        CommonMethods.go_to_new_game_page(Constants.countries);

        WebElement button_surrender = CommonMethods.wait_element(DomHelper.button_surrender);

        String button_surrender_clickable_str = button_surrender.getAttribute("clickable");

        Assert.assertEquals("Game page. Button \"" + button_surrender.getText() + "\" isn't clickable.",
                "true", button_surrender_clickable_str);
    }

    @Test
    public void test_new_game_countries_page_button_surrender_name() throws Exception {
        CommonMethods.go_to_new_game_page(Constants.countries);

        String expected_text = Constants.surrender;
        String button_surrender_text = CommonMethods.wait_element(DomHelper.get_button_by_index(4)).getText();

        Assert.assertEquals("Game page. Expected button text " + expected_text +
                        " does not match actual text" + button_surrender_text + ".",
                expected_text, button_surrender_text);
    }

    @After
    public void End() {
        CommonMethods.End();
    }
}
