package techproed.day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Browserin konumunu yazdıralım.
        System.out.println("Sayfanın konumu: " + driver.manage().window().getPosition());
        //Browserin boyutlarını yazdıralım.
        System.out.println("Sayfanın boyutları: " + driver.manage().window().getSize());
        //Browseri maximize yapalım.
        driver.manage().window().maximize();
        Thread.sleep(3000);
        /*
        Bir web sitesine gittiğimizde browser default olarak gelir. Ve açılan browserdaki elementlere browser maximize olmadığı için ulaşamayabiliriz.
        Bu sebeble browsere açınca ilk olarak maximize yapmamız bizim web elementlere ulaşmamızı kolaylaştırır. Böylelikle fail almamış olurur.
         */
        //Techproeducation sayfasına gidelim.
        driver.get("https://techproeducation.com");
        Thread.sleep(3000);
        //Ozgerler sayfasına gidelim.
        driver.get("https://ozgerler.com.tr");
        Thread.sleep(3000);
        ////Browserin konumunu yazdıralım.
        System.out.println("Sayfanın konumu: " + driver.manage().window().getPosition());
        //Browserin boyutlarını yazdıralım.
        System.out.println("Sayfanın boyutları: " + driver.manage().window().getSize());
        //Sayfayı mınımıze yapalım
        driver.manage().window().minimize();
       Thread.sleep(3000);
        // Sayfayı fulscreen yapalım.
        driver.manage().window().fullscreen();
       Thread.sleep(3000);
        driver.manage().window().setPosition(new Point(50,50));
        Thread.sleep(3000);
        driver.manage().window().setSize(new Dimension(600,600));
        Thread.sleep(3000);
        //Sayfayı kapat
        driver.close();
        /* Bir web sitesine gittiğimizde browser default olarak gelir ve açılan browserdaki web elementlere browser maximize olmadığı için ulaşamayabiliriz.
        Browseri actıktan sonra maximize yapmalıyız ki driwer bütün web elementleri görür ve rahatlıkla müdahale edebilir. Bu yüzden browsere actıktan sonra ilk olarak maximize yapmalıyız.
        Bu bizim tüm web elementlere ulamamızı kolaylaştırır. Böylelikle fail almamış oluruz.

         */
    }
}

