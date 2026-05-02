package org.testleaf.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class openInstagram {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.co/");
    }
}
