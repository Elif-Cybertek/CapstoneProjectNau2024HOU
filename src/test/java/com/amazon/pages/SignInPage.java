package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
    public SignInPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id   ="nav-link-accountList")
    public WebElement signIn;

    @FindBy(name = "email")
    public WebElement email;

    @FindBy(id = "ap_password")
    public WebElement password;

    @FindBy(className = "a-alert-heading")
    public WebElement errorMessage;
}
