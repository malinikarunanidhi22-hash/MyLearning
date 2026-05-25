package org.testleaf.day7;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class AmazonActions {
public static void main(String[] args) throws IOException  
{
      ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.amazon.in/");
        WebElement condition = driver.findElement(By.linkText("Conditions of Use & Sale"));
        Actions action = new Actions(driver);
        action.scrollToElement(condition).perform();
        String text = condition.getText();
        System.out.println(text);
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File des = new File("./snaps/amazon.png");
        FileUtils.copyFile(src, des);
        System.out.println("Screenshot taken successfully");
        driver.quit();

    }

}
