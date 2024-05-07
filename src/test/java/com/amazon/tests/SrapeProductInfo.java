package com.amazon.tests;

import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SrapeProductInfo {
    public static void main(String[] args) {


        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        // Find the search box and enter your query
        WebElement searchBox = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));

        searchBox.sendKeys("smartwatch");

        searchBox.sendKeys(Keys.RETURN);

        // Wait for the search results to load (You might need to add some explicit waits here)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Extract the titles of the search results
        java.util.List<WebElement> searchResults = Driver.getDriver().findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));

        for (WebElement result : searchResults) {
            System.out.println("Title : "+result.getText());
        }
    }
}
