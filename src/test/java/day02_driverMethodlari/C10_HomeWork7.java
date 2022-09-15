package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C10_HomeWork7 {
    public static void main(String[] args) throws InterruptedException {

       // 1. Yeni bir class olusturun
       System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
       WebDriver driver=new ChromeDriver();

       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       // 2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın
        // (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://www.youtube.com");
        String arananKelime="youtube";
        if (driver.getTitle().contains(arananKelime)){
            System.out.println("tittle passed");
        }else System.out.println("tittle failed");
        // 3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru
       // URL'yi yazdırın.
        String arananUrl="youtube";
        if (driver.getCurrentUrl().contains(arananUrl)){
            System.out.println("url passed");
        }else System.out.println("url : "+driver.getCurrentUrl());
       // 4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com");
       // 5. Youtube sayfasina geri donun
        driver.navigate().back();
       // 6. Sayfayi yenileyin
        Thread.sleep(3000);
        driver.navigate().refresh();
       // 7. Amazon sayfasina donun
        driver.navigate().forward();
       // 8. Sayfayi tamsayfa yapin
        driver.manage().window().maximize();
       // 9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
       // doğru başlığı(Actual Title) yazdırın.
        String tittie="Amazon";
        if (driver.getTitle().contains(tittie)){
            System.out.println("tittle passed");
        }else System.out.println(driver.getTitle());
        // 10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın
        String url="https://www.amazon.com";
        if (driver.getCurrentUrl().contains(url)){
            System.out.println("url passed");
        }else System.out.println("url : "+driver.getCurrentUrl());
       // 11.Sayfayi kapatin
        driver.close();

    }
}
