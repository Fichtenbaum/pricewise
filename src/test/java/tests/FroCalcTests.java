package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;

import java.util.Map;

public class FroCalcTests {
    private String baseUrl = "https://uatpricewise.informars.com/?#/login";
    private CommonMenuPage commonPage = new CommonMenuPage();
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    AnalyticsPage analyticsPage = new AnalyticsPage();
    RoaCalcPage roaCalcPage = new RoaCalcPage();
    Map<String, Double> roaInputValues = roaCalcPage.getInputValuesFro();

    @BeforeTest
    public void precondition() throws InterruptedException {
        loginPage.openUrl(baseUrl);
        loginPage.logIn("AsdTeam", "AsdTeam1!");
        homePage.zoomPage(0.8);
        homePage.openAnalyticsPage();
    }

    @Test
    public void froRoaCalcTest() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        analyticsPage.openFroRoaCalcPage();
        roaCalcPage.fillInFormFro();
        softAssert.assertEquals(roaCalcPage.getTotalLine(), roaInputValues.get("totalLineInput"), "Total Line isn't equal to input value");
        softAssert.assertEquals(roaCalcPage.getBaseRateActual(), roaInputValues.get("baseRateInput"),"Base Rate isn't equal to input value");
        softAssert.assertEquals(roaCalcPage.getRelationshipDiscount(), roaInputValues.get("relationshipDiscountInput"),"Relationship Discount isn't equal to input value");
        softAssert.assertEquals(roaCalcPage.getAutoDebitDiscount(), roaInputValues.get("autoDebitDiscountInput"),"Auto Debit Discount isn't equal to input value");
        softAssert.assertEquals(roaCalcPage.getExpectedLife(), roaInputValues.get("expectedLifeInput"),"Expected Life isn't equal to input value");
        softAssert.assertEquals(roaCalcPage.getPaymentsYear(), roaInputValues.get("paymentsYearInput"),"Payments Year isn't equal to input value");
        softAssert.assertEquals(roaCalcPage.getPrepaySpeed(), roaInputValues.get("prepaySpeedInput"),"Prepay Speed isn't equal to input value");
        softAssert.assertEquals(roaCalcPage.getOriginationCost(), roaInputValues.get("originationCostInput"),"Origination Cost isn't equal to input value");
        softAssert.assertEquals(roaCalcPage.getservicingCost(), roaInputValues.get("servicingCostInput"),"Servicing Cost isn't equal to input value");
        softAssert.assertEquals(roaCalcPage.getLossProvisionYear(), roaInputValues.get("lossProvisionYearInput"),"Loss Provision Year isn't equal to input value");
        softAssert.assertEquals(roaCalcPage.getOriginationClosing(), roaInputValues.get("originationClosingInput"),"Origination Closing isn't equal to input value");
        softAssert.assertEquals(roaCalcPage.getOtherOriginationClosing(), roaInputValues.get("otherOriginationClosingInput"),"Other Origination Closing isn't equal to input value");
        softAssert.assertEquals(roaCalcPage.getannualFeesActual(), roaCalcPage.getannualFeesExpected(),"Annual isn't equal to input value");
        softAssert.assertEquals(roaCalcPage.getGrossInterestIncomeActual(),roaCalcPage.getGrossInterestIncomeExpected(),"Gross Interest Income isn't equal to expected result");
        softAssert.assertEquals(roaCalcPage.getoriginationExpensesActual(),roaCalcPage.getoriginationExpensesExpected(),"Origination Expenses isn't equal to expected result");
        softAssert.assertEquals(roaCalcPage.getoriginationFeesActual(),roaCalcPage.getoriginationFeesExpected(),"Origination Fees isn't equal to expected result");
        softAssert.assertEquals(roaCalcPage.getinterestIncomeActual(),roaCalcPage.getinterestIncomeExpected(),"Interest Income isn't equal to expected result");
        softAssert.assertEquals(roaCalcPage.getinterestExpenseSourceActual(),roaCalcPage.getinterestExpenseSourceExpected(),"Interest Expense Source isn't equal to expected result");
        softAssert.assertEquals(roaCalcPage.getsourceRateActual(),roaCalcPage.getsourceRateExpected(),"Source Rate isn't equal to expected result");
        softAssert.assertEquals(roaCalcPage.getnetInterestIncomeActual(),roaCalcPage.getnetInterestIncomeExpected(),"Net Interest Income isn't equal to expected result");
        softAssert.assertEquals(roaCalcPage.getservicingExpensesActual(),roaCalcPage.getservicingExpensesExpected(),"Servicing Expenses Actual isn't equal to expected result");
        softAssert.assertEquals(roaCalcPage.getannualFeesActual(),roaCalcPage.getannualFeesExpected(),"Annual Fees isn't equal to expected result");
        softAssert.assertEquals(roaCalcPage.getnonInterestExpenseActual(),roaCalcPage.getnonInterestExpenseExpected(),"Non Interest Expense isn't equal to expected result");
        softAssert.assertEquals(roaCalcPage.getlossProvisionActual(),roaCalcPage.getlossProvisionExpected(),"Loss Provision isn't equal to expected result");
        softAssert.assertEquals(roaCalcPage.getcreditInsuranceActual(),roaCalcPage.getcreditInsuranceExpected(),"Credit Insurance isn't equal to expected result");
        softAssert.assertEquals(roaCalcPage.getpretaxIncomeActual(),roaCalcPage.getpretaxIncomeExpected(),"Pre-Tax Incom isn't equal to expected result");
        softAssert.assertEquals(roaCalcPage.getstateTaxesActual(),roaCalcPage.getstateTaxesExpected(),"State Taxes isn't equal to expected result");
        softAssert.assertEquals(roaCalcPage.getfederalTaxesActual(),roaCalcPage.getfederalTaxesExpected(),"Federal Taxes isn't equal to expected result");
        softAssert.assertEquals(roaCalcPage.gettaxesActual(),roaCalcPage.gettaxesExpected(),"Taxes isn't equal to expected result");
        softAssert.assertEquals(roaCalcPage.getnetIncomeActual(),roaCalcPage.getnetIncomeExpected(),"Net Income isn't equal to expected result");
        softAssert.assertEquals(roaCalcPage.getaverageBalanceActual(),roaCalcPage.getaverageBalanceExpected(),"Average Balance isn't equal to expected result");
        softAssert.assertEquals(roaCalcPage.getpreTaxROAActual(),roaCalcPage.getpreTaxROAExpected(),"Pre-Tax ROA isn't equal to expected result");
        softAssert.assertEquals(roaCalcPage.getafterTaxROAActual(),roaCalcPage.getafterTaxROAExpected(),"After-Tax ROA isn't equal to expected result");


        softAssert.assertAll();
    }

    @AfterSuite
    public void tearDown(){
       commonPage.tearDown();
    }

}
