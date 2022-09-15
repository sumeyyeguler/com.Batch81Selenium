package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C10_HomeWork8 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1- https://www.amazon.com url'ine gidin
        driver.get("https://www.amazon.com");
        //2- Basligin Amazon kelimesi icerdigini test edin
        String arananKelime="Amazon";
        if (driver.getTitle().contains(arananKelime)){
            System.out.println("passed");
        }else System.out.println("failed");
        //3- Url'in "https://www.amazon.com" a esit oldugunu test edin
        String arananUrl="https://www.amazon.com";
        if (driver.getCurrentUrl().contains(arananUrl)){
            System.out.println("passed");
        }else System.out.println("failed");
        //4- sayfayi kapatin
        driver.close();

    }
}
