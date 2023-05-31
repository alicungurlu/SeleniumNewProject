package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class practice_Locators_XPath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Class Work: Add Remove Element
            //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
            //2- Add Element butonuna basin

            //3. Delete butonu’nun gorunur oldugunu test edin
            //4. Delete tusuna basin
            //5. “Add/Remove Elements” yazisinin gorunur oldugunu test edin


        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

    }
}
