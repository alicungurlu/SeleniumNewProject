package techproed.day01_likTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        driver.get("https://techproeducation.com");
        System.out.println("Techproeducation Sayfa Başlığı:" +driver.getTitle());//Grt title

    }
}
