package pages;

import org.openqa.selenium.By;

public class HomePage extends CommonMenuPage{
    private By analyticsLink = By.xpath("//a[text()='Home Equity']/..//a[text()='Analytics']")
            ,homeEquityLink = By.xpath("//span[text()='Home Equity']")
            ,autoAnalyticsLink = By.xpath("//a[text()='Auto Loans']/..//a[text()='Analytics']")
            ,autoLoansLink = By.xpath("//span[text()='Auto Loans']");

    public void openAnalyticsPage() throws InterruptedException {
        click(homeEquityLink);
        Thread.sleep(2000);
        click(analyticsLink);

    }

    public void openAutoAnalyticsPage() throws InterruptedException {
        click(autoLoansLink);
        Thread.sleep(2000);
        click(autoAnalyticsLink);
    }
}
