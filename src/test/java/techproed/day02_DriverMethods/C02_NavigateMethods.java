package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class C02_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Techproeducation sayfasına gidelim
        driver.navigate().to("https://techproeducation.com");//get methodu ile aynı mantıkta çalısır.
        Thread.sleep(3000);
//Sonra Amazon sayfasına gidelim
        driver.navigate().to("https://amazon.com");
        Thread.sleep(3000);
//Amazon sayfasının başlığını yazdıralım
        System.out.println("driver.getTitle() = " + driver.getTitle());
//Techproeducation sayfasına geri dönelim
        driver.navigate().back();
        Thread.sleep(3000);
//Sayfa başlığını yazdıralım
        System.out.println("driver.getTitle() = " + driver.getTitle());
//Amazon sayfasına tekrar gidip url'i yazdıralım
        driver.navigate().forward();
        Thread.sleep(3000);
        System.out.println("Amazon sayfası driver.getCurrentUrl() = " + driver.getCurrentUrl());
//Amazon sayfasındayken sayfayı yenileyelim
        driver.navigate().refresh();
       Thread.sleep(3000);
        //Sayfayı kapatalım
        driver.close();

    }
}
