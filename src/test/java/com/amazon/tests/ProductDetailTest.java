package com.amazon.tests;

import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ProductDetailTest {



    @Test
    public void testFilterSearchResults() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        WebElement searchBox = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("iphone");
        searchBox.sendKeys(Keys.RETURN);
        try {
            Thread.sleep(3000); // Wait for search results to load
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement availabilityStatus = Driver.getDriver().findElement(By.xpath("//span[@class='a-size-base']"));
        if(availabilityStatus.isDisplayed()){
            System.out.println("successfully");{

            }

                }
            }
        }







