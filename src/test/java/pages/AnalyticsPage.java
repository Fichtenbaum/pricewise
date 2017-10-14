package pages;

import org.openqa.selenium.By;

public class AnalyticsPage extends CommonMenuPage {
    private By helocLink = By.xpath("//span[text()='HELOC']")
            ,allLinkOwnerOccupied = By.xpath("//li[text()='Owner Occupied (Y/N)']/../li[text()='All']")
            ,allLinkLien = By.xpath("//li[text()='Lien']/../li[text()='All']")
            ,allLinkFixVar = By.xpath("//li[text()='Fix/Var']/../li[text()='All']")
            ,allLinkLtv = By.xpath("//li[text()='LTV']/../li[text()='All']")
            ,allLinkLoanAmount = By.xpath("//li[text()='Loan Amount']/../li[text()='All']")
            ,allLinkClosingCostsOption = By.xpath("//li[text()='Closing Cost Option']/../li[text()='All']")
            ,finishedLinkProductCriteria = By.xpath("//div[@class='analytics-step']//span[text()='Finished']")
            ,allLinkPeerGroup = By.xpath("//*[text()='Peer Group']/..//li[text()='All']")
            ,allLinkFiType = By.xpath("//*[text()='FI Type']/..//li[text()='All']")
            ,topthitdLinkPriceRanges = By.xpath("//*[text()='Price Ranges']/..//li[text()='Top Third']")
            ,finishedLinkCompetitiveAnalytics = By.xpath("//div[@class='analytics-step competitive-analysis']//span[text()='Finished']")
            ,pricewiseButton = By.xpath("//button[text()='PriceWise Analysis']")
            ,marginInputHelocPI = By.xpath("//*[text()='HELOC: Owner Occupied, 2nd Lien, Variable, 0-85% LTV, $10,000-$250,000, No Min Draw, P+I, Borrower Paid']/..//td[text()='Margin']/..//input[@class='input form-control proposed-input']")
            ,roacalcButton = By.xpath("//*[text()='HELOC: Owner Occupied, 2nd Lien, Variable, 0-85% LTV, $10,000-$250,000, No Min Draw, P+I, Borrower Paid']/..//button[@class='btn btn-default hidePrint'][2]");

    public void openHelocRoaCalcPage() throws InterruptedException {
        click(helocLink);
        click(allLinkOwnerOccupied);
        click(allLinkLien);
        click(allLinkFixVar);
        click(allLinkLtv);
        click(allLinkLoanAmount);
        click(allLinkClosingCostsOption);
        click(finishedLinkProductCriteria);
        click(allLinkPeerGroup);
        click(allLinkFiType);
        click(topthitdLinkPriceRanges);
        click(finishedLinkCompetitiveAnalytics);
        click(pricewiseButton);
        type(marginInputHelocPI, "0");
        click(roacalcButton);
    }
}
