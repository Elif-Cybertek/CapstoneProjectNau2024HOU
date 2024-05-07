package com.amazon.tests;

import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PrintAllLinks {

    public static void main(String[] args) {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        List<WebElement> allLinks = Driver.getDriver().findElements(By.tagName("a"));

        System.out.println("all links size "+ allLinks.size());

        for (WebElement each : allLinks){

            System.out.println("Text of link: "+ each.getText());

            System.out.println("href values "+ each.getAttribute("href"));
        }
    }



    }
