package com.example.gamegoroda.UITests.Pages;

import com.example.gamegoroda.UITests.CommonMethods;
import com.example.gamegoroda.UITests.Constants;
import com.example.gamegoroda.UITests.DomHelper;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class PageStart {

    @Before
    public void setUp(){
        CommonMethods.setUp();
    }

    @Test
    public void test_start_page_button_new_game_exist() throws Exception {
        WebElement button_start = CommonMethods.wait_element(DomHelper.button);

        Assert.assertNotNull("Start page. There isn't button \""+ button_start.getText() +"\" on it.",
                button_start);
    }

    @Test
    public void test_start_page_button_new_game_clickable() throws Exception {
        WebElement button_new_game = CommonMethods.wait_element(DomHelper.button_new_game);

        String button_start_clickable_str = button_new_game.getAttribute("clickable");

        Assert.assertEquals("Start page. Button \"" + button_new_game.getText() + "\" isn't clickable.",
                "true", button_start_clickable_str);
    }

    @Test
    public void test_start_page_button_new_game_name() throws Exception {
        String expected_text = Constants.new_game;
        String button_start_text = CommonMethods.wait_element(DomHelper.button_new_game).getText();

        Assert.assertEquals("Start page. Expected text " + expected_text +
                " does not match actual text" + button_start_text + ".",
                expected_text, button_start_text);
    }

    @Test
    public void test_start_page_title_exist() throws Exception {
        WebElement title = CommonMethods.wait_element(DomHelper.title);

        Assert.assertNotNull("Start page. Title doesn't exist.", title);
    }

    @Test
    public void test_start_page_title_name() throws Exception {
        String expected_text = Constants.game_name;
        String title_text = CommonMethods.wait_element(DomHelper.title).getText();

        Assert.assertEquals("Start page. Expected text " + expected_text +
                " does not match actual text" + title_text + ".",
                expected_text, title_text);
    }

    @Test
    public void test_start_page_rights_reserved_exist() throws Exception {
        WebElement label_rights_reserved = CommonMethods.wait_element(DomHelper.label_rights_reserved);

        Assert.assertNotNull("Start page. Label \""+ label_rights_reserved.getText() +"\" doesn't exist.",
                label_rights_reserved);
    }

    @Test
    public void test_start_page_rights_reserved_name() throws Exception {
        String expected_text = Constants.rights_reserved;
        String label_rights_reserved_text = CommonMethods.wait_element(DomHelper.label_rights_reserved).getText();

        Assert.assertEquals("Start page. Expected text " + expected_text +
                " does not match actual text" + label_rights_reserved_text + ".",
                expected_text, label_rights_reserved_text);
    }

    @After
    public void End() {
        CommonMethods.End();
    }
}
