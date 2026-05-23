package org.testleaf.day6;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This class demonstrates web table handling using Selenium.
 * It navigates to the erail.in website, searches for trains between two
 * stations (MAS and Mdu),
 * retrieves train names from the results table, and identifies duplicate train
 * entries.
 */
public class learnwebtable {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://erail.in/");
        WebElement fromstation = driver.findElement(By.xpath("//input[@id='txtStationFrom']"));// driver.findElement(By.id("txtStationFrom")).sendKeys("MAS");
        fromstation.clear();
        fromstation.sendKeys("MAS", Keys.ENTER);
        WebElement toStation = driver.findElement(By.xpath("//input[@id='txtStationTo']"));// driver.findElement(By.id("txtStationTo")).sendKeys("MAS");
        toStation.clear();
        toStation.sendKeys("Mdu", Keys.ENTER);
        WebElement sortonDate = driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']"));
        if (sortonDate.isSelected()) {
            sortonDate.click();
        }
        // Retrieve table data
        List<WebElement> trains = driver.findElements(
                By.xpath(
                        "//table[@class = 'DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/td[2]"));
        List<String> trainNames = new ArrayList<>();
        List<String> DuplicateTrainNames = new ArrayList<>();

        // Print train names
        for (WebElement eachTrain : trains) {
            String trainName = eachTrain.getText();
            System.out.println(eachTrain.getText());
            trainNames.add(trainName);
        }
        for (int i = 0; i < trainNames.size(); i++) {

            for (int j = i + 1; j < trainNames.size(); j++) {

                if (trainNames.get(i).equals(trainNames.get(j))) {

                    System.out.println(trainNames.get(i));
                    DuplicateTrainNames.add(trainNames.get(i));
                }
            }
        }
        System.out.println("List of duplicate train names: " + DuplicateTrainNames);
        if (DuplicateTrainNames.size() > 0) {
            System.out.println("There are duplicate train names in the list.");
        } else {
            System.out.println("There are no duplicate train names in the list.");
        }
        driver.quit();
    }

}
