package com.amazon.tests;

import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HighestPriceProduct {
    public static void main(String[] args) {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys("pen");
        Driver.getDriver().findElement(By.id("nav-search-submit-button")).click();



        // Find all the products on the page
        List<WebElement> products = Driver.getDriver().findElements(By.cssSelector("div[data-component-type='s-search-result']"));

        //initialize variable to track the product with the highest price
        double maxPrice = Double.MIN_VALUE;
        WebElement selectedProduct = null;

        // Iterate through each product to find the one with the highest price
        for (WebElement product : products) {
            try {
                //find the price element within the product
                WebElement priceElement = product.findElement(By.cssSelector(".a-price-whole"));
               //parse price text
                String priceText = priceElement.getText().replace(",", ""); // Remove any comma in the price
                double price = Double.parseDouble(priceText);
                // Print update maxPrice and selectedProduct to find the one with the highest price
                if (price > maxPrice) {
                    maxPrice = price;
                    selectedProduct = product;
                }
            } catch (NumberFormatException e) {
                // Price not found or not in valid format
            }
        }

        // Print the title and price of the product with the highest price
        if (selectedProduct != null) {
            // Find the title element within the selected product
            WebElement titleElement = selectedProduct.findElement(By.cssSelector("h2 a"));
            //  the title text
            String title = titleElement.getText();
            // Print the title and maxPrice
            System.out.println("Title: " + title);
            System.out.println("Price: $" + maxPrice);

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

