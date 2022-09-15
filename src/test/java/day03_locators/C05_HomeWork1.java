package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C05_HomeWork1 {
    public static void main(String[] args) {

        //1. Bir class oluşturun:
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");
        //b. Sign in butonuna basin
        driver.findElement(By.id("sign-in")).click();
        //c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTextbox = driver.findElement(By.id("session_email"));
        WebElement passwordTextbox = driver.findElement(By.id("session_password"));
        WebElement signInButton = driver.findElement(By.name("commit"));
        //d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //i. Username : testtechproed@gmail.com
        emailTextbox.sendKeys("testtechproed@gmail.com");
        //ii. Password : "Test1234!"
        passwordTextbox.sendKeys("Test1234!");
        signInButton.click();
        //e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement expectedUser = driver.findElement(By.className("navbar-text"));
        //f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement address = driver.findElement(By.linkText("Addresses"));
        if (address.isDisplayed()) {
            System.out.println("address test passed");
        } else System.out.println("address test failed");
        WebElement signOut = driver.findElement(By.linkText("Sign out"));
        if (signOut.isDisplayed()) {
            System.out.println("signOut test passed");
        } else System.out.println("signOut test failed");
        //3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> linkler = driver.findElements(By.tagName("a"));
        System.out.println("link sayisi : " + linkler.size());
        for (WebElement each : linkler
        ) {
            System.out.println(each.getText());
            //sayfayı kapatın
            driver.close();
        }

    }
}
