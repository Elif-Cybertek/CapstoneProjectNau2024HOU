package com.amazon.tests;

import com.amazon.pages.AmazonSearch;
import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import com.google.common.collect.Multiset;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.awt.*;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortItem {
    public static void main(String[] args) {


        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        WebElement searchBox = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("mobile phones");
        WebElement searchButton = Driver.getDriver().findElement(By.id("nav-search-submit-button"));
        searchButton.click();
        List<WebElement> priceElements = Driver.getDriver().findElements(By.cssSelector("[class = 'a-price-whole']"));
        Map<WebElement, Integer> map = new HashMap<WebElement, Integer>();

        for (int i = 0; i < priceElements.size(); i++) {





        }

        List<Map.Entry<WebElement,Integer>> le = new ArrayList<Map.Entry<WebElement, Integer>>(map.entrySet());
        le.sort(Map.Entry.comparingByValue());

        for(Map.Entry e: le){
            System.out.println(e.getValue());
        }
        le.get(0).getKey().click();







    }
    }

