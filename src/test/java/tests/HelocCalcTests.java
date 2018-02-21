package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;
import pages.*;

import java.util.Map;

public class HelocCalcTests {
    private String baseUrl = "https://uatpricewise.informars.com/?#/login";
    private CommonMenuPage commonPage = new CommonMenuPage();
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    AnalyticsPage analyticsPage = new AnalyticsPage();
    RoaCalcPage roaCalcPage = new RoaCalcPage();
    Map<String, Double> roaInputValues = roaCalcPage.getInputValues();

    @BeforeTest
    public void precondition() throws InterruptedException {
        loginPage.openUrl(baseUrl);
        loginPage.logIn("AsdTeam", "AsdTeam1!");
        homePage.zoomPage(0.8);
        homePage.openAnalyticsPage();
    }

    @Test
    public void helocRoaCalcTest() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        analyticsPage.openHelocRoaCalcPage();
        roaCalcPage.fillInForm();
        softAssert.assertEquals(roaCalcPage.getTotalLine(), roaInputValues.get("totalLineInput"), "Total Line isn't equal to input value");
        softAssert.assertEquals(roaCalcPage.getBaseRate(), roaInputValues.get("baseRateInput"),String.format("Base Rate isn't equal to input value. Actual [%f], Expected [%f]", roaCalcPage.getBaseRate(), roaInputValues.get("baseRateInput")));
        softAssert.assertEquals(roaCalcPage.getRelationshipDiscount(), roaInputValues.get("relationshipDiscountInput"),"Relationship Discount isn't equal to input value");
        softAssert.assertEquals(roaCalcPage.getAutoDebitDiscount(), roaInputValues.get("autoDebitDiscountInput"),"Auto Debit Discount isn't equal to input value");
        softAssert.assertEquals(roaCalcPage.getExpectedLife(), roaInputValues.get("expectedLifeInput"),"Expected Life isn't equal to input value");
        softAssert.assertEquals(roaCalcPage.getMinimumPaymentProc(), roaInputValues.get("minimumPaymentProcInput"),"Minimum Payment Proc isn't equal to input value");
        softAssert.assertEquals(roaCalcPage.getMinimumPaymentDol(), roaInputValues.get("minimumPaymentDolInput"),"Minimum Payment Dol isn't equal to input value");
        softAssert.assertEquals(roaCalcPage.getUtilization(), roaInputValues.get("utilizationInput"),"Utilization isn't equal to input value");
        softAssert.assertEquals(roaCalcPage.getPaymentsYear(), roaInputValues.get("paymentsYearInput"),"Payments Year isn't equal to input value");
        softAssert.assertEquals(roaCalcPage.getPrepaySpeed(), roaInputValues.get("prepaySpeedInput"),"Prepay Speed isn't equal to input value");
        softAssert.assertEquals(roaCalcPage.getIntroTermPeriod(), roaInputValues.get("introTermPeriodInput"),"Intro Term Period isn't equal to input value");
        softAssert.assertEquals(roaCalcPage.getIntroTermRate(), roaInputValues.get("introTermRateInput"),"Intro Term Rate isn't equal to input value");
        softAssert.assertEquals(roaCalcPage.getIntroTermCap(), roaInputValues.get("introTermCapInput"),"Intro Term Cap isn't equal to input value");
        softAssert.assertEquals(roaCalcPage.getPostIntroTermMargin(), roaInputValues.get("postIntroTermMarginInput"),"Post Intro Term Margin isn't equal to input value");
        softAssert.assertEquals(roaCalcPage.getPostIntroCapRate(), roaInputValues.get("postIntroCapRateInput"),"Post Intro Cap Rate isn't equal to input value");
        softAssert.assertEquals(roaCalcPage.getPostIntroFloorRate(), roaInputValues.get("postIntroFloorRateInput"),"Post Intro Floor Rate isn't equal to input value");
        softAssert.assertEquals(roaCalcPage.getPostIntroCeilingRate(), roaInputValues.get("postIntroCeilingRateInput"),"Post Intro Ceiling Rate isn't equal to input value");
        softAssert.assertEquals(roaCalcPage.getOriginationCost(), roaInputValues.get("originationCostInput"),"Origination Cost isn't equal to input value");
        softAssert.assertEquals(roaCalcPage.getservicingCost(), roaInputValues.get("servicingCostInput"),"Servicing Cost isn't equal to input value");
        softAssert.assertEquals(roaCalcPage.getLossProvisionYear(), roaInputValues.get("lossProvisionYearInput"),"Loss Provision Year isn't equal to input value");
        softAssert.assertEquals(roaCalcPage.getOriginationClosing(), roaInputValues.get("originationClosingInput"),"Origination Closing isn't equal to input value");
        softAssert.assertEquals(roaCalcPage.getOtherOriginationClosing(), roaInputValues.get("otherOriginationClosingInput"),"Other Origination Closing isn't equal to input value");
        softAssert.assertEquals(roaCalcPage.getAnnual(), roaInputValues.get("annualInput"),"Annual isn't equal to input value");
        softAssert.assertEquals(roaCalcPage.getMaintainceFees(), roaInputValues.get("maintainceFeesInput"),"Maintaince Fees isn't equal to input value");
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
