package pages;

import org.openqa.selenium.By;

public class AutoAnalyticsPage extends CommonMenuPage {
    private By newAutoLink = By.xpath("//li[text()='New Auto']")
            ,allTermLink = By.xpath("//div[@class='term']//../li[text()='All']")
            ,allLtvLink = By.xpath("//div[@class='ltv']//../li[text()='All']")
            ,allAmountLink = By.xpath("//div[@class='amount']//../li[text()='All']")
            ,finishedLinkProductCriteria = By.xpath("//div[@class='analytics-step']//span[text()='Finished']")
            ,allLinkPeerGroup = By.xpath("//*[text()='Peer Group']/..//li[text()='All']")
            ,allLinkFiType = By.xpath("//*[text()='FI Type']/..//li[text()='All']")
            ,topthitdLinkPriceRanges = By.xpath("//*[text()='Price Ranges']/..//li[text()='Top Third']")
            ,finishedLinkCompetitiveAnalytics = By.xpath("//div[@class='analytics-step competitive-analysis']//span[text()='Finished']")
            ,pricewiseButton = By.xpath("//button[text()='PriceWise Analysis']")
            ,rateInput = By.xpath("//*[text() ='New Auto, 2018-2017, 0-60 Mo, $1.00+, 0%-100%']/..//input[@class='input form-control proposed-input']")
            ,roacalcButton = By.xpath("//*[text() ='New Auto, 2018-2017, 0-60 Mo, $1.00+, 0%-100%']/..//button[@class = 'btn btn-default hidePrint'][2]");

}
