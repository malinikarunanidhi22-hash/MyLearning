package org.testleaf.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Launches the Microsoft Edge browser and navigates to the OpenTaps login page
 * Logs in with the demo CSR credentials.
 * Navigates to CRM/SFA and Create Lead.
 * Fills in company name, first name, and last name.
 * Selects a data source and industry from dropdown menus.
 * Submits the Create Lead form.
 **/
public class createLeadFunction {

    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("DemoCSR");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Malini");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
        WebElement SourceElement = driver.findElement(By.id("createLeadForm_dataSourceId"));
        Select SourceDD = new Select(SourceElement);
        SourceDD.selectByIndex(2);
        WebElement IndustryElement = driver.findElement(By.id("createLeadForm_industryEnumId"));
        Select industrySelect = new Select(IndustryElement);
        industrySelect.selectByIndex(2);
        driver.findElement(By.className("smallSubmit")).click();
    }
}
