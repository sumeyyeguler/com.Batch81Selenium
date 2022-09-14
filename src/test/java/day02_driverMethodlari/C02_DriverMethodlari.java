package day02_driverMethodlari;

import io.ous.jtoml.impl.SymbolToken;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();//browseri tam sayfa yapar
        driver.get("https://www.amazon.com");
        System.out.println("actual tittle "+driver.getTitle()); //actual tittle Amazon.com. Spend less. Smile more.
        System.out.println("actual url :"+driver.getCurrentUrl()); //actual url :https://www.amazon.com/

        driver.close();
    }
}
