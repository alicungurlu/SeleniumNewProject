package techproed.day04_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C02_WebElementLocators {
    public static void main(String[] args) {
        String s = System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");

        // arama kutusuna "city bike" yazıp aratın
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike" + Keys.ENTER);

        //Sonuç yazısını yazdırın.
        List<WebElement> sonucYazilari=driver.findElements(By.className("sg-col-inner"));
        WebElement sonucYazısı=sonucYazilari.get(0);
        System.out.println("sonucYazısı = " + sonucYazısı.getText());//sonucYazısı = 1-16 of 213 results for "city bike"

        //Sonuç sayısını yazdırın.
        String sonucSayisi []= sonucYazısı.getText().split(" ");
        System.out.println(Arrays.toString(sonucSayisi));
        System.out.println(sonucSayisi[2]);


        //Ilk ürünün locatini alın.
        List<WebElement> sonuçlar =driver.findElements(By.className("s-image"));
        WebElement ilkUrun= sonuçlar.get(0);
        //Ilk ürünün görünür olup olmadığını true false olarak yazdırın.
        System.out.println("ilkUrun.isDisplayed() = " + ilkUrun.isDisplayed()); //ilkUrun.isDisplayed() = true

        //İlk ürünün erişilebilir olup olmadığını true,false olarak yazdırın.
        System.out.println("ilkUrun.isEnabled() = " + ilkUrun.isEnabled()); //ilkUrun.isEnabled() = true
        //İlk ürünün seçilebilir olup olmadığını yazdırın.
        System.out.println("ilkUrun.isSelected() = " + ilkUrun.isSelected());//ilkUrun.isSelected() = false
        //İlk ürüne tıklayın.
        ilkUrun.click();
        //Sayfayı kapatın
        driver.close();

    }
}
