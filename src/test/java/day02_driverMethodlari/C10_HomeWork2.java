package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C10_HomeWork2 {
    public static void main(String[] args) {

        // 1. Yeni bir package olusturalim :
        // 2.Yeni bir class olusturalim :
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // 3.Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        // 4.Sayfa basligini(title) yazdirin  (sayfa başlığı : Amazon.com. Spend less. Smile more.)
        String sayfaBaslik=driver.getTitle();
        System.out.println("sayfa başlığı : "+sayfaBaslik);
        // 5.Sayfa basliginin “Amazon” icerdigini test edin
        if (driver.getTitle().contains(sayfaBaslik)){
            System.out.println("passed");
        }else System.out.println("failed");
        // 6.Sayfa adresini(url) yazdirin (sayfa URL : https://www.amazon.com/)
        String sayfaUrl=driver.getCurrentUrl();
        System.out.println("sayfa URL : "+sayfaUrl);
        // 7.Sayfa url’inin “amazon” icerdigini test edin.
        if (driver.getCurrentUrl().contains(sayfaUrl)){
            System.out.println("passed");
        }else System.out.println("failed");
        // 8.Sayfa handle degerini yazdirin  (window handle : CDwindow-A5547323F12E2904D4B9A2530E3B3B0C) hash code gibi, sekmeler arası geçişte işimize yarayacak
        System.out.println("window handle : "+driver.getWindowHandle());
        // 9.Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        if (driver.getPageSource().contains("Gateway")){
            System.out.println("passed");
        }else System.out.println("failed");
        // 10. Sayfayi kapatin.
        driver.close();

    }
}
