package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.time.Duration;

public class C04_ManageMethods_ImplicitlyWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resource/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Sayfadaki elementleri görünür olana kadar sayfada oluşana kadar maximum bekleme süresini gösterir imlicitlyWait
        //Elementler iki saniyede oluşursa iki saniyede geçer maximum süre müddetince internetten ya da sayfadan kaynaklı olarak web elementler
        // oluşmazsa testimiz fail verir.
        // Thread.sleep ()java kodlarını bizim belirttiğimiz süre kadar bekler 30 saniye beklemesini elirtirsem 30 saniye ekler ve alt satıra geçer.
        //techproed sayfasina gidelim
        String amazonUrl= "https://www.amazon.com";
        String techproUrl = "http://techproeducation.com";
        driver.get(techproUrl);

//amazona gidelim
        driver.get(amazonUrl);

//techpro sayfasina geri donelim
driver.navigate().back();
//sayfa basligini techpro icerdigini test edelim
        String actualTitle=driver.getTitle();
        String arananKelime = "techpro";


        if (actualTitle.contains(arananKelime)){
            System.out.println("Test PSSED");

        }else System.out.println("Test FAILED");

//tekrar amazon sayfasina gidelim
        driver.navigate().forward();
        //sayfa basligini Amazon icerdigini test edelim
        if (driver.getTitle().contains("Amazon")){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        //Sasayfayı kapat
        driver.close();
    }
}
