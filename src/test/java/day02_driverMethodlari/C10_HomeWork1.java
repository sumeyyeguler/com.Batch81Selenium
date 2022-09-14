package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C10_HomeWork1  {
    public static void main(String[] args) throws InterruptedException {
        // 1 - yeni bir class oluşturalım
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // 2 - youtube sayfasına gidelim
        driver.navigate().to("https://www.youtube.com/");
        // 3 - amazon sayfasına gidelim
        driver.navigate().to("https://www.amazon.com.tr/");
        Thread.sleep(4000);
        // 4 - tekrar youtube sayfasına dönelim
        driver.navigate().back();
        Thread.sleep(4000);
        // 5 - yeniden amazon sayfasına gidelim
        driver.navigate().forward();
        Thread.sleep(4000);
        // 6 - sayfayı resfresh yapalım
        driver.navigate().refresh();
        Thread.sleep(4000);
        // 7 - tüm sayfaları kapatalım
       // driver.close();
    }
}
