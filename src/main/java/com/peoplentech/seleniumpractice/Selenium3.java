package com.peoplentech.seleniumpractice;

public class Selenium3 extends TestBase {


    public static void main(String[] args) {
        validateUserCanTypeOnSearchBar();
    }

    public static void validateUserCanTypeOnSearchBar() {
        setupDriver();
        navigateToURL("https://www.ebay.com");

        //
        //

        sleepFor(2);
        closeDriver();
    }
}
