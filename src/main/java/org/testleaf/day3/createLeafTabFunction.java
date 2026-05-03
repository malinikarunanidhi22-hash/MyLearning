package org.testleaf.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class createLeafTabFunction {
    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        WebElement usernameTestField = driver.findElement(By.id("username"));
        usernameTestField.sendKeys("DemoCSR");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
    }

}
