package org.testleaf.day4;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Windowhandlling1 {
    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("DemoCSR");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.xpath("//a[text()='My Home']")).click();
        driver.findElement(By.xpath("//a[text()='Contacts']")).click();
        driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
        driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
       // Set<String> s = driver.getWindowHandles();
        //List<String> l = new ArrayList<String>(s);

    }

}
