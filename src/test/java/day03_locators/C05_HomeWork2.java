package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C05_HomeWork2 {
    public static void main(String[] args) {

       //1. Bir class oluşturun :
       //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
       System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       //a.web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com");
       //b. Search(ara) “city bike”
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike"+ Keys.ENTER);
       //c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
       List <WebElement>sonucListesi=driver.findElements(By.className("sg-col-inner"));
        System.out.println("sonuc yazısı : "+sonucListesi.get(0).getText());//1-16 of 112 results for "city bike
        //d. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        List <WebElement> resimList=driver.findElements(By.className("s-image"));
        resimList.get(0).click();
    }
}
