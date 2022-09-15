package day04_xpath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_Deneme {
    /*
    //tagName[@attributeIsmi=‘attributeValue']

    Sadece tag name kullanarak xpath yazmak icin
    driver.findElement(By.xpath(“//input” ));

    Tag name farketmeksizin attribute ismi ve attribute value kullanarak xpath yazmak icin
    driver.findElement(By.xpath(“// * [@type=‘text’]” ));

    Attribute name farketmeksizin tag name ve attribute value kullanarak xpath yazmak icin
    driver.findElement(By.xpath(“//input[@ *=‘text’]” ));

    Attribute value farketmeksizin tag name ve attribute ismi kullanarak xpath yazmak icin
    driver.findElement(By.xpath(“//input[@type]” ))
     */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1- https://the-internet.herokuapp.com adresine gidin
        driver.get("https://the-internet.herokuapp.com");
        //2- add remove a tıklayın <a href="/add_remove_elements/">Add/Remove Elements</a> //tagName[@attributeIsmi=‘attributeValue']
        driver.findElement(By.xpath("//a[@href='/add_remove_elements/']")).click();
        driver.findElement(By.xpath("//button[@onclick]")).click();//tagname ve attribute ismi ile
        driver.findElement(By.xpath("//button")).click(); //sadece tagname ile
        driver.findElement(By.xpath("//button[@*='addElement()']")).click(); //tagname ve attribute value kullanarak
        driver.findElement(By.xpath("//*[@onclick='addElement()']")).click(); //attribute ismi ve attribute value kullanarak
        //3- İkinci Delete butonu’nun gorunur oldugunu test edin
        if(driver.findElement(By.xpath("//button[@class='added-manually'][2]")).isDisplayed()){//2. delete butonu passed
            System.out.println("2. delete butonu passed");
        }else System.out.println("2. delete butonu failed");
        //4- Delete tuslarına sırayla basin
        for (int i = 0; i <4; i++) {
            driver.findElement(By.xpath("//button[@class='added-manually'][1]")).click();
        }
       // 5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        if (driver.findElement(By.xpath("//h3")).isDisplayed()){//add/remove elements test passed
            System.out.println("add/remove elements test passed");
        }else System.out.println("add/remove elements test failed");

        driver.close();
    }
}
