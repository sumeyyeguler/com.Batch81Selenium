package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTest {
    public static void main(String[] args) {
        /*  1- https://www.amazon.com url'ine gidin
            2- Basligin Amazon kelimesi icerdigini test edin
            3- Url'in "https://www.amazon.com" a esit oldugunu test edin
            4- sayfayi kapatin
         */

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // 1- https://www.amazon.com url'ine gidin
        driver.get(" https://www.amazon.com");
        //2- Basligin Amazon kelimesi icerdigini test edin
        String arananKelime = "Amazon";
        if (driver.getTitle().contains(arananKelime)) {
            System.out.println("Tittle test passed");
        } else System.out.println("Tittle test failed");
        // 3- Url'in "https://www.amazon.com" a esit oldugunu test edin
        String arananUrl = "https://www.amazon.com";
        if (driver.getTitle().contains(arananUrl)) {
            System.out.println("Url test passed");
        } else System.out.println("Url test failed");
        // 4- sayfayi kapatin
        driver.close();
    }
}