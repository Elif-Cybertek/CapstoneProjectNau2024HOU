package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSearch {

    public AmazonSearch(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id= "twotabsearchtextbox")
    public WebElement searchBox;
}
