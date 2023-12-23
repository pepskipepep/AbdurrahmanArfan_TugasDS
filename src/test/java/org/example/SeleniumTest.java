package org.example;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

    @Test
    public void loginTest() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("http://www.yopmail.com/");

        WebElement searchBox = driver.findElement(By.id("login"));
        searchBox.sendKeys("automationtest");
        WebElement checkInboxButton = driver.findElement(By.cssSelector("button.md"));
        checkInboxButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.switchTo().frame("ifinbox");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement emailContent = driver.findElement(By.id("iframe#ifmail"));
        String content = emailContent.getText();
        System.out.println("Email Content:\n" + content);

        driver.quit();
    }

}
