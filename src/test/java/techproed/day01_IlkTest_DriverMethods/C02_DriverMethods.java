package techproed.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        System.out.println("Amazon Actual Title:" +driver.getTitle());
        System.out.println("Amazon Actual Url: " + driver.getCurrentUrl());
        String amazonWindowHandle= driver.getWindowHandle();
        System.out.println("amazon Window Handle Değeri:"  +amazonWindowHandle);
        //amazon Window Handle Değeri:B86586B08598EA97DA672D0563DFC77D
        driver.get("https://techproeducation.com");
        System.out.println("Techproeducation Sayfa Başlığı:" +driver.getTitle());
        //getTitle içinde olunan sayfanın baslığını String olarak getirir.

        //getcurrent url gidilen sayfanın urlini verir.
        System.out.println("Techproed Actual Url: " + driver.getCurrentUrl());
        //getPageSource(): Bu method içinde olunan sayfanın kaynak kodlarını String olarak getirir.
        //System.out.println("driver.getPageSource() = " + driver.getPageSource()); Bilerek yoruma aldık console her defasında kaynak kodlarını getirmesin.
        //getwindowHnadle gidilen handle değerini hass kodu verir bu değerle bu handle değerini sayfalar arası geçiş için kullanırız.
        System.out.println(" Tec pro handle değeri +driver.getWindowHandle() = " + driver.getWindowHandle()); //7BF92CC34DECD5C06A24B27B35920D8C


    }
}
