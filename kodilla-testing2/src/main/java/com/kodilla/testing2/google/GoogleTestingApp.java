package com.kodilla.testing2.google;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTestingApp {
    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.Chrome);
        driver.get("https://www.ebay.com/");

        WebElement searchField = driver.findElement(By.id("gh-ac"));
        searchField.sendKeys("Kodilla");
    }
}
