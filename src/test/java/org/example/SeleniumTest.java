package Homework8_Arfan.src.test.java.org.example;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

    @Test
    public void loginTest() {
        WebDriverManager.edgedriver().setup();

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        
        driver.get("http://www.yopmail.com/");

        WebElement searchBox = driver.findElement(By.id("login"));
        searchBox.sendKeys("automationtest");
        WebElement checkInboxButton = driver.findElement(By.cssSelector("input.sbut"));
        checkInboxButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.switchTo().frame("ifinbox");

        // Klik pada email pertama
        WebElement firstEmail = driver.findElement(By.cssSelector("div.mls.mb0 > a"));
        firstEmail.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement emailContent = driver.findElement(By.id("mailmillieu"));
        String content = emailContent.getText();
        System.out.println("Email Content:\n" + content);

        driver.quit();
    }

}
