package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazon'a gidip Nutella aratalim

        driver.get("https://www.amazon.com");
        // findElement(By .... locator) --> istedigimiz web elementini bize dondurur
        // biz de o webelementini kullanmak icin bir objeye assign ederiz
        // WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        //aramaKutusu.sendKeys("Nutella");

        /* WebElement aramaKutusu= driver.findElement(By.className("nav-search-field "));
           Bu locator calismadi
           Locator alirken gozumuzden kacan detaylar olabilir
           aldigimiz bir locator calismazsa alternatif locator'lar denemeliyiz
         */
        //Locator a yazacağımız değerler unique olmalıdır.
        //sayfada iken incele diyerek elementi seçip ctrl+c ve ctrl+f yaparak kaç kez kullanıldığını görebiliriz



        WebElement aramaKutusu=driver.findElement(By.className("nav-search-field "));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER); //istediğimiz metni yollayıp enter'a basıyor.

        //NoSuchElementException gordugumuzde hata veren satirdaki locator gozden gecirilmedir
    }
}
