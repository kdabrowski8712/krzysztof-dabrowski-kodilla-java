package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    private final static String XPATH_FIRSTNAME = "//input[@name=\"firstname\"]";
    private final static String XPATH_LASTNAME = "//input[@name=\"lastname\"]";
    private final static String XPATH_PHONE = "//input[@name=\"reg_email__\"]";
    private final static String XPATH_PASS = "//input[@name=\" reg_passwd__\"]";

    private final static String XPATH_DAY = "//span[@id=\"u_0_z\"]/span/select[1]";
    private final static String XPATH_MONTH = "//span[@id=\"u_0_z\"]/span/select[2]";
    private final static String XPATH_YEAR = "//span[@id=\"u_0_z\"]/span/select[3]";


    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.Chrome);
        driver.get("https://www.facebook.com/");

        WebElement selectDayCombo = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(selectDayCombo);
        selectDay.selectByIndex(12);

        WebElement selectmonthCombo = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(selectmonthCombo);
        selectMonth.selectByIndex(11);

        WebElement selectYearCombo = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(selectYearCombo);
        selectYear.selectByValue("1987");


//        WebElement firstnameField = driver.findElement(By.xpath(XPATH_FIRSTNAME));
//        firstnameField.sendKeys("Krzysztof");
//
//        WebElement lastnameField = driver.findElement(By.xpath(XPATH_LASTNAME));
//        lastnameField.sendKeys("Dabrowski");
//
//        WebElement phoneField = driver.findElement(By.xpath(XPATH_PHONE));
//        phoneField.sendKeys("123123123");
//
//        WebElement passField = driver.findElement(By.xpath(XPATH_PASS));
//        passField.sendKeys("P@ssw0rd");


//        // searchField.submit();
//
//        WebElement textareaField = driver.findElement(By.xpath(XPATH_TEXTAREA));
//        textareaField.sendKeys("New robotic content");
//
//        while (!driver.findElement(By.xpath(XPATH_SELECT)).isDisplayed());
//
//        WebElement selectCombo = driver.findElement(By.xpath(XPATH_SELECT));
//        Select selectBoard = new Select(selectCombo);
//        selectBoard.selectByIndex(1);
    }
}
