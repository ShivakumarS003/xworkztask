package com.xworkz.methodOverriding.browsers.firefox;

import com.xworkz.methodOverriding.browsers.browser.Browser;

public class Firefox extends Browser {
    @Override
    public void open() {
        System.out.println("ChromeBrowser: Launching Chrome");
    }

    @Override
    public void loadPage() {
        System.out.println("ChromeBrowser: Page loaded with extensions");
    }

    @Override
    public void refresh() {
        System.out.println("ChromeBrowser: Hard refresh with cache clear");
    }

    @Override
    public void bookmark() {
        System.out.println("ChromeBrowser: Bookmark saved to folder");
    }

    @Override
    public void close() {
        System.out.println("ChromeBrowser: Chrome closed with session restore");
    }
}

