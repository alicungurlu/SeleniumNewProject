package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import static jdk.internal.agent.Agent.getText;

public class C03_findelements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasına gidelim.
        driver.get("http://amazon.com");
        // Sayfadaki linklerin sayısını ve linkleri yazdıralım
        /*
        Bir findElementle bir web elemente ulaşabilirken birden fazla web element için find elements methodunu kullanırız.
        Bu web elementlerin sayısına ulaşmak için ya da bu web elementleri yazısını consola yazdırabilmek için List<Webelement> linklerListesi= driver.findElements(By.locater("locater değeri" olarak kullanırız.
        Oluşturmuş olduğumuz listi link ile consola yazdırabiliriz.
         */
        List<WebElement> linklerListesi= driver.findElements(By.tagName("a"));
        System.out.println("Linklerin Sayısı= " + linklerListesi.size()); //Linklerin Sayısı= 368
       /*
        for(WebElement w:linklerListesi) {
            if (!getText().isEmpty()) {
                System.out.println(w.getText());
            }

        */
        linklerListesi.forEach(link ->{if(!link.getText().isEmpty())
        {System.out.println(link.getText());}});
        //Shop deals in Electronics web elementinin yazısını yazdıralım.
        driver.findElement(By.linkText("Shop deals in Electronics"));

        driver.close();
        //Amazon sayfasına gidiniz.
        //iphone aratınız.
        // Çıkan sonuç yazısını consola yazdırınız.
        // Çıkan ürünlerden ilk 5 tanesine tıklayıp sayfa başlıklarını yazdırınız.
    }


}
