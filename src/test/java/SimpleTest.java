import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class SimpleTest {
    WebDriver driver = new FirefoxDriver();

    @Test
    public void navigateTest(){
        driver.get("https://petition.president.gov.ua/");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
