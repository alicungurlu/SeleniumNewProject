package techproed.day01_likTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_likTest {
    public static void main(String[] args) {
        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        //Java uygulamalarında system özelliklerini ayarlamak için set property methodu ile kullanırız.
        //Setproperty methodu ile classımıza driverın fiziki yolunu belirledik.
        System.out.println(System.getProperty("chromeDriver"));
        //getProperty ile "Key" değerini girerek "valua"ya ulaşabilirim.
        WebDriver driver=new ChromeDriver();
        // ChromeDriver türünde yeni bir obje oluşturduk.
        driver.get("https://techproeducation.com");// get () methodu ile string olarak girilen urlye gideriz.
    }
}
