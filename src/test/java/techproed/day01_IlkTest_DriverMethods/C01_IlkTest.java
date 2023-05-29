package techproed.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {
    public static void main(String[] args) {
        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        //Java uygulamalarında system özelliklerini ayarlamak için setProperty methodunu kullanırız.
        //setProperty methodu ile classımıza driverın fiziki yolunu belirledik.
        System.out.println(System.getProperty("chromeDriver"));
        //getProperty ile "Key" değerini girerek "value"ya ulaşabilirim.
        WebDriver driver=new ChromeDriver();
        // ChromeDriver türünde yeni bir obje oluşturduk.
        driver.get("https://techproeducation.com");// get () methodu ile string olarak girilen urlye gideriz.
    }
}
