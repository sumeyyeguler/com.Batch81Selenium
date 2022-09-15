package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C10_HomeWork3 {
    public static void main(String[] args) {

      //  1. Yeni bir Class olusturalim.
      System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      //  2. Youtube ana sayfasina gidelim . https://www.youtube.com/
        driver.get("https://www.youtube.com");
      //  3. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com");
      //  4. Tekrar YouTube’sayfasina donelim
        driver.navigate().back();
      //  5. Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();
      //  6. Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();
      //  7. Sayfayi kapatalim / Tum sayfalari kapatalim
        //driver.close();
        driver.quit();

    }
}
