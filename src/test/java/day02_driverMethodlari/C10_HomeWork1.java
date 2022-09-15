package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C10_HomeWork1 {
    public static void main(String[] args) throws InterruptedException {
        // 1 - yeni bir class oluşturalım
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // 2 - youtube sayfasına gidelim "https://www.youtube.com/"
        driver.get("https://www.youtube.com");
        // 3 - amazon sayfasına gidelim "https://www.amazon.com.tr/"
        driver.navigate().to("https://www.amazon.com.tr");
        // 4 - tekrar youtube sayfasına dönelim
        driver.navigate().back();
        // 5 - yeniden amazon sayfasına gidelim
        driver.navigate().forward();
        // 6 - sayfayı resfresh yapalım
        Thread.sleep(3000);
        driver.navigate().refresh();
        // 7 - tüm sayfaları kapatalım
        driver.quit();
        // driver.close();

    }
}
