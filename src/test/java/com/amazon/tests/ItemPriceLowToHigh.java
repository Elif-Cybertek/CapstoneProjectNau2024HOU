package com.amazon.tests;

import com.amazon.pages.AmazonSearch;
import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import com.google.common.collect.Multiset;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class ItemPriceLowToHigh {
    public static void main(String[] args) {


        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys("mobile phone");
        Driver.getDriver().findElement(By.id("nav-search-submit-button")).click();

        // Wait for the search results to load


        // Find all the products on the page
        List<WebElement> products = Driver.getDriver().findElements(By.cssSelector("div[data-component-type='s-search-result']"));

        double highestPrice = 0;
        WebElement highestPriceProduct = null;

        // Loop through the products to find the one with the highest price
        for (WebElement product : products) {
            String priceText = product.findElement(By.cssSelector(".a-price .a-offscreen")).getText();
            double price = Double.parseDouble(priceText.replace("$", ""));
            if (price > highestPrice) {
                highestPrice = price;
                highestPriceProduct = product;
            }
        }

        // Print the name and price of the product with the highest price
        if (highestPriceProduct != null) {
            String productName = highestPriceProduct.findElement(By.cssSelector("span.a-size-medium")).getText().trim();
            System.out.println("Highest price product:");
            System.out.println("Name: " + productName);
            System.out.println("Price: $" + highestPrice);
        } else {
            System.out.println("No products found");
        }


    }
}