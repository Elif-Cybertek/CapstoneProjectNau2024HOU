package com.amazon.tests;

import com.amazon.pages.SignInPage;
import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AmazonAddToCartTest {
        @Test
        public void amazonAddToCartTest() {


                Driver.getDriver().get(ConfigurationReader.getProperty("url"));

                SignInPage signInPage = new SignInPage();


                        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

                        signInPage.signIn.click();


                        signInPage.email.sendKeys("4055892609"+ Keys.ENTER);

                        signInPage.password.sendKeys("Artvin08"+Keys.ENTER);//Artvin08

                        // Find search box and enter a product to search
                WebElement searchBox = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
                searchBox.sendKeys("smartphone");
                searchBox.submit();

                // Find and click on the first product link
                WebElement firstProductLink = Driver.getDriver().findElement(By.xpath("//div[@data-component-type='s-search-result']//span[@class='a-size-medium a-color-base a-text-normal']"));
                firstProductLink.click();

                // Add the product to cart
                WebElement addToCartButton = Driver.getDriver().findElement(By.id("add-to-cart-button"));
                addToCartButton.click();

                // Verify if the product is added to cart
                WebElement cartCount = Driver.getDriver().findElement(By.id("nav-cart-count"));
                if (cartCount.getText().equals("1")) {
                        System.out.println("Product added to cart successfully.");
                } else {
                        System.out.println("Failed to add product to cart.");
                }

                // Close the browser

                }
        }
