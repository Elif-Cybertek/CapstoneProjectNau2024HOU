package com.amazon.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AmazonSearchBoxHeadless {
    @Test
    public void testAmazonSearchBoxHeadless() {
        // Set ChromeOptions to run in headless mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");

        // Initialize WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize ChromeDriver with headless mode
        WebDriver driver = new ChromeDriver(options);

        // Open Amazon website
        driver.get("https://www.amazon.com");

        // Find search box and enter a product to search
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("smartwatch");
        searchBox.submit();

        // Verify if search results page is displayed
        String pageTitle = driver.getTitle();
        if (pageTitle.contains("smartwatch")) {
            System.out.println("Search results page displayed in headless mode.");
        } else {
            System.out.println("Failed to display search results page in headless mode.");
        }
    }
}