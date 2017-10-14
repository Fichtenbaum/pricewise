package util;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        ChromeDriverManager.getInstance().setup();
        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }
}
