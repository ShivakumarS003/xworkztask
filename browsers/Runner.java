package com.xworkz.methodOverriding.browsers;

import com.xworkz.methodOverriding.browsers.browser.Browser;
import com.xworkz.methodOverriding.browsers.firefox.Firefox;

public class Runner {
    public static void main(String[] args) {
        Browser browser = new Browser();
        browser.open();
        browser.loadPage();
        browser.refresh();
        browser.bookmark();
        browser.close();

        Browser browser1 = new Firefox();
        browser1.open();
        browser1.loadPage();
        browser1.refresh();
        browser1.bookmark();
        browser1.close();

        Firefox chrome = new Firefox();
        chrome.open();
        chrome.loadPage();
        chrome.refresh();
        chrome.bookmark();
        chrome.close();
    }
}

