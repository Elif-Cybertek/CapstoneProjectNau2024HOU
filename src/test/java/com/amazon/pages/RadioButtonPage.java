package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonPage {
    public RadioButtonPage() {
        PageFactory.initElements(Driver.getDriver(), this);


    }
    @FindBy(css = "[value = 'en_US']")
    public  WebElement radioButton;
}