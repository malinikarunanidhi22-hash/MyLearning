package org.testleaf.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetreadytocodeSelenium {
public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();

        driver.get("https://leaftaps.com/opentaps/control/main");

        driver.manage().window().maximize();
    }
}
