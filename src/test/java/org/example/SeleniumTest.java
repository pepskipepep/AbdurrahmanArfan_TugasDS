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
        
                // 1. Buka Yopmail.com
        driver.get("http://www.yopmail.com/");

        // 2. Search email "automationtest"
        WebElement searchBox = driver.findElement(By.id("login"));
        searchBox.sendKeys("automationtest");
        WebElement checkInboxButton = driver.findElement(By.cssSelector("input.sbut"));
        checkInboxButton.click();

        // Tunggu sebentar untuk memastikan halaman sudah ter-load
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 3. Switch ke iframe dan extract content di email paling pertama
        driver.switchTo().frame("ifinbox");

        // Klik pada email pertama
        WebElement firstEmail = driver.findElement(By.cssSelector("div.mls.mb0 > a"));
        firstEmail.click();

        // Tunggu sebentar untuk memastikan email terbuka
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Extract content email
        WebElement emailContent = driver.findElement(By.id("mailmillieu"));
        String content = emailContent.getText();
        System.out.println("Email Content:\n" + content);

        // Tutup browser
        driver.quit();
    }

}
