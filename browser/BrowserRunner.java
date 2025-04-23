package com.xworkz.toString.browser;

public class BrowserRunner {
    public static void main(String[] args) {
        BrowserDto browser = new BrowserDto();
        browser.setName("Google Chrome");
        browser.setVersion(100.0);
        browser.setFree(true);
        browser.setDeveloper("Google");
        browser.setReleaseYear(2008);

        System.out.println(browser);
    }
}
