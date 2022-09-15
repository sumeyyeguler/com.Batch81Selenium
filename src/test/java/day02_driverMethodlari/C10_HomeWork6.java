package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C10_HomeWork6 {
    public static void main(String[] args) throws InterruptedException {


       // 1.Yeni bir class olusturalim
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       // 2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
       // oldugunu dogrulayin (verify), degilse dogru basligi yazdirin. https://tr-tr.facebook.com/
        driver.get("https://tr-tr.facebook.com/");
        if (driver.getTitle().contains("facebook")){
            System.out.println("passed");
        }else System.out.println("test failed, driver tittle : "+driver.getTitle());
        // 3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
       // yazdirin.
        if (driver.getCurrentUrl().contains("facebook")){
            System.out.println("test passed");
        }else System.out.println("test failed, actual url : "+driver.getCurrentUrl());
        // 4.https://www.walmart.com/ sayfasina gidin.
        driver.navigate().to("https://www.walmart.com");
       // 5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        if (driver.getTitle().contains("Walmart.com")){
            System.out.println("passed");
        }else System.out.println("failed");
       // 6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();
       // 7. Sayfayi yenileyin
        Thread.sleep(3000);
        driver.navigate().refresh();
       // 8.Browser’i kapatin
        driver.close();

    }
}
