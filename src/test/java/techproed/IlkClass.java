package techproed;

import org.openqa.selenium.chrome.ChromeDriver;

public class IlkClass {
    public static <WebDriver> void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://techproeducation.com");


    }
}
