package org.testleaf.day4;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandling {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.irctc.co.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String parentwindow = driver.getWindowHandle();
        System.out.println("Parent window: " + parentwindow);
        driver.findElement(By.xpath("//li[@id='flight']")).click();
        Set<String> handles = driver.getWindowHandles();
        System.out.println(handles);
        for (String winhandles : handles) {
            driver.switchTo().window(winhandles);
        }
        String title = driver.getTitle();

        System.out.println(title);
        driver.switchTo().window(parentwindow);
        driver.close();

    }

}
