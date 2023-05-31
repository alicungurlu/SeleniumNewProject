package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class practice_Findelements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasına gidiniz.
        driver.get("https://amazon.com");
        //iphone aratınız.
        WebElement aramaKutusu = driver.findElement(By.name("field-keywords"));
        aramaKutusu.sendKeys("iphone");
        Thread.sleep(3000);
        aramaKutusu.submit();//Keys.ENTER

        //Sonuç yazısını yazdırın.
        List<WebElement> sonucYazilari=driver.findElements(By.className("sg-col-inner"));
        WebElement sonucYazısı=sonucYazilari.get(0);
        System.out.println("sonucYazısı = " + sonucYazısı.getText());//sonucYazısı = 1-16 of 213 results for "iphone"

        //Sonuç sayısını yazdırın.
        String sonucSayisi []= sonucYazısı.getText().split(" ");
        System.out.println(Arrays.toString(sonucSayisi));
        System.out.println(sonucSayisi[2]);//928


        // Çıkan ürünlerden ilk 5 tanesine tıklayıp sayfa başlıklarını yazdırınız.
        List<WebElement> urunBasliklari = driver.findElements(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']/a/span"));
        System.out.println("İlk 5 Ürün Başlığı:");
        for (int i = 0; i < 5 && i < urunBasliklari.size(); i++) {
            System.out.println(urunBasliklari.get(i).getText());
            /*
            İlk 5 Ürün Başlığı:
        iPhone 13 Mini, 128GB, Blue - Unlocked (Renewed Premium)
        Apple iPhone 11, 64GB, Black - Unlocked (Renewed)
        Apple iPhone 12, 64GB, Green - Fully Unlocked (Renewed)
        Apple iPhone 12 Pro, 256GB, Silver - Fully Unlocked (Renewed)
        Apple iPhone 14 Pro Max, 256GB, Space Black - Unlocked (Renewed Premium)

             */
        }

        driver.quit();


    }
}
