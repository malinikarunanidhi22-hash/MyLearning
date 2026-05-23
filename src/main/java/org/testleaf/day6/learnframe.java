package org.testleaf.day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This class demonstrates working with iframes and alert handling in Selenium.
 * It navigates to a W3Schools page containing an iframe, switches to the frame,
 * clicks a button to trigger an alert, accepts the alert, and verifies the
 * result.
 */
public class learnframe {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        driver.switchTo().alert().accept();
        String text = driver.findElement(By.id("demo")).getText();
        System.out.println(text);
        if (text.equals("You pressed OK!")) {
            System.out.println("Alert accepted successfully");
        } else {
            System.out.println("Alert acceptance failed");
        }
    }
}
