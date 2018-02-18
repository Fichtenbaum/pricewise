package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;

import java.util.Map;

public class HelocCalcLineAmountTest1 {
    private String baseUrl = "https://uatpricewise.informars.com/?#/login";
    private CommonMenuPage commonPage = new CommonMenuPage();
    private SoftAssert softAssert = new SoftAssert();
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    AnalyticsPage analyticsPage = new AnalyticsPage();
    RoaCalcPage roaCalcPage = new RoaCalcPage();
    Map<String, String> roaInputValues  = roaCalcPage.getInputValuesHelocLineAmount1Expected();

    @BeforeTest
    public void precondition() throws InterruptedException {
        loginPage.openUrl(baseUrl);
        loginPage.logIn("AsdTeam", "AsdTeam1!");
        homePage.zoomPage(0.8);
        homePage.openAnalyticsPage();
    }

    @Test
    public void helocRoaCalcLineAmountTest() throws InterruptedException {
        analyticsPage.openHelocRoaCalcPage();
        roaCalcPage.fillInFormHelocLineAmount1();

        softAssert.assertEquals(roaCalcPage.getGrossInterestIncomeExpected(),roaInputValues.get("grossInterestIncomeActual"),"Gross Interest Income isn't equal to expected result");
        softAssert.assertEquals(roaCalcPage.getoriginationExpensesExpected(),roaInputValues.get("originationExpensesActual"),"Origination Expenses isn't equal to expected result");
        softAssert.assertEquals(roaCalcPage.getoriginationFeesExpected(),roaInputValues.get("originationFeesActual"),"Origination Fees isn't equal to expected result");
        softAssert.assertEquals(roaCalcPage.getinterestIncomeExpected(),roaInputValues.get("interestIncomeActual"),"Interest Income isn't equal to expected result");
        softAssert.assertEquals(roaCalcPage.getinterestExpenseSourceExpected(),roaInputValues.get("interestExpenseSource"),"Interest Expense Source isn't equal to expected result");
        softAssert.assertEquals(roaCalcPage.getsourceRateExpected(),roaInputValues.get("sourceRateActual"),"Source Rate isn't equal to expected result");
        softAssert.assertEquals(roaCalcPage.getnetInterestIncomeExpected(),roaInputValues.get("netInterestIncomeActual"),"Net Interest Income isn't equal to expected result");
        softAssert.assertEquals(roaCalcPage.getservicingExpensesExpected(),roaInputValues.get("servicingExpensesActual"),"Servicing Expenses Actual isn't equal to expected result");
        softAssert.assertEquals(roaCalcPage.getannualFeesExpected(),roaInputValues.get("annualFeesActual"),"Annual Fees isn't equal to expected result");
        softAssert.assertEquals(roaCalcPage.getnonInterestExpenseExpected(),roaInputValues.get("nonInterestExpenseActual"),"Non Interest Expense isn't equal to expected result");
        softAssert.assertEquals(roaCalcPage.getlossProvisionExpected(),roaInputValues.get("lossProvisionActual"),"Loss Provision isn't equal to expected result");
        //softAssert.assertEquals(roaCalcPage.getcreditInsuranceExpected(),roaInputValues.get("creditInsuranceActual"),"Credit Insurance isn't equal to expected result");
        //softAssert.assertEquals(roaCalcPage.getpretaxIncomeExpected(),roaInputValues.get("pretaxIncomeActual"),"Pre-Tax Incom isn't equal to expected result");
        //softAssert.assertEquals(roaCalcPage.getstateTaxesExpected(),roaInputValues.get(""),"State Taxes isn't equal to expected result");
        //softAssert.assertEquals(roaCalcPage.getfederalTaxesExpected(),roaInputValues.get(""),"Federal Taxes isn't equal to expected result");
        //softAssert.assertEquals(roaCalcPage.gettaxesExpected(),roaInputValues.get(""),"Taxes isn't equal to expected result");
        //softAssert.assertEquals(roaCalcPage.getnetIncomeExpected(),roaInputValues.get(""),"Net Income isn't equal to expected result");
        softAssert.assertEquals(roaCalcPage.getaverageBalanceExpected(),roaInputValues.get("averageBalanceActual"),"Average Balance isn't equal to expected result");
        softAssert.assertEquals(roaCalcPage.getpreTaxROAExpected(),roaInputValues.get("preTaxROAActual"),"Pre-Tax ROA isn't equal to expected result");
        //softAssert.assertEquals(roaCalcPage.getafterTaxROAExpected(),roaInputValues.get(""),"After-Tax ROA isn't equal to expected result");

        softAssert.assertAll();
    }

    @AfterSuite
    public void tearDown(){
       commonPage.tearDown();
    }

}
