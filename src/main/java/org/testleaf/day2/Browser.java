package org.testleaf.day2;

public class Browser {
    public String launchBrowser(String browserName) {
        System.out.println(browserName + " browser launched successfully");
        return browserName;
    }

    public void loadUrl() {
        System.out.println("Application url loaded sucessfully");
    }

    public static void main(String[] args) {
        Browser object = new Browser();
        object.launchBrowser("Edge");
        object.loadUrl();
    }
}