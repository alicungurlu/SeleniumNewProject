package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NavigateMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resource/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Techproeducation sayfasına gidelim
        driver.navigate().to("https://techproeducation.com");
//Sonra Amazon sayfasına gidelim
        driver.navigate().to("https://amazon.com");
//Amazon sayfasının başlığını yazdıralım
        System.out.println("Amazon sayfasının başlığı: +");
//Techproeducation sayfasına geri dönelim
//Sayfa başlığını yazdıralım
//Amazon sayfasına tekrar gidip url'i yazdıralım
//Amazon sayfasındayken sayfayı yenileyelim

    }
}
