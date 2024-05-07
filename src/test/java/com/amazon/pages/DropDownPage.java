package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDownPage {
    public DropDownPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(className = "a-button-text a-declarative")
    public WebElement sizeDropDown;
}
