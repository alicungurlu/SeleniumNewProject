package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_WebElementLocaters {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasına gidelim.
        driver.get("https://www.amazon.com");

        //Arama kutusuna lacate edelim.
        driver.findElement(By.id("twotabsearchtextbox"));
        // Arama kutusuna iphone yazdıralım ve aratalım.
        /*
        Arama kutusunu birden fazla kez kullanacaksak bir Webelement'te değişken olarak atayabilirsiniz.
        Webelement arama kutusu=  driver.findElement(By.id("twotabsearchtextbox")); şeklinde kullanabiliriz.
       1-Locate işlemi bittikten sonra eğer webelemente metin göndereceksek sendKeys () methodu kullanırız.
       2-Webelemente tıklayacaksak click() methodu kullanırız.
         3- Web element üzerindeki yazıyı almak istiyorsak getText () methodunu kullanırız.
         4-sendKeys()methodundan sonra Keys.ENTER ile ya da submit methodu ile
         */
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
        //Sayfayı kapatalım.
        driver.close();


    }
}
