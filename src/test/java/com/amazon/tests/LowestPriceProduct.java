package com.amazon.tests;

import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LowestPriceProduct {
    public static void main(String[] args) {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        // Search for "pen"
        Driver.getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys("pen");
        Driver.getDriver().findElement(By.id("nav-search-submit-button")).click();

        // Wait for the search results to load


        // Find all the products on the page
        List<WebElement> products = Driver.getDriver().findElements(By.cssSelector("div[data-component-type='s-search-result']"));

        double minPrice = Double.MAX_VALUE;
        WebElement selectedProduct = null;

        // Iterate through each product to find the one with the lowest price
        for (WebElement product : products) {
            try {
                WebElement priceElement = product.findElement(By.cssSelector(".a-price-whole"));
                String priceText = priceElement.getText().replace(",", ""); // Remove any comma in the price
                double price = Double.parseDouble(priceText);
                if (price < minPrice) {
                    minPrice = price;
                    selectedProduct = product;
                }
            } catch (NumberFormatException e) {
                // Price not found or not in valid format
            }
        }

        // Print the title and price of the product with the lowest price
        if (selectedProduct != null) {
            WebElement titleElement = selectedProduct.findElement(By.cssSelector("h2 a"));
            String title = titleElement.getText();
            System.out.println("Title: " + title);
            System.out.println("Price: $" + minPrice);

            // Click on the selected product to open it in the browser
            titleElement.click();
        } else {
            System.out.println("No products found");
        }

        // Close the browser after some delay to allow viewing
        try {
            Thread.sleep(5000); // Wait for 5 seconds before closing the browser
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
    }


