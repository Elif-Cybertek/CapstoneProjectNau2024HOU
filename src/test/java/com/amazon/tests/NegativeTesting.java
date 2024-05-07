package com.amazon.tests;

import com.amazon.pages.SignInPage;
import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class NegativeTesting {
    SignInPage signInPage = new SignInPage();


    @Test
    public void negativeTesting(){

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        signInPage.signIn.click();

        signInPage.email.sendKeys("4055892609"+ Keys.ENTER);

        signInPage.password.sendKeys("ABC"+Keys.ENTER);//Artvin08

        if (signInPage.errorMessage.isDisplayed()) {

            System.out.println("Sign-in failed: " + signInPage.errorMessage.getText());

        } else {

            System.out.println("Sign-in successful");
        }
}}
