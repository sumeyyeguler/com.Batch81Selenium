package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C05_Deneme {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazon'a gidip Nutella aratalim
        driver.get("https://amazon.com");
        /*
        <input type="text" id="nav-bb-search" title="Search For" value="" name="field-keywords" autocomplete="off">
         */
        WebElement search = driver.findElement(By.name("field-keywords"));
        search.sendKeys("Nutella" + Keys.ENTER);

        // amazon sayfasinda kaç tane link bulundugunu yazdiralim
        List<WebElement>linklerinListesi=driver.findElements(By.tagName("a")); //a tag sayısı : 419
        System.out.println("a tag sayısı : "+linklerinListesi.size());
        List<WebElement>sponListesi=driver.findElements(By.tagName("span"));//span tag sayısı : 870
        System.out.println("span tag sayısı : "+sponListesi.size());

        driver.close();
    }
}
