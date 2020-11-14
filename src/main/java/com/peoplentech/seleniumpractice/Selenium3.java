package com.peoplentech.seleniumpractice;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Selenium3 extends TestBase {


    // xpath rules
    //tagName[text()='______'] ---> text
    //tagName[@attribute='_____'] --->id/class/aria-label etc


    @Test
    public static void validateUserCanTypeOnSearchBar() {
        setupDriver();
        navigateToURL("https://www.ebay.com");

        driver.findElement(By.id("gh-ac")).sendKeys("Java Books");
        // driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Java Books");

        sleepFor(2);
        closeDriver();
    }


    @Test
    public static void validateUserCanTypeOnSearchBarAndClickSearchButton() {
        setupDriver();
        navigateToURL("https://www.ebay.com");

        driver.findElement(By.id("gh-ac")).sendKeys("Java Books");
        // driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Java Books");

        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();

        sleepFor(2);
        closeDriver();
    }
}
