package day02_driverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C10_HomeWork5 {
    public static void main(String[] args) {

       //1. Yeni bir Class olusturalim.
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       //2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
       //3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("sayfa boyutları : "+driver.manage().window().getSize());
        System.out.println("sayfa konumu : "+driver.manage().window().getPosition());
        //4. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setSize(new Dimension(20,20));
        driver.manage().window().setPosition(new Point(500,200));
       //5. Sayfayi kapatin
        driver.close();

    }
}
