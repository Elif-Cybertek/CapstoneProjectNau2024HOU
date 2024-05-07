package com.amazon.tests;

import com.amazon.pages.RadioButtonPage;
import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest {

        RadioButtonPage radioButtonPage = new RadioButtonPage();
        @Test
        public void radioButtonTest(){
                Driver.getDriver().get("https://www.amazon.com/customer-preferences/edit?ie=UTF8&preferencesReturnUrl=%2F&ref_=topnav_lang");
                Assert.assertTrue(radioButtonPage.radioButton.isSelected());



        }
}

