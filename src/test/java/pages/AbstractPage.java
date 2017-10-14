package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.WebDriverManager;

import java.util.concurrent.TimeUnit;

public class AbstractPage {
    private static final Long TIMEOUT = 30L;
    private static final int TIMEOUT_IMPLICITLY = 9000;

    public void openUrl(final String url) {
        getDriver().get(url);
    }

    protected void waitForElementPresent(final By locator) {
        new WebDriverWait(getDriver(), TIMEOUT).until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    protected void waitForElementValueNotEmpty(final By locator) {
        waitForElementPresent(locator);
        new WebDriverWait(getDriver(), TIMEOUT).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver wd) {
                return getDriver().findElement(locator).getAttribute("value").length() != 0;
            }
        });
    }

    protected void scrollToElementAndType(final By locator, final String text) {
        waitForElementPresent(locator);
        Actions actions = new Actions(getDriver());
        actions.moveToElement(getDriver().findElement(locator)).click().sendKeys(text).build().perform();
    }

    protected void scrollUpToElement(final By locator) {
        waitForElementPresent(locator);
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(false);", getDriver().findElement(locator));
    }

    protected String getElementText(final By locator) {
        waitForElementPresent(locator);

        return getDriver().findElement(locator).getText().trim();
    }

    protected String getInputText(final By locator) {
        waitForElementPresent(locator);
        return getDriver().findElement(locator).getAttribute("value").trim();
    }

    protected void click(By locator) throws InterruptedException{
        JavascriptExecutor executor = (JavascriptExecutor)getDriver();
        waitForElementPresent(locator);
        executor.executeScript("arguments[0].click();", getDriver().findElement(locator));
    }

    protected void type(By locator, String text) throws InterruptedException{
        waitForElementPresent(locator);
        getDriver().findElement(locator).sendKeys(text);
    }

    public void zoomPage(double zoomIndex){
        JavascriptExecutor executor = (JavascriptExecutor)getDriver();
        executor.executeScript("document.body.style.zoom = '" + zoomIndex + "'");
    }

    protected WebDriver getDriver() {
        WebDriver driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(TIMEOUT_IMPLICITLY, TimeUnit.MILLISECONDS);
        return driver;
    }

    public void tearDown(){
        if (getDriver() != null) {
            getDriver().quit();
        }
    }

    public void closeWindow(){
        if (getDriver() != null){
            getDriver().close();
        }
    }
}
