package com.amazon.tests;

import com.amazon.pages.AmazonSearch;
import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.amazon.pages.AmazonSearch;
import com.amazon.utilities.ConfigurationReader;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class AmazonSearchTest {
    AmazonSearch amazonSearch = new AmazonSearch();

    @Test
    public void amazonSearchTest() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        amazonSearch.searchBox.sendKeys("apple" + Keys.ENTER);

        System.out.println(Driver.getDriver().getTitle());
        Assert.assertEquals(Driver.getDriver().getTitle(), "Amazon.com : apple");
    }
}
