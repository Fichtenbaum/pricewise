import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SimpleTest {

    @Test
    public void navigateTest(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://petition.president.gov.ua/");
    }


}
