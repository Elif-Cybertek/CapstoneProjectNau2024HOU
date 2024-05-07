package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPage {
    public CheckBoxPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy(css =" .a-icon a-icon-checkbox")
    public WebElement checkBox;
}
