package com.amazon.tests;

import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AmazonSortProductTest {
    @Test
    public void amazonSortProductTest() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        // Find search box and enter a product to search
        WebElement searchBox = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("smartwatch");
        searchBox.submit();

        // Find the 'Sort By' dropdown
        WebElement sortDropdown = Driver.getDriver().findElement(By.className("a-dropdown-prompt"));

        // Click on the 'Sort By' dropdown to display the options
        sortDropdown.click();


        // Find the 'Price: Low to High' option and click on it
        WebElement lowToHighOption = Driver.getDriver().findElement(By.id("s-result-sort-select_1"));
        lowToHighOption.click();


        }
        }

