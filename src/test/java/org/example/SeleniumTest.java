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
        
        // Buka makemytrip.com
        driver.get("https://www.makemytrip.com/");

        // Cari elemen kotak pencarian dan masukkan kata kunci
        WebElement searchBox = driver.findElement(By.id("fromCity"));
        searchBox.sendKeys("New York");

        // Tunggu beberapa saat agar dropdown muncul dan pilih kota dari dropdown
        // (Perhatikan bahwa ini hanya langkah sederhana, dan Anda mungkin perlu menyesuaikannya dengan perilaku aktual situs web)
        // ...

        // Cari tombol untuk mencari dan klik
        WebElement searchButton = driver.findElement(By.xpath("//button[@class='fsw_search__btn']"));
        searchButton.click();

        // Tunggu beberapa saat agar hasil pencarian muncul dan cari elemen harga teratas
        WebElement topPriceElement = driver.findElement(By.xpath("//span[@class='actual-price']"));

        // Ambil nilai teks dari elemen harga teratas
        String topPrice = topPriceElement.getText();

        // Cetak harga teratas
        System.out.println("Top Price: " + topPrice);

        // Tutup browser
        driver.quit();
    }

}
