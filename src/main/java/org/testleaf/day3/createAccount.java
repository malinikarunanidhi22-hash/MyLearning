package org.testleaf.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Launches the Microsoft Edge browser with an implicit wait of 10 seconds.
 * Navigates to the OpenTaps login page and logs in with demo CSR credentials.
 * Navigates to CRM/SFA &gt; Accounts &gt; Create Account.
 * Fills in the account name and description.
 * Selects values for Industry, Ownership, Data Source, Marketing Campaign, and
 * State dropdowns.
 * Submits the form and verifies the created account name is displayed on the
 * resulting page.
 * Quits the browser after verification.
 */
public class createAccount {

    public static void main(String[] args) throws Throwable {
        EdgeDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("DemoCSR");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Accounts")).click();
        driver.findElement(By.linkText("Create Account")).click();
        String accountName = "Malini06";
        driver.findElement(By.id("accountName")).sendKeys(accountName);
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
        WebElement industryDropdown = driver.findElement(By.name("industryEnumId"));
        Select industrySelect = new Select(industryDropdown);
        industrySelect.selectByVisibleText("Computer Software");
        WebElement ownershipdropdown = driver.findElement(By.name("ownershipEnumId"));
        Select ownershipSelect = new Select(ownershipdropdown);
        ownershipSelect.selectByVisibleText("S-Corporation");
        WebElement sourcedropdown = driver.findElement(By.name("dataSourceId"));
        Select sourceSelect = new Select(sourcedropdown);
        sourceSelect.selectByValue("LEAD_EMPLOYEE");
        WebElement marketingdropdown = driver.findElement(By.name("marketingCampaignId"));
        Select marketingSelect = new Select(marketingdropdown);
        marketingSelect.selectByIndex(6);
        WebElement statedropdown = driver.findElement(By.name("generalStateProvinceGeoId"));
        Select stateSelect = new Select(statedropdown);
        stateSelect.selectByValue("TX");
        driver.findElement(By.className("smallSubmit")).click();
        String accountNameUI = driver.findElement(By.xpath("//span[contains(text(),'Malini')]")).getText();
        if (accountNameUI.contains(accountName)) {
            System.out.println("Account Name is verified successfully: " + accountNameUI);
        } else {
            System.out.println(
                    "Account Name verification failed. Expected: " + accountName + ", but found: " + accountNameUI);
        }
        driver.quit();
    }

}
