package org.testleaf.day2;

public class EdgeBrowser {
    public static void main(String[] args) {
        Browser objBrowser = new Browser();
        objBrowser.launchBrowser("Edge");
        objBrowser.loadUrl();
    }

}
