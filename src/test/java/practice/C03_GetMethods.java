package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_GetMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Amazon sayfasına gidelim.
        driver.get("https://amazon.com");
        //Sayfa başlığını (title)ı yazdıralım.
        String title= driver.getTitle();
        System.out.println("Sayfa başlığı "+title);
        // Sayfa başlığının amazon içerip içermediğine bakalım.
        if (title.contains("Amazon")) {
            System.out.println("Başlık 'Amazon' kelimesini içeriyor.");
        } else {
            System.out.println("Başlık 'Amazon' kelimesini içermiyor.");
        }
        // Sayfa adresini url'i yazdıralım.
        String url = driver.getCurrentUrl();
        System.out.println("Sayfa URL'si: " + url);

        // Sayfa url'in amazon içerdiğini test edin.
        if (url.contains("amazon")) {
            System.out.println("URL 'amazon' kelimesini içeriyor.");
        } else {
            System.out.println("URL 'amazon' kelimesini içermiyor.");
        }

        //Sayfa handle değerini yazdırın.
        String handle = driver.getWindowHandle();
        System.out.println("Sayfa Handle Değeri: " + handle);
        // Sayfa HTML kodlarında "Gateway" kelimesi geçtiğini test edin.
        String pageSource = driver.getPageSource();
        if (pageSource.contains("Gateway")) {
            System.out.println("Sayfa HTML kodlarında 'Gateway' kelimesi geçiyor.");
        } else {
            System.out.println("Sayfa HTML kodlarında 'Gateway' kelimesi geçmiyor.");
        }
        //Sayfayı kapatın.
        driver.quit();


    }
}
