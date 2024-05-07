package com.amazon.tests;

import com.amazon.pages.SignInPage;
import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PositiveTesting {
    SignInPage signInPage = new SignInPage();


    @Test
    public void positiveTesting() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        signInPage.signIn.click();


        signInPage.email.sendKeys("4055892609"+ Keys.ENTER);

        signInPage.password.sendKeys("Artvin08"+Keys.ENTER);//Artvin08


    }
}