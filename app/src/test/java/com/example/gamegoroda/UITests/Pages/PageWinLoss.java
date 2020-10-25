package com.example.gamegoroda.UITests.Pages;

import com.example.gamegoroda.UITests.CommonMethods;
import com.example.gamegoroda.UITests.Constants;
import com.example.gamegoroda.UITests.DomHelper;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class PageWinLoss {

    @Before
    public void setUp(){
        CommonMethods.setUp();
    }

    // From cities game
    @Test
    public void test_win_loss_page_from_cities_game_label_lost_win_exist() throws Exception {
        CommonMethods.go_to_win_loss_page(Constants.cities);

        WebElement label_lost_win = CommonMethods.wait_element(DomHelper.label_lost_win);

        Assert.assertNotNull("New game page. There isn't button \""+ label_lost_win.getText() +"\" on it.",
                label_lost_win);
    }

    @Test
    public void test_win_loss_page_from_cities_game_label_lost_win_name_lost() throws Exception {
        CommonMethods.go_to_win_loss_page(Constants.cities);

        String expected_text = Constants.lost;
        String label_lost_win_text = CommonMethods.wait_element(DomHelper.get_label_by_index(0)).getText();

        Assert.assertEquals("Game page. Expected button text " + expected_text +
                " does not match actual text" + label_lost_win_text + ".",
                expected_text, label_lost_win_text);
    }

    @Test
    public void test_win_loss_page_from_cities_game_label_lost_win_name_win() throws Exception {
        CommonMethods.go_to_new_game_page(Constants.cities);

        String city = Constants.city_to_win;

        WebElement inputs_in_start_game = CommonMethods.wait_element(DomHelper.input_in_start_game);
        inputs_in_start_game.sendKeys(city);

        WebElement button_send = CommonMethods.wait_element(DomHelper.button_send);
        button_send.click();

        boolean element_disappear = CommonMethods.getting_opposite_visible(DomHelper.button_send, true);
        if(!element_disappear){
            throw new Exception("Button \""+ button_send.getText() +"\" doesn't disappear.");
        }

        String expected_text = Constants.win;
        String label_lost_win_text = CommonMethods.wait_element(DomHelper.get_label_by_index(0)).getText();

        Assert.assertEquals("Game page. Expected button text " + expected_text +
                " does not match actual text" + label_lost_win_text + ".",
                expected_text, label_lost_win_text);
    }

    @Test
    public void test_win_loss_page_from_cities_game_button_start_over_exist() throws Exception {
        CommonMethods.go_to_win_loss_page(Constants.cities);

        WebElement button_start_over = CommonMethods.wait_element(DomHelper.button_start_over);

        Assert.assertNotNull("New game page. There isn't button \""+ button_start_over.getText() +"\" on it.",
                button_start_over);
    }

    @Test
    public void test_win_loss_page_from_cities_game_button_start_over_clickable() throws Exception {
        CommonMethods.go_to_win_loss_page(Constants.cities);

        WebElement button_start_over = CommonMethods.wait_element(DomHelper.button_start_over);

        String button_start_over_clickable_str = button_start_over.getAttribute("clickable");

        Assert.assertEquals("Game page. Button \"" + button_start_over.getText() + "\" isn't clickable.",
                "true", button_start_over_clickable_str);
    }

    @Test
    public void test_win_loss_page_from_cities_game_button_start_over_name() throws Exception {
        CommonMethods.go_to_win_loss_page(Constants.cities);

        String expected_text = Constants.start_over;
        String button_start_over_text = CommonMethods.wait_element(DomHelper.get_button_by_index(1)).getText();

        Assert.assertEquals("Game page. Expected button text " + expected_text +
                " does not match actual text" + button_start_over_text + ".",
                expected_text, button_start_over_text);
    }

    @Test
    public void test_win_loss_page_from_cities_game_button_back_to_menu_exist() throws Exception {
        CommonMethods.go_to_win_loss_page(Constants.cities);

        WebElement button_back_to_menu = CommonMethods.wait_element(DomHelper.button_back_to_menu);

        Assert.assertNotNull("New game page. There isn't button \""+ button_back_to_menu.getText() +"\" on it.",
                button_back_to_menu);
    }

    @Test
    public void test_win_loss_page_from_cities_game_button_back_to_menu_clickable() throws Exception {
        CommonMethods.go_to_win_loss_page(Constants.cities);

        WebElement button_back_to_menu = CommonMethods.wait_element(DomHelper.button_back_to_menu);

        String button_back_to_menu_clickable_str = button_back_to_menu.getAttribute("clickable");

        Assert.assertEquals("Game page. Button \"" + button_back_to_menu.getText() + "\" isn't clickable.",
                "true", button_back_to_menu_clickable_str);
    }

    @Test
    public void test_win_loss_page_from_cities_game_button_back_to_menu_name() throws Exception {
        CommonMethods.go_to_win_loss_page(Constants.cities);

        String expected_text = Constants.back_to_menu;
        String button_back_to_menu_text = CommonMethods.wait_element(DomHelper.get_button_by_index(2)).getText();

        Assert.assertEquals("Game page. Expected button text " + expected_text +
                " does not match actual text" + button_back_to_menu_text + ".",
                expected_text, button_back_to_menu_text);
    }

    // From countries game
    @Test
    public void test_win_loss_page_from_countries_game_label_lost_win_exist() throws Exception {
        CommonMethods.go_to_win_loss_page(Constants.countries);

        WebElement label_lost_win = CommonMethods.wait_element(DomHelper.label_lost_win);

        Assert.assertNotNull("New game page. There isn't button \""+ label_lost_win.getText() +"\" on it.",
                label_lost_win);
    }

    @Test
    public void test_win_loss_page_from_countries_game_label_lost_win_name_lost() throws Exception {
        CommonMethods.go_to_win_loss_page(Constants.countries);

        String expected_text = Constants.lost;
        String label_lost_win_text = CommonMethods.wait_element(DomHelper.get_label_by_index(0)).getText();

        Assert.assertEquals("Game page. Expected button text " + expected_text +
                " does not match actual text" + label_lost_win_text + ".",
                expected_text, label_lost_win_text);
    }

    @Test
    public void test_win_loss_page_from_countries_game_label_lost_win_name_win() throws Exception {
        CommonMethods.go_to_new_game_page(Constants.countries);

        String country = Constants.country_to_win;

        WebElement inputs_in_start_game = CommonMethods.wait_element(DomHelper.input_in_start_game);
        inputs_in_start_game.sendKeys(country);

        WebElement button_send = CommonMethods.wait_element(DomHelper.button_send);
        button_send.click();

        boolean element_disappear = CommonMethods.getting_opposite_visible(DomHelper.button_send, true);
        if(!element_disappear){
            throw new Exception("Button \""+ button_send.getText() +"\" doesn't disappear.");
        }

        String expected_text = Constants.win;
        String label_lost_win_text = CommonMethods.wait_element(DomHelper.get_label_by_index(0)).getText();

        Assert.assertEquals("Game page. Expected button text " + expected_text +
                " does not match actual text" + label_lost_win_text + ".",
                expected_text, label_lost_win_text);
    }

    @Test
    public void test_win_loss_page_from_countries_game_button_start_over_exist() throws Exception {
        CommonMethods.go_to_win_loss_page(Constants.countries);

        WebElement button_start_over = CommonMethods.wait_element(DomHelper.button_start_over);

        Assert.assertNotNull("New game page. There isn't button \""+ button_start_over.getText() +"\" on it.",
                button_start_over);
    }

    @Test
    public void test_win_loss_page_from_countries_game_button_start_over_clickable() throws Exception {
        CommonMethods.go_to_win_loss_page(Constants.countries);

        WebElement button_start_over = CommonMethods.wait_element(DomHelper.button_start_over);

        String button_start_over_clickable_str = button_start_over.getAttribute("clickable");

        Assert.assertEquals("Game page. Button \"" + button_start_over.getText() + "\" isn't clickable.",
                "true", button_start_over_clickable_str);
    }

    @Test
    public void test_win_loss_page_from_countries_game_button_start_over_name() throws Exception {
        CommonMethods.go_to_win_loss_page(Constants.countries);

        String expected_text = Constants.start_over;
        String button_start_over_text = CommonMethods.wait_element(DomHelper.get_button_by_index(1)).getText();

        Assert.assertEquals("Game page. Expected button text " + expected_text +
                        " does not match actual text" + button_start_over_text + ".",
                expected_text, button_start_over_text);
    }

    @Test
    public void test_win_loss_page_from_countries_game_button_back_to_menu_exist() throws Exception {
        CommonMethods.go_to_win_loss_page(Constants.countries);

        WebElement button_back_to_menu = CommonMethods.wait_element(DomHelper.button_back_to_menu);

        Assert.assertNotNull("New game page. There isn't button \""+ button_back_to_menu.getText() +"\" on it.",
                button_back_to_menu);
    }

    @Test
    public void test_win_loss_page_from_countries_game_button_back_to_menu_clickable() throws Exception {
        CommonMethods.go_to_win_loss_page(Constants.countries);

        WebElement button_back_to_menu = CommonMethods.wait_element(DomHelper.button_back_to_menu);

        String button_back_to_menu_clickable_str = button_back_to_menu.getAttribute("clickable");

        Assert.assertEquals("Game page. Button \"" + button_back_to_menu.getText() + "\" isn't clickable.",
                "true", button_back_to_menu_clickable_str);
    }

    @Test
    public void test_win_loss_page_from_countries_game_button_back_to_menu_name() throws Exception {
        CommonMethods.go_to_win_loss_page(Constants.countries);

        String expected_text = Constants.back_to_menu;
        String button_back_to_menu_text = CommonMethods.wait_element(DomHelper.get_button_by_index(2)).getText();

        Assert.assertEquals("Game page. Expected button text " + expected_text +
                " does not match actual text" + button_back_to_menu_text + ".",
                expected_text, button_back_to_menu_text);
    }

    // From names game
    @Test
    public void test_win_loss_page_from_names_game_label_lost_win_exist() throws Exception {
        CommonMethods.go_to_win_loss_page(Constants.names);

        WebElement label_lost_win = CommonMethods.wait_element(DomHelper.label_lost_win);

        Assert.assertNotNull("New game page. There isn't button \""+ label_lost_win.getText() +"\" on it.",
                label_lost_win);
    }

    @Test
    public void test_win_loss_page_from_names_game_label_lost_win_name_lost() throws Exception {
        CommonMethods.go_to_win_loss_page(Constants.names);

        String expected_text = Constants.lost;
        String label_lost_win_text = CommonMethods.wait_element(DomHelper.get_label_by_index(0)).getText();

        Assert.assertEquals("Game page. Expected button text " + expected_text +
                " does not match actual text" + label_lost_win_text + ".",
                expected_text, label_lost_win_text);
    }

    @Test
    public void test_win_loss_page_from_names_game_label_lost_win_name_win() throws Exception {
        CommonMethods.go_to_new_game_page(Constants.names);

        String name = Constants.name_to_win;

        WebElement inputs_in_start_game = CommonMethods.wait_element(DomHelper.input_in_start_game);
        inputs_in_start_game.sendKeys(name);

        WebElement button_send = CommonMethods.wait_element(DomHelper.button_send);
        button_send.click();

        boolean element_disappear = CommonMethods.getting_opposite_visible(DomHelper.button_send, true);
        if(!element_disappear){
            throw new Exception("Button \""+ button_send.getText() +"\" doesn't disappear.");
        }

        String expected_text = Constants.win;
        String label_lost_win_text = CommonMethods.wait_element(DomHelper.get_label_by_index(0)).getText();

        Assert.assertEquals("Game page. Expected button text " + expected_text +
                " does not match actual text" + label_lost_win_text + ".",
                expected_text, label_lost_win_text);
    }

    @Test
    public void test_win_loss_page_from_names_game_button_start_over_exist() throws Exception {
        CommonMethods.go_to_win_loss_page(Constants.names);

        WebElement button_start_over = CommonMethods.wait_element(DomHelper.button_start_over);

        Assert.assertNotNull("New game page. There isn't button \""+ button_start_over.getText() +"\" on it.",
                button_start_over);
    }

    @Test
    public void test_win_loss_page_from_names_game_button_start_over_clickable() throws Exception {
        CommonMethods.go_to_win_loss_page(Constants.names);

        WebElement button_start_over = CommonMethods.wait_element(DomHelper.button_start_over);

        String button_start_over_clickable_str = button_start_over.getAttribute("clickable");

        Assert.assertEquals("Game page. Button \"" + button_start_over.getText() + "\" isn't clickable.",
                "true", button_start_over_clickable_str);
    }

    @Test
    public void test_win_loss_page_from_names_game_button_start_over_name() throws Exception {
        CommonMethods.go_to_win_loss_page(Constants.names);

        String expected_text = Constants.start_over;
        String button_start_over_text = CommonMethods.wait_element(DomHelper.get_button_by_index(1)).getText();

        Assert.assertEquals("Game page. Expected button text " + expected_text +
                " does not match actual text" + button_start_over_text + ".",
                expected_text, button_start_over_text);
    }

    @Test
    public void test_win_loss_page_from_names_game_button_back_to_menu_exist() throws Exception {
        CommonMethods.go_to_win_loss_page(Constants.names);

        WebElement button_back_to_menu = CommonMethods.wait_element(DomHelper.button_back_to_menu);

        Assert.assertNotNull("New game page. There isn't button \""+ button_back_to_menu.getText() +"\" on it.",
                button_back_to_menu);
    }

    @Test
    public void test_win_loss_page_from_names_game_button_back_to_menu_clickable() throws Exception {
        CommonMethods.go_to_win_loss_page(Constants.names);

        WebElement button_back_to_menu = CommonMethods.wait_element(DomHelper.button_back_to_menu);

        String button_back_to_menu_clickable_str = button_back_to_menu.getAttribute("clickable");

        Assert.assertEquals("Game page. Button \"" + button_back_to_menu.getText() + "\" isn't clickable.",
                "true", button_back_to_menu_clickable_str);
    }

    @Test
    public void test_win_loss_page_from_names_game_button_back_to_menu_name() throws Exception {
        CommonMethods.go_to_win_loss_page(Constants.names);

        String expected_text = Constants.back_to_menu;
        String button_back_to_menu_text = CommonMethods.wait_element(DomHelper.get_button_by_index(2)).getText();

        Assert.assertEquals("Game page. Expected button text " + expected_text +
                " does not match actual text" + button_back_to_menu_text + ".",
                expected_text, button_back_to_menu_text);
    }

    @After
    public void End() {
        CommonMethods.End();
    }
}
